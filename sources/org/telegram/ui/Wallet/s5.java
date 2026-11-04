package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.l41;
public final class s5 extends u4.r0 {
    public RecyclerView f43153a;
    public ai.h4 f43155c;
    public boolean d;
    public boolean f43156e;
    public boolean f43157f;
    public float f43158g;
    public float h;
    public final w5 f43160j;
    public final gi.g8 f43154b = new gi.g8(this);
    public final l f43159i = new l(this, 8);

    public s5(w5 w5Var) {
        this.f43160j = w5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.s5.a(int, int):boolean");
    }

    public final void b(ai.h4 h4Var) {
        ai.h4 h4Var2 = this.f43155c;
        if (h4Var2 != null) {
            h4Var2.removeCallbacks(this.f43159i);
        }
        this.f43155c = h4Var;
        RecyclerView recyclerView = this.f43153a;
        if (recyclerView != h4Var) {
            gi.g8 g8Var = this.f43154b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f2304x0;
                if (arrayList != null) {
                    arrayList.remove(g8Var);
                }
                this.f43153a.setOnFlingListener(null);
            }
            this.f43153a = h4Var;
            if (h4Var != null) {
                if (h4Var.getOnFlingListener() == null) {
                    this.f43153a.j(g8Var);
                    this.f43153a.setOnFlingListener(this);
                    new Scroller(this.f43153a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f43156e = false;
        this.f43157f = false;
        this.d = false;
        ai.h4 h4Var = this.f43155c;
        if (h4Var != null) {
            h4Var.removeCallbacks(this.f43159i);
        }
    }

    public final View d(u4.o0 o0Var) {
        ai.h4 h4Var;
        if (!this.f43156e && (h4Var = this.f43155c) != null && h4Var.getScrollState() == 0) {
            w5 w5Var = this.f43160j;
            l41 y02 = w5Var.y0();
            if ((y02 == null || y02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (w5Var.z0()) {
                    View m10 = o0Var.m(0);
                    View m11 = o0Var.m(o0Var.B() - 1);
                    if (m10 == null) {
                        return m11;
                    }
                    if (m11 == null || Math.abs(new int[]{0, u4.o0.z(m10) - o0Var.F()}[1]) < Math.abs(new int[]{0, u4.o0.z(m11) - o0Var.F()}[1])) {
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
            this.f43156e = true;
            this.f43158g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f43158g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f43155c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f43157f = z10;
            if (!z10) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.f43156e = false;
            }
        }
    }

    public final void f() {
        u4.o0 layoutManager;
        View d;
        RecyclerView recyclerView = this.f43153a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, u4.o0.z(d) - layoutManager.F()};
            int i3 = iArr[0];
            if (i3 == 0 && iArr[1] == 0) {
                return;
            }
            this.f43153a.w0(i3, iArr[1], null);
        }
    }
}
