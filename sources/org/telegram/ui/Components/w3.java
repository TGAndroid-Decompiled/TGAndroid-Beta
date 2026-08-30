package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w3 extends LinearLayout {
    public boolean f30184a;
    public final wc0 f30185b;
    public final wc0 f30186c;
    public final wc0 d;

    public w3(Context context, wc0 wc0Var, wc0 wc0Var2, wc0 wc0Var3) {
        super(context);
        this.f30185b = wc0Var;
        this.f30186c = wc0Var2;
        this.d = wc0Var3;
        this.f30184a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f30184a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        wc0 wc0Var = this.f30185b;
        wc0Var.setItemCount(i12);
        wc0 wc0Var2 = this.f30186c;
        wc0Var2.setItemCount(i12);
        wc0 wc0Var3 = this.d;
        wc0Var3.setItemCount(i12);
        wc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        wc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        wc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f30184a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30184a) {
            return;
        }
        super.requestLayout();
    }
}
