package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.pb1;
public final class on extends g9 {
    public final org.telegram.ui.Cells.o6 G;
    public final org.telegram.ui.ActionBar.k2 H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.p6 J;
    public final sn K;

    public on(sn snVar, Context context, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.K = snVar;
        this.H = k2Var;
        this.I = z10;
        this.J = p6Var;
        this.G = new org.telegram.ui.Cells.o6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        sn snVar = this.K;
        if (snVar.f30268b && this.e == null) {
            org.telegram.ui.Cells.o6 o6Var = this.G;
            o6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            o6Var.f49465a = true;
            o6Var.v = true;
            o6Var.J = this.J;
            Integer num = snVar.f30270c;
            if (num != null) {
                o6Var.f49486z = num.intValue();
            }
            org.telegram.ui.un unVar = snVar.G;
            if (unVar != null) {
                j10 = unVar.a();
            } else {
                org.telegram.ui.ActionBar.k2 k2Var = this.H;
                if (k2Var instanceof pb1) {
                    j10 = -((pb1) k2Var).f40566a;
                } else {
                    j10 = 0;
                }
            }
            th.w5.h(j10, canvas, this.f26292a, o6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.I && getImageReceiver().L()) {
            accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.cd.L0(2131747833, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K.f30268b && this.G.a(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
