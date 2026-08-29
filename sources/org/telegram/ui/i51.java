package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class i51 extends FrameLayout {
    public final TextView f39129a;
    public final org.telegram.ui.Components.aj0 f39130b;
    public final ImageView f39131c;
    public float d;
    public ValueAnimator f39132e;
    public final d61 f39133f;

    public i51(d61 d61Var, Context context, boolean z10) {
        super(context);
        int i10;
        this.f39133f = d61Var;
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        if (z10) {
            i10 = 3;
        } else {
            i10 = 17;
        }
        addView(g10, i7.f6.e(-2, -2, i10));
        ?? imageView = new ImageView(context);
        this.f39130b = imageView;
        imageView.f(R.raw.unlock_icon, 20, 20, null);
        int i11 = org.telegram.ui.ActionBar.g6.Te;
        org.telegram.ui.ActionBar.c6 c6Var = d61Var.V0;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        g10.addView((View) imageView, i7.f6.n(20, 20));
        TextView textView = new TextView(context);
        this.f39129a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        g10.addView(textView, i7.f6.q(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f39131c = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ve, c6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, i7.f6.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f39129a.setText(str);
        b(z10);
    }

    public final void b(boolean z10) {
        float f9;
        ValueAnimator valueAnimator = this.f39132e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39132e = null;
        }
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.d = f9;
        float dp = (1.0f - this.d) * AndroidUtilities.dp(-8.0f);
        org.telegram.ui.Components.aj0 aj0Var = this.f39130b;
        aj0Var.setTranslationX(dp);
        this.f39129a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        aj0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }
}
