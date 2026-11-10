package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wq;
public final class u2 extends FrameLayout {
    public final org.telegram.ui.Components.v5 f43215a;
    public final Paint f43216b;
    public final Path f43217c;
    public float d;
    public final x2 f43218e;

    public u2(x2 x2Var, Context context) {
        super(context);
        this.f43218e = x2Var;
        this.f43215a = new org.telegram.ui.Components.v5(this, 250L, wq.h);
        Paint paint = new Paint(1);
        this.f43216b = paint;
        this.f43217c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, x2Var.I0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        float f10;
        x2 x2Var = this.f43218e;
        Integer num = x2Var.f43323p1;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, x2Var.I0);
        }
        Paint paint = this.f43216b;
        paint.setColor(w02);
        View[] viewPages = x2Var.l1.getViewPages();
        float f11 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i7 = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f12 = this.d;
                boolean z9 = view instanceof v2;
                if (z9) {
                    w2 w2Var = (w2) ((v2) view);
                    f10 = Math.max(0.0f, w2Var.getHeight() - w2Var.f43280a.getMeasuredHeight());
                } else {
                    f10 = 0.0f;
                }
                this.d = (f10 * i7) + f12;
                if (view.getVisibility() == 0 && z9) {
                    v2 v2Var = (v2) view;
                }
            }
        }
        if (this.d <= org.telegram.messenger.g0.f22561m) {
            f11 = 1.0f;
        }
        float e10 = this.f43215a.e(false, f11);
        float max = Math.max(org.telegram.messenger.g0.f22561m, this.d) - (org.telegram.messenger.g0.f22561m * e10);
        this.d = max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(x2Var.f28705t0, max, getWidth() - x2Var.f28705t0, org.telegram.messenger.g0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (x2Var.E != null) {
            x2Var.E.setTranslationY(Math.max((x2Var.f28672b.getY() + this.d) + x2Var.f28704s0, x2Var.E.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22561m)) - x2Var.E.getBottom());
        }
        canvas.save();
        Path path = this.f43217c;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.f43218e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        x2 x2Var = this.f43218e;
        FrameLayout frameLayout = x2Var.f43322o1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = x2Var.f43322o1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        x2Var.l1.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i11), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
