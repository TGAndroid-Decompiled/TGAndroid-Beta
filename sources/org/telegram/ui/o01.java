package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
public final class o01 extends TextView implements org.telegram.ui.ActionBar.y5 {
    public final ProfileActivity f39742a;

    public o01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f39742a = profileActivity;
        d();
    }

    @Override
    public final void d() {
        setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f39742a.A0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
