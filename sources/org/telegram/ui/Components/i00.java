package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public abstract class i00 extends nn0 {
    public final boolean d;

    public i00(boolean z10) {
        this.d = z10;
    }

    @Override
    public final boolean a() {
        return k() > j();
    }

    @Override
    public final boolean b() {
        return k() < i();
    }

    @Override
    public final void c(boolean z10) {
        float fH = h();
        if (z10) {
            fH *= -1.0f;
        }
        l(Math.min(i(), Math.max(j(), k() + fH)));
    }

    @Override
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.e(view, accessibilityNodeInfo);
        if (this.d) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) s0.b.h.f47653a);
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, j(), i(), k()));
        }
    }

    @Override
    public final boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        if (i10 != ((AccessibilityNodeInfo.AccessibilityAction) s0.b.h.f47653a).getId()) {
            return false;
        }
        l(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
        return true;
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
