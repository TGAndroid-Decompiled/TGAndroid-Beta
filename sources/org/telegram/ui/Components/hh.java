package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class hh extends kt {
    public final ci V;

    public hh(ci ciVar, Context context, ph phVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, phVar, null, 1, true, h6Var);
        this.V = ciVar;
    }

    @Override
    public final void f() {
        super.f();
        gy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f34077w0 = false;
            emojiView.f34083x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f22562n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.f2 f2Var = this.V.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            org.telegram.ui.cn.B8(menu, ((org.telegram.ui.cn) f2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ci ciVar = this.V;
        hh hhVar = ciVar.M2;
        if (!ciVar.f32645r3) {
            if (motionEvent.getX() > hhVar.getEditText().getLeft() && motionEvent.getX() < hhVar.getEditText().getRight() && motionEvent.getY() > hhVar.getEditText().getTop() && motionEvent.getY() < hhVar.getEditText().getBottom()) {
                ciVar.h1(hhVar.getEditText(), true);
            } else {
                ciVar.h1(hhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.V.Q1();
    }

    @Override
    public final void q(int i7, int i10) {
        boolean z9;
        ci ciVar = this.V;
        ciVar.Q1();
        if (ciVar.W1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z9 = true;
            } else {
                z9 = false;
            }
            ciVar.B1(z9);
        }
    }
}
