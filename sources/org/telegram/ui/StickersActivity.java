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
public class StickersActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.i51 f36186a;
    private int archivedRow;
    public of.g0 f36187b;
    public NumberTextView f36188c;
    public org.telegram.ui.Components.t31 d;
    private int dynamicPackOrder;
    public ArrayList f36189e;
    public ArrayList f36190f;
    private int featuredRow;
    public final ArrayList h;
    private int largeEmojiRow;
    public org.telegram.ui.ActionBar.w0 f36191n;
    public int f36192r;
    public boolean f36193s;
    private int suggestRow;
    public final int v;
    public ArrayList f36194w;
    public final HashSet f36195x;
    public final t91 f36196y;

    public StickersActivity(int i9, ArrayList arrayList) {
        super(null);
        this.h = new ArrayList();
        this.f36195x = new HashSet();
        this.f36196y = new t91(this, 0);
        this.v = i9;
        this.f36194w = arrayList;
    }

    public static void T(StickersActivity stickersActivity, org.telegram.ui.Components.l41 l41Var, View view) {
        boolean z10;
        boolean z11;
        int i9 = stickersActivity.v;
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (stickersActivity.f36195x.isEmpty()) {
                ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
                if (arrayList != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null && stickerSet.emojis) {
                        ArrayList arrayList2 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.f22400id = stickerSet2.f22407id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        arrayList2.add(tL_inputStickerSetID);
                        stickersActivity.showDialog(new org.telegram.ui.Components.dv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
                        return;
                    }
                    stickersActivity.showDialog(new org.telegram.ui.Components.cx0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                    return;
                }
                return;
            }
            stickersActivity.m0((org.telegram.ui.Cells.k8) view);
            return;
        }
        boolean z12 = true;
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.f22400id = stickerSet3.f22407id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i9 == 5) {
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(tL_inputStickerSetID2);
                stickersActivity.showDialog(new org.telegram.ui.Components.dv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
                return;
            }
            stickersActivity.showDialog(new org.telegram.ui.Components.cx0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
            return;
        }
        switch (l41Var.d) {
            case 1:
            case 8:
                if (i9 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList j02 = stickersActivity.j0();
                    if (j02 != null) {
                        for (int i10 = 0; i10 < j02.size(); i10++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) j02.get(i10);
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
                    stickersActivity.showDialog(new org.telegram.ui.Components.dv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    return;
                }
                org.telegram.ui.Components.t31 t31Var = new org.telegram.ui.Components.t31(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.h41(stickersActivity.getParentActivity(), new y91(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                stickersActivity.d = t31Var;
                t31Var.show();
                return;
            case 2:
                stickersActivity.presentFragment(new p(i9));
                return;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                return;
            case 4:
                stickersActivity.presentFragment(new h21());
                return;
            case 5:
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(stickersActivity, view);
                if (SharedConfig.suggestStickers == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.i(new xg(4, view), LocaleController.getString(R.string.SuggestStickersAll), z10);
                if (SharedConfig.suggestStickers == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.i(new xg(5, view), LocaleController.getString(R.string.SuggestStickersInstalled), z11);
                if (SharedConfig.suggestStickers != 2) {
                    z12 = false;
                }
                H.i(new xg(6, view), LocaleController.getString(R.string.SuggestStickersNone), z12);
                H.Z();
                return;
            case 6:
                SharedConfig.toggleBigEmoji();
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.allowBigEmoji);
                return;
            case 7:
                SharedConfig.toggleUpdateStickersOrderOnSend();
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.updateStickersOrderOnSend);
                return;
            case 9:
                SharedConfig.toggleSuggestAnimatedEmoji();
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.suggestAnimatedEmoji);
                return;
            default:
                return;
        }
    }

    public static void U(StickersActivity stickersActivity, ArrayList arrayList) {
        t91 t91Var = stickersActivity.f36196y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Object obj2 = ((org.telegram.ui.Components.l41) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.f36189e = arrayList2;
        stickersActivity.f36193s = true;
        Collections.sort(MediaDataController.getInstance(stickersActivity.currentAccount).getStickerSets(stickersActivity.v), new mt(stickersActivity, 3));
        AndroidUtilities.cancelRunOnUIThread(t91Var);
        AndroidUtilities.runOnUIThread(t91Var, 1000L);
    }

    public static void W(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.p3 p3Var = (org.telegram.ui.Cells.p3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = p3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.h;
        if (arrayList.contains(Long.valueOf(stickerSet.set.f22407id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.f22407id));
        p3Var.f24859e.a(true, true);
        if (p3Var.f24863s) {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    public static void X(StickersActivity stickersActivity, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i9;
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        Activity parentActivity = stickersActivity.getParentActivity();
        if (!tL_messages_stickerSet.set.archived) {
            i9 = 1;
        } else {
            i9 = 2;
        }
        mediaDataController.toggleStickerSet(parentActivity, tL_messages_stickerSet, i9, stickersActivity, true, true);
    }

    public static void Y(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.k8 k8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSetCovered stickerSetCovered2;
        ArrayList arrayList = stickersActivity.h;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof org.telegram.ui.Cells.k8) && (stickersSet = (k8Var = (org.telegram.ui.Cells.k8) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i9 = 0;
                if (k8Var.f24626y == view) {
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = stickersActivity.getMediaDataController().getFeaturedEmojiSets();
                    while (true) {
                        if (i9 < featuredEmojiSets.size()) {
                            if (stickersSet.set.f22407id == featuredEmojiSets.get(i9).set.f22407id) {
                                stickerSetCovered = featuredEmojiSets.get(i9);
                                break;
                            }
                            i9++;
                        } else {
                            stickerSetCovered = null;
                            break;
                        }
                    }
                    if (stickerSetCovered != null) {
                        if (!arrayList.contains(Long.valueOf(stickerSetCovered.set.f22407id))) {
                            arrayList.add(Long.valueOf(stickerSetCovered.set.f22407id));
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
                } else if (k8Var.A == view) {
                    MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                } else if (k8Var.B == view) {
                    stickersActivity.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) stickersActivity, 11, false));
                }
            }
        }
    }

    public static void Z(StickersActivity stickersActivity, ArrayList arrayList, int i9) {
        int i10;
        stickersActivity.i0();
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        int i11 = stickersActivity.v;
        if (i9 == 1) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        mediaDataController.toggleStickerSets(arrayList, i11, i10, stickersActivity, true);
    }

    public static void a0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.ba) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            String doubleTapReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getDoubleTapReaction();
            if (doubleTapReaction != null) {
                if (doubleTapReaction.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.k5 n10 = org.telegram.ui.Components.k5.n(stickersActivity.currentAccount, Long.parseLong(doubleTapReaction.substring(9)), null, 2);
                        n10.a(baVar.getValueBackupImageView());
                        baVar.getValueBackupImageView().setImageDrawable(n10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getReactionsMap().get(doubleTapReaction);
                if (tL_availableReaction != null) {
                    baVar.getValueBackupImageView().getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "100_100_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.f6.f22947a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void b0(StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.z41 z41Var) {
        int i9;
        CharSequence charSequence;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        String string;
        String str;
        int i14;
        ArrayList arrayList2 = stickersActivity.h;
        int i15 = stickersActivity.v;
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        org.telegram.ui.Components.i51 i51Var = stickersActivity.f36186a;
        if (i51Var == null || (!i51Var.Y2 && !stickersActivity.f36193s && stickersActivity.f36192r <= 0)) {
            if (i15 == 5) {
                ArrayList arrayList3 = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i15)));
                stickersActivity.f36194w = arrayList3;
                stickersActivity.f36189e = arrayList3;
            } else {
                stickersActivity.f36189e = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i15)));
            }
        }
        stickersActivity.f36190f = new ArrayList(stickersActivity.j0());
        int i16 = 0;
        int i17 = 0;
        while (i17 < stickersActivity.f36190f.size()) {
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.f36190f.get(i17)).set.f22407id))) {
                stickersActivity.f36190f.remove(i17);
                i17--;
            }
            i17++;
        }
        int size = stickersActivity.f36190f.size();
        int archivedStickersCount = mediaDataController.getArchivedStickersCount(i15);
        int size2 = mediaDataController.getStickerSets(5).size();
        if (i15 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            int i18 = R.drawable.msg2_trending;
            String string2 = LocaleController.getString(R.string.FeaturedStickers);
            String str2 = "";
            if (size <= 0) {
                str = "";
            } else {
                str = LocaleController.formatNumber(size, ',');
            }
            arrayList.add(org.telegram.ui.Components.l41.d(1, i18, string2, str));
            if (archivedStickersCount > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i15 == 0) {
                    arrayList.add(org.telegram.ui.Components.l41.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
                } else {
                    if (i15 == 5) {
                        i14 = R.string.ArchivedEmojiPacks;
                    } else {
                        i14 = R.string.ArchivedMasks;
                    }
                    arrayList.add(org.telegram.ui.Components.l41.f(LocaleController.getString(i14), LocaleController.formatNumber(archivedStickersCount, ','), 2));
                }
            }
            arrayList.size();
            int i19 = R.drawable.msg2_smile_status;
            String string3 = LocaleController.getString(R.string.Emoji);
            if (size2 > 0) {
                str2 = LocaleController.formatNumber(size2, ',');
            }
            org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(43);
            l41Var.d = 3;
            l41Var.f30338k = i19;
            l41Var.f30339l = string3;
            l41Var.f30340m = str2;
            arrayList.add(l41Var);
        } else if (archivedStickersCount > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i15 == 0) {
                arrayList.add(org.telegram.ui.Components.l41.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
            } else {
                if (i15 == 5) {
                    i9 = R.string.ArchivedEmojiPacks;
                } else {
                    i9 = R.string.ArchivedMasks;
                }
                arrayList.add(org.telegram.ui.Components.l41.f(LocaleController.getString(i9), LocaleController.formatNumber(archivedStickersCount, ','), 2));
            }
            if (i15 == 1) {
                org.telegram.ui.Cells.j2.y(R.string.ArchivedMasksInfo, arrayList);
            }
        }
        if (i15 == 0) {
            arrayList.size();
            int i20 = R.drawable.msg2_reactions2;
            String string4 = LocaleController.getString(R.string.DoubleTapSetting);
            org.telegram.ui.Components.l41 l41Var2 = new org.telegram.ui.Components.l41(43);
            l41Var2.d = 4;
            l41Var2.f30338k = i20;
            l41Var2.f30339l = string4;
            l41Var2.F = new w3(stickersActivity, 19);
            arrayList.add(l41Var2);
            if (i15 == 5) {
                i13 = R.string.EmojiBotInfo;
            } else {
                i13 = R.string.StickersBotInfo;
            }
            arrayList.add(org.telegram.ui.Components.l41.B(stickersActivity.g0(LocaleController.getString(i13))));
            arrayList.add(org.telegram.ui.Components.l41.t(LocaleController.getString(R.string.StickersSettings)));
            stickersActivity.suggestRow = arrayList.size();
            String string5 = LocaleController.getString(R.string.SuggestStickers);
            int i21 = SharedConfig.suggestStickers;
            if (i21 != 0) {
                if (i21 != 1) {
                    string = LocaleController.getString(R.string.SuggestStickersNone);
                } else {
                    string = LocaleController.getString(R.string.SuggestStickersInstalled);
                }
            } else {
                string = LocaleController.getString(R.string.SuggestStickersAll);
            }
            org.telegram.ui.Components.l41 l41Var3 = new org.telegram.ui.Components.l41(43);
            l41Var3.d = 5;
            l41Var3.f30339l = string5;
            l41Var3.f30340m = string;
            arrayList.add(l41Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.l41 i22 = org.telegram.ui.Components.l41.i(6, LocaleController.getString(R.string.LargeEmoji));
            i22.K(SharedConfig.allowBigEmoji);
            arrayList.add(i22);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.l41 i23 = org.telegram.ui.Components.l41.i(7, LocaleController.getString(R.string.DynamicPackOrder));
            i23.K(SharedConfig.updateStickersOrderOnSend);
            arrayList.add(i23);
            org.telegram.ui.Cells.j2.y(R.string.DynamicPackOrderInfo, arrayList);
        }
        if (i15 == 5) {
            org.telegram.ui.Components.l41 i24 = org.telegram.ui.Components.l41.i(9, LocaleController.getString(R.string.SuggestAnimatedEmoji));
            i24.K(SharedConfig.suggestAnimatedEmoji);
            arrayList.add(i24);
            org.telegram.ui.Cells.j2.y(R.string.SuggestAnimatedEmojiInfo, arrayList);
        }
        if (stickersActivity.f36189e.size() > 0) {
            z41Var.U();
            if (i15 == 5 || (!stickersActivity.f36190f.isEmpty() && i15 == 0)) {
                if (i15 == 5) {
                    i12 = R.string.ChooseStickerMyEmojiPacks;
                } else {
                    i12 = R.string.ChooseStickerMyStickerSets;
                }
                org.telegram.ui.Cells.j2.l(i12, arrayList);
            }
            z41Var.M();
            ArrayList arrayList4 = stickersActivity.f36189e;
            int i25 = 0;
            for (int size3 = arrayList4.size(); i25 < size3; size3 = size3) {
                Object obj = arrayList4.get(i25);
                i25++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i26 = org.telegram.ui.Cells.j8.f24576a;
                org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.j8.class);
                J.G = tL_messages_stickerSet;
                J.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f43201b;

                    {
                        this.f43201b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f43201b;
                                    org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(stickersActivity2, k8Var);
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
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
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new n21(10, stickersActivity2, k8Var), false);
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
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
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
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
                                StickersActivity.Y(this.f43201b, view);
                                return;
                            default:
                                StickersActivity.W(this.f43201b, view);
                                return;
                        }
                    }
                };
                J.E = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f43201b;

                    {
                        this.f43201b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f43201b;
                                    org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(stickersActivity2, k8Var);
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
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
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new n21(10, stickersActivity2, k8Var), false);
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
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
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
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
                                StickersActivity.Y(this.f43201b, view);
                                return;
                            default:
                                StickersActivity.W(this.f43201b, view);
                                return;
                        }
                    }
                };
                J.K(stickersActivity.f36195x.contains(Long.valueOf(tL_messages_stickerSet.set.f22407id)));
                arrayList.add(J);
            }
            charSequence = null;
            z41Var.L();
            z41Var.T();
            if (i15 != 1 && i15 != 5) {
                arrayList.add(org.telegram.ui.Components.l41.B(null));
            } else if (i15 == 1) {
                org.telegram.ui.Cells.j2.y(R.string.MasksInfo, arrayList);
            }
        } else {
            charSequence = null;
        }
        if (stickersActivity.f36190f.size() > 3) {
            stickersActivity.f36190f = new ArrayList(stickersActivity.f36190f.subList(0, 3));
            z10 = true;
        } else {
            z10 = false;
        }
        if (i15 == 5 && !stickersActivity.f36190f.isEmpty()) {
            if (stickersActivity.f36189e.size() > 0) {
                arrayList.add(org.telegram.ui.Components.l41.B(charSequence));
            }
            if (i15 == 5) {
                i11 = R.string.FeaturedEmojiPacks;
            } else {
                i11 = R.string.FeaturedStickers;
            }
            org.telegram.ui.Cells.j2.l(i11, arrayList);
            ArrayList arrayList5 = stickersActivity.f36190f;
            int size4 = arrayList5.size();
            while (i16 < size4) {
                Object obj2 = arrayList5.get(i16);
                i16++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i27 = org.telegram.ui.Cells.o3.f24827a;
                org.telegram.ui.Components.l41 J2 = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.o3.class);
                J2.G = stickerSetCovered;
                J2.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f43201b;

                    {
                        this.f43201b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f43201b;
                                    org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(stickersActivity2, k8Var);
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
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
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new n21(10, stickersActivity2, k8Var), false);
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
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
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
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
                                StickersActivity.Y(this.f43201b, view);
                                return;
                            default:
                                StickersActivity.W(this.f43201b, view);
                                return;
                        }
                    }
                };
                J2.f30347t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.f22407id));
                arrayList.add(J2);
            }
            if (z10) {
                org.telegram.ui.Components.l41 c10 = org.telegram.ui.Components.l41.c(8, R.drawable.msg2_trending, LocaleController.getString(R.string.ShowMoreEmojiPacks));
                c10.f30344q = true;
                arrayList.add(c10);
            }
        }
        if (i15 == 5) {
            if (i15 == 5) {
                i10 = R.string.EmojiBotInfo;
            } else {
                i10 = R.string.StickersBotInfo;
            }
            arrayList.add(org.telegram.ui.Components.l41.B(stickersActivity.g0(LocaleController.getString(i10))));
        }
    }

    public static void c0(StickersActivity stickersActivity, int i9) {
        StickersActivity stickersActivity2;
        int i10;
        String string;
        TextView textView;
        int i11 = 0;
        if (i9 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.f36189e.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.f36189e.get(i12);
                if (stickersActivity.f36195x.contains(Long.valueOf(tL_messages_stickerSet.set.f22407id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.k0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.rp0 N0 = org.telegram.ui.Components.rp0.N0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            N0.f32259o0 = new fv0(stickersActivity, 2);
            N0.show();
        } else if (i9 == 0 || i9 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.f36195x.size());
            int size2 = stickersActivity.f36189e.size();
            for (int i13 = 0; i13 < size2; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.f36189e.get(i13);
                if (stickersActivity.f36195x.contains(Long.valueOf(tL_messages_stickerSet2.set.f22407id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i9 == 1) {
                        alertDialog$Builder.f22702a.N = LocaleController.formatString(R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.f22702a.P = LocaleController.formatString(R.string.DeleteStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Delete);
                    } else {
                        alertDialog$Builder.f22702a.N = LocaleController.formatString(R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.f22702a.P = LocaleController.formatString(R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Archive);
                    }
                    alertDialog$Builder.k(string, new c3.e(stickersActivity, arrayList, i9, 15));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    stickersActivity.showDialog(c2Var);
                    if (i9 == 1 && (textView = (TextView) c2Var.d(-1)) != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                        return;
                    }
                    return;
                }
                int size4 = stickersActivity.f36189e.size();
                while (true) {
                    if (i11 < size4) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.f36189e.get(i11);
                        if (stickersActivity.f36195x.contains(Long.valueOf(tL_messages_stickerSet3.set.f22407id))) {
                            if (i9 == 0) {
                                MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
                                Activity parentActivity = stickersActivity.getParentActivity();
                                if (!tL_messages_stickerSet3.set.archived) {
                                    i10 = 1;
                                } else {
                                    i10 = 2;
                                }
                                stickersActivity2 = stickersActivity;
                                mediaDataController.toggleStickerSet(parentActivity, tL_messages_stickerSet3, i10, stickersActivity2, true, true);
                            } else {
                                stickersActivity2 = stickersActivity;
                                if (i9 == 1) {
                                    MediaDataController.getInstance(stickersActivity2.currentAccount).toggleStickerSet(stickersActivity2.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity2, true, true);
                                } else if (i9 == 2) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity2.k0(tL_messages_stickerSet3));
                                        stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                } else if (i9 == 3) {
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.k0(tL_messages_stickerSet3)));
                                        org.telegram.ui.Components.oc.j(stickersActivity2).j();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                } else if (i9 == 4) {
                                    HashSet hashSet = stickersActivity2.f36195x;
                                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f22407id))) {
                                        hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.f22407id));
                                    } else {
                                        hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f22407id));
                                    }
                                    stickersActivity2.f36186a.U2.N(true);
                                    stickersActivity2.h0();
                                }
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        stickersActivity2 = stickersActivity;
                        break;
                    }
                }
                stickersActivity2.i0();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        int i9 = this.v;
        if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.StickersName));
        } else if (i9 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Masks));
        } else if (i9 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Emoji));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 27));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f36188c = numberTextView;
        numberTextView.setTextSize(18);
        this.f36188c.setTypeface(AndroidUtilities.bold());
        this.f36188c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23371y8, false));
        j10.addView(this.f36188c, g7.e6.m(1.0f, 0, -1, 72, 0, 0));
        this.f36188c.setOnTouchListener(new jh.d(2));
        j10.g(2, R.drawable.msg_share, AndroidUtilities.dp(54.0f));
        j10.g(0, R.drawable.msg_archive, AndroidUtilities.dp(54.0f));
        this.f36191n = j10.g(1, R.drawable.msg_delete, AndroidUtilities.dp(54.0f));
        if (i9 == 5 && (arrayList = this.f36194w) != null) {
            this.f36189e = arrayList;
        } else {
            this.f36189e = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(i9)));
        }
        this.f36190f = j0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(this, new Utilities.Callback2(this) {
            public final StickersActivity f43714b;

            {
                this.f43714b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.b0(this.f43714b, (ArrayList) obj, (org.telegram.ui.Components.z41) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.U(this.f43714b, (ArrayList) obj2);
                        return;
                }
            }
        }, new x91(this), new x91(this));
        this.f36186a = i51Var;
        i51Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36186a);
        this.f36186a.setFocusable(true);
        this.f36186a.setTag(7);
        this.f36186a.B1(new Utilities.Callback2(this) {
            public final StickersActivity f43714b;

            {
                this.f43714b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.b0(this.f43714b, (ArrayList) obj, (org.telegram.ui.Components.z41) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.U(this.f43714b, (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        of.g0 g0Var = new of.g0(this, 7);
        this.f36187b = g0Var;
        g0Var.j1(1);
        this.f36186a.setLayoutManager(this.f36187b);
        frameLayout.addView(this.f36186a, g7.e6.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.stickersDidLoad;
        int i12 = this.v;
        if (i9 == i11) {
            if (((Integer) objArr[0]).intValue() == i12) {
                this.h.clear();
            }
            this.f36186a.U2.N(true);
        } else if (i9 != NotificationCenter.featuredStickersDidLoad && i9 != NotificationCenter.featuredEmojiDidLoad) {
            if (i9 == NotificationCenter.archivedStickersCountDidLoad && ((Integer) objArr[0]).intValue() == i12) {
                this.f36186a.U2.N(true);
            }
        } else {
            this.f36186a.U2.N(true);
        }
    }

    public final CharSequence g0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return str;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 16, new Class[]{org.telegram.ui.Cells.k8.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.t8.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.f23371y8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 512, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.f6.w8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.f6.f23353x8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.f6.f23388z8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36188c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 2, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 196608, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vh));
        int i12 = org.telegram.ui.ActionBar.f6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"reorderButton"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 8192, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"checkBox"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36186a, 16384, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23128k7));
        org.telegram.ui.Components.t31 t31Var = this.d;
        if (t31Var != null) {
            arrayList.addAll(t31Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        HashSet hashSet = this.f36195x;
        int size = hashSet.size();
        boolean s10 = this.actionBar.s();
        int i9 = 0;
        if (size > 0) {
            if (hashSet.size() > 0) {
                ArrayList arrayList = this.f36189e;
                int size2 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        break;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.f22407id))) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet.official && !stickerSet.emojis) {
                            i9 = 8;
                            break;
                        }
                    }
                }
                if (this.f36191n.getVisibility() != i9) {
                    this.f36191n.setVisibility(i9);
                }
            }
            this.f36188c.a(size, s10);
            if (!s10) {
                this.actionBar.N(null, null);
                this.f36186a.w1(true);
                if (!SharedConfig.stickersReorderingHintUsed && this.v != 5) {
                    SharedConfig.setStickersReorderingHintUsed(true);
                    org.telegram.ui.Components.gc.g(this, new org.telegram.ui.Components.zk0(getParentActivity(), LocaleController.getString(R.string.StickersReorderHint)), 3250).j();
                }
            }
        } else if (s10) {
            this.actionBar.r();
            this.f36186a.w1(false);
            l0();
        }
    }

    public final void i0() {
        this.f36195x.clear();
        this.f36186a.U2.N(true);
        h0();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final ArrayList j0() {
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.v == 5) {
            ArrayList arrayList = new ArrayList(mediaDataController.getFeaturedEmojiSets());
            int i9 = 0;
            while (i9 < arrayList.size()) {
                if (arrayList.get(i9) == null || mediaDataController.isStickerPackInstalled(((TLRPC.StickerSetCovered) arrayList.get(i9)).set.f22407id, false)) {
                    arrayList.remove(i9);
                    i9--;
                }
                i9++;
            }
            return arrayList;
        }
        return mediaDataController.getFeaturedStickerSets();
    }

    public final String k0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        String str;
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb2.append("/");
        if (tL_messages_stickerSet.set.emojis) {
            str = "addemoji";
        } else {
            str = "addstickers";
        }
        return String.format(locale, aa.d.r(sb2, str, "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void l0() {
        boolean z10;
        boolean z11;
        if (this.f36193s) {
            this.f36193s = false;
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            int i9 = this.v;
            mediaDataController.calcNewHash(i9);
            this.f36192r++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            if (i9 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_reorderStickerSets.masks = z10;
            if (i9 == 5) {
                z11 = true;
            } else {
                z11 = false;
            }
            tL_messages_reorderStickerSets.emojis = z11;
            int i10 = 0;
            while (i10 < this.f36189e.size()) {
                i10 = aa.d.g(((TLRPC.TL_messages_stickerSet) this.f36189e.get(i10)).set.f22407id, tL_messages_reorderStickerSets.order, i10, 1);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new m(this, 21));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i9), Boolean.TRUE);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                org.telegram.ui.Components.oc.a0(this).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
                this.f36186a.U2.N(true);
            }
        }
    }

    public final void m0(org.telegram.ui.Cells.k8 k8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.f22407id);
        HashSet hashSet = this.f36195x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.f22407id));
            k8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.f22407id));
            k8Var.b(true, true);
        }
        this.f36186a.U2.N(true);
        h0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f36195x.isEmpty()) {
            if (z10) {
                i0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        int i9 = this.v;
        mediaDataController.checkStickers(i9);
        if (i9 == 0) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
            MediaDataController.getInstance(this.currentAccount).checkStickers(1);
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
        } else if (i9 == 6) {
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
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f36186a.setPadding(0, 0, 0, i12);
        this.f36186a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.i51 i51Var = this.f36186a;
        if (i51Var != null) {
            i51Var.U2.N(true);
        }
    }
}
