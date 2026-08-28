package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class f40 extends FrameLayout {
    public View f28264a;
    public TextView f28265b;
    public pi0 f28266c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    public void setGravity(int i9) {
        this.f28265b.setGravity(i9);
    }

    public void setText(CharSequence charSequence) {
        this.f28265b.setText(charSequence);
    }

    public void setTextColor(int i9) {
        this.f28265b.setTextColor(i9);
    }
}
