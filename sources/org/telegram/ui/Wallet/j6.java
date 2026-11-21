package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.h51;
public final class j6 extends v4.s0 {
    public RecyclerView f44442a;
    public bi.g6 f44444c;
    public boolean d;
    public boolean f44445e;
    public boolean f44446f;
    public float f44447g;
    public float h;
    public final n6 f44449j;
    public final hi.e8 f44443b = new hi.e8(this);
    public final m f44448i = new m(this, 8);

    public j6(n6 n6Var) {
        this.f44449j = n6Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j6.a(int, int):boolean");
    }

    public final void b(bi.g6 g6Var) {
        bi.g6 g6Var2 = this.f44444c;
        if (g6Var2 != null) {
            g6Var2.removeCallbacks(this.f44448i);
        }
        this.f44444c = g6Var;
        RecyclerView recyclerView = this.f44442a;
        if (recyclerView != g6Var) {
            hi.e8 e8Var = this.f44443b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f2833x0;
                if (arrayList != null) {
                    arrayList.remove(e8Var);
                }
                this.f44442a.setOnFlingListener(null);
            }
            this.f44442a = g6Var;
            if (g6Var != null) {
                if (g6Var.getOnFlingListener() == null) {
                    this.f44442a.j(e8Var);
                    this.f44442a.setOnFlingListener(this);
                    new Scroller(this.f44442a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f44445e = false;
        this.f44446f = false;
        this.d = false;
        bi.g6 g6Var = this.f44444c;
        if (g6Var != null) {
            g6Var.removeCallbacks(this.f44448i);
        }
    }

    public final View d(v4.p0 p0Var) {
        bi.g6 g6Var;
        if (!this.f44445e && (g6Var = this.f44444c) != null && g6Var.getScrollState() == 0) {
            n6 n6Var = this.f44449j;
            h51 B0 = n6Var.B0();
            if ((B0 == null || B0.getScrollState() == 0) && this.d) {
                this.d = false;
                if (n6Var.C0()) {
                    View m10 = p0Var.m(0);
                    View m11 = p0Var.m(p0Var.B() - 1);
                    if (m10 == null) {
                        return m11;
                    }
                    if (m11 == null || Math.abs(new int[]{0, v4.p0.z(m10) - p0Var.F()}[1]) < Math.abs(new int[]{0, v4.p0.z(m11) - p0Var.F()}[1])) {
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
            this.f44445e = true;
            this.f44447g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f44447g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f44444c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f44446f = z10;
            if (!z10) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.f44445e = false;
            }
        }
    }

    public final void f() {
        v4.p0 layoutManager;
        View d;
        RecyclerView recyclerView = this.f44442a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, v4.p0.z(d) - layoutManager.F()};
            int i7 = iArr[0];
            if (i7 == 0 && iArr[1] == 0) {
                return;
            }
            this.f44442a.w0(i7, iArr[1], null);
        }
    }
}
