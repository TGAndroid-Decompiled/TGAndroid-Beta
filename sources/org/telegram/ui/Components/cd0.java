package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class cd0 extends FrameLayout {
    public final RectF f34026a;
    public boolean f34027b;
    public final Context f34028c;
    public final kd0 d;

    public cd0(kd0 kd0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = kd0Var;
        this.f34028c = activity2;
        this.f34026a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        kd0 kd0Var = this.d;
        Paint paint = kd0Var.f36713v1;
        int i7 = kd0Var.f36714w1 - kd0Var.f30260t0;
        int L = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight() + kd0Var.f30260t0;
        float L2 = org.telegram.messenger.g0.L(12.0f);
        int i10 = kd0Var.f30260t0;
        if (i7 + i10 < L2) {
            f10 = 1.0f - Math.min(1.0f, ((L2 - i7) - i10) / L2);
        } else {
            f10 = 1.0f;
        }
        int i11 = org.telegram.messenger.g0.f24220m;
        int i12 = i7 + i11;
        kd0Var.f30259s0.setBounds(0, i12, getMeasuredWidth(), L - i11);
        kd0Var.f30259s0.draw(canvas);
        if (f10 != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, kd0Var.J0));
            int i13 = kd0Var.f30260t0 + i12;
            RectF rectF = this.f34026a;
            rectF.set(kd0Var.f30261u0, kd0Var.f30260t0 + i12, getMeasuredWidth() - kd0Var.f30261u0, org.telegram.messenger.g0.L(24.0f) + i13);
            float f11 = L2 * f10;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, kd0Var.J0);
        paint.setColor(Color.argb((int) (kd0Var.f36707p1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(kd0Var.f30261u0, 0.0f, getMeasuredWidth() - kd0Var.f30261u0, org.telegram.messenger.g0.f24220m, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            kd0 kd0Var = this.d;
            if (kd0Var.f36714w1 != 0 && motionEvent.getY() < kd0Var.f36714w1 && kd0Var.f36707p1.getAlpha() == 0.0f) {
                kd0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        kd0 kd0Var = this.d;
        kd0Var.f36712u1 = true;
        super.onLayout(z10, i7, i10, i11, i12);
        kd0Var.f36712u1 = false;
        kd0Var.K0(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        this.f34027b = true;
        kd0 kd0Var = this.d;
        dd0 dd0Var = kd0Var.n1;
        int i12 = kd0Var.f30261u0;
        setPadding(i12, org.telegram.messenger.g0.f24220m, i12, 0);
        this.f34027b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i7);
        ((FrameLayout.LayoutParams) kd0Var.f36708q1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f34027b = true;
        int L = org.telegram.messenger.g0.L(80.0f);
        org.telegram.ui.ActionBar.i5 i5Var = kd0Var.f36705m1;
        int i13 = ((kd0) i5Var.f29095a).f36717z1;
        for (int i14 = 0; i14 < i13; i14++) {
            ViewGroup D = i5Var.D(this.f34028c, i14);
            D.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += D.getMeasuredHeight();
        }
        if (L < paddingTop) {
            i11 = paddingTop - L;
        } else {
            i11 = paddingTop / 5;
        }
        if (dd0Var.getPaddingTop() != i11) {
            dd0Var.getPaddingTop();
            dd0Var.setPadding(0, i11, 0, 0);
        }
        this.f34027b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f34027b) {
            return;
        }
        super.requestLayout();
    }
}
