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
public class StickersActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public org.telegram.ui.Components.v51 f34053a;
    private int archivedRow;
    public br f34054b;
    public org.telegram.ui.Components.i41 f34055c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList e;
    public final ArrayList f34056f;
    private int featuredRow;
    public org.telegram.ui.ActionBar.p5 h;
    private int largeEmojiRow;
    public int f34057n;
    public boolean f34058r;
    public final int f34059s;
    private int suggestRow;
    public ArrayList f34060w;
    public final HashSet f34061x;
    public final u61 f34062y;

    public StickersActivity(int i10, ArrayList arrayList) {
        super(null);
        this.f34056f = new ArrayList();
        this.f34061x = new HashSet();
        this.f34062y = new u61(this, 0);
        this.f34059s = i10;
        this.f34060w = arrayList;
    }

    public static void Z(StickersActivity stickersActivity, org.telegram.ui.Components.b51 b51Var, View view) {
        boolean z10;
        boolean z11;
        int i10 = stickersActivity.f34059s;
        Object obj = b51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (stickersActivity.f34061x.isEmpty()) {
                ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
                if (arrayList != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null && stickerSet.emojis) {
                        ArrayList arrayList2 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.f19814id = stickerSet2.f19821id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        arrayList2.add(tL_inputStickerSetID);
                        stickersActivity.showDialog(new org.telegram.ui.Components.cv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
                        return;
                    }
                    stickersActivity.showDialog(new org.telegram.ui.Components.dx0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                    return;
                }
                return;
            }
            stickersActivity.s0((org.telegram.ui.Cells.k8) view);
            return;
        }
        boolean z12 = true;
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.f19814id = stickerSet3.f19821id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i10 == 5) {
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(tL_inputStickerSetID2);
                stickersActivity.showDialog(new org.telegram.ui.Components.cv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
                return;
            }
            stickersActivity.showDialog(new org.telegram.ui.Components.dx0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
            return;
        }
        switch (b51Var.d) {
            case 1:
            case 8:
                if (i10 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList p02 = stickersActivity.p0();
                    if (p02 != null) {
                        for (int i11 = 0; i11 < p02.size(); i11++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) p02.get(i11);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.f19814id = stickerSet4.f19821id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    org.telegram.messenger.vi.b0(stickersActivity.currentAccount).d1(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.cv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    return;
                }
                org.telegram.ui.Components.i41 i41Var = new org.telegram.ui.Components.i41(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.x41(stickersActivity.getParentActivity(), new y61(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                stickersActivity.f34055c = i41Var;
                i41Var.show();
                return;
            case 2:
                stickersActivity.presentFragment(new n(i10));
                return;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                return;
            case 4:
                stickersActivity.presentFragment(new oz0());
                return;
            case 5:
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(stickersActivity, view);
                if (org.telegram.messenger.uz.E == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.i(new eh(4, view), org.telegram.messenger.dd.L0(2131744427, null), z10);
                if (org.telegram.messenger.uz.E == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.i(new eh(5, view), org.telegram.messenger.dd.L0(2131744426, null), z11);
                if (org.telegram.messenger.uz.E != 2) {
                    z12 = false;
                }
                H.i(new eh(6, view), org.telegram.messenger.dd.L0(2131744425, null), z12);
                H.Z();
                return;
            case 6:
                org.telegram.messenger.uz.T0 = !org.telegram.messenger.uz.T0;
                SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                edit.putBoolean("allowBigEmoji", org.telegram.messenger.uz.T0);
                edit.apply();
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.uz.T0);
                return;
            case 7:
                org.telegram.messenger.uz.P();
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.uz.X);
                return;
            case 9:
                org.telegram.messenger.uz.F = !org.telegram.messenger.uz.F;
                SharedPreferences.Editor edit2 = org.telegram.messenger.wp.d1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", org.telegram.messenger.uz.F);
                edit2.apply();
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.uz.F);
                return;
            default:
                return;
        }
    }

    public static void a0(StickersActivity stickersActivity, ArrayList arrayList) {
        u61 u61Var = stickersActivity.f34062y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Object obj2 = ((org.telegram.ui.Components.b51) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.d = arrayList2;
        stickersActivity.f34058r = true;
        Collections.sort(org.telegram.messenger.vi.b0(stickersActivity.currentAccount).s0(stickersActivity.f34059s), new nt(stickersActivity, 3));
        org.telegram.messenger.i0.r(u61Var);
        org.telegram.messenger.i0.h3(u61Var, 1000L);
    }

    public static void b0(StickersActivity stickersActivity, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(stickersActivity.currentAccount);
        Activity parentActivity = stickersActivity.getParentActivity();
        if (!tL_messages_stickerSet.set.archived) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        b02.f2(parentActivity, tL_messages_stickerSet, i10, stickersActivity, true, true);
    }

    public static void d0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.f34056f;
        if (arrayList.contains(Long.valueOf(stickerSet.set.f19821id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.f19821id));
        s3Var.f23001f.a(true, true);
        if (s3Var.f23005w) {
            org.telegram.messenger.vi.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            org.telegram.messenger.vi.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    public static void e0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.k8 k8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSetCovered stickerSetCovered2;
        ArrayList arrayList = stickersActivity.f34056f;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof org.telegram.ui.Cells.k8) && (stickersSet = (k8Var = (org.telegram.ui.Cells.k8) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i10 = 0;
                if (k8Var.D == view) {
                    ArrayList arrayList2 = stickersActivity.getMediaDataController().f18674s0[1];
                    while (true) {
                        if (i10 < arrayList2.size()) {
                            if (stickersSet.set.f19821id == ((TLRPC.StickerSetCovered) arrayList2.get(i10)).set.f19821id) {
                                stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i10);
                                break;
                            }
                            i10++;
                        } else {
                            stickerSetCovered = null;
                            break;
                        }
                    }
                    if (stickerSetCovered != null) {
                        if (!arrayList.contains(Long.valueOf(stickerSetCovered.set.f19821id))) {
                            arrayList.add(Long.valueOf(stickerSetCovered.set.f19821id));
                        } else {
                            return;
                        }
                    }
                    org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(stickersActivity.currentAccount);
                    Activity parentActivity = stickersActivity.getParentActivity();
                    if (stickerSetCovered == null) {
                        stickerSetCovered2 = stickersSet;
                    } else {
                        stickerSetCovered2 = stickerSetCovered;
                    }
                    b02.f2(parentActivity, stickerSetCovered2, 2, stickersActivity, false, false);
                } else if (k8Var.E == view) {
                    org.telegram.messenger.vi.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                } else if (k8Var.F == view) {
                    stickersActivity.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) stickersActivity, 11, false));
                }
            }
        }
    }

    public static void f0(StickersActivity stickersActivity, ArrayList arrayList, int i10) {
        int i11;
        int i12;
        int i13;
        long[] jArr;
        boolean z10;
        int i14;
        boolean z11;
        stickersActivity.o0();
        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(stickersActivity.currentAccount);
        int i15 = stickersActivity.f34059s;
        boolean z12 = true;
        if (i10 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        long[] jArr2 = b02.X;
        ArrayList[] arrayListArr = b02.G;
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i16 = 0;
        while (i16 < size) {
            TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) arrayList.get(i16);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.f19814id = stickerSet.f19821id;
            arrayList2.add(tL_inputStickerSetID);
            if (i11 != 0) {
                if (i11 == z12) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                stickerSet.archived = z11;
            }
            int size2 = arrayListArr[i15].size();
            int i17 = 0;
            while (true) {
                if (i17 < size2) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayListArr[i15].get(i17);
                    z10 = z12;
                    i14 = i11;
                    i13 = i15;
                    jArr = jArr2;
                    if (tL_messages_stickerSet.set.f19821id == tL_inputStickerSetID.f19814id) {
                        arrayListArr[i13].remove(i17);
                        b02.I.l(tL_messages_stickerSet.set.f19821id);
                        b02.J.l(tL_messages_stickerSet.set.f19821id);
                        b02.N.remove(tL_messages_stickerSet.set.short_name);
                        break;
                    }
                    i17++;
                    i11 = i14;
                    i15 = i13;
                    z12 = z10;
                    jArr2 = jArr;
                } else {
                    i13 = i15;
                    jArr = jArr2;
                    z10 = z12;
                    i14 = i11;
                    break;
                }
            }
            i16++;
            i11 = i14;
            i15 = i13;
            z12 = z10;
            jArr2 = jArr;
        }
        int i18 = i15;
        boolean z13 = z12;
        int i19 = i11;
        long q6 = org.telegram.messenger.vi.q(arrayListArr[i18]);
        jArr2[i18] = q6;
        b02.J1(i18, b02.Y[i18], q6, arrayListArr[i18]);
        org.telegram.messenger.at notificationCenter = b02.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i18);
        objArr[z13 ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(org.telegram.messenger.at.f14814x0, objArr);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i19 != 0) {
            i12 = i19;
            if (i12 == z13) {
                tL_messages_toggleStickerSets.archive = z13;
            }
        } else {
            i12 = i19;
            tL_messages_toggleStickerSets.uninstall = z13;
        }
        b02.getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new org.telegram.messenger.pf(b02, i12, stickersActivity, i18));
    }

    public static void g0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.x9) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            String Q = org.telegram.messenger.vi.b0(stickersActivity.currentAccount).Q();
            if (Q != null) {
                if (Q.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.f5 m10 = org.telegram.ui.Components.f5.m(stickersActivity.currentAccount, Long.parseLong(Q.substring(9)), null, 2);
                        m10.a(x9Var.getValueBackupImageView());
                        x9Var.getValueBackupImageView().setImageDrawable(m10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.vi.b0(stickersActivity.currentAccount).f18670r.get(Q);
                if (tL_availableReaction != null) {
                    x9Var.getValueBackupImageView().getImageReceiver().q0(org.telegram.messenger.jc.b(tL_availableReaction.center_icon), "100_100_lastreactframe", org.telegram.messenger.v5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.t6.f20873a7, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void h0(final StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.q51 q51Var) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String L0;
        String str;
        int i17;
        ArrayList arrayList2 = stickersActivity.f34056f;
        int i18 = stickersActivity.f34059s;
        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(stickersActivity.currentAccount);
        org.telegram.ui.Components.v51 v51Var = stickersActivity.f34053a;
        if (v51Var == null || (!v51Var.f31187j3 && !stickersActivity.f34058r && stickersActivity.f34057n <= 0)) {
            if (i18 == 5) {
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.wp.r1(stickersActivity.currentAccount).w0(b02.s0(i18)));
                stickersActivity.f34060w = arrayList3;
                stickersActivity.d = arrayList3;
            } else {
                stickersActivity.d = new ArrayList(org.telegram.messenger.wp.r1(stickersActivity.currentAccount).w0(b02.s0(i18)));
            }
        }
        stickersActivity.e = new ArrayList(stickersActivity.p0());
        int i19 = 0;
        while (i19 < stickersActivity.e.size()) {
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.e.get(i19)).set.f19821id))) {
                stickersActivity.e.remove(i19);
                i19--;
            }
            i19++;
        }
        int size = stickersActivity.e.size();
        int i20 = b02.f18637b0[i18];
        int size2 = b02.s0(5).size();
        final int i21 = 2;
        if (i18 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            String L02 = org.telegram.messenger.dd.L0(2131750834, null);
            String str2 = "";
            if (size <= 0) {
                str = "";
            } else {
                str = org.telegram.messenger.dd.E(size, ',');
            }
            arrayList.add(org.telegram.ui.Components.b51.d(1, 2131232038, L02, str));
            if (i20 > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i18 == 0) {
                    arrayList.add(org.telegram.ui.Components.b51.d(2, 2131232015, org.telegram.messenger.dd.L0(2131754128, null), org.telegram.messenger.dd.E(i20, ',')));
                } else {
                    if (i18 == 5) {
                        i17 = 2131754134;
                    } else {
                        i17 = 2131754133;
                    }
                    arrayList.add(org.telegram.ui.Components.b51.f(org.telegram.messenger.dd.L0(i17, null), org.telegram.messenger.dd.E(i20, ','), 2));
                }
            }
            arrayList.size();
            String L03 = org.telegram.messenger.dd.L0(2131751197, null);
            if (size2 > 0) {
                str2 = org.telegram.messenger.dd.E(size2, ',');
            }
            org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(43);
            b51Var.d = 3;
            b51Var.f24642k = 2131232036;
            b51Var.f24643l = L03;
            b51Var.f24644m = str2;
            arrayList.add(b51Var);
        } else if (i20 > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i18 == 0) {
                arrayList.add(org.telegram.ui.Components.b51.d(2, 2131232015, org.telegram.messenger.dd.L0(2131754128, null), org.telegram.messenger.dd.E(i20, ',')));
            } else {
                if (i18 == 5) {
                    i10 = 2131754134;
                } else {
                    i10 = 2131754133;
                }
                arrayList.add(org.telegram.ui.Components.b51.f(org.telegram.messenger.dd.L0(i10, null), org.telegram.messenger.dd.E(i20, ','), 2));
            }
            if (i18 == 1) {
                arrayList.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.L0(2131754129, null)));
            }
        }
        if (i18 == 0) {
            arrayList.size();
            String L04 = org.telegram.messenger.dd.L0(2131751351, null);
            org.telegram.ui.Components.b51 b51Var2 = new org.telegram.ui.Components.b51(43);
            b51Var2.d = 4;
            b51Var2.f24642k = 2131232034;
            b51Var2.f24643l = L04;
            b51Var2.F = new s3(stickersActivity, 22);
            arrayList.add(b51Var2);
            if (i18 == 5) {
                i16 = 2131751186;
            } else {
                i16 = 2131744884;
            }
            arrayList.add(org.telegram.ui.Components.b51.C(stickersActivity.m0(org.telegram.messenger.dd.L0(i16, null))));
            arrayList.add(org.telegram.ui.Components.b51.u(org.telegram.messenger.dd.L0(2131744865, null)));
            stickersActivity.suggestRow = arrayList.size();
            String L05 = org.telegram.messenger.dd.L0(2131744428, null);
            int i22 = org.telegram.messenger.uz.E;
            if (i22 != 0) {
                if (i22 != 1) {
                    L0 = org.telegram.messenger.dd.L0(2131744425, null);
                } else {
                    L0 = org.telegram.messenger.dd.L0(2131744426, null);
                }
            } else {
                L0 = org.telegram.messenger.dd.L0(2131744427, null);
            }
            org.telegram.ui.Components.b51 b51Var3 = new org.telegram.ui.Components.b51(43);
            b51Var3.d = 5;
            b51Var3.f24643l = L05;
            b51Var3.f24644m = L0;
            arrayList.add(b51Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.b51 i23 = org.telegram.ui.Components.b51.i(6, org.telegram.messenger.dd.L0(2131749044, null));
            i23.L(org.telegram.messenger.uz.T0);
            arrayList.add(i23);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.b51 i24 = org.telegram.ui.Components.b51.i(7, org.telegram.messenger.dd.L0(2131751340, null));
            i24.L(org.telegram.messenger.uz.X);
            arrayList.add(i24);
            arrayList.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.L0(2131751339, null)));
        }
        if (i18 == 5) {
            org.telegram.ui.Components.b51 i25 = org.telegram.ui.Components.b51.i(9, org.telegram.messenger.dd.L0(2131744442, null));
            i25.L(org.telegram.messenger.uz.F);
            arrayList.add(i25);
            arrayList.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.L0(2131744441, null)));
        }
        if (stickersActivity.d.size() > 0) {
            q51Var.V();
            if (i18 == 5 || (!stickersActivity.e.isEmpty() && i18 == 0)) {
                if (i18 == 5) {
                    i15 = 2131752119;
                } else {
                    i15 = 2131752118;
                }
                arrayList.add(org.telegram.ui.Components.b51.u(org.telegram.messenger.dd.L0(i15, null)));
            }
            q51Var.M();
            ArrayList arrayList4 = stickersActivity.d;
            int size3 = arrayList4.size();
            int i26 = 0;
            while (i26 < size3) {
                Object obj = arrayList4.get(i26);
                i26++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i27 = org.telegram.ui.Cells.j8.f22096b;
                org.telegram.ui.Components.b51 K = org.telegram.ui.Components.b51.K(org.telegram.ui.Cells.j8.class);
                K.G = tL_messages_stickerSet;
                K.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f41555b;

                    {
                        this.f41555b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i28 = r2;
                        final StickersActivity stickersActivity2 = this.f41555b;
                        switch (i28) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(stickersActivity2, k8Var);
                                    H.c(2131232050, org.telegram.messenger.dd.L0(2131744876, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.vi.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(2131232202, org.telegram.messenger.dd.L0(2131744881, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.vi.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(2131232329, org.telegram.messenger.dd.L0(2131744869, null), new y01(5, stickersActivity2, k8Var), false);
                                    H.l(2131232362, org.telegram.messenger.dd.L0(2131744864, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.vi.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String L06 = org.telegram.messenger.dd.L0(2131744873, null);
                                    H.m(2131232107, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.vi.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, L06, !stickersSet.set.official, true);
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
                    public final StickersActivity f41555b;

                    {
                        this.f41555b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i28 = r2;
                        final StickersActivity stickersActivity2 = this.f41555b;
                        switch (i28) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(stickersActivity2, k8Var);
                                    H.c(2131232050, org.telegram.messenger.dd.L0(2131744876, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.vi.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(2131232202, org.telegram.messenger.dd.L0(2131744881, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.vi.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(2131232329, org.telegram.messenger.dd.L0(2131744869, null), new y01(5, stickersActivity2, k8Var), false);
                                    H.l(2131232362, org.telegram.messenger.dd.L0(2131744864, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.vi.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String L06 = org.telegram.messenger.dd.L0(2131744873, null);
                                    H.m(2131232107, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.vi.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, L06, !stickersSet.set.official, true);
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
                K.L(stickersActivity.f34061x.contains(Long.valueOf(tL_messages_stickerSet.set.f19821id)));
                arrayList.add(K);
                arrayList4 = arrayList4;
            }
            q51Var.L();
            q51Var.U();
            if (i18 != 1 && i18 != 5) {
                arrayList.add(org.telegram.ui.Components.b51.C(null));
            } else if (i18 == 1) {
                arrayList.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.L0(2131748688, null)));
            }
        }
        if (stickersActivity.e.size() > 3) {
            i11 = 0;
            stickersActivity.e = new ArrayList(stickersActivity.e.subList(0, 3));
            z10 = true;
        } else {
            i11 = 0;
            z10 = false;
        }
        if (i18 == 5 && !stickersActivity.e.isEmpty()) {
            if (stickersActivity.d.size() > 0) {
                arrayList.add(org.telegram.ui.Components.b51.C(null));
            }
            if (i18 == 5) {
                i14 = 2131750836;
            } else {
                i14 = 2131750834;
            }
            arrayList.add(org.telegram.ui.Components.b51.u(org.telegram.messenger.dd.L0(i14, null)));
            ArrayList arrayList5 = stickersActivity.e;
            int size4 = arrayList5.size();
            while (i11 < size4) {
                Object obj2 = arrayList5.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i28 = org.telegram.ui.Cells.r3.f22870b;
                org.telegram.ui.Components.b51 K2 = org.telegram.ui.Components.b51.K(org.telegram.ui.Cells.r3.class);
                K2.G = stickerSetCovered;
                K2.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f41555b;

                    {
                        this.f41555b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i282 = i21;
                        final StickersActivity stickersActivity2 = this.f41555b;
                        switch (i282) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(stickersActivity2, k8Var);
                                    H.c(2131232050, org.telegram.messenger.dd.L0(2131744876, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.vi.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(2131232202, org.telegram.messenger.dd.L0(2131744881, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.vi.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(2131232329, org.telegram.messenger.dd.L0(2131744869, null), new y01(5, stickersActivity2, k8Var), false);
                                    H.l(2131232362, org.telegram.messenger.dd.L0(2131744864, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.vi.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String L06 = org.telegram.messenger.dd.L0(2131744873, null);
                                    H.m(2131232107, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        return;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                                        return;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.vi.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, L06, !stickersSet.set.official, true);
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
                K2.f24651t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.f19821id));
                arrayList.add(K2);
                arrayList5 = arrayList5;
                i21 = 2;
            }
            if (z10) {
                org.telegram.ui.Components.b51 c10 = org.telegram.ui.Components.b51.c(8, 2131232038, org.telegram.messenger.dd.L0(2131745356, null));
                c10.f24648q = true;
                arrayList.add(c10);
            }
            i12 = 5;
        } else {
            i12 = 5;
        }
        if (i18 == i12) {
            if (i18 == i12) {
                i13 = 2131751186;
            } else {
                i13 = 2131744884;
            }
            arrayList.add(org.telegram.ui.Components.b51.C(stickersActivity.m0(org.telegram.messenger.dd.L0(i13, null))));
        }
    }

    public static void i0(StickersActivity stickersActivity, int i10) {
        StickersActivity stickersActivity2;
        int i11;
        String L0;
        TextView textView;
        int i12 = 0;
        if (i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.d.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i13);
                if (stickersActivity.f34061x.contains(Long.valueOf(tL_messages_stickerSet.set.f19821id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.q0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.pp0 N0 = org.telegram.ui.Components.pp0.N0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            N0.f29480k2 = new gt0(stickersActivity, 2);
            N0.show();
        } else if (i10 == 0 || i10 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.f34061x.size());
            int size2 = stickersActivity.d.size();
            for (int i14 = 0; i14 < size2; i14++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i14);
                if (stickersActivity.f34061x.contains(Long.valueOf(tL_messages_stickerSet2.set.f19821id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i10 == 1) {
                        alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.a0(null, null, 2131751495, org.telegram.messenger.dd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.a0(null, null, 2131751494, Integer.valueOf(size3));
                        L0 = org.telegram.messenger.dd.L0(2131751599, null);
                    } else {
                        alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.a0(null, null, 2131754142, org.telegram.messenger.dd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.a0(null, null, 2131754141, Integer.valueOf(size3));
                        L0 = org.telegram.messenger.dd.L0(2131754172, null);
                    }
                    alertDialog$Builder.k(L0, new ag.b0(stickersActivity, arrayList, i10, 16));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    stickersActivity.showDialog(x1Var);
                    if (i10 == 1 && (textView = (TextView) x1Var.d(-1)) != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                        return;
                    }
                    return;
                }
                int size4 = stickersActivity.d.size();
                while (true) {
                    if (i12 < size4) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i12);
                        if (stickersActivity.f34061x.contains(Long.valueOf(tL_messages_stickerSet3.set.f19821id))) {
                            if (i10 == 0) {
                                org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(stickersActivity.currentAccount);
                                Activity parentActivity = stickersActivity.getParentActivity();
                                if (!tL_messages_stickerSet3.set.archived) {
                                    i11 = 1;
                                } else {
                                    i11 = 2;
                                }
                                stickersActivity2 = stickersActivity;
                                b02.f2(parentActivity, tL_messages_stickerSet3, i11, stickersActivity2, true, true);
                            } else {
                                stickersActivity2 = stickersActivity;
                                if (i10 == 1) {
                                    org.telegram.messenger.vi.b0(stickersActivity2.currentAccount).f2(stickersActivity2.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity2, true, true);
                                } else if (i10 == 2) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity2.q0(tL_messages_stickerSet3));
                                        stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131744864, null)), 500);
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                } else if (i10 == 3) {
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.q0(tL_messages_stickerSet3)));
                                        org.telegram.ui.Components.cc.j(stickersActivity2).j();
                                    } catch (Exception e7) {
                                        org.telegram.messenger.f8.g(e7, true);
                                    }
                                } else if (i10 == 4) {
                                    HashSet hashSet = stickersActivity2.f34061x;
                                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19821id))) {
                                        hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.f19821id));
                                    } else {
                                        hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19821id));
                                    }
                                    stickersActivity2.f34053a.f31183f3.O(true);
                                    stickersActivity2.n0();
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
                stickersActivity2.o0();
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21333z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21314y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        int i10 = this.f34059s;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131744875, null));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131748694, null));
        } else if (i10 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131751197, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new z01(this, 4));
        org.telegram.ui.ActionBar.o5 l4 = this.simpleActionBar.l();
        l4.c(2, 2131232362, null, null, org.telegram.messenger.i0.L(54.0f), null);
        l4.c(0, 2131232050, null, null, org.telegram.messenger.i0.L(54.0f), null);
        this.h = l4.c(1, 2131232107, null, null, org.telegram.messenger.i0.L(54.0f), null);
        if (i10 == 5 && (arrayList = this.f34060w) != null) {
            this.d = arrayList;
        } else {
            this.d = new ArrayList(org.telegram.messenger.wp.r1(this.currentAccount).w0(org.telegram.messenger.vi.b0(this.currentAccount).s0(i10)));
        }
        this.e = p0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(this, new org.telegram.messenger.k20(this) {
            public final StickersActivity f42682b;

            {
                this.f42682b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.h0(this.f42682b, (ArrayList) obj, (org.telegram.ui.Components.q51) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.f42682b, (ArrayList) obj2);
                        return;
                }
            }
        }, new x61(this), new x61(this));
        this.f34053a = v51Var;
        v51Var.r1();
        this.f34053a.setFocusable(true);
        this.f34053a.setSectionsDrawBackground(true);
        this.f34053a.setTag(7);
        this.f34053a.E1(new org.telegram.messenger.k20(this) {
            public final StickersActivity f42682b;

            {
                this.f42682b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.h0(this.f42682b, (ArrayList) obj, (org.telegram.ui.Components.q51) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.f42682b, (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        br brVar = new br(8, this, false);
        this.f34054b = brVar;
        brVar.j1(1);
        this.f34053a.setLayoutManager(this.f34054b);
        frameLayout.addView(this.f34053a, w7.b6.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.at.f14814x0;
        int i13 = this.f34059s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == i13) {
                this.f34056f.clear();
            }
            this.f34053a.f31183f3.O(true);
        } else if (i10 != org.telegram.messenger.at.f14827z0 && i10 != org.telegram.messenger.at.A0) {
            if (i10 == org.telegram.messenger.at.Z0 && ((Integer) objArr[0]).intValue() == i13) {
                this.f34053a.f31183f3.O(true);
            }
        } else {
            this.f34053a.f31183f3.O(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f34053a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34053a, 16, new Class[]{org.telegram.ui.Cells.k8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.t8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34053a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34053a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34053a, 8192, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34053a, 16384, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21060k7));
        org.telegram.ui.Components.i41 i41Var = this.f34055c;
        if (i41Var != null) {
            arrayList.addAll(i41Var.V());
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.f4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        return str;
    }

    public final void n0() {
        HashSet hashSet = this.f34061x;
        int size = hashSet.size();
        boolean s10 = this.simpleActionBar.s();
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
                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.f19821id))) {
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
            this.simpleActionBar.y(size, s10);
            if (!s10) {
                this.simpleActionBar.C();
                this.f34053a.z1(true);
                if (!org.telegram.messenger.uz.R && this.f34059s != 5) {
                    org.telegram.messenger.uz.R = true;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    edit.putBoolean("stickersReorderingHintUsed", org.telegram.messenger.uz.R);
                    edit.apply();
                    org.telegram.ui.Components.wb.g(this, new org.telegram.ui.Components.al0(getParentActivity(), org.telegram.messenger.dd.L0(2131744868, null)), 3250).j();
                }
            }
        } else if (s10) {
            this.simpleActionBar.r();
            this.f34053a.z1(false);
            r0();
        }
    }

    public final void o0() {
        this.f34061x.clear();
        this.f34053a.f31183f3.O(true);
        n0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f34061x.isEmpty()) {
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
        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(this.currentAccount);
        int i10 = this.f34059s;
        b02.B(i10);
        if (i10 == 0) {
            org.telegram.messenger.vi.b0(this.currentAccount).x();
            org.telegram.messenger.vi.b0(this.currentAccount).B(1);
            org.telegram.messenger.vi.b0(this.currentAccount).B(5);
        } else if (i10 == 6) {
            org.telegram.messenger.vi.b0(this.currentAccount).w();
            org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.A0);
        }
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14814x0);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.Z0);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14827z0);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14709f5);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f34059s == 6) {
            org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.A0);
        }
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14814x0);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.Z0);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14827z0);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14709f5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.v51 v51Var = this.f34053a;
        if (v51Var != null) {
            v51Var.f31183f3.O(true);
        }
    }

    public final ArrayList p0() {
        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(this.currentAccount);
        ArrayList[] arrayListArr = b02.f18674s0;
        if (this.f34059s == 5) {
            ArrayList arrayList = new ArrayList(arrayListArr[1]);
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (arrayList.get(i10) == null || b02.B0(((TLRPC.StickerSetCovered) arrayList.get(i10)).set.f19821id, false)) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
            return arrayList;
        }
        return arrayListArr[0];
    }

    public final String q0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        String str;
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(org.telegram.messenger.wp.r1(this.currentAccount).U2);
        sb2.append("/");
        if (tL_messages_stickerSet.set.emojis) {
            str = "addemoji";
        } else {
            str = "addstickers";
        }
        return String.format(locale, a1.g.r(sb2, str, "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void r0() {
        boolean z10;
        boolean z11;
        if (this.f34058r) {
            this.f34058r = false;
            org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(this.currentAccount);
            long[] jArr = b02.X;
            ArrayList[] arrayListArr = b02.G;
            int i10 = this.f34059s;
            jArr[i10] = org.telegram.messenger.vi.q(arrayListArr[i10]);
            this.f34057n++;
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
                i11 = c3.i0.k(i11, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i11)).set.f19821id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new k(this, 22));
            org.telegram.messenger.at.f(this.currentAccount).k(org.telegram.messenger.at.f14814x0, Integer.valueOf(i10), Boolean.TRUE);
            if (org.telegram.messenger.uz.X) {
                org.telegram.messenger.uz.P();
                org.telegram.ui.Components.cc.a0(this).I(2131624017, org.telegram.messenger.dd.L0(2131751338, null), org.telegram.messenger.dd.L0(2131751337, null)).j();
                this.f34053a.f31183f3.O(true);
            }
        }
    }

    public final void s0(org.telegram.ui.Cells.k8 k8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.f19821id);
        HashSet hashSet = this.f34061x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.f19821id));
            k8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.f19821id));
            k8Var.b(true, true);
        }
        this.f34053a.f31183f3.O(true);
        n0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
