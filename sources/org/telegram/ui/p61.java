package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class p61 extends org.telegram.ui.Components.ek0 {
    public boolean f50869f3;
    public float f50870g3;
    public final v71 f50871h3;

    public p61(Context context, v71 v71Var) {
        super(context, null);
        this.f50871h3 = v71Var;
    }

    @Override
    public final boolean F0(View view) {
        v4.f1 T;
        p61 p61Var = this.f50871h3.f52906w0;
        View F = p61Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = p61Var.T(F);
        }
        if (T != null && T.f59249f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        v4.f1 T;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            r1Var.getMessageObject();
            ImageReceiver avatarImage = r1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean K2 = r1Var.K2();
                v71 v71Var = this.f50871h3;
                if (K2 && (T = v71Var.f52906w0.T(view)) != null) {
                    if (v71Var.f52906w0.K(T.b() - 1) != null) {
                        avatarImage.M0 = -org.telegram.messenger.g0.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = r1Var.getTranslationX();
                int layoutHeight = r1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = v71Var.f52906w0.getMeasuredHeight() - v71Var.f52906w0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (r1Var.L2() && (r12 = v71Var.f52906w0.T(view)) != null) {
                    int i7 = 0;
                    while (i7 < 20) {
                        i7++;
                        v4.f1 T2 = v71Var.f52906w0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f59245a;
                        int top2 = view2.getTop();
                        if (layoutHeight - org.telegram.messenger.g0.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if ((view2 instanceof org.telegram.ui.Cells.r1) && ((org.telegram.ui.Cells.r1) view2).L2()) {
                            top = top2;
                        } else {
                            top = top2;
                            break;
                        }
                    }
                }
                if (layoutHeight - org.telegram.messenger.g0.L(48.0f) < top) {
                    layoutHeight = org.telegram.messenger.g0.L(48.0f) + top;
                }
                int i10 = (translationX > 0.0f ? 1 : (translationX == 0.0f ? 0 : -1));
                if (i10 != 0) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.M0 = layoutHeight - org.telegram.messenger.g0.L(44.0f);
                avatarImage.h(canvas, null);
                if (i10 != 0) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override
    public final void j1(View view, float f10, float f11, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.r1) && !((org.telegram.ui.Cells.r1) view).E2(f10)) {
            return;
        }
        super.j1(view, f10, f11, z10);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f50871h3.a1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        v71 v71Var = this.f50871h3;
        if (action == 1) {
            if (!v71Var.f52899t0 && (v71Var.D1 instanceof pc1) && v71Var.N0[0].getVisibility() == 0) {
                v71Var.k1(0, false, true);
            }
            v71Var.f52899t0 = false;
        }
        if (v71Var.f52856c2) {
            if (motionEvent.getAction() == 0) {
                this.f50870g3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f50869f3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f50869f3 && Math.abs(this.f50870g3 - motionEvent.getX()) > org.telegram.messenger.g0.f24205e) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f50869f3 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f50869f3 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            v71Var.U1.a(motionEvent);
        }
        if (!this.f50869f3 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        v71 v71Var = this.f50871h3;
        int i7 = 0;
        if (v71Var.L0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.l71[] l71VarArr = v71Var.L0;
                if (i10 >= l71VarArr.length) {
                    break;
                }
                l71VarArr[i10].invalidate();
                i10++;
            }
        }
        if (v71Var.M0 != null) {
            while (true) {
                org.telegram.ui.Components.l71[] l71VarArr2 = v71Var.M0;
                if (i7 >= l71VarArr2.length) {
                    break;
                }
                l71VarArr2[i7].invalidate();
                i7++;
            }
        }
        s61 s61Var = v71Var.F0;
        if (s61Var != null) {
            s61Var.invalidate();
        }
        s61 s61Var2 = v71Var.G0;
        if (s61Var2 != null) {
            s61Var2.invalidate();
        }
    }
}
