package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
public final class ww extends os {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final yw S;

    public ww(yw ywVar) {
        this.S = ywVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z10;
        boolean z11;
        int i11;
        yw ywVar = this.S;
        ly lyVar = ywVar.f42170n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z12 = true;
        if (arrayList.size() > 4 && org.telegram.messenger.gz.o() != 0 && org.telegram.messenger.qc.e(16388)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (lyVar.f37001w2 > 0 && SystemClock.elapsedRealtime() - lyVar.f37001w2 < ywVar.z1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i12 = 0; i12 < this.P.size(); i12++) {
                ux uxVar = (ux) this.P.get(i12);
                if (uxVar.h != 0.0f || uxVar.f40184n != null || ((i11 = uxVar.f40179a) > lyVar.f36994u2 && i11 < lyVar.f36997v2 && z11)) {
                    break;
                }
            }
        }
        z12 = z10;
        if (z12) {
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
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                ux uxVar = (ux) arrayList.get(i7);
                g5 g5Var = uxVar.f40180b;
                if (g5Var != null) {
                    org.telegram.messenger.hc hcVar = uxVar.f40183f[this.L];
                    fi.u2 u2Var = g5Var.f34809k;
                    if (u2Var != null) {
                        u2Var.setAlpha(g5Var.f34810l);
                        g5Var.f34809k.h(canvas, hcVar);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ww.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.hc[] hcVarArr = ((ux) arrayList.get(i7)).f40183f;
                if (hcVarArr != null) {
                    hcVarArr[this.L].a();
                }
                i7++;
            } else {
                this.S.f42170n3.Q.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        g5 g5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        ly lyVar = this.S.f42170n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i7 = 0; i7 < this.P.size(); i7++) {
            ux uxVar = (ux) this.P.get(i7);
            p5 span = uxVar.getSpan();
            org.telegram.messenger.hc[] hcVarArr = uxVar.f40183f;
            if (span != null && (g5Var = (g5) lyVar.f36945e2.get(uxVar.d.getDocumentId())) != null && g5Var.f34809k != null) {
                g5Var.s(j3);
                fi.u2 u2Var = g5Var.f34809k;
                int i10 = this.L;
                org.telegram.messenger.hc e02 = u2Var.e0(hcVarArr[i10], i10);
                hcVarArr[i10] = e02;
                e02.f24080c = j3;
                e02.f24079b = 1.0f;
                g5Var.setAlpha(255);
                int height = (int) (uxVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((uxVar.getPaddingLeft() + uxVar.getLeft()) - this.O, height, (uxVar.getRight() - uxVar.getPaddingRight()) - this.O, ((uxVar.getMeasuredHeight() + height) - uxVar.getPaddingTop()) - uxVar.getPaddingBottom());
                hcVarArr[i10].b(rect);
                uxVar.f40180b = g5Var;
                org.telegram.messenger.hc hcVar = hcVarArr[i10];
                if (g5Var.c()) {
                    porterDuffColorFilter = lyVar.f36949f2;
                } else {
                    porterDuffColorFilter = null;
                }
                hcVar.f24100z = porterDuffColorFilter;
                arrayList.add(uxVar);
            }
        }
    }
}
