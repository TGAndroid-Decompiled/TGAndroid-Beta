package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
public final class c1 extends d1 {
    public final b1 f21207b0;
    public String f21208c0;

    public c1(Context context, g6 g6Var) {
        super(context, g6Var);
        this.f21208c0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        b1 b1Var = new b1(this);
        this.f21207b0 = b1Var;
        setAccessibilityDelegate(b1Var);
    }

    public final void d(float f10, boolean z4) {
        c((f10 - 0.2f) / 2.8f, z4);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f21207b0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!super.performAccessibilityAction(i10, bundle) && !this.f21207b0.g(this, i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setLabel(String str) {
        this.f21208c0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = (fArr[i10] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
