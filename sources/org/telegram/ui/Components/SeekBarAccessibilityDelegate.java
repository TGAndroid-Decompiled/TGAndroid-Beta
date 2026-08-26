package org.telegram.ui.Components;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.ui.AvatarSpan;

public abstract class SeekBarAccessibilityDelegate extends View.AccessibilityDelegate {
    public final HashMap accessibilityEventRunnables = new HashMap(4);
    public final AvatarSpan.AnonymousClass1 onAttachStateChangeListener = new AvatarSpan.AnonymousClass1(this, 9);

    public abstract boolean canScrollBackward();

    public abstract boolean canScrollForward();

    public abstract void doScroll(boolean z);

    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        onInitializeAccessibilityNodeInfoInternal(view, accessibilityNodeInfo);
    }

    public void onInitializeAccessibilityNodeInfoInternal(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        CharSequence contentDescription = getContentDescription();
        if (!TextUtils.isEmpty(contentDescription)) {
            accessibilityNodeInfo.setText(contentDescription);
        }
        if (canScrollBackward()) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        }
        if (canScrollForward()) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        }
    }

    @Override
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        return performAccessibilityActionInternal(view, i, bundle);
    }

    public boolean performAccessibilityActionInternal(View view, int i, Bundle bundle) {
        if (i != 4096 && i != 8192) {
            return false;
        }
        doScroll(i == 8192);
        if (view != null) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            if (view.isAttachedToWindow()) {
                HashMap map = this.accessibilityEventRunnables;
                Runnable shareAlert$$ExternalSyntheticLambda29 = (Runnable) map.get(view);
                if (shareAlert$$ExternalSyntheticLambda29 == null) {
                    shareAlert$$ExternalSyntheticLambda29 = new ShareAlert$$ExternalSyntheticLambda29(14, this, view);
                    map.put(view, shareAlert$$ExternalSyntheticLambda29);
                    view.addOnAttachStateChangeListener(this.onAttachStateChangeListener);
                } else {
                    view.removeCallbacks(shareAlert$$ExternalSyntheticLambda29);
                }
                view.postDelayed(shareAlert$$ExternalSyntheticLambda29, 400L);
            }
        }
        return true;
    }

    public final void onInitializeAccessibilityNodeInfoInternal(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfoInternal(null, accessibilityNodeInfo);
    }
}
