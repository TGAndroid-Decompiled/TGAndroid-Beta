package org.telegram.ui.Components;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import java.util.WeakHashMap;
public abstract class lm0 extends View.AccessibilityDelegate {
    public static final String f35767c = "android.widget.SeekBar";
    public final HashMap f35768a = new HashMap(4);
    public final bi.m6 f35769b = new bi.m6(this, 11);

    public abstract boolean a();

    public abstract boolean b();

    public abstract void c(boolean z9);

    public CharSequence d() {
        return null;
    }

    public void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setClassName(f35767c);
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
            WeakHashMap weakHashMap = r0.i0.f54203a;
            if (view.isAttachedToWindow()) {
                HashMap hashMap = this.f35768a;
                Runnable runnable = (Runnable) hashMap.get(view);
                if (runnable == null) {
                    runnable = new w80(9, this, view);
                    hashMap.put(view, runnable);
                    view.addOnAttachStateChangeListener(this.f35769b);
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
