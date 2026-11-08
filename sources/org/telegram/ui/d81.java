package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class d81 extends FrameLayout {
    public final int f45028a;
    public final g81 f45029b;

    public d81(g81 g81Var, Context context, int i7) {
        super(context);
        this.f45028a = i7;
        this.f45029b = g81Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f45028a) {
            case 0:
                g81 g81Var = this.f45029b;
                if (g81Var.f45915y > 0.0f && g81Var.f45913w != null) {
                    g81Var.f45914x.reset();
                    float width = getWidth() / g81Var.f45911r.getWidth();
                    g81Var.f45914x.postScale(width, width);
                    g81Var.f45912s.setLocalMatrix(g81Var.f45914x);
                    g81Var.f45913w.setAlpha((int) (g81Var.f45915y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), g81Var.f45913w);
                } else {
                    canvas2 = canvas;
                }
                if (g81Var.N && (q1Var = g81Var.K) != null) {
                    q1Var.f29789b6 = g81Var.O;
                    q1Var.invalidate();
                    g81Var.N = false;
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
        switch (this.f45028a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f45029b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f45028a) {
            case 1:
                g81 g81Var = this.f45029b;
                if (view != g81Var.J && view != g81Var.I) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(g81Var.L, 0.0f, g81Var.f45915y), getWidth(), org.telegram.messenger.g0.T1(g81Var.M, getHeight(), g81Var.f45915y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f45028a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                this.f45029b.d();
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f45028a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                g81 g81Var = this.f45029b;
                g81Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = g81Var.S;
                    if (childAt == viewGroup) {
                        float f10 = g81Var.T;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = g81Var.Q;
                    if (childAt == viewGroup2) {
                        float f11 = g81Var.R;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.ii0 ii0Var = g81Var.P;
                    if (childAt == ii0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(ii0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f45028a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                g81 g81Var = this.f45029b;
                ih.d.c(g81Var.E, g81Var.f45902b);
                g81Var.F.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
