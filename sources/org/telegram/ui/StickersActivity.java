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
public class StickersActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.c71 f33860a;
    private int archivedRow;
    public hg.i0 f33861b;
    public NumberTextView f33862c;
    public org.telegram.ui.Components.p51 d;
    private int dynamicPackOrder;
    public ArrayList e;
    public ArrayList f33863f;
    private int featuredRow;
    public final ArrayList h;
    private int largeEmojiRow;
    public org.telegram.ui.ActionBar.u0 f33864n;
    public int f33865r;
    public boolean f33866s;
    private int suggestRow;
    public final int v;
    public ArrayList f33867w;
    public final HashSet f33868x;
    public final q91 f33869y;

    public StickersActivity(int i10, ArrayList arrayList) {
        super(null);
        this.h = new ArrayList();
        this.f33868x = new HashSet();
        this.f33869y = new q91(this, 0);
        this.v = i10;
        this.f33867w = arrayList;
    }

    public static void U(StickersActivity stickersActivity, org.telegram.ui.Components.h61 h61Var, View view) {
        boolean z10;
        boolean z11;
        int i10 = stickersActivity.v;
        Object obj = h61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (stickersActivity.f33868x.isEmpty()) {
                ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
                if (arrayList != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null && stickerSet.emojis) {
                        ArrayList arrayList2 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.f20300id = stickerSet2.f20307id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        arrayList2.add(tL_inputStickerSetID);
                        stickersActivity.showDialog(new org.telegram.ui.Components.aw(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
                        return;
                    }
                    stickersActivity.showDialog(new org.telegram.ui.Components.qy0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                    return;
                }
                return;
            }
            stickersActivity.n0((org.telegram.ui.Cells.l8) view);
            return;
        }
        boolean z12 = true;
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.f20300id = stickerSet3.f20307id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i10 == 5) {
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(tL_inputStickerSetID2);
                stickersActivity.showDialog(new org.telegram.ui.Components.aw(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
                return;
            }
            stickersActivity.showDialog(new org.telegram.ui.Components.qy0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
            return;
        }
        switch (h61Var.d) {
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
                                tL_inputStickerSetID3.f20300id = stickerSet4.f20307id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    MediaDataController.getInstance(stickersActivity.currentAccount).markFeaturedStickersAsRead(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.aw(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    return;
                }
                org.telegram.ui.Components.p51 p51Var = new org.telegram.ui.Components.p51(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.d61(stickersActivity.getParentActivity(), new v91(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                stickersActivity.d = p51Var;
                p51Var.show();
                return;
            case 2:
                stickersActivity.presentFragment(new p(i10));
                return;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                return;
            case 4:
                stickersActivity.presentFragment(new z11());
                return;
            case 5:
                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(stickersActivity, view);
                if (SharedConfig.suggestStickers == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.i(new dh(4, view), LocaleController.getString(R.string.SuggestStickersAll), z10);
                if (SharedConfig.suggestStickers == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.i(new dh(5, view), LocaleController.getString(R.string.SuggestStickersInstalled), z11);
                if (SharedConfig.suggestStickers != 2) {
                    z12 = false;
                }
                H.i(new dh(6, view), LocaleController.getString(R.string.SuggestStickersNone), z12);
                H.Z();
                return;
            case 6:
                SharedConfig.toggleBigEmoji();
                ((org.telegram.ui.Cells.v8) view).setChecked(SharedConfig.allowBigEmoji);
                return;
            case 7:
                SharedConfig.toggleUpdateStickersOrderOnSend();
                ((org.telegram.ui.Cells.v8) view).setChecked(SharedConfig.updateStickersOrderOnSend);
                return;
            case 9:
                SharedConfig.toggleSuggestAnimatedEmoji();
                ((org.telegram.ui.Cells.v8) view).setChecked(SharedConfig.suggestAnimatedEmoji);
                return;
            default:
                return;
        }
    }

    public static void V(StickersActivity stickersActivity, ArrayList arrayList) {
        q91 q91Var = stickersActivity.f33869y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Object obj2 = ((org.telegram.ui.Components.h61) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.e = arrayList2;
        stickersActivity.f33866s = true;
        Collections.sort(MediaDataController.getInstance(stickersActivity.currentAccount).getStickerSets(stickersActivity.v), new jt(stickersActivity, 3));
        AndroidUtilities.cancelRunOnUIThread(q91Var);
        AndroidUtilities.runOnUIThread(q91Var, 1000L);
    }

    public static void X(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.o3 o3Var = (org.telegram.ui.Cells.o3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = o3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.h;
        if (arrayList.contains(Long.valueOf(stickerSet.set.f20307id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.f20307id));
        o3Var.e.a(true, true);
        if (o3Var.f22723s) {
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
        org.telegram.ui.Cells.l8 l8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSetCovered stickerSetCovered2;
        ArrayList arrayList = stickersActivity.h;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof org.telegram.ui.Cells.l8) && (stickersSet = (l8Var = (org.telegram.ui.Cells.l8) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i10 = 0;
                if (l8Var.f22552y == view) {
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = stickersActivity.getMediaDataController().getFeaturedEmojiSets();
                    while (true) {
                        if (i10 < featuredEmojiSets.size()) {
                            if (stickersSet.set.f20307id == featuredEmojiSets.get(i10).set.f20307id) {
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
                        if (!arrayList.contains(Long.valueOf(stickerSetCovered.set.f20307id))) {
                            arrayList.add(Long.valueOf(stickerSetCovered.set.f20307id));
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
                } else if (l8Var.E == view) {
                    MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                } else if (l8Var.F == view) {
                    stickersActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) stickersActivity, 11, false));
                }
            }
        }
    }

    public static void a0(StickersActivity stickersActivity, ArrayList arrayList, int i10) {
        stickersActivity.j0();
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        int i11 = stickersActivity.v;
        int i12 = 1;
        if (i10 == 1) {
            i12 = 0;
        }
        mediaDataController.toggleStickerSets(arrayList, i11, i12, stickersActivity, true);
    }

    public static void b0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.ba) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            String doubleTapReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getDoubleTapReaction();
            if (doubleTapReaction != null) {
                if (doubleTapReaction.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.r5 n10 = org.telegram.ui.Components.r5.n(stickersActivity.currentAccount, Long.parseLong(doubleTapReaction.substring(9)), null, 2);
                        n10.a(baVar.getValueBackupImageView());
                        baVar.getValueBackupImageView().setImageDrawable(n10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getReactionsMap().get(doubleTapReaction);
                if (tL_availableReaction != null) {
                    baVar.getValueBackupImageView().getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "100_100_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.h6.f20936a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void c0(StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.u61 u61Var) {
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
        ArrayList arrayList2 = stickersActivity.h;
        int i16 = stickersActivity.v;
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        org.telegram.ui.Components.c71 c71Var = stickersActivity.f33860a;
        if (c71Var == null || (!c71Var.f25122a3 && !stickersActivity.f33866s && stickersActivity.f33865r <= 0)) {
            if (i16 == 5) {
                ArrayList arrayList3 = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i16)));
                stickersActivity.f33867w = arrayList3;
                stickersActivity.e = arrayList3;
            } else {
                stickersActivity.e = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i16)));
            }
        }
        stickersActivity.f33863f = new ArrayList(stickersActivity.k0());
        int i17 = 0;
        int i18 = 0;
        while (i18 < stickersActivity.f33863f.size()) {
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.f33863f.get(i18)).set.f20307id))) {
                stickersActivity.f33863f.remove(i18);
                i18--;
            }
            i18++;
        }
        int size = stickersActivity.f33863f.size();
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
            arrayList.add(org.telegram.ui.Components.h61.d(1, i19, string2, str));
            if (archivedStickersCount > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i16 == 0) {
                    arrayList.add(org.telegram.ui.Components.h61.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
                } else {
                    if (i16 == 5) {
                        i15 = R.string.ArchivedEmojiPacks;
                    } else {
                        i15 = R.string.ArchivedMasks;
                    }
                    arrayList.add(org.telegram.ui.Components.h61.f(LocaleController.getString(i15), LocaleController.formatNumber(archivedStickersCount, ','), 2));
                }
            }
            arrayList.size();
            int i20 = R.drawable.msg2_smile_status;
            String string3 = LocaleController.getString(R.string.Emoji);
            if (size2 > 0) {
                str2 = LocaleController.formatNumber(size2, ',');
            }
            org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(43);
            h61Var.d = 3;
            h61Var.f26785k = i20;
            h61Var.f26786l = string3;
            h61Var.f26787m = str2;
            arrayList.add(h61Var);
        } else if (archivedStickersCount > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i16 == 0) {
                arrayList.add(org.telegram.ui.Components.h61.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
            } else {
                if (i16 == 5) {
                    i10 = R.string.ArchivedEmojiPacks;
                } else {
                    i10 = R.string.ArchivedMasks;
                }
                arrayList.add(org.telegram.ui.Components.h61.f(LocaleController.getString(i10), LocaleController.formatNumber(archivedStickersCount, ','), 2));
            }
            if (i16 == 1) {
                i2.e.B(R.string.ArchivedMasksInfo, arrayList);
            }
        }
        if (i16 == 0) {
            arrayList.size();
            int i21 = R.drawable.msg2_reactions2;
            String string4 = LocaleController.getString(R.string.DoubleTapSetting);
            org.telegram.ui.Components.h61 h61Var2 = new org.telegram.ui.Components.h61(43);
            h61Var2.d = 4;
            h61Var2.f26785k = i21;
            h61Var2.f26786l = string4;
            h61Var2.F = new v3(stickersActivity, 21);
            arrayList.add(h61Var2);
            if (i16 == 5) {
                i14 = R.string.EmojiBotInfo;
            } else {
                i14 = R.string.StickersBotInfo;
            }
            arrayList.add(org.telegram.ui.Components.h61.B(stickersActivity.h0(LocaleController.getString(i14))));
            arrayList.add(org.telegram.ui.Components.h61.t(LocaleController.getString(R.string.StickersSettings)));
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
            org.telegram.ui.Components.h61 h61Var3 = new org.telegram.ui.Components.h61(43);
            h61Var3.d = 5;
            h61Var3.f26786l = string5;
            h61Var3.f26787m = string;
            arrayList.add(h61Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.h61 i23 = org.telegram.ui.Components.h61.i(6, LocaleController.getString(R.string.LargeEmoji));
            i23.K(SharedConfig.allowBigEmoji);
            arrayList.add(i23);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.h61 i24 = org.telegram.ui.Components.h61.i(7, LocaleController.getString(R.string.DynamicPackOrder));
            i24.K(SharedConfig.updateStickersOrderOnSend);
            arrayList.add(i24);
            i2.e.B(R.string.DynamicPackOrderInfo, arrayList);
        }
        if (i16 == 5) {
            org.telegram.ui.Components.h61 i25 = org.telegram.ui.Components.h61.i(9, LocaleController.getString(R.string.SuggestAnimatedEmoji));
            i25.K(SharedConfig.suggestAnimatedEmoji);
            arrayList.add(i25);
            i2.e.B(R.string.SuggestAnimatedEmojiInfo, arrayList);
        }
        if (stickersActivity.e.size() > 0) {
            u61Var.U();
            if (i16 == 5 || (!stickersActivity.f33863f.isEmpty() && i16 == 0)) {
                if (i16 == 5) {
                    i13 = R.string.ChooseStickerMyEmojiPacks;
                } else {
                    i13 = R.string.ChooseStickerMyStickerSets;
                }
                i2.e.p(i13, arrayList);
            }
            u61Var.M();
            ArrayList arrayList4 = stickersActivity.e;
            int i26 = 0;
            for (int size3 = arrayList4.size(); i26 < size3; size3 = size3) {
                Object obj = arrayList4.get(i26);
                i26++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i27 = org.telegram.ui.Cells.k8.f22517a;
                org.telegram.ui.Components.h61 J = org.telegram.ui.Components.h61.J(org.telegram.ui.Cells.k8.class);
                J.G = tL_messages_stickerSet;
                J.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f41105b;

                    {
                        this.f41105b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.l8)) {
                                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = l8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f41105b;
                                    org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(stickersActivity2, l8Var);
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
                                                        org.telegram.ui.Components.xc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
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
                                                        org.telegram.ui.Components.xc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new k71(4, stickersActivity2, l8Var), false);
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
                                                        org.telegram.ui.Components.xc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
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
                                                        org.telegram.ui.Components.xc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
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
                                StickersActivity.Z(this.f41105b, view);
                                return;
                            default:
                                StickersActivity.X(this.f41105b, view);
                                return;
                        }
                    }
                };
                J.E = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f41105b;

                    {
                        this.f41105b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.l8)) {
                                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = l8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f41105b;
                                    org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(stickersActivity2, l8Var);
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
                                                        org.telegram.ui.Components.xc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
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
                                                        org.telegram.ui.Components.xc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new k71(4, stickersActivity2, l8Var), false);
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
                                                        org.telegram.ui.Components.xc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
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
                                                        org.telegram.ui.Components.xc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
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
                                StickersActivity.Z(this.f41105b, view);
                                return;
                            default:
                                StickersActivity.X(this.f41105b, view);
                                return;
                        }
                    }
                };
                J.K(stickersActivity.f33868x.contains(Long.valueOf(tL_messages_stickerSet.set.f20307id)));
                arrayList.add(J);
            }
            charSequence = null;
            u61Var.L();
            u61Var.T();
            if (i16 != 1 && i16 != 5) {
                arrayList.add(org.telegram.ui.Components.h61.B(null));
            } else if (i16 == 1) {
                i2.e.B(R.string.MasksInfo, arrayList);
            }
        } else {
            charSequence = null;
        }
        if (stickersActivity.f33863f.size() > 3) {
            stickersActivity.f33863f = new ArrayList(stickersActivity.f33863f.subList(0, 3));
            z10 = true;
        } else {
            z10 = false;
        }
        if (i16 == 5 && !stickersActivity.f33863f.isEmpty()) {
            if (stickersActivity.e.size() > 0) {
                arrayList.add(org.telegram.ui.Components.h61.B(charSequence));
            }
            if (i16 == 5) {
                i12 = R.string.FeaturedEmojiPacks;
            } else {
                i12 = R.string.FeaturedStickers;
            }
            i2.e.p(i12, arrayList);
            ArrayList arrayList5 = stickersActivity.f33863f;
            int size4 = arrayList5.size();
            while (i17 < size4) {
                Object obj2 = arrayList5.get(i17);
                i17++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i28 = org.telegram.ui.Cells.n3.f22642a;
                org.telegram.ui.Components.h61 J2 = org.telegram.ui.Components.h61.J(org.telegram.ui.Cells.n3.class);
                J2.G = stickerSetCovered;
                J2.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f41105b;

                    {
                        this.f41105b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.l8)) {
                                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = l8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.f41105b;
                                    org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(stickersActivity2, l8Var);
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
                                                        org.telegram.ui.Components.xc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
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
                                                        org.telegram.ui.Components.xc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new k71(4, stickersActivity2, l8Var), false);
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
                                                        org.telegram.ui.Components.xc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
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
                                                        org.telegram.ui.Components.xc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
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
                                StickersActivity.Z(this.f41105b, view);
                                return;
                            default:
                                StickersActivity.X(this.f41105b, view);
                                return;
                        }
                    }
                };
                J2.f26794t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.f20307id));
                arrayList.add(J2);
            }
            if (z10) {
                org.telegram.ui.Components.h61 c10 = org.telegram.ui.Components.h61.c(8, R.drawable.msg2_trending, LocaleController.getString(R.string.ShowMoreEmojiPacks));
                c10.f26791q = true;
                arrayList.add(c10);
            }
        }
        if (i16 == 5) {
            if (i16 == 5) {
                i11 = R.string.EmojiBotInfo;
            } else {
                i11 = R.string.StickersBotInfo;
            }
            arrayList.add(org.telegram.ui.Components.h61.B(stickersActivity.h0(LocaleController.getString(i11))));
        }
    }

    public static void d0(StickersActivity stickersActivity, int i10) {
        StickersActivity stickersActivity2;
        int i11;
        String string;
        TextView textView;
        int i12 = 0;
        if (i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.e.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.e.get(i13);
                if (stickersActivity.f33868x.contains(Long.valueOf(tL_messages_stickerSet.set.f20307id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.l0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.fr0 P0 = org.telegram.ui.Components.fr0.P0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            P0.f26392t0 = new ko0(stickersActivity, 3);
            P0.show();
        } else if (i10 == 0 || i10 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.f33868x.size());
            int size2 = stickersActivity.e.size();
            for (int i14 = 0; i14 < size2; i14++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.e.get(i14);
                if (stickersActivity.f33868x.contains(Long.valueOf(tL_messages_stickerSet2.set.f20307id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i10 == 1) {
                        alertDialog$Builder.f20609a.R = LocaleController.formatString(R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.f20609a.T = LocaleController.formatString(R.string.DeleteStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Delete);
                    } else {
                        alertDialog$Builder.f20609a.R = LocaleController.formatString(R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.f20609a.T = LocaleController.formatString(R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Archive);
                    }
                    alertDialog$Builder.k(string, new hg.b2(stickersActivity, arrayList, i10, 17));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                    stickersActivity.showDialog(b2Var);
                    if (i10 == 1 && (textView = (TextView) b2Var.d(-1)) != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21232q7, false));
                        return;
                    }
                    return;
                }
                int size4 = stickersActivity.e.size();
                while (true) {
                    if (i12 < size4) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.e.get(i12);
                        if (stickersActivity.f33868x.contains(Long.valueOf(tL_messages_stickerSet3.set.f20307id))) {
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
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                } else if (i10 == 3) {
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.l0(tL_messages_stickerSet3)));
                                        org.telegram.ui.Components.xc.j(stickersActivity2).j();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                } else if (i10 == 4) {
                                    HashSet hashSet = stickersActivity2.f33868x;
                                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20307id))) {
                                        hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.f20307id));
                                    } else {
                                        hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20307id));
                                    }
                                    stickersActivity2.f33860a.W2.N(true);
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
        i2.e.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.v;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.StickersName));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Masks));
        } else if (i10 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Emoji));
        }
        this.actionBar.setActionBarMenuOnItemClick(new y21(this, 6));
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f33862c = numberTextView;
        numberTextView.setTextSize(18);
        this.f33862c.setTypeface(AndroidUtilities.bold());
        this.f33862c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21384y8, false));
        j10.addView(this.f33862c, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
        this.f33862c.setOnTouchListener(new di.d(2));
        j10.g(2, R.drawable.msg_share, AndroidUtilities.dp(54.0f));
        j10.g(0, R.drawable.msg_archive, AndroidUtilities.dp(54.0f));
        this.f33864n = j10.g(1, R.drawable.msg_delete, AndroidUtilities.dp(54.0f));
        if (i10 == 5 && (arrayList = this.f33867w) != null) {
            this.e = arrayList;
        } else {
            this.e = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(i10)));
        }
        this.f33863f = k0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20936a7, false));
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(this, new Utilities.Callback2(this) {
            public final StickersActivity f41629b;

            {
                this.f41629b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.c0(this.f41629b, (ArrayList) obj, (org.telegram.ui.Components.u61) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.V(this.f41629b, (ArrayList) obj2);
                        return;
                }
            }
        }, new u91(this), new u91(this));
        this.f33860a = c71Var;
        c71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f33860a);
        this.f33860a.setFocusable(true);
        this.f33860a.setTag(7);
        this.f33860a.C1(new Utilities.Callback2(this) {
            public final StickersActivity f41629b;

            {
                this.f41629b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.c0(this.f41629b, (ArrayList) obj, (org.telegram.ui.Components.u61) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.V(this.f41629b, (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        hg.i0 i0Var = new hg.i0(this, 7);
        this.f33861b = i0Var;
        i0Var.j1(1);
        this.f33860a.setLayoutManager(this.f33861b);
        frameLayout.addView(this.f33860a, w7.z5.c(-1.0f, -1));
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
            this.f33860a.W2.N(true);
        } else if (i10 != NotificationCenter.featuredStickersDidLoad && i10 != NotificationCenter.featuredEmojiDidLoad) {
            if (i10 == NotificationCenter.archivedStickersCountDidLoad && ((Integer) objArr[0]).intValue() == i13) {
                this.f33860a.W2.N(true);
            }
        } else {
            this.f33860a.W2.N(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.h6.f20994d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 16, new Class[]{org.telegram.ui.Cells.l8.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.v8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20936a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21273s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21329v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21292t8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f21384y8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 512, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.h6.f21348w8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.h6.f21366x8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.h6.f21401z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33862c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21083i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21115k0, null, null, org.telegram.ui.ActionBar.h6.f20995d7));
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 2, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21399z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 196608, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vh));
        int i13 = org.telegram.ui.ActionBar.h6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"optionsButton"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"reorderButton"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 8192, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33860a, 16384, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21122k7));
        org.telegram.ui.Components.p51 p51Var = this.d;
        if (p51Var != null) {
            arrayList.addAll(p51Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final CharSequence h0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.n4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str;
    }

    public final void i0() {
        HashSet hashSet = this.f33868x;
        int size = hashSet.size();
        boolean t10 = this.actionBar.t();
        int i10 = 0;
        if (size > 0) {
            if (hashSet.size() > 0) {
                ArrayList arrayList = this.e;
                int size2 = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.f20307id))) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet.official && !stickerSet.emojis) {
                            i10 = 8;
                            break;
                        }
                    }
                }
                if (this.f33864n.getVisibility() != i10) {
                    this.f33864n.setVisibility(i10);
                }
            }
            this.f33862c.a(size, t10);
            if (!t10) {
                this.actionBar.O(null, null);
                this.f33860a.x1(true);
                if (!SharedConfig.stickersReorderingHintUsed && this.v != 5) {
                    SharedConfig.setStickersReorderingHintUsed(true);
                    org.telegram.ui.Components.qc.g(this, new org.telegram.ui.Components.mm0(getParentActivity(), LocaleController.getString(R.string.StickersReorderHint)), 3250).j();
                }
            }
        } else if (t10) {
            this.actionBar.s();
            this.f33860a.x1(false);
            m0();
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        this.f33868x.clear();
        this.f33860a.W2.N(true);
        i0();
    }

    public final ArrayList k0() {
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.v == 5) {
            ArrayList arrayList = new ArrayList(mediaDataController.getFeaturedEmojiSets());
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (arrayList.get(i10) == null || mediaDataController.isStickerPackInstalled(((TLRPC.StickerSetCovered) arrayList.get(i10)).set.f20307id, false)) {
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

    public final void m0() {
        boolean z10;
        boolean z11;
        if (this.f33866s) {
            this.f33866s = false;
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            int i10 = this.v;
            mediaDataController.calcNewHash(i10);
            this.f33865r++;
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
            while (i11 < this.e.size()) {
                i11 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.TL_messages_stickerSet) this.e.get(i11)).set.f20307id, tL_messages_reorderStickerSets.order, i11, 1);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new m(this, 21));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                org.telegram.ui.Components.xc.a0(this).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
                this.f33860a.W2.N(true);
            }
        }
    }

    public final void n0(org.telegram.ui.Cells.l8 l8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = l8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.f20307id);
        HashSet hashSet = this.f33868x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.f20307id));
            l8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.f20307id));
            l8Var.b(true, true);
        }
        this.f33860a.W2.N(true);
        i0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f33868x.isEmpty()) {
            if (z10) {
                j0();
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
        this.f33860a.setPadding(0, 0, 0, i13);
        this.f33860a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.c71 c71Var = this.f33860a;
        if (c71Var != null) {
            c71Var.W2.N(true);
        }
    }
}
