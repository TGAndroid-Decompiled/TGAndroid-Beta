package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ai extends lu {
    public final wi V;

    public ai(wi wiVar, Context context, ji jiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, jiVar, null, 1, true, e6Var);
        this.V = wiVar;
    }

    @Override
    public final void f() {
        super.f();
        mz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26636w0 = false;
            emojiView.f26638w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.V.f29962f0;
        if (o2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) o2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wi wiVar = this.V;
        ai aiVar = wiVar.P0;
        if (!wiVar.f30009u1) {
            if (motionEvent.getX() > aiVar.getEditText().getLeft() && motionEvent.getX() < aiVar.getEditText().getRight() && motionEvent.getY() > aiVar.getEditText().getTop() && motionEvent.getY() < aiVar.getEditText().getBottom()) {
                wiVar.q1(aiVar.getEditText(), true);
            } else {
                wiVar.q1(aiVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.Y1();
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        wi wiVar = this.V;
        wiVar.Y1();
        if (wiVar.f29952c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            wiVar.J1(z10);
        }
    }
}
