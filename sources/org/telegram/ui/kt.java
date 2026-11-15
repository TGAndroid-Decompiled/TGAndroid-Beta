package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
public final class kt extends org.telegram.ui.Components.uj0 {
    public static final int f48752x3 = 0;
    public boolean f48753f3;
    public int f48754g3;
    public final v4.b0 f48755h3;
    public final org.telegram.ui.Components.ci0 f48756i3;
    public final ArrayList j3;
    public final ArrayList f48757k3;
    public final float[] f48758l3;
    public final int[] f48759m3;
    public final ArrayList f48760n3;
    public jt[] f48761o3;
    public jt[] f48762p3;
    public final boolean[] f48763q3;
    public long f48764r3;
    public long f48765s3;
    public long f48766t3;
    public boolean f48767u3;
    public ht f48768v3;
    public final nt f48769w3;

    public kt(nt ntVar, Activity activity) {
        super(activity, null);
        ri.q qVar;
        this.f48769w3 = ntVar;
        this.f48753f3 = false;
        this.f48754g3 = 0;
        this.j3 = new ArrayList();
        this.f48757k3 = new ArrayList();
        this.f48758l3 = new float[7];
        this.f48759m3 = new int[7];
        this.f48760n3 = new ArrayList();
        this.f48763q3 = new boolean[7];
        qVar = ((org.telegram.ui.ActionBar.e2) ntVar).glassEngine;
        qVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        v4.b0 b0Var = new v4.b0();
        this.f48755h3 = b0Var;
        setLayoutManager(b0Var);
        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(this, 1);
        this.f48756i3 = ci0Var;
        setAdapter(ci0Var);
        r1();
        setOnItemClickListener(new h(this, 8));
        v4.k kVar = new v4.k();
        kVar.n(220L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.f58564m = false;
        setItemAnimator(kVar);
        ri.a.e(this, ntVar.h, ntVar.f49683n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f48754g3;
        nt ntVar = this.f48769w3;
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            i7 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
            return org.telegram.messenger.hz.e(i7).h[this.f48754g3 - 1];
        }
        i10 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
        long j3 = org.telegram.messenger.hz.e(i10).h[0];
        i11 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
        long j10 = org.telegram.messenger.hz.e(i11).h[1];
        i12 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
        long[] jArr = {j3, j10, org.telegram.messenger.hz.e(i12).h[2]};
        long j11 = Long.MAX_VALUE;
        for (int i14 = 0; i14 < 3; i14++) {
            long j12 = jArr[i14];
            if (j11 > j12) {
                j11 = j12;
            }
        }
        return j11;
    }

    public final long B1(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f48754g3;
        nt ntVar = this.f48769w3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
            return org.telegram.messenger.hz.e(i10).g(this.f48754g3 - 1, i7);
        }
        i11 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
        long g10 = org.telegram.messenger.hz.e(i11).g(0, i7);
        i12 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
        i13 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
        return org.telegram.messenger.hz.e(i13).g(2, i7) + org.telegram.messenger.hz.e(i12).g(1, i7) + g10;
    }

    public final void C1() {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        this.f48764r3 = z1(6) + B1(6);
        this.f48765s3 = z1(6);
        this.f48766t3 = B1(6);
        if (this.f48761o3 == null) {
            this.f48761o3 = new jt[7];
        }
        if (this.f48762p3 == null) {
            this.f48762p3 = new jt[7];
        }
        int i20 = 0;
        while (true) {
            int[] iArr = nt.f49677y;
            int length = iArr.length;
            float[] fArr = this.f48758l3;
            if (i20 < length) {
                int i21 = iArr[i20];
                long z12 = z1(i21) + B1(i21);
                jt[] jtVarArr = this.f48762p3;
                jt[] jtVarArr2 = this.f48761o3;
                long z13 = z1(iArr[i20]);
                long B1 = B1(iArr[i20]);
                int i22 = iArr[i20];
                int i23 = this.f48754g3;
                nt ntVar = this.f48769w3;
                if (i23 == 1 || i23 == 2 || i23 == 3) {
                    i7 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                    i10 = 1;
                    i11 = org.telegram.messenger.hz.e(i7).f24249f[this.f48754g3 - 1][i22];
                } else {
                    i17 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                    int i24 = org.telegram.messenger.hz.e(i17).f24249f[0][i22];
                    i18 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                    int i25 = org.telegram.messenger.hz.e(i18).f24249f[1][i22] + i24;
                    i19 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                    i11 = org.telegram.messenger.hz.e(i19).f24249f[2][i22] + i25;
                    i10 = 1;
                }
                int i26 = iArr[i20];
                int i27 = this.f48754g3;
                if (i27 != i10) {
                    int i28 = i10;
                    if (i27 != 2 && i27 != 3) {
                        i14 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                        int i29 = org.telegram.messenger.hz.e(i14).f24248e[0][i26];
                        i15 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                        int i30 = org.telegram.messenger.hz.e(i15).f24248e[i28][i26] + i29;
                        i16 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                        i13 = org.telegram.messenger.hz.e(i16).f24248e[2][i26] + i30;
                        z10 = true;
                        ?? obj = new Object();
                        obj.d = i20;
                        obj.f35214c = z12;
                        obj.f35213b = z10;
                        obj.f48410e = z13;
                        obj.f48412g = i11;
                        obj.f48411f = B1;
                        obj.h = i13;
                        jtVarArr2[i20] = obj;
                        jtVarArr[i20] = obj;
                        fArr[i20] = ((float) z12) / ((float) this.f48764r3);
                        i20++;
                    }
                }
                i12 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                z10 = true;
                i13 = org.telegram.messenger.hz.e(i12).f24248e[this.f48754g3 - 1][i26];
                ?? obj2 = new Object();
                obj2.d = i20;
                obj2.f35214c = z12;
                obj2.f35213b = z10;
                obj2.f48410e = z13;
                obj2.f48412g = i11;
                obj2.f48411f = B1;
                obj2.h = i13;
                jtVarArr2[i20] = obj2;
                jtVarArr[i20] = obj2;
                fArr[i20] = ((float) z12) / ((float) this.f48764r3);
                i20++;
            } else {
                Arrays.sort(this.f48761o3, new me(23));
                org.telegram.messenger.g0.f3(fArr, this.f48759m3);
                Arrays.fill(this.f48763q3, true);
                return;
            }
        }
    }

    public final void D1(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kt.D1(boolean):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    public final long z1(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f48754g3;
        nt ntVar = this.f48769w3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
            return org.telegram.messenger.hz.e(i10).f(this.f48754g3 - 1, i7);
        }
        i11 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
        long f10 = org.telegram.messenger.hz.e(i11).f(0, i7);
        i12 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
        i13 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
        return org.telegram.messenger.hz.e(i13).f(2, i7) + org.telegram.messenger.hz.e(i12).f(1, i7) + f10;
    }
}
