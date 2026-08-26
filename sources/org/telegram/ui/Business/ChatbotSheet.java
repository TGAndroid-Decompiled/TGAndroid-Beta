package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda5;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TON.TONIntroActivity$$ExternalSyntheticLambda3;

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

    public ChatbotSheet(Context context, TL_account.TL_connectedBot tL_connectedBot, OAuthSheet$$ExternalSyntheticLambda6 oAuthSheet$$ExternalSyntheticLambda6, Theme.ResourcesProvider resourcesProvider) {
        super(context, null, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        this.bot = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.user = user;
        this.headerMoveTop = AndroidUtilities.dp(36.0f);
        this.topPadding = 0.15f;
        BusinessRecipientsHelper businessRecipientsHelper = new BusinessRecipientsHelper(context, this.currentAccount, resourcesProvider, new ChatbotSheet$$ExternalSyntheticLambda0(this, 0));
        this.recipientsHelper = businessRecipientsHelper;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.exclude = tL_businessBotRecipients.exclude_selected;
        businessRecipientsHelper.setValue(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(context);
        this.topView = linearLayout;
        linearLayout.setOrientation(1);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(40.0f));
        avatarDrawable.setInfo(user);
        backupImageView.setForUserOrChat(user, avatarDrawable);
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.actionBar.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 14.0f);
            textViewM.setTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
            textViewM.setText("@" + publicUsername);
            textViewM.setGravity(17);
            linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 18));
        }
        int i = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i));
        fixNavigationBar(getThemedColor(i));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i2 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i2, 0, i2, AndroidUtilities.dp(72.0f));
        this.recyclerListView.setSections();
        this.recyclerListView.setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(0.0f, getThemedColor(i)), getThemedColor(i), getThemedColor(i)}));
        ButtonWithCounterView round = new ButtonWithCounterView(context, true, resourcesProvider).setRound();
        this.terminateButton = round;
        round.setColor(getThemedColor(Theme.key_color_red));
        round.setText(LocaleController.getString(R.string.TerminateSession));
        round.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(this, tL_connectedBot, oAuthSheet$$ExternalSyntheticLambda6, 2));
        frameLayout.addView(round, LayoutHelper.createFrame(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterViewM = zzkg.m(context, resourcesProvider, true);
        this.updateButton = buttonWithCounterViewM;
        buttonWithCounterViewM.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        buttonWithCounterViewM.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(9, this, tL_connectedBot));
        frameLayout.addView(buttonWithCounterViewM, LayoutHelper.createFrame(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        checkDone$4(false);
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2, 80);
        int i3 = layoutParamsCreateFrame.leftMargin;
        int i4 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i3 + i4;
        layoutParamsCreateFrame.rightMargin += i4;
        this.containerView.addView(frameLayout, layoutParamsCreateFrame);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(false);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        if (businessRecipientsHelper == null || !businessRecipientsHelper.hasChanges()) {
            return super.canDismissWithSwipe();
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

    public final void checkDone$4(boolean z) {
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
                final int i2 = 1;
                buttonWithCounterView.animate().alpha(z2 ? 0.0f : 1.0f).scaleX(!z2 ? 1.0f : 0.8f).scaleY(z2 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable(this) {
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
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new GiftSheet$$ExternalSyntheticLambda8(this, 4), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    public final void lambda$new$2(OAuthSheet$$ExternalSyntheticLambda6 oAuthSheet$$ExternalSyntheticLambda6) {
        BusinessChatbotController businessChatbotController = BusinessChatbotController.getInstance(this.currentAccount);
        businessChatbotController.loaded = false;
        businessChatbotController.load(null);
        oAuthSheet$$ExternalSyntheticLambda6.run();
        lambda$showGiftOfferSheet$15();
    }

    public final void lambda$new$4(TL_account.TL_connectedBot tL_connectedBot, OAuthSheet$$ExternalSyntheticLambda6 oAuthSheet$$ExternalSyntheticLambda6) {
        ButtonWithCounterView buttonWithCounterView = this.terminateButton;
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(this.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateconnectedbot, new StarGiftSheet$$ExternalSyntheticLambda0(11, this, oAuthSheet$$ExternalSyntheticLambda6));
    }

    public final void lambda$new$5(TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        BusinessChatbotController businessChatbotController = BusinessChatbotController.getInstance(this.currentAccount);
        businessChatbotController.loaded = false;
        businessChatbotController.load(null);
        lambda$showGiftOfferSheet$15();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            zzkh.m(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(this.user)}, BulletinFactory.of(safeLastFragment), R.raw.contact_check);
        }
    }

    public final void lambda$new$7(TL_account.TL_connectedBot tL_connectedBot) {
        ButtonWithCounterView buttonWithCounterView = this.updateButton;
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(this.currentAccount).getInputUser(tL_connectedBot.bot_id);
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        updateconnectedbot.recipients = businessRecipientsHelper.getBotInputValue();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateconnectedbot, new StarGiftSheet$$ExternalSyntheticLambda1(this, tL_connectedBot, businessRecipientsHelper.getBotValue(), 2));
    }

    @Override
    public final void onActionBarAlpha(float f) {
        SimpleTextView titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f);
        }
    }
}
