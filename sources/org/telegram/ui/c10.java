package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class c10 extends org.telegram.ui.Components.sk0 {
    public final Context f37035r;
    public final b10 f37036s = new b10(this);
    public final f10 v;

    public c10(f10 f10Var, Context context) {
        this.v = f10Var;
        this.f37035r = context;
    }

    @Override
    public final String F(int i9) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i9) {
        f10 f10Var = this.v;
        int i10 = 1;
        if (i9 >= f10Var.f38102n.size()) {
            return 1;
        }
        int size = ((ArrayList) f10Var.f38104r.get(f10Var.f38102n.get(i9))).size();
        if (i9 == 0) {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final Object O(int i9, int i10) {
        return null;
    }

    @Override
    public final int P(int i9, int i10) {
        if (i9 < this.v.f38102n.size()) {
            if (i9 != 0 && i10 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        f10 f10Var = this.v;
        ArrayList arrayList = f10Var.f38102n;
        int i9 = 0;
        if (f10Var.f38094f.isEmpty() || (arrayList.isEmpty() && f10Var.I)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !f10Var.J) {
            i9 = 1;
        }
        return size + i9;
    }

    @Override
    public final View T(int i9, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f37035r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23020e7, false) & (-218103809));
        }
        if (i9 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        f10 f10Var = this.v;
        if (i9 < f10Var.f38102n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) f10Var.f38104r.get((String) f10Var.f38102n.get(i9))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        return true;
    }

    @Override
    public final void W(int i9, int i10, f2.q1 q1Var) {
        boolean z10;
        f10 f10Var = this.v;
        ArrayList arrayList = f10Var.f38102n;
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) f10Var.f38104r.get((String) arrayList.get(i9));
            int i12 = q1Var.f5505f;
            boolean z11 = false;
            if (i12 != 0) {
                if (i12 == 1) {
                    if (i9 != 0) {
                        i10--;
                    }
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                    MessageObject messageObject = (MessageObject) arrayList2.get(i10);
                    if (l7Var.getMessage() != null && l7Var.getMessage().getId() == messageObject.getId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 != arrayList2.size() - 1 || (i9 == arrayList.size() - 1 && f10Var.I)) {
                        z11 = true;
                    }
                    l7Var.f24671y = z11;
                    l7Var.e();
                    l7Var.U = messageObject;
                    l7Var.requestLayout();
                    l7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.dk(this, l7Var, messageObject, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.v3 v3Var;
        Context context = this.f37035r;
        if (i9 != 0) {
            if (i9 != 1) {
                org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
                e00Var.setViewType(5);
                e00Var.setIsSingleCell(true);
                v3Var = e00Var;
            } else {
                org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 1, null);
                l7Var.setDelegate(this.f37036s);
                v3Var = l7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, null);
        }
        return j3.r0.s(v3Var, v3Var, -1, -2);
    }
}
