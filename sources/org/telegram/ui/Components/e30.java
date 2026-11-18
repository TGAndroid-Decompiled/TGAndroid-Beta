package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class e30 extends FrameLayout {
    public final int f34590a;
    public final org.telegram.ui.ActionBar.i6 f34591b;
    public ArrayList f34592c;
    public final FrameLayout d;
    public final e51 f34593e;
    public final z41 f34594f;
    public org.telegram.messenger.x10 h;

    public e30(int i7, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.f34590a = i7;
        this.f34591b = i6Var;
        e51 e51Var = new e51(activity, i7, 0, false, new d(this, 16), new d30(this), new d30(this), i6Var);
        this.f34593e = e51Var;
        e51Var.setClipToPadding(false);
        z41 z41Var = (z41) e51Var.getAdapter();
        this.f34594f = z41Var;
        z41Var.f42809r = false;
        addView(e51Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.n6.f29561m6;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231608);
        frameLayout.addView(imageView, c8.ma.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setText(org.telegram.messenger.gd.M0(2131749161, null));
        textView.setGravity(17);
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.ma.e(210, -2, 17));
        e51Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(org.telegram.messenger.x10 x10Var) {
        this.h = x10Var;
    }

    public void setOnScrollListener(v4.u0 u0Var) {
        this.f34593e.j(u0Var);
    }
}
