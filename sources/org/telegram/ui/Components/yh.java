package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class yh extends wt {
    public final ti W;

    public yh(ti tiVar, Context context, gi giVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, giVar, null, 1, true, i6Var);
        this.W = tiVar;
    }

    @Override
    public final void f() {
        super.f();
        qy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f39109x0 = false;
            emojiView.f39115y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f24221n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.g2 g2Var = this.W.f39956a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) g2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.W;
        yh yhVar = tiVar.N2;
        if (!tiVar.f40014s3) {
            if (motionEvent.getX() > yhVar.getEditText().getLeft() && motionEvent.getX() < yhVar.getEditText().getRight() && motionEvent.getY() > yhVar.getEditText().getTop() && motionEvent.getY() < yhVar.getEditText().getBottom()) {
                tiVar.i1(yhVar.getEditText(), true);
            } else {
                tiVar.i1(yhVar.getEditText(), false);
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
        ti tiVar = this.W;
        tiVar.R1();
        if (tiVar.X1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            tiVar.C1(z10);
        }
    }
}
