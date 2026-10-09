package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
public final class g2 extends FrameLayout implements f2 {
    public final FrameLayout f34957a;

    public g2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34957a = frameLayout;
        addView(frameLayout, w7.x5.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f34957a;
    }
}
