package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.eg1;
public final class yn extends x9 {
    public final org.telegram.ui.Cells.l6 G;
    public final org.telegram.ui.ActionBar.n2 H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.f6 J;
    public final co K;

    public yn(co coVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.K = coVar;
        this.H = n2Var;
        this.I = z10;
        this.J = f6Var;
        this.G = new org.telegram.ui.Cells.l6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        co coVar = this.K;
        if (coVar.f25040b && this.f32479e == null) {
            org.telegram.ui.Cells.l6 l6Var = this.G;
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            l6Var.f3147a = true;
            l6Var.v = true;
            l6Var.J = this.J;
            Integer num = coVar.f25042c;
            if (num != null) {
                l6Var.f3169z = num.intValue();
            }
            org.telegram.ui.co coVar2 = coVar.G;
            if (coVar2 != null) {
                j3 = coVar2.a();
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = this.H;
                if (n2Var instanceof eg1) {
                    j3 = -((eg1) n2Var).f36025a;
                } else {
                    j3 = 0;
                }
            }
            bi.p9.h(j3, canvas, this.f32476a, l6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.I && getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K.f25040b && this.G.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
