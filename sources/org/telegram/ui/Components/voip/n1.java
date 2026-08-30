package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.f91;
public final class n1 {
    public final a9.a f29796a;
    public final a9.a f29797b;
    public a9.a f29798c;
    public a9.a d;
    public boolean e;
    public int f29799f;
    public int f29800g;
    public int h;
    public boolean f29801i;
    public final Paint f29802j;
    public final Paint f29803k;
    public final Paint f29804l;
    public final ArrayList f29805m;

    public n1() {
        a9.a aVar = new a9.a(80, 80);
        this.f29796a = aVar;
        a9.a aVar2 = new a9.a(80, 80);
        this.f29797b = aVar2;
        this.f29799f = 0;
        this.f29800g = 0;
        Paint paint = new Paint(1);
        this.f29802j = paint;
        Paint paint2 = new Paint(1);
        this.f29803k = paint2;
        Paint paint3 = new Paint(1);
        this.f29804l = paint3;
        this.f29805m = new ArrayList();
        aVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        aVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) aVar2.f143a).setAlpha(180);
    }

    public final void a(View view) {
        this.f29805m.add(view);
    }

    public final Paint b() {
        if (this.f29801i) {
            return this.f29803k;
        }
        return (Paint) this.f29797b.f143a;
    }

    public final void c() {
        ArrayList arrayList = this.f29805m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f10, float f11) {
        float f12 = this.f29800g * 1.12f;
        a9.a aVar = this.f29797b;
        float f13 = -f10;
        float f14 = -f11;
        aVar.z(f13 - ((f12 - this.f29799f) / 2.0f), f14 - ((f12 - this.f29800g) / 2.0f), f12 / ((Bitmap) aVar.f145c).getHeight(), this.h);
        this.d.w(f13, f14, this.f29799f - f10, this.f29800g - f11);
    }

    public final void e(boolean z4) {
        if (this.f29801i && !z4) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final n1 f29771b;

                {
                    this.f29771b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            n1 n1Var = this.f29771b;
                            n1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            n1Var.f29804l.setAlpha(i10);
                            n1Var.f29803k.setAlpha((int) (floatValue * 102.0f));
                            n1Var.f29802j.setAlpha(i10);
                            n1Var.c();
                            return;
                        default:
                            n1 n1Var2 = this.f29771b;
                            n1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) n1Var2.f29797b.f143a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) n1Var2.f29796a.f143a).setAlpha((int) (floatValue2 * 255.0f));
                            n1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new f91(this, 5));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final n1 f29771b;

                {
                    this.f29771b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            n1 n1Var = this.f29771b;
                            n1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            n1Var.f29804l.setAlpha(i10);
                            n1Var.f29803k.setAlpha((int) (floatValue * 102.0f));
                            n1Var.f29802j.setAlpha(i10);
                            n1Var.c();
                            return;
                        default:
                            n1 n1Var2 = this.f29771b;
                            n1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) n1Var2.f29797b.f143a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) n1Var2.f29796a.f143a).setAlpha((int) (floatValue2 * 255.0f));
                            n1Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f29801i = z4;
        }
        c();
    }
}
