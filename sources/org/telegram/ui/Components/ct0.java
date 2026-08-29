package org.telegram.ui.Components;

import android.content.Context;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ct0 extends LinearLayout {
    public final TextView f27568a;
    public final ImageView f27569b;
    public boolean f27570c;

    public ct0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f27568a = textView;
        ImageView imageView = new ImageView(context);
        this.f27569b = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, i7.f6.n(-2, -2));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        addView(textView, i7.f6.t(-2, -2, 17, 0, 24, 0, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        this.f27570c = true;
        if (AndroidUtilities.isTablet()) {
            this.f27568a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        } else if (rotation != 3 && rotation != 1) {
            this.f27568a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        } else {
            this.f27568a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        }
        this.f27570c = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27570c) {
            return;
        }
        super.requestLayout();
    }
}
