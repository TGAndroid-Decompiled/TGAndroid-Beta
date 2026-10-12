package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nw0 extends FrameLayout {
    public final int f38805a;
    public final sw0 f38806b;

    public nw0(sw0 sw0Var, Context context, int i10) {
        super(context);
        this.f38805a = i10;
        this.f38806b = sw0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f38805a) {
            case 0:
                sw0 sw0Var = this.f38806b;
                if (sw0Var.f40244y > 0.0f && sw0Var.f40242w != null) {
                    sw0Var.f40243x.reset();
                    float width = getWidth() / sw0Var.f40241s.getWidth();
                    sw0Var.f40243x.postScale(width, width);
                    sw0Var.v.setLocalMatrix(sw0Var.f40243x);
                    sw0Var.f40242w.setAlpha((int) (sw0Var.f40244y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), sw0Var.f40242w);
                } else {
                    canvas2 = canvas;
                }
                if (sw0Var.O && (u1Var = sw0Var.L) != null) {
                    u1Var.L7 = sw0Var.P;
                    u1Var.invalidate();
                    sw0Var.O = false;
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
        switch (this.f38805a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f38806b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f38805a) {
            case 1:
                sw0 sw0Var = this.f38806b;
                if (view != sw0Var.K && view != sw0Var.J) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(sw0Var.M, 0.0f, sw0Var.f40244y), getWidth(), AndroidUtilities.lerp(sw0Var.N, getHeight(), sw0Var.f40244y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38805a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f38806b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f38805a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                sw0 sw0Var = this.f38806b;
                sw0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = sw0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = sw0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = sw0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = sw0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.gl0 gl0Var = sw0Var.Q;
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
        switch (this.f38805a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                sw0 sw0Var = this.f38806b;
                hh.d.c(sw0Var.F, sw0Var.f40232c);
                sw0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
