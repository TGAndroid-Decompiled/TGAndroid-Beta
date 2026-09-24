package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class pt implements View.OnAttachStateChangeListener {
    public ot f36663a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f36663a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f36663a, NotificationCenter.emojiLoaded);
    }
}
