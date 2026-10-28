package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.cf1;
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
        if (poVar.f31651b && this.e == null) {
            org.telegram.ui.Cells.q6 q6Var = this.G;
            q6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            q6Var.f9311a = true;
            q6Var.v = true;
            q6Var.J = this.J;
            Integer num = poVar.f31653c;
            if (num != null) {
                q6Var.f9332z = num.intValue();
            }
            org.telegram.ui.wn wnVar = poVar.G;
            if (wnVar != null) {
                j10 = wnVar.a();
            } else {
                org.telegram.ui.ActionBar.r2 r2Var = this.H;
                if (r2Var instanceof cf1) {
                    j10 = -((cf1) r2Var).f38288a;
                } else {
                    j10 = 0;
                }
            }
            di.a8.h(j10, canvas, this.f35004a, q6Var);
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
        if (this.K.f31651b && this.G.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
