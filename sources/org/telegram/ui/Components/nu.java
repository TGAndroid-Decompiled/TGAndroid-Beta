package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;
public final class nu extends os {
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final ou Q;

    public nu(ou ouVar) {
        this.Q = ouVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z10;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z11 = true;
        if (arrayList.size() > 3 && org.telegram.messenger.gz.o() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i11 = 0; i11 < this.O.size(); i11++) {
                pu puVar = (pu) this.O.get(i11);
                if (puVar.f38412e != 0.0f || puVar.d != null || puVar.getTranslationX() != 0.0f || puVar.getTranslationY() != 0.0f || puVar.getAlpha() != 1.0f) {
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
                pu puVar = (pu) arrayList.get(i7);
                puVar.f38410b.h(canvas, puVar.f38409a[this.L]);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        g5 g5Var;
        if (this.O != null) {
            for (int i7 = 0; i7 < this.O.size(); i7++) {
                pu puVar = (pu) this.O.get(i7);
                p5 p5Var = puVar.f38411c;
                if (p5Var != null && (g5Var = (g5) this.Q.E.f41446m1.get(p5Var.getDocumentId())) != null && g5Var.f34809k != null && puVar.f38410b != null) {
                    g5Var.setAlpha((int) (puVar.getAlpha() * 255.0f * f10));
                    float width = ((puVar.getWidth() - puVar.getPaddingLeft()) - puVar.getPaddingRight()) / 2.0f;
                    float height = ((puVar.getHeight() - puVar.getPaddingTop()) - puVar.getPaddingBottom()) / 2.0f;
                    float right = (puVar.getRight() + puVar.getLeft()) / 2.0f;
                    float paddingTop = puVar.getPaddingTop() + height;
                    float f11 = puVar.f38412e;
                    float f12 = 1.0f;
                    if (f11 != 0.0f) {
                        f12 = 1.0f * (((1.0f - f11) * 0.2f) + 0.8f);
                    }
                    g5Var.setBounds((int) (right - ((puVar.getScaleX() * width) * f12)), (int) (paddingTop - ((puVar.getScaleY() * height) * f12)), (int) ((puVar.getScaleX() * width * f12) + right), (int) ((puVar.getScaleY() * height * f12) + paddingTop));
                    g5Var.draw(canvas);
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
                ((pu) arrayList.get(i7)).f38409a[this.L].a();
                i7++;
            } else {
                wu wuVar = this.Q.E;
                Pattern pattern = wu.Q1;
                wuVar.f29682b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        g5 g5Var;
        wu wuVar = this.Q.E;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            pu puVar = (pu) this.O.get(i7);
            p5 p5Var = puVar.f38411c;
            org.telegram.messenger.hc[] hcVarArr = puVar.f38409a;
            if (p5Var != null && (g5Var = (g5) wuVar.f41446m1.get(p5Var.getDocumentId())) != null && g5Var.f34809k != null) {
                g5Var.s(j3);
                fi.u2 u2Var = g5Var.f34809k;
                int i10 = this.L;
                org.telegram.messenger.hc e02 = u2Var.e0(hcVarArr[i10], i10);
                hcVarArr[i10] = e02;
                e02.f24080c = j3;
                g5Var.setAlpha(255);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(puVar.getPaddingLeft() + puVar.getLeft(), puVar.getPaddingTop(), puVar.getRight() - puVar.getPaddingRight(), puVar.getMeasuredHeight() - puVar.getPaddingBottom());
                hcVarArr[i10].b(rect);
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, wuVar.J0);
                if (w02 != wuVar.P1 || wuVar.O1 == null) {
                    wuVar.P1 = w02;
                    wuVar.O1 = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                g5Var.setColorFilter(wuVar.O1);
                puVar.f38410b = g5Var.f34809k;
                arrayList.add(puVar);
            }
        }
    }
}
