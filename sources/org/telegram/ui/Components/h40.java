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
public final class h40 extends FrameLayout {
    public final int f27371a;
    public final org.telegram.ui.ActionBar.g6 f27372b;
    public ArrayList f27373c;
    public final FrameLayout d;
    public final i61 f27374e;
    public final x51 f27375f;
    public Utilities.Callback h;

    public h40(int i10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f27371a = i10;
        this.f27372b = g6Var;
        i61 i61Var = new i61(activity, i10, 0, false, new d(this, 15), new g40(this), new g40(this), g6Var);
        this.f27374e = i61Var;
        i61Var.setClipToPadding(false);
        x51 x51Var = (x51) i61Var.getAdapter();
        this.f27375f = x51Var;
        x51Var.f32957r = false;
        addView(i61Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.k6.f21821m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, k7.c6.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        org.telegram.messenger.y3.r(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, k7.c6.e(210, -2, 17));
        i61Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(f2.a1 a1Var) {
        this.f27374e.j(a1Var);
    }
}
