package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.mf1;
public final class xn extends p9 {
    public final org.telegram.ui.Cells.l6 D;
    public final org.telegram.ui.ActionBar.p2 E;
    public final boolean F;
    public final org.telegram.ui.ActionBar.g6 G;
    public final bo H;

    public xn(bo boVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.H = boVar;
        this.E = p2Var;
        this.F = z4;
        this.G = g6Var;
        this.D = new org.telegram.ui.Cells.l6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        bo boVar = this.H;
        if (boVar.f25663b && this.f30001e == null) {
            org.telegram.ui.Cells.l6 l6Var = this.D;
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            l6Var.f17223a = true;
            l6Var.v = true;
            l6Var.J = this.G;
            Integer num = boVar.f25665c;
            if (num != null) {
                l6Var.f17245z = num.intValue();
            }
            org.telegram.ui.xn xnVar = boVar.D;
            if (xnVar != null) {
                j10 = xnVar.a();
            } else {
                org.telegram.ui.ActionBar.p2 p2Var = this.E;
                if (p2Var instanceof mf1) {
                    j10 = -((mf1) p2Var).f39102a;
                } else {
                    j10 = 0;
                }
            }
            oh.m7.h(j10, canvas, this.f29998a, l6Var);
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
        if (this.H.f25663b && this.D.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
