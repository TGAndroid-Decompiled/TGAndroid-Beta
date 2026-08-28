package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class th extends ut {
    public final ki R;

    public th(ki kiVar, Context context, ai aiVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, aiVar, null, 1, true, b6Var);
        this.R = kiVar;
    }

    @Override
    public final void f() {
        super.f();
        wy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f34442s0 = false;
            emojiView.f34447t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.R.f30099b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn.k8(menu, ((org.telegram.ui.qn) o2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ki kiVar = this.R;
        th thVar = kiVar.L0;
        if (!kiVar.f30147q1) {
            if (motionEvent.getX() > thVar.getEditText().getLeft() && motionEvent.getX() < thVar.getEditText().getRight() && motionEvent.getY() > thVar.getEditText().getTop() && motionEvent.getY() < thVar.getEditText().getBottom()) {
                kiVar.t1(thVar.getEditText(), true);
            } else {
                kiVar.t1(thVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.R.b2();
    }

    @Override
    public final void q(int i9, int i10) {
        boolean z10;
        ki kiVar = this.R;
        kiVar.b2();
        if (kiVar.Y) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            kiVar.M1(z10);
        }
    }
}
