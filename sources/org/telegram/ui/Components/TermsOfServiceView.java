package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;

public final class TermsOfServiceView extends FrameLayout {
    public static final int $r8$clinit = 0;
    public int currentAccount;
    public TLRPC.TL_help_termsOfService currentTos;
    public TermsOfServiceViewDelegate delegate;
    public final TextView textView;

    public interface TermsOfServiceViewDelegate {
    }

    public TermsOfServiceView(LaunchActivity launchActivity) {
        super(launchActivity);
        setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        int i = AndroidUtilities.statusBarHeight;
        if (i > 0) {
            View view = new View(launchActivity);
            view.setBackgroundColor(-16777216);
            addView(view, new FrameLayout.LayoutParams(-1, i));
        }
        LinearLayout linearLayout = new LinearLayout(launchActivity);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(launchActivity);
        imageView.setImageResource(R.drawable.logo_middle);
        linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 3, 0, 28, 0, 0));
        TextView textView = new TextView(launchActivity);
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(17.0f, Theme.getColor(null, i2, false), 1, textView);
        textView.setText(LocaleController.getString(R.string.PrivacyPolicyAndTerms));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 3, 0, 20, 0, 0));
        TextView textView2 = new TextView(launchActivity);
        this.textView = textView2;
        textView2.setTextColor(Theme.getColor(null, i2, false));
        textView2.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
        textView2.setTextSize(1, 15.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        textView2.setGravity(51);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 3, 0, 15, 0, 15));
        ScrollView scrollView = new ScrollView(launchActivity);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOverScrollMode(2);
        scrollView.setPadding(AndroidUtilities.dp(24.0f), i, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(75.0f));
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(scrollView, LayoutHelper.createLinear(-1, -2));
        TextView textView3 = new TextView(launchActivity);
        textView3.setText(LocaleController.getString(R.string.Decline).toUpperCase());
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        textView3.setTextColor(Theme.getColor(null, i3, false));
        textView3.setTextSize(1, 14.0f);
        textView3.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(3.0f), Theme.getColor(null, i3, false)));
        textView3.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f));
        addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
        final int i4 = 0;
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final TermsOfServiceView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                int i5 = 1;
                TermsOfServiceView termsOfServiceView = this.f$0;
                int i6 = 0;
                switch (i4) {
                    case 0:
                        termsOfServiceView.getClass();
                        AlertDialog.Builder builder = new AlertDialog.Builder(view2.getContext(), 0, null);
                        String string = LocaleController.getString(R.string.TermsOfService);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        builder.setPositiveButton(LocaleController.getString(R.string.DeclineDeactivate), new TermsOfServiceView$$ExternalSyntheticLambda2(termsOfServiceView, i5));
                        builder.setNegativeButton(LocaleController.getString(R.string.Back), null);
                        alertDialog.message = LocaleController.getString(R.string.TosUpdateDecline);
                        builder.show();
                        break;
                    default:
                        if (termsOfServiceView.currentTos.min_age_confirm == 0) {
                            termsOfServiceView.accept();
                        } else {
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(view2.getContext(), 0, null);
                            String string2 = LocaleController.getString(R.string.TosAgeTitle);
                            AlertDialog alertDialog2 = builder2.alertDialog;
                            alertDialog2.title = string2;
                            builder2.setPositiveButton(LocaleController.getString(R.string.Agree), new TermsOfServiceView$$ExternalSyntheticLambda2(termsOfServiceView, i6));
                            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            alertDialog2.message = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", termsOfServiceView.currentTos.min_age_confirm, new Object[0]));
                            builder2.show();
                        }
                        break;
                }
            }
        });
        TextView textView4 = new TextView(launchActivity);
        textView4.setText(LocaleController.getString(R.string.Accept));
        textView4.setGravity(17);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(-1);
        textView4.setTextSize(1, 14.0f);
        int iDp = AndroidUtilities.dp(4.0f);
        textView4.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, -11491093, -12346402, -12346402));
        textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        addView(textView4, LayoutHelper.createFrame(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
        final int i5 = 1;
        textView4.setOnClickListener(new View.OnClickListener(this) {
            public final TermsOfServiceView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                int i6 = 1;
                TermsOfServiceView termsOfServiceView = this.f$0;
                int i7 = 0;
                switch (i5) {
                    case 0:
                        termsOfServiceView.getClass();
                        AlertDialog.Builder builder = new AlertDialog.Builder(view2.getContext(), 0, null);
                        String string = LocaleController.getString(R.string.TermsOfService);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        builder.setPositiveButton(LocaleController.getString(R.string.DeclineDeactivate), new TermsOfServiceView$$ExternalSyntheticLambda2(termsOfServiceView, i6));
                        builder.setNegativeButton(LocaleController.getString(R.string.Back), null);
                        alertDialog.message = LocaleController.getString(R.string.TosUpdateDecline);
                        builder.show();
                        break;
                    default:
                        if (termsOfServiceView.currentTos.min_age_confirm == 0) {
                            termsOfServiceView.accept();
                        } else {
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(view2.getContext(), 0, null);
                            String string2 = LocaleController.getString(R.string.TosAgeTitle);
                            AlertDialog alertDialog2 = builder2.alertDialog;
                            alertDialog2.title = string2;
                            builder2.setPositiveButton(LocaleController.getString(R.string.Agree), new TermsOfServiceView$$ExternalSyntheticLambda2(termsOfServiceView, i7));
                            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            alertDialog2.message = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", termsOfServiceView.currentTos.min_age_confirm, new Object[0]));
                            builder2.show();
                        }
                        break;
                }
            }
        });
        View view2 = new View(launchActivity);
        view2.setBackgroundColor(Theme.getColor(null, Theme.key_divider, false));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
        layoutParams.bottomMargin = AndroidUtilities.dp(75.0f);
        layoutParams.gravity = 80;
        addView(view2, layoutParams);
    }

    public final void accept() {
        TermsOfServiceViewDelegate termsOfServiceViewDelegate = this.delegate;
        int i = this.currentAccount;
        LaunchActivity.AnonymousClass12 anonymousClass12 = (LaunchActivity.AnonymousClass12) termsOfServiceViewDelegate;
        anonymousClass12.getClass();
        UserConfig.getInstance(i).unacceptedTermsOfService = null;
        UserConfig.getInstance(i).saveConfig(false);
        LaunchActivity launchActivity = LaunchActivity.this;
        if (!launchActivity.mainFragmentsStack.isEmpty()) {
            ((BaseFragment) zziq.m(1, launchActivity.mainFragmentsStack)).onResume();
        }
        launchActivity.termsOfServiceView.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new IntroActivity$$ExternalSyntheticLambda6(anonymousClass12, 12)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.currentTos.id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_acceptTermsOfService, new PassportActivity$$ExternalSyntheticLambda1(12));
    }

    public void setDelegate(TermsOfServiceViewDelegate termsOfServiceViewDelegate) {
        this.delegate = termsOfServiceViewDelegate;
    }
}
