package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class jt implements View.OnAttachStateChangeListener {
    public ht f38326a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f38326a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f38326a, NotificationCenter.emojiLoaded);
    }
}
