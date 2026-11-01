package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.v51;
public final class x5 extends s4.q0 {
    public RecyclerView f35388a;
    public ii f35390c;
    public boolean d;
    public boolean e;
    public boolean f35391f;
    public float f35392g;
    public float h;
    public final b6 f35394j;
    public final ul f35389b = new ul(this);
    public final l f35393i = new l(this, 8);

    public x5(b6 b6Var) {
        this.f35394j = b6Var;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x5.a(int, int):boolean");
    }

    public final void b(ii iiVar) {
        ii iiVar2 = this.f35390c;
        if (iiVar2 != null) {
            iiVar2.removeCallbacks(this.f35393i);
        }
        this.f35390c = iiVar;
        RecyclerView recyclerView = this.f35388a;
        if (recyclerView != iiVar) {
            ul ulVar = this.f35389b;
            if (recyclerView != null) {
                ArrayList arrayList = recyclerView.f1921w0;
                if (arrayList != null) {
                    arrayList.remove(ulVar);
                }
                this.f35388a.setOnFlingListener(null);
            }
            this.f35388a = iiVar;
            if (iiVar != null) {
                if (iiVar.getOnFlingListener() == null) {
                    this.f35388a.j(ulVar);
                    this.f35388a.setOnFlingListener(this);
                    new Scroller(this.f35388a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f35391f = false;
        this.d = false;
        ii iiVar = this.f35390c;
        if (iiVar != null) {
            iiVar.removeCallbacks(this.f35393i);
        }
    }

    public final View d(s4.n0 n0Var) {
        ii iiVar;
        if (!this.e && (iiVar = this.f35390c) != null && iiVar.getScrollState() == 0) {
            b6 b6Var = this.f35394j;
            v51 y02 = b6Var.y0();
            if ((y02 == null || y02.getScrollState() == 0) && this.d) {
                this.d = false;
                if (b6Var.z0()) {
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
            this.f35392g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.f35392g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.f35390c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f35391f = z10;
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
        RecyclerView recyclerView = this.f35388a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, s4.n0.z(d) - layoutManager.F()};
            int i10 = iArr[0];
            if (i10 == 0 && iArr[1] == 0) {
                return;
            }
            this.f35388a.w0(i10, iArr[1], null);
        }
    }
}
