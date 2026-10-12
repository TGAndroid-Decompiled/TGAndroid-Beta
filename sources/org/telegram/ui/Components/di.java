package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class di extends vu {
    public final vi V;

    public di(vi viVar, Context context, li liVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, liVar, null, 1, true, c6Var);
        this.V = viVar;
    }

    @Override
    public final void f() {
        super.f();
        wz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f31076w0 = false;
            emojiView.f31078w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.m2 m2Var = this.V.f30001f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            org.telegram.ui.fo.n8(menu, ((org.telegram.ui.fo) m2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vi viVar = this.V;
        di diVar = viVar.S0;
        if (!viVar.f30059x1) {
            if (motionEvent.getX() > diVar.getEditText().getLeft() && motionEvent.getX() < diVar.getEditText().getRight() && motionEvent.getY() > diVar.getEditText().getTop() && motionEvent.getY() < diVar.getEditText().getBottom()) {
                viVar.w1(diVar.getEditText(), true);
            } else {
                viVar.w1(diVar.getEditText(), false);
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
        vi viVar = this.V;
        viVar.f2();
        if (viVar.f29991c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            viVar.Q1(z10);
        }
    }
}
