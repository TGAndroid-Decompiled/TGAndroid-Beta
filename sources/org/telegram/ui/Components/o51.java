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
public final class o51 extends org.telegram.ui.ActionBar.f3 {
    public final Drawable f31297b;
    public final n51 f31298c;
    public AnimatorSet d;
    public final View f31299e;
    public final LinearLayout f31300f;
    public int h;
    public final int[] f31301n;

    public o51(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        this.f31301n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f31297b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false), PorterDuff.Mode.MULTIPLY));
        fh.d2 d2Var = new fh.d2(this, context, 25);
        d2Var.setWillNotDraw(false);
        this.containerView = d2Var;
        n51 n51Var = new n51(this, context);
        this.f31298c = n51Var;
        n51Var.setFillViewport(true);
        n51Var.setWillNotDraw(false);
        n51Var.setClipToPadding(false);
        n51Var.setVerticalScrollBarEnabled(false);
        d2Var.addView(n51Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31300f = linearLayout;
        linearLayout.setOrientation(1);
        n51Var.addView(linearLayout, g7.e6.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.k(20.0f, 1, textView);
        int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, g7.e6.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23247r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i10 = org.telegram.ui.ActionBar.f6.f23126k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, g7.e6.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, g7.e6.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.f31299e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        d2Var.addView(view, layoutParams);
        kh.d dVar = new kh.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new vh0(9, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final o51 f30699b;

                {
                    this.f30699b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            o51 o51Var = this.f30699b;
                            o51Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            o51Var.dismiss();
                            return;
                        default:
                            this.f30699b.dismiss();
                            return;
                    }
                }
            });
        }
        d2Var.addView(dVar, g7.e6.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        kh.d dVar2 = new kh.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final o51 f30699b;

            {
                this.f30699b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        o51 o51Var = this.f30699b;
                        o51Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        o51Var.dismiss();
                        return;
                    default:
                        this.f30699b.dismiss();
                        return;
                }
            }
        });
        d2Var.addView(dVar2, g7.e6.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void m(o51 o51Var) {
        LinearLayout linearLayout = o51Var.f31300f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = o51Var.f31301n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= o51Var.containerView.getTranslationY() + (o51Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            o51Var.o(false);
        } else {
            o51Var.o(true);
        }
        if (o51Var.h != max) {
            o51Var.h = max;
            o51Var.f31298c.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o(boolean z10) {
        Integer num;
        float f10;
        View view = this.f31299e;
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
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.d.setDuration(150L);
            this.d.addListener(new u9(23, this, z10));
            this.d.start();
        }
    }
}
