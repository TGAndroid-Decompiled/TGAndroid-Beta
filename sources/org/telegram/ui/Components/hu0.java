package org.telegram.ui.Components;

import android.content.Context;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class hu0 extends LinearLayout {
    public final TextView f27002a;
    public final ImageView f27003b;
    public boolean f27004c;

    public hu0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f27002a = textView;
        ImageView imageView = new ImageView(context);
        this.f27003b = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, w7.z5.n(-2, -2));
        org.telegram.ui.Cells.c1.q(org.telegram.ui.ActionBar.h6.f21399z6, d6Var, textView, 17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        addView(textView, w7.z5.t(-2, -2, 17, 0, 24, 0, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        this.f27004c = true;
        if (AndroidUtilities.isTablet()) {
            this.f27002a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        } else if (rotation != 3 && rotation != 1) {
            this.f27002a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        } else {
            this.f27002a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        }
        this.f27004c = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27004c) {
            return;
        }
        super.requestLayout();
    }
}
