package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
public final class v2 extends FrameLayout implements u2 {
    public final FrameLayout f44585a;

    public v2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44585a = frameLayout;
        addView(frameLayout, c8.ja.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f44585a;
    }
}
