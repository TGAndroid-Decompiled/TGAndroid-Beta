package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class p7 extends FrameLayout {
    public final int f29615a;
    public final j8 f29616b;

    public p7(j8 j8Var, Context context, int i10) {
        super(context);
        this.f29615a = i10;
        this.f29616b = j8Var;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.f29615a) {
            case 0:
                int z11 = org.telegram.messenger.bi.z(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (z11 * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    j8 j8Var = this.f29616b;
                    View view = j8Var.f27717n0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, j8Var.f27717n0[i14].getMeasuredHeight() + dp2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                j8 j8Var2 = this.f29616b;
                if (j8Var2.V != null && (textView = j8Var2.f27700a0) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - j8Var2.V.getMeasuredWidth();
                    org.telegram.ui.ActionBar.v0 v0Var = j8Var2.V;
                    v0Var.layout(left, v0Var.getTop(), j8Var2.V.getMeasuredWidth() + left, j8Var2.V.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29615a) {
            case 1:
                j8 j8Var = this.f29616b;
                if (j8Var.f27712i0.getTag() != null) {
                    j8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
