package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class k51 extends zk0 {
    public f2.k0 T2;
    public final b51 U2;
    public f2.f0 V2;
    public boolean W2;
    public boolean X2;
    public boolean Y2;
    public f2.o1 Z2;
    public boolean a3;

    public k51(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public boolean A1() {
        return false;
    }

    public final void B1(Utilities.Callback2 callback2, boolean z10) {
        this.X2 = z10;
        f2.f0 f0Var = new f2.f0(new kh.g(this, 4));
        this.V2 = f0Var;
        f0Var.d(this);
        this.U2.H = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!b1()) {
            b51 b51Var = this.U2;
            ArrayList arrayList = b51Var.B;
            int i10 = 0;
            while (i10 < arrayList.size()) {
                z41 z41Var = (z41) arrayList.get(i10);
                int i11 = z41Var.f35150b;
                if (i11 < 0) {
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    O0(canvas2, z41Var.f35149a, i11, org.telegram.ui.ActionBar.g6.v0(b51Var.f26941n ? org.telegram.ui.ActionBar.g6.f23124h5 : org.telegram.ui.ActionBar.g6.f23053d6, b51Var.v), 0, 0);
                }
                i10++;
                canvas = canvas2;
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        f2.k0 k0Var = this.T2;
        if (k0Var instanceof bz) {
            return ((bz) k0Var).J;
        }
        return -1;
    }

    @Override
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void q1(int i10, float f10, boolean z10) {
        s1(new ii(this, 3), new nh.c(6), i10, f10, new vu(this, 27), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.a3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        f2.k0 k0Var = this.T2;
        if (k0Var instanceof bz) {
            ((bz) k0Var).y1(i10);
            return;
        }
        if (k0Var == null || i10 == -1) {
            return;
        }
        getContext();
        kh.i iVar = new kh.i(this, i10);
        iVar.O = new tr0(this, iVar, 1);
        this.T2 = iVar;
        setLayoutManager(iVar);
    }

    public final void w1(boolean z10) {
        if (this.Y2 == z10) {
            return;
        }
        this.Y2 = z10;
        this.U2.I = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (d5.d) new la0(this, 1));
    }

    public final int x1(int i10) {
        int i11 = 0;
        while (true) {
            b51 b51Var = this.U2;
            if (i11 >= b51Var.f26945x.size()) {
                return -1;
            }
            n41 n41VarG = b51Var.G(i11);
            if (n41VarG != null && n41VarG.d == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final View y1(int i10) {
        int i11 = 0;
        while (true) {
            b51 b51Var = this.U2;
            if (i11 >= b51Var.f26945x.size()) {
                i11 = -1;
                break;
            }
            n41 n41VarG = b51Var.G(i11);
            if (n41VarG != null && n41VarG.d == i10) {
                break;
            }
            i11++;
        }
        return U0(i11);
    }

    public final View z1(Object obj) {
        int i10 = 0;
        while (true) {
            b51 b51Var = this.U2;
            if (i10 >= b51Var.f26945x.size()) {
                i10 = -1;
                break;
            }
            n41 n41VarG = b51Var.G(i10);
            if (n41VarG != null && n41VarG.G == obj) {
                break;
            }
            i10++;
        }
        return U0(i10);
    }

    public k51(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, c6Var, -1, 1);
    }

    public k51(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.c6 c6Var, int i12, int i13) {
        super(context, c6Var);
        this.a3 = true;
        if (i12 == -1) {
            g51 g51Var = new g51(this, i13);
            this.T2 = g51Var;
            setLayoutManager(g51Var);
        } else {
            h51 h51Var = new h51(this, i12);
            h51Var.O = new i51(this, h51Var);
            this.T2 = h51Var;
            setLayoutManager(h51Var);
        }
        b51 b51Var = new b51(this, context, i10, i11, z10, callback2, c6Var);
        this.U2 = b51Var;
        setAdapter(b51Var);
        if (callback5 != null) {
            setOnItemClickListener(new g1(26, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new g1(27, this, callback5Return));
        }
        j51 j51Var = new j51(this);
        j51Var.f5819m = false;
        j51Var.C = false;
        j51Var.o(er.h);
        j51Var.n(350L);
        setItemAnimator(j51Var);
    }

    public void C1() {
    }

    public void D1() {
    }

    public void E1(f2.o1 o1Var) {
    }

    public void F1(f2.o1 o1Var) {
    }

    public void G1(f2.o1 o1Var) {
    }

    public void H1() {
    }
}
