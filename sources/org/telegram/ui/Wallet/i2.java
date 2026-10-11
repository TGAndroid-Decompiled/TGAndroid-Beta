package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
public final class i2 extends FrameLayout implements h2 {
    public final FrameLayout f35110a;

    public i2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35110a = frameLayout;
        addView(frameLayout, w7.x5.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f35110a;
    }
}
