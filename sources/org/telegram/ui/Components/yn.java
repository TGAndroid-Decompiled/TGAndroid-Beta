package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.y91;
public final class yn extends q9 {
    public final org.telegram.ui.Cells.l6 H;
    public final org.telegram.ui.ActionBar.g2 I;
    public final boolean J;
    public final org.telegram.ui.ActionBar.h6 K;
    public final co L;

    public yn(co coVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.L = coVar;
        this.I = g2Var;
        this.J = z10;
        this.K = h6Var;
        this.H = new org.telegram.ui.Cells.l6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        co coVar = this.L;
        if (coVar.f34229b && this.f38839e == null) {
            org.telegram.ui.Cells.l6 l6Var = this.H;
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            l6Var.f11934a = true;
            l6Var.v = true;
            l6Var.J = this.K;
            Integer num = coVar.f34231c;
            if (num != null) {
                l6Var.f11956z = num.intValue();
            }
            org.telegram.ui.bn bnVar = coVar.H;
            if (bnVar != null) {
                j3 = bnVar.a();
            } else {
                org.telegram.ui.ActionBar.g2 g2Var = this.I;
                if (g2Var instanceof y91) {
                    j3 = -((y91) g2Var).f54099a;
                } else {
                    j3 = 0;
                }
            }
            fi.i7.h(j3, canvas, this.f38836a, l6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.J && getImageReceiver().L()) {
            accessibilityNodeInfo.setText(org.telegram.messenger.hd.N0(2131754797, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.N0(2131747623, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.L.f34229b && this.H.a(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
