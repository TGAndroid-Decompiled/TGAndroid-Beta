package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class WallpapersListActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public static final int[][] f43485g0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f43486h0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] f43487i0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f43488j0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] f43489k0 = {2131753676, 2131746343, 2131747768, 2131742846, 2131749503, 2131744253, 2131746576, 2131747234, 2131752879, 2131753697, 2131749504, 2131742883};
    public tc1 D;
    public uc1 E;
    public org.telegram.ui.Components.pj0 F;
    public vc1 G;
    public wc1 H;
    public jg.b0 I;
    public org.telegram.ui.ActionBar.g5 J;
    public org.telegram.ui.Components.iy K;
    public org.telegram.ui.ActionBar.u1 L;
    public a8.r7 M;
    public int N;
    public String O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public boolean V;
    public boolean W;
    public final ArrayList X;
    public final HashMap Y;
    public final HashMap Z;
    public int f43490a;
    public final ArrayList f43491a0;
    public int f43492b;
    public final ArrayList f43493b0;
    public int f43494c;
    public ArrayList f43495c0;
    public int d;
    public final HashMap f43496d0;
    public int f43497e;
    public final LongSparseArray f43498e0;
    public int f43499f;
    public boolean f43500f0;
    public int h;
    public int f43501n;
    public final int f43502r;
    public Paint f43503s;
    private int uploadImageRow;
    public Paint f43504w;
    public tc1 f43505x;
    public uc1 f43506y;

    public WallpapersListActivity(int i7) {
        super(null);
        this.N = 3;
        this.O = "";
        this.X = new ArrayList();
        this.Y = new HashMap();
        this.Z = new HashMap();
        this.f43491a0 = new ArrayList();
        this.f43493b0 = new ArrayList();
        this.f43495c0 = new ArrayList();
        this.f43496d0 = new HashMap();
        this.f43498e0 = new LongSparseArray();
        this.f43502r = i7;
    }

    public static void E0(ArrayList arrayList, boolean z9) {
        int[][] iArr;
        if (z9) {
            iArr = f43486h0;
        } else {
            iArr = f43485g0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new tc1(iArr2[0], 0, 45, "c"));
            } else {
                arrayList.add(new tc1("c", iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
            }
        }
    }

    public static void Z(WallpapersListActivity wallpapersListActivity, int i7) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.F.getAdapter() != wallpapersListActivity.H) {
            if (i7 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.M.A();
            } else if (i7 == wallpapersListActivity.f43492b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f43495c0 = wallpapersListActivity.f43495c0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i7 == wallpapersListActivity.f43497e) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131746106, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131746107, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, null), new oc1(wallpapersListActivity));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                wallpapersListActivity.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                }
            }
        }
    }

    public static void a0(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.simpleActionBar.u()) {
            wallpapersListActivity.f43498e0.clear();
            wallpapersListActivity.simpleActionBar.t();
            wallpapersListActivity.I0();
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, wallpapersListActivity.getParentActivity(), null);
        wallpapersListActivity.L = u1Var;
        u1Var.f28558i0 = false;
        u1Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new l(wallpapersListActivity, 24));
    }

    public static void w0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.oi oiVar, Object obj, int i7) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        tc1 tc1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f43498e0;
        boolean z9 = false;
        if (wallpapersListActivity.simpleActionBar.u()) {
            if (tc1Var instanceof tc1) {
                obj2 = ((tc1) tc1Var).f50243l;
            } else {
                obj2 = tc1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f27114id) >= 0) {
                longSparseArray.remove(wallPaper.f27114id);
            } else {
                longSparseArray.put(wallPaper.f27114id, tc1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.simpleActionBar.t();
            } else {
                wallpapersListActivity.simpleActionBar.z(longSparseArray.size(), true);
            }
            wallpapersListActivity.f43500f0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f27114id) >= 0) {
                z9 = true;
            }
            oiVar.c(i7, z9, true);
            return;
        }
        boolean z10 = tc1Var instanceof TLRPC.TL_wallPaper;
        if (z10) {
            str = ((TLRPC.TL_wallPaper) tc1Var).slug;
        } else if (tc1Var instanceof tc1) {
            str = ((tc1) tc1Var).f50234a;
        } else if (tc1Var instanceof uc1) {
            str = ((uc1) tc1Var).f50470a;
        } else {
            str = null;
        }
        if (z10) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tc1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                tc1 tc1Var2 = new tc1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                tc1Var2.f50239g = tL_wallPaper;
                tc1Var2.f50243l = tL_wallPaper;
                tc1Var = tc1Var2;
            }
        }
        org.telegram.ui.Components.ko koVar = new org.telegram.ui.Components.ko(tc1Var, null, true, 4);
        if (wallpapersListActivity.f43502r == 1) {
            koVar.J1 = new oc1(wallpapersListActivity);
        }
        if (wallpapersListActivity.O.equals(str)) {
            boolean z11 = wallpapersListActivity.W;
            boolean z12 = wallpapersListActivity.V;
            float f10 = wallpapersListActivity.U;
            koVar.G1 = z11;
            koVar.F1 = z12;
            koVar.f51603o1 = f10;
        }
        koVar.V0 = wallpapersListActivity.f43495c0;
        if (koVar.f51565b == 1 || (koVar.C1 instanceof tc1)) {
            ((tc1) koVar.C1).getClass();
        }
        koVar.h1(0L);
        ?? obj3 = new Object();
        obj3.f27388a = true;
        koVar.f51561a.f51930a = wallpapersListActivity.resourceProvider;
        obj3.f27390c = new q61(6);
        obj3.f27391e = true;
        wallpapersListActivity.showAsSheet(koVar, obj3);
    }

    public static boolean x0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.oi oiVar, Object obj, int i7) {
        Object obj2;
        int i10 = wallpapersListActivity.f43502r;
        if (i10 != 2 && i10 != 3) {
            if (obj instanceof tc1) {
                obj2 = ((tc1) obj).f50243l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.simpleActionBar.u() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f43498e0.put(((TLRPC.WallPaper) obj2).f27114id, obj);
                wallpapersListActivity.simpleActionBar.z(1, false);
                wallpapersListActivity.f43500f0 = false;
                wallpapersListActivity.simpleActionBar.D();
                oiVar.c(i7, true, true);
                return true;
            }
        }
        return false;
    }

    public final void F0() {
        HashMap hashMap;
        ?? r52;
        long j3;
        final String str;
        final long j10;
        Object obj;
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.WallPaper wallPaper;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper2;
        Object obj2;
        int i14 = this.f43502r;
        if (i14 != 0 && i14 != 2) {
            return;
        }
        org.telegram.messenger.qp.e1();
        tc1 tc1Var = this.f43505x;
        ArrayList arrayList = this.f43491a0;
        if (tc1Var != null) {
            arrayList.remove(tc1Var);
            this.f43505x = null;
        }
        uc1 uc1Var = this.f43506y;
        if (uc1Var != null) {
            arrayList.remove(uc1Var);
            this.f43506y = null;
        }
        tc1 tc1Var2 = this.D;
        if (tc1Var2 == null) {
            tc1 tc1Var3 = new tc1("d", -2368069, -9722489, -2762611, -7817084);
            this.D = tc1Var3;
            tc1Var3.h = 0.34f;
        } else {
            arrayList.remove(tc1Var2);
        }
        uc1 uc1Var2 = this.E;
        if (uc1Var2 != null) {
            arrayList.remove(uc1Var2);
        }
        int size = arrayList.size();
        int i15 = 0;
        while (true) {
            hashMap = this.Y;
            if (i15 < size) {
                Object obj3 = arrayList.get(i15);
                if (obj3 instanceof tc1) {
                    r52 = (tc1) obj3;
                    String str3 = r52.f50234a;
                    if (str3 != null) {
                        r52.f50239g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r52.f50234a)) {
                        String str4 = r52.f50234a;
                        if (str4 != null && !TextUtils.equals(this.O, str4)) {
                            i15++;
                        }
                    }
                    if (this.P == r52.f50235b) {
                        int i16 = this.Q;
                        if (i16 != r52.f50236c) {
                            continue;
                        } else if (this.R != r52.d) {
                            continue;
                        } else if (this.S != r52.f50237e) {
                            continue;
                        } else if (i16 == 0 || this.T == r52.f50238f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i15++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        r52 = (TLRPC.TL_wallPaper) obj3;
                        if (r52.settings != null && TextUtils.equals(this.O, r52.slug) && this.P == org.telegram.ui.ActionBar.m6.a1(r52.settings.background_color) && this.Q == org.telegram.ui.ActionBar.m6.a1(r52.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.m6.a1(r52.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.m6.a1(r52.settings.fourth_background_color) && ((this.Q == 0 || this.T == org.telegram.messenger.g0.s1(r52.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.m6.U0(r52.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i15++;
                }
            } else {
                r52 = 0;
                break;
            }
        }
        if (r52 instanceof TLRPC.WallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper3 = r52;
            org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.m6.I.f27778i0;
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
            if (wallPaperSettings != null && this.P == org.telegram.ui.ActionBar.m6.a1(wallPaperSettings.background_color) && this.Q == org.telegram.ui.ActionBar.m6.a1(tL_wallPaper3.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.m6.a1(tL_wallPaper3.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.m6.a1(tL_wallPaper3.settings.fourth_background_color) && (this.Q == 0 || this.R != 0 || this.T == org.telegram.messenger.g0.s1(tL_wallPaper3.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.m6.U0(tL_wallPaper3.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
                str2 = this.O;
                tL_wallPaper2 = null;
                obj2 = r52;
            } else {
                str2 = "";
                tL_wallPaper2 = tL_wallPaper3;
                obj2 = null;
            }
            str = str2;
            tL_wallPaper = tL_wallPaper2;
            obj = obj2;
            j10 = tL_wallPaper3.f27114id;
        } else {
            String str5 = this.O;
            if ((r52 instanceof tc1) && (wallPaper = r52.f50243l) != null) {
                j3 = wallPaper.f27114id;
            } else {
                j3 = 0;
            }
            str = str5;
            j10 = j3;
            obj = r52;
            tL_wallPaper = null;
        }
        final boolean q10 = org.telegram.ui.ActionBar.m6.D0().q();
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj4, Object obj5) {
                    ArrayList arrayList2 = WallpapersListActivity.this.X;
                    if (obj4 instanceof tc1) {
                        obj4 = ((tc1) obj4).f50243l;
                    }
                    if (obj5 instanceof tc1) {
                        obj5 = ((tc1) obj5).f50243l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j11 = j10;
                        if (j11 != 0) {
                            if (wallPaper2.f27114id != j11) {
                                if (wallPaper3.f27114id == j11) {
                                    return 1;
                                }
                            } else {
                                return -1;
                            }
                        } else {
                            String str6 = wallPaper2.slug;
                            String str7 = str;
                            if (!str7.equals(str6)) {
                                if (str7.equals(wallPaper3.slug)) {
                                    return 1;
                                }
                            } else {
                                return -1;
                            }
                        }
                        boolean z9 = q10;
                        if (!z9) {
                            if (!"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper2.slug)) {
                                if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper3.slug)) {
                                    return 1;
                                }
                            } else {
                                return -1;
                            }
                        }
                        int indexOf = arrayList2.indexOf(wallPaper2);
                        int indexOf2 = arrayList2.indexOf(wallPaper3);
                        boolean z10 = wallPaper2.dark;
                        if ((z10 && wallPaper3.dark) || (!z10 && !wallPaper3.dark)) {
                            if (indexOf <= indexOf2) {
                                if (indexOf < indexOf2) {
                                    return -1;
                                }
                                return 0;
                            }
                            return 1;
                        } else if (z10 && !wallPaper3.dark) {
                            if (!z9) {
                                return 1;
                            }
                            return -1;
                        } else if (z9) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                    return 0;
                }
            });
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (org.telegram.ui.ActionBar.m6.g1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.m6.f27958h0)) {
            if (this.E == null) {
                ?? obj4 = new Object();
                obj4.f50470a = "t";
                obj4.f50471b = -2;
                obj4.f50472c = -2;
                this.E = obj4;
            }
            arrayList.add(0, this.E);
        } else {
            this.E = null;
        }
        org.telegram.ui.ActionBar.l6 l6Var = org.telegram.ui.ActionBar.m6.I;
        if (!TextUtils.isEmpty(this.O) && ("d".equals(this.O) || obj != null)) {
            if (obj == null && this.P != 0 && "c".equals(this.O)) {
                int i17 = this.Q;
                if (i17 != 0 && (i12 = this.R) != 0 && (i13 = this.S) != 0) {
                    tc1 tc1Var4 = new tc1(this.O, this.P, i17, i12, i13);
                    this.f43505x = tc1Var4;
                    tc1Var4.f50238f = this.T;
                } else {
                    this.f43505x = new tc1(this.P, i17, this.T, this.O);
                }
                arrayList.add(0, this.f43505x);
            }
        } else if (!"c".equals(this.O) && (i11 = this.P) != 0) {
            if (l6Var.f27778i0 != null) {
                tc1 tc1Var5 = new tc1(this.O, i11, this.Q, this.R, this.S, this.T, this.U, this.V, new File(org.telegram.messenger.t0.h(), l6Var.f27778i0.f27448a));
                this.f43505x = tc1Var5;
                tc1Var5.f50239g = tL_wallPaper;
                arrayList.add(0, tc1Var5);
            }
        } else {
            int i18 = this.P;
            if (i18 != 0) {
                int i19 = this.Q;
                if (i19 != 0 && (i10 = this.R) != 0) {
                    tc1 tc1Var6 = new tc1(this.O, i18, i19, i10, this.S);
                    this.f43505x = tc1Var6;
                    tc1Var6.f50238f = this.T;
                } else {
                    this.f43505x = new tc1(i18, i19, this.T, this.O);
                }
                arrayList.add(0, this.f43505x);
            } else if (l6Var.f27778i0 != null && !hashMap.containsKey(this.O)) {
                uc1 uc1Var3 = new uc1(new File(org.telegram.messenger.t0.h(), l6Var.f27778i0.f27448a), new File(org.telegram.messenger.t0.h(), l6Var.f27778i0.f27449b), this.O);
                this.f43506y = uc1Var3;
                if (this.E != null) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                arrayList.add(i7, uc1Var3);
            }
        }
        if (!"d".equals(this.O) && !arrayList.isEmpty()) {
            arrayList.add(1, this.D);
        } else {
            arrayList.add(0, this.D);
        }
        H0();
    }

    public final void G0(boolean z9) {
        long j3 = 0;
        if (!z9) {
            ArrayList arrayList = this.X;
            int size = arrayList.size();
            long j10 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = arrayList.get(i7);
                if (obj instanceof TLRPC.WallPaper) {
                    long j11 = ((TLRPC.WallPaper) obj).f27114id;
                    if (j11 >= 0) {
                        j10 = org.telegram.messenger.ui.p(j10, j11);
                    }
                }
            }
            j3 = j10;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j3;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new fi.d3(12, this, z9)), this.classGuid);
    }

    public final void H0() {
        this.f43490a = 0;
        int i7 = this.f43502r;
        if (i7 == 0) {
            this.uploadImageRow = 0;
            this.f43490a = 2;
            this.f43492b = 1;
            this.h = -1;
            this.f43501n = -1;
        } else if (i7 == 2) {
            this.uploadImageRow = -1;
            this.f43492b = -1;
            this.h = 0;
            this.f43490a = 2;
            this.f43501n = 1;
        } else {
            this.uploadImageRow = -1;
            this.f43492b = -1;
            this.h = -1;
            this.f43501n = -1;
        }
        ArrayList arrayList = this.f43491a0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.N);
            this.d = ceil;
            int i10 = this.f43490a;
            this.f43494c = i10;
            this.f43490a = i10 + ceil;
        } else {
            this.f43494c = -1;
        }
        if (i7 == 0) {
            int i11 = this.f43490a;
            this.f43497e = i11;
            this.f43490a = i11 + 2;
            this.f43499f = i11 + 1;
        } else {
            this.f43497e = -1;
            this.f43499f = -1;
        }
        vc1 vc1Var = this.G;
        if (vc1Var != null) {
            this.f43500f0 = true;
            vc1Var.f();
        }
    }

    public final void I0() {
        int childCount = this.F.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.F.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.ua) {
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) childAt;
                for (int i10 = 0; i10 < 5; i10++) {
                    uaVar.c(i10, false, true);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27910e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27929f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28055m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27890d6));
    }

    @Override
    public final View createView(Context context) {
        this.f43503s = new Paint(1);
        Paint paint = new Paint(1);
        this.f43504w = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f43504w.setStyle(Paint.Style.STROKE);
        this.f43504w.setColor(855638016);
        this.M = new a8.r7(getParentActivity(), this, new pc1(this));
        this.hasOwnBackground = true;
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.f43502r;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752244, null));
        } else if (i7 == 2) {
            this.simpleActionBar.setTitle("Channel Wallpaper");
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745662, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rc1(this));
        if (i7 == 0) {
            org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.q().b(0, 2131232486);
            b10.N();
            b10.B0 = new kg.v1(this, 23);
            this.J = b10;
            b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745816, null));
            org.telegram.ui.ActionBar.f5 n10 = this.simpleActionBar.n();
            n10.d(3, 2131232165, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131750587, null));
            n10.d(4, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131751598, null));
            this.f43498e0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.F = pj0Var;
        pj0Var.r1();
        org.telegram.ui.Components.pj0 pj0Var2 = this.F;
        int i10 = org.telegram.ui.ActionBar.m6.f27834a7;
        org.telegram.ui.ActionBar.t6.h(i10, pj0Var2, getResourceProvider());
        this.F.setHorizontalScrollBarEnabled(false);
        this.F.setVerticalScrollBarEnabled(false);
        this.F.setItemAnimator(null);
        this.F.setLayoutAnimation(null);
        org.telegram.ui.Components.pj0 pj0Var3 = this.F;
        jg.b0 b0Var = new jg.b0(1, false, 19);
        this.I = b0Var;
        pj0Var3.setLayoutManager(b0Var);
        frameLayout.addView(this.F, c8.ha.e(-1, -1, 51));
        org.telegram.ui.Components.pj0 pj0Var4 = this.F;
        vc1 vc1Var = new vc1(this, context);
        this.G = vc1Var;
        pj0Var4.setAdapter(vc1Var);
        this.H = new wc1(this, context);
        org.telegram.ui.ActionBar.t6.H(this.F, org.telegram.ui.ActionBar.m6.f27911e8, null);
        this.F.setOnItemClickListener(new ay0(this, 12));
        this.F.setOnScrollListener(new e21(this, 7));
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.K = iyVar;
        iyVar.setVisibility(8);
        this.K.setShowAtCenter(true);
        org.telegram.ui.ActionBar.t6.h(i10, this.K, null);
        this.K.setText(org.telegram.messenger.id.M0(2131748167, null));
        this.F.setEmptyView(this.K);
        frameLayout.addView(this.K, c8.ha.c(-1.0f, -1));
        H0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        ArrayList arrayList;
        tc1 tc1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i12;
        boolean z9;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i13 = 1;
        if (i7 == org.telegram.messenger.qs.f24998e4) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.f43495c0.clear();
            HashMap hashMap2 = this.f43496d0;
            hashMap2.clear();
            HashMap hashMap3 = this.Y;
            ArrayList arrayList3 = this.f43493b0;
            int i14 = this.f43502r;
            HashMap hashMap4 = this.Z;
            ArrayList arrayList4 = this.f43491a0;
            if (i14 != 1 && i14 != 2) {
                arrayList4.clear();
                arrayList3.clear();
                hashMap4.clear();
                ArrayList arrayList5 = this.X;
                arrayList5.clear();
                hashMap3.clear();
                arrayList5.addAll(arrayList2);
            }
            int size = arrayList2.size();
            int i15 = 0;
            ArrayList arrayList6 = null;
            while (i15 < size) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList2.get(i15);
                if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                    arrayList = arrayList2;
                    hashMap = hashMap2;
                    i11 = i14;
                } else {
                    if (wallPaper instanceof TLRPC.TL_wallPaper) {
                        TLRPC.Document document = wallPaper.document;
                        if (!(document instanceof TLRPC.TL_documentEmpty)) {
                            if (wallPaper.pattern && document != null) {
                                i11 = i14;
                                if (!hashMap2.containsKey(Long.valueOf(document.f26966id))) {
                                    this.f43495c0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f26966id), wallPaper);
                                }
                            } else {
                                i11 = i14;
                            }
                            hashMap3.put(wallPaper.slug, wallPaper);
                            if (i11 != i13 && ((!(z9 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i11 != 2 || z9) && (org.telegram.ui.ActionBar.m6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                arrayList4.add(wallPaper);
                            }
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                        }
                    }
                    i11 = i14;
                    TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                    int i16 = wallPaperSettings4.background_color;
                    if (i16 != 0) {
                        int i17 = wallPaperSettings4.second_background_color;
                        if (i17 != 0 && (i12 = wallPaperSettings4.third_background_color) != 0) {
                            arrayList = arrayList2;
                            tc1Var = new tc1(null, i16, i17, i12, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            tc1Var = new tc1(i16, i17, wallPaperSettings4.rotation, null);
                        }
                        tc1Var.f50234a = wallPaper.slug;
                        tc1Var.h = wallPaperSettings4.intensity / 100.0f;
                        tc1Var.f50238f = org.telegram.messenger.g0.s1(wallPaperSettings4.rotation, false);
                        tc1Var.f50243l = wallPaper;
                        if (wallPaper.f27114id < 0) {
                            String a10 = tc1Var.a();
                            if (hashMap4.containsKey(a10)) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(wallPaper);
                                i15++;
                                i14 = i11;
                                hashMap2 = hashMap;
                                arrayList2 = arrayList;
                                i13 = 1;
                            } else {
                                arrayList3.add(tc1Var);
                                hashMap4.put(a10, tc1Var);
                            }
                        }
                        if (org.telegram.ui.ActionBar.m6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(tc1Var);
                        }
                        i15++;
                        i14 = i11;
                        hashMap2 = hashMap;
                        arrayList2 = arrayList;
                        i13 = 1;
                    }
                    arrayList = arrayList2;
                    hashMap = hashMap2;
                }
                i15++;
                i14 = i11;
                hashMap2 = hashMap;
                arrayList2 = arrayList;
                i13 = 1;
            }
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    org.telegram.messenger.yr messagesStorage = getMessagesStorage();
                    messagesStorage.f26723a.c(new org.telegram.messenger.xp(messagesStorage, ((TLRPC.WallPaper) arrayList6.get(i18)).f27114id, 1));
                }
            }
            this.O = org.telegram.ui.ActionBar.m6.K0();
            F0();
            G0(false);
        } else if (i7 == org.telegram.messenger.qs.f25126z4) {
            org.telegram.ui.Components.pj0 pj0Var = this.F;
            if (pj0Var != null) {
                pj0Var.g1();
            }
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            if (z4Var != null) {
                z4Var.l(true);
            }
        } else if (i7 == org.telegram.messenger.qs.f25004f4) {
            getMessagesStorage().p0();
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.F;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27834a7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.K, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27873c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.K, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27964h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27890d6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.M.t(i7, i10, intent);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.pj0 pj0Var = this.F;
        if (pj0Var != null) {
            pj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 6));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7 = org.telegram.messenger.qs.f24998e4;
        int i10 = this.f43502r;
        if (i10 != 0 && i10 != 2) {
            E0(this.f43491a0, org.telegram.ui.ActionBar.m6.I.q());
            if (i10 == 1 && this.f43495c0.isEmpty()) {
                org.telegram.messenger.qs.e().c(this, i7);
                getMessagesStorage().p0();
            }
        } else {
            org.telegram.messenger.qs.e().c(this, i7);
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25126z4);
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25004f4);
            getMessagesStorage().p0();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        int i7 = org.telegram.messenger.qs.f24998e4;
        int i10 = this.f43502r;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.messenger.qs.e().n(this, i7);
            }
        } else {
            wc1 wc1Var = this.H;
            if (wc1Var.f50996s != 0) {
                ConnectionsManager.getInstance(wc1Var.E.currentAccount).cancelRequest(wc1Var.f50996s, true);
                wc1Var.f50996s = 0;
            }
            org.telegram.messenger.qs.e().n(this, i7);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25126z4);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25004f4);
        }
        this.M.getClass();
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        org.telegram.messenger.qp.e1();
        org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.m6.I.f27778i0;
        if (e6Var != null) {
            String str2 = e6Var.f27450c;
            this.O = str2;
            if (str2 == null) {
                this.O = "";
            }
            this.P = e6Var.d;
            this.Q = e6Var.f27451e;
            this.R = e6Var.f27452f;
            this.S = e6Var.f27453g;
            this.T = e6Var.h;
            this.U = e6Var.f27456k;
            this.V = e6Var.f27455j;
            this.W = e6Var.f27454i;
        } else {
            if (org.telegram.ui.ActionBar.m6.g1()) {
                str = "t";
            } else {
                str = "d";
            }
            this.O = str;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 45;
            this.U = 1.0f;
            this.V = false;
            this.W = false;
        }
        F0();
        org.telegram.ui.Components.pj0 pj0Var = this.F;
        if (pj0Var != null) {
            pj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 6));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.M.f614b = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = (String) this.M.f614b;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
