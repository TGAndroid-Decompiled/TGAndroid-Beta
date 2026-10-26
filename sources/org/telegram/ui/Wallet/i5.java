package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.r71;
public final class i5 extends s4.s0 {
    public RecyclerView f36672a;
    public l71 f36674c;
    public boolean d;
    public boolean e;
    public boolean f36675f;
    public float f36676g;
    public float h;
    public final m5 f36678j;
    public final fi.a9 f36673b = new fi.a9(this);
    public final m f36677i = new m(this, 8);

    public i5(m5 m5Var) {
        this.f36678j = m5Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.i5.a(int, int):boolean");
    }

    public final void b(l71 l71Var) {
        l71 l71Var2 = this.f36674c;
        if (l71Var2 != null) {
            l71Var2.removeCallbacks(this.f36677i);
        }
        this.f36674c = l71Var;
        RecyclerView recyclerView = this.f36672a;
        if (recyclerView != l71Var) {
            fi.a9 a9Var = this.f36673b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f3083w0;
                if (arrayList != null) {
                    arrayList.remove(a9Var);
                }
                this.f36672a.setOnFlingListener(null);
            }
            this.f36672a = l71Var;
            if (l71Var != null) {
                if (l71Var.getOnFlingListener() == null) {
                    this.f36672a.j(a9Var);
                    this.f36672a.setOnFlingListener(this);
                    new Scroller(this.f36672a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f36675f = false;
        this.d = false;
        l71 l71Var = this.f36674c;
        if (l71Var != null) {
            l71Var.removeCallbacks(this.f36677i);
        }
    }

    public final View d(s4.p0 p0Var) {
        l71 l71Var;
        if (!this.e && (l71Var = this.f36674c) != null && l71Var.getScrollState() == 0) {
            m5 m5Var = this.f36678j;
            r71 u02 = m5Var.u0();
            if ((u02 == null || u02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (m5Var.v0()) {
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

    public final void e(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c();
            this.e = true;
            this.f36676g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f36676g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f36674c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f36675f = z10;
            if (!z10) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.e = false;
            }
        }
    }

    public final void f() {
        s4.p0 layoutManager;
        View d;
        RecyclerView recyclerView = this.f36672a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.p0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f36672a.w0(i10, iArr[1], null);
        }
    }
}
