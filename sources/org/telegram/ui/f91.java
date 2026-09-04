package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class f91 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 f36349a;
    public final org.telegram.ui.Components.rb0 f36350b;
    public final FrameLayout f36351c;
    public final ImageView d;
    public final TextView f36352e;
    public final TextView f36353f;
    public final TextView h;
    public boolean f36354n;

    public f91(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f36349a = f6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36351c = frameLayout;
        org.telegram.ui.Components.rb0 rb0Var = new org.telegram.ui.Components.rb0(1);
        this.f36350b = rb0Var;
        frameLayout.setBackground(rb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.x5.e(24, 24, 17));
        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
        TextView textView = new TextView(context);
        this.f36352e = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(f7, textView, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f36353f = h;
        h.setTextSize(1, 13.0f);
        TextView h10 = com.google.android.gms.internal.vision.e2.h(f7, h, w7.x5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = h10;
        h10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(h10, w7.x5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f7, w7.x5.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, w7.x5.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, w7.x5.t(28, 28, 19, 18, 0, 0, 0));
            addView(f7, w7.x5.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(h10, w7.x5.t(-2, -2, 16, 0, 0, 20, 0));
        }
        d();
    }

    @Override
    public final void d() {
        boolean q6;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f36349a;
        this.f36352e.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f36353f.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21042y6, f6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20846n6, f6Var));
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        this.f36350b.f30005b = q6;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f36354n) {
            f7 = 60.0f;
        } else {
            f7 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        int i10;
        if (!TextUtils.isEmpty(charSequence)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        TextView textView = this.h;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
