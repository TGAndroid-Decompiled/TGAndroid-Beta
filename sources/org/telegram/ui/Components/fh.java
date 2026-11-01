package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class fh extends wt {
    public final bi V;

    public fh(bi biVar, Context context, ph phVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, phVar, null, 1, true, p6Var);
        this.V = biVar;
    }

    @Override
    public final void f() {
        super.f();
        vy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f32005w0 = false;
            emojiView.f32011x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.i0.f16167n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.k2 k2Var = this.V.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            org.telegram.ui.un.x8(menu, ((org.telegram.ui.un) k2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.V;
        fh fhVar = biVar.J2;
        if (!biVar.f24797o3) {
            if (motionEvent.getX() > fhVar.getEditText().getLeft() && motionEvent.getX() < fhVar.getEditText().getRight() && motionEvent.getY() > fhVar.getEditText().getTop() && motionEvent.getY() < fhVar.getEditText().getBottom()) {
                biVar.g1(fhVar.getEditText(), true);
            } else {
                biVar.g1(fhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.P1();
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        bi biVar = this.V;
        biVar.P1();
        if (biVar.T1) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            biVar.A1(z10);
        }
    }
}
