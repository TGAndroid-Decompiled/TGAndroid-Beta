package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class i51 extends wk0 {
    public f2.m0 T2;
    public final z41 U2;
    public f2.h0 V2;
    public boolean W2;
    public boolean X2;
    public boolean Y2;
    public f2.q1 Z2;
    public boolean a3;

    public i51(org.telegram.ui.ActionBar.o2 o2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getClassGuid(), false, callback2, callback5, callback5Return, o2Var.getResourceProvider());
    }

    public boolean A1() {
        return false;
    }

    public final void B1(Utilities.Callback2 callback2, boolean z10) {
        this.X2 = z10;
        f2.h0 h0Var = new f2.h0(new jh.f(this, 4));
        this.V2 = h0Var;
        h0Var.d(this);
        this.U2.H = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i9;
        Canvas canvas2;
        if (!b1()) {
            z41 z41Var = this.U2;
            ArrayList arrayList = z41Var.B;
            int i10 = 0;
            while (i10 < arrayList.size()) {
                x41 x41Var = (x41) arrayList.get(i10);
                int i11 = x41Var.f34505b;
                if (i11 < 0) {
                    canvas2 = canvas;
                } else {
                    int i12 = x41Var.f34504a;
                    if (z41Var.f35187n) {
                        i9 = org.telegram.ui.ActionBar.f6.f23072h5;
                    } else {
                        i9 = org.telegram.ui.ActionBar.f6.f23001d6;
                    }
                    canvas2 = canvas;
                    O0(canvas2, i12, i11, org.telegram.ui.ActionBar.f6.v0(i9, z41Var.v), 0, 0);
                }
                i10++;
                canvas = canvas2;
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        f2.m0 m0Var = this.T2;
        if (m0Var instanceof zy) {
            return ((zy) m0Var).J;
        }
        return -1;
    }

    @Override
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void q1(int i9, float f10, boolean z10) {
        s1(new mi(this, 3), new mh.c(6), i9, f10, new wu(this, 27), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.a3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i9) {
        f2.m0 m0Var = this.T2;
        if (m0Var instanceof zy) {
            ((zy) m0Var).y1(i9);
        } else if (m0Var != null && i9 != -1) {
            getContext();
            jh.h hVar = new jh.h(this, i9);
            hVar.O = new sr0(this, hVar, 1);
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
        AndroidUtilities.forEachViews((RecyclerView) this, (d5.d) new ha0(this, 1));
    }

    public final int x1(int i9) {
        int i10 = 0;
        while (true) {
            z41 z41Var = this.U2;
            if (i10 < z41Var.f35191x.size()) {
                l41 G = z41Var.G(i10);
                if (G != null && G.d == i9) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final View y1(int i9) {
        int i10 = 0;
        while (true) {
            z41 z41Var = this.U2;
            if (i10 < z41Var.f35191x.size()) {
                l41 G = z41Var.G(i10);
                if (G != null && G.d == i9) {
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

    public final View z1(Object obj) {
        int i9 = 0;
        while (true) {
            z41 z41Var = this.U2;
            if (i9 < z41Var.f35191x.size()) {
                l41 G = z41Var.G(i9);
                if (G != null && G.G == obj) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        return U0(i9);
    }

    public i51(Context context, int i9, int i10, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, i9, i10, z10, callback2, callback5, callback5Return, b6Var, -1, 1);
    }

    public i51(Context context, int i9, int i10, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.b6 b6Var, int i11, int i12) {
        super(context, b6Var);
        this.a3 = true;
        if (i11 == -1) {
            e51 e51Var = new e51(this, i12);
            this.T2 = e51Var;
            setLayoutManager(e51Var);
        } else {
            f51 f51Var = new f51(this, i11);
            f51Var.O = new g51(this, f51Var);
            this.T2 = f51Var;
            setLayoutManager(f51Var);
        }
        z41 z41Var = new z41(this, context, i9, i10, z10, callback2, b6Var);
        this.U2 = z41Var;
        setAdapter(z41Var);
        if (callback5 != null) {
            setOnItemClickListener(new g1(26, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new g1(27, this, callback5Return));
        }
        h51 h51Var = new h51(this);
        h51Var.f5532m = false;
        h51Var.C = false;
        h51Var.o(gr.h);
        h51Var.n(350L);
        setItemAnimator(h51Var);
    }

    public void C1() {
    }

    public void D1() {
    }

    public void E1(f2.q1 q1Var) {
    }

    public void F1(f2.q1 q1Var) {
    }

    public void G1(f2.q1 q1Var) {
    }

    public void H1() {
    }
}
