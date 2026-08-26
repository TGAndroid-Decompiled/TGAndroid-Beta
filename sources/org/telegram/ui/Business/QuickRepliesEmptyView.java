package org.telegram.ui.Business;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Stories.recorder.HintView2;

public final class QuickRepliesEmptyView extends LinearLayout {
    public final ArticleViewer.AnonymousClass9 descriptionView2;

    public QuickRepliesEmptyView(Activity activity, int i, long j, String str, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        int i3;
        View view;
        int i4;
        ArticleViewer.AnonymousClass9 anonymousClass9;
        super(activity);
        setOrientation(1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextAlignment(4);
        textView.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        textView.setGravity(17);
        ArticleViewer.AnonymousClass9 anonymousClass10 = new ArticleViewer.AnonymousClass9(activity, 1);
        anonymousClass10.setTextAlignment(4);
        anonymousClass10.setGravity(17);
        anonymousClass10.setTextSize(1, 12.0f);
        anonymousClass10.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        anonymousClass10.setGravity(1);
        RLottieImageView rLottieImageView = new RLottieImageView(activity);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        anonymousClass10.setMaxWidth(AndroidUtilities.dp(160.0f));
        if (i == 9) {
            rLottieImageView.setImageResource(R.drawable.large_greeting);
            textView.setText(LocaleController.getString(R.string.WelcomeMessageEmptyTitle));
            anonymousClass10.setText(LocaleController.getString(R.string.WelcomeMessageEmptySubtitle));
            anonymousClass10.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), HintView2.cutInFancyHalf(anonymousClass10.getText(), anonymousClass10.getPaint())));
        } else {
            if (!"hello".equalsIgnoreCase(str)) {
                if ("away".equalsIgnoreCase(str)) {
                    rLottieImageView.setImageResource(R.drawable.large_away);
                    textView.setText(LocaleController.getString(R.string.BusinessAwayIntroTitle));
                    anonymousClass10.setText(LocaleController.getString(R.string.BusinessAwayIntro));
                    anonymousClass10.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), HintView2.cutInFancyHalf(anonymousClass10.getText(), anonymousClass10.getPaint())));
                } else {
                    if (i == 5) {
                        rLottieImageView.setImageResource(R.drawable.large_quickreplies);
                        QuickRepliesController.QuickReply quickReplyFindReply = QuickRepliesController.getInstance(UserConfig.selectedAccount).findReply(j);
                        String str2 = quickReplyFindReply == null ? str : quickReplyFindReply.name;
                        textView.setText(LocaleController.getString(R.string.BusinessRepliesIntroTitle));
                        anonymousClass10.setMaxWidth(AndroidUtilities.dp(208.0f));
                        anonymousClass10.setTextAlignment(2);
                        anonymousClass10.setGravity(3);
                        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessRepliesIntro1, str2)));
                        anonymousClass10.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
                        ArticleViewer.AnonymousClass9 anonymousClass11 = new ArticleViewer.AnonymousClass9(activity, 1);
                        this.descriptionView2 = anonymousClass11;
                        anonymousClass11.setMaxWidth(AndroidUtilities.dp(208.0f));
                        anonymousClass11.setTextAlignment(2);
                        anonymousClass11.setGravity(3);
                        anonymousClass11.setTextSize(1, 13.0f);
                        anonymousClass11.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessRepliesIntro2)));
                        anonymousClass11.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
                    }
                    i2 = 12;
                }
                addView(rLottieImageView, LayoutHelper.createLinear(78, 78, 49, 20, 17, 20, 9));
                addView(textView, LayoutHelper.createLinear(-2, -2, 49, 20, 0, 20, 6));
                if (this.descriptionView2 != null) {
                    i3 = 9;
                } else {
                    i3 = 19;
                }
                addView(anonymousClass10, LayoutHelper.createLinear(-2, -2, 49, i2, 0, i2, i3));
                view = this.descriptionView2;
                if (view != null) {
                    addView(view, LayoutHelper.createLinear(-2, -2, 49, 12, 0, 12, 19));
                }
                i4 = Theme.key_chat_serviceText;
                textView.setTextColor(Theme.getColor(i4, resourcesProvider));
                anonymousClass10.setTextColor(Theme.getColor(i4, resourcesProvider));
                anonymousClass9 = this.descriptionView2;
                if (anonymousClass9 != null) {
                    anonymousClass9.setTextColor(Theme.getColor(i4, resourcesProvider));
                }
            }
            rLottieImageView.setImageResource(R.drawable.large_greeting);
            textView.setText(LocaleController.getString(R.string.BusinessGreetingIntroTitle));
            anonymousClass10.setText(LocaleController.getString(R.string.BusinessGreetingIntro));
            anonymousClass10.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), HintView2.cutInFancyHalf(anonymousClass10.getText(), anonymousClass10.getPaint())));
        }
        i2 = 22;
        addView(rLottieImageView, LayoutHelper.createLinear(78, 78, 49, 20, 17, 20, 9));
        addView(textView, LayoutHelper.createLinear(-2, -2, 49, 20, 0, 20, 6));
        if (this.descriptionView2 != null) {
            i3 = 9;
        } else {
            i3 = 19;
        }
        addView(anonymousClass10, LayoutHelper.createLinear(-2, -2, 49, i2, 0, i2, i3));
        view = this.descriptionView2;
        if (view != null) {
            addView(view, LayoutHelper.createLinear(-2, -2, 49, 12, 0, 12, 19));
        }
        i4 = Theme.key_chat_serviceText;
        textView.setTextColor(Theme.getColor(i4, resourcesProvider));
        anonymousClass10.setTextColor(Theme.getColor(i4, resourcesProvider));
        anonymousClass9 = this.descriptionView2;
        if (anonymousClass9 != null) {
            anonymousClass9.setTextColor(Theme.getColor(i4, resourcesProvider));
        }
    }
}
