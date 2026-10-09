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
public final class u40 extends FrameLayout {
    public final int f31364a;
    public final org.telegram.ui.ActionBar.e6 f31365b;
    public ArrayList f31366c;
    public final FrameLayout d;
    public final k71 f31367e;
    public final c71 f31368f;
    public Utilities.Callback h;

    public u40(int i10, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f31364a = i10;
        this.f31365b = e6Var;
        k71 k71Var = new k71(activity, i10, 0, false, new d(this, 15), new t40(this), new t40(this), e6Var);
        this.f31367e = k71Var;
        k71Var.setClipToPadding(false);
        c71 c71Var = (c71) k71Var.getAdapter();
        this.f31368f = c71Var;
        c71Var.f25280r = false;
        addView(k71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.i6.f20962m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.x5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        org.telegram.messenger.bi.m(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 56.0f, 0.0f, 0.0f, -2, 81));
        addView(frameLayout, w7.x5.e(210, -2, 17));
        k71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.t0 t0Var) {
        this.f31367e.j(t0Var);
    }
}
