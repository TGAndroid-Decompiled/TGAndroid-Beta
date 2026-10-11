package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class m71 extends sm0 {
    public s4.d0 V2;
    public final e71 W2;
    public s4.z X2;
    public boolean Y2;
    public boolean Z2;
    public boolean f28583a3;
    public s4.d1 f28584b3;
    public boolean f28585c3;

    public m71(org.telegram.ui.ActionBar.m2 m2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(m2Var.getContext(), m2Var.getCurrentAccount(), m2Var.getClassGuid(), false, callback2, callback5, callback5Return, m2Var.getResourceProvider());
    }

    public final View A1(Object obj) {
        int i10 = 0;
        while (true) {
            e71 e71Var = this.W2;
            if (i10 < e71Var.f25893x.size()) {
                r61 G = e71Var.G(i10);
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
            e71 e71Var = this.W2;
            ArrayList arrayList = e71Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                c71 c71Var = (c71) arrayList.get(i11);
                int i12 = c71Var.f25143b;
                if (i12 >= 0) {
                    int i13 = c71Var.f25142a;
                    if (e71Var.f25889n) {
                        i10 = org.telegram.ui.ActionBar.h6.f20857h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f20786d6;
                    }
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i10, e71Var.v);
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
                            if (this.f30817s2 == null) {
                                this.f30817s2 = new Paint(1);
                            }
                            this.f30817s2.setColor(w02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f30817s2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.d0 d0Var = this.V2;
        if (d0Var instanceof e00) {
            return ((e00) d0Var).J;
        }
        return -1;
    }

    @Override
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void q1(int i10, float f7, boolean z10) {
        s1(new aj(this, 3), new ei.c(6), i10, f7, new cw(this, 28), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f28585c3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.d0 d0Var = this.V2;
        if (d0Var instanceof e00) {
            ((e00) d0Var).y1(i10);
        } else if (d0Var != null && i10 != -1) {
            getContext();
            bi.i iVar = new bi.i(this, i10);
            iVar.O = new rt0(this, iVar, 1);
            this.V2 = iVar;
            setLayoutManager(iVar);
        }
    }

    public final void x1(boolean z10) {
        if (this.f28583a3 == z10) {
            return;
        }
        this.f28583a3 = z10;
        this.W2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new a3(this, 13));
    }

    public final int y1(int i10) {
        int i11 = 0;
        while (true) {
            e71 e71Var = this.W2;
            if (i11 < e71Var.f25893x.size()) {
                r61 G = e71Var.G(i11);
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
            e71 e71Var = this.W2;
            if (i11 < e71Var.f25893x.size()) {
                r61 G = e71Var.G(i11);
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

    public m71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, d6Var, -1, 1);
    }

    public m71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var, int i12, int i13) {
        super(context, d6Var);
        this.f28585c3 = true;
        if (i12 == -1) {
            i71 i71Var = new i71(this, i13);
            this.V2 = i71Var;
            setLayoutManager(i71Var);
        } else {
            j71 j71Var = new j71(this, i12);
            j71Var.O = new k71(this, j71Var);
            this.V2 = j71Var;
            setLayoutManager(j71Var);
        }
        e71 e71Var = new e71(this, context, i10, i11, z10, callback2, d6Var);
        this.W2 = e71Var;
        setAdapter(e71Var);
        if (callback5 != null) {
            setOnItemClickListener(new y2(19, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new y2(20, this, callback5Return));
        }
        l71 l71Var = new l71(this);
        l71Var.f47788m = false;
        l71Var.C = false;
        l71Var.o(is.h);
        l71Var.n(350L);
        setItemAnimator(l71Var);
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
