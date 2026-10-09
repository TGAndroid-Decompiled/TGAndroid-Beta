package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c4 extends LinearLayout {
    public boolean f25227a;
    public final ud0 f25228b;
    public final ud0 f25229c;
    public final ud0 d;

    public c4(Context context, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3) {
        super(context);
        this.f25228b = ud0Var;
        this.f25229c = ud0Var2;
        this.d = ud0Var3;
        this.f25227a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f25227a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        ud0 ud0Var = this.f25228b;
        ud0Var.setItemCount(i12);
        ud0 ud0Var2 = this.f25229c;
        ud0Var2.setItemCount(i12);
        ud0 ud0Var3 = this.d;
        ud0Var3.setItemCount(i12);
        ud0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        ud0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        ud0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f25227a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f25227a) {
            return;
        }
        super.requestLayout();
    }
}
