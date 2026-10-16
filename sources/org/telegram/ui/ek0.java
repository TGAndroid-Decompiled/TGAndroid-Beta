package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.NotificationCenter;
public final class ek0 extends TextView {
    public final yt f35320a;

    public ek0(Context context) {
        super(context);
        this.f35320a = new yt(1, this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this.f35320a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this.f35320a, NotificationCenter.emojiLoaded);
    }
}
