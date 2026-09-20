package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class s61 extends vl0 {
    public s4.c0 X2;
    public final k61 Y2;
    public s4.y Z2;
    public boolean f28063a3;
    public boolean f28064b3;
    public boolean f28065c3;
    public s4.c1 f28066d3;
    public boolean f28067e3;

    public s61(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public final View A1(Object obj) {
        int i10 = 0;
        while (true) {
            k61 k61Var = this.Y2;
            if (i10 < k61Var.f25681x.size()) {
                w51 G = k61Var.G(i10);
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

    public boolean B1() {
        return false;
    }

    public final void C1(Utilities.Callback2 callback2, boolean z10) {
        this.f28064b3 = z10;
        s4.y yVar = new s4.y(new bi.g(this, 4));
        this.Z2 = yVar;
        yVar.e(this);
        this.Y2.L = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!c1()) {
            k61 k61Var = this.Y2;
            ArrayList arrayList = k61Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                i61 i61Var = (i61) arrayList.get(i11);
                int i12 = i61Var.f24895b;
                if (i12 >= 0) {
                    int i13 = i61Var.f24894a;
                    if (k61Var.f25677n) {
                        i10 = org.telegram.ui.ActionBar.j6.f19165h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19094d6;
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, k61Var.v);
                    if (i12 >= i13 && i13 >= 0 && i12 >= 0) {
                        int i14 = Integer.MAX_VALUE;
                        int i15 = Integer.MIN_VALUE;
                        for (int i16 = 0; i16 < getChildCount(); i16++) {
                            View childAt = getChildAt(i16);
                            if (childAt != null) {
                                int S = RecyclerView.S(childAt);
                                int top = childAt.getTop();
                                if (S >= i13 && S <= i12) {
                                    i14 = Math.min(top, i14);
                                    i15 = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), i15);
                                }
                            }
                        }
                        if (i14 < i15) {
                            if (this.f29217u2 == null) {
                                this.f29217u2 = new Paint(1);
                            }
                            this.f29217u2.setColor(v02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f29217u2);
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
    public final void q1() {
        r1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override
    public final void r1(int i10, float f7, boolean z10) {
        t1(new xi(this, 3), new ei.c(6), i10, f7, new mv(this, 28), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f28067e3 = z10;
    }

    @Override
    public void setSections(boolean z10) {
        r1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof nz) {
            ((nz) c0Var).y1(i10);
        } else if (c0Var != null && i10 != -1) {
            getContext();
            bi.i iVar = new bi.i(this, i10);
            iVar.O = new xs0(this, iVar, 1);
            this.X2 = iVar;
            setLayoutManager(iVar);
        }
    }

    public final void x1(boolean z10) {
        if (this.f28065c3 == z10) {
            return;
        }
        this.f28065c3 = z10;
        this.Y2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (e2.h) new gb0(this, 1));
    }

    public final int y1(int i10) {
        int i11 = 0;
        while (true) {
            k61 k61Var = this.Y2;
            if (i11 < k61Var.f25681x.size()) {
                w51 G = k61Var.G(i11);
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
            k61 k61Var = this.Y2;
            if (i11 < k61Var.f25681x.size()) {
                w51 G = k61Var.G(i11);
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

    public s61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, f6Var, -1, 1);
    }

    public s61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var, int i12, int i13) {
        super(context, f6Var);
        this.f28067e3 = true;
        if (i12 == -1) {
            o61 o61Var = new o61(this, i13);
            this.X2 = o61Var;
            setLayoutManager(o61Var);
        } else {
            p61 p61Var = new p61(this, i12);
            p61Var.O = new q61(this, p61Var);
            this.X2 = p61Var;
            setLayoutManager(p61Var);
        }
        k61 k61Var = new k61(this, context, i10, i11, z10, callback2, f6Var);
        this.Y2 = k61Var;
        setAdapter(k61Var);
        if (callback5 != null) {
            setOnItemClickListener(new a3(17, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new a3(18, this, callback5Return));
        }
        r61 r61Var = new r61(this);
        r61Var.f43009m = false;
        r61Var.C = false;
        r61Var.o(qr.h);
        r61Var.n(350L);
        setItemAnimator(r61Var);
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
