package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class k71 extends qm0 {
    public s4.d0 V2;
    public final c71 W2;
    public s4.z X2;
    public boolean Y2;
    public boolean Z2;
    public boolean f27866a3;
    public s4.d1 f27867b3;
    public boolean f27868c3;

    public k71(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public final View A1(Object obj) {
        int i10 = 0;
        while (true) {
            c71 c71Var = this.W2;
            if (i10 < c71Var.f25283x.size()) {
                p61 G = c71Var.G(i10);
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

    public boolean B1() {
        return false;
    }

    public final void C1(Utilities.Callback2 callback2, boolean z10) {
        this.Z2 = z10;
        s4.z zVar = new s4.z(new bi.g(this, 4));
        this.X2 = zVar;
        zVar.e(this);
        this.W2.L = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!b1()) {
            c71 c71Var = this.W2;
            ArrayList arrayList = c71Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                a71 a71Var = (a71) arrayList.get(i11);
                int i12 = a71Var.f24620b;
                if (i12 >= 0) {
                    int i13 = a71Var.f24619a;
                    if (c71Var.f25279n) {
                        i10 = org.telegram.ui.ActionBar.i6.f20868h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f20797d6;
                    }
                    int w02 = org.telegram.ui.ActionBar.i6.w0(i10, c71Var.v);
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
                            if (this.f30226s2 == null) {
                                this.f30226s2 = new Paint(1);
                            }
                            this.f30226s2.setColor(w02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f30226s2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.d0 d0Var = this.V2;
        if (d0Var instanceof d00) {
            return ((d00) d0Var).J;
        }
        return -1;
    }

    @Override
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void q1(int i10, float f7, boolean z10) {
        s1(new aj(this, 3), new ei.c(6), i10, f7, new bw(this, 28), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f27868c3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.d0 d0Var = this.V2;
        if (d0Var instanceof d00) {
            ((d00) d0Var).y1(i10);
        } else if (d0Var != null && i10 != -1) {
            getContext();
            bi.i iVar = new bi.i(this, i10);
            iVar.O = new pt0(this, iVar, 1);
            this.V2 = iVar;
            setLayoutManager(iVar);
        }
    }

    public final void x1(boolean z10) {
        if (this.f27866a3 == z10) {
            return;
        }
        this.f27866a3 = z10;
        this.W2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new a3(this, 13));
    }

    public final int y1(int i10) {
        int i11 = 0;
        while (true) {
            c71 c71Var = this.W2;
            if (i11 < c71Var.f25283x.size()) {
                p61 G = c71Var.G(i11);
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
            c71 c71Var = this.W2;
            if (i11 < c71Var.f25283x.size()) {
                p61 G = c71Var.G(i11);
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

    public k71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, e6Var, -1, 1);
    }

    public k71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.e6 e6Var, int i12, int i13) {
        super(context, e6Var);
        this.f27868c3 = true;
        if (i12 == -1) {
            g71 g71Var = new g71(this, i13);
            this.V2 = g71Var;
            setLayoutManager(g71Var);
        } else {
            h71 h71Var = new h71(this, i12);
            h71Var.O = new i71(this, h71Var);
            this.V2 = h71Var;
            setLayoutManager(h71Var);
        }
        c71 c71Var = new c71(this, context, i10, i11, z10, callback2, e6Var);
        this.W2 = c71Var;
        setAdapter(c71Var);
        if (callback5 != null) {
            setOnItemClickListener(new y2(18, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new y2(19, this, callback5Return));
        }
        j71 j71Var = new j71(this);
        j71Var.f47698m = false;
        j71Var.C = false;
        j71Var.o(hs.h);
        j71Var.n(350L);
        setItemAnimator(j71Var);
    }

    public void D1() {
    }

    public void E1() {
    }

    public void F1(s4.d1 d1Var) {
    }

    public void G1(s4.d1 d1Var) {
    }

    public void H1(s4.d1 d1Var) {
    }

    public void I1() {
    }
}
