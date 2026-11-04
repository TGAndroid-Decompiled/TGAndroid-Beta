package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
import b8.mf;
public final class w2 extends FrameLayout implements v2 {
    public final FrameLayout f43312a;

    public w2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43312a = frameLayout;
        addView(frameLayout, mf.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.f43312a;
    }
}
