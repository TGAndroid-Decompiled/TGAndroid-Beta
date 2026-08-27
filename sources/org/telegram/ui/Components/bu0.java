package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

public class bu0 extends jk0 {

    public final Context f27213c;
    public boolean d;

    public org.telegram.ui.Cells.n7 f27214e;

    public final hu0 f27215f;

    public bu0(hu0 hu0Var, Context context) {
        this.f27215f = hu0Var;
        this.f27213c = context;
    }

    @Override
    public boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final boolean E(zk0 zk0Var) {
        hu0 hu0Var = this.f27215f;
        if (!hu0Var.t0()) {
            int iCeil = (int) Math.ceil(k() / ((this == hu0Var.D || hu0.u(hu0Var, this) != -1) ? hu0Var.f29127i1[0] : hu0Var.f29133m1));
            if (zk0Var.getChildCount() != 0 && zk0Var.getChildAt(0).getMeasuredHeight() * iCeil > zk0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f27215f.f29140p1[0].f34328e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((et0) arrayList.get(i11)).f28150b) {
                return ((et0) arrayList.get(i11)).f28149a;
            }
        }
        return ((et0) i0.a.i(1, arrayList)).f28149a;
    }

    @Override
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        int i10;
        int measuredHeight = zk0Var.getChildAt(0).getMeasuredHeight();
        hu0 hu0Var = this.f27215f;
        int[] iArr2 = hu0Var.f29127i1;
        if (hu0.v(hu0Var, this) != -1 || this == hu0Var.E) {
            i10 = hu0Var.f29133m1;
        } else {
            i10 = hu0.u(hu0Var, this) != -1 ? iArr2[1] : iArr2[0];
        }
        int iCeil = (int) (Math.ceil(k() / i10) * ((double) measuredHeight));
        int measuredHeight2 = zk0Var.getMeasuredHeight() - zk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (iCeil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i10;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    @Override
    public final float H(zk0 zk0Var) {
        int i10;
        hu0 hu0Var = this.f27215f;
        int[] iArr = hu0Var.f29127i1;
        if (this == hu0Var.E || hu0.v(hu0Var, this) != -1) {
            i10 = hu0Var.f29133m1;
        } else {
            i10 = hu0.u(hu0Var, this) != -1 ? iArr[1] : iArr[0];
        }
        int iCeil = (int) Math.ceil(k() / i10);
        if (zk0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = zk0Var.getChildAt(0).getMeasuredHeight();
        View childAt = zk0Var.getChildAt(0);
        int iR = RecyclerView.R(childAt);
        if (iR < 0) {
            return 0.0f;
        }
        return (((iR / i10) * measuredHeight) - (childAt.getTop() - zk0Var.getPaddingTop())) / ((iCeil * measuredHeight) - (zk0Var.getMeasuredHeight() - zk0Var.getPaddingTop()));
    }

    @Override
    public void I() {
        this.f27215f.c1(0, true);
    }

    @Override
    public final void J(zk0 zk0Var) {
        if (this.d) {
            this.d = false;
            int messageId = 0;
            for (int i10 = 0; i10 < zk0Var.getChildCount(); i10++) {
                View childAt = zk0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    messageId = ((org.telegram.ui.Cells.o7) childAt).getMessageId();
                }
                if (messageId != 0) {
                    break;
                }
            }
            if (messageId == 0) {
                this.f27215f.S(0, zk0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        zs0 zs0VarW = this.f27215f.W(0);
        if (zs0VarW != null) {
            hu0.q(zs0VarW, null, false);
        }
    }

    public int L(int i10) {
        return this.f27215f.f29140p1[0].f34335m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bu0.h():int");
    }

    @Override
    public int j(int i10) {
        wt0[] wt0VarArr = this.f27215f.f29140p1;
        if (!this.d && wt0VarArr[0].c().size() == 0) {
            wt0 wt0Var = wt0VarArr[0];
            if (!wt0Var.f34330g && wt0Var.f34334l) {
                return 2;
            }
        }
        wt0VarArr[0].getClass();
        wt0VarArr[0].c().size();
        wt0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f27215f.f29140p1[0].e();
    }

    @Override
    public void v(f2.o1 o1Var, int i10) {
        int i11;
        hu0 hu0Var = this.f27215f;
        int[] iArr = hu0Var.f29127i1;
        wt0[] wt0VarArr = hu0Var.f29140p1;
        if (o1Var.f5793f == 0) {
            ArrayList arrayListC = wt0VarArr[0].c();
            int iD = i10 - wt0VarArr[0].d();
            View view = o1Var.f5789a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                int messageId = o7Var.getMessageId();
                if (this == hu0Var.D) {
                    i11 = iArr[0];
                } else {
                    i11 = hu0.u(hu0Var, this) != -1 ? iArr[1] : hu0Var.f29133m1;
                }
                if (iD < 0 || iD >= arrayListC.size()) {
                    o7Var.k(null, i11, false);
                    o7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) arrayListC.get(iD);
                boolean z10 = messageObject.getId() == messageId;
                if (hu0Var.f29163y1) {
                    o7Var.i(hu0Var.V0[(messageObject.getDialogId() > hu0Var.f29121f1 ? 1 : (messageObject.getDialogId() == hu0Var.f29121f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    o7Var.i(false, z10);
                }
                o7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override
    public f2.o1 x(ViewGroup viewGroup, int i10) {
        hu0 hu0Var = this.f27215f;
        org.telegram.ui.ActionBar.c6 c6Var = hu0Var.B1;
        Context context = this.f27213c;
        if (i10 != 0 && i10 != 19) {
            ts0 ts0VarM = hu0.M(0, hu0Var.f29121f1, context, c6Var);
            ts0VarM.setLayoutParams(new f2.y0(-1, -1));
            return new lk0(ts0VarM);
        }
        if (this.f27214e == null) {
            this.f27214e = new org.telegram.ui.Cells.n7(viewGroup.getContext(), c6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.f27214e, hu0Var.f29145r1.getCurrentAccount());
        if (i10 == 19) {
            o7Var.f24807s0 = true;
        }
        o7Var.setGradientView(hu0Var.f29161y);
        if (hu0.u(hu0Var, this) != -1) {
            o7Var.W = true;
        }
        o7Var.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(o7Var);
    }
}
