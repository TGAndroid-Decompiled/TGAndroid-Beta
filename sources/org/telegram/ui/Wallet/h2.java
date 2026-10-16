package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
public final class h2 extends FrameLayout implements g2 {
    public final FrameLayout f32972a;

    public h2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32972a = frameLayout;
        addView(frameLayout, w7.z5.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f32972a;
    }
}
