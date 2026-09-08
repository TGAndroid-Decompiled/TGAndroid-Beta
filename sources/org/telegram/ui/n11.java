package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
public final class n11 extends TextView implements org.telegram.ui.ActionBar.z5 {
    public final ProfileActivity f38839a;

    public n11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f38839a = profileActivity;
        d();
    }

    @Override
    public final void d() {
        setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f38839a.f34058z0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
