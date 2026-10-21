package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class fe1 extends View {
    public final HashMap f36986a;
    public final ge1 f36987b;

    public fe1(ge1 ge1Var, Activity activity) {
        super(activity);
        this.f36987b = ge1Var;
        this.f36986a = new HashMap();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        int i14;
        int dp;
        boolean z10;
        int i15;
        ge1 ge1Var = this.f36987b;
        re1 re1Var = ge1Var.d;
        int size = View.MeasureSpec.getSize(i10);
        int dp2 = AndroidUtilities.dp(64.0f);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < ge1Var.F().size(); i18++) {
            if (ge1Var.F().get(i18) != null && ((ie1) ge1Var.F().get(i18)).f37959c != null) {
                String str = ((ie1) ge1Var.F().get(i18)).f37959c.title;
                HashMap hashMap = this.f36986a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int i19 = 50;
                    if (!LocaleController.isRTL) {
                        if (re1Var.isInPreviewMode()) {
                            i15 = 11;
                        } else {
                            i15 = 50;
                        }
                        f7 = i15 + 4;
                    } else {
                        f7 = 18.0f;
                    }
                    int dp3 = AndroidUtilities.dp(f7);
                    if (!LocaleController.isRTL) {
                        i14 = size - dp3;
                        dp = AndroidUtilities.dp(22.0f);
                    } else {
                        i14 = size - dp3;
                        if (re1Var.isInPreviewMode()) {
                            i19 = 11;
                        }
                        dp = AndroidUtilities.dp(i19 + 13);
                    }
                    if (org.telegram.ui.ActionBar.h6.B0[0].measureText(str) <= (i14 - dp) - ((int) Math.ceil(org.telegram.ui.ActionBar.h6.I0.measureText("00:00")))) {
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
                if (((ie1) ge1Var.F().get(i18)).f37959c.f20328id == 1) {
                    dp2 = dp4;
                }
                if (((ie1) ge1Var.F().get(i18)).f37959c.hidden) {
                    i16++;
                }
                i17 += dp4;
            }
        }
        if (i16 > 0) {
            i12 = (((re1Var.N.getMeasuredHeight() - re1Var.N.getPaddingTop()) - re1Var.N.getPaddingBottom()) - i17) + dp2;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i12), 1073741824));
    }
}
