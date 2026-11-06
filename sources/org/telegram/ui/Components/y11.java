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
public final class y11 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final Path f40465a;
    public final Paint f40466b;
    public Boolean f40467c;
    public final e21 d;

    public y11(e21 e21Var, Context context) {
        super(context);
        this.d = e21Var;
        this.f40465a = new Path();
        Paint paint = new Paint(1);
        this.f40466b = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, e21Var.I0));
        org.telegram.ui.ActionBar.k6.n(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        int w10;
        e21 e21Var = this.d;
        boolean z10 = true;
        float L0 = e21Var.L0(true);
        float W1 = org.telegram.messenger.g0.W1(c8.j9.a(L0 / org.telegram.messenger.g0.N(24.0f), 0.0f, 1.0f), 0, org.telegram.messenger.g0.L(12.0f));
        e21Var.f33111t1.setTranslationY(Math.max(org.telegram.messenger.g0.f22531m, L0));
        if (L0 <= org.telegram.messenger.g0.f22531m / 2.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f40467c;
        if (bool == null || bool.booleanValue() != z9) {
            this.f40467c = Boolean.valueOf(z9);
            Window window = e21Var.getWindow();
            if (z9) {
                w10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, e21Var.I0);
            } else {
                w10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, e21Var.I0), 855638016);
            }
            if (org.telegram.messenger.g0.B(w10) <= 0.721f) {
                z10 = false;
            }
            org.telegram.messenger.g0.s3(window, z10);
        }
        FrameLayout frameLayout = e21Var.E;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - e21Var.E.getHeight());
        int i7 = org.telegram.messenger.g0.f22531m;
        frameLayout.setTranslationY(Math.max(e21Var.E.getHeight() + org.telegram.messenger.g0.L(56.0f) + i7, L0) + translationY);
        Path path = this.f40465a;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, L0, getWidth(), getHeight() + W1);
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, this.f40466b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e21 e21Var = this.d;
        if (e21Var.F1 != null && e21Var.G1 != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + e21Var.F1.x());
            }
            if (e21Var.F1.x() && e21Var.G1.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = e21Var.G1.b(motionEvent);
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
        e21 e21Var = this.d;
        FrameLayout frameLayout = e21Var.E;
        frameLayout.setTranslationY(Math.max(e21Var.E.getHeight() + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22531m, e21Var.L0(true)) + ((-frameLayout.getTop()) - e21Var.E.getHeight()) + f10);
    }

    @Override
    public final void updateColors() {
        try {
            this.f40466b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.d.I0));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
