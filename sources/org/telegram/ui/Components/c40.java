package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class c40 extends FrameLayout {
    public View f25000a;
    public TextView f25001b;
    public fi0 f25002c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), 1073741824));
    }

    public void setGravity(int i10) {
        this.f25001b.setGravity(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f25001b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        TextView textView = this.f25001b;
        org.telegram.ui.ActionBar.a7.r(textView);
        textView.setTextColor(i10);
    }
}
