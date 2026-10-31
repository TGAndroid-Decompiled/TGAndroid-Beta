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
public final class o21 extends FrameLayout {
    public final TextView f40119a;
    public final org.telegram.ui.Components.ei0 f40120b;
    public final ImageView f40121c;
    public float d;
    public ValueAnimator e;
    public final i31 f40122f;

    public o21(i31 i31Var, Context context, boolean z10) {
        super(context);
        int i10;
        this.f40122f = i31Var;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        if (z10) {
            i10 = 3;
        } else {
            i10 = 17;
        }
        addView(f7, w7.b6.e(-2, -2, i10));
        ?? imageView = new ImageView(context);
        this.f40120b = imageView;
        imageView.f(2131624312, 20, 20, null);
        int i11 = org.telegram.ui.ActionBar.t6.If;
        org.telegram.ui.ActionBar.p6 p6Var = i31Var.Z0;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_ATOP);
        f7.addView((View) imageView, w7.b6.o(20, 20));
        TextView textView = new TextView(context);
        this.f40119a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f7.addView(textView, w7.b6.r(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f40121c = imageView2;
        imageView2.setImageResource(2131232095);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.Kf, p6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, w7.b6.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f40119a.setText(str);
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
        float L = (1.0f - this.d) * org.telegram.messenger.i0.L(-8.0f);
        org.telegram.ui.Components.ei0 ei0Var = this.f40120b;
        ei0Var.setTranslationX(L);
        this.f40119a.setTranslationX((1.0f - this.d) * org.telegram.messenger.i0.L(-8.0f));
        ei0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), 1073741824));
    }
}
