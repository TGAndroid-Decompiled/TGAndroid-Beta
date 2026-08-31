package org.telegram.ui;

import android.app.Activity;
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
public class StickersActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.i61 f34830a;
    private int archivedRow;
    public cr f34831b;
    public NumberTextView f34832c;
    public org.telegram.ui.Components.r41 d;
    private int dynamicPackOrder;
    public ArrayList f34833e;
    public ArrayList f34834f;
    private int featuredRow;
    public final ArrayList h;
    private int largeEmojiRow;
    public org.telegram.ui.ActionBar.w0 f34835n;
    public int f34836r;
    public boolean f34837s;
    private int suggestRow;
    public final int v;
    public ArrayList f34838w;
    public final HashSet f34839x;
    public final ia1 f34840y;

    public StickersActivity(int i10, ArrayList arrayList) {
        super(null);
        this.h = new ArrayList();
        this.f34839x = new HashSet();
        this.f34840y = new ia1(this, 0);
        this.v = i10;
        this.f34838w = arrayList;
    }

    public static void U(StickersActivity stickersActivity, org.telegram.ui.Components.j51 j51Var, View view) {
        boolean z4;
        boolean z10;
        int i10 = stickersActivity.v;
        Object obj = j51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (stickersActivity.f34839x.isEmpty()) {
                ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
                if (arrayList != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null && stickerSet.emojis) {
                        ArrayList arrayList2 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.f20863id = stickerSet2.f20870id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        arrayList2.add(tL_inputStickerSetID);
                        stickersActivity.showDialog(new org.telegram.ui.Components.ov(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
                        return;
                    }
                    stickersActivity.showDialog(new org.telegram.ui.Components.yx0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                    return;
                }
                return;
            }
            stickersActivity.n0((org.telegram.ui.Cells.k8) view);
            return;
        }
        boolean z11 = true;
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.f20863id = stickerSet3.f20870id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i10 == 5) {
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(tL_inputStickerSetID2);
                stickersActivity.showDialog(new org.telegram.ui.Components.ov(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
                return;
            }
            stickersActivity.showDialog(new org.telegram.ui.Components.yx0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
            return;
        }
        switch (j51Var.d) {
            case 1:
            case 8:
                if (i10 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList k02 = stickersActivity.k0();
                    if (k02 != null) {
                        for (int i11 = 0; i11 < k02.size(); i11++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) k02.get(i11);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.f20863id = stickerSet4.f20870id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    MediaDataController.getInstance(stickersActivity.currentAccount).markFeaturedStickersAsRead(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.ov(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    return;
                }
                org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.f51(stickersActivity.getParentActivity(), new na1(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                stickersActivity.d = r41Var;
                r41Var.show();
                return;
            case 2:
                stickersActivity.presentFragment(new r(i10));
                return;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                return;
            case 4:
                stickersActivity.presentFragment(new w21());
                return;
            case 5:
                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(stickersActivity, view);
                if (SharedConfig.suggestStickers == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                H.i(new bh(4, view), LocaleController.getString(R.string.SuggestStickersAll), z4);
                if (SharedConfig.suggestStickers == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.i(new bh(5, view), LocaleController.getString(R.string.SuggestStickersInstalled), z10);
                if (SharedConfig.suggestStickers != 2) {
                    z11 = false;
                }
                H.i(new bh(6, view), LocaleController.getString(R.string.SuggestStickersNone), z11);
                H.Z();
                return;
            case 6:
                SharedConfig.toggleBigEmoji();
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.allowBigEmoji);
                return;
            case 7:
                SharedConfig.toggleUpdateStickersOrderOnSend();
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.updateStickersOrderOnSend);
                return;
            case 9:
                SharedConfig.toggleSuggestAnimatedEmoji();
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.suggestAnimatedEmoji);
                return;
            default:
                return;
        }
    }

    public static void V(StickersActivity stickersActivity, ArrayList arrayList) {
        ia1 ia1Var = stickersActivity.f34840y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Object obj2 = ((org.telegram.ui.Components.j51) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.f34833e = arrayList2;
        stickersActivity.f34837s = true;
        Collections.sort(MediaDataController.getInstance(stickersActivity.currentAccount).getStickerSets(stickersActivity.v), new ut(stickersActivity, 3));
        AndroidUtilities.cancelRunOnUIThread(ia1Var);
        AndroidUtilities.runOnUIThread(ia1Var, 1000L);
    }

    public static void X(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.o3 o3Var = (org.telegram.ui.Cells.o3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = o3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.h;
        if (arrayList.contains(Long.valueOf(stickerSet.set.f20870id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.f20870id));
        o3Var.f23291e.a(true, true);
        if (o3Var.f23295s) {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    public static void Y(StickersActivity stickersActivity, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        Activity parentActivity = stickersActivity.getParentActivity();
        if (!tL_messages_stickerSet.set.archived) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        mediaDataController.toggleStickerSet(parentActivity, tL_messages_stickerSet, i10, stickersActivity, true, true);
    }

    public static void Z(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.k8 k8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSetCovered stickerSetCovered2;
        ArrayList arrayList = stickersActivity.h;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof org.telegram.ui.Cells.k8) && (stickersSet = (k8Var = (org.telegram.ui.Cells.k8) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i10 = 0;
                if (k8Var.f23081y == view) {
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = stickersActivity.getMediaDataController().getFeaturedEmojiSets();
                    while (true) {
                        if (i10 < featuredEmojiSets.size()) {
                            if (stickersSet.set.f20870id == featuredEmojiSets.get(i10).set.f20870id) {
                                stickerSetCovered = featuredEmojiSets.get(i10);
                                break;
                            }
                            i10++;
                        } else {
                            stickerSetCovered = null;
                            break;
                        }
                    }
                    if (stickerSetCovered != null) {
                        if (!arrayList.contains(Long.valueOf(stickerSetCovered.set.f20870id))) {
                            arrayList.add(Long.valueOf(stickerSetCovered.set.f20870id));
                        } else {
                            return;
                        }
                    }
                    MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
                    Activity parentActivity = stickersActivity.getParentActivity();
                    if (stickerSetCovered == null) {
                        stickerSetCovered2 = stickersSet;
                    } else {
                        stickerSetCovered2 = stickerSetCovered;
                    }
                    mediaDataController.toggleStickerSet(parentActivity, stickerSetCovered2, 2, stickersActivity, false, false);
                } else if (k8Var.B == view) {
                    MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                } else if (k8Var.C == view) {
                    stickersActivity.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) stickersActivity, 11, false));
                }
            }
        }
    }

    public static void a0(StickersActivity stickersActivity, ArrayList arrayList, int i10) {
        int i11;
        stickersActivity.j0();
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        int i12 = stickersActivity.v;
        if (i10 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        mediaDataController.toggleStickerSets(arrayList, i12, i11, stickersActivity, true);
    }

    public static void b0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.aa) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            String doubleTapReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getDoubleTapReaction();
            if (doubleTapReaction != null) {
                if (doubleTapReaction.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.l5 n10 = org.telegram.ui.Components.l5.n(stickersActivity.currentAccount, Long.parseLong(doubleTapReaction.substring(9)), null, 2);
                        n10.a(aaVar.getValueBackupImageView());
                        aaVar.getValueBackupImageView().setImageDrawable(n10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getReactionsMap().get(doubleTapReaction);
                if (tL_availableReaction != null) {
                    aaVar.getValueBackupImageView().getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "100_100_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.k6.f21605a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void c0(StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.x51 x51Var) {
        int i10;
        CharSequence charSequence;
        boolean z4;
        int i11;
        int i12;
        int i13;
        int i14;
        String string;
        String str;
        int i15;
        ArrayList arrayList2 = stickersActivity.h;
        int i16 = stickersActivity.v;
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        org.telegram.ui.Components.i61 i61Var = stickersActivity.f34830a;
        if (i61Var == null || (!i61Var.Z2 && !stickersActivity.f34837s && stickersActivity.f34836r <= 0)) {
            if (i16 == 5) {
                ArrayList arrayList3 = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i16)));
                stickersActivity.f34838w = arrayList3;
                stickersActivity.f34833e = arrayList3;
            } else {
                stickersActivity.f34833e = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i16)));
            }
        }
        stickersActivity.f34834f = new ArrayList(stickersActivity.k0());
        int i17 = 0;
        int i18 = 0;
        while (i18 < stickersActivity.f34834f.size()) {
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.f34834f.get(i18)).set.f20870id))) {
                stickersActivity.f34834f.remove(i18);
                i18--;
            }
            i18++;
        }
        int size = stickersActivity.f34834f.size();
        int archivedStickersCount = mediaDataController.getArchivedStickersCount(i16);
        int size2 = mediaDataController.getStickerSets(5).size();
        if (i16 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            int i19 = R.drawable.msg2_trending;
            String string2 = LocaleController.getString(R.string.FeaturedStickers);
            String str2 = "";
            if (size <= 0) {
                str = "";
            } else {
                str = LocaleController.formatNumber(size, ',');
            }
            arrayList.add(org.telegram.ui.Components.j51.d(1, i19, string2, str));
            if (archivedStickersCount > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i16 == 0) {
                    arrayList.add(org.telegram.ui.Components.j51.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
                } else {
                    if (i16 == 5) {
                        i15 = R.string.ArchivedEmojiPacks;
                    } else {
                        i15 = R.string.ArchivedMasks;
                    }
                    arrayList.add(org.telegram.ui.Components.j51.f(LocaleController.getString(i15), LocaleController.formatNumber(archivedStickersCount, ','), 2));
                }
            }
            arrayList.size();
            int i20 = R.drawable.msg2_smile_status;
            String string3 = LocaleController.getString(R.string.Emoji);
            if (size2 > 0) {
                str2 = LocaleController.formatNumber(size2, ',');
            }
            org.telegram.ui.Components.j51 j51Var = new org.telegram.ui.Components.j51(43);
            j51Var.d = 3;
            j51Var.f28013k = i20;
            j51Var.f28014l = string3;
            j51Var.f28015m = str2;
            arrayList.add(j51Var);
        } else if (archivedStickersCount > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i16 == 0) {
                arrayList.add(org.telegram.ui.Components.j51.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
            } else {
                if (i16 == 5) {
                    i10 = R.string.ArchivedEmojiPacks;
                } else {
                    i10 = R.string.ArchivedMasks;
                }
                arrayList.add(org.telegram.ui.Components.j51.f(LocaleController.getString(i10), LocaleController.formatNumber(archivedStickersCount, ','), 2));
            }
            if (i16 == 1) {
                yh.A(R.string.ArchivedMasksInfo, arrayList);
            }
        }
        if (i16 == 0) {
            arrayList.size();
            int i21 = R.drawable.msg2_reactions2;
            String string4 = LocaleController.getString(R.string.DoubleTapSetting);
            org.telegram.ui.Components.j51 j51Var2 = new org.telegram.ui.Components.j51(43);
            j51Var2.d = 4;
            j51Var2.f28013k = i21;
            j51Var2.f28014l = string4;
            j51Var2.F = new w3(stickersActivity, 19);
            arrayList.add(j51Var2);
            if (i16 == 5) {
                i14 = R.string.EmojiBotInfo;
            } else {
                i14 = R.string.StickersBotInfo;
            }
            arrayList.add(org.telegram.ui.Components.j51.B(stickersActivity.h0(LocaleController.getString(i14))));
            arrayList.add(org.telegram.ui.Components.j51.t(LocaleController.getString(R.string.StickersSettings)));
            stickersActivity.suggestRow = arrayList.size();
            String string5 = LocaleController.getString(R.string.SuggestStickers);
            int i22 = SharedConfig.suggestStickers;
            if (i22 != 0) {
                if (i22 != 1) {
                    string = LocaleController.getString(R.string.SuggestStickersNone);
                } else {
                    string = LocaleController.getString(R.string.SuggestStickersInstalled);
                }
            } else {
                string = LocaleController.getString(R.string.SuggestStickersAll);
            }
            org.telegram.ui.Components.j51 j51Var3 = new org.telegram.ui.Components.j51(43);
            j51Var3.d = 5;
            j51Var3.f28014l = string5;
            j51Var3.f28015m = string;
            arrayList.add(j51Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.j51 i23 = org.telegram.ui.Components.j51.i(6, LocaleController.getString(R.string.LargeEmoji));
            i23.K(SharedConfig.allowBigEmoji);
            arrayList.add(i23);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.j51 i24 = org.telegram.ui.Components.j51.i(7, LocaleController.getString(R.string.DynamicPackOrder));
            i24.K(SharedConfig.updateStickersOrderOnSend);
            arrayList.add(i24);
            yh.A(R.string.DynamicPackOrderInfo, arrayList);
        }
        if (i16 == 5) {
            org.telegram.ui.Components.j51 i25 = org.telegram.ui.Components.j51.i(9, LocaleController.getString(R.string.SuggestAnimatedEmoji));
            i25.K(SharedConfig.suggestAnimatedEmoji);
            arrayList.add(i25);
            yh.A(R.string.SuggestAnimatedEmojiInfo, arrayList);
        }
        if (stickersActivity.f34833e.size() > 0) {
            x51Var.U();
            if (i16 == 5 || (!stickersActivity.f34834f.isEmpty() && i16 == 0)) {
                if (i16 == 5) {
                    i13 = R.string.ChooseStickerMyEmojiPacks;
                } else {
                    i13 = R.string.ChooseStickerMyStickerSets;
                }
                yh.r(i13, arrayList);
            }
            x51Var.M();
            ArrayList arrayList4 = stickersActivity.f34833e;
            int i26 = 0;
            for (int size3 = arrayList4.size(); i26 < size3; size3 = size3) {
                Object obj = arrayList4.get(i26);
                i26++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i27 = org.telegram.ui.Cells.j8.f23029a;
                org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(org.telegram.ui.Cells.j8.class);
                J.G = tL_messages_stickerSet;
                J.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f38097b;

                    {
                        this.f38097b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f38097b;
                                    org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(stickersActivity2, k8Var);
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.Y(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.Y(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new w01(15, stickersActivity2, k8Var), false);
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.Y(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.m(!stickersSet.set.official, R.drawable.msg_delete, LocaleController.getString(R.string.StickersRemove), true, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.Y(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    });
                                    H.S = 190;
                                    H.Z();
                                    return;
                                }
                                return;
                            case 1:
                                StickersActivity.Z(this.f38097b, view);
                                return;
                            default:
                                StickersActivity.X(this.f38097b, view);
                                return;
                        }
                    }
                };
                J.E = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f38097b;

                    {
                        this.f38097b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f38097b;
                                    org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(stickersActivity2, k8Var);
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.Y(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.Y(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new w01(15, stickersActivity2, k8Var), false);
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.Y(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.m(!stickersSet.set.official, R.drawable.msg_delete, LocaleController.getString(R.string.StickersRemove), true, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.Y(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    });
                                    H.S = 190;
                                    H.Z();
                                    return;
                                }
                                return;
                            case 1:
                                StickersActivity.Z(this.f38097b, view);
                                return;
                            default:
                                StickersActivity.X(this.f38097b, view);
                                return;
                        }
                    }
                };
                J.K(stickersActivity.f34839x.contains(Long.valueOf(tL_messages_stickerSet.set.f20870id)));
                arrayList.add(J);
            }
            charSequence = null;
            x51Var.L();
            x51Var.T();
            if (i16 != 1 && i16 != 5) {
                arrayList.add(org.telegram.ui.Components.j51.B(null));
            } else if (i16 == 1) {
                yh.A(R.string.MasksInfo, arrayList);
            }
        } else {
            charSequence = null;
        }
        if (stickersActivity.f34834f.size() > 3) {
            stickersActivity.f34834f = new ArrayList(stickersActivity.f34834f.subList(0, 3));
            z4 = true;
        } else {
            z4 = false;
        }
        if (i16 == 5 && !stickersActivity.f34834f.isEmpty()) {
            if (stickersActivity.f34833e.size() > 0) {
                arrayList.add(org.telegram.ui.Components.j51.B(charSequence));
            }
            if (i16 == 5) {
                i12 = R.string.FeaturedEmojiPacks;
            } else {
                i12 = R.string.FeaturedStickers;
            }
            yh.r(i12, arrayList);
            ArrayList arrayList5 = stickersActivity.f34834f;
            int size4 = arrayList5.size();
            while (i17 < size4) {
                Object obj2 = arrayList5.get(i17);
                i17++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i28 = org.telegram.ui.Cells.n3.f23205a;
                org.telegram.ui.Components.j51 J2 = org.telegram.ui.Components.j51.J(org.telegram.ui.Cells.n3.class);
                J2.G = stickerSetCovered;
                J2.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f38097b;

                    {
                        this.f38097b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f38097b;
                                    org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(stickersActivity2, k8Var);
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.Y(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.Y(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new w01(15, stickersActivity2, k8Var), false);
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.Y(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.m(!stickersSet.set.official, R.drawable.msg_delete, LocaleController.getString(R.string.StickersRemove), true, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.Y(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    });
                                    H.S = 190;
                                    H.Z();
                                    return;
                                }
                                return;
                            case 1:
                                StickersActivity.Z(this.f38097b, view);
                                return;
                            default:
                                StickersActivity.X(this.f38097b, view);
                                return;
                        }
                    }
                };
                J2.f28022t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.f20870id));
                arrayList.add(J2);
            }
            if (z4) {
                org.telegram.ui.Components.j51 c3 = org.telegram.ui.Components.j51.c(8, R.drawable.msg2_trending, LocaleController.getString(R.string.ShowMoreEmojiPacks));
                c3.f28019q = true;
                arrayList.add(c3);
            }
        }
        if (i16 == 5) {
            if (i16 == 5) {
                i11 = R.string.EmojiBotInfo;
            } else {
                i11 = R.string.StickersBotInfo;
            }
            arrayList.add(org.telegram.ui.Components.j51.B(stickersActivity.h0(LocaleController.getString(i11))));
        }
    }

    public static void d0(StickersActivity stickersActivity, int i10) {
        StickersActivity stickersActivity2;
        int i11;
        String string;
        TextView textView;
        int i12 = 0;
        if (i10 == 2) {
            StringBuilder sb = new StringBuilder();
            int size = stickersActivity.f34833e.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.f34833e.get(i13);
                if (stickersActivity.f34839x.contains(Long.valueOf(tL_messages_stickerSet.set.f20870id))) {
                    if (sb.length() != 0) {
                        sb.append("\n");
                    }
                    sb.append(stickersActivity.l0(tL_messages_stickerSet));
                }
            }
            String sb2 = sb.toString();
            org.telegram.ui.Components.mq0 N0 = org.telegram.ui.Components.mq0.N0(stickersActivity.fragmentView.getContext(), null, sb2, false, sb2);
            N0.f29215p0 = new qv0(stickersActivity, 2);
            N0.show();
        } else if (i10 == 0 || i10 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.f34839x.size());
            int size2 = stickersActivity.f34833e.size();
            for (int i14 = 0; i14 < size2; i14++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.f34833e.get(i14);
                if (stickersActivity.f34839x.contains(Long.valueOf(tL_messages_stickerSet2.set.f20870id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i10 == 1) {
                        alertDialog$Builder.f21166a.O = LocaleController.formatString(R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.f21166a.Q = LocaleController.formatString(R.string.DeleteStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Delete);
                    } else {
                        alertDialog$Builder.f21166a.O = LocaleController.formatString(R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.f21166a.Q = LocaleController.formatString(R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Archive);
                    }
                    alertDialog$Builder.k(string, new e3.d(stickersActivity, arrayList, i10, 14));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                    stickersActivity.showDialog(d2Var);
                    if (i10 == 1 && (textView = (TextView) d2Var.d(-1)) != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
                        return;
                    }
                    return;
                }
                int size4 = stickersActivity.f34833e.size();
                while (true) {
                    if (i12 < size4) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.f34833e.get(i12);
                        if (stickersActivity.f34839x.contains(Long.valueOf(tL_messages_stickerSet3.set.f20870id))) {
                            if (i10 == 0) {
                                MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
                                Activity parentActivity = stickersActivity.getParentActivity();
                                if (!tL_messages_stickerSet3.set.archived) {
                                    i11 = 1;
                                } else {
                                    i11 = 2;
                                }
                                stickersActivity2 = stickersActivity;
                                mediaDataController.toggleStickerSet(parentActivity, tL_messages_stickerSet3, i11, stickersActivity2, true, true);
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
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                } else if (i10 == 3) {
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.l0(tL_messages_stickerSet3)));
                                        org.telegram.ui.Components.qc.j(stickersActivity2).j();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                } else if (i10 == 4) {
                                    HashSet hashSet = stickersActivity2.f34839x;
                                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20870id))) {
                                        hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.f20870id));
                                    } else {
                                        hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20870id));
                                    }
                                    stickersActivity2.f34830a.V2.N(true);
                                    stickersActivity2.i0();
                                }
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        stickersActivity2 = stickersActivity;
                        break;
                    }
                }
                stickersActivity2.j0();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.v;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.StickersName));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Masks));
        } else if (i10 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Emoji));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 19));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f34832c = numberTextView;
        numberTextView.setTextSize(18);
        this.f34832c.setTypeface(AndroidUtilities.bold());
        this.f34832c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22038y8, false));
        j10.addView(this.f34832c, k7.c6.m(1.0f, 0, -1, 72, 0, 0));
        this.f34832c.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        j10.g(2, R.drawable.msg_share, AndroidUtilities.dp(54.0f));
        j10.g(0, R.drawable.msg_archive, AndroidUtilities.dp(54.0f));
        this.f34835n = j10.g(1, R.drawable.msg_delete, AndroidUtilities.dp(54.0f));
        if (i10 == 5 && (arrayList = this.f34838w) != null) {
            this.f34833e = arrayList;
        } else {
            this.f34833e = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(i10)));
        }
        this.f34834f = k0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        org.telegram.ui.Components.i61 i61Var = new org.telegram.ui.Components.i61(this, new Utilities.Callback2(this) {
            public final StickersActivity f38698b;

            {
                this.f38698b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.c0(this.f38698b, (ArrayList) obj, (org.telegram.ui.Components.x51) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.V(this.f38698b, (ArrayList) obj2);
                        return;
                }
            }
        }, new ma1(this), new ma1(this));
        this.f34830a = i61Var;
        i61Var.p1();
        this.actionBar.setAdaptiveBackground(this.f34830a);
        this.f34830a.setFocusable(true);
        this.f34830a.setTag(7);
        this.f34830a.B1(new Utilities.Callback2(this) {
            public final StickersActivity f38698b;

            {
                this.f38698b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.c0(this.f38698b, (ArrayList) obj, (org.telegram.ui.Components.x51) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.V(this.f38698b, (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        cr crVar = new cr(this, 6);
        this.f34831b = crVar;
        crVar.j1(1);
        this.f34830a.setLayoutManager(this.f34831b);
        frameLayout.addView(this.f34830a, k7.c6.c(-1.0f, -1));
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
            this.f34830a.V2.N(true);
        } else if (i10 != NotificationCenter.featuredStickersDidLoad && i10 != NotificationCenter.featuredEmojiDidLoad) {
            if (i10 == NotificationCenter.archivedStickersCountDidLoad && ((Integer) objArr[0]).intValue() == i13) {
                this.f34830a.V2.N(true);
            }
        } else {
            this.f34830a.V2.N(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 16, new Class[]{org.telegram.ui.Cells.k8.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.s8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.f22038y8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 512, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.k6.f22000w8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.k6.f22019x8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.k6.f22055z8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34832c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 2, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22053z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 196608, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Vh));
        int i13 = org.telegram.ui.ActionBar.k6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"reorderButton"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 8192, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34830a, 16384, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21786k7));
        org.telegram.ui.Components.r41 r41Var = this.d;
        if (r41Var != null) {
            arrayList.addAll(r41Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final CharSequence h0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.h4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        return str;
    }

    public final void i0() {
        HashSet hashSet = this.f34839x;
        int size = hashSet.size();
        boolean s6 = this.actionBar.s();
        int i10 = 0;
        if (size > 0) {
            if (hashSet.size() > 0) {
                ArrayList arrayList = this.f34833e;
                int size2 = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.f20870id))) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet.official && !stickerSet.emojis) {
                            i10 = 8;
                            break;
                        }
                    }
                }
                if (this.f34835n.getVisibility() != i10) {
                    this.f34835n.setVisibility(i10);
                }
            }
            this.f34832c.a(size, s6);
            if (!s6) {
                this.actionBar.O(null, null);
                this.f34830a.w1(true);
                if (!SharedConfig.stickersReorderingHintUsed && this.v != 5) {
                    SharedConfig.setStickersReorderingHintUsed(true);
                    org.telegram.ui.Components.ic.g(this, new org.telegram.ui.Components.xl0(getParentActivity(), LocaleController.getString(R.string.StickersReorderHint)), 3250).j();
                }
            }
        } else if (s6) {
            this.actionBar.r();
            this.f34830a.w1(false);
            m0();
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        this.f34839x.clear();
        this.f34830a.V2.N(true);
        i0();
    }

    public final ArrayList k0() {
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.v == 5) {
            ArrayList arrayList = new ArrayList(mediaDataController.getFeaturedEmojiSets());
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (arrayList.get(i10) == null || mediaDataController.isStickerPackInstalled(((TLRPC.StickerSetCovered) arrayList.get(i10)).set.f20870id, false)) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
            return arrayList;
        }
        return mediaDataController.getFeaturedStickerSets();
    }

    public final String l0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        String str;
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb.append("/");
        if (tL_messages_stickerSet.set.emojis) {
            str = "addemoji";
        } else {
            str = "addstickers";
        }
        return String.format(locale, android.support.v4.media.a.r(sb, str, "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void m0() {
        boolean z4;
        boolean z10;
        if (this.f34837s) {
            this.f34837s = false;
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            int i10 = this.v;
            mediaDataController.calcNewHash(i10);
            this.f34836r++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            if (i10 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            tL_messages_reorderStickerSets.masks = z4;
            if (i10 == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_reorderStickerSets.emojis = z10;
            int i11 = 0;
            while (i11 < this.f34833e.size()) {
                i11 = android.support.v4.media.a.g(((TLRPC.TL_messages_stickerSet) this.f34833e.get(i11)).set.f20870id, tL_messages_reorderStickerSets.order, i11, 1);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new o(this, 21));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                org.telegram.ui.Components.qc.a0(this).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
                this.f34830a.V2.N(true);
            }
        }
    }

    public final void n0(org.telegram.ui.Cells.k8 k8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.f20870id);
        HashSet hashSet = this.f34839x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.f20870id));
            k8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.f20870id));
            k8Var.b(true, true);
        }
        this.f34830a.V2.N(true);
        i0();
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (!this.f34839x.isEmpty()) {
            if (z4) {
                j0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
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
        this.f34830a.setPadding(0, 0, 0, i13);
        this.f34830a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.i61 i61Var = this.f34830a;
        if (i61Var != null) {
            i61Var.V2.N(true);
        }
    }
}
