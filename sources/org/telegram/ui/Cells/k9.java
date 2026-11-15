package org.telegram.ui.Cells;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class k9 {
    public int f30570a;
    public float f30571b;
    public float f30572c;
    public Object d;
    public Object f30573e;

    public k9(ue.a aVar) {
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
                    if (action == 3 && (this.f30570a & 1) != 0) {
                        b(view, x10, y10);
                        return true;
                    }
                } else if ((this.f30570a & 1) != 0) {
                    aVar.s(x10, y10);
                    if ((this.f30570a & 4) != 0) {
                        aVar.e1(view, x10, y10);
                        return true;
                    }
                    if (aVar.k0() && Math.max(Math.abs(this.f30571b - x10), Math.abs(this.f30572c - y10)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y10);
                        return true;
                    }
                    return true;
                }
            } else {
                int i7 = this.f30570a;
                if ((i7 & 1) != 0) {
                    if ((i7 & 4) != 0) {
                        aVar.n(view, x10, y10);
                        this.f30570a &= -5;
                    } else {
                        aVar.O(x10, y10);
                        if ((this.f30570a & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y10);
                    return true;
                }
            }
            if ((this.f30570a & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y10);
        if (aVar.Q0(x10, y10)) {
            this.f30570a |= 1;
            this.f30571b = x10;
            this.f30572c = y10;
            aVar.s0();
            if (aVar.l1() && view != null) {
                if (((org.telegram.ui.web.e1) this.f30573e) == null) {
                    this.f30570a |= 2;
                    org.telegram.ui.web.e1 e1Var = new org.telegram.ui.web.e1(26, this, view);
                    this.f30573e = e1Var;
                    view.postDelayed(e1Var, aVar.getLongPressDuration());
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
        int i7 = this.f30570a;
        if ((i7 & 2) != 0) {
            this.f30570a = i7 & (-3);
            org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) this.f30573e;
            if (e1Var != null) {
                view.removeCallbacks(e1Var);
                this.f30573e = null;
            } else {
                throw new AssertionError();
            }
        }
        int i10 = this.f30570a;
        if ((i10 & 8) != 0) {
            this.f30570a = i10 & (-9);
            aVar.v(view, f10, f11);
        }
        if ((this.f30570a & 4) != 0) {
            aVar.n(view, f10, f11);
            this.f30570a &= -5;
        }
        if ((this.f30570a & 1) != 0) {
            aVar.E0();
            this.f30570a &= -2;
        }
    }
}
