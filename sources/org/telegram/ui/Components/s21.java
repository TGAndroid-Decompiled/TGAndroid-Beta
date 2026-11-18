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
public final class s21 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final Path f39463a;
    public final Paint f39464b;
    public Boolean f39465c;
    public final y21 d;

    public s21(y21 y21Var, Context context) {
        super(context);
        this.d = y21Var;
        this.f39463a = new Path();
        Paint paint = new Paint(1);
        this.f39464b = paint;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, y21Var.J0));
        org.telegram.ui.ActionBar.n6.n(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int w10;
        y21 y21Var = this.d;
        boolean z11 = true;
        float M0 = y21Var.M0(true);
        float W1 = org.telegram.messenger.g0.W1(c8.l9.a(M0 / org.telegram.messenger.g0.N(24.0f), 0.0f, 1.0f), 0, org.telegram.messenger.g0.L(12.0f));
        y21Var.f42284x1.setTranslationY(Math.max(org.telegram.messenger.g0.f24112m, M0));
        if (M0 <= org.telegram.messenger.g0.f24112m / 2.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f39465c;
        if (bool == null || bool.booleanValue() != z10) {
            this.f39465c = Boolean.valueOf(z10);
            Window window = y21Var.getWindow();
            if (z10) {
                w10 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, y21Var.J0);
            } else {
                w10 = org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29674s8, y21Var.J0), 855638016);
            }
            if (org.telegram.messenger.g0.B(w10) <= 0.721f) {
                z11 = false;
            }
            org.telegram.messenger.g0.r3(window, z11);
        }
        FrameLayout frameLayout = y21Var.F;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - y21Var.F.getHeight());
        int i7 = org.telegram.messenger.g0.f24112m;
        frameLayout.setTranslationY(Math.max(y21Var.F.getHeight() + org.telegram.messenger.g0.L(56.0f) + i7, M0) + translationY);
        Path path = this.f39463a;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, M0, getWidth(), getHeight() + W1);
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, this.f39464b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        y21 y21Var = this.d;
        if (y21Var.J1 != null && y21Var.K1 != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + y21Var.J1.x());
            }
            if (y21Var.J1.x() && y21Var.K1.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = y21Var.K1.b(motionEvent);
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
        setTag(2131296351, new bi.t(10));
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
        y21 y21Var = this.d;
        FrameLayout frameLayout = y21Var.F;
        frameLayout.setTranslationY(Math.max(y21Var.F.getHeight() + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f24112m, y21Var.M0(true)) + ((-frameLayout.getTop()) - y21Var.F.getHeight()) + f10);
    }

    @Override
    public final void updateColors() {
        try {
            this.f39464b.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, this.d.J0));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
