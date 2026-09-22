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
public final class a91 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f31705a;
    public final org.telegram.ui.Components.f9 f31706b;
    public final org.telegram.ui.Components.u9 f31707c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final TextView e;
    public final ImageView f31708f;
    public final org.telegram.ui.Components.m5 h;
    public final org.telegram.ui.Components.m5 f31709n;

    public a91(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f31705a = e6Var;
        setOrientation(0);
        this.f31706b = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f31707c = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        j5Var.setTextSize(15);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        this.h = new org.telegram.ui.Components.m5(AndroidUtilities.dp(24.0f), 7, j5Var, false);
        this.f31709n = new org.telegram.ui.Components.m5(AndroidUtilities.dp(24.0f), 7, j5Var, false);
        j5Var.addOnAttachStateChangeListener(new f5(this, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
        textView.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
        ImageView imageView = new ImageView(context);
        this.f31708f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18998m6, e6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            j5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, w7.x5.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, w7.x5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(j5Var, w7.x5.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(u9Var, w7.x5.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        j5Var.setGravity(19);
        addView(u9Var, w7.x5.t(28, 28, 19, 18, 0, 18, 0));
        addView(j5Var, w7.x5.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, w7.x5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, w7.x5.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f31705a;
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        this.e.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
        this.f31708f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18998m6, e6Var), PorterDuff.Mode.SRC_IN));
        this.f31709n.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19245zh, e6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void set(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a91.set(int):void");
    }
}
