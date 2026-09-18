package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class t61 extends wl0 {
    public s4.c0 X2;
    public final l61 Y2;
    public s4.y Z2;
    public boolean f28334a3;
    public boolean f28335b3;
    public boolean f28336c3;
    public s4.c1 f28337d3;
    public boolean f28338e3;

    public t61(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public final View A1(Object obj) {
        int i10 = 0;
        while (true) {
            l61 l61Var = this.Y2;
            if (i10 < l61Var.f26045x.size()) {
                x51 G = l61Var.G(i10);
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
        this.f28335b3 = z10;
        s4.y yVar = new s4.y(new bi.g(this, 4));
        this.Z2 = yVar;
        yVar.e(this);
        this.Y2.L = callback2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        if (!c1()) {
            l61 l61Var = this.Y2;
            ArrayList arrayList = l61Var.F;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                j61 j61Var = (j61) arrayList.get(i11);
                int i12 = j61Var.f25186b;
                if (i12 >= 0) {
                    int i13 = j61Var.f25185a;
                    if (l61Var.f26041n) {
                        i10 = org.telegram.ui.ActionBar.j6.f19133h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19062d6;
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, l61Var.v);
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
                            if (this.f30100u2 == null) {
                                this.f30100u2 = new Paint(1);
                            }
                            this.f30100u2.setColor(v02);
                            canvas.drawRect(0.0f, i14, getWidth(), i15, this.f30100u2);
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
        t1(new xi(this, 3), new ei.c(6), i10, f7, new lv(this, 27), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f28338e3 = z10;
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
            iVar.O = new ys0(this, iVar, 1);
            this.X2 = iVar;
            setLayoutManager(iVar);
        }
    }

    public final void x1(boolean z10) {
        if (this.f28336c3 == z10) {
            return;
        }
        this.f28336c3 = z10;
        this.Y2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (e2.h) new hb0(this, 1));
    }

    public final int y1(int i10) {
        int i11 = 0;
        while (true) {
            l61 l61Var = this.Y2;
            if (i11 < l61Var.f26045x.size()) {
                x51 G = l61Var.G(i11);
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
            l61 l61Var = this.Y2;
            if (i11 < l61Var.f26045x.size()) {
                x51 G = l61Var.G(i11);
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

    public t61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, e6Var, -1, 1);
    }

    public t61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.e6 e6Var, int i12, int i13) {
        super(context, e6Var);
        this.f28338e3 = true;
        if (i12 == -1) {
            p61 p61Var = new p61(this, i13);
            this.X2 = p61Var;
            setLayoutManager(p61Var);
        } else {
            q61 q61Var = new q61(this, i12);
            q61Var.O = new r61(this, q61Var);
            this.X2 = q61Var;
            setLayoutManager(q61Var);
        }
        l61 l61Var = new l61(this, context, i10, i11, z10, callback2, e6Var);
        this.Y2 = l61Var;
        setAdapter(l61Var);
        if (callback5 != null) {
            setOnItemClickListener(new b3(17, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new b3(18, this, callback5Return));
        }
        s61 s61Var = new s61(this);
        s61Var.f42964m = false;
        s61Var.C = false;
        s61Var.o(qr.h);
        s61Var.n(350L);
        setItemAnimator(s61Var);
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
