package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class q10 extends org.telegram.ui.Components.ol0 {
    public final Context f40295r;
    public final p10 f40296s = new p10(this);
    public final t10 v;

    public q10(t10 t10Var, Context context) {
        this.v = t10Var;
        this.f40295r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.sl0 sl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        t10 t10Var = this.v;
        int i11 = 1;
        if (i10 >= t10Var.f41372n.size()) {
            return 1;
        }
        int size = ((ArrayList) t10Var.f41375r.get(t10Var.f41372n.get(i10))).size();
        if (i10 == 0) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 < this.v.f41372n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        t10 t10Var = this.v;
        ArrayList arrayList = t10Var.f41372n;
        int i10 = 0;
        if (t10Var.f41364f.isEmpty() || (arrayList.isEmpty() && t10Var.J)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !t10Var.K) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f40295r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21680e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        t10 t10Var = this.v;
        if (i10 < t10Var.f41372n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) t10Var.f41375r.get((String) t10Var.f41372n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.m1 m1Var) {
        return true;
    }

    @Override
    public final void W(int i10, int i11, f2.m1 m1Var) {
        boolean z4;
        t10 t10Var = this.v;
        ArrayList arrayList = t10Var.f41372n;
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) t10Var.f41375r.get((String) arrayList.get(i10));
            int i13 = m1Var.f5879f;
            boolean z10 = false;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (i10 != 0) {
                        i11--;
                    }
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                    MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                    if (l7Var.getMessage() != null && l7Var.getMessage().getId() == messageObject.getId()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && t10Var.J)) {
                        z10 = true;
                    }
                    l7Var.f23134y = z10;
                    l7Var.e();
                    l7Var.V = messageObject;
                    l7Var.requestLayout();
                    l7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.hk(this, l7Var, messageObject, z4, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        Context context = this.f40295r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setViewType(5);
                u00Var.setIsSingleCell(true);
                u3Var = u00Var;
            } else {
                org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 1, null);
                l7Var.setDelegate(this.f40296s);
                u3Var = l7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        }
        return yh.o(u3Var, u3Var, -1, -2);
    }
}
