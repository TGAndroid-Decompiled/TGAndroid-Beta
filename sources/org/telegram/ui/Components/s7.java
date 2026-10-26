package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s7 extends FrameLayout {
    public final int f32446a;
    public final m8 f32447b;

    public s7(m8 m8Var, Context context, int i10) {
        super(context);
        this.f32446a = i10;
        this.f32447b = m8Var;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.f32446a) {
            case 0:
                int B = org.telegram.messenger.vh.B(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (B * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    m8 m8Var = this.f32447b;
                    View view = m8Var.m0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, m8Var.m0[i14].getMeasuredHeight() + dp2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                m8 m8Var2 = this.f32447b;
                if (m8Var2.U != null && (textView = m8Var2.Z) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - m8Var2.U.getMeasuredWidth();
                    org.telegram.ui.ActionBar.w0 w0Var = m8Var2.U;
                    w0Var.layout(left, w0Var.getTop(), m8Var2.U.getMeasuredWidth() + left, m8Var2.U.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32446a) {
            case 1:
                m8 m8Var = this.f32447b;
                if (m8Var.f30432h0.getTag() != null) {
                    m8Var.H0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
