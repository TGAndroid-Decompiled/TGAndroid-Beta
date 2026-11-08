package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
public final class m91 extends View {
    public final HashMap f47734a;
    public final n91 f47735b;

    public m91(n91 n91Var, Activity activity) {
        super(activity);
        this.f47735b = n91Var;
        this.f47734a = new HashMap();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        float f10;
        int i13;
        int L;
        boolean z9;
        int i14;
        n91 n91Var = this.f47735b;
        w91 w91Var = n91Var.d;
        int size = View.MeasureSpec.getSize(i7);
        int L2 = org.telegram.messenger.g0.L(64.0f);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < n91Var.F().size(); i17++) {
            if (n91Var.F().get(i17) != null && ((o91) n91Var.F().get(i17)).f48337c != null) {
                String str = ((o91) n91Var.F().get(i17)).f48337c.title;
                HashMap hashMap = this.f47734a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int i18 = 50;
                    if (!org.telegram.messenger.id.f23157a0) {
                        if (w91Var.isInPreviewMode()) {
                            i14 = 11;
                        } else {
                            i14 = 50;
                        }
                        f10 = i14 + 4;
                    } else {
                        f10 = 18.0f;
                    }
                    int L3 = org.telegram.messenger.g0.L(f10);
                    if (!org.telegram.messenger.id.f23157a0) {
                        i13 = size - L3;
                        L = org.telegram.messenger.g0.L(22.0f);
                    } else {
                        i13 = size - L3;
                        if (w91Var.isInPreviewMode()) {
                            i18 = 11;
                        }
                        L = org.telegram.messenger.g0.L(i18 + 13);
                    }
                    if (org.telegram.ui.ActionBar.k6.B0[0].measureText(str) <= (i13 - L) - ((int) Math.ceil(org.telegram.ui.ActionBar.k6.I0.measureText("00:00")))) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bool = Boolean.valueOf(z9);
                    hashMap.put(str, bool);
                }
                if (!bool.booleanValue()) {
                    i12 = 20;
                } else {
                    i12 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(i12 + 64);
                if (((o91) n91Var.F().get(i17)).f48337c.f27008id == 1) {
                    L2 = L4;
                }
                if (((o91) n91Var.F().get(i17)).f48337c.hidden) {
                    i15++;
                }
                i16 += L4;
            }
        }
        if (i15 > 0) {
            i11 = (((w91Var.N.getMeasuredHeight() - w91Var.N.getPaddingTop()) - w91Var.N.getPaddingBottom()) - i16) + L2;
        } else {
            i11 = 0;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, i11), 1073741824));
    }
}
