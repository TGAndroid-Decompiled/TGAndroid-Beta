package org.telegram.ui.ActionBar;

import a8.ee;
import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
public final class c1 extends d1 {
    public final b1 f22495g0;
    public String f22496h0;

    public c1(Context context, u6 u6Var) {
        super(context, u6Var);
        this.f22496h0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        b1 b1Var = new b1(this);
        this.f22495g0 = b1Var;
        setAccessibilityDelegate(b1Var);
    }

    @Override
    public final int c(float f7) {
        int i10 = y6.sj;
        u6 u6Var = this.f22537x;
        return i0.a.f(ee.a((((f7 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), y6.w0(i10, u6Var), y6.w0(y6.tj, u6Var));
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
        this.f22495g0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f22495g0.g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setLabel(String str) {
        this.f22496h0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = (fArr[i10] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
