package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class gt implements View.OnAttachStateChangeListener {
    public ft f37412a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f37412a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f37412a, NotificationCenter.emojiLoaded);
    }
}
