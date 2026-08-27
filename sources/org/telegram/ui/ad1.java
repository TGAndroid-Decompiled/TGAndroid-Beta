package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class ad1 extends FrameLayout {

    public final int f36514a;

    public final dd1 f36515b;

    public ad1(dd1 dd1Var, Context context, int i10) {
        super(context);
        this.f36514a = i10;
        this.f36515b = dd1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f36514a) {
            case 0:
                dd1 dd1Var = this.f36515b;
                if (dd1Var.f37373x <= 0.0f || dd1Var.v == null) {
                    canvas2 = canvas;
                } else {
                    dd1Var.f37372w.reset();
                    float width = getWidth() / dd1Var.f37370r.getWidth();
                    dd1Var.f37372w.postScale(width, width);
                    dd1Var.f37371s.setLocalMatrix(dd1Var.f37372w);
                    dd1Var.v.setAlpha((int) (dd1Var.f37373x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), dd1Var.v);
                }
                if (dd1Var.J && (s1Var = dd1Var.G) != null) {
                    s1Var.G7 = dd1Var.K;
                    s1Var.invalidate();
                    dd1Var.J = false;
                }
                super.dispatchDraw(canvas2);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f36514a) {
            case 0:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                this.f36515b.c(true);
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f36514a) {
            case 1:
                dd1 dd1Var = this.f36515b;
                if (view != dd1Var.F && view != dd1Var.E) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(dd1Var.H, 0.0f, dd1Var.f37373x), getWidth(), AndroidUtilities.lerp(dd1Var.I, getHeight(), dd1Var.f37373x));
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f36514a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f36515b.d();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.wj0 wj0Var;
        float f10;
        switch (this.f36514a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                dd1 dd1Var = this.f36515b;
                dd1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup2 = dd1Var.O;
                    if (childAt == viewGroup2) {
                        float f11 = dd1Var.P;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        } else {
                            viewGroup = dd1Var.M;
                            if (childAt == viewGroup) {
                                f10 = dd1Var.N;
                                if (f10 > 0.0f) {
                                    viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                } else {
                                    wj0Var = dd1Var.L;
                                    if (childAt == wj0Var) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(wj0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    }
                                }
                            } else {
                                wj0Var = dd1Var.L;
                                if (childAt == wj0Var) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(wj0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                }
                            }
                        }
                    } else {
                        viewGroup = dd1Var.M;
                        if (childAt == viewGroup) {
                            f10 = dd1Var.N;
                            if (f10 > 0.0f) {
                                viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                            } else {
                                wj0Var = dd1Var.L;
                                if (childAt == wj0Var) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(wj0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                }
                            }
                        } else {
                            wj0Var = dd1Var.L;
                            if (childAt == wj0Var) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(wj0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                            }
                        }
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f36514a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                dd1 dd1Var = this.f36515b;
                pg.c.c(dd1Var.A, dd1Var.f37365b);
                dd1Var.B.d();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}
