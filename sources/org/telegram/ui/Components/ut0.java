package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

public final class ut0 extends jk0 {

    public final Context f33209c;
    public final int d;

    public boolean f33210e;

    public final hu0 f33211f;

    public ut0(hu0 hu0Var, Context context, int i10) {
        this.f33211f = hu0Var;
        this.f33209c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f33211f.f29140p1[this.d].f34328e;
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
        int measuredHeight = zk0Var.getChildAt(0).getMeasuredHeight();
        float fK = f10 * ((k() * measuredHeight) - (zk0Var.getMeasuredHeight() - zk0Var.getPaddingTop()));
        iArr[0] = (int) (fK / measuredHeight);
        iArr[1] = ((int) fK) % measuredHeight;
    }

    @Override
    public final void J(zk0 zk0Var) {
        if (this.f33210e) {
            this.f33210e = false;
            int iP = 0;
            for (int i10 = 0; i10 < zk0Var.getChildCount() && (iP = hu0.p(zk0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (iP == 0) {
                this.f33211f.S(this.d, zk0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f33210e = true;
        zs0 zs0VarW = this.f33211f.W(this.d);
        if (zs0VarW != null) {
            hu0.q(zs0VarW, null, false);
        }
    }

    @Override
    public final int h() {
        wt0[] wt0VarArr = this.f33211f.f29140p1;
        int i10 = this.d;
        wt0 wt0Var = wt0VarArr[i10];
        if (wt0Var.f34337o) {
            return wt0Var.e();
        }
        if (wt0Var.f34325a.size() == 0 && !wt0VarArr[i10].f34330g) {
            return 1;
        }
        if (wt0VarArr[i10].f34325a.size() == 0) {
            wt0 wt0Var2 = wt0VarArr[i10];
            boolean[] zArr = wt0Var2.f34331i;
            if ((!zArr[0] || !zArr[1]) && wt0Var2.f34334l) {
                return 0;
            }
        }
        if (wt0VarArr[i10].e() != 0) {
            return Math.max(wt0VarArr[i10].e(), wt0VarArr[i10].c().size() + wt0VarArr[i10].d());
        }
        int size = wt0VarArr[i10].c().size() + wt0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        wt0 wt0Var3 = wt0VarArr[i10];
        boolean[] zArr2 = wt0Var3.f34331i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = wt0Var3.f34340r;
        if ((z10 ? wt0Var3.f34343u : wt0Var3.f34336n) != 0) {
            return (z10 ? wt0Var3.f34343u : wt0Var3.f34336n) + size;
        }
        return size + 1;
    }

    @Override
    public final int j(int i10) {
        wt0[] wt0VarArr = this.f33211f.f29140p1;
        int i11 = this.d;
        if (wt0VarArr[i11].f34327c.size() == 0 && !wt0VarArr[i11].f34330g) {
            return 9;
        }
        wt0 wt0Var = wt0VarArr[i11];
        int i12 = wt0Var.f34335m;
        if (i10 < i12 || i10 >= wt0Var.f34325a.size() + i12) {
            return 8;
        }
        return (i11 == 2 || i11 == 4) ? 10 : 7;
    }

    @Override
    public final int k() {
        return this.f33211f.f29140p1[this.d].e();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        hu0 hu0Var = this.f33211f;
        long j10 = hu0Var.f29121f1;
        SparseArray[] sparseArrayArr = hu0Var.V0;
        wt0 wt0Var = hu0Var.f29140p1[this.d];
        ArrayList arrayList = wt0Var.f34325a;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.f7) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - wt0Var.f34335m);
                f7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (hu0Var.f29163y1) {
                    f7Var.b(sparseArrayArr[(messageObject.getDialogId() > j10 ? 1 : (messageObject.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !hu0Var.X0);
                    return;
                } else {
                    f7Var.b(false, !hu0Var.X0);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.e7)) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - wt0Var.f34335m);
            e7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (hu0Var.f29163y1) {
                e7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j10 ? 1 : (messageObject2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !hu0Var.X0);
            } else {
                e7Var.e(false, !hu0Var.X0);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View bt0Var;
        View view2;
        hu0 hu0Var = this.f33211f;
        h00 h00Var = hu0Var.f29161y;
        ArrayList arrayList = hu0Var.C0;
        org.telegram.ui.ActionBar.c6 c6Var = hu0Var.B1;
        Context context = this.f33209c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                h00 h00Var2 = new h00(context, c6Var);
                if (i11 == 2) {
                    h00Var2.setViewType(4);
                } else {
                    h00Var2.setViewType(3);
                }
                h00Var2.f28887w = false;
                h00Var2.setIsSingleCell(true);
                h00Var2.setGlobalGradientView(h00Var);
                view = h00Var2;
            } else {
                if (i10 == 9) {
                    ts0 ts0VarM = hu0.M(i11, hu0Var.f29121f1, context, c6Var);
                    ts0VarM.setLayoutParams(new f2.y0(-1, -1));
                    return new lk0(ts0VarM);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    bt0Var = new bt0(this, context, c6Var, 1);
                } else {
                    view2 = (View) arrayList.get(0);
                    arrayList.remove(0);
                    ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
                    if (viewGroup2 != null) {
                        bt0Var = view2;
                        viewGroup2.removeView(view2);
                        bt0Var = view2;
                    }
                }
                bt0Var = view2;
                org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) bt0Var;
                e7Var.setGlobalGradientView(h00Var);
                view = bt0Var;
                if (i11 == 4) {
                    hu0Var.D0.add(e7Var);
                    view = bt0Var;
                }
            }
        } else {
            org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, 0, c6Var);
            f7Var.setGlobalGradientView(h00Var);
            view = f7Var;
        }
        return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
    }
}
