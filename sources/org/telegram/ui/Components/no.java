package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.lg1;
public final class no extends z9 {
    public final org.telegram.ui.Cells.m6 G;
    public final org.telegram.ui.ActionBar.m2 H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.c6 J;
    public final ro K;

    public no(ro roVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.K = roVar;
        this.H = m2Var;
        this.I = z10;
        this.J = c6Var;
        this.G = new org.telegram.ui.Cells.m6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        ro roVar = this.K;
        if (roVar.f28887b && this.e == null) {
            org.telegram.ui.Cells.m6 m6Var = this.G;
            m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            m6Var.f3324a = true;
            m6Var.v = true;
            m6Var.J = this.J;
            Integer num = roVar.f28889c;
            if (num != null) {
                m6Var.f3345z = num.intValue();
            }
            org.telegram.ui.fo foVar = roVar.G;
            if (foVar != null) {
                j10 = foVar.a();
            } else {
                org.telegram.ui.ActionBar.m2 m2Var = this.H;
                if (m2Var instanceof lg1) {
                    j10 = -((lg1) m2Var).f37957a;
                } else {
                    j10 = 0;
                }
            }
            bi.s9.h(j10, canvas, this.f31813a, m6Var);
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
        if (this.K.f28887b && this.G.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
