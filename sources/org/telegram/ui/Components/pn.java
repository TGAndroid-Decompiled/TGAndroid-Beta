package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.we1;
public final class pn extends o9 {
    public final org.telegram.ui.Cells.l6 C;
    public final org.telegram.ui.ActionBar.o2 D;
    public final boolean E;
    public final org.telegram.ui.ActionBar.b6 F;
    public final tn G;

    public pn(tn tnVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.G = tnVar;
        this.D = o2Var;
        this.E = z10;
        this.F = b6Var;
        this.C = new org.telegram.ui.Cells.l6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        tn tnVar = this.G;
        if (tnVar.f32726b && this.f31331e == null) {
            org.telegram.ui.Cells.l6 l6Var = this.C;
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            l6Var.f11716a = true;
            l6Var.v = true;
            l6Var.J = this.F;
            Integer num = tnVar.f32728c;
            if (num != null) {
                l6Var.f11738z = num.intValue();
            }
            org.telegram.ui.qn qnVar = tnVar.C;
            if (qnVar != null) {
                j10 = qnVar.a();
            } else {
                org.telegram.ui.ActionBar.o2 o2Var = this.D;
                if (o2Var instanceof we1) {
                    j10 = -((we1) o2Var).f43741a;
                } else {
                    j10 = 0;
                }
            }
            ih.p7.h(j10, canvas, this.f31328a, l6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.E && getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.G.f32726b && this.C.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
