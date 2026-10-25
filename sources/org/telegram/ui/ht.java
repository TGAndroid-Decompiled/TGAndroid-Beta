package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ht implements View.OnAttachStateChangeListener {
    public gt f40063a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f40063a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f40063a, NotificationCenter.emojiLoaded);
    }
}
