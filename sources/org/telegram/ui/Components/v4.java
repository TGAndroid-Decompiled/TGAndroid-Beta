package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v4 extends LinearLayout {
    public boolean f27809a;
    public final dd0 f27810b;

    public v4(Context context, dd0 dd0Var) {
        super(context);
        this.f27810b = dd0Var;
        this.f27809a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27809a = true;
        this.f27810b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f27809a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27809a) {
            return;
        }
        super.requestLayout();
    }
}
