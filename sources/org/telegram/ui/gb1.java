package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public final class gb1 extends org.telegram.ui.Components.zk0 {
    public boolean T2;
    public float U2;
    public final nc1 V2;

    public gb1(Context context, nc1 nc1Var) {
        super(context, null);
        this.V2 = nc1Var;
    }

    @Override
    public final boolean F0(View view) {
        gb1 gb1Var = this.V2.f40776q0;
        View viewF = gb1Var.F(view);
        f2.o1 o1VarT = viewF == null ? null : gb1Var.T(viewF);
        return o1VarT == null || o1VarT.f5793f != 2;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f2.o1 o1VarT;
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.getMessageObject();
            ImageReceiver avatarImage = s1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean zL3 = s1Var.l3();
                nc1 nc1Var = this.V2;
                if (zL3 && (o1VarT = nc1Var.f40776q0.T(view)) != null) {
                    if (nc1Var.f40776q0.K(o1VarT.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return zDrawChild;
                    }
                }
                float translationX = s1Var.getTranslationX();
                int layoutHeight = s1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = nc1Var.f40776q0.getMeasuredHeight() - nc1Var.f40776q0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (s1Var.m3() && (o1VarT = nc1Var.f40776q0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        f2.o1 o1VarT2 = nc1Var.f40776q0.K(o1VarT2.b() + 1);
                        if (o1VarT2 == null) {
                            break;
                        }
                        View view2 = o1VarT2.f5789a;
                        int top2 = view2.getTop();
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof org.telegram.ui.Cells.s1) || !((org.telegram.ui.Cells.s1) view2).m3()) {
                            top = top2;
                            break;
                        }
                        top = top2;
                    }
                }
                if (layoutHeight - AndroidUtilities.dp(48.0f) < top) {
                    layoutHeight = AndroidUtilities.dp(48.0f) + top;
                }
                if (translationX != 0.0f) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                avatarImage.draw(canvas);
                if (translationX != 0.0f) {
                    canvas.restore();
                }
            }
        }
        return zDrawChild;
    }

    @Override
    public final void h1(View view, float f10, float f11, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.s1) && !((org.telegram.ui.Cells.s1) view).h3(f10)) {
            return;
        }
        super.h1(view, f10, f11, z10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V2.V0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        nc1 nc1Var = this.V2;
        if (action == 1) {
            if (!nc1Var.f40770n0 && (nc1Var.f40795x1 instanceof wh1) && nc1Var.H0[0].getVisibility() == 0) {
                nc1Var.f1(0, false, true);
            }
            nc1Var.f40770n0 = false;
        }
        if (nc1Var.W1) {
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
            nc1Var.O1.a(motionEvent);
        }
        return this.T2 || super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        nc1 nc1Var = this.V2;
        int i10 = 0;
        if (nc1Var.F0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.q71[] q71VarArr = nc1Var.F0;
                if (i11 >= q71VarArr.length) {
                    break;
                }
                q71VarArr[i11].invalidate();
                i11++;
            }
        }
        if (nc1Var.G0 != null) {
            while (true) {
                org.telegram.ui.Components.q71[] q71VarArr2 = nc1Var.G0;
                if (i10 >= q71VarArr2.length) {
                    break;
                }
                q71VarArr2[i10].invalidate();
                i10++;
            }
        }
        kb1 kb1Var = nc1Var.f40799z0;
        if (kb1Var != null) {
            kb1Var.invalidate();
        }
        kb1 kb1Var2 = nc1Var.A0;
        if (kb1Var2 != null) {
            kb1Var2.invalidate();
        }
    }
}
