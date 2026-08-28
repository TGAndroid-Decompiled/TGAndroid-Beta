package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ad1 extends FrameLayout {
    public final int f36458a;
    public final dd1 f36459b;

    public ad1(dd1 dd1Var, Context context, int i9) {
        super(context);
        this.f36458a = i9;
        this.f36459b = dd1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f36458a) {
            case 0:
                dd1 dd1Var = this.f36459b;
                if (dd1Var.f37513x > 0.0f && dd1Var.v != null) {
                    dd1Var.f37512w.reset();
                    float width = getWidth() / dd1Var.f37510r.getWidth();
                    dd1Var.f37512w.postScale(width, width);
                    dd1Var.f37511s.setLocalMatrix(dd1Var.f37512w);
                    dd1Var.v.setAlpha((int) (dd1Var.f37513x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), dd1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (dd1Var.J && (t1Var = dd1Var.G) != null) {
                    t1Var.G7 = dd1Var.K;
                    t1Var.invalidate();
                    dd1Var.J = false;
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
        switch (this.f36458a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f36459b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f36458a) {
            case 1:
                dd1 dd1Var = this.f36459b;
                if (view != dd1Var.F && view != dd1Var.E) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(dd1Var.H, 0.0f, dd1Var.f37513x), getWidth(), AndroidUtilities.lerp(dd1Var.I, getHeight(), dd1Var.f37513x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f36458a) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                this.f36459b.d();
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f36458a) {
            case 2:
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                dd1 dd1Var = this.f36459b;
                dd1Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = dd1Var.O;
                    if (childAt == viewGroup) {
                        float f10 = dd1Var.P;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = dd1Var.M;
                    if (childAt == viewGroup2) {
                        float f11 = dd1Var.N;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.uj0 uj0Var = dd1Var.L;
                    if (childAt == uj0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(uj0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f36458a) {
            case 0:
                super.onSizeChanged(i9, i10, i11, i12);
                dd1 dd1Var = this.f36459b;
                og.d.c(dd1Var.A, dd1Var.f37505b);
                dd1Var.B.d();
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }
}
