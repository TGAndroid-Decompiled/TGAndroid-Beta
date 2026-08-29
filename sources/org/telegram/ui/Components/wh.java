package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class wh extends au {
    public final ni R;

    public wh(ni niVar, Context context, di diVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, diVar, null, 1, true, c6Var);
        this.R = niVar;
    }

    @Override
    public final void f() {
        super.f();
        fz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f28633s0 = false;
            emojiView.f28638t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.R.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            org.telegram.ui.tn.k8(menu, ((org.telegram.ui.tn) o2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ni niVar = this.R;
        wh whVar = niVar.L0;
        if (!niVar.f31038q1) {
            if (motionEvent.getX() > whVar.getEditText().getLeft() && motionEvent.getX() < whVar.getEditText().getRight() && motionEvent.getY() > whVar.getEditText().getTop() && motionEvent.getY() < whVar.getEditText().getBottom()) {
                niVar.t1(whVar.getEditText(), true);
            } else {
                niVar.t1(whVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.R.b2();
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        ni niVar = this.R;
        niVar.b2();
        if (niVar.Y) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            niVar.M1(z10);
        }
    }
}
