package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f29839a;
    public final fd0 f29840b;

    public w4(Context context, fd0 fd0Var) {
        super(context);
        this.f29840b = fd0Var;
        this.f29839a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f29839a = true;
        this.f29840b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f29839a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29839a) {
            return;
        }
        super.requestLayout();
    }
}
