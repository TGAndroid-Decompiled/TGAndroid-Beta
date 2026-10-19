package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class gt implements View.OnAttachStateChangeListener {
    public ft f37406a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f37406a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f37406a, NotificationCenter.emojiLoaded);
    }
}
