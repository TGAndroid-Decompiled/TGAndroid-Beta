package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class v40 extends FrameLayout {
    public View f28593a;
    public TextView f28594b;
    public bj0 f28595c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    public void setGravity(int i10) {
        this.f28594b.setGravity(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f28594b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f28594b.setTextColor(i10);
    }
}
