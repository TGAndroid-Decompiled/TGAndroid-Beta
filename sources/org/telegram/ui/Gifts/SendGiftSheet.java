package org.telegram.ui.Gifts;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.EditEmojiTextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextSuggestionsFix;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftSentBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView;

public class SendGiftSheet extends BottomSheetWithRecyclerListView {
    private final TLRPC.MessageAction action;
    private final ChatActionCell actionCell;
    private UniversalAdapter adapter;
    public final AnimationNotificationsLocker animationsLock;
    public boolean anonymous;
    private final ButtonWithCounterView button;
    private final LinearLayout buttonContainer;
    private final SizeNotifierFrameLayout chatView;
    private final Runnable closeParentSheet;
    private final int currentAccount;
    private final long dialogId;
    private final TextView leftTextView;
    private final TextView leftTextView2;
    private final FrameLayout limitContainer;
    private final View limitProgressView;
    private EditEmojiTextCell messageEdit;
    private final MessageObject messageObject;
    private final String name;
    private final GiftPremiumBottomSheet$GiftTier premiumTier;
    private final TextView soldTextView;
    private final TextView soldTextView2;
    private final TL_stars.StarGift starGift;
    private final FrameLayout valueContainerView;

    public SendGiftSheet(Context context, int i, TL_stars.StarGift starGift, long j, Runnable runnable) {
        this(context, i, starGift, null, j, runnable);
    }

    private SendGiftSheet(Context context, final int i, final TL_stars.StarGift starGift, GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, long j, Runnable runnable) {
        super(context, null, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, null);
        this.animationsLock = new AnimationNotificationsLocker();
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.headerPaddingTop = AndroidUtilities.dp(4.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-10.0f);
        this.currentAccount = i;
        this.dialogId = j;
        this.starGift = starGift;
        this.premiumTier = giftPremiumBottomSheet$GiftTier;
        this.closeParentSheet = runnable;
        this.topPadding = 0.2f;
        this.name = UserObject.getForcedFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        ChatActionCell chatActionCell = new ChatActionCell(context, false, this.resourcesProvider);
        this.actionCell = chatActionCell;
        chatActionCell.setDelegate(new ChatActionCell.ChatActionCellDelegate() {
            @Override
            public boolean canDrawOutboundsContent() {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$canDrawOutboundsContent(this);
            }

            @Override
            public void didClickButton(ChatActionCell chatActionCell2) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didClickButton(this, chatActionCell2);
            }

            @Override
            public void didClickImage(ChatActionCell chatActionCell2) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didClickImage(this, chatActionCell2);
            }

            @Override
            public boolean didLongPress(ChatActionCell chatActionCell2, float f, float f2) {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$didLongPress(this, chatActionCell2, f, f2);
            }

            @Override
            public void didOpenPremiumGift(ChatActionCell chatActionCell2, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str, boolean z) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didOpenPremiumGift(this, chatActionCell2, tL_premiumGiftOption, str, z);
            }

            @Override
            public void didOpenPremiumGiftChannel(ChatActionCell chatActionCell2, String str, boolean z) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didOpenPremiumGiftChannel(this, chatActionCell2, str, z);
            }

            @Override
            public void didPressReplyMessage(ChatActionCell chatActionCell2, int i2) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didPressReplyMessage(this, chatActionCell2, i2);
            }

            @Override
            public void forceUpdate(ChatActionCell chatActionCell2, boolean z) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$forceUpdate(this, chatActionCell2, z);
            }

            @Override
            public BaseFragment getBaseFragment() {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$getBaseFragment(this);
            }

            @Override
            public long getDialogId() {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$getDialogId(this);
            }

            @Override
            public long getTopicId() {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$getTopicId(this);
            }

            @Override
            public void needOpenInviteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$needOpenInviteLink(this, tL_chatInviteExported);
            }

            @Override
            public void needOpenUserProfile(long j2) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$needOpenUserProfile(this, j2);
            }

            @Override
            public void needShowEffectOverlay(ChatActionCell chatActionCell2, TLRPC.Document document, TLRPC.VideoSize videoSize) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$needShowEffectOverlay(this, chatActionCell2, document, videoSize);
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            int maxHeight = -1;

            @Override
            protected boolean isActionBarVisible() {
                return false;
            }

            @Override
            public boolean isStatusBarVisible() {
                return false;
            }

            @Override
            public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                SendGiftSheet.this.actionCell.setTranslationY((((i5 - i3) - SendGiftSheet.this.actionCell.getMeasuredHeight()) / 2.0f) - AndroidUtilities.dp(8.0f));
                SendGiftSheet.this.actionCell.setVisiblePart(SendGiftSheet.this.actionCell.getY(), getBackgroundSizeY());
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                if (this.maxHeight != -1) {
                    super.onMeasure(i2, i3);
                    int measuredHeight = getMeasuredHeight();
                    int i4 = this.maxHeight;
                    if (measuredHeight < i4) {
                        i3 = View.MeasureSpec.makeMeasureSpec(Math.max(i4, getMeasuredHeight()), Integer.MIN_VALUE);
                    }
                }
                super.onMeasure(i2, i3);
                int i5 = this.maxHeight;
                if (i5 == -1) {
                    this.maxHeight = Math.max(i5, getMeasuredHeight());
                }
            }

            @Override
            protected boolean useRootView() {
                return false;
            }
        };
        this.chatView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setBackgroundImage(PreviewView.getBackgroundDrawable((Drawable) null, i, j, Theme.isCurrentThemeDark()), false);
        if (starGift == null) {
            throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
        }
        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
        tL_messageActionStarGift.gift = starGift;
        tL_messageActionStarGift.flags |= 2;
        tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
        tL_messageActionStarGift.convert_stars = starGift.convert_stars;
        tL_messageActionStarGift.forceIn = true;
        this.action = tL_messageActionStarGift;
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.id = 1;
        tL_messageService.dialog_id = j;
        tL_messageService.from_id = MessagesController.getInstance(i).getPeer(UserConfig.getInstance(i).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i).getPeer(UserConfig.getInstance(i).getClientUserId());
        tL_messageService.action = tL_messageActionStarGift;
        MessageObject messageObject = new MessageObject(i, tL_messageService, false, false);
        this.messageObject = messageObject;
        chatActionCell.setMessageObject(messageObject, true);
        sizeNotifierFrameLayout.addView(chatActionCell, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 8.0f, 0.0f, 8.0f));
        EditEmojiTextCell editEmojiTextCell = new EditEmojiTextCell(context, (SizeNotifierFrameLayout) this.containerView, LocaleController.getString(R.string.Gift2Message), true, MessagesController.getInstance(i).stargiftsMessageLengthMax, 4, this.resourcesProvider) {
            @Override
            protected void onFocusChanged(boolean z) {
            }

            @Override
            protected void onTextChanged(CharSequence charSequence) {
                if (SendGiftSheet.this.action instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) SendGiftSheet.this.action;
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_messageActionStarGift2.message = tL_textWithEntities;
                    CharSequence[] charSequenceArr = {SendGiftSheet.this.messageEdit.getText()};
                    tL_textWithEntities.entities = MediaDataController.getInstance(i).getEntities(charSequenceArr, true);
                    tL_textWithEntities.text = charSequenceArr[0].toString();
                    SendGiftSheet.this.messageObject.setType();
                    SendGiftSheet.this.actionCell.setMessageObject(SendGiftSheet.this.messageObject, true);
                    SendGiftSheet.this.adapter.update(true);
                }
            }
        };
        this.messageEdit = editEmojiTextCell;
        editEmojiTextCell.editTextEmoji.getEditText().addTextChangedListener(new EditTextSuggestionsFix());
        this.messageEdit.editTextEmoji.allowEmojisForNonPremium(true);
        this.messageEdit.setShowLimitWhenNear(50);
        setEditTextEmoji(this.messageEdit.editTextEmoji);
        this.messageEdit.setShowLimitOnFocus(true);
        EditEmojiTextCell editEmojiTextCell2 = this.messageEdit;
        int i2 = Theme.key_dialogBackground;
        editEmojiTextCell2.setBackgroundColor(Theme.getColor(i2, this.resourcesProvider));
        this.messageEdit.setDivider(false);
        this.messageEdit.hideKeyboardOnEnter();
        EditEmojiTextCell editEmojiTextCell3 = this.messageEdit;
        int i3 = this.backgroundPaddingLeft;
        editEmojiTextCell3.setPadding(i3, 0, i3, 0);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            protected float animateByScale(View view) {
                return 0.3f;
            }
        };
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayIncrement(40L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i4 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i4, 0, i4, AndroidUtilities.dp((starGift.limited ? 40 : 0) + 68));
        this.adapter.update(false);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i5) {
                SendGiftSheet.this.lambda$new$0(view, i5);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonContainer = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Theme.getColor(i2, this.resourcesProvider));
        int i5 = this.backgroundPaddingLeft;
        linearLayout.setPadding(i5, 0, i5, 0);
        this.containerView.addView(linearLayout, LayoutHelper.createFrame(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogGrayLine, this.resourcesProvider));
        linearLayout.addView(view, LayoutHelper.createLinear(-1.0f, 1.0f / AndroidUtilities.density, 55));
        final float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 0.97f, 0.02f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.limitContainer = frameLayout;
        frameLayout.setVisibility(starGift.limited ? 0 : 8);
        frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider)));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 30, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.leftTextView = textView;
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i6, this.resourcesProvider));
        textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.soldTextView = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(21);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(Theme.getColor(i6, this.resourcesProvider));
        textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View view2 = new View(context) {
            @Override
            protected void onMeasure(int i7, int i8) {
                if (starGift == null) {
                    super.onMeasure(i7, i8);
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * clamp), 1073741824), i8);
                }
            }
        };
        this.limitProgressView = view2;
        view2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
        frameLayout.addView(view2, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth() * clamp, getHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        };
        this.valueContainerView = frameLayout2;
        frameLayout2.setWillNotDraw(false);
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -1, 119));
        TextView textView3 = new TextView(context);
        this.leftTextView2 = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(19);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        frameLayout2.addView(textView3, LayoutHelper.createFrame(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.soldTextView2 = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(21);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(-1);
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout2.addView(textView4, LayoutHelper.createFrame(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("Gift2Send", (int) starGift.stars)), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 119, 10, 10, 10, 10));
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                SendGiftSheet.this.lambda$new$1(starGift, view3);
            }
        });
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        this.reverseLayout = true;
        linearLayoutManager.setReverseLayout(true);
        this.adapter.update(false);
        this.layoutManager.scrollToPositionWithOffset(this.adapter.getItemCount(), AndroidUtilities.dp(200.0f));
    }

    private void buyPremiumTier() {
        final TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
        if (user == null) {
            this.button.setLoading(false);
            return;
        }
        if (this.premiumTier.giftCodeOption != null) {
            BoostRepository.payGiftCode(new ArrayList(Arrays.asList(user)), this.premiumTier.giftCodeOption, null, getMessage(), new BaseFragment() {
                @Override
                public Activity getParentActivity() {
                    Activity ownerActivity = SendGiftSheet.this.getOwnerActivity();
                    if (ownerActivity == null) {
                        ownerActivity = LaunchActivity.instance;
                    }
                    return ownerActivity == null ? AndroidUtilities.findActivity(SendGiftSheet.this.getContext()) : ownerActivity;
                }

                @Override
                public Theme.ResourcesProvider getResourceProvider() {
                    return ((BottomSheet) SendGiftSheet.this).resourcesProvider;
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    SendGiftSheet.this.lambda$buyPremiumTier$4(user, (Void) obj);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    SendGiftSheet.this.lambda$buyPremiumTier$5((TLRPC.TL_error) obj);
                }
            });
            return;
        }
        if (BuildVars.useInvoiceBilling()) {
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null) {
                Uri parse = Uri.parse(this.premiumTier.giftOption.bot_url);
                if (parse.getHost().equals("t.me")) {
                    if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                        launchActivity.setNavigateToPremiumGiftCallback(new Runnable() {
                            @Override
                            public final void run() {
                                SendGiftSheet.this.lambda$buyPremiumTier$6();
                            }
                        });
                    } else {
                        launchActivity.setNavigateToPremiumBot(true);
                    }
                }
                Browser.openUrl(launchActivity, this.premiumTier.giftOption.bot_url);
                dismiss();
                return;
            }
            return;
        }
        if (!BillingController.getInstance().isReady() || this.premiumTier.googlePlayProductDetails == null) {
            return;
        }
        final TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
        tL_inputStorePaymentGiftPremium.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = this.premiumTier.googlePlayProductDetails.getOneTimePurchaseOfferDetails();
        tL_inputStorePaymentGiftPremium.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
        double pow = Math.pow(10.0d, 6.0d);
        Double.isNaN(priceAmountMicros);
        tL_inputStorePaymentGiftPremium.amount = (long) ((priceAmountMicros / pow) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentGiftPremium.currency)));
        BillingController.getInstance().addResultListener(this.premiumTier.giftOption.store_product, new Consumer() {
            @Override
            public final void accept(Object obj) {
                SendGiftSheet.this.lambda$buyPremiumTier$8((BillingResult) obj);
            }
        });
        final TLRPC.TL_payments_canPurchasePremium tL_payments_canPurchasePremium = new TLRPC.TL_payments_canPurchasePremium();
        tL_payments_canPurchasePremium.purpose = tL_inputStorePaymentGiftPremium;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_canPurchasePremium, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SendGiftSheet.this.lambda$buyPremiumTier$10(tL_inputStorePaymentGiftPremium, tL_payments_canPurchasePremium, tLObject, tL_error);
            }
        });
    }

    private void buyStarGift() {
        StarsController.getInstance(this.currentAccount).buyStarGift(AndroidUtilities.getActivity(getContext()), this.starGift, this.anonymous, this.dialogId, getMessage(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                SendGiftSheet.this.lambda$buyStarGift$2((Boolean) obj, (String) obj2);
            }
        });
    }

    private TLRPC.TL_textWithEntities getMessage() {
        TLRPC.MessageAction messageAction = this.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        return null;
    }

    public void lambda$buyPremiumTier$10(final TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, final TLRPC.TL_payments_canPurchasePremium tL_payments_canPurchasePremium, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendGiftSheet.this.lambda$buyPremiumTier$9(tLObject, tL_inputStorePaymentGiftPremium, tL_error, tL_payments_canPurchasePremium);
            }
        });
    }

    public static void lambda$buyPremiumTier$3(TLRPC.User user) {
        PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(user)));
    }

    public void lambda$buyPremiumTier$4(final TLRPC.User user, Void r4) {
        Runnable runnable = this.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
        NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendGiftSheet.lambda$buyPremiumTier$3(TLRPC.User.this);
            }
        }, 250L);
    }

    public void lambda$buyPremiumTier$5(TLRPC.TL_error tL_error) {
        BoostDialogs.showToastError(getContext(), tL_error);
    }

    public void lambda$buyPremiumTier$6() {
        onGiftSuccess(false);
    }

    public void lambda$buyPremiumTier$7() {
        onGiftSuccess(true);
    }

    public void lambda$buyPremiumTier$8(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SendGiftSheet.this.lambda$buyPremiumTier$7();
                }
            });
        }
    }

    public void lambda$buyPremiumTier$9(TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchasePremium tL_payments_canPurchasePremium) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BillingController.getInstance().launchBillingFlow(getBaseFragment().getParentActivity(), AccountInstance.getInstance(this.currentAccount), tL_inputStorePaymentGiftPremium, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(this.premiumTier.googlePlayProductDetails).build()));
        } else if (tL_error != null) {
            AlertsCreator.processError(this.currentAccount, tL_error, getBaseFragment(), tL_payments_canPurchasePremium, new Object[0]);
        }
    }

    public void lambda$buyStarGift$2(Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = this.closeParentSheet;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(this.messageEdit);
            dismiss();
        }
        this.button.setLoading(false);
    }

    public void lambda$new$0(View view, int i) {
        UniversalAdapter universalAdapter = this.adapter;
        if (!this.reverseLayout) {
            i--;
        }
        UItem item = universalAdapter.getItem(i);
        if (item != null && item.id == 1) {
            boolean z = !this.anonymous;
            this.anonymous = z;
            TLRPC.MessageAction messageAction = this.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).name_hidden = z;
            }
            this.messageObject.updateMessageText();
            this.actionCell.setMessageObject(this.messageObject, true);
            this.adapter.update(true);
        }
    }

    public void lambda$new$1(TL_stars.StarGift starGift, View view) {
        if (this.button.isLoading()) {
            return;
        }
        this.button.setLoading(true);
        if (this.messageEdit.editTextEmoji.getEmojiPadding() > 0) {
            this.messageEdit.editTextEmoji.hidePopup(true);
        } else if (this.messageEdit.editTextEmoji.isKeyboardVisible()) {
            this.messageEdit.editTextEmoji.closeKeyboard();
        }
        if (starGift != null) {
            buyStarGift();
        } else {
            buyPremiumTier();
        }
    }

    private void onGiftSuccess(boolean z) {
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
        TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.dialogId);
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(this.currentAccount).putUser(user, true);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.id), userFull);
        }
        if (getBaseFragment() != null) {
            ArrayList<BaseFragment> arrayList = new ArrayList(((LaunchActivity) getBaseFragment().getParentActivity()).getActionBarLayout().getFragmentStack());
            INavigationLayout parentLayout = getBaseFragment().getParentLayout();
            ChatActivity chatActivity = null;
            for (BaseFragment baseFragment : arrayList) {
                if (baseFragment instanceof ChatActivity) {
                    chatActivity = (ChatActivity) baseFragment;
                    if (chatActivity.getDialogId() != this.dialogId) {
                        baseFragment.removeSelfFromStack();
                    }
                } else if (baseFragment instanceof ProfileActivity) {
                    if (z && parentLayout.getLastFragment() == baseFragment) {
                        baseFragment.lambda$onBackPressed$300();
                    }
                    baseFragment.removeSelfFromStack();
                }
            }
            if (chatActivity == null || chatActivity.getDialogId() != this.dialogId) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.dialogId);
                parentLayout.presentFragment(new ChatActivity(bundle), true);
            }
        }
        dismiss();
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                SendGiftSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public void dismiss() {
        if (this.messageEdit.editTextEmoji.getEmojiPadding() > 0) {
            this.messageEdit.editTextEmoji.hidePopup(true);
            return;
        }
        if (this.messageEdit.editTextEmoji.isKeyboardVisible()) {
            this.messageEdit.editTextEmoji.closeKeyboard();
            return;
        }
        EditEmojiTextCell editEmojiTextCell = this.messageEdit;
        if (editEmojiTextCell != null) {
            editEmojiTextCell.editTextEmoji.onPause();
        }
        super.dismiss();
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        UItem asShadow;
        arrayList.add(UItem.asCustom(-1, this.chatView));
        arrayList.add(UItem.asCustom(-2, this.messageEdit));
        if (this.starGift != null) {
            arrayList.add(UItem.asShadow(-3, null));
            arrayList.add(UItem.asCheck(1, LocaleController.getString(R.string.Gift2Hide)).setChecked(this.anonymous));
            asShadow = UItem.asShadow(-4, LocaleController.formatString(R.string.Gift2HideInfo, this.name));
        } else {
            asShadow = UItem.asShadow(-3, LocaleController.formatString(R.string.Gift2MessagePremiumInfo, this.name));
        }
        arrayList.add(asShadow);
        if (this.reverseLayout) {
            Collections.reverse(arrayList);
        }
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.Gift2Title);
    }

    @Override
    public void onBackPressed() {
        if (this.messageEdit.editTextEmoji.getEmojiPadding() > 0) {
            this.messageEdit.editTextEmoji.hidePopup(true);
        } else if (this.messageEdit.editTextEmoji.isKeyboardVisible()) {
            this.messageEdit.editTextEmoji.closeKeyboard();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void show() {
        EditEmojiTextCell editEmojiTextCell = this.messageEdit;
        if (editEmojiTextCell != null) {
            editEmojiTextCell.editTextEmoji.onResume();
        }
        super.show();
    }
}
