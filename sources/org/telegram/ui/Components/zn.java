package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.dg1;
public final class zn extends u9 {
    public final org.telegram.ui.Cells.l6 G;
    public final org.telegram.ui.ActionBar.n2 H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.e6 J;
    public final eo K;

    public zn(eo eoVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.K = eoVar;
        this.H = n2Var;
        this.I = z10;
        this.J = e6Var;
        this.G = new org.telegram.ui.Cells.l6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        eo eoVar = this.K;
        if (eoVar.f23701b && this.e == null) {
            org.telegram.ui.Cells.l6 l6Var = this.G;
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            l6Var.f645a = true;
            l6Var.v = true;
            l6Var.J = this.J;
            Integer num = eoVar.f23703c;
            if (num != null) {
                l6Var.f666z = num.intValue();
            }
            org.telegram.ui.bo boVar = eoVar.G;
            if (boVar != null) {
                j3 = boVar.a();
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = this.H;
                if (n2Var instanceof dg1) {
                    j3 = -((dg1) n2Var).f33012a;
                } else {
                    j3 = 0;
                }
            }
            ai.ia.h(j3, canvas, this.f28314a, l6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.I && getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K.f23701b && this.G.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
