package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class f50 extends FrameLayout {
    public View f26088a;
    public TextView f26089b;
    public xj0 f26090c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    public void setGravity(int i10) {
        this.f26089b.setGravity(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f26089b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f26089b.setTextColor(i10);
    }
}
