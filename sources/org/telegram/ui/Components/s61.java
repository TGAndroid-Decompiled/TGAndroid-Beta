package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class s61 extends xl0 {
    public s4.c0 X2;
    public final k61 Y2;
    public s4.y Z2;
    public boolean f28177a3;
    public boolean f28178b3;
    public boolean f28179c3;
    public s4.c1 f28180d3;
    public boolean f28181e3;

    public s61(org.telegram.ui.ActionBar.m2 m2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(m2Var.getContext(), m2Var.getCurrentAccount(), m2Var.getClassGuid(), false, callback2, callback5, callback5Return, m2Var.getResourceProvider());
    }

    public boolean A1() {
        return false;
    }

    public final void B1(Utilities.Callback2 callback2, boolean z10) {
        this.f28178b3 = z10;
        s4.y yVar = new s4.y(new bi.g(this, 4));
        this.Z2 = yVar;
        yVar.e(this);
        this.Y2.L = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!b1()) {
            k61 k61Var = this.Y2;
            ArrayList arrayList = k61Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                i61 i61Var = (i61) arrayList.get(i11);
                int i12 = i61Var.f24987b;
                if (i12 >= 0) {
                    int i13 = i61Var.f24986a;
                    if (k61Var.f25643n) {
                        i10 = org.telegram.ui.ActionBar.h6.f19129h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f19059d6;
                    }
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i10, k61Var.v);
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
                            if (this.f30409u2 == null) {
                                this.f30409u2 = new Paint(1);
                            }
                            this.f30409u2.setColor(v02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f30409u2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof pz) {
            return ((pz) c0Var).J;
        }
        return -1;
    }

    @Override
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void q1(int i10, float f7, boolean z10) {
        s1(new yi(this, 3), new ei.c(6), i10, f7, new nv(this, 28), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f28181e3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof pz) {
            ((pz) c0Var).y1(i10);
        } else if (c0Var != null && i10 != -1) {
            getContext();
            bi.i iVar = new bi.i(this, i10);
            iVar.O = new ys0(this, iVar, 1);
            this.X2 = iVar;
            setLayoutManager(iVar);
        }
    }

    public final void w1(boolean z10) {
        if (this.f28179c3 == z10) {
            return;
        }
        this.f28179c3 = z10;
        this.Y2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new y2(this, 13));
    }

    public final int x1(int i10) {
        int i11 = 0;
        while (true) {
            k61 k61Var = this.Y2;
            if (i11 < k61Var.f25647x.size()) {
                w51 G = k61Var.G(i11);
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
            k61 k61Var = this.Y2;
            if (i11 < k61Var.f25647x.size()) {
                w51 G = k61Var.G(i11);
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
            k61 k61Var = this.Y2;
            if (i10 < k61Var.f25647x.size()) {
                w51 G = k61Var.G(i10);
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

    public s61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, d6Var, -1, 1);
    }

    public s61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var, int i12, int i13) {
        super(context, d6Var);
        this.f28181e3 = true;
        if (i12 == -1) {
            o61 o61Var = new o61(this, i13);
            this.X2 = o61Var;
            setLayoutManager(o61Var);
        } else {
            p61 p61Var = new p61(this, i12);
            p61Var.O = new q61(this, p61Var);
            this.X2 = p61Var;
            setLayoutManager(p61Var);
        }
        k61 k61Var = new k61(this, context, i10, i11, z10, callback2, d6Var);
        this.Y2 = k61Var;
        setAdapter(k61Var);
        if (callback5 != null) {
            setOnItemClickListener(new w2(18, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new w2(19, this, callback5Return));
        }
        r61 r61Var = new r61(this);
        r61Var.f42994m = false;
        r61Var.C = false;
        r61Var.o(sr.h);
        r61Var.n(350L);
        setItemAnimator(r61Var);
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
