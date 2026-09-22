package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m4 extends LinearLayout {
    public boolean f26057a;
    public final uc0 f26058b;
    public final uc0 f26059c;
    public final uc0 d;

    public m4(Context context, uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3) {
        super(context);
        this.f26058b = uc0Var;
        this.f26059c = uc0Var2;
        this.d = uc0Var3;
        this.f26057a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f26057a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        uc0 uc0Var = this.f26058b;
        uc0Var.setItemCount(i12);
        uc0 uc0Var2 = this.f26059c;
        uc0Var2.setItemCount(i12);
        uc0 uc0Var3 = this.d;
        uc0Var3.setItemCount(i12);
        uc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        uc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        uc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f26057a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26057a) {
            return;
        }
        super.requestLayout();
    }
}
