package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class c31 extends org.telegram.ui.Components.bb {
    public final LinearLayout X;
    public final org.telegram.ui.Components.zq Y;
    public final org.telegram.ui.Components.aa0 Z;
    public org.telegram.ui.Components.k71 f38166a0;

    public c31(Context context, boolean z10, org.telegram.ui.ActionBar.u6 u6Var, Utilities.Callback callback) {
        super(context, null, false, false, u6Var);
        org.telegram.ui.ActionBar.u6 u6Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        fixNavigationBar();
        this.v = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i17 = org.telegram.ui.ActionBar.y6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i17, u6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.large_ads_info);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.y6.w0(i17, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i17);
        imageView.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(imageView, K, N, null, u6Var);
        frameLayout.addView(imageView, org.telegram.ui.Components.kb1.h(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (callback != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.f23615r5, null, PorterDuff.Mode.SRC_ATOP);
            int i18 = org.telegram.ui.ActionBar.y6.f23449i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i18, false), 1, -1);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i18);
            imageView2.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(imageView2, g02, null, N2, null);
            u6Var2 = u6Var;
            imageView2.setOnClickListener(new di.c4(this, callback, u6Var, imageView2, 15));
            frameLayout.addView(imageView2, org.telegram.ui.Components.kb1.h(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            u6Var2 = u6Var;
        }
        linearLayout.addView(frameLayout, org.telegram.ui.Components.kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i19 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i19, u6Var2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView e = org.telegram.messenger.wh.e(linearLayout, textView, org.telegram.ui.Components.kb1.x(-2, -2, 1, 22, 14, 22, 0), context);
        e.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        org.telegram.ui.ActionBar.f7.V(e, i19, u6Var2);
        e.setTextSize(1, 14.0f);
        e.setGravity(1);
        linearLayout.addView(e, org.telegram.ui.Components.kb1.x(-2, -2, 1, 22, 8, 22, 0));
        int i20 = R.drawable.menu_privacy;
        if (z10) {
            i10 = R.string.RevenueSharingAdsInfo1TitleBot;
        } else {
            i10 = R.string.RevenueSharingAdsInfo1Title;
        }
        String string = LocaleController.getString(i10);
        if (z10) {
            i11 = R.string.RevenueSharingAdsInfo1SubtitleBot;
        } else {
            i11 = R.string.RevenueSharingAdsInfo1Subtitle;
        }
        linearLayout.addView(new di.i4(this, context, i20, string, LocaleController.getString(i11)), org.telegram.ui.Components.kb1.t(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        int i21 = R.drawable.menu_feature_split;
        if (z10) {
            i12 = R.string.RevenueSharingAdsInfo2TitleBot;
        } else {
            i12 = R.string.RevenueSharingAdsInfo2Title;
        }
        String string2 = LocaleController.getString(i12);
        if (z10) {
            i13 = R.string.RevenueSharingAdsInfo2SubtitleBot;
        } else {
            i13 = R.string.RevenueSharingAdsInfo2Subtitle;
        }
        linearLayout.addView(new di.i4(this, context, i21, string2, LocaleController.getString(i13)), org.telegram.ui.Components.kb1.t(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        if (z10) {
            i14 = R.string.RevenueSharingAdsInfo3SubtitleBot;
        } else {
            i14 = R.string.RevenueSharingAdsInfo3Subtitle;
        }
        String formatString = LocaleController.formatString(i14, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i22 = org.telegram.ui.ActionBar.y6.gc;
        linearLayout.addView(new di.i4(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(formatString, i22, 0, new Runnable(this) {
            public final c31 f37877b;

            {
                this.f37877b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        c31 c31Var = this.f37877b;
                        c31Var.getClass();
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.m0(3)));
                            c31Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        c31 c31Var2 = this.f37877b;
                        c31Var2.dismiss();
                        qf.d.r(c31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        return;
                }
            }
        })), org.telegram.ui.Components.kb1.t(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23358d7, view, u6Var2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        if (z10) {
            i15 = R.string.RevenueSharingAdsInfo4TitleBot;
        } else {
            i15 = R.string.RevenueSharingAdsInfo4Title;
        }
        textView2.setText(LocaleController.getString(i15));
        textView2.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.V(textView2, i19, u6Var2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, org.telegram.ui.Components.kb1.x(-2, -2, 1, 22, 0, 22, 0));
        if (z10) {
            i16 = R.string.RevenueSharingAdsInfo4Subtitle2Bot;
        } else {
            i16 = R.string.RevenueSharingAdsInfo4Subtitle2;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i16));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i22, 0, new Runnable(this) {
            public final c31 f37877b;

            {
                this.f37877b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        c31 c31Var = this.f37877b;
                        c31Var.getClass();
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.m0(3)));
                            c31Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        c31 c31Var2 = this.f37877b;
                        c31Var2.dismiss();
                        qf.d.r(c31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        return;
                }
            }
        });
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.attach_arrow_right, 0);
        this.Y = zqVar;
        zqVar.setOverrideColor(org.telegram.ui.ActionBar.y6.x0(null, i22, false));
        zqVar.setScale(0.7f, 0.7f);
        zqVar.setWidth(AndroidUtilities.dp(12.0f));
        zqVar.setTranslateY(1.0f);
        spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", replaceTags, replaceSingleTag), spannableString);
        org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(context, null);
        this.Z = aa0Var;
        aa0Var.setText(replaceCharSequence);
        org.telegram.ui.ActionBar.f7.V(aa0Var, i19, u6Var2);
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setGravity(1);
        aa0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(aa0Var, org.telegram.ui.Components.kb1.x(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.Sh, u6Var2);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.o6.e(new float[]{6.0f}, org.telegram.ui.ActionBar.y6.w0(i17, u6Var2));
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i17);
        org.telegram.ui.ActionBar.b7 f7 = org.telegram.ui.ActionBar.f7.f(i17);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.f7.k(textView3, e10, N3, f7, u6Var2);
        textView3.setOnClickListener(new v21(this, 1));
        linearLayout.addView(textView3, org.telegram.ui.Components.kb1.x(-1, 48, 0, 14, 22, 14, 14));
        this.f38166a0.O(false);
    }

    public static c31 T(Context context, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, org.telegram.ui.ActionBar.u6 u6Var, li.s2 s2Var) {
        c31 c31Var = new c31(context, z10, u6Var, s2Var);
        if (r2Var != null) {
            if (r2Var.getParentActivity() != null) {
                r2Var.showDialog(c31Var);
            }
            return c31Var;
        }
        c31Var.show();
        return c31Var;
    }

    public static void U(Context context, org.telegram.ui.ActionBar.u6 u6Var, wn wnVar) {
        T(context, wnVar, false, u6Var, null);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.zq zqVar = this.Y;
            if (zqVar != null) {
                zqVar.setOverrideColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gc, false));
                org.telegram.ui.Components.aa0 aa0Var = this.Z;
                if (aa0Var != null) {
                    aa0Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 v(org.telegram.ui.Components.nm0 nm0Var) {
        org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(nm0Var, getContext(), this.currentAccount, 0, true, new e5(this, 20), this.resourcesProvider);
        this.f38166a0 = k71Var;
        return k71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
