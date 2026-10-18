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
    public final int f28394a;
    public final org.telegram.ui.ActionBar.d6 f28395b;
    public ArrayList f28396c;
    public final FrameLayout d;
    public final a71 e;
    public final s61 f28397f;
    public Utilities.Callback h;

    public m40(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f28394a = i10;
        this.f28395b = d6Var;
        a71 a71Var = new a71(activity, i10, 0, false, new d(this, 15), new l40(this), new l40(this), d6Var);
        this.e = a71Var;
        a71Var.setClipToPadding(false);
        s61 s61Var = (s61) a71Var.getAdapter();
        this.f28397f = s61Var;
        s61Var.f30207r = false;
        addView(a71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.h6.f21156m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.z5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        org.telegram.messenger.kk.m(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 56.0f, 0.0f, 0.0f, -2, 81));
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
