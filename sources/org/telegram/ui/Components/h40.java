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
    public final int f24734a;
    public final org.telegram.ui.ActionBar.d6 f24735b;
    public ArrayList f24736c;
    public final FrameLayout d;
    public final u61 e;
    public final m61 f24737f;
    public Utilities.Callback h;

    public h40(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f24734a = i10;
        this.f24735b = d6Var;
        u61 u61Var = new u61(activity, i10, 0, false, new d(this, 15), new g40(this), new g40(this), d6Var);
        this.e = u61Var;
        u61Var.setClipToPadding(false);
        m61 m61Var = (m61) u61Var.getAdapter();
        this.f24737f = m61Var;
        m61Var.f26223r = false;
        addView(u61Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.h6.f19240m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.y5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        org.telegram.messenger.ok.l(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.y5.e(210, -2, 17));
        u61Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.e.j(s0Var);
    }
}
