package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.g51;
public final class k6 extends v4.s0 {
    public RecyclerView f44573a;
    public bi.i6 f44575c;
    public boolean d;
    public boolean f44576e;
    public boolean f44577f;
    public float f44578g;
    public float h;
    public final o6 f44580j;
    public final hi.z8 f44574b = new hi.z8(this);
    public final m f44579i = new m(this, 8);

    public k6(o6 o6Var) {
        this.f44580j = o6Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.k6.a(int, int):boolean");
    }

    public final void b(bi.i6 i6Var) {
        bi.i6 i6Var2 = this.f44575c;
        if (i6Var2 != null) {
            i6Var2.removeCallbacks(this.f44579i);
        }
        this.f44575c = i6Var;
        RecyclerView recyclerView = this.f44573a;
        if (recyclerView != i6Var) {
            hi.z8 z8Var = this.f44574b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f2792x0;
                if (arrayList != null) {
                    arrayList.remove(z8Var);
                }
                this.f44573a.setOnFlingListener(null);
            }
            this.f44573a = i6Var;
            if (i6Var != null) {
                if (i6Var.getOnFlingListener() == null) {
                    this.f44573a.j(z8Var);
                    this.f44573a.setOnFlingListener(this);
                    new Scroller(this.f44573a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.f44576e = false;
        this.f44577f = false;
        this.d = false;
        bi.i6 i6Var = this.f44575c;
        if (i6Var != null) {
            i6Var.removeCallbacks(this.f44579i);
        }
    }

    public final View d(v4.p0 p0Var) {
        bi.i6 i6Var;
        if (!this.f44576e && (i6Var = this.f44575c) != null && i6Var.getScrollState() == 0) {
            o6 o6Var = this.f44580j;
            g51 B0 = o6Var.B0();
            if ((B0 == null || B0.getScrollState() == 0) && this.d) {
                this.d = false;
                if (o6Var.C0()) {
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
            this.f44576e = true;
            this.f44578g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f44578g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f44575c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f44577f = z10;
            if (!z10) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.f44576e = false;
            }
        }
    }

    public final void f() {
        v4.p0 layoutManager;
        View d;
        RecyclerView recyclerView = this.f44573a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, v4.p0.z(d) - layoutManager.F()};
            int i7 = iArr[0];
            if (i7 == 0 && iArr[1] == 0) {
                return;
            }
            this.f44573a.w0(i7, iArr[1], null);
        }
    }
}
