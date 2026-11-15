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
public final class j21 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Path f35844a;
    public final Paint f35845b;
    public Boolean f35846c;
    public final p21 d;

    public j21(p21 p21Var, Context context) {
        super(context);
        this.d = p21Var;
        this.f35844a = new Path();
        Paint paint = new Paint(1);
        this.f35845b = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, p21Var.J0));
        org.telegram.ui.ActionBar.j6.n(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int w10;
        p21 p21Var = this.d;
        boolean z11 = true;
        float L0 = p21Var.L0(true);
        float W1 = org.telegram.messenger.g0.W1(c8.i9.a(L0 / org.telegram.messenger.g0.N(24.0f), 0.0f, 1.0f), 0, org.telegram.messenger.g0.L(12.0f));
        p21Var.f38180x1.setTranslationY(Math.max(org.telegram.messenger.g0.f23603m, L0));
        if (L0 <= org.telegram.messenger.g0.f23603m / 2.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f35846c;
        if (bool == null || bool.booleanValue() != z10) {
            this.f35846c = Boolean.valueOf(z10);
            Window window = p21Var.getWindow();
            if (z10) {
                w10 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, p21Var.J0);
            } else {
                w10 = org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, p21Var.J0), 855638016);
            }
            if (org.telegram.messenger.g0.B(w10) <= 0.721f) {
                z11 = false;
            }
            org.telegram.messenger.g0.s3(window, z11);
        }
        FrameLayout frameLayout = p21Var.F;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - p21Var.F.getHeight());
        int i7 = org.telegram.messenger.g0.f23603m;
        frameLayout.setTranslationY(Math.max(p21Var.F.getHeight() + org.telegram.messenger.g0.L(56.0f) + i7, L0) + translationY);
        Path path = this.f35844a;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, L0, getWidth(), getHeight() + W1);
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, this.f35845b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p21 p21Var = this.d;
        if (p21Var.J1 != null && p21Var.K1 != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + p21Var.J1.x());
            }
            if (p21Var.J1.x() && p21Var.K1.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = p21Var.K1.b(motionEvent);
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
        p21 p21Var = this.d;
        FrameLayout frameLayout = p21Var.F;
        frameLayout.setTranslationY(Math.max(p21Var.F.getHeight() + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f23603m, p21Var.L0(true)) + ((-frameLayout.getTop()) - p21Var.F.getHeight()) + f10);
    }

    @Override
    public final void updateColors() {
        try {
            this.f35845b.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.d.J0));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
