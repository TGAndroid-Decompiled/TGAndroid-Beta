package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class gf1 extends View {
    public final HashMap f34442a;
    public final hf1 f34443b;

    public gf1(hf1 hf1Var, Activity activity) {
        super(activity);
        this.f34443b = hf1Var;
        this.f34442a = new HashMap();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f10;
        int i14;
        int dp;
        boolean z4;
        int i15;
        hf1 hf1Var = this.f34443b;
        sf1 sf1Var = hf1Var.d;
        int size = View.MeasureSpec.getSize(i10);
        int dp2 = AndroidUtilities.dp(64.0f);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < hf1Var.F().size(); i18++) {
            if (hf1Var.F().get(i18) != null && ((jf1) hf1Var.F().get(i18)).f35268c != null) {
                String str = ((jf1) hf1Var.F().get(i18)).f35268c.title;
                HashMap hashMap = this.f34442a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int i19 = 50;
                    if (!LocaleController.isRTL) {
                        if (sf1Var.isInPreviewMode()) {
                            i15 = 11;
                        } else {
                            i15 = 50;
                        }
                        f10 = i15 + 4;
                    } else {
                        f10 = 18.0f;
                    }
                    int dp3 = AndroidUtilities.dp(f10);
                    if (!LocaleController.isRTL) {
                        i14 = size - dp3;
                        dp = AndroidUtilities.dp(22.0f);
                    } else {
                        i14 = size - dp3;
                        if (sf1Var.isInPreviewMode()) {
                            i19 = 11;
                        }
                        dp = AndroidUtilities.dp(i19 + 13);
                    }
                    if (org.telegram.ui.ActionBar.j6.B0[0].measureText(str) <= (i14 - dp) - ((int) Math.ceil(org.telegram.ui.ActionBar.j6.I0.measureText("00:00")))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    bool = Boolean.valueOf(z4);
                    hashMap.put(str, bool);
                }
                if (!bool.booleanValue()) {
                    i13 = 20;
                } else {
                    i13 = 0;
                }
                int dp4 = AndroidUtilities.dp(i13 + 64);
                if (((jf1) hf1Var.F().get(i18)).f35268c.f19211id == 1) {
                    dp2 = dp4;
                }
                if (((jf1) hf1Var.F().get(i18)).f35268c.hidden) {
                    i16++;
                }
                i17 += dp4;
            }
        }
        if (i16 > 0) {
            i12 = (((sf1Var.K.getMeasuredHeight() - sf1Var.K.getPaddingTop()) - sf1Var.K.getPaddingBottom()) - i17) + dp2;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i12), 1073741824));
    }
}
