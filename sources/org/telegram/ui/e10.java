package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class e10 extends org.telegram.ui.Components.fl0 {
    public final Context f37669r;
    public final d10 f37670s = new d10(this);
    public final h10 v;

    public e10(h10 h10Var, Context context) {
        this.v = h10Var;
        this.f37669r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        h10 h10Var = this.v;
        int i11 = 1;
        if (i10 >= h10Var.f38735n.size()) {
            return 1;
        }
        int size = ((ArrayList) h10Var.f38737r.get(h10Var.f38735n.get(i10))).size();
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
        if (i10 < this.v.f38735n.size()) {
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
        ArrayList arrayList = h10Var.f38735n;
        int i10 = 0;
        if (h10Var.f38727f.isEmpty() || (arrayList.isEmpty() && h10Var.I)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !h10Var.J) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.s3(this.f37669r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23081e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        h10 h10Var = this.v;
        if (i10 < h10Var.f38735n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) h10Var.f38737r.get((String) h10Var.f38735n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.n1 n1Var) {
        return true;
    }

    @Override
    public final void W(int i10, int i11, f2.n1 n1Var) {
        boolean z10;
        h10 h10Var = this.v;
        ArrayList arrayList = h10Var.f38735n;
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) h10Var.f38737r.get((String) arrayList.get(i10));
            int i13 = n1Var.f6436f;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (i10 != 0) {
                        i11--;
                    }
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                    MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                    if (j7Var.getMessage() != null && j7Var.getMessage().getId() == messageObject.getId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && h10Var.I)) {
                        z11 = true;
                    }
                    j7Var.f24561y = z11;
                    j7Var.e();
                    j7Var.U = messageObject;
                    j7Var.requestLayout();
                    j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.hk(this, j7Var, messageObject, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s3 s3Var;
        Context context = this.f37669r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
                p00Var.setViewType(5);
                p00Var.setIsSingleCell(true);
                s3Var = p00Var;
            } else {
                org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 1, null);
                j7Var.setDelegate(this.f37670s);
                s3Var = j7Var;
            }
        } else {
            s3Var = new org.telegram.ui.Cells.s3(context, null);
        }
        return th.m(s3Var, s3Var, -1, -2);
    }
}
