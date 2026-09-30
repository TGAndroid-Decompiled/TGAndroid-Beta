package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class u61 extends zl0 {
    public s4.c0 f28777e3;
    public final m61 f28778f3;
    public s4.y f28779g3;
    public boolean f28780h3;
    public boolean f28781i3;
    public boolean j3;
    public s4.c1 f28782k3;
    public boolean f28783l3;

    public u61(org.telegram.ui.ActionBar.m2 m2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(m2Var.getContext(), m2Var.getCurrentAccount(), m2Var.getClassGuid(), false, callback2, callback5, callback5Return, m2Var.getResourceProvider());
    }

    public final View A1(int i10) {
        int i11 = 0;
        while (true) {
            m61 m61Var = this.f28778f3;
            if (i11 < m61Var.f26226x.size()) {
                y51 G = m61Var.G(i11);
                if (G != null && G.d == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        return V0(i11);
    }

    public final View B1(Object obj) {
        int i10 = 0;
        while (true) {
            m61 m61Var = this.f28778f3;
            if (i10 < m61Var.f26226x.size()) {
                y51 G = m61Var.G(i10);
                if (G != null && G.G == obj) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        return V0(i10);
    }

    public boolean C1() {
        return false;
    }

    public final void D1(Utilities.Callback2 callback2, boolean z10) {
        this.f28781i3 = z10;
        s4.y yVar = new s4.y(new bi.g(this, 4));
        this.f28779g3 = yVar;
        yVar.e(this);
        this.f28778f3.L = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!c1()) {
            m61 m61Var = this.f28778f3;
            ArrayList arrayList = m61Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                k61 k61Var = (k61) arrayList.get(i11);
                int i12 = k61Var.f25659b;
                if (i12 >= 0) {
                    int i13 = k61Var.f25658a;
                    if (m61Var.f26222n) {
                        i10 = org.telegram.ui.ActionBar.h6.f19146h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f19076d6;
                    }
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i10, m61Var.v);
                    if (i12 >= i13 && i13 >= 0 && i12 >= 0) {
                        int i14 = Integer.MAX_VALUE;
                        int i15 = Integer.MIN_VALUE;
                        for (int i16 = 0; i16 < getChildCount(); i16++) {
                            View childAt = getChildAt(i16);
                            if (childAt != null) {
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= i13 && R <= i12) {
                                    i14 = Math.min(top, i14);
                                    i15 = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), i15);
                                }
                            }
                        }
                        if (i14 < i15) {
                            if (this.f31025u2 == null) {
                                this.f31025u2 = new Paint(1);
                            }
                            this.f31025u2.setColor(v02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f31025u2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.c0 c0Var = this.f28777e3;
        if (c0Var instanceof qz) {
            return ((qz) c0Var).J;
        }
        return -1;
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f28783l3 = z10;
    }

    public void setSpanCount(int i10) {
        s4.c0 c0Var = this.f28777e3;
        if (c0Var instanceof qz) {
            ((qz) c0Var).y1(i10);
        } else if (c0Var != null && i10 != -1) {
            getContext();
            bi.i iVar = new bi.i(this, i10);
            iVar.O = new at0(this, iVar, 1);
            this.f28777e3 = iVar;
            setLayoutManager(iVar);
        }
    }

    @Override
    public final void t1(int i10, float f7, boolean z10) {
        u1(new zi(this, 3), new ei.c(6), i10, f7, z10);
    }

    public final void y1(boolean z10) {
        if (this.j3 == z10) {
            return;
        }
        this.j3 = z10;
        this.f28778f3.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new y2(this, 13));
    }

    public final int z1(int i10) {
        int i11 = 0;
        while (true) {
            m61 m61Var = this.f28778f3;
            if (i11 < m61Var.f26226x.size()) {
                y51 G = m61Var.G(i11);
                if (G != null && G.d == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public u61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, d6Var, -1, 1);
    }

    public u61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var, int i12, int i13) {
        super(context, d6Var);
        this.f28783l3 = true;
        if (i12 == -1) {
            q61 q61Var = new q61(this, i13);
            this.f28777e3 = q61Var;
            setLayoutManager(q61Var);
        } else {
            r61 r61Var = new r61(this, i12);
            r61Var.O = new s61(this, r61Var);
            this.f28777e3 = r61Var;
            setLayoutManager(r61Var);
        }
        m61 m61Var = new m61(this, context, i10, i11, z10, callback2, d6Var);
        this.f28778f3 = m61Var;
        setAdapter(m61Var);
        if (callback5 != null) {
            setOnItemClickListener(new w2(18, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new w2(19, this, callback5Return));
        }
        t61 t61Var = new t61(this);
        t61Var.f43103m = false;
        t61Var.C = false;
        t61Var.o(tr.h);
        t61Var.n(350L);
        setItemAnimator(t61Var);
    }

    public void E1() {
    }

    public void F1() {
    }

    public void G1(s4.c1 c1Var) {
    }

    public void H1(s4.c1 c1Var) {
    }

    public void I1(s4.c1 c1Var) {
    }

    public void J1() {
    }
}
