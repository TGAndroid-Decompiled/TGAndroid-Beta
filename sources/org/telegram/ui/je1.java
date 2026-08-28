package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class je1 extends View {
    public final HashMap f39464a;
    public final ke1 f39465b;

    public je1(ke1 ke1Var, Activity activity) {
        super(activity);
        this.f39465b = ke1Var;
        this.f39464a = new HashMap();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        float f10;
        int i13;
        int dp;
        boolean z10;
        int i14;
        ke1 ke1Var = this.f39465b;
        we1 we1Var = ke1Var.d;
        int size = View.MeasureSpec.getSize(i9);
        int dp2 = AndroidUtilities.dp(64.0f);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < ke1Var.F().size(); i17++) {
            if (ke1Var.F().get(i17) != null && ((me1) ke1Var.F().get(i17)).f40405c != null) {
                String str = ((me1) ke1Var.F().get(i17)).f40405c.title;
                HashMap hashMap = this.f39464a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int i18 = 50;
                    if (!LocaleController.isRTL) {
                        if (we1Var.isInPreviewMode()) {
                            i14 = 11;
                        } else {
                            i14 = 50;
                        }
                        f10 = i14 + 4;
                    } else {
                        f10 = 18.0f;
                    }
                    int dp3 = AndroidUtilities.dp(f10);
                    if (!LocaleController.isRTL) {
                        i13 = size - dp3;
                        dp = AndroidUtilities.dp(22.0f);
                    } else {
                        i13 = size - dp3;
                        if (we1Var.isInPreviewMode()) {
                            i18 = 11;
                        }
                        dp = AndroidUtilities.dp(i18 + 13);
                    }
                    if (org.telegram.ui.ActionBar.f6.B0[0].measureText(str) <= (i13 - dp) - ((int) Math.ceil(org.telegram.ui.ActionBar.f6.I0.measureText("00:00")))) {
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
                int dp4 = AndroidUtilities.dp(i12 + 64);
                if (((me1) ke1Var.F().get(i17)).f40405c.f22432id == 1) {
                    dp2 = dp4;
                }
                if (((me1) ke1Var.F().get(i17)).f40405c.hidden) {
                    i15++;
                }
                i16 += dp4;
            }
        }
        if (i15 > 0) {
            i11 = (((we1Var.J.getMeasuredHeight() - we1Var.J.getPaddingTop()) - we1Var.J.getPaddingBottom()) - i16) + dp2;
        } else {
            i11 = 0;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(0, i11), 1073741824));
    }
}
