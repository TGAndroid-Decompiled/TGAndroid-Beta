package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class bl0 extends FrameLayout {
    public final org.telegram.ui.Components.pi0 f36902a;

    public bl0(Context context) {
        super(context);
        ?? imageView = new ImageView(context);
        this.f36902a = imageView;
        imageView.setOnClickListener(new q50(this, 14));
        int dp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, dp);
        layoutParams.gravity = 1;
        addView((View) imageView, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new f2.a1(-1, -2));
    }
}
