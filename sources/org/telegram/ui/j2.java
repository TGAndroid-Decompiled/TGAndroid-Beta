package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class j2 extends View implements org.telegram.ui.ActionBar.p6 {
    public final h70 f40395a;
    public final org.telegram.ui.Components.ar f40396b;

    public j2(Context context, h70 h70Var) {
        super(context);
        this.f40395a = h70Var;
        org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qk, false)), org.telegram.ui.ActionBar.y6.W0(context, R.drawable.greydivider_bottom, -16777216));
        this.f40396b = arVar;
        arVar.f26599w = true;
        setBackgroundDrawable(arVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qk));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.y6.Qk;
        ((j4) this.f40395a).getClass();
        org.telegram.ui.ActionBar.y6.y1(this.f40396b, org.telegram.ui.ActionBar.y6.x0(null, i12, false), false);
    }

    @Override
    public final void updateColors() {
        h70 h70Var;
        try {
            org.telegram.ui.Components.ar arVar = this.f40396b;
            if (arVar != null && (h70Var = this.f40395a) != null) {
                int i10 = org.telegram.ui.ActionBar.y6.Qk;
                ((j4) h70Var).getClass();
                org.telegram.ui.ActionBar.y6.y1(arVar, org.telegram.ui.ActionBar.y6.x0(null, i10, false), false);
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
