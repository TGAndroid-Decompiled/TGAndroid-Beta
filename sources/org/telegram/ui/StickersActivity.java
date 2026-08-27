package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;

public class StickersActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {

    public org.telegram.ui.Components.k51 f36189a;
    private int archivedRow;

    public vq f36190b;

    public NumberTextView f36191c;
    public org.telegram.ui.Components.v31 d;
    private int dynamicPackOrder;

    public ArrayList f36192e;

    public ArrayList f36193f;
    private int featuredRow;
    public final ArrayList h;
    private int largeEmojiRow;

    public org.telegram.ui.ActionBar.v0 f36194n;

    public int f36195r;

    public boolean f36196s;
    private int suggestRow;
    public final int v;

    public ArrayList f36197w;

    public final HashSet f36198x;

    public final r91 f36199y;

    public StickersActivity(int i10, ArrayList arrayList) {
        super(null);
        this.h = new ArrayList();
        this.f36198x = new HashSet();
        this.f36199y = new r91(this, 0);
        this.v = i10;
        this.f36197w = arrayList;
    }

    public static void U(StickersActivity stickersActivity, org.telegram.ui.Components.n41 n41Var, View view) {
        int i10 = stickersActivity.v;
        Object obj = n41Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!stickersActivity.f36198x.isEmpty()) {
                stickersActivity.n0((org.telegram.ui.Cells.h8) view);
                return;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                stickersActivity.showDialog(new org.telegram.ui.Components.ex0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.f22400id = stickerSet2.f22407id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            arrayList2.add(tL_inputStickerSetID);
            stickersActivity.showDialog(new org.telegram.ui.Components.cv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.f22400id = stickerSet3.f22407id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i10 != 5) {
                stickersActivity.showDialog(new org.telegram.ui.Components.ex0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
                return;
            }
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(tL_inputStickerSetID2);
            stickersActivity.showDialog(new org.telegram.ui.Components.cv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
            return;
        }
        switch (n41Var.d) {
            case 1:
            case 8:
                if (i10 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayListK0 = stickersActivity.k0();
                    if (arrayListK0 != null) {
                        for (int i11 = 0; i11 < arrayListK0.size(); i11++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayListK0.get(i11);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.f22400id = stickerSet4.f22407id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    MediaDataController.getInstance(stickersActivity.currentAccount).markFeaturedStickersAsRead(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.cv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                } else {
                    org.telegram.ui.Components.v31 v31Var = new org.telegram.ui.Components.v31(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.j41(stickersActivity.getParentActivity(), new w91(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                    stickersActivity.d = v31Var;
                    v31Var.show();
                }
                break;
            case 2:
                stickersActivity.presentFragment(new q(i10));
                break;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                stickersActivity.presentFragment(new g21());
                break;
            case 5:
                org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(stickersActivity, view);
                b70VarH.i(new zg(4, view), LocaleController.getString(R.string.SuggestStickersAll), SharedConfig.suggestStickers == 0);
                b70VarH.i(new zg(5, view), LocaleController.getString(R.string.SuggestStickersInstalled), SharedConfig.suggestStickers == 1);
                b70VarH.i(new zg(6, view), LocaleController.getString(R.string.SuggestStickersNone), SharedConfig.suggestStickers == 2);
                b70VarH.Z();
                break;
            case 6:
                SharedConfig.toggleBigEmoji();
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.allowBigEmoji);
                break;
            case 7:
                SharedConfig.toggleUpdateStickersOrderOnSend();
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.updateStickersOrderOnSend);
                break;
            case 9:
                SharedConfig.toggleSuggestAnimatedEmoji();
                ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.suggestAnimatedEmoji);
                break;
        }
    }

    public static void V(StickersActivity stickersActivity, ArrayList arrayList) {
        r91 r91Var = stickersActivity.f36199y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Object obj2 = ((org.telegram.ui.Components.n41) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.f36192e = arrayList2;
        stickersActivity.f36196s = true;
        Collections.sort(MediaDataController.getInstance(stickersActivity.currentAccount).getStickerSets(stickersActivity.v), new ot(stickersActivity, 3));
        AndroidUtilities.cancelRunOnUIThread(r91Var);
        AndroidUtilities.runOnUIThread(r91Var, 1000L);
    }

    public static void X(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = m3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.h;
        if (arrayList.contains(Long.valueOf(stickerSet.set.f22407id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.f22407id));
        m3Var.f24671e.a(true, true);
        if (m3Var.f24675s) {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    public static void Z(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.h8 h8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        ArrayList arrayList = stickersActivity.h;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (!(viewGroup.getParent() instanceof org.telegram.ui.Cells.h8) || (stickersSet = (h8Var = (org.telegram.ui.Cells.h8) viewGroup.getParent()).getStickersSet()) == null || stickersSet.set == null) {
            return;
        }
        int i10 = 0;
        if (h8Var.f24462y != view) {
            if (h8Var.A == view) {
                MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                return;
            } else {
                if (h8Var.B == view) {
                    stickersActivity.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) stickersActivity, 11, false));
                    return;
                }
                return;
            }
        }
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = stickersActivity.getMediaDataController().getFeaturedEmojiSets();
        while (true) {
            if (i10 >= featuredEmojiSets.size()) {
                stickerSetCovered = null;
                break;
            } else {
                if (stickersSet.set.f22407id == featuredEmojiSets.get(i10).set.f22407id) {
                    stickerSetCovered = featuredEmojiSets.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (stickerSetCovered != null) {
            if (arrayList.contains(Long.valueOf(stickerSetCovered.set.f22407id))) {
                return;
            } else {
                arrayList.add(Long.valueOf(stickerSetCovered.set.f22407id));
            }
        }
        MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered == null ? stickersSet : stickerSetCovered, 2, stickersActivity, false, false);
    }

    public static void a0(StickersActivity stickersActivity, ArrayList arrayList, int i10) {
        stickersActivity.j0();
        MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSets(arrayList, stickersActivity.v, i10 == 1 ? 0 : 1, stickersActivity, true);
    }

    public static void b0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.x9) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            String doubleTapReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getDoubleTapReaction();
            if (doubleTapReaction != null) {
                if (doubleTapReaction.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.k5 k5VarN = org.telegram.ui.Components.k5.n(stickersActivity.currentAccount, Long.parseLong(doubleTapReaction.substring(9)), null, 2);
                        k5VarN.a(x9Var.getValueBackupImageView());
                        x9Var.getValueBackupImageView().setImageDrawable(k5VarN);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getReactionsMap().get(doubleTapReaction);
                if (tL_availableReaction != null) {
                    x9Var.getValueBackupImageView().getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "100_100_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.g6.f22999a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void c0(final StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.b51 b51Var) {
        final int i10;
        CharSequence charSequence;
        boolean z10;
        ArrayList arrayList2 = stickersActivity.h;
        int i11 = stickersActivity.v;
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        org.telegram.ui.Components.k51 k51Var = stickersActivity.f36189a;
        if (k51Var == null || (!k51Var.Y2 && !stickersActivity.f36196s && stickersActivity.f36195r <= 0)) {
            if (i11 == 5) {
                ArrayList arrayList3 = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i11)));
                stickersActivity.f36197w = arrayList3;
                stickersActivity.f36192e = arrayList3;
            } else {
                stickersActivity.f36192e = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i11)));
            }
        }
        stickersActivity.f36193f = new ArrayList(stickersActivity.k0());
        final int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= stickersActivity.f36193f.size()) {
                break;
            }
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.f36193f.get(i13)).set.f22407id))) {
                stickersActivity.f36193f.remove(i13);
                i13--;
            }
            i13++;
        }
        int size = stickersActivity.f36193f.size();
        int archivedStickersCount = mediaDataController.getArchivedStickersCount(i11);
        int size2 = mediaDataController.getStickerSets(5).size();
        final int i14 = 2;
        if (i11 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            arrayList.add(org.telegram.ui.Components.n41.d(1, R.drawable.msg2_trending, LocaleController.getString(R.string.FeaturedStickers), size > 0 ? LocaleController.formatNumber(size, ',') : ""));
            if (archivedStickersCount > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i11 == 0) {
                    arrayList.add(org.telegram.ui.Components.n41.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
                } else {
                    arrayList.add(org.telegram.ui.Components.n41.f(LocaleController.getString(i11 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ','), 2));
                }
            }
            arrayList.size();
            int i15 = R.drawable.msg2_smile_status;
            String string = LocaleController.getString(R.string.Emoji);
            String number = size2 > 0 ? LocaleController.formatNumber(size2, ',') : "";
            org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(43);
            n41Var.d = 3;
            n41Var.f30843k = i15;
            n41Var.f30844l = string;
            n41Var.f30845m = number;
            arrayList.add(n41Var);
        } else if (archivedStickersCount > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i11 == 0) {
                arrayList.add(org.telegram.ui.Components.n41.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
            } else {
                arrayList.add(org.telegram.ui.Components.n41.f(LocaleController.getString(i11 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ','), 2));
            }
            if (i11 == 1) {
                org.telegram.ui.Cells.pa.A(R.string.ArchivedMasksInfo, arrayList);
            }
        }
        if (i11 == 0) {
            arrayList.size();
            int i16 = R.drawable.msg2_reactions2;
            String string2 = LocaleController.getString(R.string.DoubleTapSetting);
            org.telegram.ui.Components.n41 n41Var2 = new org.telegram.ui.Components.n41(43);
            n41Var2.d = 4;
            n41Var2.f30843k = i16;
            n41Var2.f30844l = string2;
            n41Var2.F = new x3(stickersActivity, 19);
            arrayList.add(n41Var2);
            arrayList.add(org.telegram.ui.Components.n41.B(stickersActivity.h0(LocaleController.getString(i11 == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo))));
            arrayList.add(org.telegram.ui.Components.n41.t(LocaleController.getString(R.string.StickersSettings)));
            stickersActivity.suggestRow = arrayList.size();
            String string3 = LocaleController.getString(R.string.SuggestStickers);
            int i17 = SharedConfig.suggestStickers;
            String string4 = i17 != 0 ? i17 != 1 ? LocaleController.getString(R.string.SuggestStickersNone) : LocaleController.getString(R.string.SuggestStickersInstalled) : LocaleController.getString(R.string.SuggestStickersAll);
            org.telegram.ui.Components.n41 n41Var3 = new org.telegram.ui.Components.n41(43);
            n41Var3.d = 5;
            n41Var3.f30844l = string3;
            n41Var3.f30845m = string4;
            arrayList.add(n41Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.n41 n41VarI = org.telegram.ui.Components.n41.i(6, LocaleController.getString(R.string.LargeEmoji));
            n41VarI.K(SharedConfig.allowBigEmoji);
            arrayList.add(n41VarI);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.n41 n41VarI2 = org.telegram.ui.Components.n41.i(7, LocaleController.getString(R.string.DynamicPackOrder));
            n41VarI2.K(SharedConfig.updateStickersOrderOnSend);
            arrayList.add(n41VarI2);
            org.telegram.ui.Cells.pa.A(R.string.DynamicPackOrderInfo, arrayList);
        }
        if (i11 == 5) {
            org.telegram.ui.Components.n41 n41VarI3 = org.telegram.ui.Components.n41.i(9, LocaleController.getString(R.string.SuggestAnimatedEmoji));
            n41VarI3.K(SharedConfig.suggestAnimatedEmoji);
            arrayList.add(n41VarI3);
            org.telegram.ui.Cells.pa.A(R.string.SuggestAnimatedEmojiInfo, arrayList);
        }
        if (stickersActivity.f36192e.size() > 0) {
            b51Var.U();
            if (i11 == 5 || (!stickersActivity.f36193f.isEmpty() && i11 == 0)) {
                org.telegram.ui.Cells.pa.o(i11 == 5 ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets, arrayList);
            }
            b51Var.M();
            ArrayList arrayList4 = stickersActivity.f36192e;
            int i18 = 0;
            for (int size3 = arrayList4.size(); i18 < size3; size3 = size3) {
                Object obj = arrayList4.get(i18);
                i18++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i19 = org.telegram.ui.Cells.g8.f24402a;
                org.telegram.ui.Components.n41 n41VarJ = org.telegram.ui.Components.n41.J(org.telegram.ui.Cells.g8.class);
                n41VarJ.G = tL_messages_stickerSet;
                n41VarJ.D = new View.OnClickListener(stickersActivity) {

                    public final StickersActivity f42560b;

                    {
                        this.f42560b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.h8)) {
                                    org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = h8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f42560b;
                                    org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(stickersActivity2, h8Var);
                                    final int i20 = 0;
                                    b70VarH.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i20) {
                                                case 0:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    MediaDataController.getInstance(stickersActivity3.currentAccount).toggleStickerSet(stickersActivity3.getParentActivity(), tL_messages_stickerSet2, !tL_messages_stickerSet2.set.archived ? 1 : 2, stickersActivity3, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity4.l0(stickersSet)));
                                                        org.telegram.ui.Components.mc.j(stickersActivity4).j();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    StickersActivity stickersActivity5 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    stickersActivity5.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity5.l0(tL_messages_stickerSet3));
                                                        stickersActivity5.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    StickersActivity stickersActivity6 = stickersActivity2;
                                                    MediaDataController.getInstance(stickersActivity6.currentAccount).toggleStickerSet(stickersActivity6.getParentActivity(), stickersSet, 0, stickersActivity6, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i21 = 1;
                                    b70VarH.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i21) {
                                                case 0:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    MediaDataController.getInstance(stickersActivity3.currentAccount).toggleStickerSet(stickersActivity3.getParentActivity(), tL_messages_stickerSet2, !tL_messages_stickerSet2.set.archived ? 1 : 2, stickersActivity3, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity4.l0(stickersSet)));
                                                        org.telegram.ui.Components.mc.j(stickersActivity4).j();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    StickersActivity stickersActivity5 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    stickersActivity5.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity5.l0(tL_messages_stickerSet3));
                                                        stickersActivity5.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    StickersActivity stickersActivity6 = stickersActivity2;
                                                    MediaDataController.getInstance(stickersActivity6.currentAccount).toggleStickerSet(stickersActivity6.getParentActivity(), stickersSet, 0, stickersActivity6, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    b70VarH.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new m21(10, stickersActivity2, h8Var), false);
                                    final int i22 = 2;
                                    b70VarH.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    MediaDataController.getInstance(stickersActivity3.currentAccount).toggleStickerSet(stickersActivity3.getParentActivity(), tL_messages_stickerSet2, !tL_messages_stickerSet2.set.archived ? 1 : 2, stickersActivity3, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity4.l0(stickersSet)));
                                                        org.telegram.ui.Components.mc.j(stickersActivity4).j();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    StickersActivity stickersActivity5 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    stickersActivity5.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity5.l0(tL_messages_stickerSet3));
                                                        stickersActivity5.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    StickersActivity stickersActivity6 = stickersActivity2;
                                                    MediaDataController.getInstance(stickersActivity6.currentAccount).toggleStickerSet(stickersActivity6.getParentActivity(), stickersSet, 0, stickersActivity6, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i23 = 3;
                                    b70VarH.m(!stickersSet.set.official, R.drawable.msg_delete, LocaleController.getString(R.string.StickersRemove), true, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    MediaDataController.getInstance(stickersActivity3.currentAccount).toggleStickerSet(stickersActivity3.getParentActivity(), tL_messages_stickerSet2, !tL_messages_stickerSet2.set.archived ? 1 : 2, stickersActivity3, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity4.l0(stickersSet)));
                                                        org.telegram.ui.Components.mc.j(stickersActivity4).j();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    StickersActivity stickersActivity5 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    stickersActivity5.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity5.l0(tL_messages_stickerSet3));
                                                        stickersActivity5.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    StickersActivity stickersActivity6 = stickersActivity2;
                                                    MediaDataController.getInstance(stickersActivity6.currentAccount).toggleStickerSet(stickersActivity6.getParentActivity(), stickersSet, 0, stickersActivity6, true, true);
                                                    break;
                                            }
                                        }
                                    });
                                    b70VarH.S = 190;
                                    b70VarH.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.Z(this.f42560b, view);
                                break;
                            default:
                                StickersActivity.X(this.f42560b, view);
                                break;
                        }
                    }
                };
                n41VarJ.E = new View.OnClickListener(stickersActivity) {

                    public final StickersActivity f42560b;

                    {
                        this.f42560b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.h8)) {
                                    org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = h8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f42560b;
                                    org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(stickersActivity2, h8Var);
                                    final int i20 = 0;
                                    b70VarH.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i20) {
                                                case 0:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    MediaDataController.getInstance(stickersActivity3.currentAccount).toggleStickerSet(stickersActivity3.getParentActivity(), tL_messages_stickerSet2, !tL_messages_stickerSet2.set.archived ? 1 : 2, stickersActivity3, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity4.l0(stickersSet)));
                                                        org.telegram.ui.Components.mc.j(stickersActivity4).j();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    StickersActivity stickersActivity5 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    stickersActivity5.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity5.l0(tL_messages_stickerSet3));
                                                        stickersActivity5.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    StickersActivity stickersActivity6 = stickersActivity2;
                                                    MediaDataController.getInstance(stickersActivity6.currentAccount).toggleStickerSet(stickersActivity6.getParentActivity(), stickersSet, 0, stickersActivity6, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i21 = 1;
                                    b70VarH.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i21) {
                                                case 0:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    MediaDataController.getInstance(stickersActivity3.currentAccount).toggleStickerSet(stickersActivity3.getParentActivity(), tL_messages_stickerSet2, !tL_messages_stickerSet2.set.archived ? 1 : 2, stickersActivity3, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity4.l0(stickersSet)));
                                                        org.telegram.ui.Components.mc.j(stickersActivity4).j();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    StickersActivity stickersActivity5 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    stickersActivity5.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity5.l0(tL_messages_stickerSet3));
                                                        stickersActivity5.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    StickersActivity stickersActivity6 = stickersActivity2;
                                                    MediaDataController.getInstance(stickersActivity6.currentAccount).toggleStickerSet(stickersActivity6.getParentActivity(), stickersSet, 0, stickersActivity6, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    b70VarH.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new m21(10, stickersActivity2, h8Var), false);
                                    final int i22 = 2;
                                    b70VarH.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    MediaDataController.getInstance(stickersActivity3.currentAccount).toggleStickerSet(stickersActivity3.getParentActivity(), tL_messages_stickerSet2, !tL_messages_stickerSet2.set.archived ? 1 : 2, stickersActivity3, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity4.l0(stickersSet)));
                                                        org.telegram.ui.Components.mc.j(stickersActivity4).j();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    StickersActivity stickersActivity5 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    stickersActivity5.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity5.l0(tL_messages_stickerSet3));
                                                        stickersActivity5.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    StickersActivity stickersActivity6 = stickersActivity2;
                                                    MediaDataController.getInstance(stickersActivity6.currentAccount).toggleStickerSet(stickersActivity6.getParentActivity(), stickersSet, 0, stickersActivity6, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i23 = 3;
                                    b70VarH.m(!stickersSet.set.official, R.drawable.msg_delete, LocaleController.getString(R.string.StickersRemove), true, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    MediaDataController.getInstance(stickersActivity3.currentAccount).toggleStickerSet(stickersActivity3.getParentActivity(), tL_messages_stickerSet2, !tL_messages_stickerSet2.set.archived ? 1 : 2, stickersActivity3, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity4.l0(stickersSet)));
                                                        org.telegram.ui.Components.mc.j(stickersActivity4).j();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    StickersActivity stickersActivity5 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    stickersActivity5.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity5.l0(tL_messages_stickerSet3));
                                                        stickersActivity5.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    StickersActivity stickersActivity6 = stickersActivity2;
                                                    MediaDataController.getInstance(stickersActivity6.currentAccount).toggleStickerSet(stickersActivity6.getParentActivity(), stickersSet, 0, stickersActivity6, true, true);
                                                    break;
                                            }
                                        }
                                    });
                                    b70VarH.S = 190;
                                    b70VarH.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.Z(this.f42560b, view);
                                break;
                            default:
                                StickersActivity.X(this.f42560b, view);
                                break;
                        }
                    }
                };
                n41VarJ.K(stickersActivity.f36198x.contains(Long.valueOf(tL_messages_stickerSet.set.f22407id)));
                arrayList.add(n41VarJ);
            }
            charSequence = null;
            b51Var.L();
            b51Var.T();
            if (i11 != 1 && i11 != 5) {
                arrayList.add(org.telegram.ui.Components.n41.B(null));
            } else if (i11 == 1) {
                org.telegram.ui.Cells.pa.A(R.string.MasksInfo, arrayList);
            }
        } else {
            charSequence = null;
        }
        if (stickersActivity.f36193f.size() > 3) {
            stickersActivity.f36193f = new ArrayList(stickersActivity.f36193f.subList(0, 3));
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 5 && !stickersActivity.f36193f.isEmpty()) {
            if (stickersActivity.f36192e.size() > 0) {
                arrayList.add(org.telegram.ui.Components.n41.B(charSequence));
            }
            org.telegram.ui.Cells.pa.o(i11 == 5 ? R.string.FeaturedEmojiPacks : R.string.FeaturedStickers, arrayList);
            ArrayList arrayList5 = stickersActivity.f36193f;
            int size4 = arrayList5.size();
            while (i12 < size4) {
                Object obj2 = arrayList5.get(i12);
                i12++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i20 = org.telegram.ui.Cells.l3.f24616a;
                org.telegram.ui.Components.n41 n41VarJ2 = org.telegram.ui.Components.n41.J(org.telegram.ui.Cells.l3.class);
                n41VarJ2.G = stickerSetCovered;
                n41VarJ2.D = new View.OnClickListener(stickersActivity) {

                    public final StickersActivity f42560b;

                    {
                        this.f42560b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.h8)) {
                                    org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = h8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f42560b;
                                    org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(stickersActivity2, h8Var);
                                    final int i21 = 0;
                                    b70VarH.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i21) {
                                                case 0:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    MediaDataController.getInstance(stickersActivity3.currentAccount).toggleStickerSet(stickersActivity3.getParentActivity(), tL_messages_stickerSet2, !tL_messages_stickerSet2.set.archived ? 1 : 2, stickersActivity3, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity4.l0(stickersSet)));
                                                        org.telegram.ui.Components.mc.j(stickersActivity4).j();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    StickersActivity stickersActivity5 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    stickersActivity5.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity5.l0(tL_messages_stickerSet3));
                                                        stickersActivity5.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    StickersActivity stickersActivity6 = stickersActivity2;
                                                    MediaDataController.getInstance(stickersActivity6.currentAccount).toggleStickerSet(stickersActivity6.getParentActivity(), stickersSet, 0, stickersActivity6, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i22 = 1;
                                    b70VarH.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    MediaDataController.getInstance(stickersActivity3.currentAccount).toggleStickerSet(stickersActivity3.getParentActivity(), tL_messages_stickerSet2, !tL_messages_stickerSet2.set.archived ? 1 : 2, stickersActivity3, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity4.l0(stickersSet)));
                                                        org.telegram.ui.Components.mc.j(stickersActivity4).j();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    StickersActivity stickersActivity5 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    stickersActivity5.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity5.l0(tL_messages_stickerSet3));
                                                        stickersActivity5.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    StickersActivity stickersActivity6 = stickersActivity2;
                                                    MediaDataController.getInstance(stickersActivity6.currentAccount).toggleStickerSet(stickersActivity6.getParentActivity(), stickersSet, 0, stickersActivity6, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    b70VarH.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new m21(10, stickersActivity2, h8Var), false);
                                    final int i23 = 2;
                                    b70VarH.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    MediaDataController.getInstance(stickersActivity3.currentAccount).toggleStickerSet(stickersActivity3.getParentActivity(), tL_messages_stickerSet2, !tL_messages_stickerSet2.set.archived ? 1 : 2, stickersActivity3, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity4.l0(stickersSet)));
                                                        org.telegram.ui.Components.mc.j(stickersActivity4).j();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    StickersActivity stickersActivity5 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    stickersActivity5.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity5.l0(tL_messages_stickerSet3));
                                                        stickersActivity5.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    StickersActivity stickersActivity6 = stickersActivity2;
                                                    MediaDataController.getInstance(stickersActivity6.currentAccount).toggleStickerSet(stickersActivity6.getParentActivity(), stickersSet, 0, stickersActivity6, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i24 = 3;
                                    b70VarH.m(!stickersSet.set.official, R.drawable.msg_delete, LocaleController.getString(R.string.StickersRemove), true, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    MediaDataController.getInstance(stickersActivity3.currentAccount).toggleStickerSet(stickersActivity3.getParentActivity(), tL_messages_stickerSet2, !tL_messages_stickerSet2.set.archived ? 1 : 2, stickersActivity3, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity4.l0(stickersSet)));
                                                        org.telegram.ui.Components.mc.j(stickersActivity4).j();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return;
                                                    }
                                                    break;
                                                case 2:
                                                    StickersActivity stickersActivity5 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                    stickersActivity5.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity5.l0(tL_messages_stickerSet3));
                                                        stickersActivity5.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    StickersActivity stickersActivity6 = stickersActivity2;
                                                    MediaDataController.getInstance(stickersActivity6.currentAccount).toggleStickerSet(stickersActivity6.getParentActivity(), stickersSet, 0, stickersActivity6, true, true);
                                                    break;
                                            }
                                        }
                                    });
                                    b70VarH.S = 190;
                                    b70VarH.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.Z(this.f42560b, view);
                                break;
                            default:
                                StickersActivity.X(this.f42560b, view);
                                break;
                        }
                    }
                };
                n41VarJ2.f30852t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.f22407id));
                arrayList.add(n41VarJ2);
            }
            if (z10) {
                org.telegram.ui.Components.n41 n41VarC = org.telegram.ui.Components.n41.c(8, R.drawable.msg2_trending, LocaleController.getString(R.string.ShowMoreEmojiPacks));
                n41VarC.f30849q = true;
                arrayList.add(n41VarC);
            }
        }
        if (i11 == 5) {
            arrayList.add(org.telegram.ui.Components.n41.B(stickersActivity.h0(LocaleController.getString(i11 == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo))));
        }
    }

    public static void d0(StickersActivity stickersActivity, int i10) {
        StickersActivity stickersActivity2;
        String string;
        TextView textView;
        int i11 = 2;
        if (i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.f36192e.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.f36192e.get(i12);
                if (stickersActivity.f36198x.contains(Long.valueOf(tL_messages_stickerSet.set.f22407id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.l0(tL_messages_stickerSet));
                }
            }
            String string2 = sb2.toString();
            org.telegram.ui.Components.sp0 sp0VarN0 = org.telegram.ui.Components.sp0.N0(stickersActivity.fragmentView.getContext(), null, string2, false, string2);
            sp0VarN0.f32537o0 = new gv0(stickersActivity, i11);
            sp0VarN0.show();
            return;
        }
        if (i10 == 0 || i10 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.f36198x.size());
            int size2 = stickersActivity.f36192e.size();
            for (int i13 = 0; i13 < size2; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.f36192e.get(i13);
                if (stickersActivity.f36198x.contains(Long.valueOf(tL_messages_stickerSet2.set.f22407id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i10 == 1) {
                        alertDialog$Builder.f22702a.N = LocaleController.formatString(R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.f22702a.P = LocaleController.formatString(R.string.DeleteStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Delete);
                    } else {
                        alertDialog$Builder.f22702a.N = LocaleController.formatString(R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.f22702a.P = LocaleController.formatString(R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Archive);
                    }
                    alertDialog$Builder.k(string, new c3.d(stickersActivity, arrayList, i10, 14));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    stickersActivity.showDialog(b2Var);
                    if (i10 != 1 || (textView = (TextView) b2Var.d(-1)) == null) {
                        return;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                    return;
                }
                int size4 = stickersActivity.f36192e.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.f36192e.get(i14);
                    if (stickersActivity.f36198x.contains(Long.valueOf(tL_messages_stickerSet3.set.f22407id))) {
                        if (i10 == 0) {
                            stickersActivity2 = stickersActivity;
                            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), tL_messages_stickerSet3, !tL_messages_stickerSet3.set.archived ? 1 : 2, stickersActivity2, true, true);
                        } else {
                            stickersActivity2 = stickersActivity;
                            if (i10 == 1) {
                                MediaDataController.getInstance(stickersActivity2.currentAccount).toggleStickerSet(stickersActivity2.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity2, true, true);
                            } else if (i10 == 2) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", stickersActivity2.l0(tL_messages_stickerSet3));
                                    stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                            } else if (i10 == 3) {
                                try {
                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.l0(tL_messages_stickerSet3)));
                                    org.telegram.ui.Components.mc.j(stickersActivity2).j();
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                            } else if (i10 == 4) {
                                HashSet hashSet = stickersActivity2.f36198x;
                                if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f22407id))) {
                                    hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.f22407id));
                                } else {
                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f22407id));
                                }
                                stickersActivity2.f36189a.U2.N(true);
                                stickersActivity2.i0();
                            }
                        }
                        stickersActivity2.j0();
                    }
                }
                stickersActivity2 = stickersActivity;
                stickersActivity2.j0();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.v;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.StickersName));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Masks));
        } else if (i10 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Emoji));
        }
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 28));
        org.telegram.ui.ActionBar.z zVarJ = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(zVarJ.getContext());
        this.f36191c = numberTextView;
        numberTextView.setTextSize(18);
        this.f36191c.setTypeface(AndroidUtilities.bold());
        this.f36191c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23425y8, false));
        zVarJ.addView(this.f36191c, h7.z5.m(1.0f, 0, -1, 72, 0, 0));
        this.f36191c.setOnTouchListener(new kh.e(2));
        zVarJ.g(2, R.drawable.msg_share, AndroidUtilities.dp(54.0f));
        zVarJ.g(0, R.drawable.msg_archive, AndroidUtilities.dp(54.0f));
        this.f36194n = zVarJ.g(1, R.drawable.msg_delete, AndroidUtilities.dp(54.0f));
        if (i10 != 5 || (arrayList = this.f36197w) == null) {
            this.f36192e = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(i10)));
        } else {
            this.f36192e = arrayList;
        }
        this.f36193f = k0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        final int i11 = 0;
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(this, new Utilities.Callback2(this) {

            public final StickersActivity f43172b;

            {
                this.f43172b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        StickersActivity.c0(this.f43172b, (ArrayList) obj, (org.telegram.ui.Components.b51) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.V(this.f43172b, (ArrayList) obj2);
                        break;
                }
            }
        }, new v91(this), new v91(this));
        this.f36189a = k51Var;
        k51Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36189a);
        this.f36189a.setFocusable(true);
        this.f36189a.setTag(7);
        final int i12 = 1;
        this.f36189a.B1(new Utilities.Callback2(this) {

            public final StickersActivity f43172b;

            {
                this.f43172b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        StickersActivity.c0(this.f43172b, (ArrayList) obj, (org.telegram.ui.Components.b51) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.V(this.f43172b, (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        vq vqVar = new vq(this, 6);
        this.f36190b = vqVar;
        vqVar.j1(1);
        this.f36189a.setLayoutManager(this.f36190b);
        frameLayout.addView(this.f36189a, h7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        int i13 = this.v;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == i13) {
                this.h.clear();
            }
            this.f36189a.U2.N(true);
        } else if (i10 == NotificationCenter.featuredStickersDidLoad || i10 == NotificationCenter.featuredEmojiDidLoad) {
            this.f36189a.U2.N(true);
        } else if (i10 == NotificationCenter.archivedStickersCountDidLoad && ((Integer) objArr[0]).intValue() == i13) {
            this.f36189a.U2.N(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 16, new Class[]{org.telegram.ui.Cells.h8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.p8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23425y8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 512, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.g6.f23393w8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.g6.x8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.g6.f23443z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36191c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 2, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 0, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 0, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 196608, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        int i13 = org.telegram.ui.ActionBar.g6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 0, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"optionsButton"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 0, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"reorderButton"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 8192, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36189a, 16384, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23182k7));
        org.telegram.ui.Components.v31 v31Var = this.d;
        if (v31Var != null) {
            arrayList.addAll(v31Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final CharSequence h0(String str) {
        int iIndexOf = str.indexOf("@stickers");
        if (iIndexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(this, 5), iIndexOf, iIndexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return str;
    }

    public final void i0() {
        HashSet hashSet = this.f36198x;
        int size = hashSet.size();
        boolean zT = this.actionBar.t();
        int i10 = 0;
        if (size <= 0) {
            if (zT) {
                this.actionBar.s();
                this.f36189a.w1(false);
                m0();
                return;
            }
            return;
        }
        if (hashSet.size() > 0) {
            ArrayList arrayList = this.f36192e;
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.f22407id))) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet.official && !stickerSet.emojis) {
                        i10 = 8;
                        break;
                    }
                }
            }
            if (this.f36194n.getVisibility() != i10) {
                this.f36194n.setVisibility(i10);
            }
        }
        this.f36191c.a(size, zT);
        if (zT) {
            return;
        }
        this.actionBar.O(null, null);
        this.f36189a.w1(true);
        if (SharedConfig.stickersReorderingHintUsed || this.v == 5) {
            return;
        }
        SharedConfig.setStickersReorderingHintUsed(true);
        org.telegram.ui.Components.ec.g(this, new org.telegram.ui.Components.cl0(getParentActivity(), LocaleController.getString(R.string.StickersReorderHint)), 3250).j();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        this.f36198x.clear();
        this.f36189a.U2.N(true);
        i0();
    }

    public final ArrayList k0() {
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.v != 5) {
            return mediaDataController.getFeaturedStickerSets();
        }
        ArrayList arrayList = new ArrayList(mediaDataController.getFeaturedEmojiSets());
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (arrayList.get(i10) == null || mediaDataController.isStickerPackInstalled(((TLRPC.StickerSetCovered) arrayList.get(i10)).set.f22407id, false)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        return arrayList;
    }

    public final String l0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb2.append("/");
        return String.format(locale, a9.p.p(sb2, tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers", "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void m0() {
        if (this.f36196s) {
            this.f36196s = false;
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            int i10 = this.v;
            mediaDataController.calcNewHash(i10);
            this.f36195r++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = i10 == 1;
            tL_messages_reorderStickerSets.emojis = i10 == 5;
            int iF = 0;
            while (iF < this.f36192e.size()) {
                iF = com.google.android.recaptcha.internal.a.f(((TLRPC.TL_messages_stickerSet) this.f36192e.get(iF)).set.f22407id, tL_messages_reorderStickerSets.order, iF, 1);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new n(this, 21));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                org.telegram.ui.Components.mc.a0(this).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
                this.f36189a.U2.N(true);
            }
        }
    }

    public final void n0(org.telegram.ui.Cells.h8 h8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = h8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long lValueOf = Long.valueOf(stickersSet.set.f22407id);
        HashSet hashSet = this.f36198x;
        if (hashSet.contains(lValueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.f22407id));
            h8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.f22407id));
            h8Var.b(true, true);
        }
        this.f36189a.U2.N(true);
        i0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f36198x.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        j0();
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        int i10 = this.v;
        mediaDataController.checkStickers(i10);
        if (i10 == 0) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
            MediaDataController.getInstance(this.currentAccount).checkStickers(1);
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
        } else if (i10 == 6) {
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
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.v == 6) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36189a.setPadding(0, 0, 0, i13);
        this.f36189a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.k51 k51Var = this.f36189a;
        if (k51Var != null) {
            k51Var.U2.N(true);
        }
    }
}
