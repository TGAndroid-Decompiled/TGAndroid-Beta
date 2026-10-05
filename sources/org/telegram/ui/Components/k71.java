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
public final class k71 extends org.telegram.ui.ActionBar.f3 {
    public final Drawable f28078b;
    public final j71 f28079c;
    public AnimatorSet d;
    public final View f28080e;
    public final LinearLayout f28081f;
    public int h;
    public final int[] f28082n;

    public k71(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        this.f28082n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f28078b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20899h5, false), PorterDuff.Mode.MULTIPLY));
        ai.f0 f0Var = new ai.f0(this, context, 23);
        f0Var.setWillNotDraw(false);
        this.containerView = f0Var;
        j71 j71Var = new j71(this, context);
        this.f28079c = j71Var;
        j71Var.setFillViewport(true);
        j71Var.setWillNotDraw(false);
        j71Var.setClipToPadding(false);
        j71Var.setVerticalScrollBarEnabled(false);
        f0Var.addView(j71Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f28081f = linearLayout;
        linearLayout.setOrientation(1);
        j71Var.addView(linearLayout, w7.z5.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.bi.j(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.i6.f20935j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21086r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i11 = org.telegram.ui.ActionBar.i6.f20955k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, w7.z5.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.f28080e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        f0Var.addView(view, layoutParams);
        ci.d dVar = new ci.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new gt(22, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final k71 f27417b;

                {
                    this.f27417b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            k71 k71Var = this.f27417b;
                            k71Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            k71Var.dismiss();
                            return;
                        default:
                            this.f27417b.dismiss();
                            return;
                    }
                }
            });
        }
        f0Var.addView(dVar, w7.z5.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        ci.d dVar2 = new ci.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final k71 f27417b;

            {
                this.f27417b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        k71 k71Var = this.f27417b;
                        k71Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        k71Var.dismiss();
                        return;
                    default:
                        this.f27417b.dismiss();
                        return;
                }
            }
        });
        f0Var.addView(dVar2, w7.z5.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void m(k71 k71Var) {
        LinearLayout linearLayout = k71Var.f28081f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = k71Var.f28082n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= k71Var.containerView.getTranslationY() + (k71Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            k71Var.o(false);
        } else {
            k71Var.o(true);
        }
        if (k71Var.h != max) {
            k71Var.h = max;
            k71Var.f28079c.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o(boolean z10) {
        Integer num;
        float f7;
        View view = this.f28080e;
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
            this.d.addListener(new da(23, this, z10));
            this.d.start();
        }
    }
}
