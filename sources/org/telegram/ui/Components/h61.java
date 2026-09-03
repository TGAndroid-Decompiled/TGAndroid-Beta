package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class h61 extends sl0 {
    public f2.j0 U2;
    public final w51 V2;
    public f2.f0 W2;
    public boolean X2;
    public boolean Y2;
    public boolean Z2;
    public f2.m1 f27389a3;
    public boolean f27390b3;

    public h61(org.telegram.ui.ActionBar.p2 p2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getClassGuid(), false, callback2, callback5, callback5Return, p2Var.getResourceProvider());
    }

    public final void A1(Utilities.Callback2 callback2, boolean z4) {
        this.Y2 = z4;
        f2.f0 f0Var = new f2.f0(new org.telegram.ui.cp(this, 3));
        this.W2 = f0Var;
        f0Var.d(this);
        this.V2.I = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!a1()) {
            w51 w51Var = this.V2;
            ArrayList arrayList = w51Var.C;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                u51 u51Var = (u51) arrayList.get(i11);
                int i12 = u51Var.f31504b;
                if (i12 >= 0) {
                    int i13 = u51Var.f31503a;
                    if (w51Var.f32650n) {
                        i10 = org.telegram.ui.ActionBar.k6.f21733h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f21661d6;
                    }
                    int v02 = org.telegram.ui.ActionBar.k6.v0(i10, w51Var.v);
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
                            if (this.f31116r2 == null) {
                                this.f31116r2 = new Paint(1);
                            }
                            this.f31116r2.setColor(v02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f31116r2);
                        }
                    }
                }
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
    public final void o1() {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void p1(int i10, float f10, boolean z4) {
        r1(new oi(this, 3), new org.telegram.ui.wh(5), i10, f10, new hv(this, 27), z4);
    }

    public void setReorderLongPressEnabled(boolean z4) {
        this.f27390b3 = z4;
    }

    @Override
    public void setSections(boolean z4) {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z4);
    }

    public void setSpanCount(int i10) {
        f2.j0 j0Var = this.U2;
        if (j0Var instanceof pz) {
            ((pz) j0Var).y1(i10);
        } else if (j0Var != null && i10 != -1) {
            getContext();
            g61 g61Var = new g61(this, i10);
            g61Var.O = new ls0(this, g61Var, 1);
            this.U2 = g61Var;
            setLayoutManager(g61Var);
        }
    }

    public final void v1(boolean z4) {
        if (this.Z2 == z4) {
            return;
        }
        this.Z2 = z4;
        this.V2.J = z4;
        AndroidUtilities.forEachViews((RecyclerView) this, (h5.d) new cb0(this, 1));
    }

    public final int w1(int i10) {
        int i11 = 0;
        while (true) {
            w51 w51Var = this.V2;
            if (i11 < w51Var.f32654x.size()) {
                h51 G = w51Var.G(i11);
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
            w51 w51Var = this.V2;
            if (i11 < w51Var.f32654x.size()) {
                h51 G = w51Var.G(i11);
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
            w51 w51Var = this.V2;
            if (i10 < w51Var.f32654x.size()) {
                h51 G = w51Var.G(i10);
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

    public h61(Context context, int i10, int i11, boolean z4, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, i10, i11, z4, callback2, callback5, callback5Return, g6Var, -1, 1);
    }

    public h61(Context context, int i10, int i11, boolean z4, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.g6 g6Var, int i12, int i13) {
        super(context, g6Var);
        this.f27390b3 = true;
        if (i12 == -1) {
            c61 c61Var = new c61(this, i13);
            this.U2 = c61Var;
            setLayoutManager(c61Var);
        } else {
            d61 d61Var = new d61(this, i12);
            d61Var.O = new e61(this, d61Var);
            this.U2 = d61Var;
            setLayoutManager(d61Var);
        }
        w51 w51Var = new w51(this, context, i10, i11, z4, callback2, g6Var);
        this.V2 = w51Var;
        setAdapter(w51Var);
        if (callback5 != null) {
            setOnItemClickListener(new o1(25, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new o1(26, this, callback5Return));
        }
        f61 f61Var = new f61(this);
        f61Var.f5910m = false;
        f61Var.C = false;
        f61Var.o(pr.h);
        f61Var.n(350L);
        setItemAnimator(f61Var);
    }

    public void B1() {
    }

    public void C1() {
    }

    public void D1(f2.m1 m1Var) {
    }

    public void E1(f2.m1 m1Var) {
    }

    public void F1(f2.m1 m1Var) {
    }

    public void G1() {
    }
}
