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
public final class e51 extends FrameLayout {
    public final TextView f36400a;
    public final org.telegram.ui.Components.xj0 f36401b;
    public final ImageView f36402c;
    public float d;
    public ValueAnimator e;
    public final z51 f36403f;

    public e51(z51 z51Var, Context context, boolean z10) {
        super(context);
        int i10;
        this.f36403f = z51Var;
        LinearLayout e = org.telegram.messenger.wh.e(context, 0);
        if (z10) {
            i10 = 3;
        } else {
            i10 = 17;
        }
        addView(e, w7.z5.e(-2, -2, i10));
        ?? imageView = new ImageView(context);
        this.f36401b = imageView;
        imageView.f(R.raw.unlock_icon, 20, 20, null);
        int i11 = org.telegram.ui.ActionBar.h6.Te;
        org.telegram.ui.ActionBar.d6 d6Var = z51Var.Z0;
        imageView.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        e.addView((View) imageView, w7.z5.n(20, 20));
        TextView textView = new TextView(context);
        this.f36400a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        e.addView(textView, w7.z5.q(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f36402c = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ve, d6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, w7.z5.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f36400a.setText(str);
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
        org.telegram.ui.Components.xj0 xj0Var = this.f36401b;
        xj0Var.setTranslationX(dp);
        this.f36400a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        xj0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }
}
