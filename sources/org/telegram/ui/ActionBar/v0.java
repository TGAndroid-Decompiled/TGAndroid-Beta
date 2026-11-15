package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import c8.i9;
public final class v0 extends w0 {
    public final u0 f29751h0;
    public String f29752i0;

    public v0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.f29752i0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        u0 u0Var = new u0(this, 0);
        this.f29751h0 = u0Var;
        setAccessibilityDelegate(u0Var);
    }

    @Override
    public final int c(float f10) {
        int i7 = j6.jk;
        e6 e6Var = this.f29792y;
        return i0.a.f(i9.a((((f10 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), j6.w0(i7, e6Var), j6.w0(j6.kk, e6Var));
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
        this.f29751h0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!super.performAccessibilityAction(i7, bundle) && !this.f29751h0.g(this, i7, bundle)) {
            return false;
        }
        return true;
    }

    public void setLabel(String str) {
        this.f29752i0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i7 = 0; i7 < fArr.length; i7++) {
            fArr[i7] = (fArr[i7] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
