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
public final class q71 extends org.telegram.ui.ActionBar.f3 {
    public final Drawable f30079b;
    public final p71 f30080c;
    public AnimatorSet d;
    public final View f30081e;
    public final LinearLayout f30082f;
    public int h;
    public final int[] f30083n;

    public q71(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        this.f30083n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f30079b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false), PorterDuff.Mode.MULTIPLY));
        ai.f0 f0Var = new ai.f0(this, context, 22);
        f0Var.setWillNotDraw(false);
        this.containerView = f0Var;
        p71 p71Var = new p71(this, context);
        this.f30080c = p71Var;
        p71Var.setFillViewport(true);
        p71Var.setWillNotDraw(false);
        p71Var.setClipToPadding(false);
        p71Var.setVerticalScrollBarEnabled(false);
        f0Var.addView(p71Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 130.0f, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30082f = linearLayout;
        linearLayout.setOrientation(1);
        p71Var.addView(linearLayout, w7.x5.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.bi.k(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.i6.f20909j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21058r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i11 = org.telegram.ui.ActionBar.i6.f20928k5;
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
        this.f30081e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        f0Var.addView(view, layoutParams);
        ci.d dVar = new ci.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new vt(22, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final q71 f29365b;

                {
                    this.f29365b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            q71 q71Var = this.f29365b;
                            q71Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            q71Var.dismiss();
                            return;
                        default:
                            this.f29365b.dismiss();
                            return;
                    }
                }
            });
        }
        f0Var.addView(dVar, w7.x5.a(48.0f, 20.0f, 0.0f, 20.0f, 60.0f, -1, 87));
        ci.d dVar2 = new ci.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final q71 f29365b;

            {
                this.f29365b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        q71 q71Var = this.f29365b;
                        q71Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        q71Var.dismiss();
                        return;
                    default:
                        this.f29365b.dismiss();
                        return;
                }
            }
        });
        f0Var.addView(dVar2, w7.x5.a(48.0f, 20.0f, 4.0f, 20.0f, 8.0f, -1, 87));
    }

    public static void o(q71 q71Var) {
        LinearLayout linearLayout = q71Var.f30082f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = q71Var.f30083n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= q71Var.containerView.getTranslationY() + (q71Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            q71Var.q(false);
        } else {
            q71Var.q(true);
        }
        if (q71Var.h != max) {
            q71Var.h = max;
            q71Var.f30080c.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void q(boolean z10) {
        Integer num;
        float f7;
        View view = this.f30081e;
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
