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
public final class v21 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Path f40667a;
    public final Paint f40668b;
    public Boolean f40669c;
    public final b31 d;

    public v21(b31 b31Var, Context context) {
        super(context);
        this.d = b31Var;
        this.f40667a = new Path();
        Paint paint = new Paint(1);
        this.f40668b = paint;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, b31Var.J0));
        org.telegram.ui.ActionBar.m6.n(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int w10;
        b31 b31Var = this.d;
        boolean z11 = true;
        float M0 = b31Var.M0(true);
        float W1 = org.telegram.messenger.g0.W1(c8.l9.a(M0 / org.telegram.messenger.g0.N(24.0f), 0.0f, 1.0f), 0, org.telegram.messenger.g0.L(12.0f));
        b31Var.f33732x1.setTranslationY(Math.max(org.telegram.messenger.g0.f24040m, M0));
        if (M0 <= org.telegram.messenger.g0.f24040m / 2.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f40669c;
        if (bool == null || bool.booleanValue() != z10) {
            this.f40669c = Boolean.valueOf(z10);
            Window window = b31Var.getWindow();
            if (z10) {
                w10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, b31Var.J0);
            } else {
                w10 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29661s8, b31Var.J0), 855638016);
            }
            if (org.telegram.messenger.g0.B(w10) <= 0.721f) {
                z11 = false;
            }
            org.telegram.messenger.g0.r3(window, z11);
        }
        FrameLayout frameLayout = b31Var.F;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - b31Var.F.getHeight());
        int i7 = org.telegram.messenger.g0.f24040m;
        frameLayout.setTranslationY(Math.max(b31Var.F.getHeight() + org.telegram.messenger.g0.L(56.0f) + i7, M0) + translationY);
        Path path = this.f40667a;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, M0, getWidth(), getHeight() + W1);
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, this.f40668b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b31 b31Var = this.d;
        if (b31Var.J1 != null && b31Var.K1 != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + b31Var.J1.x());
            }
            if (b31Var.J1.x() && b31Var.K1.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = b31Var.K1.b(motionEvent);
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
        setTag(2131296353, new bi.t(10));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        b31 b31Var = this.d;
        FrameLayout frameLayout = b31Var.F;
        frameLayout.setTranslationY(Math.max(b31Var.F.getHeight() + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f24040m, b31Var.M0(true)) + ((-frameLayout.getTop()) - b31Var.F.getHeight()) + f10);
    }

    @Override
    public final void updateColors() {
        try {
            this.f40668b.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.d.J0));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
