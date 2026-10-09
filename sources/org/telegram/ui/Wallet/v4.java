package org.telegram.ui.Wallet;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import ci.s9;
import java.util.ArrayList;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.k71;
public final class v4 extends s4.r0 {
    public RecyclerView f35566a;
    public e71 f35568c;
    public boolean d;
    public boolean f35569e;
    public boolean f35570f;
    public float f35571g;
    public float h;
    public final a5 f35573j;
    public final s9 f35567b = new s9(this);
    public final m f35572i = new m(this, 7);

    public v4(a5 a5Var) {
        this.f35573j = a5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.v4.a(int, int):boolean");
    }

    public final void b(e71 e71Var) {
        e71 e71Var2 = this.f35568c;
        if (e71Var2 != null) {
            e71Var2.removeCallbacks(this.f35572i);
        }
        this.f35568c = e71Var;
        RecyclerView recyclerView = this.f35566a;
        if (recyclerView != e71Var) {
            s9 s9Var = this.f35567b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f3168w0;
                if (arrayList != null) {
                    arrayList.remove(s9Var);
                }
                this.f35566a.setOnFlingListener(null);
            }
            this.f35566a = e71Var;
            if (e71Var != null) {
                if (e71Var.getOnFlingListener() == null) {
                    this.f35566a.j(s9Var);
                    this.f35566a.setOnFlingListener(this);
                    new Scroller(this.f35566a.getContext(), new DecelerateInterpolator());
                    e();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f35569e = false;
        this.f35570f = false;
        this.d = false;
        e71 e71Var = this.f35568c;
        if (e71Var != null) {
            e71Var.removeCallbacks(this.f35572i);
        }
    }

    public final View d(s4.p0 p0Var) {
        e71 e71Var;
        if (!this.f35569e && (e71Var = this.f35568c) != null && e71Var.getScrollState() == 0) {
            a5 a5Var = this.f35573j;
            k71 n02 = a5Var.n0();
            if ((n02 == null || n02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (a5Var.o0()) {
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
        RecyclerView recyclerView = this.f35566a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.p0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f35566a.v0(i10, iArr[1], null);
        }
    }
}
