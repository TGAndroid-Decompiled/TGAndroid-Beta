package org.telegram.ui.Cells;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.ui.hc1;
public final class k9 {
    public int f29509a;
    public float f29510b;
    public float f29511c;
    public Object d;
    public Object f29512e;

    public k9(re.a aVar) {
        this.d = aVar;
    }

    public boolean a(View view, MotionEvent motionEvent) {
        re.a aVar = (re.a) this.d;
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.f29509a & 1) != 0) {
                        b(view, x10, y9);
                        return true;
                    }
                } else if ((this.f29509a & 1) != 0) {
                    aVar.t(x10, y9);
                    if ((this.f29509a & 4) != 0) {
                        aVar.o1(view, x10, y9);
                        return true;
                    }
                    if (aVar.g0() && Math.max(Math.abs(this.f29510b - x10), Math.abs(this.f29511c - y9)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y9);
                        return true;
                    }
                    return true;
                }
            } else {
                int i3 = this.f29509a;
                if ((i3 & 1) != 0) {
                    if ((i3 & 4) != 0) {
                        aVar.o(view, x10, y9);
                        this.f29509a &= -5;
                    } else {
                        aVar.O(x10, y9);
                        if ((this.f29509a & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y9);
                    return true;
                }
            }
            if ((this.f29509a & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y9);
        if (aVar.U0(x10, y9)) {
            this.f29509a |= 1;
            this.f29510b = x10;
            this.f29511c = y9;
            aVar.u0();
            if (aVar.s1() && view != null) {
                if (((hc1) this.f29512e) == null) {
                    this.f29509a |= 2;
                    hc1 hc1Var = new hc1(22, this, view);
                    this.f29512e = hc1Var;
                    view.postDelayed(hc1Var, aVar.getLongPressDuration());
                    return true;
                }
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    public void b(View view, float f10, float f11) {
        re.a aVar = (re.a) this.d;
        int i3 = this.f29509a;
        if ((i3 & 2) != 0) {
            this.f29509a = i3 & (-3);
            hc1 hc1Var = (hc1) this.f29512e;
            if (hc1Var != null) {
                view.removeCallbacks(hc1Var);
                this.f29512e = null;
            } else {
                throw new AssertionError();
            }
        }
        int i10 = this.f29509a;
        if ((i10 & 8) != 0) {
            this.f29509a = i10 & (-9);
            aVar.x(view, f10, f11);
        }
        if ((this.f29509a & 4) != 0) {
            aVar.o(view, f10, f11);
            this.f29509a &= -5;
        }
        if ((this.f29509a & 1) != 0) {
            aVar.H0();
            this.f29509a &= -2;
        }
    }
}
