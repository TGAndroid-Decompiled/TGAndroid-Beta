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
public final class d91 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f36908a;
    public final org.telegram.ui.Components.j9 f36909b;
    public final org.telegram.ui.Components.y9 f36910c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final TextView f36911e;
    public final ImageView f36912f;
    public final org.telegram.ui.Components.q5 h;
    public final org.telegram.ui.Components.q5 f36913n;

    public d91(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f36908a = e6Var;
        setOrientation(0);
        this.f36909b = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f36910c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        j5Var.setTextSize(15);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        this.h = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 7, j5Var, false);
        this.f36913n = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 7, j5Var, false);
        j5Var.addOnAttachStateChangeListener(new f5(this, 4));
        TextView textView = new TextView(context);
        this.f36911e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
        textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
        ImageView imageView = new ImageView(context);
        this.f36912f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20962m6, e6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            j5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, w7.x5.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, w7.x5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(j5Var, w7.x5.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(y9Var, w7.x5.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        j5Var.setGravity(19);
        addView(y9Var, w7.x5.t(28, 28, 19, 18, 0, 18, 0));
        addView(j5Var, w7.x5.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, w7.x5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, w7.x5.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f36908a;
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        this.f36911e.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
        this.f36912f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20962m6, e6Var), PorterDuff.Mode.SRC_IN));
        this.f36913n.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21210zh, e6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d91.set(int):void");
    }
}
