package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.kf1;
public final class vn extends p9 {
    public final org.telegram.ui.Cells.l6 D;
    public final org.telegram.ui.ActionBar.p2 E;
    public final boolean F;
    public final org.telegram.ui.ActionBar.f6 G;
    public final zn H;

    public vn(zn znVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = znVar;
        this.E = p2Var;
        this.F = z4;
        this.G = f6Var;
        this.D = new org.telegram.ui.Cells.l6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        zn znVar = this.H;
        if (znVar.f31386b && this.e == null) {
            org.telegram.ui.Cells.l6 l6Var = this.D;
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            l6Var.f15420a = true;
            l6Var.v = true;
            l6Var.J = this.G;
            Integer num = znVar.f31388c;
            if (num != null) {
                l6Var.f15441z = num.intValue();
            }
            org.telegram.ui.xn xnVar = znVar.D;
            if (xnVar != null) {
                j10 = xnVar.a();
            } else {
                org.telegram.ui.ActionBar.p2 p2Var = this.E;
                if (p2Var instanceof kf1) {
                    j10 = -((kf1) p2Var).f35668a;
                } else {
                    j10 = 0;
                }
            }
            nh.m7.h(j10, canvas, this.f27785a, l6Var);
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
        if (this.H.f31386b && this.D.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
