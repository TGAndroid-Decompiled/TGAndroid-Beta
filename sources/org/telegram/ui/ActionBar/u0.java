package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import b8.be;
public final class u0 extends v0 {
    public final t0 f28672h0;
    public String f28673i0;

    public u0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.f28673i0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        t0 t0Var = new t0(this, 0);
        this.f28672h0 = t0Var;
        setAccessibilityDelegate(t0Var);
    }

    @Override
    public final int c(float f10) {
        int i3 = k6.gk;
        e6 e6Var = this.f28729y;
        return i0.a.f(be.a((((f10 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), k6.w0(i3, e6Var), k6.w0(k6.hk, e6Var));
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
        this.f28672h0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        if (!super.performAccessibilityAction(i3, bundle) && !this.f28672h0.g(this, i3, bundle)) {
            return false;
        }
        return true;
    }

    public void setLabel(String str) {
        this.f28673i0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i3 = 0; i3 < fArr.length; i3++) {
            fArr[i3] = (fArr[i3] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
