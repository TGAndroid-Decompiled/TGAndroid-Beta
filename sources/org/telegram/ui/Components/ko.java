package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.re1;
public final class ko extends w9 {
    public final org.telegram.ui.Cells.l6 G;
    public final org.telegram.ui.ActionBar.n2 H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.d6 J;
    public final oo K;

    public ko(oo ooVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.K = ooVar;
        this.H = n2Var;
        this.I = z10;
        this.J = d6Var;
        this.G = new org.telegram.ui.Cells.l6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        oo ooVar = this.K;
        if (ooVar.f29091b && this.e == null) {
            org.telegram.ui.Cells.l6 l6Var = this.G;
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            l6Var.f6209a = true;
            l6Var.v = true;
            l6Var.J = this.J;
            Integer num = ooVar.f29093c;
            if (num != null) {
                l6Var.f6230z = num.intValue();
            }
            org.telegram.ui.qn qnVar = ooVar.G;
            if (qnVar != null) {
                j10 = qnVar.a();
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = this.H;
                if (n2Var instanceof re1) {
                    j10 = -((re1) n2Var).f41152a;
                } else {
                    j10 = 0;
                }
            }
            ci.d8.h(j10, canvas, this.f31997a, l6Var);
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
        if (this.K.f29091b && this.G.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
