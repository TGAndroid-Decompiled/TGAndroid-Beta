package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.g91;
public final class o1 {
    public final a9.a f32227a;
    public final a9.a f32228b;
    public a9.a f32229c;
    public a9.a d;
    public boolean f32230e;
    public int f32231f;
    public int f32232g;
    public int h;
    public boolean f32233i;
    public final Paint f32234j;
    public final Paint f32235k;
    public final Paint f32236l;
    public final ArrayList f32237m;

    public o1() {
        a9.a aVar = new a9.a(80, 80);
        this.f32227a = aVar;
        a9.a aVar2 = new a9.a(80, 80);
        this.f32228b = aVar2;
        this.f32231f = 0;
        this.f32232g = 0;
        Paint paint = new Paint(1);
        this.f32234j = paint;
        Paint paint2 = new Paint(1);
        this.f32235k = paint2;
        Paint paint3 = new Paint(1);
        this.f32236l = paint3;
        this.f32237m = new ArrayList();
        aVar2.x(0.0f, 0.0f, 80.0f, 80.0f);
        aVar.x(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) aVar2.f155a).setAlpha(180);
    }

    public final void a(View view) {
        this.f32237m.add(view);
    }

    public final Paint b() {
        if (this.f32233i) {
            return this.f32235k;
        }
        return (Paint) this.f32228b.f155a;
    }

    public final void c() {
        ArrayList arrayList = this.f32237m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f10, float f11) {
        float f12 = this.f32232g * 1.12f;
        a9.a aVar = this.f32228b;
        float f13 = -f10;
        float f14 = -f11;
        aVar.z(f13 - ((f12 - this.f32231f) / 2.0f), f14 - ((f12 - this.f32232g) / 2.0f), f12 / ((Bitmap) aVar.f157c).getHeight(), this.h);
        this.d.x(f13, f14, this.f32231f - f10, this.f32232g - f11);
    }

    public final void e(boolean z4) {
        if (this.f32233i && !z4) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f32200b;

                {
                    this.f32200b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f32200b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f32236l.setAlpha(i10);
                            o1Var.f32235k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f32234j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f32200b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f32228b.f155a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f32227a.f155a).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new g91(this, 5));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f32200b;

                {
                    this.f32200b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f32200b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f32236l.setAlpha(i10);
                            o1Var.f32235k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f32234j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f32200b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f32228b.f155a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f32227a.f155a).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f32233i = z4;
        }
        c();
    }
}
