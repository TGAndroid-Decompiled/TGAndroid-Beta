package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class d61 extends ll0 {
    public s4.c0 X2;
    public final v51 Y2;
    public s4.y Z2;
    public boolean f25279a3;
    public boolean f25280b3;
    public boolean f25281c3;
    public s4.c1 f25282d3;
    public boolean f25283e3;

    public d61(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public final void A1(Utilities.Callback2 callback2, boolean z10) {
        this.f25280b3 = z10;
        s4.y yVar = new s4.y(new ci.f(this, 4));
        this.Z2 = yVar;
        yVar.d(this);
        this.Y2.L = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!a1()) {
            v51 v51Var = this.Y2;
            ArrayList arrayList = v51Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                t51 t51Var = (t51) arrayList.get(i11);
                int i12 = t51Var.f30534b;
                if (i12 >= 0) {
                    int i13 = t51Var.f30533a;
                    if (v51Var.f31134n) {
                        i10 = org.telegram.ui.ActionBar.j6.f20734h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f20663d6;
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, v51Var.v);
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
                            if (this.f28234u2 == null) {
                                this.f28234u2 = new Paint(1);
                            }
                            this.f28234u2.setColor(v02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f28234u2);
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
    public final void o1() {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void p1(int i10, float f7, boolean z10) {
        r1(new xi(this, 3), new fi.c(6), i10, f7, new kv(this, 27), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f25283e3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof nz) {
            ((nz) c0Var).y1(i10);
        } else if (c0Var != null && i10 != -1) {
            getContext();
            ci.h hVar = new ci.h(this, i10);
            hVar.O = new ls0(this, hVar, 1);
            this.X2 = hVar;
            setLayoutManager(hVar);
        }
    }

    public final void v1(boolean z10) {
        if (this.f25281c3 == z10) {
            return;
        }
        this.f25281c3 = z10;
        this.Y2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (e2.h) new za0(this, 1));
    }

    public final int w1(int i10) {
        int i11 = 0;
        while (true) {
            v51 v51Var = this.Y2;
            if (i11 < v51Var.f31138x.size()) {
                h51 G = v51Var.G(i11);
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
            v51 v51Var = this.Y2;
            if (i11 < v51Var.f31138x.size()) {
                h51 G = v51Var.G(i11);
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
            v51 v51Var = this.Y2;
            if (i10 < v51Var.f31138x.size()) {
                h51 G = v51Var.G(i10);
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

    public d61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, f6Var, -1, 1);
    }

    public d61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var, int i12, int i13) {
        super(context, f6Var);
        this.f25283e3 = true;
        if (i12 == -1) {
            z51 z51Var = new z51(this, i13);
            this.X2 = z51Var;
            setLayoutManager(z51Var);
        } else {
            a61 a61Var = new a61(this, i12);
            a61Var.O = new b61(this, a61Var);
            this.X2 = a61Var;
            setLayoutManager(a61Var);
        }
        v51 v51Var = new v51(this, context, i10, i11, z10, callback2, f6Var);
        this.Y2 = v51Var;
        setAdapter(v51Var);
        if (callback5 != null) {
            setOnItemClickListener(new b3(17, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new b3(18, this, callback5Return));
        }
        c61 c61Var = new c61(this);
        c61Var.f45777m = false;
        c61Var.C = false;
        c61Var.o(pr.h);
        c61Var.n(350L);
        setItemAnimator(c61Var);
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
