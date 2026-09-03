package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.sf1;
public final class un extends p9 {
    public final org.telegram.ui.Cells.k6 D;
    public final org.telegram.ui.ActionBar.p2 E;
    public final boolean F;
    public final org.telegram.ui.ActionBar.f6 G;
    public final yn H;

    public un(yn ynVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = ynVar;
        this.E = p2Var;
        this.F = z4;
        this.G = f6Var;
        this.D = new org.telegram.ui.Cells.k6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        yn ynVar = this.H;
        if (ynVar.f31057b && this.e == null) {
            org.telegram.ui.Cells.k6 k6Var = this.D;
            k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            k6Var.f15400a = true;
            k6Var.v = true;
            k6Var.J = this.G;
            Integer num = ynVar.f31059c;
            if (num != null) {
                k6Var.f15421z = num.intValue();
            }
            org.telegram.ui.zn znVar = ynVar.D;
            if (znVar != null) {
                j10 = znVar.a();
            } else {
                org.telegram.ui.ActionBar.p2 p2Var = this.E;
                if (p2Var instanceof sf1) {
                    j10 = -((sf1) p2Var).f38175a;
                } else {
                    j10 = 0;
                }
            }
            nh.m7.h(j10, canvas, this.f27801a, k6Var);
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
        if (this.H.f31057b && this.D.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
