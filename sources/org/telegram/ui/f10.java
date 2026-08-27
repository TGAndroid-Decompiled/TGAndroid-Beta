package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

public final class f10 extends org.telegram.ui.Components.vk0 {

    public final Context f37903r;

    public final e10 f37904s = new e10(this);
    public final i10 v;

    public f10(i10 i10Var, Context context) {
        this.v = i10Var;
        this.f37903r = context;
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
        if (i10 < this.v.f38951n.size()) {
            return (i10 == 0 || i11 != 0) ? 1 : 0;
        }
        return 2;
    }

    @Override
    public final int R() {
        i10 i10Var = this.v;
        ArrayList arrayList = i10Var.f38951n;
        int i10 = 0;
        if (i10Var.f38943f.isEmpty() || (arrayList.isEmpty() && i10Var.I)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !i10Var.J) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.s3(this.f37903r, null);
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
        return true;
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
            if (i13 != 1) {
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject messageObject = (MessageObject) arrayList2.get(i11);
            boolean z11 = i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject.getId();
            if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && i10Var.I)) {
                z10 = true;
            }
            i7Var.f24497y = z10;
            i7Var.e();
            i7Var.U = messageObject;
            i7Var.requestLayout();
            i7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.zj(this, i7Var, messageObject, z11, 4));
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View s3Var;
        Context context = this.f37903r;
        if (i10 == 0) {
            s3Var = new org.telegram.ui.Cells.s3(context, null);
        } else if (i10 != 1) {
            org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
            h00Var.setViewType(5);
            h00Var.setIsSingleCell(true);
            s3Var = h00Var;
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 1, null);
            i7Var.setDelegate(this.f37904s);
            s3Var = i7Var;
        }
        return org.telegram.ui.Cells.pa.l(s3Var, s3Var, -1, -2);
    }
}
