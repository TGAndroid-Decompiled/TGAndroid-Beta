package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class e61 extends ll0 {
    public s4.c0 X2;
    public final w51 Y2;
    public s4.y Z2;
    public boolean f23555a3;
    public boolean f23556b3;
    public boolean f23557c3;
    public s4.c1 f23558d3;
    public boolean f23559e3;

    public e61(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public boolean A1() {
        return false;
    }

    public final void B1(Utilities.Callback2 callback2, boolean z10) {
        this.f23556b3 = z10;
        s4.y yVar = new s4.y(new bi.g(this, 4));
        this.Z2 = yVar;
        yVar.e(this);
        this.Y2.L = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!b1()) {
            w51 w51Var = this.Y2;
            ArrayList arrayList = w51Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                u51 u51Var = (u51) arrayList.get(i11);
                int i12 = u51Var.f28292b;
                if (i12 >= 0) {
                    int i13 = u51Var.f28291a;
                    if (w51Var.f29609n) {
                        i10 = org.telegram.ui.ActionBar.i6.f18904h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f18834d6;
                    }
                    int v02 = org.telegram.ui.ActionBar.i6.v0(i10, w51Var.v);
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
                            if (this.f25979u2 == null) {
                                this.f25979u2 = new Paint(1);
                            }
                            this.f25979u2.setColor(v02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f25979u2);
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
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void q1(int i10, float f7, boolean z10) {
        s1(new xi(this, 3), new ei.c(6), i10, f7, new lv(this, 27), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f23559e3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof nz) {
            ((nz) c0Var).y1(i10);
        } else if (c0Var != null && i10 != -1) {
            getContext();
            bi.i iVar = new bi.i(this, i10);
            iVar.O = new ms0(this, iVar, 1);
            this.X2 = iVar;
            setLayoutManager(iVar);
        }
    }

    public final void w1(boolean z10) {
        if (this.f23557c3 == z10) {
            return;
        }
        this.f23557c3 = z10;
        this.Y2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (e2.h) new ya0(this, 1));
    }

    public final int x1(int i10) {
        int i11 = 0;
        while (true) {
            w51 w51Var = this.Y2;
            if (i11 < w51Var.f29613x.size()) {
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
            w51 w51Var = this.Y2;
            if (i11 < w51Var.f29613x.size()) {
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
            w51 w51Var = this.Y2;
            if (i10 < w51Var.f29613x.size()) {
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

    public e61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, e6Var, -1, 1);
    }

    public e61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.e6 e6Var, int i12, int i13) {
        super(context, e6Var);
        this.f23559e3 = true;
        if (i12 == -1) {
            a61 a61Var = new a61(this, i13);
            this.X2 = a61Var;
            setLayoutManager(a61Var);
        } else {
            b61 b61Var = new b61(this, i12);
            b61Var.O = new c61(this, b61Var);
            this.X2 = b61Var;
            setLayoutManager(b61Var);
        }
        w51 w51Var = new w51(this, context, i10, i11, z10, callback2, e6Var);
        this.Y2 = w51Var;
        setAdapter(w51Var);
        if (callback5 != null) {
            setOnItemClickListener(new mf(16, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new mf(17, this, callback5Return));
        }
        d61 d61Var = new d61(this);
        d61Var.f42706m = false;
        d61Var.C = false;
        d61Var.o(qr.h);
        d61Var.n(350L);
        setItemAnimator(d61Var);
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
