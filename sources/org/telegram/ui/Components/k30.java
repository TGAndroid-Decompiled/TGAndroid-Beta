package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class k30 extends FrameLayout {
    public View f35122a;
    public TextView f35123b;
    public ch0 f35124c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    public void setGravity(int i7) {
        this.f35123b.setGravity(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f35123b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        TextView textView = this.f35123b;
        org.telegram.ui.ActionBar.r6.r(textView);
        textView.setTextColor(i7);
    }
}
