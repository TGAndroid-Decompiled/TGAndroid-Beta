package org.telegram.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class StickersActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public org.telegram.ui.Components.l41 f41997a;
    private int archivedRow;
    public kg.f0 f41998b;
    public org.telegram.ui.Components.z21 f41999c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList f42000e;
    public final ArrayList f42001f;
    private int featuredRow;
    public org.telegram.ui.ActionBar.f5 h;
    private int largeEmojiRow;
    public int f42002n;
    public boolean f42003r;
    public final int f42004s;
    private int suggestRow;
    public ArrayList f42005w;
    public final HashSet f42006x;
    public final t41 f42007y;

    public StickersActivity(int i3, ArrayList arrayList) {
        super(null);
        this.f42001f = new ArrayList();
        this.f42006x = new HashSet();
        this.f42007y = new t41(this, 0);
        this.f42004s = i3;
        this.f42005w = arrayList;
    }

    public static void Z(StickersActivity stickersActivity, org.telegram.ui.Components.r31 r31Var, View view) {
        boolean z10;
        boolean z11;
        int i3 = stickersActivity.f42004s;
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (stickersActivity.f42006x.isEmpty()) {
                ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
                if (arrayList != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null && stickerSet.emojis) {
                        ArrayList arrayList2 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.f27021id = stickerSet2.f27028id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        arrayList2.add(tL_inputStickerSetID);
                        stickersActivity.showDialog(new org.telegram.ui.Components.pu(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
                        return;
                    }
                    stickersActivity.showDialog(new org.telegram.ui.Components.xv0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                    return;
                }
                return;
            }
            stickersActivity.s0((org.telegram.ui.Cells.f8) view);
            return;
        }
        boolean z12 = true;
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.f27021id = stickerSet3.f27028id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i3 == 5) {
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(tL_inputStickerSetID2);
                stickersActivity.showDialog(new org.telegram.ui.Components.pu(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
                return;
            }
            stickersActivity.showDialog(new org.telegram.ui.Components.xv0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
            return;
        }
        switch (r31Var.d) {
            case 1:
            case 8:
                if (i3 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList p02 = stickersActivity.p0();
                    if (p02 != null) {
                        for (int i10 = 0; i10 < p02.size(); i10++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) p02.get(i10);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.f27021id = stickerSet4.f27028id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    org.telegram.messenger.li.b0(stickersActivity.currentAccount).d1(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.pu(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    return;
                }
                org.telegram.ui.Components.z21 z21Var = new org.telegram.ui.Components.z21(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.n31(stickersActivity.getParentActivity(), new x41(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                stickersActivity.f41999c = z21Var;
                z21Var.show();
                return;
            case 2:
                stickersActivity.presentFragment(new o(i3));
                return;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                return;
            case 4:
                stickersActivity.presentFragment(new sx0());
                return;
            case 5:
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(stickersActivity, view);
                if (org.telegram.messenger.az.E == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.i(new pg(4, view), org.telegram.messenger.bd.M0(2131744411, null), z10);
                if (org.telegram.messenger.az.E == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.i(new pg(5, view), org.telegram.messenger.bd.M0(2131744410, null), z11);
                if (org.telegram.messenger.az.E != 2) {
                    z12 = false;
                }
                H.i(new pg(6, view), org.telegram.messenger.bd.M0(2131744409, null), z12);
                H.Z();
                return;
            case 6:
                org.telegram.messenger.az.T0 = !org.telegram.messenger.az.T0;
                SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                edit.putBoolean("allowBigEmoji", org.telegram.messenger.az.T0);
                edit.apply();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.T0);
                return;
            case 7:
                org.telegram.messenger.az.P();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.X);
                return;
            case 9:
                org.telegram.messenger.az.F = !org.telegram.messenger.az.F;
                SharedPreferences.Editor edit2 = org.telegram.messenger.hp.e1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", org.telegram.messenger.az.F);
                edit2.apply();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.F);
                return;
            default:
                return;
        }
    }

    public static void a0(StickersActivity stickersActivity, ArrayList arrayList) {
        t41 t41Var = stickersActivity.f42007y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Object obj2 = ((org.telegram.ui.Components.r31) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.d = arrayList2;
        stickersActivity.f42003r = true;
        Collections.sort(org.telegram.messenger.li.b0(stickersActivity.currentAccount).s0(stickersActivity.f42004s), new ls(stickersActivity, 3));
        org.telegram.messenger.g0.r(t41Var);
        org.telegram.messenger.g0.i3(t41Var, 1000L);
    }

    public static void b0(StickersActivity stickersActivity, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i3;
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(stickersActivity.currentAccount);
        Activity parentActivity = stickersActivity.getParentActivity();
        if (!tL_messages_stickerSet.set.archived) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        b02.f2(parentActivity, tL_messages_stickerSet, i3, stickersActivity, true, true);
    }

    public static void d0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.q3 q3Var = (org.telegram.ui.Cells.q3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = q3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.f42001f;
        if (arrayList.contains(Long.valueOf(stickerSet.set.f27028id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.f27028id));
        q3Var.f30190f.a(true, true);
        if (q3Var.f30194w) {
            org.telegram.messenger.li.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            org.telegram.messenger.li.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    public static void e0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.f8 f8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSetCovered stickerSetCovered2;
        ArrayList arrayList = stickersActivity.f42001f;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof org.telegram.ui.Cells.f8) && (stickersSet = (f8Var = (org.telegram.ui.Cells.f8) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i3 = 0;
                if (f8Var.E == view) {
                    ArrayList arrayList2 = stickersActivity.getMediaDataController().f24051t0[1];
                    while (true) {
                        if (i3 < arrayList2.size()) {
                            if (stickersSet.set.f27028id == ((TLRPC.StickerSetCovered) arrayList2.get(i3)).set.f27028id) {
                                stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i3);
                                break;
                            }
                            i3++;
                        } else {
                            stickerSetCovered = null;
                            break;
                        }
                    }
                    if (stickerSetCovered != null) {
                        if (!arrayList.contains(Long.valueOf(stickerSetCovered.set.f27028id))) {
                            arrayList.add(Long.valueOf(stickerSetCovered.set.f27028id));
                        } else {
                            return;
                        }
                    }
                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(stickersActivity.currentAccount);
                    Activity parentActivity = stickersActivity.getParentActivity();
                    if (stickerSetCovered == null) {
                        stickerSetCovered2 = stickersSet;
                    } else {
                        stickerSetCovered2 = stickerSetCovered;
                    }
                    b02.f2(parentActivity, stickerSetCovered2, 2, stickersActivity, false, false);
                } else if (f8Var.F == view) {
                    org.telegram.messenger.li.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                } else if (f8Var.G == view) {
                    stickersActivity.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) stickersActivity, 11, false));
                }
            }
        }
    }

    public static void f0(StickersActivity stickersActivity, ArrayList arrayList, int i3) {
        int i10;
        int i11;
        int i12;
        long[] jArr;
        boolean z10;
        int i13;
        boolean z11;
        stickersActivity.o0();
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(stickersActivity.currentAccount);
        int i14 = stickersActivity.f42004s;
        boolean z12 = true;
        if (i3 == 1) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        long[] jArr2 = b02.Y;
        ArrayList[] arrayListArr = b02.H;
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i15 = 0;
        while (i15 < size) {
            TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) arrayList.get(i15);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.f27021id = stickerSet.f27028id;
            arrayList2.add(tL_inputStickerSetID);
            if (i10 != 0) {
                if (i10 == z12) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                stickerSet.archived = z11;
            }
            int size2 = arrayListArr[i14].size();
            int i16 = 0;
            while (true) {
                if (i16 < size2) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayListArr[i14].get(i16);
                    z10 = z12;
                    i13 = i10;
                    i12 = i14;
                    jArr = jArr2;
                    if (tL_messages_stickerSet.set.f27028id == tL_inputStickerSetID.f27021id) {
                        arrayListArr[i12].remove(i16);
                        b02.J.l(tL_messages_stickerSet.set.f27028id);
                        b02.K.l(tL_messages_stickerSet.set.f27028id);
                        b02.O.remove(tL_messages_stickerSet.set.short_name);
                        break;
                    }
                    i16++;
                    i10 = i13;
                    i14 = i12;
                    z12 = z10;
                    jArr2 = jArr;
                } else {
                    i12 = i14;
                    jArr = jArr2;
                    z10 = z12;
                    i13 = i10;
                    break;
                }
            }
            i15++;
            i10 = i13;
            i14 = i12;
            z12 = z10;
            jArr2 = jArr;
        }
        int i17 = i14;
        boolean z13 = z12;
        int i18 = i10;
        long q10 = org.telegram.messenger.li.q(arrayListArr[i17]);
        jArr2[i17] = q10;
        b02.J1(i17, b02.Z[i17], q10, arrayListArr[i17]);
        org.telegram.messenger.hs notificationCenter = b02.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i17);
        objArr[z13 ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(org.telegram.messenger.hs.f23333x0, objArr);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i18 != 0) {
            i11 = i18;
            if (i11 == z13) {
                tL_messages_toggleStickerSets.archive = z13;
            }
        } else {
            i11 = i18;
            tL_messages_toggleStickerSets.uninstall = z13;
        }
        b02.getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new org.telegram.messenger.hf(b02, i11, stickersActivity, i17));
    }

    public static void g0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.v9) {
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            String Q = org.telegram.messenger.li.b0(stickersActivity.currentAccount).Q();
            if (Q != null) {
                if (Q.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.g5 m10 = org.telegram.ui.Components.g5.m(stickersActivity.currentAccount, Long.parseLong(Q.substring(9)), null, 2);
                        m10.a(v9Var.getValueBackupImageView());
                        v9Var.getValueBackupImageView().setImageDrawable(m10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(stickersActivity.currentAccount).f24045r.get(Q);
                if (tL_availableReaction != null) {
                    v9Var.getValueBackupImageView().getImageReceiver().q0(org.telegram.messenger.ac.b(tL_availableReaction.center_icon), "100_100_lastreactframe", org.telegram.messenger.t5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.k6.f27824a7, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void h0(final StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.f41 f41Var) {
        int i3;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String M0;
        String str;
        int i16;
        ArrayList arrayList2 = stickersActivity.f42001f;
        int i17 = stickersActivity.f42004s;
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(stickersActivity.currentAccount);
        org.telegram.ui.Components.l41 l41Var = stickersActivity.f41997a;
        if (l41Var == null || (!l41Var.f35597k3 && !stickersActivity.f42003r && stickersActivity.f42002n <= 0)) {
            if (i17 == 5) {
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.hp.s1(stickersActivity.currentAccount).w0(b02.s0(i17)));
                stickersActivity.f42005w = arrayList3;
                stickersActivity.d = arrayList3;
            } else {
                stickersActivity.d = new ArrayList(org.telegram.messenger.hp.s1(stickersActivity.currentAccount).w0(b02.s0(i17)));
            }
        }
        stickersActivity.f42000e = new ArrayList(stickersActivity.p0());
        int i18 = 0;
        while (i18 < stickersActivity.f42000e.size()) {
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.f42000e.get(i18)).set.f27028id))) {
                stickersActivity.f42000e.remove(i18);
                i18--;
            }
            i18++;
        }
        int size = stickersActivity.f42000e.size();
        int i19 = b02.f24015c0[i17];
        int size2 = b02.s0(5).size();
        final int i20 = 2;
        if (i17 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            String M02 = org.telegram.messenger.bd.M0(2131750834, null);
            String str2 = "";
            if (size <= 0) {
                str = "";
            } else {
                str = org.telegram.messenger.bd.E(size, ',');
            }
            arrayList.add(org.telegram.ui.Components.r31.d(1, 2131232039, M02, str));
            if (i19 > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i17 == 0) {
                    arrayList.add(org.telegram.ui.Components.r31.d(2, 2131232016, org.telegram.messenger.bd.M0(2131754128, null), org.telegram.messenger.bd.E(i19, ',')));
                } else {
                    if (i17 == 5) {
                        i16 = 2131754134;
                    } else {
                        i16 = 2131754133;
                    }
                    arrayList.add(org.telegram.ui.Components.r31.f(org.telegram.messenger.bd.M0(i16, null), org.telegram.messenger.bd.E(i19, ','), 2));
                }
            }
            arrayList.size();
            String M03 = org.telegram.messenger.bd.M0(2131751197, null);
            if (size2 > 0) {
                str2 = org.telegram.messenger.bd.E(size2, ',');
            }
            org.telegram.ui.Components.r31 r31Var = new org.telegram.ui.Components.r31(43);
            r31Var.d = 3;
            r31Var.f37626k = 2131232037;
            r31Var.f37627l = M03;
            r31Var.f37628m = str2;
            arrayList.add(r31Var);
        } else if (i19 > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i17 == 0) {
                arrayList.add(org.telegram.ui.Components.r31.d(2, 2131232016, org.telegram.messenger.bd.M0(2131754128, null), org.telegram.messenger.bd.E(i19, ',')));
            } else {
                if (i17 == 5) {
                    i3 = 2131754134;
                } else {
                    i3 = 2131754133;
                }
                arrayList.add(org.telegram.ui.Components.r31.f(org.telegram.messenger.bd.M0(i3, null), org.telegram.messenger.bd.E(i19, ','), 2));
            }
            if (i17 == 1) {
                arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131754129, null)));
            }
        }
        if (i17 == 0) {
            arrayList.size();
            String M04 = org.telegram.messenger.bd.M0(2131751351, null);
            org.telegram.ui.Components.r31 r31Var2 = new org.telegram.ui.Components.r31(43);
            r31Var2.d = 4;
            r31Var2.f37626k = 2131232035;
            r31Var2.f37627l = M04;
            r31Var2.F = new s3(stickersActivity, 22);
            arrayList.add(r31Var2);
            if (i17 == 5) {
                i15 = 2131751186;
            } else {
                i15 = 2131744876;
            }
            arrayList.add(org.telegram.ui.Components.r31.C(stickersActivity.m0(org.telegram.messenger.bd.M0(i15, null))));
            arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131744857, null)));
            stickersActivity.suggestRow = arrayList.size();
            String M05 = org.telegram.messenger.bd.M0(2131744412, null);
            int i21 = org.telegram.messenger.az.E;
            if (i21 != 0) {
                if (i21 != 1) {
                    M0 = org.telegram.messenger.bd.M0(2131744409, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131744410, null);
                }
            } else {
                M0 = org.telegram.messenger.bd.M0(2131744411, null);
            }
            org.telegram.ui.Components.r31 r31Var3 = new org.telegram.ui.Components.r31(43);
            r31Var3.d = 5;
            r31Var3.f37627l = M05;
            r31Var3.f37628m = M0;
            arrayList.add(r31Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.r31 i22 = org.telegram.ui.Components.r31.i(6, org.telegram.messenger.bd.M0(2131749042, null));
            i22.L(org.telegram.messenger.az.T0);
            arrayList.add(i22);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.r31 i23 = org.telegram.ui.Components.r31.i(7, org.telegram.messenger.bd.M0(2131751340, null));
            i23.L(org.telegram.messenger.az.X);
            arrayList.add(i23);
            arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131751339, null)));
        }
        if (i17 == 5) {
            org.telegram.ui.Components.r31 i24 = org.telegram.ui.Components.r31.i(9, org.telegram.messenger.bd.M0(2131744426, null));
            i24.L(org.telegram.messenger.az.F);
            arrayList.add(i24);
            arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131744425, null)));
        }
        if (stickersActivity.d.size() > 0) {
            f41Var.V();
            if (i17 == 5 || (!stickersActivity.f42000e.isEmpty() && i17 == 0)) {
                if (i17 == 5) {
                    i14 = 2131752119;
                } else {
                    i14 = 2131752118;
                }
                arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(i14, null)));
            }
            f41Var.M();
            ArrayList arrayList4 = stickersActivity.d;
            int size3 = arrayList4.size();
            int i25 = 0;
            while (i25 < size3) {
                Object obj = arrayList4.get(i25);
                i25++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i26 = org.telegram.ui.Cells.e8.f29132b;
                org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(org.telegram.ui.Cells.e8.class);
                K.G = tL_messages_stickerSet;
                K.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f49361b;

                    {
                        this.f49361b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i27 = r2;
                        final StickersActivity stickersActivity2 = this.f49361b;
                        switch (i27) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.f8)) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = f8Var.getStickersSet();
                                    org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(stickersActivity2, f8Var);
                                    H.c(2131232051, org.telegram.messenger.bd.M0(2131744868, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(2131232203, org.telegram.messenger.bd.M0(2131744873, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(2131232330, org.telegram.messenger.bd.M0(2131744861, null), new qv0(16, stickersActivity2, f8Var), false);
                                    H.l(2131232363, org.telegram.messenger.bd.M0(2131744856, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String M06 = org.telegram.messenger.bd.M0(2131744865, null);
                                    H.m(2131232108, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, M06, !stickersSet.set.official, true);
                                    H.S = 190;
                                    H.Z();
                                    return;
                                }
                                return;
                            case 1:
                                StickersActivity.e0(stickersActivity2, view);
                                return;
                            default:
                                StickersActivity.d0(stickersActivity2, view);
                                return;
                        }
                    }
                };
                K.E = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f49361b;

                    {
                        this.f49361b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i27 = r2;
                        final StickersActivity stickersActivity2 = this.f49361b;
                        switch (i27) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.f8)) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = f8Var.getStickersSet();
                                    org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(stickersActivity2, f8Var);
                                    H.c(2131232051, org.telegram.messenger.bd.M0(2131744868, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(2131232203, org.telegram.messenger.bd.M0(2131744873, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(2131232330, org.telegram.messenger.bd.M0(2131744861, null), new qv0(16, stickersActivity2, f8Var), false);
                                    H.l(2131232363, org.telegram.messenger.bd.M0(2131744856, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String M06 = org.telegram.messenger.bd.M0(2131744865, null);
                                    H.m(2131232108, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, M06, !stickersSet.set.official, true);
                                    H.S = 190;
                                    H.Z();
                                    return;
                                }
                                return;
                            case 1:
                                StickersActivity.e0(stickersActivity2, view);
                                return;
                            default:
                                StickersActivity.d0(stickersActivity2, view);
                                return;
                        }
                    }
                };
                K.L(stickersActivity.f42006x.contains(Long.valueOf(tL_messages_stickerSet.set.f27028id)));
                arrayList.add(K);
                arrayList4 = arrayList4;
            }
            f41Var.L();
            f41Var.U();
            if (i17 != 1 && i17 != 5) {
                arrayList.add(org.telegram.ui.Components.r31.C(null));
            } else if (i17 == 1) {
                arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131748681, null)));
            }
        }
        if (stickersActivity.f42000e.size() > 3) {
            i10 = 0;
            stickersActivity.f42000e = new ArrayList(stickersActivity.f42000e.subList(0, 3));
            z10 = true;
        } else {
            i10 = 0;
            z10 = false;
        }
        if (i17 == 5 && !stickersActivity.f42000e.isEmpty()) {
            if (stickersActivity.d.size() > 0) {
                arrayList.add(org.telegram.ui.Components.r31.C(null));
            }
            if (i17 == 5) {
                i13 = 2131750836;
            } else {
                i13 = 2131750834;
            }
            arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(i13, null)));
            ArrayList arrayList5 = stickersActivity.f42000e;
            int size4 = arrayList5.size();
            while (i10 < size4) {
                Object obj2 = arrayList5.get(i10);
                i10++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i27 = org.telegram.ui.Cells.p3.f29800b;
                org.telegram.ui.Components.r31 K2 = org.telegram.ui.Components.r31.K(org.telegram.ui.Cells.p3.class);
                K2.G = stickerSetCovered;
                K2.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f49361b;

                    {
                        this.f49361b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i272 = i20;
                        final StickersActivity stickersActivity2 = this.f49361b;
                        switch (i272) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.f8)) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = f8Var.getStickersSet();
                                    org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(stickersActivity2, f8Var);
                                    H.c(2131232051, org.telegram.messenger.bd.M0(2131744868, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(2131232203, org.telegram.messenger.bd.M0(2131744873, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(2131232330, org.telegram.messenger.bd.M0(2131744861, null), new qv0(16, stickersActivity2, f8Var), false);
                                    H.l(2131232363, org.telegram.messenger.bd.M0(2131744856, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String M06 = org.telegram.messenger.bd.M0(2131744865, null);
                                    H.m(2131232108, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, M06, !stickersSet.set.official, true);
                                    H.S = 190;
                                    H.Z();
                                    return;
                                }
                                return;
                            case 1:
                                StickersActivity.e0(stickersActivity2, view);
                                return;
                            default:
                                StickersActivity.d0(stickersActivity2, view);
                                return;
                        }
                    }
                };
                K2.f37635t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.f27028id));
                arrayList.add(K2);
                arrayList5 = arrayList5;
                i20 = 2;
            }
            if (z10) {
                org.telegram.ui.Components.r31 c2 = org.telegram.ui.Components.r31.c(8, 2131232039, org.telegram.messenger.bd.M0(2131745348, null));
                c2.f37632q = true;
                arrayList.add(c2);
            }
            i11 = 5;
        } else {
            i11 = 5;
        }
        if (i17 == i11) {
            if (i17 == i11) {
                i12 = 2131751186;
            } else {
                i12 = 2131744876;
            }
            arrayList.add(org.telegram.ui.Components.r31.C(stickersActivity.m0(org.telegram.messenger.bd.M0(i12, null))));
        }
    }

    public static void i0(StickersActivity stickersActivity, int i3) {
        StickersActivity stickersActivity2;
        int i10;
        String M0;
        TextView textView;
        int i11 = 0;
        if (i3 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.d.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i12);
                if (stickersActivity.f42006x.contains(Long.valueOf(tL_messages_stickerSet.set.f27028id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.q0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.oo0 N0 = org.telegram.ui.Components.oo0.N0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            N0.f36887l2 = new mr0(stickersActivity, 2);
            N0.show();
        } else if (i3 == 0 || i3 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.f42006x.size());
            int size2 = stickersActivity.d.size();
            for (int i13 = 0; i13 < size2; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i13);
                if (stickersActivity.f42006x.contains(Long.valueOf(tL_messages_stickerSet2.set.f27028id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i3 == 1) {
                        alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.a0(null, null, 2131751495, org.telegram.messenger.bd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.a0(null, null, 2131751494, Integer.valueOf(size3));
                        M0 = org.telegram.messenger.bd.M0(2131751599, null);
                    } else {
                        alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.a0(null, null, 2131754142, org.telegram.messenger.bd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.a0(null, null, 2131754141, Integer.valueOf(size3));
                        M0 = org.telegram.messenger.bd.M0(2131754172, null);
                    }
                    alertDialog$Builder.k(M0, new k2.y(stickersActivity, arrayList, i3, 17));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    stickersActivity.showDialog(s1Var);
                    if (i3 == 1 && (textView = (TextView) s1Var.d(-1)) != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                        return;
                    }
                    return;
                }
                int size4 = stickersActivity.d.size();
                while (true) {
                    if (i11 < size4) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i11);
                        if (stickersActivity.f42006x.contains(Long.valueOf(tL_messages_stickerSet3.set.f27028id))) {
                            if (i3 == 0) {
                                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(stickersActivity.currentAccount);
                                Activity parentActivity = stickersActivity.getParentActivity();
                                if (!tL_messages_stickerSet3.set.archived) {
                                    i10 = 1;
                                } else {
                                    i10 = 2;
                                }
                                stickersActivity2 = stickersActivity;
                                b02.f2(parentActivity, tL_messages_stickerSet3, i10, stickersActivity2, true, true);
                            } else {
                                stickersActivity2 = stickersActivity;
                                if (i3 == 1) {
                                    org.telegram.messenger.li.b0(stickersActivity2.currentAccount).f2(stickersActivity2.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity2, true, true);
                                } else if (i3 == 2) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity2.q0(tL_messages_stickerSet3));
                                        stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                } else if (i3 == 3) {
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.q0(tL_messages_stickerSet3)));
                                        org.telegram.ui.Components.fc.j(stickersActivity2).j();
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                    }
                                } else if (i3 == 4) {
                                    HashSet hashSet = stickersActivity2.f42006x;
                                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f27028id))) {
                                        hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.f27028id));
                                    } else {
                                        hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f27028id));
                                    }
                                    stickersActivity2.f41997a.f35594g3.O(true);
                                    stickersActivity2.n0();
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
                stickersActivity2.o0();
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28292z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28275y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        int i3 = this.f42004s;
        if (i3 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131744867, null));
        } else if (i3 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131748687, null));
        } else if (i3 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751197, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 14));
        org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
        l10.c(2, 2131232363, null, null, org.telegram.messenger.g0.L(54.0f), null);
        l10.c(0, 2131232051, null, null, org.telegram.messenger.g0.L(54.0f), null);
        this.h = l10.c(1, 2131232108, null, null, org.telegram.messenger.g0.L(54.0f), null);
        if (i3 == 5 && (arrayList = this.f42005w) != null) {
            this.d = arrayList;
        } else {
            this.d = new ArrayList(org.telegram.messenger.hp.s1(this.currentAccount).w0(org.telegram.messenger.li.b0(this.currentAccount).s0(i3)));
        }
        this.f42000e = p0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(this, new org.telegram.messenger.n10(this) {
            public final StickersActivity f50381b;

            {
                this.f50381b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.h0(this.f50381b, (ArrayList) obj, (org.telegram.ui.Components.f41) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.f50381b, (ArrayList) obj2);
                        return;
                }
            }
        }, new w41(this), new w41(this));
        this.f41997a = l41Var;
        l41Var.r1();
        this.f41997a.setFocusable(true);
        this.f41997a.setSectionsDrawBackground(true);
        this.f41997a.setTag(7);
        this.f41997a.E1(new org.telegram.messenger.n10(this) {
            public final StickersActivity f50381b;

            {
                this.f50381b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.h0(this.f50381b, (ArrayList) obj, (org.telegram.ui.Components.f41) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.f50381b, (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        kg.f0 f0Var = new kg.f0(this, 9);
        this.f41998b = f0Var;
        f0Var.j1(1);
        this.f41997a.setLayoutManager(this.f41998b);
        frameLayout.addView(this.f41997a, b8.mf.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.f23333x0;
        int i12 = this.f42004s;
        if (i3 == i11) {
            if (((Integer) objArr[0]).intValue() == i12) {
                this.f42001f.clear();
            }
            this.f41997a.f35594g3.O(true);
        } else if (i3 != org.telegram.messenger.hs.f23347z0 && i3 != org.telegram.messenger.hs.A0) {
            if (i3 == org.telegram.messenger.hs.Z0 && ((Integer) objArr[0]).intValue() == i12) {
                this.f41997a.f35594g3.O(true);
            }
        } else {
            this.f41997a.f35594g3.O(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f41997a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41997a, 16, new Class[]{org.telegram.ui.Cells.f8.class, org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.q8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41997a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41997a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41997a, 8192, new Class[]{org.telegram.ui.Cells.f8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41997a, 16384, new Class[]{org.telegram.ui.Cells.f8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28008k7));
        org.telegram.ui.Components.z21 z21Var = this.f41999c;
        if (z21Var != null) {
            arrayList.addAll(z21Var.U());
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final CharSequence m0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return str;
    }

    public final void n0() {
        HashSet hashSet = this.f42006x;
        int size = hashSet.size();
        boolean s6 = this.simpleActionBar.s();
        int i3 = 0;
        if (size > 0) {
            if (hashSet.size() > 0) {
                ArrayList arrayList = this.d;
                int size2 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        break;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.f27028id))) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet.official && !stickerSet.emojis) {
                            i3 = 8;
                            break;
                        }
                    }
                }
                if (this.h.getVisibility() != i3) {
                    this.h.setVisibility(i3);
                }
            }
            this.simpleActionBar.x(size, s6);
            if (!s6) {
                this.simpleActionBar.B();
                this.f41997a.z1(true);
                if (!org.telegram.messenger.az.R && this.f42004s != 5) {
                    org.telegram.messenger.az.R = true;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    edit.putBoolean("stickersReorderingHintUsed", org.telegram.messenger.az.R);
                    edit.apply();
                    org.telegram.ui.Components.ac.g(this, new org.telegram.ui.Components.zj0(getParentActivity(), org.telegram.messenger.bd.M0(2131744860, null)), 3250).j();
                }
            }
        } else if (s6) {
            this.simpleActionBar.r();
            this.f41997a.z1(false);
            r0();
        }
    }

    public final void o0() {
        this.f42006x.clear();
        this.f41997a.f35594g3.O(true);
        n0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f42006x.isEmpty()) {
            if (z10) {
                o0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.currentAccount);
        int i3 = this.f42004s;
        b02.B(i3);
        if (i3 == 0) {
            org.telegram.messenger.li.b0(this.currentAccount).x();
            org.telegram.messenger.li.b0(this.currentAccount).B(1);
            org.telegram.messenger.li.b0(this.currentAccount).B(5);
        } else if (i3 == 6) {
            org.telegram.messenger.li.b0(this.currentAccount).w();
            org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.A0);
        }
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23333x0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.Z0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23347z0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23230f5);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f42004s == 6) {
            org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.A0);
        }
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23333x0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.Z0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23347z0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23230f5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.l41 l41Var = this.f41997a;
        if (l41Var != null) {
            l41Var.f35594g3.O(true);
        }
    }

    public final ArrayList p0() {
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.currentAccount);
        ArrayList[] arrayListArr = b02.f24051t0;
        if (this.f42004s == 5) {
            ArrayList arrayList = new ArrayList(arrayListArr[1]);
            int i3 = 0;
            while (i3 < arrayList.size()) {
                if (arrayList.get(i3) == null || b02.B0(((TLRPC.StickerSetCovered) arrayList.get(i3)).set.f27028id, false)) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
            return arrayList;
        }
        return arrayListArr[0];
    }

    public final String q0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        String str;
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(org.telegram.messenger.hp.s1(this.currentAccount).V2);
        sb2.append("/");
        if (tL_messages_stickerSet.set.emojis) {
            str = "addemoji";
        } else {
            str = "addstickers";
        }
        return String.format(locale, a1.g.s(sb2, str, "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void r0() {
        boolean z10;
        boolean z11;
        if (this.f42003r) {
            this.f42003r = false;
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.currentAccount);
            long[] jArr = b02.Y;
            ArrayList[] arrayListArr = b02.H;
            int i3 = this.f42004s;
            jArr[i3] = org.telegram.messenger.li.q(arrayListArr[i3]);
            this.f42002n++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            if (i3 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_reorderStickerSets.masks = z10;
            if (i3 == 5) {
                z11 = true;
            } else {
                z11 = false;
            }
            tL_messages_reorderStickerSets.emojis = z11;
            int i10 = 0;
            while (i10 < this.d.size()) {
                i10 = a1.g.h(i10, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i10)).set.f27028id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new l(this, 22));
            org.telegram.messenger.hs.f(this.currentAccount).k(org.telegram.messenger.hs.f23333x0, Integer.valueOf(i3), Boolean.TRUE);
            if (org.telegram.messenger.az.X) {
                org.telegram.messenger.az.P();
                org.telegram.ui.Components.fc.a0(this).I(2131624017, org.telegram.messenger.bd.M0(2131751338, null), org.telegram.messenger.bd.M0(2131751337, null)).j();
                this.f41997a.f35594g3.O(true);
            }
        }
    }

    public final void s0(org.telegram.ui.Cells.f8 f8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = f8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.f27028id);
        HashSet hashSet = this.f42006x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.f27028id));
            f8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.f27028id));
            f8Var.b(true, true);
        }
        this.f41997a.f35594g3.O(true);
        n0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
