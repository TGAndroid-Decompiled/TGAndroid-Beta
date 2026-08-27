package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.we1;

public final class nn extends n9 {
    public final org.telegram.ui.Cells.i6 C;
    public final org.telegram.ui.ActionBar.n2 D;
    public final boolean E;
    public final org.telegram.ui.ActionBar.c6 F;
    public final rn G;

    public nn(rn rnVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.G = rnVar;
        this.D = n2Var;
        this.E = z10;
        this.F = c6Var;
        this.C = new org.telegram.ui.Cells.i6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long jA;
        rn rnVar = this.G;
        if (!rnVar.f32212b || this.f30901e != null) {
            super.onDraw(canvas);
            return;
        }
        org.telegram.ui.Cells.i6 i6Var = this.C;
        i6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        i6Var.f13391a = true;
        i6Var.v = true;
        i6Var.J = this.F;
        Integer num = rnVar.f32214c;
        if (num != null) {
            i6Var.f13413z = num.intValue();
        }
        org.telegram.ui.rn rnVar2 = rnVar.C;
        if (rnVar2 != null) {
            jA = rnVar2.a();
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.D;
            jA = n2Var instanceof we1 ? -((we1) n2Var).f43719a : 0L;
        }
        jh.l7.h(jA, canvas, this.f30898a, i6Var);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.E || !getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.G.f32212b && this.C.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
