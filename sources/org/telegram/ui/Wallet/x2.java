package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
public final class x2 extends FrameLayout implements w2 {
    public final FrameLayout f35379a;

    public x2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35379a = frameLayout;
        addView(frameLayout, w7.b6.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f35379a;
    }
}
