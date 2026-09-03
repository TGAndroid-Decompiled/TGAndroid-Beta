package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class th extends fu {
    public final mi S;

    public th(mi miVar, Context context, ci ciVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, ciVar, null, 1, true, g6Var);
        this.S = miVar;
    }

    @Override
    public final void f() {
        super.f();
        mz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f29327t0 = false;
            emojiView.f29332u2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.p2 p2Var = this.S.f29058c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) p2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mi miVar = this.S;
        th thVar = miVar.M0;
        if (!miVar.f29106r1) {
            if (motionEvent.getX() > thVar.getEditText().getLeft() && motionEvent.getX() < thVar.getEditText().getRight() && motionEvent.getY() > thVar.getEditText().getTop() && motionEvent.getY() < thVar.getEditText().getBottom()) {
                miVar.t1(thVar.getEditText(), true);
            } else {
                miVar.t1(thVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.S.b2();
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z4;
        mi miVar = this.S;
        miVar.b2();
        if (miVar.Z) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z4 = true;
            } else {
                z4 = false;
            }
            miVar.M1(z4);
        }
    }
}
