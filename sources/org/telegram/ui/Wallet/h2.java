package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
public final class h2 extends FrameLayout implements g2 {
    public final FrameLayout f35046a;

    public h2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35046a = frameLayout;
        addView(frameLayout, w7.x5.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f35046a;
    }
}
