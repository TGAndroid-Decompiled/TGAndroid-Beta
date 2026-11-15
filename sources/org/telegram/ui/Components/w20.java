package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class w20 extends FrameLayout {
    public final int f41231a;
    public final org.telegram.ui.ActionBar.e6 f41232b;
    public ArrayList f41233c;
    public final FrameLayout d;
    public final u41 f41234e;
    public final p41 f41235f;
    public org.telegram.messenger.z10 h;

    public w20(int i7, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f41231a = i7;
        this.f41232b = e6Var;
        u41 u41Var = new u41(activity, i7, 0, false, new d(this, 15), new v20(this), new v20(this), e6Var);
        this.f41234e = u41Var;
        u41Var.setClipToPadding(false);
        p41 p41Var = (p41) u41Var.getAdapter();
        this.f41235f = p41Var;
        p41Var.f38201r = false;
        addView(u41Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.j6.f29014m6;
        org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231607);
        frameLayout.addView(imageView, c8.ja.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        textView.setText(org.telegram.messenger.hd.M0(2131749353, null));
        textView.setGravity(17);
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.ja.e(210, -2, 17));
        u41Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(org.telegram.messenger.z10 z10Var) {
        this.h = z10Var;
    }

    public void setOnScrollListener(v4.t0 t0Var) {
        this.f41234e.j(t0Var);
    }
}
