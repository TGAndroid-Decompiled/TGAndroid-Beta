package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
public final class rw extends is {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final tw R;

    public rw(tw twVar) {
        this.R = twVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z9;
        boolean z10;
        int i11;
        tw twVar = this.R;
        hy hyVar = twVar.f38440m3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z11 = true;
        if (arrayList.size() > 4 && org.telegram.messenger.iz.o() != 0 && org.telegram.messenger.sc.e(16388)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            if (hyVar.f34459v2 > 0 && SystemClock.elapsedRealtime() - hyVar.f34459v2 < twVar.z1()) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                qx qxVar = (qx) this.O.get(i12);
                if (qxVar.h != 0.0f || qxVar.f37447n != null || ((i11 = qxVar.f37442a) > hyVar.f34453t2 && i11 < hyVar.f34456u2 && z10)) {
                    break;
                }
            }
        }
        z11 = z9;
        if (z11) {
            i(System.currentTimeMillis());
            d(canvas, 1.0f);
            k();
            return;
        }
        super.a(canvas, j3, i7, i10, 1.0f);
    }

    @Override
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                qx qxVar = (qx) arrayList.get(i7);
                i5 i5Var = qxVar.f37443b;
                if (i5Var != null) {
                    org.telegram.messenger.ic icVar = qxVar.f37446f[this.K];
                    di.z2 z2Var = i5Var.f34541k;
                    if (z2Var != null) {
                        z2Var.setAlpha(i5Var.f34542l);
                        i5Var.f34541k.h(canvas, icVar);
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(android.graphics.Canvas r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rw.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.ic[] icVarArr = ((qx) arrayList.get(i7)).f37446f;
                if (icVarArr != null) {
                    icVarArr[this.K].a();
                }
                i7++;
            } else {
                this.R.f38440m3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        i5 i5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        hy hyVar = this.R.f38440m3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            qx qxVar = (qx) this.O.get(i7);
            r5 span = qxVar.getSpan();
            org.telegram.messenger.ic[] icVarArr = qxVar.f37446f;
            if (span != null && (i5Var = (i5) hyVar.d2.get(qxVar.d.getDocumentId())) != null && i5Var.f34541k != null) {
                i5Var.s(j3);
                di.z2 z2Var = i5Var.f34541k;
                int i10 = this.K;
                org.telegram.messenger.ic e02 = z2Var.e0(icVarArr[i10], i10);
                icVarArr[i10] = e02;
                e02.f23136c = j3;
                e02.f23135b = 1.0f;
                i5Var.setAlpha(255);
                int height = (int) (qxVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((qxVar.getPaddingLeft() + qxVar.getLeft()) - this.N, height, (qxVar.getRight() - qxVar.getPaddingRight()) - this.N, ((qxVar.getMeasuredHeight() + height) - qxVar.getPaddingTop()) - qxVar.getPaddingBottom());
                icVarArr[i10].b(rect);
                qxVar.f37443b = i5Var;
                org.telegram.messenger.ic icVar = icVarArr[i10];
                if (i5Var.c()) {
                    porterDuffColorFilter = hyVar.f34407e2;
                } else {
                    porterDuffColorFilter = null;
                }
                icVar.f23156z = porterDuffColorFilter;
                arrayList.add(qxVar);
            }
        }
    }
}
