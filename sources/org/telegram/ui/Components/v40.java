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
public final class v40 extends FrameLayout {
    public final int f31731a;
    public final org.telegram.ui.ActionBar.e6 f31732b;
    public ArrayList f31733c;
    public final FrameLayout d;
    public final l71 f31734e;
    public final d71 f31735f;
    public Utilities.Callback h;

    public v40(int i10, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f31731a = i10;
        this.f31732b = e6Var;
        l71 l71Var = new l71(activity, i10, 0, false, new d(this, 15), new u40(this), new u40(this), e6Var);
        this.f31734e = l71Var;
        l71Var.setClipToPadding(false);
        d71 d71Var = (d71) l71Var.getAdapter();
        this.f31735f = d71Var;
        d71Var.f25587r = false;
        addView(l71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.i6.f20966m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.x5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        org.telegram.messenger.bi.m(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 56.0f, 0.0f, 0.0f, -2, 81));
        addView(frameLayout, w7.x5.e(210, -2, 17));
        l71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.t0 t0Var) {
        this.f31734e.j(t0Var);
    }
}
