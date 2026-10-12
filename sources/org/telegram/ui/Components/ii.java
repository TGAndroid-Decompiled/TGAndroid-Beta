package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ii extends cv {
    public final aj V;

    public ii(aj ajVar, Context context, qi qiVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, qiVar, null, 1, true, c6Var);
        this.V = ajVar;
    }

    @Override
    public final void f() {
        super.f();
        d00 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f25135w0 = false;
            emojiView.f25137w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.m2 m2Var = this.V.f24338f0;
        if (m2Var instanceof org.telegram.ui.eo) {
            org.telegram.ui.eo.n8(menu, ((org.telegram.ui.eo) m2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        aj ajVar = this.V;
        ii iiVar = ajVar.S0;
        if (!ajVar.f24396x1) {
            if (motionEvent.getX() > iiVar.getEditText().getLeft() && motionEvent.getX() < iiVar.getEditText().getRight() && motionEvent.getY() > iiVar.getEditText().getTop() && motionEvent.getY() < iiVar.getEditText().getBottom()) {
                ajVar.w1(iiVar.getEditText(), true);
            } else {
                ajVar.w1(iiVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.f2();
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        aj ajVar = this.V;
        ajVar.f2();
        if (ajVar.f24327c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            ajVar.Q1(z10);
        }
    }
}
