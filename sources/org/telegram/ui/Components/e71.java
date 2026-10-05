package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class e71 extends zl0 {
    public s4.c0 f26033e3;
    public final w61 f26034f3;
    public s4.y f26035g3;
    public boolean f26036h3;
    public boolean f26037i3;
    public boolean j3;
    public s4.c1 f26038k3;
    public boolean f26039l3;

    public e71(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public final View A1(Object obj) {
        int i10 = 0;
        while (true) {
            w61 w61Var = this.f26034f3;
            if (i10 < w61Var.f32534x.size()) {
                h61 G = w61Var.G(i10);
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
        this.f26037i3 = z10;
        s4.y yVar = new s4.y(new bi.g(this, 4));
        this.f26035g3 = yVar;
        yVar.e(this);
        this.f26034f3.L = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!b1()) {
            w61 w61Var = this.f26034f3;
            ArrayList arrayList = w61Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                u61 u61Var = (u61) arrayList.get(i11);
                int i12 = u61Var.f31362b;
                if (i12 >= 0) {
                    int i13 = u61Var.f31361a;
                    if (w61Var.f32530n) {
                        i10 = org.telegram.ui.ActionBar.i6.f20899h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f20827d6;
                    }
                    int v02 = org.telegram.ui.ActionBar.i6.v0(i10, w61Var.v);
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
                            if (this.f33570u2 == null) {
                                this.f33570u2 = new Paint(1);
                            }
                            this.f33570u2.setColor(v02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f33570u2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.c0 c0Var = this.f26033e3;
        if (c0Var instanceof qz) {
            return ((qz) c0Var).J;
        }
        return -1;
    }

    @Override
    public final void s1(int i10, float f7, boolean z10) {
        t1(new zi(this, 3), new ei.c(6), i10, f7, z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f26039l3 = z10;
    }

    public void setSpanCount(int i10) {
        s4.c0 c0Var = this.f26033e3;
        if (c0Var instanceof qz) {
            ((qz) c0Var).y1(i10);
        } else if (c0Var != null && i10 != -1) {
            getContext();
            bi.i iVar = new bi.i(this, i10);
            iVar.O = new et0(this, iVar, 1);
            this.f26033e3 = iVar;
            setLayoutManager(iVar);
        }
    }

    public final void x1(boolean z10) {
        if (this.j3 == z10) {
            return;
        }
        this.j3 = z10;
        this.f26034f3.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new y2(this, 13));
    }

    public final int y1(int i10) {
        int i11 = 0;
        while (true) {
            w61 w61Var = this.f26034f3;
            if (i11 < w61Var.f32534x.size()) {
                h61 G = w61Var.G(i11);
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
            w61 w61Var = this.f26034f3;
            if (i11 < w61Var.f32534x.size()) {
                h61 G = w61Var.G(i11);
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

    public e71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, d6Var, -1, 1);
    }

    public e71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var, int i12, int i13) {
        super(context, d6Var);
        this.f26039l3 = true;
        if (i12 == -1) {
            a71 a71Var = new a71(this, i13);
            this.f26033e3 = a71Var;
            setLayoutManager(a71Var);
        } else {
            b71 b71Var = new b71(this, i12);
            b71Var.O = new c71(this, b71Var);
            this.f26033e3 = b71Var;
            setLayoutManager(b71Var);
        }
        w61 w61Var = new w61(this, context, i10, i11, z10, callback2, d6Var);
        this.f26034f3 = w61Var;
        setAdapter(w61Var);
        if (callback5 != null) {
            setOnItemClickListener(new w2(19, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new w2(20, this, callback5Return));
        }
        d71 d71Var = new d71(this);
        d71Var.f46577m = false;
        d71Var.C = false;
        d71Var.o(tr.h);
        d71Var.n(350L);
        setItemAnimator(d71Var);
    }

    public void D1() {
    }

    public void E1() {
    }

    public void F1(s4.c1 c1Var) {
    }

    public void G1(s4.c1 c1Var) {
    }

    public void H1(s4.c1 c1Var) {
    }

    public void I1() {
    }
}
