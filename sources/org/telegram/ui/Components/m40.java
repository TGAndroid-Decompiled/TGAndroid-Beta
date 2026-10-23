package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class m40 extends FrameLayout {
    public final int f28500a;
    public final org.telegram.ui.ActionBar.g6 f28501b;
    public ArrayList f28502c;
    public final FrameLayout d;
    public final j71 e;
    public final b71 f28503f;
    public Utilities.Callback h;

    public m40(int i10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f28500a = i10;
        this.f28501b = g6Var;
        j71 j71Var = new j71(activity, i10, 0, false, new d(this, 15), new l40(this), new l40(this), g6Var);
        this.e = j71Var;
        j71Var.setClipToPadding(false);
        b71 b71Var = (b71) j71Var.getAdapter();
        this.f28503f = b71Var;
        b71Var.f24972r = false;
        addView(j71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.k6.f21346m6;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.z5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        org.telegram.messenger.sl.m(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.z5.e(210, -2, 17));
        j71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.r0 r0Var) {
        this.e.j(r0Var);
    }
}
