package org.telegram.ui.Components;

import android.content.Context;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class yt0 extends LinearLayout {
    public final TextView f30776a;
    public final ImageView f30777b;
    public boolean f30778c;

    public yt0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f30776a = textView;
        ImageView imageView = new ImageView(context);
        this.f30777b = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, w7.y5.n(-2, -2));
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19461z6, e6Var));
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        addView(textView, w7.y5.t(-2, -2, 17, 0, 24, 0, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        this.f30778c = true;
        if (AndroidUtilities.isTablet()) {
            this.f30776a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        } else if (rotation != 3 && rotation != 1) {
            this.f30776a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        } else {
            this.f30776a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        }
        this.f30778c = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30778c) {
            return;
        }
        super.requestLayout();
    }
}
