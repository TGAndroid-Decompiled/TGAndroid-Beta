package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
public final class c11 extends TextView implements org.telegram.ui.ActionBar.x5 {
    public final ProfileActivity f32546a;

    public c11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f32546a = profileActivity;
        e();
    }

    @Override
    public final void e() {
        setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, this.f32546a.f31699z0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
