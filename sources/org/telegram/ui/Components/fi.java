package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class fi extends mu {
    public final xi V;

    public fi(xi xiVar, Context context, ni niVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, niVar, null, 1, true, d6Var);
        this.V = xiVar;
    }

    @Override
    public final void f() {
        super.f();
        nz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26880w0 = false;
            emojiView.f26882w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.m2 m2Var = this.V.f30270f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            org.telegram.ui.wn.k8(menu, ((org.telegram.ui.wn) m2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xi xiVar = this.V;
        fi fiVar = xiVar.P0;
        if (!xiVar.f30317u1) {
            if (motionEvent.getX() > fiVar.getEditText().getLeft() && motionEvent.getX() < fiVar.getEditText().getRight() && motionEvent.getY() > fiVar.getEditText().getTop() && motionEvent.getY() < fiVar.getEditText().getBottom()) {
                xiVar.t1(fiVar.getEditText(), true);
            } else {
                xiVar.t1(fiVar.getEditText(), false);
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
        xi xiVar = this.V;
        xiVar.b2();
        if (xiVar.f30260c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            xiVar.M1(z10);
        }
    }
}
