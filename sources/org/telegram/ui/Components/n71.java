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
public final class n71 extends org.telegram.ui.ActionBar.e3 {
    public final Drawable f27295b;
    public final m71 f27296c;
    public AnimatorSet d;
    public final View e;
    public final LinearLayout f27297f;
    public int h;
    public final int[] f27298n;

    public n71(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        this.f27298n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f27295b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false), PorterDuff.Mode.MULTIPLY));
        ah.x xVar = new ah.x(this, context, 23);
        xVar.setWillNotDraw(false);
        this.containerView = xVar;
        m71 m71Var = new m71(this, context);
        this.f27296c = m71Var;
        m71Var.setFillViewport(true);
        m71Var.setWillNotDraw(false);
        m71Var.setClipToPadding(false);
        m71Var.setVerticalScrollBarEnabled(false);
        xVar.addView(m71Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 130.0f, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f27297f = linearLayout;
        linearLayout.setOrientation(1);
        m71Var.addView(linearLayout, w7.z5.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.sk.k(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.g6.f19707j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19857r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i11 = org.telegram.ui.ActionBar.g6.f19727k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, w7.z5.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        xVar.addView(view, layoutParams);
        di.d dVar = new di.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new rt(22, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final n71 f26633b;

                {
                    this.f26633b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            n71 n71Var = this.f26633b;
                            n71Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            n71Var.dismiss();
                            return;
                        default:
                            this.f26633b.dismiss();
                            return;
                    }
                }
            });
        }
        xVar.addView(dVar, w7.z5.a(48.0f, 20.0f, 0.0f, 20.0f, 60.0f, -1, 87));
        di.d dVar2 = new di.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final n71 f26633b;

            {
                this.f26633b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        n71 n71Var = this.f26633b;
                        n71Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        n71Var.dismiss();
                        return;
                    default:
                        this.f26633b.dismiss();
                        return;
                }
            }
        });
        xVar.addView(dVar2, w7.z5.a(48.0f, 20.0f, 4.0f, 20.0f, 8.0f, -1, 87));
    }

    public static void n(n71 n71Var) {
        LinearLayout linearLayout = n71Var.f27297f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = n71Var.f27298n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= n71Var.containerView.getTranslationY() + (n71Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            n71Var.q(false);
        } else {
            n71Var.q(true);
        }
        if (n71Var.h != max) {
            n71Var.h = max;
            n71Var.f27296c.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void q(boolean z10) {
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
            this.d.addListener(new org.telegram.ui.vo(24, this, z10));
            this.d.start();
        }
    }
}
