package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.NotificationCenter;
public final class kj0 extends TextView {
    public final gt f40953a;

    public kj0(Context context) {
        super(context);
        this.f40953a = new gt(1, this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this.f40953a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this.f40953a, NotificationCenter.emojiLoaded);
    }
}
