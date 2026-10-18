package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class hb1 extends org.telegram.ui.Components.im0 {
    public boolean V2;
    public float W2;
    public final mc1 X2;

    public hb1(Context context, mc1 mc1Var) {
        super(context, null);
        this.X2 = mc1Var;
    }

    @Override
    public final boolean F0(View view) {
        s4.b1 T;
        hb1 hb1Var = this.X2.f39176u0;
        View F = hb1Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = hb1Var.T(F);
        }
        if (T != null && T.f45961f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        s4.b1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.getMessageObject();
            ImageReceiver avatarImage = u1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = u1Var.m3();
                mc1 mc1Var = this.X2;
                if (m32 && (T = mc1Var.f39176u0.T(view)) != null) {
                    if (mc1Var.f39176u0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = u1Var.getTranslationX();
                int layoutHeight = u1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = mc1Var.f39176u0.getMeasuredHeight() - mc1Var.f39176u0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (u1Var.n3() && (r11 = mc1Var.f39176u0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.b1 T2 = mc1Var.f39176u0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f45958a;
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
    public final void h1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.u1) && !((org.telegram.ui.Cells.u1) view).i3(f7)) {
            return;
        }
        super.h1(view, f7, f10, z10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.X2.V0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        mc1 mc1Var = this.X2;
        if (action == 1) {
            if (!mc1Var.f39169r0 && (mc1Var.B1 instanceof uh1) && mc1Var.L0[0].getVisibility() == 0) {
                mc1Var.f1(0, false, true);
            }
            mc1Var.f39169r0 = false;
        }
        if (mc1Var.a2) {
            if (motionEvent.getAction() == 0) {
                this.W2 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.V2 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.V2 && Math.abs(this.W2 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.V2 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.V2 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            mc1Var.S1.a(motionEvent);
        }
        if (!this.V2 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        mc1 mc1Var = this.X2;
        int i10 = 0;
        if (mc1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.d91[] d91VarArr = mc1Var.J0;
                if (i11 >= d91VarArr.length) {
                    break;
                }
                d91VarArr[i11].invalidate();
                i11++;
            }
        }
        if (mc1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.d91[] d91VarArr2 = mc1Var.K0;
                if (i10 >= d91VarArr2.length) {
                    break;
                }
                d91VarArr2[i10].invalidate();
                i10++;
            }
        }
        kb1 kb1Var = mc1Var.D0;
        if (kb1Var != null) {
            kb1Var.invalidate();
        }
        kb1 kb1Var2 = mc1Var.E0;
        if (kb1Var2 != null) {
            kb1Var2.invalidate();
        }
    }
}
