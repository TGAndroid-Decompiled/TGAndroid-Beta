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
public final class m40 extends FrameLayout {
    public final int f28387a;
    public final org.telegram.ui.ActionBar.d6 f28388b;
    public ArrayList f28389c;
    public final FrameLayout d;
    public final a71 e;
    public final s61 f28390f;
    public Utilities.Callback h;

    public m40(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f28387a = i10;
        this.f28388b = d6Var;
        a71 a71Var = new a71(activity, i10, 0, false, new d(this, 15), new l40(this), new l40(this), d6Var);
        this.e = a71Var;
        a71Var.setClipToPadding(false);
        s61 s61Var = (s61) a71Var.getAdapter();
        this.f28390f = s61Var;
        s61Var.f30201r = false;
        addView(a71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.h6.f21149m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.z5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        org.telegram.messenger.lk.m(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.z5.e(210, -2, 17));
        a71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.r0 r0Var) {
        this.e.j(r0Var);
    }
}
