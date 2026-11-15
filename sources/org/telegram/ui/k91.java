package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
public final class k91 extends View {
    public final HashMap f48606a;
    public final l91 f48607b;

    public k91(l91 l91Var, Activity activity) {
        super(activity);
        this.f48607b = l91Var;
        this.f48606a = new HashMap();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        float f10;
        int i13;
        int L;
        boolean z10;
        int i14;
        l91 l91Var = this.f48607b;
        u91 u91Var = l91Var.d;
        int size = View.MeasureSpec.getSize(i7);
        int L2 = org.telegram.messenger.g0.L(64.0f);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < l91Var.F().size(); i17++) {
            if (l91Var.F().get(i17) != null && ((m91) l91Var.F().get(i17)).f49187c != null) {
                String str = ((m91) l91Var.F().get(i17)).f49187c.title;
                HashMap hashMap = this.f48606a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int i18 = 50;
                    if (!org.telegram.messenger.hd.f24104a0) {
                        if (u91Var.isInPreviewMode()) {
                            i14 = 11;
                        } else {
                            i14 = 50;
                        }
                        f10 = i14 + 4;
                    } else {
                        f10 = 18.0f;
                    }
                    int L3 = org.telegram.messenger.g0.L(f10);
                    if (!org.telegram.messenger.hd.f24104a0) {
                        i13 = size - L3;
                        L = org.telegram.messenger.g0.L(22.0f);
                    } else {
                        i13 = size - L3;
                        if (u91Var.isInPreviewMode()) {
                            i18 = 11;
                        }
                        L = org.telegram.messenger.g0.L(i18 + 13);
                    }
                    if (org.telegram.ui.ActionBar.j6.B0[0].measureText(str) <= (i13 - L) - ((int) Math.ceil(org.telegram.ui.ActionBar.j6.I0.measureText("00:00")))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bool = Boolean.valueOf(z10);
                    hashMap.put(str, bool);
                }
                if (!bool.booleanValue()) {
                    i12 = 20;
                } else {
                    i12 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(i12 + 64);
                if (((m91) l91Var.F().get(i17)).f49187c.f28103id == 1) {
                    L2 = L4;
                }
                if (((m91) l91Var.F().get(i17)).f49187c.hidden) {
                    i15++;
                }
                i16 += L4;
            }
        }
        if (i15 > 0) {
            i11 = (((u91Var.O.getMeasuredHeight() - u91Var.O.getPaddingTop()) - u91Var.O.getPaddingBottom()) - i16) + L2;
        } else {
            i11 = 0;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, i11), 1073741824));
    }
}
