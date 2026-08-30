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
public final class f40 extends FrameLayout {
    public final int f24773a;
    public final org.telegram.ui.ActionBar.f6 f24774b;
    public ArrayList f24775c;
    public final FrameLayout d;
    public final g61 e;
    public final w51 f24776f;
    public Utilities.Callback h;

    public f40(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f24773a = i10;
        this.f24774b = f6Var;
        g61 g61Var = new g61(activity, i10, 0, false, new d(this, 15), new e40(this), new e40(this), f6Var);
        this.e = g61Var;
        g61Var.setClipToPadding(false);
        w51 w51Var = (w51) g61Var.getAdapter();
        this.f24776f = w51Var;
        w51Var.f30240r = false;
        addView(g61Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.j6.f20067m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, k7.b6.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        org.telegram.messenger.y3.r(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, k7.b6.e(210, -2, 17));
        g61Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(f2.z0 z0Var) {
        this.e.j(z0Var);
    }
}
