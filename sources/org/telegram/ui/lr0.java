package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class lr0 extends FrameLayout {
    public final int f47426a;
    public final pr0 f47427b;

    public lr0(pr0 pr0Var, Context context, int i3) {
        super(context);
        this.f47426a = i3;
        this.f47427b = pr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f47426a) {
            case 0:
                pr0 pr0Var = this.f47427b;
                if (pr0Var.E > 0.0f && pr0Var.f48654x != null) {
                    pr0Var.f48655y.reset();
                    float width = getWidth() / pr0Var.f48652s.getWidth();
                    pr0Var.f48655y.postScale(width, width);
                    pr0Var.f48653w.setLocalMatrix(pr0Var.f48655y);
                    pr0Var.f48654x.setAlpha((int) (pr0Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), pr0Var.f48654x);
                } else {
                    canvas2 = canvas;
                }
                if (pr0Var.P && (q1Var = pr0Var.M) != null) {
                    q1Var.f29873c6 = pr0Var.Q;
                    q1Var.invalidate();
                    pr0Var.P = false;
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
        switch (this.f47426a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f47427b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f47426a) {
            case 1:
                pr0 pr0Var = this.f47427b;
                if (view != pr0Var.L && view != pr0Var.K) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(pr0Var.N, 0.0f, pr0Var.E), getWidth(), org.telegram.messenger.g0.T1(pr0Var.O, getHeight(), pr0Var.E));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f47426a) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                this.f47427b.d();
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f47426a) {
            case 2:
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                pr0 pr0Var = this.f47427b;
                pr0Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = pr0Var.U;
                    if (childAt == viewGroup) {
                        float f10 = pr0Var.V;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = pr0Var.S;
                    if (childAt == viewGroup2) {
                        float f11 = pr0Var.T;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.li0 li0Var = pr0Var.R;
                    if (childAt == li0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(li0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f47426a) {
            case 0:
                super.onSizeChanged(i3, i10, i11, i12);
                pr0 pr0Var = this.f47427b;
                jh.d.c(pr0Var.G, pr0Var.f48641c);
                pr0Var.H.d();
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }
}
