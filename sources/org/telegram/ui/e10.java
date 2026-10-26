package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class e10 extends org.telegram.ui.Components.hm0 {
    public final Context f38964r;
    public final d10 f38965s = new d10(this);
    public final h10 v;

    public e10(h10 h10Var, Context context) {
        this.v = h10Var;
        this.f38964r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        h10 h10Var = this.v;
        int i11 = 1;
        if (i10 >= h10Var.f39842n.size()) {
            return 1;
        }
        int size = ((ArrayList) h10Var.f39847r.get(h10Var.f39842n.get(i10))).size();
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
        if (i10 < this.v.f39842n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        h10 h10Var = this.v;
        ArrayList arrayList = h10Var.f39842n;
        int i10 = 0;
        if (h10Var.f39834f.isEmpty() || (arrayList.isEmpty() && h10Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !h10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(this.f38964r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23376e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        h10 h10Var = this.v;
        if (i10 < h10Var.f39842n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) h10Var.f39847r.get((String) h10Var.f39842n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.e1 e1Var) {
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.e1 e1Var) {
        boolean z10;
        h10 h10Var = this.v;
        ArrayList arrayList = h10Var.f39842n;
        int i12 = e1Var.f47741f;
        View view = e1Var.f47738a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) h10Var.f39847r.get((String) arrayList.get(i10));
            int i13 = e1Var.f47741f;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (i10 != 0) {
                        i11--;
                    }
                    org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                    MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                    if (r7Var.getMessage() != null && r7Var.getMessage().getId() == messageObject.getId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && h10Var.M)) {
                        z11 = true;
                    }
                    r7Var.f24995y = z11;
                    r7Var.e();
                    r7Var.f24977b0 = messageObject;
                    r7Var.requestLayout();
                    r7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, r7Var, messageObject, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        Context context = this.f38964r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
                c10Var.setViewType(5);
                c10Var.setIsSingleCell(true);
                z3Var = c10Var;
            } else {
                org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, 1, null);
                r7Var.setDelegate(this.f38965s);
                z3Var = r7Var;
            }
        } else {
            z3Var = new org.telegram.ui.Cells.z3(context, null);
        }
        return ic.a.n(z3Var, z3Var, -1, -2);
    }
}
