package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

public final class d10 extends org.telegram.ui.Components.vk0 {

    public final Context f37230r;

    public final int f37231s;
    public final i10 v;

    public d10(i10 i10Var, Context context, int i10) {
        this.v = i10Var;
        this.f37230r = context;
        this.f37231s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        i10 i10Var = this.v;
        if (i10 < i10Var.f38951n.size()) {
            return ((ArrayList) i10Var.f38953r.get(i10Var.f38951n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 >= this.v.f38951n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f37231s;
        return (i12 == 2 || i12 == 4) ? 3 : 1;
    }

    @Override
    public final int R() {
        i10 i10Var = this.v;
        int i10 = 0;
        if (i10Var.f38951n.isEmpty()) {
            return 0;
        }
        int size = i10Var.f38951n.size();
        if (!i10Var.f38951n.isEmpty() && !i10Var.J) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.s3(this.f37230r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23073e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        i10 i10Var = this.v;
        if (i10 < i10Var.f38951n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) i10Var.f38953r.get((String) i10Var.f38951n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.o1 o1Var) {
        return i10 == 0 || i11 != 0;
    }

    @Override
    public final void W(int i10, int i11, f2.o1 o1Var) {
        i10 i10Var = this.v;
        ArrayList arrayList = i10Var.f38951n;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) i10Var.f38953r.get((String) arrayList.get(i10));
            int i13 = o1Var.f5793f;
            boolean z10 = false;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
                return;
            }
            boolean z11 = true;
            if (i13 != 1) {
                if (i13 != 3) {
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
                MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                boolean z12 = e7Var.getMessage() != null && e7Var.getMessage().getId() == messageObject.getId();
                if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && i10Var.I)) {
                    z10 = true;
                }
                e7Var.f(messageObject, z10);
                e7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.zj(this, e7Var, messageObject, z12, 3));
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
            if (f7Var.getMessage() != null && f7Var.getMessage().getId() == messageObject2.getId()) {
                z10 = true;
            }
            if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !i10Var.I)) {
                z11 = false;
            }
            f7Var.c(messageObject2, z11);
            f7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.zj(this, f7Var, messageObject2, z10, 2));
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View s3Var;
        View c10Var;
        Context context = this.f37230r;
        if (i10 == 0) {
            s3Var = new org.telegram.ui.Cells.s3(context, null);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    c10Var = new c10(this, context);
                } else {
                    org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
                    int i11 = this.f37231s;
                    if (i11 == 2 || i11 == 4) {
                        h00Var.setViewType(4);
                    } else {
                        h00Var.setViewType(3);
                    }
                    h00Var.setIsSingleCell(true);
                    s3Var = h00Var;
                }
                return org.telegram.ui.Cells.pa.l(c10Var, c10Var, -1, -2);
            }
            s3Var = new org.telegram.ui.Cells.f7(context, 2, null);
        }
        c10Var = s3Var;
        return org.telegram.ui.Cells.pa.l(c10Var, c10Var, -1, -2);
    }
}
