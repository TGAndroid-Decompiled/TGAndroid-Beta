package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
public final class g2 extends FrameLayout implements f2 {
    public final FrameLayout f33199a;

    public g2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33199a = frameLayout;
        addView(frameLayout, w7.a6.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f33199a;
    }
}
