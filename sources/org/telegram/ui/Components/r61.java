package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class r61 extends vl0 {
    public s4.c0 X2;
    public final j61 Y2;
    public s4.y Z2;
    public boolean f26604a3;
    public boolean f26605b3;
    public boolean f26606c3;
    public s4.c1 f26607d3;
    public boolean f26608e3;

    public r61(org.telegram.ui.ActionBar.p2 p2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getClassGuid(), false, callback2, callback5, callback5Return, p2Var.getResourceProvider());
    }

    public final void A1(Utilities.Callback2 callback2, boolean z10) {
        this.f26605b3 = z10;
        s4.y yVar = new s4.y(new ai.k(this, 4));
        this.Z2 = yVar;
        yVar.d(this);
        this.Y2.L = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!a1()) {
            j61 j61Var = this.Y2;
            ArrayList arrayList = j61Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                h61 h61Var = (h61) arrayList.get(i11);
                int i12 = h61Var.f23530b;
                if (i12 >= 0) {
                    int i13 = h61Var.f23529a;
                    if (j61Var.f24249n) {
                        i10 = org.telegram.ui.ActionBar.j6.f17998h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f17928d6;
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, j61Var.v);
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
                            if (this.f27997u2 == null) {
                                this.f27997u2 = new Paint(1);
                            }
                            this.f27997u2.setColor(v02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f27997u2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof uz) {
            return ((uz) c0Var).J;
        }
        return -1;
    }

    @Override
    public final void o1() {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void p1(int i10, float f7, boolean z10) {
        r1(new aj(this, 3), new di.c(6), i10, f7, new pv(this, 27), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f26608e3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof uz) {
            ((uz) c0Var).y1(i10);
        } else if (c0Var != null && i10 != -1) {
            getContext();
            ai.n nVar = new ai.n(this, i10);
            nVar.O = new vs0(this, nVar, 1);
            this.X2 = nVar;
            setLayoutManager(nVar);
        }
    }

    public final void v1(boolean z10) {
        if (this.f26606c3 == z10) {
            return;
        }
        this.f26606c3 = z10;
        this.Y2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (e2.h) new ib0(this, 1));
    }

    public final int w1(int i10) {
        int i11 = 0;
        while (true) {
            j61 j61Var = this.Y2;
            if (i11 < j61Var.f24253x.size()) {
                v51 G = j61Var.G(i11);
                if (G != null && G.d == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final View x1(int i10) {
        int i11 = 0;
        while (true) {
            j61 j61Var = this.Y2;
            if (i11 < j61Var.f24253x.size()) {
                v51 G = j61Var.G(i11);
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

    public final View y1(Object obj) {
        int i10 = 0;
        while (true) {
            j61 j61Var = this.Y2;
            if (i10 < j61Var.f24253x.size()) {
                v51 G = j61Var.G(i10);
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

    public boolean z1() {
        return false;
    }

    public r61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, f6Var, -1, 1);
    }

    public r61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var, int i12, int i13) {
        super(context, f6Var);
        this.f26608e3 = true;
        if (i12 == -1) {
            n61 n61Var = new n61(this, i13);
            this.X2 = n61Var;
            setLayoutManager(n61Var);
        } else {
            o61 o61Var = new o61(this, i12);
            o61Var.O = new p61(this, o61Var);
            this.X2 = o61Var;
            setLayoutManager(o61Var);
        }
        j61 j61Var = new j61(this, context, i10, i11, z10, callback2, f6Var);
        this.Y2 = j61Var;
        setAdapter(j61Var);
        if (callback5 != null) {
            setOnItemClickListener(new km(12, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new km(13, this, callback5Return));
        }
        q61 q61Var = new q61(this);
        q61Var.f41645m = false;
        q61Var.C = false;
        q61Var.o(wr.h);
        q61Var.n(350L);
        setItemAnimator(q61Var);
    }

    public void B1() {
    }

    public void C1() {
    }

    public void D1(s4.c1 c1Var) {
    }

    public void E1(s4.c1 c1Var) {
    }

    public void F1(s4.c1 c1Var) {
    }

    public void G1() {
    }
}
