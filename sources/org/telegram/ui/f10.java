package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class f10 extends org.telegram.ui.Components.hm0 {
    public final Context f37169r;
    public final e10 f37170s = new e10(this);
    public final i10 v;

    public f10(i10 i10Var, Context context) {
        this.v = i10Var;
        this.f37169r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.lm0 lm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        i10 i10Var = this.v;
        int i11 = 1;
        if (i10 >= i10Var.f38109n.size()) {
            return 1;
        }
        int size = ((ArrayList) i10Var.f38114r.get(i10Var.f38109n.get(i10))).size();
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
        if (i10 < this.v.f38109n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        i10 i10Var = this.v;
        ArrayList arrayList = i10Var.f38109n;
        int i10 = 0;
        if (i10Var.f38101f.isEmpty() || (arrayList.isEmpty() && i10Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !i10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f37169r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        i10 i10Var = this.v;
        if (i10 < i10Var.f38109n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) i10Var.f38114r.get((String) i10Var.f38109n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        boolean z10;
        i10 i10Var = this.v;
        ArrayList arrayList = i10Var.f38109n;
        int i12 = b1Var.f46345f;
        View view = b1Var.f46342a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) i10Var.f38114r.get((String) arrayList.get(i10));
            int i13 = b1Var.f46345f;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (i10 != 0) {
                        i11--;
                    }
                    org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                    MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                    if (n7Var.getMessage() != null && n7Var.getMessage().getId() == messageObject.getId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && i10Var.M)) {
                        z11 = true;
                    }
                    n7Var.f22816y = z11;
                    n7Var.e();
                    n7Var.f22798b0 = messageObject;
                    n7Var.requestLayout();
                    n7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.jk(this, n7Var, messageObject, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        Context context = this.f37169r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(context, null);
                z00Var.setViewType(5);
                z00Var.setIsSingleCell(true);
                u3Var = z00Var;
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 1, null);
                n7Var.setDelegate(this.f37170s);
                u3Var = n7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        }
        return com.google.android.gms.internal.play_billing.k3.l(u3Var, u3Var, -1, -2);
    }
}
