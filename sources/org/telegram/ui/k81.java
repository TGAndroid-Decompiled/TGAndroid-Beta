package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k81 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f38300a;
    public final org.telegram.ui.Components.z8 f38301b;
    public final org.telegram.ui.Components.p9 f38302c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final TextView f38303e;
    public final ImageView f38304f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f38305n;

    public k81(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f38300a = g6Var;
        setOrientation(0);
        this.f38301b = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f38302c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var;
        l5Var.setTextSize(15);
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        this.h = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 7, l5Var, false);
        this.f38305n = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 7, l5Var, false);
        l5Var.addOnAttachStateChangeListener(new h5(this, 4));
        TextView textView = new TextView(context);
        this.f38303e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g6Var));
        textView.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
        ImageView imageView = new ImageView(context);
        this.f38304f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21821m6, g6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            l5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, k7.c6.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, k7.c6.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(l5Var, k7.c6.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(p9Var, k7.c6.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        l5Var.setGravity(19);
        addView(p9Var, k7.c6.t(28, 28, 19, 18, 0, 18, 0));
        addView(l5Var, k7.c6.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, k7.c6.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, k7.c6.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f38300a;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        this.f38303e.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
        this.f38304f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21821m6, g6Var), PorterDuff.Mode.SRC_IN));
        this.f38305n.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, g6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void set(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k81.set(int):void");
    }
}
