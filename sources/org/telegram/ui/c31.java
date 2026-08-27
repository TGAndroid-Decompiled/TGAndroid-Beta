package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

public final class c31 extends org.telegram.ui.Components.qa {
    public final LinearLayout T;
    public org.telegram.ui.Components.b51 U;

    public c31(Context context, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, Utilities.Callback callback) {
        super(context, null, false, false, false, 1, c6Var);
        fixNavigationBar();
        this.v = 0.2f;
        final int i10 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ri0Var.setScaleType(scaleType);
        ri0Var.setImageResource(R.drawable.large_ads_info);
        ri0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ri0Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        frameLayout.addView(ri0Var, h7.z5.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (callback != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23300r5, false));
            imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 1, -1));
            imageView.setOnClickListener(new gh.a4(this, callback, c6Var, imageView, 16));
            frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        }
        linearLayout.addView(frameLayout, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.messenger.rl.l(i13, r3, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView, h7.z5.t(-2, -2, 1, 22, 14, 22, 0), context);
        textViewI.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, r3));
        textViewI.setTextSize(1, 14.0f);
        textViewI.setGravity(1);
        linearLayout.addView(textViewI, h7.z5.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new ag.d(this, context, R.drawable.menu_privacy, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1TitleBot : R.string.RevenueSharingAdsInfo1Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1SubtitleBot : R.string.RevenueSharingAdsInfo1Subtitle)), h7.z5.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new ag.d(this, context, R.drawable.menu_feature_split, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2TitleBot : R.string.RevenueSharingAdsInfo2Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2SubtitleBot : R.string.RevenueSharingAdsInfo2Subtitle)), h7.z5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String string = LocaleController.formatString(z10 ? R.string.RevenueSharingAdsInfo3SubtitleBot : R.string.RevenueSharingAdsInfo3Subtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i14 = org.telegram.ui.ActionBar.g6.gc;
        linearLayout.addView(new ag.d(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(string, i14, 0, new Runnable(this) {

            public final c31 f36695b;

            {
                this.f36695b = this;
            }

            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        c31 c31Var = this.f36695b;
                        c31Var.getClass();
                        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                        if (n2VarU != null) {
                            n2VarU.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            c31Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        c31 c31Var2 = this.f36695b;
                        c31Var2.dismiss();
                        we.e.s(c31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        })), h7.z5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, r3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4TitleBot : R.string.RevenueSharingAdsInfo4Title));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, r3));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, h7.z5.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4Subtitle2Bot : R.string.RevenueSharingAdsInfo4Subtitle2));
        SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i14, 0, new Runnable(this) {

            public final c31 f36695b;

            {
                this.f36695b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        c31 c31Var = this.f36695b;
                        c31Var.getClass();
                        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                        if (n2VarU != null) {
                            n2VarU.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            c31Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        c31 c31Var2 = this.f36695b;
                        c31Var2.dismiss();
                        we.e.s(c31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        });
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.attach_arrow_right, 0);
        cqVar.setOverrideColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        cqVar.setScale(0.7f, 0.7f);
        cqVar.setWidth(AndroidUtilities.dp(12.0f));
        cqVar.setTranslateY(1.0f);
        spannableString.setSpan(cqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilderReplaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", spannableStringBuilderReplaceTags, spannableStringBuilderReplaceSingleTag), spannableString);
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        p80Var.setText(spannableStringBuilderReplaceCharSequence);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, r3));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(1);
        p80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(p80Var, h7.z5.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, r3));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        textView3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{6.0f}, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        textView3.setOnClickListener(new v21(this, i10));
        linearLayout.addView(textView3, h7.z5.t(-1, 48, 0, 14, 22, 14, 14));
        this.U.N(false);
    }

    public static c31 T(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, df dfVar) {
        c31 c31Var = new c31(context, z10, c6Var, dfVar);
        if (n2Var == null) {
            c31Var.show();
            return c31Var;
        }
        if (n2Var.getParentActivity() != null) {
            n2Var.showDialog(c31Var);
        }
        return c31Var;
    }

    public static void U(Context context, org.telegram.ui.ActionBar.c6 c6Var, rn rnVar) {
        T(context, rnVar, false, c6Var, null);
    }

    @Override
    public final org.telegram.ui.Components.yk0 w(org.telegram.ui.Components.zk0 zk0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(zk0Var, getContext(), this.currentAccount, 0, true, new b5(this, 20), this.resourcesProvider);
        this.U = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
