package org.telegram.ui.Components;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import java.util.WeakHashMap;
public abstract class kp0 extends View.AccessibilityDelegate {
    public static final String f30000c = "android.widget.SeekBar";
    public final HashMap f30001a = new HashMap(4);
    public final bi.i6 f30002b = new bi.i6(this, 11);

    public abstract boolean a();

    public abstract boolean b();

    public abstract void c(boolean z10);

    public CharSequence d() {
        return null;
    }

    public void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setClassName(f30000c);
        CharSequence d = d();
        if (!TextUtils.isEmpty(d)) {
            accessibilityNodeInfo.setText(d);
        }
        if (a()) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        }
        if (b()) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        }
    }

    public final void f(AccessibilityNodeInfo accessibilityNodeInfo) {
        e(null, accessibilityNodeInfo);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean z10 = false;
        if (i10 != 4096 && i10 != 8192) {
            return false;
        }
        if (i10 == 8192) {
            z10 = true;
        }
        c(z10);
        if (view != null) {
            WeakHashMap weakHashMap = r0.i0.f47143a;
            if (view.isAttachedToWindow()) {
                HashMap hashMap = this.f30001a;
                Runnable runnable = (Runnable) hashMap.get(view);
                if (runnable == null) {
                    runnable = new u90(12, this, view);
                    hashMap.put(view, runnable);
                    view.addOnAttachStateChangeListener(this.f30002b);
                } else {
                    view.removeCallbacks(runnable);
                }
                view.postDelayed(runnable, 400L);
            }
        }
        return true;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        e(view, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (super.performAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        return g(view, i10, bundle);
    }
}
