package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class mc1 extends org.telegram.ui.Components.zl0 {
    public boolean f38534e3;
    public float f38535f3;
    public final rd1 f38536g3;

    public mc1(Context context, rd1 rd1Var) {
        super(context, null);
        this.f38536g3 = rd1Var;
    }

    @Override
    public final boolean G0(View view) {
        s4.c1 T;
        mc1 mc1Var = this.f38536g3.f40087u0;
        View F = mc1Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = mc1Var.T(F);
        }
        if (T != null && T.f46528f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        s4.c1 T;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.getMessageObject();
            ImageReceiver avatarImage = u1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = u1Var.m3();
                rd1 rd1Var = this.f38536g3;
                if (m32 && (T = rd1Var.f40087u0.T(view)) != null) {
                    if (rd1Var.f40087u0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = u1Var.getTranslationX();
                int layoutHeight = u1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = rd1Var.f40087u0.getMeasuredHeight() - rd1Var.f40087u0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (u1Var.n3() && (r11 = rd1Var.f40087u0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.c1 T2 = rd1Var.f40087u0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f46524a;
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
    public final void k1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.u1) && !((org.telegram.ui.Cells.u1) view).i3(f7)) {
            return;
        }
        super.k1(view, f7, f10, z10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f38536g3.V0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        rd1 rd1Var = this.f38536g3;
        if (action == 1) {
            if (!rd1Var.f40080r0 && (rd1Var.B1 instanceof yi1) && rd1Var.L0[0].getVisibility() == 0) {
                rd1Var.f1(0, false, true);
            }
            rd1Var.f40080r0 = false;
        }
        if (rd1Var.a2) {
            if (motionEvent.getAction() == 0) {
                this.f38535f3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f38534e3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f38534e3 && Math.abs(this.f38535f3 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f38534e3 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f38534e3 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            rd1Var.S1.a(motionEvent);
        }
        if (!this.f38534e3 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        rd1 rd1Var = this.f38536g3;
        int i10 = 0;
        if (rd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.h91[] h91VarArr = rd1Var.J0;
                if (i11 >= h91VarArr.length) {
                    break;
                }
                h91VarArr[i11].invalidate();
                i11++;
            }
        }
        if (rd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.h91[] h91VarArr2 = rd1Var.K0;
                if (i10 >= h91VarArr2.length) {
                    break;
                }
                h91VarArr2[i10].invalidate();
                i10++;
            }
        }
        pc1 pc1Var = rd1Var.D0;
        if (pc1Var != null) {
            pc1Var.invalidate();
        }
        pc1 pc1Var2 = rd1Var.E0;
        if (pc1Var2 != null) {
            pc1Var2.invalidate();
        }
    }
}
