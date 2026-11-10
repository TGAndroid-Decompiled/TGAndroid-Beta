package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
public final class ax0 extends TextView implements org.telegram.ui.ActionBar.c6 {
    public final ProfileActivity f43837a;

    public ax0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f43837a = profileActivity;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.f43837a.f41867z0));
    }
}
