package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
public final class cx extends vs {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final ex S;

    public cx(ex exVar) {
        this.S = exVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z10;
        boolean z11;
        int i11;
        ex exVar = this.S;
        ry ryVar = exVar.f34823n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z12 = true;
        if (arrayList.size() > 4 && org.telegram.messenger.bz.o() != 0 && org.telegram.messenger.pc.e(16388)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (ryVar.f39405w2 > 0 && SystemClock.elapsedRealtime() - ryVar.f39405w2 < exVar.z1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i12 = 0; i12 < this.P.size(); i12++) {
                zx zxVar = (zx) this.P.get(i12);
                if (zxVar.h != 0.0f || zxVar.f42965n != null || ((i11 = zxVar.f42960a) > ryVar.f39398u2 && i11 < ryVar.f39401v2 && z11)) {
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
                zx zxVar = (zx) arrayList.get(i7);
                o5 o5Var = zxVar.f42961b;
                if (o5Var != null) {
                    org.telegram.messenger.gc gcVar = zxVar.f42964f[this.L];
                    fi.s2 s2Var = o5Var.f37976k;
                    if (s2Var != null) {
                        s2Var.setAlpha(o5Var.f37977l);
                        o5Var.f37976k.h(canvas, gcVar);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cx.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.gc[] gcVarArr = ((zx) arrayList.get(i7)).f42964f;
                if (gcVarArr != null) {
                    gcVarArr[this.L].a();
                }
                i7++;
            } else {
                this.S.f34823n3.Q.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        o5 o5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        ry ryVar = this.S.f34823n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i7 = 0; i7 < this.P.size(); i7++) {
            zx zxVar = (zx) this.P.get(i7);
            x5 span = zxVar.getSpan();
            org.telegram.messenger.gc[] gcVarArr = zxVar.f42964f;
            if (span != null && (o5Var = (o5) ryVar.f39349e2.get(zxVar.d.getDocumentId())) != null && o5Var.f37976k != null) {
                o5Var.s(j3);
                fi.s2 s2Var = o5Var.f37976k;
                int i10 = this.L;
                org.telegram.messenger.gc e02 = s2Var.e0(gcVarArr[i10], i10);
                gcVarArr[i10] = e02;
                e02.f24192c = j3;
                e02.f24191b = 1.0f;
                o5Var.setAlpha(255);
                int height = (int) (zxVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((zxVar.getPaddingLeft() + zxVar.getLeft()) - this.O, height, (zxVar.getRight() - zxVar.getPaddingRight()) - this.O, ((zxVar.getMeasuredHeight() + height) - zxVar.getPaddingTop()) - zxVar.getPaddingBottom());
                gcVarArr[i10].b(rect);
                zxVar.f42961b = o5Var;
                org.telegram.messenger.gc gcVar = gcVarArr[i10];
                if (o5Var.c()) {
                    porterDuffColorFilter = ryVar.f39353f2;
                } else {
                    porterDuffColorFilter = null;
                }
                gcVar.f24212z = porterDuffColorFilter;
                arrayList.add(zxVar);
            }
        }
    }
}
