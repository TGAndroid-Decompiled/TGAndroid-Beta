package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
public final class et extends org.telegram.ui.Components.tj0 {
    public static final int f45028x3 = 0;
    public boolean f45029f3;
    public int f45030g3;
    public final u4.b0 f45031h3;
    public final org.telegram.ui.Components.bi0 i3;
    public final ArrayList f45032j3;
    public final ArrayList f45033k3;
    public final float[] f45034l3;
    public final int[] f45035m3;
    public final ArrayList f45036n3;
    public dt[] f45037o3;
    public dt[] f45038p3;
    public final boolean[] f45039q3;
    public long f45040r3;
    public long f45041s3;
    public long f45042t3;
    public boolean f45043u3;
    public ct f45044v3;
    public final ht f45045w3;

    public et(ht htVar, Activity activity) {
        super(activity, null);
        pi.q qVar;
        this.f45045w3 = htVar;
        this.f45029f3 = false;
        this.f45030g3 = 0;
        this.f45032j3 = new ArrayList();
        this.f45033k3 = new ArrayList();
        this.f45034l3 = new float[7];
        this.f45035m3 = new int[7];
        this.f45036n3 = new ArrayList();
        this.f45039q3 = new boolean[7];
        qVar = ((org.telegram.ui.ActionBar.d2) htVar).glassEngine;
        qVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        u4.b0 b0Var = new u4.b0();
        this.f45031h3 = b0Var;
        setLayoutManager(b0Var);
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(this, 1);
        this.i3 = bi0Var;
        setAdapter(bi0Var);
        r1();
        setOnItemClickListener(new h(this, 8));
        u4.k kVar = new u4.k();
        kVar.n(220L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f55567m = false;
        setItemAnimator(kVar);
        pi.a.e(this, htVar.h, htVar.f45985n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = this.f45030g3;
        ht htVar = this.f45045w3;
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            i3 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
            return org.telegram.messenger.bz.e(i3).h[this.f45030g3 - 1];
        }
        i10 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        long j10 = org.telegram.messenger.bz.e(i10).h[0];
        i11 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        long j11 = org.telegram.messenger.bz.e(i11).h[1];
        i12 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        long[] jArr = {j10, j11, org.telegram.messenger.bz.e(i12).h[2]};
        long j12 = Long.MAX_VALUE;
        for (int i14 = 0; i14 < 3; i14++) {
            long j13 = jArr[i14];
            if (j12 > j13) {
                j12 = j13;
            }
        }
        return j12;
    }

    public final long B1(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f45030g3;
        ht htVar = this.f45045w3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
            return org.telegram.messenger.bz.e(i10).g(this.f45030g3 - 1, i3);
        }
        i11 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        long g7 = org.telegram.messenger.bz.e(i11).g(0, i3);
        i12 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        i13 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        return org.telegram.messenger.bz.e(i13).g(2, i3) + org.telegram.messenger.bz.e(i12).g(1, i3) + g7;
    }

    public final void C1() {
        int i3;
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
        this.f45040r3 = z1(6) + B1(6);
        this.f45041s3 = z1(6);
        this.f45042t3 = B1(6);
        if (this.f45037o3 == null) {
            this.f45037o3 = new dt[7];
        }
        if (this.f45038p3 == null) {
            this.f45038p3 = new dt[7];
        }
        int i20 = 0;
        while (true) {
            int[] iArr = ht.f45979y;
            int length = iArr.length;
            float[] fArr = this.f45034l3;
            if (i20 < length) {
                int i21 = iArr[i20];
                long z12 = z1(i21) + B1(i21);
                dt[] dtVarArr = this.f45038p3;
                dt[] dtVarArr2 = this.f45037o3;
                long z13 = z1(iArr[i20]);
                long B1 = B1(iArr[i20]);
                int i22 = iArr[i20];
                int i23 = this.f45030g3;
                ht htVar = this.f45045w3;
                if (i23 == 1 || i23 == 2 || i23 == 3) {
                    i3 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                    i10 = 1;
                    i11 = org.telegram.messenger.bz.e(i3).f21913f[this.f45030g3 - 1][i22];
                } else {
                    i17 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                    int i24 = org.telegram.messenger.bz.e(i17).f21913f[0][i22];
                    i18 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                    int i25 = org.telegram.messenger.bz.e(i18).f21913f[1][i22] + i24;
                    i19 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                    i11 = org.telegram.messenger.bz.e(i19).f21913f[2][i22] + i25;
                    i10 = 1;
                }
                int i26 = iArr[i20];
                int i27 = this.f45030g3;
                if (i27 != i10) {
                    int i28 = i10;
                    if (i27 != 2 && i27 != 3) {
                        i14 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                        int i29 = org.telegram.messenger.bz.e(i14).f21912e[0][i26];
                        i15 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                        int i30 = org.telegram.messenger.bz.e(i15).f21912e[i28][i26] + i29;
                        i16 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                        i13 = org.telegram.messenger.bz.e(i16).f21912e[2][i26] + i30;
                        z10 = true;
                        ?? obj = new Object();
                        obj.d = i20;
                        obj.f35364c = z12;
                        obj.f35363b = z10;
                        obj.f44807e = z13;
                        obj.f44809g = i11;
                        obj.f44808f = B1;
                        obj.h = i13;
                        dtVarArr2[i20] = obj;
                        dtVarArr[i20] = obj;
                        fArr[i20] = ((float) z12) / ((float) this.f45040r3);
                        i20++;
                    }
                }
                i12 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                z10 = true;
                i13 = org.telegram.messenger.bz.e(i12).f21912e[this.f45030g3 - 1][i26];
                ?? obj2 = new Object();
                obj2.d = i20;
                obj2.f35364c = z12;
                obj2.f35363b = z10;
                obj2.f44807e = z13;
                obj2.f44809g = i11;
                obj2.f44808f = B1;
                obj2.h = i13;
                dtVarArr2[i20] = obj2;
                dtVarArr[i20] = obj2;
                fArr[i20] = ((float) z12) / ((float) this.f45040r3);
                i20++;
            } else {
                Arrays.sort(this.f45037o3, new org.telegram.ui.Components.d80(11));
                org.telegram.messenger.g0.f3(fArr, this.f45035m3);
                Arrays.fill(this.f45039q3, true);
                return;
            }
        }
    }

    public final void D1(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.et.D1(boolean):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    public final long z1(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f45030g3;
        ht htVar = this.f45045w3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
            return org.telegram.messenger.bz.e(i10).f(this.f45030g3 - 1, i3);
        }
        i11 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        long f10 = org.telegram.messenger.bz.e(i11).f(0, i3);
        i12 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        i13 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        return org.telegram.messenger.bz.e(i13).f(2, i3) + org.telegram.messenger.bz.e(i12).f(1, i3) + f10;
    }
}
