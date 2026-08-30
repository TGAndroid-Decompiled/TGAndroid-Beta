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
public final class m61 extends org.telegram.ui.ActionBar.g3 {
    public final Drawable f26952b;
    public final l61 f26953c;
    public AnimatorSet d;
    public final View e;
    public final LinearLayout f26954f;
    public int h;
    public final int[] f26955n;

    public m61(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        this.f26955n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f26952b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19977h5, false), PorterDuff.Mode.MULTIPLY));
        dg.u2 u2Var = new dg.u2(this, context, 28);
        u2Var.setWillNotDraw(false);
        this.containerView = u2Var;
        l61 l61Var = new l61(this, context);
        this.f26953c = l61Var;
        l61Var.setFillViewport(true);
        l61Var.setWillNotDraw(false);
        l61Var.setClipToPadding(false);
        l61Var.setVerticalScrollBarEnabled(false);
        u2Var.addView(l61Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f26954f = linearLayout;
        linearLayout.setOrientation(1);
        l61Var.addView(linearLayout, k7.b6.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.j6.f20012j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, k7.b6.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20157r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i11 = org.telegram.ui.ActionBar.j6.f20030k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, k7.b6.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, k7.b6.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        u2Var.addView(view, layoutParams);
        ph.d dVar = new ph.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new rx0(7, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final m61 f26174b;

                {
                    this.f26174b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            m61 m61Var = this.f26174b;
                            m61Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            m61Var.dismiss();
                            return;
                        default:
                            this.f26174b.dismiss();
                            return;
                    }
                }
            });
        }
        u2Var.addView(dVar, k7.b6.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        ph.d dVar2 = new ph.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final m61 f26174b;

            {
                this.f26174b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        m61 m61Var = this.f26174b;
                        m61Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        m61Var.dismiss();
                        return;
                    default:
                        this.f26174b.dismiss();
                        return;
                }
            }
        });
        u2Var.addView(dVar2, k7.b6.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void m(m61 m61Var) {
        LinearLayout linearLayout = m61Var.f26954f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = m61Var.f26955n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= m61Var.containerView.getTranslationY() + (m61Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            m61Var.o(false);
        } else {
            m61Var.o(true);
        }
        if (m61Var.h != max) {
            m61Var.h = max;
            m61Var.f26953c.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o(boolean z4) {
        Integer num;
        float f10;
        View view = this.e;
        if ((z4 && view.getTag() != null) || (!z4 && view.getTag() == null)) {
            if (z4) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z4) {
                view.setVisibility(0);
            }
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.d = animatorSet2;
            Property property = View.ALPHA;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.d.setDuration(150L);
            this.d.addListener(new l00(15, this, z4));
            this.d.start();
        }
    }
}
