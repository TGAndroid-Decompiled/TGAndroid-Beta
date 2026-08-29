package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ze1;
public final class tn extends t9 {
    public final org.telegram.ui.Cells.j6 C;
    public final org.telegram.ui.ActionBar.o2 D;
    public final boolean E;
    public final org.telegram.ui.ActionBar.c6 F;
    public final xn G;

    public tn(xn xnVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.G = xnVar;
        this.D = o2Var;
        this.E = z10;
        this.F = c6Var;
        this.C = new org.telegram.ui.Cells.j6(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        xn xnVar = this.G;
        if (xnVar.f34785b && this.f32906e == null) {
            org.telegram.ui.Cells.j6 j6Var = this.C;
            j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            j6Var.f15665a = true;
            j6Var.v = true;
            j6Var.J = this.F;
            Integer num = xnVar.f34787c;
            if (num != null) {
                j6Var.f15687z = num.intValue();
            }
            org.telegram.ui.tn tnVar = xnVar.C;
            if (tnVar != null) {
                j10 = tnVar.a();
            } else {
                org.telegram.ui.ActionBar.o2 o2Var = this.D;
                if (o2Var instanceof ze1) {
                    j10 = -((ze1) o2Var).f45155a;
                } else {
                    j10 = 0;
                }
            }
            lh.l7.h(j10, canvas, this.f32903a, j6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.E && getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.G.f34785b && this.C.a(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
