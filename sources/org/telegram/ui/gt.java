package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
public final class gt extends org.telegram.ui.Components.pj0 {
    public static final int f46092w3 = 0;
    public boolean f46093e3;
    public int f46094f3;
    public final v4.b0 f46095g3;
    public final org.telegram.ui.Components.yh0 f46096h3;
    public final ArrayList f46097i3;
    public final ArrayList j3;
    public final float[] f46098k3;
    public final int[] f46099l3;
    public final ArrayList f46100m3;
    public ft[] f46101n3;
    public ft[] f46102o3;
    public final boolean[] f46103p3;
    public long f46104q3;
    public long f46105r3;
    public long f46106s3;
    public boolean f46107t3;
    public et f46108u3;
    public final kt f46109v3;

    public gt(kt ktVar, Activity activity) {
        super(activity, null);
        oi.q qVar;
        this.f46109v3 = ktVar;
        this.f46093e3 = false;
        this.f46094f3 = 0;
        this.f46097i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f46098k3 = new float[7];
        this.f46099l3 = new int[7];
        this.f46100m3 = new ArrayList();
        this.f46103p3 = new boolean[7];
        qVar = ((org.telegram.ui.ActionBar.f2) ktVar).glassEngine;
        qVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        v4.b0 b0Var = new v4.b0();
        this.f46095g3 = b0Var;
        setLayoutManager(b0Var);
        org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(this, 1);
        this.f46096h3 = yh0Var;
        setAdapter(yh0Var);
        r1();
        setOnItemClickListener(new h(this, 8));
        v4.k kVar = new v4.k();
        kVar.n(220L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f57070m = false;
        setItemAnimator(kVar);
        oi.a.e(this, ktVar.h, ktVar.f47312n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f46094f3;
        kt ktVar = this.f46109v3;
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            i7 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
            return org.telegram.messenger.jz.e(i7).h[this.f46094f3 - 1];
        }
        i10 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
        long j3 = org.telegram.messenger.jz.e(i10).h[0];
        i11 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
        long j10 = org.telegram.messenger.jz.e(i11).h[1];
        i12 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
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
        int i14 = this.f46094f3;
        kt ktVar = this.f46109v3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
            return org.telegram.messenger.jz.e(i10).g(this.f46094f3 - 1, i7);
        }
        i11 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
        long g10 = org.telegram.messenger.jz.e(i11).g(0, i7);
        i12 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
        i13 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
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
        this.f46104q3 = z1(6) + B1(6);
        this.f46105r3 = z1(6);
        this.f46106s3 = B1(6);
        if (this.f46101n3 == null) {
            this.f46101n3 = new ft[7];
        }
        if (this.f46102o3 == null) {
            this.f46102o3 = new ft[7];
        }
        int i20 = 0;
        while (true) {
            int[] iArr = kt.f47306y;
            int length = iArr.length;
            float[] fArr = this.f46098k3;
            if (i20 < length) {
                int i21 = iArr[i20];
                long z12 = z1(i21) + B1(i21);
                ft[] ftVarArr = this.f46102o3;
                ft[] ftVarArr2 = this.f46101n3;
                long z13 = z1(iArr[i20]);
                long B1 = B1(iArr[i20]);
                int i22 = iArr[i20];
                int i23 = this.f46094f3;
                kt ktVar = this.f46109v3;
                if (i23 == 1 || i23 == 2 || i23 == 3) {
                    i7 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                    i10 = 1;
                    i11 = org.telegram.messenger.jz.e(i7).f23632f[this.f46094f3 - 1][i22];
                } else {
                    i17 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                    int i24 = org.telegram.messenger.jz.e(i17).f23632f[0][i22];
                    i18 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                    int i25 = org.telegram.messenger.jz.e(i18).f23632f[1][i22] + i24;
                    i19 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                    i11 = org.telegram.messenger.jz.e(i19).f23632f[2][i22] + i25;
                    i10 = 1;
                }
                int i26 = iArr[i20];
                int i27 = this.f46094f3;
                if (i27 != i10) {
                    int i28 = i10;
                    if (i27 != 2 && i27 != 3) {
                        i14 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                        int i29 = org.telegram.messenger.jz.e(i14).f23631e[0][i26];
                        i15 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                        int i30 = org.telegram.messenger.jz.e(i15).f23631e[i28][i26] + i29;
                        i16 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                        i13 = org.telegram.messenger.jz.e(i16).f23631e[2][i26] + i30;
                        z9 = true;
                        ?? obj = new Object();
                        obj.d = i20;
                        obj.f35962c = z12;
                        obj.f35961b = z9;
                        obj.f45702e = z13;
                        obj.f45704g = i11;
                        obj.f45703f = B1;
                        obj.h = i13;
                        ftVarArr2[i20] = obj;
                        ftVarArr[i20] = obj;
                        fArr[i20] = ((float) z12) / ((float) this.f46104q3);
                        i20++;
                    }
                }
                i12 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                z9 = true;
                i13 = org.telegram.messenger.jz.e(i12).f23631e[this.f46094f3 - 1][i26];
                ?? obj2 = new Object();
                obj2.d = i20;
                obj2.f35962c = z12;
                obj2.f35961b = z9;
                obj2.f45702e = z13;
                obj2.f45704g = i11;
                obj2.f45703f = B1;
                obj2.h = i13;
                ftVarArr2[i20] = obj2;
                ftVarArr[i20] = obj2;
                fArr[i20] = ((float) z12) / ((float) this.f46104q3);
                i20++;
            } else {
                Arrays.sort(this.f46101n3, new oe(24));
                org.telegram.messenger.g0.f3(fArr, this.f46099l3);
                Arrays.fill(this.f46103p3, true);
                return;
            }
        }
    }

    public final void D1(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gt.D1(boolean):void");
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
        int i14 = this.f46094f3;
        kt ktVar = this.f46109v3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
            return org.telegram.messenger.jz.e(i10).f(this.f46094f3 - 1, i7);
        }
        i11 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
        long f10 = org.telegram.messenger.jz.e(i11).f(0, i7);
        i12 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
        i13 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
        return org.telegram.messenger.jz.e(i13).f(2, i7) + org.telegram.messenger.jz.e(i12).f(1, i7) + f10;
    }
}
