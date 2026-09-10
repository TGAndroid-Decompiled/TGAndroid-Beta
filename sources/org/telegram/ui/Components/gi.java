package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class gi extends nu {
    public final yi V;

    public gi(yi yiVar, Context context, oi oiVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, oiVar, null, 1, true, f6Var);
        this.V = yiVar;
    }

    @Override
    public final void f() {
        super.f();
        rz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26867w0 = false;
            emojiView.f26873x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.p2 p2Var = this.V.f29366f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            org.telegram.ui.eo.k8(menu, ((org.telegram.ui.eo) p2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        yi yiVar = this.V;
        gi giVar = yiVar.P0;
        if (!yiVar.f29413u1) {
            if (motionEvent.getX() > giVar.getEditText().getLeft() && motionEvent.getX() < giVar.getEditText().getRight() && motionEvent.getY() > giVar.getEditText().getTop() && motionEvent.getY() < giVar.getEditText().getBottom()) {
                yiVar.t1(giVar.getEditText(), true);
            } else {
                yiVar.t1(giVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.b2();
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        yi yiVar = this.V;
        yiVar.b2();
        if (yiVar.f29356c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            yiVar.M1(z10);
        }
    }
}
