package org.telegram.ui.Components;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import java.util.WeakHashMap;
public abstract class km0 extends View.AccessibilityDelegate {
    public static final String f35369c = "android.widget.SeekBar";
    public final HashMap f35370a = new HashMap(4);
    public final bi.m6 f35371b = new bi.m6(this, 11);

    public abstract boolean a();

    public abstract boolean b();

    public abstract void c(boolean z9);

    public CharSequence d() {
        return null;
    }

    public void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setClassName(f35369c);
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

    public boolean g(View view, int i7, Bundle bundle) {
        boolean z9 = false;
        if (i7 != 4096 && i7 != 8192) {
            return false;
        }
        if (i7 == 8192) {
            z9 = true;
        }
        c(z9);
        if (view != null) {
            WeakHashMap weakHashMap = r0.i0.f54202a;
            if (view.isAttachedToWindow()) {
                HashMap hashMap = this.f35370a;
                Runnable runnable = (Runnable) hashMap.get(view);
                if (runnable == null) {
                    runnable = new r80(10, this, view);
                    hashMap.put(view, runnable);
                    view.addOnAttachStateChangeListener(this.f35371b);
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
    public final boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
        if (super.performAccessibilityAction(view, i7, bundle)) {
            return true;
        }
        return g(view, i7, bundle);
    }
}
