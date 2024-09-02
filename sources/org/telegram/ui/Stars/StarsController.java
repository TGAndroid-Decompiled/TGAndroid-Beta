package org.telegram.ui.Stars;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.core.util.Consumer;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatInvite;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputInvoice;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageExtendedMedia;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$MessageReactions;
import org.telegram.tgnet.TLRPC$PaymentForm;
import org.telegram.tgnet.TLRPC$PaymentReceipt;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$StarsTransaction;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_getStarsSubscriptions;
import org.telegram.tgnet.TLRPC$TL_help_country;
import org.telegram.tgnet.TLRPC$TL_inputDocument;
import org.telegram.tgnet.TLRPC$TL_inputInvoiceChatInviteSubscription;
import org.telegram.tgnet.TLRPC$TL_inputInvoiceMessage;
import org.telegram.tgnet.TLRPC$TL_inputInvoiceStars;
import org.telegram.tgnet.TLRPC$TL_inputMediaDocument;
import org.telegram.tgnet.TLRPC$TL_inputMediaPaidMedia;
import org.telegram.tgnet.TLRPC$TL_inputMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_inputPeerSelf;
import org.telegram.tgnet.TLRPC$TL_inputPhoto;
import org.telegram.tgnet.TLRPC$TL_inputStorePaymentStarsGift;
import org.telegram.tgnet.TLRPC$TL_inputStorePaymentStarsGiveaway;
import org.telegram.tgnet.TLRPC$TL_inputStorePaymentStarsTopup;
import org.telegram.tgnet.TLRPC$TL_labeledPrice;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageExtendedMedia;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaPaidMedia;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messages_editMessage;
import org.telegram.tgnet.TLRPC$TL_messages_getExtendedMedia;
import org.telegram.tgnet.TLRPC$TL_messages_getScheduledMessages;
import org.telegram.tgnet.TLRPC$TL_messages_messages;
import org.telegram.tgnet.TLRPC$TL_messages_sendPaidReaction;
import org.telegram.tgnet.TLRPC$TL_payments_canPurchasePremium;
import org.telegram.tgnet.TLRPC$TL_payments_getPaymentForm;
import org.telegram.tgnet.TLRPC$TL_payments_getStarsStatus;
import org.telegram.tgnet.TLRPC$TL_payments_getStarsTransactions;
import org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars;
import org.telegram.tgnet.TLRPC$TL_payments_paymentResult;
import org.telegram.tgnet.TLRPC$TL_payments_sendStarsForm;
import org.telegram.tgnet.TLRPC$TL_payments_starsStatus;
import org.telegram.tgnet.TLRPC$TL_starsGiftOption;
import org.telegram.tgnet.TLRPC$TL_starsGiveawayOption;
import org.telegram.tgnet.TLRPC$TL_starsTopupOption;
import org.telegram.tgnet.TLRPC$TL_updateChannel;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.bots.BotWebViewSheet;

public class StarsController {
    private static volatile StarsController[] Instance = new StarsController[4];
    private static final Object[] lockObjects = new Object[4];
    public long balance;
    private boolean balanceLoaded;
    private boolean balanceLoading;
    public final int currentAccount;
    public PendingPaidReactions currentPendingReactions;
    private ArrayList giftOptions;
    private boolean giftOptionsLoaded;
    private boolean giftOptionsLoading;
    private ArrayList giveawayOptions;
    private boolean giveawayOptionsLoaded;
    private boolean giveawayOptionsLoading;
    private boolean insufficientSubscriptionsLoading;
    private long lastBalanceLoaded;
    public long minus;
    private ArrayList options;
    private boolean optionsLoaded;
    private boolean optionsLoading;
    private boolean paymentFormOpened;
    public boolean subscriptionsEndReached;
    public boolean subscriptionsLoading;
    public String subscriptionsOffset;
    public final ArrayList[] transactions = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] transactionsExist = new boolean[3];
    private final String[] offset = new String[3];
    private final boolean[] loading = new boolean[3];
    private final boolean[] endReached = new boolean[3];
    public final ArrayList subscriptions = new ArrayList();
    public final ArrayList insufficientSubscriptions = new ArrayList();

    public static class MessageId {
        public long did;
        public int mid;

        private MessageId(long j, int i) {
            this.did = j;
            this.mid = i;
        }

        public static MessageId from(long j, int i) {
            return new MessageId(j, i);
        }

        public static MessageId from(MessageObject messageObject) {
            if (messageObject == null) {
                return null;
            }
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            return (tLRPC$Message == null || !(tLRPC$Message.isThreadMessage || messageObject.isForwardedChannelPost()) || messageObject.messageOwner.fwd_from == null) ? new MessageId(messageObject.getDialogId(), messageObject.getId()) : new MessageId(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof MessageId)) {
                return false;
            }
            MessageId messageId = (MessageId) obj;
            return messageId.did == this.did && messageId.mid == this.mid;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.did), Integer.valueOf(this.mid));
        }
    }

    public class PendingPaidReactions {
        public long amount;
        public boolean applied;
        public Bulletin bulletin;
        public Bulletin.UndoButton bulletinButton;
        public Bulletin.TwoLineAnimatedLottieLayout bulletinLayout;
        public final Runnable cancelRunnable;
        public ChatActivity chatActivity;
        public final Runnable closeRunnable;
        public long lastTime;
        public MessageId message;
        public MessageObject messageObject;
        public long not_added;
        public StarReactionsOverlay overlay;
        public long random_id;
        public boolean shownBulletin;
        public Bulletin.TimerView timerView;
        public boolean wasChosen;
        public boolean committed = false;
        public boolean cancelled = false;
        public Boolean anonymous = null;

        public PendingPaidReactions(MessageId messageId, MessageObject messageObject, ChatActivity chatActivity, long j, boolean z) {
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    StarsController.PendingPaidReactions.this.close();
                }
            };
            this.closeRunnable = runnable;
            this.cancelRunnable = new Runnable() {
                @Override
                public final void run() {
                    StarsController.PendingPaidReactions.this.cancel();
                }
            };
            this.message = messageId;
            this.messageObject = messageObject;
            this.random_id = (Utilities.random.nextLong() & 4294967295L) | (j << 32);
            this.chatActivity = chatActivity;
            Context context = StarsController.this.getContext(chatActivity);
            Bulletin.TwoLineAnimatedLottieLayout twoLineAnimatedLottieLayout = new Bulletin.TwoLineAnimatedLottieLayout(context, chatActivity.themeDelegate);
            this.bulletinLayout = twoLineAnimatedLottieLayout;
            twoLineAnimatedLottieLayout.setAnimation(R.raw.stars_topup, new String[0]);
            this.bulletinLayout.titleTextView.setText(LocaleController.getString(isAnonymous() ? R.string.StarsSentAnonymouslyTitle : R.string.StarsSentTitle));
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context, true, false, chatActivity.themeDelegate);
            this.bulletinButton = undoButton;
            undoButton.setText(LocaleController.getString(R.string.StarsSentUndo));
            this.bulletinButton.setUndoAction(new Runnable() {
                @Override
                public final void run() {
                    StarsController.PendingPaidReactions.this.cancel();
                }
            });
            Bulletin.TimerView timerView = new Bulletin.TimerView(context, chatActivity.themeDelegate);
            this.timerView = timerView;
            timerView.timeLeft = 5000L;
            timerView.setColor(Theme.getColor(Theme.key_undo_cancelColor, chatActivity.themeDelegate));
            this.bulletinButton.addView(this.timerView, LayoutHelper.createFrame(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.bulletinButton.undoTextView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.bulletinLayout.setButton(this.bulletinButton);
            Bulletin create = BulletinFactory.of(chatActivity).create(this.bulletinLayout, -1);
            this.bulletin = create;
            create.hideAfterBottomSheet = false;
            if (z) {
                create.show(true);
                this.shownBulletin = true;
            }
            this.bulletin.setOnHideListener(runnable);
            this.amount = 0L;
            this.lastTime = System.currentTimeMillis();
            this.wasChosen = messageObject.isPaidReactionChosen();
        }

        public void lambda$commit$0(long j) {
            StarsController.this.sendPaidReaction(this.messageObject, this.chatActivity, j, true, true, this.anonymous);
        }

        public void lambda$commit$1(long j) {
            StarsController.this.sendPaidReaction(this.messageObject, this.chatActivity, j, true, true, this.anonymous);
        }

        public void lambda$commit$2(TLObject tLObject, MessagesController messagesController, TLRPC$TL_error tLRPC$TL_error, final long j) {
            String str;
            if (tLObject != null) {
                messagesController.processUpdates((TLRPC$Updates) tLObject, false);
                return;
            }
            if (tLRPC$TL_error != null) {
                this.messageObject.addPaidReactions((int) (-this.amount), this.wasChosen, isAnonymous());
                NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
                if ("BALANCE_TOO_LOW".equals(tLRPC$TL_error.text)) {
                    long j2 = this.message.did;
                    MessagesController messagesController2 = this.chatActivity.getMessagesController();
                    MessageId messageId = this.message;
                    if (j2 >= 0) {
                        str = UserObject.getForcedFirstName(messagesController2.getUser(Long.valueOf(messageId.did)));
                    } else {
                        TLRPC$Chat chat = messagesController2.getChat(Long.valueOf(-messageId.did));
                        str = chat == null ? "" : chat.title;
                    }
                    String str2 = str;
                    Context context = this.chatActivity.getContext();
                    if (context == null) {
                        context = LaunchActivity.instance;
                    }
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                    new StarsIntroActivity.StarsNeededSheet(context, this.chatActivity.getResourceProvider(), j, 5, str2, new Runnable() {
                        @Override
                        public final void run() {
                            StarsController.PendingPaidReactions.this.lambda$commit$1(j);
                        }
                    }).show();
                }
                StarsController.this.invalidateTransactions(false);
                StarsController.this.invalidateBalance();
            }
        }

        public void lambda$commit$3(final MessagesController messagesController, final long j, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.PendingPaidReactions.this.lambda$commit$2(tLObject, messagesController, tLRPC$TL_error, j);
                }
            });
        }

        public void add(long j, boolean z) {
            if (this.committed || this.cancelled) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    throw new RuntimeException("adding more amount to committed reactions");
                }
                return;
            }
            this.amount += j;
            this.lastTime = System.currentTimeMillis();
            this.bulletinLayout.subtitleTextView.cancelAnimation();
            this.bulletinLayout.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) this.amount, new Object[0])), true);
            if (this.shownBulletin) {
                this.timerView.timeLeft = 5000L;
                AndroidUtilities.cancelRunOnUIThread(this.closeRunnable);
                AndroidUtilities.runOnUIThread(this.closeRunnable, 5000L);
            }
            if (z) {
                this.applied = true;
                this.messageObject.addPaidReactions((int) j, true, isAnonymous());
                StarsController starsController = StarsController.this;
                starsController.minus += j;
                NotificationCenter.getInstance(starsController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
                NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                this.applied = false;
                if (this.messageObject.ensurePaidReactionsExist(true)) {
                    this.not_added--;
                }
                NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
                this.not_added += j;
            }
            this.bulletinLayout.titleTextView.setText(LocaleController.getString(isAnonymous() ? R.string.StarsSentAnonymouslyTitle : R.string.StarsSentTitle));
        }

        public void apply() {
            if (!this.applied) {
                this.applied = true;
                this.messageObject.addPaidReactions((int) this.not_added, true, isAnonymous());
                StarsController starsController = StarsController.this;
                starsController.minus += this.not_added;
                NotificationCenter.getInstance(starsController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                this.not_added = 0L;
                NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
            }
            if (!this.shownBulletin) {
                this.shownBulletin = true;
                this.timerView.timeLeft = 5000L;
                AndroidUtilities.cancelRunOnUIThread(this.closeRunnable);
                AndroidUtilities.runOnUIThread(this.closeRunnable, 5000L);
                this.bulletin.show(true);
                this.bulletin.setOnHideListener(this.closeRunnable);
            }
            this.bulletinLayout.titleTextView.setText(LocaleController.getString(isAnonymous() ? R.string.StarsSentAnonymouslyTitle : R.string.StarsSentTitle));
        }

        public void cancel() {
            AndroidUtilities.cancelRunOnUIThread(this.closeRunnable);
            this.cancelled = true;
            this.bulletin.hide();
            StarReactionsOverlay starReactionsOverlay = this.overlay;
            if (starReactionsOverlay != null) {
                starReactionsOverlay.hide();
            }
            this.messageObject.addPaidReactions((int) (-this.amount), this.wasChosen, isAnonymous());
            StarsController starsController = StarsController.this;
            starsController.minus -= this.amount;
            NotificationCenter.getInstance(starsController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
            StarsController starsController2 = StarsController.this;
            if (starsController2.currentPendingReactions == this) {
                starsController2.currentPendingReactions = null;
            }
        }

        public void close() {
            AndroidUtilities.cancelRunOnUIThread(this.closeRunnable);
            if (this.applied) {
                commit();
            } else {
                this.cancelled = true;
                this.messageObject.addPaidReactions((int) (-this.amount), this.wasChosen, isAnonymous());
                StarsController starsController = StarsController.this;
                starsController.minus -= this.amount;
                NotificationCenter.getInstance(starsController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            }
            this.bulletin.hide();
            StarReactionsOverlay starReactionsOverlay = this.overlay;
            if (starReactionsOverlay != null && starReactionsOverlay.isShowing(this.messageObject)) {
                this.overlay.hide();
            }
            StarsController starsController2 = StarsController.this;
            if (starsController2.currentPendingReactions == this) {
                starsController2.currentPendingReactions = null;
            }
        }

        public void commit() {
            String str;
            if (this.committed || this.cancelled) {
                return;
            }
            StarsController starsController = StarsController.getInstance(StarsController.this.currentAccount);
            final MessagesController messagesController = MessagesController.getInstance(StarsController.this.currentAccount);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(StarsController.this.currentAccount);
            final long j = this.amount;
            if (!starsController.balanceAvailable() || starsController.getBalance() >= j) {
                this.committed = true;
                TLRPC$TL_messages_sendPaidReaction tLRPC$TL_messages_sendPaidReaction = new TLRPC$TL_messages_sendPaidReaction();
                tLRPC$TL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.message.did);
                tLRPC$TL_messages_sendPaidReaction.msg_id = this.message.mid;
                tLRPC$TL_messages_sendPaidReaction.random_id = this.random_id;
                tLRPC$TL_messages_sendPaidReaction.count = (int) this.amount;
                tLRPC$TL_messages_sendPaidReaction.isPrivate = Boolean.valueOf(isAnonymous());
                StarsController.this.invalidateBalance();
                connectionsManager.sendRequest(tLRPC$TL_messages_sendPaidReaction, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        StarsController.PendingPaidReactions.this.lambda$commit$3(messagesController, j, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            this.cancelled = true;
            this.messageObject.addPaidReactions((int) (-this.amount), this.wasChosen, isAnonymous());
            StarsController starsController2 = StarsController.this;
            starsController2.minus = 0L;
            NotificationCenter.getInstance(starsController2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
            long j2 = this.message.did;
            MessagesController messagesController2 = this.chatActivity.getMessagesController();
            MessageId messageId = this.message;
            if (j2 >= 0) {
                str = UserObject.getForcedFirstName(messagesController2.getUser(Long.valueOf(messageId.did)));
            } else {
                TLRPC$Chat chat = messagesController2.getChat(Long.valueOf(-messageId.did));
                str = chat == null ? "" : chat.title;
            }
            String str2 = str;
            Context context = this.chatActivity.getContext();
            if (context == null) {
                context = LaunchActivity.instance;
            }
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            new StarsIntroActivity.StarsNeededSheet(context, this.chatActivity.getResourceProvider(), j, 5, str2, new Runnable() {
                @Override
                public final void run() {
                    StarsController.PendingPaidReactions.this.lambda$commit$0(j);
                }
            }).show();
        }

        public boolean isAnonymous() {
            Boolean bool = this.anonymous;
            return bool != null ? bool.booleanValue() : StarsController.this.arePaidReactionsAnonymous(this.messageObject);
        }

        public void setOverlay(StarReactionsOverlay starReactionsOverlay) {
            this.overlay = starReactionsOverlay;
        }
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    private StarsController(int i) {
        this.currentAccount = i;
    }

    private void bulletinError(String str) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        ((lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment)).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
    }

    private void bulletinError(TLRPC$TL_error tLRPC$TL_error, String str) {
        if (tLRPC$TL_error != null) {
            str = tLRPC$TL_error.text;
        }
        bulletinError(str);
    }

    public static StarsController getInstance(int i) {
        StarsController starsController = Instance[i];
        if (starsController == null) {
            synchronized (lockObjects[i]) {
                try {
                    starsController = Instance[i];
                    if (starsController == null) {
                        StarsController[] starsControllerArr = Instance;
                        StarsController starsController2 = new StarsController(i);
                        starsControllerArr[i] = starsController2;
                        starsController = starsController2;
                    }
                } finally {
                }
            }
        }
        return starsController;
    }

    public static void lambda$buy$26(Utilities.Callback2 callback2, PaymentFormActivity.InvoiceStatus invoiceStatus) {
        Boolean bool;
        if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
            if (callback2 == null) {
                return;
            } else {
                bool = Boolean.TRUE;
            }
        } else if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PENDING || callback2 == null) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        callback2.run(bool, null);
    }

    public void lambda$buy$27(TLRPC$TL_error tLRPC$TL_error, final Utilities.Callback2 callback2, TLObject tLObject, TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars) {
        if (tLRPC$TL_error != null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, tLRPC$TL_error.text);
                return;
            }
            return;
        }
        PaymentFormActivity paymentFormActivity = null;
        if (tLObject instanceof TLRPC$PaymentForm) {
            TLRPC$PaymentForm tLRPC$PaymentForm = (TLRPC$PaymentForm) tLObject;
            tLRPC$PaymentForm.invoice.recurring = true;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$PaymentForm.users, false);
            paymentFormActivity = new PaymentFormActivity(tLRPC$PaymentForm, tLRPC$TL_inputInvoiceStars, (BaseFragment) null);
        } else if (tLObject instanceof TLRPC$PaymentReceipt) {
            paymentFormActivity = new PaymentFormActivity((TLRPC$PaymentReceipt) tLObject);
        }
        if (paymentFormActivity == null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            }
            return;
        }
        paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() {
            @Override
            public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                StarsController.lambda$buy$26(Utilities.Callback2.this, invoiceStatus);
            }
        });
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        if (!AndroidUtilities.hasDialogOnTop(lastFragment)) {
            lastFragment.presentFragment(paymentFormActivity);
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(paymentFormActivity, bottomSheetParams);
    }

    public void lambda$buy$28(final Utilities.Callback2 callback2, final TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$buy$27(tLRPC$TL_error, callback2, tLObject, tLRPC$TL_inputInvoiceStars);
            }
        });
    }

    public static void lambda$buy$29(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
    }

    public static void lambda$buy$30(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
    }

    public static void lambda$buy$31(Utilities.Callback2 callback2, boolean z, String str) {
        callback2.run(Boolean.valueOf(z), str);
    }

    public static void lambda$buy$32(BillingResult billingResult, final Utilities.Callback2 callback2, BillingResult billingResult2) {
        final boolean z = billingResult.getResponseCode() == 0;
        final String responseCodeString = z ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$31(Utilities.Callback2.this, z, responseCodeString);
            }
        });
    }

    public static void lambda$buy$33(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, null);
    }

    public static void lambda$buy$34(final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$33(Utilities.Callback2.this);
            }
        });
    }

    public static void lambda$buy$35(List list, final Utilities.Callback2 callback2, TLRPC$TL_inputStorePaymentStarsTopup tLRPC$TL_inputStorePaymentStarsTopup, TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption, final BillingResult billingResult, Activity activity) {
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buy$29(Utilities.Callback2.this);
                }
            });
            return;
        }
        ProductDetails productDetails = (ProductDetails) list.get(0);
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
        if (oneTimePurchaseOfferDetails == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buy$30(Utilities.Callback2.this);
                }
            });
            return;
        }
        tLRPC$TL_inputStorePaymentStarsTopup.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
        double pow = Math.pow(10.0d, 6.0d);
        Double.isNaN(priceAmountMicros);
        tLRPC$TL_inputStorePaymentStarsTopup.amount = (long) ((priceAmountMicros / pow) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tLRPC$TL_starsTopupOption.currency)));
        BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
            @Override
            public final void accept(Object obj) {
                StarsController.lambda$buy$32(BillingResult.this, callback2, (BillingResult) obj);
            }
        });
        BillingController.getInstance().setOnCanceled(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$34(Utilities.Callback2.this);
            }
        });
        BillingController.getInstance().launchBillingFlow(activity, AccountInstance.getInstance(UserConfig.selectedAccount), tLRPC$TL_inputStorePaymentStarsTopup, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails((ProductDetails) list.get(0)).build()));
    }

    public static void lambda$buy$36(final Utilities.Callback2 callback2, final TLRPC$TL_inputStorePaymentStarsTopup tLRPC$TL_inputStorePaymentStarsTopup, final TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption, final Activity activity, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$35(list, callback2, tLRPC$TL_inputStorePaymentStarsTopup, tLRPC$TL_starsTopupOption, billingResult, activity);
            }
        });
    }

    public static void lambda$buyGift$37(Utilities.Callback2 callback2, PaymentFormActivity.InvoiceStatus invoiceStatus) {
        Boolean bool;
        if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
            if (callback2 == null) {
                return;
            } else {
                bool = Boolean.TRUE;
            }
        } else if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PENDING || callback2 == null) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        callback2.run(bool, null);
    }

    public void lambda$buyGift$38(TLRPC$TL_error tLRPC$TL_error, final Utilities.Callback2 callback2, TLObject tLObject, TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars) {
        if (tLRPC$TL_error != null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, tLRPC$TL_error.text);
                return;
            }
            return;
        }
        PaymentFormActivity paymentFormActivity = null;
        if (tLObject instanceof TLRPC$PaymentForm) {
            TLRPC$PaymentForm tLRPC$PaymentForm = (TLRPC$PaymentForm) tLObject;
            tLRPC$PaymentForm.invoice.recurring = true;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$PaymentForm.users, false);
            paymentFormActivity = new PaymentFormActivity(tLRPC$PaymentForm, tLRPC$TL_inputInvoiceStars, (BaseFragment) null);
        } else if (tLObject instanceof TLRPC$PaymentReceipt) {
            paymentFormActivity = new PaymentFormActivity((TLRPC$PaymentReceipt) tLObject);
        }
        if (paymentFormActivity == null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            }
            return;
        }
        paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() {
            @Override
            public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                StarsController.lambda$buyGift$37(Utilities.Callback2.this, invoiceStatus);
            }
        });
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        if (!AndroidUtilities.hasDialogOnTop(lastFragment)) {
            lastFragment.presentFragment(paymentFormActivity);
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(paymentFormActivity, bottomSheetParams);
    }

    public void lambda$buyGift$39(final Utilities.Callback2 callback2, final TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$buyGift$38(tLRPC$TL_error, callback2, tLObject, tLRPC$TL_inputInvoiceStars);
            }
        });
    }

    public static void lambda$buyGift$40(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
    }

    public static void lambda$buyGift$41(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
    }

    public static void lambda$buyGift$42(Utilities.Callback2 callback2, boolean z, String str) {
        callback2.run(Boolean.valueOf(z), str);
    }

    public static void lambda$buyGift$43(BillingResult billingResult, final Utilities.Callback2 callback2, BillingResult billingResult2) {
        final boolean z = billingResult.getResponseCode() == 0;
        final String responseCodeString = z ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGift$42(Utilities.Callback2.this, z, responseCodeString);
            }
        });
    }

    public static void lambda$buyGift$44(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, null);
    }

    public static void lambda$buyGift$45(final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGift$44(Utilities.Callback2.this);
            }
        });
    }

    public static void lambda$buyGift$46(TLObject tLObject, ProductDetails productDetails, final BillingResult billingResult, final Utilities.Callback2 callback2, Activity activity, TLRPC$TL_inputStorePaymentStarsGift tLRPC$TL_inputStorePaymentStarsGift, List list, TLRPC$TL_error tLRPC$TL_error) {
        Boolean bool;
        String str;
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
                @Override
                public final void accept(Object obj) {
                    StarsController.lambda$buyGift$43(BillingResult.this, callback2, (BillingResult) obj);
                }
            });
            BillingController.getInstance().setOnCanceled(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buyGift$45(Utilities.Callback2.this);
                }
            });
            BillingController.getInstance().launchBillingFlow(activity, AccountInstance.getInstance(UserConfig.selectedAccount), tLRPC$TL_inputStorePaymentStarsGift, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails((ProductDetails) list.get(0)).build()));
            return;
        }
        if (tLObject instanceof TLRPC$TL_boolFalse) {
            if (callback2 == null) {
                return;
            }
            bool = Boolean.FALSE;
            str = "PURCHASE_FORBIDDEN";
        } else {
            if (callback2 == null) {
                return;
            }
            bool = Boolean.FALSE;
            str = tLRPC$TL_error != null ? tLRPC$TL_error.text : "SERVER_ERROR";
        }
        callback2.run(bool, str);
    }

    public static void lambda$buyGift$47(final ProductDetails productDetails, final BillingResult billingResult, final Utilities.Callback2 callback2, final Activity activity, final TLRPC$TL_inputStorePaymentStarsGift tLRPC$TL_inputStorePaymentStarsGift, final List list, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGift$46(TLObject.this, productDetails, billingResult, callback2, activity, tLRPC$TL_inputStorePaymentStarsGift, list, tLRPC$TL_error);
            }
        });
    }

    public void lambda$buyGift$48(final List list, final Utilities.Callback2 callback2, final TLRPC$TL_inputStorePaymentStarsGift tLRPC$TL_inputStorePaymentStarsGift, TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption, final BillingResult billingResult, final Activity activity) {
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buyGift$40(Utilities.Callback2.this);
                }
            });
            return;
        }
        final ProductDetails productDetails = (ProductDetails) list.get(0);
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
        if (oneTimePurchaseOfferDetails == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buyGift$41(Utilities.Callback2.this);
                }
            });
            return;
        }
        tLRPC$TL_inputStorePaymentStarsGift.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
        double pow = Math.pow(10.0d, 6.0d);
        Double.isNaN(priceAmountMicros);
        tLRPC$TL_inputStorePaymentStarsGift.amount = (long) ((priceAmountMicros / pow) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tLRPC$TL_starsGiftOption.currency)));
        TLRPC$TL_payments_canPurchasePremium tLRPC$TL_payments_canPurchasePremium = new TLRPC$TL_payments_canPurchasePremium();
        tLRPC$TL_payments_canPurchasePremium.purpose = tLRPC$TL_inputStorePaymentStarsGift;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_canPurchasePremium, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.lambda$buyGift$47(ProductDetails.this, billingResult, callback2, activity, tLRPC$TL_inputStorePaymentStarsGift, list, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$buyGift$49(final Utilities.Callback2 callback2, final TLRPC$TL_inputStorePaymentStarsGift tLRPC$TL_inputStorePaymentStarsGift, final TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption, final Activity activity, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$buyGift$48(list, callback2, tLRPC$TL_inputStorePaymentStarsGift, tLRPC$TL_starsGiftOption, billingResult, activity);
            }
        });
    }

    public static void lambda$buyGiveaway$50(Utilities.Callback2 callback2, PaymentFormActivity.InvoiceStatus invoiceStatus) {
        Boolean bool;
        if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
            if (callback2 == null) {
                return;
            } else {
                bool = Boolean.TRUE;
            }
        } else if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PENDING || callback2 == null) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        callback2.run(bool, null);
    }

    public void lambda$buyGiveaway$51(TLRPC$TL_error tLRPC$TL_error, final Utilities.Callback2 callback2, TLObject tLObject, TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars) {
        if (tLRPC$TL_error != null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, tLRPC$TL_error.text);
                return;
            }
            return;
        }
        PaymentFormActivity paymentFormActivity = null;
        if (tLObject instanceof TLRPC$PaymentForm) {
            TLRPC$PaymentForm tLRPC$PaymentForm = (TLRPC$PaymentForm) tLObject;
            tLRPC$PaymentForm.invoice.recurring = true;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$PaymentForm.users, false);
            paymentFormActivity = new PaymentFormActivity(tLRPC$PaymentForm, tLRPC$TL_inputInvoiceStars, (BaseFragment) null);
        } else if (tLObject instanceof TLRPC$PaymentReceipt) {
            paymentFormActivity = new PaymentFormActivity((TLRPC$PaymentReceipt) tLObject);
        }
        if (paymentFormActivity == null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            }
            return;
        }
        paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() {
            @Override
            public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                StarsController.lambda$buyGiveaway$50(Utilities.Callback2.this, invoiceStatus);
            }
        });
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        if (!AndroidUtilities.hasDialogOnTop(lastFragment)) {
            lastFragment.presentFragment(paymentFormActivity);
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(paymentFormActivity, bottomSheetParams);
    }

    public void lambda$buyGiveaway$52(final Utilities.Callback2 callback2, final TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$buyGiveaway$51(tLRPC$TL_error, callback2, tLObject, tLRPC$TL_inputInvoiceStars);
            }
        });
    }

    public static void lambda$buyGiveaway$53(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
    }

    public static void lambda$buyGiveaway$54(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
    }

    public static void lambda$buyGiveaway$55(Utilities.Callback2 callback2, boolean z, String str) {
        callback2.run(Boolean.valueOf(z), str);
    }

    public static void lambda$buyGiveaway$56(BillingResult billingResult, final Utilities.Callback2 callback2, BillingResult billingResult2) {
        final boolean z = billingResult.getResponseCode() == 0;
        final String responseCodeString = z ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGiveaway$55(Utilities.Callback2.this, z, responseCodeString);
            }
        });
    }

    public static void lambda$buyGiveaway$57(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, null);
    }

    public static void lambda$buyGiveaway$58(final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGiveaway$57(Utilities.Callback2.this);
            }
        });
    }

    public static void lambda$buyGiveaway$59(TLObject tLObject, ProductDetails productDetails, final BillingResult billingResult, final Utilities.Callback2 callback2, Activity activity, TLRPC$TL_inputStorePaymentStarsGiveaway tLRPC$TL_inputStorePaymentStarsGiveaway, List list, TLRPC$TL_error tLRPC$TL_error) {
        Boolean bool;
        String str;
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
                @Override
                public final void accept(Object obj) {
                    StarsController.lambda$buyGiveaway$56(BillingResult.this, callback2, (BillingResult) obj);
                }
            });
            BillingController.getInstance().setOnCanceled(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buyGiveaway$58(Utilities.Callback2.this);
                }
            });
            BillingController.getInstance().launchBillingFlow(activity, AccountInstance.getInstance(UserConfig.selectedAccount), tLRPC$TL_inputStorePaymentStarsGiveaway, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails((ProductDetails) list.get(0)).build()));
            return;
        }
        if (tLObject instanceof TLRPC$TL_boolFalse) {
            if (callback2 == null) {
                return;
            }
            bool = Boolean.FALSE;
            str = "PURCHASE_FORBIDDEN";
        } else {
            if (callback2 == null) {
                return;
            }
            bool = Boolean.FALSE;
            str = tLRPC$TL_error != null ? tLRPC$TL_error.text : "SERVER_ERROR";
        }
        callback2.run(bool, str);
    }

    public static void lambda$buyGiveaway$60(final ProductDetails productDetails, final BillingResult billingResult, final Utilities.Callback2 callback2, final Activity activity, final TLRPC$TL_inputStorePaymentStarsGiveaway tLRPC$TL_inputStorePaymentStarsGiveaway, final List list, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGiveaway$59(TLObject.this, productDetails, billingResult, callback2, activity, tLRPC$TL_inputStorePaymentStarsGiveaway, list, tLRPC$TL_error);
            }
        });
    }

    public void lambda$buyGiveaway$61(final List list, final Utilities.Callback2 callback2, final TLRPC$TL_inputStorePaymentStarsGiveaway tLRPC$TL_inputStorePaymentStarsGiveaway, final BillingResult billingResult, final Activity activity) {
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buyGiveaway$53(Utilities.Callback2.this);
                }
            });
            return;
        }
        final ProductDetails productDetails = (ProductDetails) list.get(0);
        if (productDetails.getOneTimePurchaseOfferDetails() == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buyGiveaway$54(Utilities.Callback2.this);
                }
            });
            return;
        }
        TLRPC$TL_payments_canPurchasePremium tLRPC$TL_payments_canPurchasePremium = new TLRPC$TL_payments_canPurchasePremium();
        tLRPC$TL_payments_canPurchasePremium.purpose = tLRPC$TL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_canPurchasePremium, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.lambda$buyGiveaway$60(ProductDetails.this, billingResult, callback2, activity, tLRPC$TL_inputStorePaymentStarsGiveaway, list, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$buyGiveaway$62(final Utilities.Callback2 callback2, final TLRPC$TL_inputStorePaymentStarsGiveaway tLRPC$TL_inputStorePaymentStarsGiveaway, final Activity activity, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$buyGiveaway$61(list, callback2, tLRPC$TL_inputStorePaymentStarsGiveaway, billingResult, activity);
            }
        });
    }

    public void lambda$getBalance$0(TLObject tLObject, Runnable runnable) {
        boolean z;
        boolean z2;
        boolean z3 = !this.balanceLoaded;
        this.lastBalanceLoaded = System.currentTimeMillis();
        if (tLObject instanceof TLRPC$TL_payments_starsStatus) {
            TLRPC$TL_payments_starsStatus tLRPC$TL_payments_starsStatus = (TLRPC$TL_payments_starsStatus) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_payments_starsStatus.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_payments_starsStatus.chats, false);
            if (this.transactions[0].isEmpty()) {
                Iterator it = tLRPC$TL_payments_starsStatus.history.iterator();
                while (it.hasNext()) {
                    TLRPC$StarsTransaction tLRPC$StarsTransaction = (TLRPC$StarsTransaction) it.next();
                    this.transactions[0].add(tLRPC$StarsTransaction);
                    this.transactions[tLRPC$StarsTransaction.stars > 0 ? (char) 1 : (char) 2].add(tLRPC$StarsTransaction);
                }
                for (int i = 0; i < 3; i++) {
                    this.transactionsExist[i] = !this.transactions[i].isEmpty() || this.transactionsExist[i];
                    boolean[] zArr = this.endReached;
                    boolean z4 = (tLRPC$TL_payments_starsStatus.flags & 1) == 0;
                    zArr[i] = z4;
                    if (z4) {
                        this.loading[i] = false;
                    }
                    this.offset[i] = zArr[i] ? null : tLRPC$TL_payments_starsStatus.next_offset;
                }
                z = true;
            } else {
                z = false;
            }
            if (this.subscriptions.isEmpty()) {
                this.subscriptions.addAll(tLRPC$TL_payments_starsStatus.subscriptions);
                this.subscriptionsLoading = false;
                this.subscriptionsOffset = tLRPC$TL_payments_starsStatus.subscriptions_next_offset;
                this.subscriptionsEndReached = (tLRPC$TL_payments_starsStatus.flags & 4) == 0;
                z2 = true;
            } else {
                z2 = false;
            }
            long j = this.balance;
            long j2 = tLRPC$TL_payments_starsStatus.balance;
            if (j != j2) {
                z3 = true;
            }
            this.balance = j2;
            this.minus = 0L;
        } else {
            z = false;
            z2 = false;
        }
        this.balanceLoading = false;
        this.balanceLoaded = true;
        if (z3) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        if (z) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
        }
        if (z2) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$getBalance$1(final Runnable runnable, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getBalance$0(tLObject, runnable);
            }
        });
    }

    public void lambda$getGiftOptions$10(TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof TLRPC$Vector) {
            Iterator it = ((TLRPC$Vector) tLObject).objects.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof TLRPC$TL_starsGiftOption) {
                    TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption = (TLRPC$TL_starsGiftOption) next;
                    arrayList.add(tLRPC$TL_starsGiftOption);
                    if (tLRPC$TL_starsGiftOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                        arrayList2.add(tLRPC$TL_starsGiftOption);
                        tLRPC$TL_starsGiftOption.loadingStorePrice = true;
                    }
                }
            }
            this.giftOptionsLoaded = true;
        }
        this.giftOptions = arrayList;
        this.giftOptionsLoading = false;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
        if (arrayList2.isEmpty()) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getGiftOptions$9(arrayList2);
            }
        };
        if (BillingController.getInstance().isReady()) {
            runnable.run();
        } else {
            BillingController.getInstance().whenSetuped(runnable);
        }
    }

    public void lambda$getGiftOptions$11(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getGiftOptions$10(tLObject);
            }
        });
    }

    public void lambda$getGiftOptions$7(BillingResult billingResult, List list, ArrayList arrayList) {
        TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        if (billingResult.getResponseCode() != 0) {
            bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode()));
            return;
        }
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ProductDetails productDetails = (ProductDetails) list.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        tLRPC$TL_starsGiftOption = null;
                        break;
                    } else {
                        if (((TLRPC$TL_starsGiftOption) arrayList.get(i2)).store_product.equals(productDetails.getProductId())) {
                            tLRPC$TL_starsGiftOption = (TLRPC$TL_starsGiftOption) arrayList.get(i2);
                            break;
                        }
                        i2++;
                    }
                }
                if (tLRPC$TL_starsGiftOption != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                    tLRPC$TL_starsGiftOption.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                    double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
                    double pow = Math.pow(10.0d, 6.0d);
                    Double.isNaN(priceAmountMicros);
                    tLRPC$TL_starsGiftOption.amount = (long) ((priceAmountMicros / pow) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tLRPC$TL_starsGiftOption.currency)));
                    tLRPC$TL_starsGiftOption.loadingStorePrice = false;
                }
            }
        }
        if (this.giftOptions != null) {
            for (int i3 = 0; i3 < this.giftOptions.size(); i3++) {
                TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption2 = (TLRPC$TL_starsGiftOption) this.giftOptions.get(i3);
                if (tLRPC$TL_starsGiftOption2 != null && tLRPC$TL_starsGiftOption2.loadingStorePrice) {
                    tLRPC$TL_starsGiftOption2.missingStorePrice = true;
                }
            }
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
    }

    public void lambda$getGiftOptions$8(final ArrayList arrayList, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getGiftOptions$7(billingResult, list, arrayList);
            }
        });
    }

    public void lambda$getGiftOptions$9(final ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(((TLRPC$TL_starsGiftOption) arrayList.get(i)).store_product).build());
        }
        BillingController.getInstance().queryProductDetails(arrayList2, new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                StarsController.this.lambda$getGiftOptions$8(arrayList, billingResult, list);
            }
        });
    }

    public void lambda$getGiveawayOptions$12(BillingResult billingResult, List list, ArrayList arrayList) {
        TLRPC$TL_starsGiveawayOption tLRPC$TL_starsGiveawayOption;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        if (billingResult.getResponseCode() != 0) {
            bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode()));
            return;
        }
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ProductDetails productDetails = (ProductDetails) list.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        tLRPC$TL_starsGiveawayOption = null;
                        break;
                    } else {
                        if (((TLRPC$TL_starsGiveawayOption) arrayList.get(i2)).store_product.equals(productDetails.getProductId())) {
                            tLRPC$TL_starsGiveawayOption = (TLRPC$TL_starsGiveawayOption) arrayList.get(i2);
                            break;
                        }
                        i2++;
                    }
                }
                if (tLRPC$TL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                    tLRPC$TL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                    double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
                    double pow = Math.pow(10.0d, 6.0d);
                    Double.isNaN(priceAmountMicros);
                    tLRPC$TL_starsGiveawayOption.amount = (long) ((priceAmountMicros / pow) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tLRPC$TL_starsGiveawayOption.currency)));
                    tLRPC$TL_starsGiveawayOption.loadingStorePrice = false;
                }
            }
        }
        if (this.giveawayOptions != null) {
            for (int i3 = 0; i3 < this.giveawayOptions.size(); i3++) {
                TLRPC$TL_starsGiveawayOption tLRPC$TL_starsGiveawayOption2 = (TLRPC$TL_starsGiveawayOption) this.giveawayOptions.get(i3);
                if (tLRPC$TL_starsGiveawayOption2 != null && tLRPC$TL_starsGiveawayOption2.loadingStorePrice) {
                    tLRPC$TL_starsGiveawayOption2.missingStorePrice = true;
                }
            }
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
    }

    public void lambda$getGiveawayOptions$13(final ArrayList arrayList, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getGiveawayOptions$12(billingResult, list, arrayList);
            }
        });
    }

    public void lambda$getGiveawayOptions$14(final ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(((TLRPC$TL_starsGiveawayOption) arrayList.get(i)).store_product).build());
        }
        BillingController.getInstance().queryProductDetails(arrayList2, new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                StarsController.this.lambda$getGiveawayOptions$13(arrayList, billingResult, list);
            }
        });
    }

    public void lambda$getGiveawayOptions$15(TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof TLRPC$Vector) {
            Iterator it = ((TLRPC$Vector) tLObject).objects.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof TLRPC$TL_starsGiveawayOption) {
                    TLRPC$TL_starsGiveawayOption tLRPC$TL_starsGiveawayOption = (TLRPC$TL_starsGiveawayOption) next;
                    arrayList.add(tLRPC$TL_starsGiveawayOption);
                    if (tLRPC$TL_starsGiveawayOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                        arrayList2.add(tLRPC$TL_starsGiveawayOption);
                        tLRPC$TL_starsGiveawayOption.loadingStorePrice = true;
                    }
                }
            }
            this.giveawayOptionsLoaded = true;
        }
        this.giveawayOptions = arrayList;
        this.giveawayOptionsLoading = false;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
        if (arrayList2.isEmpty()) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getGiveawayOptions$14(arrayList2);
            }
        };
        if (BillingController.getInstance().isReady()) {
            runnable.run();
        } else {
            BillingController.getInstance().whenSetuped(runnable);
        }
    }

    public void lambda$getGiveawayOptions$16(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getGiveawayOptions$15(tLObject);
            }
        });
    }

    public void lambda$getOptions$2(BillingResult billingResult, List list, ArrayList arrayList) {
        TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        if (billingResult.getResponseCode() != 0) {
            bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode()));
            return;
        }
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ProductDetails productDetails = (ProductDetails) list.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        tLRPC$TL_starsTopupOption = null;
                        break;
                    } else {
                        if (((TLRPC$TL_starsTopupOption) arrayList.get(i2)).store_product.equals(productDetails.getProductId())) {
                            tLRPC$TL_starsTopupOption = (TLRPC$TL_starsTopupOption) arrayList.get(i2);
                            break;
                        }
                        i2++;
                    }
                }
                if (tLRPC$TL_starsTopupOption != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                    tLRPC$TL_starsTopupOption.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                    double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
                    double pow = Math.pow(10.0d, 6.0d);
                    Double.isNaN(priceAmountMicros);
                    tLRPC$TL_starsTopupOption.amount = (long) ((priceAmountMicros / pow) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tLRPC$TL_starsTopupOption.currency)));
                    tLRPC$TL_starsTopupOption.loadingStorePrice = false;
                }
            }
        }
        if (this.options != null) {
            for (int i3 = 0; i3 < this.options.size(); i3++) {
                TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption2 = (TLRPC$TL_starsTopupOption) this.options.get(i3);
                if (tLRPC$TL_starsTopupOption2 != null && tLRPC$TL_starsTopupOption2.loadingStorePrice) {
                    tLRPC$TL_starsTopupOption2.missingStorePrice = true;
                }
            }
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
    }

    public void lambda$getOptions$3(final ArrayList arrayList, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getOptions$2(billingResult, list, arrayList);
            }
        });
    }

    public void lambda$getOptions$4(final ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(((TLRPC$TL_starsTopupOption) arrayList.get(i)).store_product).build());
        }
        BillingController.getInstance().queryProductDetails(arrayList2, new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                StarsController.this.lambda$getOptions$3(arrayList, billingResult, list);
            }
        });
    }

    public void lambda$getOptions$5(TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof TLRPC$Vector) {
            Iterator it = ((TLRPC$Vector) tLObject).objects.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof TLRPC$TL_starsTopupOption) {
                    TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption = (TLRPC$TL_starsTopupOption) next;
                    arrayList.add(tLRPC$TL_starsTopupOption);
                    if (tLRPC$TL_starsTopupOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                        arrayList2.add(tLRPC$TL_starsTopupOption);
                        tLRPC$TL_starsTopupOption.loadingStorePrice = true;
                    }
                }
            }
            this.optionsLoaded = true;
        }
        this.options = arrayList;
        this.optionsLoading = false;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
        if (arrayList2.isEmpty()) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getOptions$4(arrayList2);
            }
        };
        if (BillingController.getInstance().isReady()) {
            runnable.run();
        } else {
            BillingController.getInstance().whenSetuped(runnable);
        }
    }

    public void lambda$getOptions$6(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getOptions$5(tLObject);
            }
        });
    }

    public void lambda$loadInsufficientSubscriptions$21(TLObject tLObject) {
        this.insufficientSubscriptionsLoading = false;
        if (tLObject instanceof TLRPC$TL_payments_starsStatus) {
            TLRPC$TL_payments_starsStatus tLRPC$TL_payments_starsStatus = (TLRPC$TL_payments_starsStatus) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_payments_starsStatus.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_payments_starsStatus.chats, false);
            this.insufficientSubscriptions.addAll(tLRPC$TL_payments_starsStatus.subscriptions);
            updateBalance(tLRPC$TL_payments_starsStatus.balance);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
        }
    }

    public void lambda$loadInsufficientSubscriptions$22(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$loadInsufficientSubscriptions$21(tLObject);
            }
        });
    }

    public void lambda$loadSubscriptions$19(TLObject tLObject) {
        this.subscriptionsLoading = false;
        if (tLObject instanceof TLRPC$TL_payments_starsStatus) {
            TLRPC$TL_payments_starsStatus tLRPC$TL_payments_starsStatus = (TLRPC$TL_payments_starsStatus) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_payments_starsStatus.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_payments_starsStatus.chats, false);
            this.subscriptions.addAll(tLRPC$TL_payments_starsStatus.subscriptions);
            this.subscriptionsEndReached = (tLRPC$TL_payments_starsStatus.flags & 4) == 0;
            this.subscriptionsOffset = tLRPC$TL_payments_starsStatus.subscriptions_next_offset;
            updateBalance(tLRPC$TL_payments_starsStatus.balance);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
        }
    }

    public void lambda$loadSubscriptions$20(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$loadSubscriptions$19(tLObject);
            }
        });
    }

    public void lambda$loadTransactions$17(int i, TLObject tLObject) {
        this.loading[i] = false;
        if (tLObject instanceof TLRPC$TL_payments_starsStatus) {
            TLRPC$TL_payments_starsStatus tLRPC$TL_payments_starsStatus = (TLRPC$TL_payments_starsStatus) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_payments_starsStatus.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_payments_starsStatus.chats, false);
            this.transactions[i].addAll(tLRPC$TL_payments_starsStatus.history);
            this.transactionsExist[i] = !this.transactions[i].isEmpty() || this.transactionsExist[i];
            boolean[] zArr = this.endReached;
            boolean z = (tLRPC$TL_payments_starsStatus.flags & 1) == 0;
            zArr[i] = z;
            this.offset[i] = z ? null : tLRPC$TL_payments_starsStatus.next_offset;
            updateBalance(tLRPC$TL_payments_starsStatus.balance);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
        }
    }

    public void lambda$loadTransactions$18(final int i, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$loadTransactions$17(i, tLObject);
            }
        });
    }

    public void lambda$openPaymentForm$66(Runnable runnable, MessageObject messageObject, TLRPC$InputInvoice tLRPC$InputInvoice, TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, Utilities.Callback callback) {
        if (balanceAvailable()) {
            openPaymentForm(messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, runnable, callback);
            return;
        }
        bulletinError("NO_BALANCE");
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$openPaymentForm$67(boolean[] zArr, Utilities.Callback callback, Utilities.Callback callback2, Boolean bool) {
        zArr[0] = true;
        if (callback != null) {
            callback.run(bool.booleanValue() ? "paid" : "failed");
        }
        if (callback2 != null) {
            callback2.run(Boolean.TRUE);
        }
    }

    public void lambda$openPaymentForm$68(boolean[] zArr, MessageObject messageObject, TLRPC$InputInvoice tLRPC$InputInvoice, TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final boolean[] zArr2, final Utilities.Callback callback, final Utilities.Callback callback2) {
        zArr[0] = true;
        payAfterConfirmed(messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.lambda$openPaymentForm$67(zArr2, callback, callback2, (Boolean) obj);
            }
        });
    }

    public void lambda$openPaymentForm$69(Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Utilities.Callback callback2, DialogInterface dialogInterface) {
        if (callback == null || zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
        this.paymentFormOpened = false;
        if (zArr2[0] || callback2 == null) {
            return;
        }
        callback2.run("cancelled");
        zArr2[0] = true;
    }

    public static void lambda$openPaymentForm$70(Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2, Boolean bool) {
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
        zArr[0] = true;
        if (callback2 != null) {
            callback2.run(bool.booleanValue() ? "paid" : "failed");
        }
    }

    public void lambda$openPaymentForm$71(long j, final boolean[] zArr, final Utilities.Callback callback, Context context, Theme.ResourcesProvider resourcesProvider, String str, final MessageObject messageObject, final TLRPC$InputInvoice tLRPC$InputInvoice, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final Utilities.Callback callback2) {
        if (this.balance >= j) {
            payAfterConfirmed(messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    StarsController.lambda$openPaymentForm$70(Utilities.Callback.this, zArr, callback, (Boolean) obj);
                }
            });
            return;
        }
        if (MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
            final boolean[] zArr2 = {false};
            StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 0, str, new Runnable() {
                @Override
                public final void run() {
                    StarsController.this.lambda$openPaymentForm$68(zArr2, messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, zArr, callback, callback2);
                }
            });
            starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    StarsController.this.lambda$openPaymentForm$69(callback2, zArr2, zArr, callback, dialogInterface);
                }
            });
            starsNeededSheet.show();
            return;
        }
        this.paymentFormOpened = false;
        if (callback2 != null) {
            callback2.run(Boolean.FALSE);
        }
        if (!zArr[0] && callback != null) {
            callback.run("cancelled");
            zArr[0] = true;
        }
        showNoSupportDialog(context, resourcesProvider);
    }

    public void lambda$openPaymentForm$72(boolean[] zArr, Utilities.Callback callback) {
        this.paymentFormOpened = false;
        if (zArr[0] || callback == null) {
            return;
        }
        callback.run("cancelled");
        zArr[0] = true;
    }

    public void lambda$pay$63(TLObject tLObject, MessageObject messageObject, TLRPC$TL_inputInvoiceMessage tLRPC$TL_inputInvoiceMessage, Runnable runnable, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_payments_paymentFormStars) {
            openPaymentForm(messageObject, tLRPC$TL_inputInvoiceMessage, (TLRPC$TL_payments_paymentFormStars) tLObject, runnable, null);
        } else {
            bulletinError(tLRPC$TL_error, "NO_PAYMENT_FORM");
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$pay$64(final MessageObject messageObject, final TLRPC$TL_inputInvoiceMessage tLRPC$TL_inputInvoiceMessage, final Runnable runnable, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$pay$63(tLObject, messageObject, tLRPC$TL_inputInvoiceMessage, runnable, tLRPC$TL_error);
            }
        });
    }

    public void lambda$pay$65(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public static void lambda$payAfterConfirmed$79(Utilities.Callback callback, Boolean bool) {
        if (callback != null) {
            callback.run(bool);
        }
    }

    public void lambda$payAfterConfirmed$80(boolean[] zArr, MessageObject messageObject, TLRPC$InputInvoice tLRPC$InputInvoice, TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final Utilities.Callback callback) {
        zArr[0] = true;
        payAfterConfirmed(messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.lambda$payAfterConfirmed$79(Utilities.Callback.this, (Boolean) obj);
            }
        });
    }

    public static void lambda$payAfterConfirmed$81(Utilities.Callback callback, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback == null || zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
    }

    public void lambda$payAfterConfirmed$82(TLObject tLObject, MessageObject messageObject, TLRPC$InputInvoice tLRPC$InputInvoice, Utilities.Callback callback, BulletinFactory bulletinFactory, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_payments_paymentFormStars) {
            payAfterConfirmed(messageObject, tLRPC$InputInvoice, (TLRPC$TL_payments_paymentFormStars) tLObject, callback);
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        bulletinFactory.createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tLRPC$TL_error != null ? tLRPC$TL_error.text : "FAILED_GETTING_FORM")).show();
    }

    public void lambda$payAfterConfirmed$83(final MessageObject messageObject, final TLRPC$InputInvoice tLRPC$InputInvoice, final Utilities.Callback callback, final BulletinFactory bulletinFactory, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$payAfterConfirmed$82(tLObject, messageObject, tLRPC$InputInvoice, callback, bulletinFactory, tLRPC$TL_error);
            }
        });
    }

    public void lambda$payAfterConfirmed$84(TLObject tLObject, final Utilities.Callback callback, final MessageObject messageObject, Context context, long j, String str, String str2, final TLRPC$InputInvoice tLRPC$InputInvoice, long j2, TLRPC$TL_error tLRPC$TL_error, Theme.ResourcesProvider resourcesProvider, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars) {
        TLRPC$TL_messages_getExtendedMedia tLRPC$TL_messages_getExtendedMedia;
        TLRPC$Message tLRPC$Message;
        this.paymentFormOpened = false;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory global = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
        if (tLObject instanceof TLRPC$TL_payments_paymentResult) {
            if (callback != null) {
                callback.run(Boolean.TRUE);
            }
            MessagesController.getInstance(this.currentAccount).processUpdates(((TLRPC$TL_payments_paymentResult) tLObject).updates, false);
            ((messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null || !(tLRPC$Message.media instanceof TLRPC$TL_messageMediaPaidMedia)) ? global.createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsPurchaseCompletedInfo", (int) j, str2, str))) : global.createSimpleBulletin(context.getResources().getDrawable(R.drawable.star_small_inner).mutate(), LocaleController.getString(R.string.StarsMediaPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsMediaPurchaseCompletedInfo", (int) j, str)))).show();
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null && launchActivity.getFireworksOverlay() != null) {
                LaunchActivity.instance.getFireworksOverlay().start(true);
            }
            if (!(tLRPC$InputInvoice instanceof TLRPC$TL_inputInvoiceStars) || !(((TLRPC$TL_inputInvoiceStars) tLRPC$InputInvoice).purpose instanceof TLRPC$TL_inputStorePaymentStarsGift)) {
                invalidateTransactions(true);
            }
            if (messageObject == null) {
                return;
            } else {
                tLRPC$TL_messages_getExtendedMedia = new TLRPC$TL_messages_getExtendedMedia();
            }
        } else {
            if (tLRPC$TL_error != null && "BALANCE_TOO_LOW".equals(tLRPC$TL_error.text)) {
                if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    showNoSupportDialog(context, resourcesProvider);
                    return;
                } else {
                    final boolean[] zArr = {false};
                    StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 0, str, new Runnable() {
                        @Override
                        public final void run() {
                            StarsController.this.lambda$payAfterConfirmed$80(zArr, messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, callback);
                        }
                    });
                    starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            StarsController.lambda$payAfterConfirmed$81(Utilities.Callback.this, zArr, dialogInterface);
                        }
                    });
                    starsNeededSheet.show();
                    return;
                }
            }
            if (tLRPC$TL_error != null && "FORM_EXPIRED".equals(tLRPC$TL_error.text)) {
                TLRPC$TL_payments_getPaymentForm tLRPC$TL_payments_getPaymentForm = new TLRPC$TL_payments_getPaymentForm();
                JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(resourcesProvider);
                if (makeThemeParams != null) {
                    TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
                    tLRPC$TL_payments_getPaymentForm.theme_params = tLRPC$TL_dataJSON;
                    tLRPC$TL_dataJSON.data = makeThemeParams.toString();
                    tLRPC$TL_payments_getPaymentForm.flags |= 1;
                }
                tLRPC$TL_payments_getPaymentForm.invoice = tLRPC$InputInvoice;
                final BulletinFactory bulletinFactory = global;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getPaymentForm, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                        StarsController.this.lambda$payAfterConfirmed$83(messageObject, tLRPC$InputInvoice, callback, bulletinFactory, tLObject2, tLRPC$TL_error2);
                    }
                });
                return;
            }
            if (callback != null) {
                callback.run(Boolean.FALSE);
            }
            global.createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tLRPC$TL_error != null ? tLRPC$TL_error.text : "FAILED_SEND_STARS")).show();
            if (messageObject == null) {
                return;
            } else {
                tLRPC$TL_messages_getExtendedMedia = new TLRPC$TL_messages_getExtendedMedia();
            }
        }
        tLRPC$TL_messages_getExtendedMedia.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j2);
        tLRPC$TL_messages_getExtendedMedia.id.add(Integer.valueOf(messageObject.getId()));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getExtendedMedia, null);
    }

    public void lambda$payAfterConfirmed$85(final Utilities.Callback callback, final MessageObject messageObject, final Context context, final long j, final String str, final String str2, final TLRPC$InputInvoice tLRPC$InputInvoice, final long j2, final Theme.ResourcesProvider resourcesProvider, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$payAfterConfirmed$84(tLObject, callback, messageObject, context, j, str, str2, tLRPC$InputInvoice, j2, tLRPC$TL_error, resourcesProvider, tLRPC$TL_payments_paymentFormStars);
            }
        });
    }

    public static void lambda$payAfterConfirmed$86(Utilities.Callback2 callback2, Long l, Boolean bool) {
        if (callback2 != null) {
            callback2.run(l, bool);
        }
    }

    public void lambda$payAfterConfirmed$87(boolean[] zArr, String str, TLRPC$ChatInvite tLRPC$ChatInvite, final Utilities.Callback2 callback2) {
        zArr[0] = true;
        payAfterConfirmed(str, tLRPC$ChatInvite, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StarsController.lambda$payAfterConfirmed$86(Utilities.Callback2.this, (Long) obj, (Boolean) obj2);
            }
        });
    }

    public static void lambda$payAfterConfirmed$88(Utilities.Callback2 callback2, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback2 == null || zArr[0]) {
            return;
        }
        callback2.run(0L, Boolean.FALSE);
    }

    public void lambda$payAfterConfirmed$89(TLObject tLObject, final Utilities.Callback2 callback2, long j, String str, TLRPC$TL_error tLRPC$TL_error, Context context, Theme.ResourcesProvider resourcesProvider, final TLRPC$ChatInvite tLRPC$ChatInvite, final String str2) {
        this.paymentFormOpened = false;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory of = !AndroidUtilities.hasDialogOnTop(lastFragment) ? BulletinFactory.of(lastFragment) : BulletinFactory.global();
        if (!(tLObject instanceof TLRPC$TL_payments_paymentResult)) {
            if (tLRPC$TL_error == null || !"BALANCE_TOO_LOW".equals(tLRPC$TL_error.text)) {
                if (callback2 != null) {
                    callback2.run(0L, Boolean.FALSE);
                }
                of.createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tLRPC$TL_error != null ? tLRPC$TL_error.text : "FAILED_SEND_STARS")).show();
                return;
            } else if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
                if (callback2 != null) {
                    callback2.run(0L, Boolean.FALSE);
                }
                showNoSupportDialog(context, resourcesProvider);
                return;
            } else {
                final boolean[] zArr = {false};
                StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 1, tLRPC$ChatInvite.title, new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.this.lambda$payAfterConfirmed$87(zArr, str2, tLRPC$ChatInvite, callback2);
                    }
                });
                starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        StarsController.lambda$payAfterConfirmed$88(Utilities.Callback2.this, zArr, dialogInterface);
                    }
                });
                starsNeededSheet.show();
                return;
            }
        }
        TLRPC$TL_payments_paymentResult tLRPC$TL_payments_paymentResult = (TLRPC$TL_payments_paymentResult) tLObject;
        MessagesController.getInstance(this.currentAccount).processUpdates(tLRPC$TL_payments_paymentResult.updates, false);
        TLRPC$Updates tLRPC$Updates = tLRPC$TL_payments_paymentResult.updates;
        TLRPC$Update tLRPC$Update = tLRPC$Updates.update;
        long j2 = tLRPC$Update instanceof TLRPC$TL_updateChannel ? -((TLRPC$TL_updateChannel) tLRPC$Update).channel_id : 0L;
        if (tLRPC$Updates.updates != null) {
            for (int i = 0; i < tLRPC$TL_payments_paymentResult.updates.updates.size(); i++) {
                if (tLRPC$TL_payments_paymentResult.updates.updates.get(i) instanceof TLRPC$TL_updateChannel) {
                    j2 = -((TLRPC$TL_updateChannel) tLRPC$TL_payments_paymentResult.updates.updates.get(i)).channel_id;
                }
            }
        }
        if (callback2 != null) {
            callback2.run(Long.valueOf(j2), Boolean.TRUE);
        }
        if (j2 == 0) {
            of.createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j, str))).show();
        }
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null && launchActivity.getFireworksOverlay() != null) {
            LaunchActivity.instance.getFireworksOverlay().start(true);
        }
        invalidateTransactions(true);
        invalidateSubscriptions(true);
    }

    public void lambda$payAfterConfirmed$90(final Utilities.Callback2 callback2, final long j, final String str, final Context context, final Theme.ResourcesProvider resourcesProvider, final TLRPC$ChatInvite tLRPC$ChatInvite, final String str2, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$payAfterConfirmed$89(tLObject, callback2, j, str, tLRPC$TL_error, context, resourcesProvider, tLRPC$ChatInvite, str2);
            }
        });
    }

    public void lambda$sendPaidReaction$95(MessageObject messageObject, ChatActivity chatActivity, long j, Boolean bool) {
        sendPaidReaction(messageObject, chatActivity, j, true, true, bool);
    }

    public void lambda$sendPaidReaction$96(MessageObject messageObject, ChatActivity chatActivity, long j, Boolean bool) {
        sendPaidReaction(messageObject, chatActivity, j, true, true, bool);
    }

    public static void lambda$showStarsTopupInternal$24() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        safeLastFragment.presentFragment(new StarsIntroActivity());
    }

    public static void lambda$showStarsTopupInternal$25() {
    }

    public static void lambda$subscribeTo$73(boolean[] zArr, Utilities.Callback2 callback2, Utilities.Callback callback, Long l, Boolean bool) {
        zArr[0] = true;
        if (callback2 != null) {
            callback2.run(bool.booleanValue() ? "paid" : "failed", l);
        }
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public void lambda$subscribeTo$74(boolean[] zArr, String str, TLRPC$ChatInvite tLRPC$ChatInvite, final boolean[] zArr2, final Utilities.Callback2 callback2, final Utilities.Callback callback) {
        zArr[0] = true;
        payAfterConfirmed(str, tLRPC$ChatInvite, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StarsController.lambda$subscribeTo$73(zArr2, callback2, callback, (Long) obj, (Boolean) obj2);
            }
        });
    }

    public void lambda$subscribeTo$75(Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Utilities.Callback2 callback2, DialogInterface dialogInterface) {
        if (callback == null || zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
        this.paymentFormOpened = false;
        if (zArr2[0] || callback2 == null) {
            return;
        }
        callback2.run("cancelled", 0L);
        zArr2[0] = true;
    }

    public static void lambda$subscribeTo$76(Utilities.Callback callback, boolean[] zArr, Utilities.Callback2 callback2, Long l, Boolean bool) {
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
        zArr[0] = true;
        if (callback2 != null) {
            callback2.run(bool.booleanValue() ? "paid" : "failed", l);
        }
    }

    public void lambda$subscribeTo$77(long j, int i, final boolean[] zArr, final Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, final TLRPC$ChatInvite tLRPC$ChatInvite, final String str, final Utilities.Callback callback) {
        if (this.balance >= j) {
            payAfterConfirmed(str, tLRPC$ChatInvite, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    StarsController.lambda$subscribeTo$76(Utilities.Callback.this, zArr, callback2, (Long) obj, (Boolean) obj2);
                }
            });
            return;
        }
        if (MessagesController.getInstance(i).starsPurchaseAvailable()) {
            final boolean[] zArr2 = {false};
            StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 1, tLRPC$ChatInvite.title, new Runnable() {
                @Override
                public final void run() {
                    StarsController.this.lambda$subscribeTo$74(zArr2, str, tLRPC$ChatInvite, zArr, callback2, callback);
                }
            });
            starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    StarsController.this.lambda$subscribeTo$75(callback, zArr2, zArr, callback2, dialogInterface);
                }
            });
            starsNeededSheet.show();
            return;
        }
        this.paymentFormOpened = false;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0] && callback2 != null) {
            callback2.run("cancelled", 0L);
            zArr[0] = true;
        }
        showNoSupportDialog(context, resourcesProvider);
    }

    public void lambda$subscribeTo$78(boolean[] zArr, Utilities.Callback2 callback2) {
        this.paymentFormOpened = false;
        if (zArr[0] || callback2 == null) {
            return;
        }
        callback2.run("cancelled", 0L);
        zArr[0] = true;
    }

    public void lambda$updateMediaPrice$91(TLObject tLObject, MessageObject messageObject, long j, Runnable runnable) {
        if (tLObject instanceof TLRPC$TL_messages_messages) {
            TLRPC$TL_messages_messages tLRPC$TL_messages_messages = (TLRPC$TL_messages_messages) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_messages_messages.chats, false);
            if (tLRPC$TL_messages_messages.messages.size() == 1 && (tLRPC$TL_messages_messages.messages.get(0) instanceof TLRPC$TL_message) && (((TLRPC$Message) tLRPC$TL_messages_messages.messages.get(0)).media instanceof TLRPC$TL_messageMediaPaidMedia)) {
                messageObject.messageOwner = (TLRPC$Message) tLRPC$TL_messages_messages.messages.get(0);
                updateMediaPrice(messageObject, j, runnable, true);
                return;
            }
        }
        runnable.run();
    }

    public void lambda$updateMediaPrice$92(final MessageObject messageObject, final long j, final Runnable runnable, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$updateMediaPrice$91(tLObject, messageObject, j, runnable);
            }
        });
    }

    public void lambda$updateMediaPrice$93(TLObject tLObject, final Runnable runnable, TLRPC$TL_error tLRPC$TL_error, boolean z, long j, int i, final MessageObject messageObject, final long j2) {
        if (tLObject instanceof TLRPC$Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC$Updates) tLObject, false);
        } else if (tLRPC$TL_error != null && FileRefController.isFileRefError(tLRPC$TL_error.text) && !z) {
            TLRPC$TL_messages_getScheduledMessages tLRPC$TL_messages_getScheduledMessages = new TLRPC$TL_messages_getScheduledMessages();
            tLRPC$TL_messages_getScheduledMessages.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            tLRPC$TL_messages_getScheduledMessages.id.add(Integer.valueOf(i));
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getScheduledMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    StarsController.this.lambda$updateMediaPrice$92(messageObject, j2, runnable, tLObject2, tLRPC$TL_error2);
                }
            });
            return;
        }
        runnable.run();
    }

    public void lambda$updateMediaPrice$94(final Runnable runnable, final boolean z, final long j, final int i, final MessageObject messageObject, final long j2, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$updateMediaPrice$93(tLObject, runnable, tLRPC$TL_error, z, j, i, messageObject, j2);
            }
        });
    }

    private void payAfterConfirmed(final String str, final TLRPC$ChatInvite tLRPC$ChatInvite, final Utilities.Callback2 callback2) {
        if (tLRPC$ChatInvite == null || tLRPC$ChatInvite.subscription_pricing == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (context == null) {
            return;
        }
        final long j = tLRPC$ChatInvite.subscription_pricing.amount;
        final String str2 = tLRPC$ChatInvite.title;
        TLRPC$TL_inputInvoiceChatInviteSubscription tLRPC$TL_inputInvoiceChatInviteSubscription = new TLRPC$TL_inputInvoiceChatInviteSubscription();
        tLRPC$TL_inputInvoiceChatInviteSubscription.hash = str;
        TLRPC$TL_payments_sendStarsForm tLRPC$TL_payments_sendStarsForm = new TLRPC$TL_payments_sendStarsForm();
        tLRPC$TL_payments_sendStarsForm.form_id = tLRPC$ChatInvite.subscription_form_id;
        tLRPC$TL_payments_sendStarsForm.invoice = tLRPC$TL_inputInvoiceChatInviteSubscription;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$payAfterConfirmed$90(callback2, j, str2, context, resourceProvider, tLRPC$ChatInvite, str, tLObject, tLRPC$TL_error);
            }
        });
    }

    private void payAfterConfirmed(final MessageObject messageObject, final TLRPC$InputInvoice tLRPC$InputInvoice, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final Utilities.Callback callback) {
        long j;
        String str;
        TLRPC$User user;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader;
        TLRPC$Peer tLRPC$Peer;
        if (tLRPC$TL_payments_paymentFormStars == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (context == null) {
            return;
        }
        Iterator it = tLRPC$TL_payments_paymentFormStars.invoice.prices.iterator();
        final long j2 = 0;
        while (it.hasNext()) {
            j2 += ((TLRPC$TL_labeledPrice) it.next()).amount;
        }
        if (messageObject != null) {
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            j = (tLRPC$Message == null || (tLRPC$MessageFwdHeader = tLRPC$Message.fwd_from) == null || (tLRPC$Peer = tLRPC$MessageFwdHeader.from_id) == null) ? messageObject.getDialogId() : DialogObject.getPeerDialogId(tLRPC$Peer);
            if (j < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                j = user.id;
            }
        } else {
            j = tLRPC$TL_payments_paymentFormStars.bot_id;
        }
        final long j3 = j;
        if (j3 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)));
        } else {
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            str = chat == null ? "" : chat.title;
        }
        final String str2 = str;
        final String str3 = tLRPC$TL_payments_paymentFormStars.title;
        TLRPC$TL_payments_sendStarsForm tLRPC$TL_payments_sendStarsForm = new TLRPC$TL_payments_sendStarsForm();
        tLRPC$TL_payments_sendStarsForm.form_id = tLRPC$TL_payments_paymentFormStars.form_id;
        tLRPC$TL_payments_sendStarsForm.invoice = tLRPC$InputInvoice;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$payAfterConfirmed$85(callback, messageObject, context, j2, str2, str3, tLRPC$InputInvoice, j3, resourceProvider, tLRPC$TL_payments_paymentFormStars, tLObject, tLRPC$TL_error);
            }
        });
    }

    private void showNoSupportDialog(Context context, Theme.ResourcesProvider resourcesProvider) {
        new AlertDialog.Builder(context, resourcesProvider).setTitle(LocaleController.getString(R.string.StarsNotAvailableTitle)).setMessage(LocaleController.getString(R.string.StarsNotAvailableText)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
    }

    public void lambda$showStarsTopup$23(Activity activity, long j, String str) {
        if (getBalance() < j && j > 0) {
            new StarsIntroActivity.StarsNeededSheet(activity, null, j, 4, str, new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$showStarsTopupInternal$25();
                }
            }).show();
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$showStarsTopupInternal$24();
            }
        }).setDuration(5000).show(true);
    }

    private void updateMediaPrice(final MessageObject messageObject, final long j, final Runnable runnable, final boolean z) {
        TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument;
        if (messageObject == null) {
            runnable.run();
            return;
        }
        final long dialogId = messageObject.getDialogId();
        final int id = messageObject.getId();
        TLRPC$TL_messageMediaPaidMedia tLRPC$TL_messageMediaPaidMedia = (TLRPC$TL_messageMediaPaidMedia) messageObject.messageOwner.media;
        TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage = new TLRPC$TL_messages_editMessage();
        tLRPC$TL_messages_editMessage.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(dialogId);
        int i = tLRPC$TL_messages_editMessage.flags;
        tLRPC$TL_messages_editMessage.flags = 32768 | i;
        tLRPC$TL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tLRPC$TL_messages_editMessage.id = id;
        tLRPC$TL_messages_editMessage.flags = i | 49152;
        TLRPC$TL_inputMediaPaidMedia tLRPC$TL_inputMediaPaidMedia = new TLRPC$TL_inputMediaPaidMedia();
        tLRPC$TL_inputMediaPaidMedia.stars_amount = j;
        for (int i2 = 0; i2 < tLRPC$TL_messageMediaPaidMedia.extended_media.size(); i2++) {
            TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia = tLRPC$TL_messageMediaPaidMedia.extended_media.get(i2);
            if (!(tLRPC$MessageExtendedMedia instanceof TLRPC$TL_messageExtendedMedia)) {
                runnable.run();
                return;
            }
            TLRPC$MessageMedia tLRPC$MessageMedia = ((TLRPC$TL_messageExtendedMedia) tLRPC$MessageExtendedMedia).media;
            if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) {
                TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto = new TLRPC$TL_inputMediaPhoto();
                TLRPC$TL_inputPhoto tLRPC$TL_inputPhoto = new TLRPC$TL_inputPhoto();
                TLRPC$Photo tLRPC$Photo = ((TLRPC$TL_messageMediaPhoto) tLRPC$MessageMedia).photo;
                tLRPC$TL_inputPhoto.id = tLRPC$Photo.id;
                tLRPC$TL_inputPhoto.access_hash = tLRPC$Photo.access_hash;
                tLRPC$TL_inputPhoto.file_reference = tLRPC$Photo.file_reference;
                tLRPC$TL_inputMediaPhoto.id = tLRPC$TL_inputPhoto;
                tLRPC$TL_inputMediaDocument = tLRPC$TL_inputMediaPhoto;
            } else if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument) {
                TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument2 = new TLRPC$TL_inputMediaDocument();
                TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
                TLRPC$Document tLRPC$Document = ((TLRPC$TL_messageMediaDocument) tLRPC$MessageMedia).document;
                tLRPC$TL_inputDocument.id = tLRPC$Document.id;
                tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
                tLRPC$TL_inputDocument.file_reference = tLRPC$Document.file_reference;
                tLRPC$TL_inputMediaDocument2.id = tLRPC$TL_inputDocument;
                tLRPC$TL_inputMediaDocument = tLRPC$TL_inputMediaDocument2;
            }
            tLRPC$TL_inputMediaPaidMedia.extended_media.add(tLRPC$TL_inputMediaDocument);
        }
        tLRPC$TL_messages_editMessage.media = tLRPC$TL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$updateMediaPrice$94(runnable, z, dialogId, id, messageObject, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public boolean arePaidReactionsAnonymous(MessageObject messageObject) {
        Boolean bool;
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions != null && pendingPaidReactions.message.equals(MessageId.from(messageObject)) && (bool = this.currentPendingReactions.anonymous) != null) {
            return bool.booleanValue();
        }
        Boolean isMyPaidReactionAnonymous = messageObject == null ? null : messageObject.isMyPaidReactionAnonymous();
        if (isMyPaidReactionAnonymous != null) {
            return isMyPaidReactionAnonymous.booleanValue();
        }
        Boolean arePaidReactionsAnonymous = MessagesController.getInstance(this.currentAccount).arePaidReactionsAnonymous();
        if (arePaidReactionsAnonymous != null) {
            return arePaidReactionsAnonymous.booleanValue();
        }
        return false;
    }

    public boolean arePaidReactionsAnonymous(MessageId messageId, TLRPC$MessageReactions tLRPC$MessageReactions) {
        Boolean bool;
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions != null && pendingPaidReactions.message.equals(messageId) && (bool = this.currentPendingReactions.anonymous) != null) {
            return bool.booleanValue();
        }
        Boolean isMyPaidReactionAnonymous = MessageObject.isMyPaidReactionAnonymous(tLRPC$MessageReactions);
        if (isMyPaidReactionAnonymous != null) {
            return isMyPaidReactionAnonymous.booleanValue();
        }
        Boolean arePaidReactionsAnonymous = MessagesController.getInstance(this.currentAccount).arePaidReactionsAnonymous();
        if (arePaidReactionsAnonymous != null) {
            return arePaidReactionsAnonymous.booleanValue();
        }
        return false;
    }

    public boolean balanceAvailable() {
        return this.balanceLoaded;
    }

    public void buy(final Activity activity, final TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption, final Utilities.Callback2 callback2) {
        Theme.ResourcesProvider resourcesProvider;
        Context context;
        if (activity == null) {
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment == null || lastFragment.getContext() == null) {
                resourcesProvider = null;
                context = activity;
            } else {
                Context context2 = lastFragment.getContext();
                resourcesProvider = lastFragment.getResourceProvider();
                context = context2;
            }
            showNoSupportDialog(context, resourcesProvider);
            return;
        }
        if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
            final TLRPC$TL_inputStorePaymentStarsTopup tLRPC$TL_inputStorePaymentStarsTopup = new TLRPC$TL_inputStorePaymentStarsTopup();
            tLRPC$TL_inputStorePaymentStarsTopup.stars = tLRPC$TL_starsTopupOption.stars;
            tLRPC$TL_inputStorePaymentStarsTopup.currency = tLRPC$TL_starsTopupOption.currency;
            tLRPC$TL_inputStorePaymentStarsTopup.amount = tLRPC$TL_starsTopupOption.amount;
            BillingController.getInstance().queryProductDetails(Arrays.asList(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(tLRPC$TL_starsTopupOption.store_product).build()), new ProductDetailsResponseListener() {
                @Override
                public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                    StarsController.lambda$buy$36(Utilities.Callback2.this, tLRPC$TL_inputStorePaymentStarsTopup, tLRPC$TL_starsTopupOption, activity, billingResult, list);
                }
            });
            return;
        }
        TLRPC$TL_inputStorePaymentStarsTopup tLRPC$TL_inputStorePaymentStarsTopup2 = new TLRPC$TL_inputStorePaymentStarsTopup();
        tLRPC$TL_inputStorePaymentStarsTopup2.stars = tLRPC$TL_starsTopupOption.stars;
        tLRPC$TL_inputStorePaymentStarsTopup2.currency = tLRPC$TL_starsTopupOption.currency;
        tLRPC$TL_inputStorePaymentStarsTopup2.amount = tLRPC$TL_starsTopupOption.amount;
        TLRPC$TL_inputStorePaymentStarsTopup tLRPC$TL_inputStorePaymentStarsTopup3 = new TLRPC$TL_inputStorePaymentStarsTopup();
        tLRPC$TL_inputStorePaymentStarsTopup3.stars = tLRPC$TL_starsTopupOption.stars;
        tLRPC$TL_inputStorePaymentStarsTopup3.amount = tLRPC$TL_starsTopupOption.amount;
        tLRPC$TL_inputStorePaymentStarsTopup3.currency = tLRPC$TL_starsTopupOption.currency;
        final TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars = new TLRPC$TL_inputInvoiceStars();
        tLRPC$TL_inputInvoiceStars.purpose = tLRPC$TL_inputStorePaymentStarsTopup3;
        TLRPC$TL_payments_getPaymentForm tLRPC$TL_payments_getPaymentForm = new TLRPC$TL_payments_getPaymentForm();
        JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(getResourceProvider());
        if (makeThemeParams != null) {
            TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
            tLRPC$TL_payments_getPaymentForm.theme_params = tLRPC$TL_dataJSON;
            tLRPC$TL_dataJSON.data = makeThemeParams.toString();
            tLRPC$TL_payments_getPaymentForm.flags = 1 | tLRPC$TL_payments_getPaymentForm.flags;
        }
        tLRPC$TL_payments_getPaymentForm.invoice = tLRPC$TL_inputInvoiceStars;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$buy$28(callback2, tLRPC$TL_inputInvoiceStars, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void buyGift(final Activity activity, final TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption, long j, final Utilities.Callback2 callback2) {
        Theme.ResourcesProvider resourcesProvider;
        Context context;
        if (activity == null) {
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment == null || lastFragment.getContext() == null) {
                resourcesProvider = null;
                context = activity;
            } else {
                Context context2 = lastFragment.getContext();
                resourcesProvider = lastFragment.getResourceProvider();
                context = context2;
            }
            showNoSupportDialog(context, resourcesProvider);
            return;
        }
        if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
            final TLRPC$TL_inputStorePaymentStarsGift tLRPC$TL_inputStorePaymentStarsGift = new TLRPC$TL_inputStorePaymentStarsGift();
            tLRPC$TL_inputStorePaymentStarsGift.stars = tLRPC$TL_starsGiftOption.stars;
            tLRPC$TL_inputStorePaymentStarsGift.currency = tLRPC$TL_starsGiftOption.currency;
            tLRPC$TL_inputStorePaymentStarsGift.amount = tLRPC$TL_starsGiftOption.amount;
            tLRPC$TL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
            BillingController.getInstance().queryProductDetails(Arrays.asList(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(tLRPC$TL_starsGiftOption.store_product).build()), new ProductDetailsResponseListener() {
                @Override
                public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                    StarsController.this.lambda$buyGift$49(callback2, tLRPC$TL_inputStorePaymentStarsGift, tLRPC$TL_starsGiftOption, activity, billingResult, list);
                }
            });
            return;
        }
        TLRPC$TL_inputStorePaymentStarsGift tLRPC$TL_inputStorePaymentStarsGift2 = new TLRPC$TL_inputStorePaymentStarsGift();
        tLRPC$TL_inputStorePaymentStarsGift2.stars = tLRPC$TL_starsGiftOption.stars;
        tLRPC$TL_inputStorePaymentStarsGift2.amount = tLRPC$TL_starsGiftOption.amount;
        tLRPC$TL_inputStorePaymentStarsGift2.currency = tLRPC$TL_starsGiftOption.currency;
        tLRPC$TL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
        final TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars = new TLRPC$TL_inputInvoiceStars();
        tLRPC$TL_inputInvoiceStars.purpose = tLRPC$TL_inputStorePaymentStarsGift2;
        TLRPC$TL_payments_getPaymentForm tLRPC$TL_payments_getPaymentForm = new TLRPC$TL_payments_getPaymentForm();
        JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(getResourceProvider());
        if (makeThemeParams != null) {
            TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
            tLRPC$TL_payments_getPaymentForm.theme_params = tLRPC$TL_dataJSON;
            tLRPC$TL_dataJSON.data = makeThemeParams.toString();
            tLRPC$TL_payments_getPaymentForm.flags |= 1;
        }
        tLRPC$TL_payments_getPaymentForm.invoice = tLRPC$TL_inputInvoiceStars;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$buyGift$39(callback2, tLRPC$TL_inputInvoiceStars, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void buyGiveaway(final Activity activity, TLRPC$Chat tLRPC$Chat, List list, TLRPC$TL_starsGiveawayOption tLRPC$TL_starsGiveawayOption, int i, List list2, int i2, boolean z, boolean z2, boolean z3, String str, final Utilities.Callback2 callback2) {
        Theme.ResourcesProvider resourcesProvider;
        Context context;
        if (activity == null) {
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment == null || lastFragment.getContext() == null) {
                resourcesProvider = null;
                context = activity;
            } else {
                Context context2 = lastFragment.getContext();
                resourcesProvider = lastFragment.getResourceProvider();
                context = context2;
            }
            showNoSupportDialog(context, resourcesProvider);
            return;
        }
        final TLRPC$TL_inputStorePaymentStarsGiveaway tLRPC$TL_inputStorePaymentStarsGiveaway = new TLRPC$TL_inputStorePaymentStarsGiveaway();
        tLRPC$TL_inputStorePaymentStarsGiveaway.only_new_subscribers = z2;
        tLRPC$TL_inputStorePaymentStarsGiveaway.winners_are_visible = z;
        tLRPC$TL_inputStorePaymentStarsGiveaway.stars = tLRPC$TL_starsGiveawayOption.stars;
        MessagesController.getInstance(this.currentAccount);
        tLRPC$TL_inputStorePaymentStarsGiveaway.boost_peer = MessagesController.getInputPeer(tLRPC$Chat);
        if (list != null && !list.isEmpty()) {
            tLRPC$TL_inputStorePaymentStarsGiveaway.flags |= 2;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                ArrayList arrayList = tLRPC$TL_inputStorePaymentStarsGiveaway.additional_peers;
                MessagesController.getInstance(this.currentAccount);
                arrayList.add(MessagesController.getInputPeer(tLObject));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            tLRPC$TL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC$TL_help_country) ((TLObject) it2.next())).iso2);
        }
        if (!tLRPC$TL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
            tLRPC$TL_inputStorePaymentStarsGiveaway.flags |= 4;
        }
        if (z3) {
            tLRPC$TL_inputStorePaymentStarsGiveaway.flags |= 16;
            tLRPC$TL_inputStorePaymentStarsGiveaway.prize_description = str;
        }
        tLRPC$TL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
        tLRPC$TL_inputStorePaymentStarsGiveaway.until_date = i2;
        tLRPC$TL_inputStorePaymentStarsGiveaway.currency = tLRPC$TL_starsGiveawayOption.currency;
        tLRPC$TL_inputStorePaymentStarsGiveaway.amount = tLRPC$TL_starsGiveawayOption.amount;
        tLRPC$TL_inputStorePaymentStarsGiveaway.users = i;
        if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && tLRPC$TL_starsGiveawayOption.store_product != null) {
            BillingController.getInstance().queryProductDetails(Arrays.asList(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(tLRPC$TL_starsGiveawayOption.store_product).build()), new ProductDetailsResponseListener() {
                @Override
                public final void onProductDetailsResponse(BillingResult billingResult, List list3) {
                    StarsController.this.lambda$buyGiveaway$62(callback2, tLRPC$TL_inputStorePaymentStarsGiveaway, activity, billingResult, list3);
                }
            });
            return;
        }
        final TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars = new TLRPC$TL_inputInvoiceStars();
        tLRPC$TL_inputInvoiceStars.purpose = tLRPC$TL_inputStorePaymentStarsGiveaway;
        TLRPC$TL_payments_getPaymentForm tLRPC$TL_payments_getPaymentForm = new TLRPC$TL_payments_getPaymentForm();
        JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(getResourceProvider());
        if (makeThemeParams != null) {
            TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
            tLRPC$TL_payments_getPaymentForm.theme_params = tLRPC$TL_dataJSON;
            tLRPC$TL_dataJSON.data = makeThemeParams.toString();
            tLRPC$TL_payments_getPaymentForm.flags |= 1;
        }
        tLRPC$TL_payments_getPaymentForm.invoice = tLRPC$TL_inputInvoiceStars;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$buyGiveaway$52(callback2, tLRPC$TL_inputInvoiceStars, tLObject2, tLRPC$TL_error);
            }
        });
    }

    public void commitPaidReaction() {
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions != null) {
            pendingPaidReactions.close();
        }
    }

    public boolean didFullyLoadSubscriptions() {
        return this.subscriptionsEndReached;
    }

    public boolean didFullyLoadTransactions(int i) {
        return this.endReached[i];
    }

    public long getBalance() {
        return getBalance((Runnable) null);
    }

    public long getBalance(Runnable runnable) {
        return getBalance(true, runnable);
    }

    public long getBalance(boolean z) {
        return getBalance(z, null);
    }

    public long getBalance(boolean z, final Runnable runnable) {
        if ((!this.balanceLoaded || System.currentTimeMillis() - this.lastBalanceLoaded > 60000) && !this.balanceLoading) {
            this.balanceLoading = true;
            TLRPC$TL_payments_getStarsStatus tLRPC$TL_payments_getStarsStatus = new TLRPC$TL_payments_getStarsStatus();
            tLRPC$TL_payments_getStarsStatus.peer = new TLRPC$TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getStarsStatus, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StarsController.this.lambda$getBalance$1(runnable, tLObject, tLRPC$TL_error);
                }
            });
        }
        return Math.max(0L, this.balance - (z ? this.minus : 0L));
    }

    public Context getContext(ChatActivity chatActivity) {
        if (chatActivity != null && chatActivity.getContext() != null) {
            return chatActivity.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.instance;
        }
        if (ApplicationLoader.applicationContext != null) {
            return ApplicationLoader.applicationContext;
        }
        return null;
    }

    public ArrayList getGiftOptions() {
        if (this.giftOptionsLoading || this.giftOptionsLoaded) {
            return this.giftOptions;
        }
        this.giftOptionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            public int flags;
            public TLRPC$InputUser user_id;

            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
                int readInt32 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt32; i2++) {
                    TLRPC$TL_starsGiftOption TLdeserialize = TLRPC$TL_starsGiftOption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize == null) {
                        return tLRPC$Vector;
                    }
                    tLRPC$Vector.objects.add(TLdeserialize);
                }
                return tLRPC$Vector;
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-741774392);
                abstractSerializedData.writeInt32(this.flags);
                if ((this.flags & 1) != 0) {
                    this.user_id.serializeToStream(abstractSerializedData);
                }
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$getGiftOptions$11(tLObject, tLRPC$TL_error);
            }
        });
        return this.giftOptions;
    }

    public ArrayList getGiveawayOptions() {
        if (this.giveawayOptionsLoading || this.giveawayOptionsLoaded) {
            return this.giveawayOptions;
        }
        this.giveawayOptionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
                int readInt32 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt32; i2++) {
                    TLRPC$TL_starsGiveawayOption TLdeserialize = TLRPC$TL_starsGiveawayOption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize == null) {
                        return tLRPC$Vector;
                    }
                    tLRPC$Vector.objects.add(TLdeserialize);
                }
                return tLRPC$Vector;
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-1122042562);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$getGiveawayOptions$16(tLObject, tLRPC$TL_error);
            }
        });
        return this.giveawayOptions;
    }

    public ArrayList getOptions() {
        if (this.optionsLoading || this.optionsLoaded) {
            return this.options;
        }
        this.optionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
                int readInt32 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt32; i2++) {
                    TLRPC$TL_starsTopupOption TLdeserialize = TLRPC$TL_starsTopupOption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize == null) {
                        return tLRPC$Vector;
                    }
                    tLRPC$Vector.objects.add(TLdeserialize);
                }
                return tLRPC$Vector;
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-1072773165);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$getOptions$6(tLObject, tLRPC$TL_error);
            }
        });
        return this.options;
    }

    public long getPendingPaidReactions(long j, int i) {
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions == null) {
            return 0L;
        }
        MessageId messageId = pendingPaidReactions.message;
        if (messageId.did == j && messageId.mid == i && pendingPaidReactions.applied) {
            return pendingPaidReactions.amount;
        }
        return 0L;
    }

    public long getPendingPaidReactions(MessageObject messageObject) {
        TLRPC$Message tLRPC$Message;
        long fromChatId;
        int i;
        if (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null) {
            return 0L;
        }
        if ((tLRPC$Message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null) {
            fromChatId = messageObject.getFromChatId();
            i = messageObject.messageOwner.fwd_from.saved_from_msg_id;
        } else {
            fromChatId = messageObject.getDialogId();
            i = messageObject.getId();
        }
        return getPendingPaidReactions(fromChatId, i);
    }

    public Theme.ResourcesProvider getResourceProvider() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            return safeLastFragment.getResourceProvider();
        }
        return null;
    }

    public boolean hasInsufficientSubscriptions() {
        return !this.insufficientSubscriptions.isEmpty();
    }

    public boolean hasSubscriptions() {
        return balanceAvailable() && !this.subscriptions.isEmpty();
    }

    public boolean hasTransactions() {
        return hasTransactions(0);
    }

    public boolean hasTransactions(int i) {
        return balanceAvailable() && !this.transactions[i].isEmpty();
    }

    public void invalidateBalance() {
        this.balanceLoaded = false;
        getBalance();
        this.balanceLoaded = true;
    }

    public void invalidateSubscriptions(boolean z) {
        if (this.subscriptionsLoading) {
            return;
        }
        this.subscriptions.clear();
        this.subscriptionsOffset = null;
        this.subscriptionsLoading = false;
        this.subscriptionsEndReached = false;
        if (z) {
            loadSubscriptions();
        }
    }

    public void invalidateTransactions(boolean z) {
        for (int i = 0; i < 3; i++) {
            if (!this.loading[i]) {
                this.transactions[i].clear();
                this.offset[i] = null;
                this.loading[i] = false;
                this.endReached[i] = false;
                if (z) {
                    loadTransactions(i);
                }
            }
        }
    }

    public boolean isLoadingSubscriptions() {
        return this.subscriptionsLoading;
    }

    public void loadInsufficientSubscriptions() {
        if (this.insufficientSubscriptionsLoading) {
            return;
        }
        this.insufficientSubscriptionsLoading = true;
        TLRPC$TL_getStarsSubscriptions tLRPC$TL_getStarsSubscriptions = new TLRPC$TL_getStarsSubscriptions();
        tLRPC$TL_getStarsSubscriptions.peer = new TLRPC$TL_inputPeerSelf();
        tLRPC$TL_getStarsSubscriptions.missing_balance = true;
        tLRPC$TL_getStarsSubscriptions.offset = "";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_getStarsSubscriptions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$loadInsufficientSubscriptions$22(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void loadSubscriptions() {
        if (this.subscriptionsLoading || this.subscriptionsEndReached) {
            return;
        }
        this.subscriptionsLoading = true;
        TLRPC$TL_getStarsSubscriptions tLRPC$TL_getStarsSubscriptions = new TLRPC$TL_getStarsSubscriptions();
        tLRPC$TL_getStarsSubscriptions.peer = new TLRPC$TL_inputPeerSelf();
        String str = this.subscriptionsOffset;
        tLRPC$TL_getStarsSubscriptions.offset = str;
        if (str == null) {
            tLRPC$TL_getStarsSubscriptions.offset = "";
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_getStarsSubscriptions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$loadSubscriptions$20(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void loadTransactions(final int i) {
        boolean[] zArr = this.loading;
        if (zArr[i] || this.endReached[i]) {
            return;
        }
        zArr[i] = true;
        TLRPC$TL_payments_getStarsTransactions tLRPC$TL_payments_getStarsTransactions = new TLRPC$TL_payments_getStarsTransactions();
        tLRPC$TL_payments_getStarsTransactions.peer = new TLRPC$TL_inputPeerSelf();
        tLRPC$TL_payments_getStarsTransactions.inbound = i == 1;
        tLRPC$TL_payments_getStarsTransactions.outbound = i == 2;
        String str = this.offset[i];
        tLRPC$TL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tLRPC$TL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getStarsTransactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$loadTransactions$18(i, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void openPaymentForm(final MessageObject messageObject, final TLRPC$InputInvoice tLRPC$InputInvoice, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final Runnable runnable, final Utilities.Callback callback) {
        long j;
        String str;
        TLRPC$Peer tLRPC$Peer;
        if (tLRPC$TL_payments_paymentFormStars == null || tLRPC$TL_payments_paymentFormStars.invoice == null || this.paymentFormOpened) {
            return;
        }
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (context2 == null) {
            return;
        }
        if (!balanceAvailable()) {
            getBalance(new Runnable() {
                @Override
                public final void run() {
                    StarsController.this.lambda$openPaymentForm$66(runnable, messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, callback);
                }
            });
            return;
        }
        Iterator it = tLRPC$TL_payments_paymentFormStars.invoice.prices.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ((TLRPC$TL_labeledPrice) it.next()).amount;
        }
        if (messageObject == null || messageObject.type != 29) {
            j = tLRPC$TL_payments_paymentFormStars.bot_id;
        } else {
            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = messageObject.messageOwner.fwd_from;
            j = (tLRPC$MessageFwdHeader == null || (tLRPC$Peer = tLRPC$MessageFwdHeader.from_id) == null) ? messageObject.getDialogId() : DialogObject.getPeerDialogId(tLRPC$Peer);
        }
        long j3 = j;
        if (j3 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)));
        } else {
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            str = chat == null ? "" : chat.title;
        }
        final String str2 = str;
        String str3 = tLRPC$TL_payments_paymentFormStars.title;
        if (runnable != null) {
            runnable.run();
        }
        final boolean[] zArr = {false};
        final long j4 = j2;
        StarsIntroActivity.openConfirmPurchaseSheet(context2, resourceProvider, this.currentAccount, messageObject, j3, str3, j2, tLRPC$TL_payments_paymentFormStars.photo, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.this.lambda$openPaymentForm$71(j4, zArr, callback, context2, resourceProvider, str2, messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, (Utilities.Callback) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$openPaymentForm$72(zArr, callback);
            }
        });
    }

    public Runnable pay(final MessageObject messageObject, final Runnable runnable) {
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (messageObject == null || context == null) {
            return null;
        }
        long dialogId = messageObject.getDialogId();
        int id = messageObject.getId();
        final TLRPC$TL_inputInvoiceMessage tLRPC$TL_inputInvoiceMessage = new TLRPC$TL_inputInvoiceMessage();
        tLRPC$TL_inputInvoiceMessage.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(dialogId);
        tLRPC$TL_inputInvoiceMessage.msg_id = id;
        TLRPC$TL_payments_getPaymentForm tLRPC$TL_payments_getPaymentForm = new TLRPC$TL_payments_getPaymentForm();
        JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(resourceProvider);
        if (makeThemeParams != null) {
            TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
            tLRPC$TL_payments_getPaymentForm.theme_params = tLRPC$TL_dataJSON;
            tLRPC$TL_dataJSON.data = makeThemeParams.toString();
            tLRPC$TL_payments_getPaymentForm.flags |= 1;
        }
        tLRPC$TL_payments_getPaymentForm.invoice = tLRPC$TL_inputInvoiceMessage;
        final int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$pay$64(messageObject, tLRPC$TL_inputInvoiceMessage, runnable, tLObject, tLRPC$TL_error);
            }
        });
        return new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$pay$65(sendRequest);
            }
        };
    }

    public PendingPaidReactions sendPaidReaction(final MessageObject messageObject, final ChatActivity chatActivity, final long j, boolean z, boolean z2, final Boolean bool) {
        String str;
        String str2;
        MessageId from = MessageId.from(messageObject);
        StarsController starsController = getInstance(this.currentAccount);
        Context context = getContext(chatActivity);
        if (context == null) {
            return null;
        }
        String str3 = "";
        if (z2 && starsController.balanceAvailable() && starsController.getBalance() <= 0) {
            long dialogId = chatActivity.getDialogId();
            if (dialogId < 0) {
                TLRPC$Chat chat = chatActivity.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    str2 = chat.title;
                }
                new StarsIntroActivity.StarsNeededSheet(chatActivity.getContext(), chatActivity.getResourceProvider(), j, 5, str3, new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.this.lambda$sendPaidReaction$95(messageObject, chatActivity, j, bool);
                    }
                }).show();
                return null;
            }
            str2 = UserObject.getForcedFirstName(chatActivity.getMessagesController().getUser(Long.valueOf(dialogId)));
            str3 = str2;
            new StarsIntroActivity.StarsNeededSheet(chatActivity.getContext(), chatActivity.getResourceProvider(), j, 5, str3, new Runnable() {
                @Override
                public final void run() {
                    StarsController.this.lambda$sendPaidReaction$95(messageObject, chatActivity, j, bool);
                }
            }).show();
            return null;
        }
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions == null || !pendingPaidReactions.message.equals(from)) {
            PendingPaidReactions pendingPaidReactions2 = this.currentPendingReactions;
            if (pendingPaidReactions2 != null) {
                pendingPaidReactions2.close();
            }
            PendingPaidReactions pendingPaidReactions3 = new PendingPaidReactions(from, messageObject, chatActivity, ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), z);
            this.currentPendingReactions = pendingPaidReactions3;
            pendingPaidReactions3.anonymous = bool;
        }
        if (this.currentPendingReactions.amount + j > MessagesController.getInstance(this.currentAccount).starsPaidReactionAmountMax) {
            this.currentPendingReactions.close();
            this.currentPendingReactions = new PendingPaidReactions(from, messageObject, chatActivity, ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), z);
        }
        final long j2 = this.currentPendingReactions.amount + j;
        if (!z2 || !starsController.balanceAvailable() || starsController.getBalance(false) >= j2) {
            this.currentPendingReactions.add(j, !(messageObject == null || messageObject.doesPaidReactionExist()) || z);
            PendingPaidReactions pendingPaidReactions4 = this.currentPendingReactions;
            pendingPaidReactions4.anonymous = bool;
            return pendingPaidReactions4;
        }
        this.currentPendingReactions.cancel();
        long dialogId2 = chatActivity.getDialogId();
        if (dialogId2 < 0) {
            TLRPC$Chat chat2 = chatActivity.getMessagesController().getChat(Long.valueOf(-dialogId2));
            if (chat2 != null) {
                str = chat2.title;
            }
            new StarsIntroActivity.StarsNeededSheet(context, chatActivity.getResourceProvider(), j2, 5, str3, new Runnable() {
                @Override
                public final void run() {
                    StarsController.this.lambda$sendPaidReaction$96(messageObject, chatActivity, j2, bool);
                }
            }).show();
            return null;
        }
        str = UserObject.getForcedFirstName(chatActivity.getMessagesController().getUser(Long.valueOf(dialogId2)));
        str3 = str;
        new StarsIntroActivity.StarsNeededSheet(context, chatActivity.getResourceProvider(), j2, 5, str3, new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$sendPaidReaction$96(messageObject, chatActivity, j2, bool);
            }
        }).show();
        return null;
    }

    public void showStarsTopup(final Activity activity, final long j, final String str) {
        if (balanceAvailable()) {
            lambda$showStarsTopup$23(activity, j, str);
        } else {
            getBalance(new Runnable() {
                @Override
                public final void run() {
                    StarsController.this.lambda$showStarsTopup$23(activity, j, str);
                }
            });
        }
    }

    public void subscribeTo(final String str, final TLRPC$ChatInvite tLRPC$ChatInvite, final Utilities.Callback2 callback2) {
        if (tLRPC$ChatInvite == null || tLRPC$ChatInvite.subscription_pricing == null) {
            return;
        }
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        final long j = tLRPC$ChatInvite.subscription_pricing.amount;
        if (context2 == null) {
            return;
        }
        final int i = UserConfig.selectedAccount;
        final boolean[] zArr = {false};
        StarsIntroActivity.openStarsChannelInviteSheet(context2, resourceProvider, i, tLRPC$ChatInvite, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.this.lambda$subscribeTo$77(j, i, zArr, callback2, context2, resourceProvider, tLRPC$ChatInvite, str, (Utilities.Callback) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$subscribeTo$78(zArr, callback2);
            }
        });
    }

    public void undoPaidReaction() {
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions != null) {
            pendingPaidReactions.cancel();
        }
    }

    public void updateBalance(long j) {
        if (this.balance != j) {
            this.balance = j;
            this.minus = 0L;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.minus != 0) {
            this.minus = 0L;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
    }

    public void updateMediaPrice(MessageObject messageObject, long j, Runnable runnable) {
        updateMediaPrice(messageObject, j, runnable, false);
    }
}
