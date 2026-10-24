package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class d50 extends FrameLayout {
    public View f25563a;
    public TextView f25564b;
    public ak0 f25565c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    public void setGravity(int i10) {
        this.f25564b.setGravity(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f25564b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        TextView textView = this.f25564b;
        org.telegram.ui.ActionBar.r6.r(textView);
        textView.setTextColor(i10);
    }
}
