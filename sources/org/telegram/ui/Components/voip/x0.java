package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Cells.w9;
public final class x0 {
    public final l2.e f39704a;
    public final l2.e f39705b;
    public l2.e f39706c;
    public l2.e d;
    public boolean f39707e;
    public int f39708f;
    public int f39709g;
    public int h;
    public boolean f39710i;
    public final Paint f39711j;
    public final Paint f39712k;
    public final Paint f39713l;
    public final ArrayList f39714m;

    public x0() {
        l2.e eVar = new l2.e(80, 80);
        this.f39704a = eVar;
        l2.e eVar2 = new l2.e(80, 80);
        this.f39705b = eVar2;
        this.f39708f = 0;
        this.f39709g = 0;
        Paint paint = new Paint(1);
        this.f39711j = paint;
        Paint paint2 = new Paint(1);
        this.f39712k = paint2;
        Paint paint3 = new Paint(1);
        this.f39713l = paint3;
        this.f39714m = new ArrayList();
        eVar2.m(0.0f, 0.0f, 80.0f, 80.0f);
        eVar.m(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) eVar2.f17689a).setAlpha(180);
    }

    public final void a(View view) {
        this.f39714m.add(view);
    }

    public final Paint b() {
        if (this.f39710i) {
            return this.f39712k;
        }
        return (Paint) this.f39705b.f17689a;
    }

    public final void c() {
        ArrayList arrayList = this.f39714m;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f10, float f11) {
        float f12 = this.f39709g * 1.12f;
        l2.e eVar = this.f39705b;
        float f13 = -f10;
        float f14 = -f11;
        eVar.o(f13 - ((f12 - this.f39708f) / 2.0f), f14 - ((f12 - this.f39709g) / 2.0f), f12 / ((Bitmap) eVar.f17691c).getHeight(), this.h);
        this.d.m(f13, f14, this.f39708f - f10, this.f39709g - f11);
    }

    public final void e(boolean z10) {
        if (this.f39710i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final x0 f39661b;

                {
                    this.f39661b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            x0 x0Var = this.f39661b;
                            x0Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i3 = (int) (35.0f * floatValue);
                            x0Var.f39713l.setAlpha(i3);
                            x0Var.f39712k.setAlpha((int) (floatValue * 102.0f));
                            x0Var.f39711j.setAlpha(i3);
                            x0Var.c();
                            return;
                        default:
                            x0 x0Var2 = this.f39661b;
                            x0Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) x0Var2.f39705b.f17689a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) x0Var2.f39704a.f17689a).setAlpha((int) (floatValue2 * 255.0f));
                            x0Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new w9(this, 14));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final x0 f39661b;

                {
                    this.f39661b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            x0 x0Var = this.f39661b;
                            x0Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i3 = (int) (35.0f * floatValue);
                            x0Var.f39713l.setAlpha(i3);
                            x0Var.f39712k.setAlpha((int) (floatValue * 102.0f));
                            x0Var.f39711j.setAlpha(i3);
                            x0Var.c();
                            return;
                        default:
                            x0 x0Var2 = this.f39661b;
                            x0Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) x0Var2.f39705b.f17689a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) x0Var2.f39704a.f17689a).setAlpha((int) (floatValue2 * 255.0f));
                            x0Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f39710i = z10;
        }
        c();
    }
}
