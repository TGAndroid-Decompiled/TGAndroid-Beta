package org.telegram.ui.Cells;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class m9 {
    public int f31111a;
    public float f31112b;
    public float f31113c;
    public Object d;
    public Object f31114e;

    public m9(ue.a aVar) {
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
                    if (action == 3 && (this.f31111a & 1) != 0) {
                        b(view, x10, y10);
                        return true;
                    }
                } else if ((this.f31111a & 1) != 0) {
                    aVar.t(x10, y10);
                    if ((this.f31111a & 4) != 0) {
                        aVar.e1(view, x10, y10);
                        return true;
                    }
                    if (aVar.m0() && Math.max(Math.abs(this.f31112b - x10), Math.abs(this.f31113c - y10)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x10, y10);
                        return true;
                    }
                    return true;
                }
            } else {
                int i7 = this.f31111a;
                if ((i7 & 1) != 0) {
                    if ((i7 & 4) != 0) {
                        aVar.o(view, x10, y10);
                        this.f31111a &= -5;
                    } else {
                        aVar.M(x10, y10);
                        if ((this.f31111a & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x10, y10);
                    return true;
                }
            }
            if ((this.f31111a & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x10, y10);
        if (aVar.Q0(x10, y10)) {
            this.f31111a |= 1;
            this.f31112b = x10;
            this.f31113c = y10;
            aVar.t0();
            if (aVar.m1() && view != null) {
                if (((p4.z) this.f31114e) == null) {
                    this.f31111a |= 2;
                    p4.z zVar = new p4.z(20, this, view);
                    this.f31114e = zVar;
                    view.postDelayed(zVar, aVar.getLongPressDuration());
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
        int i7 = this.f31111a;
        if ((i7 & 2) != 0) {
            this.f31111a = i7 & (-3);
            p4.z zVar = (p4.z) this.f31114e;
            if (zVar != null) {
                view.removeCallbacks(zVar);
                this.f31114e = null;
            } else {
                throw new AssertionError();
            }
        }
        int i10 = this.f31111a;
        if ((i10 & 8) != 0) {
            this.f31111a = i10 & (-9);
            aVar.x(view, f10, f11);
        }
        if ((this.f31111a & 4) != 0) {
            aVar.o(view, f10, f11);
            this.f31111a &= -5;
        }
        if ((this.f31111a & 1) != 0) {
            aVar.E0();
            this.f31111a &= -2;
        }
    }
}
