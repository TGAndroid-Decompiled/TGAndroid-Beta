package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
public final class jt extends org.telegram.ui.Components.qj0 {
    public static final int f47079w3 = 0;
    public boolean f47080e3;
    public int f47081f3;
    public final v4.b0 f47082g3;
    public final org.telegram.ui.Components.zh0 f47083h3;
    public final ArrayList f47084i3;
    public final ArrayList j3;
    public final float[] f47085k3;
    public final int[] f47086l3;
    public final ArrayList f47087m3;
    public ht[] f47088n3;
    public ht[] f47089o3;
    public final boolean[] f47090p3;
    public long f47091q3;
    public long f47092r3;
    public long f47093s3;
    public boolean f47094t3;
    public gt f47095u3;
    public final mt f47096v3;

    public jt(mt mtVar, Activity activity) {
        super(activity, null);
        oi.q qVar;
        this.f47096v3 = mtVar;
        this.f47080e3 = false;
        this.f47081f3 = 0;
        this.f47084i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f47085k3 = new float[7];
        this.f47086l3 = new int[7];
        this.f47087m3 = new ArrayList();
        this.f47090p3 = new boolean[7];
        qVar = ((org.telegram.ui.ActionBar.f2) mtVar).glassEngine;
        qVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        v4.b0 b0Var = new v4.b0();
        this.f47082g3 = b0Var;
        setLayoutManager(b0Var);
        org.telegram.ui.Components.zh0 zh0Var = new org.telegram.ui.Components.zh0(this, 1);
        this.f47083h3 = zh0Var;
        setAdapter(zh0Var);
        r1();
        setOnItemClickListener(new h(this, 8));
        v4.k kVar = new v4.k();
        kVar.n(220L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f57083m = false;
        setItemAnimator(kVar);
        oi.a.e(this, mtVar.h, mtVar.f47996n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f47081f3;
        mt mtVar = this.f47096v3;
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            i7 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
            return org.telegram.messenger.jz.e(i7).h[this.f47081f3 - 1];
        }
        i10 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
        long j3 = org.telegram.messenger.jz.e(i10).h[0];
        i11 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
        long j10 = org.telegram.messenger.jz.e(i11).h[1];
        i12 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
        long[] jArr = {j3, j10, org.telegram.messenger.jz.e(i12).h[2]};
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
        int i14 = this.f47081f3;
        mt mtVar = this.f47096v3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
            return org.telegram.messenger.jz.e(i10).g(this.f47081f3 - 1, i7);
        }
        i11 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
        long g10 = org.telegram.messenger.jz.e(i11).g(0, i7);
        i12 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
        i13 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
        return org.telegram.messenger.jz.e(i13).g(2, i7) + org.telegram.messenger.jz.e(i12).g(1, i7) + g10;
    }

    public final void C1() {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z9;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        this.f47091q3 = z1(6) + B1(6);
        this.f47092r3 = z1(6);
        this.f47093s3 = B1(6);
        if (this.f47088n3 == null) {
            this.f47088n3 = new ht[7];
        }
        if (this.f47089o3 == null) {
            this.f47089o3 = new ht[7];
        }
        int i20 = 0;
        while (true) {
            int[] iArr = mt.f47990y;
            int length = iArr.length;
            float[] fArr = this.f47085k3;
            if (i20 < length) {
                int i21 = iArr[i20];
                long z12 = z1(i21) + B1(i21);
                ht[] htVarArr = this.f47089o3;
                ht[] htVarArr2 = this.f47088n3;
                long z13 = z1(iArr[i20]);
                long B1 = B1(iArr[i20]);
                int i22 = iArr[i20];
                int i23 = this.f47081f3;
                mt mtVar = this.f47096v3;
                if (i23 == 1 || i23 == 2 || i23 == 3) {
                    i7 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                    i10 = 1;
                    i11 = org.telegram.messenger.jz.e(i7).f23632f[this.f47081f3 - 1][i22];
                } else {
                    i17 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                    int i24 = org.telegram.messenger.jz.e(i17).f23632f[0][i22];
                    i18 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                    int i25 = org.telegram.messenger.jz.e(i18).f23632f[1][i22] + i24;
                    i19 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                    i11 = org.telegram.messenger.jz.e(i19).f23632f[2][i22] + i25;
                    i10 = 1;
                }
                int i26 = iArr[i20];
                int i27 = this.f47081f3;
                if (i27 != i10) {
                    int i28 = i10;
                    if (i27 != 2 && i27 != 3) {
                        i14 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                        int i29 = org.telegram.messenger.jz.e(i14).f23631e[0][i26];
                        i15 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                        int i30 = org.telegram.messenger.jz.e(i15).f23631e[i28][i26] + i29;
                        i16 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                        i13 = org.telegram.messenger.jz.e(i16).f23631e[2][i26] + i30;
                        z9 = true;
                        ?? obj = new Object();
                        obj.d = i20;
                        obj.f36060c = z12;
                        obj.f36059b = z9;
                        obj.f46405e = z13;
                        obj.f46407g = i11;
                        obj.f46406f = B1;
                        obj.h = i13;
                        htVarArr2[i20] = obj;
                        htVarArr[i20] = obj;
                        fArr[i20] = ((float) z12) / ((float) this.f47091q3);
                        i20++;
                    }
                }
                i12 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                z9 = true;
                i13 = org.telegram.messenger.jz.e(i12).f23631e[this.f47081f3 - 1][i26];
                ?? obj2 = new Object();
                obj2.d = i20;
                obj2.f36060c = z12;
                obj2.f36059b = z9;
                obj2.f46405e = z13;
                obj2.f46407g = i11;
                obj2.f46406f = B1;
                obj2.h = i13;
                htVarArr2[i20] = obj2;
                htVarArr[i20] = obj2;
                fArr[i20] = ((float) z12) / ((float) this.f47091q3);
                i20++;
            } else {
                Arrays.sort(this.f47088n3, new oe(24));
                org.telegram.messenger.g0.f3(fArr, this.f47086l3);
                Arrays.fill(this.f47090p3, true);
                return;
            }
        }
    }

    public final void D1(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jt.D1(boolean):void");
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
        int i14 = this.f47081f3;
        mt mtVar = this.f47096v3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
            return org.telegram.messenger.jz.e(i10).f(this.f47081f3 - 1, i7);
        }
        i11 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
        long f10 = org.telegram.messenger.jz.e(i11).f(0, i7);
        i12 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
        i13 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
        return org.telegram.messenger.jz.e(i13).f(2, i7) + org.telegram.messenger.jz.e(i12).f(1, i7) + f10;
    }
}
