package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class ol0 extends FrameLayout {
    public final org.telegram.ui.Components.nj0 f36223a;

    public ol0(Context context) {
        super(context);
        ?? imageView = new ImageView(context);
        this.f36223a = imageView;
        imageView.setOnClickListener(new i60(this, 14));
        int dp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, dp);
        layoutParams.gravity = 1;
        addView((View) imageView, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new s4.p0(-1, -2));
    }
}
