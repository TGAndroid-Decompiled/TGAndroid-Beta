package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
public final class y2 extends FrameLayout implements x2 {
    public final FrameLayout f35413a;

    public y2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35413a = frameLayout;
        addView(frameLayout, w7.b6.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f35413a;
    }
}
