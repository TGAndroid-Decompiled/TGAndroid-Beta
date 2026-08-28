package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q4 extends LinearLayout {
    public boolean f31828a;
    public final bc0 f31829b;

    public q4(Context context, bc0 bc0Var) {
        super(context);
        this.f31829b = bc0Var;
        this.f31828a = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        this.f31828a = true;
        this.f31829b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f31828a = false;
        super.onMeasure(i9, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f31828a) {
            return;
        }
        super.requestLayout();
    }
}
