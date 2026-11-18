package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.y91;
public final class wn extends q9 {
    public final org.telegram.ui.Cells.l6 H;
    public final org.telegram.ui.ActionBar.h2 I;
    public final boolean J;
    public final org.telegram.ui.ActionBar.i6 K;
    public final ao L;

    public wn(ao aoVar, Context context, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.L = aoVar;
        this.I = h2Var;
        this.J = z10;
        this.K = i6Var;
        this.H = new org.telegram.ui.Cells.l6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        ao aoVar = this.L;
        if (aoVar.f33376b && this.f38745e == null) {
            org.telegram.ui.Cells.l6 l6Var = this.H;
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            l6Var.f11889a = true;
            l6Var.v = true;
            l6Var.J = this.K;
            Integer num = aoVar.f33378c;
            if (num != null) {
                l6Var.f11911z = num.intValue();
            }
            org.telegram.ui.bn bnVar = aoVar.H;
            if (bnVar != null) {
                j3 = bnVar.a();
            } else {
                org.telegram.ui.ActionBar.h2 h2Var = this.I;
                if (h2Var instanceof y91) {
                    j3 = -((y91) h2Var).f54050a;
                } else {
                    j3 = 0;
                }
            }
            fi.i7.h(j3, canvas, this.f38742a, l6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.J && getImageReceiver().L()) {
            accessibilityNodeInfo.setText(org.telegram.messenger.gd.M0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.M0(2131747624, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.L.f33376b && this.H.a(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
