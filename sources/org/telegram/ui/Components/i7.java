package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class i7 extends FrameLayout {
    public final int f34622a;
    public final b8 f34623b;

    public i7(b8 b8Var, Context context, int i7) {
        super(context);
        this.f34622a = i7;
        this.f34623b = b8Var;
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        TextView textView;
        switch (this.f34622a) {
            case 0:
                int y10 = org.telegram.messenger.camera.q.y(248.0f, i11 - i7, 4);
                for (int i13 = 0; i13 < 5; i13++) {
                    int L = (y10 * i13) + org.telegram.messenger.g0.L((i13 * 48) + 4);
                    int L2 = org.telegram.messenger.g0.L(9.0f);
                    b8 b8Var = this.f34623b;
                    View view = b8Var.d2[i13];
                    view.layout(L, L2, view.getMeasuredWidth() + L, b8Var.d2[i13].getMeasuredHeight() + L2);
                }
                return;
            case 1:
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
            case 2:
                super.onLayout(z9, i7, i10, i11, i12);
                b8 b8Var2 = this.f34623b;
                if (b8Var2.L1 != null && (textView = b8Var2.Q1) != null) {
                    int left = (textView.getLeft() - org.telegram.messenger.g0.L(4.0f)) - b8Var2.L1.getMeasuredWidth();
                    org.telegram.ui.ActionBar.r0 r0Var = b8Var2.L1;
                    r0Var.layout(left, r0Var.getTop(), b8Var2.L1.getMeasuredWidth() + left, b8Var2.L1.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34622a) {
            case 1:
                b8 b8Var = this.f34623b;
                if (b8Var.Y1.getTag() != null) {
                    b8Var.W0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
