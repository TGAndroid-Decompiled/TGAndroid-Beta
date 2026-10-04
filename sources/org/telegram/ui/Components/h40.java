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
public final class h40 extends FrameLayout {
    public final int f27003a;
    public final org.telegram.ui.ActionBar.d6 f27004b;
    public ArrayList f27005c;
    public final FrameLayout d;
    public final c71 f27006e;
    public final u61 f27007f;
    public Utilities.Callback h;

    public h40(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f27003a = i10;
        this.f27004b = d6Var;
        c71 c71Var = new c71(activity, i10, 0, false, new d(this, 15), new g40(this), new g40(this), d6Var);
        this.f27006e = c71Var;
        c71Var.setClipToPadding(false);
        u61 u61Var = (u61) c71Var.getAdapter();
        this.f27007f = u61Var;
        u61Var.f31306r = false;
        addView(c71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.i6.f20983m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.z5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        org.telegram.messenger.ok.l(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.z5.e(210, -2, 17));
        c71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.f27006e.j(s0Var);
    }
}
