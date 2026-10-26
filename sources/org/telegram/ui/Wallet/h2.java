package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gb1;
public final class h2 extends FrameLayout implements g2 {
    public final FrameLayout f36627a;

    public h2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36627a = frameLayout;
        addView(frameLayout, gb1.i(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f36627a;
    }
}
