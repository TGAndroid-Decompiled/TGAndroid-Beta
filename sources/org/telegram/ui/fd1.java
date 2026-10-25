package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fd1 extends FrameLayout {
    public final int f39343a;
    public final id1 f39344b;

    public fd1(id1 id1Var, Context context, int i10) {
        super(context);
        this.f39343a = i10;
        this.f39344b = id1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f39343a) {
            case 0:
                id1 id1Var = this.f39344b;
                if (id1Var.f40225x > 0.0f && id1Var.v != null) {
                    id1Var.f40224w.reset();
                    float width = getWidth() / id1Var.f40222r.getWidth();
                    id1Var.f40224w.postScale(width, width);
                    id1Var.f40223s.setLocalMatrix(id1Var.f40224w);
                    id1Var.v.setAlpha((int) (id1Var.f40225x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), id1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (id1Var.N && (s1Var = id1Var.K) != null) {
                    s1Var.K7 = id1Var.O;
                    s1Var.invalidate();
                    id1Var.N = false;
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
        switch (this.f39343a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f39344b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f39343a) {
            case 1:
                id1 id1Var = this.f39344b;
                if (view != id1Var.J && view != id1Var.I) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(id1Var.L, 0.0f, id1Var.f40225x), getWidth(), AndroidUtilities.lerp(id1Var.M, getHeight(), id1Var.f40225x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f39343a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f39344b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f39343a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                id1 id1Var = this.f39344b;
                id1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = id1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = id1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = id1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = id1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.fl0 fl0Var = id1Var.P;
                    if (childAt == fl0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(fl0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39343a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                id1 id1Var = this.f39344b;
                ih.d.c(id1Var.E, id1Var.f40214b);
                id1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
