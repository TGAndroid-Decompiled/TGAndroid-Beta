package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ig1;
public final class fo extends w9 {
    public final org.telegram.ui.Cells.n6 G;
    public final org.telegram.ui.ActionBar.p2 H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.f6 J;
    public final jo K;

    public fo(jo joVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.K = joVar;
        this.H = p2Var;
        this.I = z10;
        this.J = f6Var;
        this.G = new org.telegram.ui.Cells.n6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        jo joVar = this.K;
        if (joVar.f24455b && this.e == null) {
            org.telegram.ui.Cells.n6 n6Var = this.G;
            n6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            n6Var.f49048a = true;
            n6Var.v = true;
            n6Var.J = this.J;
            Integer num = joVar.f24457c;
            if (num != null) {
                n6Var.f49069z = num.intValue();
            }
            org.telegram.ui.eo eoVar = joVar.G;
            if (eoVar != null) {
                j3 = eoVar.a();
            } else {
                org.telegram.ui.ActionBar.p2 p2Var = this.H;
                if (p2Var instanceof ig1) {
                    j3 = -((ig1) p2Var).f33681a;
                } else {
                    j3 = 0;
                }
            }
            zh.a6.h(j3, canvas, this.f28728a, n6Var);
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
        if (this.K.f24455b && this.G.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
