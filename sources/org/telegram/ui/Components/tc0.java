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
public final class tc0 extends FrameLayout {
    public final RectF f39638a;
    public boolean f39639b;
    public final Context f39640c;
    public final bd0 d;

    public tc0(bd0 bd0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = bd0Var;
        this.f39640c = activity2;
        this.f39638a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        bd0 bd0Var = this.d;
        Paint paint = bd0Var.f33258v1;
        int i7 = bd0Var.f33259w1 - bd0Var.f29716t0;
        int L = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight() + bd0Var.f29716t0;
        float L2 = org.telegram.messenger.g0.L(12.0f);
        int i10 = bd0Var.f29716t0;
        if (i7 + i10 < L2) {
            f10 = 1.0f - Math.min(1.0f, ((L2 - i7) - i10) / L2);
        } else {
            f10 = 1.0f;
        }
        int i11 = org.telegram.messenger.g0.f23603m;
        int i12 = i7 + i11;
        bd0Var.f29715s0.setBounds(0, i12, getMeasuredWidth(), L - i11);
        bd0Var.f29715s0.draw(canvas);
        if (f10 != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, bd0Var.J0));
            int i13 = bd0Var.f29716t0 + i12;
            RectF rectF = this.f39638a;
            rectF.set(bd0Var.f29717u0, bd0Var.f29716t0 + i12, getMeasuredWidth() - bd0Var.f29717u0, org.telegram.messenger.g0.L(24.0f) + i13);
            float f11 = L2 * f10;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, bd0Var.J0);
        paint.setColor(Color.argb((int) (bd0Var.f33252p1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(bd0Var.f29717u0, 0.0f, getMeasuredWidth() - bd0Var.f29717u0, org.telegram.messenger.g0.f23603m, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            bd0 bd0Var = this.d;
            if (bd0Var.f33259w1 != 0 && motionEvent.getY() < bd0Var.f33259w1 && bd0Var.f33252p1.getAlpha() == 0.0f) {
                bd0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        bd0 bd0Var = this.d;
        bd0Var.f33257u1 = true;
        super.onLayout(z10, i7, i10, i11, i12);
        bd0Var.f33257u1 = false;
        bd0Var.J0(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        this.f39639b = true;
        bd0 bd0Var = this.d;
        uc0 uc0Var = bd0Var.n1;
        int i12 = bd0Var.f29717u0;
        setPadding(i12, org.telegram.messenger.g0.f23603m, i12, 0);
        this.f39639b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i7);
        ((FrameLayout.LayoutParams) bd0Var.f33253q1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f39639b = true;
        int L = org.telegram.messenger.g0.L(80.0f);
        cf cfVar = bd0Var.f33250m1;
        int i13 = ((bd0) cfVar.f33543a).f33262z1;
        for (int i14 = 0; i14 < i13; i14++) {
            ViewGroup n10 = cfVar.n(this.f39640c, i14);
            n10.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += n10.getMeasuredHeight();
        }
        if (L < paddingTop) {
            i11 = paddingTop - L;
        } else {
            i11 = paddingTop / 5;
        }
        if (uc0Var.getPaddingTop() != i11) {
            uc0Var.getPaddingTop();
            uc0Var.setPadding(0, i11, 0, 0);
        }
        this.f39639b = false;
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
        if (this.f39639b) {
            return;
        }
        super.requestLayout();
    }
}
