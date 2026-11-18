package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.e51;
public final class j6 extends v4.s0 {
    public RecyclerView f44402a;
    public bi.c6 f44404c;
    public boolean d;
    public boolean f44405e;
    public boolean f44406f;
    public float f44407g;
    public float h;
    public final n6 f44409j;
    public final hi.f8 f44403b = new hi.f8(this);
    public final m f44408i = new m(this, 8);

    public j6(n6 n6Var) {
        this.f44409j = n6Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j6.a(int, int):boolean");
    }

    public final void b(bi.c6 c6Var) {
        bi.c6 c6Var2 = this.f44404c;
        if (c6Var2 != null) {
            c6Var2.removeCallbacks(this.f44408i);
        }
        this.f44404c = c6Var;
        RecyclerView recyclerView = this.f44402a;
        if (recyclerView != c6Var) {
            hi.f8 f8Var = this.f44403b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f2821x0;
                if (arrayList != null) {
                    arrayList.remove(f8Var);
                }
                this.f44402a.setOnFlingListener(null);
            }
            this.f44402a = c6Var;
            if (c6Var != null) {
                if (c6Var.getOnFlingListener() == null) {
                    this.f44402a.j(f8Var);
                    this.f44402a.setOnFlingListener(this);
                    new Scroller(this.f44402a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f44405e = false;
        this.f44406f = false;
        this.d = false;
        bi.c6 c6Var = this.f44404c;
        if (c6Var != null) {
            c6Var.removeCallbacks(this.f44408i);
        }
    }

    public final View d(v4.p0 p0Var) {
        bi.c6 c6Var;
        if (!this.f44405e && (c6Var = this.f44404c) != null && c6Var.getScrollState() == 0) {
            n6 n6Var = this.f44409j;
            e51 B0 = n6Var.B0();
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
            this.f44405e = true;
            this.f44407g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f44407g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f44404c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f44406f = z10;
            if (!z10) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.f44405e = false;
            }
        }
    }

    public final void f() {
        v4.p0 layoutManager;
        View d;
        RecyclerView recyclerView = this.f44402a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, v4.p0.z(d) - layoutManager.F()};
            int i7 = iArr[0];
            if (i7 == 0 && iArr[1] == 0) {
                return;
            }
            this.f44402a.w0(i7, iArr[1], null);
        }
    }
}
