package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class lb1 extends org.telegram.ui.Components.mm0 {
    public boolean Y2;
    public float Z2;
    public final qc1 f39212a3;

    public lb1(Context context, qc1 qc1Var) {
        super(context, null);
        this.f39212a3 = qc1Var;
    }

    @Override
    public final boolean F0(View view) {
        s4.b1 T;
        lb1 lb1Var = this.f39212a3.f40770v0;
        View F = lb1Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = lb1Var.T(F);
        }
        if (T != null && T.f46346f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        s4.b1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.getMessageObject();
            ImageReceiver avatarImage = t1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean l32 = t1Var.l3();
                qc1 qc1Var = this.f39212a3;
                if (l32 && (T = qc1Var.f40770v0.T(view)) != null) {
                    if (qc1Var.f40770v0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = t1Var.getTranslationX();
                int layoutHeight = t1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = qc1Var.f40770v0.getMeasuredHeight() - qc1Var.f40770v0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (t1Var.m3() && (r11 = qc1Var.f40770v0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.b1 T2 = qc1Var.f40770v0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f46343a;
                        int top2 = view2.getTop();
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if ((view2 instanceof org.telegram.ui.Cells.t1) && ((org.telegram.ui.Cells.t1) view2).m3()) {
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
    public final void j1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.t1) && !((org.telegram.ui.Cells.t1) view).h3(f7)) {
            return;
        }
        super.j1(view, f7, f10, z10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f39212a3.V0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        qc1 qc1Var = this.f39212a3;
        if (action == 1) {
            if (!qc1Var.f40764s0 && (qc1Var.C1 instanceof zh1) && qc1Var.M0[0].getVisibility() == 0) {
                qc1Var.f1(0, false, true);
            }
            qc1Var.f40764s0 = false;
        }
        if (qc1Var.f40719b2) {
            if (motionEvent.getAction() == 0) {
                this.Z2 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.Y2 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.Y2 && Math.abs(this.Z2 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.Y2 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.Y2 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            qc1Var.T1.a(motionEvent);
        }
        if (!this.Y2 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        qc1 qc1Var = this.f39212a3;
        int i10 = 0;
        if (qc1Var.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr = qc1Var.K0;
                if (i11 >= m91VarArr.length) {
                    break;
                }
                m91VarArr[i11].invalidate();
                i11++;
            }
        }
        if (qc1Var.L0 != null) {
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr2 = qc1Var.L0;
                if (i10 >= m91VarArr2.length) {
                    break;
                }
                m91VarArr2[i10].invalidate();
                i10++;
            }
        }
        ob1 ob1Var = qc1Var.E0;
        if (ob1Var != null) {
            ob1Var.invalidate();
        }
        ob1 ob1Var2 = qc1Var.F0;
        if (ob1Var2 != null) {
            ob1Var2.invalidate();
        }
    }
}
