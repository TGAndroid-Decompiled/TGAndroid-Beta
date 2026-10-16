package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class j50 extends FrameLayout {
    public View f25886a;
    public TextView f25887b;
    public bk0 f25888c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    public void setGravity(int i10) {
        this.f25887b.setGravity(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f25887b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f25887b.setTextColor(i10);
    }
}
