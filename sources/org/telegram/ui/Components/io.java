package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.xe1;
public final class io extends u9 {
    public final org.telegram.ui.Cells.m6 G;
    public final org.telegram.ui.ActionBar.o2 H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.g6 J;
    public final mo K;

    public io(mo moVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.K = moVar;
        this.H = o2Var;
        this.I = z10;
        this.J = g6Var;
        this.G = new org.telegram.ui.Cells.m6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        mo moVar = this.K;
        if (moVar.f28632b && this.e == null) {
            org.telegram.ui.Cells.m6 m6Var = this.G;
            m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            m6Var.f6119a = true;
            m6Var.v = true;
            m6Var.J = this.J;
            Integer num = moVar.f28634c;
            if (num != null) {
                m6Var.f6140z = num.intValue();
            }
            org.telegram.ui.sn snVar = moVar.G;
            if (snVar != null) {
                j10 = snVar.a();
            } else {
                org.telegram.ui.ActionBar.o2 o2Var = this.H;
                if (o2Var instanceof xe1) {
                    j10 = -((xe1) o2Var).f43545a;
                } else {
                    j10 = 0;
                }
            }
            ci.c8.h(j10, canvas, this.f31064a, m6Var);
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
        if (this.K.f28632b && this.G.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
