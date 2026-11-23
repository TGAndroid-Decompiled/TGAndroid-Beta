package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.w91;
public final class vn extends p9 {
    public final org.telegram.ui.Cells.k6 H;
    public final org.telegram.ui.ActionBar.g2 I;
    public final boolean J;
    public final org.telegram.ui.ActionBar.i6 K;
    public final zn L;

    public vn(zn znVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.L = znVar;
        this.I = g2Var;
        this.J = z10;
        this.K = i6Var;
        this.H = new org.telegram.ui.Cells.k6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        zn znVar = this.L;
        if (znVar.f42929b && this.f38432e == null) {
            org.telegram.ui.Cells.k6 k6Var = this.H;
            k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            k6Var.f11896a = true;
            k6Var.v = true;
            k6Var.J = this.K;
            Integer num = znVar.f42931c;
            if (num != null) {
                k6Var.f11918z = num.intValue();
            }
            org.telegram.ui.bn bnVar = znVar.H;
            if (bnVar != null) {
                j3 = bnVar.a();
            } else {
                org.telegram.ui.ActionBar.g2 g2Var = this.I;
                if (g2Var instanceof w91) {
                    j3 = -((w91) g2Var).f53216a;
                } else {
                    j3 = 0;
                }
            }
            fi.i7.h(j3, canvas, this.f38429a, k6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.J && getImageReceiver().M()) {
            accessibilityNodeInfo.setText(org.telegram.messenger.gd.N0(2131754797, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.N0(2131747623, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.L.f42929b && this.H.a(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
