package org.telegram.ui.Wallet;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import ci.s9;
import java.util.ArrayList;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.m71;
public final class x4 extends s4.r0 {
    public RecyclerView f35690a;
    public g71 f35692c;
    public boolean d;
    public boolean f35693e;
    public boolean f35694f;
    public float f35695g;
    public float h;
    public final c5 f35697j;
    public final s9 f35691b = new s9(this);
    public final o f35696i = new o(this, 7);

    public x4(c5 c5Var) {
        this.f35697j = c5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x4.a(int, int):boolean");
    }

    public final void b(g71 g71Var) {
        g71 g71Var2 = this.f35692c;
        if (g71Var2 != null) {
            g71Var2.removeCallbacks(this.f35696i);
        }
        this.f35692c = g71Var;
        RecyclerView recyclerView = this.f35690a;
        if (recyclerView != g71Var) {
            s9 s9Var = this.f35691b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f3168w0;
                if (arrayList != null) {
                    arrayList.remove(s9Var);
                }
                this.f35690a.setOnFlingListener(null);
            }
            this.f35690a = g71Var;
            if (g71Var != null) {
                if (g71Var.getOnFlingListener() == null) {
                    this.f35690a.j(s9Var);
                    this.f35690a.setOnFlingListener(this);
                    new Scroller(this.f35690a.getContext(), new DecelerateInterpolator());
                    e();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f35693e = false;
        this.f35694f = false;
        this.d = false;
        g71 g71Var = this.f35692c;
        if (g71Var != null) {
            g71Var.removeCallbacks(this.f35696i);
        }
    }

    public final View d(s4.p0 p0Var) {
        g71 g71Var;
        if (!this.f35693e && (g71Var = this.f35692c) != null && g71Var.getScrollState() == 0) {
            c5 c5Var = this.f35697j;
            m71 n02 = c5Var.n0();
            if ((n02 == null || n02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (c5Var.o0()) {
                    View m10 = p0Var.m(0);
                    View m11 = p0Var.m(p0Var.B() - 1);
                    if (m10 == null) {
                        return m11;
                    }
                    if (m11 == null || Math.abs(new int[]{0, s4.p0.z(m10) - p0Var.F()}[1]) < Math.abs(new int[]{0, s4.p0.z(m11) - p0Var.F()}[1])) {
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

    public final void e() {
        s4.p0 layoutManager;
        View d;
        RecyclerView recyclerView = this.f35690a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.p0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f35690a.v0(i10, iArr[1], null);
        }
    }
}
