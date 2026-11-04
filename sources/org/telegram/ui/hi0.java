package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class hi0 extends FrameLayout {
    public final org.telegram.ui.Components.fh0 f45927a;

    public hi0(Context context) {
        super(context);
        ?? imageView = new ImageView(context);
        this.f45927a = imageView;
        imageView.setOnClickListener(new b40(this, 15));
        int L = org.telegram.messenger.g0.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView((View) imageView, layoutParams);
        setPadding(0, org.telegram.messenger.g0.L(32.0f), 0, 0);
        setLayoutParams(new u4.p0(-1, -2));
    }
}
