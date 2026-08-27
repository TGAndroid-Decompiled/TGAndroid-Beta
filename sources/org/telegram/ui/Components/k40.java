package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class k40 extends FrameLayout {

    public View f29941a;

    public TextView f29942b;

    public ri0 f29943c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    public void setGravity(int i10) {
        this.f29942b.setGravity(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f29942b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f29942b.setTextColor(i10);
    }
}
