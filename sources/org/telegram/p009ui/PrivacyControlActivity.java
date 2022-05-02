package org.telegram.p009ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.ChatMessageCell;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.RadioCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Cells.TextSelectionHelper;
import org.telegram.p009ui.Cells.TextSettingsCell;
import org.telegram.p009ui.Components.BackgroundGradientDrawable;
import org.telegram.p009ui.Components.CombinedDrawable;
import org.telegram.p009ui.Components.HintView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.MotionBackgroundDrawable;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.GroupCreateActivity;
import org.telegram.p009ui.PrivacyControlActivity;
import org.telegram.p009ui.PrivacyUsersActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$InputPrivacyRule;
import org.telegram.tgnet.TLRPC$InputUser;
import org.telegram.tgnet.TLRPC$KeyboardButton;
import org.telegram.tgnet.TLRPC$PrivacyRule;
import org.telegram.tgnet.TLRPC$TL_account_privacyRules;
import org.telegram.tgnet.TLRPC$TL_account_setPrivacy;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyAddedByPhone;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyChatInvite;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyForwards;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyPhoneCall;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyPhoneNumber;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyPhoneP2P;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyStatusTimestamp;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyValueAllowChatParticipants;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyValueAllowUsers;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyValueDisallowChatParticipants;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyValueDisallowUsers;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageFwdHeader;
import org.telegram.tgnet.TLRPC$TL_messageMediaEmpty;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowAll;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowChatParticipants;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowContacts;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowUsers;
import org.telegram.tgnet.TLRPC$TL_privacyValueDisallowAll;
import org.telegram.tgnet.TLRPC$TL_privacyValueDisallowChatParticipants;
import org.telegram.tgnet.TLRPC$TL_privacyValueDisallowUsers;
import org.telegram.tgnet.TLRPC$TL_reactionCount;
import org.telegram.tgnet.TLRPC$User;

public class PrivacyControlActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int alwaysShareRow;
    private ArrayList<Long> currentMinus;
    private ArrayList<Long> currentPlus;
    private int currentSubType;
    private int currentType;
    private int detailRow;
    private View doneButton;
    private int everybodyRow;
    private ArrayList<Long> initialMinus;
    private ArrayList<Long> initialPlus;
    private int initialRulesSubType;
    private int initialRulesType;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private MessageCell messageCell;
    private int messageRow;
    private int myContactsRow;
    private int neverShareRow;
    private int nobodyRow;
    private int p2pDetailRow;
    private int p2pRow;
    private int p2pSectionRow;
    private int phoneContactsRow;
    private int phoneDetailRow;
    private int phoneEverybodyRow;
    private int phoneSectionRow;
    private boolean prevSubtypeContacts;
    private int rowCount;
    private int rulesType;
    private int sectionRow;
    private int shareDetailRow;
    private int shareSectionRow;

    public class MessageCell extends FrameLayout {
        private Drawable backgroundDrawable;
        private BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
        private ChatMessageCell cell;
        private HintView hintView;
        private MessageObject messageObject;
        private Drawable shadowDrawable;

        @Override
        protected void dispatchSetPressed(boolean z) {
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public MessageCell(PrivacyControlActivity privacyControlActivity, Context context) {
            super(context);
            new Runnable() {
                @Override
                public final void run() {
                    PrivacyControlActivity.MessageCell.this.invalidate();
                }
            };
            setWillNotDraw(false);
            setClipToPadding(false);
            this.shadowDrawable = Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow");
            setPadding(0, AndroidUtilities.m34dp(11.0f), 0, AndroidUtilities.m34dp(11.0f));
            TLRPC$User user = MessagesController.getInstance(((BaseFragment) privacyControlActivity).currentAccount).getUser(Long.valueOf(UserConfig.getInstance(((BaseFragment) privacyControlActivity).currentAccount).getClientUserId()));
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            tLRPC$TL_message.message = LocaleController.getString("PrivacyForwardsMessageLine", C0952R.string.PrivacyForwardsMessageLine);
            tLRPC$TL_message.date = (((int) (System.currentTimeMillis() / 1000)) - 3600) + 60;
            tLRPC$TL_message.dialog_id = 1L;
            tLRPC$TL_message.flags = 261;
            tLRPC$TL_message.from_id = new TLRPC$TL_peerUser();
            tLRPC$TL_message.f877id = 1;
            TLRPC$TL_messageFwdHeader tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader();
            tLRPC$TL_message.fwd_from = tLRPC$TL_messageFwdHeader;
            tLRPC$TL_messageFwdHeader.from_name = ContactsController.formatName(user.first_name, user.last_name);
            tLRPC$TL_message.media = new TLRPC$TL_messageMediaEmpty();
            tLRPC$TL_message.out = false;
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            tLRPC$TL_message.peer_id = tLRPC$TL_peerUser;
            tLRPC$TL_peerUser.user_id = UserConfig.getInstance(((BaseFragment) privacyControlActivity).currentAccount).getClientUserId();
            MessageObject messageObject = new MessageObject(((BaseFragment) privacyControlActivity).currentAccount, tLRPC$TL_message, true, false);
            this.messageObject = messageObject;
            messageObject.eventId = 1L;
            messageObject.resetLayout();
            ChatMessageCell chatMessageCell = new ChatMessageCell(context);
            this.cell = chatMessageCell;
            chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate(this, privacyControlActivity) {
                @Override
                public boolean canDrawOutboundsContent() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canDrawOutboundsContent(this);
                }

                @Override
                public boolean canPerformActions() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canPerformActions(this);
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell2, f, f2);
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC$Chat tLRPC$Chat, int i, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell2, tLRPC$Chat, i, f, f2);
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC$User tLRPC$User, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell2, tLRPC$User, f, f2);
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell2, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell2, tLRPC$KeyboardButton);
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell2);
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC$Chat tLRPC$Chat, int i, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell2, tLRPC$Chat, i, f, f2);
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell2);
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell2);
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell2, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell2, i);
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell2, f, f2);
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell2, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressInstantButton(this, chatMessageCell2, i);
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell2, f, f2);
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC$TL_reactionCount tLRPC$TL_reactionCount, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell2, tLRPC$TL_reactionCount, z);
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell2, i);
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSideButton(this, chatMessageCell2);
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell2);
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell2, characterStyle, z);
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC$User tLRPC$User, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell2, tLRPC$User, f, f2);
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell2, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBot(this, chatMessageCell2, str);
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell2, j);
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i, int i2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell2, arrayList, i, i2, i3);
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject2);
                }

                @Override
                public String getAdminRank(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAdminRank(this, j);
                }

                @Override
                public PinchToZoomHelper getPinchToZoomHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getPinchToZoomHelper(this);
                }

                @Override
                public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getTextSelectionHelper(this);
                }

                @Override
                public boolean hasSelectedMessages() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$hasSelectedMessages(this);
                }

                @Override
                public void invalidateBlur() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$invalidateBlur(this);
                }

                @Override
                public boolean isLandscape() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isLandscape(this);
                }

                @Override
                public boolean keyboardIsOpened() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$keyboardIsOpened(this);
                }

                @Override
                public void needOpenWebView(MessageObject messageObject2, String str, String str2, String str3, String str4, int i, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needOpenWebView(this, messageObject2, str, str2, str3, str4, i, i2);
                }

                @Override
                public boolean needPlayMessage(MessageObject messageObject2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, messageObject2);
                }

                @Override
                public void needReloadPolls() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
                }

                @Override
                public void onDiceFinished() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$onDiceFinished(this);
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject2);
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell2);
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject2);
                }

                @Override
                public void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                }
            });
            ChatMessageCell chatMessageCell2 = this.cell;
            chatMessageCell2.isChat = false;
            chatMessageCell2.setFullyDraw(true);
            this.cell.setMessageObject(this.messageObject, null, false, false);
            addView(this.cell, LayoutHelper.createLinear(-1, -2));
            HintView hintView = new HintView(context, 1, true);
            this.hintView = hintView;
            addView(hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            this.hintView.showForMessageCell(this.cell, false);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Drawable cachedWallpaperNonBlocking = Theme.getCachedWallpaperNonBlocking();
            if (!(cachedWallpaperNonBlocking == null || this.backgroundDrawable == cachedWallpaperNonBlocking)) {
                BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
                if (disposable != null) {
                    disposable.dispose();
                    this.backgroundGradientDisposable = null;
                }
                this.backgroundDrawable = cachedWallpaperNonBlocking;
            }
            Drawable drawable = this.backgroundDrawable;
            if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof MotionBackgroundDrawable)) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                Drawable drawable2 = this.backgroundDrawable;
                if (drawable2 instanceof BackgroundGradientDrawable) {
                    this.backgroundGradientDisposable = ((BackgroundGradientDrawable) drawable2).drawExactBoundsSize(canvas, this);
                } else {
                    drawable2.draw(canvas);
                }
            } else if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f = 2.0f / AndroidUtilities.density;
                    canvas.scale(f, f);
                    this.backgroundDrawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.backgroundDrawable.getIntrinsicWidth(), measuredHeight / this.backgroundDrawable.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.backgroundDrawable.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(this.backgroundDrawable.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i = (measuredHeight - ceil2) / 2;
                    canvas.save();
                    canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                    this.backgroundDrawable.setBounds(measuredWidth, i, ceil + measuredWidth, ceil2 + i);
                }
                this.backgroundDrawable.draw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
            this.shadowDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.shadowDrawable.draw(canvas);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
            if (disposable != null) {
                disposable.dispose();
                this.backgroundGradientDisposable = null;
            }
        }

        @Override
        public void invalidate() {
            super.invalidate();
            this.cell.invalidate();
        }
    }

    public PrivacyControlActivity(int i) {
        this(i, false);
    }

    public PrivacyControlActivity(int i, boolean z) {
        this.initialPlus = new ArrayList<>();
        this.initialMinus = new ArrayList<>();
        this.rulesType = i;
        if (z) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        checkPrivacy();
        updateRows(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public View createView(Context context) {
        if (this.rulesType == 5) {
            this.messageCell = new MessageCell(this, context);
        }
        this.actionBar.setBackButtonImage(C0952R.C0953drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.rulesType;
        if (i == 6) {
            this.actionBar.setTitle(LocaleController.getString("PrivacyPhone", C0952R.string.PrivacyPhone));
        } else if (i == 5) {
            this.actionBar.setTitle(LocaleController.getString("PrivacyForwards", C0952R.string.PrivacyForwards));
        } else if (i == 4) {
            this.actionBar.setTitle(LocaleController.getString("PrivacyProfilePhoto", C0952R.string.PrivacyProfilePhoto));
        } else if (i == 3) {
            this.actionBar.setTitle(LocaleController.getString("PrivacyP2P", C0952R.string.PrivacyP2P));
        } else if (i == 2) {
            this.actionBar.setTitle(LocaleController.getString("Calls", C0952R.string.Calls));
        } else if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString("GroupsAndChannels", C0952R.string.GroupsAndChannels));
        } else {
            this.actionBar.setTitle(LocaleController.getString("PrivacyLastSeen", C0952R.string.PrivacyLastSeen));
        }
        this.actionBar.setActionBarMenuOnItemClick(new C1006ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    if (PrivacyControlActivity.this.checkDiscard()) {
                        PrivacyControlActivity.this.finishFragment();
                    }
                } else if (i2 == 1) {
                    PrivacyControlActivity.this.processDone();
                }
            }
        });
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, C0952R.C0953drawable.ic_done, AndroidUtilities.m34dp(56.0f), LocaleController.getString("Done", C0952R.string.Done));
        boolean hasChanges = hasChanges();
        float f = 1.0f;
        this.doneButton.setAlpha(hasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(hasChanges ? 1.0f : 0.0f);
        View view = this.doneButton;
        if (!hasChanges) {
            f = 0.0f;
        }
        view.setScaleY(f);
        this.doneButton.setEnabled(hasChanges);
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i2) {
                PrivacyControlActivity.this.lambda$createView$2(view2, i2);
            }
        });
        setMessageText();
        return this.fragmentView;
    }

    public void lambda$createView$2(View view, final int i) {
        ArrayList<Long> arrayList;
        int i2 = this.nobodyRow;
        int i3 = 0;
        boolean z = true;
        if (i == i2 || i == this.everybodyRow || i == this.myContactsRow) {
            if (i == i2) {
                i3 = 1;
            } else if (i != this.everybodyRow) {
                i3 = 2;
            }
            if (i3 != this.currentType) {
                this.currentType = i3;
                updateDoneButton();
                updateRows(true);
            }
        } else if (i == this.phoneContactsRow || i == this.phoneEverybodyRow) {
            if (i != this.phoneEverybodyRow) {
                i3 = 1;
            }
            if (i3 != this.currentSubType) {
                this.currentSubType = i3;
                updateDoneButton();
                updateRows(true);
            }
        } else {
            int i4 = this.neverShareRow;
            if (i == i4 || i == this.alwaysShareRow) {
                if (i == i4) {
                    arrayList = this.currentMinus;
                } else {
                    arrayList = this.currentPlus;
                }
                if (arrayList.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(i == this.neverShareRow ? "isNeverShare" : "isAlwaysShare", true);
                    if (this.rulesType != 0) {
                        i3 = 1;
                    }
                    bundle.putInt("chatAddType", i3);
                    GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundle);
                    groupCreateActivity.setDelegate(new GroupCreateActivity.GroupCreateActivityDelegate() {
                        @Override
                        public final void didSelectUsers(ArrayList arrayList2) {
                            PrivacyControlActivity.this.lambda$createView$0(i, arrayList2);
                        }
                    });
                    presentFragment(groupCreateActivity);
                    return;
                }
                boolean z2 = this.rulesType != 0;
                if (i != this.alwaysShareRow) {
                    z = false;
                }
                PrivacyUsersActivity privacyUsersActivity = new PrivacyUsersActivity(0, arrayList, z2, z);
                privacyUsersActivity.setDelegate(new PrivacyUsersActivity.PrivacyActivityDelegate() {
                    @Override
                    public final void didUpdateUserList(ArrayList arrayList2, boolean z3) {
                        PrivacyControlActivity.this.lambda$createView$1(i, arrayList2, z3);
                    }
                });
                presentFragment(privacyUsersActivity);
            } else if (i == this.p2pRow) {
                presentFragment(new PrivacyControlActivity(3));
            }
        }
    }

    public void lambda$createView$0(int i, ArrayList arrayList) {
        int i2 = 0;
        if (i == this.neverShareRow) {
            this.currentMinus = arrayList;
            while (i2 < this.currentMinus.size()) {
                this.currentPlus.remove(this.currentMinus.get(i2));
                i2++;
            }
        } else {
            this.currentPlus = arrayList;
            while (i2 < this.currentPlus.size()) {
                this.currentMinus.remove(this.currentPlus.get(i2));
                i2++;
            }
        }
        updateDoneButton();
        this.listAdapter.notifyDataSetChanged();
    }

    public void lambda$createView$1(int i, ArrayList arrayList, boolean z) {
        int i2 = 0;
        if (i == this.neverShareRow) {
            this.currentMinus = arrayList;
            if (z) {
                while (i2 < this.currentMinus.size()) {
                    this.currentPlus.remove(this.currentMinus.get(i2));
                    i2++;
                }
            }
        } else {
            this.currentPlus = arrayList;
            if (z) {
                while (i2 < this.currentPlus.size()) {
                    this.currentMinus.remove(this.currentPlus.get(i2));
                    i2++;
                }
            }
        }
        updateDoneButton();
        this.listAdapter.notifyDataSetChanged();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageCell messageCell;
        if (i == NotificationCenter.privacyRulesUpdated) {
            checkPrivacy();
        } else if (i == NotificationCenter.emojiLoaded) {
            this.listView.invalidateViews();
        } else if (i == NotificationCenter.didSetNewWallpapper && (messageCell = this.messageCell) != null) {
            messageCell.invalidate();
        }
    }

    private void updateDoneButton() {
        boolean hasChanges = hasChanges();
        this.doneButton.setEnabled(hasChanges);
        float f = 1.0f;
        ViewPropertyAnimator scaleX = this.doneButton.animate().alpha(hasChanges ? 1.0f : 0.0f).scaleX(hasChanges ? 1.0f : 0.0f);
        if (!hasChanges) {
            f = 0.0f;
        }
        scaleX.scaleY(f).setDuration(180L).start();
    }

    private void applyCurrentPrivacySettings() {
        TLRPC$InputUser inputUser;
        TLRPC$InputUser inputUser2;
        TLRPC$TL_account_setPrivacy tLRPC$TL_account_setPrivacy = new TLRPC$TL_account_setPrivacy();
        int i = this.rulesType;
        if (i == 6) {
            tLRPC$TL_account_setPrivacy.key = new TLRPC$TL_inputPrivacyKeyPhoneNumber();
            if (this.currentType == 1) {
                TLRPC$TL_account_setPrivacy tLRPC$TL_account_setPrivacy2 = new TLRPC$TL_account_setPrivacy();
                tLRPC$TL_account_setPrivacy2.key = new TLRPC$TL_inputPrivacyKeyAddedByPhone();
                if (this.currentSubType == 0) {
                    tLRPC$TL_account_setPrivacy2.rules.add(new TLRPC$InputPrivacyRule() {
                        public static int constructor = 407582158;

                        @Override
                        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                            abstractSerializedData.writeInt32(constructor);
                        }
                    });
                } else {
                    tLRPC$TL_account_setPrivacy2.rules.add(new TLRPC$InputPrivacyRule() {
                        public static int constructor = 218751099;

                        @Override
                        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                            abstractSerializedData.writeInt32(constructor);
                        }
                    });
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_setPrivacy2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$4(tLObject, tLRPC$TL_error);
                    }
                }, 2);
            }
        } else if (i == 5) {
            tLRPC$TL_account_setPrivacy.key = new TLRPC$TL_inputPrivacyKeyForwards();
        } else if (i == 4) {
            tLRPC$TL_account_setPrivacy.key = new TLRPC$TL_inputPrivacyKeyProfilePhoto();
        } else if (i == 3) {
            tLRPC$TL_account_setPrivacy.key = new TLRPC$TL_inputPrivacyKeyPhoneP2P();
        } else if (i == 2) {
            tLRPC$TL_account_setPrivacy.key = new TLRPC$TL_inputPrivacyKeyPhoneCall();
        } else if (i == 1) {
            tLRPC$TL_account_setPrivacy.key = new TLRPC$TL_inputPrivacyKeyChatInvite();
        } else {
            tLRPC$TL_account_setPrivacy.key = new TLRPC$TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.currentType != 0 && this.currentPlus.size() > 0) {
            TLRPC$TL_inputPrivacyValueAllowUsers tLRPC$TL_inputPrivacyValueAllowUsers = new TLRPC$TL_inputPrivacyValueAllowUsers();
            TLRPC$TL_inputPrivacyValueAllowChatParticipants tLRPC$TL_inputPrivacyValueAllowChatParticipants = new TLRPC$TL_inputPrivacyValueAllowChatParticipants();
            for (int i2 = 0; i2 < this.currentPlus.size(); i2++) {
                long longValue = this.currentPlus.get(i2).longValue();
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(longValue));
                    if (!(user == null || (inputUser2 = MessagesController.getInstance(this.currentAccount).getInputUser(user)) == null)) {
                        tLRPC$TL_inputPrivacyValueAllowUsers.users.add(inputUser2);
                    }
                } else {
                    tLRPC$TL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-longValue));
                }
            }
            tLRPC$TL_account_setPrivacy.rules.add(tLRPC$TL_inputPrivacyValueAllowUsers);
            tLRPC$TL_account_setPrivacy.rules.add(tLRPC$TL_inputPrivacyValueAllowChatParticipants);
        }
        if (this.currentType != 1 && this.currentMinus.size() > 0) {
            TLRPC$TL_inputPrivacyValueDisallowUsers tLRPC$TL_inputPrivacyValueDisallowUsers = new TLRPC$TL_inputPrivacyValueDisallowUsers();
            TLRPC$TL_inputPrivacyValueDisallowChatParticipants tLRPC$TL_inputPrivacyValueDisallowChatParticipants = new TLRPC$TL_inputPrivacyValueDisallowChatParticipants();
            for (int i3 = 0; i3 < this.currentMinus.size(); i3++) {
                long longValue2 = this.currentMinus.get(i3).longValue();
                if (DialogObject.isUserDialog(longValue2)) {
                    TLRPC$User user2 = getMessagesController().getUser(Long.valueOf(longValue2));
                    if (!(user2 == null || (inputUser = getMessagesController().getInputUser(user2)) == null)) {
                        tLRPC$TL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    }
                } else {
                    tLRPC$TL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-longValue2));
                }
            }
            tLRPC$TL_account_setPrivacy.rules.add(tLRPC$TL_inputPrivacyValueDisallowUsers);
            tLRPC$TL_account_setPrivacy.rules.add(tLRPC$TL_inputPrivacyValueDisallowChatParticipants);
        }
        int i4 = this.currentType;
        if (i4 == 0) {
            tLRPC$TL_account_setPrivacy.rules.add(new TLRPC$InputPrivacyRule() {
                public static int constructor = 407582158;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            });
        } else if (i4 == 1) {
            tLRPC$TL_account_setPrivacy.rules.add(new TLRPC$InputPrivacyRule() {
                public static int constructor = -697604407;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            });
        } else if (i4 == 2) {
            tLRPC$TL_account_setPrivacy.rules.add(new TLRPC$InputPrivacyRule() {
                public static int constructor = 218751099;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            });
        }
        final AlertDialog alertDialog = null;
        if (getParentActivity() != null) {
            alertDialog = new AlertDialog(getParentActivity(), 3);
            alertDialog.setCanCancel(false);
            alertDialog.show();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_setPrivacy, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$6(alertDialog, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public void lambda$applyCurrentPrivacySettings$4(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$3(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$applyCurrentPrivacySettings$3(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            ContactsController.getInstance(this.currentAccount).setPrivacyRules(((TLRPC$TL_account_privacyRules) tLObject).rules, 7);
        }
    }

    public void lambda$applyCurrentPrivacySettings$6(final AlertDialog alertDialog, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$5(alertDialog, tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$applyCurrentPrivacySettings$5(AlertDialog alertDialog, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
        if (tLRPC$TL_error == null) {
            TLRPC$TL_account_privacyRules tLRPC$TL_account_privacyRules = (TLRPC$TL_account_privacyRules) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_account_privacyRules.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_account_privacyRules.chats, false);
            ContactsController.getInstance(this.currentAccount).setPrivacyRules(tLRPC$TL_account_privacyRules.rules, this.rulesType);
            finishFragment();
            return;
        }
        showErrorAlert();
    }

    private void showErrorAlert() {
        if (getParentActivity() != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("AppName", C0952R.string.AppName));
            builder.setMessage(LocaleController.getString("PrivacyFloodControlError", C0952R.string.PrivacyFloodControlError));
            builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), null);
            showDialog(builder.create());
        }
    }

    private void checkPrivacy() {
        this.currentPlus = new ArrayList<>();
        this.currentMinus = new ArrayList<>();
        ArrayList<TLRPC$PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(this.rulesType);
        if (privacyRules == null || privacyRules.size() == 0) {
            this.currentType = 1;
        } else {
            char c = 65535;
            for (int i = 0; i < privacyRules.size(); i++) {
                TLRPC$PrivacyRule tLRPC$PrivacyRule = privacyRules.get(i);
                if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueAllowChatParticipants) {
                    TLRPC$TL_privacyValueAllowChatParticipants tLRPC$TL_privacyValueAllowChatParticipants = (TLRPC$TL_privacyValueAllowChatParticipants) tLRPC$PrivacyRule;
                    int size = tLRPC$TL_privacyValueAllowChatParticipants.chats.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        this.currentPlus.add(Long.valueOf(-tLRPC$TL_privacyValueAllowChatParticipants.chats.get(i2).longValue()));
                    }
                } else if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueDisallowChatParticipants) {
                    TLRPC$TL_privacyValueDisallowChatParticipants tLRPC$TL_privacyValueDisallowChatParticipants = (TLRPC$TL_privacyValueDisallowChatParticipants) tLRPC$PrivacyRule;
                    int size2 = tLRPC$TL_privacyValueDisallowChatParticipants.chats.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        this.currentMinus.add(Long.valueOf(-tLRPC$TL_privacyValueDisallowChatParticipants.chats.get(i3).longValue()));
                    }
                } else if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueAllowUsers) {
                    this.currentPlus.addAll(((TLRPC$TL_privacyValueAllowUsers) tLRPC$PrivacyRule).users);
                } else if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueDisallowUsers) {
                    this.currentMinus.addAll(((TLRPC$TL_privacyValueDisallowUsers) tLRPC$PrivacyRule).users);
                } else if (c == 65535) {
                    if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueAllowAll) {
                        c = 0;
                    } else {
                        c = tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
                    }
                }
            }
            if (c == 0 || (c == 65535 && this.currentMinus.size() > 0)) {
                this.currentType = 0;
            } else if (c == 2 || (c == 65535 && this.currentMinus.size() > 0 && this.currentPlus.size() > 0)) {
                this.currentType = 2;
            } else if (c == 1 || (c == 65535 && this.currentPlus.size() > 0)) {
                this.currentType = 1;
            }
            View view = this.doneButton;
            if (view != null) {
                view.setAlpha(0.0f);
                this.doneButton.setScaleX(0.0f);
                this.doneButton.setScaleY(0.0f);
                this.doneButton.setEnabled(false);
            }
        }
        this.initialPlus.clear();
        this.initialMinus.clear();
        this.initialRulesType = this.currentType;
        this.initialPlus.addAll(this.currentPlus);
        this.initialMinus.addAll(this.currentMinus);
        if (this.rulesType == 6) {
            ArrayList<TLRPC$PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
            if (privacyRules2 == null || privacyRules2.size() == 0) {
                this.currentSubType = 0;
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 >= privacyRules2.size()) {
                        break;
                    }
                    TLRPC$PrivacyRule tLRPC$PrivacyRule2 = privacyRules2.get(i4);
                    if (tLRPC$PrivacyRule2 instanceof TLRPC$TL_privacyValueAllowAll) {
                        this.currentSubType = 0;
                        break;
                    } else if (tLRPC$PrivacyRule2 instanceof TLRPC$TL_privacyValueDisallowAll) {
                        this.currentSubType = 2;
                        break;
                    } else if (tLRPC$PrivacyRule2 instanceof TLRPC$TL_privacyValueAllowContacts) {
                        this.currentSubType = 1;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.initialRulesSubType = this.currentSubType;
        }
        updateRows(false);
    }

    private boolean hasChanges() {
        int i = this.initialRulesType;
        int i2 = this.currentType;
        if (i != i2) {
            return true;
        }
        if ((this.rulesType == 6 && i2 == 1 && this.initialRulesSubType != this.currentSubType) || this.initialMinus.size() != this.currentMinus.size() || this.initialPlus.size() != this.currentPlus.size()) {
            return true;
        }
        Collections.sort(this.initialPlus);
        Collections.sort(this.currentPlus);
        if (!this.initialPlus.equals(this.currentPlus)) {
            return true;
        }
        Collections.sort(this.initialMinus);
        Collections.sort(this.currentMinus);
        return !this.initialMinus.equals(this.currentMinus);
    }

    private void updateRows(boolean z) {
        RecyclerView.ViewHolder findContainingViewHolder;
        int i;
        int i2 = this.alwaysShareRow;
        int i3 = this.neverShareRow;
        int i4 = this.phoneDetailRow;
        int i5 = this.detailRow;
        int i6 = this.currentType;
        boolean z2 = i6 == 1 && this.currentSubType == 1;
        this.rowCount = 0;
        int i7 = this.rulesType;
        if (i7 == 5) {
            this.rowCount = 0 + 1;
            this.messageRow = 0;
        } else {
            this.messageRow = -1;
        }
        int i8 = this.rowCount;
        int i9 = i8 + 1;
        this.rowCount = i9;
        this.sectionRow = i8;
        int i10 = i9 + 1;
        this.rowCount = i10;
        this.everybodyRow = i9;
        int i11 = i10 + 1;
        this.rowCount = i11;
        this.myContactsRow = i10;
        if (i7 == 0 || i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6) {
            this.rowCount = i11 + 1;
            this.nobodyRow = i11;
        } else {
            this.nobodyRow = -1;
        }
        if (i7 == 6 && i6 == 1) {
            int i12 = this.rowCount;
            int i13 = i12 + 1;
            this.rowCount = i13;
            this.phoneDetailRow = i12;
            int i14 = i13 + 1;
            this.rowCount = i14;
            this.phoneSectionRow = i13;
            int i15 = i14 + 1;
            this.rowCount = i15;
            this.phoneEverybodyRow = i14;
            this.rowCount = i15 + 1;
            this.phoneContactsRow = i15;
        } else {
            this.phoneDetailRow = -1;
            this.phoneSectionRow = -1;
            this.phoneEverybodyRow = -1;
            this.phoneContactsRow = -1;
        }
        int i16 = this.rowCount;
        int i17 = i16 + 1;
        this.rowCount = i17;
        this.detailRow = i16;
        int i18 = i17 + 1;
        this.rowCount = i18;
        this.shareSectionRow = i17;
        if (i6 == 1 || i6 == 2) {
            this.rowCount = i18 + 1;
            this.alwaysShareRow = i18;
        } else {
            this.alwaysShareRow = -1;
        }
        if (i6 == 0 || i6 == 2) {
            int i19 = this.rowCount;
            this.rowCount = i19 + 1;
            this.neverShareRow = i19;
        } else {
            this.neverShareRow = -1;
        }
        int i20 = this.rowCount;
        int i21 = i20 + 1;
        this.rowCount = i21;
        this.shareDetailRow = i20;
        if (i7 == 2) {
            int i22 = i21 + 1;
            this.rowCount = i22;
            this.p2pSectionRow = i21;
            int i23 = i22 + 1;
            this.rowCount = i23;
            this.p2pRow = i22;
            this.rowCount = i23 + 1;
            this.p2pDetailRow = i23;
        } else {
            this.p2pSectionRow = -1;
            this.p2pRow = -1;
            this.p2pDetailRow = -1;
        }
        setMessageText();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter == null) {
            return;
        }
        if (z) {
            int childCount = this.listView.getChildCount();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt = this.listView.getChildAt(i24);
                if ((childAt instanceof RadioCell) && (findContainingViewHolder = this.listView.findContainingViewHolder(childAt)) != null) {
                    int adapterPosition = findContainingViewHolder.getAdapterPosition();
                    RadioCell radioCell = (RadioCell) childAt;
                    int i25 = this.everybodyRow;
                    if (adapterPosition == i25 || adapterPosition == this.myContactsRow || adapterPosition == this.nobodyRow) {
                        if (adapterPosition == i25) {
                            i = 0;
                        } else {
                            i = adapterPosition == this.myContactsRow ? 2 : 1;
                        }
                        radioCell.setChecked(this.currentType == i, true);
                    } else {
                        radioCell.setChecked(this.currentSubType == (adapterPosition == this.phoneContactsRow ? 1 : 0), true);
                    }
                }
            }
            if (this.prevSubtypeContacts != z2) {
                this.listAdapter.notifyItemChanged(i5);
            }
            int i26 = this.alwaysShareRow;
            if ((i26 != -1 || i2 == -1 || this.neverShareRow == -1 || i3 != -1) && (i26 == -1 || i2 != -1 || this.neverShareRow != -1 || i3 == -1)) {
                if (i26 == -1 && i2 != -1) {
                    this.listAdapter.notifyItemRemoved(i2);
                } else if (i26 != -1 && i2 == -1) {
                    this.listAdapter.notifyItemInserted(i26);
                }
                int i27 = this.neverShareRow;
                if (i27 == -1 && i3 != -1) {
                    this.listAdapter.notifyItemRemoved(i3);
                    int i28 = this.phoneDetailRow;
                    if (i28 == -1 && i4 != -1) {
                        this.listAdapter.notifyItemRangeRemoved(i4, 4);
                    } else if (i28 != -1 && i4 == -1) {
                        this.listAdapter.notifyItemRangeInserted(i28, 4);
                    }
                } else if (i27 != -1 && i3 == -1) {
                    int i29 = this.phoneDetailRow;
                    if (i29 == -1 && i4 != -1) {
                        this.listAdapter.notifyItemRangeRemoved(i4, 4);
                    } else if (i29 != -1 && i4 == -1) {
                        this.listAdapter.notifyItemRangeInserted(i29, 4);
                    }
                    this.listAdapter.notifyItemInserted(this.neverShareRow);
                }
            } else {
                ListAdapter listAdapter2 = this.listAdapter;
                if (i26 != -1) {
                    i2 = i3;
                }
                listAdapter2.notifyItemChanged(i2);
                int i30 = this.phoneDetailRow;
                if (i30 == -1 && i4 != -1) {
                    this.listAdapter.notifyItemRangeRemoved(i4, 4);
                } else if (i30 != -1 && i4 == -1) {
                    this.listAdapter.notifyItemRangeInserted(i30, 4);
                }
            }
        } else {
            listAdapter.notifyDataSetChanged();
        }
    }

    private void setMessageText() {
        MessageCell messageCell = this.messageCell;
        if (messageCell != null) {
            messageCell.messageObject.messageOwner.fwd_from.from_id = new TLRPC$TL_peerUser();
            int i = this.currentType;
            if (i == 0) {
                this.messageCell.hintView.setOverrideText(LocaleController.getString("PrivacyForwardsEverybody", C0952R.string.PrivacyForwardsEverybody));
                this.messageCell.messageObject.messageOwner.fwd_from.from_id.user_id = 1L;
            } else if (i == 1) {
                this.messageCell.hintView.setOverrideText(LocaleController.getString("PrivacyForwardsNobody", C0952R.string.PrivacyForwardsNobody));
                this.messageCell.messageObject.messageOwner.fwd_from.from_id.user_id = 0L;
            } else {
                this.messageCell.hintView.setOverrideText(LocaleController.getString("PrivacyForwardsContacts", C0952R.string.PrivacyForwardsContacts));
                this.messageCell.messageObject.messageOwner.fwd_from.from_id.user_id = 1L;
            }
            this.messageCell.cell.forceResetMessageObject();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public boolean onBackPressed() {
        return checkDiscard();
    }

    public void processDone() {
        if (getParentActivity() != null) {
            if (this.currentType != 0 && this.rulesType == 0) {
                final SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("privacyAlertShowed", false)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    if (this.rulesType == 1) {
                        builder.setMessage(LocaleController.getString("WhoCanAddMeInfo", C0952R.string.WhoCanAddMeInfo));
                    } else {
                        builder.setMessage(LocaleController.getString("CustomHelp", C0952R.string.CustomHelp));
                    }
                    builder.setTitle(LocaleController.getString("AppName", C0952R.string.AppName));
                    builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            PrivacyControlActivity.this.lambda$processDone$7(globalMainSettings, dialogInterface, i);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                    showDialog(builder.create());
                    return;
                }
            }
            applyCurrentPrivacySettings();
        }
    }

    public void lambda$processDone$7(SharedPreferences sharedPreferences, DialogInterface dialogInterface, int i) {
        applyCurrentPrivacySettings();
        sharedPreferences.edit().putBoolean("privacyAlertShowed", true).commit();
    }

    public boolean checkDiscard() {
        if (this.doneButton.getAlpha() != 1.0f) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("UserRestrictionsApplyChanges", C0952R.string.UserRestrictionsApplyChanges));
        builder.setMessage(LocaleController.getString("PrivacySettingsChangedAlert", C0952R.string.PrivacySettingsChangedAlert));
        builder.setPositiveButton(LocaleController.getString("ApplyTheme", C0952R.string.ApplyTheme), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                PrivacyControlActivity.this.lambda$checkDiscard$8(dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("PassportDiscard", C0952R.string.PassportDiscard), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                PrivacyControlActivity.this.lambda$checkDiscard$9(dialogInterface, i);
            }
        });
        showDialog(builder.create());
        return false;
    }

    public void lambda$checkDiscard$8(DialogInterface dialogInterface, int i) {
        processDone();
    }

    public void lambda$checkDiscard$9(DialogInterface dialogInterface, int i) {
        finishFragment();
    }

    @Override
    public boolean canBeginSlide() {
        return checkDiscard();
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return adapterPosition == PrivacyControlActivity.this.nobodyRow || adapterPosition == PrivacyControlActivity.this.everybodyRow || adapterPosition == PrivacyControlActivity.this.myContactsRow || adapterPosition == PrivacyControlActivity.this.neverShareRow || adapterPosition == PrivacyControlActivity.this.alwaysShareRow || (adapterPosition == PrivacyControlActivity.this.p2pRow && !ContactsController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getLoadingPrivicyInfo(3));
        }

        @Override
        public int getItemCount() {
            return PrivacyControlActivity.this.rowCount;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View view2;
            if (i != 0) {
                if (i == 1) {
                    view = new TextInfoPrivacyCell(this.mContext);
                } else if (i == 2) {
                    view2 = new HeaderCell(this.mContext);
                    view2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                } else if (i == 3) {
                    view2 = new RadioCell(this.mContext);
                    view2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                } else if (i != 4) {
                    view = new ShadowSectionCell(this.mContext);
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(this.mContext, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                    combinedDrawable.setFullsize(true);
                    view.setBackgroundDrawable(combinedDrawable);
                } else {
                    view = PrivacyControlActivity.this.messageCell;
                }
                return new RecyclerListView.Holder(view);
            }
            view2 = new TextSettingsCell(this.mContext);
            view2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            view = view2;
            return new RecyclerListView.Holder(view);
        }

        private int getUsersCount(ArrayList<Long> arrayList) {
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                long longValue = arrayList.get(i2).longValue();
                if (longValue > 0) {
                    i++;
                } else {
                    TLRPC$Chat chat = PrivacyControlActivity.this.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null) {
                        i += chat.participants_count;
                    }
                }
            }
            return i;
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PrivacyControlActivity.ListAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override
        public int getItemViewType(int i) {
            if (i == PrivacyControlActivity.this.alwaysShareRow || i == PrivacyControlActivity.this.neverShareRow || i == PrivacyControlActivity.this.p2pRow) {
                return 0;
            }
            if (i == PrivacyControlActivity.this.shareDetailRow || i == PrivacyControlActivity.this.detailRow || i == PrivacyControlActivity.this.p2pDetailRow) {
                return 1;
            }
            if (i == PrivacyControlActivity.this.sectionRow || i == PrivacyControlActivity.this.shareSectionRow || i == PrivacyControlActivity.this.p2pSectionRow || i == PrivacyControlActivity.this.phoneSectionRow) {
                return 2;
            }
            if (i == PrivacyControlActivity.this.everybodyRow || i == PrivacyControlActivity.this.myContactsRow || i == PrivacyControlActivity.this.nobodyRow || i == PrivacyControlActivity.this.phoneEverybodyRow || i == PrivacyControlActivity.this.phoneContactsRow) {
                return 3;
            }
            if (i == PrivacyControlActivity.this.messageRow) {
                return 4;
            }
            return i == PrivacyControlActivity.this.phoneDetailRow ? 5 : 0;
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextSettingsCell.class, HeaderCell.class, RadioCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteValueText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{RadioCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "radioBackground"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "radioBackgroundChecked"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgInDrawable, Theme.chat_msgInMediaDrawable}, null, "chat_inBubble"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgInSelectedDrawable, Theme.chat_msgInMediaSelectedDrawable}, null, "chat_inBubbleSelected"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, Theme.chat_msgInDrawable.getShadowDrawables(), null, "chat_inBubbleShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, Theme.chat_msgInMediaDrawable.getShadowDrawables(), null, "chat_inBubbleShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, "chat_outBubble"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, "chat_outBubbleGradient"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, "chat_outBubbleGradient2"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, "chat_outBubbleGradient3"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutSelectedDrawable, Theme.chat_msgOutMediaSelectedDrawable}, null, "chat_outBubbleSelected"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, Theme.chat_msgOutDrawable.getShadowDrawables(), null, "chat_outBubbleShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, Theme.chat_msgOutMediaDrawable.getShadowDrawables(), null, "chat_outBubbleShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_messageTextIn"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_messageTextOut"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckDrawable}, null, "chat_outSentCheck"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckSelectedDrawable}, null, "chat_outSentCheckSelected"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckReadDrawable, Theme.chat_msgOutHalfCheckDrawable}, null, "chat_outSentCheckRead"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckReadSelectedDrawable, Theme.chat_msgOutHalfCheckSelectedDrawable}, null, "chat_outSentCheckReadSelected"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgMediaCheckDrawable, Theme.chat_msgMediaHalfCheckDrawable}, null, "chat_mediaSentCheck"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_inReplyLine"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_outReplyLine"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_inReplyNameText"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_outReplyNameText"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_inReplyMessageText"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_outReplyMessageText"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_inReplyMediaMessageSelectedText"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_outReplyMediaMessageSelectedText"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_inTimeText"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_outTimeText"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_inTimeSelectedText"));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, "chat_outTimeSelectedText"));
        return arrayList;
    }
}
