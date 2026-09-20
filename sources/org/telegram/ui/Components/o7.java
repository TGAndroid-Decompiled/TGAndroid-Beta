package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class o7 extends FrameLayout {
    public final int f26824a;
    public final i8 f26825b;

    public o7(i8 i8Var, Context context, int i10) {
        super(context);
        this.f26824a = i10;
        this.f26825b = i8Var;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.f26824a) {
            case 0:
                int z11 = org.telegram.messenger.rk.z(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (z11 * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    i8 i8Var = this.f26825b;
                    View view = i8Var.f24925n0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, i8Var.f24925n0[i14].getMeasuredHeight() + dp2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                i8 i8Var2 = this.f26825b;
                if (i8Var2.V != null && (textView = i8Var2.f24909a0) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - i8Var2.V.getMeasuredWidth();
                    org.telegram.ui.ActionBar.v0 v0Var = i8Var2.V;
                    v0Var.layout(left, v0Var.getTop(), i8Var2.V.getMeasuredWidth() + left, i8Var2.V.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26824a) {
            case 1:
                i8 i8Var = this.f26825b;
                if (i8Var.f24920i0.getTag() != null) {
                    i8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
