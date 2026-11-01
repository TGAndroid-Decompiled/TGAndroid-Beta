package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class g81 extends org.telegram.ui.Components.uk0 {
    public boolean f37402e3;
    public float f37403f3;
    public final k91 f37404g3;

    public g81(Context context, k91 k91Var) {
        super(context, null);
        this.f37404g3 = k91Var;
    }

    @Override
    public final boolean F0(View view) {
        s4.c1 T;
        g81 g81Var = this.f37404g3.f38769v0;
        View F = g81Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = g81Var.T(F);
        }
        if (T != null && T.f47912f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        s4.c1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.getMessageObject();
            ImageReceiver avatarImage = q1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean E2 = q1Var.E2();
                k91 k91Var = this.f37404g3;
                if (E2 && (T = k91Var.f38769v0.T(view)) != null) {
                    if (k91Var.f38769v0.K(T.b() - 1) != null) {
                        avatarImage.L0 = -org.telegram.messenger.i0.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = q1Var.getTranslationX();
                int layoutHeight = q1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = k91Var.f38769v0.getMeasuredHeight() - k91Var.f38769v0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (q1Var.F2() && (r12 = k91Var.f38769v0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.c1 T2 = k91Var.f38769v0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f47909a;
                        int top2 = view2.getTop();
                        if (layoutHeight - org.telegram.messenger.i0.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if ((view2 instanceof org.telegram.ui.Cells.q1) && ((org.telegram.ui.Cells.q1) view2).F2()) {
                            top = top2;
                        } else {
                            top = top2;
                            break;
                        }
                    }
                }
                if (layoutHeight - org.telegram.messenger.i0.L(48.0f) < top) {
                    layoutHeight = org.telegram.messenger.i0.L(48.0f) + top;
                }
                int i11 = (translationX > 0.0f ? 1 : (translationX == 0.0f ? 0 : -1));
                if (i11 != 0) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.L0 = layoutHeight - org.telegram.messenger.i0.L(44.0f);
                avatarImage.h(canvas, null);
                if (i11 != 0) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override
    public final void j1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.q1) && !((org.telegram.ui.Cells.q1) view).y2(f7)) {
            return;
        }
        super.j1(view, f7, f10, z10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f37404g3.a1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        k91 k91Var = this.f37404g3;
        if (action == 1) {
            if (!k91Var.f38763s0 && (k91Var.C1 instanceof ke1) && k91Var.M0[0].getVisibility() == 0) {
                k91Var.k1(0, false, true);
            }
            k91Var.f38763s0 = false;
        }
        if (k91Var.f38718b2) {
            if (motionEvent.getAction() == 0) {
                this.f37403f3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f37402e3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f37402e3 && Math.abs(this.f37403f3 - motionEvent.getX()) > org.telegram.messenger.i0.e) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f37402e3 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f37402e3 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            k91Var.T1.a(motionEvent);
        }
        if (!this.f37402e3 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        k91 k91Var = this.f37404g3;
        int i10 = 0;
        if (k91Var.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.y71[] y71VarArr = k91Var.K0;
                if (i11 >= y71VarArr.length) {
                    break;
                }
                y71VarArr[i11].invalidate();
                i11++;
            }
        }
        if (k91Var.L0 != null) {
            while (true) {
                org.telegram.ui.Components.y71[] y71VarArr2 = k91Var.L0;
                if (i10 >= y71VarArr2.length) {
                    break;
                }
                y71VarArr2[i10].invalidate();
                i10++;
            }
        }
        j81 j81Var = k91Var.E0;
        if (j81Var != null) {
            j81Var.invalidate();
        }
        j81 j81Var2 = k91Var.F0;
        if (j81Var2 != null) {
            j81Var2.invalidate();
        }
    }
}
