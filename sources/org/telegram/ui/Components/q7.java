package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class q7 extends FrameLayout {
    public final int f29614a;
    public final k8 f29615b;

    public q7(k8 k8Var, Context context, int i10) {
        super(context);
        this.f29614a = i10;
        this.f29615b = k8Var;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.f29614a) {
            case 0:
                int y3 = org.telegram.messenger.vl.y(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (y3 * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    k8 k8Var = this.f29615b;
                    View view = k8Var.f27731n0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, k8Var.f27731n0[i14].getMeasuredHeight() + dp2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                k8 k8Var2 = this.f29615b;
                if (k8Var2.V != null && (textView = k8Var2.f27714a0) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - k8Var2.V.getMeasuredWidth();
                    org.telegram.ui.ActionBar.v0 v0Var = k8Var2.V;
                    v0Var.layout(left, v0Var.getTop(), k8Var2.V.getMeasuredWidth() + left, k8Var2.V.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29614a) {
            case 1:
                k8 k8Var = this.f29615b;
                if (k8Var.f27726i0.getTag() != null) {
                    k8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
