package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.LineHeightSpan;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.ChatListItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import j$.util.Collection$EL;
import j$.util.function.Function;
import j$.util.function.Predicate;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChannelAdminLogEventAction;
import org.telegram.tgnet.TLRPC$ChannelParticipant;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$KeyboardButton;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageExtendedMedia;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$MessageReplyHeader;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$ReplyMarkup;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_channelAdminLogEvent;
import org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionDeleteMessage;
import org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionEditMessage;
import org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionExportedInviteDelete;
import org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionExportedInviteEdit;
import org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionExportedInviteRevoke;
import org.telegram.tgnet.TLRPC$TL_channelAdminLogEventActionParticipantToggleAdmin;
import org.telegram.tgnet.TLRPC$TL_channelAdminLogEventsFilter;
import org.telegram.tgnet.TLRPC$TL_channelParticipantCreator;
import org.telegram.tgnet.TLRPC$TL_channelParticipantsAdmins;
import org.telegram.tgnet.TLRPC$TL_channels_adminLogResults;
import org.telegram.tgnet.TLRPC$TL_channels_channelParticipants;
import org.telegram.tgnet.TLRPC$TL_channels_getAdminLog;
import org.telegram.tgnet.TLRPC$TL_channels_getParticipants;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetShortName;
import org.telegram.tgnet.TLRPC$TL_inputUser;
import org.telegram.tgnet.TLRPC$TL_keyboardButton;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonRow;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_messages_exportedChatInvite;
import org.telegram.tgnet.TLRPC$TL_messages_getExportedChatInvite;
import org.telegram.tgnet.TLRPC$TL_premiumGiftOption;
import org.telegram.tgnet.TLRPC$TL_replyInlineMarkup;
import org.telegram.tgnet.TLRPC$TL_users_getUsers;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.AvatarPreviewer;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatLoadingCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ChatUnreadCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChannelAdminLogActivity;
import org.telegram.ui.Components.AdminLogFilterAlert2;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.ChatScrimPopupContainerLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EmbedBottomSheet;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PhonebookShareAlert;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

public class ChannelAdminLogActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int[] allowedNotificationsDuringChatListAnimations = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public static int lastStableId = 10;
    private long activityResumeTime;
    private ArrayList<TLRPC$ChannelParticipant> admins;
    private Paint aspectPaint;
    private Path aspectPath;
    private AspectRatioFrameLayout aspectRatioFrameLayout;
    private ChatAvatarContainer avatarContainer;
    private FrameLayout bottomOverlayChat;
    private TextView bottomOverlayChatText;
    private ImageView bottomOverlayImage;
    private ChatActivityAdapter chatAdapter;
    private LinearLayoutManager chatLayoutManager;
    private ChatListItemAnimator chatListItemAnimator;
    private RecyclerListView chatListView;
    private RecyclerAnimationScrollHelper chatScrollHelper;
    private boolean checkTextureViewPosition;
    private float contentPanTranslation;
    private float contentPanTranslationT;
    private SizeNotifierFrameLayout contentView;
    protected TLRPC$Chat currentChat;
    private boolean currentFloatingDateOnScreen;
    private boolean currentFloatingTopIsNotMessage;
    private ChatMessageCell dummyMessageCell;
    private ImageView emptyImageView;
    private LinearLayout emptyLayoutView;
    private TextView emptyView;
    private FrameLayout emptyViewContainer;
    private boolean endReached;
    private AnimatorSet floatingDateAnimation;
    private ChatActionCell floatingDateView;
    public String highlightMessageQuote;
    public boolean highlightMessageQuoteFirst;
    private boolean linviteLoading;
    private boolean loading;
    private int loadsCount;
    private long minEventId;
    private boolean openAnimationEnded;
    private RadialProgressView progressBar;
    private FrameLayout progressView;
    private View progressView2;
    private boolean reloadingLastMessages;
    private FrameLayout roundVideoContainer;
    private long savedScrollEventId;
    private int savedScrollOffset;
    private ActionBarPopupWindow scrimPopupWindow;
    private boolean scrollByTouch;
    private int scrollCallbackAnimationIndex;
    private boolean scrollingFloatingDate;
    private ImageView searchCalendarButton;
    private FrameLayout searchContainer;
    private SimpleTextView searchCountText;
    private ActionBarMenuItem searchItem;
    private boolean searchWas;
    private LongSparseArray<TLRPC$User> selectedAdmins;
    private MessageObject selectedObject;
    private TLRPC$ChannelParticipant selectedParticipant;
    public boolean showNoQuoteAlert;
    private UndoView undoView;
    private Runnable unselectRunnable;
    private HashMap<Long, TLRPC$User> usersMap;
    private TextureView videoTextureView;
    private boolean wasManualScroll;
    private ArrayList<ChatMessageCell> chatMessageCellsCache = new ArrayList<>();
    private int[] mid = {2};
    private int scrollToPositionOnRecreate = -1;
    private int scrollToOffsetOnRecreate = 0;
    private boolean paused = true;
    private boolean wasPaused = false;
    private final LongSparseArray<MessageObject> messagesDict = new LongSparseArray<>();
    private final LongSparseArray<MessageObject> realMessagesDict = new LongSparseArray<>();
    private final HashMap<String, ArrayList<MessageObject>> messagesByDays = new HashMap<>();
    protected ArrayList<MessageObject> messages = new ArrayList<>();
    private final ArrayList<MessageObject> filteredMessages = new ArrayList<>();
    private final HashSet<Long> expandedEvents = new HashSet<>();
    private TLRPC$TL_channelAdminLogEventsFilter currentFilter = null;
    private String searchQuery = "";
    private AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker(allowedNotificationsDuringChatListAnimations);
    private HashMap<String, Object> invitesCache = new HashMap<>();
    private PhotoViewer.PhotoViewerProvider provider = new PhotoViewer.EmptyPhotoViewerProvider() {
        @Override
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i, boolean z) {
            ChatActionCell chatActionCell;
            MessageObject messageObject2;
            ChatMessageCell chatMessageCell;
            MessageObject messageObject3;
            int childCount = ChannelAdminLogActivity.this.chatListView.getChildCount();
            int i2 = 0;
            while (true) {
                ImageReceiver imageReceiver = null;
                if (i2 >= childCount) {
                    return null;
                }
                View childAt = ChannelAdminLogActivity.this.chatListView.getChildAt(i2);
                if (childAt instanceof ChatMessageCell) {
                    if (messageObject != null && (messageObject3 = (chatMessageCell = (ChatMessageCell) childAt).getMessageObject()) != null && messageObject3.getId() == messageObject.getId()) {
                        imageReceiver = chatMessageCell.getPhotoImage();
                    }
                } else if ((childAt instanceof ChatActionCell) && (messageObject2 = (chatActionCell = (ChatActionCell) childAt).getMessageObject()) != null) {
                    if (messageObject != null) {
                        if (messageObject2.getId() == messageObject.getId()) {
                            imageReceiver = chatActionCell.getPhotoImage();
                        }
                    } else if (tLRPC$FileLocation != null && messageObject2.photoThumbs != null) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= messageObject2.photoThumbs.size()) {
                                break;
                            }
                            TLRPC$FileLocation tLRPC$FileLocation2 = messageObject2.photoThumbs.get(i3).location;
                            if (tLRPC$FileLocation2.volume_id == tLRPC$FileLocation.volume_id && tLRPC$FileLocation2.local_id == tLRPC$FileLocation.local_id) {
                                imageReceiver = chatActionCell.getPhotoImage();
                                break;
                            }
                            i3++;
                        }
                    }
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                    placeProviderObject.viewX = iArr[0];
                    placeProviderObject.viewY = iArr[1] - (Build.VERSION.SDK_INT < 21 ? AndroidUtilities.statusBarHeight : 0);
                    placeProviderObject.parentView = ChannelAdminLogActivity.this.chatListView;
                    placeProviderObject.imageReceiver = imageReceiver;
                    placeProviderObject.thumb = imageReceiver.getBitmapSafe();
                    placeProviderObject.radius = imageReceiver.getRoundRadius(true);
                    placeProviderObject.isEvent = true;
                    return placeProviderObject;
                }
                i2++;
            }
        }
    };
    private final ArrayList<Integer> filteredMessagesUpdatedPosition = new ArrayList<>();
    private final LongSparseArray<Integer> stableIdByEventExpand = new LongSparseArray<>();
    public int highlightMessageId = Integer.MAX_VALUE;
    public int highlightMessageQuoteOffset = -1;
    private final ChatScrollCallback chatScrollHelperCallback = new ChatScrollCallback();
    private int savedScrollPosition = -1;

    public static boolean lambda$actionMessagesDeletedBy$6(String str) {
        return str != null;
    }

    public static boolean lambda$createView$7(View view, MotionEvent motionEvent) {
        return true;
    }

    public void updateBottomOverlay() {
    }

    public ChannelAdminLogActivity(TLRPC$Chat tLRPC$Chat) {
        this.currentChat = tLRPC$Chat;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        loadMessages(true);
        loadAdmins();
        Bulletin.addDelegate(this, new Bulletin.Delegate(this) {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getBottomOffset(int i) {
                return AndroidUtilities.dp(51.0f);
            }
        });
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        this.notificationsLocker.unlock();
    }

    private void updateEmptyPlaceholder() {
        if (this.emptyView == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.searchQuery)) {
            this.emptyImageView.setVisibility(8);
            this.emptyView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.emptyView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.selectedAdmins != null || this.currentFilter != null) {
            this.emptyImageView.setVisibility(8);
            this.emptyView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.emptyView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
        } else {
            this.emptyImageView.setVisibility(0);
            this.emptyView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.currentChat.megagroup) {
                this.emptyView.setText(smallerNewNewLine(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.emptyView.setText(smallerNewNewLine(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
        }
    }

    private CharSequence smallerNewNewLine(CharSequence charSequence) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!(charSequence instanceof Spannable)) {
                charSequence = new SpannableStringBuilder(charSequence);
            }
            ((SpannableStringBuilder) charSequence).setSpan(new LineHeightSpan.Standard(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return charSequence;
    }

    public void lambda$processSelectedOption$20() {
        if (this.reloadingLastMessages) {
            return;
        }
        this.reloadingLastMessages = true;
        TLRPC$TL_channels_getAdminLog tLRPC$TL_channels_getAdminLog = new TLRPC$TL_channels_getAdminLog();
        tLRPC$TL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.currentChat);
        tLRPC$TL_channels_getAdminLog.q = this.searchQuery;
        tLRPC$TL_channels_getAdminLog.limit = 10;
        tLRPC$TL_channels_getAdminLog.max_id = 0L;
        tLRPC$TL_channels_getAdminLog.min_id = 0L;
        TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter = this.currentFilter;
        if (tLRPC$TL_channelAdminLogEventsFilter != null) {
            tLRPC$TL_channels_getAdminLog.flags = 1 | tLRPC$TL_channels_getAdminLog.flags;
            tLRPC$TL_channels_getAdminLog.events_filter = tLRPC$TL_channelAdminLogEventsFilter;
        }
        if (this.selectedAdmins != null) {
            tLRPC$TL_channels_getAdminLog.flags |= 2;
            for (int i = 0; i < this.selectedAdmins.size(); i++) {
                tLRPC$TL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser(this.selectedAdmins.valueAt(i)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_getAdminLog, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChannelAdminLogActivity.this.lambda$reloadLastMessages$1(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$reloadLastMessages$1(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$TL_channels_adminLogResults tLRPC$TL_channels_adminLogResults = (TLRPC$TL_channels_adminLogResults) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChannelAdminLogActivity.this.lambda$reloadLastMessages$0(tLRPC$TL_channels_adminLogResults);
                }
            });
        }
    }

    public void lambda$reloadLastMessages$0(org.telegram.tgnet.TLRPC$TL_channels_adminLogResults r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChannelAdminLogActivity.lambda$reloadLastMessages$0(org.telegram.tgnet.TLRPC$TL_channels_adminLogResults):void");
    }

    public void loadMessages(boolean z) {
        ChatActivityAdapter chatActivityAdapter;
        if (this.loading) {
            return;
        }
        if (z) {
            this.minEventId = Long.MAX_VALUE;
            FrameLayout frameLayout = this.progressView;
            if (frameLayout != null) {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                this.emptyViewContainer.setVisibility(4);
                this.chatListView.setEmptyView(null);
            }
            this.messagesDict.clear();
            this.messages.clear();
            this.messagesByDays.clear();
            filterDeletedMessages();
            this.loadsCount = 0;
        }
        this.loading = true;
        TLRPC$TL_channels_getAdminLog tLRPC$TL_channels_getAdminLog = new TLRPC$TL_channels_getAdminLog();
        tLRPC$TL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.currentChat);
        tLRPC$TL_channels_getAdminLog.q = this.searchQuery;
        tLRPC$TL_channels_getAdminLog.limit = 50;
        if (!z && !this.messages.isEmpty()) {
            tLRPC$TL_channels_getAdminLog.max_id = this.minEventId;
        } else {
            tLRPC$TL_channels_getAdminLog.max_id = 0L;
        }
        tLRPC$TL_channels_getAdminLog.min_id = 0L;
        TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter = this.currentFilter;
        if (tLRPC$TL_channelAdminLogEventsFilter != null) {
            tLRPC$TL_channels_getAdminLog.flags |= 1;
            tLRPC$TL_channels_getAdminLog.events_filter = tLRPC$TL_channelAdminLogEventsFilter;
        }
        if (this.selectedAdmins != null) {
            tLRPC$TL_channels_getAdminLog.flags |= 2;
            for (int i = 0; i < this.selectedAdmins.size(); i++) {
                tLRPC$TL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser(this.selectedAdmins.valueAt(i)));
            }
        }
        this.loadsCount++;
        updateEmptyPlaceholder();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_getAdminLog, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChannelAdminLogActivity.this.lambda$loadMessages$4(tLObject, tLRPC$TL_error);
            }
        });
        if (!z || (chatActivityAdapter = this.chatAdapter) == null) {
            return;
        }
        chatActivityAdapter.notifyDataSetChanged();
    }

    public void lambda$loadMessages$4(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$TL_channels_adminLogResults tLRPC$TL_channels_adminLogResults = (TLRPC$TL_channels_adminLogResults) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChannelAdminLogActivity.this.lambda$loadMessages$3(tLRPC$TL_channels_adminLogResults);
                }
            });
        }
    }

    public void lambda$loadMessages$3(TLRPC$TL_channels_adminLogResults tLRPC$TL_channels_adminLogResults) {
        TLRPC$Message tLRPC$Message;
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader;
        this.loadsCount--;
        int i = 0;
        this.chatListItemAnimator.setShouldAnimateEnterFromBottom(false);
        saveScrollPosition(false);
        MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_channels_adminLogResults.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_channels_adminLogResults.chats, false);
        boolean z = false;
        for (int i2 = 0; i2 < tLRPC$TL_channels_adminLogResults.events.size(); i2++) {
            TLRPC$TL_channelAdminLogEvent tLRPC$TL_channelAdminLogEvent = tLRPC$TL_channels_adminLogResults.events.get(i2);
            if (this.messagesDict.indexOfKey(tLRPC$TL_channelAdminLogEvent.id) < 0) {
                TLRPC$ChannelAdminLogEventAction tLRPC$ChannelAdminLogEventAction = tLRPC$TL_channelAdminLogEvent.action;
                if (tLRPC$ChannelAdminLogEventAction instanceof TLRPC$TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC$TL_channelAdminLogEventActionParticipantToggleAdmin tLRPC$TL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC$TL_channelAdminLogEventActionParticipantToggleAdmin) tLRPC$ChannelAdminLogEventAction;
                    if ((tLRPC$TL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC$TL_channelParticipantCreator) && !(tLRPC$TL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC$TL_channelParticipantCreator)) {
                    }
                }
                this.minEventId = Math.min(this.minEventId, tLRPC$TL_channelAdminLogEvent.id);
                MessageObject messageObject = new MessageObject(this.currentAccount, tLRPC$TL_channelAdminLogEvent, this.messages, this.messagesByDays, this.currentChat, this.mid, false);
                if (messageObject.contentType >= 0) {
                    this.messagesDict.put(tLRPC$TL_channelAdminLogEvent.id, messageObject);
                }
                z = true;
            }
        }
        this.messages.size();
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        for (int size = this.messages.size(); size < this.messages.size(); size++) {
            MessageObject messageObject2 = this.messages.get(size);
            if (messageObject2 != null && messageObject2.contentType != 0 && messageObject2.getRealId() >= 0) {
                this.realMessagesDict.put(messageObject2.getRealId(), messageObject2);
            }
            if (messageObject2 != null && (tLRPC$Message = messageObject2.messageOwner) != null && (tLRPC$MessageReplyHeader = tLRPC$Message.reply_to) != null) {
                if (tLRPC$MessageReplyHeader.reply_to_peer_id == null) {
                    MessageObject messageObject3 = null;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= this.messages.size()) {
                            break;
                        }
                        if (size != i3) {
                            MessageObject messageObject4 = this.messages.get(i3);
                            if (messageObject4.contentType != 1 && messageObject4.getRealId() == tLRPC$MessageReplyHeader.reply_to_msg_id) {
                                messageObject3 = messageObject4;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (messageObject3 != null) {
                        messageObject2.replyMessageObject = messageObject3;
                    }
                }
                arrayList.add(messageObject2);
            }
        }
        if (!arrayList.isEmpty()) {
            MediaDataController.getInstance(this.currentAccount).loadReplyMessagesForMessages(arrayList, -this.currentChat.id, 0, 0L, new Runnable() {
                @Override
                public final void run() {
                    ChannelAdminLogActivity.this.lambda$loadMessages$2();
                }
            }, getClassGuid(), null);
        }
        filterDeletedMessages();
        this.loading = false;
        if (!z) {
            this.endReached = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 0.3f, true);
        this.chatListView.setEmptyView(this.emptyViewContainer);
        ChatActivityAdapter chatActivityAdapter = this.chatAdapter;
        if (chatActivityAdapter != null) {
            chatActivityAdapter.notifyDataSetChanged();
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            if (this.filteredMessages.isEmpty() && TextUtils.isEmpty(this.searchQuery)) {
                i = 8;
            }
            actionBarMenuItem.setVisibility(i);
        }
    }

    public void lambda$loadMessages$2() {
        saveScrollPosition(false);
        this.chatAdapter.notifyDataSetChanged();
    }

    public void filterDeletedMessages() {
        ArrayList arrayList = new ArrayList();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        this.filteredMessagesUpdatedPosition.clear();
        int i = 0;
        while (i < this.messages.size()) {
            MessageObject messageObject = this.messages.get(i);
            long messageDeletedBy = messageDeletedBy(messageObject);
            if (messageObject.stableId <= 0) {
                int i2 = lastStableId;
                lastStableId = i2 + 1;
                messageObject.stableId = i2;
            }
            int i3 = i + 1;
            long messageDeletedBy2 = messageDeletedBy(i3 < this.messages.size() ? this.messages.get(i3) : null);
            if (messageDeletedBy != 0) {
                arrayList2.add(messageObject);
            } else {
                arrayList.add(messageObject);
            }
            if (messageDeletedBy != messageDeletedBy2 && !arrayList2.isEmpty()) {
                TLRPC$ReplyMarkup tLRPC$ReplyMarkup = messageObject.messageOwner.reply_markup;
                boolean z = (tLRPC$ReplyMarkup == null || tLRPC$ReplyMarkup.rows.isEmpty()) ? false : true;
                int size = arrayList.size();
                ArrayList<MessageObject> arrayList3 = new ArrayList<>();
                for (int size2 = arrayList2.size() - 1; size2 >= 0 && arrayList2.get(size2).contentType == 1; size2--) {
                    arrayList3.add(arrayList2.remove(size2));
                }
                if (!arrayList2.isEmpty()) {
                    MessageObject messageObject2 = arrayList2.get(arrayList2.size() - 1);
                    boolean z2 = TextUtils.isEmpty(this.searchQuery) && arrayList2.size() > 3;
                    if (this.expandedEvents.contains(Long.valueOf(messageObject2.eventId)) || !z2) {
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            setupExpandButton(arrayList2.get(i4), 0);
                        }
                        arrayList.addAll(arrayList2);
                    } else {
                        setupExpandButton(messageObject2, arrayList2.size() - 1);
                        arrayList.add(messageObject2);
                    }
                    TLRPC$ReplyMarkup tLRPC$ReplyMarkup2 = messageObject2.messageOwner.reply_markup;
                    if (z != ((tLRPC$ReplyMarkup2 == null || tLRPC$ReplyMarkup2.rows.isEmpty()) ? false : true)) {
                        messageObject2.forceUpdate = true;
                        this.chatAdapter.notifyItemChanged((z ? arrayList2.size() - 1 : 0) + size);
                        this.chatAdapter.notifyItemChanged(size + (z ? arrayList2.size() - 1 : 0) + 1);
                    }
                    long j = messageObject.eventId;
                    arrayList.add(actionMessagesDeletedBy(j, messageObject.currentEvent.user_id, arrayList2, this.expandedEvents.contains(Long.valueOf(j)), z2));
                }
                if (!arrayList3.isEmpty()) {
                    MessageObject messageObject3 = arrayList3.get(arrayList3.size() - 1);
                    arrayList.addAll(arrayList3);
                    arrayList.add(actionMessagesDeletedBy(messageObject3.eventId, messageObject3.currentEvent.user_id, arrayList3, true, false));
                }
                arrayList2.clear();
            }
            i = i3;
        }
        this.filteredMessages.clear();
        this.filteredMessages.addAll(arrayList);
    }

    private MessageObject actionMessagesDeletedBy(long j, long j2, ArrayList<MessageObject> arrayList, boolean z, boolean z2) {
        MessageObject messageObject;
        int i = 0;
        while (true) {
            if (i >= this.filteredMessages.size()) {
                messageObject = null;
                break;
            }
            messageObject = this.filteredMessages.get(i);
            if (messageObject != null && messageObject.contentType == 1 && messageObject.actionDeleteGroupEventId == j) {
                break;
            }
            i++;
        }
        if (messageObject == null) {
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            tLRPC$TL_message.dialog_id = -this.currentChat.id;
            tLRPC$TL_message.id = -1;
            try {
                tLRPC$TL_message.date = arrayList.get(0).messageOwner.date;
            } catch (Exception e) {
                FileLog.e(e);
            }
            messageObject = new MessageObject(this.currentAccount, tLRPC$TL_message, false, false);
        }
        TLRPC$User user = getMessagesController().getUser(Long.valueOf(j2));
        messageObject.contentType = 1;
        if (z2 && arrayList.size() > 1) {
            messageObject.actionDeleteGroupEventId = j;
        } else {
            messageObject.actionDeleteGroupEventId = -1L;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(z2 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", arrayList.size(), TextUtils.join(", ", Collection$EL.stream(arrayList).map(new Function() {
            @Override
            public Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                return Long.valueOf(((MessageObject) obj).getFromChatId());
            }

            @Override
            public Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).distinct().map(new Function() {
            @Override
            public Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                String lambda$actionMessagesDeletedBy$5;
                lambda$actionMessagesDeletedBy$5 = ChannelAdminLogActivity.this.lambda$actionMessagesDeletedBy$5((Long) obj);
                return lambda$actionMessagesDeletedBy$5;
            }

            @Override
            public Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).filter(new Predicate() {
            @Override
            public Predicate and(Predicate predicate) {
                return Predicate.CC.$default$and(this, predicate);
            }

            @Override
            public Predicate negate() {
                return Predicate.CC.$default$negate(this);
            }

            @Override
            public Predicate or(Predicate predicate) {
                return Predicate.CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                boolean lambda$actionMessagesDeletedBy$6;
                lambda$actionMessagesDeletedBy$6 = ChannelAdminLogActivity.lambda$actionMessagesDeletedBy$6((String) obj);
                return lambda$actionMessagesDeletedBy$6;
            }
        }).limit(4L).toArray())), "un1", user));
        if (z2 && arrayList.size() > 1) {
            ProfileActivity.ShowDrawable findDrawable = findDrawable(messageObject.messageText);
            if (findDrawable == null) {
                findDrawable = new ProfileActivity.ShowDrawable(LocaleController.getString(z ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow));
                findDrawable.textDrawable.setTypeface(AndroidUtilities.bold());
                findDrawable.textDrawable.setTextSize(AndroidUtilities.dp(10.0f));
                findDrawable.setTextColor(-1);
                findDrawable.setBackgroundColor(503316480);
            } else {
                findDrawable.textDrawable.setText(LocaleController.getString(z ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow), false);
            }
            findDrawable.setBounds(0, 0, findDrawable.getIntrinsicWidth(), findDrawable.getIntrinsicHeight());
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new ColoredImageSpan(findDrawable), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject.messageText = spannableStringBuilder;
        MessageObject messageObject2 = arrayList.size() > 0 ? arrayList.get(arrayList.size() - 1) : null;
        if (messageObject2 != null) {
            if (!this.stableIdByEventExpand.containsKey(messageObject2.eventId)) {
                LongSparseArray<Integer> longSparseArray = this.stableIdByEventExpand;
                long j3 = messageObject2.eventId;
                int i2 = lastStableId;
                lastStableId = i2 + 1;
                longSparseArray.put(j3, Integer.valueOf(i2));
            }
            messageObject.stableId = this.stableIdByEventExpand.get(messageObject2.eventId).intValue();
        }
        return messageObject;
    }

    public String lambda$actionMessagesDeletedBy$5(Long l) {
        if (l.longValue() < 0) {
            TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-l.longValue()));
            if (chat == null) {
                return null;
            }
            return chat.title;
        }
        return UserObject.getForcedFirstName(getMessagesController().getUser(l));
    }

    public static ProfileActivity.ShowDrawable findDrawable(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        ColoredImageSpan[] coloredImageSpanArr = (ColoredImageSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), ColoredImageSpan.class);
        for (int i = 0; i < coloredImageSpanArr.length; i++) {
            if (coloredImageSpanArr[i] != null && (coloredImageSpanArr[i].drawable instanceof ProfileActivity.ShowDrawable)) {
                return (ProfileActivity.ShowDrawable) coloredImageSpanArr[i].drawable;
            }
        }
        return null;
    }

    private void setupExpandButton(MessageObject messageObject, int i) {
        if (messageObject == null) {
            return;
        }
        if (i <= 0) {
            TLRPC$ReplyMarkup tLRPC$ReplyMarkup = messageObject.messageOwner.reply_markup;
            if (tLRPC$ReplyMarkup != null) {
                tLRPC$ReplyMarkup.rows.clear();
            }
        } else {
            TLRPC$TL_replyInlineMarkup tLRPC$TL_replyInlineMarkup = new TLRPC$TL_replyInlineMarkup();
            messageObject.messageOwner.reply_markup = tLRPC$TL_replyInlineMarkup;
            TLRPC$TL_keyboardButtonRow tLRPC$TL_keyboardButtonRow = new TLRPC$TL_keyboardButtonRow();
            tLRPC$TL_replyInlineMarkup.rows.add(tLRPC$TL_keyboardButtonRow);
            TLRPC$TL_keyboardButton tLRPC$TL_keyboardButton = new TLRPC$TL_keyboardButton();
            tLRPC$TL_keyboardButton.text = LocaleController.formatPluralString("EventLogExpandMore", i, new Object[0]);
            tLRPC$TL_keyboardButtonRow.buttons.add(tLRPC$TL_keyboardButton);
        }
        messageObject.measureInlineBotButtons();
    }

    private long messageDeletedBy(MessageObject messageObject) {
        TLRPC$TL_channelAdminLogEvent tLRPC$TL_channelAdminLogEvent;
        if (messageObject == null || (tLRPC$TL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tLRPC$TL_channelAdminLogEvent.action instanceof TLRPC$TL_channelAdminLogEventActionDeleteMessage)) {
            return 0L;
        }
        return tLRPC$TL_channelAdminLogEvent.user_id;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ChatMessageCell chatMessageCell;
        MessageObject messageObject;
        ChatMessageCell chatMessageCell2;
        MessageObject messageObject2;
        ChatMessageCell chatMessageCell3;
        MessageObject messageObject3;
        if (i == NotificationCenter.emojiLoaded) {
            RecyclerListView recyclerListView = this.chatListView;
            if (recyclerListView != null) {
                recyclerListView.invalidateViews();
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(createTextureView(true), this.aspectRatioFrameLayout, this.roundVideoContainer, true);
                updateTextureViewPosition();
            }
            RecyclerListView recyclerListView2 = this.chatListView;
            if (recyclerListView2 != null) {
                int childCount = recyclerListView2.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.chatListView.getChildAt(i3);
                    if ((childAt instanceof ChatMessageCell) && (messageObject3 = (chatMessageCell3 = (ChatMessageCell) childAt).getMessageObject()) != null) {
                        if (messageObject3.isVoice() || messageObject3.isMusic()) {
                            chatMessageCell3.updateButtonState(false, true, false);
                        } else if (messageObject3.isRoundVideo()) {
                            chatMessageCell3.checkVideoPlayback(false, null);
                            if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                                messageObject3.resetPlayingProgress();
                                chatMessageCell3.invalidate();
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.messagePlayingPlayStateChanged) {
            RecyclerListView recyclerListView3 = this.chatListView;
            if (recyclerListView3 != null) {
                int childCount2 = recyclerListView3.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = this.chatListView.getChildAt(i4);
                    if ((childAt2 instanceof ChatMessageCell) && (messageObject = (chatMessageCell = (ChatMessageCell) childAt2).getMessageObject()) != null) {
                        if (messageObject.isVoice() || messageObject.isMusic()) {
                            chatMessageCell.updateButtonState(false, true, false);
                        } else if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                            chatMessageCell.checkVideoPlayback(true, null);
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num = (Integer) objArr[0];
            RecyclerListView recyclerListView4 = this.chatListView;
            if (recyclerListView4 != null) {
                int childCount3 = recyclerListView4.getChildCount();
                for (int i5 = 0; i5 < childCount3; i5++) {
                    View childAt3 = this.chatListView.getChildAt(i5);
                    if ((childAt3 instanceof ChatMessageCell) && (messageObject2 = (chatMessageCell2 = (ChatMessageCell) childAt3).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null) {
                            messageObject2.audioProgress = playingMessageObject.audioProgress;
                            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                            chatMessageCell2.updatePlayingMessageProgress();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != NotificationCenter.didSetNewWallpapper || this.fragmentView == null) {
            return;
        }
        this.contentView.setBackgroundImage(Theme.getCachedWallpaper(), Theme.isWallpaperMotion());
        this.progressView2.invalidate();
        TextView textView = this.emptyView;
        if (textView != null) {
            textView.invalidate();
        }
        this.chatListView.invalidateViews();
    }

    @Override
    public View createView(Context context) {
        if (this.chatMessageCellsCache.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                this.chatMessageCellsCache.add(new ChatMessageCell(context, this.currentAccount));
            }
        }
        this.searchWas = false;
        this.hasOwnBackground = true;
        Theme.createChatResources(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(Build.VERSION.SDK_INT >= 21 && !AndroidUtilities.isTablet());
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    ChannelAdminLogActivity.this.lambda$onBackPressed$308();
                }
            }
        });
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false);
        this.avatarContainer = chatAvatarContainer;
        chatAvatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, 56.0f, 0.0f, 40.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchCollapse() {
                ChannelAdminLogActivity.this.searchQuery = "";
                ChannelAdminLogActivity.this.avatarContainer.setVisibility(0);
                if (ChannelAdminLogActivity.this.searchWas) {
                    ChannelAdminLogActivity.this.searchWas = false;
                    ChannelAdminLogActivity.this.loadMessages(true);
                }
                ChannelAdminLogActivity.this.updateBottomOverlay();
            }

            @Override
            public void onSearchExpand() {
                ChannelAdminLogActivity.this.avatarContainer.setVisibility(8);
                ChannelAdminLogActivity.this.updateBottomOverlay();
            }

            @Override
            public void onSearchPressed(EditText editText) {
                ChannelAdminLogActivity.this.searchWas = true;
                ChannelAdminLogActivity.this.searchQuery = editText.getText().toString();
                ChannelAdminLogActivity.this.loadMessages(true);
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        this.avatarContainer.setEnabled(false);
        this.avatarContainer.setTitle(this.currentChat.title);
        this.avatarContainer.setSubtitle(LocaleController.getString("EventLogAllEvents", R.string.EventLogAllEvents));
        this.avatarContainer.setChatAvatar(this.currentChat);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            {
                new AdjustPanLayoutHelper(this) {
                    @Override
                    public void onTransitionEnd() {
                    }

                    @Override
                    public void onTransitionStart(boolean z, int i2) {
                        ChannelAdminLogActivity.this.wasManualScroll = true;
                    }

                    @Override
                    public void onPanTranslationUpdate(float f, float f2, boolean z) {
                        if (ChannelAdminLogActivity.this.getParentLayout() == null || !ChannelAdminLogActivity.this.getParentLayout().isPreviewOpenAnimationInProgress()) {
                            ChannelAdminLogActivity.this.contentPanTranslation = f;
                            ChannelAdminLogActivity.this.contentPanTranslationT = f2;
                            ((BaseFragment) ChannelAdminLogActivity.this).actionBar.setTranslationY(f);
                            if (ChannelAdminLogActivity.this.emptyViewContainer != null) {
                                ChannelAdminLogActivity.this.emptyViewContainer.setTranslationY(f / 2.0f);
                            }
                            ChannelAdminLogActivity.this.progressView.setTranslationY(f / 2.0f);
                            int i2 = (int) f;
                            ChannelAdminLogActivity.this.contentView.setBackgroundTranslation(i2);
                            ChannelAdminLogActivity.this.setFragmentPanTranslationOffset(i2);
                            ChannelAdminLogActivity.this.chatListView.invalidate();
                            if (AndroidUtilities.isTablet() && (ChannelAdminLogActivity.this.getParentActivity() instanceof LaunchActivity)) {
                                BaseFragment lastFragment = ((LaunchActivity) ChannelAdminLogActivity.this.getParentActivity()).getActionBarLayout().getLastFragment();
                                if (lastFragment instanceof DialogsActivity) {
                                    ((DialogsActivity) lastFragment).setPanTranslationOffset(f);
                                }
                            }
                        }
                    }

                    @Override
                    protected boolean heightAnimationEnabled() {
                        INavigationLayout parentLayout = ChannelAdminLogActivity.this.getParentLayout();
                        if (((BaseFragment) ChannelAdminLogActivity.this).inPreviewMode || ((BaseFragment) ChannelAdminLogActivity.this).inBubbleMode || AndroidUtilities.isInMultiwindow || parentLayout == null || System.currentTimeMillis() - ChannelAdminLogActivity.this.activityResumeTime < 250) {
                            return false;
                        }
                        return ((ChannelAdminLogActivity.this == parentLayout.getLastFragment() && parentLayout.isTransitionAnimationInProgress()) || parentLayout.isPreviewOpenAnimationInProgress() || ((BaseFragment) ChannelAdminLogActivity.this).isPaused || !ChannelAdminLogActivity.this.openAnimationEnded) ? false : true;
                    }
                };
            }

            @Override
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject == null || !playingMessageObject.isRoundVideo() || playingMessageObject.eventId == 0 || playingMessageObject.getDialogId() != (-ChannelAdminLogActivity.this.currentChat.id)) {
                    return;
                }
                MediaController.getInstance().setTextureView(ChannelAdminLogActivity.this.createTextureView(false), ChannelAdminLogActivity.this.aspectRatioFrameLayout, ChannelAdminLogActivity.this.roundVideoContainer, true);
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                boolean drawChild = super.drawChild(canvas, view, j);
                if (view == ((BaseFragment) ChannelAdminLogActivity.this).actionBar && ((BaseFragment) ChannelAdminLogActivity.this).parentLayout != null) {
                    ((BaseFragment) ChannelAdminLogActivity.this).parentLayout.drawHeaderShadow(canvas, ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getVisibility() == 0 ? ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight() : 0);
                }
                return drawChild;
            }

            @Override
            protected boolean isActionBarVisible() {
                return ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getVisibility() == 0;
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                measureChildWithMargins(((BaseFragment) ChannelAdminLogActivity.this).actionBar, i2, 0, i3, 0);
                int measuredHeight = ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight();
                if (((BaseFragment) ChannelAdminLogActivity.this).actionBar.getVisibility() == 0) {
                    paddingTop -= measuredHeight;
                }
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) ChannelAdminLogActivity.this).actionBar) {
                        if (childAt != ChannelAdminLogActivity.this.chatListView && childAt != ChannelAdminLogActivity.this.progressView) {
                            if (childAt == ChannelAdminLogActivity.this.emptyViewContainer) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i2, 0, i3, 0);
                            }
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), paddingTop - AndroidUtilities.dp(50.0f)), 1073741824));
                        }
                    }
                }
            }

            @Override
            public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChannelAdminLogActivity.AnonymousClass5.onLayout(boolean, int, int, int, int):void");
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (AvatarPreviewer.hasVisibleInstance()) {
                    AvatarPreviewer.getInstance().onTouchEvent(motionEvent);
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.fragmentView = sizeNotifierFrameLayout;
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = sizeNotifierFrameLayout;
        this.contentView = sizeNotifierFrameLayout2;
        sizeNotifierFrameLayout2.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.contentView.setBackgroundImage(Theme.getCachedWallpaper(), Theme.isWallpaperMotion());
        FrameLayout frameLayout = new FrameLayout(context);
        this.emptyViewContainer = frameLayout;
        frameLayout.setVisibility(4);
        this.contentView.addView(this.emptyViewContainer, LayoutHelper.createFrame(-1, -2, 17));
        this.emptyViewContainer.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$createView$7;
                lambda$createView$7 = ChannelAdminLogActivity.lambda$createView$7(view, motionEvent);
                return lambda$createView$7;
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        this.emptyLayoutView = linearLayout;
        linearLayout.setBackground(Theme.createServiceDrawable(AndroidUtilities.dp(12.0f), this.emptyView, this.contentView));
        this.emptyLayoutView.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.emptyImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.emptyImageView.setImageResource(R.drawable.large_log_actions);
        this.emptyImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.emptyImageView.setVisibility(8);
        this.emptyLayoutView.addView(this.emptyImageView, LayoutHelper.createLinear(54, 54, 17, 16, 20, 16, -4));
        TextView textView = new TextView(this, context) {
            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), AndroidUtilities.dp(220.0f)), View.MeasureSpec.getMode(i2)), i3);
            }
        };
        this.emptyView = textView;
        textView.setTextSize(1, 14.0f);
        this.emptyView.setGravity(17);
        TextView textView2 = this.emptyView;
        int i2 = Theme.key_chat_serviceText;
        textView2.setTextColor(Theme.getColor(i2));
        this.emptyView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.emptyLayoutView.addView(this.emptyView, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 0));
        this.emptyViewContainer.addView(this.emptyLayoutView, LayoutHelper.createFrame(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                ChannelAdminLogActivity.this.applyScrolledPosition();
                super.onLayout(z, i3, i4, i5, i6);
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                ChatMessageCell chatMessageCell;
                ImageReceiver avatarImage;
                int y;
                int adapterPosition;
                boolean drawChild = super.drawChild(canvas, view, j);
                if ((view instanceof ChatMessageCell) && (avatarImage = (chatMessageCell = (ChatMessageCell) view).getAvatarImage()) != null) {
                    boolean z = (chatMessageCell.getMessageObject().deleted || ChannelAdminLogActivity.this.chatListView.getChildAdapterPosition(chatMessageCell) == -1) ? false : true;
                    if (chatMessageCell.getMessageObject().deleted) {
                        avatarImage.setVisible(false, false);
                        return drawChild;
                    }
                    int y2 = (int) view.getY();
                    if (chatMessageCell.drawPinnedBottom() && (adapterPosition = ChannelAdminLogActivity.this.chatListView.getChildViewHolder(view).getAdapterPosition()) >= 0) {
                        if (ChannelAdminLogActivity.this.chatListView.findViewHolderForAdapterPosition(adapterPosition + 1) != null) {
                            avatarImage.setVisible(false, false);
                            return drawChild;
                        }
                    }
                    float slidingOffsetX = chatMessageCell.getSlidingOffsetX() + chatMessageCell.getCheckBoxTranslation();
                    int y3 = ((int) view.getY()) + chatMessageCell.getLayoutHeight();
                    int measuredHeight = ChannelAdminLogActivity.this.chatListView.getMeasuredHeight() - ChannelAdminLogActivity.this.chatListView.getPaddingBottom();
                    if (y3 > measuredHeight) {
                        y3 = measuredHeight;
                    }
                    if (chatMessageCell.drawPinnedTop() && (r12 = ChannelAdminLogActivity.this.chatListView.getChildViewHolder(view).getAdapterPosition()) >= 0) {
                        int i3 = 0;
                        while (i3 < 20) {
                            i3++;
                            int adapterPosition2 = adapterPosition2 - 1;
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition = ChannelAdminLogActivity.this.chatListView.findViewHolderForAdapterPosition(adapterPosition2);
                            if (findViewHolderForAdapterPosition == null) {
                                break;
                            }
                            y2 = findViewHolderForAdapterPosition.itemView.getTop();
                            View view2 = findViewHolderForAdapterPosition.itemView;
                            if (!(view2 instanceof ChatMessageCell)) {
                                break;
                            }
                            chatMessageCell = (ChatMessageCell) view2;
                            if (!chatMessageCell.drawPinnedTop()) {
                                break;
                            }
                        }
                    }
                    if (y3 - AndroidUtilities.dp(48.0f) < y2) {
                        y3 = y2 + AndroidUtilities.dp(48.0f);
                    }
                    if (!chatMessageCell.drawPinnedBottom() && y3 > (y = (int) (chatMessageCell.getY() + chatMessageCell.getMeasuredHeight()))) {
                        y3 = y;
                    }
                    canvas.save();
                    if (slidingOffsetX != 0.0f) {
                        canvas.translate(slidingOffsetX, 0.0f);
                    }
                    if (chatMessageCell.getCurrentMessagesGroup() != null && chatMessageCell.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                        y3 = (int) (y3 - chatMessageCell.getTranslationY());
                    }
                    if (z) {
                        avatarImage.setImageY(y3 - AndroidUtilities.dp(44.0f));
                    }
                    if (chatMessageCell.shouldDrawAlphaLayer()) {
                        avatarImage.setAlpha(chatMessageCell.getAlpha());
                        canvas.scale(chatMessageCell.getScaleX(), chatMessageCell.getScaleY(), chatMessageCell.getX() + chatMessageCell.getPivotX(), chatMessageCell.getY() + (chatMessageCell.getHeight() >> 1));
                    } else {
                        avatarImage.setAlpha(1.0f);
                    }
                    if (z) {
                        avatarImage.setVisible(true, false);
                    }
                    avatarImage.draw(canvas);
                    canvas.restore();
                }
                return drawChild;
            }
        };
        this.chatListView = recyclerListView;
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i3) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i3);
            }

            @Override
            public void onDoubleTap(View view, int i3, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i3, f, f2);
            }

            @Override
            public void onItemClick(View view, int i3, float f, float f2) {
                MessageObject messageObject;
                if (!(view instanceof ChatActionCell) || (messageObject = ((ChatActionCell) view).getMessageObject()) == null || messageObject.actionDeleteGroupEventId == -1) {
                    ChannelAdminLogActivity.this.createMenu(view, f, f2);
                    return;
                }
                if (ChannelAdminLogActivity.this.expandedEvents.contains(Long.valueOf(messageObject.actionDeleteGroupEventId))) {
                    ChannelAdminLogActivity.this.expandedEvents.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    ChannelAdminLogActivity.this.expandedEvents.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                ChannelAdminLogActivity.this.saveScrollPosition(true);
                ChannelAdminLogActivity.this.filterDeletedMessages();
                ChannelAdminLogActivity.this.chatAdapter.notifyDataSetChanged();
            }
        });
        this.chatListView.setTag(1);
        this.chatListView.setVerticalScrollBarEnabled(true);
        RecyclerListView recyclerListView2 = this.chatListView;
        ChatActivityAdapter chatActivityAdapter = new ChatActivityAdapter(context);
        this.chatAdapter = chatActivityAdapter;
        recyclerListView2.setAdapter(chatActivityAdapter);
        this.chatListView.setClipToPadding(false);
        this.chatListView.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(3.0f));
        RecyclerListView recyclerListView3 = this.chatListView;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(null, this.chatListView, this.resourceProvider);
        this.chatListItemAnimator = anonymousClass9;
        recyclerListView3.setItemAnimator(anonymousClass9);
        this.chatListItemAnimator.setReversePositions(true);
        this.chatListView.setLayoutAnimation(null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return true;
            }

            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i3) {
                ChannelAdminLogActivity.this.scrollByTouch = false;
                LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 0);
                linearSmoothScrollerCustom.setTargetPosition(i3);
                startSmoothScroll(linearSmoothScrollerCustom);
            }

            @Override
            public void scrollToPositionWithOffset(int i3, int i4) {
                super.scrollToPositionWithOffset(i3, i4);
            }
        };
        this.chatLayoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.chatLayoutManager.setStackFromEnd(true);
        this.chatListView.setLayoutManager(this.chatLayoutManager);
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.chatListView, this.chatLayoutManager);
        this.chatScrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.setScrollListener(new RecyclerAnimationScrollHelper.ScrollListener() {
            @Override
            public final void onScroll() {
                ChannelAdminLogActivity.this.updateMessagesVisiblePart();
            }
        });
        this.chatScrollHelper.setAnimationCallback(this.chatScrollHelperCallback);
        this.contentView.addView(this.chatListView, LayoutHelper.createFrame(-1, -1.0f));
        this.chatListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            {
                AndroidUtilities.dp(100.0f);
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                if (i3 == 1) {
                    ChannelAdminLogActivity.this.scrollingFloatingDate = true;
                    ChannelAdminLogActivity.this.checkTextureViewPosition = true;
                } else if (i3 == 0) {
                    ChannelAdminLogActivity.this.scrollingFloatingDate = false;
                    ChannelAdminLogActivity.this.checkTextureViewPosition = false;
                    ChannelAdminLogActivity.this.hideFloatingDateView(true);
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                ChannelAdminLogActivity.this.chatListView.invalidate();
                if (i4 != 0 && ChannelAdminLogActivity.this.scrollingFloatingDate && !ChannelAdminLogActivity.this.currentFloatingTopIsNotMessage && ChannelAdminLogActivity.this.floatingDateView.getTag() == null) {
                    if (ChannelAdminLogActivity.this.floatingDateAnimation != null) {
                        ChannelAdminLogActivity.this.floatingDateAnimation.cancel();
                    }
                    ChannelAdminLogActivity.this.floatingDateView.setTag(1);
                    ChannelAdminLogActivity.this.floatingDateAnimation = new AnimatorSet();
                    ChannelAdminLogActivity.this.floatingDateAnimation.setDuration(150L);
                    ChannelAdminLogActivity.this.floatingDateAnimation.playTogether(ObjectAnimator.ofFloat(ChannelAdminLogActivity.this.floatingDateView, "alpha", 1.0f));
                    ChannelAdminLogActivity.this.floatingDateAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (animator.equals(ChannelAdminLogActivity.this.floatingDateAnimation)) {
                                ChannelAdminLogActivity.this.floatingDateAnimation = null;
                            }
                        }
                    });
                    ChannelAdminLogActivity.this.floatingDateAnimation.start();
                }
                ChannelAdminLogActivity.this.checkScrollForLoad(true);
                ChannelAdminLogActivity.this.updateMessagesVisiblePart();
            }
        });
        int i3 = this.scrollToPositionOnRecreate;
        if (i3 != -1) {
            this.chatLayoutManager.scrollToPositionWithOffset(i3, this.scrollToOffsetOnRecreate);
            this.scrollToPositionOnRecreate = -1;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.progressView = frameLayout2;
        frameLayout2.setVisibility(4);
        this.contentView.addView(this.progressView, LayoutHelper.createFrame(-1, -1, 51));
        View view = new View(context);
        this.progressView2 = view;
        view.setBackground(Theme.createServiceDrawable(AndroidUtilities.dp(18.0f), this.progressView2, this.contentView));
        this.progressView.addView(this.progressView2, LayoutHelper.createFrame(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.progressBar = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.progressBar.setProgressColor(Theme.getColor(i2));
        this.progressView.addView(this.progressBar, LayoutHelper.createFrame(32, 32, 17));
        ChatActionCell chatActionCell = new ChatActionCell(context);
        this.floatingDateView = chatActionCell;
        chatActionCell.setAlpha(0.0f);
        this.floatingDateView.setImportantForAccessibility(2);
        this.contentView.addView(this.floatingDateView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.contentView.addView(this.actionBar);
        FrameLayout frameLayout3 = new FrameLayout(this, context) {
            @Override
            public void onDraw(Canvas canvas) {
                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                Theme.chat_composeShadowDrawable.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), Theme.chat_composeBackgroundPaint);
            }
        };
        this.bottomOverlayChat = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.bottomOverlayChat.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.contentView.addView(this.bottomOverlayChat, LayoutHelper.createFrame(-1, 51, 80));
        this.bottomOverlayChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ChannelAdminLogActivity.this.lambda$createView$9(view2);
            }
        });
        TextView textView3 = new TextView(context);
        this.bottomOverlayChatText = textView3;
        textView3.setTextSize(1, 15.0f);
        this.bottomOverlayChatText.setTypeface(AndroidUtilities.bold());
        TextView textView4 = this.bottomOverlayChatText;
        int i4 = Theme.key_chat_fieldOverlayText;
        textView4.setTextColor(Theme.getColor(i4));
        this.bottomOverlayChatText.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS).toUpperCase());
        this.bottomOverlayChat.addView(this.bottomOverlayChatText, LayoutHelper.createFrame(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.bottomOverlayImage = imageView2;
        imageView2.setImageResource(R.drawable.msg_help);
        this.bottomOverlayImage.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4), PorterDuff.Mode.MULTIPLY));
        this.bottomOverlayImage.setScaleType(ImageView.ScaleType.CENTER);
        this.bottomOverlayChat.addView(this.bottomOverlayImage, LayoutHelper.createFrame(48, 48.0f, 53, 3.0f, 0.0f, 0.0f, 0.0f));
        this.bottomOverlayImage.setContentDescription(LocaleController.getString("BotHelp", R.string.BotHelp));
        this.bottomOverlayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ChannelAdminLogActivity.this.lambda$createView$10(view2);
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(this, context) {
            @Override
            public void onDraw(Canvas canvas) {
                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                Theme.chat_composeShadowDrawable.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), Theme.chat_composeBackgroundPaint);
            }
        };
        this.searchContainer = frameLayout4;
        frameLayout4.setWillNotDraw(false);
        this.searchContainer.setVisibility(4);
        this.searchContainer.setFocusable(true);
        this.searchContainer.setFocusableInTouchMode(true);
        this.searchContainer.setClickable(true);
        this.searchContainer.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.contentView.addView(this.searchContainer, LayoutHelper.createFrame(-1, 51, 80));
        ImageView imageView3 = new ImageView(context);
        this.searchCalendarButton = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        this.searchCalendarButton.setImageResource(R.drawable.msg_calendar);
        this.searchCalendarButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_searchPanelIcons), PorterDuff.Mode.MULTIPLY));
        this.searchContainer.addView(this.searchCalendarButton, LayoutHelper.createFrame(48, 48, 53));
        this.searchCalendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ChannelAdminLogActivity.this.lambda$createView$12(view2);
            }
        });
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.searchCountText = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(Theme.key_chat_searchPanelText));
        this.searchCountText.setTextSize(15);
        this.searchCountText.setTypeface(AndroidUtilities.bold());
        this.searchContainer.addView(this.searchCountText, LayoutHelper.createFrame(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.chatAdapter.updateRows();
        if (this.loading && this.messages.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.progressView, true, 0.3f, true);
            this.chatListView.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 0.3f, true);
            this.chatListView.setEmptyView(this.emptyViewContainer);
        }
        this.chatListView.setAnimateEmptyView(true, 1);
        UndoView undoView = new UndoView(context);
        this.undoView = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.contentView.addView(this.undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        updateEmptyPlaceholder();
        return this.fragmentView;
    }

    public class AnonymousClass9 extends ChatListItemAnimator {
        Runnable finishRunnable;
        int scrollAnimationIndex;

        AnonymousClass9(ChatActivity chatActivity, RecyclerListView recyclerListView, Theme.ResourcesProvider resourcesProvider) {
            super(chatActivity, recyclerListView, resourcesProvider);
            this.scrollAnimationIndex = -1;
        }

        @Override
        public void onAnimationStart() {
            if (this.scrollAnimationIndex == -1) {
                this.scrollAnimationIndex = ChannelAdminLogActivity.this.getNotificationCenter().setAnimationInProgress(this.scrollAnimationIndex, ChannelAdminLogActivity.allowedNotificationsDuringChatListAnimations, false);
            }
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.finishRunnable = null;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("admin logs chatItemAnimator disable notifications");
            }
        }

        @Override
        public void onAllAnimationsDone() {
            super.onAllAnimationsDone();
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    ChannelAdminLogActivity.AnonymousClass9.this.lambda$onAllAnimationsDone$0();
                }
            };
            this.finishRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2);
        }

        public void lambda$onAllAnimationsDone$0() {
            if (this.scrollAnimationIndex != -1) {
                ChannelAdminLogActivity.this.getNotificationCenter().onAnimationFinish(this.scrollAnimationIndex);
                this.scrollAnimationIndex = -1;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("admin logs chatItemAnimator enable notifications");
            }
        }
    }

    public void lambda$createView$9(View view) {
        if (getParentActivity() == null) {
            return;
        }
        AdminLogFilterAlert2 adminLogFilterAlert2 = new AdminLogFilterAlert2(this, this.currentFilter, this.selectedAdmins, this.currentChat.megagroup);
        adminLogFilterAlert2.setCurrentAdmins(this.admins);
        adminLogFilterAlert2.setAdminLogFilterAlertDelegate(new AdminLogFilterAlert2.AdminLogFilterAlertDelegate() {
            @Override
            public final void didSelectRights(TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter, LongSparseArray longSparseArray) {
                ChannelAdminLogActivity.this.lambda$createView$8(tLRPC$TL_channelAdminLogEventsFilter, longSparseArray);
            }
        });
        showDialog(adminLogFilterAlert2);
    }

    public void lambda$createView$8(TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter, LongSparseArray longSparseArray) {
        this.currentFilter = tLRPC$TL_channelAdminLogEventsFilter;
        this.selectedAdmins = longSparseArray;
        if (tLRPC$TL_channelAdminLogEventsFilter != null || longSparseArray != null) {
            this.avatarContainer.setSubtitle(LocaleController.getString("EventLogSelectedEvents", R.string.EventLogSelectedEvents));
        } else {
            this.avatarContainer.setSubtitle(LocaleController.getString("EventLogAllEvents", R.string.EventLogAllEvents));
        }
        loadMessages(true);
    }

    public void lambda$createView$10(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        if (this.currentChat.megagroup) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("EventLogInfoDetail", R.string.EventLogInfoDetail)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("EventLogInfoDetailChannel", R.string.EventLogInfoDetailChannel)));
        }
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
        builder.setTitle(LocaleController.getString("EventLogInfoTitle", R.string.EventLogInfoTitle));
        showDialog(builder.create());
    }

    public void lambda$createView$12(View view) {
        if (getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(this.searchItem.getSearchField());
        showDialog(AlertsCreator.createCalendarPickerDialog(getParentActivity(), 1375315200000L, new MessagesStorage.IntCallback() {
            @Override
            public final void run(int i) {
                ChannelAdminLogActivity.this.lambda$createView$11(i);
            }
        }, null).create());
    }

    public void lambda$createView$11(int i) {
        loadMessages(true);
    }

    public void closeMenu() {
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        }
    }

    public boolean createMenu(View view) {
        return createMenu(view, 0.0f, 0.0f);
    }

    public boolean createMenu(final android.view.View r22, final float r23, final float r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChannelAdminLogActivity.createMenu(android.view.View, float, float):boolean");
    }

    public void lambda$createMenu$14(final ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        if (arrayList.isEmpty() || getParentActivity() == null) {
            return;
        }
        Activity parentActivity = getParentActivity();
        int i = R.drawable.popup_fixed_alert;
        int i2 = 0;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(parentActivity, i, getResourceProvider(), 0);
        actionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
        Rect rect = new Rect();
        getParentActivity().getResources().getDrawable(i).mutate().getPadding(rect);
        actionBarPopupWindowLayout.setBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        int size = arrayList2.size();
        final int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (arrayList.get(i3) == null) {
                actionBarPopupWindowLayout.addView((View) new ActionBarPopupWindow.GapView(getContext(), getResourceProvider()), LayoutHelper.createLinear(-1, 8));
            } else {
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getParentActivity(), i3 == 0, i3 == size + (-1), getResourceProvider());
                actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(200.0f));
                actionBarMenuSubItem.setTextAndIcon((CharSequence) arrayList2.get(i3), ((Integer) arrayList3.get(i3)).intValue());
                if (((Integer) arrayList.get(i3)).intValue() == 35) {
                    actionBarMenuSubItem.setColors(getThemedColor(Theme.key_text_RedBold), getThemedColor(Theme.key_text_RedRegular));
                }
                final Integer num = (Integer) arrayList.get(i3);
                actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
                actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ChannelAdminLogActivity.this.lambda$createMenu$13(i3, arrayList, num, view2);
                    }
                });
            }
            i3++;
        }
        ChatScrimPopupContainerLayout chatScrimPopupContainerLayout = new ChatScrimPopupContainerLayout(this.contentView.getContext()) {
            @Override
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ChannelAdminLogActivity.this.closeMenu();
                }
                return super.dispatchKeyEvent(keyEvent);
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent) {
                    ChannelAdminLogActivity.this.closeMenu();
                }
                return dispatchTouchEvent;
            }
        };
        chatScrimPopupContainerLayout.addView(actionBarPopupWindowLayout, LayoutHelper.createLinearRelatively(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        chatScrimPopupContainerLayout.setPopupWindowLayout(actionBarPopupWindowLayout);
        int i4 = -2;
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(chatScrimPopupContainerLayout, i4, i4) {
            @Override
            public void dismiss() {
                super.dismiss();
                if (ChannelAdminLogActivity.this.scrimPopupWindow != this) {
                    return;
                }
                Bulletin.hideVisible();
                ChannelAdminLogActivity.this.scrimPopupWindow = null;
            }
        };
        this.scrimPopupWindow = actionBarPopupWindow;
        actionBarPopupWindow.setPauseNotifications(true);
        this.scrimPopupWindow.setDismissAnimationDuration(220);
        this.scrimPopupWindow.setOutsideTouchable(true);
        this.scrimPopupWindow.setClippingEnabled(true);
        this.scrimPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        this.scrimPopupWindow.setFocusable(true);
        chatScrimPopupContainerLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.scrimPopupWindow.setInputMethodMode(2);
        this.scrimPopupWindow.setSoftInputMode(48);
        this.scrimPopupWindow.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f)) - chatScrimPopupContainerLayout.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
        if (left < AndroidUtilities.dp(6.0f)) {
            left = AndroidUtilities.dp(6.0f);
        } else if (left > (this.chatListView.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - chatScrimPopupContainerLayout.getMeasuredWidth()) {
            left = (this.chatListView.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - chatScrimPopupContainerLayout.getMeasuredWidth();
        }
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            this.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = this.contentView.getHeight();
        int measuredHeight = chatScrimPopupContainerLayout.getMeasuredHeight() + AndroidUtilities.dp(48.0f);
        int measureKeyboardHeight = this.contentView.measureKeyboardHeight();
        if (measureKeyboardHeight > AndroidUtilities.dp(20.0f)) {
            height += measureKeyboardHeight;
        }
        if (measuredHeight < height) {
            i2 = (int) (this.chatListView.getY() + view.getTop() + f2);
            if ((measuredHeight - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f)) {
                i2 += AndroidUtilities.dp(240.0f) - measuredHeight;
            }
            if (i2 < this.chatListView.getY() + AndroidUtilities.dp(24.0f)) {
                i2 = (int) (this.chatListView.getY() + AndroidUtilities.dp(24.0f));
            } else {
                int i5 = height - measuredHeight;
                if (i2 > i5 - AndroidUtilities.dp(8.0f)) {
                    i2 = i5 - AndroidUtilities.dp(8.0f);
                }
            }
        } else if (!this.inBubbleMode) {
            i2 = AndroidUtilities.statusBarHeight;
        }
        chatScrimPopupContainerLayout.setMaxHeight(height - i2);
        this.scrimPopupWindow.showAtLocation(this.chatListView, 51, left, i2);
        this.scrimPopupWindow.dimBehind();
    }

    public void lambda$createMenu$13(int i, ArrayList arrayList, Integer num, View view) {
        if (this.selectedObject == null || i >= arrayList.size()) {
            return;
        }
        processSelectedOption(num.intValue());
    }

    public void lambda$createMenu$16(final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final Runnable runnable, final TLRPC$ChannelParticipant tLRPC$ChannelParticipant) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelAdminLogActivity.this.lambda$createMenu$15(tLRPC$ChannelParticipant, arrayList, arrayList2, arrayList3, runnable);
            }
        });
    }

    public void lambda$createMenu$15(TLRPC$ChannelParticipant tLRPC$ChannelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Runnable runnable) {
        this.selectedParticipant = tLRPC$ChannelParticipant;
        if (tLRPC$ChannelParticipant != null) {
            if (ChatObject.canUserDoAction(this.currentChat, tLRPC$ChannelParticipant, 6) || ChatObject.canUserDoAction(this.currentChat, tLRPC$ChannelParticipant, 7)) {
                arrayList.add(LocaleController.getString(R.string.Restrict));
                arrayList2.add(Integer.valueOf(R.drawable.msg_block2));
                arrayList3.add(33);
            }
            arrayList.add(LocaleController.getString(R.string.Ban));
            arrayList2.add(Integer.valueOf(R.drawable.msg_block));
            arrayList3.add(35);
        }
        runnable.run();
    }

    private CharSequence getMessageContent(MessageObject messageObject, int i, boolean z) {
        TLRPC$Chat chat;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            long fromChatId = messageObject.getFromChatId();
            if (i != fromChatId) {
                if (fromChatId > 0) {
                    TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user != null) {
                        spannableStringBuilder.append((CharSequence) ContactsController.formatName(user.first_name, user.last_name)).append((CharSequence) ":\n");
                    }
                } else if (fromChatId < 0 && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId))) != null) {
                    spannableStringBuilder.append((CharSequence) chat.title).append((CharSequence) ":\n");
                }
            }
        }
        if (TextUtils.isEmpty(messageObject.messageText)) {
            spannableStringBuilder.append((CharSequence) messageObject.messageOwner.message);
        } else {
            spannableStringBuilder.append(messageObject.messageText);
        }
        return spannableStringBuilder;
    }

    public TextureView createTextureView(boolean z) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.roundVideoContainer == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                FrameLayout frameLayout = new FrameLayout(getParentActivity()) {
                    @Override
                    public void setTranslationY(float f) {
                        super.setTranslationY(f);
                        ChannelAdminLogActivity.this.contentView.invalidate();
                    }
                };
                this.roundVideoContainer = frameLayout;
                frameLayout.setOutlineProvider(new ViewOutlineProvider(this) {
                    @Override
                    @TargetApi(21)
                    public void getOutline(View view, Outline outline) {
                        int i = AndroidUtilities.roundMessageSize;
                        outline.setOval(0, 0, i, i);
                    }
                });
                this.roundVideoContainer.setClipToOutline(true);
            } else {
                this.roundVideoContainer = new FrameLayout(getParentActivity()) {
                    @Override
                    protected void onSizeChanged(int i, int i2, int i3, int i4) {
                        super.onSizeChanged(i, i2, i3, i4);
                        ChannelAdminLogActivity.this.aspectPath.reset();
                        float f = i / 2;
                        ChannelAdminLogActivity.this.aspectPath.addCircle(f, i2 / 2, f, Path.Direction.CW);
                        ChannelAdminLogActivity.this.aspectPath.toggleInverseFillType();
                    }

                    @Override
                    public void setTranslationY(float f) {
                        super.setTranslationY(f);
                        ChannelAdminLogActivity.this.contentView.invalidate();
                    }

                    @Override
                    public void setVisibility(int i) {
                        super.setVisibility(i);
                        if (i == 0) {
                            setLayerType(2, null);
                        }
                    }

                    @Override
                    protected void dispatchDraw(Canvas canvas) {
                        super.dispatchDraw(canvas);
                        canvas.drawPath(ChannelAdminLogActivity.this.aspectPath, ChannelAdminLogActivity.this.aspectPaint);
                    }
                };
                this.aspectPath = new Path();
                Paint paint = new Paint(1);
                this.aspectPaint = paint;
                paint.setColor(-16777216);
                this.aspectPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            this.roundVideoContainer.setWillNotDraw(false);
            this.roundVideoContainer.setVisibility(4);
            AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(getParentActivity());
            this.aspectRatioFrameLayout = aspectRatioFrameLayout;
            aspectRatioFrameLayout.setBackgroundColor(0);
            if (z) {
                this.roundVideoContainer.addView(this.aspectRatioFrameLayout, LayoutHelper.createFrame(-1, -1.0f));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.videoTextureView = textureView;
            textureView.setOpaque(false);
            this.aspectRatioFrameLayout.addView(this.videoTextureView, LayoutHelper.createFrame(-1, -1.0f));
        }
        if (this.roundVideoContainer.getParent() == null) {
            SizeNotifierFrameLayout sizeNotifierFrameLayout = this.contentView;
            FrameLayout frameLayout2 = this.roundVideoContainer;
            int i = AndroidUtilities.roundMessageSize;
            sizeNotifierFrameLayout.addView(frameLayout2, 1, new FrameLayout.LayoutParams(i, i));
        }
        this.roundVideoContainer.setVisibility(4);
        this.aspectRatioFrameLayout.setDrawingReady(false);
        return this.videoTextureView;
    }

    private void processSelectedOption(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChannelAdminLogActivity.processSelectedOption(int):void");
    }

    public void lambda$processSelectedOption$18(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelAdminLogActivity.this.lambda$processSelectedOption$17(tLObject);
            }
        });
    }

    public void lambda$processSelectedOption$17(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.msg_antispam, LocaleController.getString("ChannelAntiSpamFalsePositiveReported", R.string.ChannelAntiSpamFalsePositiveReported)).show();
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.error, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
        } else {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.error, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
        }
    }

    public void lambda$processSelectedOption$19(TLRPC$User tLRPC$User) {
        BulletinFactory.of(this).createSimpleBulletin(R.raw.ic_ban, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName(tLRPC$User)))).show(false);
        lambda$processSelectedOption$20();
    }

    private int getMessageType(MessageObject messageObject) {
        int i;
        String str;
        if (messageObject == null || (i = messageObject.type) == 6) {
            return -1;
        }
        if (i == 10 || i == 11 || i == 16) {
            return messageObject.getId() == 0 ? -1 : 1;
        }
        if (messageObject.isVoice()) {
            return 2;
        }
        if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
            TLRPC$InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
            if (inputStickerSet instanceof TLRPC$TL_inputStickerSetID) {
                if (!MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(inputStickerSet.id)) {
                    return 7;
                }
            } else if ((inputStickerSet instanceof TLRPC$TL_inputStickerSetShortName) && !MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(inputStickerSet.short_name)) {
                return 7;
            }
        } else if ((!messageObject.isRoundVideo() || (messageObject.isRoundVideo() && BuildVars.DEBUG_VERSION)) && ((messageObject.messageOwner.media instanceof TLRPC$TL_messageMediaPhoto) || messageObject.getDocument() != null || messageObject.isMusic() || messageObject.isVideo())) {
            boolean z = false;
            String str2 = messageObject.messageOwner.attachPath;
            if (str2 != null && str2.length() != 0 && new File(messageObject.messageOwner.attachPath).exists()) {
                z = true;
            }
            if ((z || !getFileLoader().getPathToMessage(messageObject.messageOwner).exists()) ? z : true) {
                if (messageObject.getDocument() == null || (str = messageObject.getDocument().mime_type) == null) {
                    return 4;
                }
                if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                    return 10;
                }
                if (str.endsWith("/xml")) {
                    return 5;
                }
                return (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) ? 6 : 4;
            }
        } else {
            if (messageObject.type == 12) {
                return 8;
            }
            if (messageObject.isMediaEmpty()) {
                return 3;
            }
        }
        return 2;
    }

    private void loadAdmins() {
        TLRPC$TL_channels_getParticipants tLRPC$TL_channels_getParticipants = new TLRPC$TL_channels_getParticipants();
        tLRPC$TL_channels_getParticipants.channel = MessagesController.getInputChannel(this.currentChat);
        tLRPC$TL_channels_getParticipants.filter = new TLRPC$TL_channelParticipantsAdmins();
        tLRPC$TL_channels_getParticipants.offset = 0;
        tLRPC$TL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_getParticipants, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChannelAdminLogActivity.this.lambda$loadAdmins$22(tLObject, tLRPC$TL_error);
            }
        }), this.classGuid);
    }

    public void lambda$loadAdmins$22(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelAdminLogActivity.this.lambda$loadAdmins$21(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadAdmins$21(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        TLRPC$ChatFull chatFull;
        if (tLRPC$TL_error == null) {
            TLRPC$TL_channels_channelParticipants tLRPC$TL_channels_channelParticipants = (TLRPC$TL_channels_channelParticipants) tLObject;
            getMessagesController().putUsers(tLRPC$TL_channels_channelParticipants.users, false);
            getMessagesController().putChats(tLRPC$TL_channels_channelParticipants.chats, false);
            this.admins = tLRPC$TL_channels_channelParticipants.participants;
            if (this.currentChat != null && (chatFull = getMessagesController().getChatFull(this.currentChat.id)) != null && chatFull.antispam) {
                TLRPC$ChannelParticipant tLRPC$ChannelParticipant = new TLRPC$ChannelParticipant(this) {
                };
                tLRPC$ChannelParticipant.user_id = getMessagesController().telegramAntispamUserId;
                tLRPC$ChannelParticipant.peer = getMessagesController().getPeer(tLRPC$ChannelParticipant.user_id);
                loadAntispamUser(getMessagesController().telegramAntispamUserId);
                this.admins.add(0, tLRPC$ChannelParticipant);
            }
            Dialog dialog = this.visibleDialog;
            if (dialog instanceof AdminLogFilterAlert2) {
                ((AdminLogFilterAlert2) dialog).setCurrentAdmins(this.admins);
            }
        }
    }

    private void loadAntispamUser(long j) {
        if (getMessagesController().getUser(Long.valueOf(j)) != null) {
            return;
        }
        TLRPC$TL_users_getUsers tLRPC$TL_users_getUsers = new TLRPC$TL_users_getUsers();
        TLRPC$TL_inputUser tLRPC$TL_inputUser = new TLRPC$TL_inputUser();
        tLRPC$TL_inputUser.user_id = j;
        tLRPC$TL_users_getUsers.id.add(tLRPC$TL_inputUser);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_users_getUsers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChannelAdminLogActivity.this.lambda$loadAntispamUser$23(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadAntispamUser$23(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$Vector) {
            ArrayList<Object> arrayList = ((TLRPC$Vector) tLObject).objects;
            ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) instanceof TLRPC$User) {
                    arrayList2.add((TLRPC$User) arrayList.get(i));
                }
            }
            getMessagesController().putUsers(arrayList2, false);
        }
    }

    @Override
    public void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.videoTextureView, null, null, false);
        super.onRemoveFromParent();
    }

    public void hideFloatingDateView(boolean z) {
        if (this.floatingDateView.getTag() == null || this.currentFloatingDateOnScreen) {
            return;
        }
        if (!this.scrollingFloatingDate || this.currentFloatingTopIsNotMessage) {
            this.floatingDateView.setTag(null);
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.floatingDateAnimation = animatorSet;
                animatorSet.setDuration(150L);
                this.floatingDateAnimation.playTogether(ObjectAnimator.ofFloat(this.floatingDateView, "alpha", 0.0f));
                this.floatingDateAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (animator.equals(ChannelAdminLogActivity.this.floatingDateAnimation)) {
                            ChannelAdminLogActivity.this.floatingDateAnimation = null;
                        }
                    }
                });
                this.floatingDateAnimation.setStartDelay(500L);
                this.floatingDateAnimation.start();
                return;
            }
            AnimatorSet animatorSet2 = this.floatingDateAnimation;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.floatingDateAnimation = null;
            }
            this.floatingDateView.setAlpha(0.0f);
        }
    }

    public void checkScrollForLoad(boolean z) {
        LinearLayoutManager linearLayoutManager = this.chatLayoutManager;
        if (linearLayoutManager == null || this.paused) {
            return;
        }
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if ((findFirstVisibleItemPosition == -1 ? 0 : Math.abs(this.chatLayoutManager.findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1) > 0) {
            this.chatAdapter.getItemCount();
            if (findFirstVisibleItemPosition > (z ? 4 : 1) || this.loading || this.endReached) {
                return;
            }
            loadMessages(false);
        }
    }

    public void moveScrollToLastMessage() {
        if (this.chatListView == null || this.messages.isEmpty()) {
            return;
        }
        this.chatLayoutManager.scrollToPositionWithOffset(this.filteredMessages.size() - 1, (-100000) - this.chatListView.getPaddingTop());
    }

    private void updateTextureViewPosition() {
        boolean z;
        int childCount = this.chatListView.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = this.chatListView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (this.roundVideoContainer != null && messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    ImageReceiver photoImage = chatMessageCell.getPhotoImage();
                    this.roundVideoContainer.setTranslationX(photoImage.getImageX());
                    this.roundVideoContainer.setTranslationY(this.fragmentView.getPaddingTop() + chatMessageCell.getTop() + photoImage.getImageY());
                    this.fragmentView.invalidate();
                    this.roundVideoContainer.invalidate();
                    z = true;
                    break;
                }
            }
            i++;
        }
        if (this.roundVideoContainer != null) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (!z) {
                this.roundVideoContainer.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                if (playingMessageObject == null || !playingMessageObject.isRoundVideo()) {
                    return;
                }
                if (this.checkTextureViewPosition || PipRoundVideoView.getInstance() != null) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                    return;
                }
                return;
            }
            MediaController.getInstance().setCurrentVideoVisible(true);
        }
    }

    public void updateMessagesVisiblePart() {
        boolean z;
        MessageObject messageObject;
        RecyclerListView recyclerListView = this.chatListView;
        if (recyclerListView == null) {
            return;
        }
        int childCount = recyclerListView.getChildCount();
        int measuredHeight = this.chatListView.getMeasuredHeight();
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        boolean z2 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.chatListView.getChildAt(i3);
            if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                int top = chatMessageCell.getTop();
                chatMessageCell.getBottom();
                int i4 = top >= 0 ? 0 : -top;
                int measuredHeight2 = chatMessageCell.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i4 + measuredHeight;
                }
                chatMessageCell.setVisiblePart(i4, measuredHeight2 - i4, (this.contentView.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.chatListView.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.contentView.getBackgroundTranslationY(), this.contentView.getMeasuredWidth(), this.contentView.getBackgroundSizeY(), 0, 0);
                MessageObject messageObject2 = chatMessageCell.getMessageObject();
                if (this.roundVideoContainer != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = chatMessageCell.getPhotoImage();
                    this.roundVideoContainer.setTranslationX(photoImage.getImageX());
                    this.roundVideoContainer.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.getImageY());
                    this.fragmentView.invalidate();
                    this.roundVideoContainer.invalidate();
                    z2 = true;
                }
            } else if (childAt instanceof ChatActionCell) {
                ChatActionCell chatActionCell = (ChatActionCell) childAt;
                chatActionCell.setVisiblePart((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.contentView.getBackgroundTranslationY(), this.contentView.getBackgroundSizeY());
                if (chatActionCell.hasGradientService()) {
                    chatActionCell.invalidate();
                }
            }
            if (childAt.getBottom() > this.chatListView.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i) {
                    if ((childAt instanceof ChatMessageCell) || (childAt instanceof ChatActionCell)) {
                        view = childAt;
                    }
                    i = bottom;
                    view3 = childAt;
                }
                ChatListItemAnimator chatListItemAnimator = this.chatListItemAnimator;
                if ((chatListItemAnimator == null || (!chatListItemAnimator.willRemoved(childAt) && !this.chatListItemAnimator.willAddedFromAlpha(childAt))) && (childAt instanceof ChatActionCell) && ((ChatActionCell) childAt).getMessageObject().isDateObject) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i2) {
                        i2 = bottom;
                        view2 = childAt;
                    }
                }
            }
        }
        FrameLayout frameLayout = this.roundVideoContainer;
        if (frameLayout != null) {
            if (!z2) {
                frameLayout.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.checkTextureViewPosition) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            } else {
                MediaController.getInstance().setCurrentVideoVisible(true);
            }
        }
        if (view != null) {
            if (view instanceof ChatMessageCell) {
                messageObject = ((ChatMessageCell) view).getMessageObject();
            } else {
                messageObject = ((ChatActionCell) view).getMessageObject();
            }
            z = false;
            this.floatingDateView.setCustomDate(messageObject.messageOwner.date, false, true);
        } else {
            z = false;
        }
        this.currentFloatingDateOnScreen = z;
        this.currentFloatingTopIsNotMessage = ((view3 instanceof ChatMessageCell) || (view3 instanceof ChatActionCell)) ? false : true;
        if (view2 != null) {
            if (view2.getTop() > this.chatListView.getPaddingTop() || this.currentFloatingTopIsNotMessage) {
                if (view2.getAlpha() != 1.0f) {
                    view2.setAlpha(1.0f);
                }
                hideFloatingDateView(!this.currentFloatingTopIsNotMessage);
            } else {
                if (view2.getAlpha() != 0.0f) {
                    view2.setAlpha(0.0f);
                }
                AnimatorSet animatorSet = this.floatingDateAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.floatingDateAnimation = null;
                }
                if (this.floatingDateView.getTag() == null) {
                    this.floatingDateView.setTag(1);
                }
                if (this.floatingDateView.getAlpha() != 1.0f) {
                    this.floatingDateView.setAlpha(1.0f);
                }
                this.currentFloatingDateOnScreen = true;
            }
            int bottom2 = view2.getBottom() - this.chatListView.getPaddingTop();
            if (bottom2 > this.floatingDateView.getMeasuredHeight() && bottom2 < this.floatingDateView.getMeasuredHeight() * 2) {
                this.floatingDateView.setTranslationY(((-r1.getMeasuredHeight()) * 2) + bottom2);
                return;
            } else {
                this.floatingDateView.setTranslationY(0.0f);
                return;
            }
        }
        hideFloatingDateView(true);
        this.floatingDateView.setTranslationY(0.0f);
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        if (z) {
            this.notificationsLocker.lock();
            this.openAnimationEnded = false;
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.notificationsLocker.unlock();
            this.openAnimationEnded = true;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.activityResumeTime = System.currentTimeMillis();
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.contentView;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.onResume();
        }
        this.paused = false;
        checkScrollForLoad(false);
        if (this.wasPaused) {
            this.wasPaused = false;
            ChatActivityAdapter chatActivityAdapter = this.chatAdapter;
            if (chatActivityAdapter != null) {
                chatActivityAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.contentView;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.onPause();
        }
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
        this.paused = true;
        this.wasPaused = true;
        if (AvatarPreviewer.hasVisibleInstance()) {
            AvatarPreviewer.getInstance().close();
        }
    }

    @Override
    public void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    public void openVCard(TLRPC$User tLRPC$User, String str, String str2, String str3) {
        try {
            File sharingDirectory = AndroidUtilities.getSharingDirectory();
            sharingDirectory.mkdirs();
            File file = new File(sharingDirectory, "vcard.vcf");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(str);
            bufferedWriter.close();
            showDialog(new PhonebookShareAlert(this, null, tLRPC$User, null, file, str2, str3));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    public void alertUserOpenError(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
        if (messageObject.type == 3) {
            builder.setMessage(LocaleController.getString("NoPlayerInstalled", R.string.NoPlayerInstalled));
        } else {
            builder.setMessage(LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type));
        }
        showDialog(builder.create());
    }

    public void addCanBanUser(Bundle bundle, long j) {
        TLRPC$Chat tLRPC$Chat = this.currentChat;
        if (tLRPC$Chat.megagroup && this.admins != null && ChatObject.canBlockUsers(tLRPC$Chat)) {
            int i = 0;
            while (true) {
                if (i >= this.admins.size()) {
                    break;
                }
                TLRPC$ChannelParticipant tLRPC$ChannelParticipant = this.admins.get(i);
                if (MessageObject.getPeerId(tLRPC$ChannelParticipant.peer) != j) {
                    i++;
                } else if (!tLRPC$ChannelParticipant.can_edit) {
                    return;
                }
            }
            bundle.putLong("ban_chat_id", this.currentChat.id);
        }
    }

    public void showOpenUrlAlert(final String str, boolean z) {
        if (Browser.isInternalUrl(str, null) || !z) {
            Browser.openUrl((Context) getParentActivity(), str, true);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("OpenUrlTitle", R.string.OpenUrlTitle));
        builder.setMessage(LocaleController.formatString("OpenUrlAlert2", R.string.OpenUrlAlert2, str));
        builder.setPositiveButton(LocaleController.getString("Open", R.string.Open), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChannelAdminLogActivity.this.lambda$showOpenUrlAlert$24(str, dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void lambda$showOpenUrlAlert$24(String str, DialogInterface dialogInterface, int i) {
        Browser.openUrl((Context) getParentActivity(), str, true);
    }

    public class ChatActivityAdapter extends RecyclerView.Adapter {
        private int loadingUpRow;
        private Context mContext;
        private int messagesEndRow;
        private int messagesStartRow;
        private int rowCount;

        public ChatActivityAdapter(Context context) {
            new ArrayList();
            new ArrayList();
            this.mContext = context;
            setHasStableIds(true);
        }

        public void updateRows() {
            updateRows(true);
        }

        public void updateRows(boolean z) {
            this.rowCount = 0;
            if (!ChannelAdminLogActivity.this.filteredMessages.isEmpty()) {
                if (!ChannelAdminLogActivity.this.endReached) {
                    int i = this.rowCount;
                    this.rowCount = i + 1;
                    this.loadingUpRow = i;
                } else {
                    this.loadingUpRow = -1;
                }
                int i2 = this.rowCount;
                this.messagesStartRow = i2;
                int size = i2 + ChannelAdminLogActivity.this.filteredMessages.size();
                this.rowCount = size;
                this.messagesEndRow = size;
                return;
            }
            this.loadingUpRow = -1;
            this.messagesStartRow = -1;
            this.messagesEndRow = -1;
        }

        @Override
        public int getItemCount() {
            return this.rowCount;
        }

        @Override
        public long getItemId(int i) {
            if (i < this.messagesStartRow || i >= this.messagesEndRow) {
                return i == this.loadingUpRow ? 2L : 5L;
            }
            return ((MessageObject) ChannelAdminLogActivity.this.filteredMessages.get((ChannelAdminLogActivity.this.filteredMessages.size() - (i - this.messagesStartRow)) - 1)).stableId;
        }

        public MessageObject getMessageObject(int i) {
            if (i < this.messagesStartRow || i >= this.messagesEndRow) {
                return null;
            }
            return (MessageObject) ChannelAdminLogActivity.this.filteredMessages.get((ChannelAdminLogActivity.this.filteredMessages.size() - (i - this.messagesStartRow)) - 1);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2;
            ViewGroup viewGroup3;
            if (i == 0) {
                if (!ChannelAdminLogActivity.this.chatMessageCellsCache.isEmpty()) {
                    ?? r4 = (View) ChannelAdminLogActivity.this.chatMessageCellsCache.get(0);
                    ChannelAdminLogActivity.this.chatMessageCellsCache.remove(0);
                    viewGroup3 = r4;
                } else {
                    viewGroup3 = new ChatMessageCell(this.mContext, ((BaseFragment) ChannelAdminLogActivity.this).currentAccount);
                }
                ChatMessageCell chatMessageCell = (ChatMessageCell) viewGroup3;
                chatMessageCell.setDelegate(new AnonymousClass1());
                chatMessageCell.setAllowAssistant(true);
                viewGroup2 = viewGroup3;
            } else if (i == 1) {
                ?? r42 = new ChatActionCell(this, this.mContext) {
                    @Override
                    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                        accessibilityNodeInfo.setVisibleToUser(true);
                    }
                };
                r42.setDelegate(new AnonymousClass3());
                viewGroup2 = r42;
            } else if (i == 2) {
                viewGroup2 = new ChatUnreadCell(this.mContext, null);
            } else {
                viewGroup2 = new ChatLoadingCell(this.mContext, ChannelAdminLogActivity.this.contentView, null);
            }
            viewGroup2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(viewGroup2);
        }

        public class AnonymousClass1 implements ChatMessageCell.ChatMessageCellDelegate {
            @Override
            public boolean canDrawOutboundsContent() {
                return true;
            }

            @Override
            public boolean canPerformActions() {
                return true;
            }

            @Override
            public void didLongPressBotButton(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell, tLRPC$KeyboardButton);
            }

            @Override
            public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i, float f, float f2) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell, tLRPC$Chat, i, f, f2);
            }

            @Override
            public void didPressAboutRevenueSharingAds() {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAboutRevenueSharingAds(this);
            }

            @Override
            public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell, animatedEmojiSpan);
            }

            @Override
            public void didPressBoostCounter(ChatMessageCell chatMessageCell) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBoostCounter(this, chatMessageCell);
            }

            @Override
            public void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell, tLRPC$Chat, z);
            }

            @Override
            public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell);
            }

            @Override
            public void didPressCodeCopy(ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCodeCopy(this, chatMessageCell, textLayoutBlock);
            }

            @Override
            public void didPressCommentButton(ChatMessageCell chatMessageCell) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell);
            }

            @Override
            public void didPressDialogButton(ChatMessageCell chatMessageCell) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressDialogButton(this, chatMessageCell);
            }

            @Override
            public void didPressEffect(ChatMessageCell chatMessageCell) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressEffect(this, chatMessageCell);
            }

            @Override
            public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell, tLRPC$KeyboardButton);
            }

            @Override
            public void didPressFactCheck(ChatMessageCell chatMessageCell) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheck(this, chatMessageCell);
            }

            @Override
            public void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i, int i2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheckWhat(this, chatMessageCell, i, i2);
            }

            @Override
            public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell, int i) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGiveawayChatButton(this, chatMessageCell, i);
            }

            @Override
            public void didPressGroupImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGroupImage(this, chatMessageCell, imageReceiver, tLRPC$MessageExtendedMedia, f, f2);
            }

            @Override
            public void didPressHiddenForward(ChatMessageCell chatMessageCell) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell);
            }

            @Override
            public void didPressHint(ChatMessageCell chatMessageCell, int i) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell, i);
            }

            @Override
            public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell);
            }

            @Override
            public void didPressReaction(ChatMessageCell chatMessageCell, TLRPC$ReactionCount tLRPC$ReactionCount, boolean z, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell, tLRPC$ReactionCount, z, f, f2);
            }

            @Override
            public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRevealSensitiveContent(this, chatMessageCell);
            }

            @Override
            public void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredClose(this, chatMessageCell);
            }

            @Override
            public void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredInfo(this, chatMessageCell, f, f2);
            }

            @Override
            public void didPressTime(ChatMessageCell chatMessageCell) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell);
            }

            @Override
            public void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, TLRPC$Document tLRPC$Document) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserStatus(this, chatMessageCell, tLRPC$User, tLRPC$Document);
            }

            @Override
            public void didPressViaBot(ChatMessageCell chatMessageCell, String str) {
            }

            @Override
            public void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell, j);
            }

            @Override
            public void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell, arrayList, i, i2, i3);
            }

            @Override
            public void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC$WebPage tLRPC$WebPage, String str, boolean z) {
                Browser.openUrl(chatMessageCell.getContext(), str);
            }

            @Override
            public void didStartVideoStream(MessageObject messageObject) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject);
            }

            @Override
            public boolean doNotShowLoadingReply(MessageObject messageObject) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$doNotShowLoadingReply(this, messageObject);
            }

            @Override
            public void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdate(this, chatMessageCell, z);
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
            public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell);
            }

            @Override
            public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingLink(this, chatMessageCell);
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
            public boolean isProgressLoading(ChatMessageCell chatMessageCell, int i) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isProgressLoading(this, chatMessageCell, i);
            }

            @Override
            public boolean isReplyOrSelf() {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isReplyOrSelf(this);
            }

            @Override
            public boolean keyboardIsOpened() {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$keyboardIsOpened(this);
            }

            @Override
            public void needReloadPolls() {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
            }

            @Override
            public void needShowPremiumBulletin(int i) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$needShowPremiumBulletin(this, i);
            }

            @Override
            public boolean onAccessibilityAction(int i, Bundle bundle) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$onAccessibilityAction(this, i, bundle);
            }

            @Override
            public void onDiceFinished() {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$onDiceFinished(this);
            }

            @Override
            public void setShouldNotRepeatSticker(MessageObject messageObject) {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject);
            }

            @Override
            public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell, z);
            }

            @Override
            public boolean shouldRepeatSticker(MessageObject messageObject) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject);
            }

            @Override
            public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell) {
                return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldShowDialogButton(this, chatMessageCell);
            }

            @Override
            public void videoTimerReached() {
                ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
            }

            AnonymousClass1() {
            }

            @Override
            public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell) {
                TLRPC$TL_channelAdminLogEvent tLRPC$TL_channelAdminLogEvent;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (messageObject == null || (tLRPC$TL_channelAdminLogEvent = messageObject.currentEvent) == null) {
                    return false;
                }
                TLRPC$ChannelAdminLogEventAction tLRPC$ChannelAdminLogEventAction = tLRPC$TL_channelAdminLogEvent.action;
                if ((tLRPC$ChannelAdminLogEventAction instanceof TLRPC$TL_channelAdminLogEventActionEditMessage) || (tLRPC$ChannelAdminLogEventAction instanceof TLRPC$TL_channelAdminLogEventActionDeleteMessage)) {
                    return ChatObject.isForum(ChannelAdminLogActivity.this.currentChat);
                }
                return false;
            }

            @Override
            public void didPressTopicButton(ChatMessageCell chatMessageCell) {
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (messageObject != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -messageObject.getDialogId());
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(((BaseFragment) ChannelAdminLogActivity.this).currentAccount, messageObject.messageOwner, true)));
                    ChannelAdminLogActivity.this.presentFragment(chatActivity);
                }
            }

            @Override
            public void didPressSideButton(ChatMessageCell chatMessageCell) {
                if (ChannelAdminLogActivity.this.getParentActivity() == null) {
                    return;
                }
                ChatActivityAdapter chatActivityAdapter = ChatActivityAdapter.this;
                ChannelAdminLogActivity.this.showDialog(ShareAlert.createShareAlert(chatActivityAdapter.mContext, chatMessageCell.getMessageObject(), null, ChatObject.isChannel(ChannelAdminLogActivity.this.currentChat) && !ChannelAdminLogActivity.this.currentChat.megagroup, null, false));
            }

            @Override
            public boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject, boolean z) {
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean playMessage = MediaController.getInstance().playMessage(messageObject, z);
                    MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
                    return playMessage;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(ChannelAdminLogActivity.this.filteredMessages, messageObject, 0L);
                }
                return false;
            }

            @Override
            public void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i, float f, float f2, boolean z) {
                if (tLRPC$Chat == null || tLRPC$Chat == ChannelAdminLogActivity.this.currentChat) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tLRPC$Chat.id);
                if (i != 0) {
                    bundle.putInt("message_id", i);
                }
                if (MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).checkCanOpenChat(bundle, ChannelAdminLogActivity.this)) {
                    ChannelAdminLogActivity.this.presentFragment(new ChatActivity(bundle), true);
                }
            }

            @Override
            public void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                ChannelAdminLogActivity.this.createMenu(chatMessageCell);
            }

            @Override
            public void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2, boolean z) {
                if (tLRPC$User == null || tLRPC$User.id == UserConfig.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).getClientUserId()) {
                    return;
                }
                openProfile(tLRPC$User);
            }

            @Override
            public boolean didLongPressUserAvatar(final ChatMessageCell chatMessageCell, final TLRPC$User tLRPC$User, float f, float f2) {
                AvatarPreviewer.Data of;
                if (tLRPC$User != null && tLRPC$User.id != UserConfig.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).getClientUserId()) {
                    AvatarPreviewer.MenuItem[] menuItemArr = {AvatarPreviewer.MenuItem.OPEN_PROFILE, AvatarPreviewer.MenuItem.SEND_MESSAGE};
                    TLRPC$UserFull userFull = ChannelAdminLogActivity.this.getMessagesController().getUserFull(tLRPC$User.id);
                    if (userFull == null) {
                        of = AvatarPreviewer.Data.of(tLRPC$User, ((BaseFragment) ChannelAdminLogActivity.this).classGuid, menuItemArr);
                    } else {
                        of = AvatarPreviewer.Data.of(tLRPC$User, userFull, menuItemArr);
                    }
                    if (AvatarPreviewer.canPreview(of)) {
                        AvatarPreviewer avatarPreviewer = AvatarPreviewer.getInstance();
                        ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                        avatarPreviewer.show((ViewGroup) channelAdminLogActivity.fragmentView, channelAdminLogActivity.getResourceProvider(), of, new AvatarPreviewer.Callback() {
                            @Override
                            public final void onMenuClick(AvatarPreviewer.MenuItem menuItem) {
                                ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass1.this.lambda$didLongPressUserAvatar$0(chatMessageCell, tLRPC$User, menuItem);
                            }
                        });
                        return true;
                    }
                }
                return false;
            }

            public void lambda$didLongPressUserAvatar$0(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, AvatarPreviewer.MenuItem menuItem) {
                int i = AnonymousClass24.$SwitchMap$org$telegram$ui$AvatarPreviewer$MenuItem[menuItem.ordinal()];
                if (i == 1) {
                    openDialog(chatMessageCell, tLRPC$User);
                } else {
                    if (i != 2) {
                        return;
                    }
                    openProfile(tLRPC$User);
                }
            }

            private void openProfile(TLRPC$User tLRPC$User) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tLRPC$User.id);
                ChannelAdminLogActivity.this.addCanBanUser(bundle, tLRPC$User.id);
                ProfileActivity profileActivity = new ProfileActivity(bundle);
                profileActivity.setPlayProfileAnimation(0);
                ChannelAdminLogActivity.this.presentFragment(profileActivity);
            }

            private void openDialog(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User) {
                if (tLRPC$User != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", tLRPC$User.id);
                    if (ChannelAdminLogActivity.this.getMessagesController().checkCanOpenChat(bundle, ChannelAdminLogActivity.this)) {
                        ChannelAdminLogActivity.this.presentFragment(new ChatActivity(bundle));
                    }
                }
            }

            @Override
            public void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                ChannelAdminLogActivity.this.createMenu(chatMessageCell);
            }

            @Override
            public void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
                TLRPC$WebPage tLRPC$WebPage;
                if (characterStyle == null) {
                    return;
                }
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (characterStyle instanceof URLSpanMono) {
                    ((URLSpanMono) characterStyle).copyToClipboard();
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(ChannelAdminLogActivity.this.getParentActivity(), LocaleController.getString("TextCopied", R.string.TextCopied), 0).show();
                        return;
                    }
                    return;
                }
                if (characterStyle instanceof URLSpanUserMention) {
                    long longValue = Utilities.parseLong(((URLSpanUserMention) characterStyle).getURL()).longValue();
                    if (longValue > 0) {
                        TLRPC$User user = MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).getUser(Long.valueOf(longValue));
                        if (user != null) {
                            MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).openChatOrProfileWith(user, null, ChannelAdminLogActivity.this, 0, false);
                            return;
                        }
                        return;
                    }
                    TLRPC$Chat chat = MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).getChat(Long.valueOf(-longValue));
                    if (chat != null) {
                        MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).openChatOrProfileWith(null, chat, ChannelAdminLogActivity.this, 0, false);
                        return;
                    }
                    return;
                }
                if (characterStyle instanceof URLSpanNoUnderline) {
                    String url = ((URLSpanNoUnderline) characterStyle).getURL();
                    if (url.startsWith("@")) {
                        MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).openByUserName(url.substring(1), ChannelAdminLogActivity.this, 0);
                        return;
                    } else {
                        if (url.startsWith("#")) {
                            DialogsActivity dialogsActivity = new DialogsActivity(null);
                            dialogsActivity.setSearchString(url);
                            ChannelAdminLogActivity.this.presentFragment(dialogsActivity);
                            return;
                        }
                        return;
                    }
                }
                final String url2 = ((URLSpan) characterStyle).getURL();
                if (z) {
                    BottomSheet.Builder builder = new BottomSheet.Builder(ChannelAdminLogActivity.this.getParentActivity());
                    builder.setTitle(url2);
                    builder.setItems(new CharSequence[]{LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)}, new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass1.this.lambda$didPressUrl$1(url2, dialogInterface, i);
                        }
                    });
                    ChannelAdminLogActivity.this.showDialog(builder.create());
                    return;
                }
                if (characterStyle instanceof URLSpanReplacement) {
                    ChannelAdminLogActivity.this.showOpenUrlAlert(((URLSpanReplacement) characterStyle).getURL(), true);
                    return;
                }
                TLRPC$MessageMedia tLRPC$MessageMedia = messageObject.messageOwner.media;
                if ((tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaWebPage) && (tLRPC$WebPage = tLRPC$MessageMedia.webpage) != null && tLRPC$WebPage.cached_page != null) {
                    String lowerCase = url2.toLowerCase();
                    String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
                    if ((Browser.isTelegraphUrl(lowerCase, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                        LaunchActivity launchActivity = LaunchActivity.instance;
                        if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject) == null) {
                            ChannelAdminLogActivity.this.createArticleViewer(false).open(messageObject);
                            return;
                        }
                        return;
                    }
                }
                Browser.openUrl((Context) ChannelAdminLogActivity.this.getParentActivity(), url2, true);
            }

            public void lambda$didPressUrl$1(String str, DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    Browser.openUrl((Context) ChannelAdminLogActivity.this.getParentActivity(), str, true);
                    return;
                }
                if (i == 1) {
                    if (str.startsWith("mailto:")) {
                        str = str.substring(7);
                    } else if (str.startsWith("tel:")) {
                        str = str.substring(4);
                    }
                    AndroidUtilities.addToClipboard(str);
                }
            }

            @Override
            public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2) {
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                EmbedBottomSheet.show(channelAdminLogActivity, messageObject, channelAdminLogActivity.provider, str2, str3, str4, str, i, i2, false);
            }

            @Override
            public void didPressReplyMessage(ChatMessageCell chatMessageCell, int i) {
                MessageObject messageObject = chatMessageCell.getMessageObject().replyMessageObject;
                if (messageObject.getDialogId() == (-ChannelAdminLogActivity.this.currentChat.id)) {
                    for (int i2 = 0; i2 < ChannelAdminLogActivity.this.filteredMessages.size(); i2++) {
                        MessageObject messageObject2 = (MessageObject) ChannelAdminLogActivity.this.filteredMessages.get(i2);
                        if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                            ChannelAdminLogActivity.this.scrollToMessage(messageObject2, true);
                            return;
                        }
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ChannelAdminLogActivity.this.currentChat.id);
                bundle.putInt("message_id", messageObject.getRealId());
                ChannelAdminLogActivity.this.presentFragment(new ChatActivity(bundle));
            }

            @Override
            public void didPressImage(org.telegram.ui.Cells.ChatMessageCell r11, float r12, float r13) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass1.didPressImage(org.telegram.ui.Cells.ChatMessageCell, float, float):void");
            }

            @Override
            public void didPressInstantButton(ChatMessageCell chatMessageCell, int i) {
                TLRPC$WebPage tLRPC$WebPage;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                TLRPC$TL_channelAdminLogEvent tLRPC$TL_channelAdminLogEvent = messageObject.currentEvent;
                if (tLRPC$TL_channelAdminLogEvent != null && (tLRPC$TL_channelAdminLogEvent.action instanceof TLRPC$TL_channelAdminLogEventActionEditMessage)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -messageObject.getDialogId());
                    bundle.putInt("message_id", messageObject.getRealId());
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    if (ChatObject.isForum(ChannelAdminLogActivity.this.currentChat)) {
                        ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(((BaseFragment) ChannelAdminLogActivity.this).currentAccount, messageObject.messageOwner, true)));
                    }
                    ChannelAdminLogActivity.this.presentFragment(chatActivity);
                    return;
                }
                if (i == 0) {
                    TLRPC$MessageMedia tLRPC$MessageMedia = messageObject.messageOwner.media;
                    if (tLRPC$MessageMedia == null || (tLRPC$WebPage = tLRPC$MessageMedia.webpage) == null || tLRPC$WebPage.cached_page == null) {
                        return;
                    }
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject) == null) {
                        ChannelAdminLogActivity.this.createArticleViewer(false).open(messageObject);
                        return;
                    }
                    return;
                }
                if (i == 5) {
                    ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                    TLRPC$User user = channelAdminLogActivity.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                    TLRPC$MessageMedia tLRPC$MessageMedia2 = messageObject.messageOwner.media;
                    channelAdminLogActivity.openVCard(user, tLRPC$MessageMedia2.vcard, tLRPC$MessageMedia2.first_name, tLRPC$MessageMedia2.last_name);
                    return;
                }
                TLRPC$MessageMedia tLRPC$MessageMedia3 = messageObject.messageOwner.media;
                if (tLRPC$MessageMedia3 == null || tLRPC$MessageMedia3.webpage == null) {
                    return;
                }
                Browser.openUrl(ChannelAdminLogActivity.this.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }

            @Override
            public void didPressBotButton(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (ChannelAdminLogActivity.this.expandedEvents.contains(Long.valueOf(messageObject.eventId))) {
                    ChannelAdminLogActivity.this.expandedEvents.remove(Long.valueOf(messageObject.eventId));
                } else {
                    ChannelAdminLogActivity.this.expandedEvents.add(Long.valueOf(messageObject.eventId));
                }
                ChannelAdminLogActivity.this.saveScrollPosition(true);
                ChannelAdminLogActivity.this.filterDeletedMessages();
                ChannelAdminLogActivity.this.chatAdapter.notifyDataSetChanged();
            }
        }

        public class AnonymousClass3 implements ChatActionCell.ChatActionCellDelegate {
            @Override
            public boolean canDrawOutboundsContent() {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$canDrawOutboundsContent(this);
            }

            @Override
            public void didClickButton(ChatActionCell chatActionCell) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didClickButton(this, chatActionCell);
            }

            @Override
            public void didOpenPremiumGift(ChatActionCell chatActionCell, TLRPC$TL_premiumGiftOption tLRPC$TL_premiumGiftOption, String str, boolean z) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didOpenPremiumGift(this, chatActionCell, tLRPC$TL_premiumGiftOption, str, z);
            }

            @Override
            public void didOpenPremiumGiftChannel(ChatActionCell chatActionCell, String str, boolean z) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$didOpenPremiumGiftChannel(this, chatActionCell, str, z);
            }

            @Override
            public void didPressReplyMessage(ChatActionCell chatActionCell, int i) {
            }

            @Override
            public long getTopicId() {
                return ChatActionCell.ChatActionCellDelegate.CC.$default$getTopicId(this);
            }

            @Override
            public void needShowEffectOverlay(ChatActionCell chatActionCell, TLRPC$Document tLRPC$Document, TLRPC$VideoSize tLRPC$VideoSize) {
                ChatActionCell.ChatActionCellDelegate.CC.$default$needShowEffectOverlay(this, chatActionCell, tLRPC$Document, tLRPC$VideoSize);
            }

            AnonymousClass3() {
            }

            @Override
            public void didClickImage(ChatActionCell chatActionCell) {
                MessageObject messageObject = chatActionCell.getMessageObject();
                if (messageObject.type == 22) {
                    ChannelAdminLogActivity.this.presentFragment(new ChannelColorActivity(getDialogId()).setOnApplied(ChannelAdminLogActivity.this));
                    return;
                }
                PhotoViewer.getInstance().setParentActivity(ChannelAdminLogActivity.this);
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
                if (closestPhotoSizeWithSize == null) {
                    PhotoViewer.getInstance().openPhoto(messageObject, (ChatActivity) null, 0L, 0L, 0L, ChannelAdminLogActivity.this.provider);
                } else {
                    PhotoViewer.getInstance().openPhoto(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), ChannelAdminLogActivity.this.provider);
                }
            }

            @Override
            public boolean didLongPress(ChatActionCell chatActionCell, float f, float f2) {
                return ChannelAdminLogActivity.this.createMenu(chatActionCell);
            }

            @Override
            public void needOpenUserProfile(long j) {
                if (j < 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -j);
                    if (MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).checkCanOpenChat(bundle, ChannelAdminLogActivity.this)) {
                        ChannelAdminLogActivity.this.presentFragment(new ChatActivity(bundle), true);
                        return;
                    }
                    return;
                }
                if (j != UserConfig.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).getClientUserId()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", j);
                    ChannelAdminLogActivity.this.addCanBanUser(bundle2, j);
                    ProfileActivity profileActivity = new ProfileActivity(bundle2);
                    profileActivity.setPlayProfileAnimation(0);
                    ChannelAdminLogActivity.this.presentFragment(profileActivity);
                }
            }

            @Override
            public void needOpenInviteLink(final TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported) {
                if (ChannelAdminLogActivity.this.linviteLoading) {
                    return;
                }
                Object obj = ChannelAdminLogActivity.this.invitesCache.containsKey(tLRPC$TL_chatInviteExported.link) ? ChannelAdminLogActivity.this.invitesCache.get(tLRPC$TL_chatInviteExported.link) : null;
                if (obj == null) {
                    TLRPC$TL_messages_getExportedChatInvite tLRPC$TL_messages_getExportedChatInvite = new TLRPC$TL_messages_getExportedChatInvite();
                    tLRPC$TL_messages_getExportedChatInvite.peer = ChannelAdminLogActivity.this.getMessagesController().getInputPeer(-ChannelAdminLogActivity.this.currentChat.id);
                    tLRPC$TL_messages_getExportedChatInvite.link = tLRPC$TL_chatInviteExported.link;
                    ChannelAdminLogActivity.this.linviteLoading = true;
                    final boolean[] zArr = new boolean[1];
                    final AlertDialog alertDialog = new AlertDialog(ChannelAdminLogActivity.this.getParentActivity(), 3);
                    alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass3.this.lambda$needOpenInviteLink$0(zArr, dialogInterface);
                        }
                    });
                    alertDialog.showDelayed(300L);
                    ChannelAdminLogActivity.this.getConnectionsManager().bindRequestToGuid(ChannelAdminLogActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_messages_getExportedChatInvite, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass3.this.lambda$needOpenInviteLink$2(tLRPC$TL_chatInviteExported, zArr, alertDialog, tLObject, tLRPC$TL_error);
                        }
                    }), ((BaseFragment) ChannelAdminLogActivity.this).classGuid);
                    return;
                }
                if (obj instanceof TLRPC$TL_messages_exportedChatInvite) {
                    ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                    channelAdminLogActivity.showInviteLinkBottomSheet((TLRPC$TL_messages_exportedChatInvite) obj, channelAdminLogActivity.usersMap);
                } else {
                    BulletinFactory.of(ChannelAdminLogActivity.this).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString("LinkHashExpired", R.string.LinkHashExpired)).show();
                }
            }

            public void lambda$needOpenInviteLink$0(boolean[] zArr, DialogInterface dialogInterface) {
                ChannelAdminLogActivity.this.linviteLoading = false;
                zArr[0] = true;
            }

            public void lambda$needOpenInviteLink$2(final TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported, final boolean[] zArr, final AlertDialog alertDialog, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                TLRPC$TL_messages_exportedChatInvite tLRPC$TL_messages_exportedChatInvite;
                if (tLRPC$TL_error == null) {
                    tLRPC$TL_messages_exportedChatInvite = (TLRPC$TL_messages_exportedChatInvite) tLObject;
                    for (int i = 0; i < tLRPC$TL_messages_exportedChatInvite.users.size(); i++) {
                        TLRPC$User tLRPC$User = tLRPC$TL_messages_exportedChatInvite.users.get(i);
                        if (ChannelAdminLogActivity.this.usersMap == null) {
                            ChannelAdminLogActivity.this.usersMap = new HashMap();
                        }
                        ChannelAdminLogActivity.this.usersMap.put(Long.valueOf(tLRPC$User.id), tLRPC$User);
                    }
                } else {
                    tLRPC$TL_messages_exportedChatInvite = null;
                }
                final TLRPC$TL_messages_exportedChatInvite tLRPC$TL_messages_exportedChatInvite2 = tLRPC$TL_messages_exportedChatInvite;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass3.this.lambda$needOpenInviteLink$1(tLRPC$TL_chatInviteExported, tLRPC$TL_messages_exportedChatInvite2, zArr, alertDialog);
                    }
                });
            }

            public void lambda$needOpenInviteLink$1(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported, TLRPC$TL_messages_exportedChatInvite tLRPC$TL_messages_exportedChatInvite, boolean[] zArr, AlertDialog alertDialog) {
                ChannelAdminLogActivity.this.linviteLoading = false;
                ChannelAdminLogActivity.this.invitesCache.put(tLRPC$TL_chatInviteExported.link, tLRPC$TL_messages_exportedChatInvite == null ? 0 : tLRPC$TL_messages_exportedChatInvite);
                if (zArr[0]) {
                    return;
                }
                alertDialog.dismiss();
                if (tLRPC$TL_messages_exportedChatInvite != null) {
                    ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                    channelAdminLogActivity.showInviteLinkBottomSheet(tLRPC$TL_messages_exportedChatInvite, channelAdminLogActivity.usersMap);
                } else {
                    BulletinFactory.of(ChannelAdminLogActivity.this).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString("LinkHashExpired", R.string.LinkHashExpired)).show();
                }
            }

            @Override
            public BaseFragment getBaseFragment() {
                return ChannelAdminLogActivity.this;
            }

            @Override
            public long getDialogId() {
                return -ChannelAdminLogActivity.this.currentChat.id;
            }
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r14, int r15) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChannelAdminLogActivity.ChatActivityAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override
        public int getItemViewType(int i) {
            if (i < this.messagesStartRow || i >= this.messagesEndRow) {
                return 4;
            }
            return ((MessageObject) ChannelAdminLogActivity.this.filteredMessages.get((ChannelAdminLogActivity.this.filteredMessages.size() - (i - this.messagesStartRow)) - 1)).contentType;
        }

        @Override
        public void onViewAttachedToWindow(final RecyclerView.ViewHolder viewHolder) {
            final View view = viewHolder.itemView;
            if ((view instanceof ChatMessageCell) || (view instanceof ChatActionCell)) {
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        int measuredHeight = ChannelAdminLogActivity.this.chatListView.getMeasuredHeight();
                        int top = view.getTop();
                        view.getBottom();
                        int i = top >= 0 ? 0 : -top;
                        int measuredHeight2 = view.getMeasuredHeight();
                        if (measuredHeight2 > measuredHeight) {
                            measuredHeight2 = i + measuredHeight;
                        }
                        View view2 = viewHolder.itemView;
                        if (view2 instanceof ChatMessageCell) {
                            ((ChatMessageCell) view).setVisiblePart(i, measuredHeight2 - i, (ChannelAdminLogActivity.this.contentView.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - ChannelAdminLogActivity.this.chatListView.getTop(), 0.0f, (view.getY() + ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight()) - ChannelAdminLogActivity.this.contentView.getBackgroundTranslationY(), ChannelAdminLogActivity.this.contentView.getMeasuredWidth(), ChannelAdminLogActivity.this.contentView.getBackgroundSizeY(), 0, 0);
                            return true;
                        }
                        if (!(view2 instanceof ChatActionCell) || ((BaseFragment) ChannelAdminLogActivity.this).actionBar == null || ChannelAdminLogActivity.this.contentView == null) {
                            return true;
                        }
                        View view3 = view;
                        ((ChatActionCell) view3).setVisiblePart((view3.getY() + ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight()) - ChannelAdminLogActivity.this.contentView.getBackgroundTranslationY(), ChannelAdminLogActivity.this.contentView.getBackgroundSizeY());
                        return true;
                    }
                });
            }
            View view2 = viewHolder.itemView;
            if (view2 instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) view2;
                chatMessageCell.getMessageObject();
                chatMessageCell.setBackgroundDrawable(null);
                chatMessageCell.setCheckPressed(true, false);
                chatMessageCell.setHighlighted(false);
            }
        }

        @Override
        public void notifyDataSetChanged() {
            updateRows();
            try {
                super.notifyDataSetChanged();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemChanged(int i) {
            updateRows(false);
            try {
                super.notifyItemChanged(i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemRangeChanged(int i, int i2) {
            updateRows(false);
            try {
                super.notifyItemRangeChanged(i, i2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemInserted(int i) {
            updateRows(false);
            try {
                super.notifyItemInserted(i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemMoved(int i, int i2) {
            updateRows(false);
            try {
                super.notifyItemMoved(i, i2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemRangeInserted(int i, int i2) {
            updateRows(false);
            try {
                super.notifyItemRangeInserted(i, i2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemRemoved(int i) {
            updateRows(false);
            try {
                super.notifyItemRemoved(i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemRangeRemoved(int i, int i2) {
            updateRows(false);
            try {
                super.notifyItemRangeRemoved(i, i2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static class AnonymousClass24 {
        static final int[] $SwitchMap$org$telegram$ui$AvatarPreviewer$MenuItem;

        static {
            int[] iArr = new int[AvatarPreviewer.MenuItem.values().length];
            $SwitchMap$org$telegram$ui$AvatarPreviewer$MenuItem = iArr;
            try {
                iArr[AvatarPreviewer.MenuItem.SEND_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$telegram$ui$AvatarPreviewer$MenuItem[AvatarPreviewer.MenuItem.OPEN_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void showInviteLinkBottomSheet(TLRPC$TL_messages_exportedChatInvite tLRPC$TL_messages_exportedChatInvite, HashMap<Long, TLRPC$User> hashMap) {
        TLRPC$ChatFull chatFull = getMessagesController().getChatFull(this.currentChat.id);
        InviteLinkBottomSheet inviteLinkBottomSheet = new InviteLinkBottomSheet(this.contentView.getContext(), (TLRPC$TL_chatInviteExported) tLRPC$TL_messages_exportedChatInvite.invite, chatFull, hashMap, this, chatFull.id, false, ChatObject.isChannel(this.currentChat));
        inviteLinkBottomSheet.setInviteDelegate(new InviteLinkBottomSheet.InviteDelegate() {
            @Override
            public void permanentLinkReplaced(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported, TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported2) {
            }

            @Override
            public void linkRevoked(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported) {
                TLRPC$TL_channelAdminLogEvent tLRPC$TL_channelAdminLogEvent = new TLRPC$TL_channelAdminLogEvent();
                int size = ChannelAdminLogActivity.this.filteredMessages.size();
                tLRPC$TL_chatInviteExported.revoked = true;
                TLRPC$TL_channelAdminLogEventActionExportedInviteRevoke tLRPC$TL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC$TL_channelAdminLogEventActionExportedInviteRevoke();
                tLRPC$TL_channelAdminLogEventActionExportedInviteRevoke.invite = tLRPC$TL_chatInviteExported;
                tLRPC$TL_channelAdminLogEvent.action = tLRPC$TL_channelAdminLogEventActionExportedInviteRevoke;
                tLRPC$TL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                tLRPC$TL_channelAdminLogEvent.user_id = ChannelAdminLogActivity.this.getAccountInstance().getUserConfig().clientUserId;
                int i = ((BaseFragment) ChannelAdminLogActivity.this).currentAccount;
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                ArrayList<MessageObject> arrayList = channelAdminLogActivity.messages;
                HashMap hashMap2 = channelAdminLogActivity.messagesByDays;
                ChannelAdminLogActivity channelAdminLogActivity2 = ChannelAdminLogActivity.this;
                if (new MessageObject(i, tLRPC$TL_channelAdminLogEvent, arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap2, channelAdminLogActivity2.currentChat, channelAdminLogActivity2.mid, true).contentType < 0) {
                    return;
                }
                ChannelAdminLogActivity.this.filterDeletedMessages();
                int size2 = ChannelAdminLogActivity.this.filteredMessages.size() - size;
                if (size2 > 0) {
                    ChannelAdminLogActivity.this.chatListItemAnimator.setShouldAnimateEnterFromBottom(true);
                    ChannelAdminLogActivity.this.chatAdapter.notifyItemRangeInserted(ChannelAdminLogActivity.this.chatAdapter.messagesEndRow, size2);
                    ChannelAdminLogActivity.this.moveScrollToLastMessage();
                }
                ChannelAdminLogActivity.this.invitesCache.remove(tLRPC$TL_chatInviteExported.link);
            }

            @Override
            public void onLinkDeleted(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported) {
                int size = ChannelAdminLogActivity.this.filteredMessages.size();
                int unused = ChannelAdminLogActivity.this.chatAdapter.messagesEndRow;
                TLRPC$TL_channelAdminLogEvent tLRPC$TL_channelAdminLogEvent = new TLRPC$TL_channelAdminLogEvent();
                TLRPC$TL_channelAdminLogEventActionExportedInviteDelete tLRPC$TL_channelAdminLogEventActionExportedInviteDelete = new TLRPC$TL_channelAdminLogEventActionExportedInviteDelete();
                tLRPC$TL_channelAdminLogEventActionExportedInviteDelete.invite = tLRPC$TL_chatInviteExported;
                tLRPC$TL_channelAdminLogEvent.action = tLRPC$TL_channelAdminLogEventActionExportedInviteDelete;
                tLRPC$TL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                tLRPC$TL_channelAdminLogEvent.user_id = ChannelAdminLogActivity.this.getAccountInstance().getUserConfig().clientUserId;
                int i = ((BaseFragment) ChannelAdminLogActivity.this).currentAccount;
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                ArrayList<MessageObject> arrayList = channelAdminLogActivity.messages;
                HashMap hashMap2 = channelAdminLogActivity.messagesByDays;
                ChannelAdminLogActivity channelAdminLogActivity2 = ChannelAdminLogActivity.this;
                if (new MessageObject(i, tLRPC$TL_channelAdminLogEvent, arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap2, channelAdminLogActivity2.currentChat, channelAdminLogActivity2.mid, true).contentType < 0) {
                    return;
                }
                ChannelAdminLogActivity.this.filterDeletedMessages();
                int size2 = ChannelAdminLogActivity.this.filteredMessages.size() - size;
                if (size2 > 0) {
                    ChannelAdminLogActivity.this.chatListItemAnimator.setShouldAnimateEnterFromBottom(true);
                    ChannelAdminLogActivity.this.chatAdapter.notifyItemRangeInserted(ChannelAdminLogActivity.this.chatAdapter.messagesEndRow, size2);
                    ChannelAdminLogActivity.this.moveScrollToLastMessage();
                }
                ChannelAdminLogActivity.this.invitesCache.remove(tLRPC$TL_chatInviteExported.link);
            }

            @Override
            public void onLinkEdited(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported) {
                TLRPC$TL_channelAdminLogEvent tLRPC$TL_channelAdminLogEvent = new TLRPC$TL_channelAdminLogEvent();
                TLRPC$TL_channelAdminLogEventActionExportedInviteEdit tLRPC$TL_channelAdminLogEventActionExportedInviteEdit = new TLRPC$TL_channelAdminLogEventActionExportedInviteEdit();
                tLRPC$TL_channelAdminLogEventActionExportedInviteEdit.new_invite = tLRPC$TL_chatInviteExported;
                tLRPC$TL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tLRPC$TL_chatInviteExported;
                tLRPC$TL_channelAdminLogEvent.action = tLRPC$TL_channelAdminLogEventActionExportedInviteEdit;
                tLRPC$TL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                tLRPC$TL_channelAdminLogEvent.user_id = ChannelAdminLogActivity.this.getAccountInstance().getUserConfig().clientUserId;
                int i = ((BaseFragment) ChannelAdminLogActivity.this).currentAccount;
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                ArrayList<MessageObject> arrayList = channelAdminLogActivity.messages;
                HashMap hashMap2 = channelAdminLogActivity.messagesByDays;
                ChannelAdminLogActivity channelAdminLogActivity2 = ChannelAdminLogActivity.this;
                if (new MessageObject(i, tLRPC$TL_channelAdminLogEvent, arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap2, channelAdminLogActivity2.currentChat, channelAdminLogActivity2.mid, true).contentType < 0) {
                    return;
                }
                ChannelAdminLogActivity.this.filterDeletedMessages();
                ChannelAdminLogActivity.this.chatAdapter.notifyDataSetChanged();
                ChannelAdminLogActivity.this.moveScrollToLastMessage();
            }
        });
        inviteLinkBottomSheet.show();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, 0, null, null, null, null, Theme.key_chat_wallpaper));
        ActionBar actionBar = this.actionBar;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.chatListView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        ActionBar actionBar2 = this.actionBar;
        int i3 = ThemeDescription.FLAG_AB_ITEMSCOLOR;
        int i4 = Theme.key_actionBarDefaultIcon;
        arrayList.add(new ThemeDescription(actionBar2, i3, null, null, null, null, i4));
        ActionBar actionBar3 = this.actionBar;
        int i5 = ThemeDescription.FLAG_AB_SELECTORCOLOR;
        int i6 = Theme.key_actionBarDefaultSelector;
        arrayList.add(new ThemeDescription(actionBar3, i5, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUBACKGROUND, null, null, null, null, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, null, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM | ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.chatListView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.avatarContainer.getTitleTextView(), ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.avatarContainer.getSubtitleTextView(), ThemeDescription.FLAG_TEXTCOLOR, (Class[]) null, new Paint[]{Theme.chat_statusPaint, Theme.chat_statusRecordPaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_actionBarDefaultSubtitle, (Object) null));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessageRed));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessageOrange));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessageViolet));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessageGreen));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessageCyan));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessageBlue));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessagePink));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInDrawable, Theme.chat_msgInMediaDrawable}, null, Theme.key_chat_inBubble));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInSelectedDrawable, Theme.chat_msgInMediaSelectedDrawable}, null, Theme.key_chat_inBubbleSelected));
        Drawable[] shadowDrawables = Theme.chat_msgInDrawable.getShadowDrawables();
        int i7 = Theme.key_chat_inBubbleShadow;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, shadowDrawables, null, i7));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgInMediaDrawable.getShadowDrawables(), null, i7));
        Drawable[] shadowDrawables2 = Theme.chat_msgOutDrawable.getShadowDrawables();
        int i8 = Theme.key_chat_outBubbleShadow;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, shadowDrawables2, null, i8));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgOutMediaDrawable.getShadowDrawables(), null, i8));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubble));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient1));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient2));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient3));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutSelectedDrawable, Theme.chat_msgOutMediaSelectedDrawable}, null, Theme.key_chat_outBubbleSelected));
        TextPaint textPaint = Theme.chat_actionTextPaint;
        int i9 = Theme.key_chat_serviceText;
        arrayList.add(new ThemeDescription(this.chatListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{ChatActionCell.class}, textPaint, null, null, i9));
        arrayList.add(new ThemeDescription(this.chatListView, ThemeDescription.FLAG_LINKCOLOR, new Class[]{ChatActionCell.class}, Theme.chat_actionTextPaint, null, null, Theme.key_chat_serviceLink));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_botCardDrawable, Theme.chat_shareIconDrawable, Theme.chat_botInlineDrawable, Theme.chat_botLinkDrawable, Theme.chat_goIconDrawable, Theme.chat_commentStickerDrawable}, null, Theme.key_chat_serviceIcon));
        int i10 = Theme.key_chat_serviceBackground;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class, ChatActionCell.class}, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class, ChatActionCell.class}, null, null, null, Theme.key_chat_serviceBackgroundSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_messageTextIn));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_messageTextOut));
        arrayList.add(new ThemeDescription(this.chatListView, ThemeDescription.FLAG_LINKCOLOR, new Class[]{ChatMessageCell.class}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chat_messageLinkIn, (Object) null));
        arrayList.add(new ThemeDescription(this.chatListView, ThemeDescription.FLAG_LINKCOLOR, new Class[]{ChatMessageCell.class}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chat_messageLinkOut, (Object) null));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckDrawable}, null, Theme.key_chat_outSentCheck));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckReadDrawable, Theme.chat_msgOutHalfCheckDrawable}, null, Theme.key_chat_outSentCheckRead));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckReadSelectedDrawable, Theme.chat_msgOutHalfCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckReadSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgMediaCheckDrawable, Theme.chat_msgMediaHalfCheckDrawable}, null, Theme.key_chat_mediaSentCheck));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutViewsDrawable, Theme.chat_msgOutRepliesDrawable, Theme.chat_msgOutPinnedDrawable}, null, Theme.key_chat_outViews));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutViewsSelectedDrawable, Theme.chat_msgOutRepliesSelectedDrawable, Theme.chat_msgOutPinnedSelectedDrawable}, null, Theme.key_chat_outViewsSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInViewsDrawable, Theme.chat_msgInRepliesDrawable, Theme.chat_msgInPinnedDrawable}, null, Theme.key_chat_inViews));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInViewsSelectedDrawable, Theme.chat_msgInRepliesSelectedDrawable, Theme.chat_msgInPinnedSelectedDrawable}, null, Theme.key_chat_inViewsSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgMediaViewsDrawable, Theme.chat_msgMediaRepliesDrawable, Theme.chat_msgMediaPinnedDrawable}, null, Theme.key_chat_mediaViews));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutMenuDrawable}, null, Theme.key_chat_outMenu));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutMenuSelectedDrawable}, null, Theme.key_chat_outMenuSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInMenuDrawable}, null, Theme.key_chat_inMenu));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInMenuSelectedDrawable}, null, Theme.key_chat_inMenuSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgMediaMenuDrawable}, null, Theme.key_chat_mediaMenu));
        Drawable[] drawableArr = {Theme.chat_msgOutInstantDrawable};
        int i11 = Theme.key_chat_outInstant;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, drawableArr, null, i11));
        Drawable[] drawableArr2 = {Theme.chat_msgInInstantDrawable, Theme.chat_commentDrawable, Theme.chat_commentArrowDrawable};
        int i12 = Theme.key_chat_inInstant;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, drawableArr2, null, i12));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgOutCallDrawable, null, i11));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgOutCallSelectedDrawable, null, Theme.key_chat_outInstantSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgInCallDrawable, null, i12));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgInCallSelectedDrawable, null, Theme.key_chat_inInstantSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgCallUpGreenDrawable}, null, Theme.key_chat_outGreenCall));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgCallDownRedDrawable}, null, Theme.key_fill_RedNormal));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgCallDownGreenDrawable}, null, Theme.key_chat_inGreenCall));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_msgErrorPaint, null, null, Theme.key_chat_sentError));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgErrorDrawable}, null, Theme.key_chat_sentErrorIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_durationPaint, null, null, Theme.key_chat_previewDurationText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_gamePaint, null, null, Theme.key_chat_previewGameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inPreviewInstantText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outPreviewInstantText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_deleteProgressPaint, null, null, Theme.key_chat_secretTimeText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_stickerNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_botButtonPaint, null, null, Theme.key_chat_botButtonText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inForwardedNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outForwardedNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inViaBotNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outViaBotNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_stickerViaBotNameText));
        int i13 = Theme.key_chat_inReplyLine;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, i13));
        int i14 = Theme.key_chat_outReplyLine;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, i14));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyLine2));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_stickerReplyLine));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inReplyNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_stickerReplyNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inReplyMessageText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyMessageText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inReplyMediaMessageText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyMediaMessageText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_stickerReplyMessageText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inPreviewLine));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outPreviewLine));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inSiteNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outSiteNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inContactNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outContactNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inContactPhoneText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outContactPhoneText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_mediaProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioSelectedProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioSelectedProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_mediaTimeText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inTimeText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outTimeText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inTimeSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outTimeSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioPerformerText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioPerformerText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioTitleText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioTitleText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioDurationText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioDurationText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioDurationSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioDurationSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioSeekbar));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioSeekbar));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioSeekbarSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioSeekbarSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioSeekbarFill));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioCacheSeekbar));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioSeekbarFill));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioCacheSeekbar));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inVoiceSeekbar));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outVoiceSeekbar));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inVoiceSeekbarSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outVoiceSeekbarSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inVoiceSeekbarFill));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outVoiceSeekbarFill));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileProgressSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileProgressSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileInfoText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileInfoText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileInfoSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileInfoSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileBackgroundSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileBackgroundSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inVenueInfoText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outVenueInfoText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inVenueInfoSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outVenueInfoSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_mediaInfoText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_urlPaint, null, null, i13));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_textSearchSelectionPaint, null, null, i14));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outLoader));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outMediaIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outLoaderSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outMediaIconSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inLoader));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inMediaIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inLoaderSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inMediaIconSelected));
        arrayList.add(new ThemeDescription(this.chatListView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_contactDrawable[0]}, null, Theme.key_chat_inContactBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_contactDrawable[0]}, null, Theme.key_chat_inContactIcon));
        arrayList.add(new ThemeDescription(this.chatListView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_contactDrawable[1]}, null, Theme.key_chat_outContactBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_contactDrawable[1]}, null, Theme.key_chat_outContactIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inLocationBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_locationDrawable[0]}, null, Theme.key_chat_inLocationIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_locationDrawable[1]}, null, Theme.key_chat_outLocationIcon));
        arrayList.add(new ThemeDescription(this.bottomOverlayChat, 0, null, Theme.chat_composeBackgroundPaint, null, null, Theme.key_chat_messagePanelBackground));
        arrayList.add(new ThemeDescription(this.bottomOverlayChat, 0, null, null, new Drawable[]{Theme.chat_composeShadowDrawable}, null, Theme.key_chat_messagePanelShadow));
        arrayList.add(new ThemeDescription(this.bottomOverlayChatText, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_chat_fieldOverlayText));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.progressBar, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.chatListView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE, new Class[]{ChatUnreadCell.class}, new String[]{"backgroundLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chat_unreadMessagesStartBackground));
        arrayList.add(new ThemeDescription(this.chatListView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{ChatUnreadCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chat_unreadMessagesStartArrowIcon));
        arrayList.add(new ThemeDescription(this.chatListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{ChatUnreadCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chat_unreadMessagesStartText));
        arrayList.add(new ThemeDescription(this.progressView2, ThemeDescription.FLAG_SERVICEBACKGROUND, null, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_SERVICEBACKGROUND, null, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_undo_background));
        int i15 = Theme.key_undo_cancelColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
        int i16 = Theme.key_undo_infoColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{UndoView.class}, new String[]{"leftImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
        return arrayList;
    }

    public void scrollToMessage(org.telegram.messenger.MessageObject r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChannelAdminLogActivity.scrollToMessage(org.telegram.messenger.MessageObject, boolean):void");
    }

    private void startMessageUnselect() {
        Runnable runnable = this.unselectRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                ChannelAdminLogActivity.this.lambda$startMessageUnselect$25();
            }
        };
        this.unselectRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, this.highlightMessageQuote != null ? 2500L : 1000L);
    }

    public void lambda$startMessageUnselect$25() {
        this.highlightMessageId = Integer.MAX_VALUE;
        this.highlightMessageQuoteFirst = false;
        this.highlightMessageQuote = null;
        this.highlightMessageQuoteOffset = -1;
        this.showNoQuoteAlert = false;
        updateVisibleRows();
        this.unselectRunnable = null;
    }

    private void removeSelectedMessageHighlight() {
        if (this.highlightMessageQuote != null) {
            return;
        }
        Runnable runnable = this.unselectRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.unselectRunnable = null;
        }
        this.highlightMessageId = Integer.MAX_VALUE;
        this.highlightMessageQuoteFirst = false;
        this.highlightMessageQuote = null;
    }

    public void updateVisibleRows() {
        updateVisibleRows(false);
    }

    private void updateVisibleRows(boolean z) {
        String str;
        RecyclerListView recyclerListView = this.chatListView;
        if (recyclerListView == null) {
            return;
        }
        int childCount = recyclerListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.chatListView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (messageObject != null) {
                    if (this.actionBar.isActionModeShowed()) {
                        this.highlightMessageQuoteFirst = false;
                        this.highlightMessageQuote = null;
                    } else {
                        chatMessageCell.setDrawSelectionBackground(false);
                        chatMessageCell.setCheckBoxVisible(false, true);
                        chatMessageCell.setChecked(false, false, true);
                    }
                    chatMessageCell.setHighlighted(this.highlightMessageId != Integer.MAX_VALUE && messageObject.getRealId() == this.highlightMessageId);
                    if (this.highlightMessageId != Integer.MAX_VALUE) {
                        startMessageUnselect();
                    }
                    if (chatMessageCell.isHighlighted() && (str = this.highlightMessageQuote) != null) {
                        if (!chatMessageCell.setHighlightedText(str, true, this.highlightMessageQuoteOffset, this.highlightMessageQuoteFirst) && this.showNoQuoteAlert) {
                            showNoQuoteFound();
                        }
                        this.highlightMessageQuoteFirst = false;
                        this.showNoQuoteAlert = false;
                    } else if (!TextUtils.isEmpty(this.searchQuery)) {
                        chatMessageCell.setHighlightedText(this.searchQuery);
                    } else {
                        chatMessageCell.setHighlightedText(null);
                    }
                    chatMessageCell.setSpoilersSuppressed(this.chatListView.getScrollState() != 0);
                }
            } else if (childAt instanceof ChatActionCell) {
                ChatActionCell chatActionCell = (ChatActionCell) childAt;
                if (!z) {
                    chatActionCell.setMessageObject(chatActionCell.getMessageObject());
                }
                chatActionCell.setSpoilersSuppressed(this.chatListView.getScrollState() != 0);
            }
        }
    }

    public void showNoQuoteFound() {
        BulletinFactory.of(this).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.QuoteNotFound)).show(true);
    }

    private int getScrollOffsetForMessage(MessageObject messageObject) {
        return getScrollOffsetForMessage(getHeightForMessage(messageObject, !TextUtils.isEmpty(this.highlightMessageQuote))) - scrollOffsetForQuote(messageObject);
    }

    private int getScrollOffsetForMessage(int i) {
        return Math.max(-AndroidUtilities.dp(2.0f), (this.chatListView.getMeasuredHeight() - i) / 2);
    }

    private int scrollOffsetForQuote(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i;
        int findQuoteStart;
        float lineTop;
        ChatMessageCell chatMessageCell;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (TextUtils.isEmpty(this.highlightMessageQuote) || messageObject == null) {
            ChatMessageCell chatMessageCell2 = this.dummyMessageCell;
            if (chatMessageCell2 != null) {
                chatMessageCell2.computedGroupCaptionY = 0;
                chatMessageCell2.computedCaptionLayout = null;
            }
            return 0;
        }
        if (!TextUtils.isEmpty(messageObject.caption) && (chatMessageCell = this.dummyMessageCell) != null && (textLayoutBlocks = chatMessageCell.captionLayout) != null) {
            i = (int) chatMessageCell.captionY;
            charSequence = messageObject.caption;
            arrayList = textLayoutBlocks.textLayoutBlocks;
        } else {
            CharSequence charSequence2 = messageObject.messageText;
            arrayList = messageObject.textLayoutBlocks;
            ChatMessageCell chatMessageCell3 = this.dummyMessageCell;
            if (chatMessageCell3 == null || !chatMessageCell3.linkPreviewAbove) {
                charSequence = charSequence2;
                i = 0;
            } else {
                i = chatMessageCell3.linkPreviewHeight + AndroidUtilities.dp(10.0f) + 0;
                charSequence = charSequence2;
            }
        }
        ChatMessageCell chatMessageCell4 = this.dummyMessageCell;
        if (chatMessageCell4 != null) {
            chatMessageCell4.computedGroupCaptionY = 0;
            chatMessageCell4.computedCaptionLayout = null;
        }
        if (arrayList == null || charSequence == null || (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), this.highlightMessageQuote, this.highlightMessageQuoteOffset)) < 0) {
            return 0;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i2);
            String charSequence3 = textLayoutBlock.textLayout.getText().toString();
            int i3 = textLayoutBlock.charactersOffset;
            if (findQuoteStart > i3) {
                if (findQuoteStart - i3 > charSequence3.length() - 1) {
                    lineTop = i + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height));
                } else {
                    lineTop = r5.getLineTop(r5.getLineForOffset(findQuoteStart - textLayoutBlock.charactersOffset)) + i + textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop;
                }
                if (lineTop > AndroidUtilities.displaySize.y * (isKeyboardVisible() ? 0.7f : 0.5f)) {
                    return (int) (lineTop - (AndroidUtilities.displaySize.y * (isKeyboardVisible() ? 0.7f : 0.5f)));
                }
                return 0;
            }
        }
        return 0;
    }

    private int getHeightForMessage(MessageObject messageObject, boolean z) {
        boolean z2 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.dummyMessageCell == null) {
            this.dummyMessageCell = new ChatMessageCell(getParentActivity(), this.currentAccount);
        }
        ChatMessageCell chatMessageCell = this.dummyMessageCell;
        TLRPC$Chat tLRPC$Chat = this.currentChat;
        chatMessageCell.isChat = tLRPC$Chat != null;
        if (ChatObject.isChannel(tLRPC$Chat) && this.currentChat.megagroup) {
            z2 = true;
        }
        chatMessageCell.isMegagroup = z2;
        return this.dummyMessageCell.computeHeight(messageObject, null, z);
    }

    public boolean isKeyboardVisible() {
        return this.contentView.getKeyboardHeight() > AndroidUtilities.dp(20.0f);
    }

    public class ChatScrollCallback extends RecyclerAnimationScrollHelper.AnimationCallback {
        private boolean lastBottom;
        private int lastItemOffset;
        private int lastPadding;
        private MessageObject scrollTo;
        private int position = 0;
        private boolean bottom = true;
        private int offset = 0;

        public ChatScrollCallback() {
        }

        @Override
        public void onStartAnimation() {
            super.onStartAnimation();
            ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
            channelAdminLogActivity.scrollCallbackAnimationIndex = channelAdminLogActivity.getNotificationCenter().setAnimationInProgress(ChannelAdminLogActivity.this.scrollCallbackAnimationIndex, ChannelAdminLogActivity.allowedNotificationsDuringChatListAnimations);
        }

        @Override
        public void onEndAnimation() {
            if (this.scrollTo != null) {
                int indexOf = ChannelAdminLogActivity.this.chatAdapter.messagesStartRow + ChannelAdminLogActivity.this.filteredMessages.indexOf(this.scrollTo);
                if (indexOf >= 0) {
                    ChannelAdminLogActivity.this.chatLayoutManager.scrollToPositionWithOffset(indexOf, this.lastItemOffset + this.lastPadding, this.lastBottom);
                }
            } else {
                ChannelAdminLogActivity.this.chatLayoutManager.scrollToPositionWithOffset(this.position, this.offset, this.bottom);
            }
            this.scrollTo = null;
            ChannelAdminLogActivity.this.checkTextureViewPosition = true;
            ChannelAdminLogActivity.this.updateVisibleRows();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChannelAdminLogActivity.ChatScrollCallback.this.lambda$onEndAnimation$0();
                }
            });
        }

        public void lambda$onEndAnimation$0() {
            ChannelAdminLogActivity.this.getNotificationCenter().onAnimationFinish(ChannelAdminLogActivity.this.scrollCallbackAnimationIndex);
        }

        @Override
        public void recycleView(View view) {
            if (view instanceof ChatMessageCell) {
                ChannelAdminLogActivity.this.chatMessageCellsCache.add((ChatMessageCell) view);
            }
        }
    }

    public void saveScrollPosition(boolean z) {
        RecyclerListView recyclerListView = this.chatListView;
        if (recyclerListView == null || this.chatLayoutManager == null || recyclerListView.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i = -1;
        int i2 = z ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        for (int i3 = 0; i3 < this.chatListView.getChildCount(); i3++) {
            View childAt = this.chatListView.getChildAt(i3);
            int childAdapterPosition = this.chatListView.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= 0) {
                int top = childAt.getTop();
                if (z) {
                    if (top >= i2) {
                    }
                    i2 = childAt.getTop();
                    view = childAt;
                    i = childAdapterPosition;
                } else {
                    if (top <= i2) {
                    }
                    i2 = childAt.getTop();
                    view = childAt;
                    i = childAdapterPosition;
                }
            }
        }
        if (view != null) {
            long j = 0;
            if (view instanceof ChatMessageCell) {
                j = ((ChatMessageCell) view).getMessageObject().eventId;
            } else if (view instanceof ChatActionCell) {
                j = ((ChatActionCell) view).getMessageObject().eventId;
            }
            this.savedScrollEventId = j;
            this.savedScrollPosition = i;
            this.savedScrollOffset = getScrollingOffsetForView(view);
        }
    }

    private int getScrollingOffsetForView(View view) {
        return (this.chatListView.getMeasuredHeight() - view.getBottom()) - this.chatListView.getPaddingBottom();
    }

    public void applyScrolledPosition() {
        int i;
        if (this.chatListView == null || this.chatLayoutManager == null || (i = this.savedScrollPosition) < 0) {
            return;
        }
        if (this.savedScrollEventId != 0) {
            int i2 = 0;
            while (true) {
                if (i2 < this.chatAdapter.getItemCount()) {
                    MessageObject messageObject = this.chatAdapter.getMessageObject(i2);
                    if (messageObject != null && messageObject.eventId == this.savedScrollEventId) {
                        i = i2;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        this.chatLayoutManager.scrollToPositionWithOffset(i, this.savedScrollOffset, true);
        this.savedScrollPosition = -1;
        this.savedScrollEventId = 0L;
    }
}
