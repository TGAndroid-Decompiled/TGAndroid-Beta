package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class e81 extends FrameLayout {
    public final int f45334a;
    public final h81 f45335b;

    public e81(h81 h81Var, Context context, int i7) {
        super(context);
        this.f45334a = i7;
        this.f45335b = h81Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f45334a) {
            case 0:
                h81 h81Var = this.f45335b;
                if (h81Var.f46260y > 0.0f && h81Var.f46258w != null) {
                    h81Var.f46259x.reset();
                    float width = getWidth() / h81Var.f46256r.getWidth();
                    h81Var.f46259x.postScale(width, width);
                    h81Var.f46257s.setLocalMatrix(h81Var.f46259x);
                    h81Var.f46258w.setAlpha((int) (h81Var.f46260y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), h81Var.f46258w);
                } else {
                    canvas2 = canvas;
                }
                if (h81Var.N && (q1Var = h81Var.K) != null) {
                    q1Var.f29793b6 = h81Var.O;
                    q1Var.invalidate();
                    h81Var.N = false;
                }
                super.dispatchDraw(canvas2);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f45334a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f45335b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f45334a) {
            case 1:
                h81 h81Var = this.f45335b;
                if (view != h81Var.J && view != h81Var.I) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(h81Var.L, 0.0f, h81Var.f46260y), getWidth(), org.telegram.messenger.g0.T1(h81Var.M, getHeight(), h81Var.f46260y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f45334a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                this.f45335b.d();
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f45334a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                h81 h81Var = this.f45335b;
                h81Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = h81Var.S;
                    if (childAt == viewGroup) {
                        float f10 = h81Var.T;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = h81Var.Q;
                    if (childAt == viewGroup2) {
                        float f11 = h81Var.R;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.ji0 ji0Var = h81Var.P;
                    if (childAt == ji0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(ji0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f45334a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                h81 h81Var = this.f45335b;
                ih.d.c(h81Var.E, h81Var.f46247b);
                h81Var.F.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
