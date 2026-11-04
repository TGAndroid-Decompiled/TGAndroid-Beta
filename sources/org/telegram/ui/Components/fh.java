package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class fh extends jt {
    public final bi W;

    public fh(bi biVar, Context context, oh ohVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, ohVar, null, 1, true, e6Var);
        this.W = biVar;
    }

    @Override
    public final void f() {
        super.f();
        ey emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f33592x0 = false;
            emojiView.f33598y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f22603n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.d2 d2Var = this.W.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            org.telegram.ui.wm.A8(menu, ((org.telegram.ui.wm) d2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.W;
        fh fhVar = biVar.K2;
        if (!biVar.f32260p3) {
            if (motionEvent.getX() > fhVar.getEditText().getLeft() && motionEvent.getX() < fhVar.getEditText().getRight() && motionEvent.getY() > fhVar.getEditText().getTop() && motionEvent.getY() < fhVar.getEditText().getBottom()) {
                biVar.h1(fhVar.getEditText(), true);
            } else {
                biVar.h1(fhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.W.Q1();
    }

    @Override
    public final void q(int i3, int i10) {
        boolean z10;
        bi biVar = this.W;
        biVar.Q1();
        if (biVar.U1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            biVar.B1(z10);
        }
    }
}
