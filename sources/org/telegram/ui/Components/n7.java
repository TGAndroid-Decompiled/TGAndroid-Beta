package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n7 extends FrameLayout {
    public final int f26354a;
    public final h8 f26355b;

    public n7(h8 h8Var, Context context, int i10) {
        super(context);
        this.f26354a = i10;
        this.f26355b = h8Var;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.f26354a) {
            case 0:
                int y3 = org.telegram.messenger.wl.y(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int dp = (y3 * i14) + AndroidUtilities.dp((i14 * 48) + 4);
                    int dp2 = AndroidUtilities.dp(9.0f);
                    h8 h8Var = this.f26355b;
                    View view = h8Var.f24562n0[i14];
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, h8Var.f24562n0[i14].getMeasuredHeight() + dp2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                h8 h8Var2 = this.f26355b;
                if (h8Var2.V != null && (textView = h8Var2.f24546a0) != null) {
                    int left = (textView.getLeft() - AndroidUtilities.dp(4.0f)) - h8Var2.V.getMeasuredWidth();
                    org.telegram.ui.ActionBar.w0 w0Var = h8Var2.V;
                    w0Var.layout(left, w0Var.getTop(), h8Var2.V.getMeasuredWidth() + left, h8Var2.V.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26354a) {
            case 1:
                h8 h8Var = this.f26355b;
                if (h8Var.f24557i0.getTag() != null) {
                    h8Var.A0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
