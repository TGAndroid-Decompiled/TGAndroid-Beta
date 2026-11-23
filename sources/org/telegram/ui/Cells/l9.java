package org.telegram.ui.Cells;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class l9 {
    public int f31091a;
    public float f31092b;
    public float f31093c;
    public Object d;
    public Object f31094e;

    public l9(ue.a aVar) {
        this.d = aVar;
    }

    public boolean a(View view, MotionEvent motionEvent) {
        ue.a aVar = (ue.a) this.d;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f31091a & 1) != 0) {
                        b(view, x10, y10);
                        return true;
                    }
                } else if ((this.f31091a & 1) != 0) {
                    aVar.u(x10, y10);
                    if ((this.f31091a & 4) != 0) {
                        aVar.X1(view, x10, y10);
                        return true;
                    }
                    if (aVar.s0() && Math.max(Math.abs(this.f31092b - x10), Math.abs(this.f31093c - y10)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y10);
                        return true;
                    }
                    return true;
                }
            } else {
                int i7 = this.f31091a;
                if ((i7 & 1) != 0) {
                    if ((i7 & 4) != 0) {
                        aVar.r(view, x10, y10);
                        this.f31091a &= -5;
                    } else {
                        aVar.U(x10, y10);
                        if ((this.f31091a & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y10);
                    return true;
                }
            }
            if ((this.f31091a & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y10);
        if (aVar.q1(x10, y10)) {
            this.f31091a |= 1;
            this.f31092b = x10;
            this.f31093c = y10;
            aVar.D0();
            if (aVar.r2() && view != null) {
                if (((org.telegram.ui.web.t1) this.f31094e) == null) {
                    this.f31091a |= 2;
                    org.telegram.ui.web.t1 t1Var = new org.telegram.ui.web.t1(24, this, view);
                    this.f31094e = t1Var;
                    view.postDelayed(t1Var, aVar.getLongPressDuration());
                    return true;
                }
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    public void b(View view, float f10, float f11) {
        ue.a aVar = (ue.a) this.d;
        int i7 = this.f31091a;
        if ((i7 & 2) != 0) {
            this.f31091a = i7 & (-3);
            org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) this.f31094e;
            if (t1Var != null) {
                view.removeCallbacks(t1Var);
                this.f31094e = null;
            } else {
                throw new AssertionError();
            }
        }
        int i10 = this.f31091a;
        if ((i10 & 8) != 0) {
            this.f31091a = i10 & (-9);
            aVar.B(view, f10, f11);
        }
        if ((this.f31091a & 4) != 0) {
            aVar.r(view, f10, f11);
            this.f31091a &= -5;
        }
        if ((this.f31091a & 1) != 0) {
            aVar.P0();
            this.f31091a &= -2;
        }
    }
}
