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
public final class nc0 extends FrameLayout {
    public final RectF f36446a;
    public boolean f36447b;
    public final Context f36448c;
    public final vc0 d;

    public nc0(vc0 vc0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = vc0Var;
        this.f36448c = activity2;
        this.f36446a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        vc0 vc0Var = this.d;
        Paint paint = vc0Var.f39073s1;
        int i3 = vc0Var.f39074t1 - vc0Var.f28617t0;
        int L = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight() + vc0Var.f28617t0;
        float L2 = org.telegram.messenger.g0.L(12.0f);
        int i10 = vc0Var.f28617t0;
        if (i3 + i10 < L2) {
            f10 = 1.0f - Math.min(1.0f, ((L2 - i3) - i10) / L2);
        } else {
            f10 = 1.0f;
        }
        int i11 = org.telegram.messenger.g0.f22602m;
        int i12 = i3 + i11;
        vc0Var.f28616s0.setBounds(0, i12, getMeasuredWidth(), L - i11);
        vc0Var.f28616s0.draw(canvas);
        if (f10 != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, vc0Var.J0));
            int i13 = vc0Var.f28617t0 + i12;
            RectF rectF = this.f36446a;
            rectF.set(vc0Var.f28618u0, vc0Var.f28617t0 + i12, getMeasuredWidth() - vc0Var.f28618u0, org.telegram.messenger.g0.L(24.0f) + i13);
            float f11 = L2 * f10;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, vc0Var.J0);
        paint.setColor(Color.argb((int) (vc0Var.m1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(vc0Var.f28618u0, 0.0f, getMeasuredWidth() - vc0Var.f28618u0, org.telegram.messenger.g0.f22602m, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            vc0 vc0Var = this.d;
            if (vc0Var.f39074t1 != 0 && motionEvent.getY() < vc0Var.f39074t1 && vc0Var.m1.getAlpha() == 0.0f) {
                vc0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        vc0 vc0Var = this.d;
        vc0Var.f39072r1 = true;
        super.onLayout(z10, i3, i10, i11, i12);
        vc0Var.f39072r1 = false;
        vc0Var.J0(false);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        this.f36447b = true;
        vc0 vc0Var = this.d;
        oc0 oc0Var = vc0Var.k1;
        int i12 = vc0Var.f28618u0;
        setPadding(i12, org.telegram.messenger.g0.f22602m, i12, 0);
        this.f36447b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i3);
        ((FrameLayout.LayoutParams) vc0Var.f39068n1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f36447b = true;
        int L = org.telegram.messenger.g0.L(80.0f);
        nh nhVar = vc0Var.f39066j1;
        int i13 = ((vc0) nhVar.f36540b).f39077w1;
        for (int i14 = 0; i14 < i13; i14++) {
            ViewGroup z10 = nhVar.z(this.f36448c, i14);
            z10.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += z10.getMeasuredHeight();
        }
        if (L < paddingTop) {
            i11 = paddingTop - L;
        } else {
            i11 = paddingTop / 5;
        }
        if (oc0Var.getPaddingTop() != i11) {
            oc0Var.getPaddingTop();
            oc0Var.setPadding(0, i11, 0, 0);
        }
        this.f36447b = false;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
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
        if (this.f36447b) {
            return;
        }
        super.requestLayout();
    }
}
