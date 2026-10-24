package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class i71 extends lm0 {
    public s4.b0 Y2;
    public final a71 Z2;
    public s4.y f27319a3;
    public boolean f27320b3;
    public boolean f27321c3;
    public boolean f27322d3;
    public s4.b1 f27323e3;
    public boolean f27324f3;

    public i71(org.telegram.ui.ActionBar.o2 o2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getClassGuid(), false, callback2, callback5, callback5Return, o2Var.getResourceProvider());
    }

    public final void C1(boolean z10) {
        if (this.f27322d3 == z10) {
            return;
        }
        this.f27322d3 = z10;
        this.Z2.N = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new x2(this, 13));
    }

    public final int D1(int i10) {
        int i11 = 0;
        while (true) {
            a71 a71Var = this.Z2;
            if (i11 < a71Var.f24650y.size()) {
                l61 G = a71Var.G(i11);
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
            a71 a71Var = this.Z2;
            if (i11 < a71Var.f24650y.size()) {
                l61 G = a71Var.G(i11);
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

    public final View F1(Object obj) {
        int i10 = 0;
        while (true) {
            a71 a71Var = this.Z2;
            if (i10 < a71Var.f24650y.size()) {
                l61 G = a71Var.G(i10);
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

    public boolean G1() {
        return false;
    }

    public final void H1(Utilities.Callback2 callback2, boolean z10) {
        this.f27321c3 = z10;
        s4.y yVar = new s4.y(new di.f(this, 4));
        this.f27319a3 = yVar;
        yVar.d(this);
        this.Z2.M = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!c1()) {
            a71 a71Var = this.Z2;
            ArrayList arrayList = a71Var.G;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                w61 w61Var = (w61) arrayList.get(i11);
                int i12 = w61Var.f32136b;
                if (i12 >= 0) {
                    int i13 = w61Var.f32135a;
                    if (a71Var.f24645n) {
                        i10 = org.telegram.ui.ActionBar.k6.f21255h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f21184d6;
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i10, a71Var.f24648w);
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
                            if (this.f28406s2 == null) {
                                this.f28406s2 = new Paint(1);
                            }
                            this.f28406s2.setColor(w02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f28406s2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.b0 b0Var = this.Y2;
        if (b0Var instanceof uz) {
            return ((uz) b0Var).J;
        }
        return -1;
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f27324f3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        u1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.b0 b0Var = this.Y2;
        if (b0Var instanceof uz) {
            ((uz) b0Var).y1(i10);
        } else if (b0Var != null && i10 != -1) {
            getContext();
            di.h hVar = new di.h(this, i10);
            hVar.O = new kt0(this, hVar, 1);
            this.Y2 = hVar;
            setLayoutManager(hVar);
        }
    }

    @Override
    public final void t1() {
        u1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void u1(int i10, float f7, boolean z10) {
        w1(new ti(this, 3), new gi.c(6), i10, f7, new rv(this, 28), z10);
    }

    public i71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, g6Var, -1, 1);
    }

    public i71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.g6 g6Var, int i12, int i13) {
        super(context, g6Var);
        this.f27324f3 = true;
        if (i12 == -1) {
            e71 e71Var = new e71(this, i13);
            this.Y2 = e71Var;
            setLayoutManager(e71Var);
        } else {
            f71 f71Var = new f71(this, i12);
            f71Var.O = new g71(this, f71Var);
            this.Y2 = f71Var;
            setLayoutManager(f71Var);
        }
        a71 a71Var = new a71(this, context, i10, i11, z10, callback2, g6Var);
        this.Z2 = a71Var;
        setAdapter(a71Var);
        if (callback5 != null) {
            setOnItemClickListener(new o2(24, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new o2(25, this, callback5Return));
        }
        h71 h71Var = new h71(this);
        h71Var.f46376m = false;
        h71Var.C = false;
        h71Var.o(zr.h);
        h71Var.n(350L);
        setItemAnimator(h71Var);
    }

    public void I1() {
    }

    public void J1() {
    }

    public void K1(s4.b1 b1Var) {
    }

    public void L1(s4.b1 b1Var) {
    }

    public void M1(s4.b1 b1Var) {
    }

    public void N1() {
    }
}
