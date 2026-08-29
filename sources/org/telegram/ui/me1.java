package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class me1 extends View {
    public final HashMap f40544a;
    public final ne1 f40545b;

    public me1(ne1 ne1Var, Activity activity) {
        super(activity);
        this.f40545b = ne1Var;
        this.f40544a = new HashMap();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f9;
        int i14;
        int dp;
        boolean z10;
        int i15;
        ne1 ne1Var = this.f40545b;
        ze1 ze1Var = ne1Var.d;
        int size = View.MeasureSpec.getSize(i10);
        int dp2 = AndroidUtilities.dp(64.0f);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < ne1Var.F().size(); i18++) {
            if (ne1Var.F().get(i18) != null && ((pe1) ne1Var.F().get(i18)).f41396c != null) {
                String str = ((pe1) ne1Var.F().get(i18)).f41396c.title;
                HashMap hashMap = this.f40544a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int i19 = 50;
                    if (!LocaleController.isRTL) {
                        if (ze1Var.isInPreviewMode()) {
                            i15 = 11;
                        } else {
                            i15 = 50;
                        }
                        f9 = i15 + 4;
                    } else {
                        f9 = 18.0f;
                    }
                    int dp3 = AndroidUtilities.dp(f9);
                    if (!LocaleController.isRTL) {
                        i14 = size - dp3;
                        dp = AndroidUtilities.dp(22.0f);
                    } else {
                        i14 = size - dp3;
                        if (ze1Var.isInPreviewMode()) {
                            i19 = 11;
                        }
                        dp = AndroidUtilities.dp(i19 + 13);
                    }
                    if (org.telegram.ui.ActionBar.g6.B0[0].measureText(str) <= (i14 - dp) - ((int) Math.ceil(org.telegram.ui.ActionBar.g6.I0.measureText("00:00")))) {
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
                int dp4 = AndroidUtilities.dp(i13 + 64);
                if (((pe1) ne1Var.F().get(i18)).f41396c.f22444id == 1) {
                    dp2 = dp4;
                }
                if (((pe1) ne1Var.F().get(i18)).f41396c.hidden) {
                    i16++;
                }
                i17 += dp4;
            }
        }
        if (i16 > 0) {
            i12 = (((ze1Var.J.getMeasuredHeight() - ze1Var.J.getPaddingTop()) - ze1Var.J.getPaddingBottom()) - i17) + dp2;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i12), 1073741824));
    }
}
