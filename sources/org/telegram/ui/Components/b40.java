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
public final class b40 extends FrameLayout {
    public final int f26972a;
    public final org.telegram.ui.ActionBar.c6 f26973b;
    public ArrayList f26974c;
    public final FrameLayout d;
    public final u51 f26975e;
    public final k51 f26976f;
    public Utilities.Callback h;

    public b40(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f26972a = i10;
        this.f26973b = c6Var;
        u51 u51Var = new u51(activity, i10, 0, false, new d(this, 15), new a40(this), new a40(this), c6Var);
        this.f26975e = u51Var;
        u51Var.setClipToPadding(false);
        k51 k51Var = (k51) u51Var.getAdapter();
        this.f26976f = k51Var;
        k51Var.f29939r = false;
        addView(u51Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.g6.f23223m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, i7.f6.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        org.telegram.ui.b.i(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, i7.f6.e(210, -2, 17));
        u51Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(f2.a1 a1Var) {
        this.f26975e.j(a1Var);
    }
}
