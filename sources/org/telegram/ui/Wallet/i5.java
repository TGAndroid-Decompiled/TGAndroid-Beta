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
public final class i5 extends s4.p0 {
    public RecyclerView f34331a;
    public u61 f34333c;
    public boolean d;
    public boolean e;
    public boolean f34334f;
    public float f34335g;
    public float h;
    public final m5 f34337j;
    public final ei.e9 f34332b = new ei.e9(this);
    public final n f34336i = new n(this, 9);

    public i5(m5 m5Var) {
        this.f34337j = m5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.i5.a(int, int):boolean");
    }

    public final void b(u61 u61Var) {
        u61 u61Var2 = this.f34333c;
        if (u61Var2 != null) {
            u61Var2.removeCallbacks(this.f34336i);
        }
        this.f34333c = u61Var;
        RecyclerView recyclerView = this.f34331a;
        if (recyclerView != u61Var) {
            ei.e9 e9Var = this.f34332b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f3634w0;
                if (arrayList != null) {
                    arrayList.remove(e9Var);
                }
                this.f34331a.setOnFlingListener(null);
            }
            this.f34331a = u61Var;
            if (u61Var != null) {
                if (u61Var.getOnFlingListener() == null) {
                    this.f34331a.j(e9Var);
                    this.f34331a.setOnFlingListener(this);
                    new Scroller(this.f34331a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f34334f = false;
        this.d = false;
        u61 u61Var = this.f34333c;
        if (u61Var != null) {
            u61Var.removeCallbacks(this.f34336i);
        }
    }

    public final View d(s4.n0 n0Var) {
        u61 u61Var;
        if (!this.e && (u61Var = this.f34333c) != null && u61Var.getScrollState() == 0) {
            m5 m5Var = this.f34337j;
            a71 t02 = m5Var.t0();
            if ((t02 == null || t02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (m5Var.u0()) {
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
            this.f34335g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f34335g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f34333c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f34334f = z10;
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
        RecyclerView recyclerView = this.f34331a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.n0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f34331a.v0(i10, iArr[1], null);
        }
    }
}
