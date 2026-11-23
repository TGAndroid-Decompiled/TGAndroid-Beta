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
    public RecyclerView f44446a;
    public bi.f6 f44448c;
    public boolean d;
    public boolean f44449e;
    public boolean f44450f;
    public float f44451g;
    public float h;
    public final n6 f44453j;
    public final hi.e8 f44447b = new hi.e8(this);
    public final m f44452i = new m(this, 8);

    public j6(n6 n6Var) {
        this.f44453j = n6Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j6.a(int, int):boolean");
    }

    public final void b(bi.f6 f6Var) {
        bi.f6 f6Var2 = this.f44448c;
        if (f6Var2 != null) {
            f6Var2.removeCallbacks(this.f44452i);
        }
        this.f44448c = f6Var;
        RecyclerView recyclerView = this.f44446a;
        if (recyclerView != f6Var) {
            hi.e8 e8Var = this.f44447b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f2840x0;
                if (arrayList != null) {
                    arrayList.remove(e8Var);
                }
                this.f44446a.setOnFlingListener(null);
            }
            this.f44446a = f6Var;
            if (f6Var != null) {
                if (f6Var.getOnFlingListener() == null) {
                    this.f44446a.j(e8Var);
                    this.f44446a.setOnFlingListener(this);
                    new Scroller(this.f44446a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f44449e = false;
        this.f44450f = false;
        this.d = false;
        bi.f6 f6Var = this.f44448c;
        if (f6Var != null) {
            f6Var.removeCallbacks(this.f44452i);
        }
    }

    public final View d(v4.p0 p0Var) {
        bi.f6 f6Var;
        if (!this.f44449e && (f6Var = this.f44448c) != null && f6Var.getScrollState() == 0) {
            n6 n6Var = this.f44453j;
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
            this.f44449e = true;
            this.f44451g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f44451g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f44448c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f44450f = z10;
            if (!z10) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.f44449e = false;
            }
        }
    }

    public final void f() {
        v4.p0 layoutManager;
        View d;
        RecyclerView recyclerView = this.f44446a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, v4.p0.z(d) - layoutManager.F()};
            int i7 = iArr[0];
            if (i7 == 0 && iArr[1] == 0) {
                return;
            }
            this.f44446a.w0(i7, iArr[1], null);
        }
    }
}
