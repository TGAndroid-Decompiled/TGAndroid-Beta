package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class g10 extends org.telegram.ui.Components.im0 {
    public final Context f39471r;
    public final f10 f39472s = new f10(this);
    public final j10 v;

    public g10(j10 j10Var, Context context) {
        this.v = j10Var;
        this.f39471r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.nm0 nm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        j10 j10Var = this.v;
        int i11 = 1;
        if (i10 >= j10Var.f40336n.size()) {
            return 1;
        }
        int size = ((ArrayList) j10Var.f40341r.get(j10Var.f40336n.get(i10))).size();
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
        if (i10 < this.v.f40336n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        j10 j10Var = this.v;
        ArrayList arrayList = j10Var.f40336n;
        int i10 = 0;
        if (j10Var.f40328f.isEmpty() || (arrayList.isEmpty() && j10Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !j10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(this.f39471r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23377e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        j10 j10Var = this.v;
        if (i10 < j10Var.f40336n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) j10Var.f40341r.get((String) j10Var.f40336n.get(i10))).get(0)).messageOwner.date));
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
        j10 j10Var = this.v;
        ArrayList arrayList = j10Var.f40336n;
        int i12 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) j10Var.f40341r.get((String) arrayList.get(i10));
            int i13 = e1Var.f47776f;
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
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && j10Var.M)) {
                        z11 = true;
                    }
                    r7Var.f24997y = z11;
                    r7Var.e();
                    r7Var.f24979b0 = messageObject;
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
        Context context = this.f39471r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
                c10Var.setViewType(5);
                c10Var.setIsSingleCell(true);
                z3Var = c10Var;
            } else {
                org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, 1, null);
                r7Var.setDelegate(this.f39472s);
                z3Var = r7Var;
            }
        } else {
            z3Var = new org.telegram.ui.Cells.z3(context, null);
        }
        return ic.a.n(z3Var, z3Var, -1, -2);
    }
}
