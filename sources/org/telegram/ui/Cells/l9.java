package org.telegram.ui.Cells;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class l9 {
    public int f29517a;
    public float f29518b;
    public float f29519c;
    public Object d;
    public Object f29520e;

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
                    if (action == 3 && (this.f29517a & 1) != 0) {
                        b(view, x10, y10);
                        return true;
                    }
                } else if ((this.f29517a & 1) != 0) {
                    aVar.s(x10, y10);
                    if ((this.f29517a & 4) != 0) {
                        aVar.l1(view, x10, y10);
                        return true;
                    }
                    if (aVar.j0() && Math.max(Math.abs(this.f29518b - x10), Math.abs(this.f29519c - y10)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y10);
                        return true;
                    }
                    return true;
                }
            } else {
                int i7 = this.f29517a;
                if ((i7 & 1) != 0) {
                    if ((i7 & 4) != 0) {
                        aVar.m(view, x10, y10);
                        this.f29517a &= -5;
                    } else {
                        aVar.O(x10, y10);
                        if ((this.f29517a & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y10);
                    return true;
                }
            }
            if ((this.f29517a & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y10);
        if (aVar.U0(x10, y10)) {
            this.f29517a |= 1;
            this.f29518b = x10;
            this.f29519c = y10;
            aVar.t0();
            if (aVar.o1() && view != null) {
                if (((ti.p) this.f29520e) == null) {
                    this.f29517a |= 2;
                    ti.p pVar = new ti.p(6, this, view);
                    this.f29520e = pVar;
                    view.postDelayed(pVar, aVar.getLongPressDuration());
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
        int i7 = this.f29517a;
        if ((i7 & 2) != 0) {
            this.f29517a = i7 & (-3);
            ti.p pVar = (ti.p) this.f29520e;
            if (pVar != null) {
                view.removeCallbacks(pVar);
                this.f29520e = null;
            } else {
                throw new AssertionError();
            }
        }
        int i10 = this.f29517a;
        if ((i10 & 8) != 0) {
            this.f29517a = i10 & (-9);
            aVar.w(view, f10, f11);
        }
        if ((this.f29517a & 4) != 0) {
            aVar.m(view, f10, f11);
            this.f29517a &= -5;
        }
        if ((this.f29517a & 1) != 0) {
            aVar.H0();
            this.f29517a &= -2;
        }
    }
}
