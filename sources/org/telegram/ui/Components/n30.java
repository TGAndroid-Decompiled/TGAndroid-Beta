package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class n30 extends FrameLayout {
    public View f37444a;
    public TextView f37445b;
    public fh0 f37446c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    public void setGravity(int i7) {
        this.f37445b.setGravity(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f37445b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        TextView textView = this.f37445b;
        org.telegram.ui.ActionBar.q6.q(textView);
        textView.setTextColor(i7);
    }
}
