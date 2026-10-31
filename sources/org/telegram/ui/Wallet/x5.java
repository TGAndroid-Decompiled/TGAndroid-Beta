package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ul;
public final class x5 extends s4.q0 {
    public RecyclerView f35382a;
    public ii f35384c;
    public boolean d;
    public boolean e;
    public boolean f35385f;
    public float f35386g;
    public float h;
    public final b6 f35388j;
    public final ul f35383b = new ul(this);
    public final l f35387i = new l(this, 8);

    public x5(b6 b6Var) {
        this.f35388j = b6Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x5.a(int, int):boolean");
    }

    public final void b(ii iiVar) {
        ii iiVar2 = this.f35384c;
        if (iiVar2 != null) {
            iiVar2.removeCallbacks(this.f35387i);
        }
        this.f35384c = iiVar;
        RecyclerView recyclerView = this.f35382a;
        if (recyclerView != iiVar) {
            ul ulVar = this.f35383b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f1921w0;
                if (arrayList != null) {
                    arrayList.remove(ulVar);
                }
                this.f35382a.setOnFlingListener(null);
            }
            this.f35382a = iiVar;
            if (iiVar != null) {
                if (iiVar.getOnFlingListener() == null) {
                    this.f35382a.j(ulVar);
                    this.f35382a.setOnFlingListener(this);
                    new Scroller(this.f35382a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f35385f = false;
        this.d = false;
        ii iiVar = this.f35384c;
        if (iiVar != null) {
            iiVar.removeCallbacks(this.f35387i);
        }
    }

    public final View d(s4.n0 n0Var) {
        ii iiVar;
        if (!this.e && (iiVar = this.f35384c) != null && iiVar.getScrollState() == 0) {
            b6 b6Var = this.f35388j;
            u51 x02 = b6Var.x0();
            if ((x02 == null || x02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (b6Var.y0()) {
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

    public final void e(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c();
            this.e = true;
            this.f35386g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f35386g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f35384c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f35385f = z10;
            if (!z10) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.e = false;
            }
        }
    }

    public final void f() {
        s4.n0 layoutManager;
        View d;
        RecyclerView recyclerView = this.f35382a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.n0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f35382a.w0(i10, iArr[1], null);
        }
    }
}
