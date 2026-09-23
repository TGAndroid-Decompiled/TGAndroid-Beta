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
public final class e40 extends FrameLayout {
    public final int f23556a;
    public final org.telegram.ui.ActionBar.d6 f23557b;
    public ArrayList f23558c;
    public final FrameLayout d;
    public final d61 e;
    public final v51 f23559f;
    public Utilities.Callback h;

    public e40(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f23556a = i10;
        this.f23557b = d6Var;
        d61 d61Var = new d61(activity, i10, 0, false, new d(this, 15), new d40(this), new d40(this), d6Var);
        this.e = d61Var;
        d61Var.setClipToPadding(false);
        v51 v51Var = (v51) d61Var.getAdapter();
        this.f23559f = v51Var;
        v51Var.f28662r = false;
        addView(d61Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.h6.f18953m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.x5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        org.telegram.messenger.ul.l(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.x5.e(210, -2, 17));
        d61Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.e.j(s0Var);
    }
}
