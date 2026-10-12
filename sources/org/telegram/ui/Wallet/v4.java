package org.telegram.ui.Wallet;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import di.r9;
import java.util.ArrayList;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.h71;
public final class v4 extends s4.p0 {
    public RecyclerView f33772a;
    public b71 f33774c;
    public boolean d;
    public boolean e;
    public boolean f33775f;
    public float f33776g;
    public float h;
    public final z4 f33778j;
    public final r9 f33773b = new r9(this);
    public final m f33777i = new m(this, 7);

    public v4(z4 z4Var) {
        this.f33778j = z4Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.v4.a(int, int):boolean");
    }

    public final void b(b71 b71Var) {
        b71 b71Var2 = this.f33774c;
        if (b71Var2 != null) {
            b71Var2.removeCallbacks(this.f33777i);
        }
        this.f33774c = b71Var;
        RecyclerView recyclerView = this.f33772a;
        if (recyclerView != b71Var) {
            r9 r9Var = this.f33773b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f2016w0;
                if (arrayList != null) {
                    arrayList.remove(r9Var);
                }
                this.f33772a.setOnFlingListener(null);
            }
            this.f33772a = b71Var;
            if (b71Var != null) {
                if (b71Var.getOnFlingListener() == null) {
                    this.f33772a.j(r9Var);
                    this.f33772a.setOnFlingListener(this);
                    new Scroller(this.f33772a.getContext(), new DecelerateInterpolator());
                    e();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f33775f = false;
        this.d = false;
        b71 b71Var = this.f33774c;
        if (b71Var != null) {
            b71Var.removeCallbacks(this.f33777i);
        }
    }

    public final View d(s4.n0 n0Var) {
        b71 b71Var;
        if (!this.e && (b71Var = this.f33774c) != null && b71Var.getScrollState() == 0) {
            z4 z4Var = this.f33778j;
            h71 n02 = z4Var.n0();
            if ((n02 == null || n02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (z4Var.o0()) {
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
        RecyclerView recyclerView = this.f33772a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.n0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f33772a.v0(i10, iArr[1], null);
        }
    }
}
