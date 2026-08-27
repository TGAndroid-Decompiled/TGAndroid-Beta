package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class ke1 extends View {

    public final HashMap f39708a;

    public final le1 f39709b;

    public ke1(le1 le1Var, Activity activity) {
        super(activity);
        this.f39709b = le1Var;
        this.f39708a = new HashMap();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int iDp;
        le1 le1Var = this.f39709b;
        we1 we1Var = le1Var.d;
        int size = View.MeasureSpec.getSize(i10);
        int iDp2 = AndroidUtilities.dp(64.0f);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < le1Var.F().size(); i15++) {
            if (le1Var.F().get(i15) != null && ((ne1) le1Var.F().get(i15)).f40813c != null) {
                String str = ((ne1) le1Var.F().get(i15)).f40813c.title;
                HashMap map = this.f39708a;
                Boolean boolValueOf = (Boolean) map.get(str);
                if (boolValueOf == null) {
                    int iDp3 = AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : (we1Var.isInPreviewMode() ? 11 : 50) + 4);
                    if (LocaleController.isRTL) {
                        i12 = size - iDp3;
                        iDp = AndroidUtilities.dp((we1Var.isInPreviewMode() ? 11 : 50) + 13);
                    } else {
                        i12 = size - iDp3;
                        iDp = AndroidUtilities.dp(22.0f);
                    }
                    boolValueOf = Boolean.valueOf(org.telegram.ui.ActionBar.g6.B0[0].measureText(str) <= ((float) ((i12 - iDp) - ((int) Math.ceil((double) org.telegram.ui.ActionBar.g6.I0.measureText("00:00"))))));
                    map.put(str, boolValueOf);
                }
                int iDp4 = AndroidUtilities.dp((!boolValueOf.booleanValue() ? 20 : 0) + 64);
                if (((ne1) le1Var.F().get(i15)).f40813c.f22432id == 1) {
                    iDp2 = iDp4;
                }
                if (((ne1) le1Var.F().get(i15)).f40813c.hidden) {
                    i13++;
                }
                i14 += iDp4;
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i13 > 0 ? (((we1Var.J.getMeasuredHeight() - we1Var.J.getPaddingTop()) - we1Var.J.getPaddingBottom()) - i14) + iDp2 : 0), 1073741824));
    }
}
