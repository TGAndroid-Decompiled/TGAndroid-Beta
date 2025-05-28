package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.EditEmojiTextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextSuggestionsFix;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftSentBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView;

public class SendGiftSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private final TLRPC.MessageAction action;
    private final ChatActionCell actionCell;
    private UniversalAdapter adapter;
    public final AnimationNotificationsLocker animationsLock;
    public boolean anonymous;
    private final ButtonWithCounterView button;
    private final LinearLayout buttonContainer;
    private final ColoredImageSpan[] cachedStarSpan;
    private final LinearLayout chatLinearLayout;
    private final SizeNotifierFrameLayout chatView;
    private final Runnable closeParentSheet;
    private final int currentAccount;
    private final long dialogId;
    private final boolean forceNotUpgrade;
    private final boolean forceUpgrade;
    private final TextView leftTextView;
    private final TextView leftTextView2;
    private final FrameLayout limitContainer;
    private final View limitProgressView;
    private EditEmojiTextCell messageEdit;
    private final MessageObject messageObject;
    private final String name;
    private final GiftPremiumBottomSheet$GiftTier premiumTier;
    private final boolean self;
    private final long send_paid_messages_stars;
    private int shakeDp;
    private final TextView soldTextView;
    private final TextView soldTextView2;
    private final TL_stars.StarGift starGift;
    public boolean upgrade;
    public boolean useStars;
    private final FrameLayout valueContainerView;

    public SendGiftSheet(Context context, int i, TL_stars.StarGift starGift, long j, Runnable runnable, boolean z, boolean z2) {
        this(context, i, starGift, null, j, runnable, z, z2);
    }

    private SendGiftSheet(Context context, final int i, final TL_stars.StarGift starGift, final GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, long j, Runnable runnable, final boolean z, final boolean z2) {
        super(context, null, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, null);
        ChatActionCell chatActionCell;
        SizeNotifierFrameLayout sizeNotifierFrameLayout;
        LinearLayout linearLayout;
        this.upgrade = false;
        this.useStars = false;
        this.shakeDp = -2;
        this.animationsLock = new AnimationNotificationsLocker();
        this.cachedStarSpan = new ColoredImageSpan[1];
        boolean z3 = j == UserConfig.getInstance(i).getClientUserId();
        this.self = z3;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.headerPaddingTop = AndroidUtilities.dp(4.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-10.0f);
        if (z3) {
            this.anonymous = true;
        }
        this.currentAccount = i;
        this.dialogId = j;
        this.starGift = starGift;
        this.premiumTier = giftPremiumBottomSheet$GiftTier;
        this.closeParentSheet = runnable;
        this.forceUpgrade = z;
        this.forceNotUpgrade = z2;
        if (z) {
            this.upgrade = true;
        } else if (z2) {
            this.upgrade = false;
        }
        this.topPadding = 0.2f;
        if (j >= 0) {
            this.name = UserObject.getForcedFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            this.name = chat == null ? "" : chat.title;
        }
        ChatActionCell chatActionCell2 = new ChatActionCell(context, false, this.resourcesProvider);
        this.actionCell = chatActionCell2;
        chatActionCell2.setDelegate(new ChatActionCell.ChatActionCellDelegate() {
            @Override
            public boolean canDrawOutboundsContent() {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$canDrawOutboundsContent(this);
            }

            @Override
            public void didClickButton(ChatActionCell chatActionCell3) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didClickButton(this, chatActionCell3);
            }

            @Override
            public void didClickImage(ChatActionCell chatActionCell3) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didClickImage(this, chatActionCell3);
            }

            @Override
            public boolean didLongPress(ChatActionCell chatActionCell3, float f, float f2) {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$didLongPress(this, chatActionCell3, f, f2);
            }

            @Override
            public void didOpenPremiumGift(ChatActionCell chatActionCell3, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str, boolean z4) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didOpenPremiumGift(this, chatActionCell3, tL_premiumGiftOption, str, z4);
            }

            @Override
            public void didOpenPremiumGiftChannel(ChatActionCell chatActionCell3, String str, boolean z4) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didOpenPremiumGiftChannel(this, chatActionCell3, str, z4);
            }

            @Override
            public void didPressReaction(ChatActionCell chatActionCell3, TLRPC.ReactionCount reactionCount, boolean z4, float f, float f2) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didPressReaction(this, chatActionCell3, reactionCount, z4, f, f2);
            }

            @Override
            public void didPressReplyMessage(ChatActionCell chatActionCell3, int i2) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didPressReplyMessage(this, chatActionCell3, i2);
            }

            @Override
            public void forceUpdate(ChatActionCell chatActionCell3, boolean z4) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$forceUpdate(this, chatActionCell3, z4);
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
            public void needShowEffectOverlay(ChatActionCell chatActionCell3, TLRPC.Document document, TLRPC.VideoSize videoSize) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$needShowEffectOverlay(this, chatActionCell3, document, videoSize);
            }

            @Override
            public void onTopicClick(ChatActionCell chatActionCell3) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$onTopicClick(this, chatActionCell3);
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = new SizeNotifierFrameLayout(context) {
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
            public void onLayout(boolean z4, int i2, int i3, int i4, int i5) {
                super.onLayout(z4, i2, i3, i4, i5);
                SendGiftSheet.this.chatLinearLayout.setTranslationY(((i5 - i3) - SendGiftSheet.this.chatLinearLayout.getMeasuredHeight()) / 2.0f);
                SendGiftSheet.this.actionCell.setVisiblePart(SendGiftSheet.this.chatLinearLayout.getY() + SendGiftSheet.this.actionCell.getY(), getBackgroundSizeY());
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
        this.chatView = sizeNotifierFrameLayout2;
        sizeNotifierFrameLayout2.setBackgroundImage(PreviewView.getBackgroundDrawable((Drawable) null, i, j, Theme.isCurrentThemeDark()), false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.chatLinearLayout = linearLayout2;
        linearLayout2.setOrientation(1);
        if (starGift != null) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.action = tL_messageActionStarGift;
            chatActionCell = chatActionCell2;
            sizeNotifierFrameLayout = sizeNotifierFrameLayout2;
            linearLayout = linearLayout2;
        } else if (giftPremiumBottomSheet$GiftTier == null || giftPremiumBottomSheet$GiftTier.giftCodeOption == null) {
            chatActionCell = chatActionCell2;
            sizeNotifierFrameLayout = sizeNotifierFrameLayout2;
            linearLayout = linearLayout2;
            if (giftPremiumBottomSheet$GiftTier == null || giftPremiumBottomSheet$GiftTier.giftOption == null) {
                throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
            }
            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
            tL_messageActionGiftPremium.months = giftPremiumBottomSheet$GiftTier.getMonths();
            tL_messageActionGiftPremium.currency = giftPremiumBottomSheet$GiftTier.getCurrency();
            long price = giftPremiumBottomSheet$GiftTier.getPrice();
            tL_messageActionGiftPremium.amount = price;
            if (giftPremiumBottomSheet$GiftTier.googlePlayProductDetails != null) {
                double d = price;
                double pow = Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6);
                Double.isNaN(d);
                tL_messageActionGiftPremium.amount = (long) (d * pow);
            }
            tL_messageActionGiftPremium.flags |= 2;
            tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
            this.action = tL_messageActionGiftPremium;
        } else {
            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
            tL_messageActionGiftCode.unclaimed = true;
            tL_messageActionGiftCode.via_giveaway = false;
            tL_messageActionGiftCode.months = giftPremiumBottomSheet$GiftTier.getMonths();
            tL_messageActionGiftCode.flags = 4 | tL_messageActionGiftCode.flags;
            tL_messageActionGiftCode.currency = giftPremiumBottomSheet$GiftTier.getCurrency();
            long price2 = giftPremiumBottomSheet$GiftTier.getPrice();
            tL_messageActionGiftCode.amount = price2;
            if (giftPremiumBottomSheet$GiftTier.googlePlayProductDetails != null) {
                double d2 = price2;
                sizeNotifierFrameLayout = sizeNotifierFrameLayout2;
                linearLayout = linearLayout2;
                chatActionCell = chatActionCell2;
                double pow2 = Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6);
                Double.isNaN(d2);
                tL_messageActionGiftCode.amount = (long) (d2 * pow2);
            } else {
                chatActionCell = chatActionCell2;
                sizeNotifierFrameLayout = sizeNotifierFrameLayout2;
                linearLayout = linearLayout2;
            }
            tL_messageActionGiftCode.flags |= 16;
            tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
            this.action = tL_messageActionGiftCode;
        }
        TLRPC.MessageAction messageAction = this.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z4 = this.upgrade;
            tL_messageActionStarGift2.can_upgrade = z4 || (z3 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z3 && z4) ? starGift.upgrade_stars : 0L;
            tL_messageActionStarGift2.convert_stars = z4 ? 0L : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.id = 1;
        tL_messageService.dialog_id = j;
        tL_messageService.from_id = MessagesController.getInstance(i).getPeer(UserConfig.getInstance(i).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i).getPeer(j);
        tL_messageService.action = this.action;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i).getSendPaidMessagesStars(j) : 0L;
        this.send_paid_messages_stars = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i, tL_messageService, false, false);
        this.messageObject = messageObject;
        ChatActionCell chatActionCell3 = chatActionCell;
        chatActionCell3.setMessageObject(messageObject, true);
        LinearLayout linearLayout3 = linearLayout;
        linearLayout3.addView(chatActionCell3, LayoutHelper.createLinear(-1, -1, 119, 0, sendPaidMessagesStars > 0 ? 0 : 8, 0, 8));
        sizeNotifierFrameLayout.addView(linearLayout3, LayoutHelper.createFrame(-1, -1, 119));
        EditEmojiTextCell editEmojiTextCell = new EditEmojiTextCell(context, (SizeNotifierFrameLayout) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), true, MessagesController.getInstance(i).stargiftsMessageLengthMax, 4, this.resourcesProvider) {
            @Override
            protected void onFocusChanged(boolean z5) {
            }

            @Override
            protected void onTextChanged(CharSequence charSequence) {
                TLRPC.TL_textWithEntities tL_textWithEntities;
                if (SendGiftSheet.this.action instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) SendGiftSheet.this.action;
                    tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_messageActionStarGift3.message = tL_textWithEntities;
                } else if (SendGiftSheet.this.action instanceof TLRPC.TL_messageActionGiftCode) {
                    ((TLRPC.TL_messageActionGiftCode) SendGiftSheet.this.action).flags |= 16;
                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) SendGiftSheet.this.action;
                    tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_messageActionGiftCode2.message = tL_textWithEntities;
                } else {
                    if (!(SendGiftSheet.this.action instanceof TLRPC.TL_messageActionGiftPremium)) {
                        return;
                    }
                    ((TLRPC.TL_messageActionGiftPremium) SendGiftSheet.this.action).flags |= 16;
                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) SendGiftSheet.this.action;
                    tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_messageActionGiftPremium2.message = tL_textWithEntities;
                }
                CharSequence[] charSequenceArr = {SendGiftSheet.this.messageEdit.getText()};
                tL_textWithEntities.entities = MediaDataController.getInstance(i).getEntities(charSequenceArr, true);
                tL_textWithEntities.text = charSequenceArr[0].toString();
                SendGiftSheet.this.messageObject.setType();
                SendGiftSheet.this.actionCell.setMessageObject(SendGiftSheet.this.messageObject, true);
                SendGiftSheet.this.adapter.update(true);
                SendGiftSheet.this.setButtonText(true);
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
        recyclerListView.setPadding(i4, 0, i4, AndroidUtilities.dp(68 + ((starGift == null || !starGift.limited) ? 0 : 40)));
        this.adapter.update(false);
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.buttonContainer = linearLayout4;
        linearLayout4.setOrientation(1);
        linearLayout4.setBackgroundColor(Theme.getColor(i2, this.resourcesProvider));
        int i5 = this.backgroundPaddingLeft;
        linearLayout4.setPadding(i5, 0, i5, 0);
        this.containerView.addView(linearLayout4, LayoutHelper.createFrame(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogGrayLine, this.resourcesProvider));
        linearLayout4.addView(view, LayoutHelper.createLinear(-1.0f, 1.0f / AndroidUtilities.density, 55));
        final float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 0.97f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.limitContainer = frameLayout;
        frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
        frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider)));
        linearLayout4.addView(frameLayout, LayoutHelper.createLinear(-1, 30, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.leftTextView = textView;
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i6, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.soldTextView = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(21);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(Theme.getColor(i6, this.resourcesProvider));
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
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
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        frameLayout2.addView(textView3, LayoutHelper.createFrame(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.soldTextView2 = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(21);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(-1);
        if (starGift != null) {
            textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout2.addView(textView4, LayoutHelper.createFrame(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider);
        this.button = buttonWithCounterView;
        setButtonText(false);
        linearLayout4.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 119, 10, 10, 10, 10));
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                SendGiftSheet.this.lambda$new$0(starGift, view3);
            }
        });
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        this.reverseLayout = true;
        linearLayoutManager.setReverseLayout(true);
        this.adapter.update(false);
        this.layoutManager.scrollToPositionWithOffset(this.adapter.getItemCount(), AndroidUtilities.dp(200.0f));
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view3, int i7) {
                SendGiftSheet.this.lambda$new$1(z, z2, starGift, giftPremiumBottomSheet$GiftTier, view3, i7);
            }
        });
        this.actionBar.setTitle(getTitle());
    }

    public SendGiftSheet(Context context, int i, GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, long j, Runnable runnable) {
        this(context, i, null, giftPremiumBottomSheet$GiftTier, j, runnable, false, false);
    }

    private void buyPremiumTier() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.SendGiftSheet.buyPremiumTier():void");
    }

    private void buyStarGift() {
        StarsController.getInstance(this.currentAccount).buyStarGift(this.starGift, this.anonymous, this.upgrade, this.dialogId, getMessage(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                SendGiftSheet.this.lambda$buyStarGift$2((Boolean) obj, (String) obj2);
            }
        });
    }

    private TLRPC.TL_textWithEntities getMessage() {
        if (MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(this.dialogId) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
            return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
        }
        return null;
    }

    public void lambda$buyPremiumTier$10() {
        onGiftSuccess(false);
    }

    public void lambda$buyPremiumTier$11() {
        onGiftSuccess(true);
    }

    public void lambda$buyPremiumTier$12(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SendGiftSheet.this.lambda$buyPremiumTier$11();
                }
            });
        }
    }

    public void lambda$buyPremiumTier$13(TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BillingController.getInstance().launchBillingFlow(getBaseFragment().getParentActivity(), AccountInstance.getInstance(this.currentAccount), tL_inputStorePaymentGiftPremium, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(this.premiumTier.googlePlayProductDetails).build()));
        } else if (tL_error != null) {
            AlertsCreator.processError(this.currentAccount, tL_error, getBaseFragment(), tL_payments_canPurchaseStore, new Object[0]);
        }
    }

    public void lambda$buyPremiumTier$14(final TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendGiftSheet.this.lambda$buyPremiumTier$13(tLObject, tL_inputStorePaymentGiftPremium, tL_error, tL_payments_canPurchaseStore);
            }
        });
    }

    public static void lambda$buyPremiumTier$3(TLRPC.User user) {
        PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(user)));
    }

    public void lambda$buyPremiumTier$4(final TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = this.closeParentSheet;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(this.messageEdit);
            lambda$new$0();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SendGiftSheet.lambda$buyPremiumTier$3(TLRPC.User.this);
                }
            }, 250L);
        } else if (!TextUtils.isEmpty(str)) {
            BulletinFactory.of(this.topBulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
        }
        this.button.setLoading(false);
    }

    public static void lambda$buyPremiumTier$5(TLRPC.User user) {
        PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(user)));
    }

    public void lambda$buyPremiumTier$6(final TLRPC.User user, Void r6) {
        Runnable runnable = this.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
        NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendGiftSheet.lambda$buyPremiumTier$5(TLRPC.User.this);
            }
        }, 250L);
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putBoolean("show_gift_for_" + this.dialogId, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + this.dialogId, true).apply();
    }

    public void lambda$buyPremiumTier$7(TLRPC.TL_error tL_error) {
        BoostDialogs.showToastError(getContext(), tL_error);
    }

    public static void lambda$buyPremiumTier$8(TLRPC.User user) {
        PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(user)));
    }

    public void lambda$buyPremiumTier$9(final TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = this.closeParentSheet;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(this.messageEdit);
            lambda$new$0();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SendGiftSheet.lambda$buyPremiumTier$8(TLRPC.User.this);
                }
            }, 250L);
        } else if (!TextUtils.isEmpty(str)) {
            BulletinFactory.of(this.topBulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
        }
        this.button.setLoading(false);
    }

    public void lambda$buyStarGift$2(Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = this.closeParentSheet;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(this.messageEdit);
            lambda$new$0();
        } else if ("STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str)) {
            AndroidUtilities.hideKeyboard(this.messageEdit);
            lambda$new$0();
            StarsController.getInstance(this.currentAccount).makeStarGiftSoldOut(this.starGift);
            return;
        }
        this.button.setLoading(false);
    }

    public void lambda$fillItems$15() {
        new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourcesProvider).openAsLearnMore(this.starGift.id, this.name);
    }

    public void lambda$fillItems$16() {
        new StarsIntroActivity.StarsOptionsSheet(getContext(), this.resourcesProvider).show();
    }

    public void lambda$new$0(TL_stars.StarGift starGift, View view) {
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

    public void lambda$new$1(boolean r4, boolean r5, org.telegram.tgnet.tl.TL_stars.StarGift r6, org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier r7, android.view.View r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.SendGiftSheet.lambda$new$1(boolean, boolean, org.telegram.tgnet.tl.TL_stars$StarGift, org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier, android.view.View, int):void");
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
                        baseFragment.lambda$onBackPressed$348();
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
        lambda$new$0();
    }

    public void setButtonText(boolean z) {
        if (this.starGift != null) {
            long j = StarsController.getInstance(this.currentAccount).getBalance().amount;
            TL_stars.StarGift starGift = this.starGift;
            long j2 = starGift.stars + (this.upgrade ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.messageEdit.getText()) ? 0L : this.send_paid_messages_stars);
            this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma(this.self ? "Gift2SendSelf" : "Gift2Send", (int) j2), this.cachedStarSpan), z);
            if (StarsController.getInstance(this.currentAccount).balanceAvailable() && j2 > j) {
                this.button.setSubText(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j), z);
                return;
            }
        } else {
            GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = this.premiumTier;
            if (giftPremiumBottomSheet$GiftTier == null) {
                return;
            }
            if (this.useStars) {
                this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(giftPremiumBottomSheet$GiftTier.getStarsPrice(), ',')), 1.0f, this.cachedStarSpan), z);
                this.cachedStarSpan[0].spaceScaleX = 0.85f;
            } else {
                this.button.setText(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, this.premiumTier.getFormattedPrice())), z);
            }
        }
        this.button.setSubText(null, z);
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
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starBalanceUpdated) {
            setButtonText(true);
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter == null || this.premiumTier == null) {
                return;
            }
            universalAdapter.update(true);
        }
    }

    @Override
    public void lambda$new$0() {
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
        super.lambda$new$0();
    }

    public void fillItems(java.util.ArrayList r12, org.telegram.ui.Components.UniversalAdapter r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.SendGiftSheet.fillItems(java.util.ArrayList, org.telegram.ui.Components.UniversalAdapter):void");
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(this.self ? R.string.Gift2TitleSelf2 : R.string.Gift2Title);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
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
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
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
