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
public final class x40 extends FrameLayout {
    public final int f32644a;
    public final org.telegram.ui.ActionBar.c6 f32645b;
    public ArrayList f32646c;
    public final FrameLayout d;
    public final p71 f32647e;
    public final h71 f32648f;
    public Utilities.Callback h;

    public x40(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f32644a = i10;
        this.f32645b = c6Var;
        p71 p71Var = new p71(activity, i10, 0, false, new d(this, 15), new w40(this), new w40(this), c6Var);
        this.f32647e = p71Var;
        p71Var.setClipToPadding(false);
        h71 h71Var = (h71) p71Var.getAdapter();
        this.f32648f = h71Var;
        h71Var.f26679r = false;
        addView(p71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.h6.f20725m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.w5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        org.telegram.messenger.am.m(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.w5.a(-2.0f, 0.0f, 56.0f, 0.0f, 0.0f, -2, 81));
        addView(frameLayout, w7.w5.e(210, -2, 17));
        p71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.t0 t0Var) {
        this.f32647e.j(t0Var);
    }
}
