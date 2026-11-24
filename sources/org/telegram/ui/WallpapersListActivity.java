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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class WallpapersListActivity extends org.telegram.ui.ActionBar.d implements jm7 {
    public static final int[][] h0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] i0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] j0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] k0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] l0 = {2131753641, 2131746076, 2131747501, 2131742509, 2131749260, 2131743938, 2131746309, 2131746967, 2131752832, 2131753662, 2131749261, 2131742546};
    public mtc E;
    public ntc F;
    public r59 G;
    public otc H;
    public qtc I;
    public zs J;
    public zja K;
    public r34 L;
    public he M;
    public sm2 N;
    public byte O;
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
    public int a;
    public final HashMap a0;
    public int b;
    public final ArrayList b0;
    public int c;
    public final ArrayList c0;
    public int d;
    public ArrayList d0;
    public int e;
    public final HashMap e0;
    public int f;
    public final LongSparseArray f0;
    public boolean g0;
    public int h;
    public int n;
    public final boolean r;
    public Paint s;
    private int uploadImageRow;
    public Paint w;
    public mtc x;
    public ntc y;

    public WallpapersListActivity(int i) {
        super(null);
        this.O = (byte) 3;
        this.P = "";
        this.Y = new ArrayList();
        this.Z = new HashMap();
        this.a0 = new HashMap();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = new HashMap();
        this.f0 = new LongSparseArray();
        this.r = i;
    }

    public static void A0(ArrayList arrayList, boolean z) {
        int[][] iArr;
        if (z) {
            iArr = i0;
        } else {
            iArr = h0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new mtc(iArr2[0], 0, 45, "c"));
            } else {
                arrayList.add(new mtc(iArr2[0], iArr2[1], iArr2[2], iArr2[3], "c"));
            }
        }
    }

    public final void B0() {
        HashMap hashMap;
        ?? r5;
        long j;
        final String str;
        final long j2;
        Object obj;
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.WallPaper wallPaper;
        int i;
        mtc mtcVar;
        int i2;
        int i3;
        mtc mtcVar2;
        int i4;
        int i5;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper2;
        Object obj2;
        boolean z = this.r;
        if (z && !z) {
            return;
        }
        oc7.d1();
        mtc mtcVar3 = this.x;
        ArrayList arrayList = this.b0;
        if (mtcVar3 != null) {
            arrayList.remove(mtcVar3);
            this.x = null;
        }
        ntc ntcVar = this.y;
        if (ntcVar != null) {
            arrayList.remove(ntcVar);
            this.y = null;
        }
        mtc mtcVar4 = this.E;
        if (mtcVar4 == null) {
            mtc mtcVar5 = new mtc(-2368069, -9722489, -2762611, -7817084, "d");
            this.E = mtcVar5;
            mtcVar5.h = 0.34f;
        } else {
            arrayList.remove(mtcVar4);
        }
        ntc ntcVar2 = this.F;
        if (ntcVar2 != null) {
            arrayList.remove(ntcVar2);
        }
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            hashMap = this.Z;
            if (i6 < size) {
                Object obj3 = arrayList.get(i6);
                if (obj3 instanceof mtc) {
                    r5 = (mtc) obj3;
                    String str3 = r5.a;
                    if (str3 != null) {
                        r5.g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r5.a)) {
                        String str4 = r5.a;
                        if (str4 != null && !TextUtils.equals(this.P, str4)) {
                            i6++;
                        }
                    }
                    if (this.Q == r5.b) {
                        int i7 = this.R;
                        if (i7 != r5.c) {
                            continue;
                        } else if (this.S != r5.d) {
                            continue;
                        } else if (this.T != r5.e) {
                            continue;
                        } else if (i7 == 0 || this.U == r5.f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i6++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        r5 = (TLRPC.TL_wallPaper) obj3;
                        if (r5.settings != null && TextUtils.equals(this.P, r5.slug) && this.Q == cmb.Y0(r5.settings.background_color) && this.R == cmb.Y0(r5.settings.second_background_color) && this.S == cmb.Y0(r5.settings.third_background_color) && this.T == cmb.Y0(r5.settings.fourth_background_color) && ((this.R == 0 || this.U == gm.q1(r5.settings.rotation, false)) && Math.abs(cmb.S0(r5.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i6++;
                }
            } else {
                r5 = 0;
                break;
            }
        }
        if (r5 instanceof TLRPC.WallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper3 = r5;
            xlb xlbVar = cmb.I.j0;
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
            if (wallPaperSettings != null && this.Q == cmb.Y0(wallPaperSettings.background_color) && this.R == cmb.Y0(tL_wallPaper3.settings.second_background_color) && this.S == cmb.Y0(tL_wallPaper3.settings.third_background_color) && this.T == cmb.Y0(tL_wallPaper3.settings.fourth_background_color) && (this.R == 0 || this.S != 0 || this.U == gm.q1(tL_wallPaper3.settings.rotation, false) || Math.abs(cmb.S0(tL_wallPaper3.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
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
            j2 = tL_wallPaper3.id;
        } else {
            String str5 = this.P;
            if ((r5 instanceof mtc) && (wallPaper = r5.k) != null) {
                j = wallPaper.id;
            } else {
                j = 0;
            }
            str = str5;
            j2 = j;
            obj = r5;
            tL_wallPaper = null;
        }
        final boolean o = cmb.B0().o();
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(java.lang.Object r6, java.lang.Object r7) {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.gtc.compare(java.lang.Object, java.lang.Object):int");
                }
            });
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (cmb.e1() && TextUtils.isEmpty(cmb.g0)) {
            ntc ntcVar3 = this.F;
            ntc ntcVar4 = ntcVar3;
            if (ntcVar3 == null) {
                ?? obj4 = new Object();
                obj4.a = "t";
                obj4.b = -2;
                obj4.c = -2;
                this.F = obj4;
                ntcVar4 = obj4;
            }
            arrayList.add(0, ntcVar4);
        } else {
            this.F = null;
        }
        bmb bmbVar = cmb.I;
        if (!TextUtils.isEmpty(this.P) && ("d".equals(this.P) || obj != null)) {
            if (obj == null && this.Q != 0 && "c".equals(this.P)) {
                int i8 = this.R;
                if (i8 != 0 && (i4 = this.S) != 0 && (i5 = this.T) != 0) {
                    mtcVar2 = new mtc(this.Q, i8, i4, i5, this.P);
                    this.x = mtcVar2;
                    mtcVar2.f = this.U;
                } else {
                    mtcVar2 = new mtc(this.Q, i8, this.U, this.P);
                    this.x = mtcVar2;
                }
                arrayList.add(0, mtcVar2);
            }
        } else if (!"c".equals(this.P) && (i3 = this.Q) != 0) {
            if (bmbVar.j0 != null) {
                mtc mtcVar6 = new mtc(this.P, i3, this.R, this.S, this.T, this.U, this.V, this.W);
                this.x = mtcVar6;
                mtcVar6.g = tL_wallPaper;
                arrayList.add(0, mtcVar6);
            }
        } else {
            int i9 = this.Q;
            if (i9 != 0) {
                int i10 = this.R;
                if (i10 != 0 && (i2 = this.S) != 0) {
                    mtcVar = new mtc(i9, i10, i2, this.T, this.P);
                    this.x = mtcVar;
                    mtcVar.f = this.U;
                } else {
                    mtcVar = new mtc(i9, i10, this.U, this.P);
                    this.x = mtcVar;
                }
                arrayList.add(0, mtcVar);
            } else if (bmbVar.j0 != null && !hashMap.containsKey(this.P)) {
                ntc ntcVar5 = new ntc(usc.e(bmbVar.j0.a), usc.e(bmbVar.j0.b), this.P);
                this.y = ntcVar5;
                if (this.F != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                arrayList.add(i, ntcVar5);
            }
        }
        if (!"d".equals(this.P) && !arrayList.isEmpty()) {
            arrayList.add(1, this.E);
        } else {
            arrayList.add(0, this.E);
        }
        H0();
    }

    public final void C0() {
        if (this.simpleActionBar.x()) {
            this.f0.clear();
            this.simpleActionBar.w();
            I0();
        }
        he heVar = new he(3, null, getParentActivity());
        this.M = heVar;
        heVar.j0 = false;
        heVar.show();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetWallPapers(), new go9(this, (byte) 25));
    }

    public final void D0(int i) {
        if (getParentActivity() != null && this.G.getAdapter() != this.I) {
            if (i == this.uploadImageRow) {
                this.N.J();
            } else if (i == this.b) {
                WallpapersListActivity wallpapersListActivity = new WallpapersListActivity(1);
                wallpapersListActivity.d0 = this.d0;
                presentFragment(wallpapersListActivity);
            } else if (i == this.e) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = jb6.M0(2131745839, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131745840, null);
                alertDialog$Builder.j(jb6.M0(2131745851, null), new htc(this));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
                }
            }
        }
    }

    public final void E0(boolean z) {
        long j = 0;
        if (!z) {
            ArrayList arrayList = this.Y;
            int size = arrayList.size();
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof TLRPC.WallPaper) {
                    long j3 = ((TLRPC.WallPaper) obj).id;
                    if (j3 >= 0) {
                        j2 = hs6.r(j2, j3);
                    }
                }
            }
            j = j2;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new r91((byte) 13, this, z)), this.classGuid);
    }

    public final void F0(g32 g32Var, Object obj, int i) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        mtc mtcVar = obj;
        boolean z = false;
        if (this.simpleActionBar.x()) {
            if (mtcVar instanceof mtc) {
                obj2 = ((mtc) mtcVar).k;
            } else {
                obj2 = mtcVar;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            long j = wallPaper.id;
            LongSparseArray longSparseArray = this.f0;
            int indexOfKey = longSparseArray.indexOfKey(j);
            long j2 = wallPaper.id;
            if (indexOfKey >= 0) {
                longSparseArray.remove(j2);
            } else {
                longSparseArray.put(j2, mtcVar);
            }
            int size = longSparseArray.size();
            rja rjaVar = this.simpleActionBar;
            if (size == 0) {
                rjaVar.w();
            } else {
                rjaVar.F(longSparseArray.size(), true);
            }
            this.g0 = false;
            if (longSparseArray.indexOfKey(wallPaper.id) >= 0) {
                z = true;
            }
            g32Var.c(i, z, true);
            return;
        }
        boolean z2 = mtcVar instanceof TLRPC.TL_wallPaper;
        if (z2) {
            str = ((TLRPC.TL_wallPaper) mtcVar).slug;
        } else if (mtcVar instanceof mtc) {
            str = ((mtc) mtcVar).a;
        } else if (mtcVar instanceof ntc) {
            str = ((ntc) mtcVar).a;
        } else {
            str = null;
        }
        if (z2) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) mtcVar;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                mtc mtcVar2 = new mtc(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, gm.q1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion);
                mtcVar2.g = tL_wallPaper;
                mtcVar2.k = tL_wallPaper;
                mtcVar = mtcVar2;
            }
        }
        ye2 ye2Var = new ye2(mtcVar, null, true, (byte) 4);
        if (this.r) {
            ye2Var.K1 = new htc(this);
        }
        if (this.P.equals(str)) {
            boolean z3 = this.X;
            boolean z4 = this.W;
            float f = this.V;
            ye2Var.H1 = z3;
            ye2Var.G1 = z4;
            ye2Var.p1 = f;
        }
        ye2Var.W0 = this.d0;
        if (ye2Var.b == 1 || (ye2Var.D1 instanceof mtc)) {
            ((mtc) ye2Var.D1).getClass();
        }
        ye2Var.h1(0L);
        ?? obj3 = new Object();
        obj3.a = true;
        ye2Var.a.a = this.resourceProvider;
        obj3.c = new e1b((byte) 16);
        obj3.e = true;
        showAsSheet(ye2Var, obj3);
    }

    public final boolean G0(g32 g32Var, Object obj, int i) {
        Object obj2;
        boolean z = this.r;
        if (!z && !z) {
            if (obj instanceof mtc) {
                obj2 = ((mtc) obj).k;
            } else {
                obj2 = obj;
            }
            if (!this.simpleActionBar.x() && getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                gm.t1(getParentActivity().getCurrentFocus());
                this.f0.put(((TLRPC.WallPaper) obj2).id, obj);
                this.simpleActionBar.F(1, false);
                this.g0 = false;
                this.simpleActionBar.J();
                g32Var.c(i, true, true);
                return true;
            }
        }
        return false;
    }

    public final void H0() {
        this.a = 0;
        boolean z = this.r;
        if (!z) {
            this.uploadImageRow = 0;
            this.a = 2;
            this.b = 1;
            this.h = -1;
            this.n = -1;
        } else if (z) {
            this.uploadImageRow = -1;
            this.b = -1;
            this.h = 0;
            this.a = 2;
            this.n = 1;
        } else {
            this.uploadImageRow = -1;
            this.b = -1;
            this.h = -1;
            this.n = -1;
        }
        ArrayList arrayList = this.b0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.O);
            this.d = ceil;
            int i = this.a;
            this.c = i;
            this.a = i + ceil;
        } else {
            this.c = -1;
        }
        if (!z) {
            int i2 = this.a;
            this.e = i2;
            this.a = i2 + 2;
            this.f = i2 + 1;
        } else {
            this.e = -1;
            this.f = -1;
        }
        otc otcVar = this.H;
        if (otcVar != null) {
            this.g0 = true;
            otcVar.f();
        }
    }

    public final void I0() {
        int childCount = this.G.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.G.getChildAt(i);
            if (childAt instanceof ssc) {
                ssc sscVar = (ssc) childAt;
                for (int i2 = 0; i2 < 5; i2++) {
                    sscVar.c(i2, false, true);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.d7));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override
    public final View createView(Context context) {
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        paint.setStrokeWidth(gm.L(1.0f));
        this.w.setStyle(Paint.Style.STROKE);
        this.w.setColor(855638016);
        this.N = new sm2(getParentActivity(), this, new itc(this));
        this.hasOwnBackground = true;
        this.simpleActionBar.setBackButtonImage(2131231244);
        boolean z = this.r;
        if (!z) {
            this.simpleActionBar.setTitle(jb6.M0(2131752181, null));
        } else if (z) {
            this.simpleActionBar.setTitle("Channel Wallpaper");
        } else if (z) {
            this.simpleActionBar.setTitle(jb6.M0(2131745396, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ktc(this));
        if (!z) {
            zja a = this.simpleActionBar.t().a(0, 2131232503);
            a.N();
            a.C0 = new q20(this, (byte) 24);
            this.K = a;
            a.setSearchFieldHint(jb6.M0(2131745550, null));
            yja q = this.simpleActionBar.q();
            q.c(3, 2131232171, gm.L(54.0f), jb6.M0(2131750519, null));
            q.c(4, 2131232114, gm.L(54.0f), jb6.M0(2131751535, null));
            this.f0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.G = r59Var;
        r59Var.r1();
        r59 r59Var2 = this.G;
        int i = cmb.Z6;
        anb.h(i, getResourceProvider(), r59Var2);
        this.G.setHorizontalScrollBarEnabled(false);
        this.G.setVerticalScrollBarEnabled(false);
        this.G.setItemAnimator(null);
        this.G.setLayoutAnimation(null);
        r59 r59Var3 = this.G;
        zs zsVar = new zs((byte) 19, 1, false);
        this.J = zsVar;
        r59Var3.setLayoutManager(zsVar);
        frameLayout.addView(this.G, qoe.e(-1, -1, 51));
        r59 r59Var4 = this.G;
        otc otcVar = new otc(this, context);
        this.H = otcVar;
        r59Var4.setAdapter(otcVar);
        this.I = new qtc(this, context);
        anb.H(this.G, cmb.d8, null);
        this.G.setOnItemClickListener(new ftc(this, (byte) 0));
        this.G.setOnScrollListener(new k2b(this, (byte) 13));
        r34 r34Var = new r34(context, null);
        this.L = r34Var;
        r34Var.setVisibility(8);
        this.L.setShowAtCenter(true);
        anb.h(i, null, this.L);
        this.L.setText(jb6.M0(2131747901, null));
        this.G.setEmptyView(this.L);
        frameLayout.addView(this.L, qoe.c(-1.0f, -1));
        H0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        ArrayList arrayList;
        mtc mtcVar;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i3;
        boolean z2;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        boolean z3 = true;
        if (i == nm7.i4) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.d0.clear();
            HashMap hashMap2 = this.e0;
            hashMap2.clear();
            HashMap hashMap3 = this.Z;
            ArrayList arrayList3 = this.c0;
            boolean z4 = this.r;
            HashMap hashMap4 = this.a0;
            ArrayList arrayList4 = this.b0;
            if (!z4 && !z4) {
                arrayList4.clear();
                arrayList3.clear();
                hashMap4.clear();
                ArrayList arrayList5 = this.Y;
                arrayList5.clear();
                hashMap3.clear();
                arrayList5.addAll(arrayList2);
            }
            int size = arrayList2.size();
            int i4 = 0;
            ArrayList arrayList6 = null;
            while (i4 < size) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList2.get(i4);
                if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                    arrayList = arrayList2;
                    hashMap = hashMap2;
                    z = z4;
                } else {
                    if (wallPaper instanceof TLRPC.TL_wallPaper) {
                        TLRPC.Document document = wallPaper.document;
                        if (!(document instanceof TLRPC.TL_documentEmpty)) {
                            if (wallPaper.pattern && document != null) {
                                z = z4;
                                if (!hashMap2.containsKey(Long.valueOf(document.id))) {
                                    this.d0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                            } else {
                                z = z4;
                            }
                            hashMap3.put(wallPaper.slug, wallPaper);
                            if (z != z3 && ((!(z2 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((!z || z2) && (cmb.I.o() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                arrayList4.add(wallPaper);
                            }
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                        }
                    }
                    z = z4;
                    TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                    int i5 = wallPaperSettings4.background_color;
                    if (i5 != 0) {
                        int i6 = wallPaperSettings4.second_background_color;
                        if (i6 != 0 && (i3 = wallPaperSettings4.third_background_color) != 0) {
                            arrayList = arrayList2;
                            mtcVar = new mtc(i5, i6, i3, wallPaperSettings4.fourth_background_color, null);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            mtcVar = new mtc(i5, i6, wallPaperSettings4.rotation, null);
                        }
                        mtcVar.a = wallPaper.slug;
                        mtcVar.h = wallPaperSettings4.intensity / 100.0f;
                        mtcVar.f = gm.q1(wallPaperSettings4.rotation, false);
                        mtcVar.k = wallPaper;
                        if (wallPaper.id < 0) {
                            String a = mtcVar.a();
                            if (hashMap4.containsKey(a)) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(wallPaper);
                            } else {
                                arrayList3.add(mtcVar);
                                hashMap4.put(a, mtcVar);
                            }
                        }
                        if (cmb.I.o() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(mtcVar);
                        }
                    }
                    arrayList = arrayList2;
                    hashMap = hashMap2;
                }
                i4++;
                z4 = z;
                hashMap2 = hashMap;
                arrayList2 = arrayList;
                z3 = true;
            }
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    cf7 messagesStorage = getMessagesStorage();
                    messagesStorage.a.c(new vc7(messagesStorage, ((TLRPC.WallPaper) arrayList6.get(i7)).id, (byte) 1));
                }
            }
            this.P = cmb.I0();
            B0();
            E0(false);
        } else if (i == nm7.D4) {
            r59 r59Var = this.G;
            if (r59Var != null) {
                r59Var.h1();
            }
            rja rjaVar = this.simpleActionBar;
            if (rjaVar != null) {
                rjaVar.o(true);
            }
        } else if (i == nm7.j4) {
            getMessagesStorage().m0();
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.G;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Z6));
        arrayList.add(new cnb(this.L, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.L, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(this.L, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.N.E(i, i2, intent);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r59 r59Var = this.G;
        if (r59Var != null) {
            r59Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 11));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i = nm7.i4;
        boolean z = this.r;
        if (z && !z) {
            A0(this.b0, cmb.I.o());
            if (z && this.d0.isEmpty()) {
                nm7.e().b(this, i);
                getMessagesStorage().m0();
            }
        } else {
            nm7.e().b(this, i);
            nm7.e().b(this, nm7.D4);
            nm7.e().b(this, nm7.j4);
            getMessagesStorage().m0();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        int i = nm7.i4;
        boolean z = this.r;
        if (z && !z) {
            if (z) {
                nm7.e().n(this, i);
            }
        } else {
            qtc qtcVar = this.I;
            if (qtcVar.s != 0) {
                ConnectionsManager.getInstance(qtcVar.F.currentAccount).cancelRequest(qtcVar.s, true);
                qtcVar.s = 0;
            }
            nm7.e().n(this, i);
            nm7.e().n(this, nm7.D4);
            nm7.e().n(this, nm7.j4);
        }
        this.N.getClass();
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        oc7.d1();
        xlb xlbVar = cmb.I.j0;
        if (xlbVar != null) {
            String str2 = xlbVar.c;
            this.P = str2;
            if (str2 == null) {
                this.P = "";
            }
            this.Q = xlbVar.d;
            this.R = xlbVar.e;
            this.S = xlbVar.f;
            this.T = xlbVar.g;
            this.U = xlbVar.h;
            this.V = xlbVar.k;
            this.W = xlbVar.j;
            this.X = xlbVar.i;
        } else {
            if (cmb.e1()) {
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
        B0();
        r59 r59Var = this.G;
        if (r59Var != null) {
            r59Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 11));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.N.b = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = (String) this.N.b;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
