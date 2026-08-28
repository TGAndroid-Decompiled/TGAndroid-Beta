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
public final class gp extends FrameLayout {
    public final TextView[] f28831a;
    public final pi0[] f28832b;
    public final ImageView f28833c;
    public AnimatorSet d;
    public fg f28834e;
    public float f28835f;
    public final org.telegram.ui.ActionBar.b6 h;

    public gp(Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        float f10;
        float f11;
        this.f28831a = new TextView[2];
        this.f28832b = new pi0[2];
        this.h = b6Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23238qf, b6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(frameLayout, g7.e6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
        for (int i9 = 0; i9 < 2; i9++) {
            this.f28832b[i9] = new ImageView(activity);
            this.f28832b[i9].setScaleType(ImageView.ScaleType.CENTER);
            pi0 pi0Var = this.f28832b[i9];
            if (i9 == 0) {
                f10 = 0.0f;
            } else {
                f10 = 24.0f;
            }
            frameLayout.addView(pi0Var, g7.e6.d(24, 24.0f, 51, 0.0f, f10, 0.0f, 0.0f));
            this.f28831a[i9] = new TextView(activity);
            this.f28831a[i9].setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23219pf, this.h));
            this.f28831a[i9].setTextSize(1, 14.0f);
            this.f28831a[i9].setMaxLines(1);
            this.f28831a[i9].setSingleLine(true);
            this.f28831a[i9].setMaxWidth(AndroidUtilities.dp(250.0f));
            this.f28831a[i9].setGravity(51);
            this.f28831a[i9].setPivotX(0.0f);
            TextView textView = this.f28831a[i9];
            if (i9 == 0) {
                f11 = 2.0f;
            } else {
                f11 = 26.0f;
            }
            frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 32.0f, f11, 10.0f, 0.0f));
            if (i9 == 0) {
                this.f28832b[i9].f(R.raw.ticks_single, 24, 24, null);
                this.f28831a[i9].setText(LocaleController.getString(R.string.HintSent));
            } else {
                this.f28832b[i9].f(R.raw.ticks_double, 24, 24, null);
                this.f28831a[i9].setText(LocaleController.getString(R.string.HintRead));
            }
            this.f28832b[i9].d();
        }
        ImageView imageView = new ImageView(activity);
        this.f28833c = imageView;
        imageView.setImageResource(R.drawable.tooltip_arrow);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23238qf, this.h), PorterDuff.Mode.MULTIPLY));
        addView(imageView, g7.e6.d(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        fg fgVar = this.f28834e;
        if (fgVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fgVar);
            this.f28834e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.0f));
        this.d.addListener(new fp(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f28835f;
    }
}
