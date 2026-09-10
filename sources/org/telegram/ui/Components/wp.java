package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wp extends FrameLayout {
    public final TextView[] f28809a;
    public final kj0[] f28810b;
    public final ImageView f28811c;
    public AnimatorSet d;
    public rg e;
    public float f28812f;
    public final org.telegram.ui.ActionBar.f6 h;

    public wp(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        float f7;
        float f10;
        this.f28809a = new TextView[2];
        this.f28810b = new kj0[2];
        this.h = f6Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18170qf, f6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(frameLayout, w7.a6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f28810b[i10] = new ImageView(activity);
            this.f28810b[i10].setScaleType(ImageView.ScaleType.CENTER);
            kj0 kj0Var = this.f28810b[i10];
            if (i10 == 0) {
                f7 = 0.0f;
            } else {
                f7 = 24.0f;
            }
            frameLayout.addView(kj0Var, w7.a6.d(24, 24.0f, 51, 0.0f, f7, 0.0f, 0.0f));
            this.f28809a[i10] = new TextView(activity);
            this.f28809a[i10].setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18152pf, this.h));
            this.f28809a[i10].setTextSize(1, 14.0f);
            this.f28809a[i10].setMaxLines(1);
            this.f28809a[i10].setSingleLine(true);
            this.f28809a[i10].setMaxWidth(AndroidUtilities.dp(250.0f));
            this.f28809a[i10].setGravity(51);
            this.f28809a[i10].setPivotX(0.0f);
            TextView textView = this.f28809a[i10];
            if (i10 == 0) {
                f10 = 2.0f;
            } else {
                f10 = 26.0f;
            }
            frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 32.0f, f10, 10.0f, 0.0f));
            if (i10 == 0) {
                this.f28810b[i10].f(R.raw.ticks_single, 24, 24, null);
                this.f28809a[i10].setText(LocaleController.getString(R.string.HintSent));
            } else {
                this.f28810b[i10].f(R.raw.ticks_double, 24, 24, null);
                this.f28809a[i10].setText(LocaleController.getString(R.string.HintRead));
            }
            this.f28810b[i10].d();
        }
        ImageView imageView = new ImageView(activity);
        this.f28811c = imageView;
        imageView.setImageResource(R.drawable.tooltip_arrow);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18170qf, this.h), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.a6.d(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        rg rgVar = this.e;
        if (rgVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rgVar);
            this.e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.0f));
        this.d.addListener(new vp(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f28812f;
    }
}
