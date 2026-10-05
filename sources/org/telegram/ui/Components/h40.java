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
    public final int f27060a;
    public final org.telegram.ui.ActionBar.d6 f27061b;
    public ArrayList f27062c;
    public final FrameLayout d;
    public final e71 f27063e;
    public final w61 f27064f;
    public Utilities.Callback h;

    public h40(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f27060a = i10;
        this.f27061b = d6Var;
        e71 e71Var = new e71(activity, i10, 0, false, new d(this, 15), new g40(this), new g40(this), d6Var);
        this.f27063e = e71Var;
        e71Var.setClipToPadding(false);
        w61 w61Var = (w61) e71Var.getAdapter();
        this.f27064f = w61Var;
        w61Var.f32531r = false;
        addView(e71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.i6.f20993m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.z5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        org.telegram.messenger.bi.k(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.z5.e(210, -2, 17));
        e71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.f27063e.j(s0Var);
    }
}
