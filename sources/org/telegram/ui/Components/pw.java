package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
public final class pw extends is {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final rw S;

    public pw(rw rwVar) {
        this.S = rwVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i3, int i10, float f10) {
        boolean z10;
        boolean z11;
        int i11;
        rw rwVar = this.S;
        ey eyVar = rwVar.f37820n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z12 = true;
        if (arrayList.size() > 4 && org.telegram.messenger.az.o() != 0 && org.telegram.messenger.lc.e(16388)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (eyVar.f33590w2 > 0 && SystemClock.elapsedRealtime() - eyVar.f33590w2 < rwVar.z1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i12 = 0; i12 < this.P.size(); i12++) {
                nx nxVar = (nx) this.P.get(i12);
                if (nxVar.h != 0.0f || nxVar.f36641n != null || ((i11 = nxVar.f36636a) > eyVar.f33583u2 && i11 < eyVar.f33586v2 && z11)) {
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
        super.a(canvas, j10, i3, i10, 1.0f);
    }

    @Override
    public final void c(Canvas canvas) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i3 < arrayList.size()) {
                nx nxVar = (nx) arrayList.get(i3);
                g5 g5Var = nxVar.f36637b;
                if (g5Var != null) {
                    org.telegram.messenger.bc bcVar = nxVar.f36640f[this.L];
                    ei.c3 c3Var = g5Var.f33971k;
                    if (c3Var != null) {
                        c3Var.setAlpha(g5Var.f33972l);
                        g5Var.f33971k.h(canvas, bcVar);
                    }
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(android.graphics.Canvas r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pw.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i3 < arrayList.size()) {
                org.telegram.messenger.bc[] bcVarArr = ((nx) arrayList.get(i3)).f36640f;
                if (bcVarArr != null) {
                    bcVarArr[this.L].a();
                }
                i3++;
            } else {
                this.S.f37820n3.Q.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j10) {
        g5 g5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        ey eyVar = this.S.f37820n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i3 = 0; i3 < this.P.size(); i3++) {
            nx nxVar = (nx) this.P.get(i3);
            p5 span = nxVar.getSpan();
            org.telegram.messenger.bc[] bcVarArr = nxVar.f36640f;
            if (span != null && (g5Var = (g5) eyVar.f33534e2.get(nxVar.d.getDocumentId())) != null && g5Var.f33971k != null) {
                g5Var.s(j10);
                ei.c3 c3Var = g5Var.f33971k;
                int i10 = this.L;
                org.telegram.messenger.bc e02 = c3Var.e0(bcVarArr[i10], i10);
                bcVarArr[i10] = e02;
                e02.f21763c = j10;
                e02.f21762b = 1.0f;
                g5Var.setAlpha(255);
                int height = (int) (nxVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((nxVar.getPaddingLeft() + nxVar.getLeft()) - this.O, height, (nxVar.getRight() - nxVar.getPaddingRight()) - this.O, ((nxVar.getMeasuredHeight() + height) - nxVar.getPaddingTop()) - nxVar.getPaddingBottom());
                bcVarArr[i10].b(rect);
                nxVar.f36637b = g5Var;
                org.telegram.messenger.bc bcVar = bcVarArr[i10];
                if (g5Var.c()) {
                    porterDuffColorFilter = eyVar.f33538f2;
                } else {
                    porterDuffColorFilter = null;
                }
                bcVar.f21783z = porterDuffColorFilter;
                arrayList.add(nxVar);
            }
        }
    }
}
