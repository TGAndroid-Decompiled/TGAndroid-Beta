package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jw0 extends FrameLayout {
    public final int f34168a;
    public final ow0 f34169b;

    public jw0(ow0 ow0Var, Context context, int i10) {
        super(context);
        this.f34168a = i10;
        this.f34169b = ow0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f34168a) {
            case 0:
                ow0 ow0Var = this.f34169b;
                if (ow0Var.f35639y > 0.0f && ow0Var.f35637w != null) {
                    ow0Var.f35638x.reset();
                    float width = getWidth() / ow0Var.f35636s.getWidth();
                    ow0Var.f35638x.postScale(width, width);
                    ow0Var.v.setLocalMatrix(ow0Var.f35638x);
                    ow0Var.f35637w.setAlpha((int) (ow0Var.f35639y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ow0Var.f35637w);
                } else {
                    canvas2 = canvas;
                }
                if (ow0Var.O && (t1Var = ow0Var.L) != null) {
                    t1Var.L7 = ow0Var.P;
                    t1Var.invalidate();
                    ow0Var.O = false;
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
        switch (this.f34168a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f34169b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f34168a) {
            case 1:
                ow0 ow0Var = this.f34169b;
                if (view != ow0Var.K && view != ow0Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(ow0Var.M, 0.0f, ow0Var.f35639y), getWidth(), AndroidUtilities.lerp(ow0Var.N, getHeight(), ow0Var.f35639y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f34168a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f34169b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f34168a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                ow0 ow0Var = this.f34169b;
                ow0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = ow0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = ow0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = ow0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = ow0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.pk0 pk0Var = ow0Var.Q;
                    if (childAt == pk0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(pk0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f34168a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                ow0 ow0Var = this.f34169b;
                fh.d.c(ow0Var.F, ow0Var.f35627c);
                ow0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
