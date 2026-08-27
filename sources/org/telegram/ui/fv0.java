package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class fv0 extends FrameLayout {

    public final int f38211a;

    public final jv0 f38212b;

    public fv0(jv0 jv0Var, Context context, int i10) {
        super(context);
        this.f38211a = i10;
        this.f38212b = jv0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f38211a) {
            case 0:
                jv0 jv0Var = this.f38212b;
                if (jv0Var.f39526y <= 0.0f || jv0Var.f39524w == null) {
                    canvas2 = canvas;
                } else {
                    jv0Var.f39525x.reset();
                    float width = getWidth() / jv0Var.f39523s.getWidth();
                    jv0Var.f39525x.postScale(width, width);
                    jv0Var.v.setLocalMatrix(jv0Var.f39525x);
                    jv0Var.f39524w.setAlpha((int) (jv0Var.f39526y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), jv0Var.f39524w);
                }
                if (jv0Var.K && (s1Var = jv0Var.H) != null) {
                    s1Var.H7 = jv0Var.L;
                    s1Var.invalidate();
                    jv0Var.K = false;
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
        switch (this.f38211a) {
            case 0:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                this.f38212b.c(true);
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f38211a) {
            case 1:
                jv0 jv0Var = this.f38212b;
                if (view != jv0Var.G && view != jv0Var.F) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(jv0Var.I, 0.0f, jv0Var.f39526y), getWidth(), AndroidUtilities.lerp(jv0Var.J, getHeight(), jv0Var.f39526y));
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38211a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f38212b.d();
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
        switch (this.f38211a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                jv0 jv0Var = this.f38212b;
                jv0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup2 = jv0Var.P;
                    if (childAt == viewGroup2) {
                        float f11 = jv0Var.Q;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        } else {
                            viewGroup = jv0Var.N;
                            if (childAt == viewGroup) {
                                f10 = jv0Var.O;
                                if (f10 > 0.0f) {
                                    viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                } else {
                                    wj0Var = jv0Var.M;
                                    if (childAt == wj0Var) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(wj0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    }
                                }
                            } else {
                                wj0Var = jv0Var.M;
                                if (childAt == wj0Var) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(wj0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                }
                            }
                        }
                    } else {
                        viewGroup = jv0Var.N;
                        if (childAt == viewGroup) {
                            f10 = jv0Var.O;
                            if (f10 > 0.0f) {
                                viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                            } else {
                                wj0Var = jv0Var.M;
                                if (childAt == wj0Var) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(wj0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                }
                            }
                        } else {
                            wj0Var = jv0Var.M;
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
        switch (this.f38211a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                jv0 jv0Var = this.f38212b;
                pg.c.c(jv0Var.B, jv0Var.f39517c);
                jv0Var.C.d();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}
