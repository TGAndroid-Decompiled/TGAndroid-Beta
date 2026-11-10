package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
public final class qw extends hs {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final sw R;

    public qw(sw swVar) {
        this.R = swVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z9;
        boolean z10;
        int i11;
        sw swVar = this.R;
        gy gyVar = swVar.f38095m3;
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
            if (gyVar.f34075v2 > 0 && SystemClock.elapsedRealtime() - gyVar.f34075v2 < swVar.z1()) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                px pxVar = (px) this.O.get(i12);
                if (pxVar.h != 0.0f || pxVar.f37092n != null || ((i11 = pxVar.f37087a) > gyVar.f34069t2 && i11 < gyVar.f34072u2 && z10)) {
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
                px pxVar = (px) arrayList.get(i7);
                h5 h5Var = pxVar.f37088b;
                if (h5Var != null) {
                    org.telegram.messenger.ic icVar = pxVar.f37091f[this.K];
                    di.z2 z2Var = h5Var.f34176k;
                    if (z2Var != null) {
                        z2Var.setAlpha(h5Var.f34177l);
                        h5Var.f34176k.h(canvas, icVar);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qw.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.ic[] icVarArr = ((px) arrayList.get(i7)).f37091f;
                if (icVarArr != null) {
                    icVarArr[this.K].a();
                }
                i7++;
            } else {
                this.R.f38095m3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        h5 h5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        gy gyVar = this.R.f38095m3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            px pxVar = (px) this.O.get(i7);
            q5 span = pxVar.getSpan();
            org.telegram.messenger.ic[] icVarArr = pxVar.f37091f;
            if (span != null && (h5Var = (h5) gyVar.d2.get(pxVar.d.getDocumentId())) != null && h5Var.f34176k != null) {
                h5Var.s(j3);
                di.z2 z2Var = h5Var.f34176k;
                int i10 = this.K;
                org.telegram.messenger.ic e02 = z2Var.e0(icVarArr[i10], i10);
                icVarArr[i10] = e02;
                e02.f23140c = j3;
                e02.f23139b = 1.0f;
                h5Var.setAlpha(255);
                int height = (int) (pxVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((pxVar.getPaddingLeft() + pxVar.getLeft()) - this.N, height, (pxVar.getRight() - pxVar.getPaddingRight()) - this.N, ((pxVar.getMeasuredHeight() + height) - pxVar.getPaddingTop()) - pxVar.getPaddingBottom());
                icVarArr[i10].b(rect);
                pxVar.f37088b = h5Var;
                org.telegram.messenger.ic icVar = icVarArr[i10];
                if (h5Var.c()) {
                    porterDuffColorFilter = gyVar.f34023e2;
                } else {
                    porterDuffColorFilter = null;
                }
                icVar.f23160z = porterDuffColorFilter;
                arrayList.add(pxVar);
            }
        }
    }
}
