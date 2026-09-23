package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ei extends ku {
    public final wi V;

    public ei(wi wiVar, Context context, mi miVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, miVar, null, 1, true, d6Var);
        this.V = wiVar;
    }

    @Override
    public final void f() {
        super.f();
        lz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26030w0 = false;
            emojiView.f26032w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.V.f29665f0;
        if (n2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) n2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wi wiVar = this.V;
        ei eiVar = wiVar.P0;
        if (!wiVar.f29712u1) {
            if (motionEvent.getX() > eiVar.getEditText().getLeft() && motionEvent.getX() < eiVar.getEditText().getRight() && motionEvent.getY() > eiVar.getEditText().getTop() && motionEvent.getY() < eiVar.getEditText().getBottom()) {
                wiVar.t1(eiVar.getEditText(), true);
            } else {
                wiVar.t1(eiVar.getEditText(), false);
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
        wi wiVar = this.V;
        wiVar.b2();
        if (wiVar.f29655c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            wiVar.M1(z10);
        }
    }
}
