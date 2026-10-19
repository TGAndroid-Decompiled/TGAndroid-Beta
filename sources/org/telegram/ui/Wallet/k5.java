package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.v61;
public final class k5 extends s4.p0 {
    public RecyclerView f34417a;
    public v61 f34419c;
    public boolean d;
    public boolean e;
    public boolean f34420f;
    public float f34421g;
    public float h;
    public final o5 f34423j;
    public final ei.e9 f34418b = new ei.e9(this);
    public final n f34422i = new n(this, 8);

    public k5(o5 o5Var) {
        this.f34423j = o5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.k5.a(int, int):boolean");
    }

    public final void b(v61 v61Var) {
        v61 v61Var2 = this.f34419c;
        if (v61Var2 != null) {
            v61Var2.removeCallbacks(this.f34422i);
        }
        this.f34419c = v61Var;
        RecyclerView recyclerView = this.f34417a;
        if (recyclerView != v61Var) {
            ei.e9 e9Var = this.f34418b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f3630w0;
                if (arrayList != null) {
                    arrayList.remove(e9Var);
                }
                this.f34417a.setOnFlingListener(null);
            }
            this.f34417a = v61Var;
            if (v61Var != null) {
                if (v61Var.getOnFlingListener() == null) {
                    this.f34417a.j(e9Var);
                    this.f34417a.setOnFlingListener(this);
                    new Scroller(this.f34417a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f34420f = false;
        this.d = false;
        v61 v61Var = this.f34419c;
        if (v61Var != null) {
            v61Var.removeCallbacks(this.f34422i);
        }
    }

    public final View d(s4.n0 n0Var) {
        v61 v61Var;
        if (!this.e && (v61Var = this.f34419c) != null && v61Var.getScrollState() == 0) {
            o5 o5Var = this.f34423j;
            b71 t02 = o5Var.t0();
            if ((t02 == null || t02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (o5Var.u0()) {
                    View m10 = n0Var.m(0);
                    View m11 = n0Var.m(n0Var.B() - 1);
                    if (m10 == null) {
                        return m11;
                    }
                    if (m11 == null || Math.abs(new int[]{0, s4.n0.z(m10) - n0Var.F()}[1]) < Math.abs(new int[]{0, s4.n0.z(m11) - n0Var.F()}[1])) {
                        return m10;
                    }
                    return m11;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void e(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c();
            this.e = true;
            this.f34421g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f34421g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f34419c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f34420f = z10;
            if (!z10) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.e = false;
            }
        }
    }

    public final void f() {
        s4.n0 layoutManager;
        View d;
        RecyclerView recyclerView = this.f34417a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.n0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f34417a.v0(i10, iArr[1], null);
        }
    }
}
