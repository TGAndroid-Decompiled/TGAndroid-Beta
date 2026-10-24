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
public final class f51 extends FrameLayout {
    public final TextView f37203a;
    public final org.telegram.ui.Components.ak0 f37204b;
    public final ImageView f37205c;
    public float d;
    public ValueAnimator e;
    public final a61 f37206f;

    public f51(a61 a61Var, Context context, boolean z10) {
        super(context);
        int i10;
        this.f37206f = a61Var;
        LinearLayout e = org.telegram.messenger.tl.e(context, 0);
        if (z10) {
            i10 = 3;
        } else {
            i10 = 17;
        }
        addView(e, w7.z5.e(-2, -2, i10));
        ?? imageView = new ImageView(context);
        this.f37204b = imageView;
        imageView.f(R.raw.unlock_icon, 20, 20, null);
        int i11 = org.telegram.ui.ActionBar.k6.Te;
        org.telegram.ui.ActionBar.g6 g6Var = a61Var.Z0;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, PorterDuff.Mode.SRC_ATOP);
        e.addView((View) imageView, w7.z5.n(20, 20));
        TextView textView = new TextView(context);
        this.f37203a = textView;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        e.addView(textView, w7.z5.q(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f37205c = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Ve, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, w7.z5.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f37203a.setText(str);
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
        org.telegram.ui.Components.ak0 ak0Var = this.f37204b;
        ak0Var.setTranslationX(dp);
        this.f37203a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        ak0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }
}
