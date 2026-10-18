package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class a71 extends im0 {
    public s4.b0 V2;
    public final s61 W2;
    public s4.y X2;
    public boolean Y2;
    public boolean Z2;
    public boolean f24513a3;
    public s4.b1 f24514b3;
    public boolean f24515c3;

    public a71(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public final View A1(Object obj) {
        int i10 = 0;
        while (true) {
            s61 s61Var = this.W2;
            if (i10 < s61Var.f30204x.size()) {
                f61 G = s61Var.G(i10);
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
        s4.y yVar = new s4.y(new di.f(this, 4));
        this.X2 = yVar;
        yVar.d(this);
        this.W2.L = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!b1()) {
            s61 s61Var = this.W2;
            ArrayList arrayList = s61Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                q61 q61Var = (q61) arrayList.get(i11);
                int i12 = q61Var.f29582b;
                if (i12 >= 0) {
                    int i13 = q61Var.f29581a;
                    if (s61Var.f30200n) {
                        i10 = org.telegram.ui.ActionBar.h6.f21057h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f20986d6;
                    }
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i10, s61Var.v);
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
                            if (this.f27294s2 == null) {
                                this.f27294s2 = new Paint(1);
                            }
                            this.f27294s2.setColor(w02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f27294s2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.b0 b0Var = this.V2;
        if (b0Var instanceof wz) {
            return ((wz) b0Var).J;
        }
        return -1;
    }

    @Override
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void q1(int i10, float f7, boolean z10) {
        s1(new vi(this, 3), new gi.c(6), i10, f7, new tv(this, 28), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f24515c3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.b0 b0Var = this.V2;
        if (b0Var instanceof wz) {
            ((wz) b0Var).y1(i10);
        } else if (b0Var != null && i10 != -1) {
            getContext();
            di.h hVar = new di.h(this, i10);
            hVar.O = new gt0(this, hVar, 1);
            this.V2 = hVar;
            setLayoutManager(hVar);
        }
    }

    public final void x1(boolean z10) {
        if (this.f24513a3 == z10) {
            return;
        }
        this.f24513a3 = z10;
        this.W2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new z2(this, 13));
    }

    public final int y1(int i10) {
        int i11 = 0;
        while (true) {
            s61 s61Var = this.W2;
            if (i11 < s61Var.f30204x.size()) {
                f61 G = s61Var.G(i11);
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
            s61 s61Var = this.W2;
            if (i11 < s61Var.f30204x.size()) {
                f61 G = s61Var.G(i11);
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

    public a71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, d6Var, -1, 1);
    }

    public a71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var, int i12, int i13) {
        super(context, d6Var);
        this.f24515c3 = true;
        if (i12 == -1) {
            w61 w61Var = new w61(this, i13);
            this.V2 = w61Var;
            setLayoutManager(w61Var);
        } else {
            x61 x61Var = new x61(this, i12);
            x61Var.O = new y61(this, x61Var);
            this.V2 = x61Var;
            setLayoutManager(x61Var);
        }
        s61 s61Var = new s61(this, context, i10, i11, z10, callback2, d6Var);
        this.W2 = s61Var;
        setAdapter(s61Var);
        if (callback5 != null) {
            setOnItemClickListener(new q2(22, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new q2(23, this, callback5Return));
        }
        z61 z61Var = new z61(this);
        z61Var.f45944m = false;
        z61Var.C = false;
        z61Var.o(bs.h);
        z61Var.n(350L);
        setItemAnimator(z61Var);
    }

    public void D1() {
    }

    public void E1() {
    }

    public void F1(s4.b1 b1Var) {
    }

    public void G1(s4.b1 b1Var) {
    }

    public void H1(s4.b1 b1Var) {
    }

    public void I1() {
    }
}
