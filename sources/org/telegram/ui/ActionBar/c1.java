package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
public final class c1 extends d1 {
    public final b1 f17569e0;
    public String f17570f0;

    public c1(Context context, f6 f6Var) {
        super(context, f6Var);
        this.f17570f0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        b1 b1Var = new b1(this);
        this.f17569e0 = b1Var;
        setAccessibilityDelegate(b1Var);
    }

    public final void d(float f7, boolean z10) {
        c((f7 - 0.2f) / 2.8f, z10);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f17569e0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f17569e0.g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setLabel(String str) {
        this.f17570f0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = (fArr[i10] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
