package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

public final class mt implements View.OnAttachStateChangeListener {

    public lt f40592a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f40592a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f40592a, NotificationCenter.emojiLoaded);
    }
}
