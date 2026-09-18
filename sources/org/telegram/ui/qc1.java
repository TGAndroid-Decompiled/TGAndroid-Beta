package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class qc1 extends org.telegram.ui.Components.wl0 {
    public boolean X2;
    public float Y2;
    public final vd1 Z2;

    public qc1(Context context, vd1 vd1Var) {
        super(context, null);
        this.Z2 = vd1Var;
    }

    @Override
    public final boolean G0(View view) {
        s4.c1 U;
        qc1 qc1Var = this.Z2.f38521u0;
        View G = qc1Var.G(view);
        if (G == null) {
            U = null;
        } else {
            U = qc1Var.U(G);
        }
        if (U != null && U.f42932f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        s4.c1 U;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.getMessageObject();
            ImageReceiver avatarImage = u1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = u1Var.m3();
                vd1 vd1Var = this.Z2;
                if (m32 && (U = vd1Var.f38521u0.U(view)) != null) {
                    if (vd1Var.f38521u0.L(U.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = u1Var.getTranslationX();
                int layoutHeight = u1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = vd1Var.f38521u0.getMeasuredHeight() - vd1Var.f38521u0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (u1Var.n3() && (r11 = vd1Var.f38521u0.U(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.c1 U2 = vd1Var.f38521u0.L(U2.b() + 1);
                        if (U2 == null) {
                            break;
                        }
                        View view2 = U2.f42929a;
                        int top2 = view2.getTop();
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if ((view2 instanceof org.telegram.ui.Cells.u1) && ((org.telegram.ui.Cells.u1) view2).n3()) {
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
    public final void i1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.u1) && !((org.telegram.ui.Cells.u1) view).i3(f7)) {
            return;
        }
        super.i1(view, f7, f10, z10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.Z2.V0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        vd1 vd1Var = this.Z2;
        if (action == 1) {
            if (!vd1Var.f38514r0 && (vd1Var.B1 instanceof ej1) && vd1Var.L0[0].getVisibility() == 0) {
                vd1Var.f1(0, false, true);
            }
            vd1Var.f38514r0 = false;
        }
        if (vd1Var.a2) {
            if (motionEvent.getAction() == 0) {
                this.Y2 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.X2 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.X2 && Math.abs(this.Y2 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.X2 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.X2 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            vd1Var.S1.a(motionEvent);
        }
        if (!this.X2 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        vd1 vd1Var = this.Z2;
        int i10 = 0;
        if (vd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.y81[] y81VarArr = vd1Var.J0;
                if (i11 >= y81VarArr.length) {
                    break;
                }
                y81VarArr[i11].invalidate();
                i11++;
            }
        }
        if (vd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.y81[] y81VarArr2 = vd1Var.K0;
                if (i10 >= y81VarArr2.length) {
                    break;
                }
                y81VarArr2[i10].invalidate();
                i10++;
            }
        }
        tc1 tc1Var = vd1Var.D0;
        if (tc1Var != null) {
            tc1Var.invalidate();
        }
        tc1 tc1Var2 = vd1Var.E0;
        if (tc1Var2 != null) {
            tc1Var2.invalidate();
        }
    }
}
