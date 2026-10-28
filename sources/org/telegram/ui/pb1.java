package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class pb1 extends org.telegram.ui.Components.nm0 {
    public boolean f42368f3;
    public float f42369g3;
    public final vc1 f42370h3;

    public pb1(Context context, vc1 vc1Var) {
        super(context, null);
        this.f42370h3 = vc1Var;
    }

    @Override
    public final boolean F0(View view) {
        s4.e1 T;
        pb1 pb1Var = this.f42370h3.f44303v0;
        View F = pb1Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = pb1Var.T(F);
        }
        if (T != null && T.f47776f == 2) {
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
                vc1 vc1Var = this.f42370h3;
                if (m32 && (T = vc1Var.f44303v0.T(view)) != null) {
                    if (vc1Var.f44303v0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = s1Var.getTranslationX();
                int layoutHeight = s1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = vc1Var.f44303v0.getMeasuredHeight() - vc1Var.f44303v0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (s1Var.n3() && (r11 = vc1Var.f44303v0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.e1 T2 = vc1Var.f44303v0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f47773a;
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
        this.f42370h3.W0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        vc1 vc1Var = this.f42370h3;
        if (action == 1) {
            if (!vc1Var.f44297s0 && (vc1Var.C1 instanceof di1) && vc1Var.M0[0].getVisibility() == 0) {
                vc1Var.g1(0, false, true);
            }
            vc1Var.f44297s0 = false;
        }
        if (vc1Var.f44252b2) {
            if (motionEvent.getAction() == 0) {
                this.f42369g3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f42368f3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f42368f3 && Math.abs(this.f42369g3 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f42368f3 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f42368f3 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            vc1Var.T1.a(motionEvent);
        }
        if (!this.f42368f3 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        vc1 vc1Var = this.f42370h3;
        int i10 = 0;
        if (vc1Var.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.w91[] w91VarArr = vc1Var.K0;
                if (i11 >= w91VarArr.length) {
                    break;
                }
                w91VarArr[i11].invalidate();
                i11++;
            }
        }
        if (vc1Var.L0 != null) {
            while (true) {
                org.telegram.ui.Components.w91[] w91VarArr2 = vc1Var.L0;
                if (i10 >= w91VarArr2.length) {
                    break;
                }
                w91VarArr2[i10].invalidate();
                i10++;
            }
        }
        sb1 sb1Var = vc1Var.E0;
        if (sb1Var != null) {
            sb1Var.invalidate();
        }
        sb1 sb1Var2 = vc1Var.F0;
        if (sb1Var2 != null) {
            sb1Var2.invalidate();
        }
    }
}
