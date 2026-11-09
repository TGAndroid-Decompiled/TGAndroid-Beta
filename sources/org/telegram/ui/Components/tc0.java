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
    public final RectF f38349a;
    public boolean f38350b;
    public final Context f38351c;
    public final bd0 d;

    public tc0(bd0 bd0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = bd0Var;
        this.f38351c = activity2;
        this.f38349a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        bd0 bd0Var = this.d;
        Paint paint = bd0Var.f32227r1;
        int i7 = bd0Var.f32228s1 - bd0Var.f28653s0;
        int L = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight() + bd0Var.f28653s0;
        float L2 = org.telegram.messenger.g0.L(12.0f);
        int i10 = bd0Var.f28653s0;
        if (i7 + i10 < L2) {
            f10 = 1.0f - Math.min(1.0f, ((L2 - i7) - i10) / L2);
        } else {
            f10 = 1.0f;
        }
        int i11 = org.telegram.messenger.g0.f22557m;
        int i12 = i7 + i11;
        bd0Var.f28651r0.setBounds(0, i12, getMeasuredWidth(), L - i11);
        bd0Var.f28651r0.draw(canvas);
        if (f10 != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, bd0Var.I0));
            int i13 = bd0Var.f28653s0 + i12;
            RectF rectF = this.f38349a;
            rectF.set(bd0Var.f28654t0, bd0Var.f28653s0 + i12, getMeasuredWidth() - bd0Var.f28654t0, org.telegram.messenger.g0.L(24.0f) + i13);
            float f11 = L2 * f10;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, bd0Var.I0);
        paint.setColor(Color.argb((int) (bd0Var.l1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(bd0Var.f28654t0, 0.0f, getMeasuredWidth() - bd0Var.f28654t0, org.telegram.messenger.g0.f22557m, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            bd0 bd0Var = this.d;
            if (bd0Var.f32228s1 != 0 && motionEvent.getY() < bd0Var.f32228s1 && bd0Var.l1.getAlpha() == 0.0f) {
                bd0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        bd0 bd0Var = this.d;
        bd0Var.f32226q1 = true;
        super.onLayout(z9, i7, i10, i11, i12);
        bd0Var.f32226q1 = false;
        bd0Var.J0(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        this.f38350b = true;
        bd0 bd0Var = this.d;
        uc0 uc0Var = bd0Var.f32221j1;
        int i12 = bd0Var.f28654t0;
        setPadding(i12, org.telegram.messenger.g0.f22557m, i12, 0);
        this.f38350b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i7);
        ((FrameLayout.LayoutParams) bd0Var.f32223m1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f38350b = true;
        int L = org.telegram.messenger.g0.L(80.0f);
        n nVar = bd0Var.f32220i1;
        int i13 = ((bd0) nVar.f36185a).f32231v1;
        for (int i14 = 0; i14 < i13; i14++) {
            ViewGroup t6 = nVar.t(this.f38351c, i14);
            t6.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += t6.getMeasuredHeight();
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
        this.f38350b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f38350b) {
            return;
        }
        super.requestLayout();
    }
}
