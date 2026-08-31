package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class j7 extends FrameLayout {
    public final int f28055a;
    public final c8 f28056b;

    public j7(c8 c8Var, Context context, int i10) {
        super(context);
        this.f28055a = i10;
        this.f28056b = c8Var;
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.f28055a) {
            case 0:
                int x10 = org.telegram.ui.b.x(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (x10 * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    c8 c8Var = this.f28056b;
                    View view = c8Var.f25841k0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, c8Var.f25841k0[i14].getMeasuredHeight() + dp2);
                }
                return;
            case 1:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 2:
                super.onLayout(z4, i10, i11, i12, i13);
                c8 c8Var2 = this.f28056b;
                if (c8Var2.S != null && (textView = c8Var2.X) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - c8Var2.S.getMeasuredWidth();
                    org.telegram.ui.ActionBar.w0 w0Var = c8Var2.S;
                    w0Var.layout(left, w0Var.getTop(), c8Var2.S.getMeasuredWidth() + left, c8Var2.S.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28055a) {
            case 1:
                c8 c8Var = this.f28056b;
                if (c8Var.f25836f0.getTag() != null) {
                    c8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
