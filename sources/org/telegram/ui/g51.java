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
public final class g51 extends FrameLayout {
    public final TextView f38427a;
    public final org.telegram.ui.Components.pi0 f38428b;
    public final ImageView f38429c;
    public float d;
    public ValueAnimator f38430e;
    public final b61 f38431f;

    public g51(b61 b61Var, Context context, boolean z10) {
        super(context);
        int i9;
        this.f38431f = b61Var;
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 0);
        if (z10) {
            i9 = 3;
        } else {
            i9 = 17;
        }
        addView(f10, g7.e6.e(-2, -2, i9));
        ?? imageView = new ImageView(context);
        this.f38428b = imageView;
        imageView.f(R.raw.unlock_icon, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.f6.Te;
        org.telegram.ui.ActionBar.b6 b6Var = b61Var.V0;
        imageView.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        f10.addView((View) imageView, g7.e6.n(20, 20));
        TextView textView = new TextView(context);
        this.f38427a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f10.addView(textView, g7.e6.q(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f38429c = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ve, b6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, g7.e6.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f38427a.setText(str);
        b(z10);
    }

    public final void b(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f38430e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f38430e = null;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        float dp = (1.0f - this.d) * AndroidUtilities.dp(-8.0f);
        org.telegram.ui.Components.pi0 pi0Var = this.f38428b;
        pi0Var.setTranslationX(dp);
        this.f38427a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        pi0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }
}
