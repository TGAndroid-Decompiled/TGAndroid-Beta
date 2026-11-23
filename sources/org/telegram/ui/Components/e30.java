package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class e30 extends FrameLayout {
    public final int f34557a;
    public final org.telegram.ui.ActionBar.i6 f34558b;
    public ArrayList f34559c;
    public final FrameLayout d;
    public final g51 f34560e;
    public final b51 f34561f;
    public org.telegram.messenger.w10 h;

    public e30(int i7, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.f34557a = i7;
        this.f34558b = i6Var;
        g51 g51Var = new g51(activity, i7, 0, false, new d(this, 16), new d30(this), new d30(this), i6Var);
        this.f34560e = g51Var;
        g51Var.setClipToPadding(false);
        b51 b51Var = (b51) g51Var.getAdapter();
        this.f34561f = b51Var;
        b51Var.f33631r = false;
        addView(g51Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.n6.f29616m6;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231611);
        frameLayout.addView(imageView, c8.na.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setText(org.telegram.messenger.gd.N0(2131749160, null));
        textView.setGravity(17);
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.na.e(210, -2, 17));
        g51Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(org.telegram.messenger.w10 w10Var) {
        this.h = w10Var;
    }

    public void setOnScrollListener(v4.u0 u0Var) {
        this.f34560e.j(u0Var);
    }
}
