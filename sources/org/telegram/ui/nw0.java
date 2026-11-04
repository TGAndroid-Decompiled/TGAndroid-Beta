package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
public final class nw0 extends TextView implements org.telegram.ui.ActionBar.z5 {
    public final ProfileActivity f48138a;

    public nw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f48138a = profileActivity;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f48138a.A0));
    }
}
