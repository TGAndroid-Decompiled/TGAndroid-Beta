package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.m91;
public final class fn extends k9 {
    public final org.telegram.ui.Cells.j6 H;
    public final org.telegram.ui.ActionBar.d2 I;
    public final boolean J;
    public final org.telegram.ui.ActionBar.e6 K;
    public final jn L;

    public fn(jn jnVar, Context context, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.L = jnVar;
        this.I = d2Var;
        this.J = z10;
        this.K = e6Var;
        this.H = new org.telegram.ui.Cells.j6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        jn jnVar = this.L;
        if (jnVar.f35122b && this.f35345e == null) {
            org.telegram.ui.Cells.j6 j6Var = this.H;
            j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            j6Var.f10696a = true;
            j6Var.v = true;
            j6Var.J = this.K;
            Integer num = jnVar.f35124c;
            if (num != null) {
                j6Var.f10718z = num.intValue();
            }
            org.telegram.ui.wm wmVar = jnVar.H;
            if (wmVar != null) {
                j10 = wmVar.a();
            } else {
                org.telegram.ui.ActionBar.d2 d2Var = this.I;
                if (d2Var instanceof m91) {
                    j10 = -((m91) d2Var).f47575a;
                } else {
                    j10 = 0;
                }
            }
            ei.s7.h(j10, canvas, this.f35342a, j6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.J && getImageReceiver().L()) {
            accessibilityNodeInfo.setText(org.telegram.messenger.bd.M0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.bd.M0(2131747825, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.L.f35122b && this.H.a(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
