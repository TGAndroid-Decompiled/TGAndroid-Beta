package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class i7 extends FrameLayout {
    public final int f29368a;
    public final c8 f29369b;

    public i7(c8 c8Var, Context context, int i9) {
        super(context);
        this.f29368a = i9;
        this.f29369b = c8Var;
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        TextView textView;
        switch (this.f29368a) {
            case 0:
                int y10 = org.telegram.messenger.ll.y(248.0f, i11 - i9, 4);
                for (int i13 = 0; i13 < 5; i13++) {
                    int dp = (y10 * i13) + AndroidUtilities.dp((i13 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    c8 c8Var = this.f29369b;
                    View view = c8Var.f27391j0[i13];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, c8Var.f27391j0[i13].getMeasuredHeight() + dp2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
            case 2:
                super.onLayout(z10, i9, i10, i11, i12);
                c8 c8Var2 = this.f29369b;
                if (c8Var2.R != null && (textView = c8Var2.W) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - c8Var2.R.getMeasuredWidth();
                    org.telegram.ui.ActionBar.w0 w0Var = c8Var2.R;
                    w0Var.layout(left, w0Var.getTop(), c8Var2.R.getMeasuredWidth() + left, c8Var2.R.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29368a) {
            case 1:
                c8 c8Var = this.f29369b;
                if (c8Var.f27385e0.getTag() != null) {
                    c8Var.z0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
