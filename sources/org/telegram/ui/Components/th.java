package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class th extends cu {
    public final li S;

    public th(li liVar, Context context, bi biVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, biVar, null, 1, true, f6Var);
        this.S = liVar;
    }

    @Override
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26482t0 = false;
            emojiView.f26487u2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.p2 p2Var = this.S.f26685c0;
        if (p2Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) p2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        li liVar = this.S;
        th thVar = liVar.M0;
        if (!liVar.f26732r1) {
            if (motionEvent.getX() > thVar.getEditText().getLeft() && motionEvent.getX() < thVar.getEditText().getRight() && motionEvent.getY() > thVar.getEditText().getTop() && motionEvent.getY() < thVar.getEditText().getBottom()) {
                liVar.t1(thVar.getEditText(), true);
            } else {
                liVar.t1(thVar.getEditText(), false);
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
        li liVar = this.S;
        liVar.b2();
        if (liVar.Z) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z4 = true;
            } else {
                z4 = false;
            }
            liVar.M1(z4);
        }
    }
}
