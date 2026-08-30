package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x40 extends FrameLayout {
    public View f30540a;
    public TextView f30541b;
    public jj0 f30542c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    public void setGravity(int i10) {
        this.f30541b.setGravity(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f30541b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f30541b.setTextColor(i10);
    }
}
