package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class s71 extends nm0 {
    public s4.c0 f32503f3;
    public final k71 f32504g3;
    public s4.z f32505h3;
    public boolean f32506i3;
    public boolean f32507j3;
    public boolean f32508k3;
    public s4.e1 f32509l3;
    public boolean f32510m3;

    public s71(org.telegram.ui.ActionBar.r2 r2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(r2Var.getContext(), r2Var.getCurrentAccount(), r2Var.getClassGuid(), false, callback2, callback5, callback5Return, r2Var.getResourceProvider());
    }

    public final void C1(boolean z10) {
        if (this.f32508k3 == z10) {
            return;
        }
        this.f32508k3 = z10;
        this.f32504g3.N = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new b3(this, 12));
    }

    public final int D1(int i10) {
        int i11 = 0;
        while (true) {
            k71 k71Var = this.f32504g3;
            if (i11 < k71Var.f29882y.size()) {
                u61 G = k71Var.G(i11);
                if (G != null && G.d == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final View E1(int i10) {
        int i11 = 0;
        while (true) {
            k71 k71Var = this.f32504g3;
            if (i11 < k71Var.f29882y.size()) {
                u61 G = k71Var.G(i11);
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

    public final View F1(Object obj) {
        int i10 = 0;
        while (true) {
            k71 k71Var = this.f32504g3;
            if (i10 < k71Var.f29882y.size()) {
                u61 G = k71Var.G(i10);
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

    public boolean G1() {
        return false;
    }

    public final void H1(Utilities.Callback2 callback2, boolean z10) {
        this.f32507j3 = z10;
        s4.z zVar = new s4.z(new ei.f(this, 4));
        this.f32505h3 = zVar;
        zVar.h(this);
        this.f32504g3.M = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!b1()) {
            k71 k71Var = this.f32504g3;
            ArrayList arrayList = k71Var.G;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                g71 g71Var = (g71) arrayList.get(i11);
                int i12 = g71Var.f28452b;
                if (i12 >= 0) {
                    int i13 = g71Var.f28451a;
                    if (k71Var.f29877n) {
                        i10 = org.telegram.ui.ActionBar.y6.f23428h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.y6.f23357d6;
                    }
                    int w02 = org.telegram.ui.ActionBar.y6.w0(i10, k71Var.f29880w);
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
                            if (this.f30998s2 == null) {
                                this.f30998s2 = new Paint(1);
                            }
                            this.f30998s2.setColor(w02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f30998s2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.c0 c0Var = this.f32503f3;
        if (c0Var instanceof vz) {
            return ((vz) c0Var).J;
        }
        return -1;
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f32510m3 = z10;
    }

    public void setSpanCount(int i10) {
        s4.c0 c0Var = this.f32503f3;
        if (c0Var instanceof vz) {
            ((vz) c0Var).z1(i10);
        } else if (c0Var != null && i10 != -1) {
            getContext();
            ei.h hVar = new ei.h(this, i10);
            hVar.O = new tt0(this, hVar, 1);
            this.f32503f3 = hVar;
            setLayoutManager(hVar);
        }
    }

    @Override
    public final void v1(int i10, float f7, boolean z10) {
        w1(new vi(this, 3), new ai.d0(8), i10, f7, z10);
    }

    public s71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, u6Var, -1, 1);
    }

    public s71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.u6 u6Var, int i12, int i13) {
        super(context, u6Var);
        this.f32510m3 = true;
        if (i12 == -1) {
            o71 o71Var = new o71(this, i13);
            this.f32503f3 = o71Var;
            setLayoutManager(o71Var);
        } else {
            p71 p71Var = new p71(this, i12);
            p71Var.O = new q71(this, p71Var);
            this.f32503f3 = p71Var;
            setLayoutManager(p71Var);
        }
        k71 k71Var = new k71(this, context, i10, i11, z10, callback2, u6Var);
        this.f32504g3 = k71Var;
        setAdapter(k71Var);
        if (callback5 != null) {
            setOnItemClickListener(new p1(27, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new p1(28, this, callback5Return));
        }
        r71 r71Var = new r71(this);
        r71Var.f47798m = false;
        r71Var.C = false;
        r71Var.o(ds.h);
        r71Var.n(350L);
        setItemAnimator(r71Var);
    }

    public void I1() {
    }

    public void J1() {
    }

    public void N1() {
    }

    public void K1(s4.e1 e1Var) {
    }

    public void L1(s4.e1 e1Var) {
    }

    public void M1(s4.e1 e1Var) {
    }
}
