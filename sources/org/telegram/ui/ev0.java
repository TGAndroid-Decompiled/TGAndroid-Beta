package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ev0 extends FrameLayout {
    public final int f37907a;
    public final iv0 f37908b;

    public ev0(iv0 iv0Var, Context context, int i10) {
        super(context);
        this.f37907a = i10;
        this.f37908b = iv0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f37907a) {
            case 0:
                iv0 iv0Var = this.f37908b;
                if (iv0Var.f39354y > 0.0f && iv0Var.f39352w != null) {
                    iv0Var.f39353x.reset();
                    float width = getWidth() / iv0Var.f39351s.getWidth();
                    iv0Var.f39353x.postScale(width, width);
                    iv0Var.v.setLocalMatrix(iv0Var.f39353x);
                    iv0Var.f39352w.setAlpha((int) (iv0Var.f39354y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), iv0Var.f39352w);
                } else {
                    canvas2 = canvas;
                }
                if (iv0Var.K && (s1Var = iv0Var.H) != null) {
                    s1Var.H7 = iv0Var.L;
                    s1Var.invalidate();
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
        switch (this.f37907a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f37908b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f37907a) {
            case 1:
                iv0 iv0Var = this.f37908b;
                if (view != iv0Var.G && view != iv0Var.F) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(iv0Var.I, 0.0f, iv0Var.f39354y), getWidth(), AndroidUtilities.lerp(iv0Var.J, getHeight(), iv0Var.f39354y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37907a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f37908b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f37907a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                iv0 iv0Var = this.f37908b;
                iv0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = iv0Var.P;
                    if (childAt == viewGroup) {
                        float f9 = iv0Var.Q;
                        if (f9 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f9), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = iv0Var.N;
                    if (childAt == viewGroup2) {
                        float f10 = iv0Var.O;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.fk0 fk0Var = iv0Var.M;
                    if (childAt == fk0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(fk0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f37907a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                iv0 iv0Var = this.f37908b;
                rg.c.c(iv0Var.B, iv0Var.f39345c);
                iv0Var.C.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
