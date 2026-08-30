package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class g61 extends sl0 {
    public f2.i0 U2;
    public final w51 V2;
    public f2.e0 W2;
    public boolean X2;
    public boolean Y2;
    public boolean Z2;
    public f2.l1 f25064a3;
    public boolean f25065b3;

    public g61(org.telegram.ui.ActionBar.p2 p2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getClassGuid(), false, callback2, callback5, callback5Return, p2Var.getResourceProvider());
    }

    public boolean A1() {
        return false;
    }

    public final void B1(Utilities.Callback2 callback2, boolean z4) {
        this.Y2 = z4;
        f2.e0 e0Var = new f2.e0(new oh.f(this, 4));
        this.W2 = e0Var;
        e0Var.d(this);
        this.V2.I = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        if (!b1()) {
            w51 w51Var = this.V2;
            ArrayList arrayList = w51Var.C;
            int i11 = 0;
            while (i11 < arrayList.size()) {
                u51 u51Var = (u51) arrayList.get(i11);
                int i12 = u51Var.f29110b;
                if (i12 < 0) {
                    canvas2 = canvas;
                } else {
                    int i13 = u51Var.f29109a;
                    if (w51Var.f30239n) {
                        i10 = org.telegram.ui.ActionBar.j6.f19977h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19906d6;
                    }
                    canvas2 = canvas;
                    O0(canvas2, i13, i12, org.telegram.ui.ActionBar.j6.v0(i10, w51Var.v), 0, 0);
                }
                i11++;
                canvas = canvas2;
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        f2.i0 i0Var = this.U2;
        if (i0Var instanceof nz) {
            return ((nz) i0Var).J;
        }
        return -1;
    }

    @Override
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void q1(int i10, float f10, boolean z4) {
        s1(new ni(this, 3), new org.telegram.ui.wh(5), i10, f10, new fv(this, 27), z4);
    }

    public void setReorderLongPressEnabled(boolean z4) {
        this.f25065b3 = z4;
    }

    @Override
    public void setSections(boolean z4) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z4);
    }

    public void setSpanCount(int i10) {
        f2.i0 i0Var = this.U2;
        if (i0Var instanceof nz) {
            ((nz) i0Var).y1(i10);
        } else if (i0Var != null && i10 != -1) {
            getContext();
            oh.h hVar = new oh.h(this, i10);
            hVar.O = new ls0(this, hVar, 1);
            this.U2 = hVar;
            setLayoutManager(hVar);
        }
    }

    public final void w1(boolean z4) {
        if (this.Z2 == z4) {
            return;
        }
        this.Z2 = z4;
        this.V2.J = z4;
        AndroidUtilities.forEachViews((RecyclerView) this, (h5.d) new ab0(this, 1));
    }

    public final int x1(int i10) {
        int i11 = 0;
        while (true) {
            w51 w51Var = this.V2;
            if (i11 < w51Var.f30243x.size()) {
                i51 G = w51Var.G(i11);
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
            w51 w51Var = this.V2;
            if (i11 < w51Var.f30243x.size()) {
                i51 G = w51Var.G(i11);
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
            w51 w51Var = this.V2;
            if (i10 < w51Var.f30243x.size()) {
                i51 G = w51Var.G(i10);
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

    public g61(Context context, int i10, int i11, boolean z4, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, i11, z4, callback2, callback5, callback5Return, f6Var, -1, 1);
    }

    public g61(Context context, int i10, int i11, boolean z4, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var, int i12, int i13) {
        super(context, f6Var);
        this.f25065b3 = true;
        if (i12 == -1) {
            c61 c61Var = new c61(this, i13);
            this.U2 = c61Var;
            setLayoutManager(c61Var);
        } else {
            d61 d61Var = new d61(this, i12);
            d61Var.O = new e61(this, d61Var);
            this.U2 = d61Var;
            setLayoutManager(d61Var);
        }
        w51 w51Var = new w51(this, context, i10, i11, z4, callback2, f6Var);
        this.V2 = w51Var;
        setAdapter(w51Var);
        if (callback5 != null) {
            setOnItemClickListener(new o1(25, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new o1(26, this, callback5Return));
        }
        f61 f61Var = new f61(this);
        f61Var.f5818m = false;
        f61Var.C = false;
        f61Var.o(nr.h);
        f61Var.n(350L);
        setItemAnimator(f61Var);
    }

    public void C1() {
    }

    public void D1() {
    }

    public void E1(f2.l1 l1Var) {
    }

    public void F1(f2.l1 l1Var) {
    }

    public void G1(f2.l1 l1Var) {
    }

    public void H1() {
    }
}
