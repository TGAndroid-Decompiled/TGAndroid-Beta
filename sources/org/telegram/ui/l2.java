package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class l2 extends View implements org.telegram.ui.ActionBar.b6 {
    public final f70 f39104a;
    public final org.telegram.ui.Components.wq f39105b;

    public l2(Context context, f70 f70Var) {
        super(context);
        this.f39104a = f70Var;
        org.telegram.ui.Components.wq wqVar = new org.telegram.ui.Components.wq(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qk, false)), org.telegram.ui.ActionBar.k6.W0(context, R.drawable.greydivider_bottom, -16777216));
        this.f39105b = wqVar;
        wqVar.f32329w = true;
        setBackgroundDrawable(wqVar);
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
        ((k4) this.f39104a).getClass();
        org.telegram.ui.ActionBar.k6.y1(this.f39105b, org.telegram.ui.ActionBar.k6.x0(null, i12, false), false);
    }

    @Override
    public final void updateColors() {
        f70 f70Var;
        try {
            org.telegram.ui.Components.wq wqVar = this.f39105b;
            if (wqVar != null && (f70Var = this.f39104a) != null) {
                int i10 = org.telegram.ui.ActionBar.k6.Qk;
                ((k4) f70Var).getClass();
                org.telegram.ui.ActionBar.k6.y1(wqVar, org.telegram.ui.ActionBar.k6.x0(null, i10, false), false);
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
