package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class kb1 extends org.telegram.ui.Components.lm0 {
    public boolean Y2;
    public float Z2;
    public final pc1 f38893a3;

    public kb1(Context context, pc1 pc1Var) {
        super(context, null);
        this.f38893a3 = pc1Var;
    }

    @Override
    public final boolean F0(View view) {
        s4.b1 T;
        kb1 kb1Var = this.f38893a3.f40499v0;
        View F = kb1Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = kb1Var.T(F);
        }
        if (T != null && T.f46345f == 2) {
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
                pc1 pc1Var = this.f38893a3;
                if (l32 && (T = pc1Var.f40499v0.T(view)) != null) {
                    if (pc1Var.f40499v0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = t1Var.getTranslationX();
                int layoutHeight = t1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = pc1Var.f40499v0.getMeasuredHeight() - pc1Var.f40499v0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (t1Var.m3() && (r11 = pc1Var.f40499v0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.b1 T2 = pc1Var.f40499v0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f46342a;
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
        this.f38893a3.V0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        pc1 pc1Var = this.f38893a3;
        if (action == 1) {
            if (!pc1Var.f40493s0 && (pc1Var.C1 instanceof yh1) && pc1Var.M0[0].getVisibility() == 0) {
                pc1Var.f1(0, false, true);
            }
            pc1Var.f40493s0 = false;
        }
        if (pc1Var.f40448b2) {
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
            pc1Var.T1.a(motionEvent);
        }
        if (!this.Y2 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        pc1 pc1Var = this.f38893a3;
        int i10 = 0;
        if (pc1Var.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr = pc1Var.K0;
                if (i11 >= m91VarArr.length) {
                    break;
                }
                m91VarArr[i11].invalidate();
                i11++;
            }
        }
        if (pc1Var.L0 != null) {
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr2 = pc1Var.L0;
                if (i10 >= m91VarArr2.length) {
                    break;
                }
                m91VarArr2[i10].invalidate();
                i10++;
            }
        }
        nb1 nb1Var = pc1Var.E0;
        if (nb1Var != null) {
            nb1Var.invalidate();
        }
        nb1 nb1Var2 = pc1Var.F0;
        if (nb1Var2 != null) {
            nb1Var2.invalidate();
        }
    }
}
