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
public final class g40 extends FrameLayout {
    public final int f24408a;
    public final org.telegram.ui.ActionBar.d6 f24409b;
    public ArrayList f24410c;
    public final FrameLayout d;
    public final t61 e;
    public final l61 f24411f;
    public Utilities.Callback h;

    public g40(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f24408a = i10;
        this.f24409b = d6Var;
        t61 t61Var = new t61(activity, i10, 0, false, new d(this, 15), new f40(this), new f40(this), d6Var);
        this.e = t61Var;
        t61Var.setClipToPadding(false);
        l61 l61Var = (l61) t61Var.getAdapter();
        this.f24411f = l61Var;
        l61Var.f25924r = false;
        addView(t61Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.h6.f19225m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.y5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        org.telegram.messenger.ok.l(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.y5.e(210, -2, 17));
        t61Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.e.j(s0Var);
    }
}
