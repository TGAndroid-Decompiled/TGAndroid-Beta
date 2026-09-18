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
public final class b91 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f32082a;
    public final org.telegram.ui.Components.f9 f32083b;
    public final org.telegram.ui.Components.u9 f32084c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView e;
    public final ImageView f32085f;
    public final org.telegram.ui.Components.m5 h;
    public final org.telegram.ui.Components.m5 f32086n;

    public b91(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f32082a = f6Var;
        setOrientation(0);
        this.f32083b = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f32084c = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(15);
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        this.h = new org.telegram.ui.Components.m5(AndroidUtilities.dp(24.0f), 7, k5Var, false);
        this.f32086n = new org.telegram.ui.Components.m5(AndroidUtilities.dp(24.0f), 7, k5Var, false);
        k5Var.addOnAttachStateChangeListener(new f5(this, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        ImageView imageView = new ImageView(context);
        this.f32085f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19028m6, f6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            k5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, w7.x5.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, w7.x5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(k5Var, w7.x5.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(u9Var, w7.x5.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        k5Var.setGravity(19);
        addView(u9Var, w7.x5.t(28, 28, 19, 18, 0, 18, 0));
        addView(k5Var, w7.x5.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, w7.x5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, w7.x5.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f32082a;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.e.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        this.f32085f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19028m6, f6Var), PorterDuff.Mode.SRC_IN));
        this.f32086n.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19275zh, f6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void set(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b91.set(int):void");
    }
}
