package org.telegram.ui.Components;

import android.content.Context;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ku0 extends LinearLayout {
    public final TextView f26484a;
    public final ImageView f26485b;
    public boolean f26486c;

    public ku0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f26484a = textView;
        ImageView imageView = new ImageView(context);
        this.f26485b = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, w7.z5.n(-2, -2));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var));
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        addView(textView, w7.z5.t(-2, -2, 17, 0, 24, 0, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        this.f26486c = true;
        if (AndroidUtilities.isTablet()) {
            this.f26484a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        } else if (rotation != 3 && rotation != 1) {
            this.f26484a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        } else {
            this.f26484a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        }
        this.f26486c = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26486c) {
            return;
        }
        super.requestLayout();
    }
}
