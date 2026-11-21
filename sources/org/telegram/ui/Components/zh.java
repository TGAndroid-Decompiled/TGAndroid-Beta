package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class zh extends yt {
    public final ui W;

    public zh(ui uiVar, Context context, hi hiVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, hiVar, null, 1, true, h6Var);
        this.W = uiVar;
    }

    @Override
    public final void f() {
        super.f();
        ty emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f40161x0 = false;
            emojiView.f40167y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f24141n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.g2 g2Var = this.W.f40375a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) g2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ui uiVar = this.W;
        zh zhVar = uiVar.N2;
        if (!uiVar.f40433s3) {
            if (motionEvent.getX() > zhVar.getEditText().getLeft() && motionEvent.getX() < zhVar.getEditText().getRight() && motionEvent.getY() > zhVar.getEditText().getTop() && motionEvent.getY() < zhVar.getEditText().getBottom()) {
                uiVar.i1(zhVar.getEditText(), true);
            } else {
                uiVar.i1(zhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.W.R1();
    }

    @Override
    public final void q(int i7, int i10) {
        boolean z10;
        ui uiVar = this.W;
        uiVar.R1();
        if (uiVar.X1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            uiVar.C1(z10);
        }
    }
}
