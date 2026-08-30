package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class od1 extends FrameLayout {
    public final int f36881a;
    public final rd1 f36882b;

    public od1(rd1 rd1Var, Context context, int i10) {
        super(context);
        this.f36881a = i10;
        this.f36882b = rd1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f36881a) {
            case 0:
                rd1 rd1Var = this.f36882b;
                if (rd1Var.f37997x > 0.0f && rd1Var.v != null) {
                    rd1Var.f37996w.reset();
                    float width = getWidth() / rd1Var.f37994r.getWidth();
                    rd1Var.f37996w.postScale(width, width);
                    rd1Var.f37995s.setLocalMatrix(rd1Var.f37996w);
                    rd1Var.v.setAlpha((int) (rd1Var.f37997x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), rd1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (rd1Var.K && (t1Var = rd1Var.H) != null) {
                    t1Var.H7 = rd1Var.L;
                    t1Var.invalidate();
                    rd1Var.K = false;
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
        switch (this.f36881a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f36882b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f36881a) {
            case 1:
                rd1 rd1Var = this.f36882b;
                if (view != rd1Var.G && view != rd1Var.F) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(rd1Var.I, 0.0f, rd1Var.f37997x), getWidth(), AndroidUtilities.lerp(rd1Var.J, getHeight(), rd1Var.f37997x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f36881a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                this.f36882b.d();
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f36881a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                rd1 rd1Var = this.f36882b;
                rd1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = rd1Var.P;
                    if (childAt == viewGroup) {
                        float f10 = rd1Var.Q;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = rd1Var.N;
                    if (childAt == viewGroup2) {
                        float f11 = rd1Var.O;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.pk0 pk0Var = rd1Var.M;
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
        switch (this.f36881a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                rd1 rd1Var = this.f36882b;
                tg.c.c(rd1Var.B, rd1Var.f37989b);
                rd1Var.C.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
