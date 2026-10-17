package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.u61;
public final class h5 extends s4.p0 {
    public RecyclerView f34260a;
    public u61 f34262c;
    public boolean d;
    public boolean e;
    public boolean f34263f;
    public float f34264g;
    public float h;
    public final l5 f34266j;
    public final ei.e9 f34261b = new ei.e9(this);
    public final n f34265i = new n(this, 9);

    public h5(l5 l5Var) {
        this.f34266j = l5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.h5.a(int, int):boolean");
    }

    public final void b(u61 u61Var) {
        u61 u61Var2 = this.f34262c;
        if (u61Var2 != null) {
            u61Var2.removeCallbacks(this.f34265i);
        }
        this.f34262c = u61Var;
        RecyclerView recyclerView = this.f34260a;
        if (recyclerView != u61Var) {
            ei.e9 e9Var = this.f34261b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f3633w0;
                if (arrayList != null) {
                    arrayList.remove(e9Var);
                }
                this.f34260a.setOnFlingListener(null);
            }
            this.f34260a = u61Var;
            if (u61Var != null) {
                if (u61Var.getOnFlingListener() == null) {
                    this.f34260a.j(e9Var);
                    this.f34260a.setOnFlingListener(this);
                    new Scroller(this.f34260a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f34263f = false;
        this.d = false;
        u61 u61Var = this.f34262c;
        if (u61Var != null) {
            u61Var.removeCallbacks(this.f34265i);
        }
    }

    public final View d(s4.n0 n0Var) {
        u61 u61Var;
        if (!this.e && (u61Var = this.f34262c) != null && u61Var.getScrollState() == 0) {
            l5 l5Var = this.f34266j;
            a71 t02 = l5Var.t0();
            if ((t02 == null || t02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (l5Var.u0()) {
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
            this.f34264g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f34264g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f34262c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f34263f = z10;
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
        RecyclerView recyclerView = this.f34260a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.n0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f34260a.v0(i10, iArr[1], null);
        }
    }
}
