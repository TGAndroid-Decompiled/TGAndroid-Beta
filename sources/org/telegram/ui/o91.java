package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
public final class o91 extends View {
    public final HashMap f48413a;
    public final p91 f48414b;

    public o91(p91 p91Var, Activity activity) {
        super(activity);
        this.f48414b = p91Var;
        this.f48413a = new HashMap();
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
        p91 p91Var = this.f48414b;
        y91 y91Var = p91Var.d;
        int size = View.MeasureSpec.getSize(i7);
        int L2 = org.telegram.messenger.g0.L(64.0f);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < p91Var.F().size(); i17++) {
            if (p91Var.F().get(i17) != null && ((q91) p91Var.F().get(i17)).f48989c != null) {
                String str = ((q91) p91Var.F().get(i17)).f48989c.title;
                HashMap hashMap = this.f48413a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int i18 = 50;
                    if (!org.telegram.messenger.id.f23157a0) {
                        if (y91Var.isInPreviewMode()) {
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
                        if (y91Var.isInPreviewMode()) {
                            i18 = 11;
                        }
                        L = org.telegram.messenger.g0.L(i18 + 13);
                    }
                    if (org.telegram.ui.ActionBar.l6.B0[0].measureText(str) <= (i13 - L) - ((int) Math.ceil(org.telegram.ui.ActionBar.l6.I0.measureText("00:00")))) {
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
                if (((q91) p91Var.F().get(i17)).f48989c.f27008id == 1) {
                    L2 = L4;
                }
                if (((q91) p91Var.F().get(i17)).f48989c.hidden) {
                    i15++;
                }
                i16 += L4;
            }
        }
        if (i15 > 0) {
            i11 = (((y91Var.N.getMeasuredHeight() - y91Var.N.getPaddingTop()) - y91Var.N.getPaddingBottom()) - i16) + L2;
        } else {
            i11 = 0;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, i11), 1073741824));
    }
}
