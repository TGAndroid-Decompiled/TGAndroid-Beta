package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
public final class a1 extends b1 {
    public final z0 f20684g0;
    public String f20685h0;

    public a1(Context context, g6 g6Var) {
        super(context, g6Var);
        this.f20685h0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        z0 z0Var = new z0(this);
        this.f20684g0 = z0Var;
        setAccessibilityDelegate(z0Var);
    }

    @Override
    public final int c(float f7) {
        int i10 = k6.sj;
        g6 g6Var = this.f20723x;
        return i0.a.f(w7.r.a((((f7 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), k6.w0(i10, g6Var), k6.w0(k6.tj, g6Var));
    }

    public final void e(float f7, boolean z10) {
        d((f7 - 0.2f) / 2.8f, z10);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f20684g0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f20684g0.g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setLabel(String str) {
        this.f20685h0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = (fArr[i10] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
