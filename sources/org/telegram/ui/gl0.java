package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class gl0 extends FrameLayout {
    public final org.telegram.ui.Components.jj0 f34640a;

    public gl0(Context context) {
        super(context);
        ?? imageView = new ImageView(context);
        this.f34640a = imageView;
        imageView.setOnClickListener(new e60(this, 14));
        int dp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, dp);
        layoutParams.gravity = 1;
        addView((View) imageView, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new f2.w0(-1, -2));
    }
}
