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

public final class q51 extends org.telegram.ui.ActionBar.e3 {

    public final Drawable f31800b;

    public final p51 f31801c;
    public AnimatorSet d;

    public final View f31802e;

    public final LinearLayout f31803f;
    public int h;

    public final int[] f31804n;

    public q51(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        final int i10 = 0;
        this.f31804n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f31800b = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false), PorterDuff.Mode.MULTIPLY));
        ag.p1 p1Var = new ag.p1(this, context, 28);
        p1Var.setWillNotDraw(false);
        this.containerView = p1Var;
        p51 p51Var = new p51(this, context);
        this.f31801c = p51Var;
        final int i11 = 1;
        p51Var.setFillViewport(true);
        p51Var.setWillNotDraw(false);
        p51Var.setClipToPadding(false);
        p51Var.setVerticalScrollBarEnabled(false);
        p1Var.addView(p51Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31803f = linearLayout;
        linearLayout.setOrientation(1);
        p51Var.addView(linearLayout, h7.z5.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.h(20.0f, 1, textView);
        int i12 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, h7.z5.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23300r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i13 = org.telegram.ui.ActionBar.g6.f23180k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, h7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, h7.z5.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.f31802e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        p1Var.addView(view, layoutParams);
        lh.d dVar = new lh.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new xh0(10, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {

                public final q51 f31170b;

                {
                    this.f31170b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            q51 q51Var = this.f31170b;
                            q51Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            q51Var.dismiss();
                            break;
                        default:
                            this.f31170b.dismiss();
                            break;
                    }
                }
            });
        }
        p1Var.addView(dVar, h7.z5.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        lh.d dVar2 = new lh.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {

            public final q51 f31170b;

            {
                this.f31170b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        q51 q51Var = this.f31170b;
                        q51Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        q51Var.dismiss();
                        break;
                    default:
                        this.f31170b.dismiss();
                        break;
                }
            }
        });
        p1Var.addView(dVar2, h7.z5.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void m(q51 q51Var) {
        LinearLayout linearLayout = q51Var.f31803f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = q51Var.f31804n;
        childAt.getLocationInWindow(iArr);
        int iMax = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= q51Var.containerView.getTranslationY() + (q51Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            q51Var.p(false);
        } else {
            q51Var.p(true);
        }
        if (q51Var.h != iMax) {
            q51Var.h = iMax;
            q51Var.f31801c.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void p(boolean z10) {
        View view = this.f31802e;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.d.setDuration(150L);
        this.d.addListener(new org.telegram.ui.go(24, this, z10));
        this.d.start();
    }
}
