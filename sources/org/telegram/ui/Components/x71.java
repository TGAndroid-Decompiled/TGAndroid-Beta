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
public final class x71 extends org.telegram.ui.ActionBar.k3 {
    public final Drawable f34652b;
    public final w71 f34653c;
    public AnimatorSet d;
    public final View e;
    public final LinearLayout f34654f;
    public int h;
    public final int[] f34655n;

    public x71(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        this.f34655n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f34652b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, false), PorterDuff.Mode.MULTIPLY));
        bh.r rVar = new bh.r(this, context, 27);
        rVar.setWillNotDraw(false);
        this.containerView = rVar;
        w71 w71Var = new w71(this, context);
        this.f34653c = w71Var;
        w71Var.setFillViewport(true);
        w71Var.setWillNotDraw(false);
        w71Var.setClipToPadding(false);
        w71Var.setVerticalScrollBarEnabled(false);
        rVar.addView(w71Var, gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34654f = linearLayout;
        linearLayout.setOrientation(1);
        w71Var.addView(linearLayout, gb1.B(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.vh.j(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.y6.f23462j5;
        textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, gb1.x(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23612r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i11 = org.telegram.ui.ActionBar.y6.f23481k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, gb1.x(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, gb1.x(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        rVar.addView(view, layoutParams);
        fi.d dVar = new fi.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.i(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new k51(3, this, downloadedUpdateFile));
        } else {
            dVar.i(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final x71 f33593b;

                {
                    this.f33593b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            x71 x71Var = this.f33593b;
                            x71Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            x71Var.dismiss();
                            return;
                        default:
                            this.f33593b.dismiss();
                            return;
                    }
                }
            });
        }
        rVar.addView(dVar, gb1.h(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        fi.d dVar2 = new fi.d(context, null, false);
        dVar2.i(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final x71 f33593b;

            {
                this.f33593b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x71 x71Var = this.f33593b;
                        x71Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        x71Var.dismiss();
                        return;
                    default:
                        this.f33593b.dismiss();
                        return;
                }
            }
        });
        rVar.addView(dVar2, gb1.h(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void m(x71 x71Var) {
        LinearLayout linearLayout = x71Var.f34654f;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = x71Var.f34655n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= x71Var.containerView.getTranslationY() + (x71Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            x71Var.o(false);
        } else {
            x71Var.o(true);
        }
        if (x71Var.h != max) {
            x71Var.h = max;
            x71Var.f34653c.invalidate();
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
            this.d.addListener(new org.telegram.ui.jo(24, this, z10));
            this.d.start();
        }
    }
}
