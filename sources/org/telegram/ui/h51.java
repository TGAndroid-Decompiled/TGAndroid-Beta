package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class h51 extends FrameLayout {
    public final TextView f39902a;
    public final org.telegram.ui.Components.ak0 f39903b;
    public final ImageView f39904c;
    public float d;
    public ValueAnimator e;
    public final c61 f39905f;

    public h51(c61 c61Var, Context context, boolean z10) {
        super(context);
        int i10;
        this.f39905f = c61Var;
        LinearLayout d = org.telegram.messenger.vh.d(context, 0);
        if (z10) {
            i10 = 3;
        } else {
            i10 = 17;
        }
        addView(d, org.telegram.ui.Components.gb1.i(-2, -2, i10));
        ?? imageView = new ImageView(context);
        this.f39903b = imageView;
        imageView.f(R.raw.unlock_icon, 20, 20, null);
        int i11 = org.telegram.ui.ActionBar.y6.Te;
        org.telegram.ui.ActionBar.u6 u6Var = c61Var.Z0;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.SRC_ATOP);
        d.addView((View) imageView, org.telegram.ui.Components.gb1.r(20, 20));
        TextView textView = new TextView(context);
        this.f39902a = textView;
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        d.addView(textView, org.telegram.ui.Components.gb1.u(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f39904c = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.Ve, u6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, org.telegram.ui.Components.gb1.i(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f39902a.setText(str);
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
        org.telegram.ui.Components.ak0 ak0Var = this.f39903b;
        ak0Var.setTranslationX(dp);
        this.f39902a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        ak0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }
}
