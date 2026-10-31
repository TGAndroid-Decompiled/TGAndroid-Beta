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
public final class g31 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final Path f26245a;
    public final Paint f26246b;
    public Boolean f26247c;
    public final m31 d;

    public g31(m31 m31Var, Context context) {
        super(context);
        this.d = m31Var;
        this.f26245a = new Path();
        Paint paint = new Paint(1);
        this.f26246b = paint;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, m31Var.I0));
        org.telegram.ui.ActionBar.t6.n(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int w9;
        m31 m31Var = this.d;
        boolean z11 = true;
        float L0 = m31Var.L0(true);
        float W1 = org.telegram.messenger.i0.W1(w7.u.a(L0 / org.telegram.messenger.i0.N(24.0f), 0.0f, 1.0f), 0, org.telegram.messenger.i0.L(12.0f));
        m31Var.f28279t1.setTranslationY(Math.max(org.telegram.messenger.i0.f16020m, L0));
        if (L0 <= org.telegram.messenger.i0.f16020m / 2.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f26247c;
        if (bool == null || bool.booleanValue() != z10) {
            this.f26247c = Boolean.valueOf(z10);
            Window window = m31Var.getWindow();
            if (z10) {
                w9 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, m31Var.I0);
            } else {
                w9 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, m31Var.I0), 855638016);
            }
            if (org.telegram.messenger.i0.B(w9) <= 0.721f) {
                z11 = false;
            }
            org.telegram.messenger.i0.r3(window, z11);
        }
        FrameLayout frameLayout = m31Var.E;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - m31Var.E.getHeight());
        int i10 = org.telegram.messenger.i0.f16020m;
        frameLayout.setTranslationY(Math.max(m31Var.E.getHeight() + org.telegram.messenger.i0.L(56.0f) + i10, L0) + translationY);
        Path path = this.f26245a;
        path.rewind();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, L0, getWidth(), getHeight() + W1);
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, this.f26246b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m31 m31Var = this.d;
        if (m31Var.F1 != null && m31Var.G1 != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + m31Var.F1.x());
            }
            if (m31Var.F1.x() && m31Var.G1.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = m31Var.G1.b(motionEvent);
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
        setTag(2131296351, new mg.u(6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        m31 m31Var = this.d;
        FrameLayout frameLayout = m31Var.E;
        frameLayout.setTranslationY(Math.max(m31Var.E.getHeight() + org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.f16020m, m31Var.L0(true)) + ((-frameLayout.getTop()) - m31Var.E.getHeight()) + f7);
    }

    @Override
    public final void updateColors() {
        try {
            this.f26246b.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.d.I0));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
