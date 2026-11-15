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
public class StickersActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public org.telegram.ui.Components.u41 f43340a;
    private int archivedRow;
    public jg.i0 f43341b;
    public org.telegram.ui.Components.j31 f43342c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList f43343e;
    public final ArrayList f43344f;
    private int featuredRow;
    public org.telegram.ui.ActionBar.d5 h;
    private int largeEmojiRow;
    public int f43345n;
    public boolean f43346r;
    public final int f43347s;
    private int suggestRow;
    public ArrayList f43348w;
    public final HashSet f43349x;
    public final b51 f43350y;

    public StickersActivity(int i7, ArrayList arrayList) {
        super(null);
        this.f43344f = new ArrayList();
        this.f43349x = new HashSet();
        this.f43350y = new b51(this, 0);
        this.f43347s = i7;
        this.f43348w = arrayList;
    }

    public static void Z(StickersActivity stickersActivity, org.telegram.ui.Components.b41 b41Var, View view) {
        boolean z10;
        boolean z11;
        int i7 = stickersActivity.f43347s;
        Object obj = b41Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (stickersActivity.f43349x.isEmpty()) {
                ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
                if (arrayList != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null && stickerSet.emojis) {
                        ArrayList arrayList2 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.f28071id = stickerSet2.f28078id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        arrayList2.add(tL_inputStickerSetID);
                        stickersActivity.showDialog(new org.telegram.ui.Components.wu(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
                        return;
                    }
                    stickersActivity.showDialog(new org.telegram.ui.Components.bw0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
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
            tL_inputStickerSetID2.f28071id = stickerSet3.f28078id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i7 == 5) {
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(tL_inputStickerSetID2);
                stickersActivity.showDialog(new org.telegram.ui.Components.wu(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
                return;
            }
            stickersActivity.showDialog(new org.telegram.ui.Components.bw0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
            return;
        }
        switch (b41Var.d) {
            case 1:
            case 8:
                if (i7 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList p02 = stickersActivity.p0();
                    if (p02 != null) {
                        for (int i10 = 0; i10 < p02.size(); i10++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) p02.get(i10);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.f28071id = stickerSet4.f28078id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    org.telegram.messenger.si.b0(stickersActivity.currentAccount).d1(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.wu(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    return;
                }
                org.telegram.ui.Components.j31 j31Var = new org.telegram.ui.Components.j31(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.x31(stickersActivity.getParentActivity(), new f51(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                stickersActivity.f43342c = j31Var;
                j31Var.show();
                return;
            case 2:
                stickersActivity.presentFragment(new o(i7));
                return;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                return;
            case 4:
                stickersActivity.presentFragment(new zx0());
                return;
            case 5:
                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(stickersActivity, view);
                if (org.telegram.messenger.gz.E == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.i(new sg(4, view), org.telegram.messenger.hd.M0(2131744401, null), z10);
                if (org.telegram.messenger.gz.E == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.i(new sg(5, view), org.telegram.messenger.hd.M0(2131744400, null), z11);
                if (org.telegram.messenger.gz.E != 2) {
                    z12 = false;
                }
                H.i(new sg(6, view), org.telegram.messenger.hd.M0(2131744399, null), z12);
                H.Z();
                return;
            case 6:
                org.telegram.messenger.gz.T0 = !org.telegram.messenger.gz.T0;
                SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                edit.putBoolean("allowBigEmoji", org.telegram.messenger.gz.T0);
                edit.apply();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.T0);
                return;
            case 7:
                org.telegram.messenger.gz.P();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.X);
                return;
            case 9:
                org.telegram.messenger.gz.F = !org.telegram.messenger.gz.F;
                SharedPreferences.Editor edit2 = org.telegram.messenger.np.e1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", org.telegram.messenger.gz.F);
                edit2.apply();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.F);
                return;
            default:
                return;
        }
    }

    public static void a0(StickersActivity stickersActivity, ArrayList arrayList) {
        b51 b51Var = stickersActivity.f43350y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Object obj2 = ((org.telegram.ui.Components.b41) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.d = arrayList2;
        stickersActivity.f43346r = true;
        Collections.sort(org.telegram.messenger.si.b0(stickersActivity.currentAccount).s0(stickersActivity.f43347s), new qs(stickersActivity, 3));
        org.telegram.messenger.g0.r(b51Var);
        org.telegram.messenger.g0.i3(b51Var, 1000L);
    }

    public static void b0(StickersActivity stickersActivity, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i7;
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(stickersActivity.currentAccount);
        Activity parentActivity = stickersActivity.getParentActivity();
        if (!tL_messages_stickerSet.set.archived) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        b02.f2(parentActivity, tL_messages_stickerSet, i7, stickersActivity, true, true);
    }

    public static void d0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.q3 q3Var = (org.telegram.ui.Cells.q3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = q3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.f43344f;
        if (arrayList.contains(Long.valueOf(stickerSet.set.f28078id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.f28078id));
        q3Var.f31266f.a(true, true);
        if (q3Var.f31270w) {
            org.telegram.messenger.si.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            org.telegram.messenger.si.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    public static void e0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.f8 f8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSetCovered stickerSetCovered2;
        ArrayList arrayList = stickersActivity.f43344f;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof org.telegram.ui.Cells.f8) && (stickersSet = (f8Var = (org.telegram.ui.Cells.f8) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i7 = 0;
                if (f8Var.E == view) {
                    ArrayList arrayList2 = stickersActivity.getMediaDataController().f26511t0[1];
                    while (true) {
                        if (i7 < arrayList2.size()) {
                            if (stickersSet.set.f28078id == ((TLRPC.StickerSetCovered) arrayList2.get(i7)).set.f28078id) {
                                stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i7);
                                break;
                            }
                            i7++;
                        } else {
                            stickerSetCovered = null;
                            break;
                        }
                    }
                    if (stickerSetCovered != null) {
                        if (!arrayList.contains(Long.valueOf(stickerSetCovered.set.f28078id))) {
                            arrayList.add(Long.valueOf(stickerSetCovered.set.f28078id));
                        } else {
                            return;
                        }
                    }
                    org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(stickersActivity.currentAccount);
                    Activity parentActivity = stickersActivity.getParentActivity();
                    if (stickerSetCovered == null) {
                        stickerSetCovered2 = stickersSet;
                    } else {
                        stickerSetCovered2 = stickerSetCovered;
                    }
                    b02.f2(parentActivity, stickerSetCovered2, 2, stickersActivity, false, false);
                } else if (f8Var.F == view) {
                    org.telegram.messenger.si.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                } else if (f8Var.G == view) {
                    stickersActivity.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) stickersActivity, 11, false));
                }
            }
        }
    }

    public static void f0(StickersActivity stickersActivity, ArrayList arrayList, int i7) {
        int i10;
        int i11;
        int i12;
        long[] jArr;
        boolean z10;
        int i13;
        boolean z11;
        stickersActivity.o0();
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(stickersActivity.currentAccount);
        int i14 = stickersActivity.f43347s;
        boolean z12 = true;
        if (i7 == 1) {
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
            tL_inputStickerSetID.f28071id = stickerSet.f28078id;
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
                    if (tL_messages_stickerSet.set.f28078id == tL_inputStickerSetID.f28071id) {
                        arrayListArr[i12].remove(i16);
                        b02.J.l(tL_messages_stickerSet.set.f28078id);
                        b02.K.l(tL_messages_stickerSet.set.f28078id);
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
        long q10 = org.telegram.messenger.si.q(arrayListArr[i17]);
        jArr2[i17] = q10;
        b02.J1(i17, b02.Z[i17], q10, arrayListArr[i17]);
        org.telegram.messenger.ns notificationCenter = b02.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i17);
        objArr[z13 ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(org.telegram.messenger.ns.f25601x0, objArr);
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
        b02.getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new org.telegram.messenger.pf(b02, i11, stickersActivity, i17));
    }

    public static void g0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.v9) {
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            String Q = org.telegram.messenger.si.b0(stickersActivity.currentAccount).Q();
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
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.b0(stickersActivity.currentAccount).f26505r.get(Q);
                if (tL_availableReaction != null) {
                    v9Var.getValueBackupImageView().getImageReceiver().q0(org.telegram.messenger.gc.b(tL_availableReaction.center_icon), "100_100_lastreactframe", org.telegram.messenger.t5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.j6.f28792a7, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void h0(final StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.p41 p41Var) {
        int i7;
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
        ArrayList arrayList2 = stickersActivity.f43344f;
        int i17 = stickersActivity.f43347s;
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(stickersActivity.currentAccount);
        org.telegram.ui.Components.u41 u41Var = stickersActivity.f43340a;
        if (u41Var == null || (!u41Var.f39895k3 && !stickersActivity.f43346r && stickersActivity.f43345n <= 0)) {
            if (i17 == 5) {
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.np.s1(stickersActivity.currentAccount).w0(b02.s0(i17)));
                stickersActivity.f43348w = arrayList3;
                stickersActivity.d = arrayList3;
            } else {
                stickersActivity.d = new ArrayList(org.telegram.messenger.np.s1(stickersActivity.currentAccount).w0(b02.s0(i17)));
            }
        }
        stickersActivity.f43343e = new ArrayList(stickersActivity.p0());
        int i18 = 0;
        while (i18 < stickersActivity.f43343e.size()) {
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.f43343e.get(i18)).set.f28078id))) {
                stickersActivity.f43343e.remove(i18);
                i18--;
            }
            i18++;
        }
        int size = stickersActivity.f43343e.size();
        int i19 = b02.f26475c0[i17];
        int size2 = b02.s0(5).size();
        final int i20 = 2;
        if (i17 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            String M02 = org.telegram.messenger.hd.M0(2131750833, null);
            String str2 = "";
            if (size <= 0) {
                str = "";
            } else {
                str = org.telegram.messenger.hd.E(size, ',');
            }
            arrayList.add(org.telegram.ui.Components.b41.d(1, 2131232040, M02, str));
            if (i19 > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i17 == 0) {
                    arrayList.add(org.telegram.ui.Components.b41.d(2, 2131232016, org.telegram.messenger.hd.M0(2131754128, null), org.telegram.messenger.hd.E(i19, ',')));
                } else {
                    if (i17 == 5) {
                        i16 = 2131754134;
                    } else {
                        i16 = 2131754133;
                    }
                    arrayList.add(org.telegram.ui.Components.b41.f(org.telegram.messenger.hd.M0(i16, null), org.telegram.messenger.hd.E(i19, ','), 2));
                }
            }
            arrayList.size();
            String M03 = org.telegram.messenger.hd.M0(2131751196, null);
            if (size2 > 0) {
                str2 = org.telegram.messenger.hd.E(size2, ',');
            }
            org.telegram.ui.Components.b41 b41Var = new org.telegram.ui.Components.b41(43);
            b41Var.d = 3;
            b41Var.f33183k = 2131232037;
            b41Var.f33184l = M03;
            b41Var.f33185m = str2;
            arrayList.add(b41Var);
        } else if (i19 > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i17 == 0) {
                arrayList.add(org.telegram.ui.Components.b41.d(2, 2131232016, org.telegram.messenger.hd.M0(2131754128, null), org.telegram.messenger.hd.E(i19, ',')));
            } else {
                if (i17 == 5) {
                    i7 = 2131754134;
                } else {
                    i7 = 2131754133;
                }
                arrayList.add(org.telegram.ui.Components.b41.f(org.telegram.messenger.hd.M0(i7, null), org.telegram.messenger.hd.E(i19, ','), 2));
            }
            if (i17 == 1) {
                arrayList.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131754129, null)));
            }
        }
        if (i17 == 0) {
            arrayList.size();
            String M04 = org.telegram.messenger.hd.M0(2131751350, null);
            org.telegram.ui.Components.b41 b41Var2 = new org.telegram.ui.Components.b41(43);
            b41Var2.d = 4;
            b41Var2.f33183k = 2131232035;
            b41Var2.f33184l = M04;
            b41Var2.F = new r3(stickersActivity, 23);
            arrayList.add(b41Var2);
            if (i17 == 5) {
                i15 = 2131751185;
            } else {
                i15 = 2131744866;
            }
            arrayList.add(org.telegram.ui.Components.b41.C(stickersActivity.m0(org.telegram.messenger.hd.M0(i15, null))));
            arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131744847, null)));
            stickersActivity.suggestRow = arrayList.size();
            String M05 = org.telegram.messenger.hd.M0(2131744402, null);
            int i21 = org.telegram.messenger.gz.E;
            if (i21 != 0) {
                if (i21 != 1) {
                    M0 = org.telegram.messenger.hd.M0(2131744399, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131744400, null);
                }
            } else {
                M0 = org.telegram.messenger.hd.M0(2131744401, null);
            }
            org.telegram.ui.Components.b41 b41Var3 = new org.telegram.ui.Components.b41(43);
            b41Var3.d = 5;
            b41Var3.f33184l = M05;
            b41Var3.f33185m = M0;
            arrayList.add(b41Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.b41 i22 = org.telegram.ui.Components.b41.i(6, org.telegram.messenger.hd.M0(2131749034, null));
            i22.L(org.telegram.messenger.gz.T0);
            arrayList.add(i22);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.b41 i23 = org.telegram.ui.Components.b41.i(7, org.telegram.messenger.hd.M0(2131751339, null));
            i23.L(org.telegram.messenger.gz.X);
            arrayList.add(i23);
            arrayList.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131751338, null)));
        }
        if (i17 == 5) {
            org.telegram.ui.Components.b41 i24 = org.telegram.ui.Components.b41.i(9, org.telegram.messenger.hd.M0(2131744416, null));
            i24.L(org.telegram.messenger.gz.F);
            arrayList.add(i24);
            arrayList.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131744415, null)));
        }
        if (stickersActivity.d.size() > 0) {
            p41Var.V();
            if (i17 == 5 || (!stickersActivity.f43343e.isEmpty() && i17 == 0)) {
                if (i17 == 5) {
                    i14 = 2131752119;
                } else {
                    i14 = 2131752118;
                }
                arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(i14, null)));
            }
            p41Var.M();
            ArrayList arrayList4 = stickersActivity.d;
            int size3 = arrayList4.size();
            int i25 = 0;
            while (i25 < size3) {
                Object obj = arrayList4.get(i25);
                i25++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i26 = org.telegram.ui.Cells.e8.f30188b;
                org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(org.telegram.ui.Cells.e8.class);
                K.G = tL_messages_stickerSet;
                K.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f44942b;

                    {
                        this.f44942b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i27 = r2;
                        final StickersActivity stickersActivity2 = this.f44942b;
                        switch (i27) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.f8)) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = f8Var.getStickersSet();
                                    org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(stickersActivity2, f8Var);
                                    H.c(2131232052, org.telegram.messenger.hd.M0(2131744858, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(2131232204, org.telegram.messenger.hd.M0(2131744863, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(2131232331, org.telegram.messenger.hd.M0(2131744851, null), new fy0(8, stickersActivity2, f8Var), false);
                                    H.l(2131232364, org.telegram.messenger.hd.M0(2131744846, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String M06 = org.telegram.messenger.hd.M0(2131744855, null);
                                    H.m(2131232109, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
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
                    public final StickersActivity f44942b;

                    {
                        this.f44942b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i27 = r2;
                        final StickersActivity stickersActivity2 = this.f44942b;
                        switch (i27) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.f8)) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = f8Var.getStickersSet();
                                    org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(stickersActivity2, f8Var);
                                    H.c(2131232052, org.telegram.messenger.hd.M0(2131744858, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(2131232204, org.telegram.messenger.hd.M0(2131744863, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(2131232331, org.telegram.messenger.hd.M0(2131744851, null), new fy0(8, stickersActivity2, f8Var), false);
                                    H.l(2131232364, org.telegram.messenger.hd.M0(2131744846, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String M06 = org.telegram.messenger.hd.M0(2131744855, null);
                                    H.m(2131232109, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
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
                K.L(stickersActivity.f43349x.contains(Long.valueOf(tL_messages_stickerSet.set.f28078id)));
                arrayList.add(K);
                arrayList4 = arrayList4;
            }
            p41Var.L();
            p41Var.U();
            if (i17 != 1 && i17 != 5) {
                arrayList.add(org.telegram.ui.Components.b41.C(null));
            } else if (i17 == 1) {
                arrayList.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131748673, null)));
            }
        }
        if (stickersActivity.f43343e.size() > 3) {
            i10 = 0;
            stickersActivity.f43343e = new ArrayList(stickersActivity.f43343e.subList(0, 3));
            z10 = true;
        } else {
            i10 = 0;
            z10 = false;
        }
        if (i17 == 5 && !stickersActivity.f43343e.isEmpty()) {
            if (stickersActivity.d.size() > 0) {
                arrayList.add(org.telegram.ui.Components.b41.C(null));
            }
            if (i17 == 5) {
                i13 = 2131750835;
            } else {
                i13 = 2131750833;
            }
            arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(i13, null)));
            ArrayList arrayList5 = stickersActivity.f43343e;
            int size4 = arrayList5.size();
            while (i10 < size4) {
                Object obj2 = arrayList5.get(i10);
                i10++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i27 = org.telegram.ui.Cells.p3.f30861b;
                org.telegram.ui.Components.b41 K2 = org.telegram.ui.Components.b41.K(org.telegram.ui.Cells.p3.class);
                K2.G = stickerSetCovered;
                K2.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f44942b;

                    {
                        this.f44942b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i272 = i20;
                        final StickersActivity stickersActivity2 = this.f44942b;
                        switch (i272) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.f8)) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = f8Var.getStickersSet();
                                    org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(stickersActivity2, f8Var);
                                    H.c(2131232052, org.telegram.messenger.hd.M0(2131744858, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(2131232204, org.telegram.messenger.hd.M0(2131744863, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(2131232331, org.telegram.messenger.hd.M0(2131744851, null), new fy0(8, stickersActivity2, f8Var), false);
                                    H.l(2131232364, org.telegram.messenger.hd.M0(2131744846, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String M06 = org.telegram.messenger.hd.M0(2131744855, null);
                                    H.m(2131232109, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
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
                K2.f33192t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.f28078id));
                arrayList.add(K2);
                arrayList5 = arrayList5;
                i20 = 2;
            }
            if (z10) {
                org.telegram.ui.Components.b41 c10 = org.telegram.ui.Components.b41.c(8, 2131232040, org.telegram.messenger.hd.M0(2131745338, null));
                c10.f33189q = true;
                arrayList.add(c10);
            }
            i11 = 5;
        } else {
            i11 = 5;
        }
        if (i17 == i11) {
            if (i17 == i11) {
                i12 = 2131751185;
            } else {
                i12 = 2131744866;
            }
            arrayList.add(org.telegram.ui.Components.b41.C(stickersActivity.m0(org.telegram.messenger.hd.M0(i12, null))));
        }
    }

    public static void i0(StickersActivity stickersActivity, int i7) {
        StickersActivity stickersActivity2;
        int i10;
        String M0;
        TextView textView;
        int i11 = 0;
        if (i7 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.d.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i12);
                if (stickersActivity.f43349x.contains(Long.valueOf(tL_messages_stickerSet.set.f28078id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.q0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.po0 N0 = org.telegram.ui.Components.po0.N0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            N0.f38355o2 = new ur0(stickersActivity, 2);
            N0.show();
        } else if (i7 == 0 || i7 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.f43349x.size());
            int size2 = stickersActivity.d.size();
            for (int i13 = 0; i13 < size2; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i13);
                if (stickersActivity.f43349x.contains(Long.valueOf(tL_messages_stickerSet2.set.f28078id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i7 == 1) {
                        alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.a0(null, null, 2131751494, org.telegram.messenger.hd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.a0(null, null, 2131751493, Integer.valueOf(size3));
                        M0 = org.telegram.messenger.hd.M0(2131751598, null);
                    } else {
                        alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.a0(null, null, 2131754142, org.telegram.messenger.hd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.a0(null, null, 2131754141, Integer.valueOf(size3));
                        M0 = org.telegram.messenger.hd.M0(2131754172, null);
                    }
                    alertDialog$Builder.k(M0, new ai.r1(stickersActivity, arrayList, i7, 16));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    stickersActivity.showDialog(t1Var);
                    if (i7 == 1 && (textView = (TextView) t1Var.d(-1)) != null) {
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                        return;
                    }
                    return;
                }
                int size4 = stickersActivity.d.size();
                while (true) {
                    if (i11 < size4) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i11);
                        if (stickersActivity.f43349x.contains(Long.valueOf(tL_messages_stickerSet3.set.f28078id))) {
                            if (i7 == 0) {
                                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(stickersActivity.currentAccount);
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
                                if (i7 == 1) {
                                    org.telegram.messenger.si.b0(stickersActivity2.currentAccount).f2(stickersActivity2.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity2, true, true);
                                } else if (i7 == 2) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity2.q0(tL_messages_stickerSet3));
                                        stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131744846, null)), 500);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                } else if (i7 == 3) {
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.q0(tL_messages_stickerSet3)));
                                        org.telegram.ui.Components.cc.j(stickersActivity2).j();
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                    }
                                } else if (i7 == 4) {
                                    HashSet hashSet = stickersActivity2.f43349x;
                                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f28078id))) {
                                        hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.f28078id));
                                    } else {
                                        hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f28078id));
                                    }
                                    stickersActivity2.f43340a.f39892g3.O(true);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29262z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29243y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        int i7 = this.f43347s;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131744857, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748679, null));
        } else if (i7 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751196, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 14));
        org.telegram.ui.ActionBar.c5 o4 = this.simpleActionBar.o();
        o4.c(2, 2131232364, null, null, org.telegram.messenger.g0.L(54.0f), null);
        o4.c(0, 2131232052, null, null, org.telegram.messenger.g0.L(54.0f), null);
        this.h = o4.c(1, 2131232109, null, null, org.telegram.messenger.g0.L(54.0f), null);
        if (i7 == 5 && (arrayList = this.f43348w) != null) {
            this.d = arrayList;
        } else {
            this.d = new ArrayList(org.telegram.messenger.np.s1(this.currentAccount).w0(org.telegram.messenger.si.b0(this.currentAccount).s0(i7)));
        }
        this.f43343e = p0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(this, new org.telegram.messenger.s10(this) {
            public final StickersActivity f46274b;

            {
                this.f46274b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.h0(this.f46274b, (ArrayList) obj, (org.telegram.ui.Components.p41) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.f46274b, (ArrayList) obj2);
                        return;
                }
            }
        }, new e51(this), new e51(this));
        this.f43340a = u41Var;
        u41Var.r1();
        this.f43340a.setFocusable(true);
        this.f43340a.setSectionsDrawBackground(true);
        this.f43340a.setTag(7);
        this.f43340a.E1(new org.telegram.messenger.s10(this) {
            public final StickersActivity f46274b;

            {
                this.f46274b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.h0(this.f46274b, (ArrayList) obj, (org.telegram.ui.Components.p41) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.f46274b, (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        jg.i0 i0Var = new jg.i0(this, 9);
        this.f43341b = i0Var;
        i0Var.j1(1);
        this.f43340a.setLayoutManager(this.f43341b);
        frameLayout.addView(this.f43340a, c8.ja.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.f25601x0;
        int i12 = this.f43347s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == i12) {
                this.f43344f.clear();
            }
            this.f43340a.f39892g3.O(true);
        } else if (i7 != org.telegram.messenger.ns.f25615z0 && i7 != org.telegram.messenger.ns.A0) {
            if (i7 == org.telegram.messenger.ns.Z0 && ((Integer) objArr[0]).intValue() == i12) {
                this.f43340a.f39892g3.O(true);
            }
        } else {
            this.f43340a.f39892g3.O(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f43340a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43340a, 16, new Class[]{org.telegram.ui.Cells.f8.class, org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.q8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43340a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43340a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43340a, 8192, new Class[]{org.telegram.ui.Cells.f8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43340a, 16384, new Class[]{org.telegram.ui.Cells.f8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28979k7));
        org.telegram.ui.Components.j31 j31Var = this.f43342c;
        if (j31Var != null) {
            arrayList.addAll(j31Var.V());
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
        HashSet hashSet = this.f43349x;
        int size = hashSet.size();
        boolean v = this.simpleActionBar.v();
        int i7 = 0;
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
                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.f28078id))) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet.official && !stickerSet.emojis) {
                            i7 = 8;
                            break;
                        }
                    }
                }
                if (this.h.getVisibility() != i7) {
                    this.h.setVisibility(i7);
                }
            }
            this.simpleActionBar.A(size, v);
            if (!v) {
                this.simpleActionBar.F();
                this.f43340a.z1(true);
                if (!org.telegram.messenger.gz.R && this.f43347s != 5) {
                    org.telegram.messenger.gz.R = true;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    edit.putBoolean("stickersReorderingHintUsed", org.telegram.messenger.gz.R);
                    edit.apply();
                    org.telegram.ui.Components.xb.g(this, new org.telegram.ui.Components.ak0(getParentActivity(), org.telegram.messenger.hd.M0(2131744850, null)), 3250).j();
                }
            }
        } else if (v) {
            this.simpleActionBar.u();
            this.f43340a.z1(false);
            r0();
        }
    }

    public final void o0() {
        this.f43349x.clear();
        this.f43340a.f39892g3.O(true);
        n0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f43349x.isEmpty()) {
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
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.currentAccount);
        int i7 = this.f43347s;
        b02.B(i7);
        if (i7 == 0) {
            org.telegram.messenger.si.b0(this.currentAccount).x();
            org.telegram.messenger.si.b0(this.currentAccount).B(1);
            org.telegram.messenger.si.b0(this.currentAccount).B(5);
        } else if (i7 == 6) {
            org.telegram.messenger.si.b0(this.currentAccount).w();
            org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.A0);
        }
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25601x0);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.Z0);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25615z0);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25498f5);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f43347s == 6) {
            org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.A0);
        }
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25601x0);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.Z0);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25615z0);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25498f5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.u41 u41Var = this.f43340a;
        if (u41Var != null) {
            u41Var.f39892g3.O(true);
        }
    }

    public final ArrayList p0() {
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.currentAccount);
        ArrayList[] arrayListArr = b02.f26511t0;
        if (this.f43347s == 5) {
            ArrayList arrayList = new ArrayList(arrayListArr[1]);
            int i7 = 0;
            while (i7 < arrayList.size()) {
                if (arrayList.get(i7) == null || b02.B0(((TLRPC.StickerSetCovered) arrayList.get(i7)).set.f28078id, false)) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            }
            return arrayList;
        }
        return arrayListArr[0];
    }

    public final String q0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        String str;
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(org.telegram.messenger.np.s1(this.currentAccount).V2);
        sb2.append("/");
        if (tL_messages_stickerSet.set.emojis) {
            str = "addemoji";
        } else {
            str = "addstickers";
        }
        return String.format(locale, a8.p0.s(sb2, str, "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void r0() {
        boolean z10;
        boolean z11;
        if (this.f43346r) {
            this.f43346r = false;
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.currentAccount);
            long[] jArr = b02.Y;
            ArrayList[] arrayListArr = b02.H;
            int i7 = this.f43347s;
            jArr[i7] = org.telegram.messenger.si.q(arrayListArr[i7]);
            this.f43345n++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            if (i7 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_reorderStickerSets.masks = z10;
            if (i7 == 5) {
                z11 = true;
            } else {
                z11 = false;
            }
            tL_messages_reorderStickerSets.emojis = z11;
            int i10 = 0;
            while (i10 < this.d.size()) {
                i10 = com.google.android.gms.internal.vision.e2.g(i10, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i10)).set.f28078id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new l(this, 21));
            org.telegram.messenger.ns.f(this.currentAccount).k(org.telegram.messenger.ns.f25601x0, Integer.valueOf(i7), Boolean.TRUE);
            if (org.telegram.messenger.gz.X) {
                org.telegram.messenger.gz.P();
                org.telegram.ui.Components.cc.a0(this).I(2131624018, org.telegram.messenger.hd.M0(2131751337, null), org.telegram.messenger.hd.M0(2131751336, null)).j();
                this.f43340a.f39892g3.O(true);
            }
        }
    }

    public final void s0(org.telegram.ui.Cells.f8 f8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = f8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.f28078id);
        HashSet hashSet = this.f43349x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.f28078id));
            f8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.f28078id));
            f8Var.b(true, true);
        }
        this.f43340a.f39892g3.O(true);
        n0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
