package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
public final class iu extends org.telegram.ui.Components.uk0 {
    public static final int f38171w3 = 0;
    public boolean f38172e3;
    public int f38173f3;
    public final s4.a0 f38174g3;
    public final org.telegram.ui.Components.dj0 f38175h3;
    public final ArrayList f38176i3;
    public final ArrayList f38177j3;
    public final float[] f38178k3;
    public final int[] f38179l3;
    public final ArrayList f38180m3;
    public hu[] f38181n3;
    public hu[] f38182o3;
    public final boolean[] f38183p3;
    public long f38184q3;
    public long f38185r3;
    public long f38186s3;
    public boolean f38187t3;
    public gu f38188u3;
    public final lu f38189v3;

    public iu(lu luVar, Activity activity) {
        super(activity, null);
        ei.r rVar;
        this.f38189v3 = luVar;
        this.f38172e3 = false;
        this.f38173f3 = 0;
        this.f38176i3 = new ArrayList();
        this.f38177j3 = new ArrayList();
        this.f38178k3 = new float[7];
        this.f38179l3 = new int[7];
        this.f38180m3 = new ArrayList();
        this.f38183p3 = new boolean[7];
        rVar = ((org.telegram.ui.ActionBar.k2) luVar).glassEngine;
        rVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        s4.a0 a0Var = new s4.a0();
        this.f38174g3 = a0Var;
        setLayoutManager(a0Var);
        org.telegram.ui.Components.dj0 dj0Var = new org.telegram.ui.Components.dj0(this, 1);
        this.f38175h3 = dj0Var;
        setAdapter(dj0Var);
        r1();
        setOnItemClickListener(new g(this, 8));
        s4.j jVar = new s4.j();
        jVar.n(220L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47938m = false;
        setItemAnimator(jVar);
        ei.b.e(this, luVar.h, luVar.f39386n, org.telegram.messenger.i0.L(42.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f38173f3;
        lu luVar = this.f38189v3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
            return org.telegram.messenger.vz.e(i10).h[this.f38173f3 - 1];
        }
        i11 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
        long j10 = org.telegram.messenger.vz.e(i11).h[0];
        i12 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
        long j11 = org.telegram.messenger.vz.e(i12).h[1];
        i13 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
        long[] jArr = {j10, j11, org.telegram.messenger.vz.e(i13).h[2]};
        long j12 = Long.MAX_VALUE;
        for (int i15 = 0; i15 < 3; i15++) {
            long j13 = jArr[i15];
            if (j12 > j13) {
                j12 = j13;
            }
        }
        return j12;
    }

    public final long B1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f38173f3;
        lu luVar = this.f38189v3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
            return org.telegram.messenger.vz.e(i11).g(this.f38173f3 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
        long g10 = org.telegram.messenger.vz.e(i12).g(0, i10);
        i13 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
        return org.telegram.messenger.vz.e(i14).g(2, i10) + org.telegram.messenger.vz.e(i13).g(1, i10) + g10;
    }

    public final void C1() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        this.f38184q3 = z1(6) + B1(6);
        this.f38185r3 = z1(6);
        this.f38186s3 = B1(6);
        if (this.f38181n3 == null) {
            this.f38181n3 = new hu[7];
        }
        if (this.f38182o3 == null) {
            this.f38182o3 = new hu[7];
        }
        int i21 = 0;
        while (true) {
            int[] iArr = lu.f39381y;
            int length = iArr.length;
            float[] fArr = this.f38178k3;
            if (i21 < length) {
                int i22 = iArr[i21];
                long z12 = z1(i22) + B1(i22);
                hu[] huVarArr = this.f38182o3;
                hu[] huVarArr2 = this.f38181n3;
                long z13 = z1(iArr[i21]);
                long B1 = B1(iArr[i21]);
                int i23 = iArr[i21];
                int i24 = this.f38173f3;
                lu luVar = this.f38189v3;
                if (i24 == 1 || i24 == 2 || i24 == 3) {
                    i10 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                    i11 = 1;
                    i12 = org.telegram.messenger.vz.e(i10).f18936f[this.f38173f3 - 1][i23];
                } else {
                    i18 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                    int i25 = org.telegram.messenger.vz.e(i18).f18936f[0][i23];
                    i19 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                    int i26 = org.telegram.messenger.vz.e(i19).f18936f[1][i23] + i25;
                    i20 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                    i12 = org.telegram.messenger.vz.e(i20).f18936f[2][i23] + i26;
                    i11 = 1;
                }
                int i27 = iArr[i21];
                int i28 = this.f38173f3;
                if (i28 != i11) {
                    int i29 = i11;
                    if (i28 != 2 && i28 != 3) {
                        i15 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                        int i30 = org.telegram.messenger.vz.e(i15).e[0][i27];
                        i16 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                        int i31 = org.telegram.messenger.vz.e(i16).e[i29][i27] + i30;
                        i17 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                        i14 = org.telegram.messenger.vz.e(i17).e[2][i27] + i31;
                        z10 = true;
                        ?? obj = new Object();
                        obj.d = i21;
                        obj.f26752c = z12;
                        obj.f26751b = z10;
                        obj.e = z13;
                        obj.f37868g = i12;
                        obj.f37867f = B1;
                        obj.h = i14;
                        huVarArr2[i21] = obj;
                        huVarArr[i21] = obj;
                        fArr[i21] = ((float) z12) / ((float) this.f38184q3);
                        i21++;
                    }
                }
                i13 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                z10 = true;
                i14 = org.telegram.messenger.vz.e(i13).e[this.f38173f3 - 1][i27];
                ?? obj2 = new Object();
                obj2.d = i21;
                obj2.f26752c = z12;
                obj2.f26751b = z10;
                obj2.e = z13;
                obj2.f37868g = i12;
                obj2.f37867f = B1;
                obj2.h = i14;
                huVarArr2[i21] = obj2;
                huVarArr[i21] = obj2;
                fArr[i21] = ((float) z12) / ((float) this.f38184q3);
                i21++;
            } else {
                Arrays.sort(this.f38181n3, new f6(23));
                org.telegram.messenger.i0.e3(fArr, this.f38179l3);
                Arrays.fill(this.f38183p3, true);
                return;
            }
        }
    }

    public final void D1(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iu.D1(boolean):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public final long z1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f38173f3;
        lu luVar = this.f38189v3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
            return org.telegram.messenger.vz.e(i11).f(this.f38173f3 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
        long f7 = org.telegram.messenger.vz.e(i12).f(0, i10);
        i13 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
        return org.telegram.messenger.vz.e(i14).f(2, i10) + org.telegram.messenger.vz.e(i13).f(1, i10) + f7;
    }
}
