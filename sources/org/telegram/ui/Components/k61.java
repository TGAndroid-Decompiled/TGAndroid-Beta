package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class k61 extends org.telegram.ui.ActionBar.f3 {
    public final Drawable f25554b;
    public final j61 f25555c;
    public AnimatorSet d;
    public final View e;
    public final LinearLayout f25556f;
    public int h;
    public final int[] f25557n;

    public k61(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        this.f25557n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f25554b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18907h5, false), PorterDuff.Mode.MULTIPLY));
        ai.f0 f0Var = new ai.f0(this, context, 22);
        f0Var.setWillNotDraw(false);
        this.containerView = f0Var;
        j61 j61Var = new j61(this, context);
        this.f25555c = j61Var;
        j61Var.setFillViewport(true);
        j61Var.setWillNotDraw(false);
        j61Var.setClipToPadding(false);
        j61Var.setVerticalScrollBarEnabled(false);
        f0Var.addView(j61Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f25556f = linearLayout;
        linearLayout.setOrientation(1);
        j61Var.addView(linearLayout, w7.x5.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.wl.j(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.i6.f18943j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19091r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i11 = org.telegram.ui.ActionBar.i6.f18963k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, w7.x5.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        f0Var.addView(view, layoutParams);
        ci.d dVar = new ci.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new dt(22, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final k61 f24911b;

                {
                    this.f24911b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            k61 k61Var = this.f24911b;
                            k61Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            k61Var.dismiss();
                            return;
                        default:
                            this.f24911b.dismiss();
                            return;
                    }
                }
            });
        }
        f0Var.addView(dVar, w7.x5.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        ci.d dVar2 = new ci.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final k61 f24911b;

            {
                this.f24911b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        k61 k61Var = this.f24911b;
                        k61Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        k61Var.dismiss();
                        return;
                    default:
                        this.f24911b.dismiss();
                        return;
                }
            }
        });
        f0Var.addView(dVar2, w7.x5.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void m(k61 k61Var) {
        LinearLayout linearLayout = k61Var.f25556f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = k61Var.f25557n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= k61Var.containerView.getTranslationY() + (k61Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            k61Var.o(false);
        } else {
            k61Var.o(true);
        }
        if (k61Var.h != max) {
            k61Var.h = max;
            k61Var.f25555c.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o(boolean z10) {
        Integer num;
        float f7;
        View view = this.e;
        if ((z10 && view.getTag() != null) || (!z10 && view.getTag() == null)) {
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z10) {
                view.setVisibility(0);
            }
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.d = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.d.setDuration(150L);
            this.d.addListener(new aa(23, this, z10));
            this.d.start();
        }
    }
}
