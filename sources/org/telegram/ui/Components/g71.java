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
public final class g71 extends org.telegram.ui.ActionBar.f3 {
    public final Drawable f26517b;
    public final f71 f26518c;
    public AnimatorSet d;
    public final View e;
    public final LinearLayout f26519f;
    public int h;
    public final int[] f26520n;

    public g71(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        this.f26520n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f26517b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21060h5, false), PorterDuff.Mode.MULTIPLY));
        ah.x xVar = new ah.x(this, context, 25);
        xVar.setWillNotDraw(false);
        this.containerView = xVar;
        f71 f71Var = new f71(this, context);
        this.f26518c = f71Var;
        f71Var.setFillViewport(true);
        f71Var.setWillNotDraw(false);
        f71Var.setClipToPadding(false);
        f71Var.setVerticalScrollBarEnabled(false);
        xVar.addView(f71Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f26519f = linearLayout;
        linearLayout.setOrientation(1);
        f71Var.addView(linearLayout, w7.z5.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.lk.k(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.h6.f21095j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21245r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i11 = org.telegram.ui.ActionBar.h6.f21115k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, w7.z5.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        xVar.addView(view, layoutParams);
        ei.d dVar = new ei.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new h51(2, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final g71 f25839b;

                {
                    this.f25839b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            g71 g71Var = this.f25839b;
                            g71Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            g71Var.dismiss();
                            return;
                        default:
                            this.f25839b.dismiss();
                            return;
                    }
                }
            });
        }
        xVar.addView(dVar, w7.z5.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        ei.d dVar2 = new ei.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final g71 f25839b;

            {
                this.f25839b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        g71 g71Var = this.f25839b;
                        g71Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        g71Var.dismiss();
                        return;
                    default:
                        this.f25839b.dismiss();
                        return;
                }
            }
        });
        xVar.addView(dVar2, w7.z5.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void n(g71 g71Var) {
        LinearLayout linearLayout = g71Var.f26519f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = g71Var.f26520n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= g71Var.containerView.getTranslationY() + (g71Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            g71Var.p(false);
        } else {
            g71Var.p(true);
        }
        if (g71Var.h != max) {
            g71Var.h = max;
            g71Var.f26518c.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
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
            this.d.addListener(new org.telegram.ui.fo(24, this, z10));
            this.d.start();
        }
    }
}
