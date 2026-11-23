package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class y30 extends FrameLayout {
    public View f42288a;
    public TextView f42289b;
    public rh0 f42290c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    public void setGravity(int i7) {
        this.f42289b.setGravity(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f42289b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        TextView textView = this.f42289b;
        org.telegram.ui.ActionBar.t6.q(textView);
        textView.setTextColor(i7);
    }
}
