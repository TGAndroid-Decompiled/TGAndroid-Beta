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
public final class l61 extends FrameLayout {
    public final TextView f35259a;
    public final org.telegram.ui.Components.lj0 f35260b;
    public final ImageView f35261c;
    public float d;
    public ValueAnimator e;
    public final g71 f35262f;

    public l61(g71 g71Var, Context context, boolean z10) {
        super(context);
        int i10;
        this.f35262f = g71Var;
        LinearLayout e = org.telegram.messenger.wh.e(context, 0);
        if (z10) {
            i10 = 3;
        } else {
            i10 = 17;
        }
        addView(e, w7.y5.e(-2, -2, i10));
        ?? imageView = new ImageView(context);
        this.f35260b = imageView;
        imageView.f(R.raw.unlock_icon, 20, 20, null);
        int i11 = org.telegram.ui.ActionBar.j6.Te;
        org.telegram.ui.ActionBar.e6 e6Var = g71Var.Z0;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
        e.addView((View) imageView, w7.y5.n(20, 20));
        TextView textView = new TextView(context);
        this.f35259a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        e.addView(textView, w7.y5.q(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f35261c = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ve, e6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, w7.y5.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f35259a.setText(str);
        b(z10);
    }

    public final void b(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = f7;
        float dp = (1.0f - this.d) * AndroidUtilities.dp(-8.0f);
        org.telegram.ui.Components.lj0 lj0Var = this.f35260b;
        lj0Var.setTranslationX(dp);
        this.f35259a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        lj0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }
}
