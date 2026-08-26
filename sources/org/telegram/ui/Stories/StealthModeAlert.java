package org.telegram.ui.Stories;

import android.content.Context;
import android.text.Layout;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.DialogsActivity$25$$ExternalSyntheticLambda14;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda13;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda17;

public final class StealthModeAlert extends BottomSheet {
    public static final int $r8$clinit = 0;
    public final PremiumButtonView button;
    public DialogsActivity$25$$ExternalSyntheticLambda14 listener;
    public boolean stealthModeIsActive;
    public final int type;
    public final LivePlayer$1$$ExternalSyntheticLambda0 updateButtonRunnuble;

    public final class AnonymousClass1 extends FrameLayout {
        public final float val$topOffset;

        public AnonymousClass1(Context context, float f) {
            super(context);
            this.val$topOffset = f;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            Bulletin.addDelegate(StealthModeAlert.this.container, new ChatActivity.AnonymousClass103(this, 18));
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bulletin.removeDelegate(StealthModeAlert.this.container);
        }
    }

    public StealthModeAlert(Context context, float f, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider, false, false);
        this.updateButtonRunnuble = new LivePlayer$1$$ExternalSyntheticLambda0(this, 13);
        this.type = i;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext(), f);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(null, Theme.key_featuredStickers_addButton, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        anonymousClass1.addView(imageView, LayoutHelper.createFrame(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        anonymousClass1.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        zzkk.m(20.0f, 1, textView);
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1));
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        simpleTextView.setTextSize(14);
        simpleTextView.setAlignment(Layout.Alignment.ALIGN_CENTER);
        simpleTextView.setMaxLines(100);
        simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            simpleTextView.setText(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            simpleTextView.setText(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(simpleTextView, LayoutHelper.createLinear(-2, -2, 1, 36, 10, 36, 0));
        GroupCreateActivity.AnonymousClass7 anonymousClass7 = new GroupCreateActivity.AnonymousClass7(this, getContext());
        ((ImageView) anonymousClass7.this$0).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) anonymousClass7.rectTmp).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) anonymousClass7.paint).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(anonymousClass7, LayoutHelper.createLinear(-1, -2, 0, 0, 20, 0, 0));
        GroupCreateActivity.AnonymousClass7 anonymousClass8 = new GroupCreateActivity.AnonymousClass7(this, getContext());
        ((ImageView) anonymousClass8.this$0).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) anonymousClass8.rectTmp).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) anonymousClass8.paint).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(anonymousClass8, LayoutHelper.createLinear(-1, -2, 0, 0, 10, 0, 0));
        PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(8.0f), context, resourcesProvider, true);
        this.button = premiumButtonView;
        premiumButtonView.drawGradient = false;
        premiumButtonView.overlayTextView.getDrawable().splitByWords = false;
        int i2 = R.raw.unlock_icon;
        premiumButtonView.setIcon(i2);
        ScaleStateListAnimator.apply(premiumButtonView, 0.1f, 1.5f);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (currentUser.premium) {
            updateButton$3(false);
        } else {
            premiumButtonView.setIcon(i2);
            premiumButtonView.setButton(LocaleController.getString(R.string.UnlockStealthMode), new TodoItemMenu$$ExternalSyntheticLambda13(this, 18), false);
        }
        linearLayout.addView(premiumButtonView, LayoutHelper.createLinear(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(anonymousClass1);
        premiumButtonView.setOnClickListener(new TopicsFragment$$ExternalSyntheticLambda17(this, currentUser, i, resourcesProvider, 6));
    }

    public static void showStealthModeEnabledBulletin() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory bulletinFactory = lastFragment.getLastStoryViewer() != null ? new BulletinFactory(lastFragment.getLastStoryViewer().windowView, lastFragment.getLastStoryViewer().resourcesProvider) : BulletinFactory.global();
        if (bulletinFactory != null) {
            int i = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            Bulletin.TwoLineLayout twoLineLayout = new Bulletin.TwoLineLayout(bulletinFactory.getContext(), bulletinFactory.resourcesProvider);
            twoLineLayout.imageView.setImageResource(i);
            twoLineLayout.titleTextView.setText(string);
            TextView textView = twoLineLayout.subtitleTextView;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            bulletinFactory.create(twoLineLayout, 5000).show();
        }
    }

    public final void lambda$new$3(TLRPC.User user, int i, Theme.ResourcesProvider resourcesProvider) {
        if (!user.premium) {
            lambda$showGiftOfferSheet$15();
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment != null) {
                lastFragment.showDialog(new PremiumFeatureBottomSheet(lastFragment, lastFragment.getContext(), lastFragment.getCurrentAccount(), false, 14, false, null));
                return;
            }
            return;
        }
        if (this.stealthModeIsActive) {
            lambda$showGiftOfferSheet$15();
            DialogsActivity$25$$ExternalSyntheticLambda14 dialogsActivity$25$$ExternalSyntheticLambda14 = this.listener;
            if (dialogsActivity$25$$ExternalSyntheticLambda14 != null) {
                dialogsActivity$25$$ExternalSyntheticLambda14.onButtonClicked(false);
                return;
            }
            return;
        }
        StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.stealthMode;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
            if (!this.stealthModeIsActive) {
                new BulletinFactory(this.container, resourcesProvider).createErrorBulletin(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).show(true);
                return;
            }
            lambda$showGiftOfferSheet$15();
            DialogsActivity$25$$ExternalSyntheticLambda14 dialogsActivity$25$$ExternalSyntheticLambda15 = this.listener;
            if (dialogsActivity$25$$ExternalSyntheticLambda15 != null) {
                dialogsActivity$25$$ExternalSyntheticLambda15.onButtonClicked(false);
                return;
            }
            return;
        }
        TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
        tL_stories_activateStealthMode.future = true;
        tL_stories_activateStealthMode.past = true;
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
        tL_storiesStealthMode2.flags |= 3;
        tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + MessagesController.getInstance(this.currentAccount).stealthModeCooldown;
        tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + MessagesController.getInstance(this.currentAccount).stealthModeFuture;
        storiesController.setStealthMode(tL_storiesStealthMode2);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_activateStealthMode, new PassportActivity$$ExternalSyntheticLambda1(17));
        try {
            this.containerView.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        lambda$showGiftOfferSheet$15();
        if (i == 0) {
            showStealthModeEnabledBulletin();
        }
        DialogsActivity$25$$ExternalSyntheticLambda14 dialogsActivity$25$$ExternalSyntheticLambda16 = this.listener;
        if (dialogsActivity$25$$ExternalSyntheticLambda16 != null) {
            dialogsActivity$25$$ExternalSyntheticLambda16.onButtonClicked(true);
        }
    }

    public final void updateButton$3(boolean z) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().stealthMode;
        PremiumButtonView premiumButtonView = this.button;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.stealthModeIsActive = true;
            premiumButtonView.setOverlayText(LocaleController.getString(R.string.StealthModeIsActive), true, z);
            premiumButtonView.overlayTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            int i = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i) {
                long currentTime2 = i - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                int i2 = (int) (currentTime2 % 60);
                long j = currentTime2 / 60;
                int i3 = (int) (j % 60);
                int i4 = (int) (j / 60);
                StringBuilder sb = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb.append(String.format(locale, "%02d", Integer.valueOf(i4)));
                sb.append(String.format(locale, ":%02d", Integer.valueOf(i3)));
                sb.append(String.format(locale, ":%02d", Integer.valueOf(i2)));
                premiumButtonView.setOverlayText(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb.toString()), true, z);
                premiumButtonView.overlayTextView.setTextColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false), 125));
                LivePlayer$1$$ExternalSyntheticLambda0 livePlayer$1$$ExternalSyntheticLambda0 = this.updateButtonRunnuble;
                AndroidUtilities.cancelRunOnUIThread(livePlayer$1$$ExternalSyntheticLambda0);
                AndroidUtilities.runOnUIThread(livePlayer$1$$ExternalSyntheticLambda0, 1000L);
                return;
            }
        }
        int i5 = this.type;
        if (i5 == 0) {
            premiumButtonView.setOverlayText(LocaleController.getString(R.string.EnableStealthMode), true, z);
        } else if (i5 == 1) {
            premiumButtonView.setOverlayText(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z);
        }
        premiumButtonView.overlayTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
    }
}
