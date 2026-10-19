package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p4 extends LinearLayout {
    public boolean f29157a;
    public final od0 f29158b;
    public final od0 f29159c;
    public final od0 d;

    public p4(Context context, od0 od0Var, od0 od0Var2, od0 od0Var3) {
        super(context);
        this.f29158b = od0Var;
        this.f29159c = od0Var2;
        this.d = od0Var3;
        this.f29157a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f29157a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        od0 od0Var = this.f29158b;
        od0Var.setItemCount(i12);
        od0 od0Var2 = this.f29159c;
        od0Var2.setItemCount(i12);
        od0 od0Var3 = this.d;
        od0Var3.setItemCount(i12);
        od0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        od0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        od0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f29157a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29157a) {
            return;
        }
        super.requestLayout();
    }
}
