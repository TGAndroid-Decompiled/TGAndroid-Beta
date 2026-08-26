package org.telegram.ui.Cells;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.URLSpanNoUnderline;

public abstract class SettingsSuggestionCell extends LinearLayout {
    public static final int TYPE_GRACE = 2;
    public static final int TYPE_PASSWORD = 1;
    public static final int TYPE_PHONE = 0;
    private int currentAccount;
    private int currentType;
    private TextView detailTextView;
    private TextView noButton;
    private Theme.ResourcesProvider resourcesProvider;
    private TextView textView;
    private TextView yesButton;

    public SettingsSuggestionCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        final int i = 0;
        this.currentAccount = UserConfig.selectedAccount;
        this.resourcesProvider = resourcesProvider;
        final int i2 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 15.0f);
        this.textView.setTypeface(AndroidUtilities.bold());
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider));
        addView(this.textView, LayoutHelper.createLinear(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.detailTextView = linksTextView;
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.detailTextView.setTextSize(1, 14.0f);
        this.detailTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, resourcesProvider));
        this.detailTextView.setHighlightColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkSelection, resourcesProvider));
        this.detailTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.detailTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(this.detailTextView, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, LayoutHelper.createLinear(-1, 44, 21.0f, 16.0f, 21.0f, 15.0f));
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
            zzkr.m(Theme.key_featuredStickers_buttonText, resourcesProvider, textView2, 14.0f);
            linearLayout.addView(textView2, LayoutHelper.createLinear(0, 44, 0.5f, i3 == 0 ? 0 : 4, 0, i3 == 0 ? 4 : 0, 0));
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
                                this.f$0.lambda$new$0(view);
                                break;
                            default:
                                this.f$0.lambda$new$1(view);
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
                                this.f$0.lambda$new$0(view);
                                break;
                            default:
                                this.f$0.lambda$new$1(view);
                                break;
                        }
                    }
                });
            }
            i3++;
        }
    }

    public final void lambda$new$0(View view) {
        onYesClick(this.currentType);
    }

    public final void lambda$new$1(View view) {
        onNoClick(this.currentType);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public abstract void onNoClick(int i);

    public abstract void onYesClick(int i);

    public void setType(int i) {
        this.currentType = i;
        if (i != 0) {
            if (i == 1) {
                this.textView.setText(LocaleController.getString(R.string.YourPasswordHeader));
                this.detailTextView.setText(LocaleController.getString(R.string.YourPasswordRemember));
                this.yesButton.setText(LocaleController.getString(R.string.YourPasswordRememberYes));
                this.noButton.setVisibility(0);
                this.noButton.setText(LocaleController.getString(R.string.YourPasswordRememberNo));
                return;
            }
            if (i == 2) {
                this.textView.setText(LocaleController.getString(R.string.GraceSuggestionTitle));
                this.detailTextView.setText(LocaleController.getString(R.string.GraceSuggestionMessage));
                this.yesButton.setText(LocaleController.getString(R.string.GraceSuggestionButton));
                this.noButton.setVisibility(8);
                return;
            }
            return;
        }
        this.textView.setText(LocaleController.formatString(R.string.CheckPhoneNumber, UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).clientUserId)).phone, PhoneFormat.getInstance())));
        String string = LocaleController.getString(R.string.CheckPhoneNumberInfo);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf("**");
        int iLastIndexOf = string.lastIndexOf("**");
        if (iIndexOf >= 0 && iLastIndexOf >= 0 && iIndexOf != iLastIndexOf) {
            spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 2, (CharSequence) "");
            spannableStringBuilder.replace(iIndexOf, iIndexOf + 2, (CharSequence) "");
            try {
                spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl)), iIndexOf, iLastIndexOf - 2, 33);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.detailTextView.setText(spannableStringBuilder);
        this.yesButton.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        this.noButton.setVisibility(0);
        this.noButton.setText(LocaleController.getString(R.string.CheckPhoneNumberNo));
    }
}
