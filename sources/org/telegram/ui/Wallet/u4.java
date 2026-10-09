package org.telegram.ui.Wallet;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import ci.s9;
import java.util.ArrayList;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.k71;
public final class u4 extends s4.r0 {
    public RecyclerView f35498a;
    public e71 f35500c;
    public boolean d;
    public boolean f35501e;
    public boolean f35502f;
    public float f35503g;
    public float h;
    public final z4 f35505j;
    public final s9 f35499b = new s9(this);
    public final m f35504i = new m(this, 8);

    public u4(z4 z4Var) {
        this.f35505j = z4Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.u4.a(int, int):boolean");
    }

    public final void b(e71 e71Var) {
        e71 e71Var2 = this.f35500c;
        if (e71Var2 != null) {
            e71Var2.removeCallbacks(this.f35504i);
        }
        this.f35500c = e71Var;
        RecyclerView recyclerView = this.f35498a;
        if (recyclerView != e71Var) {
            s9 s9Var = this.f35499b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f3168w0;
                if (arrayList != null) {
                    arrayList.remove(s9Var);
                }
                this.f35498a.setOnFlingListener(null);
            }
            this.f35498a = e71Var;
            if (e71Var != null) {
                if (e71Var.getOnFlingListener() == null) {
                    this.f35498a.j(s9Var);
                    this.f35498a.setOnFlingListener(this);
                    new Scroller(this.f35498a.getContext(), new DecelerateInterpolator());
                    e();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f35501e = false;
        this.f35502f = false;
        this.d = false;
        e71 e71Var = this.f35500c;
        if (e71Var != null) {
            e71Var.removeCallbacks(this.f35504i);
        }
    }

    public final View d(s4.p0 p0Var) {
        e71 e71Var;
        if (!this.f35501e && (e71Var = this.f35500c) != null && e71Var.getScrollState() == 0) {
            z4 z4Var = this.f35505j;
            k71 n02 = z4Var.n0();
            if ((n02 == null || n02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (z4Var.o0()) {
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
        RecyclerView recyclerView = this.f35498a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.p0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f35498a.v0(i10, iArr[1], null);
        }
    }
}
