package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.MentionCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Stories.recorder.HintView2;

public final class QuickRepliesEmptyView extends LinearLayout {
    public final MentionCell.AnonymousClass1 descriptionView2;
    public final Theme.ResourcesProvider resourcesProvider;

    public QuickRepliesEmptyView(Context context, int i, long j, String str, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        int i3;
        View view;
        int i4;
        MentionCell.AnonymousClass1 anonymousClass1;
        super(context);
        int i5 = 1;
        setOrientation(1);
        this.resourcesProvider = resourcesProvider;
        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 14.0f);
        textViewM.setTypeface(AndroidUtilities.bold());
        textViewM.setTextAlignment(4);
        textViewM.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        textViewM.setGravity(17);
        MentionCell.AnonymousClass1 anonymousClass2 = new MentionCell.AnonymousClass1(context, i5);
        anonymousClass2.setTextAlignment(4);
        anonymousClass2.setGravity(17);
        anonymousClass2.setTextSize(1, 12.0f);
        anonymousClass2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        anonymousClass2.setGravity(1);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        anonymousClass2.setMaxWidth(AndroidUtilities.dp(160.0f));
        if (i == 9) {
            rLottieImageView.setImageResource(R.drawable.large_greeting);
            textViewM.setText(LocaleController.getString(R.string.WelcomeMessageEmptyTitle));
            anonymousClass2.setText(LocaleController.getString(R.string.WelcomeMessageEmptySubtitle));
            anonymousClass2.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), HintView2.cutInFancyHalf(anonymousClass2.getText(), anonymousClass2.getPaint())));
        } else {
            if (!"hello".equalsIgnoreCase(str)) {
                if ("away".equalsIgnoreCase(str)) {
                    rLottieImageView.setImageResource(R.drawable.large_away);
                    textViewM.setText(LocaleController.getString(R.string.BusinessAwayIntroTitle));
                    anonymousClass2.setText(LocaleController.getString(R.string.BusinessAwayIntro));
                    anonymousClass2.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), HintView2.cutInFancyHalf(anonymousClass2.getText(), anonymousClass2.getPaint())));
                } else {
                    if (i == 5) {
                        rLottieImageView.setImageResource(R.drawable.large_quickreplies);
                        QuickRepliesController.QuickReply quickReplyFindReply = QuickRepliesController.getInstance(UserConfig.selectedAccount).findReply(j);
                        String str2 = quickReplyFindReply == null ? str : quickReplyFindReply.name;
                        textViewM.setText(LocaleController.getString(R.string.BusinessRepliesIntroTitle));
                        anonymousClass2.setMaxWidth(AndroidUtilities.dp(208.0f));
                        anonymousClass2.setTextAlignment(2);
                        anonymousClass2.setGravity(3);
                        anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessRepliesIntro1, str2)));
                        anonymousClass2.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
                        MentionCell.AnonymousClass1 anonymousClass3 = new MentionCell.AnonymousClass1(context, i5);
                        this.descriptionView2 = anonymousClass3;
                        anonymousClass3.setMaxWidth(AndroidUtilities.dp(208.0f));
                        anonymousClass3.setTextAlignment(2);
                        anonymousClass3.setGravity(3);
                        anonymousClass3.setTextSize(1, 13.0f);
                        anonymousClass3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessRepliesIntro2)));
                        anonymousClass3.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
                    }
                    i2 = 12;
                }
                addView(rLottieImageView, LayoutHelper.createLinear(78, 78, 49, 20, 17, 20, 9));
                addView(textViewM, LayoutHelper.createLinear(-2, -2, 49, 20, 0, 20, 6));
                if (this.descriptionView2 != null) {
                    i3 = 9;
                } else {
                    i3 = 19;
                }
                addView(anonymousClass2, LayoutHelper.createLinear(-2, -2, 49, i2, 0, i2, i3));
                view = this.descriptionView2;
                if (view != null) {
                    addView(view, LayoutHelper.createLinear(-2, -2, 49, 12, 0, 12, 19));
                }
                i4 = Theme.key_chat_serviceText;
                textViewM.setTextColor(Theme.getColor(i4, resourcesProvider));
                anonymousClass2.setTextColor(Theme.getColor(i4, resourcesProvider));
                anonymousClass1 = this.descriptionView2;
                if (anonymousClass1 != null) {
                    anonymousClass1.setTextColor(Theme.getColor(i4, resourcesProvider));
                }
            }
            rLottieImageView.setImageResource(R.drawable.large_greeting);
            textViewM.setText(LocaleController.getString(R.string.BusinessGreetingIntroTitle));
            anonymousClass2.setText(LocaleController.getString(R.string.BusinessGreetingIntro));
            anonymousClass2.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), HintView2.cutInFancyHalf(anonymousClass2.getText(), anonymousClass2.getPaint())));
        }
        i2 = 22;
        addView(rLottieImageView, LayoutHelper.createLinear(78, 78, 49, 20, 17, 20, 9));
        addView(textViewM, LayoutHelper.createLinear(-2, -2, 49, 20, 0, 20, 6));
        if (this.descriptionView2 != null) {
            i3 = 9;
        } else {
            i3 = 19;
        }
        addView(anonymousClass2, LayoutHelper.createLinear(-2, -2, 49, i2, 0, i2, i3));
        view = this.descriptionView2;
        if (view != null) {
            addView(view, LayoutHelper.createLinear(-2, -2, 49, 12, 0, 12, 19));
        }
        i4 = Theme.key_chat_serviceText;
        textViewM.setTextColor(Theme.getColor(i4, resourcesProvider));
        anonymousClass2.setTextColor(Theme.getColor(i4, resourcesProvider));
        anonymousClass1 = this.descriptionView2;
        if (anonymousClass1 != null) {
            anonymousClass1.setTextColor(Theme.getColor(i4, resourcesProvider));
        }
    }
}
