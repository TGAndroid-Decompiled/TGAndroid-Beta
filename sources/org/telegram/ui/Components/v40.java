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
    public final int f31672a;
    public final org.telegram.ui.ActionBar.d6 f31673b;
    public ArrayList f31674c;
    public final FrameLayout d;
    public final m71 f31675e;
    public final e71 f31676f;
    public Utilities.Callback h;

    public v40(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f31672a = i10;
        this.f31673b = d6Var;
        m71 m71Var = new m71(activity, i10, 0, false, new d(this, 15), new u40(this), new u40(this), d6Var);
        this.f31675e = m71Var;
        m71Var.setClipToPadding(false);
        e71 e71Var = (e71) m71Var.getAdapter();
        this.f31676f = e71Var;
        e71Var.f25890r = false;
        addView(m71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.h6.f20951m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.x5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        org.telegram.messenger.ai.m(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 56.0f, 0.0f, 0.0f, -2, 81));
        addView(frameLayout, w7.x5.e(210, -2, 17));
        m71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.t0 t0Var) {
        this.f31675e.j(t0Var);
    }
}
