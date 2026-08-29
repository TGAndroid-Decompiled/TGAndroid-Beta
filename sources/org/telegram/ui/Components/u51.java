package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class u51 extends jl0 {
    public f2.j0 T2;
    public final k51 U2;
    public f2.e0 V2;
    public boolean W2;
    public boolean X2;
    public boolean Y2;
    public f2.n1 Z2;
    public boolean f33144a3;

    public u51(org.telegram.ui.ActionBar.o2 o2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getClassGuid(), false, callback2, callback5, callback5Return, o2Var.getResourceProvider());
    }

    public boolean A1() {
        return false;
    }

    public final void B1(Utilities.Callback2 callback2, boolean z10) {
        this.X2 = z10;
        f2.e0 e0Var = new f2.e0(new mh.f(this, 4));
        this.V2 = e0Var;
        e0Var.d(this);
        this.U2.H = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        if (!b1()) {
            k51 k51Var = this.U2;
            ArrayList arrayList = k51Var.B;
            int i11 = 0;
            while (i11 < arrayList.size()) {
                i51 i51Var = (i51) arrayList.get(i11);
                int i12 = i51Var.f29323b;
                if (i12 < 0) {
                    canvas2 = canvas;
                } else {
                    int i13 = i51Var.f29322a;
                    if (k51Var.f29938n) {
                        i10 = org.telegram.ui.ActionBar.g6.f23133h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.g6.f23062d6;
                    }
                    canvas2 = canvas;
                    O0(canvas2, i13, i12, org.telegram.ui.ActionBar.g6.v0(i10, k51Var.v), 0, 0);
                }
                i11++;
                canvas = canvas2;
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        f2.j0 j0Var = this.T2;
        if (j0Var instanceof iz) {
            return ((iz) j0Var).J;
        }
        return -1;
    }

    @Override
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void q1(int i10, float f9, boolean z10) {
        s1(new pi(this, 3), new org.telegram.ui.rh(5), i10, f9, new cv(this, 27), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f33144a3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        f2.j0 j0Var = this.T2;
        if (j0Var instanceof iz) {
            ((iz) j0Var).y1(i10);
        } else if (j0Var != null && i10 != -1) {
            getContext();
            mh.h hVar = new mh.h(this, i10);
            hVar.O = new ds0(this, hVar, 1);
            this.T2 = hVar;
            setLayoutManager(hVar);
        }
    }

    public final void w1(boolean z10) {
        if (this.Y2 == z10) {
            return;
        }
        this.Y2 = z10;
        this.U2.I = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (f5.d) new va0(this, 1));
    }

    public final int x1(int i10) {
        int i11 = 0;
        while (true) {
            k51 k51Var = this.U2;
            if (i11 < k51Var.f29942x.size()) {
                w41 G = k51Var.G(i11);
                if (G != null && G.d == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final View y1(int i10) {
        int i11 = 0;
        while (true) {
            k51 k51Var = this.U2;
            if (i11 < k51Var.f29942x.size()) {
                w41 G = k51Var.G(i11);
                if (G != null && G.d == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        return U0(i11);
    }

    public final View z1(Object obj) {
        int i10 = 0;
        while (true) {
            k51 k51Var = this.U2;
            if (i10 < k51Var.f29942x.size()) {
                w41 G = k51Var.G(i10);
                if (G != null && G.G == obj) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        return U0(i10);
    }

    public u51(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, c6Var, -1, 1);
    }

    public u51(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.c6 c6Var, int i12, int i13) {
        super(context, c6Var);
        this.f33144a3 = true;
        if (i12 == -1) {
            q51 q51Var = new q51(this, i13);
            this.T2 = q51Var;
            setLayoutManager(q51Var);
        } else {
            r51 r51Var = new r51(this, i12);
            r51Var.O = new s51(this, r51Var);
            this.T2 = r51Var;
            setLayoutManager(r51Var);
        }
        k51 k51Var = new k51(this, context, i10, i11, z10, callback2, c6Var);
        this.U2 = k51Var;
        setAdapter(k51Var);
        if (callback5 != null) {
            setOnItemClickListener(new j1(26, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new j1(27, this, callback5Return));
        }
        t51 t51Var = new t51(this);
        t51Var.f6463m = false;
        t51Var.C = false;
        t51Var.o(jr.h);
        t51Var.n(350L);
        setItemAnimator(t51Var);
    }

    public void C1() {
    }

    public void D1() {
    }

    public void E1(f2.n1 n1Var) {
    }

    public void F1(f2.n1 n1Var) {
    }

    public void G1(f2.n1 n1Var) {
    }

    public void H1() {
    }
}
