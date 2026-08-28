package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
public final class h01 extends TextView implements org.telegram.ui.ActionBar.w5 {
    public final ProfileActivity f38637a;

    public h01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f38637a = profileActivity;
        d();
    }

    @Override
    public final void d() {
        setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.f38637a.f36064v0));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }
}
