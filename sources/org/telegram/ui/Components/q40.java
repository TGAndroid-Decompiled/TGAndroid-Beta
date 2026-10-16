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
    public final int f28190a;
    public final org.telegram.ui.ActionBar.c6 f28191b;
    public ArrayList f28192c;
    public final FrameLayout d;
    public final i71 e;
    public final a71 f28193f;
    public Utilities.Callback h;

    public q40(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f28190a = i10;
        this.f28191b = c6Var;
        i71 i71Var = new i71(activity, i10, 0, false, new d(this, 15), new p40(this), new p40(this), c6Var);
        this.e = i71Var;
        i71Var.setClipToPadding(false);
        a71 a71Var = (a71) i71Var.getAdapter();
        this.f28193f = a71Var;
        a71Var.f23145r = false;
        addView(i71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.g6.f19764m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.z5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        org.telegram.messenger.sk.m(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 56.0f, 0.0f, 0.0f, -2, 81));
        addView(frameLayout, w7.z5.e(210, -2, 17));
        i71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.r0 r0Var) {
        this.e.j(r0Var);
    }
}
