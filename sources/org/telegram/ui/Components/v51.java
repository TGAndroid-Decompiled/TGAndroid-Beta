package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class v51 extends uk0 {
    public s4.a0 f31182e3;
    public final q51 f31183f3;
    public s4.x f31184g3;
    public boolean f31185h3;
    public boolean f31186i3;
    public boolean f31187j3;
    public s4.c1 f31188k3;
    public boolean f31189l3;

    public v51(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.k20 k20Var, org.telegram.messenger.p20 p20Var, org.telegram.messenger.q20 q20Var) {
        this(k2Var.getContext(), k2Var.getCurrentAccount(), k2Var.getClassGuid(), false, k20Var, p20Var, q20Var, k2Var.getResourceProvider());
    }

    public final int A1(int i10) {
        int i11 = 0;
        while (true) {
            q51 q51Var = this.f31183f3;
            if (i11 < q51Var.D.size()) {
                b51 G = q51Var.G(i11);
                if (G != null && G.d == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final View B1(int i10) {
        int i11 = 0;
        while (true) {
            q51 q51Var = this.f31183f3;
            if (i11 < q51Var.D.size()) {
                b51 G = q51Var.G(i11);
                if (G != null && G.d == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        return T0(i11);
    }

    public final View C1(Object obj) {
        int i10 = 0;
        while (true) {
            q51 q51Var = this.f31183f3;
            if (i10 < q51Var.D.size()) {
                b51 G = q51Var.G(i10);
                if (G != null && G.G == obj) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        return T0(i10);
    }

    public boolean D1() {
        return false;
    }

    public final void E1(org.telegram.messenger.k20 k20Var, boolean z10) {
        this.f31186i3 = z10;
        s4.x xVar = new s4.x(new org.telegram.ui.ja(this, 6));
        this.f31184g3 = xVar;
        xVar.h(this);
        this.f31183f3.M = k20Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!b1()) {
            q51 q51Var = this.f31183f3;
            ArrayList arrayList = q51Var.G;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                n51 n51Var = (n51) arrayList.get(i11);
                int i12 = n51Var.f28676b;
                if (i12 >= 0) {
                    int i13 = n51Var.f28675a;
                    if (q51Var.f29637n) {
                        i10 = org.telegram.ui.ActionBar.t6.f21002h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.t6.f20930d6;
                    }
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i10, q51Var.f29641x);
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
                            if (this.f31018s2 == null) {
                                this.f31018s2 = new Paint(1);
                            }
                            this.f31018s2.setColor(w02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f31018s2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.a0 a0Var = this.f31182e3;
        if (a0Var instanceof yy) {
            return ((yy) a0Var).J;
        }
        return -1;
    }

    @Override
    public final void s1(int i10, float f7, boolean z10) {
        t1(new di(this, 3), new org.telegram.ui.zh(5), i10, f7, z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f31189l3 = z10;
    }

    public void setSpanCount(int i10) {
        s4.a0 a0Var = this.f31182e3;
        if (a0Var instanceof yy) {
            ((yy) a0Var).y1(i10);
        } else if (a0Var != null && i10 != -1) {
            getContext();
            t51 t51Var = new t51(this, i10, 1);
            t51Var.O = new tr0(this, t51Var, 2);
            this.f31182e3 = t51Var;
            setLayoutManager(t51Var);
        }
    }

    public final void z1(boolean z10) {
        if (this.f31187j3 == z10) {
            return;
        }
        this.f31187j3 = z10;
        this.f31183f3.N = z10;
        org.telegram.messenger.i0.d0(this, new r2(this, 12));
    }

    public v51(Context context, int i10, int i11, boolean z10, org.telegram.messenger.k20 k20Var, org.telegram.messenger.p20 p20Var, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, i10, i11, z10, k20Var, p20Var, q20Var, p6Var, -1, 1);
    }

    public v51(Context context, int i10, int i11, boolean z10, org.telegram.messenger.k20 k20Var, org.telegram.messenger.p20 p20Var, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var, int i12, int i13) {
        super(context, p6Var);
        this.f31189l3 = true;
        if (i12 == -1) {
            org.telegram.ui.br brVar = new org.telegram.ui.br(this, i13);
            this.f31182e3 = brVar;
            setLayoutManager(brVar);
        } else {
            t51 t51Var = new t51(this, i12, 0);
            t51Var.O = new tr0(this, t51Var, 1);
            this.f31182e3 = t51Var;
            setLayoutManager(t51Var);
        }
        q51 q51Var = new q51(this, context, i10, i11, z10, k20Var, p6Var);
        this.f31183f3 = q51Var;
        setAdapter(q51Var);
        if (p20Var != null) {
            setOnItemClickListener(new f2(21, this, p20Var));
        }
        if (q20Var != null) {
            setOnItemLongClickListener(new f2(22, this, q20Var));
        }
        u51 u51Var = new u51(this);
        u51Var.f47938m = false;
        u51Var.C = false;
        u51Var.o(gr.h);
        u51Var.n(350L);
        setItemAnimator(u51Var);
    }

    public void H1(s4.c1 c1Var) {
    }

    public void I1(s4.c1 c1Var) {
    }

    public void J1(s4.c1 c1Var) {
    }

    public void F1() {
    }

    public void G1() {
    }

    public void K1() {
    }
}
