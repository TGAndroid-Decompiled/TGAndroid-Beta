package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.af1;
public final class lo extends y9 {
    public final org.telegram.ui.Cells.q6 G;
    public final org.telegram.ui.ActionBar.r2 H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.u6 J;
    public final po K;

    public lo(po poVar, Context context, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.K = poVar;
        this.H = r2Var;
        this.I = z10;
        this.J = u6Var;
        this.G = new org.telegram.ui.Cells.q6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        po poVar = this.K;
        if (poVar.f31639b && this.e == null) {
            org.telegram.ui.Cells.q6 q6Var = this.G;
            q6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            q6Var.f9312a = true;
            q6Var.v = true;
            q6Var.J = this.J;
            Integer num = poVar.f31641c;
            if (num != null) {
                q6Var.f9333z = num.intValue();
            }
            org.telegram.ui.un unVar = poVar.G;
            if (unVar != null) {
                j10 = unVar.a();
            } else {
                org.telegram.ui.ActionBar.r2 r2Var = this.H;
                if (r2Var instanceof af1) {
                    j10 = -((af1) r2Var).f37731a;
                } else {
                    j10 = 0;
                }
            }
            di.a8.h(j10, canvas, this.f34981a, q6Var);
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
        if (this.K.f31639b && this.G.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
