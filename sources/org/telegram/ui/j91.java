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
public final class j91 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f37326a;
    public final org.telegram.ui.Components.k9 f37327b;
    public final org.telegram.ui.Components.z9 f37328c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final TextView e;
    public final ImageView f37329f;
    public final org.telegram.ui.Components.q5 h;
    public final org.telegram.ui.Components.q5 f37330n;

    public j91(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f37326a = c6Var;
        setOrientation(0);
        this.f37327b = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f37328c = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        this.h = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 7, h5Var, false);
        this.f37330n = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 7, h5Var, false);
        h5Var.addOnAttachStateChangeListener(new j5(this, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        ImageView imageView = new ImageView(context);
        this.f37329f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20064m6, c6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            h5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, w7.a6.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, w7.a6.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(h5Var, w7.a6.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(z9Var, w7.a6.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        h5Var.setGravity(19);
        addView(z9Var, w7.a6.t(28, 28, 19, 18, 0, 18, 0));
        addView(h5Var, w7.a6.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, w7.a6.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, w7.a6.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f37326a;
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.e.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        this.f37329f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20064m6, c6Var), PorterDuff.Mode.SRC_IN));
        this.f37330n.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20315zh, c6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j91.set(int):void");
    }
}
