package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import c8.m9;
public final class u0 extends v0 {
    public final t0 f30134h0;
    public String f30135i0;

    public u0(Context context, i6 i6Var) {
        super(context, i6Var);
        this.f30135i0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        t0 t0Var = new t0(this, 0);
        this.f30134h0 = t0Var;
        setAccessibilityDelegate(t0Var);
    }

    @Override
    public final int c(float f10) {
        int i7 = n6.jk;
        i6 i6Var = this.f30186y;
        return i0.a.f(m9.a((((f10 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), n6.w0(i7, i6Var), n6.w0(n6.kk, i6Var));
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
        this.f30134h0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f30134h0.g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    public void setLabel(String str) {
        this.f30135i0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i7 = 0; i7 < fArr.length; i7++) {
            fArr[i7] = (fArr[i7] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
