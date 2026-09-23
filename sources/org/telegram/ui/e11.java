package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
public final class e11 extends TextView implements org.telegram.ui.ActionBar.y5 {
    public final ProfileActivity f32781a;

    public e11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f32781a = profileActivity;
        e();
    }

    @Override
    public final void e() {
        setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, this.f32781a.f31383z0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
