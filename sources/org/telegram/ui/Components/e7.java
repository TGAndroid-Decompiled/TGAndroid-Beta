package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class e7 extends FrameLayout {
    public final int f25766a;
    public final w7 f25767b;

    public e7(w7 w7Var, Context context, int i10) {
        super(context);
        this.f25766a = i10;
        this.f25767b = w7Var;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        switch (this.f25766a) {
            case 0:
                int y3 = org.telegram.messenger.a30.y(248.0f, i12 - i10, 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    int L = (y3 * i14) + org.telegram.messenger.i0.L((i14 * 48) + 4);
                    int L2 = org.telegram.messenger.i0.L(9.0f);
                    w7 w7Var = this.f25767b;
                    View view = w7Var.f32094d2[i14];
                    view.layout(L, L2, view.getMeasuredWidth() + L, w7Var.f32094d2[i14].getMeasuredHeight() + L2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                w7 w7Var2 = this.f25767b;
                if (w7Var2.L1 != null && (textView = w7Var2.Q1) != null) {
                    int left = (textView.getLeft() - org.telegram.messenger.i0.L(4.0f)) - w7Var2.L1.getMeasuredWidth();
                    org.telegram.ui.ActionBar.t0 t0Var = w7Var2.L1;
                    t0Var.layout(left, t0Var.getTop(), w7Var2.L1.getMeasuredWidth() + left, w7Var2.L1.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25766a) {
            case 1:
                w7 w7Var = this.f25767b;
                if (w7Var.Y1.getTag() != null) {
                    w7Var.W0(false, true);
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
