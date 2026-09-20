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
public final class d40 extends FrameLayout {
    public final int f23488a;
    public final org.telegram.ui.ActionBar.f6 f23489b;
    public ArrayList f23490c;
    public final FrameLayout d;
    public final s61 e;
    public final k61 f23491f;
    public Utilities.Callback h;

    public d40(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f23488a = i10;
        this.f23489b = f6Var;
        s61 s61Var = new s61(activity, i10, 0, false, new d(this, 15), new c40(this), new c40(this), f6Var);
        this.e = s61Var;
        s61Var.setClipToPadding(false);
        k61 k61Var = (k61) s61Var.getAdapter();
        this.f23491f = k61Var;
        k61Var.f25678r = false;
        addView(s61Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.j6.f19259m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.y5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        org.telegram.messenger.rk.l(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.y5.e(210, -2, 17));
        s61Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.e.j(s0Var);
    }
}
