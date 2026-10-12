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
public final class dq extends FrameLayout {
    public final TextView[] f24469a;
    public final bk0[] f24470b;
    public final ImageView f24471c;
    public AnimatorSet d;
    public qg e;
    public float f24472f;
    public final org.telegram.ui.ActionBar.c6 h;

    public dq(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        float f7;
        float f10;
        this.f24469a = new TextView[2];
        this.f24470b = new bk0[2];
        this.h = c6Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20147qf, c6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(frameLayout, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 6.0f, -2, 51));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f24470b[i10] = new ImageView(activity);
            this.f24470b[i10].setScaleType(ImageView.ScaleType.CENTER);
            bk0 bk0Var = this.f24470b[i10];
            if (i10 == 0) {
                f7 = 0.0f;
            } else {
                f7 = 24.0f;
            }
            frameLayout.addView(bk0Var, w7.a6.a(24.0f, 0.0f, f7, 0.0f, 0.0f, 24, 51));
            this.f24469a[i10] = new TextView(activity);
            this.f24469a[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20128pf, this.h));
            this.f24469a[i10].setTextSize(1, 14.0f);
            this.f24469a[i10].setMaxLines(1);
            this.f24469a[i10].setSingleLine(true);
            this.f24469a[i10].setMaxWidth(AndroidUtilities.dp(250.0f));
            this.f24469a[i10].setGravity(51);
            this.f24469a[i10].setPivotX(0.0f);
            TextView textView = this.f24469a[i10];
            if (i10 == 0) {
                f10 = 2.0f;
            } else {
                f10 = 26.0f;
            }
            frameLayout.addView(textView, w7.a6.a(-2.0f, 32.0f, f10, 10.0f, 0.0f, -2, 51));
            if (i10 == 0) {
                this.f24470b[i10].f(R.raw.ticks_single, 24, 24, null);
                this.f24469a[i10].setText(LocaleController.getString(R.string.HintSent));
            } else {
                this.f24470b[i10].f(R.raw.ticks_double, 24, 24, null);
                this.f24469a[i10].setText(LocaleController.getString(R.string.HintRead));
            }
            this.f24470b[i10].d();
        }
        ImageView imageView = new ImageView(activity);
        this.f24471c = imageView;
        imageView.setImageResource(R.drawable.tooltip_arrow);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20147qf, this.h), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.a6.a(6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 14, 83));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        qg qgVar = this.e;
        if (qgVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qgVar);
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
        this.d.addListener(new cq(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f24472f;
    }
}
