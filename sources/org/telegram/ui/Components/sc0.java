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
public final class sc0 extends FrameLayout {
    public final RectF f37923a;
    public boolean f37924b;
    public final Context f37925c;
    public final ad0 d;

    public sc0(ad0 ad0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = ad0Var;
        this.f37925c = activity2;
        this.f37923a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        ad0 ad0Var = this.d;
        Paint paint = ad0Var.f31833u1;
        int i7 = ad0Var.f31834v1 - ad0Var.f28704s0;
        int L = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight() + ad0Var.f28704s0;
        float L2 = org.telegram.messenger.g0.L(12.0f);
        int i10 = ad0Var.f28704s0;
        if (i7 + i10 < L2) {
            f10 = 1.0f - Math.min(1.0f, ((L2 - i7) - i10) / L2);
        } else {
            f10 = 1.0f;
        }
        int i11 = org.telegram.messenger.g0.f22561m;
        int i12 = i7 + i11;
        ad0Var.f28702r0.setBounds(0, i12, getMeasuredWidth(), L - i11);
        ad0Var.f28702r0.draw(canvas);
        if (f10 != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, ad0Var.I0));
            int i13 = ad0Var.f28704s0 + i12;
            RectF rectF = this.f37923a;
            rectF.set(ad0Var.f28705t0, ad0Var.f28704s0 + i12, getMeasuredWidth() - ad0Var.f28705t0, org.telegram.messenger.g0.L(24.0f) + i13);
            float f11 = L2 * f10;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, ad0Var.I0);
        paint.setColor(Color.argb((int) (ad0Var.f31827o1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(ad0Var.f28705t0, 0.0f, getMeasuredWidth() - ad0Var.f28705t0, org.telegram.messenger.g0.f22561m, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ad0 ad0Var = this.d;
            if (ad0Var.f31834v1 != 0 && motionEvent.getY() < ad0Var.f31834v1 && ad0Var.f31827o1.getAlpha() == 0.0f) {
                ad0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        ad0 ad0Var = this.d;
        ad0Var.f31832t1 = true;
        super.onLayout(z9, i7, i10, i11, i12);
        ad0Var.f31832t1 = false;
        ad0Var.J0(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        this.f37924b = true;
        ad0 ad0Var = this.d;
        tc0 tc0Var = ad0Var.f31826m1;
        int i12 = ad0Var.f28705t0;
        setPadding(i12, org.telegram.messenger.g0.f22561m, i12, 0);
        this.f37924b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i7);
        ((FrameLayout.LayoutParams) ad0Var.f31828p1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.f37924b = true;
        int L = org.telegram.messenger.g0.L(80.0f);
        m mVar = ad0Var.l1;
        int i13 = ((ad0) mVar.f35778a).f31837y1;
        for (int i14 = 0; i14 < i13; i14++) {
            ViewGroup t6 = mVar.t(this.f37925c, i14);
            t6.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += t6.getMeasuredHeight();
        }
        if (L < paddingTop) {
            i11 = paddingTop - L;
        } else {
            i11 = paddingTop / 5;
        }
        if (tc0Var.getPaddingTop() != i11) {
            tc0Var.getPaddingTop();
            tc0Var.setPadding(0, i11, 0, 0);
        }
        this.f37924b = false;
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
        if (this.f37924b) {
            return;
        }
        super.requestLayout();
    }
}
