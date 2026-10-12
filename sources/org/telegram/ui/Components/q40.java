package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class q40 extends FrameLayout {
    public final int f28509a;
    public final org.telegram.ui.ActionBar.c6 f28510b;
    public ArrayList f28511c;
    public final FrameLayout d;
    public final h71 e;
    public final z61 f28512f;
    public Utilities.Callback h;

    public q40(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f28509a = i10;
        this.f28510b = c6Var;
        h71 h71Var = new h71(activity, i10, 0, false, new d(this, 15), new p40(this), new p40(this), c6Var);
        this.e = h71Var;
        h71Var.setClipToPadding(false);
        z61 z61Var = (z61) h71Var.getAdapter();
        this.f28512f = z61Var;
        z61Var.f31780r = false;
        addView(h71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.g6.f20064m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.a6.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        org.telegram.messenger.yh.l(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.a6.a(-2.0f, 0.0f, 56.0f, 0.0f, 0.0f, -2, 81));
        addView(frameLayout, w7.a6.e(210, -2, 17));
        h71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.r0 r0Var) {
        this.e.j(r0Var);
    }
}
