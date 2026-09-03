package org.telegram.ui.Components;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import java.util.WeakHashMap;
public abstract class ho0 extends View.AccessibilityDelegate {
    public static final String f27585c = "android.widget.SeekBar";
    public final HashMap f27586a = new HashMap(4);
    public final ff.b f27587b = new ff.b(this, 13);

    public abstract boolean a();

    public abstract boolean b();

    public abstract void c(boolean z4);

    public CharSequence d() {
        return null;
    }

    public void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setClassName(f27585c);
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
        boolean z4 = false;
        if (i10 != 4096 && i10 != 8192) {
            return false;
        }
        if (i10 == 8192) {
            z4 = true;
        }
        c(z4);
        if (view != null) {
            WeakHashMap weakHashMap = r0.j0.f46469a;
            if (view.isAttachedToWindow()) {
                HashMap hashMap = this.f27586a;
                Runnable runnable = (Runnable) hashMap.get(view);
                if (runnable == null) {
                    runnable = new b90(12, this, view);
                    hashMap.put(view, runnable);
                    view.addOnAttachStateChangeListener(this.f27587b);
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
