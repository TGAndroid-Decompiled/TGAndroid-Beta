package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class yh extends ru {
    public final ti V;

    public yh(ti tiVar, Context context, gi giVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, giVar, null, 1, true, u6Var);
        this.V = tiVar;
    }

    @Override
    public final void f() {
        super.f();
        sz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f32781w0 = false;
            emojiView.f32787x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.r2 r2Var = this.V.f33021f0;
        if (r2Var instanceof org.telegram.ui.un) {
            org.telegram.ui.un.r8(menu, ((org.telegram.ui.un) r2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.V;
        yh yhVar = tiVar.S0;
        if (!tiVar.f33079x1) {
            if (motionEvent.getX() > yhVar.getEditText().getLeft() && motionEvent.getX() < yhVar.getEditText().getRight() && motionEvent.getY() > yhVar.getEditText().getTop() && motionEvent.getY() < yhVar.getEditText().getBottom()) {
                tiVar.y1(yhVar.getEditText(), true);
            } else {
                tiVar.y1(yhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.i2();
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        ti tiVar = this.V;
        tiVar.i2();
        if (tiVar.f33011c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            tiVar.T1(z10);
        }
    }
}
