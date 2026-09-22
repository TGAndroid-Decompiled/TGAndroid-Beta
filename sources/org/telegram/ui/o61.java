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
public final class o61 extends FrameLayout {
    public final TextView f36214a;
    public final org.telegram.ui.Components.nj0 f36215b;
    public final ImageView f36216c;
    public float d;
    public ValueAnimator e;
    public final j71 f36217f;

    public o61(j71 j71Var, Context context, boolean z10) {
        super(context);
        int i10;
        this.f36217f = j71Var;
        LinearLayout f7 = org.telegram.messenger.rk.f(context, 0);
        if (z10) {
            i10 = 3;
        } else {
            i10 = 17;
        }
        addView(f7, w7.y5.e(-2, -2, i10));
        ?? imageView = new ImageView(context);
        this.f36215b = imageView;
        imageView.f(R.raw.unlock_icon, 20, 20, null);
        int i11 = org.telegram.ui.ActionBar.j6.Te;
        org.telegram.ui.ActionBar.f6 f6Var = j71Var.Z0;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        f7.addView((View) imageView, w7.y5.n(20, 20));
        TextView textView = new TextView(context);
        this.f36214a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f7.addView(textView, w7.y5.q(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.f36216c = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ve, f6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, w7.y5.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f36214a.setText(str);
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
        org.telegram.ui.Components.nj0 nj0Var = this.f36215b;
        nj0Var.setTranslationX(dp);
        this.f36214a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        nj0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }
}
