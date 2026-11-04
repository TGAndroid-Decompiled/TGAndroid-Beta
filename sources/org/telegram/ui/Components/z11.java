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
public final class z11 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Path f40892a;
    public final Paint f40893b;
    public Boolean f40894c;
    public final f21 d;

    public z11(f21 f21Var, Context context) {
        super(context);
        this.d = f21Var;
        this.f40892a = new Path();
        Paint paint = new Paint(1);
        this.f40893b = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, f21Var.J0));
        org.telegram.ui.ActionBar.k6.n(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int w10;
        f21 f21Var = this.d;
        boolean z11 = true;
        float L0 = f21Var.L0(true);
        float W1 = org.telegram.messenger.g0.W1(b8.be.a(L0 / org.telegram.messenger.g0.N(24.0f), 0.0f, 1.0f), 0, org.telegram.messenger.g0.L(12.0f));
        f21Var.f33675u1.setTranslationY(Math.max(org.telegram.messenger.g0.f22602m, L0));
        if (L0 <= org.telegram.messenger.g0.f22602m / 2.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f40894c;
        if (bool == null || bool.booleanValue() != z10) {
            this.f40894c = Boolean.valueOf(z10);
            Window window = f21Var.getWindow();
            if (z10) {
                w10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, f21Var.J0);
            } else {
                w10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, f21Var.J0), 855638016);
            }
            if (org.telegram.messenger.g0.B(w10) <= 0.721f) {
                z11 = false;
            }
            org.telegram.messenger.g0.s3(window, z11);
        }
        FrameLayout frameLayout = f21Var.F;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - f21Var.F.getHeight());
        int i3 = org.telegram.messenger.g0.f22602m;
        frameLayout.setTranslationY(Math.max(f21Var.F.getHeight() + org.telegram.messenger.g0.L(56.0f) + i3, L0) + translationY);
        Path path = this.f40892a;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, L0, getWidth(), getHeight() + W1);
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, this.f40893b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        f21 f21Var = this.d;
        if (f21Var.G1 != null && f21Var.H1 != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + f21Var.G1.x());
            }
            if (f21Var.G1.x() && f21Var.H1.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = f21Var.H1.b(motionEvent);
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
        setTag(2131296351, new ai.y(10));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        f21 f21Var = this.d;
        FrameLayout frameLayout = f21Var.F;
        frameLayout.setTranslationY(Math.max(f21Var.F.getHeight() + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22602m, f21Var.L0(true)) + ((-frameLayout.getTop()) - f21Var.F.getHeight()) + f10);
    }

    @Override
    public final void updateColors() {
        try {
            this.f40893b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.d.J0));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
