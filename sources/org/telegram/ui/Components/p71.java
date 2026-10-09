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
public final class p71 extends org.telegram.ui.ActionBar.f3 {
    public final Drawable f29752b;
    public final o71 f29753c;
    public AnimatorSet d;
    public final View f29754e;
    public final LinearLayout f29755f;
    public int h;
    public final int[] f29756n;

    public p71(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        this.f29756n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f29752b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false), PorterDuff.Mode.MULTIPLY));
        ai.f0 f0Var = new ai.f0(this, context, 22);
        f0Var.setWillNotDraw(false);
        this.containerView = f0Var;
        o71 o71Var = new o71(this, context);
        this.f29753c = o71Var;
        o71Var.setFillViewport(true);
        o71Var.setWillNotDraw(false);
        o71Var.setClipToPadding(false);
        o71Var.setVerticalScrollBarEnabled(false);
        f0Var.addView(o71Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 130.0f, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f29755f = linearLayout;
        linearLayout.setOrientation(1);
        o71Var.addView(linearLayout, w7.x5.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.bi.k(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.i6.f20905j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21054r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i11 = org.telegram.ui.ActionBar.i6.f20924k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, w7.x5.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.f29754e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        f0Var.addView(view, layoutParams);
        ci.d dVar = new ci.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new ut(22, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final p71 f29064b;

                {
                    this.f29064b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            p71 p71Var = this.f29064b;
                            p71Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            p71Var.dismiss();
                            return;
                        default:
                            this.f29064b.dismiss();
                            return;
                    }
                }
            });
        }
        f0Var.addView(dVar, w7.x5.a(48.0f, 20.0f, 0.0f, 20.0f, 60.0f, -1, 87));
        ci.d dVar2 = new ci.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final p71 f29064b;

            {
                this.f29064b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        p71 p71Var = this.f29064b;
                        p71Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        p71Var.dismiss();
                        return;
                    default:
                        this.f29064b.dismiss();
                        return;
                }
            }
        });
        f0Var.addView(dVar2, w7.x5.a(48.0f, 20.0f, 4.0f, 20.0f, 8.0f, -1, 87));
    }

    public static void o(p71 p71Var) {
        LinearLayout linearLayout = p71Var.f29755f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = p71Var.f29756n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= p71Var.containerView.getTranslationY() + (p71Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            p71Var.q(false);
        } else {
            p71Var.q(true);
        }
        if (p71Var.h != max) {
            p71Var.h = max;
            p71Var.f29753c.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void q(boolean z10) {
        Integer num;
        float f7;
        View view = this.f29754e;
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
            this.d.addListener(new fa(23, this, z10));
            this.d.start();
        }
    }
}
