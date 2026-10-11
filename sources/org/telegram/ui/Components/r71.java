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
public final class r71 extends org.telegram.ui.ActionBar.e3 {
    public final Drawable f30380b;
    public final q71 f30381c;
    public AnimatorSet d;
    public final View f30382e;
    public final LinearLayout f30383f;
    public int h;
    public final int[] f30384n;

    public r71(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        this.f30384n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f30380b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false), PorterDuff.Mode.MULTIPLY));
        ai.f0 f0Var = new ai.f0(this, context, 22);
        f0Var.setWillNotDraw(false);
        this.containerView = f0Var;
        q71 q71Var = new q71(this, context);
        this.f30381c = q71Var;
        q71Var.setFillViewport(true);
        q71Var.setWillNotDraw(false);
        q71Var.setClipToPadding(false);
        q71Var.setVerticalScrollBarEnabled(false);
        f0Var.addView(q71Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 130.0f, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30383f = linearLayout;
        linearLayout.setOrientation(1);
        q71Var.addView(linearLayout, w7.x5.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.ai.k(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.h6.f20894j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21044r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i11 = org.telegram.ui.ActionBar.h6.f20913k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, w7.x5.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.f30382e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.V5, false));
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
                public final r71 f29639b;

                {
                    this.f29639b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            r71 r71Var = this.f29639b;
                            r71Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            r71Var.dismiss();
                            return;
                        default:
                            this.f29639b.dismiss();
                            return;
                    }
                }
            });
        }
        f0Var.addView(dVar, w7.x5.a(48.0f, 20.0f, 0.0f, 20.0f, 60.0f, -1, 87));
        ci.d dVar2 = new ci.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final r71 f29639b;

            {
                this.f29639b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        r71 r71Var = this.f29639b;
                        r71Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        r71Var.dismiss();
                        return;
                    default:
                        this.f29639b.dismiss();
                        return;
                }
            }
        });
        f0Var.addView(dVar2, w7.x5.a(48.0f, 20.0f, 4.0f, 20.0f, 8.0f, -1, 87));
    }

    public static void o(r71 r71Var) {
        LinearLayout linearLayout = r71Var.f30383f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = r71Var.f30384n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= r71Var.containerView.getTranslationY() + (r71Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            r71Var.q(false);
        } else {
            r71Var.q(true);
        }
        if (r71Var.h != max) {
            r71Var.h = max;
            r71Var.f30381c.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void q(boolean z10) {
        Integer num;
        float f7;
        View view = this.f30382e;
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
            this.d.addListener(new ea(23, this, z10));
            this.d.start();
        }
    }
}
