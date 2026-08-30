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
public final class l81 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f35982a;
    public final org.telegram.ui.Components.rb0 f35983b;
    public final FrameLayout f35984c;
    public final ImageView d;
    public final TextView e;
    public final TextView f35985f;
    public final TextView h;
    public boolean f35986n;

    public l81(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f35982a = f6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35984c = frameLayout;
        org.telegram.ui.Components.rb0 rb0Var = new org.telegram.ui.Components.rb0(1);
        this.f35983b = rb0Var;
        frameLayout.setBackground(rb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, k7.b6.e(24, 24, 17));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView j10 = yh.j(f10, textView, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f35985f = j10;
        j10.setTextSize(1, 13.0f);
        TextView j11 = yh.j(f10, j10, k7.b6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = j11;
        j11.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(j11, k7.b6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f10, k7.b6.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, k7.b6.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, k7.b6.t(28, 28, 19, 18, 0, 0, 0));
            addView(f10, k7.b6.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(j11, k7.b6.t(-2, -2, 16, 0, 0, 20, 0));
        }
        e();
    }

    @Override
    public final void e() {
        boolean q10;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f35982a;
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f35985f.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20085n6, f6Var));
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        this.f35983b.f28438b = q10;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f35986n) {
            f10 = 60.0f;
        } else {
            f10 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
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
