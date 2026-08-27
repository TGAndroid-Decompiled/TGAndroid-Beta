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

public final class s30 extends FrameLayout {

    public final int f32324a;

    public final org.telegram.ui.ActionBar.c6 f32325b;

    public ArrayList f32326c;
    public final FrameLayout d;

    public final k51 f32327e;

    public final b51 f32328f;
    public Utilities.Callback h;

    public s30(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f32324a = i10;
        this.f32325b = c6Var;
        k51 k51Var = new k51(activity, i10, 0, false, new d(this, 15), new r30(this), new r30(this), c6Var);
        this.f32327e = k51Var;
        k51Var.setClipToPadding(false);
        b51 b51Var = (b51) k51Var.getAdapter();
        this.f32328f = b51Var;
        b51Var.f26942r = false;
        addView(k51Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.g6.f23215m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, h7.z5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        org.telegram.messenger.rl.i(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, h7.z5.e(210, -2, 17));
        k51Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(f2.b1 b1Var) {
        this.f32327e.j(b1Var);
    }
}
