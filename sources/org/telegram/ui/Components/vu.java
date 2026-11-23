package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;
public final class vu extends xs {
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final wu Q;

    public vu(wu wuVar) {
        this.Q = wuVar;
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
                xu xuVar = (xu) this.O.get(i11);
                if (xuVar.f42221e != 0.0f || xuVar.d != null || xuVar.getTranslationX() != 0.0f || xuVar.getTranslationY() != 0.0f || xuVar.getAlpha() != 1.0f) {
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
                xu xuVar = (xu) arrayList.get(i7);
                xuVar.f42219b.h(canvas, xuVar.f42218a[this.L]);
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
                xu xuVar = (xu) this.O.get(i7);
                y5 y5Var = xuVar.f42220c;
                if (y5Var != null && (p5Var = (p5) this.Q.E.f34990m1.get(y5Var.getDocumentId())) != null && p5Var.f38499k != null && xuVar.f42219b != null) {
                    p5Var.setAlpha((int) (xuVar.getAlpha() * 255.0f * f10));
                    float width = ((xuVar.getWidth() - xuVar.getPaddingLeft()) - xuVar.getPaddingRight()) / 2.0f;
                    float height = ((xuVar.getHeight() - xuVar.getPaddingTop()) - xuVar.getPaddingBottom()) / 2.0f;
                    float right = (xuVar.getRight() + xuVar.getLeft()) / 2.0f;
                    float paddingTop = xuVar.getPaddingTop() + height;
                    float f11 = xuVar.f42221e;
                    float f12 = 1.0f;
                    if (f11 != 0.0f) {
                        f12 = 1.0f * (((1.0f - f11) * 0.2f) + 0.8f);
                    }
                    p5Var.setBounds((int) (right - ((xuVar.getScaleX() * width) * f12)), (int) (paddingTop - ((xuVar.getScaleY() * height) * f12)), (int) ((xuVar.getScaleX() * width * f12) + right), (int) ((xuVar.getScaleY() * height * f12) + paddingTop));
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
                ((xu) arrayList.get(i7)).f42218a[this.L].a();
                i7++;
            } else {
                ev evVar = this.Q.E;
                Pattern pattern = ev.Q1;
                evVar.f30176b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        p5 p5Var;
        ev evVar = this.Q.E;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            xu xuVar = (xu) this.O.get(i7);
            y5 y5Var = xuVar.f42220c;
            org.telegram.messenger.hc[] hcVarArr = xuVar.f42218a;
            if (y5Var != null && (p5Var = (p5) evVar.f34990m1.get(y5Var.getDocumentId())) != null && p5Var.f38499k != null) {
                p5Var.s(j3);
                fi.s2 s2Var = p5Var.f38499k;
                int i10 = this.L;
                org.telegram.messenger.hc e02 = s2Var.e0(hcVarArr[i10], i10);
                hcVarArr[i10] = e02;
                e02.f24423c = j3;
                p5Var.setAlpha(255);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(xuVar.getPaddingLeft() + xuVar.getLeft(), xuVar.getPaddingTop(), xuVar.getRight() - xuVar.getPaddingRight(), xuVar.getMeasuredHeight() - xuVar.getPaddingBottom());
                hcVarArr[i10].b(rect);
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, evVar.J0);
                if (w02 != evVar.P1 || evVar.O1 == null) {
                    evVar.P1 = w02;
                    evVar.O1 = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                p5Var.setColorFilter(evVar.O1);
                xuVar.f42219b = p5Var.f38499k;
                arrayList.add(xuVar);
            }
        }
    }
}
