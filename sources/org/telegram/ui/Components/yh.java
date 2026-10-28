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
            emojiView.f32775w0 = false;
            emojiView.f32781x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.r2 r2Var = this.V.f32990f0;
        if (r2Var instanceof org.telegram.ui.wn) {
            org.telegram.ui.wn.t8(menu, ((org.telegram.ui.wn) r2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.V;
        yh yhVar = tiVar.S0;
        if (!tiVar.f33048x1) {
            if (motionEvent.getX() > yhVar.getEditText().getLeft() && motionEvent.getX() < yhVar.getEditText().getRight() && motionEvent.getY() > yhVar.getEditText().getTop() && motionEvent.getY() < yhVar.getEditText().getBottom()) {
                tiVar.z1(yhVar.getEditText(), true);
            } else {
                tiVar.z1(yhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.j2();
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        ti tiVar = this.V;
        tiVar.j2();
        if (tiVar.f32980c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            tiVar.U1(z10);
        }
    }
}
