package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class di extends ju {
    public final vi V;

    public di(vi viVar, Context context, li liVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, liVar, null, 1, true, f6Var);
        this.V = viVar;
    }

    @Override
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f25960w0 = false;
            emojiView.f25962w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.V.f29098f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) n2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vi viVar = this.V;
        di diVar = viVar.P0;
        if (!viVar.f29145u1) {
            if (motionEvent.getX() > diVar.getEditText().getLeft() && motionEvent.getX() < diVar.getEditText().getRight() && motionEvent.getY() > diVar.getEditText().getTop() && motionEvent.getY() < diVar.getEditText().getBottom()) {
                viVar.t1(diVar.getEditText(), true);
            } else {
                viVar.t1(diVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.b2();
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        vi viVar = this.V;
        viVar.b2();
        if (viVar.f29088c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            viVar.M1(z10);
        }
    }
}
