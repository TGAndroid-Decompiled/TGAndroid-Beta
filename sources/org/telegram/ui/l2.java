package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class l2 extends View implements org.telegram.ui.ActionBar.b6 {
    public final f70 f39118a;
    public final org.telegram.ui.Components.yq f39119b;

    public l2(Context context, f70 f70Var) {
        super(context);
        this.f39118a = f70Var;
        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qk, false)), org.telegram.ui.ActionBar.k6.W0(context, R.drawable.greydivider_bottom, -16777216));
        this.f39119b = yqVar;
        yqVar.f33019w = true;
        setBackgroundDrawable(yqVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qk));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.k6.Qk;
        ((k4) this.f39118a).getClass();
        org.telegram.ui.ActionBar.k6.y1(this.f39119b, org.telegram.ui.ActionBar.k6.x0(null, i12, false), false);
    }

    @Override
    public final void updateColors() {
        f70 f70Var;
        try {
            org.telegram.ui.Components.yq yqVar = this.f39119b;
            if (yqVar != null && (f70Var = this.f39118a) != null) {
                int i10 = org.telegram.ui.ActionBar.k6.Qk;
                ((k4) f70Var).getClass();
                org.telegram.ui.ActionBar.k6.y1(yqVar, org.telegram.ui.ActionBar.k6.x0(null, i10, false), false);
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
