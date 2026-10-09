package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
public final class k11 extends TextView implements org.telegram.ui.ActionBar.z5 {
    public final ProfileActivity f39065a;

    public k11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f39065a = profileActivity;
        e();
    }

    @Override
    public final void e() {
        setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, this.f39065a.f34386z0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
