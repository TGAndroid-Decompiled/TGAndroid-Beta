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
public final class ed0 extends FrameLayout {
    public final RectF f34737a;
    public boolean f34738b;
    public final Context f34739c;
    public final md0 d;

    public ed0(md0 md0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = md0Var;
        this.f34739c = activity2;
        this.f34737a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        md0 md0Var = this.d;
        Paint paint = md0Var.f37494v1;
        int i7 = md0Var.f37495w1 - md0Var.f30210t0;
        int L = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight() + md0Var.f30210t0;
        float L2 = org.telegram.messenger.g0.L(12.0f);
        int i10 = md0Var.f30210t0;
        if (i7 + i10 < L2) {
            f10 = 1.0f - Math.min(1.0f, ((L2 - i7) - i10) / L2);
        } else {
            f10 = 1.0f;
        }
        int i11 = org.telegram.messenger.g0.f24040m;
        int i12 = i7 + i11;
        md0Var.f30209s0.setBounds(0, i12, getMeasuredWidth(), L - i11);
        md0Var.f30209s0.draw(canvas);
        if (f10 != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, md0Var.J0));
            int i13 = md0Var.f30210t0 + i12;
            RectF rectF = this.f34737a;
            rectF.set(md0Var.f30211u0, md0Var.f30210t0 + i12, getMeasuredWidth() - md0Var.f30211u0, org.telegram.messenger.g0.L(24.0f) + i13);
            float f11 = L2 * f10;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, md0Var.J0);
        paint.setColor(Color.argb((int) (md0Var.f37488p1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(md0Var.f30211u0, 0.0f, getMeasuredWidth() - md0Var.f30211u0, org.telegram.messenger.g0.f24040m, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            md0 md0Var = this.d;
            if (md0Var.f37495w1 != 0 && motionEvent.getY() < md0Var.f37495w1 && md0Var.f37488p1.getAlpha() == 0.0f) {
                md0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        md0 md0Var = this.d;
        md0Var.f37493u1 = true;
        super.onLayout(z10, i7, i10, i11, i12);
        md0Var.f37493u1 = false;
        md0Var.K0(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        this.f34738b = true;
        md0 md0Var = this.d;
        fd0 fd0Var = md0Var.n1;
        int i12 = md0Var.f30211u0;
        setPadding(i12, org.telegram.messenger.g0.f24040m, i12, 0);
        this.f34738b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i7);
        ((FrameLayout.LayoutParams) md0Var.f37489q1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f34738b = true;
        int L = org.telegram.messenger.g0.L(80.0f);
        org.telegram.ui.Cells.c5 c5Var = md0Var.f37486m1;
        int i13 = ((md0) c5Var.f30508a).f37498z1;
        for (int i14 = 0; i14 < i13; i14++) {
            ViewGroup u10 = c5Var.u(this.f34739c, i14);
            u10.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += u10.getMeasuredHeight();
        }
        if (L < paddingTop) {
            i11 = paddingTop - L;
        } else {
            i11 = paddingTop / 5;
        }
        if (fd0Var.getPaddingTop() != i11) {
            fd0Var.getPaddingTop();
            fd0Var.setPadding(0, i11, 0, 0);
        }
        this.f34738b = false;
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
        if (this.f34738b) {
            return;
        }
        super.requestLayout();
    }
}
