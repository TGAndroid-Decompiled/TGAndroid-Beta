package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.eg1;
public final class qo extends y9 {
    public final org.telegram.ui.Cells.m6 G;
    public final org.telegram.ui.ActionBar.m2 H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.d6 J;
    public final uo K;

    public qo(uo uoVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.K = uoVar;
        this.H = m2Var;
        this.I = z10;
        this.J = d6Var;
        this.G = new org.telegram.ui.Cells.m6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        uo uoVar = this.K;
        if (uoVar.f31509b && this.f33133e == null) {
            org.telegram.ui.Cells.m6 m6Var = this.G;
            m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            m6Var.f838a = true;
            m6Var.v = true;
            m6Var.J = this.J;
            Integer num = uoVar.f31511c;
            if (num != null) {
                m6Var.f860z = num.intValue();
            }
            org.telegram.ui.zn znVar = uoVar.G;
            if (znVar != null) {
                j3 = znVar.a();
            } else {
                org.telegram.ui.ActionBar.m2 m2Var = this.H;
                if (m2Var instanceof eg1) {
                    j3 = -((eg1) m2Var).f37311a;
                } else {
                    j3 = 0;
                }
            }
            ai.ja.h(j3, canvas, this.f33130a, m6Var);
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
        if (this.K.f31509b && this.G.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
