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
public final class b61 extends org.telegram.ui.ActionBar.f3 {
    public final Drawable f26986b;
    public final a61 f26987c;
    public AnimatorSet d;
    public final View f26988e;
    public final LinearLayout f26989f;
    public int h;
    public final int[] f26990n;

    public b61(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        this.f26990n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f26986b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false), PorterDuff.Mode.MULTIPLY));
        z51 z51Var = new z51(this, context, 0);
        z51Var.setWillNotDraw(false);
        this.containerView = z51Var;
        a61 a61Var = new a61(this, context);
        this.f26987c = a61Var;
        a61Var.setFillViewport(true);
        a61Var.setWillNotDraw(false);
        a61Var.setClipToPadding(false);
        a61Var.setVerticalScrollBarEnabled(false);
        z51Var.addView(a61Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f26989f = linearLayout;
        linearLayout.setOrientation(1);
        a61Var.addView(linearLayout, i7.f6.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.g6.f23169j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, i7.f6.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23310r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i11 = org.telegram.ui.ActionBar.g6.f23188k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, i7.f6.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, i7.f6.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.f26988e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        z51Var.addView(view, layoutParams);
        nh.d dVar = new nh.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new fi0(10, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final b61 f34930b;

                {
                    this.f34930b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            b61 b61Var = this.f34930b;
                            b61Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            b61Var.dismiss();
                            return;
                        default:
                            this.f34930b.dismiss();
                            return;
                    }
                }
            });
        }
        z51Var.addView(dVar, i7.f6.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        nh.d dVar2 = new nh.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final b61 f34930b;

            {
                this.f34930b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        b61 b61Var = this.f34930b;
                        b61Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        b61Var.dismiss();
                        return;
                    default:
                        this.f34930b.dismiss();
                        return;
                }
            }
        });
        z51Var.addView(dVar2, i7.f6.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void m(b61 b61Var) {
        LinearLayout linearLayout = b61Var.f26989f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = b61Var.f26990n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= b61Var.containerView.getTranslationY() + (b61Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            b61Var.o(false);
        } else {
            b61Var.o(true);
        }
        if (b61Var.h != max) {
            b61Var.h = max;
            b61Var.f26987c.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o(boolean z10) {
        Integer num;
        float f9;
        View view = this.f26988e;
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
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f9));
            this.d.setDuration(150L);
            this.d.addListener(new z9(23, this, z10));
            this.d.start();
        }
    }
}
