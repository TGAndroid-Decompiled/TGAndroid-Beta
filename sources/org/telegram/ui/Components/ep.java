package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ep extends FrameLayout {

    public final TextView[] f28110a;

    public final ri0[] f28111b;

    public final ImageView f28112c;
    public AnimatorSet d;

    public bg f28113e;

    public float f28114f;
    public final org.telegram.ui.ActionBar.c6 h;

    public ep(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f28110a = new TextView[2];
        this.f28111b = new ri0[2];
        this.h = c6Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23291qf, c6Var)));
        int i10 = 0;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(frameLayout, h7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
        while (i10 < 2) {
            this.f28111b[i10] = new ri0(activity);
            this.f28111b[i10].setScaleType(ImageView.ScaleType.CENTER);
            frameLayout.addView(this.f28111b[i10], h7.z5.d(24, 24.0f, 51, 0.0f, i10 == 0 ? 0.0f : 24.0f, 0.0f, 0.0f));
            this.f28110a[i10] = new TextView(activity);
            this.f28110a[i10].setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23274pf, this.h));
            this.f28110a[i10].setTextSize(1, 14.0f);
            this.f28110a[i10].setMaxLines(1);
            this.f28110a[i10].setSingleLine(true);
            this.f28110a[i10].setMaxWidth(AndroidUtilities.dp(250.0f));
            this.f28110a[i10].setGravity(51);
            this.f28110a[i10].setPivotX(0.0f);
            frameLayout.addView(this.f28110a[i10], h7.z5.d(-2, -2.0f, 51, 32.0f, i10 == 0 ? 2.0f : 26.0f, 10.0f, 0.0f));
            if (i10 == 0) {
                this.f28111b[i10].f(R.raw.ticks_single, 24, 24, null);
                this.f28110a[i10].setText(LocaleController.getString(R.string.HintSent));
            } else {
                this.f28111b[i10].f(R.raw.ticks_double, 24, 24, null);
                this.f28110a[i10].setText(LocaleController.getString(R.string.HintRead));
            }
            this.f28111b[i10].d();
            i10++;
        }
        ImageView imageView = new ImageView(activity);
        this.f28112c = imageView;
        imageView.setImageResource(R.drawable.tooltip_arrow);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23291qf, this.h), PorterDuff.Mode.MULTIPLY));
        addView(imageView, h7.z5.d(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        bg bgVar = this.f28113e;
        if (bgVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bgVar);
            this.f28113e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<ep, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, (Property<ep, Float>) View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, (Property<ep, Float>) View.SCALE_Y, 0.0f));
        this.d.addListener(new dp(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f28114f;
    }
}
