package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class mi0 extends FrameLayout {
    public final org.telegram.ui.Components.ch0 f47975a;

    public mi0(Context context) {
        super(context);
        ?? imageView = new ImageView(context);
        this.f47975a = imageView;
        imageView.setOnClickListener(new j40(this, 15));
        int L = org.telegram.messenger.g0.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView((View) imageView, layoutParams);
        setPadding(0, org.telegram.messenger.g0.L(32.0f), 0, 0);
        setLayoutParams(new v4.o0(-1, -2));
    }
}
