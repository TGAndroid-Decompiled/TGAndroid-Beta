package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class f7 extends FrameLayout {
    public final int f34534a;
    public final y7 f34535b;

    public f7(y7 y7Var, Context context, int i7) {
        super(context);
        this.f34534a = i7;
        this.f34535b = y7Var;
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        TextView textView;
        switch (this.f34534a) {
            case 0:
                int y10 = org.telegram.messenger.i20.y(248.0f, i11 - i7, 4);
                for (int i13 = 0; i13 < 5; i13++) {
                    int L = (y10 * i13) + org.telegram.messenger.g0.L((i13 * 48) + 4);
                    int L2 = org.telegram.messenger.g0.L(9.0f);
                    y7 y7Var = this.f34535b;
                    View view = y7Var.f41900h2[i13];
                    view.layout(L, L2, view.getMeasuredWidth() + L, y7Var.f41900h2[i13].getMeasuredHeight() + L2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                y7 y7Var2 = this.f34535b;
                if (y7Var2.P1 != null && (textView = y7Var2.U1) != null) {
                    int left = (textView.getLeft() - org.telegram.messenger.g0.L(4.0f)) - y7Var2.P1.getMeasuredWidth();
                    org.telegram.ui.ActionBar.q0 q0Var = y7Var2.P1;
                    q0Var.layout(left, q0Var.getTop(), y7Var2.P1.getMeasuredWidth() + left, y7Var2.P1.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34534a) {
            case 1:
                y7 y7Var = this.f34535b;
                if (y7Var.f41896c2.getTag() != null) {
                    y7Var.W0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
