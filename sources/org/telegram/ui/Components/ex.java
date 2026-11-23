package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
public final class ex extends xs {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final gx S;

    public ex(gx gxVar) {
        this.S = gxVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z10;
        boolean z11;
        int i11;
        gx gxVar = this.S;
        ty tyVar = gxVar.f35700n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z12 = true;
        if (arrayList.size() > 4 && org.telegram.messenger.cz.o() != 0 && org.telegram.messenger.qc.e(16388)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (tyVar.f40151w2 > 0 && SystemClock.elapsedRealtime() - tyVar.f40151w2 < gxVar.z1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i12 = 0; i12 < this.P.size(); i12++) {
                cy cyVar = (cy) this.P.get(i12);
                if (cyVar.h != 0.0f || cyVar.f34329n != null || ((i11 = cyVar.f34324a) > tyVar.f40144u2 && i11 < tyVar.f40147v2 && z11)) {
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
                cy cyVar = (cy) arrayList.get(i7);
                p5 p5Var = cyVar.f34325b;
                if (p5Var != null) {
                    org.telegram.messenger.hc hcVar = cyVar.f34328f[this.L];
                    fi.s2 s2Var = p5Var.f38499k;
                    if (s2Var != null) {
                        s2Var.setAlpha(p5Var.f38500l);
                        p5Var.f38499k.h(canvas, hcVar);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ex.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.hc[] hcVarArr = ((cy) arrayList.get(i7)).f34328f;
                if (hcVarArr != null) {
                    hcVarArr[this.L].a();
                }
                i7++;
            } else {
                this.S.f35700n3.Q.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        p5 p5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        ty tyVar = this.S.f35700n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i7 = 0; i7 < this.P.size(); i7++) {
            cy cyVar = (cy) this.P.get(i7);
            y5 span = cyVar.getSpan();
            org.telegram.messenger.hc[] hcVarArr = cyVar.f34328f;
            if (span != null && (p5Var = (p5) tyVar.f40095e2.get(cyVar.d.getDocumentId())) != null && p5Var.f38499k != null) {
                p5Var.s(j3);
                fi.s2 s2Var = p5Var.f38499k;
                int i10 = this.L;
                org.telegram.messenger.hc e02 = s2Var.e0(hcVarArr[i10], i10);
                hcVarArr[i10] = e02;
                e02.f24423c = j3;
                e02.f24422b = 1.0f;
                p5Var.setAlpha(255);
                int height = (int) (cyVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((cyVar.getPaddingLeft() + cyVar.getLeft()) - this.O, height, (cyVar.getRight() - cyVar.getPaddingRight()) - this.O, ((cyVar.getMeasuredHeight() + height) - cyVar.getPaddingTop()) - cyVar.getPaddingBottom());
                hcVarArr[i10].b(rect);
                cyVar.f34325b = p5Var;
                org.telegram.messenger.hc hcVar = hcVarArr[i10];
                if (p5Var.c()) {
                    porterDuffColorFilter = tyVar.f40099f2;
                } else {
                    porterDuffColorFilter = null;
                }
                hcVar.f24443z = porterDuffColorFilter;
                arrayList.add(cyVar);
            }
        }
    }
}
