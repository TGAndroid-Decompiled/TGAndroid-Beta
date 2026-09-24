package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w40 extends FrameLayout {
    public View f29877a;
    public TextView f29878b;
    public lj0 f29879c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    public void setGravity(int i10) {
        this.f29878b.setGravity(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f29878b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f29878b.setTextColor(i10);
    }
}
