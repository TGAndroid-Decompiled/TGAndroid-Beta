package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
public final class x0 extends y0 {
    public final w0 f21467g0;
    public String f21468h0;

    public x0(Context context, p6 p6Var) {
        super(context, p6Var);
        this.f21468h0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        w0 w0Var = new w0(this, 0);
        this.f21467g0 = w0Var;
        setAccessibilityDelegate(w0Var);
    }

    @Override
    public final int c(float f7) {
        int i10 = t6.gk;
        p6 p6Var = this.f21553y;
        return i0.b.f(w7.u.a((((f7 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), t6.w0(i10, p6Var), t6.w0(t6.hk, p6Var));
    }

    public final void e(boolean z10, float f7) {
        d(z10, (f7 - 0.2f) / 2.8f);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f21467g0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f21467g0.g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setLabel(String str) {
        this.f21468h0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = (fArr[i10] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
