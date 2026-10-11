package org.telegram.ui.Wallet;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import ci.s9;
import java.util.ArrayList;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.l71;
public final class x4 extends s4.r0 {
    public RecyclerView f35724a;
    public f71 f35726c;
    public boolean d;
    public boolean f35727e;
    public boolean f35728f;
    public float f35729g;
    public float h;
    public final c5 f35731j;
    public final s9 f35725b = new s9(this);
    public final o f35730i = new o(this, 7);

    public x4(c5 c5Var) {
        this.f35731j = c5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x4.a(int, int):boolean");
    }

    public final void b(f71 f71Var) {
        f71 f71Var2 = this.f35726c;
        if (f71Var2 != null) {
            f71Var2.removeCallbacks(this.f35730i);
        }
        this.f35726c = f71Var;
        RecyclerView recyclerView = this.f35724a;
        if (recyclerView != f71Var) {
            s9 s9Var = this.f35725b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f3168w0;
                if (arrayList != null) {
                    arrayList.remove(s9Var);
                }
                this.f35724a.setOnFlingListener(null);
            }
            this.f35724a = f71Var;
            if (f71Var != null) {
                if (f71Var.getOnFlingListener() == null) {
                    this.f35724a.j(s9Var);
                    this.f35724a.setOnFlingListener(this);
                    new Scroller(this.f35724a.getContext(), new DecelerateInterpolator());
                    e();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f35727e = false;
        this.f35728f = false;
        this.d = false;
        f71 f71Var = this.f35726c;
        if (f71Var != null) {
            f71Var.removeCallbacks(this.f35730i);
        }
    }

    public final View d(s4.p0 p0Var) {
        f71 f71Var;
        if (!this.f35727e && (f71Var = this.f35726c) != null && f71Var.getScrollState() == 0) {
            c5 c5Var = this.f35731j;
            l71 n02 = c5Var.n0();
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
        RecyclerView recyclerView = this.f35724a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.p0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f35724a.v0(i10, iArr[1], null);
        }
    }
}
