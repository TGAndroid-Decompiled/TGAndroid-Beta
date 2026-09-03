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
public final class np extends FrameLayout {
    public final TextView[] f27344a;
    public final jj0[] f27345b;
    public final ImageView f27346c;
    public AnimatorSet d;
    public fg e;
    public float f27347f;
    public final org.telegram.ui.ActionBar.f6 h;

    public np(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        float f10;
        float f11;
        this.f27344a = new TextView[2];
        this.f27345b = new jj0[2];
        this.h = f6Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.qf, f6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(frameLayout, k7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f27345b[i10] = new ImageView(activity);
            this.f27345b[i10].setScaleType(ImageView.ScaleType.CENTER);
            jj0 jj0Var = this.f27345b[i10];
            if (i10 == 0) {
                f10 = 0.0f;
            } else {
                f10 = 24.0f;
            }
            frameLayout.addView(jj0Var, k7.b6.d(24, 24.0f, 51, 0.0f, f10, 0.0f, 0.0f));
            this.f27344a[i10] = new TextView(activity);
            this.f27344a[i10].setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20105pf, this.h));
            this.f27344a[i10].setTextSize(1, 14.0f);
            this.f27344a[i10].setMaxLines(1);
            this.f27344a[i10].setSingleLine(true);
            this.f27344a[i10].setMaxWidth(AndroidUtilities.dp(250.0f));
            this.f27344a[i10].setGravity(51);
            this.f27344a[i10].setPivotX(0.0f);
            TextView textView = this.f27344a[i10];
            if (i10 == 0) {
                f11 = 2.0f;
            } else {
                f11 = 26.0f;
            }
            frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 51, 32.0f, f11, 10.0f, 0.0f));
            if (i10 == 0) {
                this.f27345b[i10].f(R.raw.ticks_single, 24, 24, null);
                this.f27344a[i10].setText(LocaleController.getString(R.string.HintSent));
            } else {
                this.f27345b[i10].f(R.raw.ticks_double, 24, 24, null);
                this.f27344a[i10].setText(LocaleController.getString(R.string.HintRead));
            }
            this.f27345b[i10].d();
        }
        ImageView imageView = new ImageView(activity);
        this.f27346c = imageView;
        imageView.setImageResource(R.drawable.tooltip_arrow);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.qf, this.h), PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.b6.d(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        fg fgVar = this.e;
        if (fgVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fgVar);
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
        this.d.addListener(new mp(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f27347f;
    }
}
