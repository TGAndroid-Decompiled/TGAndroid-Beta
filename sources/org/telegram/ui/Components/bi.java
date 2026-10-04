package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class bi extends mu {
    public final xi V;

    public bi(xi xiVar, Context context, ki kiVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, kiVar, null, 1, true, d6Var);
        this.V = xiVar;
    }

    @Override
    public final void f() {
        super.f();
        nz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f29154w0 = false;
            emojiView.f29156w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.V.f32812f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            org.telegram.ui.yn.k8(menu, ((org.telegram.ui.yn) n2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xi xiVar = this.V;
        bi biVar = xiVar.P0;
        if (!xiVar.f32859u1) {
            if (motionEvent.getX() > biVar.getEditText().getLeft() && motionEvent.getX() < biVar.getEditText().getRight() && motionEvent.getY() > biVar.getEditText().getTop() && motionEvent.getY() < biVar.getEditText().getBottom()) {
                xiVar.q1(biVar.getEditText(), true);
            } else {
                xiVar.q1(biVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.Y1();
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        xi xiVar = this.V;
        xiVar.Y1();
        if (xiVar.f32801c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            xiVar.J1(z10);
        }
    }
}
