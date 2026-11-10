package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import c8.j9;
public final class v0 extends w0 {
    public final u0 f28611g0;
    public String f28612h0;

    public v0(Context context, h6 h6Var) {
        super(context, h6Var);
        this.f28612h0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        u0 u0Var = new u0(this, 0);
        this.f28611g0 = u0Var;
        setAccessibilityDelegate(u0Var);
    }

    @Override
    public final int c(float f10) {
        int i7 = m6.gk;
        h6 h6Var = this.f28667y;
        return i0.a.f(j9.a((((f10 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), m6.w0(i7, h6Var), m6.w0(m6.hk, h6Var));
    }

    public final void e(boolean z9, float f10) {
        d(z9, (f10 - 0.2f) / 2.8f);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f28611g0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f28611g0.g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    public void setLabel(String str) {
        this.f28612h0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i7 = 0; i7 < fArr.length; i7++) {
            fArr[i7] = (fArr[i7] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
