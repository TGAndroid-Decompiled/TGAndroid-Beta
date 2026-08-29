package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n7 extends FrameLayout {
    public final int f30918a;
    public final g8 f30919b;

    public n7(g8 g8Var, Context context, int i10) {
        super(context);
        this.f30918a = i10;
        this.f30919b = g8Var;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.f30918a) {
            case 0:
                int x4 = org.telegram.ui.b.x(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (x4 * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    g8 g8Var = this.f30919b;
                    View view = g8Var.f28789j0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, g8Var.f28789j0[i14].getMeasuredHeight() + dp2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                g8 g8Var2 = this.f30919b;
                if (g8Var2.R != null && (textView = g8Var2.W) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - g8Var2.R.getMeasuredWidth();
                    org.telegram.ui.ActionBar.w0 w0Var = g8Var2.R;
                    w0Var.layout(left, w0Var.getTop(), g8Var2.R.getMeasuredWidth() + left, g8Var2.R.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30918a) {
            case 1:
                g8 g8Var = this.f30919b;
                if (g8Var.f28783e0.getTag() != null) {
                    g8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
