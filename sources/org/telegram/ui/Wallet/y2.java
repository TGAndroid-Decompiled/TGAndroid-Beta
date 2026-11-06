package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
public final class y2 extends FrameLayout implements x2 {
    public final FrameLayout f43360a;

    public y2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43360a = frameLayout;
        addView(frameLayout, c8.ha.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f43360a;
    }
}
