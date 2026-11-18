package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
public final class mt extends org.telegram.ui.Components.ck0 {
    public static final int f49926x3 = 0;
    public boolean f49927f3;
    public int f49928g3;
    public final v4.c0 f49929h3;
    public final org.telegram.ui.Components.li0 f49930i3;
    public final ArrayList j3;
    public final ArrayList f49931k3;
    public final float[] f49932l3;
    public final int[] f49933m3;
    public final ArrayList f49934n3;
    public lt[] f49935o3;
    public lt[] f49936p3;
    public final boolean[] f49937q3;
    public long f49938r3;
    public long f49939s3;
    public long f49940t3;
    public boolean f49941u3;
    public kt f49942v3;
    public final pt f49943w3;

    public mt(pt ptVar, Activity activity) {
        super(activity, null);
        ri.q qVar;
        this.f49943w3 = ptVar;
        this.f49927f3 = false;
        this.f49928g3 = 0;
        this.j3 = new ArrayList();
        this.f49931k3 = new ArrayList();
        this.f49932l3 = new float[7];
        this.f49933m3 = new int[7];
        this.f49934n3 = new ArrayList();
        this.f49937q3 = new boolean[7];
        qVar = ((org.telegram.ui.ActionBar.h2) ptVar).glassEngine;
        qVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        v4.c0 c0Var = new v4.c0();
        this.f49929h3 = c0Var;
        setLayoutManager(c0Var);
        org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(this, 1);
        this.f49930i3 = li0Var;
        setAdapter(li0Var);
        r1();
        setOnItemClickListener(new h(this, 8));
        v4.k kVar = new v4.k();
        kVar.n(220L);
        kVar.o(org.telegram.ui.Components.lr.h);
        kVar.C = false;
        kVar.f59152m = false;
        setItemAnimator(kVar);
        ri.a.e(this, ptVar.h, ptVar.f50935n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f49928g3;
        pt ptVar = this.f49943w3;
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            i7 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
            return org.telegram.messenger.cz.e(i7).h[this.f49928g3 - 1];
        }
        i10 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
        long j3 = org.telegram.messenger.cz.e(i10).h[0];
        i11 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
        long j10 = org.telegram.messenger.cz.e(i11).h[1];
        i12 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
        long[] jArr = {j3, j10, org.telegram.messenger.cz.e(i12).h[2]};
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
        int i14 = this.f49928g3;
        pt ptVar = this.f49943w3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
            return org.telegram.messenger.cz.e(i10).g(this.f49928g3 - 1, i7);
        }
        i11 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
        long g10 = org.telegram.messenger.cz.e(i11).g(0, i7);
        i12 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
        i13 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
        return org.telegram.messenger.cz.e(i13).g(2, i7) + org.telegram.messenger.cz.e(i12).g(1, i7) + g10;
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
        this.f49938r3 = z1(6) + B1(6);
        this.f49939s3 = z1(6);
        this.f49940t3 = B1(6);
        if (this.f49935o3 == null) {
            this.f49935o3 = new lt[7];
        }
        if (this.f49936p3 == null) {
            this.f49936p3 = new lt[7];
        }
        int i20 = 0;
        while (true) {
            int[] iArr = pt.f50929y;
            int length = iArr.length;
            float[] fArr = this.f49932l3;
            if (i20 < length) {
                int i21 = iArr[i20];
                long z12 = z1(i21) + B1(i21);
                lt[] ltVarArr = this.f49936p3;
                lt[] ltVarArr2 = this.f49935o3;
                long z13 = z1(iArr[i20]);
                long B1 = B1(iArr[i20]);
                int i22 = iArr[i20];
                int i23 = this.f49928g3;
                pt ptVar = this.f49943w3;
                if (i23 == 1 || i23 == 2 || i23 == 3) {
                    i7 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                    i10 = 1;
                    i11 = org.telegram.messenger.cz.e(i7).f23444f[this.f49928g3 - 1][i22];
                } else {
                    i17 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                    int i24 = org.telegram.messenger.cz.e(i17).f23444f[0][i22];
                    i18 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                    int i25 = org.telegram.messenger.cz.e(i18).f23444f[1][i22] + i24;
                    i19 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                    i11 = org.telegram.messenger.cz.e(i19).f23444f[2][i22] + i25;
                    i10 = 1;
                }
                int i26 = iArr[i20];
                int i27 = this.f49928g3;
                if (i27 != i10) {
                    int i28 = i10;
                    if (i27 != 2 && i27 != 3) {
                        i14 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                        int i29 = org.telegram.messenger.cz.e(i14).f23443e[0][i26];
                        i15 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                        int i30 = org.telegram.messenger.cz.e(i15).f23443e[i28][i26] + i29;
                        i16 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                        i13 = org.telegram.messenger.cz.e(i16).f23443e[2][i26] + i30;
                        z10 = true;
                        ?? obj = new Object();
                        obj.d = i20;
                        obj.f38759c = z12;
                        obj.f38758b = z10;
                        obj.f49646e = z13;
                        obj.f49648g = i11;
                        obj.f49647f = B1;
                        obj.h = i13;
                        ltVarArr2[i20] = obj;
                        ltVarArr[i20] = obj;
                        fArr[i20] = ((float) z12) / ((float) this.f49938r3);
                        i20++;
                    }
                }
                i12 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                z10 = true;
                i13 = org.telegram.messenger.cz.e(i12).f23443e[this.f49928g3 - 1][i26];
                ?? obj2 = new Object();
                obj2.d = i20;
                obj2.f38759c = z12;
                obj2.f38758b = z10;
                obj2.f49646e = z13;
                obj2.f49648g = i11;
                obj2.f49647f = B1;
                obj2.h = i13;
                ltVarArr2[i20] = obj2;
                ltVarArr[i20] = obj2;
                fArr[i20] = ((float) z12) / ((float) this.f49938r3);
                i20++;
            } else {
                Arrays.sort(this.f49935o3, new pe(22));
                org.telegram.messenger.g0.e3(fArr, this.f49933m3);
                Arrays.fill(this.f49937q3, true);
                return;
            }
        }
    }

    public final void D1(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mt.D1(boolean):void");
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
        int i14 = this.f49928g3;
        pt ptVar = this.f49943w3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
            return org.telegram.messenger.cz.e(i10).f(this.f49928g3 - 1, i7);
        }
        i11 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
        long f10 = org.telegram.messenger.cz.e(i11).f(0, i7);
        i12 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
        i13 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
        return org.telegram.messenger.cz.e(i13).f(2, i7) + org.telegram.messenger.cz.e(i12).f(1, i7) + f10;
    }
}
