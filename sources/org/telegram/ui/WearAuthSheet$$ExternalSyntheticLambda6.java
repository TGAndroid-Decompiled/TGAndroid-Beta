package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UnconfirmedAuthHintCell;
import org.telegram.ui.Cells.WallpaperCell;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda70;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.DeleteMessagesBottomSheet;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.HorizontalRoundTabsLayout;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Views.PaintToolsView;
import org.telegram.ui.Components.PhonebookShareAlert;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.TranslateButton$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView$$ExternalSyntheticLambda8;
import org.telegram.ui.web.MHTML;
import org.telegram.ui.web.SearchEngine;

public final class WearAuthSheet$$ExternalSyntheticLambda6 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public WearAuthSheet$$ExternalSyntheticLambda6(int i, View view, AtomicReference atomicReference) {
        this.$r8$classId = 21;
        this.f$1 = i;
        this.f$0 = view;
        this.f$2 = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        AndroidUtilities.VcardItem vcardItem;
        int themedColor;
        Integer numValueOf;
        View childAt;
        int childAdapterPosition;
        int i = 768;
        int i2 = 2;
        boolean z = false;
        int i3 = this.f$1;
        Object obj = this.f$2;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) obj2;
                if (!buttonWithCounterView.loading) {
                    MHTML mhtml = WearAuthSheet.currentSession;
                    if (mhtml == null || ((byte[]) mhtml.filePos) == null) {
                        FileLog.d("wear-auth: login pressed with no session/key");
                    } else {
                        buttonWithCounterView.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i4 = this.f$1;
                        ConnectionsManager.getInstance(i4).sendRequestTyped(tL_messages_requestUrlAuth, new AiTonesController$$ExternalSyntheticLambda0(), new WearAuthSheet$$ExternalSyntheticLambda7(buttonWithCounterView, (BottomSheet) obj, i4, view, mhtml));
                    }
                    break;
                }
                break;
            case 1:
                UnconfirmedAuthHintCell unconfirmedAuthHintCell = (UnconfirmedAuthHintCell) obj2;
                unconfirmedAuthHintCell.noButton.setLoading(true, true);
                MessagesController.getInstance(i3).getUnconfirmedAuthController().deny((ArrayList) obj, new PreviewView$$ExternalSyntheticLambda8(unconfirmedAuthHintCell, i3, i2));
                break;
            case 2:
                WallpaperCell wallpaperCell = (WallpaperCell) obj2;
                wallpaperCell.getClass();
                wallpaperCell.onWallpaperClick(i3, ((WallpaperCell.WallpaperView) obj).currentWallpaper);
                break;
            case 3:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) obj2;
                channelMonetizationLayout.getClass();
                if (view.isEnabled()) {
                    ChannelMonetizationLayout.AnonymousClass6 anonymousClass6 = channelMonetizationLayout.starsBalanceButton;
                    if (!anonymousClass6.loading && !channelMonetizationLayout.balanceButton.loading) {
                        int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
                        StatisticActivity statisticActivity = (StatisticActivity) obj;
                        if (channelMonetizationLayout.starsBalanceBlockedUntil > currentTime) {
                            channelMonetizationLayout.withdrawalBulletin = BulletinFactory.of(statisticActivity).createSimpleBulletinWithIconSize(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, BotStarsActivity.untilString(channelMonetizationLayout.starsBalanceBlockedUntil - currentTime)))).show();
                        } else if (channelMonetizationLayout.starsBalanceEditTextValue < MessagesController.getInstance(i3).starsRevenueWithdrawalMin) {
                            BulletinFactory.of(statisticActivity).createSimpleBulletin(channelMonetizationLayout.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i3).starsRevenueWithdrawalMin, new Object[0]), new ChannelMonetizationLayout$$ExternalSyntheticLambda8(channelMonetizationLayout, i3, i2))).show();
                        } else {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            ChannelMonetizationLayout$$ExternalSyntheticLambda21 channelMonetizationLayout$$ExternalSyntheticLambda21 = new ChannelMonetizationLayout$$ExternalSyntheticLambda21(channelMonetizationLayout, twoStepVerificationActivity, i2);
                            twoStepVerificationActivity.delegateType = 1;
                            twoStepVerificationActivity.delegate = channelMonetizationLayout$$ExternalSyntheticLambda21;
                            anonymousClass6.setLoading(true);
                            twoStepVerificationActivity.preload(new ChannelMonetizationLayout$$ExternalSyntheticLambda22(channelMonetizationLayout, statisticActivity, twoStepVerificationActivity, i2));
                        }
                        break;
                    }
                }
                break;
            case 4:
                ChatActivity chatActivity = (ChatActivity) obj2;
                if (chatActivity.contentView != null && chatActivity.getParentActivity() != null) {
                    ((ActionBarPopupWindow.ActionBarPopupWindowLayout) obj).getSwipeBack().openForeground(i3);
                    break;
                }
                break;
            case 5:
                ChatActivity chatActivity2 = (ChatActivity) obj2;
                if (chatActivity2.selectedObject != null) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (i3 < arrayList.size()) {
                        chatActivity2.processSelectedOption$1(((Integer) arrayList.get(i3)).intValue());
                        break;
                    }
                }
                break;
            case 6:
                ((NumberPicker) obj2).setValue(i3);
                ((AlertsCreator$$ExternalSyntheticLambda70) obj).run();
                break;
            case 7:
                DeleteMessagesBottomSheet deleteMessagesBottomSheet = (DeleteMessagesBottomSheet) obj2;
                if (deleteMessagesBottomSheet.allDefaultMediaBanned$1()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(deleteMessagesBottomSheet.getContext(), 0, null);
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    alertDialog.show();
                } else {
                    boolean z2 = !(i3 <= 0);
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = deleteMessagesBottomSheet.bannedRights;
                    tL_chatBannedRights.send_media = z2;
                    tL_chatBannedRights.send_photos = z2;
                    tL_chatBannedRights.send_videos = z2;
                    tL_chatBannedRights.send_stickers = z2;
                    tL_chatBannedRights.send_gifs = z2;
                    tL_chatBannedRights.send_inline = z2;
                    tL_chatBannedRights.send_games = z2;
                    tL_chatBannedRights.send_audios = z2;
                    tL_chatBannedRights.send_docs = z2;
                    tL_chatBannedRights.send_voices = z2;
                    tL_chatBannedRights.send_roundvideos = z2;
                    tL_chatBannedRights.embed_links = z2;
                    tL_chatBannedRights.send_polls = z2;
                    tL_chatBannedRights.send_reactions = z2;
                    deleteMessagesBottomSheet.onRestrictionsChanged();
                    ((UniversalAdapter) obj).update(true);
                }
                break;
            case 8:
                HorizontalRoundTabsLayout horizontalRoundTabsLayout = (HorizontalRoundTabsLayout) obj2;
                horizontalRoundTabsLayout.selectedIndex = i3;
                horizontalRoundTabsLayout.selectorStartX.set(view.getLeft(), false);
                horizontalRoundTabsLayout.selectorEndX.set(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i3);
                horizontalRoundTabsLayout.invalidate();
                break;
            case 9:
                PaintToolsView paintToolsView = (PaintToolsView) obj2;
                paintToolsView.animateNextIndex(i3);
                paintToolsView.delegate.onGetPalette().setCurrentBrush(i3 - 1, true);
                paintToolsView.delegate.onBrushSelected((Brush) obj);
                break;
            case 10:
                PhonebookShareAlert phonebookShareAlert = (PhonebookShareAlert) obj2;
                int i5 = phonebookShareAlert.phoneEndRow;
                ArrayList arrayList2 = phonebookShareAlert.phones;
                int i6 = phonebookShareAlert.phoneStartRow;
                if (i3 < i6 || i3 >= i5) {
                    int i7 = phonebookShareAlert.vcardStartRow;
                    vcardItem = (i3 < i7 || i3 >= phonebookShareAlert.vcardEndRow) ? null : (AndroidUtilities.VcardItem) phonebookShareAlert.other.get(i3 - i7);
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i3 - i6);
                }
                if (vcardItem != null) {
                    if (!phonebookShareAlert.isImport) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i3 >= i6 && i3 < i5) {
                            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                                if (((AndroidUtilities.VcardItem) arrayList2.get(i8)).checked) {
                                    z = true;
                                    themedColor = phonebookShareAlert.getThemedColor(Theme.key_featuredStickers_buttonText);
                                    TextView textView = phonebookShareAlert.buttonTextView;
                                    textView.setEnabled(z);
                                    if (!z) {
                                        themedColor &= Integer.MAX_VALUE;
                                    }
                                    textView.setTextColor(themedColor);
                                }
                            }
                            themedColor = phonebookShareAlert.getThemedColor(Theme.key_featuredStickers_buttonText);
                            TextView textView2 = phonebookShareAlert.buttonTextView;
                            textView2.setEnabled(z);
                            if (!z) {
                                themedColor &= Integer.MAX_VALUE;
                            }
                            textView2.setTextColor(themedColor);
                        }
                        ((PhonebookShareAlert.TextCheckBoxCell) ((ViewGroup) obj)).setChecked(vcardItem.checked);
                    } else {
                        int i9 = vcardItem.type;
                        BaseFragment baseFragment = phonebookShareAlert.parentFragment;
                        if (i9 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                baseFragment.getParentActivity().startActivityForResult(intent, 500);
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        } else if (i9 == 1) {
                            Browser.openUrl(baseFragment.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                        } else if (i9 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            Browser.openUrl(baseFragment.getParentActivity(), value);
                        } else {
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
                            builder2.setItems(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new ArticleViewer$$ExternalSyntheticLambda24(6, phonebookShareAlert, vcardItem));
                            builder2.show();
                        }
                    }
                    break;
                }
                break;
            case 11:
                SharedMediaLayout.ChannelRecommendationsAdapter channelRecommendationsAdapter = (SharedMediaLayout.ChannelRecommendationsAdapter) obj2;
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                BaseFragment baseFragment2 = sharedMediaLayout.profileActivity;
                baseFragment2.finishPreviewFragment();
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                chat.left = false;
                channelRecommendationsAdapter.update(false);
                channelRecommendationsAdapter.mObservable.notifyItemRangeRemoved(i3, 1);
                if (channelRecommendationsAdapter.chats.isEmpty()) {
                    sharedMediaLayout.updateTabs(true);
                    sharedMediaLayout.checkCurrentTabValid();
                }
                baseFragment2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-sharedMediaLayout.dialog_id));
                baseFragment2.getMessagesController().addUserToChat(chat.id, baseFragment2.getUserConfig().getCurrentUser(), 0, null, baseFragment2, new ShareAlert$$ExternalSyntheticLambda29(19, channelRecommendationsAdapter, chat));
                break;
            case 12:
                ((TranslateButton$$ExternalSyntheticLambda3) obj2).run();
                ((ActionBarPopupWindow.ActionBarPopupWindowLayout) obj).getSwipeBack().openForeground(i3);
                break;
            case 13:
                ((DialogsActivity) obj2).lambda$openAccountSelector$176(i3, (ItemOptions) obj);
                break;
            case 14:
                StarsController.GiftsList giftsList = (StarsController.GiftsList) obj2;
                giftsList.getClass();
                if ((i3 & 15) != 0) {
                    i = 15;
                } else if ((i3 & 768) == 0) {
                    i = 0;
                }
                int i10 = giftsList.includeFlags & i;
                int flag = TLObject.setFlag(i10, i3, !TLObject.hasFlag(i10, i3));
                if (flag == 0) {
                    flag = (~i3) & i;
                }
                int i11 = giftsList.includeFlags;
                int i12 = ((~i) & i11) | flag;
                if (i11 != i12) {
                    giftsList.includeFlags = i12;
                    giftsList.invalidate(true);
                }
                ((Runnable) obj).run();
                break;
            case 15:
                SharedMediaLayout.AnonymousClass13 anonymousClass13 = (SharedMediaLayout.AnonymousClass13) obj2;
                CheckBox2 checkBox2 = anonymousClass13.checkbox;
                CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
                checkBoxBase.setChecked(-1, !checkBoxBase.isChecked, true);
                boolean z3 = checkBox2.checkBoxBase.isChecked;
                BaseFragment baseFragment3 = (BaseFragment) obj;
                BulletinFactory.of(baseFragment3).createSimpleBulletinDetail(z3 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z3 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).show();
                anonymousClass13.list.chat_notifications_enabled = Boolean.valueOf(z3);
                if (anonymousClass13.checkboxRequestId >= 0) {
                    ConnectionsManager.getInstance(i3).cancelRequest(anonymousClass13.checkboxRequestId, true);
                    anonymousClass13.checkboxRequestId = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i3).getInputPeer(anonymousClass13.dialogId);
                togglechatstargiftnotifications.enabled = z3;
                ConnectionsManager.getInstance(i3).sendRequest(togglechatstargiftnotifications, new LinkManager$$ExternalSyntheticLambda8(17, anonymousClass13, baseFragment3));
                break;
            case 16:
                ((MainTabsActivity) obj2).lambda$openAccountSelector$12(i3, (ItemOptions) obj);
                break;
            case 17:
                boolean[] zArr = (boolean[]) obj2;
                zArr[0] = i3 == 1;
                int i13 = 0;
                while (true) {
                    RadioColorCell[] radioColorCellArr = (RadioColorCell[]) obj;
                    if (i13 < radioColorCellArr.length) {
                        radioColorCellArr[i13].radioButton.setChecked(zArr[0] == (i13 == 1), true);
                        i13++;
                    }
                    break;
                }
                break;
            case 18:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((ActionBarPopupWindow) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((SaveToGallerySettingsActivity.Item) saveToGallerySettingsActivity.items.get(i3)).exception.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.type);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 19:
                EmojiView.EmojiPack emojiPack = (EmojiView.EmojiPack) obj;
                boolean z4 = emojiPack.free;
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                if (z4 || UserConfig.getInstance(selectAnimatedEmojiDialog.currentAccount).isPremium()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < selectAnimatedEmojiDialog.emojiGridView.getChildCount()) {
                            SelectAnimatedEmojiDialog.AnonymousClass7 anonymousClass7 = selectAnimatedEmojiDialog.emojiGridView;
                            if ((anonymousClass7.getChildAt(i14) instanceof SelectAnimatedEmojiDialog.EmojiPackExpand) && (childAdapterPosition = RecyclerView.getChildAdapterPosition((childAt = anonymousClass7.getChildAt(i14)))) >= 0 && selectAnimatedEmojiDialog.positionToExpand.get(childAdapterPosition) == i3) {
                                numValueOf = Integer.valueOf(childAdapterPosition);
                            } else {
                                i14++;
                            }
                        } else {
                            numValueOf = null;
                            childAt = null;
                        }
                    }
                    if (numValueOf != null) {
                        selectAnimatedEmojiDialog.expand(numValueOf.intValue(), childAt);
                    }
                    EmojiPacksAlert.installSet(null, emojiPack.set, false, null, null);
                    selectAnimatedEmojiDialog.installedEmojiSets.add(Long.valueOf(emojiPack.set.id));
                    selectAnimatedEmojiDialog.updateRows(true, true, true);
                } else {
                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                    if (lastFragment != null) {
                        lastFragment.showDialog(new PremiumFeatureBottomSheet(selectAnimatedEmojiDialog.baseFragment, selectAnimatedEmojiDialog.getContext(), selectAnimatedEmojiDialog.currentAccount, false, 11, false, null));
                    }
                }
                break;
            case 20:
                Browser.openUrl((Context) obj2, "https://" + MessagesController.getInstance(i3).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            default:
                SharedConfig.setSearchEngineType(i3);
                ((TextCell) ((View) obj2)).setValue(SearchEngine.getCurrent().name, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
        }
    }

    public WearAuthSheet$$ExternalSyntheticLambda6(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
    }

    public WearAuthSheet$$ExternalSyntheticLambda6(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
    }
}
