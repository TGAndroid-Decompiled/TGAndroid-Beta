package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v4 extends LinearLayout {
    public boolean f28973a;
    public final fd0 f28974b;

    public v4(Context context, fd0 fd0Var) {
        super(context);
        this.f28974b = fd0Var;
        this.f28973a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f28973a = true;
        this.f28974b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f28973a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f28973a) {
            return;
        }
        super.requestLayout();
    }
}
