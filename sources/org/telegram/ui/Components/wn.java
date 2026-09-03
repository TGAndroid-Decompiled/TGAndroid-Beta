package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.sf1;
public final class wn extends p9 {
    public final org.telegram.ui.Cells.l6 D;
    public final org.telegram.ui.ActionBar.p2 E;
    public final boolean F;
    public final org.telegram.ui.ActionBar.g6 G;
    public final ao H;

    public wn(ao aoVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.H = aoVar;
        this.E = p2Var;
        this.F = z4;
        this.G = g6Var;
        this.D = new org.telegram.ui.Cells.l6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        ao aoVar = this.H;
        if (aoVar.f25304b && this.f30014e == null) {
            org.telegram.ui.Cells.l6 l6Var = this.D;
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            l6Var.f17225a = true;
            l6Var.v = true;
            l6Var.J = this.G;
            Integer num = aoVar.f25306c;
            if (num != null) {
                l6Var.f17247z = num.intValue();
            }
            org.telegram.ui.xn xnVar = aoVar.D;
            if (xnVar != null) {
                j10 = xnVar.a();
            } else {
                org.telegram.ui.ActionBar.p2 p2Var = this.E;
                if (p2Var instanceof sf1) {
                    j10 = -((sf1) p2Var).f41188a;
                } else {
                    j10 = 0;
                }
            }
            oh.m7.h(j10, canvas, this.f30011a, l6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.F && getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.H.f25304b && this.D.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
