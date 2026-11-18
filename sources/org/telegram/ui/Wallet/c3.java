package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
public final class c3 extends FrameLayout implements b3 {
    public final FrameLayout f43992a;

    public c3(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43992a = frameLayout;
        addView(frameLayout, c8.ma.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f43992a;
    }
}
