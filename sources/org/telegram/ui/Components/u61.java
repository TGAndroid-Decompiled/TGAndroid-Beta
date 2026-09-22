package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class u61 extends yl0 {
    public s4.c0 X2;
    public final m61 Y2;
    public s4.y Z2;
    public boolean f28682a3;
    public boolean f28683b3;
    public boolean f28684c3;
    public s4.c1 f28685d3;
    public boolean f28686e3;

    public u61(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public final View A1(Object obj) {
        int i10 = 0;
        while (true) {
            m61 m61Var = this.Y2;
            if (i10 < m61Var.f26345x.size()) {
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

    public boolean B1() {
        return false;
    }

    public final void C1(Utilities.Callback2 callback2, boolean z10) {
        this.f28683b3 = z10;
        s4.y yVar = new s4.y(new bi.g(this, 4));
        this.Z2 = yVar;
        yVar.e(this);
        this.Y2.L = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!c1()) {
            m61 m61Var = this.Y2;
            ArrayList arrayList = m61Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                k61 k61Var = (k61) arrayList.get(i11);
                int i12 = k61Var.f25638b;
                if (i12 >= 0) {
                    int i13 = k61Var.f25637a;
                    if (m61Var.f26341n) {
                        i10 = org.telegram.ui.ActionBar.j6.f19180h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19109d6;
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, m61Var.v);
                    if (i12 >= i13 && i13 >= 0 && i12 >= 0) {
                        int i14 = Integer.MAX_VALUE;
                        int i15 = Integer.MIN_VALUE;
                        for (int i16 = 0; i16 < getChildCount(); i16++) {
                            View childAt = getChildAt(i16);
                            if (childAt != null) {
                                int S = RecyclerView.S(childAt);
                                int top = childAt.getTop();
                                if (S >= i13 && S <= i12) {
                                    i14 = Math.min(top, i14);
                                    i15 = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), i15);
                                }
                            }
                        }
                        if (i14 < i15) {
                            if (this.f30714u2 == null) {
                                this.f30714u2 = new Paint(1);
                            }
                            this.f30714u2.setColor(v02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f30714u2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof nz) {
            return ((nz) c0Var).J;
        }
        return -1;
    }

    @Override
    public final void q1() {
        r1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void r1(int i10, float f7, boolean z10) {
        t1(new xi(this, 3), new ei.c(6), i10, f7, new mv(this, 28), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f28686e3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        r1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof nz) {
            ((nz) c0Var).y1(i10);
        } else if (c0Var != null && i10 != -1) {
            getContext();
            bi.i iVar = new bi.i(this, i10);
            iVar.O = new zs0(this, iVar, 1);
            this.X2 = iVar;
            setLayoutManager(iVar);
        }
    }

    public final void x1(boolean z10) {
        if (this.f28684c3 == z10) {
            return;
        }
        this.f28684c3 = z10;
        this.Y2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (e2.h) new jb0(this, 1));
    }

    public final int y1(int i10) {
        int i11 = 0;
        while (true) {
            m61 m61Var = this.Y2;
            if (i11 < m61Var.f26345x.size()) {
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

    public final View z1(int i10) {
        int i11 = 0;
        while (true) {
            m61 m61Var = this.Y2;
            if (i11 < m61Var.f26345x.size()) {
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

    public u61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, f6Var, -1, 1);
    }

    public u61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var, int i12, int i13) {
        super(context, f6Var);
        this.f28686e3 = true;
        if (i12 == -1) {
            q61 q61Var = new q61(this, i13);
            this.X2 = q61Var;
            setLayoutManager(q61Var);
        } else {
            r61 r61Var = new r61(this, i12);
            r61Var.O = new s61(this, r61Var);
            this.X2 = r61Var;
            setLayoutManager(r61Var);
        }
        m61 m61Var = new m61(this, context, i10, i11, z10, callback2, f6Var);
        this.Y2 = m61Var;
        setAdapter(m61Var);
        if (callback5 != null) {
            setOnItemClickListener(new a3(17, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new a3(18, this, callback5Return));
        }
        t61 t61Var = new t61(this);
        t61Var.f43030m = false;
        t61Var.C = false;
        t61Var.o(qr.h);
        t61Var.n(350L);
        setItemAnimator(t61Var);
    }

    public void D1() {
    }

    public void E1() {
    }

    public void F1(s4.c1 c1Var) {
    }

    public void G1(s4.c1 c1Var) {
    }

    public void H1(s4.c1 c1Var) {
    }

    public void I1() {
    }
}
