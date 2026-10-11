package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class gi extends av {
    public final yi V;

    public gi(yi yiVar, Context context, oi oiVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, oiVar, null, 1, true, d6Var);
        this.V = yiVar;
    }

    @Override
    public final void f() {
        super.f();
        b00 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f24725w0 = false;
            emojiView.f24727w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.m2 m2Var = this.V.f33216f0;
        if (m2Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn.n8(menu, ((org.telegram.ui.zn) m2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        yi yiVar = this.V;
        gi giVar = yiVar.S0;
        if (!yiVar.f33274x1) {
            if (motionEvent.getX() > giVar.getEditText().getLeft() && motionEvent.getX() < giVar.getEditText().getRight() && motionEvent.getY() > giVar.getEditText().getTop() && motionEvent.getY() < giVar.getEditText().getBottom()) {
                yiVar.w1(giVar.getEditText(), true);
            } else {
                yiVar.w1(giVar.getEditText(), false);
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
        yi yiVar = this.V;
        yiVar.f2();
        if (yiVar.f33205c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            yiVar.Q1(z10);
        }
    }
}
