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
public class WallpapersListActivity extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public static final int[][] f45373h0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f45374i0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] f45375j0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f45376k0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] f45377l0 = {2131753674, 2131746148, 2131747575, 2131742588, 2131749311, 2131744018, 2131746381, 2131747041, 2131752868, 2131753695, 2131749312, 2131742625};
    public rc1 E;
    public sc1 F;
    public org.telegram.ui.Components.ck0 G;
    public tc1 H;
    public uc1 I;
    public jg.b0 J;
    public org.telegram.ui.ActionBar.h5 K;
    public org.telegram.ui.Components.ty L;
    public org.telegram.ui.ActionBar.u1 M;
    public a8.r7 N;
    public int O;
    public String P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public boolean W;
    public boolean X;
    public final ArrayList Y;
    public final HashMap Z;
    public int f45378a;
    public final HashMap f45379a0;
    public int f45380b;
    public final ArrayList f45381b0;
    public int f45382c;
    public final ArrayList f45383c0;
    public int d;
    public ArrayList f45384d0;
    public int f45385e;
    public final HashMap f45386e0;
    public int f45387f;
    public final LongSparseArray f45388f0;
    public boolean f45389g0;
    public int h;
    public int f45390n;
    public final int f45391r;
    public Paint f45392s;
    private int uploadImageRow;
    public Paint f45393w;
    public rc1 f45394x;
    public sc1 f45395y;

    public WallpapersListActivity(int i7) {
        super(null);
        this.O = 3;
        this.P = "";
        this.Y = new ArrayList();
        this.Z = new HashMap();
        this.f45379a0 = new HashMap();
        this.f45381b0 = new ArrayList();
        this.f45383c0 = new ArrayList();
        this.f45384d0 = new ArrayList();
        this.f45386e0 = new HashMap();
        this.f45388f0 = new LongSparseArray();
        this.f45391r = i7;
    }

    public static void E0(ArrayList arrayList, boolean z10) {
        int[][] iArr;
        if (z10) {
            iArr = f45374i0;
        } else {
            iArr = f45373h0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new rc1(iArr2[0], 0, 45, "c"));
            } else {
                arrayList.add(new rc1("c", iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
            }
        }
    }

    public static void Z(WallpapersListActivity wallpapersListActivity, int i7) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.G.getAdapter() != wallpapersListActivity.I) {
            if (i7 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.N.G();
            } else if (i7 == wallpapersListActivity.f45380b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f45384d0 = wallpapersListActivity.f45384d0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i7 == wallpapersListActivity.f45385e) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131745911, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.M0(2131745912, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745923, null), new mc1(wallpapersListActivity));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                wallpapersListActivity.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, null);
                }
            }
        }
    }

    public static void a0(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.simpleActionBar.x()) {
            wallpapersListActivity.f45388f0.clear();
            wallpapersListActivity.simpleActionBar.w();
            wallpapersListActivity.I0();
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, wallpapersListActivity.getParentActivity(), null);
        wallpapersListActivity.M = u1Var;
        u1Var.f30049j0 = false;
        u1Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new l(wallpapersListActivity, 24));
    }

    public static void w0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.ej ejVar, Object obj, int i7) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        rc1 rc1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f45388f0;
        boolean z10 = false;
        if (wallpapersListActivity.simpleActionBar.x()) {
            if (rc1Var instanceof rc1) {
                obj2 = ((rc1) rc1Var).f51586l;
            } else {
                obj2 = rc1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f28559id) >= 0) {
                longSparseArray.remove(wallPaper.f28559id);
            } else {
                longSparseArray.put(wallPaper.f28559id, rc1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.simpleActionBar.w();
            } else {
                wallpapersListActivity.simpleActionBar.E(longSparseArray.size(), true);
            }
            wallpapersListActivity.f45389g0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f28559id) >= 0) {
                z10 = true;
            }
            ejVar.c(i7, z10, true);
            return;
        }
        boolean z11 = rc1Var instanceof TLRPC.TL_wallPaper;
        if (z11) {
            str = ((TLRPC.TL_wallPaper) rc1Var).slug;
        } else if (rc1Var instanceof rc1) {
            str = ((rc1) rc1Var).f51577a;
        } else if (rc1Var instanceof sc1) {
            str = ((sc1) rc1Var).f51971a;
        } else {
            str = null;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) rc1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                rc1 rc1Var2 = new rc1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                rc1Var2.f51582g = tL_wallPaper;
                rc1Var2.f51586l = tL_wallPaper;
                rc1Var = rc1Var2;
            }
        }
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(rc1Var, null, true, 4);
        if (wallpapersListActivity.f45391r == 1) {
            bpVar.K1 = new mc1(wallpapersListActivity);
        }
        if (wallpapersListActivity.P.equals(str)) {
            boolean z12 = wallpapersListActivity.X;
            boolean z13 = wallpapersListActivity.W;
            float f10 = wallpapersListActivity.V;
            bpVar.H1 = z12;
            bpVar.G1 = z13;
            bpVar.f53727p1 = f10;
        }
        bpVar.W0 = wallpapersListActivity.f45384d0;
        if (bpVar.f53686b == 1 || (bpVar.D1 instanceof rc1)) {
            ((rc1) bpVar.D1).getClass();
        }
        bpVar.h1(0L);
        ?? obj3 = new Object();
        obj3.f28923a = true;
        bpVar.f53682a.f52981a = wallpapersListActivity.resourceProvider;
        obj3.f28925c = new cd0(12);
        obj3.f28926e = true;
        wallpapersListActivity.showAsSheet(bpVar, obj3);
    }

    public static boolean x0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.ej ejVar, Object obj, int i7) {
        Object obj2;
        int i10 = wallpapersListActivity.f45391r;
        if (i10 != 2 && i10 != 3) {
            if (obj instanceof rc1) {
                obj2 = ((rc1) obj).f51586l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.simpleActionBar.x() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f45388f0.put(((TLRPC.WallPaper) obj2).f28559id, obj);
                wallpapersListActivity.simpleActionBar.E(1, false);
                wallpapersListActivity.f45389g0 = false;
                wallpapersListActivity.simpleActionBar.J();
                ejVar.c(i7, true, true);
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
        int i14 = this.f45391r;
        if (i14 != 0 && i14 != 2) {
            return;
        }
        org.telegram.messenger.mp.g1();
        rc1 rc1Var = this.f45394x;
        ArrayList arrayList = this.f45381b0;
        if (rc1Var != null) {
            arrayList.remove(rc1Var);
            this.f45394x = null;
        }
        sc1 sc1Var = this.f45395y;
        if (sc1Var != null) {
            arrayList.remove(sc1Var);
            this.f45395y = null;
        }
        rc1 rc1Var2 = this.E;
        if (rc1Var2 == null) {
            rc1 rc1Var3 = new rc1("d", -2368069, -9722489, -2762611, -7817084);
            this.E = rc1Var3;
            rc1Var3.h = 0.34f;
        } else {
            arrayList.remove(rc1Var2);
        }
        sc1 sc1Var2 = this.F;
        if (sc1Var2 != null) {
            arrayList.remove(sc1Var2);
        }
        int size = arrayList.size();
        int i15 = 0;
        while (true) {
            hashMap = this.Z;
            if (i15 < size) {
                Object obj3 = arrayList.get(i15);
                if (obj3 instanceof rc1) {
                    r52 = (rc1) obj3;
                    String str3 = r52.f51577a;
                    if (str3 != null) {
                        r52.f51582g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r52.f51577a)) {
                        String str4 = r52.f51577a;
                        if (str4 != null && !TextUtils.equals(this.P, str4)) {
                            i15++;
                        }
                    }
                    if (this.Q == r52.f51578b) {
                        int i16 = this.R;
                        if (i16 != r52.f51579c) {
                            continue;
                        } else if (this.S != r52.d) {
                            continue;
                        } else if (this.T != r52.f51580e) {
                            continue;
                        } else if (i16 == 0 || this.U == r52.f51581f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i15++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        r52 = (TLRPC.TL_wallPaper) obj3;
                        if (r52.settings != null && TextUtils.equals(this.P, r52.slug) && this.Q == org.telegram.ui.ActionBar.n6.a1(r52.settings.background_color) && this.R == org.telegram.ui.ActionBar.n6.a1(r52.settings.second_background_color) && this.S == org.telegram.ui.ActionBar.n6.a1(r52.settings.third_background_color) && this.T == org.telegram.ui.ActionBar.n6.a1(r52.settings.fourth_background_color) && ((this.R == 0 || this.U == org.telegram.messenger.g0.s1(r52.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.n6.U0(r52.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
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
            org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.n6.I.f29263j0;
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
            if (wallPaperSettings != null && this.Q == org.telegram.ui.ActionBar.n6.a1(wallPaperSettings.background_color) && this.R == org.telegram.ui.ActionBar.n6.a1(tL_wallPaper3.settings.second_background_color) && this.S == org.telegram.ui.ActionBar.n6.a1(tL_wallPaper3.settings.third_background_color) && this.T == org.telegram.ui.ActionBar.n6.a1(tL_wallPaper3.settings.fourth_background_color) && (this.R == 0 || this.S != 0 || this.U == org.telegram.messenger.g0.s1(tL_wallPaper3.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.n6.U0(tL_wallPaper3.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
                str2 = this.P;
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
            j10 = tL_wallPaper3.f28559id;
        } else {
            String str5 = this.P;
            if ((r52 instanceof rc1) && (wallPaper = r52.f51586l) != null) {
                j3 = wallPaper.f28559id;
            } else {
                j3 = 0;
            }
            str = str5;
            j10 = j3;
            obj = r52;
            tL_wallPaper = null;
        }
        final boolean q10 = org.telegram.ui.ActionBar.n6.D0().q();
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj4, Object obj5) {
                    ArrayList arrayList2 = WallpapersListActivity.this.Y;
                    if (obj4 instanceof rc1) {
                        obj4 = ((rc1) obj4).f51586l;
                    }
                    if (obj5 instanceof rc1) {
                        obj5 = ((rc1) obj5).f51586l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j11 = j10;
                        if (j11 != 0) {
                            if (wallPaper2.f28559id != j11) {
                                if (wallPaper3.f28559id == j11) {
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
                        boolean z10 = q10;
                        if (!z10) {
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
                        boolean z11 = wallPaper2.dark;
                        if ((z11 && wallPaper3.dark) || (!z11 && !wallPaper3.dark)) {
                            if (indexOf <= indexOf2) {
                                if (indexOf < indexOf2) {
                                    return -1;
                                }
                                return 0;
                            }
                            return 1;
                        } else if (z11 && !wallPaper3.dark) {
                            if (!z10) {
                                return 1;
                            }
                            return -1;
                        } else if (z10) {
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
        if (org.telegram.ui.ActionBar.n6.g1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.n6.f29464h0)) {
            if (this.F == null) {
                ?? obj4 = new Object();
                obj4.f51971a = "t";
                obj4.f51972b = -2;
                obj4.f51973c = -2;
                this.F = obj4;
            }
            arrayList.add(0, this.F);
        } else {
            this.F = null;
        }
        org.telegram.ui.ActionBar.m6 m6Var = org.telegram.ui.ActionBar.n6.I;
        if (!TextUtils.isEmpty(this.P) && ("d".equals(this.P) || obj != null)) {
            if (obj == null && this.Q != 0 && "c".equals(this.P)) {
                int i17 = this.R;
                if (i17 != 0 && (i12 = this.S) != 0 && (i13 = this.T) != 0) {
                    rc1 rc1Var4 = new rc1(this.P, this.Q, i17, i12, i13);
                    this.f45394x = rc1Var4;
                    rc1Var4.f51581f = this.U;
                } else {
                    this.f45394x = new rc1(this.Q, i17, this.U, this.P);
                }
                arrayList.add(0, this.f45394x);
            }
        } else if (!"c".equals(this.P) && (i11 = this.Q) != 0) {
            if (m6Var.f29263j0 != null) {
                rc1 rc1Var5 = new rc1(this.P, i11, this.R, this.S, this.T, this.U, this.V, this.W, new File(org.telegram.messenger.t0.h(), m6Var.f29263j0.f28899a));
                this.f45394x = rc1Var5;
                rc1Var5.f51582g = tL_wallPaper;
                arrayList.add(0, rc1Var5);
            }
        } else {
            int i18 = this.Q;
            if (i18 != 0) {
                int i19 = this.R;
                if (i19 != 0 && (i10 = this.S) != 0) {
                    rc1 rc1Var6 = new rc1(this.P, i18, i19, i10, this.T);
                    this.f45394x = rc1Var6;
                    rc1Var6.f51581f = this.U;
                } else {
                    this.f45394x = new rc1(i18, i19, this.U, this.P);
                }
                arrayList.add(0, this.f45394x);
            } else if (m6Var.f29263j0 != null && !hashMap.containsKey(this.P)) {
                sc1 sc1Var3 = new sc1(new File(org.telegram.messenger.t0.h(), m6Var.f29263j0.f28899a), new File(org.telegram.messenger.t0.h(), m6Var.f29263j0.f28900b), this.P);
                this.f45395y = sc1Var3;
                if (this.F != null) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                arrayList.add(i7, sc1Var3);
            }
        }
        if (!"d".equals(this.P) && !arrayList.isEmpty()) {
            arrayList.add(1, this.E);
        } else {
            arrayList.add(0, this.E);
        }
        H0();
    }

    public final void G0(boolean z10) {
        long j3 = 0;
        if (!z10) {
            ArrayList arrayList = this.Y;
            int size = arrayList.size();
            long j10 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = arrayList.get(i7);
                if (obj instanceof TLRPC.WallPaper) {
                    long j11 = ((TLRPC.WallPaper) obj).f28559id;
                    if (j11 >= 0) {
                        j10 = org.telegram.messenger.ri.r(j10, j11);
                    }
                }
            }
            j3 = j10;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j3;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new hi.c3(12, this, z10)), this.classGuid);
    }

    public final void H0() {
        this.f45378a = 0;
        int i7 = this.f45391r;
        if (i7 == 0) {
            this.uploadImageRow = 0;
            this.f45378a = 2;
            this.f45380b = 1;
            this.h = -1;
            this.f45390n = -1;
        } else if (i7 == 2) {
            this.uploadImageRow = -1;
            this.f45380b = -1;
            this.h = 0;
            this.f45378a = 2;
            this.f45390n = 1;
        } else {
            this.uploadImageRow = -1;
            this.f45380b = -1;
            this.h = -1;
            this.f45390n = -1;
        }
        ArrayList arrayList = this.f45381b0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.O);
            this.d = ceil;
            int i10 = this.f45378a;
            this.f45382c = i10;
            this.f45378a = i10 + ceil;
        } else {
            this.f45382c = -1;
        }
        if (i7 == 0) {
            int i11 = this.f45378a;
            this.f45385e = i11;
            this.f45378a = i11 + 2;
            this.f45387f = i11 + 1;
        } else {
            this.f45385e = -1;
            this.f45387f = -1;
        }
        tc1 tc1Var = this.H;
        if (tc1Var != null) {
            this.f45389g0 = true;
            tc1Var.f();
        }
    }

    public final void I0() {
        int childCount = this.G.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.G.getChildAt(i7);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29416e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29435f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29561m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29488i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29396d6));
    }

    @Override
    public final View createView(Context context) {
        this.f45392s = new Paint(1);
        Paint paint = new Paint(1);
        this.f45393w = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f45393w.setStyle(Paint.Style.STROKE);
        this.f45393w.setColor(855638016);
        this.N = new a8.r7(getParentActivity(), this, new nc1(this));
        this.hasOwnBackground = true;
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.f45391r;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131752233, null));
        } else if (i7 == 2) {
            this.simpleActionBar.setTitle("Channel Wallpaper");
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131745467, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new pc1(this));
        if (i7 == 0) {
            org.telegram.ui.ActionBar.h5 b10 = this.simpleActionBar.t().b(0, 2131232488);
            b10.O();
            b10.C0 = new bi.s1(this, 24);
            this.K = b10;
            b10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745621, null));
            org.telegram.ui.ActionBar.g5 q10 = this.simpleActionBar.q();
            q10.d(3, 2131232167, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131750571, null));
            q10.d(4, 2131232110, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131751587, null));
            this.f45388f0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.G = ck0Var;
        ck0Var.r1();
        org.telegram.ui.Components.ck0 ck0Var2 = this.G;
        int i10 = org.telegram.ui.ActionBar.n6.f29339a7;
        org.telegram.ui.ActionBar.u6.h(i10, ck0Var2, getResourceProvider());
        this.G.setHorizontalScrollBarEnabled(false);
        this.G.setVerticalScrollBarEnabled(false);
        this.G.setItemAnimator(null);
        this.G.setLayoutAnimation(null);
        org.telegram.ui.Components.ck0 ck0Var3 = this.G;
        jg.b0 b0Var = new jg.b0(1, false, 19);
        this.J = b0Var;
        ck0Var3.setLayoutManager(b0Var);
        frameLayout.addView(this.G, c8.ma.e(-1, -1, 51));
        org.telegram.ui.Components.ck0 ck0Var4 = this.G;
        tc1 tc1Var = new tc1(this, context);
        this.H = tc1Var;
        ck0Var4.setAdapter(tc1Var);
        this.I = new uc1(this, context);
        org.telegram.ui.ActionBar.u6.H(this.G, org.telegram.ui.ActionBar.n6.f29417e8, null);
        this.G.setOnItemClickListener(new zx0(this, 12));
        this.G.setOnScrollListener(new c21(this, 7));
        org.telegram.ui.Components.ty tyVar = new org.telegram.ui.Components.ty(context, null);
        this.L = tyVar;
        tyVar.setVisibility(8);
        this.L.setShowAtCenter(true);
        org.telegram.ui.ActionBar.u6.h(i10, this.L, null);
        this.L.setText(org.telegram.messenger.gd.M0(2131747975, null));
        this.G.setEmptyView(this.L);
        frameLayout.addView(this.L, c8.ma.c(-1.0f, -1));
        H0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        ArrayList arrayList;
        rc1 rc1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i12;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i13 = 1;
        if (i7 == org.telegram.messenger.ks.f25122g4) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.f45384d0.clear();
            HashMap hashMap2 = this.f45386e0;
            hashMap2.clear();
            HashMap hashMap3 = this.Z;
            ArrayList arrayList3 = this.f45383c0;
            int i14 = this.f45391r;
            HashMap hashMap4 = this.f45379a0;
            ArrayList arrayList4 = this.f45381b0;
            if (i14 != 1 && i14 != 2) {
                arrayList4.clear();
                arrayList3.clear();
                hashMap4.clear();
                ArrayList arrayList5 = this.Y;
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
                                if (!hashMap2.containsKey(Long.valueOf(document.f28411id))) {
                                    this.f45384d0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f28411id), wallPaper);
                                }
                            } else {
                                i11 = i14;
                            }
                            hashMap3.put(wallPaper.slug, wallPaper);
                            if (i11 != i13 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i11 != 2 || z10) && (org.telegram.ui.ActionBar.n6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
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
                            rc1Var = new rc1(null, i16, i17, i12, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            rc1Var = new rc1(i16, i17, wallPaperSettings4.rotation, null);
                        }
                        rc1Var.f51577a = wallPaper.slug;
                        rc1Var.h = wallPaperSettings4.intensity / 100.0f;
                        rc1Var.f51581f = org.telegram.messenger.g0.s1(wallPaperSettings4.rotation, false);
                        rc1Var.f51586l = wallPaper;
                        if (wallPaper.f28559id < 0) {
                            String a10 = rc1Var.a();
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
                                arrayList3.add(rc1Var);
                                hashMap4.put(a10, rc1Var);
                            }
                        }
                        if (org.telegram.ui.ActionBar.n6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(rc1Var);
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
                    org.telegram.messenger.tr messagesStorage = getMessagesStorage();
                    messagesStorage.f27054a.c(new org.telegram.messenger.pp(messagesStorage, ((TLRPC.WallPaper) arrayList6.get(i18)).f28559id, 1));
                }
            }
            this.P = org.telegram.ui.ActionBar.n6.K0();
            F0();
            G0(false);
        } else if (i7 == org.telegram.messenger.ks.B4) {
            org.telegram.ui.Components.ck0 ck0Var = this.G;
            if (ck0Var != null) {
                ck0Var.g1();
            }
            org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
            if (a5Var != null) {
                a5Var.o(true);
            }
        } else if (i7 == org.telegram.messenger.ks.f25128h4) {
            getMessagesStorage().p0();
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.G;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29339a7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.L, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29379c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.L, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29470h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.L, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29396d6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.N.w(i7, i10, intent);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.ck0 ck0Var = this.G;
        if (ck0Var != null) {
            ck0Var.getViewTreeObserver().addOnPreDrawListener(new d7(this, 6));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7 = org.telegram.messenger.ks.f25122g4;
        int i10 = this.f45391r;
        if (i10 != 0 && i10 != 2) {
            E0(this.f45381b0, org.telegram.ui.ActionBar.n6.I.q());
            if (i10 == 1 && this.f45384d0.isEmpty()) {
                org.telegram.messenger.ks.e().c(this, i7);
                getMessagesStorage().p0();
            }
        } else {
            org.telegram.messenger.ks.e().c(this, i7);
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.B4);
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25128h4);
            getMessagesStorage().p0();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        int i7 = org.telegram.messenger.ks.f25122g4;
        int i10 = this.f45391r;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.messenger.ks.e().n(this, i7);
            }
        } else {
            uc1 uc1Var = this.I;
            if (uc1Var.f52527s != 0) {
                ConnectionsManager.getInstance(uc1Var.F.currentAccount).cancelRequest(uc1Var.f52527s, true);
                uc1Var.f52527s = 0;
            }
            org.telegram.messenger.ks.e().n(this, i7);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.B4);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25128h4);
        }
        this.N.getClass();
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        org.telegram.messenger.mp.g1();
        org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.n6.I.f29263j0;
        if (e6Var != null) {
            String str2 = e6Var.f28901c;
            this.P = str2;
            if (str2 == null) {
                this.P = "";
            }
            this.Q = e6Var.d;
            this.R = e6Var.f28902e;
            this.S = e6Var.f28903f;
            this.T = e6Var.f28904g;
            this.U = e6Var.h;
            this.V = e6Var.f28907k;
            this.W = e6Var.f28906j;
            this.X = e6Var.f28905i;
        } else {
            if (org.telegram.ui.ActionBar.n6.g1()) {
                str = "t";
            } else {
                str = "d";
            }
            this.P = str;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 45;
            this.V = 1.0f;
            this.W = false;
            this.X = false;
        }
        F0();
        org.telegram.ui.Components.ck0 ck0Var = this.G;
        if (ck0Var != null) {
            ck0Var.getViewTreeObserver().addOnPreDrawListener(new d7(this, 6));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.N.f617b = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = (String) this.N.f617b;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
