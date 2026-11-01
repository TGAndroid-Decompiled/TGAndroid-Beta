package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
public final class fx extends ts {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final hx R;

    public fx(hx hxVar) {
        this.R = hxVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        boolean z10;
        boolean z11;
        int i12;
        hx hxVar = this.R;
        vy vyVar = hxVar.f26954m3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z12 = true;
        if (arrayList.size() > 4 && org.telegram.messenger.uz.o() != 0 && org.telegram.messenger.tc.e(16388)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (vyVar.f32003v2 > 0 && SystemClock.elapsedRealtime() - vyVar.f32003v2 < hxVar.z1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                ey eyVar = (ey) this.O.get(i13);
                if (eyVar.h != 0.0f || eyVar.f25969n != null || ((i12 = eyVar.f25965a) > vyVar.f31997t2 && i12 < vyVar.f32000u2 && z11)) {
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
        super.a(canvas, j10, i10, i11, 1.0f);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ey eyVar = (ey) arrayList.get(i10);
                f5 f5Var = eyVar.f25966b;
                if (f5Var != null) {
                    org.telegram.messenger.kc kcVar = eyVar.f25968f[this.K];
                    ag.c2 c2Var = f5Var.f26070k;
                    if (c2Var != null) {
                        c2Var.setAlpha(f5Var.f26071l);
                        f5Var.f26070k.h(canvas, kcVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(android.graphics.Canvas r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fx.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                org.telegram.messenger.kc[] kcVarArr = ((ey) arrayList.get(i10)).f25968f;
                if (kcVarArr != null) {
                    kcVarArr[this.K].a();
                }
                i10++;
            } else {
                this.R.f26954m3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j10) {
        f5 f5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        vy vyVar = this.R.f26954m3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            ey eyVar = (ey) this.O.get(i10);
            o5 span = eyVar.getSpan();
            org.telegram.messenger.kc[] kcVarArr = eyVar.f25968f;
            if (span != null && (f5Var = (f5) vyVar.f31947d2.get(eyVar.d.getDocumentId())) != null && f5Var.f26070k != null) {
                f5Var.s(j10);
                ag.c2 c2Var = f5Var.f26070k;
                int i11 = this.K;
                org.telegram.messenger.kc e02 = c2Var.e0(kcVarArr[i11], i11);
                kcVarArr[i11] = e02;
                e02.f16597c = j10;
                e02.f16596b = 1.0f;
                f5Var.setAlpha(255);
                int height = (int) (eyVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set((eyVar.getPaddingLeft() + eyVar.getLeft()) - this.N, height, (eyVar.getRight() - eyVar.getPaddingRight()) - this.N, ((eyVar.getMeasuredHeight() + height) - eyVar.getPaddingTop()) - eyVar.getPaddingBottom());
                kcVarArr[i11].b(rect);
                eyVar.f25966b = f5Var;
                org.telegram.messenger.kc kcVar = kcVarArr[i11];
                if (f5Var.c()) {
                    porterDuffColorFilter = vyVar.f31950e2;
                } else {
                    porterDuffColorFilter = null;
                }
                kcVar.f16616z = porterDuffColorFilter;
                arrayList.add(eyVar);
            }
        }
    }
}
