package org.telegram.ui.Components;

import android.content.Context;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class nu0 extends LinearLayout {
    public final TextView f31078a;
    public final ImageView f31079b;
    public boolean f31080c;

    public nu0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f31078a = textView;
        ImageView imageView = new ImageView(context);
        this.f31079b = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, gb1.r(-2, -2));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23765z6, u6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        addView(textView, gb1.x(-2, -2, 17, 0, 24, 0, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        this.f31080c = true;
        if (AndroidUtilities.isTablet()) {
            this.f31078a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        } else if (rotation != 3 && rotation != 1) {
            this.f31078a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
        } else {
            this.f31078a.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        }
        this.f31080c = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f31080c) {
            return;
        }
        super.requestLayout();
    }
}
