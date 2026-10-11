package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r7 extends FrameLayout {
    public final int f30375a;
    public final l8 f30376b;

    public r7(l8 l8Var, Context context, int i10) {
        super(context);
        this.f30375a = i10;
        this.f30376b = l8Var;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.f30375a) {
            case 0:
                int A = org.telegram.messenger.ai.A(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (A * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    l8 l8Var = this.f30376b;
                    View view = l8Var.f28213n0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, l8Var.f28213n0[i14].getMeasuredHeight() + dp2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                l8 l8Var2 = this.f30376b;
                if (l8Var2.V != null && (textView = l8Var2.f28196a0) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - l8Var2.V.getMeasuredWidth();
                    org.telegram.ui.ActionBar.u0 u0Var = l8Var2.V;
                    u0Var.layout(left, u0Var.getTop(), l8Var2.V.getMeasuredWidth() + left, l8Var2.V.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30375a) {
            case 1:
                l8 l8Var = this.f30376b;
                if (l8Var.f28208i0.getTag() != null) {
                    l8Var.B0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
