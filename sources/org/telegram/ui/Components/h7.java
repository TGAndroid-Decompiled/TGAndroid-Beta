package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class h7 extends FrameLayout {
    public final int f34222a;
    public final a8 f34223b;

    public h7(a8 a8Var, Context context, int i7) {
        super(context);
        this.f34222a = i7;
        this.f34223b = a8Var;
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        TextView textView;
        switch (this.f34222a) {
            case 0:
                int y10 = org.telegram.messenger.camera.q.y(248.0f, i11 - i7, 4);
                for (int i13 = 0; i13 < 5; i13++) {
                    int L = (y10 * i13) + org.telegram.messenger.g0.L((i13 * 48) + 4);
                    int L2 = org.telegram.messenger.g0.L(9.0f);
                    a8 a8Var = this.f34223b;
                    View view = a8Var.f31739g2[i13];
                    view.layout(L, L2, view.getMeasuredWidth() + L, a8Var.f31739g2[i13].getMeasuredHeight() + L2);
                }
                return;
            case 1:
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
            case 2:
                super.onLayout(z9, i7, i10, i11, i12);
                a8 a8Var2 = this.f34223b;
                if (a8Var2.O1 != null && (textView = a8Var2.T1) != null) {
                    int left = (textView.getLeft() - org.telegram.messenger.g0.L(4.0f)) - a8Var2.O1.getMeasuredWidth();
                    org.telegram.ui.ActionBar.r0 r0Var = a8Var2.O1;
                    r0Var.layout(left, r0Var.getTop(), a8Var2.O1.getMeasuredWidth() + left, a8Var2.O1.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34222a) {
            case 1:
                a8 a8Var = this.f34223b;
                if (a8Var.f31735b2.getTag() != null) {
                    a8Var.W0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
