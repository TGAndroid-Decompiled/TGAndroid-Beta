package org.telegram.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
public class StickersActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.r71 f36223a;
    private int archivedRow;
    public ig.j0 f36224b;
    public org.telegram.ui.Components.b61 f36225c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList e;
    public final ArrayList f36226f;
    private int featuredRow;
    public org.telegram.ui.ActionBar.y5 h;
    private int largeEmojiRow;
    public int f36227n;
    public boolean f36228r;
    public final int f36229s;
    private int suggestRow;
    public ArrayList v;
    public final HashSet f36230w;
    public final x91 f36231x;

    public StickersActivity(int i10, ArrayList arrayList) {
        super(null);
        this.f36226f = new ArrayList();
        this.f36230w = new HashSet();
        this.f36231x = new x91(this, 0);
        this.f36229s = i10;
        this.v = arrayList;
    }

    public static void V(StickersActivity stickersActivity, org.telegram.ui.Components.t61 t61Var, View view) {
        boolean z10;
        boolean z11;
        int i10 = stickersActivity.f36229s;
        Object obj = t61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (stickersActivity.f36230w.isEmpty()) {
                ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
                if (arrayList != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null && stickerSet.emojis) {
                        ArrayList arrayList2 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.f22047id = stickerSet2.f22054id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        arrayList2.add(tL_inputStickerSetID);
                        stickersActivity.showDialog(new org.telegram.ui.Components.aw(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
                        return;
                    }
                    stickersActivity.showDialog(new org.telegram.ui.Components.cz0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                    return;
                }
                return;
            }
            stickersActivity.o0((org.telegram.ui.Cells.p8) view);
            return;
        }
        boolean z12 = true;
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.f22047id = stickerSet3.f22054id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i10 == 5) {
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(tL_inputStickerSetID2);
                stickersActivity.showDialog(new org.telegram.ui.Components.aw(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
                return;
            }
            stickersActivity.showDialog(new org.telegram.ui.Components.cz0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
            return;
        }
        switch (t61Var.d) {
            case 1:
            case 8:
                if (i10 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList l02 = stickersActivity.l0();
                    if (l02 != null) {
                        for (int i11 = 0; i11 < l02.size(); i11++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) l02.get(i11);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.f22047id = stickerSet4.f22054id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    MediaDataController.getInstance(stickersActivity.currentAccount).markFeaturedStickersAsRead(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.aw(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    return;
                }
                org.telegram.ui.Components.b61 b61Var = new org.telegram.ui.Components.b61(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.p61(stickersActivity.getParentActivity(), new ca1(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                stickersActivity.f36225c = b61Var;
                b61Var.show();
                return;
            case 2:
                stickersActivity.presentFragment(new o(i10));
                return;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                return;
            case 4:
                stickersActivity.presentFragment(new g21());
                return;
            case 5:
                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(stickersActivity, view);
                if (SharedConfig.suggestStickers == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.i(new dh(5, view), LocaleController.getString(R.string.SuggestStickersAll), z10);
                if (SharedConfig.suggestStickers == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.i(new dh(6, view), LocaleController.getString(R.string.SuggestStickersInstalled), z11);
                if (SharedConfig.suggestStickers != 2) {
                    z12 = false;
                }
                H.i(new dh(7, view), LocaleController.getString(R.string.SuggestStickersNone), z12);
                H.Z();
                return;
            case 6:
                SharedConfig.toggleBigEmoji();
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.allowBigEmoji);
                return;
            case 7:
                SharedConfig.toggleUpdateStickersOrderOnSend();
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.updateStickersOrderOnSend);
                return;
            case 9:
                SharedConfig.toggleSuggestAnimatedEmoji();
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.suggestAnimatedEmoji);
                return;
            default:
                return;
        }
    }

    public static void W(StickersActivity stickersActivity, ArrayList arrayList) {
        x91 x91Var = stickersActivity.f36231x;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Object obj2 = ((org.telegram.ui.Components.t61) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.d = arrayList2;
        stickersActivity.f36228r = true;
        Collections.sort(MediaDataController.getInstance(stickersActivity.currentAccount).getStickerSets(stickersActivity.f36229s), new kt(stickersActivity, 3));
        AndroidUtilities.cancelRunOnUIThread(x91Var);
        AndroidUtilities.runOnUIThread(x91Var, 1000L);
    }

    public static void X(StickersActivity stickersActivity, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
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
        org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = m3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.f36226f;
        if (arrayList.contains(Long.valueOf(stickerSet.set.f22054id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.f22054id));
        m3Var.f24438f.a(true, true);
        if (m3Var.v) {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    public static void a0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.p8 p8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSetCovered stickerSetCovered2;
        ArrayList arrayList = stickersActivity.f36226f;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof org.telegram.ui.Cells.p8) && (stickersSet = (p8Var = (org.telegram.ui.Cells.p8) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i10 = 0;
                if (p8Var.f24779y == view) {
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = stickersActivity.getMediaDataController().getFeaturedEmojiSets();
                    while (true) {
                        if (i10 < featuredEmojiSets.size()) {
                            if (stickersSet.set.f22054id == featuredEmojiSets.get(i10).set.f22054id) {
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
                        if (!arrayList.contains(Long.valueOf(stickerSetCovered.set.f22054id))) {
                            arrayList.add(Long.valueOf(stickerSetCovered.set.f22054id));
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
                } else if (p8Var.E == view) {
                    MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                } else if (p8Var.F == view) {
                    stickersActivity.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) stickersActivity, 11, false));
                }
            }
        }
    }

    public static void b0(StickersActivity stickersActivity, ArrayList arrayList, int i10) {
        stickersActivity.k0();
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        int i11 = stickersActivity.f36229s;
        int i12 = 1;
        if (i10 == 1) {
            i12 = 0;
        }
        mediaDataController.toggleStickerSets(arrayList, i11, i12, stickersActivity, true);
    }

    public static void c0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.ga) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            String doubleTapReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getDoubleTapReaction();
            if (doubleTapReaction != null) {
                if (doubleTapReaction.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.t5 n10 = org.telegram.ui.Components.t5.n(stickersActivity.currentAccount, Long.parseLong(doubleTapReaction.substring(9)), null, 2);
                        n10.a(gaVar.getValueBackupImageView());
                        gaVar.getValueBackupImageView().setImageDrawable(n10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getReactionsMap().get(doubleTapReaction);
                if (tL_availableReaction != null) {
                    gaVar.getValueBackupImageView().getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "100_100_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.y6.f23299a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void d0(StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.j71 j71Var) {
        int i10;
        CharSequence charSequence;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        String string;
        String str;
        int i15;
        ArrayList arrayList2 = stickersActivity.f36226f;
        int i16 = stickersActivity.f36229s;
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        org.telegram.ui.Components.r71 r71Var = stickersActivity.f36223a;
        if (r71Var == null || (!r71Var.f32156k3 && !stickersActivity.f36228r && stickersActivity.f36227n <= 0)) {
            if (i16 == 5) {
                ArrayList arrayList3 = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i16)));
                stickersActivity.v = arrayList3;
                stickersActivity.d = arrayList3;
            } else {
                stickersActivity.d = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i16)));
            }
        }
        stickersActivity.e = new ArrayList(stickersActivity.l0());
        int i17 = 0;
        int i18 = 0;
        while (i18 < stickersActivity.e.size()) {
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.e.get(i18)).set.f22054id))) {
                stickersActivity.e.remove(i18);
                i18--;
            }
            i18++;
        }
        int size = stickersActivity.e.size();
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
            arrayList.add(org.telegram.ui.Components.t61.d(1, i19, string2, str));
            if (archivedStickersCount > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i16 == 0) {
                    arrayList.add(org.telegram.ui.Components.t61.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
                } else {
                    if (i16 == 5) {
                        i15 = R.string.ArchivedEmojiPacks;
                    } else {
                        i15 = R.string.ArchivedMasks;
                    }
                    arrayList.add(org.telegram.ui.Components.t61.f(LocaleController.getString(i15), LocaleController.formatNumber(archivedStickersCount, ','), 2));
                }
            }
            arrayList.size();
            int i20 = R.drawable.msg2_smile_status;
            String string3 = LocaleController.getString(R.string.Emoji);
            if (size2 > 0) {
                str2 = LocaleController.formatNumber(size2, ',');
            }
            org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(43);
            t61Var.d = 3;
            t61Var.f32874k = i20;
            t61Var.f32875l = string3;
            t61Var.f32876m = str2;
            arrayList.add(t61Var);
        } else if (archivedStickersCount > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i16 == 0) {
                arrayList.add(org.telegram.ui.Components.t61.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
            } else {
                if (i16 == 5) {
                    i10 = R.string.ArchivedEmojiPacks;
                } else {
                    i10 = R.string.ArchivedMasks;
                }
                arrayList.add(org.telegram.ui.Components.t61.f(LocaleController.getString(i10), LocaleController.formatNumber(archivedStickersCount, ','), 2));
            }
            if (i16 == 1) {
                ic.a.z(R.string.ArchivedMasksInfo, arrayList);
            }
        }
        if (i16 == 0) {
            arrayList.size();
            int i21 = R.drawable.msg2_reactions2;
            String string4 = LocaleController.getString(R.string.DoubleTapSetting);
            org.telegram.ui.Components.t61 t61Var2 = new org.telegram.ui.Components.t61(43);
            t61Var2.d = 4;
            t61Var2.f32874k = i21;
            t61Var2.f32875l = string4;
            t61Var2.F = new t3(stickersActivity, 22);
            arrayList.add(t61Var2);
            if (i16 == 5) {
                i14 = R.string.EmojiBotInfo;
            } else {
                i14 = R.string.StickersBotInfo;
            }
            arrayList.add(org.telegram.ui.Components.t61.C(stickersActivity.i0(LocaleController.getString(i14))));
            arrayList.add(org.telegram.ui.Components.t61.u(LocaleController.getString(R.string.StickersSettings)));
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
            org.telegram.ui.Components.t61 t61Var3 = new org.telegram.ui.Components.t61(43);
            t61Var3.d = 5;
            t61Var3.f32875l = string5;
            t61Var3.f32876m = string;
            arrayList.add(t61Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.t61 i23 = org.telegram.ui.Components.t61.i(6, LocaleController.getString(R.string.LargeEmoji));
            i23.L(SharedConfig.allowBigEmoji);
            arrayList.add(i23);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.t61 i24 = org.telegram.ui.Components.t61.i(7, LocaleController.getString(R.string.DynamicPackOrder));
            i24.L(SharedConfig.updateStickersOrderOnSend);
            arrayList.add(i24);
            ic.a.z(R.string.DynamicPackOrderInfo, arrayList);
        }
        if (i16 == 5) {
            org.telegram.ui.Components.t61 i25 = org.telegram.ui.Components.t61.i(9, LocaleController.getString(R.string.SuggestAnimatedEmoji));
            i25.L(SharedConfig.suggestAnimatedEmoji);
            arrayList.add(i25);
            ic.a.z(R.string.SuggestAnimatedEmojiInfo, arrayList);
        }
        if (stickersActivity.d.size() > 0) {
            j71Var.V();
            if (i16 == 5 || (!stickersActivity.e.isEmpty() && i16 == 0)) {
                if (i16 == 5) {
                    i13 = R.string.ChooseStickerMyEmojiPacks;
                } else {
                    i13 = R.string.ChooseStickerMyStickerSets;
                }
                ic.a.p(i13, arrayList);
            }
            j71Var.M();
            ArrayList arrayList4 = stickersActivity.d;
            int i26 = 0;
            for (int size3 = arrayList4.size(); i26 < size3; size3 = size3) {
                Object obj = arrayList4.get(i26);
                i26++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i27 = org.telegram.ui.Cells.o8.f24619a;
                org.telegram.ui.Components.t61 K = org.telegram.ui.Components.t61.K(org.telegram.ui.Cells.o8.class);
                K.G = tL_messages_stickerSet;
                K.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f46013b;

                    {
                        this.f46013b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.p8)) {
                                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = p8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f46013b;
                                    org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(stickersActivity2, p8Var);
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
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
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
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
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
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new fy0(24, stickersActivity2, p8Var), false);
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
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
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
                                    H.m(R.drawable.msg_delete, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
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
                                    }, LocaleController.getString(R.string.StickersRemove), !stickersSet.set.official, true);
                                    H.S = 190;
                                    H.Z();
                                    return;
                                }
                                return;
                            case 1:
                                StickersActivity.a0(this.f46013b, view);
                                return;
                            default:
                                StickersActivity.Z(this.f46013b, view);
                                return;
                        }
                    }
                };
                K.E = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f46013b;

                    {
                        this.f46013b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.p8)) {
                                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = p8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f46013b;
                                    org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(stickersActivity2, p8Var);
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
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
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
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
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
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new fy0(24, stickersActivity2, p8Var), false);
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
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
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
                                    H.m(R.drawable.msg_delete, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
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
                                    }, LocaleController.getString(R.string.StickersRemove), !stickersSet.set.official, true);
                                    H.S = 190;
                                    H.Z();
                                    return;
                                }
                                return;
                            case 1:
                                StickersActivity.a0(this.f46013b, view);
                                return;
                            default:
                                StickersActivity.Z(this.f46013b, view);
                                return;
                        }
                    }
                };
                K.L(stickersActivity.f36230w.contains(Long.valueOf(tL_messages_stickerSet.set.f22054id)));
                arrayList.add(K);
            }
            charSequence = null;
            j71Var.L();
            j71Var.U();
            if (i16 != 1 && i16 != 5) {
                arrayList.add(org.telegram.ui.Components.t61.C(null));
            } else if (i16 == 1) {
                ic.a.z(R.string.MasksInfo, arrayList);
            }
        } else {
            charSequence = null;
        }
        if (stickersActivity.e.size() > 3) {
            stickersActivity.e = new ArrayList(stickersActivity.e.subList(0, 3));
            z10 = true;
        } else {
            z10 = false;
        }
        if (i16 == 5 && !stickersActivity.e.isEmpty()) {
            if (stickersActivity.d.size() > 0) {
                arrayList.add(org.telegram.ui.Components.t61.C(charSequence));
            }
            if (i16 == 5) {
                i12 = R.string.FeaturedEmojiPacks;
            } else {
                i12 = R.string.FeaturedStickers;
            }
            ic.a.p(i12, arrayList);
            ArrayList arrayList5 = stickersActivity.e;
            int size4 = arrayList5.size();
            while (i17 < size4) {
                Object obj2 = arrayList5.get(i17);
                i17++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i28 = org.telegram.ui.Cells.l3.f24378a;
                org.telegram.ui.Components.t61 K2 = org.telegram.ui.Components.t61.K(org.telegram.ui.Cells.l3.class);
                K2.G = stickerSetCovered;
                K2.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f46013b;

                    {
                        this.f46013b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.p8)) {
                                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = p8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f46013b;
                                    org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(stickersActivity2, p8Var);
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
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
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
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
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
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new fy0(24, stickersActivity2, p8Var), false);
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
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
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
                                    H.m(R.drawable.msg_delete, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.X(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
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
                                    }, LocaleController.getString(R.string.StickersRemove), !stickersSet.set.official, true);
                                    H.S = 190;
                                    H.Z();
                                    return;
                                }
                                return;
                            case 1:
                                StickersActivity.a0(this.f46013b, view);
                                return;
                            default:
                                StickersActivity.Z(this.f46013b, view);
                                return;
                        }
                    }
                };
                K2.f32883t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.f22054id));
                arrayList.add(K2);
            }
            if (z10) {
                org.telegram.ui.Components.t61 c10 = org.telegram.ui.Components.t61.c(8, R.drawable.msg2_trending, LocaleController.getString(R.string.ShowMoreEmojiPacks));
                c10.f32880q = true;
                arrayList.add(c10);
            }
        }
        if (i16 == 5) {
            if (i16 == 5) {
                i11 = R.string.EmojiBotInfo;
            } else {
                i11 = R.string.StickersBotInfo;
            }
            arrayList.add(org.telegram.ui.Components.t61.C(stickersActivity.i0(LocaleController.getString(i11))));
        }
    }

    public static void e0(StickersActivity stickersActivity, int i10) {
        StickersActivity stickersActivity2;
        int i11;
        String string;
        TextView textView;
        int i12 = 0;
        if (i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.d.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i13);
                if (stickersActivity.f36230w.contains(Long.valueOf(tL_messages_stickerSet.set.f22054id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.m0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.mr0 P0 = org.telegram.ui.Components.mr0.P0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            P0.f30723t0 = new uv0(stickersActivity, 2);
            P0.show();
        } else if (i10 == 0 || i10 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.f36230w.size());
            int size2 = stickersActivity.d.size();
            for (int i14 = 0; i14 < size2; i14++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i14);
                if (stickersActivity.f36230w.contains(Long.valueOf(tL_messages_stickerSet2.set.f22054id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i10 == 1) {
                        alertDialog$Builder.f22368a.R = LocaleController.formatString(R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.f22368a.T = LocaleController.formatString(R.string.DeleteStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Delete);
                    } else {
                        alertDialog$Builder.f22368a.R = LocaleController.formatString(R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.f22368a.T = LocaleController.formatString(R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Archive);
                    }
                    alertDialog$Builder.k(string, new i2.z(stickersActivity, arrayList, i10, 18));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                    stickersActivity.showDialog(e2Var);
                    if (i10 == 1 && (textView = (TextView) e2Var.d(-1)) != null) {
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
                        return;
                    }
                    return;
                }
                int size4 = stickersActivity.d.size();
                while (true) {
                    if (i12 < size4) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i12);
                        if (stickersActivity.f36230w.contains(Long.valueOf(tL_messages_stickerSet3.set.f22054id))) {
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
                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity2.m0(tL_messages_stickerSet3));
                                        stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                } else if (i10 == 3) {
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.m0(tL_messages_stickerSet3)));
                                        org.telegram.ui.Components.wc.j(stickersActivity2).j();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                } else if (i10 == 4) {
                                    HashSet hashSet = stickersActivity2.f36230w;
                                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f22054id))) {
                                        hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.f22054id));
                                    } else {
                                        hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f22054id));
                                    }
                                    stickersActivity2.f36223a.f32152g3.O(true);
                                    stickersActivity2.j0();
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
                stickersActivity2.k0();
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23767z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23769z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23750y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        int i10 = this.f36229s;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.StickersName));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.Masks));
        } else if (i10 == 5) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.Emoji));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new p11(this, 9));
        org.telegram.ui.ActionBar.x5 h = this.simpleActionBar.h();
        h.b(2, R.drawable.msg_share, null, null, AndroidUtilities.dp(54.0f), null);
        h.b(0, R.drawable.msg_archive, null, null, AndroidUtilities.dp(54.0f), null);
        this.h = h.b(1, R.drawable.msg_delete, null, null, AndroidUtilities.dp(54.0f), null);
        if (i10 == 5 && (arrayList = this.v) != null) {
            this.d = arrayList;
        } else {
            this.d = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(i10)));
        }
        this.e = l0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(this, new Utilities.Callback2(this) {
            public final StickersActivity f37707b;

            {
                this.f37707b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.d0(this.f37707b, (ArrayList) obj, (org.telegram.ui.Components.j71) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.W(this.f37707b, (ArrayList) obj2);
                        return;
                }
            }
        }, new ba1(this), new ba1(this));
        this.f36223a = r71Var;
        r71Var.u1();
        this.f36223a.setFocusable(true);
        this.f36223a.setSectionsDrawBackground(true);
        this.f36223a.setTag(7);
        this.f36223a.H1(new Utilities.Callback2(this) {
            public final StickersActivity f37707b;

            {
                this.f37707b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.d0(this.f37707b, (ArrayList) obj, (org.telegram.ui.Components.j71) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.W(this.f37707b, (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        ig.j0 j0Var = new ig.j0(this, 8);
        this.f36224b = j0Var;
        j0Var.k1(1);
        this.f36223a.setLayoutManager(this.f36224b);
        frameLayout.addView(this.f36223a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        int i13 = this.f36229s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == i13) {
                this.f36226f.clear();
            }
            this.f36223a.f32152g3.O(true);
        } else if (i10 != NotificationCenter.featuredStickersDidLoad && i10 != NotificationCenter.featuredEmojiDidLoad) {
            if (i10 == NotificationCenter.archivedStickersCountDidLoad && ((Integer) objArr[0]).intValue() == i13) {
                this.f36223a.f32152g3.O(true);
            }
        } else {
            this.f36223a.f32152g3.O(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f36223a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.y6.f23356d6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36223a, 16, new Class[]{org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.a9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36223a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36223a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36223a, 8192, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36223a, 16384, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23485k7));
        org.telegram.ui.Components.b61 b61Var = this.f36225c;
        if (b61Var != null) {
            arrayList.addAll(b61Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final CharSequence i0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        HashSet hashSet = this.f36230w;
        int size = hashSet.size();
        boolean o10 = this.simpleActionBar.o();
        int i10 = 0;
        if (size > 0) {
            if (hashSet.size() > 0) {
                ArrayList arrayList = this.d;
                int size2 = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.f22054id))) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet.official && !stickerSet.emojis) {
                            i10 = 8;
                            break;
                        }
                    }
                }
                if (this.h.getVisibility() != i10) {
                    this.h.setVisibility(i10);
                }
            }
            this.simpleActionBar.t(size, o10);
            if (!o10) {
                this.simpleActionBar.x();
                this.f36223a.C1(true);
                if (!SharedConfig.stickersReorderingHintUsed && this.f36229s != 5) {
                    SharedConfig.setStickersReorderingHintUsed(true);
                    org.telegram.ui.Components.qc.g(this, new org.telegram.ui.Components.sm0(getParentActivity(), LocaleController.getString(R.string.StickersReorderHint)), 3250).j();
                }
            }
        } else if (o10) {
            this.simpleActionBar.n();
            this.f36223a.C1(false);
            n0();
        }
    }

    public final void k0() {
        this.f36230w.clear();
        this.f36223a.f32152g3.O(true);
        j0();
    }

    public final ArrayList l0() {
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.f36229s == 5) {
            ArrayList arrayList = new ArrayList(mediaDataController.getFeaturedEmojiSets());
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (arrayList.get(i10) == null || mediaDataController.isStickerPackInstalled(((TLRPC.StickerSetCovered) arrayList.get(i10)).set.f22054id, false)) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
            return arrayList;
        }
        return mediaDataController.getFeaturedStickerSets();
    }

    public final String m0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
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
        return String.format(locale, a1.g.s(sb2, str, "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void n0() {
        boolean z10;
        boolean z11;
        if (this.f36228r) {
            this.f36228r = false;
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            int i10 = this.f36229s;
            mediaDataController.calcNewHash(i10);
            this.f36227n++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_reorderStickerSets.masks = z10;
            if (i10 == 5) {
                z11 = true;
            } else {
                z11 = false;
            }
            tL_messages_reorderStickerSets.emojis = z11;
            int i11 = 0;
            while (i11 < this.d.size()) {
                i11 = c3.h0.j(((TLRPC.TL_messages_stickerSet) this.d.get(i11)).set.f22054id, tL_messages_reorderStickerSets.order, i11, 1);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new l(this, 22));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                org.telegram.ui.Components.wc.b0(this).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
                this.f36223a.f32152g3.O(true);
            }
        }
    }

    public final void o0(org.telegram.ui.Cells.p8 p8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = p8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.f22054id);
        HashSet hashSet = this.f36230w;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.f22054id));
            p8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.f22054id));
            p8Var.b(true, true);
        }
        this.f36223a.f32152g3.O(true);
        j0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f36230w.isEmpty()) {
            if (z10) {
                k0();
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
        int i10 = this.f36229s;
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
        if (this.f36229s == 6) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.r71 r71Var = this.f36223a;
        if (r71Var != null) {
            r71Var.f32152g3.O(true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
