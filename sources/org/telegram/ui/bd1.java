package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class bd1 extends FrameLayout {
    public final int f36053a;
    public final ed1 f36054b;

    public bd1(ed1 ed1Var, Context context, int i10) {
        super(context);
        this.f36053a = i10;
        this.f36054b = ed1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f36053a) {
            case 0:
                ed1 ed1Var = this.f36054b;
                if (ed1Var.f36939x > 0.0f && ed1Var.v != null) {
                    ed1Var.f36938w.reset();
                    float width = getWidth() / ed1Var.f36936r.getWidth();
                    ed1Var.f36938w.postScale(width, width);
                    ed1Var.f36937s.setLocalMatrix(ed1Var.f36938w);
                    ed1Var.v.setAlpha((int) (ed1Var.f36939x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ed1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (ed1Var.N && (t1Var = ed1Var.K) != null) {
                    t1Var.K7 = ed1Var.O;
                    t1Var.invalidate();
                    ed1Var.N = false;
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
        switch (this.f36053a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f36054b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f36053a) {
            case 1:
                ed1 ed1Var = this.f36054b;
                if (view != ed1Var.J && view != ed1Var.I) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(ed1Var.L, 0.0f, ed1Var.f36939x), getWidth(), AndroidUtilities.lerp(ed1Var.M, getHeight(), ed1Var.f36939x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f36053a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f36054b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f36053a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                ed1 ed1Var = this.f36054b;
                ed1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = ed1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = ed1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = ed1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = ed1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.gl0 gl0Var = ed1Var.P;
                    if (childAt == gl0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(gl0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f36053a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                ed1 ed1Var = this.f36054b;
                hh.d.c(ed1Var.E, ed1Var.f36928b);
                ed1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
