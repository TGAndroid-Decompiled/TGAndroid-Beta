package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cd1 extends FrameLayout {
    public final int f37081a;
    public final fd1 f37082b;

    public cd1(fd1 fd1Var, Context context, int i10) {
        super(context);
        this.f37081a = i10;
        this.f37082b = fd1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f37081a) {
            case 0:
                fd1 fd1Var = this.f37082b;
                if (fd1Var.f38118x > 0.0f && fd1Var.v != null) {
                    fd1Var.f38117w.reset();
                    float width = getWidth() / fd1Var.f38115r.getWidth();
                    fd1Var.f38117w.postScale(width, width);
                    fd1Var.f38116s.setLocalMatrix(fd1Var.f38117w);
                    fd1Var.v.setAlpha((int) (fd1Var.f38118x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), fd1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (fd1Var.J && (s1Var = fd1Var.G) != null) {
                    s1Var.G7 = fd1Var.K;
                    s1Var.invalidate();
                    fd1Var.J = false;
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
        switch (this.f37081a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f37082b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f37081a) {
            case 1:
                fd1 fd1Var = this.f37082b;
                if (view != fd1Var.F && view != fd1Var.E) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(fd1Var.H, 0.0f, fd1Var.f38118x), getWidth(), AndroidUtilities.lerp(fd1Var.I, getHeight(), fd1Var.f38118x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37081a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f37082b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f37081a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                fd1 fd1Var = this.f37082b;
                fd1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = fd1Var.O;
                    if (childAt == viewGroup) {
                        float f9 = fd1Var.P;
                        if (f9 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f9), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = fd1Var.M;
                    if (childAt == viewGroup2) {
                        float f10 = fd1Var.N;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.fk0 fk0Var = fd1Var.L;
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
        switch (this.f37081a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                fd1 fd1Var = this.f37082b;
                rg.c.c(fd1Var.A, fd1Var.f38110b);
                fd1Var.B.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
