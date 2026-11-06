package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class k30 extends FrameLayout {
    public View f35158a;
    public TextView f35159b;
    public ch0 f35160c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    public void setGravity(int i7) {
        this.f35159b.setGravity(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f35159b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        TextView textView = this.f35159b;
        org.telegram.ui.ActionBar.r6.r(textView);
        textView.setTextColor(i7);
    }
}
