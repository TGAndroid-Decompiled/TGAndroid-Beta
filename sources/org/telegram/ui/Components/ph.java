package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

public final class ph extends tt {
    public final gi R;

    public ph(gi giVar, Context context, wh whVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, whVar, null, 1, true, c6Var);
        this.R = giVar;
    }

    @Override
    public final void f() {
        super.f();
        yy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f35035s0 = false;
            emojiView.f35040t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.R.f28635b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn.k8(menu, ((org.telegram.ui.rn) n2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gi giVar = this.R;
        ph phVar = giVar.L0;
        if (!giVar.f28683q1) {
            if (motionEvent.getX() <= phVar.getEditText().getLeft() || motionEvent.getX() >= phVar.getEditText().getRight() || motionEvent.getY() <= phVar.getEditText().getTop() || motionEvent.getY() >= phVar.getEditText().getBottom()) {
                giVar.t1(phVar.getEditText(), false);
            } else {
                giVar.t1(phVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.R.b2();
    }

    @Override
    public final void q(int i10, int i11) {
        gi giVar = this.R;
        giVar.b2();
        if (giVar.Y) {
            giVar.M1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
