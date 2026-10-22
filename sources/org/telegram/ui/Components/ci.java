package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ci extends qu {
    public final ti V;

    public ci(ti tiVar, Context context, ji jiVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, jiVar, null, 1, true, d6Var);
        this.V = tiVar;
    }

    @Override
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f30788w0 = false;
            emojiView.f30790w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.V.f30549f0;
        if (n2Var instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn.n8(menu, ((org.telegram.ui.qn) n2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.V;
        ci ciVar = tiVar.S0;
        if (!tiVar.f30607x1) {
            if (motionEvent.getX() > ciVar.getEditText().getLeft() && motionEvent.getX() < ciVar.getEditText().getRight() && motionEvent.getY() > ciVar.getEditText().getTop() && motionEvent.getY() < ciVar.getEditText().getBottom()) {
                tiVar.w1(ciVar.getEditText(), true);
            } else {
                tiVar.w1(ciVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.f2();
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        ti tiVar = this.V;
        tiVar.f2();
        if (tiVar.f30539c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            tiVar.Q1(z10);
        }
    }
}
