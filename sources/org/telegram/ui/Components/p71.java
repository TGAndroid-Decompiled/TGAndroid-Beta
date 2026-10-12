package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class p71 extends wm0 {
    public s4.d0 V2;
    public final h71 W2;
    public s4.z X2;
    public boolean Y2;
    public boolean Z2;
    public boolean f29439a3;
    public s4.d1 f29440b3;
    public boolean f29441c3;

    public p71(org.telegram.ui.ActionBar.m2 m2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(m2Var.getContext(), m2Var.getCurrentAccount(), m2Var.getClassGuid(), false, callback2, callback5, callback5Return, m2Var.getResourceProvider());
    }

    public final View A1(Object obj) {
        int i10 = 0;
        while (true) {
            h71 h71Var = this.W2;
            if (i10 < h71Var.f26678x.size()) {
                u61 G = h71Var.G(i10);
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
            h71 h71Var = this.W2;
            ArrayList arrayList = h71Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                f71 f71Var = (f71) arrayList.get(i11);
                int i12 = f71Var.f25948b;
                if (i12 >= 0) {
                    int i13 = f71Var.f25947a;
                    if (h71Var.f26674n) {
                        i10 = org.telegram.ui.ActionBar.h6.f20630h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f20559d6;
                    }
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i10, h71Var.v);
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
                            if (this.f32477s2 == null) {
                                this.f32477s2 = new Paint(1);
                            }
                            this.f32477s2.setColor(w02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f32477s2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.d0 d0Var = this.V2;
        if (d0Var instanceof g00) {
            return ((g00) d0Var).J;
        }
        return -1;
    }

    @Override
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void q1(int i10, float f7, boolean z10) {
        s1(new cj(this, 3), new ei.c(6), i10, f7, new ew(this, 28), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f29441c3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.d0 d0Var = this.V2;
        if (d0Var instanceof g00) {
            ((g00) d0Var).y1(i10);
        } else if (d0Var != null && i10 != -1) {
            getContext();
            bi.i iVar = new bi.i(this, i10);
            iVar.O = new vt0(this, iVar, 1);
            this.V2 = iVar;
            setLayoutManager(iVar);
        }
    }

    public final void x1(boolean z10) {
        if (this.f29439a3 == z10) {
            return;
        }
        this.f29439a3 = z10;
        this.W2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new a3(this, 13));
    }

    public final int y1(int i10) {
        int i11 = 0;
        while (true) {
            h71 h71Var = this.W2;
            if (i11 < h71Var.f26678x.size()) {
                u61 G = h71Var.G(i11);
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
            h71 h71Var = this.W2;
            if (i11 < h71Var.f26678x.size()) {
                u61 G = h71Var.G(i11);
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

    public p71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, c6Var, -1, 1);
    }

    public p71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.c6 c6Var, int i12, int i13) {
        super(context, c6Var);
        this.f29441c3 = true;
        if (i12 == -1) {
            l71 l71Var = new l71(this, i13);
            this.V2 = l71Var;
            setLayoutManager(l71Var);
        } else {
            m71 m71Var = new m71(this, i12);
            m71Var.O = new n71(this, m71Var);
            this.V2 = m71Var;
            setLayoutManager(m71Var);
        }
        h71 h71Var = new h71(this, context, i10, i11, z10, callback2, c6Var);
        this.W2 = h71Var;
        setAdapter(h71Var);
        if (callback5 != null) {
            setOnItemClickListener(new y2(18, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new y2(19, this, callback5Return));
        }
        o71 o71Var = new o71(this);
        o71Var.f47929m = false;
        o71Var.C = false;
        o71Var.o(js.h);
        o71Var.n(350L);
        setItemAnimator(o71Var);
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
