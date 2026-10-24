package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ai extends ou {
    public final ri V;

    public ai(ri riVar, Context context, hi hiVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, hiVar, null, 1, true, g6Var);
        this.V = riVar;
    }

    @Override
    public final void f() {
        super.f();
        rz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f30372w0 = false;
            emojiView.f30378x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.V.f30146f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) o2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ri riVar = this.V;
        ai aiVar = riVar.S0;
        if (!riVar.f30204x1) {
            if (motionEvent.getX() > aiVar.getEditText().getLeft() && motionEvent.getX() < aiVar.getEditText().getRight() && motionEvent.getY() > aiVar.getEditText().getTop() && motionEvent.getY() < aiVar.getEditText().getBottom()) {
                riVar.z1(aiVar.getEditText(), true);
            } else {
                riVar.z1(aiVar.getEditText(), false);
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
        ri riVar = this.V;
        riVar.j2();
        if (riVar.f30136c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            riVar.U1(z10);
        }
    }
}
