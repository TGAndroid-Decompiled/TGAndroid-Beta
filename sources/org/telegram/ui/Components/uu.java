package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;
public final class uu extends xs {
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final vu Q;

    public uu(vu vuVar) {
        this.Q = vuVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z10;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z11 = true;
        if (arrayList.size() > 3 && org.telegram.messenger.cz.o() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i11 = 0; i11 < this.O.size(); i11++) {
                wu wuVar = (wu) this.O.get(i11);
                if (wuVar.f41859e != 0.0f || wuVar.d != null || wuVar.getTranslationX() != 0.0f || wuVar.getTranslationY() != 0.0f || wuVar.getAlpha() != 1.0f) {
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
        super.a(canvas, j3, i7, i10, 1.0f);
    }

    @Override
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                wu wuVar = (wu) arrayList.get(i7);
                wuVar.f41857b.h(canvas, wuVar.f41856a[this.L]);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        p5 p5Var;
        if (this.O != null) {
            for (int i7 = 0; i7 < this.O.size(); i7++) {
                wu wuVar = (wu) this.O.get(i7);
                y5 y5Var = wuVar.f41858c;
                if (y5Var != null && (p5Var = (p5) this.Q.E.f34569m1.get(y5Var.getDocumentId())) != null && p5Var.f38457k != null && wuVar.f41857b != null) {
                    p5Var.setAlpha((int) (wuVar.getAlpha() * 255.0f * f10));
                    float width = ((wuVar.getWidth() - wuVar.getPaddingLeft()) - wuVar.getPaddingRight()) / 2.0f;
                    float height = ((wuVar.getHeight() - wuVar.getPaddingTop()) - wuVar.getPaddingBottom()) / 2.0f;
                    float right = (wuVar.getRight() + wuVar.getLeft()) / 2.0f;
                    float paddingTop = wuVar.getPaddingTop() + height;
                    float f11 = wuVar.f41859e;
                    float f12 = 1.0f;
                    if (f11 != 0.0f) {
                        f12 = 1.0f * (((1.0f - f11) * 0.2f) + 0.8f);
                    }
                    p5Var.setBounds((int) (right - ((wuVar.getScaleX() * width) * f12)), (int) (paddingTop - ((wuVar.getScaleY() * height) * f12)), (int) ((wuVar.getScaleX() * width * f12) + right), (int) ((wuVar.getScaleY() * height * f12) + paddingTop));
                    p5Var.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                ((wu) arrayList.get(i7)).f41856a[this.L].a();
                i7++;
            } else {
                dv dvVar = this.Q.E;
                Pattern pattern = dv.Q1;
                dvVar.f30142b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        p5 p5Var;
        dv dvVar = this.Q.E;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            wu wuVar = (wu) this.O.get(i7);
            y5 y5Var = wuVar.f41858c;
            org.telegram.messenger.hc[] hcVarArr = wuVar.f41856a;
            if (y5Var != null && (p5Var = (p5) dvVar.f34569m1.get(y5Var.getDocumentId())) != null && p5Var.f38457k != null) {
                p5Var.s(j3);
                fi.s2 s2Var = p5Var.f38457k;
                int i10 = this.L;
                org.telegram.messenger.hc e02 = s2Var.e0(hcVarArr[i10], i10);
                hcVarArr[i10] = e02;
                e02.f24387c = j3;
                p5Var.setAlpha(255);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(wuVar.getPaddingLeft() + wuVar.getLeft(), wuVar.getPaddingTop(), wuVar.getRight() - wuVar.getPaddingRight(), wuVar.getMeasuredHeight() - wuVar.getPaddingBottom());
                hcVarArr[i10].b(rect);
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, dvVar.J0);
                if (w02 != dvVar.P1 || dvVar.O1 == null) {
                    dvVar.P1 = w02;
                    dvVar.O1 = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                p5Var.setColorFilter(dvVar.O1);
                wuVar.f41857b = p5Var.f38457k;
                arrayList.add(wuVar);
            }
        }
    }
}
