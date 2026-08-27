package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

public final class b1 extends c1 {

    public final a1 f22740a0;

    public String f22741b0;

    public b1(Context context, c6 c6Var) {
        super(context, c6Var);
        this.f22741b0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        a1 a1Var = new a1(this);
        this.f22740a0 = a1Var;
        setAccessibilityDelegate(a1Var);
    }

    public final void d(float f10, boolean z10) {
        c((f10 - 0.2f) / 2.8f, z10);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f22740a0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.f22740a0.g(this, i10, bundle);
    }

    public void setLabel(String str) {
        this.f22741b0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = (fArr[i10] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
