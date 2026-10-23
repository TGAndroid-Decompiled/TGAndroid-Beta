package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.j71;
public final class k5 extends s4.p0 {
    public RecyclerView f34708a;
    public d71 f34710c;
    public boolean d;
    public boolean e;
    public boolean f34711f;
    public float f34712g;
    public float h;
    public final o5 f34714j;
    public final ei.e9 f34709b = new ei.e9(this);
    public final m f34713i = new m(this, 8);

    public k5(o5 o5Var) {
        this.f34714j = o5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.k5.a(int, int):boolean");
    }

    public final void b(d71 d71Var) {
        d71 d71Var2 = this.f34710c;
        if (d71Var2 != null) {
            d71Var2.removeCallbacks(this.f34713i);
        }
        this.f34710c = d71Var;
        RecyclerView recyclerView = this.f34708a;
        if (recyclerView != d71Var) {
            ei.e9 e9Var = this.f34709b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f3637w0;
                if (arrayList != null) {
                    arrayList.remove(e9Var);
                }
                this.f34708a.setOnFlingListener(null);
            }
            this.f34708a = d71Var;
            if (d71Var != null) {
                if (d71Var.getOnFlingListener() == null) {
                    this.f34708a.j(e9Var);
                    this.f34708a.setOnFlingListener(this);
                    new Scroller(this.f34708a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f34711f = false;
        this.d = false;
        d71 d71Var = this.f34710c;
        if (d71Var != null) {
            d71Var.removeCallbacks(this.f34713i);
        }
    }

    public final View d(s4.n0 n0Var) {
        d71 d71Var;
        if (!this.e && (d71Var = this.f34710c) != null && d71Var.getScrollState() == 0) {
            o5 o5Var = this.f34714j;
            j71 t02 = o5Var.t0();
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
            this.f34712g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f34712g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f34710c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f34711f = z10;
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
        RecyclerView recyclerView = this.f34708a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.n0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f34708a.v0(i10, iArr[1], null);
        }
    }
}
