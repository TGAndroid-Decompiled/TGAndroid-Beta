package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class q10 extends org.telegram.ui.Components.ol0 {
    public final Context f37572r;
    public final p10 f37573s = new p10(this);
    public final t10 v;

    public q10(t10 t10Var, Context context) {
        this.v = t10Var;
        this.f37572r = context;
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
        if (i10 >= t10Var.f38488n.size()) {
            return 1;
        }
        int size = ((ArrayList) t10Var.f38491r.get(t10Var.f38488n.get(i10))).size();
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
        if (i10 < this.v.f38488n.size()) {
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
        ArrayList arrayList = t10Var.f38488n;
        int i10 = 0;
        if (t10Var.f38480f.isEmpty() || (arrayList.isEmpty() && t10Var.J)) {
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
            view = new org.telegram.ui.Cells.u3(this.f37572r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19924e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        t10 t10Var = this.v;
        if (i10 < t10Var.f38488n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) t10Var.f38491r.get((String) t10Var.f38488n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.l1 l1Var) {
        return true;
    }

    @Override
    public final void W(int i10, int i11, f2.l1 l1Var) {
        boolean z4;
        t10 t10Var = this.v;
        ArrayList arrayList = t10Var.f38488n;
        int i12 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) t10Var.f38491r.get((String) arrayList.get(i10));
            int i13 = l1Var.f5788f;
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
                    l7Var.f21362y = z10;
                    l7Var.e();
                    l7Var.V = messageObject;
                    l7Var.requestLayout();
                    l7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.fk(this, l7Var, messageObject, z4, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        Context context = this.f37572r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setViewType(5);
                t00Var.setIsSingleCell(true);
                u3Var = t00Var;
            } else {
                org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 1, null);
                l7Var.setDelegate(this.f37573s);
                u3Var = l7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        }
        return yh.o(u3Var, u3Var, -1, -2);
    }
}
