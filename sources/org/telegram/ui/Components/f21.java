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
public final class f21 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Path f33566a;
    public final Paint f33567b;
    public Boolean f33568c;
    public final l21 d;

    public f21(l21 l21Var, Context context) {
        super(context);
        this.d = l21Var;
        this.f33566a = new Path();
        Paint paint = new Paint(1);
        this.f33567b = paint;
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, l21Var.I0));
        org.telegram.ui.ActionBar.l6.n(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        int w10;
        l21 l21Var = this.d;
        boolean z10 = true;
        float L0 = l21Var.L0(true);
        float W1 = org.telegram.messenger.g0.W1(c8.j9.a(L0 / org.telegram.messenger.g0.N(24.0f), 0.0f, 1.0f), 0, org.telegram.messenger.g0.L(12.0f));
        l21Var.f35564t1.setTranslationY(Math.max(org.telegram.messenger.g0.f22557m, L0));
        if (L0 <= org.telegram.messenger.g0.f22557m / 2.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f33568c;
        if (bool == null || bool.booleanValue() != z9) {
            this.f33568c = Boolean.valueOf(z9);
            Window window = l21Var.getWindow();
            if (z9) {
                w10 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, l21Var.I0);
            } else {
                w10 = org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28145s8, l21Var.I0), 855638016);
            }
            if (org.telegram.messenger.g0.B(w10) <= 0.721f) {
                z10 = false;
            }
            org.telegram.messenger.g0.s3(window, z10);
        }
        FrameLayout frameLayout = l21Var.E;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - l21Var.E.getHeight());
        int i7 = org.telegram.messenger.g0.f22557m;
        frameLayout.setTranslationY(Math.max(l21Var.E.getHeight() + org.telegram.messenger.g0.L(56.0f) + i7, L0) + translationY);
        Path path = this.f33566a;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, L0, getWidth(), getHeight() + W1);
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, this.f33567b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l21 l21Var = this.d;
        if (l21Var.F1 != null && l21Var.G1 != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + l21Var.F1.x());
            }
            if (l21Var.F1.x() && l21Var.G1.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = l21Var.G1.b(motionEvent);
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
        l21 l21Var = this.d;
        FrameLayout frameLayout = l21Var.E;
        frameLayout.setTranslationY(Math.max(l21Var.E.getHeight() + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22557m, l21Var.L0(true)) + ((-frameLayout.getTop()) - l21Var.E.getHeight()) + f10);
    }

    @Override
    public final void updateColors() {
        try {
            this.f33567b.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, this.d.I0));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
