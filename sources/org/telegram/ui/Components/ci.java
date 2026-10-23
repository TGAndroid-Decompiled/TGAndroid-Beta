package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ci extends qu {
    public final ti V;

    public ci(ti tiVar, Context context, ji jiVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, jiVar, null, 1, true, g6Var);
        this.V = tiVar;
    }

    @Override
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f31028w0 = false;
            emojiView.f31034x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.V.f30730f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) o2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.V;
        ci ciVar = tiVar.S0;
        if (!tiVar.f30788x1) {
            if (motionEvent.getX() > ciVar.getEditText().getLeft() && motionEvent.getX() < ciVar.getEditText().getRight() && motionEvent.getY() > ciVar.getEditText().getTop() && motionEvent.getY() < ciVar.getEditText().getBottom()) {
                tiVar.z1(ciVar.getEditText(), true);
            } else {
                tiVar.z1(ciVar.getEditText(), false);
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
        if (tiVar.f30720c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            tiVar.U1(z10);
        }
    }
}
