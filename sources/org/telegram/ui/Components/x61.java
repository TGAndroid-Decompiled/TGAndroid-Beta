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
public final class x61 extends org.telegram.ui.ActionBar.h3 {
    public final Drawable f28959b;
    public final w61 f28960c;
    public AnimatorSet d;
    public final View e;
    public final LinearLayout f28961f;
    public int h;
    public final int[] f28962n;

    public x61(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        this.f28962n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f28959b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false), PorterDuff.Mode.MULTIPLY));
        bi.ld ldVar = new bi.ld(this, context, 20);
        ldVar.setWillNotDraw(false);
        this.containerView = ldVar;
        w61 w61Var = new w61(this, context);
        this.f28960c = w61Var;
        w61Var.setFillViewport(true);
        w61Var.setWillNotDraw(false);
        w61Var.setClipToPadding(false);
        w61Var.setVerticalScrollBarEnabled(false);
        ldVar.addView(w61Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f28961f = linearLayout;
        linearLayout.setOrientation(1);
        w61Var.addView(linearLayout, w7.a6.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.em.j(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.j6.f18034j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, w7.a6.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18179r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i11 = org.telegram.ui.ActionBar.j6.f18054k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, w7.a6.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        ldVar.addView(view, layoutParams);
        bi.d dVar = new bi.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new u10(19, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final x61 f27848b;

                {
                    this.f27848b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            x61 x61Var = this.f27848b;
                            x61Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            x61Var.dismiss();
                            return;
                        default:
                            this.f27848b.dismiss();
                            return;
                    }
                }
            });
        }
        ldVar.addView(dVar, w7.a6.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        bi.d dVar2 = new bi.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final x61 f27848b;

            {
                this.f27848b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x61 x61Var = this.f27848b;
                        x61Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        x61Var.dismiss();
                        return;
                    default:
                        this.f27848b.dismiss();
                        return;
                }
            }
        });
        ldVar.addView(dVar2, w7.a6.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void m(x61 x61Var) {
        LinearLayout linearLayout = x61Var.f28961f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = x61Var.f28962n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= x61Var.containerView.getTranslationY() + (x61Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            x61Var.o(false);
        } else {
            x61Var.o(true);
        }
        if (x61Var.h != max) {
            x61Var.h = max;
            x61Var.f28960c.invalidate();
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
            this.d.addListener(new yo(19, this, z10));
            this.d.start();
        }
    }
}
