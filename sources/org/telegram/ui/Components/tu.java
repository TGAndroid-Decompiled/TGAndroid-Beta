package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;
public final class tu extends ts {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final uu P;

    public tu(uu uuVar) {
        this.P = uuVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        boolean z10;
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        boolean z11 = true;
        if (arrayList.size() > 3 && org.telegram.messenger.uz.o() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i12 = 0; i12 < this.N.size(); i12++) {
                vu vuVar = (vu) this.N.get(i12);
                if (vuVar.e != 0.0f || vuVar.d != null || vuVar.getTranslationX() != 0.0f || vuVar.getTranslationY() != 0.0f || vuVar.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z11 = z10;
        if (z11) {
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
            ArrayList arrayList = this.O;
            if (i10 < arrayList.size()) {
                vu vuVar = (vu) arrayList.get(i10);
                vuVar.f31906b.h(canvas, vuVar.f31905a[this.K]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        f5 f5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                vu vuVar = (vu) this.N.get(i10);
                o5 o5Var = vuVar.f31907c;
                if (o5Var != null && (f5Var = (f5) this.P.D.f25242i1.get(o5Var.getDocumentId())) != null && f5Var.f26070k != null && vuVar.f31906b != null) {
                    f5Var.setAlpha((int) (vuVar.getAlpha() * 255.0f * f7));
                    float width = ((vuVar.getWidth() - vuVar.getPaddingLeft()) - vuVar.getPaddingRight()) / 2.0f;
                    float height = ((vuVar.getHeight() - vuVar.getPaddingTop()) - vuVar.getPaddingBottom()) / 2.0f;
                    float right = (vuVar.getRight() + vuVar.getLeft()) / 2.0f;
                    float paddingTop = vuVar.getPaddingTop() + height;
                    float f10 = vuVar.e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    f5Var.setBounds((int) (right - ((vuVar.getScaleX() * width) * f11)), (int) (paddingTop - ((vuVar.getScaleY() * height) * f11)), (int) ((vuVar.getScaleX() * width * f11) + right), (int) ((vuVar.getScaleY() * height * f11) + paddingTop));
                    f5Var.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 < arrayList.size()) {
                ((vu) arrayList.get(i10)).f31905a[this.K].a();
                i10++;
            } else {
                cv cvVar = this.P.D;
                Pattern pattern = cv.M1;
                cvVar.f21587b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j10) {
        f5 f5Var;
        cv cvVar = this.P.D;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            vu vuVar = (vu) this.N.get(i10);
            o5 o5Var = vuVar.f31907c;
            org.telegram.messenger.kc[] kcVarArr = vuVar.f31905a;
            if (o5Var != null && (f5Var = (f5) cvVar.f25242i1.get(o5Var.getDocumentId())) != null && f5Var.f26070k != null) {
                f5Var.s(j10);
                ag.c2 c2Var = f5Var.f26070k;
                int i11 = this.K;
                org.telegram.messenger.kc e02 = c2Var.e0(kcVarArr[i11], i11);
                kcVarArr[i11] = e02;
                e02.f16597c = j10;
                f5Var.setAlpha(255);
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(vuVar.getPaddingLeft() + vuVar.getLeft(), vuVar.getPaddingTop(), vuVar.getRight() - vuVar.getPaddingRight(), vuVar.getMeasuredHeight() - vuVar.getPaddingBottom());
                kcVarArr[i11].b(rect);
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, cvVar.I0);
                if (w02 != cvVar.L1 || cvVar.K1 == null) {
                    cvVar.L1 = w02;
                    cvVar.K1 = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                f5Var.setColorFilter(cvVar.K1);
                vuVar.f31906b = f5Var.f26070k;
                arrayList.add(vuVar);
            }
        }
    }
}
