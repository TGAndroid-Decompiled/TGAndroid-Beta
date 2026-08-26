package org.telegram.ui.Business;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.internal.mlkit_vision_common.zzks;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda208;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda77;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ChatbotSheet extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final TL_account.TL_connectedBot bot;
    public boolean exclude;
    public Boolean hadChanges;
    public final BusinessRecipientsHelper recipientsHelper;
    public final ButtonWithCounterView terminateButton;
    public final LinearLayout topView;
    public final ButtonWithCounterView updateButton;
    public final TLRPC.User user;

    public ChatbotSheet(Activity activity, TL_account.TL_connectedBot tL_connectedBot, OAuthSheet$$ExternalSyntheticLambda17 oAuthSheet$$ExternalSyntheticLambda17, Theme.ResourcesProvider resourcesProvider) {
        super(activity, null, false, false, false, false, false, 2, resourcesProvider);
        this.bot = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.user = user;
        this.headerMoveTop = AndroidUtilities.dp(36.0f);
        this.topPadding = 0.15f;
        BusinessRecipientsHelper businessRecipientsHelper = new BusinessRecipientsHelper(activity, this.currentAccount, new ArticleViewer$$ExternalSyntheticLambda3(this, 14), resourcesProvider);
        this.recipientsHelper = businessRecipientsHelper;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.exclude = tL_businessBotRecipients.exclude_selected;
        businessRecipientsHelper.setValue(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.topView = linearLayout;
        linearLayout.setOrientation(1);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        BackupImageView backupImageView = new BackupImageView(activity);
        backupImageView.setRoundRadius(AndroidUtilities.dp(40.0f));
        avatarDrawable.setInfo(UserConfig.selectedAccount, user);
        backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
        backupImageView.onNewImageSet();
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.actionBar.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 18));
        }
        int i = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i));
        fixNavigationBar(getThemedColor(i));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i2 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i2, 0, i2, AndroidUtilities.dp(72.0f));
        this.recyclerListView.setSections();
        this.recyclerListView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 5));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(0.0f, getThemedColor(i)), getThemedColor(i), getThemedColor(i)}));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(activity, resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        this.terminateButton = buttonWithCounterView;
        buttonWithCounterView.setColor(getThemedColor(Theme.key_color_red));
        buttonWithCounterView.setText(LocaleController.getString(R.string.TerminateSession));
        buttonWithCounterView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(this, tL_connectedBot, oAuthSheet$$ExternalSyntheticLambda17, 3));
        frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(activity, resourcesProvider, true);
        buttonWithCounterView2.setRoundRadius(24);
        this.updateButton = buttonWithCounterView2;
        buttonWithCounterView2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        buttonWithCounterView2.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(13, this, tL_connectedBot));
        frameLayout.addView(buttonWithCounterView2, LayoutHelper.createFrame(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        checkDone$5(false);
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2, 80);
        int i3 = layoutParamsCreateFrame.leftMargin;
        int i4 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i3 + i4;
        layoutParamsCreateFrame.rightMargin += i4;
        this.containerView.addView(frameLayout, layoutParamsCreateFrame);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(false);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        if (businessRecipientsHelper != null) {
            businessRecipientsHelper.hasChanges();
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        if (businessRecipientsHelper == null || !businessRecipientsHelper.hasChanges()) {
            return super.canDismissWithTouchOutside();
        }
        return false;
    }

    public final void checkDone$5(boolean z) {
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        final boolean z2 = businessRecipientsHelper != null && businessRecipientsHelper.hasChanges();
        Boolean bool = this.hadChanges;
        if (bool == null || bool.booleanValue() != z2) {
            this.hadChanges = Boolean.valueOf(z2);
            ButtonWithCounterView buttonWithCounterView = this.terminateButton;
            ButtonWithCounterView buttonWithCounterView2 = this.updateButton;
            if (z) {
                buttonWithCounterView2.setVisibility(0);
                ViewPropertyAnimator duration = buttonWithCounterView2.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.8f).scaleY(z2 ? 1.0f : 0.8f).setDuration(320L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                final int i = 0;
                duration.setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable(this) {
                    public final ChatbotSheet f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                ChatbotSheet chatbotSheet = this.f$0;
                                if (!z2) {
                                    chatbotSheet.updateButton.setVisibility(8);
                                } else {
                                    chatbotSheet.getClass();
                                }
                                break;
                            default:
                                ChatbotSheet chatbotSheet2 = this.f$0;
                                if (!z2) {
                                    chatbotSheet2.getClass();
                                } else {
                                    chatbotSheet2.terminateButton.setVisibility(8);
                                }
                                break;
                        }
                    }
                }).start();
                buttonWithCounterView.setVisibility(0);
                ViewPropertyAnimator viewPropertyAnimatorScaleX = buttonWithCounterView.animate().alpha(z2 ? 0.0f : 1.0f).scaleX(!z2 ? 1.0f : 0.8f);
                final int i2 = 1;
                viewPropertyAnimatorScaleX.scaleY(z2 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable(this) {
                    public final ChatbotSheet f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ChatbotSheet chatbotSheet = this.f$0;
                                if (!z2) {
                                    chatbotSheet.updateButton.setVisibility(8);
                                } else {
                                    chatbotSheet.getClass();
                                }
                                break;
                            default:
                                ChatbotSheet chatbotSheet2 = this.f$0;
                                if (!z2) {
                                    chatbotSheet2.getClass();
                                } else {
                                    chatbotSheet2.terminateButton.setVisibility(8);
                                }
                                break;
                        }
                    }
                }).start();
                return;
            }
            buttonWithCounterView2.setVisibility(z2 ? 0 : 8);
            buttonWithCounterView2.animate().cancel();
            buttonWithCounterView2.setAlpha(z2 ? 1.0f : 0.0f);
            buttonWithCounterView2.setScaleX(z2 ? 1.0f : 0.8f);
            buttonWithCounterView2.setScaleY(z2 ? 1.0f : 0.8f);
            buttonWithCounterView.setVisibility(z2 ? 8 : 0);
            buttonWithCounterView.animate().cancel();
            buttonWithCounterView.setAlpha(z2 ? 0.0f : 1.0f);
            buttonWithCounterView.setScaleX(!z2 ? 1.0f : 0.8f);
            buttonWithCounterView.setScaleY(z2 ? 0.8f : 1.0f);
        }
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new CallLogActivity$$ExternalSyntheticLambda3(this, 5), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        return universalAdapter;
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    public final void lambda$new$2(OAuthSheet$$ExternalSyntheticLambda17 oAuthSheet$$ExternalSyntheticLambda17) {
        BusinessChatbotController businessChatbotController = BusinessChatbotController.getInstance(this.currentAccount);
        businessChatbotController.loaded = false;
        businessChatbotController.load(null);
        oAuthSheet$$ExternalSyntheticLambda17.run();
        lambda$showGiftOfferSheet$15();
    }

    public final void lambda$new$4(TL_account.TL_connectedBot tL_connectedBot, OAuthSheet$$ExternalSyntheticLambda17 oAuthSheet$$ExternalSyntheticLambda17) {
        ButtonWithCounterView buttonWithCounterView = this.terminateButton;
        if (buttonWithCounterView.loading) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(this.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateconnectedbot, new ChatActivity$$ExternalSyntheticLambda208(11, this, oAuthSheet$$ExternalSyntheticLambda17));
    }

    public final void lambda$new$5(TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        BusinessChatbotController businessChatbotController = BusinessChatbotController.getInstance(this.currentAccount);
        businessChatbotController.loaded = false;
        businessChatbotController.load(null);
        lambda$showGiftOfferSheet$15();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            zzks.m(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(this.user)}, BulletinFactory.of(safeLastFragment), R.raw.contact_check);
        }
    }

    public final void lambda$new$7(TL_account.TL_connectedBot tL_connectedBot) {
        ButtonWithCounterView buttonWithCounterView = this.updateButton;
        if (buttonWithCounterView.loading) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(this.currentAccount).getInputUser(tL_connectedBot.bot_id);
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        updateconnectedbot.recipients = businessRecipientsHelper.getBotInputValue();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateconnectedbot, new BoostsActivity$$ExternalSyntheticLambda7(this, tL_connectedBot, businessRecipientsHelper.getBotValue(), 3));
    }

    @Override
    public final void onActionBarAlpha(float f) {
        SimpleTextView titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f);
        }
    }
}
