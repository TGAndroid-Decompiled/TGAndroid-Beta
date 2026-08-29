package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class jb1 extends org.telegram.ui.Components.jl0 {
    public boolean T2;
    public float U2;
    public final qc1 V2;

    public jb1(Context context, qc1 qc1Var) {
        super(context, null);
        this.V2 = qc1Var;
    }

    @Override
    public final boolean F0(View view) {
        f2.n1 T;
        jb1 jb1Var = this.V2.f41664q0;
        View F = jb1Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = jb1Var.T(F);
        }
        if (T != null && T.f6436f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f2.n1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.getMessageObject();
            ImageReceiver avatarImage = s1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = s1Var.m3();
                qc1 qc1Var = this.V2;
                if (m32 && (T = qc1Var.f41664q0.T(view)) != null) {
                    if (qc1Var.f41664q0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = s1Var.getTranslationX();
                int layoutHeight = s1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = qc1Var.f41664q0.getMeasuredHeight() - qc1Var.f41664q0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (s1Var.n3() && (r11 = qc1Var.f41664q0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        f2.n1 T2 = qc1Var.f41664q0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f6432a;
                        int top2 = view2.getTop();
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if ((view2 instanceof org.telegram.ui.Cells.s1) && ((org.telegram.ui.Cells.s1) view2).n3()) {
                            top = top2;
                        } else {
                            top = top2;
                            break;
                        }
                    }
                }
                if (layoutHeight - AndroidUtilities.dp(48.0f) < top) {
                    layoutHeight = AndroidUtilities.dp(48.0f) + top;
                }
                int i11 = (translationX > 0.0f ? 1 : (translationX == 0.0f ? 0 : -1));
                if (i11 != 0) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                avatarImage.draw(canvas);
                if (i11 != 0) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override
    public final void h1(View view, float f9, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.s1) && !((org.telegram.ui.Cells.s1) view).i3(f9)) {
            return;
        }
        super.h1(view, f9, f10, z10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V2.V0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        qc1 qc1Var = this.V2;
        if (action == 1) {
            if (!qc1Var.f41658n0 && (qc1Var.f41683x1 instanceof zh1) && qc1Var.H0[0].getVisibility() == 0) {
                qc1Var.f1(0, false, true);
            }
            qc1Var.f41658n0 = false;
        }
        if (qc1Var.W1) {
            if (motionEvent.getAction() == 0) {
                this.U2 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.T2 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.T2 && Math.abs(this.U2 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.T2 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.T2 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            qc1Var.O1.a(motionEvent);
        }
        if (!this.T2 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        qc1 qc1Var = this.V2;
        int i10 = 0;
        if (qc1Var.F0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.a81[] a81VarArr = qc1Var.F0;
                if (i11 >= a81VarArr.length) {
                    break;
                }
                a81VarArr[i11].invalidate();
                i11++;
            }
        }
        if (qc1Var.G0 != null) {
            while (true) {
                org.telegram.ui.Components.a81[] a81VarArr2 = qc1Var.G0;
                if (i10 >= a81VarArr2.length) {
                    break;
                }
                a81VarArr2[i10].invalidate();
                i10++;
            }
        }
        nb1 nb1Var = qc1Var.f41687z0;
        if (nb1Var != null) {
            nb1Var.invalidate();
        }
        nb1 nb1Var2 = qc1Var.A0;
        if (nb1Var2 != null) {
            nb1Var2.invalidate();
        }
    }
}
