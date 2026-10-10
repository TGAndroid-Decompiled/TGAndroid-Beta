package org.telegram.ui.Wallet;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import ci.s9;
import java.util.ArrayList;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.l71;
public final class w4 extends s4.r0 {
    public RecyclerView f35660a;
    public f71 f35662c;
    public boolean d;
    public boolean f35663e;
    public boolean f35664f;
    public float f35665g;
    public float h;
    public final b5 f35667j;
    public final s9 f35661b = new s9(this);
    public final n f35666i = new n(this, 7);

    public w4(b5 b5Var) {
        this.f35667j = b5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w4.a(int, int):boolean");
    }

    public final void b(f71 f71Var) {
        f71 f71Var2 = this.f35662c;
        if (f71Var2 != null) {
            f71Var2.removeCallbacks(this.f35666i);
        }
        this.f35662c = f71Var;
        RecyclerView recyclerView = this.f35660a;
        if (recyclerView != f71Var) {
            s9 s9Var = this.f35661b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f3168w0;
                if (arrayList != null) {
                    arrayList.remove(s9Var);
                }
                this.f35660a.setOnFlingListener(null);
            }
            this.f35660a = f71Var;
            if (f71Var != null) {
                if (f71Var.getOnFlingListener() == null) {
                    this.f35660a.j(s9Var);
                    this.f35660a.setOnFlingListener(this);
                    new Scroller(this.f35660a.getContext(), new DecelerateInterpolator());
                    e();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f35663e = false;
        this.f35664f = false;
        this.d = false;
        f71 f71Var = this.f35662c;
        if (f71Var != null) {
            f71Var.removeCallbacks(this.f35666i);
        }
    }

    public final View d(s4.p0 p0Var) {
        f71 f71Var;
        if (!this.f35663e && (f71Var = this.f35662c) != null && f71Var.getScrollState() == 0) {
            b5 b5Var = this.f35667j;
            l71 n02 = b5Var.n0();
            if ((n02 == null || n02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (b5Var.o0()) {
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
        RecyclerView recyclerView = this.f35660a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.p0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f35660a.v0(i10, iArr[1], null);
        }
    }
}
