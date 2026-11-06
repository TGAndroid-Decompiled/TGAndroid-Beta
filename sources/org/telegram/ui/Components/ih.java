package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class ih extends kt {
    public final di V;

    public ih(di diVar, Context context, qh qhVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, qhVar, null, 1, true, f6Var);
        this.V = diVar;
    }

    @Override
    public final void f() {
        super.f();
        gy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f34085w0 = false;
            emojiView.f34091x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f22532n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.f2 f2Var = this.V.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            org.telegram.ui.an.A8(menu, ((org.telegram.ui.an) f2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        di diVar = this.V;
        ih ihVar = diVar.J2;
        if (!diVar.f32941o3) {
            if (motionEvent.getX() > ihVar.getEditText().getLeft() && motionEvent.getX() < ihVar.getEditText().getRight() && motionEvent.getY() > ihVar.getEditText().getTop() && motionEvent.getY() < ihVar.getEditText().getBottom()) {
                diVar.h1(ihVar.getEditText(), true);
            } else {
                diVar.h1(ihVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.V.Q1();
    }

    @Override
    public final void q(int i7, int i10) {
        boolean z9;
        di diVar = this.V;
        diVar.Q1();
        if (diVar.T1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z9 = true;
            } else {
                z9 = false;
            }
            diVar.B1(z9);
        }
    }
}
