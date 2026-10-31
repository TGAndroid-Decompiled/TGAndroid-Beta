package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
public final class fb1 extends View {
    public final HashMap f37223a;
    public final gb1 f37224b;

    public fb1(gb1 gb1Var, Activity activity) {
        super(activity);
        this.f37224b = gb1Var;
        this.f37223a = new HashMap();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        int i14;
        int L;
        boolean z10;
        int i15;
        gb1 gb1Var = this.f37224b;
        pb1 pb1Var = gb1Var.d;
        int size = View.MeasureSpec.getSize(i10);
        int L2 = org.telegram.messenger.i0.L(64.0f);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < gb1Var.F().size(); i18++) {
            if (gb1Var.F().get(i18) != null && ((hb1) gb1Var.F().get(i18)).f37887c != null) {
                String str = ((hb1) gb1Var.F().get(i18)).f37887c.title;
                HashMap hashMap = this.f37223a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int i19 = 50;
                    if (!org.telegram.messenger.cd.X) {
                        if (pb1Var.isInPreviewMode()) {
                            i15 = 11;
                        } else {
                            i15 = 50;
                        }
                        f7 = i15 + 4;
                    } else {
                        f7 = 18.0f;
                    }
                    int L3 = org.telegram.messenger.i0.L(f7);
                    if (!org.telegram.messenger.cd.X) {
                        i14 = size - L3;
                        L = org.telegram.messenger.i0.L(22.0f);
                    } else {
                        i14 = size - L3;
                        if (pb1Var.isInPreviewMode()) {
                            i19 = 11;
                        }
                        L = org.telegram.messenger.i0.L(i19 + 13);
                    }
                    if (org.telegram.ui.ActionBar.t6.B0[0].measureText(str) <= (i14 - L) - ((int) Math.ceil(org.telegram.ui.ActionBar.t6.I0.measureText("00:00")))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bool = Boolean.valueOf(z10);
                    hashMap.put(str, bool);
                }
                if (!bool.booleanValue()) {
                    i13 = 20;
                } else {
                    i13 = 0;
                }
                int L4 = org.telegram.messenger.i0.L(i13 + 64);
                if (((hb1) gb1Var.F().get(i18)).f37887c.f19845id == 1) {
                    L2 = L4;
                }
                if (((hb1) gb1Var.F().get(i18)).f37887c.hidden) {
                    i16++;
                }
                i17 += L4;
            }
        }
        if (i16 > 0) {
            i12 = (((pb1Var.N.getMeasuredHeight() - pb1Var.N.getPaddingTop()) - pb1Var.N.getPaddingBottom()) - i17) + L2;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i12), 1073741824));
    }
}
