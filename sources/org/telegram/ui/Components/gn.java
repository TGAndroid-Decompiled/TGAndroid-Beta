package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.v91;
public final class gn extends l9 {
    public final org.telegram.ui.Cells.k6 G;
    public final org.telegram.ui.ActionBar.f2 H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.f6 J;
    public final kn K;

    public gn(kn knVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.K = knVar;
        this.H = f2Var;
        this.I = z9;
        this.J = f6Var;
        this.G = new org.telegram.ui.Cells.k6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        kn knVar = this.K;
        if (knVar.f35336b && this.f35585e == null) {
            org.telegram.ui.Cells.k6 k6Var = this.G;
            k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            k6Var.f9408a = true;
            k6Var.v = true;
            k6Var.J = this.J;
            Integer num = knVar.f35338c;
            if (num != null) {
                k6Var.f9430z = num.intValue();
            }
            org.telegram.ui.an anVar = knVar.G;
            if (anVar != null) {
                j3 = anVar.a();
            } else {
                org.telegram.ui.ActionBar.f2 f2Var = this.H;
                if (f2Var instanceof v91) {
                    j3 = -((v91) f2Var).f50628a;
                } else {
                    j3 = 0;
                }
            }
            di.r7.h(j3, canvas, this.f35582a, k6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.I && getImageReceiver().L()) {
            accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.M0(2131747816, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K.f35336b && this.G.a(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
