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
public final class h91 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f38302a;
    public final org.telegram.ui.Components.uc0 f38303b;
    public final FrameLayout f38304c;
    public final ImageView d;
    public final TextView f38305e;
    public final TextView f38306f;
    public final TextView h;
    public boolean f38307n;
    public boolean f38308r;

    public h91(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f38307n = true;
        this.f38302a = c6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38304c = frameLayout;
        org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0(1);
        this.f38303b = uc0Var;
        frameLayout.setBackground(uc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.w5.e(24, 24, 17));
        LinearLayout e7 = org.telegram.messenger.am.e(context, 1);
        TextView textView = new TextView(context);
        this.f38305e = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.w5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f38306f = h;
        h.setTextSize(1, 13.0f);
        TextView h10 = com.google.android.gms.internal.vision.e2.h(e7, h, w7.w5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = h10;
        h10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(h10, w7.w5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(e7, w7.w5.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, w7.w5.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, w7.w5.t(28, 28, 19, 18, 0, 0, 0));
            addView(e7, w7.w5.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(h10, w7.w5.t(-2, -2, 16, 0, 0, 20, 0));
        }
        e();
    }

    @Override
    public final void e() {
        boolean z10;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f38302a;
        this.f38305e.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        this.f38306f.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20945y6, c6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20744n6, c6Var));
        if (this.f38307n && (c6Var == null ? org.telegram.ui.ActionBar.h6.I.q() : c6Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38303b.f31140b = z10;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f38308r) {
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
