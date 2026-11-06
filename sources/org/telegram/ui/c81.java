package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class c81 extends FrameLayout {
    public final int f44723a;
    public final f81 f44724b;

    public c81(f81 f81Var, Context context, int i7) {
        super(context);
        this.f44723a = i7;
        this.f44724b = f81Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f44723a) {
            case 0:
                f81 f81Var = this.f44724b;
                if (f81Var.f45571y > 0.0f && f81Var.f45569w != null) {
                    f81Var.f45570x.reset();
                    float width = getWidth() / f81Var.f45567r.getWidth();
                    f81Var.f45570x.postScale(width, width);
                    f81Var.f45568s.setLocalMatrix(f81Var.f45570x);
                    f81Var.f45569w.setAlpha((int) (f81Var.f45571y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), f81Var.f45569w);
                } else {
                    canvas2 = canvas;
                }
                if (f81Var.N && (q1Var = f81Var.K) != null) {
                    q1Var.f29785b6 = f81Var.O;
                    q1Var.invalidate();
                    f81Var.N = false;
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
        switch (this.f44723a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f44724b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f44723a) {
            case 1:
                f81 f81Var = this.f44724b;
                if (view != f81Var.J && view != f81Var.I) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(f81Var.L, 0.0f, f81Var.f45571y), getWidth(), org.telegram.messenger.g0.T1(f81Var.M, getHeight(), f81Var.f45571y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f44723a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                this.f44724b.d();
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f44723a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                f81 f81Var = this.f44724b;
                f81Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = f81Var.S;
                    if (childAt == viewGroup) {
                        float f10 = f81Var.T;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = f81Var.Q;
                    if (childAt == viewGroup2) {
                        float f11 = f81Var.R;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.ii0 ii0Var = f81Var.P;
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
        switch (this.f44723a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                f81 f81Var = this.f44724b;
                ih.d.c(f81Var.E, f81Var.f45558b);
                f81Var.F.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
