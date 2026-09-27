package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class p7 extends FrameLayout {
    public final int f27298a;
    public final j8 f27299b;

    public p7(j8 j8Var, Context context, int i10) {
        super(context);
        this.f27298a = i10;
        this.f27299b = j8Var;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.f27298a) {
            case 0:
                int z11 = org.telegram.messenger.qk.z(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (z11 * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    j8 j8Var = this.f27299b;
                    View view = j8Var.f25360n0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, j8Var.f25360n0[i14].getMeasuredHeight() + dp2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                j8 j8Var2 = this.f27299b;
                if (j8Var2.V != null && (textView = j8Var2.f25344a0) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - j8Var2.V.getMeasuredWidth();
                    org.telegram.ui.ActionBar.w0 w0Var = j8Var2.V;
                    w0Var.layout(left, w0Var.getTop(), j8Var2.V.getMeasuredWidth() + left, j8Var2.V.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27298a) {
            case 1:
                j8 j8Var = this.f27299b;
                if (j8Var.f25355i0.getTag() != null) {
                    j8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
