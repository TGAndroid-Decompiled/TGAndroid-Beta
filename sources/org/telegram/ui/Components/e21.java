package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class e21 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final Path f33146a;
    public final Paint f33147b;
    public Boolean f33148c;
    public final k21 d;

    public e21(k21 k21Var, Context context) {
        super(context);
        this.d = k21Var;
        this.f33146a = new Path();
        Paint paint = new Paint(1);
        this.f33147b = paint;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, k21Var.I0));
        org.telegram.ui.ActionBar.m6.n(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        int w10;
        k21 k21Var = this.d;
        boolean z10 = true;
        float L0 = k21Var.L0(true);
        float W1 = org.telegram.messenger.g0.W1(c8.j9.a(L0 / org.telegram.messenger.g0.N(24.0f), 0.0f, 1.0f), 0, org.telegram.messenger.g0.L(12.0f));
        k21Var.f35155w1.setTranslationY(Math.max(org.telegram.messenger.g0.f22561m, L0));
        if (L0 <= org.telegram.messenger.g0.f22561m / 2.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f33148c;
        if (bool == null || bool.booleanValue() != z9) {
            this.f33148c = Boolean.valueOf(z9);
            Window window = k21Var.getWindow();
            if (z9) {
                w10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, k21Var.I0);
            } else {
                w10 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28170s8, k21Var.I0), 855638016);
            }
            if (org.telegram.messenger.g0.B(w10) <= 0.721f) {
                z10 = false;
            }
            org.telegram.messenger.g0.s3(window, z10);
        }
        FrameLayout frameLayout = k21Var.E;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - k21Var.E.getHeight());
        int i7 = org.telegram.messenger.g0.f22561m;
        frameLayout.setTranslationY(Math.max(k21Var.E.getHeight() + org.telegram.messenger.g0.L(56.0f) + i7, L0) + translationY);
        Path path = this.f33146a;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, L0, getWidth(), getHeight() + W1);
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, this.f33147b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k21 k21Var = this.d;
        if (k21Var.I1 != null && k21Var.J1 != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + k21Var.I1.x());
            }
            if (k21Var.I1.x() && k21Var.J1.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = k21Var.J1.b(motionEvent);
            if (motionEvent.getAction() == 1) {
                Log.d("TA2", "checkOnTap=" + b10);
            }
            if (b10) {
                motionEvent.setAction(3);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new fi.r7(9));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        k21 k21Var = this.d;
        FrameLayout frameLayout = k21Var.E;
        frameLayout.setTranslationY(Math.max(k21Var.E.getHeight() + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22561m, k21Var.L0(true)) + ((-frameLayout.getTop()) - k21Var.E.getHeight()) + f10);
    }

    @Override
    public final void updateColors() {
        try {
            this.f33147b.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.d.I0));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
