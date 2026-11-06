package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.p41;
public final class u5 extends v4.q0 {
    public RecyclerView f43204a;
    public fi.w3 f43206c;
    public boolean d;
    public boolean f43207e;
    public boolean f43208f;
    public float f43209g;
    public float h;
    public final y5 f43211j;
    public final fi.h8 f43205b = new fi.h8(this);
    public final l f43210i = new l(this, 8);

    public u5(y5 y5Var) {
        this.f43211j = y5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.u5.a(int, int):boolean");
    }

    public final void b(fi.w3 w3Var) {
        fi.w3 w3Var2 = this.f43206c;
        if (w3Var2 != null) {
            w3Var2.removeCallbacks(this.f43210i);
        }
        this.f43206c = w3Var;
        RecyclerView recyclerView = this.f43204a;
        if (recyclerView != w3Var) {
            fi.h8 h8Var = this.f43205b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f2870w0;
                if (arrayList != null) {
                    arrayList.remove(h8Var);
                }
                this.f43204a.setOnFlingListener(null);
            }
            this.f43204a = w3Var;
            if (w3Var != null) {
                if (w3Var.getOnFlingListener() == null) {
                    this.f43204a.j(h8Var);
                    this.f43204a.setOnFlingListener(this);
                    new Scroller(this.f43204a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f43207e = false;
        this.f43208f = false;
        this.d = false;
        fi.w3 w3Var = this.f43206c;
        if (w3Var != null) {
            w3Var.removeCallbacks(this.f43210i);
        }
    }

    public final View d(v4.n0 n0Var) {
        fi.w3 w3Var;
        if (!this.f43207e && (w3Var = this.f43206c) != null && w3Var.getScrollState() == 0) {
            y5 y5Var = this.f43211j;
            p41 y02 = y5Var.y0();
            if ((y02 == null || y02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (y5Var.z0()) {
                    View m10 = n0Var.m(0);
                    View m11 = n0Var.m(n0Var.B() - 1);
                    if (m10 == null) {
                        return m11;
                    }
                    if (m11 == null || Math.abs(new int[]{0, v4.n0.z(m10) - n0Var.F()}[1]) < Math.abs(new int[]{0, v4.n0.z(m11) - n0Var.F()}[1])) {
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
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c();
            this.f43207e = true;
            this.f43209g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f43209g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f43206c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f43208f = z9;
            if (!z9) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.f43207e = false;
            }
        }
    }

    public final void f() {
        v4.n0 layoutManager;
        View d;
        RecyclerView recyclerView = this.f43204a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, v4.n0.z(d) - layoutManager.F()};
            int i7 = iArr[0];
            if (i7 == 0 && iArr[1] == 0) {
                return;
            }
            this.f43204a.w0(i7, iArr[1], null);
        }
    }
}
