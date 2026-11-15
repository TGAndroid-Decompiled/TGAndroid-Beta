package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.u91;
public final class on extends i9 {
    public final org.telegram.ui.Cells.j6 H;
    public final org.telegram.ui.ActionBar.e2 I;
    public final boolean J;
    public final org.telegram.ui.ActionBar.e6 K;
    public final sn L;

    public on(sn snVar, Context context, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.L = snVar;
        this.I = e2Var;
        this.J = z10;
        this.K = e6Var;
        this.H = new org.telegram.ui.Cells.j6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        sn snVar = this.L;
        if (snVar.f39348b && this.f35511e == null) {
            org.telegram.ui.Cells.j6 j6Var = this.H;
            j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            j6Var.f11778a = true;
            j6Var.v = true;
            j6Var.J = this.K;
            Integer num = snVar.f39350c;
            if (num != null) {
                j6Var.f11800z = num.intValue();
            }
            org.telegram.ui.an anVar = snVar.H;
            if (anVar != null) {
                j3 = anVar.a();
            } else {
                org.telegram.ui.ActionBar.e2 e2Var = this.I;
                if (e2Var instanceof u91) {
                    j3 = -((u91) e2Var).f51834a;
                } else {
                    j3 = 0;
                }
            }
            fi.l7.h(j3, canvas, this.f35508a, j6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.J && getImageReceiver().L()) {
            accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.M0(2131747817, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.L.f39348b && this.H.a(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
