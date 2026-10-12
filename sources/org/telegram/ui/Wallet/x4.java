package org.telegram.ui.Wallet;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import ci.s9;
import java.util.ArrayList;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.p71;
public final class x4 extends s4.r0 {
    public RecyclerView f35502a;
    public j71 f35504c;
    public boolean d;
    public boolean f35505e;
    public boolean f35506f;
    public float f35507g;
    public float h;
    public final c5 f35509j;
    public final s9 f35503b = new s9(this);
    public final n f35508i = new n(this, 7);

    public x4(c5 c5Var) {
        this.f35509j = c5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x4.a(int, int):boolean");
    }

    public final void b(j71 j71Var) {
        j71 j71Var2 = this.f35504c;
        if (j71Var2 != null) {
            j71Var2.removeCallbacks(this.f35508i);
        }
        this.f35504c = j71Var;
        RecyclerView recyclerView = this.f35502a;
        if (recyclerView != j71Var) {
            s9 s9Var = this.f35503b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f3166w0;
                if (arrayList != null) {
                    arrayList.remove(s9Var);
                }
                this.f35502a.setOnFlingListener(null);
            }
            this.f35502a = j71Var;
            if (j71Var != null) {
                if (j71Var.getOnFlingListener() == null) {
                    this.f35502a.j(s9Var);
                    this.f35502a.setOnFlingListener(this);
                    new Scroller(this.f35502a.getContext(), new DecelerateInterpolator());
                    e();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f35505e = false;
        this.f35506f = false;
        this.d = false;
        j71 j71Var = this.f35504c;
        if (j71Var != null) {
            j71Var.removeCallbacks(this.f35508i);
        }
    }

    public final View d(s4.p0 p0Var) {
        j71 j71Var;
        if (!this.f35505e && (j71Var = this.f35504c) != null && j71Var.getScrollState() == 0) {
            c5 c5Var = this.f35509j;
            p71 n02 = c5Var.n0();
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
        RecyclerView recyclerView = this.f35502a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.p0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f35502a.v0(i10, iArr[1], null);
        }
    }
}
