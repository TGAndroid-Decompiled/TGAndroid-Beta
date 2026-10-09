package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.fg1;
public final class qo extends y9 {
    public final org.telegram.ui.Cells.m6 G;
    public final org.telegram.ui.ActionBar.n2 H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.e6 J;
    public final uo K;

    public qo(uo uoVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.K = uoVar;
        this.H = n2Var;
        this.I = z10;
        this.J = e6Var;
        this.G = new org.telegram.ui.Cells.m6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        uo uoVar = this.K;
        if (uoVar.f31556b && this.f33159e == null) {
            org.telegram.ui.Cells.m6 m6Var = this.G;
            m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            m6Var.f838a = true;
            m6Var.v = true;
            m6Var.J = this.J;
            Integer num = uoVar.f31558c;
            if (num != null) {
                m6Var.f860z = num.intValue();
            }
            org.telegram.ui.zn znVar = uoVar.G;
            if (znVar != null) {
                j3 = znVar.a();
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = this.H;
                if (n2Var instanceof fg1) {
                    j3 = -((fg1) n2Var).f37558a;
                } else {
                    j3 = 0;
                }
            }
            ai.ja.h(j3, canvas, this.f33156a, m6Var);
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
        if (this.K.f31556b && this.G.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
