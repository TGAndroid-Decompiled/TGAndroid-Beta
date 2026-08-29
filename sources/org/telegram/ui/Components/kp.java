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
public final class kp extends FrameLayout {
    public final TextView[] f30121a;
    public final aj0[] f30122b;
    public final ImageView f30123c;
    public AnimatorSet d;
    public ig f30124e;
    public float f30125f;
    public final org.telegram.ui.ActionBar.c6 h;

    public kp(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        float f9;
        float f10;
        this.f30121a = new TextView[2];
        this.f30122b = new aj0[2];
        this.h = c6Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23301qf, c6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(frameLayout, i7.f6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f30122b[i10] = new ImageView(activity);
            this.f30122b[i10].setScaleType(ImageView.ScaleType.CENTER);
            aj0 aj0Var = this.f30122b[i10];
            if (i10 == 0) {
                f9 = 0.0f;
            } else {
                f9 = 24.0f;
            }
            frameLayout.addView(aj0Var, i7.f6.d(24, 24.0f, 51, 0.0f, f9, 0.0f, 0.0f));
            this.f30121a[i10] = new TextView(activity);
            this.f30121a[i10].setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.pf, this.h));
            this.f30121a[i10].setTextSize(1, 14.0f);
            this.f30121a[i10].setMaxLines(1);
            this.f30121a[i10].setSingleLine(true);
            this.f30121a[i10].setMaxWidth(AndroidUtilities.dp(250.0f));
            this.f30121a[i10].setGravity(51);
            this.f30121a[i10].setPivotX(0.0f);
            TextView textView = this.f30121a[i10];
            if (i10 == 0) {
                f10 = 2.0f;
            } else {
                f10 = 26.0f;
            }
            frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 32.0f, f10, 10.0f, 0.0f));
            if (i10 == 0) {
                this.f30122b[i10].f(R.raw.ticks_single, 24, 24, null);
                this.f30121a[i10].setText(LocaleController.getString(R.string.HintSent));
            } else {
                this.f30122b[i10].f(R.raw.ticks_double, 24, 24, null);
                this.f30121a[i10].setText(LocaleController.getString(R.string.HintRead));
            }
            this.f30122b[i10].d();
        }
        ImageView imageView = new ImageView(activity);
        this.f30123c = imageView;
        imageView.setImageResource(R.drawable.tooltip_arrow);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23301qf, this.h), PorterDuff.Mode.MULTIPLY));
        addView(imageView, i7.f6.d(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        ig igVar = this.f30124e;
        if (igVar != null) {
            AndroidUtilities.cancelRunOnUIThread(igVar);
            this.f30124e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.0f));
        this.d.addListener(new jp(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f30125f;
    }
}
