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

public final class f51 extends FrameLayout {

    public final TextView f37940a;

    public final org.telegram.ui.Components.ri0 f37941b;

    public final ImageView f37942c;
    public float d;

    public ValueAnimator f37943e;

    public final a61 f37944f;

    public f51(a61 a61Var, Context context, boolean z10) {
        super(context);
        this.f37944f = a61Var;
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
        addView(linearLayoutG, h7.z5.e(-2, -2, z10 ? 3 : 17));
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.f37941b = ri0Var;
        ri0Var.f(R.raw.unlock_icon, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.g6.Te;
        org.telegram.ui.ActionBar.c6 c6Var = a61Var.V0;
        ri0Var.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        linearLayoutG.addView(ri0Var, h7.z5.n(20, 20));
        TextView textView = new TextView(context);
        this.f37940a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        linearLayoutG.addView(textView, h7.z5.q(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.f37942c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ve, c6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, h7.z5.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.f37940a.setText(str);
        b(z10);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator = this.f37943e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37943e = null;
        }
        this.d = z10 ? 1.0f : 0.0f;
        float fDp = (1.0f - this.d) * AndroidUtilities.dp(-8.0f);
        org.telegram.ui.Components.ri0 ri0Var = this.f37941b;
        ri0Var.setTranslationX(fDp);
        this.f37940a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        ri0Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }
}
