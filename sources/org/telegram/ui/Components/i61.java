package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class i61 extends tl0 {
    public f2.j0 U2;
    public final x51 V2;
    public f2.f0 W2;
    public boolean X2;
    public boolean Y2;
    public boolean Z2;
    public f2.m1 f27679a3;
    public boolean f27680b3;

    public i61(org.telegram.ui.ActionBar.p2 p2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getClassGuid(), false, callback2, callback5, callback5Return, p2Var.getResourceProvider());
    }

    public boolean A1() {
        return false;
    }

    public final void B1(Utilities.Callback2 callback2, boolean z4) {
        this.Y2 = z4;
        f2.f0 f0Var = new f2.f0(new org.telegram.ui.cp(this, 3));
        this.W2 = f0Var;
        f0Var.d(this);
        this.V2.I = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        if (!b1()) {
            x51 x51Var = this.V2;
            ArrayList arrayList = x51Var.C;
            int i11 = 0;
            while (i11 < arrayList.size()) {
                v51 v51Var = (v51) arrayList.get(i11);
                int i12 = v51Var.f31813b;
                if (i12 < 0) {
                    canvas2 = canvas;
                } else {
                    int i13 = v51Var.f31812a;
                    if (x51Var.f32956n) {
                        i10 = org.telegram.ui.ActionBar.k6.f21731h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f21659d6;
                    }
                    canvas2 = canvas;
                    O0(canvas2, i13, i12, org.telegram.ui.ActionBar.k6.v0(i10, x51Var.v), 0, 0);
                }
                i11++;
                canvas = canvas2;
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        f2.j0 j0Var = this.U2;
        if (j0Var instanceof pz) {
            return ((pz) j0Var).J;
        }
        return -1;
    }

    @Override
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void q1(int i10, float f10, boolean z4) {
        s1(new oi(this, 3), new org.telegram.ui.wh(5), i10, f10, new hv(this, 27), z4);
    }

    public void setReorderLongPressEnabled(boolean z4) {
        this.f27680b3 = z4;
    }

    @Override
    public void setSections(boolean z4) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z4);
    }

    public void setSpanCount(int i10) {
        f2.j0 j0Var = this.U2;
        if (j0Var instanceof pz) {
            ((pz) j0Var).y1(i10);
        } else if (j0Var != null && i10 != -1) {
            getContext();
            h61 h61Var = new h61(this, i10);
            h61Var.O = new ms0(this, h61Var, 1);
            this.U2 = h61Var;
            setLayoutManager(h61Var);
        }
    }

    public final void w1(boolean z4) {
        if (this.Z2 == z4) {
            return;
        }
        this.Z2 = z4;
        this.V2.J = z4;
        AndroidUtilities.forEachViews((RecyclerView) this, (h5.d) new cb0(this, 1));
    }

    public final int x1(int i10) {
        int i11 = 0;
        while (true) {
            x51 x51Var = this.V2;
            if (i11 < x51Var.f32960x.size()) {
                j51 G = x51Var.G(i11);
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
            x51 x51Var = this.V2;
            if (i11 < x51Var.f32960x.size()) {
                j51 G = x51Var.G(i11);
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
            x51 x51Var = this.V2;
            if (i10 < x51Var.f32960x.size()) {
                j51 G = x51Var.G(i10);
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

    public i61(Context context, int i10, int i11, boolean z4, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, i10, i11, z4, callback2, callback5, callback5Return, g6Var, -1, 1);
    }

    public i61(Context context, int i10, int i11, boolean z4, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.g6 g6Var, int i12, int i13) {
        super(context, g6Var);
        this.f27680b3 = true;
        if (i12 == -1) {
            d61 d61Var = new d61(this, i13);
            this.U2 = d61Var;
            setLayoutManager(d61Var);
        } else {
            e61 e61Var = new e61(this, i12);
            e61Var.O = new f61(this, e61Var);
            this.U2 = e61Var;
            setLayoutManager(e61Var);
        }
        x51 x51Var = new x51(this, context, i10, i11, z4, callback2, g6Var);
        this.V2 = x51Var;
        setAdapter(x51Var);
        if (callback5 != null) {
            setOnItemClickListener(new o1(25, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new o1(26, this, callback5Return));
        }
        g61 g61Var = new g61(this);
        g61Var.f5910m = false;
        g61Var.C = false;
        g61Var.o(pr.h);
        g61Var.n(350L);
        setItemAnimator(g61Var);
    }

    public void C1() {
    }

    public void D1() {
    }

    public void E1(f2.m1 m1Var) {
    }

    public void F1(f2.m1 m1Var) {
    }

    public void G1(f2.m1 m1Var) {
    }

    public void H1() {
    }
}
