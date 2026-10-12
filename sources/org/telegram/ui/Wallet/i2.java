package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
public final class i2 extends FrameLayout implements h2 {
    public final FrameLayout f34887a;

    public i2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34887a = frameLayout;
        addView(frameLayout, w7.w5.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f34887a;
    }
}
