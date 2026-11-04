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
public class WallpapersListActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public static final int[][] f43519h0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f43520i0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] f43521j0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f43522k0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] f43523l0 = {2131753676, 2131746351, 2131747776, 2131742856, 2131749511, 2131744263, 2131746584, 2131747242, 2131752879, 2131753697, 2131749512, 2131742893};
    public kc1 E;
    public lc1 F;
    public org.telegram.ui.Components.tj0 G;
    public mc1 H;
    public nc1 I;
    public kg.y J;
    public org.telegram.ui.ActionBar.f5 K;
    public org.telegram.ui.Components.gy L;
    public org.telegram.ui.ActionBar.s1 M;
    public b8.ke N;
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
    public int f43524a;
    public final HashMap f43525a0;
    public int f43526b;
    public final ArrayList f43527b0;
    public int f43528c;
    public final ArrayList f43529c0;
    public int d;
    public ArrayList f43530d0;
    public int f43531e;
    public final HashMap f43532e0;
    public int f43533f;
    public final LongSparseArray f43534f0;
    public boolean f43535g0;
    public int h;
    public int f43536n;
    public final int f43537r;
    public Paint f43538s;
    private int uploadImageRow;
    public Paint f43539w;
    public kc1 f43540x;
    public lc1 f43541y;

    public WallpapersListActivity(int i3) {
        super(null);
        this.O = 3;
        this.P = "";
        this.Y = new ArrayList();
        this.Z = new HashMap();
        this.f43525a0 = new HashMap();
        this.f43527b0 = new ArrayList();
        this.f43529c0 = new ArrayList();
        this.f43530d0 = new ArrayList();
        this.f43532e0 = new HashMap();
        this.f43534f0 = new LongSparseArray();
        this.f43537r = i3;
    }

    public static void E0(ArrayList arrayList, boolean z10) {
        int[][] iArr;
        if (z10) {
            iArr = f43520i0;
        } else {
            iArr = f43519h0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new kc1(iArr2[0], 0, 45, "c"));
            } else {
                arrayList.add(new kc1("c", iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
            }
        }
    }

    public static void Z(WallpapersListActivity wallpapersListActivity, int i3) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.G.getAdapter() != wallpapersListActivity.I) {
            if (i3 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.N.B();
            } else if (i3 == wallpapersListActivity.f43526b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f43530d0 = wallpapersListActivity.f43530d0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i3 == wallpapersListActivity.f43531e) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131746116, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131746117, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new ec1(wallpapersListActivity));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                wallpapersListActivity.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                }
            }
        }
    }

    public static void a0(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.simpleActionBar.s()) {
            wallpapersListActivity.f43534f0.clear();
            wallpapersListActivity.simpleActionBar.r();
            wallpapersListActivity.I0();
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, wallpapersListActivity.getParentActivity(), null);
        wallpapersListActivity.M = s1Var;
        s1Var.f28546j0 = false;
        s1Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new l(wallpapersListActivity, 25));
    }

    public static void w0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.pi piVar, Object obj, int i3) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        kc1 kc1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f43534f0;
        boolean z10 = false;
        if (wallpapersListActivity.simpleActionBar.s()) {
            if (kc1Var instanceof kc1) {
                obj2 = ((kc1) kc1Var).f46906l;
            } else {
                obj2 = kc1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f27155id) >= 0) {
                longSparseArray.remove(wallPaper.f27155id);
            } else {
                longSparseArray.put(wallPaper.f27155id, kc1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.simpleActionBar.r();
            } else {
                wallpapersListActivity.simpleActionBar.x(longSparseArray.size(), true);
            }
            wallpapersListActivity.f43535g0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f27155id) >= 0) {
                z10 = true;
            }
            piVar.c(i3, z10, true);
            return;
        }
        boolean z11 = kc1Var instanceof TLRPC.TL_wallPaper;
        if (z11) {
            str = ((TLRPC.TL_wallPaper) kc1Var).slug;
        } else if (kc1Var instanceof kc1) {
            str = ((kc1) kc1Var).f46897a;
        } else if (kc1Var instanceof lc1) {
            str = ((lc1) kc1Var).f47301a;
        } else {
            str = null;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) kc1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                kc1 kc1Var2 = new kc1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                kc1Var2.f46902g = tL_wallPaper;
                kc1Var2.f46906l = tL_wallPaper;
                kc1Var = kc1Var2;
            }
        }
        org.telegram.ui.Components.lo loVar = new org.telegram.ui.Components.lo(kc1Var, null, true, 4);
        if (wallpapersListActivity.f43537r == 1) {
            loVar.K1 = new ec1(wallpapersListActivity);
        }
        if (wallpapersListActivity.P.equals(str)) {
            boolean z12 = wallpapersListActivity.X;
            boolean z13 = wallpapersListActivity.W;
            float f10 = wallpapersListActivity.V;
            loVar.H1 = z12;
            loVar.G1 = z13;
            loVar.f47186p1 = f10;
        }
        loVar.W0 = wallpapersListActivity.f43530d0;
        if (loVar.f47145b == 1 || (loVar.D1 instanceof kc1)) {
            ((kc1) loVar.D1).getClass();
        }
        loVar.h1(0L);
        ?? obj3 = new Object();
        obj3.f27395a = true;
        loVar.f47141a.f47115a = wallpapersListActivity.resourceProvider;
        obj3.f27397c = new hb1(5);
        obj3.f27398e = true;
        wallpapersListActivity.showAsSheet(loVar, obj3);
    }

    public static boolean x0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.pi piVar, Object obj, int i3) {
        Object obj2;
        int i10 = wallpapersListActivity.f43537r;
        if (i10 != 2 && i10 != 3) {
            if (obj instanceof kc1) {
                obj2 = ((kc1) obj).f46906l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.simpleActionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f43534f0.put(((TLRPC.WallPaper) obj2).f27155id, obj);
                wallpapersListActivity.simpleActionBar.x(1, false);
                wallpapersListActivity.f43535g0 = false;
                wallpapersListActivity.simpleActionBar.B();
                piVar.c(i3, true, true);
                return true;
            }
        }
        return false;
    }

    public final void F0() {
        HashMap hashMap;
        ?? r5;
        long j10;
        final String str;
        final long j11;
        Object obj;
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.WallPaper wallPaper;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper2;
        Object obj2;
        int i14 = this.f43537r;
        if (i14 != 0 && i14 != 2) {
            return;
        }
        org.telegram.messenger.hp.e1();
        kc1 kc1Var = this.f43540x;
        ArrayList arrayList = this.f43527b0;
        if (kc1Var != null) {
            arrayList.remove(kc1Var);
            this.f43540x = null;
        }
        lc1 lc1Var = this.f43541y;
        if (lc1Var != null) {
            arrayList.remove(lc1Var);
            this.f43541y = null;
        }
        kc1 kc1Var2 = this.E;
        if (kc1Var2 == null) {
            kc1 kc1Var3 = new kc1("d", -2368069, -9722489, -2762611, -7817084);
            this.E = kc1Var3;
            kc1Var3.h = 0.34f;
        } else {
            arrayList.remove(kc1Var2);
        }
        lc1 lc1Var2 = this.F;
        if (lc1Var2 != null) {
            arrayList.remove(lc1Var2);
        }
        int size = arrayList.size();
        int i15 = 0;
        while (true) {
            hashMap = this.Z;
            if (i15 < size) {
                Object obj3 = arrayList.get(i15);
                if (obj3 instanceof kc1) {
                    r5 = (kc1) obj3;
                    String str3 = r5.f46897a;
                    if (str3 != null) {
                        r5.f46902g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r5.f46897a)) {
                        String str4 = r5.f46897a;
                        if (str4 != null && !TextUtils.equals(this.P, str4)) {
                            i15++;
                        }
                    }
                    if (this.Q == r5.f46898b) {
                        int i16 = this.R;
                        if (i16 != r5.f46899c) {
                            continue;
                        } else if (this.S != r5.d) {
                            continue;
                        } else if (this.T != r5.f46900e) {
                            continue;
                        } else if (i16 == 0 || this.U == r5.f46901f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i15++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        r5 = (TLRPC.TL_wallPaper) obj3;
                        if (r5.settings != null && TextUtils.equals(this.P, r5.slug) && this.Q == org.telegram.ui.ActionBar.k6.a1(r5.settings.background_color) && this.R == org.telegram.ui.ActionBar.k6.a1(r5.settings.second_background_color) && this.S == org.telegram.ui.ActionBar.k6.a1(r5.settings.third_background_color) && this.T == org.telegram.ui.ActionBar.k6.a1(r5.settings.fourth_background_color) && ((this.R == 0 || this.U == org.telegram.messenger.g0.s1(r5.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.k6.U0(r5.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i15++;
                }
            } else {
                r5 = 0;
                break;
            }
        }
        if (r5 instanceof TLRPC.WallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper3 = r5;
            org.telegram.ui.ActionBar.b6 b6Var = org.telegram.ui.ActionBar.k6.I.f27689j0;
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
            if (wallPaperSettings != null && this.Q == org.telegram.ui.ActionBar.k6.a1(wallPaperSettings.background_color) && this.R == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper3.settings.second_background_color) && this.S == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper3.settings.third_background_color) && this.T == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper3.settings.fourth_background_color) && (this.R == 0 || this.S != 0 || this.U == org.telegram.messenger.g0.s1(tL_wallPaper3.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.k6.U0(tL_wallPaper3.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
                str2 = this.P;
                tL_wallPaper2 = null;
                obj2 = r5;
            } else {
                str2 = "";
                tL_wallPaper2 = tL_wallPaper3;
                obj2 = null;
            }
            str = str2;
            tL_wallPaper = tL_wallPaper2;
            obj = obj2;
            j11 = tL_wallPaper3.f27155id;
        } else {
            String str5 = this.P;
            if ((r5 instanceof kc1) && (wallPaper = r5.f46906l) != null) {
                j10 = wallPaper.f27155id;
            } else {
                j10 = 0;
            }
            str = str5;
            j11 = j10;
            obj = r5;
            tL_wallPaper = null;
        }
        final boolean q10 = org.telegram.ui.ActionBar.k6.D0().q();
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj4, Object obj5) {
                    ArrayList arrayList2 = WallpapersListActivity.this.Y;
                    if (obj4 instanceof kc1) {
                        obj4 = ((kc1) obj4).f46906l;
                    }
                    if (obj5 instanceof kc1) {
                        obj5 = ((kc1) obj5).f46906l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j12 = j11;
                        if (j12 != 0) {
                            if (wallPaper2.f27155id != j12) {
                                if (wallPaper3.f27155id == j12) {
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
        if (org.telegram.ui.ActionBar.k6.g1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.k6.f27949h0)) {
            if (this.F == null) {
                ?? obj4 = new Object();
                obj4.f47301a = "t";
                obj4.f47302b = -2;
                obj4.f47303c = -2;
                this.F = obj4;
            }
            arrayList.add(0, this.F);
        } else {
            this.F = null;
        }
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
        if (!TextUtils.isEmpty(this.P) && ("d".equals(this.P) || obj != null)) {
            if (obj == null && this.Q != 0 && "c".equals(this.P)) {
                int i17 = this.R;
                if (i17 != 0 && (i12 = this.S) != 0 && (i13 = this.T) != 0) {
                    kc1 kc1Var4 = new kc1(this.P, this.Q, i17, i12, i13);
                    this.f43540x = kc1Var4;
                    kc1Var4.f46901f = this.U;
                } else {
                    this.f43540x = new kc1(this.Q, i17, this.U, this.P);
                }
                arrayList.add(0, this.f43540x);
            }
        } else if (!"c".equals(this.P) && (i11 = this.Q) != 0) {
            if (j6Var.f27689j0 != null) {
                kc1 kc1Var5 = new kc1(this.P, i11, this.R, this.S, this.T, this.U, this.V, this.W, new File(org.telegram.messenger.t0.h(), j6Var.f27689j0.f27422a));
                this.f43540x = kc1Var5;
                kc1Var5.f46902g = tL_wallPaper;
                arrayList.add(0, kc1Var5);
            }
        } else {
            int i18 = this.Q;
            if (i18 != 0) {
                int i19 = this.R;
                if (i19 != 0 && (i10 = this.S) != 0) {
                    kc1 kc1Var6 = new kc1(this.P, i18, i19, i10, this.T);
                    this.f43540x = kc1Var6;
                    kc1Var6.f46901f = this.U;
                } else {
                    this.f43540x = new kc1(i18, i19, this.U, this.P);
                }
                arrayList.add(0, this.f43540x);
            } else if (j6Var.f27689j0 != null && !hashMap.containsKey(this.P)) {
                lc1 lc1Var3 = new lc1(new File(org.telegram.messenger.t0.h(), j6Var.f27689j0.f27422a), new File(org.telegram.messenger.t0.h(), j6Var.f27689j0.f27423b), this.P);
                this.f43541y = lc1Var3;
                if (this.F != null) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                arrayList.add(i3, lc1Var3);
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
        long j10 = 0;
        if (!z10) {
            ArrayList arrayList = this.Y;
            int size = arrayList.size();
            long j11 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = arrayList.get(i3);
                if (obj instanceof TLRPC.WallPaper) {
                    long j12 = ((TLRPC.WallPaper) obj).f27155id;
                    if (j12 >= 0) {
                        j11 = org.telegram.messenger.li.p(j11, j12);
                    }
                }
            }
            j10 = j11;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new gi.b3(12, this, z10)), this.classGuid);
    }

    public final void H0() {
        this.f43524a = 0;
        int i3 = this.f43537r;
        if (i3 == 0) {
            this.uploadImageRow = 0;
            this.f43524a = 2;
            this.f43526b = 1;
            this.h = -1;
            this.f43536n = -1;
        } else if (i3 == 2) {
            this.uploadImageRow = -1;
            this.f43526b = -1;
            this.h = 0;
            this.f43524a = 2;
            this.f43536n = 1;
        } else {
            this.uploadImageRow = -1;
            this.f43526b = -1;
            this.h = -1;
            this.f43536n = -1;
        }
        ArrayList arrayList = this.f43527b0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.O);
            this.d = ceil;
            int i10 = this.f43524a;
            this.f43528c = i10;
            this.f43524a = i10 + ceil;
        } else {
            this.f43528c = -1;
        }
        if (i3 == 0) {
            int i11 = this.f43524a;
            this.f43531e = i11;
            this.f43524a = i11 + 2;
            this.f43533f = i11 + 1;
        } else {
            this.f43531e = -1;
            this.f43533f = -1;
        }
        mc1 mc1Var = this.H;
        if (mc1Var != null) {
            this.f43535g0 = true;
            mc1Var.f();
        }
    }

    public final void I0() {
        int childCount = this.G.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.G.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.ta) {
                org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) childAt;
                for (int i10 = 0; i10 < 5; i10++) {
                    taVar.c(i10, false, true);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27899e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27918f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final View createView(Context context) {
        this.f43538s = new Paint(1);
        Paint paint = new Paint(1);
        this.f43539w = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f43539w.setStyle(Paint.Style.STROKE);
        this.f43539w.setColor(855638016);
        this.N = new b8.ke(getParentActivity(), this, new fc1(this));
        this.hasOwnBackground = true;
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i3 = this.f43537r;
        if (i3 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752244, null));
        } else if (i3 == 2) {
            this.simpleActionBar.setTitle("Channel Wallpaper");
        } else if (i3 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745672, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ic1(this));
        if (i3 == 0) {
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131232486);
            b10.N();
            b10.C0 = new lg.w1(this, 23);
            this.K = b10;
            b10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745826, null));
            org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
            l10.d(3, 2131232165, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131750588, null));
            l10.d(4, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131751599, null));
            this.f43534f0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.G = tj0Var;
        tj0Var.r1();
        org.telegram.ui.Components.tj0 tj0Var2 = this.G;
        int i10 = org.telegram.ui.ActionBar.k6.f27824a7;
        org.telegram.ui.ActionBar.r6.i(i10, tj0Var2, getResourceProvider());
        this.G.setHorizontalScrollBarEnabled(false);
        this.G.setVerticalScrollBarEnabled(false);
        this.G.setItemAnimator(null);
        this.G.setLayoutAnimation(null);
        org.telegram.ui.Components.tj0 tj0Var3 = this.G;
        kg.y yVar = new kg.y(1, false, 19);
        this.J = yVar;
        tj0Var3.setLayoutManager(yVar);
        frameLayout.addView(this.G, b8.mf.e(-1, -1, 51));
        org.telegram.ui.Components.tj0 tj0Var4 = this.G;
        mc1 mc1Var = new mc1(this, context);
        this.H = mc1Var;
        tj0Var4.setAdapter(mc1Var);
        this.I = new nc1(this, context);
        org.telegram.ui.ActionBar.r6.I(this.G, org.telegram.ui.ActionBar.k6.f27900e8, null);
        this.G.setOnItemClickListener(new nx0(this, 12));
        this.G.setOnScrollListener(new r11(this, 7));
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.L = gyVar;
        gyVar.setVisibility(8);
        this.L.setShowAtCenter(true);
        org.telegram.ui.ActionBar.r6.i(i10, this.L, null);
        this.L.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.G.setEmptyView(this.L);
        frameLayout.addView(this.L, b8.mf.c(-1.0f, -1));
        H0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        ArrayList arrayList;
        kc1 kc1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i12;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i13 = 1;
        if (i3 == org.telegram.messenger.hs.f23223e4) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.f43530d0.clear();
            HashMap hashMap2 = this.f43532e0;
            hashMap2.clear();
            HashMap hashMap3 = this.Z;
            ArrayList arrayList3 = this.f43529c0;
            int i14 = this.f43537r;
            HashMap hashMap4 = this.f43525a0;
            ArrayList arrayList4 = this.f43527b0;
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
                                if (!hashMap2.containsKey(Long.valueOf(document.f27007id))) {
                                    this.f43530d0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f27007id), wallPaper);
                                }
                            } else {
                                i11 = i14;
                            }
                            hashMap3.put(wallPaper.slug, wallPaper);
                            if (i11 != i13 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i11 != 2 || z10) && (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
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
                            kc1Var = new kc1(null, i16, i17, i12, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            kc1Var = new kc1(i16, i17, wallPaperSettings4.rotation, null);
                        }
                        kc1Var.f46897a = wallPaper.slug;
                        kc1Var.h = wallPaperSettings4.intensity / 100.0f;
                        kc1Var.f46901f = org.telegram.messenger.g0.s1(wallPaperSettings4.rotation, false);
                        kc1Var.f46906l = wallPaper;
                        if (wallPaper.f27155id < 0) {
                            String a10 = kc1Var.a();
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
                                arrayList3.add(kc1Var);
                                hashMap4.put(a10, kc1Var);
                            }
                        }
                        if (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(kc1Var);
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
                    org.telegram.messenger.qr messagesStorage = getMessagesStorage();
                    messagesStorage.f24934a.c(new org.telegram.messenger.op(messagesStorage, ((TLRPC.WallPaper) arrayList6.get(i18)).f27155id, 1));
                }
            }
            this.P = org.telegram.ui.ActionBar.k6.K0();
            F0();
            G0(false);
        } else if (i3 == org.telegram.messenger.hs.f23351z4) {
            org.telegram.ui.Components.tj0 tj0Var = this.G;
            if (tj0Var != null) {
                tj0Var.g1();
            }
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            if (y4Var != null) {
                y4Var.j(true);
            }
        } else if (i3 == org.telegram.messenger.hs.f23229f4) {
            getMessagesStorage().p0();
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.G;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27824a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27862c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        this.N.u(i3, i10, intent);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.tj0 tj0Var = this.G;
        if (tj0Var != null) {
            tj0Var.getViewTreeObserver().addOnPreDrawListener(new f7(this, 6));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i3 = org.telegram.messenger.hs.f23223e4;
        int i10 = this.f43537r;
        if (i10 != 0 && i10 != 2) {
            E0(this.f43527b0, org.telegram.ui.ActionBar.k6.I.q());
            if (i10 == 1 && this.f43530d0.isEmpty()) {
                org.telegram.messenger.hs.e().c(this, i3);
                getMessagesStorage().p0();
            }
        } else {
            org.telegram.messenger.hs.e().c(this, i3);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23351z4);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23229f4);
            getMessagesStorage().p0();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        int i3 = org.telegram.messenger.hs.f23223e4;
        int i10 = this.f43537r;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.messenger.hs.e().n(this, i3);
            }
        } else {
            nc1 nc1Var = this.I;
            if (nc1Var.f47972s != 0) {
                ConnectionsManager.getInstance(nc1Var.F.currentAccount).cancelRequest(nc1Var.f47972s, true);
                nc1Var.f47972s = 0;
            }
            org.telegram.messenger.hs.e().n(this, i3);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23351z4);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23229f4);
        }
        this.N.getClass();
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        org.telegram.messenger.hp.e1();
        org.telegram.ui.ActionBar.b6 b6Var = org.telegram.ui.ActionBar.k6.I.f27689j0;
        if (b6Var != null) {
            String str2 = b6Var.f27424c;
            this.P = str2;
            if (str2 == null) {
                this.P = "";
            }
            this.Q = b6Var.d;
            this.R = b6Var.f27425e;
            this.S = b6Var.f27426f;
            this.T = b6Var.f27427g;
            this.U = b6Var.h;
            this.V = b6Var.f27430k;
            this.W = b6Var.f27429j;
            this.X = b6Var.f27428i;
        } else {
            if (org.telegram.ui.ActionBar.k6.g1()) {
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
        org.telegram.ui.Components.tj0 tj0Var = this.G;
        if (tj0Var != null) {
            tj0Var.getViewTreeObserver().addOnPreDrawListener(new f7(this, 6));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.N.f2716b = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = (String) this.N.f2716b;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
