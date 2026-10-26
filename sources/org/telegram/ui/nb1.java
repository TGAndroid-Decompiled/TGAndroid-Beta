package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class nb1 extends org.telegram.ui.Components.mm0 {
    public boolean f41834f3;
    public float f41835g3;
    public final tc1 f41836h3;

    public nb1(Context context, tc1 tc1Var) {
        super(context, null);
        this.f41836h3 = tc1Var;
    }

    @Override
    public final boolean F0(View view) {
        s4.e1 T;
        nb1 nb1Var = this.f41836h3.f43793v0;
        View F = nb1Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = nb1Var.T(F);
        }
        if (T != null && T.f47741f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        s4.e1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.getMessageObject();
            ImageReceiver avatarImage = s1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = s1Var.m3();
                tc1 tc1Var = this.f41836h3;
                if (m32 && (T = tc1Var.f43793v0.T(view)) != null) {
                    if (tc1Var.f43793v0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = s1Var.getTranslationX();
                int layoutHeight = s1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = tc1Var.f43793v0.getMeasuredHeight() - tc1Var.f43793v0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (s1Var.n3() && (r11 = tc1Var.f43793v0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.e1 T2 = tc1Var.f43793v0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f47738a;
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
    public final void k1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.s1) && !((org.telegram.ui.Cells.s1) view).i3(f7)) {
            return;
        }
        super.k1(view, f7, f10, z10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f41836h3.W0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        tc1 tc1Var = this.f41836h3;
        if (action == 1) {
            if (!tc1Var.f43787s0 && (tc1Var.C1 instanceof bi1) && tc1Var.M0[0].getVisibility() == 0) {
                tc1Var.g1(0, false, true);
            }
            tc1Var.f43787s0 = false;
        }
        if (tc1Var.f43742b2) {
            if (motionEvent.getAction() == 0) {
                this.f41835g3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f41834f3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f41834f3 && Math.abs(this.f41835g3 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f41834f3 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f41834f3 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            tc1Var.T1.a(motionEvent);
        }
        if (!this.f41834f3 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        tc1 tc1Var = this.f41836h3;
        int i10 = 0;
        if (tc1Var.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.v91[] v91VarArr = tc1Var.K0;
                if (i11 >= v91VarArr.length) {
                    break;
                }
                v91VarArr[i11].invalidate();
                i11++;
            }
        }
        if (tc1Var.L0 != null) {
            while (true) {
                org.telegram.ui.Components.v91[] v91VarArr2 = tc1Var.L0;
                if (i10 >= v91VarArr2.length) {
                    break;
                }
                v91VarArr2[i10].invalidate();
                i10++;
            }
        }
        qb1 qb1Var = tc1Var.E0;
        if (qb1Var != null) {
            qb1Var.invalidate();
        }
        qb1 qb1Var2 = tc1Var.F0;
        if (qb1Var2 != null) {
            qb1Var2.invalidate();
        }
    }
}
