package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class m7 extends FrameLayout {
    public final int f37436a;
    public final f8 f37437b;

    public m7(f8 f8Var, Context context, int i7) {
        super(context);
        this.f37436a = i7;
        this.f37437b = f8Var;
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        TextView textView;
        switch (this.f37436a) {
            case 0:
                int z11 = org.telegram.messenger.o10.z(248.0f, i11 - i7, 4);
                for (int i13 = 0; i13 < 5; i13++) {
                    int L = (z11 * i13) + org.telegram.messenger.g0.L((i13 * 48) + 4);
                    int L2 = org.telegram.messenger.g0.L(9.0f);
                    f8 f8Var = this.f37437b;
                    View view = f8Var.f35117h2[i13];
                    view.layout(L, L2, view.getMeasuredWidth() + L, f8Var.f35117h2[i13].getMeasuredHeight() + L2);
                }
                return;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                f8 f8Var2 = this.f37437b;
                if (f8Var2.P1 != null && (textView = f8Var2.U1) != null) {
                    int left = (textView.getLeft() - org.telegram.messenger.g0.L(4.0f)) - f8Var2.P1.getMeasuredWidth();
                    org.telegram.ui.ActionBar.q0 q0Var = f8Var2.P1;
                    q0Var.layout(left, q0Var.getTop(), f8Var2.P1.getMeasuredWidth() + left, f8Var2.P1.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f37436a) {
            case 1:
                f8 f8Var = this.f37437b;
                if (f8Var.f35113c2.getTag() != null) {
                    f8Var.X0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
