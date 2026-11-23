package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
public final class bx extends us {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final dx S;

    public bx(dx dxVar) {
        this.S = dxVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z10;
        boolean z11;
        int i11;
        dx dxVar = this.S;
        qy qyVar = dxVar.f34478n3;
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
            if (qyVar.f39107w2 > 0 && SystemClock.elapsedRealtime() - qyVar.f39107w2 < dxVar.z1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i12 = 0; i12 < this.P.size(); i12++) {
                yx yxVar = (yx) this.P.get(i12);
                if (yxVar.h != 0.0f || yxVar.f42583n != null || ((i11 = yxVar.f42578a) > qyVar.f39100u2 && i11 < qyVar.f39103v2 && z11)) {
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
                yx yxVar = (yx) arrayList.get(i7);
                o5 o5Var = yxVar.f42579b;
                if (o5Var != null) {
                    org.telegram.messenger.gc gcVar = yxVar.f42582f[this.L];
                    fi.s2 s2Var = o5Var.f38028k;
                    if (s2Var != null) {
                        s2Var.setAlpha(o5Var.f38029l);
                        o5Var.f38028k.h(canvas, gcVar);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bx.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.gc[] gcVarArr = ((yx) arrayList.get(i7)).f42582f;
                if (gcVarArr != null) {
                    gcVarArr[this.L].a();
                }
                i7++;
            } else {
                this.S.f34478n3.Q.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        o5 o5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        qy qyVar = this.S.f34478n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i7 = 0; i7 < this.P.size(); i7++) {
            yx yxVar = (yx) this.P.get(i7);
            x5 span = yxVar.getSpan();
            org.telegram.messenger.gc[] gcVarArr = yxVar.f42582f;
            if (span != null && (o5Var = (o5) qyVar.f39051e2.get(yxVar.d.getDocumentId())) != null && o5Var.f38028k != null) {
                o5Var.s(j3);
                fi.s2 s2Var = o5Var.f38028k;
                int i10 = this.L;
                org.telegram.messenger.gc f02 = s2Var.f0(gcVarArr[i10], i10);
                gcVarArr[i10] = f02;
                f02.f24293c = j3;
                f02.f24292b = 1.0f;
                o5Var.setAlpha(255);
                int height = (int) (yxVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((yxVar.getPaddingLeft() + yxVar.getLeft()) - this.O, height, (yxVar.getRight() - yxVar.getPaddingRight()) - this.O, ((yxVar.getMeasuredHeight() + height) - yxVar.getPaddingTop()) - yxVar.getPaddingBottom());
                gcVarArr[i10].b(rect);
                yxVar.f42579b = o5Var;
                org.telegram.messenger.gc gcVar = gcVarArr[i10];
                if (o5Var.c()) {
                    porterDuffColorFilter = qyVar.f39055f2;
                } else {
                    porterDuffColorFilter = null;
                }
                gcVar.f24313z = porterDuffColorFilter;
                arrayList.add(yxVar);
            }
        }
    }
}
