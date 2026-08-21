package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
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
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class ChatbotSheet extends BottomSheetWithRecyclerListView {
    private static final int RADIO_EXCLUDE = -1;
    private static final int RADIO_INCLUDE = -2;
    private UniversalAdapter adapter;
    private final AvatarDrawable avatarDrawable;
    private final TL_account.TL_connectedBot bot;
    private final FrameLayout buttonContainer;
    public boolean exclude;
    private Boolean hadChanges;
    private final BackupImageView imageView;
    private final TextView linkView;
    private final BusinessRecipientsHelper recipientsHelper;
    private final TextView subtitleView;
    private final ButtonWithCounterView terminateButton;
    private final TextView titleView;
    private final LinearLayout topView;
    private final ButtonWithCounterView updateButton;
    private final TLRPC.User user;

    @Override
    protected CharSequence getTitle() {
        return null;
    }

    public ChatbotSheet(Context context, final TL_account.TL_connectedBot tL_connectedBot, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        super(context, null, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        this.bot = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.user = user;
        this.headerMoveTop = AndroidUtilities.dp(36.0f);
        this.topPadding = 0.15f;
        BusinessRecipientsHelper businessRecipientsHelper = new BusinessRecipientsHelper(context, this.currentAccount, new Runnable() {
            @Override
            public final void run() {
                ChatbotSheet.$r8$lambda$X8HbbM2ERueK6X_uCMaayVCiHsM(this.f$0);
            }
        }, resourcesProvider);
        this.recipientsHelper = businessRecipientsHelper;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.exclude = tL_businessBotRecipients.exclude_selected;
        businessRecipientsHelper.setValue(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(context);
        this.topView = linearLayout;
        linearLayout.setOrientation(1);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        this.avatarDrawable = avatarDrawable;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(40.0f));
        avatarDrawable.setInfo(user);
        backupImageView.setForUserOrChat(user, avatarDrawable);
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.actionBar.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(context);
        this.subtitleView = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(context);
            this.linkView = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 18));
        } else {
            this.linkView = null;
        }
        int i = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i));
        fixNavigationBar(getThemedColor(i));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i2 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i2, 0, i2, AndroidUtilities.dp(72.0f));
        this.recyclerListView.setSections();
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                ChatbotSheet.$r8$lambda$93_1LwG8br9kIVc_vVWUwmW30n0(this.f$0, view, i3);
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonContainer = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(getThemedColor(i), 0.0f), getThemedColor(i), getThemedColor(i)}));
        ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        this.terminateButton = round;
        round.setColor(getThemedColor(Theme.key_color_red));
        round.setText(LocaleController.getString(R.string.TerminateSession));
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatbotSheet.$r8$lambda$ymE1wdeRIeDYxTWR7DrwdiUS7EU(this.f$0, tL_connectedBot, runnable, view);
            }
        });
        frameLayout.addView(round, LayoutHelper.createFrame(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ButtonWithCounterView round2 = new ButtonWithCounterView(context, resourcesProvider).setRound();
        this.updateButton = round2;
        round2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        round2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatbotSheet.$r8$lambda$8qdYRwTklFahDPJwZSjzIRzJE6M(this.f$0, tL_connectedBot, view);
            }
        });
        frameLayout.addView(round2, LayoutHelper.createFrame(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        checkDone(false);
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
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(false);
        }
    }

    public static void $r8$lambda$X8HbbM2ERueK6X_uCMaayVCiHsM(ChatbotSheet chatbotSheet) {
        UniversalAdapter universalAdapter = chatbotSheet.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(true);
        }
        chatbotSheet.checkDone(true);
    }

    public static void $r8$lambda$93_1LwG8br9kIVc_vVWUwmW30n0(ChatbotSheet chatbotSheet, View view, int i) {
        UItem item = chatbotSheet.adapter.getItem(i - 1);
        if (item == null) {
            return;
        }
        chatbotSheet.onItemClick(item, view, i);
    }

    public static void $r8$lambda$ymE1wdeRIeDYxTWR7DrwdiUS7EU(final ChatbotSheet chatbotSheet, TL_account.TL_connectedBot tL_connectedBot, final Runnable runnable, View view) {
        if (chatbotSheet.terminateButton.isLoading()) {
            return;
        }
        chatbotSheet.terminateButton.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(chatbotSheet.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(chatbotSheet.currentAccount).sendRequest(updateconnectedbot, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatbotSheet.$r8$lambda$ZY1nFBsG2i554ecaNrKnNd6UIaI(this.f$0, runnable, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$ZY1nFBsG2i554ecaNrKnNd6UIaI(final ChatbotSheet chatbotSheet, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        chatbotSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatbotSheet.m1380$r8$lambda$tOpa5os6ICPtjTHyn2lyJelbUw(this.f$0, runnable);
            }
        });
    }

    public static void m1380$r8$lambda$tOpa5os6ICPtjTHyn2lyJelbUw(ChatbotSheet chatbotSheet, Runnable runnable) {
        BusinessChatbotController.getInstance(chatbotSheet.currentAccount).invalidate(true);
        if (runnable != null) {
            runnable.run();
        }
        chatbotSheet.dismiss();
    }

    public static void $r8$lambda$8qdYRwTklFahDPJwZSjzIRzJE6M(final ChatbotSheet chatbotSheet, final TL_account.TL_connectedBot tL_connectedBot, View view) {
        if (chatbotSheet.updateButton.isLoading()) {
            return;
        }
        chatbotSheet.updateButton.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(chatbotSheet.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = chatbotSheet.recipientsHelper.getBotInputValue();
        final TL_account.TL_businessBotRecipients botValue = chatbotSheet.recipientsHelper.getBotValue();
        ConnectionsManager.getInstance(chatbotSheet.currentAccount).sendRequest(updateconnectedbot, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatbotSheet.$r8$lambda$9Ak_XkKXOK5wSJSfzNaVg4ET1vE(this.f$0, tL_connectedBot, botValue, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$9Ak_XkKXOK5wSJSfzNaVg4ET1vE(final ChatbotSheet chatbotSheet, final TL_account.TL_connectedBot tL_connectedBot, final TL_account.TL_businessBotRecipients tL_businessBotRecipients, TLObject tLObject, TLRPC.TL_error tL_error) {
        chatbotSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatbotSheet.$r8$lambda$4R05EBMhvWdNscTFtGh96lZUPKk(this.f$0, tL_connectedBot, tL_businessBotRecipients);
            }
        });
    }

    public static void $r8$lambda$4R05EBMhvWdNscTFtGh96lZUPKk(ChatbotSheet chatbotSheet, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        BusinessChatbotController.getInstance(chatbotSheet.currentAccount).invalidate(true);
        chatbotSheet.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.contact_check, LocaleController.formatString(R.string.BusinessBotUpdated, UserObject.getUserName(chatbotSheet.user))).show();
        }
    }

    @Override
    protected void onActionBarAlpha(float f) {
        SimpleTextView titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f);
        }
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        universalAdapter.itemsOffset = 1;
        arrayList.add(UItem.asCustomShadow(-5, this.topView));
        TL_account.TL_connectedBot tL_connectedBot = this.bot;
        if (tL_connectedBot != null) {
            if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(this.bot.flags, 2) || TLObject.hasFlag(this.bot.flags, 4)) {
                arrayList.add(UItem.asHeader(LocaleController.getString(R.string.SessionBotConnectedFrom)));
                if (TLObject.hasFlag(this.bot.flags, 1)) {
                    arrayList.add(UItem.asButton(1, LocaleController.getString(R.string.SessionBotDevice), this.bot.device));
                }
                if (TLObject.hasFlag(this.bot.flags, 4)) {
                    arrayList.add(UItem.asButton(2, LocaleController.getString(R.string.SessionBotLocation), this.bot.location));
                }
                if (TLObject.hasFlag(this.bot.flags, 2)) {
                    arrayList.add(UItem.asButton(3, LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(this.bot.date, false)));
                }
                arrayList.add(UItem.asShadow(null));
            }
            universalAdapter.whiteSectionStart();
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BusinessBotChats2)));
            arrayList.add(UItem.asRadio(RADIO_EXCLUDE, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2)).setChecked(this.exclude));
            arrayList.add(UItem.asRadio(RADIO_INCLUDE, LocaleController.getString(R.string.BusinessChatsOnlySelected2)).setChecked(!this.exclude));
            universalAdapter.whiteSectionEnd();
            arrayList.add(UItem.asShadow(null));
            BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
            if (businessRecipientsHelper != null) {
                businessRecipientsHelper.fillItems(arrayList, universalAdapter, true);
            }
            arrayList.add(UItem.asShadow(LocaleController.getString(R.string.BusinessBotChatsInfo2)));
        }
    }

    private void onItemClick(UItem uItem, View view, int i) {
        if (this.recipientsHelper.onClick(uItem)) {
            return;
        }
        int i2 = uItem.id;
        if (i2 == RADIO_EXCLUDE) {
            BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
            this.exclude = true;
            businessRecipientsHelper.setExclude(true);
            this.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == RADIO_INCLUDE) {
            BusinessRecipientsHelper businessRecipientsHelper2 = this.recipientsHelper;
            this.exclude = false;
            businessRecipientsHelper2.setExclude(false);
            this.adapter.update(true);
            checkDone(true);
        }
    }

    @Override
    protected boolean canDismissWithSwipe() {
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        if (businessRecipientsHelper == null || !businessRecipientsHelper.hasChanges()) {
            return super.canDismissWithSwipe();
        }
        return false;
    }

    @Override
    protected boolean canDismissWithTouchOutside() {
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        if (businessRecipientsHelper == null || !businessRecipientsHelper.hasChanges()) {
            return super.canDismissWithTouchOutside();
        }
        return false;
    }

    private void checkDone(boolean z) {
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        final boolean z2 = businessRecipientsHelper != null && businessRecipientsHelper.hasChanges();
        Boolean bool = this.hadChanges;
        if (bool == null || bool.booleanValue() != z2) {
            this.hadChanges = Boolean.valueOf(z2);
            if (!z) {
                this.updateButton.setVisibility(z2 ? 0 : 8);
                this.updateButton.animate().cancel();
                this.updateButton.setAlpha(z2 ? 1.0f : 0.0f);
                this.updateButton.setScaleX(z2 ? 1.0f : 0.8f);
                this.updateButton.setScaleY(z2 ? 1.0f : 0.8f);
                this.terminateButton.setVisibility(z2 ? 8 : 0);
                this.terminateButton.animate().cancel();
                this.terminateButton.setAlpha(z2 ? 0.0f : 1.0f);
                this.terminateButton.setScaleX(!z2 ? 1.0f : 0.8f);
                this.terminateButton.setScaleY(z2 ? 0.8f : 1.0f);
                return;
            }
            this.updateButton.setVisibility(0);
            ViewPropertyAnimator duration = this.updateButton.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.8f).scaleY(z2 ? 1.0f : 0.8f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    ChatbotSheet.m1379$r8$lambda$pY7JrmUyXtZFhutEWnyRwmSM8k(this.f$0, z2);
                }
            }).start();
            this.terminateButton.setVisibility(0);
            this.terminateButton.animate().alpha(z2 ? 0.0f : 1.0f).scaleX(!z2 ? 1.0f : 0.8f).scaleY(z2 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    ChatbotSheet.$r8$lambda$VjPssJ6kx6M7Fs8WuqBlPT7nVH0(this.f$0, z2);
                }
            }).start();
        }
    }

    public static void m1379$r8$lambda$pY7JrmUyXtZFhutEWnyRwmSM8k(ChatbotSheet chatbotSheet, boolean z) {
        if (z) {
            chatbotSheet.getClass();
        } else {
            chatbotSheet.updateButton.setVisibility(8);
        }
    }

    public static void $r8$lambda$VjPssJ6kx6M7Fs8WuqBlPT7nVH0(ChatbotSheet chatbotSheet, boolean z) {
        if (z) {
            chatbotSheet.terminateButton.setVisibility(8);
        } else {
            chatbotSheet.getClass();
        }
    }
}
