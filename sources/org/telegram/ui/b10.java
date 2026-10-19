package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class b10 extends org.telegram.ui.Components.em0 {
    public final Context f35481r;
    public final a10 f35482s = new a10(this);
    public final e10 v;

    public b10(e10 e10Var, Context context) {
        this.v = e10Var;
        this.f35481r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.im0 im0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        e10 e10Var = this.v;
        int i11 = 1;
        if (i10 >= e10Var.f36510n.size()) {
            return 1;
        }
        int size = ((ArrayList) e10Var.f36515r.get(e10Var.f36510n.get(i10))).size();
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
        if (i10 < this.v.f36510n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        e10 e10Var = this.v;
        ArrayList arrayList = e10Var.f36510n;
        int i10 = 0;
        if (e10Var.f36502f.isEmpty() || (arrayList.isEmpty() && e10Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !e10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f35481r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        e10 e10Var = this.v;
        if (i10 < e10Var.f36510n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) e10Var.f36515r.get((String) e10Var.f36510n.get(i10))).get(0)).messageOwner.date));
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
        e10 e10Var = this.v;
        ArrayList arrayList = e10Var.f36510n;
        int i12 = b1Var.f45913f;
        View view = b1Var.f45910a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) e10Var.f36515r.get((String) arrayList.get(i10));
            int i13 = b1Var.f45913f;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (i10 != 0) {
                        i11--;
                    }
                    org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) view;
                    MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                    if (m7Var.getMessage() != null && m7Var.getMessage().getId() == messageObject.getId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && e10Var.M)) {
                        z11 = true;
                    }
                    m7Var.f22607y = z11;
                    m7Var.e();
                    m7Var.f22589b0 = messageObject;
                    m7Var.requestLayout();
                    m7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, m7Var, messageObject, z10, 4));
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
        Context context = this.f35481r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
                b10Var.setViewType(5);
                b10Var.setIsSingleCell(true);
                u3Var = b10Var;
            } else {
                org.telegram.ui.Cells.m7 m7Var = new org.telegram.ui.Cells.m7(context, 1, null);
                m7Var.setDelegate(this.f35482s);
                u3Var = m7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        }
        return com.google.android.gms.internal.play_billing.k3.l(u3Var, u3Var, -1, -2);
    }
}
