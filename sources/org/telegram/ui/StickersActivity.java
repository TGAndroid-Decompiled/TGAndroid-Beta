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
public class StickersActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public org.telegram.ui.Components.r41 f41975a;
    private int archivedRow;
    public jg.i0 f41976b;
    public org.telegram.ui.Components.f31 f41977c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList f41978e;
    public final ArrayList f41979f;
    private int featuredRow;
    public org.telegram.ui.ActionBar.f5 h;
    private int largeEmojiRow;
    public int f41980n;
    public boolean f41981r;
    public final int f41982s;
    private int suggestRow;
    public ArrayList f41983w;
    public final HashSet f41984x;
    public final f51 f41985y;

    public StickersActivity(int i7, ArrayList arrayList) {
        super(null);
        this.f41979f = new ArrayList();
        this.f41984x = new HashSet();
        this.f41985y = new f51(this, 0);
        this.f41982s = i7;
        this.f41983w = arrayList;
    }

    public static void Z(StickersActivity stickersActivity, org.telegram.ui.Components.y31 y31Var, View view) {
        boolean z9;
        boolean z10;
        int i7 = stickersActivity.f41982s;
        Object obj = y31Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (stickersActivity.f41984x.isEmpty()) {
                ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
                if (arrayList != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null && stickerSet.emojis) {
                        ArrayList arrayList2 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.f26976id = stickerSet2.f26983id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        arrayList2.add(tL_inputStickerSetID);
                        stickersActivity.showDialog(new org.telegram.ui.Components.ru(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
                        return;
                    }
                    stickersActivity.showDialog(new org.telegram.ui.Components.zv0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                    return;
                }
                return;
            }
            stickersActivity.s0((org.telegram.ui.Cells.g8) view);
            return;
        }
        boolean z11 = true;
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.f26976id = stickerSet3.f26983id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i7 == 5) {
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(tL_inputStickerSetID2);
                stickersActivity.showDialog(new org.telegram.ui.Components.ru(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
                return;
            }
            stickersActivity.showDialog(new org.telegram.ui.Components.zv0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
            return;
        }
        switch (y31Var.d) {
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
                                tL_inputStickerSetID3.f26976id = stickerSet4.f26983id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    org.telegram.messenger.ui.b0(stickersActivity.currentAccount).d1(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.ru(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    return;
                }
                org.telegram.ui.Components.f31 f31Var = new org.telegram.ui.Components.f31(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.u31(stickersActivity.getParentActivity(), new j51(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                stickersActivity.f41977c = f31Var;
                f31Var.show();
                return;
            case 2:
                stickersActivity.presentFragment(new o(i7));
                return;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                return;
            case 4:
                stickersActivity.presentFragment(new ey0());
                return;
            case 5:
                org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(stickersActivity, view);
                if (org.telegram.messenger.iz.E == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                H.i(new wg(4, view), org.telegram.messenger.id.M0(2131744401, null), z9);
                if (org.telegram.messenger.iz.E == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.i(new wg(5, view), org.telegram.messenger.id.M0(2131744400, null), z10);
                if (org.telegram.messenger.iz.E != 2) {
                    z11 = false;
                }
                H.i(new wg(6, view), org.telegram.messenger.id.M0(2131744399, null), z11);
                H.Z();
                return;
            case 6:
                org.telegram.messenger.iz.T0 = !org.telegram.messenger.iz.T0;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putBoolean("allowBigEmoji", org.telegram.messenger.iz.T0);
                edit.apply();
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.T0);
                return;
            case 7:
                org.telegram.messenger.iz.P();
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.X);
                return;
            case 9:
                org.telegram.messenger.iz.F = !org.telegram.messenger.iz.F;
                SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", org.telegram.messenger.iz.F);
                edit2.apply();
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.F);
                return;
            default:
                return;
        }
    }

    public static void a0(StickersActivity stickersActivity, ArrayList arrayList) {
        f51 f51Var = stickersActivity.f41985y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Object obj2 = ((org.telegram.ui.Components.y31) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.d = arrayList2;
        stickersActivity.f41981r = true;
        Collections.sort(org.telegram.messenger.ui.b0(stickersActivity.currentAccount).s0(stickersActivity.f41982s), new ps(stickersActivity, 3));
        org.telegram.messenger.g0.r(f51Var);
        org.telegram.messenger.g0.i3(f51Var, 1000L);
    }

    public static void b0(StickersActivity stickersActivity, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i7;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(stickersActivity.currentAccount);
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
        ArrayList arrayList = stickersActivity.f41979f;
        if (arrayList.contains(Long.valueOf(stickerSet.set.f26983id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.f26983id));
        q3Var.f30122f.a(true, true);
        if (q3Var.f30126w) {
            org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    public static void e0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.g8 g8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSetCovered stickerSetCovered2;
        ArrayList arrayList = stickersActivity.f41979f;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof org.telegram.ui.Cells.g8) && (stickersSet = (g8Var = (org.telegram.ui.Cells.g8) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i7 = 0;
                if (g8Var.D == view) {
                    ArrayList arrayList2 = stickersActivity.getMediaDataController().f25840s0[1];
                    while (true) {
                        if (i7 < arrayList2.size()) {
                            if (stickersSet.set.f26983id == ((TLRPC.StickerSetCovered) arrayList2.get(i7)).set.f26983id) {
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
                        if (!arrayList.contains(Long.valueOf(stickerSetCovered.set.f26983id))) {
                            arrayList.add(Long.valueOf(stickerSetCovered.set.f26983id));
                        } else {
                            return;
                        }
                    }
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(stickersActivity.currentAccount);
                    Activity parentActivity = stickersActivity.getParentActivity();
                    if (stickerSetCovered == null) {
                        stickerSetCovered2 = stickersSet;
                    } else {
                        stickerSetCovered2 = stickerSetCovered;
                    }
                    b02.f2(parentActivity, stickerSetCovered2, 2, stickersActivity, false, false);
                } else if (g8Var.E == view) {
                    org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                } else if (g8Var.F == view) {
                    stickersActivity.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) stickersActivity, 11, false));
                }
            }
        }
    }

    public static void f0(StickersActivity stickersActivity, ArrayList arrayList, int i7) {
        int i10;
        int i11;
        int i12;
        long[] jArr;
        boolean z9;
        int i13;
        boolean z10;
        stickersActivity.o0();
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(stickersActivity.currentAccount);
        int i14 = stickersActivity.f41982s;
        boolean z11 = true;
        if (i7 == 1) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        long[] jArr2 = b02.X;
        ArrayList[] arrayListArr = b02.G;
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i15 = 0;
        while (i15 < size) {
            TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) arrayList.get(i15);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.f26976id = stickerSet.f26983id;
            arrayList2.add(tL_inputStickerSetID);
            if (i10 != 0) {
                if (i10 == z11) {
                    z10 = z11;
                } else {
                    z10 = false;
                }
                stickerSet.archived = z10;
            }
            int size2 = arrayListArr[i14].size();
            int i16 = 0;
            while (true) {
                if (i16 < size2) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayListArr[i14].get(i16);
                    z9 = z11;
                    i13 = i10;
                    i12 = i14;
                    jArr = jArr2;
                    if (tL_messages_stickerSet.set.f26983id == tL_inputStickerSetID.f26976id) {
                        arrayListArr[i12].remove(i16);
                        b02.I.l(tL_messages_stickerSet.set.f26983id);
                        b02.J.l(tL_messages_stickerSet.set.f26983id);
                        b02.N.remove(tL_messages_stickerSet.set.short_name);
                        break;
                    }
                    i16++;
                    i10 = i13;
                    i14 = i12;
                    z11 = z9;
                    jArr2 = jArr;
                } else {
                    i12 = i14;
                    jArr = jArr2;
                    z9 = z11;
                    i13 = i10;
                    break;
                }
            }
            i15++;
            i10 = i13;
            i14 = i12;
            z11 = z9;
            jArr2 = jArr;
        }
        int i17 = i14;
        boolean z12 = z11;
        int i18 = i10;
        long q10 = org.telegram.messenger.ui.q(arrayListArr[i17]);
        jArr2[i17] = q10;
        b02.J1(i17, b02.Y[i17], q10, arrayListArr[i17]);
        org.telegram.messenger.qs notificationCenter = b02.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i17);
        objArr[z12 ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(org.telegram.messenger.qs.f25104x0, objArr);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i18 != 0) {
            i11 = i18;
            if (i11 == z12) {
                tL_messages_toggleStickerSets.archive = z12;
            }
        } else {
            i11 = i18;
            tL_messages_toggleStickerSets.uninstall = z12;
        }
        b02.getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new org.telegram.messenger.qf(b02, i11, stickersActivity, i17));
    }

    public static void g0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.w9) {
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            String Q = org.telegram.messenger.ui.b0(stickersActivity.currentAccount).Q();
            if (Q != null) {
                if (Q.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.i5 m10 = org.telegram.ui.Components.i5.m(stickersActivity.currentAccount, Long.parseLong(Q.substring(9)), null, 2);
                        m10.a(w9Var.getValueBackupImageView());
                        w9Var.getValueBackupImageView().setImageDrawable(m10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f25836r.get(Q);
                if (tL_availableReaction != null) {
                    w9Var.getValueBackupImageView().getImageReceiver().q0(org.telegram.messenger.hc.b(tL_availableReaction.center_icon), "100_100_lastreactframe", org.telegram.messenger.t5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.l6.f27809a7, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void h0(final StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.m41 m41Var) {
        int i7;
        int i10;
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String M0;
        String str;
        int i16;
        ArrayList arrayList2 = stickersActivity.f41979f;
        int i17 = stickersActivity.f41982s;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(stickersActivity.currentAccount);
        org.telegram.ui.Components.r41 r41Var = stickersActivity.f41975a;
        if (r41Var == null || (!r41Var.j3 && !stickersActivity.f41981r && stickersActivity.f41980n <= 0)) {
            if (i17 == 5) {
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.qp.s1(stickersActivity.currentAccount).w0(b02.s0(i17)));
                stickersActivity.f41983w = arrayList3;
                stickersActivity.d = arrayList3;
            } else {
                stickersActivity.d = new ArrayList(org.telegram.messenger.qp.s1(stickersActivity.currentAccount).w0(b02.s0(i17)));
            }
        }
        stickersActivity.f41978e = new ArrayList(stickersActivity.p0());
        int i18 = 0;
        while (i18 < stickersActivity.f41978e.size()) {
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.f41978e.get(i18)).set.f26983id))) {
                stickersActivity.f41978e.remove(i18);
                i18--;
            }
            i18++;
        }
        int size = stickersActivity.f41978e.size();
        int i19 = b02.f25803b0[i17];
        int size2 = b02.s0(5).size();
        final int i20 = 2;
        if (i17 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            String M02 = org.telegram.messenger.id.M0(2131750833, null);
            String str2 = "";
            if (size <= 0) {
                str = "";
            } else {
                str = org.telegram.messenger.id.E(size, ',');
            }
            arrayList.add(org.telegram.ui.Components.y31.d(1, 2131232039, M02, str));
            if (i19 > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i17 == 0) {
                    arrayList.add(org.telegram.ui.Components.y31.d(2, 2131232016, org.telegram.messenger.id.M0(2131754128, null), org.telegram.messenger.id.E(i19, ',')));
                } else {
                    if (i17 == 5) {
                        i16 = 2131754134;
                    } else {
                        i16 = 2131754133;
                    }
                    arrayList.add(org.telegram.ui.Components.y31.f(org.telegram.messenger.id.M0(i16, null), org.telegram.messenger.id.E(i19, ','), 2));
                }
            }
            arrayList.size();
            String M03 = org.telegram.messenger.id.M0(2131751196, null);
            if (size2 > 0) {
                str2 = org.telegram.messenger.id.E(size2, ',');
            }
            org.telegram.ui.Components.y31 y31Var = new org.telegram.ui.Components.y31(43);
            y31Var.d = 3;
            y31Var.f40567k = 2131232037;
            y31Var.f40568l = M03;
            y31Var.f40569m = str2;
            arrayList.add(y31Var);
        } else if (i19 > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i17 == 0) {
                arrayList.add(org.telegram.ui.Components.y31.d(2, 2131232016, org.telegram.messenger.id.M0(2131754128, null), org.telegram.messenger.id.E(i19, ',')));
            } else {
                if (i17 == 5) {
                    i7 = 2131754134;
                } else {
                    i7 = 2131754133;
                }
                arrayList.add(org.telegram.ui.Components.y31.f(org.telegram.messenger.id.M0(i7, null), org.telegram.messenger.id.E(i19, ','), 2));
            }
            if (i17 == 1) {
                arrayList.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.M0(2131754129, null)));
            }
        }
        if (i17 == 0) {
            arrayList.size();
            String M04 = org.telegram.messenger.id.M0(2131751350, null);
            org.telegram.ui.Components.y31 y31Var2 = new org.telegram.ui.Components.y31(43);
            y31Var2.d = 4;
            y31Var2.f40567k = 2131232035;
            y31Var2.f40568l = M04;
            y31Var2.F = new r3(stickersActivity, 23);
            arrayList.add(y31Var2);
            if (i17 == 5) {
                i15 = 2131751185;
            } else {
                i15 = 2131744866;
            }
            arrayList.add(org.telegram.ui.Components.y31.C(stickersActivity.m0(org.telegram.messenger.id.M0(i15, null))));
            arrayList.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131744847, null)));
            stickersActivity.suggestRow = arrayList.size();
            String M05 = org.telegram.messenger.id.M0(2131744402, null);
            int i21 = org.telegram.messenger.iz.E;
            if (i21 != 0) {
                if (i21 != 1) {
                    M0 = org.telegram.messenger.id.M0(2131744399, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131744400, null);
                }
            } else {
                M0 = org.telegram.messenger.id.M0(2131744401, null);
            }
            org.telegram.ui.Components.y31 y31Var3 = new org.telegram.ui.Components.y31(43);
            y31Var3.d = 5;
            y31Var3.f40568l = M05;
            y31Var3.f40569m = M0;
            arrayList.add(y31Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.y31 i22 = org.telegram.ui.Components.y31.i(6, org.telegram.messenger.id.M0(2131749034, null));
            i22.L(org.telegram.messenger.iz.T0);
            arrayList.add(i22);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.y31 i23 = org.telegram.ui.Components.y31.i(7, org.telegram.messenger.id.M0(2131751339, null));
            i23.L(org.telegram.messenger.iz.X);
            arrayList.add(i23);
            arrayList.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.M0(2131751338, null)));
        }
        if (i17 == 5) {
            org.telegram.ui.Components.y31 i24 = org.telegram.ui.Components.y31.i(9, org.telegram.messenger.id.M0(2131744416, null));
            i24.L(org.telegram.messenger.iz.F);
            arrayList.add(i24);
            arrayList.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.M0(2131744415, null)));
        }
        if (stickersActivity.d.size() > 0) {
            m41Var.V();
            if (i17 == 5 || (!stickersActivity.f41978e.isEmpty() && i17 == 0)) {
                if (i17 == 5) {
                    i14 = 2131752119;
                } else {
                    i14 = 2131752118;
                }
                arrayList.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(i14, null)));
            }
            m41Var.M();
            ArrayList arrayList4 = stickersActivity.d;
            int size3 = arrayList4.size();
            int i25 = 0;
            while (i25 < size3) {
                Object obj = arrayList4.get(i25);
                i25++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i26 = org.telegram.ui.Cells.f8.f29135b;
                org.telegram.ui.Components.y31 K = org.telegram.ui.Components.y31.K(org.telegram.ui.Cells.f8.class);
                K.G = tL_messages_stickerSet;
                K.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f45301b;

                    {
                        this.f45301b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i27 = r2;
                        final StickersActivity stickersActivity2 = this.f45301b;
                        switch (i27) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.g8)) {
                                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = g8Var.getStickersSet();
                                    org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(stickersActivity2, g8Var);
                                    H.c(2131232051, org.telegram.messenger.id.M0(2131744858, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(2131232203, org.telegram.messenger.id.M0(2131744863, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(2131232330, org.telegram.messenger.id.M0(2131744851, null), new ax0(12, stickersActivity2, g8Var), false);
                                    H.l(2131232363, org.telegram.messenger.id.M0(2131744846, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String M06 = org.telegram.messenger.id.M0(2131744855, null);
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
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
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
                    public final StickersActivity f45301b;

                    {
                        this.f45301b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i27 = r2;
                        final StickersActivity stickersActivity2 = this.f45301b;
                        switch (i27) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.g8)) {
                                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = g8Var.getStickersSet();
                                    org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(stickersActivity2, g8Var);
                                    H.c(2131232051, org.telegram.messenger.id.M0(2131744858, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(2131232203, org.telegram.messenger.id.M0(2131744863, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(2131232330, org.telegram.messenger.id.M0(2131744851, null), new ax0(12, stickersActivity2, g8Var), false);
                                    H.l(2131232363, org.telegram.messenger.id.M0(2131744846, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String M06 = org.telegram.messenger.id.M0(2131744855, null);
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
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
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
                K.L(stickersActivity.f41984x.contains(Long.valueOf(tL_messages_stickerSet.set.f26983id)));
                arrayList.add(K);
                arrayList4 = arrayList4;
            }
            m41Var.L();
            m41Var.U();
            if (i17 != 1 && i17 != 5) {
                arrayList.add(org.telegram.ui.Components.y31.C(null));
            } else if (i17 == 1) {
                arrayList.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.M0(2131748673, null)));
            }
        }
        if (stickersActivity.f41978e.size() > 3) {
            i10 = 0;
            stickersActivity.f41978e = new ArrayList(stickersActivity.f41978e.subList(0, 3));
            z9 = true;
        } else {
            i10 = 0;
            z9 = false;
        }
        if (i17 == 5 && !stickersActivity.f41978e.isEmpty()) {
            if (stickersActivity.d.size() > 0) {
                arrayList.add(org.telegram.ui.Components.y31.C(null));
            }
            if (i17 == 5) {
                i13 = 2131750835;
            } else {
                i13 = 2131750833;
            }
            arrayList.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(i13, null)));
            ArrayList arrayList5 = stickersActivity.f41978e;
            int size4 = arrayList5.size();
            while (i10 < size4) {
                Object obj2 = arrayList5.get(i10);
                i10++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i27 = org.telegram.ui.Cells.p3.f29738b;
                org.telegram.ui.Components.y31 K2 = org.telegram.ui.Components.y31.K(org.telegram.ui.Cells.p3.class);
                K2.G = stickerSetCovered;
                K2.D = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f45301b;

                    {
                        this.f45301b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i272 = i20;
                        final StickersActivity stickersActivity2 = this.f45301b;
                        switch (i272) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.g8)) {
                                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = g8Var.getStickersSet();
                                    org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(stickersActivity2, g8Var);
                                    H.c(2131232051, org.telegram.messenger.id.M0(2131744858, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    H.l(2131232203, org.telegram.messenger.id.M0(2131744863, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(2131232330, org.telegram.messenger.id.M0(2131744851, null), new ax0(12, stickersActivity2, g8Var), false);
                                    H.l(2131232363, org.telegram.messenger.id.M0(2131744846, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String M06 = org.telegram.messenger.id.M0(2131744855, null);
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
                                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.hc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
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
                K2.f40576t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.f26983id));
                arrayList.add(K2);
                arrayList5 = arrayList5;
                i20 = 2;
            }
            if (z9) {
                org.telegram.ui.Components.y31 c10 = org.telegram.ui.Components.y31.c(8, 2131232039, org.telegram.messenger.id.M0(2131745338, null));
                c10.f40573q = true;
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
            arrayList.add(org.telegram.ui.Components.y31.C(stickersActivity.m0(org.telegram.messenger.id.M0(i12, null))));
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
                if (stickersActivity.f41984x.contains(Long.valueOf(tL_messages_stickerSet.set.f26983id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.q0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.no0 N0 = org.telegram.ui.Components.no0.N0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            N0.f36442k2 = new yr0(stickersActivity, 2);
            N0.show();
        } else if (i7 == 0 || i7 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.f41984x.size());
            int size2 = stickersActivity.d.size();
            for (int i13 = 0; i13 < size2; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i13);
                if (stickersActivity.f41984x.contains(Long.valueOf(tL_messages_stickerSet2.set.f26983id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i7 == 1) {
                        alertDialog$Builder.f27296a.R = org.telegram.messenger.id.a0(null, null, 2131751494, org.telegram.messenger.id.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.f27296a.T = org.telegram.messenger.id.a0(null, null, 2131751493, Integer.valueOf(size3));
                        M0 = org.telegram.messenger.id.M0(2131751598, null);
                    } else {
                        alertDialog$Builder.f27296a.R = org.telegram.messenger.id.a0(null, null, 2131754142, org.telegram.messenger.id.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.f27296a.T = org.telegram.messenger.id.a0(null, null, 2131754141, Integer.valueOf(size3));
                        M0 = org.telegram.messenger.id.M0(2131754172, null);
                    }
                    alertDialog$Builder.k(M0, new jg.a2(stickersActivity, arrayList, i7, 15));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    stickersActivity.showDialog(u1Var);
                    if (i7 == 1 && (textView = (TextView) u1Var.d(-1)) != null) {
                        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                        return;
                    }
                    return;
                }
                int size4 = stickersActivity.d.size();
                while (true) {
                    if (i11 < size4) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i11);
                        if (stickersActivity.f41984x.contains(Long.valueOf(tL_messages_stickerSet3.set.f26983id))) {
                            if (i7 == 0) {
                                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(stickersActivity.currentAccount);
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
                                    org.telegram.messenger.ui.b0(stickersActivity2.currentAccount).f2(stickersActivity2.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity2, true, true);
                                } else if (i7 == 2) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity2.q0(tL_messages_stickerSet3));
                                        stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131744846, null)), 500);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                } else if (i7 == 3) {
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.q0(tL_messages_stickerSet3)));
                                        org.telegram.ui.Components.hc.j(stickersActivity2).j();
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                    }
                                } else if (i7 == 4) {
                                    HashSet hashSet = stickersActivity2.f41984x;
                                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f26983id))) {
                                        hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.f26983id));
                                    } else {
                                        hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f26983id));
                                    }
                                    stickersActivity2.f41975a.f37556f3.O(true);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28277z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28259y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        int i7 = this.f41982s;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131744857, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131748679, null));
        } else if (i7 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131751196, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new pt0(this, 13));
        org.telegram.ui.ActionBar.e5 m10 = this.simpleActionBar.m();
        m10.c(2, 2131232363, null, null, org.telegram.messenger.g0.L(54.0f), null);
        m10.c(0, 2131232051, null, null, org.telegram.messenger.g0.L(54.0f), null);
        this.h = m10.c(1, 2131232108, null, null, org.telegram.messenger.g0.L(54.0f), null);
        if (i7 == 5 && (arrayList = this.f41983w) != null) {
            this.d = arrayList;
        } else {
            this.d = new ArrayList(org.telegram.messenger.qp.s1(this.currentAccount).w0(org.telegram.messenger.ui.b0(this.currentAccount).s0(i7)));
        }
        this.f41978e = p0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(this, new org.telegram.messenger.v10(this) {
            public final StickersActivity f46171b;

            {
                this.f46171b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.h0(this.f46171b, (ArrayList) obj, (org.telegram.ui.Components.m41) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.f46171b, (ArrayList) obj2);
                        return;
                }
            }
        }, new i51(this), new i51(this));
        this.f41975a = r41Var;
        r41Var.r1();
        this.f41975a.setFocusable(true);
        this.f41975a.setSectionsDrawBackground(true);
        this.f41975a.setTag(7);
        this.f41975a.E1(new org.telegram.messenger.v10(this) {
            public final StickersActivity f46171b;

            {
                this.f46171b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.h0(this.f46171b, (ArrayList) obj, (org.telegram.ui.Components.m41) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.f46171b, (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        jg.i0 i0Var = new jg.i0(this, 9);
        this.f41976b = i0Var;
        i0Var.j1(1);
        this.f41975a.setLayoutManager(this.f41976b);
        frameLayout.addView(this.f41975a, c8.ha.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25104x0;
        int i12 = this.f41982s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == i12) {
                this.f41979f.clear();
            }
            this.f41975a.f37556f3.O(true);
        } else if (i7 != org.telegram.messenger.qs.f25118z0 && i7 != org.telegram.messenger.qs.A0) {
            if (i7 == org.telegram.messenger.qs.Z0 && ((Integer) objArr[0]).intValue() == i12) {
                this.f41975a.f37556f3.O(true);
            }
        } else {
            this.f41975a.f37556f3.O(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f41975a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.l6.f27865d6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41975a, 16, new Class[]{org.telegram.ui.Cells.g8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.r8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41975a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41975a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41975a, 8192, new Class[]{org.telegram.ui.Cells.g8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41975a, 16384, new Class[]{org.telegram.ui.Cells.g8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27995k7));
        org.telegram.ui.Components.f31 f31Var = this.f41977c;
        if (f31Var != null) {
            arrayList.addAll(f31Var.U());
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.i4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return str;
    }

    public final void n0() {
        HashSet hashSet = this.f41984x;
        int size = hashSet.size();
        boolean t6 = this.simpleActionBar.t();
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
                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.f26983id))) {
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
            this.simpleActionBar.y(size, t6);
            if (!t6) {
                this.simpleActionBar.C();
                this.f41975a.z1(true);
                if (!org.telegram.messenger.iz.R && this.f41982s != 5) {
                    org.telegram.messenger.iz.R = true;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putBoolean("stickersReorderingHintUsed", org.telegram.messenger.iz.R);
                    edit.apply();
                    org.telegram.ui.Components.cc.g(this, new org.telegram.ui.Components.wj0(getParentActivity(), org.telegram.messenger.id.M0(2131744850, null)), 3250).j();
                }
            }
        } else if (t6) {
            this.simpleActionBar.s();
            this.f41975a.z1(false);
            r0();
        }
    }

    public final void o0() {
        this.f41984x.clear();
        this.f41975a.f37556f3.O(true);
        n0();
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (!this.f41984x.isEmpty()) {
            if (z9) {
                o0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.currentAccount);
        int i7 = this.f41982s;
        b02.B(i7);
        if (i7 == 0) {
            org.telegram.messenger.ui.b0(this.currentAccount).x();
            org.telegram.messenger.ui.b0(this.currentAccount).B(1);
            org.telegram.messenger.ui.b0(this.currentAccount).B(5);
        } else if (i7 == 6) {
            org.telegram.messenger.ui.b0(this.currentAccount).w();
            org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.A0);
        }
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25104x0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.Z0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25118z0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25001f5);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f41982s == 6) {
            org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.A0);
        }
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25104x0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.Z0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25118z0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25001f5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.r41 r41Var = this.f41975a;
        if (r41Var != null) {
            r41Var.f37556f3.O(true);
        }
    }

    public final ArrayList p0() {
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.currentAccount);
        ArrayList[] arrayListArr = b02.f25840s0;
        if (this.f41982s == 5) {
            ArrayList arrayList = new ArrayList(arrayListArr[1]);
            int i7 = 0;
            while (i7 < arrayList.size()) {
                if (arrayList.get(i7) == null || b02.B0(((TLRPC.StickerSetCovered) arrayList.get(i7)).set.f26983id, false)) {
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
        sb2.append(org.telegram.messenger.qp.s1(this.currentAccount).U2);
        sb2.append("/");
        if (tL_messages_stickerSet.set.emojis) {
            str = "addemoji";
        } else {
            str = "addstickers";
        }
        return String.format(locale, a8.p0.s(sb2, str, "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void r0() {
        boolean z9;
        boolean z10;
        if (this.f41981r) {
            this.f41981r = false;
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.currentAccount);
            long[] jArr = b02.X;
            ArrayList[] arrayListArr = b02.G;
            int i7 = this.f41982s;
            jArr[i7] = org.telegram.messenger.ui.q(arrayListArr[i7]);
            this.f41980n++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            if (i7 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            tL_messages_reorderStickerSets.masks = z9;
            if (i7 == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_reorderStickerSets.emojis = z10;
            int i10 = 0;
            while (i10 < this.d.size()) {
                i10 = com.google.android.recaptcha.internal.a.g(i10, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i10)).set.f26983id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new l(this, 21));
            org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.f25104x0, Integer.valueOf(i7), Boolean.TRUE);
            if (org.telegram.messenger.iz.X) {
                org.telegram.messenger.iz.P();
                org.telegram.ui.Components.hc.a0(this).I(2131624017, org.telegram.messenger.id.M0(2131751337, null), org.telegram.messenger.id.M0(2131751336, null)).j();
                this.f41975a.f37556f3.O(true);
            }
        }
    }

    public final void s0(org.telegram.ui.Cells.g8 g8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = g8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.f26983id);
        HashSet hashSet = this.f41984x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.f26983id));
            g8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.f26983id));
            g8Var.b(true, true);
        }
        this.f41975a.f37556f3.O(true);
        n0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
