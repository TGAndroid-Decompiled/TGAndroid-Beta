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
public final class m01 extends FrameLayout {
    public final TextView f47477a;
    public final org.telegram.ui.Components.fh0 f47478b;
    public final ImageView f47479c;
    public float d;
    public ValueAnimator f47480e;
    public final g11 f47481f;

    public m01(g11 g11Var, Context context, boolean z10) {
        super(context);
        int i3;
        this.f47481f = g11Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        if (z10) {
            i3 = 3;
        } else {
            i3 = 17;
        }
        addView(f10, b8.mf.e(-2, -2, i3));
        ?? imageView = new ImageView(context);
        this.f47478b = imageView;
        imageView.f(2131624314, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.k6.If;
        org.telegram.ui.ActionBar.e6 e6Var = g11Var.f45436a1;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.SRC_ATOP);
        f10.addView((View) imageView, b8.mf.o(20, 20));
        TextView textView = new TextView(context);
        this.f47477a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f10.addView(textView, b8.mf.r(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f47479c = imageView2;
        imageView2.setImageResource(2131232096);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Kf, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, b8.mf.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f47477a.setText(str);
        b(z10);
    }

    public final void b(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f47480e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f47480e = null;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        float L = (1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f);
        org.telegram.ui.Components.fh0 fh0Var = this.f47478b;
        fh0Var.setTranslationX(L);
        this.f47477a.setTranslationX((1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f));
        fh0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }
}
