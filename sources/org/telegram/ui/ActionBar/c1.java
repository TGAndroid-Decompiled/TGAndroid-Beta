package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
public final class c1 extends d1 {
    public final b1 f22759a0;
    public String f22760b0;

    public c1(Context context, b6 b6Var) {
        super(context, b6Var);
        this.f22760b0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        b1 b1Var = new b1(this);
        this.f22759a0 = b1Var;
        setAccessibilityDelegate(b1Var);
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
        this.f22759a0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        if (!super.performAccessibilityAction(i9, bundle) && !this.f22759a0.g(this, i9, bundle)) {
            return false;
        }
        return true;
    }

    public void setLabel(String str) {
        this.f22760b0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i9 = 0; i9 < fArr.length; i9++) {
            fArr[i9] = (fArr[i9] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
