package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import c8.m9;
public final class u0 extends v0 {
    public final t0 f30041h0;
    public String f30042i0;

    public u0(Context context, h6 h6Var) {
        super(context, h6Var);
        this.f30042i0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        t0 t0Var = new t0(this, 0);
        this.f30041h0 = t0Var;
        setAccessibilityDelegate(t0Var);
    }

    @Override
    public final int c(float f10) {
        int i7 = m6.jk;
        h6 h6Var = this.f30092y;
        return i0.a.f(m9.a((((f10 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), m6.w0(i7, h6Var), m6.w0(m6.kk, h6Var));
    }

    public final void e(boolean z10, float f10) {
        d(z10, (f10 - 0.2f) / 2.8f);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f30041h0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f30041h0.g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    public void setLabel(String str) {
        this.f30042i0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i7 = 0; i7 < fArr.length; i7++) {
            fArr[i7] = (fArr[i7] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
