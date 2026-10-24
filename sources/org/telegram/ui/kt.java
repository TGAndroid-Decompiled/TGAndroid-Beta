package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class kt implements View.OnAttachStateChangeListener {
    public jt f39031a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f39031a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f39031a, NotificationCenter.emojiLoaded);
    }
}
