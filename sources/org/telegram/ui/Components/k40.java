package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class k40 extends FrameLayout {
    public final int f27854a;
    public final org.telegram.ui.ActionBar.g6 f27855b;
    public ArrayList f27856c;
    public final FrameLayout d;
    public final i71 e;
    public final a71 f27857f;
    public Utilities.Callback h;

    public k40(int i10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f27854a = i10;
        this.f27855b = g6Var;
        i71 i71Var = new i71(activity, i10, 0, false, new d(this, 15), new j40(this), new j40(this), g6Var);
        this.e = i71Var;
        i71Var.setClipToPadding(false);
        a71 a71Var = (a71) i71Var.getAdapter();
        this.f27857f = a71Var;
        a71Var.f24646r = false;
        addView(i71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.k6.f21347m6;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.z5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        org.telegram.messenger.tl.m(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.z5.e(210, -2, 17));
        i71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.r0 r0Var) {
        this.e.j(r0Var);
    }
}
