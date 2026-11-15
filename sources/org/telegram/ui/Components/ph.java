package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class ph extends rt {
    public final ki W;

    public ph(ki kiVar, Context context, xh xhVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, xhVar, null, 1, true, e6Var);
        this.W = kiVar;
    }

    @Override
    public final void f() {
        super.f();
        ly emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f37003x0 = false;
            emojiView.f37009y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f23604n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.e2 e2Var = this.W.f36436a2;
        if (e2Var instanceof org.telegram.ui.an) {
            org.telegram.ui.an.C8(menu, ((org.telegram.ui.an) e2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ki kiVar = this.W;
        ph phVar = kiVar.N2;
        if (!kiVar.f36494s3) {
            if (motionEvent.getX() > phVar.getEditText().getLeft() && motionEvent.getX() < phVar.getEditText().getRight() && motionEvent.getY() > phVar.getEditText().getTop() && motionEvent.getY() < phVar.getEditText().getBottom()) {
                kiVar.h1(phVar.getEditText(), true);
            } else {
                kiVar.h1(phVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.W.Q1();
    }

    @Override
    public final void q(int i7, int i10) {
        boolean z10;
        ki kiVar = this.W;
        kiVar.Q1();
        if (kiVar.X1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            kiVar.B1(z10);
        }
    }
}
