package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public abstract class f00 extends mn0 {
    public final boolean d;

    public f00(boolean z10) {
        this.d = z10;
    }

    @Override
    public final boolean a() {
        if (k() > j()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        if (k() < i()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10) {
        float h = h();
        if (z10) {
            h *= -1.0f;
        }
        l(Math.min(i(), Math.max(j(), k() + h)));
    }

    @Override
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.e(view, accessibilityNodeInfo);
        if (this.d) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) s0.c.h.f47289a);
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, j(), i(), k()));
        }
    }

    @Override
    public final boolean g(View view, int i9, Bundle bundle) {
        if (super.g(view, i9, bundle)) {
            return true;
        }
        if (i9 == ((AccessibilityNodeInfo.AccessibilityAction) s0.c.h.f47289a).getId()) {
            l(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
            return true;
        }
        return false;
    }

    public float h() {
        return 0.05f;
    }

    public float i() {
        return 1.0f;
    }

    public float j() {
        return 0.0f;
    }

    public abstract float k();

    public abstract void l(float f10);
}
