package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class kt implements View.OnAttachStateChangeListener {
    public jt f40913a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addWeakObserver(this.f40913a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f40913a, NotificationCenter.emojiLoaded);
    }
}
