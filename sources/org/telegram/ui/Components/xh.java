package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class xh extends wt {
    public final si W;

    public xh(si siVar, Context context, fi fiVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, fiVar, null, 1, true, i6Var);
        this.W = siVar;
    }

    @Override
    public final void f() {
        super.f();
        ry emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f39407x0 = false;
            emojiView.f39413y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f24113n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.h2 h2Var = this.W.f39659a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) h2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        si siVar = this.W;
        xh xhVar = siVar.N2;
        if (!siVar.f39717s3) {
            if (motionEvent.getX() > xhVar.getEditText().getLeft() && motionEvent.getX() < xhVar.getEditText().getRight() && motionEvent.getY() > xhVar.getEditText().getTop() && motionEvent.getY() < xhVar.getEditText().getBottom()) {
                siVar.i1(xhVar.getEditText(), true);
            } else {
                siVar.i1(xhVar.getEditText(), false);
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
        si siVar = this.W;
        siVar.R1();
        if (siVar.X1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            siVar.C1(z10);
        }
    }
}
