package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class i7 extends FrameLayout {

    public final int f29264a;

    public final b8 f29265b;

    public i7(b8 b8Var, Context context, int i10) {
        super(context);
        this.f29264a = i10;
        this.f29265b = b8Var;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.f29264a) {
            case 0:
                int iX = org.telegram.messenger.rl.x(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int iDp = (iX * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int iDp2 = AndroidUtilities.dp(9.0f);
                    b8 b8Var = this.f29265b;
                    View view = b8Var.f27023j0[i14];
                    view.layout(iDp, iDp2, view.getMeasuredWidth() + iDp, b8Var.f27023j0[i14].getMeasuredHeight() + iDp2);
                }
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                b8 b8Var2 = this.f29265b;
                if (b8Var2.R != null && (textView = b8Var2.W) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - b8Var2.R.getMeasuredWidth();
                    org.telegram.ui.ActionBar.v0 v0Var = b8Var2.R;
                    v0Var.layout(left, v0Var.getTop(), b8Var2.R.getMeasuredWidth() + left, b8Var2.R.getBottom());
                    break;
                }
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29264a) {
            case 1:
                b8 b8Var = this.f29265b;
                if (b8Var.f27017e0.getTag() != null) {
                    b8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
