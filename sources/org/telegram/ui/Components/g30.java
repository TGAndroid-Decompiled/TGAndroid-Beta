package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class g30 extends FrameLayout {
    public View f33948a;
    public TextView f33949b;
    public fh0 f33950c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    public void setGravity(int i3) {
        this.f33949b.setGravity(i3);
    }

    public void setText(CharSequence charSequence) {
        this.f33949b.setText(charSequence);
    }

    public void setTextColor(int i3) {
        TextView textView = this.f33949b;
        org.telegram.ui.ActionBar.r6.r(textView);
        textView.setTextColor(i3);
    }
}
