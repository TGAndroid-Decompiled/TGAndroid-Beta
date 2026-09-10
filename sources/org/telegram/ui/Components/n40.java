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
public final class n40 extends FrameLayout {
    public final int f25405a;
    public final org.telegram.ui.ActionBar.f6 f25406b;
    public ArrayList f25407c;
    public final FrameLayout d;
    public final r61 e;
    public final j61 f25408f;
    public Utilities.Callback h;

    public n40(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f25405a = i10;
        this.f25406b = f6Var;
        r61 r61Var = new r61(activity, i10, 0, false, new e(this, 15), new m40(this), new m40(this), f6Var);
        this.e = r61Var;
        r61Var.setClipToPadding(false);
        j61 j61Var = (j61) r61Var.getAdapter();
        this.f25408f = j61Var;
        j61Var.f24250r = false;
        addView(r61Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.j6.f18091m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.a6.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        org.telegram.messenger.em.k(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.a6.e(210, -2, 17));
        r61Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.e.j(s0Var);
    }
}
