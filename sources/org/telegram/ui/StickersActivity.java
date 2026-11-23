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
public class StickersActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public org.telegram.ui.Components.h51 f43831a;
    private int archivedRow;
    public jg.i0 f43832b;
    public org.telegram.ui.Components.w31 f43833c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList f43834e;
    public final ArrayList f43835f;
    private int featuredRow;
    public org.telegram.ui.ActionBar.g5 h;
    private int largeEmojiRow;
    public int f43836n;
    public boolean f43837r;
    public final int f43838s;
    private int suggestRow;
    public ArrayList f43839w;
    public final HashSet f43840x;
    public final e51 f43841y;

    public StickersActivity(int i7, ArrayList arrayList) {
        super(null);
        this.f43835f = new ArrayList();
        this.f43840x = new HashSet();
        this.f43841y = new e51(this, 0);
        this.f43838s = i7;
        this.f43839w = arrayList;
    }

    public static void Z(StickersActivity stickersActivity, org.telegram.ui.Components.o41 o41Var, View view) {
        boolean z10;
        boolean z11;
        int i7 = stickersActivity.f43838s;
        Object obj = o41Var.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (stickersActivity.f43840x.isEmpty()) {
                ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
                if (arrayList != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null && stickerSet.emojis) {
                        ArrayList arrayList2 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.f28454id = stickerSet2.f28461id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        arrayList2.add(tL_inputStickerSetID);
                        stickersActivity.showDialog(new org.telegram.ui.Components.ev(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
                        return;
                    }
                    stickersActivity.showDialog(new org.telegram.ui.Components.kw0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                    return;
                }
                return;
            }
            stickersActivity.s0((org.telegram.ui.Cells.h8) view);
            return;
        }
        boolean z12 = true;
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.f28454id = stickerSet3.f28461id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i7 == 5) {
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(tL_inputStickerSetID2);
                stickersActivity.showDialog(new org.telegram.ui.Components.ev(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
                return;
            }
            stickersActivity.showDialog(new org.telegram.ui.Components.kw0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
            return;
        }
        switch (o41Var.d) {
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
                                tL_inputStickerSetID3.f28454id = stickerSet4.f28461id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    org.telegram.messenger.si.d0(stickersActivity.currentAccount).g1(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.ev(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    return;
                }
                org.telegram.ui.Components.w31 w31Var = new org.telegram.ui.Components.w31(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.k41(stickersActivity.getParentActivity(), new i51(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                stickersActivity.f43833c = w31Var;
                w31Var.show();
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
                org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(stickersActivity, view);
                if (org.telegram.messenger.cz.E == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                I.i(new sg(4, view), org.telegram.messenger.hd.N0(2131744158, null), z10);
                if (org.telegram.messenger.cz.E == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                I.i(new sg(5, view), org.telegram.messenger.hd.N0(2131744157, null), z11);
                if (org.telegram.messenger.cz.E != 2) {
                    z12 = false;
                }
                I.i(new sg(6, view), org.telegram.messenger.hd.N0(2131744156, null), z12);
                I.a0();
                return;
            case 6:
                org.telegram.messenger.cz.T0 = !org.telegram.messenger.cz.T0;
                SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                edit.putBoolean("allowBigEmoji", org.telegram.messenger.cz.T0);
                edit.apply();
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.T0);
                return;
            case 7:
                org.telegram.messenger.cz.P();
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.X);
                return;
            case 9:
                org.telegram.messenger.cz.F = !org.telegram.messenger.cz.F;
                SharedPreferences.Editor edit2 = org.telegram.messenger.np.g1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", org.telegram.messenger.cz.F);
                edit2.apply();
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.F);
                return;
            default:
                return;
        }
    }

    public static void a0(StickersActivity stickersActivity, ArrayList arrayList) {
        e51 e51Var = stickersActivity.f43841y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Object obj2 = ((org.telegram.ui.Components.o41) obj).H;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.d = arrayList2;
        stickersActivity.f43837r = true;
        Collections.sort(org.telegram.messenger.si.d0(stickersActivity.currentAccount).u0(stickersActivity.f43838s), new qs(stickersActivity, 3));
        org.telegram.messenger.g0.r(e51Var);
        org.telegram.messenger.g0.h3(e51Var, 1000L);
    }

    public static void b0(StickersActivity stickersActivity, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i7;
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(stickersActivity.currentAccount);
        Activity parentActivity = stickersActivity.getParentActivity();
        if (!tL_messages_stickerSet.set.archived) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        d02.k2(parentActivity, tL_messages_stickerSet, i7, stickersActivity, true, true);
    }

    public static void d0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.f43835f;
        if (arrayList.contains(Long.valueOf(stickerSet.set.f28461id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.f28461id));
        r3Var.f31719f.a(true, true);
        if (r3Var.f31723w) {
            org.telegram.messenger.si.d0(stickersActivity.currentAccount).k2(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            org.telegram.messenger.si.d0(stickersActivity.currentAccount).k2(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    public static void e0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.h8 h8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSetCovered stickerSetCovered2;
        ArrayList arrayList = stickersActivity.f43835f;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof org.telegram.ui.Cells.h8) && (stickersSet = (h8Var = (org.telegram.ui.Cells.h8) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i7 = 0;
                if (h8Var.E == view) {
                    ArrayList arrayList2 = stickersActivity.getMediaDataController().f26853t0[1];
                    while (true) {
                        if (i7 < arrayList2.size()) {
                            if (stickersSet.set.f28461id == ((TLRPC.StickerSetCovered) arrayList2.get(i7)).set.f28461id) {
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
                        if (!arrayList.contains(Long.valueOf(stickerSetCovered.set.f28461id))) {
                            arrayList.add(Long.valueOf(stickerSetCovered.set.f28461id));
                        } else {
                            return;
                        }
                    }
                    org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(stickersActivity.currentAccount);
                    Activity parentActivity = stickersActivity.getParentActivity();
                    if (stickerSetCovered == null) {
                        stickerSetCovered2 = stickersSet;
                    } else {
                        stickerSetCovered2 = stickerSetCovered;
                    }
                    d02.k2(parentActivity, stickerSetCovered2, 2, stickersActivity, false, false);
                } else if (h8Var.F == view) {
                    org.telegram.messenger.si.d0(stickersActivity.currentAccount).k2(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                } else if (h8Var.G == view) {
                    stickersActivity.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) stickersActivity, 11, false));
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
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(stickersActivity.currentAccount);
        int i14 = stickersActivity.f43838s;
        boolean z12 = true;
        if (i7 == 1) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        long[] jArr2 = d02.Y;
        ArrayList[] arrayListArr = d02.H;
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i15 = 0;
        while (i15 < size) {
            TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) arrayList.get(i15);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.f28454id = stickerSet.f28461id;
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
                    if (tL_messages_stickerSet.set.f28461id == tL_inputStickerSetID.f28454id) {
                        arrayListArr[i12].remove(i16);
                        d02.J.l(tL_messages_stickerSet.set.f28461id);
                        d02.K.l(tL_messages_stickerSet.set.f28461id);
                        d02.O.remove(tL_messages_stickerSet.set.short_name);
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
        long s5 = org.telegram.messenger.si.s(arrayListArr[i17]);
        jArr2[i17] = s5;
        d02.O1(i17, d02.Z[i17], s5, arrayListArr[i17]);
        org.telegram.messenger.ls notificationCenter = d02.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i17);
        objArr[z13 ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(org.telegram.messenger.ls.f25412x0, objArr);
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
        d02.getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new org.telegram.messenger.rf(d02, i11, stickersActivity, i17));
    }

    public static void g0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.x9) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            String S = org.telegram.messenger.si.d0(stickersActivity.currentAccount).S();
            if (S != null) {
                if (S.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(stickersActivity.currentAccount, Long.parseLong(S.substring(9)), null, 2);
                        m10.a(x9Var.getValueBackupImageView());
                        x9Var.getValueBackupImageView().setImageDrawable(m10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.d0(stickersActivity.currentAccount).f26847r.get(S);
                if (tL_availableReaction != null) {
                    x9Var.getValueBackupImageView().getImageReceiver().q0(org.telegram.messenger.gc.b(tL_availableReaction.center_icon), "100_100_lastreactframe", org.telegram.messenger.u5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.m6.f29324a7, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void h0(final StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.c51 c51Var) {
        int i7;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String N0;
        String str;
        int i16;
        ArrayList arrayList2 = stickersActivity.f43835f;
        int i17 = stickersActivity.f43838s;
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(stickersActivity.currentAccount);
        org.telegram.ui.Components.h51 h51Var = stickersActivity.f43831a;
        if (h51Var == null || (!h51Var.f35792k3 && !stickersActivity.f43837r && stickersActivity.f43836n <= 0)) {
            if (i17 == 5) {
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.np.u1(stickersActivity.currentAccount).y0(d02.u0(i17)));
                stickersActivity.f43839w = arrayList3;
                stickersActivity.d = arrayList3;
            } else {
                stickersActivity.d = new ArrayList(org.telegram.messenger.np.u1(stickersActivity.currentAccount).y0(d02.u0(i17)));
            }
        }
        stickersActivity.f43834e = new ArrayList(stickersActivity.p0());
        int i18 = 0;
        while (i18 < stickersActivity.f43834e.size()) {
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.f43834e.get(i18)).set.f28461id))) {
                stickersActivity.f43834e.remove(i18);
                i18--;
            }
            i18++;
        }
        int size = stickersActivity.f43834e.size();
        int i19 = d02.f26817c0[i17];
        int size2 = d02.u0(5).size();
        final int i20 = 2;
        if (i17 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            String N02 = org.telegram.messenger.hd.N0(2131750821, null);
            String str2 = "";
            if (size <= 0) {
                str = "";
            } else {
                str = org.telegram.messenger.hd.E(size, ',');
            }
            arrayList.add(org.telegram.ui.Components.o41.d(1, 2131232041, N02, str));
            if (i19 > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i17 == 0) {
                    arrayList.add(org.telegram.ui.Components.o41.d(2, 2131232017, org.telegram.messenger.hd.N0(2131754125, null), org.telegram.messenger.hd.E(i19, ',')));
                } else {
                    if (i17 == 5) {
                        i16 = 2131754131;
                    } else {
                        i16 = 2131754130;
                    }
                    arrayList.add(org.telegram.ui.Components.o41.f(org.telegram.messenger.hd.N0(i16, null), org.telegram.messenger.hd.E(i19, ','), 2));
                }
            }
            arrayList.size();
            String N03 = org.telegram.messenger.hd.N0(2131751184, null);
            if (size2 > 0) {
                str2 = org.telegram.messenger.hd.E(size2, ',');
            }
            org.telegram.ui.Components.o41 o41Var = new org.telegram.ui.Components.o41(43);
            o41Var.d = 3;
            o41Var.f38089k = 2131232038;
            o41Var.f38091m = N03;
            o41Var.f38092n = str2;
            arrayList.add(o41Var);
        } else if (i19 > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i17 == 0) {
                arrayList.add(org.telegram.ui.Components.o41.d(2, 2131232017, org.telegram.messenger.hd.N0(2131754125, null), org.telegram.messenger.hd.E(i19, ',')));
            } else {
                if (i17 == 5) {
                    i7 = 2131754131;
                } else {
                    i7 = 2131754130;
                }
                arrayList.add(org.telegram.ui.Components.o41.f(org.telegram.messenger.hd.N0(i7, null), org.telegram.messenger.hd.E(i19, ','), 2));
            }
            if (i17 == 1) {
                arrayList.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131754126, null)));
            }
        }
        if (i17 == 0) {
            arrayList.size();
            String N04 = org.telegram.messenger.hd.N0(2131751338, null);
            org.telegram.ui.Components.o41 o41Var2 = new org.telegram.ui.Components.o41(43);
            o41Var2.d = 4;
            o41Var2.f38089k = 2131232036;
            o41Var2.f38091m = N04;
            o41Var2.G = new r3(stickersActivity, 24);
            arrayList.add(o41Var2);
            if (i17 == 5) {
                i15 = 2131751173;
            } else {
                i15 = 2131744623;
            }
            arrayList.add(org.telegram.ui.Components.o41.C(stickersActivity.m0(org.telegram.messenger.hd.N0(i15, null))));
            arrayList.add(org.telegram.ui.Components.o41.u(org.telegram.messenger.hd.N0(2131744604, null)));
            stickersActivity.suggestRow = arrayList.size();
            String N05 = org.telegram.messenger.hd.N0(2131744159, null);
            int i21 = org.telegram.messenger.cz.E;
            if (i21 != 0) {
                if (i21 != 1) {
                    N0 = org.telegram.messenger.hd.N0(2131744156, null);
                } else {
                    N0 = org.telegram.messenger.hd.N0(2131744157, null);
                }
            } else {
                N0 = org.telegram.messenger.hd.N0(2131744158, null);
            }
            org.telegram.ui.Components.o41 o41Var3 = new org.telegram.ui.Components.o41(43);
            o41Var3.d = 5;
            o41Var3.f38091m = N05;
            o41Var3.f38092n = N0;
            arrayList.add(o41Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.o41 i22 = org.telegram.ui.Components.o41.i(6, org.telegram.messenger.hd.N0(2131748841, null));
            i22.L(org.telegram.messenger.cz.T0);
            arrayList.add(i22);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.o41 i23 = org.telegram.ui.Components.o41.i(7, org.telegram.messenger.hd.N0(2131751327, null));
            i23.L(org.telegram.messenger.cz.X);
            arrayList.add(i23);
            arrayList.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131751326, null)));
        }
        if (i17 == 5) {
            org.telegram.ui.Components.o41 i24 = org.telegram.ui.Components.o41.i(9, org.telegram.messenger.hd.N0(2131744173, null));
            i24.L(org.telegram.messenger.cz.F);
            arrayList.add(i24);
            arrayList.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131744172, null)));
        }
        if (stickersActivity.d.size() > 0) {
            c51Var.V();
            if (i17 == 5 || (!stickersActivity.f43834e.isEmpty() && i17 == 0)) {
                if (i17 == 5) {
                    i14 = 2131752107;
                } else {
                    i14 = 2131752106;
                }
                i5.c.s(i14, null, arrayList);
            }
            c51Var.M();
            ArrayList arrayList4 = stickersActivity.d;
            int size3 = arrayList4.size();
            int i25 = 0;
            while (i25 < size3) {
                Object obj = arrayList4.get(i25);
                i25++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i26 = org.telegram.ui.Cells.g8.f30711b;
                org.telegram.ui.Components.o41 K = org.telegram.ui.Components.o41.K(org.telegram.ui.Cells.g8.class);
                K.H = tL_messages_stickerSet;
                K.E = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f46879b;

                    {
                        this.f46879b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i27 = r2;
                        final StickersActivity stickersActivity2 = this.f46879b;
                        switch (i27) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.h8)) {
                                    org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = h8Var.getStickersSet();
                                    org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(stickersActivity2, h8Var);
                                    I.c(2131232053, org.telegram.messenger.hd.N0(2131744615, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.lc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.d0(r0.currentAccount).k2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    I.l(2131232205, org.telegram.messenger.hd.N0(2131744620, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.lc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.d0(r0.currentAccount).k2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    I.c(2131232332, org.telegram.messenger.hd.N0(2131744608, null), new mz0(5, stickersActivity2, h8Var), false);
                                    I.l(2131232365, org.telegram.messenger.hd.N0(2131744603, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.lc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.d0(r0.currentAccount).k2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String N06 = org.telegram.messenger.hd.N0(2131744612, null);
                                    I.m(2131232110, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.lc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.d0(r0.currentAccount).k2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, N06, !stickersSet.set.official, true);
                                    I.V = 190;
                                    I.a0();
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
                K.F = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f46879b;

                    {
                        this.f46879b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i27 = r2;
                        final StickersActivity stickersActivity2 = this.f46879b;
                        switch (i27) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.h8)) {
                                    org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = h8Var.getStickersSet();
                                    org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(stickersActivity2, h8Var);
                                    I.c(2131232053, org.telegram.messenger.hd.N0(2131744615, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.lc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.d0(r0.currentAccount).k2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    I.l(2131232205, org.telegram.messenger.hd.N0(2131744620, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.lc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.d0(r0.currentAccount).k2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    I.c(2131232332, org.telegram.messenger.hd.N0(2131744608, null), new mz0(5, stickersActivity2, h8Var), false);
                                    I.l(2131232365, org.telegram.messenger.hd.N0(2131744603, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.lc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.d0(r0.currentAccount).k2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String N06 = org.telegram.messenger.hd.N0(2131744612, null);
                                    I.m(2131232110, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.lc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.d0(r0.currentAccount).k2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, N06, !stickersSet.set.official, true);
                                    I.V = 190;
                                    I.a0();
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
                K.L(stickersActivity.f43840x.contains(Long.valueOf(tL_messages_stickerSet.set.f28461id)));
                arrayList.add(K);
                arrayList4 = arrayList4;
            }
            c51Var.L();
            c51Var.U();
            if (i17 != 1 && i17 != 5) {
                arrayList.add(org.telegram.ui.Components.o41.C(null));
            } else if (i17 == 1) {
                arrayList.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131748480, null)));
            }
        }
        if (stickersActivity.f43834e.size() > 3) {
            i10 = 0;
            stickersActivity.f43834e = new ArrayList(stickersActivity.f43834e.subList(0, 3));
            z10 = true;
        } else {
            i10 = 0;
            z10 = false;
        }
        if (i17 == 5 && !stickersActivity.f43834e.isEmpty()) {
            if (stickersActivity.d.size() > 0) {
                arrayList.add(org.telegram.ui.Components.o41.C(null));
            }
            if (i17 == 5) {
                i13 = 2131750823;
            } else {
                i13 = 2131750821;
            }
            i5.c.s(i13, null, arrayList);
            ArrayList arrayList5 = stickersActivity.f43834e;
            int size4 = arrayList5.size();
            while (i10 < size4) {
                Object obj2 = arrayList5.get(i10);
                i10++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i27 = org.telegram.ui.Cells.q3.f31319b;
                org.telegram.ui.Components.o41 K2 = org.telegram.ui.Components.o41.K(org.telegram.ui.Cells.q3.class);
                K2.H = stickerSetCovered;
                K2.E = new View.OnClickListener(stickersActivity) {
                    public final StickersActivity f46879b;

                    {
                        this.f46879b = stickersActivity;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i272 = i20;
                        final StickersActivity stickersActivity2 = this.f46879b;
                        switch (i272) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.h8)) {
                                    org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = h8Var.getStickersSet();
                                    org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(stickersActivity2, h8Var);
                                    I.c(2131232053, org.telegram.messenger.hd.N0(2131744615, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.lc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.d0(r0.currentAccount).k2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, false);
                                    I.l(2131232205, org.telegram.messenger.hd.N0(2131744620, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.lc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.d0(r0.currentAccount).k2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    I.c(2131232332, org.telegram.messenger.hd.N0(2131744608, null), new mz0(5, stickersActivity2, h8Var), false);
                                    I.l(2131232365, org.telegram.messenger.hd.N0(2131744603, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.lc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.d0(r0.currentAccount).k2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    String N06 = org.telegram.messenger.hd.N0(2131744612, null);
                                    I.m(2131232110, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    StickersActivity.b0(stickersActivity2, stickersSet);
                                                    return;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.lc.j(stickersActivity3).j();
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
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                                        return;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.si.d0(r0.currentAccount).k2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    return;
                                            }
                                        }
                                    }, N06, !stickersSet.set.official, true);
                                    I.V = 190;
                                    I.a0();
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
                K2.f38099u = arrayList2.contains(Long.valueOf(stickerSetCovered.set.f28461id));
                arrayList.add(K2);
                arrayList5 = arrayList5;
                i20 = 2;
            }
            if (z10) {
                org.telegram.ui.Components.o41 c10 = org.telegram.ui.Components.o41.c(8, 2131232041, org.telegram.messenger.hd.N0(2131745142, null));
                c10.f38096r = true;
                arrayList.add(c10);
            }
            i11 = 5;
        } else {
            i11 = 5;
        }
        if (i17 == i11) {
            if (i17 == i11) {
                i12 = 2131751173;
            } else {
                i12 = 2131744623;
            }
            arrayList.add(org.telegram.ui.Components.o41.C(stickersActivity.m0(org.telegram.messenger.hd.N0(i12, null))));
        }
    }

    public static void i0(StickersActivity stickersActivity, int i7) {
        StickersActivity stickersActivity2;
        int i10;
        String N0;
        TextView textView;
        int i11 = 0;
        if (i7 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.d.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i12);
                if (stickersActivity.f43840x.contains(Long.valueOf(tL_messages_stickerSet.set.f28461id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.q0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.ap0 O0 = org.telegram.ui.Components.ap0.O0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            O0.f33577o2 = new xr0(stickersActivity, 2);
            O0.show();
        } else if (i7 == 0 || i7 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.f43840x.size());
            int size2 = stickersActivity.d.size();
            for (int i13 = 0; i13 < size2; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i13);
                if (stickersActivity.f43840x.contains(Long.valueOf(tL_messages_stickerSet2.set.f28461id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i7 == 1) {
                        alertDialog$Builder.f28777a.S = org.telegram.messenger.hd.a0(null, null, 2131751482, org.telegram.messenger.hd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.f28777a.U = org.telegram.messenger.hd.a0(null, null, 2131751481, Integer.valueOf(size3));
                        N0 = org.telegram.messenger.hd.N0(2131751586, null);
                    } else {
                        alertDialog$Builder.f28777a.S = org.telegram.messenger.hd.a0(null, null, 2131754139, org.telegram.messenger.hd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.f28777a.U = org.telegram.messenger.hd.a0(null, null, 2131754138, Integer.valueOf(size3));
                        N0 = org.telegram.messenger.hd.N0(2131754169, null);
                    }
                    alertDialog$Builder.k(N0, new ai.u1(stickersActivity, arrayList, i7, 17));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    stickersActivity.showDialog(t1Var);
                    if (i7 == 1 && (textView = (TextView) t1Var.d(-1)) != null) {
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
                        return;
                    }
                    return;
                }
                int size4 = stickersActivity.d.size();
                while (true) {
                    if (i11 < size4) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i11);
                        if (stickersActivity.f43840x.contains(Long.valueOf(tL_messages_stickerSet3.set.f28461id))) {
                            if (i7 == 0) {
                                org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(stickersActivity.currentAccount);
                                Activity parentActivity = stickersActivity.getParentActivity();
                                if (!tL_messages_stickerSet3.set.archived) {
                                    i10 = 1;
                                } else {
                                    i10 = 2;
                                }
                                stickersActivity2 = stickersActivity;
                                d02.k2(parentActivity, tL_messages_stickerSet3, i10, stickersActivity2, true, true);
                            } else {
                                stickersActivity2 = stickersActivity;
                                if (i7 == 1) {
                                    org.telegram.messenger.si.d0(stickersActivity2.currentAccount).k2(stickersActivity2.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity2, true, true);
                                } else if (i7 == 2) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity2.q0(tL_messages_stickerSet3));
                                        stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131744603, null)), 500);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                } else if (i7 == 3) {
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.q0(tL_messages_stickerSet3)));
                                        org.telegram.ui.Components.lc.j(stickersActivity2).j();
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                    }
                                } else if (i7 == 4) {
                                    HashSet hashSet = stickersActivity2.f43840x;
                                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f28461id))) {
                                        hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.f28461id));
                                    } else {
                                        hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f28461id));
                                    }
                                    stickersActivity2.f43831a.f35789g3.O(true);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29794z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29775y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        int i7 = this.f43838s;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131744614, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131748486, null));
        } else if (i7 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131751184, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 16));
        org.telegram.ui.ActionBar.f5 q10 = this.simpleActionBar.q();
        q10.c(2, 2131232365, null, null, org.telegram.messenger.g0.L(54.0f), null);
        q10.c(0, 2131232053, null, null, org.telegram.messenger.g0.L(54.0f), null);
        this.h = q10.c(1, 2131232110, null, null, org.telegram.messenger.g0.L(54.0f), null);
        if (i7 == 5 && (arrayList = this.f43839w) != null) {
            this.d = arrayList;
        } else {
            this.d = new ArrayList(org.telegram.messenger.np.u1(this.currentAccount).y0(org.telegram.messenger.si.d0(this.currentAccount).u0(i7)));
        }
        this.f43834e = p0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(this, new org.telegram.messenger.r10(this) {
            public final StickersActivity f47981b;

            {
                this.f47981b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.h0(this.f47981b, (ArrayList) obj, (org.telegram.ui.Components.c51) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.f47981b, (ArrayList) obj2);
                        return;
                }
            }
        }, new h51(this), new h51(this));
        this.f43831a = h51Var;
        h51Var.r1();
        this.f43831a.setFocusable(true);
        this.f43831a.setSectionsDrawBackground(true);
        this.f43831a.setTag(7);
        this.f43831a.E1(new org.telegram.messenger.r10(this) {
            public final StickersActivity f47981b;

            {
                this.f47981b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        StickersActivity.h0(this.f47981b, (ArrayList) obj, (org.telegram.ui.Components.c51) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.f47981b, (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        jg.i0 i0Var = new jg.i0(this, 9);
        this.f43832b = i0Var;
        i0Var.j1(1);
        this.f43831a.setLayoutManager(this.f43832b);
        frameLayout.addView(this.f43831a, c8.ma.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.f25412x0;
        int i12 = this.f43838s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == i12) {
                this.f43835f.clear();
            }
            this.f43831a.f35789g3.O(true);
        } else if (i7 != org.telegram.messenger.ls.f25426z0 && i7 != org.telegram.messenger.ls.A0) {
            if (i7 == org.telegram.messenger.ls.Z0 && ((Integer) objArr[0]).intValue() == i12) {
                this.f43831a.f35789g3.O(true);
            }
        } else {
            this.f43831a.f35789g3.O(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43831a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.m6.f29381d6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43831a, 16, new Class[]{org.telegram.ui.Cells.h8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.s8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43831a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43831a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43831a, 8192, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43831a, 16384, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29511k7));
        org.telegram.ui.Components.w31 w31Var = this.f43833c;
        if (w31Var != null) {
            arrayList.addAll(w31Var.V());
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.p4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return str;
    }

    public final void n0() {
        HashSet hashSet = this.f43840x;
        int size = hashSet.size();
        boolean x10 = this.simpleActionBar.x();
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
                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.f28461id))) {
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
            this.simpleActionBar.E(size, x10);
            if (!x10) {
                this.simpleActionBar.J();
                this.f43831a.z1(true);
                if (!org.telegram.messenger.cz.R && this.f43838s != 5) {
                    org.telegram.messenger.cz.R = true;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                    edit.putBoolean("stickersReorderingHintUsed", org.telegram.messenger.cz.R);
                    edit.apply();
                    org.telegram.ui.Components.gc.g(this, new org.telegram.ui.Components.kk0(getParentActivity(), org.telegram.messenger.hd.N0(2131744607, null)), 3250).j();
                }
            }
        } else if (x10) {
            this.simpleActionBar.w();
            this.f43831a.z1(false);
            r0();
        }
    }

    public final void o0() {
        this.f43840x.clear();
        this.f43831a.f35789g3.O(true);
        n0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f43840x.isEmpty()) {
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
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(this.currentAccount);
        int i7 = this.f43838s;
        d02.D(i7);
        if (i7 == 0) {
            org.telegram.messenger.si.d0(this.currentAccount).z();
            org.telegram.messenger.si.d0(this.currentAccount).D(1);
            org.telegram.messenger.si.d0(this.currentAccount).D(5);
        } else if (i7 == 6) {
            org.telegram.messenger.si.d0(this.currentAccount).y();
            org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.A0);
        }
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f25412x0);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.Z0);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f25426z0);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f25327i5);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f43838s == 6) {
            org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.A0);
        }
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25412x0);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.Z0);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25426z0);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25327i5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.h51 h51Var = this.f43831a;
        if (h51Var != null) {
            h51Var.f35789g3.O(true);
        }
    }

    public final ArrayList p0() {
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(this.currentAccount);
        ArrayList[] arrayListArr = d02.f26853t0;
        if (this.f43838s == 5) {
            ArrayList arrayList = new ArrayList(arrayListArr[1]);
            int i7 = 0;
            while (i7 < arrayList.size()) {
                if (arrayList.get(i7) == null || d02.E0(((TLRPC.StickerSetCovered) arrayList.get(i7)).set.f28461id, false)) {
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
        sb2.append(org.telegram.messenger.np.u1(this.currentAccount).X2);
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
        if (this.f43837r) {
            this.f43837r = false;
            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(this.currentAccount);
            long[] jArr = d02.Y;
            ArrayList[] arrayListArr = d02.H;
            int i7 = this.f43838s;
            jArr[i7] = org.telegram.messenger.si.s(arrayListArr[i7]);
            this.f43836n++;
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
                i10 = com.google.android.gms.internal.vision.e2.g(i10, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i10)).set.f28461id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new l(this, 21));
            org.telegram.messenger.ls.f(this.currentAccount).k(org.telegram.messenger.ls.f25412x0, Integer.valueOf(i7), Boolean.TRUE);
            if (org.telegram.messenger.cz.X) {
                org.telegram.messenger.cz.P();
                org.telegram.ui.Components.lc.b0(this).I(2131624018, org.telegram.messenger.hd.N0(2131751325, null), org.telegram.messenger.hd.N0(2131751324, null)).j();
                this.f43831a.f35789g3.O(true);
            }
        }
    }

    public final void s0(org.telegram.ui.Cells.h8 h8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = h8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.f28461id);
        HashSet hashSet = this.f43840x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.f28461id));
            h8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.f28461id));
            h8Var.b(true, true);
        }
        this.f43831a.f35789g3.O(true);
        n0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
