package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class o40 extends FrameLayout {
    public final int f31152a;
    public final org.telegram.ui.ActionBar.u6 f31153b;
    public ArrayList f31154c;
    public final FrameLayout d;
    public final r71 e;
    public final j71 f31155f;
    public Utilities.Callback h;

    public o40(int i10, Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        this.f31152a = i10;
        this.f31153b = u6Var;
        r71 r71Var = new r71(activity, i10, 0, false, new d(this, 15), new n40(this), new n40(this), u6Var);
        this.e = r71Var;
        r71Var.setClipToPadding(false);
        j71 j71Var = (j71) r71Var.getAdapter();
        this.f31155f = j71Var;
        j71Var.f29507r = false;
        addView(r71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.y6.f23520m6;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, gb1.i(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        org.telegram.messenger.vh.k(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, gb1.h(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, gb1.i(210, -2, 17));
        r71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.u0 u0Var) {
        this.e.j(u0Var);
    }
}
