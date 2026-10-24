package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class o7 extends FrameLayout {
    public final int f29162a;
    public final i8 f29163b;

    public o7(i8 i8Var, Context context, int i10) {
        super(context);
        this.f29162a = i10;
        this.f29163b = i8Var;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.f29162a) {
            case 0:
                int A = org.telegram.messenger.tl.A(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (A * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    i8 i8Var = this.f29163b;
                    View view = i8Var.m0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, i8Var.m0[i14].getMeasuredHeight() + dp2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                i8 i8Var2 = this.f29163b;
                if (i8Var2.U != null && (textView = i8Var2.Z) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - i8Var2.U.getMeasuredWidth();
                    org.telegram.ui.ActionBar.u0 u0Var = i8Var2.U;
                    u0Var.layout(left, u0Var.getTop(), i8Var2.U.getMeasuredWidth() + left, i8Var2.U.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29162a) {
            case 1:
                i8 i8Var = this.f29163b;
                if (i8Var.f27335h0.getTag() != null) {
                    i8Var.H0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
