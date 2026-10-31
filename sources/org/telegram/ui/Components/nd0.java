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
public final class nd0 extends FrameLayout {
    public final RectF f28768a;
    public boolean f28769b;
    public final Context f28770c;
    public final vd0 d;

    public nd0(vd0 vd0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = vd0Var;
        this.f28770c = activity2;
        this.f28768a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        vd0 vd0Var = this.d;
        Paint paint = vd0Var.f31224r1;
        int i10 = vd0Var.f31225s1 - vd0Var.f21614s0;
        int L = org.telegram.messenger.i0.L(30.0f) + getMeasuredHeight() + vd0Var.f21614s0;
        float L2 = org.telegram.messenger.i0.L(12.0f);
        int i11 = vd0Var.f21614s0;
        if (i10 + i11 < L2) {
            f7 = 1.0f - Math.min(1.0f, ((L2 - i10) - i11) / L2);
        } else {
            f7 = 1.0f;
        }
        int i12 = org.telegram.messenger.i0.f16020m;
        int i13 = i10 + i12;
        vd0Var.f21612r0.setBounds(0, i13, getMeasuredWidth(), L - i12);
        vd0Var.f21612r0.draw(canvas);
        if (f7 != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, vd0Var.I0));
            int i14 = vd0Var.f21614s0 + i13;
            RectF rectF = this.f28768a;
            rectF.set(vd0Var.f21615t0, vd0Var.f21614s0 + i13, getMeasuredWidth() - vd0Var.f21615t0, org.telegram.messenger.i0.L(24.0f) + i14);
            float f10 = L2 * f7;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, vd0Var.I0);
        paint.setColor(Color.argb((int) (vd0Var.l1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(vd0Var.f21615t0, 0.0f, getMeasuredWidth() - vd0Var.f21615t0, org.telegram.messenger.i0.f16020m, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            vd0 vd0Var = this.d;
            if (vd0Var.f31225s1 != 0 && motionEvent.getY() < vd0Var.f31225s1 && vd0Var.l1.getAlpha() == 0.0f) {
                vd0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vd0 vd0Var = this.d;
        vd0Var.f31223q1 = true;
        super.onLayout(z10, i10, i11, i12, i13);
        vd0Var.f31223q1 = false;
        vd0Var.J0(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        this.f28769b = true;
        vd0 vd0Var = this.d;
        od0 od0Var = vd0Var.f31217j1;
        int i13 = vd0Var.f21615t0;
        setPadding(i13, org.telegram.messenger.i0.f16020m, i13, 0);
        this.f28769b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i10);
        ((FrameLayout.LayoutParams) vd0Var.f31219m1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.f28769b = true;
        int L = org.telegram.messenger.i0.L(80.0f);
        m2.t tVar = vd0Var.f31216i1;
        int i14 = ((vd0) tVar.f12684b).f31228v1;
        for (int i15 = 0; i15 < i14; i15++) {
            ViewGroup v = tVar.v(this.f28770c, i15);
            v.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += v.getMeasuredHeight();
        }
        if (L < paddingTop) {
            i12 = paddingTop - L;
        } else {
            i12 = paddingTop / 5;
        }
        if (od0Var.getPaddingTop() != i12) {
            od0Var.getPaddingTop();
            od0Var.setPadding(0, i12, 0, 0);
        }
        this.f28769b = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
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
        if (this.f28769b) {
            return;
        }
        super.requestLayout();
    }
}
