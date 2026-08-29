package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
public final class i01 extends TextView implements org.telegram.ui.ActionBar.x5 {
    public final ProfileActivity f39102a;

    public i01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f39102a = profileActivity;
        e();
    }

    @Override
    public final void e() {
        setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.f39102a.f36129v0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
