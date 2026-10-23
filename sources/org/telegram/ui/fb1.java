package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class fb1 extends org.telegram.ui.Components.jm0 {
    public boolean V2;
    public float W2;
    public final kc1 X2;

    public fb1(Context context, kc1 kc1Var) {
        super(context, null);
        this.X2 = kc1Var;
    }

    @Override
    public final boolean F0(View view) {
        s4.b1 T;
        fb1 fb1Var = this.X2.f38575u0;
        View F = fb1Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = fb1Var.T(F);
        }
        if (T != null && T.f45924f == 2) {
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
                kc1 kc1Var = this.X2;
                if (m32 && (T = kc1Var.f38575u0.T(view)) != null) {
                    if (kc1Var.f38575u0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = u1Var.getTranslationX();
                int layoutHeight = u1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = kc1Var.f38575u0.getMeasuredHeight() - kc1Var.f38575u0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (u1Var.n3() && (r11 = kc1Var.f38575u0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.b1 T2 = kc1Var.f38575u0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f45921a;
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
        kc1 kc1Var = this.X2;
        if (action == 1) {
            if (!kc1Var.f38568r0 && (kc1Var.B1 instanceof sh1) && kc1Var.L0[0].getVisibility() == 0) {
                kc1Var.f1(0, false, true);
            }
            kc1Var.f38568r0 = false;
        }
        if (kc1Var.a2) {
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
            kc1Var.S1.a(motionEvent);
        }
        if (!this.V2 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        kc1 kc1Var = this.X2;
        int i10 = 0;
        if (kc1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.f91[] f91VarArr = kc1Var.J0;
                if (i11 >= f91VarArr.length) {
                    break;
                }
                f91VarArr[i11].invalidate();
                i11++;
            }
        }
        if (kc1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.f91[] f91VarArr2 = kc1Var.K0;
                if (i10 >= f91VarArr2.length) {
                    break;
                }
                f91VarArr2[i10].invalidate();
                i10++;
            }
        }
        ib1 ib1Var = kc1Var.D0;
        if (ib1Var != null) {
            ib1Var.invalidate();
        }
        ib1 ib1Var2 = kc1Var.E0;
        if (ib1Var2 != null) {
            ib1Var2.invalidate();
        }
    }
}
