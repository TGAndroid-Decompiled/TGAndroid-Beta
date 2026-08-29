package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.NotificationCenter;
public final class hj0 extends TextView {
    public final jt f38944a;

    public hj0(Context context) {
        super(context);
        this.f38944a = new jt(1, this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this.f38944a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this.f38944a, NotificationCenter.emojiLoaded);
    }
}
