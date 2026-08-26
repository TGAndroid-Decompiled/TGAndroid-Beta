package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.exoplayer2.util.Log;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;

public class TermsOfServiceView extends FrameLayout {
    private int currentAccount;
    private TLRPC.TL_help_termsOfService currentTos;
    private TermsOfServiceViewDelegate delegate;
    private ScrollView scrollView;
    private TextView textView;
    private TextView titleTextView;

    public interface TermsOfServiceViewDelegate {
        void onAcceptTerms(int i);

        void onDeclineTerms(int i);
    }

    public TermsOfServiceView(Context context) {
        super(context);
        setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        int i = AndroidUtilities.statusBarHeight;
        if (i > 0) {
            View view = new View(context);
            view.setBackgroundColor(-16777216);
            addView(view, new FrameLayout.LayoutParams(-1, i));
        }
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.logo_middle);
        linearLayoutM.addView(imageView, LayoutHelper.createLinear(-2, -2, 3, 0, 28, 0, 0));
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(null, i2, false));
        this.titleTextView.setTextSize(1, 17.0f);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        this.titleTextView.setText(LocaleController.getString(R.string.PrivacyPolicyAndTerms));
        TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayoutM, this.titleTextView, LayoutHelper.createLinear(-2, -2, 3, 0, 20, 0, 0), context);
        this.textView = textViewM;
        textViewM.setTextColor(Theme.getColor(null, i2, false));
        this.textView.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
        this.textView.setTextSize(1, 15.0f);
        this.textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.textView.setGravity(51);
        this.textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayoutM.addView(this.textView, LayoutHelper.createLinear(-1, -2, 3, 0, 15, 0, 15));
        ScrollView scrollView = new ScrollView(context);
        this.scrollView = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.scrollView.setOverScrollMode(2);
        this.scrollView.setPadding(AndroidUtilities.dp(24.0f), i, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(75.0f));
        this.scrollView.addView(linearLayoutM, new FrameLayout.LayoutParams(-1, -2));
        addView(this.scrollView, LayoutHelper.createLinear(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.Decline).toUpperCase());
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        textView2.setTextColor(Theme.getColor(null, i3, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(3.0f), Theme.getColor(null, i3, false)));
        textView2.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f));
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
        final int i4 = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final TermsOfServiceView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$4(view2);
                        break;
                    default:
                        this.f$0.lambda$new$6(view2);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setText(LocaleController.getString(R.string.Accept));
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setTextSize(1, 14.0f);
        int iDp = AndroidUtilities.dp(4.0f);
        textView3.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, -11491093, -12346402, -12346402));
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        addView(textView3, LayoutHelper.createFrame(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
        final int i5 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final TermsOfServiceView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        this.f$0.lambda$new$4(view2);
                        break;
                    default:
                        this.f$0.lambda$new$6(view2);
                        break;
                }
            }
        });
        View view2 = new View(context);
        view2.setBackgroundColor(Theme.getColor(null, Theme.key_divider, false));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
        layoutParams.bottomMargin = AndroidUtilities.dp(75.0f);
        layoutParams.gravity = 80;
        addView(view2, layoutParams);
    }

    private void accept() {
        this.delegate.onAcceptTerms(this.currentAccount);
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.currentTos.id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_acceptTermsOfService, new EmojiView$23$$ExternalSyntheticLambda0(5));
    }

    private static void addBulletsToText(SpannableStringBuilder spannableStringBuilder, char c, int i, int i2, int i3) {
        int length = spannableStringBuilder.length() - 2;
        for (int i4 = 0; i4 < length; i4++) {
            if (spannableStringBuilder.charAt(i4) == '\n') {
                int i5 = i4 + 1;
                if (spannableStringBuilder.charAt(i5) == c) {
                    int i6 = i4 + 2;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        BulletSpan bulletSpan = new BulletSpan(i, i2, i3);
                        spannableStringBuilder.replace(i5, i4 + 3, "\u0000\u0000");
                        spannableStringBuilder.setSpan(bulletSpan, i5, i6, 33);
                    }
                }
            }
        }
    }

    public static void lambda$accept$7(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$new$0(AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            MessagesController.getInstance(this.currentAccount).performLogout(0);
            return;
        }
        if (tL_error == null || tL_error.code != -1000) {
            String string = LocaleController.getString(R.string.ErrorOccurred);
            if (tL_error != null) {
                StringBuilder sbM = Log.m(string, "\n");
                sbM.append(tL_error.text);
                string = sbM.toString();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.AppName));
            builder.setMessage(string);
            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
            builder.show();
        }
    }

    public void lambda$new$1(AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda1(18, this, alertDialog, tLObject, tL_error));
    }

    public void lambda$new$2(AlertDialog alertDialog, int i) {
        AlertDialog alertDialog2 = new AlertDialog(getContext(), 3, null);
        alertDialog2.canCacnel = false;
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Decline ToS update";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteaccount, new ShareAlert$$ExternalSyntheticLambda13(13, this, alertDialog2));
        alertDialog2.show();
    }

    public void lambda$new$3(AlertDialog alertDialog, int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
        builder.setMessage(LocaleController.getString(R.string.TosDeclineDeleteAccount));
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setPositiveButton(LocaleController.getString(R.string.Deactivate), new TermsOfServiceView$$ExternalSyntheticLambda0(this, 2));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.show();
    }

    public void lambda$new$4(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.TermsOfService));
        builder.setPositiveButton(LocaleController.getString(R.string.DeclineDeactivate), new TermsOfServiceView$$ExternalSyntheticLambda0(this, 1));
        builder.setNegativeButton(LocaleController.getString(R.string.Back), null);
        builder.setMessage(LocaleController.getString(R.string.TosUpdateDecline));
        builder.show();
    }

    public void lambda$new$5(AlertDialog alertDialog, int i) {
        accept();
    }

    public void lambda$new$6(View view) {
        int i = 0;
        if (this.currentTos.min_age_confirm == 0) {
            accept();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.TosAgeTitle));
        builder.setPositiveButton(LocaleController.getString(R.string.Agree), new TermsOfServiceView$$ExternalSyntheticLambda0(this, i));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setMessage(LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", this.currentTos.min_age_confirm, new Object[0])));
        builder.show();
    }

    public void setDelegate(TermsOfServiceViewDelegate termsOfServiceViewDelegate) {
        this.delegate = termsOfServiceViewDelegate;
    }

    public void show(int i, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false);
        addBulletsToText(spannableStringBuilder, '-', AndroidUtilities.dp(10.0f), -11491093, AndroidUtilities.dp(4.0f));
        this.textView.setText(spannableStringBuilder);
        this.currentTos = tL_help_termsOfService;
        this.currentAccount = i;
    }
}
