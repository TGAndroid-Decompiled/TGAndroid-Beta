package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
public final class e11 extends TextView implements org.telegram.ui.ActionBar.y5 {
    public final ProfileActivity f35885a;

    public e11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f35885a = profileActivity;
        e();
    }

    @Override
    public final void e() {
        setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.f35885a.f34377z0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
