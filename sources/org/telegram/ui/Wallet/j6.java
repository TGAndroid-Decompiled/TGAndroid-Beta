package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.h51;
public final class j6 extends v4.r0 {
    public RecyclerView f44412a;
    public bi.i6 f44414c;
    public boolean d;
    public boolean f44415e;
    public boolean f44416f;
    public float f44417g;
    public float h;
    public final n6 f44419j;
    public final hi.f8 f44413b = new hi.f8(this);
    public final m f44418i = new m(this, 8);

    public j6(n6 n6Var) {
        this.f44419j = n6Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j6.a(int, int):boolean");
    }

    public final void b(bi.i6 i6Var) {
        bi.i6 i6Var2 = this.f44414c;
        if (i6Var2 != null) {
            i6Var2.removeCallbacks(this.f44418i);
        }
        this.f44414c = i6Var;
        RecyclerView recyclerView = this.f44412a;
        if (recyclerView != i6Var) {
            hi.f8 f8Var = this.f44413b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f2791x0;
                if (arrayList != null) {
                    arrayList.remove(f8Var);
                }
                this.f44412a.setOnFlingListener(null);
            }
            this.f44412a = i6Var;
            if (i6Var != null) {
                if (i6Var.getOnFlingListener() == null) {
                    this.f44412a.j(f8Var);
                    this.f44412a.setOnFlingListener(this);
                    new Scroller(this.f44412a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f44415e = false;
        this.f44416f = false;
        this.d = false;
        bi.i6 i6Var = this.f44414c;
        if (i6Var != null) {
            i6Var.removeCallbacks(this.f44418i);
        }
    }

    public final View d(v4.o0 o0Var) {
        bi.i6 i6Var;
        if (!this.f44415e && (i6Var = this.f44414c) != null && i6Var.getScrollState() == 0) {
            n6 n6Var = this.f44419j;
            h51 B0 = n6Var.B0();
            if ((B0 == null || B0.getScrollState() == 0) && this.d) {
                this.d = false;
                if (n6Var.C0()) {
                    View m10 = o0Var.m(0);
                    View m11 = o0Var.m(o0Var.B() - 1);
                    if (m10 == null) {
                        return m11;
                    }
                    if (m11 == null || Math.abs(new int[]{0, v4.o0.z(m10) - o0Var.F()}[1]) < Math.abs(new int[]{0, v4.o0.z(m11) - o0Var.F()}[1])) {
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
            this.f44415e = true;
            this.f44417g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f44417g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f44414c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f44416f = z10;
            if (!z10) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.f44415e = false;
            }
        }
    }

    public final void f() {
        v4.o0 layoutManager;
        View d;
        RecyclerView recyclerView = this.f44412a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, v4.o0.z(d) - layoutManager.F()};
            int i7 = iArr[0];
            if (i7 == 0 && iArr[1] == 0) {
                return;
            }
            this.f44412a.w0(i7, iArr[1], null);
        }
    }
}
