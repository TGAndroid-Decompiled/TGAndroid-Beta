package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class r61 extends wl0 {
    public s4.c0 X2;
    public final j61 Y2;
    public s4.y Z2;
    public boolean f27885a3;
    public boolean f27886b3;
    public boolean f27887c3;
    public s4.c1 f27888d3;
    public boolean f27889e3;

    public r61(org.telegram.ui.ActionBar.m2 m2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(m2Var.getContext(), m2Var.getCurrentAccount(), m2Var.getClassGuid(), false, callback2, callback5, callback5Return, m2Var.getResourceProvider());
    }

    public boolean A1() {
        return false;
    }

    public final void B1(Utilities.Callback2 callback2, boolean z10) {
        this.f27886b3 = z10;
        s4.y yVar = new s4.y(new bi.g(this, 4));
        this.Z2 = yVar;
        yVar.e(this);
        this.Y2.L = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!b1()) {
            j61 j61Var = this.Y2;
            ArrayList arrayList = j61Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                h61 h61Var = (h61) arrayList.get(i11);
                int i12 = h61Var.f24651b;
                if (i12 >= 0) {
                    int i13 = h61Var.f24650a;
                    if (j61Var.f25290n) {
                        i10 = org.telegram.ui.ActionBar.h6.f19130h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f19060d6;
                    }
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i10, j61Var.v);
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
                            if (this.f30125u2 == null) {
                                this.f30125u2 = new Paint(1);
                            }
                            this.f30125u2.setColor(v02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f30125u2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof oz) {
            return ((oz) c0Var).J;
        }
        return -1;
    }

    @Override
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void q1(int i10, float f7, boolean z10) {
        s1(new yi(this, 3), new ei.c(6), i10, f7, new mv(this, 28), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f27889e3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof oz) {
            ((oz) c0Var).y1(i10);
        } else if (c0Var != null && i10 != -1) {
            getContext();
            bi.i iVar = new bi.i(this, i10);
            iVar.O = new xs0(this, iVar, 1);
            this.X2 = iVar;
            setLayoutManager(iVar);
        }
    }

    public final void w1(boolean z10) {
        if (this.f27887c3 == z10) {
            return;
        }
        this.f27887c3 = z10;
        this.Y2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new y2(this, 13));
    }

    public final int x1(int i10) {
        int i11 = 0;
        while (true) {
            j61 j61Var = this.Y2;
            if (i11 < j61Var.f25294x.size()) {
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

    public final View y1(int i10) {
        int i11 = 0;
        while (true) {
            j61 j61Var = this.Y2;
            if (i11 < j61Var.f25294x.size()) {
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
        return U0(i11);
    }

    public final View z1(Object obj) {
        int i10 = 0;
        while (true) {
            j61 j61Var = this.Y2;
            if (i10 < j61Var.f25294x.size()) {
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
        return U0(i10);
    }

    public r61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, d6Var, -1, 1);
    }

    public r61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var, int i12, int i13) {
        super(context, d6Var);
        this.f27889e3 = true;
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
        j61 j61Var = new j61(this, context, i10, i11, z10, callback2, d6Var);
        this.Y2 = j61Var;
        setAdapter(j61Var);
        if (callback5 != null) {
            setOnItemClickListener(new w2(18, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new w2(19, this, callback5Return));
        }
        q61 q61Var = new q61(this);
        q61Var.f42996m = false;
        q61Var.C = false;
        q61Var.o(rr.h);
        q61Var.n(350L);
        setItemAnimator(q61Var);
    }

    public void C1() {
    }

    public void D1() {
    }

    public void E1(s4.c1 c1Var) {
    }

    public void F1(s4.c1 c1Var) {
    }

    public void G1(s4.c1 c1Var) {
    }

    public void H1() {
    }
}
