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
public final class b61 extends FrameLayout {
    public final TextView f32756a;
    public final org.telegram.ui.Components.jj0 f32757b;
    public final ImageView f32758c;
    public float d;
    public ValueAnimator e;
    public final x61 f32759f;

    public b61(x61 x61Var, Context context, boolean z4) {
        super(context);
        int i10;
        this.f32759f = x61Var;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        if (z4) {
            i10 = 3;
        } else {
            i10 = 17;
        }
        addView(f10, k7.b6.e(-2, -2, i10));
        ?? imageView = new ImageView(context);
        this.f32757b = imageView;
        imageView.f(R.raw.unlock_icon, 20, 20, null);
        int i11 = org.telegram.ui.ActionBar.j6.Te;
        org.telegram.ui.ActionBar.f6 f6Var = x61Var.W0;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        f10.addView((View) imageView, k7.b6.n(20, 20));
        TextView textView = new TextView(context);
        this.f32756a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f10.addView(textView, k7.b6.q(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f32758c = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ve, f6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, k7.b6.e(24, 24, 21));
    }

    public final void a(String str, boolean z4) {
        this.f32756a.setText(str);
        b(z4);
    }

    public final void b(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        float dp = (1.0f - this.d) * AndroidUtilities.dp(-8.0f);
        org.telegram.ui.Components.jj0 jj0Var = this.f32757b;
        jj0Var.setTranslationX(dp);
        this.f32756a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        jj0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }
}
