package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.hg1;
public final class so extends y9 {
    public final org.telegram.ui.Cells.m6 G;
    public final org.telegram.ui.ActionBar.m2 H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.c6 J;
    public final wo K;

    public so(wo woVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.K = woVar;
        this.H = m2Var;
        this.I = z10;
        this.J = c6Var;
        this.G = new org.telegram.ui.Cells.m6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        wo woVar = this.K;
        if (woVar.f32499b && this.f33004e == null) {
            org.telegram.ui.Cells.m6 m6Var = this.G;
            m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            m6Var.f836a = true;
            m6Var.v = true;
            m6Var.J = this.J;
            Integer num = woVar.f32501c;
            if (num != null) {
                m6Var.f858z = num.intValue();
            }
            org.telegram.ui.eo eoVar = woVar.G;
            if (eoVar != null) {
                j3 = eoVar.a();
            } else {
                org.telegram.ui.ActionBar.m2 m2Var = this.H;
                if (m2Var instanceof hg1) {
                    j3 = -((hg1) m2Var).f38376a;
                } else {
                    j3 = 0;
                }
            }
            ai.ja.h(j3, canvas, this.f33001a, m6Var);
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
        if (this.K.f32499b && this.G.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
