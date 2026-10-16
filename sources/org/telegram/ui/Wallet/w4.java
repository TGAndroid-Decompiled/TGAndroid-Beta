package org.telegram.ui.Wallet;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import di.r9;
import java.util.ArrayList;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.i71;
public final class w4 extends s4.p0 {
    public RecyclerView f33546a;
    public c71 f33548c;
    public boolean d;
    public boolean e;
    public boolean f33549f;
    public float f33550g;
    public float h;
    public final a5 f33552j;
    public final r9 f33547b = new r9(this);
    public final n f33551i = new n(this, 7);

    public w4(a5 a5Var) {
        this.f33552j = a5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w4.a(int, int):boolean");
    }

    public final void b(c71 c71Var) {
        c71 c71Var2 = this.f33548c;
        if (c71Var2 != null) {
            c71Var2.removeCallbacks(this.f33551i);
        }
        this.f33548c = c71Var;
        RecyclerView recyclerView = this.f33546a;
        if (recyclerView != c71Var) {
            r9 r9Var = this.f33547b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f2020w0;
                if (arrayList != null) {
                    arrayList.remove(r9Var);
                }
                this.f33546a.setOnFlingListener(null);
            }
            this.f33546a = c71Var;
            if (c71Var != null) {
                if (c71Var.getOnFlingListener() == null) {
                    this.f33546a.j(r9Var);
                    this.f33546a.setOnFlingListener(this);
                    new Scroller(this.f33546a.getContext(), new DecelerateInterpolator());
                    e();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f33549f = false;
        this.d = false;
        c71 c71Var = this.f33548c;
        if (c71Var != null) {
            c71Var.removeCallbacks(this.f33551i);
        }
    }

    public final View d(s4.n0 n0Var) {
        c71 c71Var;
        if (!this.e && (c71Var = this.f33548c) != null && c71Var.getScrollState() == 0) {
            a5 a5Var = this.f33552j;
            i71 n02 = a5Var.n0();
            if ((n02 == null || n02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (a5Var.o0()) {
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

    public final void e() {
        s4.n0 layoutManager;
        View d;
        RecyclerView recyclerView = this.f33546a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.n0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f33546a.v0(i10, iArr[1], null);
        }
    }
}
