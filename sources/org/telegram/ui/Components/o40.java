package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class o40 extends FrameLayout {
    public final int f31154a;
    public final org.telegram.ui.ActionBar.u6 f31155b;
    public ArrayList f31156c;
    public final FrameLayout d;
    public final s71 e;
    public final k71 f31157f;
    public Utilities.Callback h;

    public o40(int i10, Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        this.f31154a = i10;
        this.f31155b = u6Var;
        s71 s71Var = new s71(activity, i10, 0, false, new d(this, 15), new n40(this), new n40(this), u6Var);
        this.e = s71Var;
        s71Var.setClipToPadding(false);
        k71 k71Var = (k71) s71Var.getAdapter();
        this.f31157f = k71Var;
        k71Var.f29878r = false;
        addView(s71Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.y6.f23521m6;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, kb1.i(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        org.telegram.messenger.wh.k(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, kb1.h(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, kb1.i(210, -2, 17));
        s71Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.u0 u0Var) {
        this.e.j(u0Var);
    }
}
