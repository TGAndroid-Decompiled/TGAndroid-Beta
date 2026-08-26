package org.telegram.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.FeaturedStickerSetCell2;
import org.telegram.ui.Cells.StickerSetCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ReorderingBulletinLayout;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TrendingStickersAlert;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class StickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int ID_ARCHIVED = 2;
    private static final int ID_DYNAMIC_PACK_ORDER = 7;
    private static final int ID_EMOJI = 3;
    private static final int ID_FEATURED = 1;
    private static final int ID_LARGE_EMOJI = 6;
    private static final int ID_QUICK_REACTION = 4;
    private static final int ID_SHOW_MORE_FEATURED = 8;
    private static final int ID_SUGGEST_EMOJI = 9;
    private static final int ID_SUGGEST_STICKERS = 5;
    private static final int MENU_ARCHIVE = 0;
    private static final int MENU_COPY = 3;
    private static final int MENU_DELETE = 1;
    private static final int MENU_REORDER = 4;
    private static final int MENU_SHARE = 2;
    private int activeReorderingRequests;
    private ActionBarMenuItem archiveMenuItem;
    private int archivedInfoRow;
    private int archivedRow;
    private int currentType;
    private ActionBarMenuItem deleteMenuItem;
    private int dynamicPackOrder;
    private int dynamicPackOrderInfo;
    private ArrayList<TLRPC.TL_messages_stickerSet> emojiPacks;
    private int emojiPacksRow;
    private ArrayList<TLRPC.StickerSetCovered> featured;
    private int featuredRow;
    ArrayList<TLRPC.TL_messages_stickerSet> frozenEmojiPacks;
    private int largeEmojiRow;
    private LinearLayoutManager layoutManager;
    private UniversalRecyclerView listView;
    private final List<Long> loadingFeaturedStickerSets;
    private int loopInfoRow;
    private int loopRow;
    private int masksInfoRow;
    private int masksRow;
    private boolean needReorder;
    private int reactionsDoubleTapRow;
    private NumberTextView selectedCountTextView;
    private final HashSet<Long> selectedSets;
    private Runnable sendReorderRunnable;
    private ArrayList<TLRPC.TL_messages_stickerSet> sets;
    private ActionBarMenuItem shareMenuItem;
    private int stickersBotInfo;
    private int suggestAnimatedEmojiInfoRow;
    private int suggestAnimatedEmojiRow;
    private int suggestRow;
    private TrendingStickersAlert trendingStickersAlert;

    public StickersActivity(int i, ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        super(null);
        this.loadingFeaturedStickerSets = new ArrayList();
        this.selectedSets = new HashSet<>();
        this.sendReorderRunnable = new StickersActivity$$ExternalSyntheticLambda0(this, 1);
        this.currentType = i;
        this.frozenEmojiPacks = arrayList;
    }

    private CharSequence addStickersBotSpan(String str) {
        String str2 = "@stickers";
        int iIndexOf = str.indexOf("@stickers");
        if (iIndexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new URLSpanNoUnderline(str2) {
                    @Override
                    public void onClick(View view) {
                        MessagesController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).openByUserName("stickers", StickersActivity.this, 3);
                    }
                }, iIndexOf, iIndexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str;
    }

    private void checkActionMode() {
        int selectedCount = getSelectedCount();
        boolean zIsActionModeShowed = this.actionBar.isActionModeShowed();
        if (selectedCount <= 0) {
            if (zIsActionModeShowed) {
                this.actionBar.hideActionMode();
                this.listView.allowReorder(false);
                lambda$new$5();
                return;
            }
            return;
        }
        checkActionModeIcons();
        this.selectedCountTextView.setNumber(selectedCount, zIsActionModeShowed);
        if (zIsActionModeShowed) {
            return;
        }
        this.actionBar.showActionMode();
        this.listView.allowReorder(true);
        if (SharedConfig.stickersReorderingHintUsed || this.currentType == 5) {
            return;
        }
        SharedConfig.setStickersReorderingHintUsed(true);
        Bulletin.make(this, new ReorderingBulletinLayout(getContext(), LocaleController.getString(R.string.StickersReorderHint), null), 3250).show();
    }

    private void checkActionModeIcons() {
        if (hasSelected()) {
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList = this.sets;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = arrayList.get(i2);
                i2++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet2.set;
                    if (stickerSet.official && !stickerSet.emojis) {
                        i = 8;
                        break;
                    }
                }
            }
            if (this.deleteMenuItem.getVisibility() != i) {
                this.deleteMenuItem.setVisibility(i);
            }
        }
    }

    private void checkPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null) {
            return;
        }
        if (this.emojiPacks == null) {
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
            this.emojiPacks = arrayList;
            arrayList.add(tL_messages_stickerSet);
        } else {
            for (int i = 0; i < this.emojiPacks.size(); i++) {
                if (this.emojiPacks.get(i).set.id == tL_messages_stickerSet.set.id) {
                    return;
                }
            }
            this.emojiPacks.add(tL_messages_stickerSet);
        }
    }

    private TLRPC.TL_messages_stickerSet convertFeatured(TLRPC.StickerSetCovered stickerSetCovered) {
        if (stickerSetCovered == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
        tL_messages_stickerSet.set = stickerSetCovered.set;
        if (!(stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            tL_messages_stickerSet.documents = stickerSetCovered.covers;
            return tL_messages_stickerSet;
        }
        TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
        tL_messages_stickerSet.documents = tL_stickerSetFullCovered.documents;
        tL_messages_stickerSet.packs = tL_stickerSetFullCovered.packs;
        return tL_messages_stickerSet;
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        boolean z;
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || (!universalRecyclerView.isReorderAllowed() && !this.needReorder && this.activeReorderingRequests <= 0)) {
            if (this.currentType == 5) {
                ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = new ArrayList<>(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(this.currentType)));
                this.frozenEmojiPacks = arrayList2;
                this.sets = arrayList2;
            } else {
                this.sets = new ArrayList<>(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(this.currentType)));
            }
        }
        this.featured = new ArrayList<>(getFeaturedSets());
        int i4 = 0;
        while (i4 < this.featured.size()) {
            if (this.loadingFeaturedStickerSets.contains(Long.valueOf(this.featured.get(i4).set.id))) {
                this.featured.remove(i4);
                i4--;
            }
            i4++;
        }
        int size = this.featured.size();
        int archivedStickersCount = mediaDataController.getArchivedStickersCount(this.currentType);
        int size2 = mediaDataController.getStickerSets(5).size();
        if (this.currentType == 0) {
            this.featuredRow = arrayList.size();
            arrayList.add(UItem.asButton(1, R.drawable.msg2_trending, LocaleController.getString(R.string.FeaturedStickers), size > 0 ? LocaleController.formatNumber(size, ',') : ""));
            if (archivedStickersCount > 0) {
                this.archivedRow = arrayList.size();
                int i5 = this.currentType;
                if (i5 == 0) {
                    arrayList.add(UItem.asButton(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
                } else {
                    arrayList.add(UItem.asButton(2, LocaleController.getString(i5 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ',')));
                }
            }
            this.emojiPacksRow = arrayList.size();
            arrayList.add(UItem.asSettingsCell(3, R.drawable.msg2_smile_status, LocaleController.getString(R.string.Emoji), size2 > 0 ? LocaleController.formatNumber(size2, ',') : ""));
        } else if (archivedStickersCount > 0) {
            this.archivedRow = arrayList.size();
            int i6 = this.currentType;
            if (i6 == 0) {
                arrayList.add(UItem.asButton(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
            } else {
                arrayList.add(UItem.asButton(2, LocaleController.getString(i6 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ',')));
            }
            if (this.currentType == 1) {
                zzkf.m(R.string.ArchivedMasksInfo, arrayList);
            }
        }
        if (this.currentType == 0) {
            this.reactionsDoubleTapRow = arrayList.size();
            arrayList.add(UItem.asSettingsCell(4, R.drawable.msg2_reactions2, LocaleController.getString(R.string.DoubleTapSetting)).onBind(new PollItemMenu$$ExternalSyntheticLambda15(this, 20)));
            arrayList.add(UItem.asShadow(addStickersBotSpan(LocaleController.getString(this.currentType == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo))));
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.StickersSettings)));
            this.suggestRow = arrayList.size();
            arrayList.add(UItem.asSettingsCell(5, LocaleController.getString(R.string.SuggestStickers), suggestStickersName()));
            this.largeEmojiRow = arrayList.size();
            arrayList.add(UItem.asCheck(6, LocaleController.getString(R.string.LargeEmoji)).setChecked(SharedConfig.allowBigEmoji));
            this.dynamicPackOrder = arrayList.size();
            arrayList.add(UItem.asCheck(7, LocaleController.getString(R.string.DynamicPackOrder)).setChecked(SharedConfig.updateStickersOrderOnSend));
            zzkf.m(R.string.DynamicPackOrderInfo, arrayList);
        }
        if (this.currentType == 5) {
            arrayList.add(UItem.asCheck(9, LocaleController.getString(R.string.SuggestAnimatedEmoji)).setChecked(SharedConfig.suggestAnimatedEmoji));
            zzkf.m(R.string.SuggestAnimatedEmojiInfo, arrayList);
        }
        if (this.sets.size() > 0) {
            universalAdapter.whiteSectionStart();
            if (this.currentType == 5 || (!this.featured.isEmpty() && this.currentType == 0)) {
                zzke.m(this.currentType == 5 ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets, arrayList);
            }
            universalAdapter.reorderSectionStart();
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList3 = this.sets;
            int size3 = arrayList3.size();
            int i7 = 0;
            while (i7 < size3) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = arrayList3.get(i7);
                i7++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                int i8 = StickerSetCell.Factory.$r8$clinit;
                UItem uItemOfFactory = UItem.ofFactory(StickerSetCell.Factory.class);
                uItemOfFactory.object = tL_messages_stickerSet2;
                arrayList.add(uItemOfFactory.setClickCallback(new View.OnClickListener(this) {
                    public final StickersActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i2) {
                            case 0:
                                this.f$0.openStickerSetOptions(view);
                                break;
                            case 1:
                                this.f$0.onStickerSetButtonClick(view);
                                break;
                            default:
                                this.f$0.onFeaturedAddClick(view);
                                break;
                        }
                    }
                }).setClickCallback2(new View.OnClickListener(this) {
                    public final StickersActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                this.f$0.openStickerSetOptions(view);
                                break;
                            case 1:
                                this.f$0.onStickerSetButtonClick(view);
                                break;
                            default:
                                this.f$0.onFeaturedAddClick(view);
                                break;
                        }
                    }
                }).setChecked(this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet2.set.id))));
            }
            universalAdapter.reorderSectionEnd();
            universalAdapter.whiteSectionEnd();
            int i9 = this.currentType;
            if (i9 != 1 && i9 != 5) {
                arrayList.add(UItem.asShadow(null));
            } else if (i9 == 1) {
                zzkf.m(R.string.MasksInfo, arrayList);
            }
        }
        if (this.featured.size() > 3) {
            this.featured = new ArrayList<>(this.featured.subList(0, 3));
            z = true;
        } else {
            z = false;
        }
        if (this.currentType == 5 && !this.featured.isEmpty()) {
            if (this.sets.size() > 0) {
                arrayList.add(UItem.asShadow(null));
            }
            zzke.m(this.currentType == 5 ? R.string.FeaturedEmojiPacks : R.string.FeaturedStickers, arrayList);
            ArrayList<TLRPC.StickerSetCovered> arrayList4 = this.featured;
            int size4 = arrayList4.size();
            while (i2 < size4) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList4.get(i2);
                i2++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                int i10 = FeaturedStickerSetCell2.Factory.$r8$clinit;
                UItem uItemOfFactory2 = UItem.ofFactory(FeaturedStickerSetCell2.Factory.class);
                uItemOfFactory2.object = stickerSetCovered2;
                arrayList.add(uItemOfFactory2.setClickCallback(new View.OnClickListener(this) {
                    public final StickersActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i) {
                            case 0:
                                this.f$0.openStickerSetOptions(view);
                                break;
                            case 1:
                                this.f$0.onStickerSetButtonClick(view);
                                break;
                            default:
                                this.f$0.onFeaturedAddClick(view);
                                break;
                        }
                    }
                }).setLocked(this.loadingFeaturedStickerSets.contains(Long.valueOf(stickerSetCovered2.set.id))));
            }
            if (z) {
                arrayList.add(UItem.asButton(8, R.drawable.msg2_trending, LocaleController.getString(R.string.ShowMoreEmojiPacks)).accent());
            }
        }
        int i11 = this.currentType;
        if (i11 == 5) {
            arrayList.add(UItem.asShadow(addStickersBotSpan(LocaleController.getString(i11 == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo))));
        }
    }

    private ArrayList<TLRPC.StickerSetCovered> getFeaturedSets() {
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.currentType != 5) {
            return mediaDataController.getFeaturedStickerSets();
        }
        ArrayList<TLRPC.StickerSetCovered> arrayList = new ArrayList<>(mediaDataController.getFeaturedEmojiSets());
        int i = 0;
        while (i < arrayList.size()) {
            if (arrayList.get(i) == null || mediaDataController.isStickerPackInstalled(arrayList.get(i).set.id, false)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        return arrayList;
    }

    private String getLinkForSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb.append("/");
        return String.format(locale, MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers", "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$onClick$1(View view) {
        SharedConfig.setSuggestStickers(0);
        ((TextSettingsCell) view).valueTextView.setText(LocaleController.getString(R.string.SuggestStickersAll), true);
    }

    public static void lambda$onClick$2(View view) {
        SharedConfig.setSuggestStickers(1);
        ((TextSettingsCell) view).valueTextView.setText(LocaleController.getString(R.string.SuggestStickersInstalled), true);
    }

    public static void lambda$onClick$3(View view) {
        SharedConfig.setSuggestStickers(2);
        ((TextSettingsCell) view).valueTextView.setText(LocaleController.getString(R.string.SuggestStickersNone), true);
    }

    public void lambda$openStickerSetOptions$11(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", getLinkForSet(tL_messages_stickerSet));
            getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$openStickerSetOptions$12(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), tL_messages_stickerSet, 0, this, true, true);
    }

    public void lambda$openStickerSetOptions$8(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), tL_messages_stickerSet, !tL_messages_stickerSet.set.archived ? 1 : 2, this, true, true);
    }

    public void lambda$openStickerSetOptions$9(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", getLinkForSet(tL_messages_stickerSet)));
            BulletinFactory.createCopyLinkBulletin(this).show();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$processSelectionMenu$13(ArrayList arrayList, int i, AlertDialog alertDialog, int i2) {
        clearSelected();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSets(arrayList, this.currentType, i == 1 ? 0 : 1, this, true);
    }

    public void lambda$sendReorder$6() {
        this.activeReorderingRequests--;
    }

    public void lambda$sendReorder$7(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda0(this, 0));
    }

    public int lambda$whenReordered$4(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet2) {
        int iIndexOf = this.sets.indexOf(tL_messages_stickerSet);
        int iIndexOf2 = this.sets.indexOf(tL_messages_stickerSet2);
        if (iIndexOf < 0 || iIndexOf2 < 0) {
            return 0;
        }
        return iIndexOf - iIndexOf2;
    }

    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!this.selectedSets.isEmpty()) {
                lambda$openStickerSetOptions$10((StickerSetCell) view);
                return;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                showDialog(new StickersAlert(getParentActivity(), this, null, tL_messages_stickerSet, null, false));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            arrayList2.add(tL_inputStickerSetID);
            showDialog(new EmojiPacksAlert(this, getParentActivity(), getResourceProvider(), (ArrayList<TLRPC.InputStickerSet>) arrayList2));
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (this.currentType != 5) {
                showDialog(new StickersAlert(getParentActivity(), this, tL_inputStickerSetID2, null, null, false));
                return;
            }
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(tL_inputStickerSetID2);
            showDialog(new EmojiPacksAlert(this, getParentActivity(), getResourceProvider(), (ArrayList<TLRPC.InputStickerSet>) arrayList3));
            return;
        }
        switch (uItem.id) {
            case 1:
            case 8:
                if (this.currentType == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> featuredSets = getFeaturedSets();
                    if (featuredSets != null) {
                        for (int i2 = 0; i2 < featuredSets.size(); i2++) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredSets.get(i2);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.id = stickerSet4.id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    MediaDataController.getInstance(this.currentAccount).markFeaturedStickersAsRead(true, true);
                    showDialog(new EmojiPacksAlert(this, getParentActivity(), getResourceProvider(), (ArrayList<TLRPC.InputStickerSet>) arrayList4));
                } else {
                    TrendingStickersAlert trendingStickersAlert = new TrendingStickersAlert(getContext(), this, new TrendingStickersLayout(getContext(), new TrendingStickersLayout.Delegate() {
                        @Override
                        public void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered2, boolean z) {
                            MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), stickerSetCovered2, 2, StickersActivity.this, false, false);
                        }

                        @Override
                        public void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered2) {
                            MediaDataController.getInstance(((BaseFragment) StickersActivity.this).currentAccount).toggleStickerSet(StickersActivity.this.getParentActivity(), stickerSetCovered2, 0, StickersActivity.this, false, false);
                        }
                    }), null);
                    this.trendingStickersAlert = trendingStickersAlert;
                    trendingStickersAlert.show();
                }
                break;
            case 2:
                presentFragment(new ArchivedStickersActivity(this.currentType));
                break;
            case 3:
                presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                presentFragment(new ReactionsDoubleTapManageActivity());
                break;
            case 5:
                ItemOptions.makeOptions(this, view).addChecked(SharedConfig.suggestStickers == 0, LocaleController.getString(R.string.SuggestStickersAll), new PhotoViewer$$ExternalSyntheticLambda44(view, 2)).addChecked(SharedConfig.suggestStickers == 1, LocaleController.getString(R.string.SuggestStickersInstalled), new PhotoViewer$$ExternalSyntheticLambda44(view, 3)).addChecked(SharedConfig.suggestStickers == 2, LocaleController.getString(R.string.SuggestStickersNone), new PhotoViewer$$ExternalSyntheticLambda44(view, 4)).show();
                break;
            case 6:
                SharedConfig.toggleBigEmoji();
                ((TextCheckCell) view).setChecked(SharedConfig.allowBigEmoji);
                break;
            case 7:
                SharedConfig.toggleUpdateStickersOrderOnSend();
                ((TextCheckCell) view).setChecked(SharedConfig.updateStickersOrderOnSend);
                break;
            case 9:
                SharedConfig.toggleSuggestAnimatedEmoji();
                ((TextCheckCell) view).setChecked(SharedConfig.suggestAnimatedEmoji);
                break;
        }
    }

    public void onFeaturedAddClick(View view) {
        FeaturedStickerSetCell2 featuredStickerSetCell2 = (FeaturedStickerSetCell2) view.getParent();
        TLRPC.StickerSetCovered stickerSet = featuredStickerSetCell2.getStickerSet();
        if (this.loadingFeaturedStickerSets.contains(Long.valueOf(stickerSet.set.id))) {
            return;
        }
        this.loadingFeaturedStickerSets.add(Long.valueOf(stickerSet.set.id));
        featuredStickerSetCell2.addButton.setDrawProgress(true, true);
        if (featuredStickerSetCell2.isInstalled) {
            MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), stickerSet, 0, this, false, false);
        } else {
            MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), stickerSet, 2, this, false, false);
        }
    }

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        if (!this.selectedSets.isEmpty() || !(uItem.object instanceof TLRPC.TL_messages_stickerSet)) {
            return false;
        }
        lambda$openStickerSetOptions$10((StickerSetCell) view);
        return true;
    }

    public void onStickerSetButtonClick(View view) {
        StickerSetCell stickerSetCell;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (!(viewGroup.getParent() instanceof StickerSetCell) || (stickersSet = (stickerSetCell = (StickerSetCell) viewGroup.getParent()).getStickersSet()) == null || stickersSet.set == null) {
            return;
        }
        if (stickerSetCell.addButtonView != view) {
            if (stickerSetCell.removeButtonView == view) {
                MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), stickersSet, 0, this, false, true);
                return;
            } else {
                if (stickerSetCell.premiumButtonView == view) {
                    showDialog(new PremiumFeatureBottomSheet(this, getContext(), getCurrentAccount(), false, 11, false, null));
                    return;
                }
                return;
            }
        }
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = getMediaDataController().getFeaturedEmojiSets();
        int i = 0;
        while (true) {
            if (i >= featuredEmojiSets.size()) {
                stickerSetCovered = null;
                break;
            } else {
                if (stickersSet.set.id == featuredEmojiSets.get(i).set.id) {
                    stickerSetCovered = featuredEmojiSets.get(i);
                    break;
                }
                i++;
            }
        }
        if (stickerSetCovered != null) {
            if (this.loadingFeaturedStickerSets.contains(Long.valueOf(stickerSetCovered.set.id))) {
                return;
            } else {
                this.loadingFeaturedStickerSets.add(Long.valueOf(stickerSetCovered.set.id));
            }
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        Activity parentActivity = getParentActivity();
        TLObject tLObject = stickersSet;
        if (stickerSetCovered2 != null) {
            tLObject = stickerSetCovered2;
        }
        mediaDataController.toggleStickerSet(parentActivity, tLObject, 2, this, false, false);
    }

    public void openStickerSetOptions(View view) {
        if (view == null || !(view.getParent() instanceof StickerSetCell)) {
            return;
        }
        StickerSetCell stickerSetCell = (StickerSetCell) view.getParent();
        final TLRPC.TL_messages_stickerSet stickersSet = stickerSetCell.getStickersSet();
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        final int i4 = 3;
        ItemOptions.makeOptions(this, stickerSetCell).add(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable(this) {
            public final StickersActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.lambda$openStickerSetOptions$8(stickersSet);
                        break;
                    case 1:
                        this.f$0.lambda$openStickerSetOptions$9(stickersSet);
                        break;
                    case 2:
                        this.f$0.lambda$openStickerSetOptions$11(stickersSet);
                        break;
                    default:
                        this.f$0.lambda$openStickerSetOptions$12(stickersSet);
                        break;
                }
            }
        }).addIf(!stickersSet.set.official, R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable(this) {
            public final StickersActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$openStickerSetOptions$8(stickersSet);
                        break;
                    case 1:
                        this.f$0.lambda$openStickerSetOptions$9(stickersSet);
                        break;
                    case 2:
                        this.f$0.lambda$openStickerSetOptions$11(stickersSet);
                        break;
                    default:
                        this.f$0.lambda$openStickerSetOptions$12(stickersSet);
                        break;
                }
            }
        }).add(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new QrActivity$$ExternalSyntheticLambda5(28, this, stickerSetCell)).addIf(!stickersSet.set.official, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable(this) {
            public final StickersActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$openStickerSetOptions$8(stickersSet);
                        break;
                    case 1:
                        this.f$0.lambda$openStickerSetOptions$9(stickersSet);
                        break;
                    case 2:
                        this.f$0.lambda$openStickerSetOptions$11(stickersSet);
                        break;
                    default:
                        this.f$0.lambda$openStickerSetOptions$12(stickersSet);
                        break;
                }
            }
        }).addIf(!stickersSet.set.official, R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.StickersRemove), true, new Runnable(this) {
            public final StickersActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$openStickerSetOptions$8(stickersSet);
                        break;
                    case 1:
                        this.f$0.lambda$openStickerSetOptions$9(stickersSet);
                        break;
                    case 2:
                        this.f$0.lambda$openStickerSetOptions$11(stickersSet);
                        break;
                    default:
                        this.f$0.lambda$openStickerSetOptions$12(stickersSet);
                        break;
                }
            }
        }).setMinWidth(190).show();
    }

    public void processSelectionMenu(int i) {
        String string;
        TextView textView;
        int i2 = 0;
        if (i == 2) {
            StringBuilder sb = new StringBuilder();
            int size = this.sets.size();
            while (i2 < size) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.sets.get(i2);
                if (this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    if (sb.length() != 0) {
                        sb.append("\n");
                    }
                    sb.append(getLinkForSet(tL_messages_stickerSet));
                }
                i2++;
            }
            String string2 = sb.toString();
            ShareAlert shareAlertCreateShareAlert = ShareAlert.createShareAlert(this.fragmentView.getContext(), null, string2, false, string2, false);
            shareAlertCreateShareAlert.setDelegate(new ShareAlert.ShareAlertDelegate() {
                @Override
                public boolean didCopy() {
                    StickersActivity.this.clearSelected();
                    return true;
                }

                @Override
                public void didShare() {
                    StickersActivity.this.clearSelected();
                }
            });
            shareAlertCreateShareAlert.show();
            return;
        }
        if (i == 0 || i == 1) {
            ArrayList arrayList = new ArrayList(this.selectedSets.size());
            int size2 = this.sets.size();
            for (int i3 = 0; i3 < size2; i3++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.sets.get(i3);
                if (this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 == 1) {
                    int size4 = this.sets.size();
                    while (i2 < size4) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.sets.get(i2);
                        if (this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                            processSelectionOption(i, tL_messages_stickerSet3);
                            break;
                        }
                        i2++;
                    }
                    clearSelected();
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                if (i == 1) {
                    builder.setTitle(LocaleController.formatString(R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0])));
                    builder.setMessage(LocaleController.formatString(R.string.DeleteStickersAlertMessage, Integer.valueOf(size3)));
                    string = LocaleController.getString(R.string.Delete);
                } else {
                    builder.setTitle(LocaleController.formatString(R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0])));
                    builder.setMessage(LocaleController.formatString(R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3)));
                    string = LocaleController.getString(R.string.Archive);
                }
                builder.setPositiveButton(string, new ChatActivity$$ExternalSyntheticLambda437(this, arrayList, i, 8));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder.create();
                showDialog(alertDialogCreate);
                if (i != 1 || (textView = (TextView) alertDialogCreate.getButton(-1)) == null) {
                    return;
                }
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
    }

    private void processSelectionOption(int i, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (i == 0) {
            MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), tL_messages_stickerSet, tL_messages_stickerSet.set.archived ? 2 : 1, this, true, true);
            return;
        }
        if (i == 1) {
            MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getParentActivity(), tL_messages_stickerSet, 0, this, true, true);
            return;
        }
        if (i == 2) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", getLinkForSet(tL_messages_stickerSet));
                getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i != 3) {
            if (i == 4) {
                toggleSelected(tL_messages_stickerSet);
            }
        } else {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", getLinkForSet(tL_messages_stickerSet)));
                BulletinFactory.createCopyLinkBulletin(this).show();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
    }

    public void lambda$new$5() {
        if (this.needReorder) {
            this.needReorder = false;
            MediaDataController.getInstance(this.currentAccount).calcNewHash(this.currentType);
            this.activeReorderingRequests++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            int i = this.currentType;
            tL_messages_reorderStickerSets.masks = i == 1;
            tL_messages_reorderStickerSets.emojis = i == 5;
            int iM = 0;
            while (iM < this.sets.size()) {
                iM = MessagesController$$ExternalSyntheticOutline2.m(this.sets.get(iM).set.id, tL_messages_reorderStickerSets.order, iM, 1);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new LinkManager$$ExternalSyntheticLambda10(this, 22));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(this.currentType), Boolean.TRUE);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                BulletinFactory.of(this).createSimpleBulletin(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo)).show();
                this.listView.adapter.update(true);
            }
        }
    }

    public void setQuickReactionImage(View view) {
        if (view instanceof TextSettingsCell) {
            TextSettingsCell textSettingsCell = (TextSettingsCell) view;
            String doubleTapReaction = MediaDataController.getInstance(this.currentAccount).getDoubleTapReaction();
            if (doubleTapReaction != null) {
                if (doubleTapReaction.startsWith("animated_")) {
                    try {
                        AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(this.currentAccount, 2, Long.parseLong(doubleTapReaction.substring(9)));
                        animatedEmojiDrawableMake.addView(textSettingsCell.getValueBackupImageView());
                        textSettingsCell.getValueBackupImageView().setImageDrawable(animatedEmojiDrawableMake);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(doubleTapReaction);
                if (tL_availableReaction != null) {
                    textSettingsCell.getValueBackupImageView().getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "100_100_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, Theme.key_windowBackgroundGray, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    private String suggestStickersName() {
        int i = SharedConfig.suggestStickers;
        if (i != 0) {
            return i != 1 ? LocaleController.getString(R.string.SuggestStickersNone) : LocaleController.getString(R.string.SuggestStickersInstalled);
        }
        return LocaleController.getString(R.string.SuggestStickersAll);
    }

    public void lambda$openStickerSetOptions$10(StickerSetCell stickerSetCell) {
        TLRPC.TL_messages_stickerSet stickersSet = stickerSetCell.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        if (this.selectedSets.contains(Long.valueOf(stickersSet.set.id))) {
            this.selectedSets.remove(Long.valueOf(stickersSet.set.id));
            stickerSetCell.setChecked(false, true);
        } else {
            this.selectedSets.add(Long.valueOf(stickersSet.set.id));
            stickerSetCell.setChecked(true, true);
        }
        this.listView.adapter.update(true);
        checkActionMode();
    }

    public void whenReordered(int i, ArrayList<UItem> arrayList) {
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            UItem uItem = arrayList.get(i2);
            i2++;
            Object obj = uItem.object;
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj);
            }
        }
        this.sets = arrayList2;
        this.needReorder = true;
        Collections.sort(MediaDataController.getInstance(this.currentAccount).getStickerSets(this.currentType), new StickersActivity$$ExternalSyntheticLambda10(this, 0));
        AndroidUtilities.cancelRunOnUIThread(this.sendReorderRunnable);
        AndroidUtilities.runOnUIThread(this.sendReorderRunnable, 1000L);
    }

    public void clearSelected() {
        this.selectedSets.clear();
        this.listView.adapter.update(true);
        checkActionMode();
    }

    @Override
    public View createView(Context context) {
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList;
        zzki.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.currentType;
        if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.StickersName));
        } else if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Masks));
        } else if (i == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Emoji));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 != -1) {
                    StickersActivity.this.processSelectionMenu(i2);
                } else if (StickersActivity.this.onBackPressed(true)) {
                    StickersActivity.this.finishFragment();
                }
            }
        });
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
        this.selectedCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedCountTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false));
        actionBarMenuCreateActionMode.addView(this.selectedCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedCountTextView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(28));
        this.shareMenuItem = actionBarMenuCreateActionMode.addItemWithWidth(2, R.drawable.msg_share, AndroidUtilities.dp(54.0f));
        this.archiveMenuItem = actionBarMenuCreateActionMode.addItemWithWidth(0, R.drawable.msg_archive, AndroidUtilities.dp(54.0f));
        this.deleteMenuItem = actionBarMenuCreateActionMode.addItemWithWidth(1, R.drawable.msg_delete, AndroidUtilities.dp(54.0f));
        if (this.currentType != 5 || (arrayList = this.frozenEmojiPacks) == null) {
            this.sets = new ArrayList<>(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(this.currentType)));
        } else {
            this.sets = arrayList;
        }
        this.featured = getFeaturedSets();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        final int i2 = 0;
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2(this) {
            public final StickersActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                        break;
                    default:
                        this.f$0.whenReordered(((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new StickersActivity$$ExternalSyntheticLambda4(this), new StickersActivity$$ExternalSyntheticLambda4(this));
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setFocusable(true);
        this.listView.setTag(7);
        final int i3 = 1;
        this.listView.listenReorder(new Utilities.Callback2(this) {
            public final StickersActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                        break;
                    default:
                        this.f$0.whenReordered(((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) {
            {
                super(1, false);
            }

            @Override
            public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
                iArr[1] = StickersActivity.this.listView.getHeight();
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.layoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.listView.setLayoutManager(this.layoutManager);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == this.currentType) {
                this.loadingFeaturedStickerSets.clear();
            }
            this.listView.adapter.update(true);
        } else if (i == NotificationCenter.featuredStickersDidLoad || i == NotificationCenter.featuredEmojiDidLoad) {
            this.listView.adapter.update(true);
        } else if (i == NotificationCenter.archivedStickersCountDidLoad && ((Integer) objArr[0]).intValue() == this.currentType) {
            this.listView.adapter.update(true);
        }
    }

    public int getSelectedCount() {
        return this.selectedSets.size();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{StickerSetCell.class, TextSettingsCell.class, TextCheckCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        ActionBar actionBar = this.actionBar;
        int i2 = Theme.key_actionBarActionModeDefaultIcon;
        arrayList.add(new ThemeDescription(actionBar, 512, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, 1048576, null, null, null, null, Theme.key_actionBarActionModeDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 2097152, null, null, null, null, Theme.key_actionBarActionModeDefaultTop));
        arrayList.add(new ThemeDescription(this.actionBar, 4194304, null, null, null, null, Theme.key_actionBarActionModeDefaultSelector));
        arrayList.add(new ThemeDescription(this.selectedCountTextView, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 2, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteLinkText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 196608, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, null, null, -1, null, Theme.key_stickers_menuSelector));
        int i4 = Theme.key_stickers_menu;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"reorderButton"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 8192, new Class[]{StickerSetCell.class}, new String[]{"checkBox"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 16384, new Class[]{StickerSetCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkboxCheck));
        TrendingStickersAlert trendingStickersAlert = this.trendingStickersAlert;
        if (trendingStickersAlert != null) {
            arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
        }
        return arrayList;
    }

    public boolean hasSelected() {
        return this.selectedSets.size() > 0;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (this.selectedSets.isEmpty()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        clearSelected();
        return false;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(this.currentType);
        int i = this.currentType;
        if (i == 0) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
            MediaDataController.getInstance(this.currentAccount).checkStickers(1);
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
        } else if (i == 6) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.currentType == 6) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public void onResume() {
        super.onResume();
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    private void checkPack(TLRPC.StickerSetCovered stickerSetCovered) {
        if (stickerSetCovered == null) {
            return;
        }
        if (this.emojiPacks == null) {
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
            this.emojiPacks = arrayList;
            arrayList.add(convertFeatured(stickerSetCovered));
        } else {
            for (int i = 0; i < this.emojiPacks.size(); i++) {
                if (this.emojiPacks.get(i).set.id == stickerSetCovered.set.id) {
                    return;
                }
            }
            this.emojiPacks.add(convertFeatured(stickerSetCovered));
        }
    }

    private void toggleSelected(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null) {
            return;
        }
        if (this.selectedSets.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
            this.selectedSets.remove(Long.valueOf(tL_messages_stickerSet.set.id));
        } else {
            this.selectedSets.add(Long.valueOf(tL_messages_stickerSet.set.id));
        }
        this.listView.adapter.update(true);
        checkActionMode();
    }
}
