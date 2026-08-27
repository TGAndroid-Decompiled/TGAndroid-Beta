package org.telegram.ui.Components;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import java.util.WeakHashMap;

public abstract class nn0 extends View.AccessibilityDelegate {

    public static final String f31000c = "android.widget.SeekBar";

    public final HashMap f31001a = new HashMap(4);

    public final bf.b f31002b = new bf.b(this, 13);

    public abstract boolean a();

    public abstract boolean b();

    public abstract void c(boolean z10);

    public CharSequence d() {
        return null;
    }

    public void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setClassName(f31000c);
        CharSequence charSequenceD = d();
        if (!TextUtils.isEmpty(charSequenceD)) {
            accessibilityNodeInfo.setText(charSequenceD);
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
        if (i10 != 4096 && i10 != 8192) {
            return false;
        }
        c(i10 == 8192);
        if (view != null) {
            WeakHashMap weakHashMap = r0.j0.f46605a;
            if (view.isAttachedToWindow()) {
                HashMap map = this.f31001a;
                Runnable lg0Var = (Runnable) map.get(view);
                if (lg0Var == null) {
                    lg0Var = new lg0(8, this, view);
                    map.put(view, lg0Var);
                    view.addOnAttachStateChangeListener(this.f31002b);
                } else {
                    view.removeCallbacks(lg0Var);
                }
                view.postDelayed(lg0Var, 400L);
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
