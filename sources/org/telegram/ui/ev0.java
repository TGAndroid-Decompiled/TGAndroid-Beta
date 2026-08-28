package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ev0 extends FrameLayout {
    public final int f38031a;
    public final iv0 f38032b;

    public ev0(iv0 iv0Var, Context context, int i9) {
        super(context);
        this.f38031a = i9;
        this.f38032b = iv0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f38031a) {
            case 0:
                iv0 iv0Var = this.f38032b;
                if (iv0Var.f39308y > 0.0f && iv0Var.f39306w != null) {
                    iv0Var.f39307x.reset();
                    float width = getWidth() / iv0Var.f39305s.getWidth();
                    iv0Var.f39307x.postScale(width, width);
                    iv0Var.v.setLocalMatrix(iv0Var.f39307x);
                    iv0Var.f39306w.setAlpha((int) (iv0Var.f39308y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), iv0Var.f39306w);
                } else {
                    canvas2 = canvas;
                }
                if (iv0Var.K && (t1Var = iv0Var.H) != null) {
                    t1Var.H7 = iv0Var.L;
                    t1Var.invalidate();
                    iv0Var.K = false;
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
        switch (this.f38031a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f38032b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f38031a) {
            case 1:
                iv0 iv0Var = this.f38032b;
                if (view != iv0Var.G && view != iv0Var.F) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(iv0Var.I, 0.0f, iv0Var.f39308y), getWidth(), AndroidUtilities.lerp(iv0Var.J, getHeight(), iv0Var.f39308y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f38031a) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                this.f38032b.d();
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f38031a) {
            case 2:
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                iv0 iv0Var = this.f38032b;
                iv0Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = iv0Var.P;
                    if (childAt == viewGroup) {
                        float f10 = iv0Var.Q;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = iv0Var.N;
                    if (childAt == viewGroup2) {
                        float f11 = iv0Var.O;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.uj0 uj0Var = iv0Var.M;
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
        switch (this.f38031a) {
            case 0:
                super.onSizeChanged(i9, i10, i11, i12);
                iv0 iv0Var = this.f38032b;
                og.d.c(iv0Var.B, iv0Var.f39299c);
                iv0Var.C.d();
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }
}
