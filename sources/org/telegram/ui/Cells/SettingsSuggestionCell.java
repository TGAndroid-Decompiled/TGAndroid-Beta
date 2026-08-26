package org.telegram.ui.Cells;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionIntroActivity;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationSetupActivity;

public abstract class SettingsSuggestionCell extends LinearLayout {
    public final int currentAccount;
    public int currentType;
    public final LinkSpanDrawable.LinksTextView detailTextView;
    public final TextView noButton;
    public final TextView textView;
    public final TextView yesButton;

    public SettingsSuggestionCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        final int i = 0;
        this.currentAccount = UserConfig.selectedAccount;
        final int i2 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.textView = textView;
        zzkk.m(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider));
        addView(textView, LayoutHelper.createLinear(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.detailTextView = linksTextView;
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, resourcesProvider));
        linksTextView.setHighlightColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkSelection, resourcesProvider));
        linksTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        linksTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(linksTextView, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, LayoutHelper.createLinear(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i3 = 0;
        while (i3 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{8.0f}, Theme.key_featuredStickers_addButton));
            ScaleStateListAnimator.apply(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            zzlj.m(Theme.key_featuredStickers_buttonText, resourcesProvider, textView2, 14.0f);
            linearLayout.addView(textView2, LayoutHelper.createLinear(0.5f, 0, 44, i3 == 0 ? 0 : 4, i3 == 0 ? 4 : 0, 0));
            if (i3 == 0) {
                this.yesButton = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final SettingsSuggestionCell f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i) {
                            case 0:
                                SettingsSuggestionCell settingsSuggestionCell = this.f$0;
                                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda17((ProfileActivity.ListAdapter.AnonymousClass9) settingsSuggestionCell, settingsSuggestionCell.currentType, 22));
                                break;
                            default:
                                SettingsSuggestionCell settingsSuggestionCell2 = this.f$0;
                                int i4 = settingsSuggestionCell2.currentType;
                                ProfileActivity.ListAdapter listAdapter = ProfileActivity.ListAdapter.this;
                                if (i4 != 0) {
                                    ProfileActivity.this.presentFragment(new TwoStepVerificationSetupActivity(8, null));
                                } else {
                                    ProfileActivity.this.presentFragment(new ActionIntroActivity(3));
                                }
                                break;
                        }
                    }
                });
            } else {
                this.noButton = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final SettingsSuggestionCell f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i2) {
                            case 0:
                                SettingsSuggestionCell settingsSuggestionCell = this.f$0;
                                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda17((ProfileActivity.ListAdapter.AnonymousClass9) settingsSuggestionCell, settingsSuggestionCell.currentType, 22));
                                break;
                            default:
                                SettingsSuggestionCell settingsSuggestionCell2 = this.f$0;
                                int i4 = settingsSuggestionCell2.currentType;
                                ProfileActivity.ListAdapter listAdapter = ProfileActivity.ListAdapter.this;
                                if (i4 != 0) {
                                    ProfileActivity.this.presentFragment(new TwoStepVerificationSetupActivity(8, null));
                                } else {
                                    ProfileActivity.this.presentFragment(new ActionIntroActivity(3));
                                }
                                break;
                        }
                    }
                });
            }
            i3++;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setType(int i) {
        this.currentType = i;
        TextView textView = this.yesButton;
        LinkSpanDrawable.LinksTextView linksTextView = this.detailTextView;
        TextView textView2 = this.textView;
        TextView textView3 = this.noButton;
        if (i != 0) {
            if (i == 1) {
                textView2.setText(LocaleController.getString(R.string.YourPasswordHeader));
                linksTextView.setText(LocaleController.getString(R.string.YourPasswordRemember));
                textView.setText(LocaleController.getString(R.string.YourPasswordRememberYes));
                textView3.setVisibility(0);
                textView3.setText(LocaleController.getString(R.string.YourPasswordRememberNo));
                return;
            }
            if (i == 2) {
                textView2.setText(LocaleController.getString(R.string.GraceSuggestionTitle));
                linksTextView.setText(LocaleController.getString(R.string.GraceSuggestionMessage));
                textView.setText(LocaleController.getString(R.string.GraceSuggestionButton));
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        int i2 = this.currentAccount;
        textView2.setText(LocaleController.formatString(R.string.CheckPhoneNumber, UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), MessagesController.getInstance(i2).getUser(Long.valueOf(UserConfig.getInstance(i2).clientUserId)).phone, PhoneFormat.getInstance())));
        String string = LocaleController.getString(R.string.CheckPhoneNumberInfo);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf("**");
        int iLastIndexOf = string.lastIndexOf("**");
        if (iIndexOf >= 0 && iLastIndexOf >= 0 && iIndexOf != iLastIndexOf) {
            spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 2, (CharSequence) "");
            spannableStringBuilder.replace(iIndexOf, iIndexOf + 2, (CharSequence) "");
            try {
                spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl), null), iIndexOf, iLastIndexOf - 2, 33);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        linksTextView.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        textView3.setVisibility(0);
        textView3.setText(LocaleController.getString(R.string.CheckPhoneNumberNo));
    }
}
