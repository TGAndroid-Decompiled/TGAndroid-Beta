package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;
public final class iu extends is {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final ju P;

    public iu(ju juVar) {
        this.P = juVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z9;
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        if (arrayList.size() > 3 && org.telegram.messenger.iz.o() != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            for (int i11 = 0; i11 < this.N.size(); i11++) {
                ku kuVar = (ku) this.N.get(i11);
                if (kuVar.f35487e != 0.0f || kuVar.d != null || kuVar.getTranslationX() != 0.0f || kuVar.getTranslationY() != 0.0f || kuVar.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z9;
        if (z10) {
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
            ArrayList arrayList = this.O;
            if (i7 < arrayList.size()) {
                ku kuVar = (ku) arrayList.get(i7);
                kuVar.f35485b.h(canvas, kuVar.f35484a[this.K]);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        i5 i5Var;
        if (this.N != null) {
            for (int i7 = 0; i7 < this.N.size(); i7++) {
                ku kuVar = (ku) this.N.get(i7);
                r5 r5Var = kuVar.f35486c;
                if (r5Var != null && (i5Var = (i5) this.P.D.f37806i1.get(r5Var.getDocumentId())) != null && i5Var.f34568k != null && kuVar.f35485b != null) {
                    i5Var.setAlpha((int) (kuVar.getAlpha() * 255.0f * f10));
                    float width = ((kuVar.getWidth() - kuVar.getPaddingLeft()) - kuVar.getPaddingRight()) / 2.0f;
                    float height = ((kuVar.getHeight() - kuVar.getPaddingTop()) - kuVar.getPaddingBottom()) / 2.0f;
                    float right = (kuVar.getRight() + kuVar.getLeft()) / 2.0f;
                    float paddingTop = kuVar.getPaddingTop() + height;
                    float f11 = kuVar.f35487e;
                    float f12 = 1.0f;
                    if (f11 != 0.0f) {
                        f12 = 1.0f * (((1.0f - f11) * 0.2f) + 0.8f);
                    }
                    i5Var.setBounds((int) (right - ((kuVar.getScaleX() * width) * f12)), (int) (paddingTop - ((kuVar.getScaleY() * height) * f12)), (int) ((kuVar.getScaleX() * width * f12) + right), (int) ((kuVar.getScaleY() * height * f12) + paddingTop));
                    i5Var.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i7 < arrayList.size()) {
                ((ku) arrayList.get(i7)).f35484a[this.K].a();
                i7++;
            } else {
                ru ruVar = this.P.D;
                Pattern pattern = ru.M1;
                ruVar.f28624b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        i5 i5Var;
        ru ruVar = this.P.D;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i7 = 0; i7 < this.N.size(); i7++) {
            ku kuVar = (ku) this.N.get(i7);
            r5 r5Var = kuVar.f35486c;
            org.telegram.messenger.ic[] icVarArr = kuVar.f35484a;
            if (r5Var != null && (i5Var = (i5) ruVar.f37806i1.get(r5Var.getDocumentId())) != null && i5Var.f34568k != null) {
                i5Var.s(j3);
                di.z2 z2Var = i5Var.f34568k;
                int i10 = this.K;
                org.telegram.messenger.ic e02 = z2Var.e0(icVarArr[i10], i10);
                icVarArr[i10] = e02;
                e02.f23136c = j3;
                i5Var.setAlpha(255);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(kuVar.getPaddingLeft() + kuVar.getLeft(), kuVar.getPaddingTop(), kuVar.getRight() - kuVar.getPaddingRight(), kuVar.getMeasuredHeight() - kuVar.getPaddingBottom());
                icVarArr[i10].b(rect);
                int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, ruVar.I0);
                if (w02 != ruVar.L1 || ruVar.K1 == null) {
                    ruVar.L1 = w02;
                    ruVar.K1 = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                i5Var.setColorFilter(ruVar.K1);
                kuVar.f35485b = i5Var.f34568k;
                arrayList.add(kuVar);
            }
        }
    }
}
