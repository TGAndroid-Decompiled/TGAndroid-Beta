package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.core.content.FileProvider;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import com.google.android.gms.internal.mlkit_vision_label.zzdd;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Function;
import me.vkryl.core.BitwiseUtils;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.FBool;
import org.telegram.messenger.utils.OnPostDrawView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline3;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatLoadingCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ChatMessageUnsupportedCell;
import org.telegram.ui.Cells.ChatUnreadCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AdminLogFilterAlert2;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.ClearHistoryAlert;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EmbedBottomSheet;
import org.telegram.ui.Components.EmojiView$$ExternalSyntheticLambda18;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.PhonebookShareAlert;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.WallpaperParallaxEffect;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceWrapped;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.chat.WallpaperBitmapProvider;
import org.telegram.ui.Components.chat.layouts.ChatActivityChannelButtonsLayout;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda20;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public final class ChannelAdminLogActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] allowedNotificationsDuringChatListAnimations = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public static int lastStableId = 10;
    public ArrayList admins;
    public AspectRatioFrameLayout aspectRatioFrameLayout;
    public ChatAvatarContainer avatarContainer;
    public ChatActivityChannelButtonsLayout bottomOverlayChat2;
    public TextView bottomOverlayChatText;
    public ChatActivityFadeView chatActivityFadeView;
    public ChatActivityAdapter chatAdapter;
    public StickersActivity.AnonymousClass2 chatLayoutManager;
    public AnonymousClass9 chatListItemAnimator;
    public AnonymousClass7 chatListView;
    public final ArrayList chatMessageCellsCache;
    public RecyclerAnimationScrollHelper chatScrollHelper;
    public final ChatScrollCallback chatScrollHelperCallback;
    public boolean checkTextureViewPosition;
    public AnonymousClass5 contentView;
    public final TLRPC.Chat currentChat;
    public TLRPC.TL_channelAdminLogEventsFilter currentFilter;
    public boolean currentFloatingDateOnScreen;
    public boolean currentFloatingTopIsNotMessage;
    public ChatMessageCell dummyMessageCell;
    public ImageView emptyImageView;
    public LinearLayout emptyLayoutView;
    public ArticleViewer.AnonymousClass9 emptyView;
    public FrameLayout emptyViewContainer;
    public boolean endReached;
    public final HashSet expandedEvents;
    public final ArrayList filteredMessages;
    public final ArrayList filteredMessagesUpdatedPosition;
    public AnimatorSet floatingDateAnimation;
    public ChatActionCell floatingDateView;
    public final ReferenceList glassAttachedViews;
    public final BlurredBackgroundDrawableViewFactory glassBackgroundDrawableFactory;
    public final BlurredBackgroundDrawableViewFactory glassBackgroundDrawableFactoryFrosted;
    public final BlurredBackgroundSourceRenderNode glassBackgroundSourceFrostedRenderNode;
    public final BlurredBackgroundSourceRenderNode glassBackgroundSourceRenderNode;
    public final ArrayList glassDrawablesPositions;
    public final ArrayList glassDrawablesPositionsMerged;
    public int highlightMessageId;
    public int highlightMessageQuoteOffset;
    public OnPostDrawView invalidateBlurredSourcesView;
    public final HashMap invitesCache;
    public boolean linviteLoading;
    public boolean loading;
    public final ArrayList messages;
    public final HashMap messagesByDays;
    public final LongSparseArray messagesDict;
    public final int[] mid;
    public long minEventId;
    public final BlurredBackgroundDrawableViewFactory navbarContentDrawableFactory;
    public final BlurredBackgroundSourceWrapped navbarContentSourceWallpaper;
    public final AnimationNotificationsLocker notificationsLocker;
    public boolean paused;
    public RadialProgressView progressBar;
    public FrameLayout progressView;
    public View progressView2;
    public final AnonymousClass1 provider;
    public final LongSparseArray realMessagesDict;
    public final int recommendedAdditionalSizeY;
    public boolean reloadingLastMessages;
    public AnonymousClass16 roundVideoContainer;
    public long savedScrollEventId;
    public int savedScrollOffset;
    public int savedScrollPosition;
    public AnonymousClass15 scrimPopupWindow;
    public int scrollCallbackAnimationIndex;
    public int scrollToOffsetOnRecreate;
    public int scrollToPositionOnRecreate;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public boolean scrollingFloatingDate;
    public ImageView searchCalendarButton;
    public FrameLayout searchContainer;
    public SimpleTextView searchCountText;
    public ActionBarMenuItem searchItem;
    public String searchQuery;
    public boolean searchWas;
    public LongSparseArray selectedAdmins;
    public MessageObject selectedObject;
    public TLRPC.ChannelParticipant selectedParticipant;
    public final LongSparseArray stableIdByEventExpand;
    public final RectF tmpViewRectF;
    public UndoView undoView;
    public ChannelAdminLogActivity$$ExternalSyntheticLambda7 unselectRunnable;
    public HashMap usersMap;
    public TextureView videoTextureView;
    public boolean wasPaused;

    public final class AnonymousClass13 {
        public AnonymousClass13() {
        }
    }

    public final class AnonymousClass15 extends ActionBarPopupWindow {
        public AnonymousClass15(ChatActivity.AnonymousClass115 anonymousClass115) {
            super(anonymousClass115);
        }

        @Override
        public final void dismiss() {
            dismiss(true);
            ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
            if (channelAdminLogActivity.scrimPopupWindow != this) {
                return;
            }
            Bulletin bulletin = Bulletin.visibleBulletin;
            if (bulletin != null) {
                bulletin.hide();
            }
            channelAdminLogActivity.scrimPopupWindow = null;
        }
    }

    public final class AnonymousClass16 extends FrameLayout {
        public AnonymousClass16(Activity activity) {
            super(activity);
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            invalidate();
        }
    }

    public final class AnonymousClass18 extends TLRPC.ChannelParticipant {
    }

    public final class AnonymousClass20 {
        public AnonymousClass20() {
        }
    }

    public final class AnonymousClass7 extends ChatListRecyclerView {
        public AnonymousClass7(Context context) {
            super(context, null);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            ChatMessageCell chatMessageCell;
            ImageReceiver avatarImage;
            boolean z;
            int y;
            int adapterPosition;
            if (view instanceof ChatMessageUnsupportedCell) {
                canvas.save();
                canvas.translate(view.getX(), view.getY());
                ((ChatMessageUnsupportedCell) view).drawBackground(canvas);
                canvas.restore();
            }
            boolean zDrawChild = super.drawChild(canvas, view, j);
            if ((view instanceof ChatMessageCell) && (avatarImage = (chatMessageCell = (ChatMessageCell) view).getAvatarImage()) != null) {
                boolean z2 = chatMessageCell.getMessageObject().deleted;
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                if (z2) {
                    z = false;
                } else {
                    channelAdminLogActivity.chatListView.getClass();
                    if (RecyclerView.getChildAdapterPosition(chatMessageCell) != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (chatMessageCell.getMessageObject().deleted) {
                    avatarImage.setVisible(false, false);
                    return zDrawChild;
                }
                int y2 = (int) view.getY();
                if (chatMessageCell.drawPinnedBottom() && (adapterPosition = channelAdminLogActivity.chatListView.getChildViewHolder(view).getAdapterPosition()) >= 0) {
                    if (channelAdminLogActivity.chatListView.findViewHolderForAdapterPosition(adapterPosition + 1) != null) {
                        avatarImage.setVisible(false, false);
                        return zDrawChild;
                    }
                }
                float checkBoxTranslation = chatMessageCell.getCheckBoxTranslation() + chatMessageCell.getSlidingOffsetX();
                int layoutHeight = chatMessageCell.getLayoutHeight() + ((int) view.getY());
                int measuredHeight = channelAdminLogActivity.chatListView.getMeasuredHeight() - channelAdminLogActivity.chatListView.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (chatMessageCell.drawPinnedTop() && (adapterPosition = channelAdminLogActivity.chatListView.getChildViewHolder(view).getAdapterPosition()) >= 0) {
                    int i = 0;
                    while (i < 20) {
                        i++;
                        int adapterPosition2 = adapterPosition2 - 1;
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = channelAdminLogActivity.chatListView.findViewHolderForAdapterPosition(adapterPosition2);
                        if (viewHolderFindViewHolderForAdapterPosition == null) {
                            break;
                        }
                        View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                        int top = view2.getTop();
                        if (view2 instanceof ChatMessageCell) {
                            chatMessageCell = (ChatMessageCell) view2;
                            if (chatMessageCell.drawPinnedTop()) {
                                y2 = top;
                            }
                        }
                        y2 = top;
                        break;
                    }
                }
                if (layoutHeight - AndroidUtilities.dp(48.0f) < y2) {
                    layoutHeight = AndroidUtilities.dp(48.0f) + y2;
                }
                if (!chatMessageCell.drawPinnedBottom() && layoutHeight > (y = (int) (chatMessageCell.getY() + chatMessageCell.getMeasuredHeight()))) {
                    layoutHeight = y;
                }
                canvas.save();
                if (checkBoxTranslation != 0.0f) {
                    canvas.translate(checkBoxTranslation, 0.0f);
                }
                if (chatMessageCell.getCurrentMessagesGroup() != null && chatMessageCell.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                    layoutHeight = (int) (layoutHeight - chatMessageCell.getTranslationY());
                }
                if (z) {
                    avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                }
                if (chatMessageCell.shouldDrawAlphaLayer()) {
                    avatarImage.setAlpha(chatMessageCell.getAlpha());
                    canvas.scale(chatMessageCell.getScaleX(), chatMessageCell.getScaleY(), chatMessageCell.getPivotX() + chatMessageCell.getX(), chatMessageCell.getY() + (chatMessageCell.getHeight() >> 1));
                } else {
                    avatarImage.setAlpha(1.0f);
                }
                if (z) {
                    avatarImage.setVisible(true, false);
                }
                avatarImage.draw(canvas);
                canvas.restore();
            }
            return zDrawChild;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            MessageObject messageObject;
            ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
            if (channelAdminLogActivity.chatListView != null && channelAdminLogActivity.chatLayoutManager != null && (i5 = channelAdminLogActivity.savedScrollPosition) >= 0) {
                if (channelAdminLogActivity.savedScrollEventId != 0) {
                    int i6 = 0;
                    while (true) {
                        ChatActivityAdapter chatActivityAdapter = channelAdminLogActivity.chatAdapter;
                        if (i6 < chatActivityAdapter.rowCount) {
                            if (i6 < chatActivityAdapter.messagesStartRow || i6 >= chatActivityAdapter.messagesEndRow) {
                                messageObject = null;
                            } else {
                                ArrayList arrayList = ChannelAdminLogActivity.this.filteredMessages;
                                messageObject = (MessageObject) arrayList.get((arrayList.size() - (i6 - chatActivityAdapter.messagesStartRow)) - 1);
                            }
                            if (messageObject != null && messageObject.eventId == channelAdminLogActivity.savedScrollEventId) {
                                i5 = i6;
                                break;
                            }
                            i6++;
                        } else {
                            break;
                        }
                    }
                }
                channelAdminLogActivity.chatLayoutManager.scrollToPositionWithOffset(i5, channelAdminLogActivity.savedScrollOffset, true);
                channelAdminLogActivity.savedScrollPosition = -1;
                channelAdminLogActivity.savedScrollEventId = 0L;
            }
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public final class AnonymousClass9 extends ChatListItemAnimator {
        public ChatActivity$$ExternalSyntheticLambda174 finishRunnable;
        public int scrollAnimationIndex;

        public AnonymousClass9(AnonymousClass7 anonymousClass7, Theme.ResourcesProvider resourcesProvider) {
            super(null, anonymousClass7, resourcesProvider);
            this.scrollAnimationIndex = -1;
        }

        @Override
        public final void onAllAnimationsDone() {
            super.onAllAnimationsDone();
            ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda174 = this.finishRunnable;
            if (chatActivity$$ExternalSyntheticLambda174 != null) {
                AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda174);
            }
            ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda175 = new ChatActivity$$ExternalSyntheticLambda174(this, 6);
            this.finishRunnable = chatActivity$$ExternalSyntheticLambda175;
            AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda175);
        }

        @Override
        public final void onAnimationStart() {
            if (this.scrollAnimationIndex == -1) {
                this.scrollAnimationIndex = ChannelAdminLogActivity.this.getNotificationCenter().setAnimationInProgress(this.scrollAnimationIndex, ChannelAdminLogActivity.allowedNotificationsDuringChatListAnimations, false);
            }
            ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda174 = this.finishRunnable;
            if (chatActivity$$ExternalSyntheticLambda174 != null) {
                AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                this.finishRunnable = null;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("admin logs chatItemAnimator disable notifications");
            }
        }
    }

    public final class ChatActivityAdapter extends RecyclerView.Adapter {
        public int loadingUpRow;
        public final Context mContext;
        public int messagesEndRow;
        public int messagesStartRow;
        public int rowCount;

        public final class AnonymousClass1 implements ChatMessageCell.ChatMessageCellDelegate {
            public AnonymousClass1() {
            }

            @Override
            public final boolean allowAddPollOptions() {
                return false;
            }

            @Override
            public final boolean canDrawOutboundsContent() {
                return true;
            }

            @Override
            public final boolean canPerformActions() {
                return true;
            }

            @Override
            public final boolean canPerformReply() {
                return true;
            }

            @Override
            public final boolean canSaveRichDocument(ChatMessageCell chatMessageCell) {
                return false;
            }

            @Override
            public final boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell) {
                return false;
            }

            @Override
            public final void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                int i = ChannelAdminLogActivity.lastStableId;
                channelAdminLogActivity.createMenu(chatMessageCell, 0.0f, 0.0f);
            }

            @Override
            public final void didLongPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
            }

            @Override
            public final boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat) {
                return false;
            }

            @Override
            public final boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
                return false;
            }

            @Override
            public final boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
                return false;
            }

            @Override
            public final boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user) {
                if (user != null) {
                    long j = user.id;
                    ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                    if (j != UserConfig.getInstance(((BaseFragment) channelAdminLogActivity).currentAccount).getClientUserId()) {
                        AvatarPreviewer.MenuItem[] menuItemArr = {AvatarPreviewer.MenuItem.OPEN_PROFILE, AvatarPreviewer.MenuItem.SEND_MESSAGE};
                        TLRPC.UserFull userFull = channelAdminLogActivity.getMessagesController().getUserFull(user.id);
                        AvatarPreviewer.Data dataOf = userFull != null ? AvatarPreviewer.Data.of(user, userFull, menuItemArr) : AvatarPreviewer.Data.of(user, ((BaseFragment) channelAdminLogActivity).classGuid, menuItemArr);
                        if (dataOf.imageLocation != null || dataOf.thumbImageLocation != null) {
                            AvatarPreviewer.getInstance().show((ViewGroup) channelAdminLogActivity.fragmentView, channelAdminLogActivity.getResourceProvider(), dataOf, new ArticleViewer$$ExternalSyntheticLambda16(this, chatMessageCell, user));
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override
            public final void didPressAboutRevenueSharingAds() {
            }

            @Override
            public final void didPressAddPollOptionButton(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressAdmin(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final boolean didPressAnimatedEmoji(AnimatedEmojiSpan animatedEmojiSpan) {
                return false;
            }

            @Override
            public final void didPressAppUpdateButton() {
                if (ApplicationLoader.isStandaloneBuild()) {
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity != null) {
                        launchActivity.checkAppUpdate(true);
                        return;
                    }
                    return;
                }
                boolean zIsHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
                ChatActivityAdapter chatActivityAdapter = ChatActivityAdapter.this;
                if (zIsHuaweiStoreApp) {
                    Browser.openUrl(ChannelAdminLogActivity.this.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
                } else {
                    Browser.openUrl(ChannelAdminLogActivity.this.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
                }
            }

            @Override
            public final void didPressBoostCounter(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                MessageObject messageObject = chatMessageCell.getMessageObject();
                ChatActivityAdapter chatActivityAdapter = ChatActivityAdapter.this;
                if (ChannelAdminLogActivity.this.expandedEvents.contains(Long.valueOf(messageObject.eventId))) {
                    ChannelAdminLogActivity.this.expandedEvents.remove(Long.valueOf(messageObject.eventId));
                } else {
                    ChannelAdminLogActivity.this.expandedEvents.add(Long.valueOf(messageObject.eventId));
                }
                ChannelAdminLogActivity.this.saveScrollPosition(true);
                ChannelAdminLogActivity.this.filterDeletedMessages();
                ChannelAdminLogActivity.this.chatAdapter.notifyDataSetChanged();
            }

            @Override
            public final void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
                if (chat != null) {
                    ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                    if (chat != channelAdminLogActivity.currentChat) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.id);
                        if (i != 0) {
                            bundle.putInt("message_id", i);
                        }
                        if (MessagesController.getInstance(((BaseFragment) channelAdminLogActivity).currentAccount).checkCanOpenChat(bundle, channelAdminLogActivity)) {
                            channelAdminLogActivity.presentFragment(new ChatActivity(bundle), true);
                        }
                    }
                }
            }

            @Override
            public final void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
            }

            @Override
            public final void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressCodeCopy(MessageObject.TextLayoutBlock textLayoutBlock) {
            }

            @Override
            public final void didPressCommentButton(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
            }

            @Override
            public final void didPressEffect(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
            }

            @Override
            public final void didPressFactCheck(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i, int i2) {
            }

            @Override
            public final void didPressGiveawayChatButton(int i, ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressGroupImage(ChatMessageCell chatMessageCell, TLRPC.MessageExtendedMedia messageExtendedMedia) {
            }

            @Override
            public final void didPressHiddenForward(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressHint(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z) throws Throwable {
                int i;
                File file;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                if (inputStickerSet != null) {
                    channelAdminLogActivity.showDialog(new StickersAlert(channelAdminLogActivity.getParentActivity(), channelAdminLogActivity, messageObject.getInputStickerSet(), null, null, null));
                    return;
                }
                File pathToMessage = null;
                if (messageObject.isVideo() || (i = messageObject.type) == 1 || ((i == 0 && !messageObject.isWebpageDocument()) || messageObject.isGif())) {
                    PhotoViewer.getInstance().setParentActivity(null, channelAdminLogActivity, null);
                    PhotoViewer.getInstance().openPhoto(messageObject, (ChatActivity) null, 0L, 0L, 0L, channelAdminLogActivity.provider);
                    return;
                }
                int i2 = messageObject.type;
                if (i2 == 3) {
                    try {
                        String str = messageObject.messageOwner.attachPath;
                        if (str != null && str.length() != 0) {
                            pathToMessage = new File(messageObject.messageOwner.attachPath);
                        }
                        if (pathToMessage == null || !pathToMessage.exists()) {
                            pathToMessage = channelAdminLogActivity.getFileLoader().getPathToMessage(messageObject.messageOwner);
                        }
                        Intent intent = new Intent("android.intent.action.VIEW");
                        if (Build.VERSION.SDK_INT >= 24) {
                            intent.setFlags(1);
                            intent.setDataAndType(FileProvider.getUriForFile(channelAdminLogActivity.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToMessage), "video/mp4");
                        } else {
                            intent.setDataAndType(Uri.fromFile(pathToMessage), "video/mp4");
                        }
                        channelAdminLogActivity.getParentActivity().startActivityForResult(intent, 500);
                        return;
                    } catch (Exception unused) {
                        ChannelAdminLogActivity.access$6000(channelAdminLogActivity, messageObject);
                        return;
                    }
                }
                if (i2 == 4) {
                    if (AndroidUtilities.isMapsInstalled(channelAdminLogActivity)) {
                        LocationActivity locationActivity = new LocationActivity(0);
                        locationActivity.messageObject = messageObject;
                        locationActivity.dialogId = messageObject.getDialogId();
                        channelAdminLogActivity.presentFragment(locationActivity);
                        return;
                    }
                    return;
                }
                if (i2 == 9 || i2 == 0) {
                    if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                        String str2 = messageObject.messageOwner.attachPath;
                        if (str2 == null || str2.length() == 0) {
                            file = null;
                        } else {
                            file = new File(messageObject.messageOwner.attachPath);
                            if (!file.exists()) {
                                file = null;
                            }
                        }
                        if (file == null) {
                            File pathToMessage2 = channelAdminLogActivity.getFileLoader().getPathToMessage(messageObject.messageOwner);
                            if (pathToMessage2.exists()) {
                                file = pathToMessage2;
                            }
                        }
                        StickersActivity.AnonymousClass2 anonymousClass2 = channelAdminLogActivity.chatLayoutManager;
                        if (anonymousClass2 != null) {
                            if (anonymousClass2.findLastVisibleItemPosition() < channelAdminLogActivity.chatLayoutManager.getItemCount() - 1) {
                                channelAdminLogActivity.scrollToPositionOnRecreate = channelAdminLogActivity.chatLayoutManager.findFirstVisibleItemPosition();
                                RecyclerListView.Holder holder = (RecyclerListView.Holder) channelAdminLogActivity.chatListView.findViewHolderForAdapterPosition(channelAdminLogActivity.scrollToPositionOnRecreate);
                                if (holder != null) {
                                    channelAdminLogActivity.scrollToOffsetOnRecreate = holder.itemView.getTop();
                                } else {
                                    channelAdminLogActivity.scrollToPositionOnRecreate = -1;
                                }
                            } else {
                                channelAdminLogActivity.scrollToPositionOnRecreate = -1;
                            }
                        }
                        Theme.ThemeInfo themeInfoApplyThemeFile = Theme.applyThemeFile(file, messageObject.getDocumentName(), null, true);
                        if (themeInfoApplyThemeFile != null) {
                            channelAdminLogActivity.presentFragment(new ThemePreviewActivity(themeInfoApplyThemeFile));
                            return;
                        }
                        channelAdminLogActivity.scrollToPositionOnRecreate = -1;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, channelAdminLogActivity.getParentActivity(), null, false);
                    } catch (Exception unused2) {
                        ChannelAdminLogActivity.access$6000(channelAdminLogActivity, messageObject);
                    }
                }
            }

            @Override
            public final void didPressInstantButton(int i, ChatMessageCell chatMessageCell) {
                TLRPC.WebPage webPage;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -messageObject.getDialogId());
                    bundle.putInt("message_id", messageObject.getRealId());
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    if (ChatObject.isForum(channelAdminLogActivity.currentChat)) {
                        ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(((BaseFragment) channelAdminLogActivity).currentAccount, messageObject.messageOwner, true)));
                    }
                    channelAdminLogActivity.presentFragment(chatActivity);
                    return;
                }
                if (i == 0) {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                        return;
                    }
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject) == null) {
                        channelAdminLogActivity.createArticleViewer(false).open(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                if (i != 5) {
                    TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                    if (messageMedia2 == null || messageMedia2.webpage == null) {
                        return;
                    }
                    Browser.openUrl(channelAdminLogActivity.getParentActivity(), messageObject.messageOwner.media.webpage.url);
                    return;
                }
                TLRPC.User user = channelAdminLogActivity.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
                String str = messageMedia3.vcard;
                String str2 = messageMedia3.first_name;
                String str3 = messageMedia3.last_name;
                try {
                    File sharingDirectory = AndroidUtilities.getSharingDirectory();
                    sharingDirectory.mkdirs();
                    File file = new File(sharingDirectory, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str);
                    bufferedWriter.close();
                    channelAdminLogActivity.showDialog(new PhonebookShareAlert(channelAdminLogActivity, null, user, null, file, null, str2, str3, null));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }

            @Override
            public final void didPressMoreChannelRecommendations() {
            }

            @Override
            public final void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                int i = ChannelAdminLogActivity.lastStableId;
                channelAdminLogActivity.createMenu(chatMessageCell, 0.0f, 0.0f);
            }

            @Override
            public final void didPressPollMedia(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
            }

            @Override
            public final void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
            }

            @Override
            public final void didPressReplyMessage(ChatMessageCell chatMessageCell, int i, float f, float f2, boolean z) {
                MessageObject messageObject = chatMessageCell.getMessageObject().replyMessageObject;
                long dialogId = messageObject.getDialogId();
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                if (dialogId == (-channelAdminLogActivity.currentChat.id)) {
                    for (int i2 = 0; i2 < channelAdminLogActivity.filteredMessages.size(); i2++) {
                        MessageObject messageObject2 = (MessageObject) channelAdminLogActivity.filteredMessages.get(i2);
                        if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                            channelAdminLogActivity.scrollToMessage(messageObject2);
                            return;
                        }
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", channelAdminLogActivity.currentChat.id);
                bundle.putInt("message_id", messageObject.getRealId());
                channelAdminLogActivity.presentFragment(new ChatActivity(bundle));
            }

            @Override
            public final void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document) {
            }

            @Override
            public final void didPressShowMore(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressSideButton(ChatMessageCell chatMessageCell) {
                ChatActivityAdapter chatActivityAdapter = ChatActivityAdapter.this;
                if (ChannelAdminLogActivity.this.getParentActivity() == null) {
                    return;
                }
                ChannelAdminLogActivity.this.showDialog(ShareAlert.createShareAlert(chatActivityAdapter.mContext, chatMessageCell.getMessageObject(), null, ChatObject.isChannel(ChannelAdminLogActivity.this.currentChat) && !ChannelAdminLogActivity.this.currentChat.megagroup, null));
            }

            @Override
            public final void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
            }

            @Override
            public final void didPressSummarize(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didPressTime() {
            }

            @Override
            public final boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z) {
                return false;
            }

            @Override
            public final void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
                TLRPC.WebPage webPage;
                int i = 1;
                if (characterStyle == null) {
                    return;
                }
                MessageObject messageObject = chatMessageCell.getMessageObject();
                boolean z2 = characterStyle instanceof URLSpanMono;
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                if (z2) {
                    URLSpanMono uRLSpanMono = (URLSpanMono) characterStyle;
                    AndroidUtilities.addToClipboard(uRLSpanMono.currentMessage.subSequence(uRLSpanMono.currentStart, uRLSpanMono.currentEnd).toString());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(channelAdminLogActivity.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                        return;
                    }
                    return;
                }
                if (characterStyle instanceof URLSpanUserMention) {
                    Long l = Utilities.parseLong(((URLSpanUserMention) characterStyle).getURL());
                    long jLongValue = l.longValue();
                    if (jLongValue > 0) {
                        TLRPC.User user = MessagesController.getInstance(((BaseFragment) channelAdminLogActivity).currentAccount).getUser(l);
                        if (user != null) {
                            MessagesController.getInstance(((BaseFragment) channelAdminLogActivity).currentAccount).openChatOrProfileWith(user, null, channelAdminLogActivity, 0, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(((BaseFragment) channelAdminLogActivity).currentAccount).getChat(Long.valueOf(-jLongValue));
                    if (chat != null) {
                        MessagesController.getInstance(((BaseFragment) channelAdminLogActivity).currentAccount).openChatOrProfileWith(null, chat, channelAdminLogActivity, 0, false);
                        return;
                    }
                    return;
                }
                if (characterStyle instanceof URLSpanNoUnderline) {
                    String url = ((URLSpanNoUnderline) characterStyle).getURL();
                    if (url.startsWith("@")) {
                        MessagesController.getInstance(((BaseFragment) channelAdminLogActivity).currentAccount).openByUserName(url.substring(1), channelAdminLogActivity, 0);
                        return;
                    } else {
                        if (url.startsWith("#")) {
                            DialogsActivity dialogsActivity = new DialogsActivity(null);
                            dialogsActivity.searchString = url;
                            channelAdminLogActivity.presentFragment(dialogsActivity);
                            return;
                        }
                        return;
                    }
                }
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z) {
                    BottomSheet bottomSheet = new BottomSheet(channelAdminLogActivity.getParentActivity(), null, false, false);
                    bottomSheet.fixNavigationBar();
                    bottomSheet.title = url2;
                    bottomSheet.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    ArticleViewer$$ExternalSyntheticLambda24 articleViewer$$ExternalSyntheticLambda24 = new ArticleViewer$$ExternalSyntheticLambda24(i, this, url2);
                    bottomSheet.items = charSequenceArr;
                    bottomSheet.onClickListener = articleViewer$$ExternalSyntheticLambda24;
                    channelAdminLogActivity.showDialog(bottomSheet);
                    return;
                }
                if (characterStyle instanceof URLSpanReplacement) {
                    String url3 = ((URLSpanReplacement) characterStyle).getURL();
                    if (Browser.isInternalUri(Uri.parse(url3), false, null)) {
                        Activity parentActivity = channelAdminLogActivity.getParentActivity();
                        if (parentActivity == null || url3 == null) {
                            return;
                        }
                        Browser.openUrl(parentActivity, Uri.parse(url3), true, true);
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(channelAdminLogActivity.getParentActivity(), 0, null);
                    String string = LocaleController.getString(R.string.OpenUrlTitle);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                    builder.setPositiveButton(LocaleController.getString(R.string.Open), new ArticleViewer$$ExternalSyntheticLambda16(25, channelAdminLogActivity, url3));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    channelAdminLogActivity.showDialog(alertDialog);
                    return;
                }
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    String lowerCase = url2.toLowerCase();
                    String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
                    if ((Browser.isTelegraphUrl(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                        LaunchActivity launchActivity = LaunchActivity.instance;
                        if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject) == null) {
                            channelAdminLogActivity.createArticleViewer(false).open(messageObject, null, null, null);
                            return;
                        }
                        return;
                    }
                }
                Activity parentActivity2 = channelAdminLogActivity.getParentActivity();
                if (parentActivity2 == null || url2 == null) {
                    return;
                }
                Browser.openUrl(parentActivity2, Uri.parse(url2), true, true);
            }

            @Override
            public final void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
                if (user != null) {
                    long j = user.id;
                    ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                    if (j != UserConfig.getInstance(((BaseFragment) channelAdminLogActivity).currentAccount).getClientUserId()) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        ChannelAdminLogActivity.access$5300(channelAdminLogActivity, bundle, user.id);
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        profileActivity.setPlayProfileAnimation(0);
                        channelAdminLogActivity.presentFragment(profileActivity);
                    }
                }
            }

            @Override
            public final void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
            }

            @Override
            public final void didPressViaBot(String str) {
            }

            @Override
            public final void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
            }

            @Override
            public final void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3) {
            }

            @Override
            public final void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str, boolean z) {
                ArticleViewer.IBlock.CC.$default$didPressWebPage(chatMessageCell, str);
            }

            @Override
            public final void didQuickShareEnd(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
            }

            @Override
            public final void didQuickShareStart(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didStartVideoStream(MessageObject messageObject) {
            }

            @Override
            public final void didTogglePollPreview(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, FileLoader$$ExternalSyntheticLambda1 fileLoader$$ExternalSyntheticLambda1) {
            }

            @Override
            public final boolean doNotShowLoadingReply(MessageObject messageObject) {
                return ArticleViewer.IBlock.CC.$default$doNotShowLoadingReply(messageObject);
            }

            @Override
            public final void drawPollMode(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void forceUpdate(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final void forceUpdateNoAnimation(ChatMessageCell chatMessageCell) {
            }

            @Override
            public final int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
                return 0;
            }

            @Override
            public final String getAdminRank(long j) {
                return null;
            }

            @Override
            public final int getChatMode() {
                return 0;
            }

            @Override
            public final ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                return null;
            }

            @Override
            public final PinchToZoomHelper getPinchToZoomHelper() {
                return null;
            }

            @Override
            public final String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
                return null;
            }

            @Override
            public final CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
                return null;
            }

            @Override
            public final TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                return null;
            }

            @Override
            public final boolean hasSelectedMessages() {
                return false;
            }

            @Override
            public final void invalidateBlur() {
            }

            @Override
            public final boolean isAdmin(long j) {
                return false;
            }

            @Override
            public final boolean isLandscape() {
                return false;
            }

            @Override
            public final boolean isOwner(long j) {
                return false;
            }

            @Override
            public final boolean isProgressLoading(int i, ChatMessageCell chatMessageCell) {
                return false;
            }

            @Override
            public final boolean isReplyOrSelf() {
                return false;
            }

            @Override
            public final boolean keyboardIsOpened() {
                return false;
            }

            @Override
            public final void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2) {
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                EmbedBottomSheet.show(channelAdminLogActivity, messageObject, channelAdminLogActivity.provider, str2, str3, str4, str, i, i2, -1, false);
            }

            @Override
            public final boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject) {
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject, false);
                    MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
                    return zPlayMessage;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(ChannelAdminLogActivity.this.filteredMessages, messageObject, 0L);
                }
                return false;
            }

            @Override
            public final void needReloadPolls() {
            }

            @Override
            public final void needShowPremiumBulletin(int i) {
            }

            @Override
            public final boolean onAccessibilityAction(int i) {
                return false;
            }

            @Override
            public final void onDiceFinished() {
            }

            @Override
            public final void openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
            }

            @Override
            public final void setShouldNotRepeatSticker(MessageObject messageObject) {
            }

            @Override
            public final boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z) {
                return false;
            }

            @Override
            public final boolean shouldRepeatSticker(MessageObject messageObject) {
                return true;
            }

            @Override
            public final void videoTimerReached() {
            }

            @Override
            public final void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
            }
        }

        public final class AnonymousClass2 extends ChatActionCell {
            @Override
            public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(true);
            }
        }

        public final class AnonymousClass3 implements ChatActionCell.ChatActionCellDelegate {
            public AnonymousClass3() {
            }

            @Override
            public final boolean canDrawOutboundsContent() {
                return true;
            }

            @Override
            public final void didClickButton(ChatActionCell chatActionCell) {
            }

            @Override
            public final void didClickImage(ChatActionCell chatActionCell) throws Throwable {
                MessageObject messageObject = chatActionCell.getMessageObject();
                int i = messageObject.type;
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                if (i == 22) {
                    ChannelColorActivity channelColorActivity = new ChannelColorActivity(getDialogId());
                    channelColorActivity.bulletinFragment = channelAdminLogActivity;
                    channelAdminLogActivity.presentFragment(channelColorActivity);
                    return;
                }
                PhotoViewer.getInstance().setParentActivity(null, channelAdminLogActivity, null);
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
                if (closestPhotoSizeWithSize == null) {
                    PhotoViewer.getInstance().openPhoto(messageObject, (ChatActivity) null, 0L, 0L, 0L, channelAdminLogActivity.provider);
                } else {
                    PhotoViewer.getInstance().openPhoto(null, closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), null, null, null, null, 0, channelAdminLogActivity.provider, null, 0L, 0L, 0L, true, null, null);
                }
            }

            @Override
            public final boolean didLongPress(ChatActionCell chatActionCell, float f, float f2) {
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                int i = ChannelAdminLogActivity.lastStableId;
                return channelAdminLogActivity.createMenu(chatActionCell, 0.0f, 0.0f);
            }

            @Override
            public final void didOpenPremiumGift(ChatActionCell chatActionCell, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
            }

            @Override
            public final void didOpenPremiumGiftChannel(ChatActionCell chatActionCell, String str) {
            }

            @Override
            public final void didPressReaction(ChatActionCell chatActionCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
            }

            @Override
            public final void didPressReplyMessage(ChatActionCell chatActionCell, int i) {
            }

            @Override
            public final void didPressTaskLink(ChatActionCell chatActionCell, int i, int i2) {
            }

            @Override
            public final void forceUpdate(ChatActionCell chatActionCell) {
            }

            @Override
            public final BaseFragment getBaseFragment() {
                return ChannelAdminLogActivity.this;
            }

            @Override
            public final long getDialogId() {
                return -ChannelAdminLogActivity.this.currentChat.id;
            }

            @Override
            public final long getTopicId() {
                return 0L;
            }

            @Override
            public final void needOpenInviteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                if (channelAdminLogActivity.linviteLoading) {
                    return;
                }
                Object obj = channelAdminLogActivity.invitesCache.containsKey(tL_chatInviteExported.link) ? channelAdminLogActivity.invitesCache.get(tL_chatInviteExported.link) : null;
                if (obj != null) {
                    if (!(obj instanceof TLRPC.TL_messages_exportedChatInvite)) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.LinkHashExpired, BulletinFactory.of(channelAdminLogActivity), R.raw.linkbroken, 36);
                        return;
                    }
                    HashMap map = channelAdminLogActivity.usersMap;
                    MessagesController messagesController = channelAdminLogActivity.getMessagesController();
                    TLRPC.Chat chat = channelAdminLogActivity.currentChat;
                    TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.id);
                    InviteLinkBottomSheet inviteLinkBottomSheet = new InviteLinkBottomSheet(channelAdminLogActivity.contentView.getContext(), (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) obj).invite, chatFull, map, channelAdminLogActivity, chatFull.id, false, ChatObject.isChannel(chat));
                    inviteLinkBottomSheet.inviteDelegate = channelAdminLogActivity.new AnonymousClass20();
                    inviteLinkBottomSheet.show();
                    return;
                }
                TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
                tL_messages_getExportedChatInvite.peer = channelAdminLogActivity.getMessagesController().getInputPeer(-channelAdminLogActivity.currentChat.id);
                tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
                channelAdminLogActivity.linviteLoading = true;
                final boolean[] zArr = new boolean[1];
                AlertDialog alertDialog = new AlertDialog(channelAdminLogActivity.getParentActivity(), 3, null);
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        ChannelAdminLogActivity.this.linviteLoading = false;
                        zArr[0] = true;
                    }
                });
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 300L);
                channelAdminLogActivity.getConnectionsManager().bindRequestToGuid(channelAdminLogActivity.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new LoginActivity$$ExternalSyntheticLambda42(this, tL_chatInviteExported, zArr, alertDialog, 3)), ((BaseFragment) channelAdminLogActivity).classGuid);
            }

            @Override
            public final void needOpenUserProfile(long j) {
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                if (j < 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -j);
                    if (MessagesController.getInstance(((BaseFragment) channelAdminLogActivity).currentAccount).checkCanOpenChat(bundle, channelAdminLogActivity)) {
                        channelAdminLogActivity.presentFragment(new ChatActivity(bundle), true);
                        return;
                    }
                    return;
                }
                if (j != UserConfig.getInstance(((BaseFragment) channelAdminLogActivity).currentAccount).getClientUserId()) {
                    Bundle bundleM = FBool.m(j, "user_id");
                    ChannelAdminLogActivity.access$5300(channelAdminLogActivity, bundleM, j);
                    ProfileActivity profileActivity = new ProfileActivity(bundleM, null);
                    profileActivity.setPlayProfileAnimation(0);
                    channelAdminLogActivity.presentFragment(profileActivity);
                }
            }

            @Override
            public final void needShowEffectOverlay(ChatActionCell chatActionCell, TLRPC.Document document, TLRPC.VideoSize videoSize) {
            }

            @Override
            public final void onTopicClick(ChatActionCell chatActionCell) {
            }
        }

        public ChatActivityAdapter(Context context) {
            new ArrayList();
            new ArrayList();
            this.mContext = context;
            setHasStableIds(true);
        }

        @Override
        public final int getItemCount() {
            return this.rowCount;
        }

        @Override
        public final long getItemId(int i) {
            if (i < this.messagesStartRow || i >= this.messagesEndRow) {
                return i == this.loadingUpRow ? 2L : 5L;
            }
            ArrayList arrayList = ChannelAdminLogActivity.this.filteredMessages;
            return ((MessageObject) arrayList.get((arrayList.size() - (i - this.messagesStartRow)) - 1)).stableId;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i < this.messagesStartRow || i >= this.messagesEndRow) {
                return 4;
            }
            ArrayList arrayList = ChannelAdminLogActivity.this.filteredMessages;
            return ((MessageObject) arrayList.get((arrayList.size() - (i - this.messagesStartRow)) - 1)).contentType;
        }

        @Override
        public final void notifyDataSetChanged() {
            updateRows(true);
            try {
                this.mObservable.notifyChanged();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void notifyItemChanged(int i) {
            updateRows(false);
            try {
                super.notifyItemChanged(i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void notifyItemMoved(int i, int i2) {
            updateRows(false);
            try {
                this.mObservable.notifyItemMoved(i, i2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void notifyItemRangeChanged(int i, int i2) {
            updateRows(false);
            try {
                this.mObservable.notifyItemRangeChanged(i, i2, null);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void notifyItemRangeInserted(int i, int i2) {
            updateRows(false);
            try {
                this.mObservable.notifyItemRangeInserted(i, i2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void notifyItemRangeRemoved(int i, int i2) {
            updateRows(false);
            try {
                this.mObservable.notifyItemRangeRemoved(i, i2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            boolean z2;
            int i2 = this.loadingUpRow;
            View view = viewHolder.itemView;
            if (i == i2) {
                ((ChatLoadingCell) view).setProgressVisible(true);
                return;
            }
            if (i < this.messagesStartRow || i >= this.messagesEndRow) {
                return;
            }
            ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
            ArrayList arrayList = channelAdminLogActivity.filteredMessages;
            MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - (i - this.messagesStartRow)) - 1);
            if (!(view instanceof ChatMessageCell)) {
                if (view instanceof ChatActionCell) {
                    ChatActionCell chatActionCell = (ChatActionCell) view;
                    chatActionCell.setMessageObject(messageObject);
                    chatActionCell.setAlpha(1.0f);
                    return;
                }
                return;
            }
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            chatMessageCell.isChat = true;
            int i3 = i + 1;
            int itemViewType = getItemViewType(i3);
            int itemViewType2 = getItemViewType(i - 1);
            if ((messageObject.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) || itemViewType != viewHolder.mItemViewType) {
                z = false;
            } else {
                MessageObject messageObject2 = (MessageObject) arrayList.get((arrayList.size() - (i3 - this.messagesStartRow)) - 1);
                z = messageObject2.isOutOwner() == messageObject.isOutOwner() && messageObject2.getFromChatId() == messageObject.getFromChatId() && Math.abs(messageObject2.messageOwner.date - messageObject.messageOwner.date) <= 300;
                if (z) {
                    TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
                    long topicId = tL_forumTopic == null ? MessageObject.getTopicId(((BaseFragment) channelAdminLogActivity).currentAccount, messageObject.messageOwner, true) : tL_forumTopic.id;
                    TLRPC.TL_forumTopic tL_forumTopic2 = messageObject2.replyToForumTopic;
                    if (topicId != (tL_forumTopic2 == null ? MessageObject.getTopicId(((BaseFragment) channelAdminLogActivity).currentAccount, messageObject2.messageOwner, true) : tL_forumTopic2.id)) {
                        z = false;
                    }
                }
            }
            if (itemViewType2 == viewHolder.mItemViewType) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(arrayList.size() - (i - this.messagesStartRow));
                boolean z3 = !(messageObject3.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject3.isOutOwner() == messageObject.isOutOwner() && messageObject3.getFromChatId() == messageObject.getFromChatId() && Math.abs(messageObject3.messageOwner.date - messageObject.messageOwner.date) <= 300;
                if (z3) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = messageObject.replyToForumTopic;
                    long topicId2 = tL_forumTopic3 == null ? MessageObject.getTopicId(((BaseFragment) channelAdminLogActivity).currentAccount, messageObject.messageOwner, true) : tL_forumTopic3.id;
                    TLRPC.TL_forumTopic tL_forumTopic4 = messageObject3.replyToForumTopic;
                    if (topicId2 != (tL_forumTopic4 == null ? MessageObject.getTopicId(((BaseFragment) channelAdminLogActivity).currentAccount, messageObject3.messageOwner, true) : tL_forumTopic4.id)) {
                        z2 = false;
                    }
                }
                z2 = z3;
            } else {
                z2 = false;
            }
            chatMessageCell.setMessageObject(messageObject, null, z, z2, false, false);
            chatMessageCell.setHighlighted(false);
            chatMessageCell.setHighlightedText(channelAdminLogActivity.searchQuery, false, false, -1);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View chatLoadingCell;
            View chatMessageCell;
            ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
            if (i == 0) {
                ArrayList arrayList = channelAdminLogActivity.chatMessageCellsCache;
                if (arrayList.isEmpty()) {
                    chatMessageCell = new ChatMessageCell(this.mContext, ((BaseFragment) channelAdminLogActivity).currentAccount, false, null, null);
                } else {
                    View view = (View) arrayList.get(0);
                    arrayList.remove(0);
                    chatMessageCell = view;
                }
                ChatMessageCell chatMessageCell2 = (ChatMessageCell) chatMessageCell;
                chatMessageCell2.setDelegate(new AnonymousClass1());
                chatMessageCell2.setAllowAssistant(true);
                chatLoadingCell = chatMessageCell;
            } else {
                Context context = this.mContext;
                if (i == 1) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, null, false);
                    anonymousClass2.setDelegate(new AnonymousClass3());
                    chatLoadingCell = anonymousClass2;
                } else if (i == 2) {
                    chatLoadingCell = new ChatUnreadCell(context, null);
                } else if (i == 10) {
                    ChatMessageUnsupportedCell chatMessageUnsupportedCell = new ChatMessageUnsupportedCell(context, ((BaseFragment) channelAdminLogActivity).resourceProvider);
                    chatMessageUnsupportedCell.setDelegate(new ChatActivity.AnonymousClass1(this, 20));
                    chatLoadingCell = chatMessageUnsupportedCell;
                } else {
                    chatLoadingCell = new ChatLoadingCell(context, null);
                }
            }
            return zzkl.m(chatLoadingCell, chatLoadingCell);
        }

        @Override
        public final void onViewAttachedToWindow(final RecyclerView.ViewHolder viewHolder) {
            final View view = viewHolder.itemView;
            if ((view instanceof ChatMessageCell) || (view instanceof ChatActionCell)) {
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public final boolean onPreDraw() {
                        View view2 = view;
                        view2.getViewTreeObserver().removeOnPreDrawListener(this);
                        ChatActivityAdapter chatActivityAdapter = ChatActivityAdapter.this;
                        int measuredHeight = ChannelAdminLogActivity.this.chatListView.getMeasuredHeight();
                        int top = view2.getTop();
                        view2.getBottom();
                        int i = top >= 0 ? 0 : -top;
                        int measuredHeight2 = view2.getMeasuredHeight();
                        if (measuredHeight2 > measuredHeight) {
                            measuredHeight2 = i + measuredHeight;
                        }
                        View view3 = viewHolder.itemView;
                        boolean z = view3 instanceof ChatMessageCell;
                        ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                        if (z) {
                            ((ChatMessageCell) view2).setVisiblePart(i, measuredHeight2 - i, (channelAdminLogActivity.contentView.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - channelAdminLogActivity.chatListView.getTop(), 0.0f, (view2.getY() + ((BaseFragment) channelAdminLogActivity).actionBar.getMeasuredHeight()) - channelAdminLogActivity.contentView.getBackgroundTranslationY(), channelAdminLogActivity.contentView.getMeasuredWidth(), channelAdminLogActivity.contentView.getBackgroundSizeY(), 0, 0, 0);
                            return true;
                        }
                        if (!(view3 instanceof ChatActionCell) || ((BaseFragment) channelAdminLogActivity).actionBar == null || channelAdminLogActivity.contentView == null) {
                            return true;
                        }
                        ((ChatActionCell) view2).setVisiblePart((view2.getY() + ((BaseFragment) channelAdminLogActivity).actionBar.getMeasuredHeight()) - channelAdminLogActivity.contentView.getBackgroundTranslationY(), channelAdminLogActivity.contentView.getBackgroundSizeY());
                        return true;
                    }
                });
            }
            if (view instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                chatMessageCell.getMessageObject();
                chatMessageCell.setBackgroundDrawable(null);
                chatMessageCell.setCheckPressed(true, false);
                chatMessageCell.setHighlighted(false);
            }
        }

        public final void updateRows(boolean z) {
            this.rowCount = 0;
            ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
            ArrayList arrayList = channelAdminLogActivity.filteredMessages;
            if (arrayList.isEmpty()) {
                this.loadingUpRow = -1;
                this.messagesStartRow = -1;
                this.messagesEndRow = -1;
                return;
            }
            if (channelAdminLogActivity.endReached) {
                this.loadingUpRow = -1;
            } else {
                int i = this.rowCount;
                this.rowCount = i + 1;
                this.loadingUpRow = i;
            }
            int i2 = this.rowCount;
            this.messagesStartRow = i2;
            int size = arrayList.size() + i2;
            this.rowCount = size;
            this.messagesEndRow = size;
        }
    }

    public abstract class ChatActivityFragmentView extends SizeNotifierFrameLayout {
        public ChatActivityFragmentView(Context context) {
            super(context, null);
        }

        public final void drawList(Canvas canvas, RectF rectF) {
            boolean z;
            long jUptimeMillis = SystemClock.uptimeMillis();
            ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
            if (channelAdminLogActivity.chatListView.hasActiveEdgeEffects()) {
                canvas.save();
                canvas.clipRect(rectF);
                drawChild(canvas, channelAdminLogActivity.chatListView, jUptimeMillis);
                canvas.restore();
                return;
            }
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(0.0f, channelAdminLogActivity.chatListView.getY());
            channelAdminLogActivity.chatListView.getClass();
            for (int i = 0; i < channelAdminLogActivity.chatListView.getChildCount(); i++) {
                View childAt = channelAdminLogActivity.chatListView.getChildAt(i);
                if (rectF == null || channelAdminLogActivity.chatListView == null || childAt == null) {
                    z = false;
                } else {
                    RectF rectF2 = channelAdminLogActivity.tmpViewRectF;
                    rectF2.set(childAt.getX(), channelAdminLogActivity.chatListView.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), channelAdminLogActivity.chatListView.getY() + childAt.getY() + childAt.getHeight());
                    z = !rectF2.intersect(rectF);
                }
                if (!z) {
                    if (childAt instanceof ChatMessageCell) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                        if (chatMessageCell.drawBackgroundInParent()) {
                            canvas.save();
                            canvas.translate(0.0f, chatMessageCell.starsPriceTopPadding);
                            chatMessageCell.drawBackgroundInternal(canvas, true, false);
                            canvas.restore();
                        }
                        canvas.restore();
                        channelAdminLogActivity.chatListView.drawChild(canvas, childAt, jUptimeMillis);
                        if (chatMessageCell.hasOutboundsContent()) {
                            canvas.save();
                            canvas.translate(chatMessageCell.getX(), chatMessageCell.getY());
                            chatMessageCell.drawOutboundsContent(canvas);
                            canvas.restore();
                        }
                    } else if (childAt instanceof ChatActionCell) {
                        channelAdminLogActivity.chatListView.drawChild(canvas, childAt, jUptimeMillis);
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        ((ChatActionCell) childAt).drawOutboundsContent(canvas);
                        canvas.restore();
                    } else {
                        channelAdminLogActivity.chatListView.drawChild(canvas, childAt, jUptimeMillis);
                    }
                }
            }
            channelAdminLogActivity.chatListView.getClass();
            canvas.restore();
        }
    }

    public abstract class ChatListRecyclerView extends RecyclerListView {
    }

    public final class ChatScrollCallback extends zzdd {
        public int lastItemOffset;
        public MessageObject scrollTo;
        public int position = 0;
        public boolean bottom = true;
        public int offset = 0;

        public ChatScrollCallback() {
        }

        @Override
        public final void onEndAnimation() {
            MessageObject messageObject = this.scrollTo;
            ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
            if (messageObject != null) {
                int iIndexOf = channelAdminLogActivity.filteredMessages.indexOf(messageObject) + channelAdminLogActivity.chatAdapter.messagesStartRow;
                if (iIndexOf >= 0) {
                    channelAdminLogActivity.chatLayoutManager.scrollToPositionWithOffset(iIndexOf, this.lastItemOffset, false);
                }
            } else {
                channelAdminLogActivity.chatLayoutManager.scrollToPositionWithOffset(this.position, this.offset, this.bottom);
            }
            this.scrollTo = null;
            channelAdminLogActivity.checkTextureViewPosition = true;
            channelAdminLogActivity.updateVisibleRows();
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda174(this, 7));
        }

        @Override
        public final void onStartAnimation() {
            ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
            channelAdminLogActivity.scrollCallbackAnimationIndex = channelAdminLogActivity.getNotificationCenter().setAnimationInProgress(channelAdminLogActivity.scrollCallbackAnimationIndex, ChannelAdminLogActivity.allowedNotificationsDuringChatListAnimations);
        }

        @Override
        public final void recycleView(View view) {
            if (view instanceof ChatMessageCell) {
                ChannelAdminLogActivity.this.chatMessageCellsCache.add((ChatMessageCell) view);
            }
        }
    }

    public ChannelAdminLogActivity(TLRPC.Chat chat) {
        super(null);
        ReferenceList referenceList = new ReferenceList(true);
        this.glassAttachedViews = referenceList;
        this.chatMessageCellsCache = new ArrayList();
        this.mid = new int[]{2};
        this.scrollToPositionOnRecreate = -1;
        this.scrollToOffsetOnRecreate = 0;
        this.paused = true;
        this.wasPaused = false;
        this.messagesDict = new LongSparseArray();
        this.realMessagesDict = new LongSparseArray();
        this.messagesByDays = new HashMap();
        this.messages = new ArrayList();
        this.filteredMessages = new ArrayList();
        this.expandedEvents = new HashSet();
        this.currentFilter = null;
        this.searchQuery = "";
        this.notificationsLocker = new AnimationNotificationsLocker(allowedNotificationsDuringChatListAnimations);
        this.invitesCache = new HashMap();
        this.provider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                ChatActionCell chatActionCell;
                MessageObject messageObject2;
                ChatMessageCell chatMessageCell;
                MessageObject messageObject3;
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                int childCount = channelAdminLogActivity.chatListView.getChildCount();
                int i2 = 0;
                while (true) {
                    ImageReceiver photoImage = null;
                    if (i2 >= childCount) {
                        return null;
                    }
                    View childAt = channelAdminLogActivity.chatListView.getChildAt(i2);
                    if (!(childAt instanceof ChatMessageCell)) {
                        if ((childAt instanceof ChatActionCell) && (messageObject2 = (chatActionCell = (ChatActionCell) childAt).getMessageObject()) != null) {
                            if (messageObject == null) {
                                if (fileLocation != null && messageObject2.photoThumbs != null) {
                                    for (int i3 = 0; i3 < messageObject2.photoThumbs.size(); i3++) {
                                        TLRPC.FileLocation fileLocation2 = messageObject2.photoThumbs.get(i3).location;
                                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                                            photoImage = chatActionCell.getPhotoImage();
                                            break;
                                        }
                                    }
                                }
                            } else if (messageObject2.getId() == messageObject.getId()) {
                                photoImage = chatActionCell.getPhotoImage();
                            }
                        }
                    } else if (messageObject != null && (messageObject3 = (chatMessageCell = (ChatMessageCell) childAt).getMessageObject()) != null && messageObject3.getId() == messageObject.getId()) {
                        photoImage = chatMessageCell.getPhotoImage();
                    }
                    if (photoImage != null) {
                        int[] iArr = new int[2];
                        childAt.getLocationInWindow(iArr);
                        PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                        placeProviderObject.viewX = iArr[0];
                        placeProviderObject.viewY = iArr[1];
                        placeProviderObject.parentView = channelAdminLogActivity.chatListView;
                        placeProviderObject.imageReceiver = photoImage;
                        placeProviderObject.thumb = photoImage.getBitmapSafe();
                        placeProviderObject.radius = photoImage.getRoundRadius(true);
                        placeProviderObject.isEvent = true;
                        return placeProviderObject;
                    }
                    i2++;
                }
            }
        };
        this.filteredMessagesUpdatedPosition = new ArrayList();
        this.stableIdByEventExpand = new LongSparseArray();
        this.highlightMessageId = Integer.MAX_VALUE;
        this.highlightMessageQuoteOffset = -1;
        this.chatScrollHelperCallback = new ChatScrollCallback();
        this.savedScrollPosition = -1;
        this.glassDrawablesPositions = new ArrayList();
        this.glassDrawablesPositionsMerged = new ArrayList();
        this.tmpViewRectF = new RectF();
        BlurredBackgroundSourceWrapped blurredBackgroundSourceWrapped = new BlurredBackgroundSourceWrapped();
        this.navbarContentSourceWallpaper = blurredBackgroundSourceWrapped;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceWrapped);
        this.navbarContentDrawableFactory = blurredBackgroundDrawableViewFactory;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.scrollableViewNoiseSuppressor = null;
            this.recommendedAdditionalSizeY = 0;
            this.glassBackgroundSourceRenderNode = null;
            this.glassBackgroundSourceFrostedRenderNode = null;
            this.glassBackgroundDrawableFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceWrapped);
            this.glassBackgroundDrawableFactoryFrosted = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceWrapped);
        } else {
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            this.scrollableViewNoiseSuppressor = downscaleScrollableNoiseSuppressor;
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(blurredBackgroundSourceWrapped);
            this.glassBackgroundSourceFrostedRenderNode = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.onDrawablesRelativePositionChangeListener = new ChannelAdminLogActivity$$ExternalSyntheticLambda7(this, 0);
            blurredBackgroundSourceRenderNode.scrollableNoiseSuppressor = downscaleScrollableNoiseSuppressor;
            blurredBackgroundSourceRenderNode.scrollableNoiseSuppressorIndex = -3;
            blurredBackgroundSourceRenderNode.underSource = blurredBackgroundSourceWrapped;
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.glassBackgroundDrawableFactoryFrosted = blurredBackgroundDrawableViewFactory2;
            blurredBackgroundDrawableViewFactory2.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = new BlurredBackgroundSourceRenderNode(blurredBackgroundSourceWrapped);
                this.glassBackgroundSourceRenderNode = blurredBackgroundSourceRenderNode2;
                blurredBackgroundSourceRenderNode2.onDrawablesRelativePositionChangeListener = new ChannelAdminLogActivity$$ExternalSyntheticLambda7(this, 0);
                blurredBackgroundSourceRenderNode2.scrollableNoiseSuppressor = downscaleScrollableNoiseSuppressor;
                blurredBackgroundSourceRenderNode2.scrollableNoiseSuppressorIndex = -2;
                blurredBackgroundSourceRenderNode2.underSource = blurredBackgroundSourceWrapped;
                BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory3 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode2);
                this.glassBackgroundDrawableFactory = blurredBackgroundDrawableViewFactory3;
                blurredBackgroundDrawableViewFactory3.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
                this.recommendedAdditionalSizeY = 0;
            } else {
                this.glassBackgroundSourceRenderNode = null;
                this.glassBackgroundDrawableFactory = blurredBackgroundDrawableViewFactory2;
                this.recommendedAdditionalSizeY = AndroidUtilities.dp(48.0f);
            }
        }
        blurredBackgroundDrawableViewFactory.linkedViews = referenceList;
        this.glassBackgroundDrawableFactory.linkedViews = referenceList;
        this.glassBackgroundDrawableFactoryFrosted.linkedViews = referenceList;
        this.currentChat = chat;
    }

    public static void access$5300(ChannelAdminLogActivity channelAdminLogActivity, Bundle bundle, long j) {
        TLRPC.Chat chat = channelAdminLogActivity.currentChat;
        if (chat.megagroup && channelAdminLogActivity.admins != null && ChatObject.canBlockUsers(chat)) {
            for (int i = 0; i < channelAdminLogActivity.admins.size(); i++) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) channelAdminLogActivity.admins.get(i);
                if (MessageObject.getPeerId(channelParticipant.peer) == j) {
                    if (channelParticipant.can_edit) {
                        break;
                    } else {
                        return;
                    }
                }
            }
            bundle.putLong("ban_chat_id", chat.id);
        }
    }

    public static void access$6000(ChannelAdminLogActivity channelAdminLogActivity, MessageObject messageObject) {
        if (channelAdminLogActivity.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(channelAdminLogActivity.getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.AppName);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            alertDialog.message = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            alertDialog.message = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        channelAdminLogActivity.showDialog(alertDialog);
    }

    public static void access$8500(ChannelAdminLogActivity channelAdminLogActivity) {
        if (channelAdminLogActivity.chatListView == null || channelAdminLogActivity.messages.isEmpty()) {
            return;
        }
        StickersActivity.AnonymousClass2 anonymousClass2 = channelAdminLogActivity.chatLayoutManager;
        anonymousClass2.scrollToPositionWithOffset(channelAdminLogActivity.filteredMessages.size() - 1, (-100000) - channelAdminLogActivity.chatListView.getPaddingTop(), anonymousClass2.mShouldReverseLayout);
    }

    public static ProfileActivity.ShowDrawable findDrawable(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (ColoredImageSpan coloredImageSpan : (ColoredImageSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), ColoredImageSpan.class)) {
            if (coloredImageSpan != null) {
                Drawable drawable = coloredImageSpan.drawable;
                if (drawable instanceof ProfileActivity.ShowDrawable) {
                    return (ProfileActivity.ShowDrawable) drawable;
                }
            }
        }
        return null;
    }

    public static void setupExpandButton(MessageObject messageObject, int i) {
        if (messageObject == null) {
            return;
        }
        if (i <= 0) {
            TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = messageObject.messageOwner.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            messageObject.messageOwner.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = LocaleController.formatPluralString("EventLogExpandMore", i, new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        messageObject.measureInlineBotButtons();
    }

    public final MessageObject actionMessagesDeletedBy(long j, long j2, ArrayList arrayList, boolean z, boolean z2) {
        MessageObject messageObject;
        int i = 1;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.filteredMessages;
            if (i2 >= arrayList2.size()) {
                messageObject = null;
                break;
            }
            messageObject = (MessageObject) arrayList2.get(i2);
            if (messageObject != null && messageObject.contentType == 1 && messageObject.actionDeleteGroupEventId == j) {
                break;
            }
            i2++;
        }
        if (messageObject == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.currentChat.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e) {
                FileLog.e(e);
            }
            messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j2));
        messageObject.contentType = 1;
        if (!z2 || arrayList.size() <= 1) {
            messageObject.actionDeleteGroupEventId = -1L;
        } else {
            messageObject.actionDeleteGroupEventId = j;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(z2 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", arrayList.size(), TextUtils.join(", ", Collection.EL.stream(arrayList).map(new GroupCallSheet$$ExternalSyntheticLambda3(2)).distinct().map(new Function() {
            public final Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l = (Long) obj;
                ChannelAdminLogActivity channelAdminLogActivity = this.f$0;
                channelAdminLogActivity.getClass();
                if (l.longValue() >= 0) {
                    return UserObject.getForcedFirstName(channelAdminLogActivity.getMessagesController().getUser(l));
                }
                TLRPC.Chat chat = channelAdminLogActivity.getMessagesController().getChat(Long.valueOf(-l.longValue()));
                if (chat == null) {
                    return null;
                }
                return chat.title;
            }

            public final Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new GiftSheet$$ExternalSyntheticLambda20(i)).limit(4L).toArray())), "un1", user));
        if (z2 && arrayList.size() > 1) {
            ProfileActivity.ShowDrawable showDrawableFindDrawable = findDrawable(messageObject.messageText);
            if (showDrawableFindDrawable == null) {
                showDrawableFindDrawable = new ProfileActivity.ShowDrawable(LocaleController.getString(z ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow));
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = showDrawableFindDrawable.textDrawable;
                animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.bold());
                animatedTextDrawable.setTextSize(AndroidUtilities.dp(10.0f));
                if (showDrawableFindDrawable.textColor != -1) {
                    showDrawableFindDrawable.textColor = -1;
                    showDrawableFindDrawable.invalidateSelf();
                }
                showDrawableFindDrawable.setBackgroundColor(503316480);
            } else {
                showDrawableFindDrawable.textDrawable.setText(LocaleController.getString(z ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow), false, true);
            }
            showDrawableFindDrawable.setBounds(0, 0, showDrawableFindDrawable.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new ColoredImageSpan(0, showDrawableFindDrawable), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject.messageText = spannableStringBuilder;
        MessageObject messageObject2 = arrayList.size() > 0 ? (MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList) : null;
        if (messageObject2 != null) {
            long j3 = messageObject2.eventId;
            LongSparseArray longSparseArray = this.stableIdByEventExpand;
            if (!longSparseArray.containsKey(j3)) {
                long j4 = messageObject2.eventId;
                int i3 = lastStableId;
                lastStableId = 1 + i3;
                longSparseArray.put(Integer.valueOf(i3), j4);
            }
            messageObject.stableId = ((Integer) longSparseArray.get(messageObject2.eventId)).intValue();
        }
        return messageObject;
    }

    public final void checkScrollForLoad(boolean z) {
        StickersActivity.AnonymousClass2 anonymousClass2 = this.chatLayoutManager;
        if (anonymousClass2 == null || this.paused) {
            return;
        }
        int iFindFirstVisibleItemPosition = anonymousClass2.findFirstVisibleItemPosition();
        if ((iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(this.chatLayoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1) > 0) {
            this.chatAdapter.getClass();
            if (iFindFirstVisibleItemPosition > (z ? 4 : 1) || this.loading || this.endReached) {
                return;
            }
            loadMessages(false);
        }
    }

    public final boolean createMenu(View view, float f, float f2) {
        MessageObject messageObject;
        MessageObject messageObject2;
        boolean z;
        int i;
        byte b;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.Chat chat;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.User user;
        MessageObject messageObject3;
        long j;
        TLRPC.MessageMedia messageMedia;
        ChannelAdminLogActivity$$ExternalSyntheticLambda9 channelAdminLogActivity$$ExternalSyntheticLambda9;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction;
        TLRPC.Message message;
        TLRPC.User user2;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent3;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction2;
        TLRPC.TL_channelAdminLogEventActionChangeStickerSet tL_channelAdminLogEventActionChangeStickerSet;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.InputStickerSet inputStickerSet2;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction3;
        TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite;
        String str;
        if (!(view instanceof ChatMessageCell)) {
            if (view instanceof ChatActionCell) {
                messageObject2 = ((ChatActionCell) view).getMessageObject();
            } else {
                messageObject = null;
            }
            z = false;
            if (messageObject != null) {
                i = messageObject.type;
                if (i != 6) {
                    b = -1;
                } else if (i != 10 || i == 11 || i == 16) {
                    if (messageObject.getId() == 0) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                } else if (messageObject.isVoice()) {
                    b = 2;
                } else if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                    TLRPC.InputStickerSet inputStickerSet3 = messageObject.getInputStickerSet();
                    if (!(inputStickerSet3 instanceof TLRPC.TL_inputStickerSetID) ? !(!(inputStickerSet3 instanceof TLRPC.TL_inputStickerSetShortName) || MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(inputStickerSet3.short_name)) : !MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(inputStickerSet3.id)) {
                        b = 2;
                    } else {
                        b = 7;
                    }
                } else if ((!messageObject.isRoundVideo() || (messageObject.isRoundVideo() && BuildVars.DEBUG_VERSION)) && ((messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.getDocument() != null || messageObject.isMusic() || messageObject.isVideo())) {
                    String str2 = messageObject.messageOwner.attachPath;
                    boolean z2 = (str2 == null || str2.length() == 0 || !new File(messageObject.messageOwner.attachPath).exists()) ? false : true;
                    if (!z2 && getFileLoader().getPathToMessage(messageObject.messageOwner).exists()) {
                        z2 = true;
                    }
                    if (!z2) {
                        b = 2;
                    } else if (messageObject.getDocument() == null || (str = messageObject.getDocument().mime_type) == null) {
                        b = 4;
                    } else if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                        b = 10;
                    } else if (str.endsWith("/xml")) {
                        b = 5;
                    } else if (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) {
                        b = 6;
                    } else {
                        b = 4;
                    }
                } else if (messageObject.type == 12) {
                    b = 8;
                } else if (messageObject.isMediaEmpty()) {
                    b = 3;
                } else {
                    b = 2;
                }
                this.selectedObject = messageObject;
                if (getParentActivity() != null) {
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    chat = this.currentChat;
                    if (chat != null && (tL_channelAdminLogEvent4 = messageObject.currentEvent) != null) {
                        channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                        if (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                            tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction3;
                            if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                                InviteLinkBottomSheet inviteLinkBottomSheet = new InviteLinkBottomSheet(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().getChatFull(chat.id), null, this, chat.id, false, ChatObject.isChannelAndNotMegaGroup(chat));
                                inviteLinkBottomSheet.canEdit = false;
                                inviteLinkBottomSheet.show();
                                return true;
                            }
                        }
                    }
                    tL_channelAdminLogEvent = messageObject.currentEvent;
                    if (tL_channelAdminLogEvent != null || ((!(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || tL_channelAdminLogEvent.user_id != getMessagesController().telegramAntispamUserId) && !(messageObject.currentEvent.action instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam))) {
                        user = null;
                    } else {
                        if (view instanceof ChatActionCell) {
                            SpannableString spannableString = new SpannableString(">");
                            Drawable drawableMutate = getParentActivity().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                            drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_undo_cancelColor), PorterDuff.Mode.MULTIPLY));
                            drawableMutate.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                            spannableString.setSpan(new ImageSpan(drawableMutate, 2), 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EventLogFilterGroupInfo)).append((CharSequence) "\u2009").append((CharSequence) spannableString).append((CharSequence) "\u2009").append((CharSequence) LocaleController.getString(R.string.ChannelAdministrators));
                            spannableStringBuilder.setSpan(new ChatActivity.AnonymousClass102(this, 2), 0, spannableStringBuilder.length(), 33);
                            Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(this).createSimpleBulletin(LocaleController.getString(R.string.ChannelAntiSpamUser), AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.ChannelAntiSpamInfo2), spannableStringBuilder), R.raw.msg_antispam);
                            bulletinCreateSimpleBulletin.duration = 5000;
                            bulletinCreateSimpleBulletin.show();
                            return true;
                        }
                        arrayList.add(LocaleController.getString(R.string.ReportFalsePositive));
                        zzlo.m(R.drawable.msg_notspam, 34, arrayList3, arrayList2);
                        user = null;
                        arrayList.add(null);
                        arrayList3.add(null);
                        arrayList2.add(null);
                    }
                    messageObject3 = this.selectedObject;
                    if (messageObject3.type != 0 || messageObject3.caption != null) {
                        arrayList.add(LocaleController.getString(R.string.Copy));
                        zzlo.m(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                    }
                    if (b == 1) {
                        tL_channelAdminLogEvent3 = this.selectedObject.currentEvent;
                        if (tL_channelAdminLogEvent3 != null) {
                            channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                            if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                                inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                                if (inputStickerSet != null || (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                    inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                }
                                inputStickerSet2 = inputStickerSet;
                                if (inputStickerSet2 != null) {
                                    showDialog(new StickersAlert(getParentActivity(), this, inputStickerSet2, null, null, null));
                                    return true;
                                }
                            } else if (tL_channelAdminLogEvent3 == null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                                GroupStickersActivity groupStickersActivity = new GroupStickersActivity(chat.id, 0);
                                TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.id);
                                if (chatFull != null) {
                                    groupStickersActivity.setInfo(chatFull);
                                    presentFragment(groupStickersActivity);
                                }
                            } else if (tL_channelAdminLogEvent3 != null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && ChatObject.canUserDoAdminAction(chat, 13)) {
                                ClearHistoryAlert clearHistoryAlert = new ClearHistoryAlert(getParentActivity(), chat);
                                clearHistoryAlert.delegate = new AnonymousClass13();
                                showDialog(clearHistoryAlert);
                            }
                        } else if (tL_channelAdminLogEvent3 == null) {
                            if (tL_channelAdminLogEvent3 != null) {
                                ClearHistoryAlert clearHistoryAlert2 = new ClearHistoryAlert(getParentActivity(), chat);
                                clearHistoryAlert2.delegate = new AnonymousClass13();
                                showDialog(clearHistoryAlert2);
                            }
                        } else if (tL_channelAdminLogEvent3 != null) {
                            ClearHistoryAlert clearHistoryAlert3 = new ClearHistoryAlert(getParentActivity(), chat);
                            clearHistoryAlert3.delegate = new AnonymousClass13();
                            showDialog(clearHistoryAlert3);
                        }
                    } else if (b == 3) {
                        messageMedia = this.selectedObject.messageOwner.media;
                        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.isNewGifDocument(messageMedia.webpage.document)) {
                            arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                            zzlo.m(R.drawable.msg_gif, 11, arrayList3, arrayList2);
                        }
                    } else if (b == 4) {
                        if (this.selectedObject.isVideo()) {
                            arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                            zzlo.m(R.drawable.msg_gallery, 4, arrayList3, arrayList2);
                            arrayList.add(LocaleController.getString(R.string.ShareFile));
                            zzlo.m(R.drawable.msg_share, 6, arrayList3, arrayList2);
                        } else if (this.selectedObject.isMusic()) {
                            arrayList.add(LocaleController.getString(R.string.SaveToMusic));
                            zzlo.m(R.drawable.msg_download, 10, arrayList3, arrayList2);
                            arrayList.add(LocaleController.getString(R.string.ShareFile));
                            zzlo.m(R.drawable.msg_share, 6, arrayList3, arrayList2);
                        } else if (this.selectedObject.getDocument() != null) {
                            if (MessageObject.isNewGifDocument(this.selectedObject.getDocument())) {
                                arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                                zzlo.m(R.drawable.msg_gif, 11, arrayList3, arrayList2);
                            }
                            arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                            zzlo.m(R.drawable.msg_download, 10, arrayList3, arrayList2);
                            arrayList.add(LocaleController.getString(R.string.ShareFile));
                            zzlo.m(R.drawable.msg_share, 6, arrayList3, arrayList2);
                        } else {
                            arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                            zzlo.m(R.drawable.msg_gallery, 4, arrayList3, arrayList2);
                        }
                    } else if (b == 5) {
                        arrayList.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                        zzlo.m(R.drawable.msg_language, 5, arrayList3, arrayList2);
                        arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                        zzlo.m(R.drawable.msg_download, 10, arrayList3, arrayList2);
                        arrayList.add(LocaleController.getString(R.string.ShareFile));
                        zzlo.m(R.drawable.msg_share, 6, arrayList3, arrayList2);
                    } else if (b == 10) {
                        arrayList.add(LocaleController.getString(R.string.ApplyThemeFile));
                        zzlo.m(R.drawable.msg_theme, 5, arrayList3, arrayList2);
                        arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                        zzlo.m(R.drawable.msg_download, 10, arrayList3, arrayList2);
                        arrayList.add(LocaleController.getString(R.string.ShareFile));
                        zzlo.m(R.drawable.msg_share, 6, arrayList3, arrayList2);
                    } else if (b == 6) {
                        arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                        zzlo.m(R.drawable.msg_gallery, 7, arrayList3, arrayList2);
                        arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                        zzlo.m(R.drawable.msg_download, 10, arrayList3, arrayList2);
                        arrayList.add(LocaleController.getString(R.string.ShareFile));
                        zzlo.m(R.drawable.msg_share, 6, arrayList3, arrayList2);
                    } else if (b == 7) {
                        if (this.selectedObject.isMask()) {
                            arrayList.add(LocaleController.getString(R.string.AddToMasks));
                        } else {
                            arrayList.add(LocaleController.getString(R.string.AddToStickers));
                        }
                        zzlo.m(R.drawable.msg_sticker, 9, arrayList3, arrayList2);
                    } else if (b == 8) {
                        j = this.selectedObject.messageOwner.media.user_id;
                        if (j != 0) {
                            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                        }
                        if (user != null && user.id != UserConfig.getInstance(this.currentAccount).getClientUserId() && ContactsController.getInstance(this.currentAccount).contactsDict.get(Long.valueOf(user.id)) == null) {
                            arrayList.add(LocaleController.getString(R.string.AddContactTitle));
                            zzlo.m(R.drawable.msg_addcontact, 15, arrayList3, arrayList2);
                        }
                        if (!TextUtils.isEmpty(this.selectedObject.messageOwner.media.phone_number)) {
                            arrayList.add(LocaleController.getString(R.string.Copy));
                            zzlo.m(R.drawable.msg_copy, 16, arrayList3, arrayList2);
                            arrayList.add(LocaleController.getString(R.string.Call));
                            zzlo.m(R.drawable.msg_calls, 17, arrayList3, arrayList2);
                        }
                    }
                    channelAdminLogActivity$$ExternalSyntheticLambda9 = new ChannelAdminLogActivity$$ExternalSyntheticLambda9(this, arrayList2, arrayList, arrayList3, view, f, f2);
                    if (ChatObject.canBlockUsers(chat) && (tL_channelAdminLogEvent2 = messageObject.currentEvent) != null) {
                        channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                        if (((channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = messageObject.messageOwner) != null && message.from_id != null && (user2 = getMessagesController().getUser(Long.valueOf(this.selectedObject.messageOwner.from_id.user_id))) != null && !UserObject.isUserSelf(user2)) {
                            getMessagesController().getChannelParticipant(chat, user2, new ChatActivity$$ExternalSyntheticLambda155(this, arrayList, arrayList3, arrayList2, channelAdminLogActivity$$ExternalSyntheticLambda9, 1));
                            z = true;
                        }
                    }
                    if (!z) {
                        channelAdminLogActivity$$ExternalSyntheticLambda9 = channelAdminLogActivity$$ExternalSyntheticLambda9;
                        channelAdminLogActivity$$ExternalSyntheticLambda9.run();
                    }
                    channelAdminLogActivity$$ExternalSyntheticLambda9 = channelAdminLogActivity$$ExternalSyntheticLambda9;
                    return true;
                }
            }
            return false;
        }
        messageObject2 = ((ChatMessageCell) view).getMessageObject();
        messageObject = messageObject2;
        z = false;
        if (messageObject != null) {
            i = messageObject.type;
            if (i != 6) {
                b = -1;
            } else if (i != 10) {
                if (messageObject.getId() == 0) {
                    b = -1;
                } else {
                    b = 1;
                }
            } else if (messageObject.getId() == 0) {
                b = -1;
            } else {
                b = 1;
            }
            this.selectedObject = messageObject;
            if (getParentActivity() != null) {
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                chat = this.currentChat;
                if (chat != null) {
                    channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                    if (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                        tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction3;
                        if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                            InviteLinkBottomSheet inviteLinkBottomSheet2 = new InviteLinkBottomSheet(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().getChatFull(chat.id), null, this, chat.id, false, ChatObject.isChannelAndNotMegaGroup(chat));
                            inviteLinkBottomSheet2.canEdit = false;
                            inviteLinkBottomSheet2.show();
                            return true;
                        }
                    }
                }
                tL_channelAdminLogEvent = messageObject.currentEvent;
                if (tL_channelAdminLogEvent != null) {
                    user = null;
                } else {
                    user = null;
                }
                messageObject3 = this.selectedObject;
                if (messageObject3.type != 0) {
                    arrayList.add(LocaleController.getString(R.string.Copy));
                    zzlo.m(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                } else {
                    arrayList.add(LocaleController.getString(R.string.Copy));
                    zzlo.m(R.drawable.msg_copy, 3, arrayList3, arrayList2);
                }
                if (b == 1) {
                    tL_channelAdminLogEvent3 = this.selectedObject.currentEvent;
                    if (tL_channelAdminLogEvent3 != null) {
                        channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                        if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                            tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                            inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                            if (inputStickerSet != null) {
                                inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                            } else {
                                inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                            }
                            inputStickerSet2 = inputStickerSet;
                            if (inputStickerSet2 != null) {
                                showDialog(new StickersAlert(getParentActivity(), this, inputStickerSet2, null, null, null));
                                return true;
                            }
                        } else if (tL_channelAdminLogEvent3 == null) {
                            if (tL_channelAdminLogEvent3 != null) {
                                ClearHistoryAlert clearHistoryAlert4 = new ClearHistoryAlert(getParentActivity(), chat);
                                clearHistoryAlert4.delegate = new AnonymousClass13();
                                showDialog(clearHistoryAlert4);
                            }
                        } else if (tL_channelAdminLogEvent3 != null) {
                            ClearHistoryAlert clearHistoryAlert5 = new ClearHistoryAlert(getParentActivity(), chat);
                            clearHistoryAlert5.delegate = new AnonymousClass13();
                            showDialog(clearHistoryAlert5);
                        }
                    } else if (tL_channelAdminLogEvent3 == null) {
                        if (tL_channelAdminLogEvent3 != null) {
                            ClearHistoryAlert clearHistoryAlert6 = new ClearHistoryAlert(getParentActivity(), chat);
                            clearHistoryAlert6.delegate = new AnonymousClass13();
                            showDialog(clearHistoryAlert6);
                        }
                    } else if (tL_channelAdminLogEvent3 != null) {
                        ClearHistoryAlert clearHistoryAlert7 = new ClearHistoryAlert(getParentActivity(), chat);
                        clearHistoryAlert7.delegate = new AnonymousClass13();
                        showDialog(clearHistoryAlert7);
                    }
                } else if (b == 3) {
                    messageMedia = this.selectedObject.messageOwner.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                        zzlo.m(R.drawable.msg_gif, 11, arrayList3, arrayList2);
                    }
                } else if (b == 4) {
                    if (this.selectedObject.isVideo()) {
                        arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                        zzlo.m(R.drawable.msg_gallery, 4, arrayList3, arrayList2);
                        arrayList.add(LocaleController.getString(R.string.ShareFile));
                        zzlo.m(R.drawable.msg_share, 6, arrayList3, arrayList2);
                    } else if (this.selectedObject.isMusic()) {
                        arrayList.add(LocaleController.getString(R.string.SaveToMusic));
                        zzlo.m(R.drawable.msg_download, 10, arrayList3, arrayList2);
                        arrayList.add(LocaleController.getString(R.string.ShareFile));
                        zzlo.m(R.drawable.msg_share, 6, arrayList3, arrayList2);
                    } else if (this.selectedObject.getDocument() != null) {
                        if (MessageObject.isNewGifDocument(this.selectedObject.getDocument())) {
                            arrayList.add(LocaleController.getString(R.string.SaveToGIFs));
                            zzlo.m(R.drawable.msg_gif, 11, arrayList3, arrayList2);
                        }
                        arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                        zzlo.m(R.drawable.msg_download, 10, arrayList3, arrayList2);
                        arrayList.add(LocaleController.getString(R.string.ShareFile));
                        zzlo.m(R.drawable.msg_share, 6, arrayList3, arrayList2);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                        zzlo.m(R.drawable.msg_gallery, 4, arrayList3, arrayList2);
                    }
                } else if (b == 5) {
                    arrayList.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                    zzlo.m(R.drawable.msg_language, 5, arrayList3, arrayList2);
                    arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                    zzlo.m(R.drawable.msg_download, 10, arrayList3, arrayList2);
                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                    zzlo.m(R.drawable.msg_share, 6, arrayList3, arrayList2);
                } else if (b == 10) {
                    arrayList.add(LocaleController.getString(R.string.ApplyThemeFile));
                    zzlo.m(R.drawable.msg_theme, 5, arrayList3, arrayList2);
                    arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                    zzlo.m(R.drawable.msg_download, 10, arrayList3, arrayList2);
                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                    zzlo.m(R.drawable.msg_share, 6, arrayList3, arrayList2);
                } else if (b == 6) {
                    arrayList.add(LocaleController.getString(R.string.SaveToGallery));
                    zzlo.m(R.drawable.msg_gallery, 7, arrayList3, arrayList2);
                    arrayList.add(LocaleController.getString(R.string.SaveToDownloads));
                    zzlo.m(R.drawable.msg_download, 10, arrayList3, arrayList2);
                    arrayList.add(LocaleController.getString(R.string.ShareFile));
                    zzlo.m(R.drawable.msg_share, 6, arrayList3, arrayList2);
                } else if (b == 7) {
                    if (this.selectedObject.isMask()) {
                        arrayList.add(LocaleController.getString(R.string.AddToMasks));
                    } else {
                        arrayList.add(LocaleController.getString(R.string.AddToStickers));
                    }
                    zzlo.m(R.drawable.msg_sticker, 9, arrayList3, arrayList2);
                } else if (b == 8) {
                    j = this.selectedObject.messageOwner.media.user_id;
                    if (j != 0) {
                        user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                    }
                    if (user != null) {
                        arrayList.add(LocaleController.getString(R.string.AddContactTitle));
                        zzlo.m(R.drawable.msg_addcontact, 15, arrayList3, arrayList2);
                    }
                    if (!TextUtils.isEmpty(this.selectedObject.messageOwner.media.phone_number)) {
                        arrayList.add(LocaleController.getString(R.string.Copy));
                        zzlo.m(R.drawable.msg_copy, 16, arrayList3, arrayList2);
                        arrayList.add(LocaleController.getString(R.string.Call));
                        zzlo.m(R.drawable.msg_calls, 17, arrayList3, arrayList2);
                    }
                }
                channelAdminLogActivity$$ExternalSyntheticLambda9 = new ChannelAdminLogActivity$$ExternalSyntheticLambda9(this, arrayList2, arrayList, arrayList3, view, f, f2);
                if (ChatObject.canBlockUsers(chat)) {
                    channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                        getMessagesController().getChannelParticipant(chat, user2, new ChatActivity$$ExternalSyntheticLambda155(this, arrayList, arrayList3, arrayList2, channelAdminLogActivity$$ExternalSyntheticLambda9, 1));
                        z = true;
                    } else {
                        getMessagesController().getChannelParticipant(chat, user2, new ChatActivity$$ExternalSyntheticLambda155(this, arrayList, arrayList3, arrayList2, channelAdminLogActivity$$ExternalSyntheticLambda9, 1));
                        z = true;
                    }
                }
                if (!z) {
                    channelAdminLogActivity$$ExternalSyntheticLambda9 = channelAdminLogActivity$$ExternalSyntheticLambda9;
                    channelAdminLogActivity$$ExternalSyntheticLambda9.run();
                }
                channelAdminLogActivity$$ExternalSyntheticLambda9 = channelAdminLogActivity$$ExternalSyntheticLambda9;
                return true;
            }
        }
        return false;
    }

    public final TextureView createTextureView(boolean z) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.roundVideoContainer == null) {
            AnonymousClass16 anonymousClass16 = new AnonymousClass16(getParentActivity());
            this.roundVideoContainer = anonymousClass16;
            anonymousClass16.setOutlineProvider(new RichEditor.AnonymousClass5(4));
            this.roundVideoContainer.setClipToOutline(true);
            this.roundVideoContainer.setWillNotDraw(false);
            this.roundVideoContainer.setVisibility(4);
            AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(getParentActivity());
            this.aspectRatioFrameLayout = aspectRatioFrameLayout;
            aspectRatioFrameLayout.setBackgroundColor(0);
            if (z) {
                this.roundVideoContainer.addView(this.aspectRatioFrameLayout, LayoutHelper.createFrame(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.videoTextureView = textureView;
            textureView.setOpaque(false);
            this.aspectRatioFrameLayout.addView(this.videoTextureView, LayoutHelper.createFrame(-1.0f, -1));
        }
        if (this.roundVideoContainer.getParent() == null) {
            AnonymousClass5 anonymousClass5 = this.contentView;
            AnonymousClass16 anonymousClass17 = this.roundVideoContainer;
            int i = AndroidUtilities.roundMessageSize;
            anonymousClass5.addView(anonymousClass17, 1, new FrameLayout.LayoutParams(i, i));
        }
        this.roundVideoContainer.setVisibility(4);
        this.aspectRatioFrameLayout.setDrawingReady(false);
        return this.videoTextureView;
    }

    @Override
    public final View createView(Context context) {
        float f;
        ArrayList arrayList = this.chatMessageCellsCache;
        if (arrayList.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                arrayList.add(new ChatMessageCell(context, this.currentAccount, false, null, null));
            }
        }
        this.searchWas = false;
        this.hasOwnBackground = true;
        Theme.createChatResources(context);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        zzkt.m(this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 19));
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false, null);
        this.avatarContainer = chatAvatarContainer;
        ChatAvatarContainer.SimpleTextConnectedView simpleTextConnectedView = chatAvatarContainer.titleTextView;
        if (simpleTextConnectedView != null) {
            simpleTextConnectedView.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        ChatAvatarContainer.SimpleTextConnectedView simpleTextConnectedView2 = chatAvatarContainer.subtitleTextView;
        if (simpleTextConnectedView2 != null) {
            simpleTextConnectedView2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        chatAvatarContainer.glassMode = true;
        this.avatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 2);
        this.searchItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.searchItem.setSearchPaddingStart(7);
        this.avatarContainer.setEnabled(false);
        ChatAvatarContainer chatAvatarContainer2 = this.avatarContainer;
        TLRPC.Chat chat = this.currentChat;
        chatAvatarContainer2.setTitle(chat.title);
        this.avatarContainer.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.avatarContainer.setChatAvatar(chat);
        ?? r3 = new ChatActivityFragmentView(context) {
            public final WallpaperBitmapProvider wallpaperBitmapProvider = new WallpaperBitmapProvider();

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                AvatarPreviewer avatarPreviewer = AvatarPreviewer.INSTANCE;
                if (avatarPreviewer == null || !avatarPreviewer.visible) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                AvatarPreviewer.AnonymousClass1 anonymousClass1 = (AvatarPreviewer.AnonymousClass1) AvatarPreviewer.getInstance().layout;
                if (anonymousClass1 == null) {
                    return true;
                }
                anonymousClass1.onTouchEvent(motionEvent);
                return true;
            }

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject == null || !playingMessageObject.isRoundVideo() || playingMessageObject.eventId == 0) {
                    return;
                }
                long dialogId = playingMessageObject.getDialogId();
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                if (dialogId == (-channelAdminLogActivity.currentChat.id)) {
                    MediaController.getInstance().setTextureView(channelAdminLogActivity.createTextureView(false), channelAdminLogActivity.aspectRatioFrameLayout, channelAdminLogActivity.roundVideoContainer, true);
                }
            }

            @Override
            public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int paddingTop;
                int measuredHeight;
                int childCount = getChildCount();
                int i11 = 0;
                while (true) {
                    ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                    if (i11 >= childCount) {
                        channelAdminLogActivity.updateMessagesVisiblePart();
                        notifyHeightChanged();
                        return;
                    }
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        int i12 = layoutParams.gravity;
                        if (i12 == -1) {
                            i12 = 51;
                        }
                        int i13 = i12 & 112;
                        int i14 = i12 & 7;
                        if (i14 != 1) {
                            if (i14 != 5) {
                                i8 = layoutParams.leftMargin;
                            } else {
                                i6 = i4 - measuredWidth;
                                i7 = layoutParams.rightMargin;
                            }
                            if (i13 != 16) {
                                if (i13 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop();
                                    if (childAt != ((BaseFragment) channelAdminLogActivity).actionBar && ((BaseFragment) channelAdminLogActivity).actionBar.getVisibility() == 0) {
                                        paddingTop += ((BaseFragment) channelAdminLogActivity).actionBar.getMeasuredHeight();
                                    }
                                } else if (i13 != 80) {
                                    paddingTop = layoutParams.topMargin;
                                } else {
                                    i9 = (i5 - i3) - measuredHeight2;
                                    i10 = layoutParams.bottomMargin;
                                }
                                if (childAt == channelAdminLogActivity.emptyViewContainer) {
                                    int iDp = AndroidUtilities.dp(24.0f);
                                    if (((BaseFragment) channelAdminLogActivity).actionBar.getVisibility() == 0) {
                                        measuredHeight = ((BaseFragment) channelAdminLogActivity).actionBar.getMeasuredHeight() / 2;
                                    } else {
                                        measuredHeight = 0;
                                    }
                                    paddingTop -= iDp - measuredHeight;
                                } else if (childAt == ((BaseFragment) channelAdminLogActivity).actionBar) {
                                    paddingTop -= getPaddingTop();
                                } else if (childAt != this.backgroundView || childAt == channelAdminLogActivity.chatActivityFadeView) {
                                    paddingTop = 0;
                                } else if (childAt == channelAdminLogActivity.chatListView) {
                                    paddingTop = -channelAdminLogActivity.recommendedAdditionalSizeY;
                                }
                                childAt.layout(i8, paddingTop, measuredWidth + i8, measuredHeight2 + paddingTop);
                            } else {
                                i9 = (((i5 - i3) - measuredHeight2) / 2) + layoutParams.topMargin;
                                i10 = layoutParams.bottomMargin;
                            }
                            paddingTop = i9 - i10;
                            if (childAt == channelAdminLogActivity.emptyViewContainer) {
                                int iDp2 = AndroidUtilities.dp(24.0f);
                                if (((BaseFragment) channelAdminLogActivity).actionBar.getVisibility() == 0) {
                                    measuredHeight = ((BaseFragment) channelAdminLogActivity).actionBar.getMeasuredHeight() / 2;
                                } else {
                                    measuredHeight = 0;
                                }
                                paddingTop -= iDp2 - measuredHeight;
                            } else if (childAt == ((BaseFragment) channelAdminLogActivity).actionBar) {
                                paddingTop -= getPaddingTop();
                            } else if (childAt != this.backgroundView) {
                                paddingTop = 0;
                            } else {
                                paddingTop = 0;
                            }
                            childAt.layout(i8, paddingTop, measuredWidth + i8, measuredHeight2 + paddingTop);
                        } else {
                            i6 = (((i4 - i2) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i7 = layoutParams.rightMargin;
                        }
                        i8 = i6 - i7;
                        if (i13 != 16) {
                            if (i13 != 48) {
                                paddingTop = layoutParams.topMargin + getPaddingTop();
                                if (childAt != ((BaseFragment) channelAdminLogActivity).actionBar) {
                                    paddingTop += ((BaseFragment) channelAdminLogActivity).actionBar.getMeasuredHeight();
                                }
                            } else if (i13 != 80) {
                                paddingTop = layoutParams.topMargin;
                            } else {
                                i9 = (i5 - i3) - measuredHeight2;
                                i10 = layoutParams.bottomMargin;
                            }
                            if (childAt == channelAdminLogActivity.emptyViewContainer) {
                                int iDp3 = AndroidUtilities.dp(24.0f);
                                if (((BaseFragment) channelAdminLogActivity).actionBar.getVisibility() == 0) {
                                    measuredHeight = ((BaseFragment) channelAdminLogActivity).actionBar.getMeasuredHeight() / 2;
                                } else {
                                    measuredHeight = 0;
                                }
                                paddingTop -= iDp3 - measuredHeight;
                            } else if (childAt == ((BaseFragment) channelAdminLogActivity).actionBar) {
                                paddingTop -= getPaddingTop();
                            } else if (childAt != this.backgroundView) {
                                paddingTop = 0;
                            } else {
                                paddingTop = 0;
                            }
                            childAt.layout(i8, paddingTop, measuredWidth + i8, measuredHeight2 + paddingTop);
                        } else {
                            i9 = (((i5 - i3) - measuredHeight2) / 2) + layoutParams.topMargin;
                            i10 = layoutParams.bottomMargin;
                        }
                        paddingTop = i9 - i10;
                        if (childAt == channelAdminLogActivity.emptyViewContainer) {
                            int iDp4 = AndroidUtilities.dp(24.0f);
                            if (((BaseFragment) channelAdminLogActivity).actionBar.getVisibility() == 0) {
                                measuredHeight = ((BaseFragment) channelAdminLogActivity).actionBar.getMeasuredHeight() / 2;
                            } else {
                                measuredHeight = 0;
                            }
                            paddingTop -= iDp4 - measuredHeight;
                        } else if (childAt == ((BaseFragment) channelAdminLogActivity).actionBar) {
                            paddingTop -= getPaddingTop();
                        } else if (childAt != this.backgroundView) {
                            paddingTop = 0;
                        } else {
                            paddingTop = 0;
                        }
                        childAt.layout(i8, paddingTop, measuredWidth + i8, measuredHeight2 + paddingTop);
                    }
                    i11++;
                }
            }

            @Override
            public final void onMeasure(int i2, int i3) {
                ViewGroup viewGroup;
                int iIndexOfChild;
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                OnPostDrawView onPostDrawView = channelAdminLogActivity.invalidateBlurredSourcesView;
                ViewParent parent = onPostDrawView.getParent();
                if ((parent instanceof ViewGroup) && (iIndexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(onPostDrawView)) >= 0 && iIndexOfChild != viewGroup.getChildCount() - 1) {
                    viewGroup.bringChildToFront(onPostDrawView);
                }
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                BlurredBackgroundSource blurredBackgroundSource = channelAdminLogActivity.navbarContentSourceWallpaper.sourceInternal;
                if (blurredBackgroundSource instanceof BlurredBackgroundSourceBitmap) {
                    BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = (BlurredBackgroundSourceBitmap) blurredBackgroundSource;
                    if (blurredBackgroundSourceBitmap.parentWidth != size || blurredBackgroundSourceBitmap.parentHeight != size2) {
                        blurredBackgroundSourceBitmap.parentWidth = size;
                        blurredBackgroundSourceBitmap.parentHeight = size2;
                        blurredBackgroundSourceBitmap.updateMatrix();
                    }
                }
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                measureChildWithMargins(((BaseFragment) channelAdminLogActivity).actionBar, i2, 0, i3, 0);
                int measuredHeight = ((BaseFragment) channelAdminLogActivity).actionBar.getMeasuredHeight();
                if (((BaseFragment) channelAdminLogActivity).actionBar.getVisibility() == 0) {
                    paddingTop -= measuredHeight;
                }
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) channelAdminLogActivity).actionBar) {
                        if (childAt == channelAdminLogActivity.chatListView || childAt == channelAdminLogActivity.progressView) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i3)) + (channelAdminLogActivity.recommendedAdditionalSizeY * 2), 1073741824));
                        } else if (childAt == channelAdminLogActivity.emptyViewContainer) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i2, 0, i3, 0);
                        }
                    }
                }
            }

            @Override
            public final void onUpdateBackgroundDrawable(Drawable drawable) {
                if (drawable instanceof MotionBackgroundDrawable) {
                    ((MotionBackgroundDrawable) drawable).setFastRenderAllowed();
                }
                WallpaperBitmapProvider wallpaperBitmapProvider = this.wallpaperBitmapProvider;
                BlurredBackgroundSource blurredBackgroundSourceUpdateSourceFromBackgroundViewDrawable = wallpaperBitmapProvider.updateSourceFromBackgroundViewDrawable(drawable);
                AndroidUtilities.computePerceivedBrightness(wallpaperBitmapProvider.getNavigationBarColor(blurredBackgroundSourceUpdateSourceFromBackgroundViewDrawable));
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                channelAdminLogActivity.navbarContentSourceWallpaper.sourceInternal = blurredBackgroundSourceUpdateSourceFromBackgroundViewDrawable;
                ChatActivityFadeView chatActivityFadeView = channelAdminLogActivity.chatActivityFadeView;
                if (chatActivityFadeView != null) {
                    chatActivityFadeView.invalidate();
                }
            }
        };
        this.fragmentView = r3;
        this.contentView = r3;
        OnPostDrawView onPostDrawView = new OnPostDrawView(context, new ChannelAdminLogActivity$$ExternalSyntheticLambda0(this));
        this.invalidateBlurredSourcesView = onPostDrawView;
        addView(onPostDrawView);
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.contentView);
        AnonymousClass5 anonymousClass5 = this.contentView;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.glassBackgroundDrawableFactory;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory.parent = anonymousClass5;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = this.glassBackgroundDrawableFactoryFrosted;
        blurredBackgroundDrawableViewFactory2.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory2.parent = anonymousClass5;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory3 = this.navbarContentDrawableFactory;
        blurredBackgroundDrawableViewFactory3.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory3.parent = anonymousClass5;
        anonymousClass5.setOccupyStatusBar(!AndroidUtilities.isTablet());
        setBackgroundImage(Theme.getCachedWallpaper());
        this.actionBar.setupGlass(blurredBackgroundDrawableViewFactory, BlurredBackgroundProviderImpl.topPanelChatActivity(this.resourceProvider), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.emptyViewContainer = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.emptyViewContainer, LayoutHelper.createFrame(-1, -2, 17));
        this.emptyViewContainer.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.emptyLayoutView = linearLayout;
        linearLayout.setBackground(new Theme.AnonymousClass7(this.emptyView, this.contentView, AndroidUtilities.dp(12.0f), Theme.chat_actionBackgroundPaint));
        this.emptyLayoutView.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.emptyImageView = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.emptyImageView.setImageResource(R.drawable.large_log_actions);
        this.emptyImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.emptyImageView.setVisibility(8);
        this.emptyLayoutView.addView(this.emptyImageView, LayoutHelper.createLinear(54, 54, 17, 16, 20, 16, -4));
        ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(context, 6);
        this.emptyView = anonymousClass9;
        anonymousClass9.setTextSize(1, 14.0f);
        this.emptyView.setGravity(17);
        ArticleViewer.AnonymousClass9 anonymousClass10 = this.emptyView;
        int i2 = Theme.key_chat_serviceText;
        anonymousClass10.setTextColor(Theme.getColor(null, i2, false));
        this.emptyView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.emptyLayoutView.addView(this.emptyView, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 0));
        this.emptyViewContainer.addView(this.emptyLayoutView, LayoutHelper.createFrame(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context);
        this.chatListView = anonymousClass7;
        anonymousClass7.setOnItemClickListener(new PhotoViewer.AnonymousClass18(this, 13));
        this.chatListView.setTag(1);
        this.chatListView.setVerticalScrollBarEnabled(true);
        AnonymousClass7 anonymousClass8 = this.chatListView;
        ChatActivityAdapter chatActivityAdapter = new ChatActivityAdapter(context);
        this.chatAdapter = chatActivityAdapter;
        anonymousClass8.setAdapter(chatActivityAdapter);
        this.chatListView.setClipToPadding(false);
        AnonymousClass7 anonymousClass11 = this.chatListView;
        int i3 = AndroidUtilities.statusBarHeight;
        int i4 = this.recommendedAdditionalSizeY;
        anonymousClass11.setPadding(0, AndroidUtilities.dp(4.0f) + ActionBar.getCurrentActionBarHeight() + i3 + i4, 0, AndroidUtilities.dp(60.0f) + i4 + AndroidUtilities.navigationBarHeight);
        AnonymousClass7 anonymousClass12 = this.chatListView;
        AnonymousClass9 anonymousClass13 = new AnonymousClass9(this.chatListView, this.resourceProvider);
        this.chatListItemAnimator = anonymousClass13;
        anonymousClass12.setItemAnimator(anonymousClass13);
        this.chatListItemAnimator.reversePositions = true;
        this.chatListView.setLayoutAnimation(null);
        StickersActivity.AnonymousClass2 anonymousClass2 = new StickersActivity.AnonymousClass2(this, 2);
        this.chatLayoutManager = anonymousClass2;
        anonymousClass2.setOrientation(1);
        StickersActivity.AnonymousClass2 anonymousClass3 = this.chatLayoutManager;
        anonymousClass3.assertNotInLayoutOrScroll(null);
        if (!anonymousClass3.mStackFromEnd) {
            anonymousClass3.mStackFromEnd = true;
            RecyclerView recyclerView = anonymousClass3.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
        this.chatListView.setLayoutManager(this.chatLayoutManager);
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.chatListView, this.chatLayoutManager);
        this.chatScrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.scrollListener = new ChannelAdminLogActivity$$ExternalSyntheticLambda0(this);
        recyclerAnimationScrollHelper.animationCallback = this.chatScrollHelperCallback;
        addView(this.chatListView, LayoutHelper.createFrame(-1.0f, -1));
        this.chatListView.setOnScrollListener(new ChatActivity.AnonymousClass53(this));
        int i5 = this.scrollToPositionOnRecreate;
        if (i5 != -1) {
            StickersActivity.AnonymousClass2 anonymousClass4 = this.chatLayoutManager;
            f = 60.0f;
            anonymousClass4.scrollToPositionWithOffset(i5, this.scrollToOffsetOnRecreate, anonymousClass4.mShouldReverseLayout);
            this.scrollToPositionOnRecreate = -1;
        } else {
            f = 60.0f;
        }
        ChatActivityFadeView chatActivityFadeView = new ChatActivityFadeView(context);
        this.chatActivityFadeView = chatActivityFadeView;
        chatActivityFadeView.setup(blurredBackgroundDrawableViewFactory3);
        this.chatActivityFadeView.setFadeZoneTop(AndroidUtilities.dp(2.0f) + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.chatActivityFadeView.setFadeHeightTop(AndroidUtilities.dp(f));
        this.chatActivityFadeView.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.chatActivityFadeView.setFadeHeightBottom(AndroidUtilities.dp(f));
        addView(this.chatActivityFadeView, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.progressView = frameLayout2;
        frameLayout2.setVisibility(4);
        addView(this.progressView, LayoutHelper.createFrame(-1, -1, 51));
        View view = new View(context);
        this.progressView2 = view;
        view.setBackground(new Theme.AnonymousClass7(this.progressView2, this.contentView, AndroidUtilities.dp(18.0f), Theme.chat_actionBackgroundPaint));
        this.progressView.addView(this.progressView2, LayoutHelper.createFrame(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.progressBar = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.progressBar.setProgressColor(Theme.getColor(null, i2, false));
        this.progressView.addView(this.progressBar, LayoutHelper.createFrame(32, 32, 17));
        ChatActionCell chatActionCell = new ChatActionCell(context, null, false);
        this.floatingDateView = chatActionCell;
        chatActionCell.setAlpha(0.0f);
        this.floatingDateView.setImportantForAccessibility(2);
        addView(this.floatingDateView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        addView(this.actionBar);
        Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
        ChatActivityChannelButtonsLayout chatActivityChannelButtonsLayout = new ChatActivityChannelButtonsLayout(context, resourcesProvider, BlurredBackgroundProviderImpl.bottomPanelChatActivity(resourcesProvider), blurredBackgroundDrawableViewFactory);
        this.bottomOverlayChat2 = chatActivityChannelButtonsLayout;
        chatActivityChannelButtonsLayout.setTotalVisibilityFactor(1.0f);
        this.bottomOverlayChat2.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.bottomOverlayChat2.showButton(4, true, false);
        ChatActivityChannelButtonsLayout chatActivityChannelButtonsLayout2 = this.bottomOverlayChat2;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = chatActivityChannelButtonsLayout2.blurredBackgroundDrawableViewFactory.create(chatActivityChannelButtonsLayout2, null, false);
        blurredBackgroundDrawableCreate.setColorProvider(chatActivityChannelButtonsLayout2.colorProvider);
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(22.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(6.0f));
        chatActivityChannelButtonsLayout2.containerDrawable = blurredBackgroundDrawableCreate;
        addView(this.bottomOverlayChat2, LayoutHelper.createFrame(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.bottomOverlayChatText = textView;
        final int i6 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ChannelAdminLogActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        ChannelAdminLogActivity channelAdminLogActivity = this.f$0;
                        if (channelAdminLogActivity.getParentActivity() != null) {
                            AdminLogFilterAlert2 adminLogFilterAlert2 = new AdminLogFilterAlert2(channelAdminLogActivity, channelAdminLogActivity.currentFilter, channelAdminLogActivity.selectedAdmins, channelAdminLogActivity.currentChat.megagroup);
                            adminLogFilterAlert2.setCurrentAdmins(channelAdminLogActivity.admins);
                            adminLogFilterAlert2.delegate = new ChannelAdminLogActivity$$ExternalSyntheticLambda0(channelAdminLogActivity);
                            channelAdminLogActivity.showDialog(adminLogFilterAlert2);
                            break;
                        }
                        break;
                    case 1:
                        ChannelAdminLogActivity channelAdminLogActivity2 = this.f$0;
                        AlertDialog.Builder builder = new AlertDialog.Builder(channelAdminLogActivity2.getParentActivity(), 0, null);
                        boolean z = channelAdminLogActivity2.currentChat.megagroup;
                        AlertDialog alertDialog = builder.alertDialog;
                        if (z) {
                            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        alertDialog.title = LocaleController.getString(R.string.EventLogInfoTitle);
                        channelAdminLogActivity2.showDialog(alertDialog);
                        break;
                    default:
                        ChannelAdminLogActivity channelAdminLogActivity3 = this.f$0;
                        if (channelAdminLogActivity3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(channelAdminLogActivity3.searchItem.getSearchField());
                            channelAdminLogActivity3.showDialog(AlertsCreator.createCalendarPickerDialog(channelAdminLogActivity3.getParentActivity(), new PhotoViewer$$ExternalSyntheticLambda156(channelAdminLogActivity3, 1), null).bottomSheet);
                            break;
                        }
                        break;
                }
            }
        });
        this.bottomOverlayChatText.setTextSize(1, 15.0f);
        this.bottomOverlayChatText.setTypeface(AndroidUtilities.bold());
        this.bottomOverlayChatText.setTextColor(Theme.getColor(null, Theme.key_chat_fieldOverlayText, false));
        this.bottomOverlayChatText.setText(LocaleController.getString(R.string.SETTINGS));
        this.bottomOverlayChatText.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.bottomOverlayChat2.getContainer().addView(this.bottomOverlayChatText, LayoutHelper.createFrame(-2, -2, 17));
        this.bottomOverlayChat2.wrapContentButtons.add(this.bottomOverlayChatText);
        this.bottomOverlayChat2.updateWrappingVisible(false);
        final int i7 = 1;
        this.bottomOverlayChat2.onClickListeners[4] = new View.OnClickListener(this) {
            public final ChannelAdminLogActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        ChannelAdminLogActivity channelAdminLogActivity = this.f$0;
                        if (channelAdminLogActivity.getParentActivity() != null) {
                            AdminLogFilterAlert2 adminLogFilterAlert2 = new AdminLogFilterAlert2(channelAdminLogActivity, channelAdminLogActivity.currentFilter, channelAdminLogActivity.selectedAdmins, channelAdminLogActivity.currentChat.megagroup);
                            adminLogFilterAlert2.setCurrentAdmins(channelAdminLogActivity.admins);
                            adminLogFilterAlert2.delegate = new ChannelAdminLogActivity$$ExternalSyntheticLambda0(channelAdminLogActivity);
                            channelAdminLogActivity.showDialog(adminLogFilterAlert2);
                            break;
                        }
                        break;
                    case 1:
                        ChannelAdminLogActivity channelAdminLogActivity2 = this.f$0;
                        AlertDialog.Builder builder = new AlertDialog.Builder(channelAdminLogActivity2.getParentActivity(), 0, null);
                        boolean z = channelAdminLogActivity2.currentChat.megagroup;
                        AlertDialog alertDialog = builder.alertDialog;
                        if (z) {
                            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        alertDialog.title = LocaleController.getString(R.string.EventLogInfoTitle);
                        channelAdminLogActivity2.showDialog(alertDialog);
                        break;
                    default:
                        ChannelAdminLogActivity channelAdminLogActivity3 = this.f$0;
                        if (channelAdminLogActivity3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(channelAdminLogActivity3.searchItem.getSearchField());
                            channelAdminLogActivity3.showDialog(AlertsCreator.createCalendarPickerDialog(channelAdminLogActivity3.getParentActivity(), new PhotoViewer$$ExternalSyntheticLambda156(channelAdminLogActivity3, 1), null).bottomSheet);
                            break;
                        }
                        break;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.searchContainer = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.searchContainer.setVisibility(4);
        this.searchContainer.setFocusable(true);
        this.searchContainer.setFocusableInTouchMode(true);
        this.searchContainer.setClickable(true);
        this.searchContainer.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        addView(this.searchContainer, LayoutHelper.createFrame(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.searchCalendarButton = imageView2;
        imageView2.setScaleType(scaleType);
        this.searchCalendarButton.setImageResource(R.drawable.msg_calendar);
        this.searchCalendarButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_searchPanelIcons, false), PorterDuff.Mode.MULTIPLY));
        this.searchContainer.addView(this.searchCalendarButton, LayoutHelper.createFrame(48, 48, 53));
        final int i8 = 2;
        this.searchCalendarButton.setOnClickListener(new View.OnClickListener(this) {
            public final ChannelAdminLogActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i8) {
                    case 0:
                        ChannelAdminLogActivity channelAdminLogActivity = this.f$0;
                        if (channelAdminLogActivity.getParentActivity() != null) {
                            AdminLogFilterAlert2 adminLogFilterAlert2 = new AdminLogFilterAlert2(channelAdminLogActivity, channelAdminLogActivity.currentFilter, channelAdminLogActivity.selectedAdmins, channelAdminLogActivity.currentChat.megagroup);
                            adminLogFilterAlert2.setCurrentAdmins(channelAdminLogActivity.admins);
                            adminLogFilterAlert2.delegate = new ChannelAdminLogActivity$$ExternalSyntheticLambda0(channelAdminLogActivity);
                            channelAdminLogActivity.showDialog(adminLogFilterAlert2);
                            break;
                        }
                        break;
                    case 1:
                        ChannelAdminLogActivity channelAdminLogActivity2 = this.f$0;
                        AlertDialog.Builder builder = new AlertDialog.Builder(channelAdminLogActivity2.getParentActivity(), 0, null);
                        boolean z = channelAdminLogActivity2.currentChat.megagroup;
                        AlertDialog alertDialog = builder.alertDialog;
                        if (z) {
                            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        alertDialog.title = LocaleController.getString(R.string.EventLogInfoTitle);
                        channelAdminLogActivity2.showDialog(alertDialog);
                        break;
                    default:
                        ChannelAdminLogActivity channelAdminLogActivity3 = this.f$0;
                        if (channelAdminLogActivity3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(channelAdminLogActivity3.searchItem.getSearchField());
                            channelAdminLogActivity3.showDialog(AlertsCreator.createCalendarPickerDialog(channelAdminLogActivity3.getParentActivity(), new PhotoViewer$$ExternalSyntheticLambda156(channelAdminLogActivity3, 1), null).bottomSheet);
                            break;
                        }
                        break;
                }
            }
        });
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.searchCountText = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_chat_searchPanelText, false));
        this.searchCountText.setTextSize(15);
        this.searchCountText.setTypeface(AndroidUtilities.bold());
        this.searchContainer.addView(this.searchCountText, LayoutHelper.createFrame(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.chatAdapter.updateRows(true);
        if (this.loading && this.messages.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.progressView, true, 0.3f, true);
            this.chatListView.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 0.3f, true);
            this.chatListView.setEmptyView(this.emptyViewContainer);
        }
        AnonymousClass7 anonymousClass14 = this.chatListView;
        anonymousClass14.animateEmptyView = true;
        anonymousClass14.emptyViewAnimationType = 1;
        UndoView undoView = new UndoView(context, null, false, null);
        this.undoView = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        addView(this.undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        updateEmptyPlaceholder();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ChatMessageCell chatMessageCell;
        MessageObject messageObject;
        ChatMessageCell chatMessageCell2;
        MessageObject messageObject2;
        ChatMessageCell chatMessageCell3;
        MessageObject messageObject3;
        boolean z;
        if (i == NotificationCenter.emojiLoaded) {
            AnonymousClass7 anonymousClass7 = this.chatListView;
            if (anonymousClass7 != null) {
                anonymousClass7.invalidateViews();
                return;
            }
            return;
        }
        if (i != NotificationCenter.messagePlayingDidStart) {
            if (i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.messagePlayingPlayStateChanged) {
                AnonymousClass7 anonymousClass8 = this.chatListView;
                if (anonymousClass8 != null) {
                    int childCount = anonymousClass8.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = this.chatListView.getChildAt(i3);
                        if ((childAt instanceof ChatMessageCell) && (messageObject = (chatMessageCell = (ChatMessageCell) childAt).getMessageObject()) != null) {
                            if (messageObject.isVoice() || messageObject.isMusic()) {
                                chatMessageCell.updateButtonState(false, true, false);
                            } else if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                chatMessageCell.checkVideoPlayback(null, true);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i != NotificationCenter.messagePlayingProgressDidChanged) {
                if (i != NotificationCenter.didSetNewWallpapper || this.fragmentView == null) {
                    return;
                }
                setBackgroundImage(Theme.getCachedWallpaper());
                this.progressView2.invalidate();
                ArticleViewer.AnonymousClass9 anonymousClass9 = this.emptyView;
                if (anonymousClass9 != null) {
                    anonymousClass9.invalidate();
                }
                this.chatListView.invalidateViews();
                return;
            }
            Integer num = (Integer) objArr[0];
            AnonymousClass7 anonymousClass10 = this.chatListView;
            if (anonymousClass10 != null) {
                int childCount2 = anonymousClass10.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = this.chatListView.getChildAt(i4);
                    if ((childAt2 instanceof ChatMessageCell) && (messageObject2 = (chatMessageCell2 = (ChatMessageCell) childAt2).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
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
        if (((MessageObject) objArr[0]).isRoundVideo()) {
            MediaController.getInstance().setTextureView(createTextureView(true), this.aspectRatioFrameLayout, this.roundVideoContainer, true);
            int childCount3 = this.chatListView.getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount3) {
                    z = false;
                    break;
                }
                View childAt3 = this.chatListView.getChildAt(i5);
                if (childAt3 instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell4 = (ChatMessageCell) childAt3;
                    MessageObject messageObject4 = chatMessageCell4.getMessageObject();
                    if (this.roundVideoContainer != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                        ImageReceiver photoImage = chatMessageCell4.getPhotoImage();
                        this.roundVideoContainer.setTranslationX(photoImage.getImageX());
                        this.roundVideoContainer.setTranslationY(photoImage.getImageY() + chatMessageCell4.getTop() + this.fragmentView.getPaddingTop());
                        this.fragmentView.invalidate();
                        this.roundVideoContainer.invalidate();
                        z = true;
                        break;
                    }
                }
                i5++;
            }
            if (this.roundVideoContainer != null) {
                MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                if (z) {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                } else {
                    this.roundVideoContainer.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject2 != null && playingMessageObject2.isRoundVideo() && (this.checkTextureViewPosition || PipRoundVideoView.instance != null)) {
                        MediaController.getInstance().setCurrentVideoVisible(false);
                    }
                }
            }
        }
        AnonymousClass7 anonymousClass11 = this.chatListView;
        if (anonymousClass11 != null) {
            int childCount4 = anonymousClass11.getChildCount();
            for (int i6 = 0; i6 < childCount4; i6++) {
                View childAt4 = this.chatListView.getChildAt(i6);
                if ((childAt4 instanceof ChatMessageCell) && (messageObject3 = (chatMessageCell3 = (ChatMessageCell) childAt4).getMessageObject()) != null) {
                    if (messageObject3.isVoice() || messageObject3.isMusic()) {
                        chatMessageCell3.updateButtonState(false, true, false);
                    } else if (messageObject3.isRoundVideo()) {
                        chatMessageCell3.checkVideoPlayback(null, false);
                        if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                            messageObject3.resetPlayingProgress();
                            chatMessageCell3.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void filterDeletedMessages() {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.filteredMessagesUpdatedPosition.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList3 = this.messages;
            if (i >= arrayList3.size()) {
                ArrayList arrayList4 = this.filteredMessages;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList3.get(i);
            long j = (messageObject == null || (tL_channelAdminLogEvent2 = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (messageObject.stableId <= 0) {
                int i2 = lastStableId;
                lastStableId = i2 + 1;
                messageObject.stableId = i2;
            }
            int i3 = i + 1;
            MessageObject messageObject2 = i3 < arrayList3.size() ? (MessageObject) arrayList3.get(i3) : null;
            long j2 = (messageObject2 == null || (tL_channelAdminLogEvent = messageObject2.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent.user_id;
            if (j != 0) {
                arrayList2.add(messageObject);
            } else {
                arrayList.add(messageObject);
            }
            if (j == j2 || arrayList2.isEmpty()) {
                arrayList2 = arrayList2;
            } else {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                boolean z = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList.size();
                ArrayList arrayList5 = new ArrayList();
                for (int size2 = arrayList2.size() - 1; size2 >= 0 && ((MessageObject) arrayList2.get(size2)).contentType == 1; size2--) {
                    arrayList5.add((MessageObject) arrayList2.remove(size2));
                }
                if (!arrayList2.isEmpty()) {
                    MessageObject messageObject3 = (MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList2);
                    boolean z2 = TextUtils.isEmpty(this.searchQuery) && arrayList2.size() > 3;
                    HashSet hashSet = this.expandedEvents;
                    if (hashSet.contains(Long.valueOf(messageObject3.eventId)) || !z2) {
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            setupExpandButton((MessageObject) arrayList2.get(i4), 0);
                        }
                        arrayList.addAll(arrayList2);
                    } else {
                        setupExpandButton(messageObject3, arrayList2.size() - 1);
                        arrayList.add(messageObject3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = messageObject3.messageOwner.reply_markup;
                    if (z != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        messageObject3.forceUpdate = true;
                        this.chatAdapter.notifyItemChanged((z ? arrayList2.size() - 1 : 0) + size);
                        this.chatAdapter.notifyItemChanged(size + (z ? arrayList2.size() - 1 : 0) + 1);
                    }
                    long j3 = messageObject.eventId;
                    arrayList.add(actionMessagesDeletedBy(j3, messageObject.currentEvent.user_id, arrayList2, hashSet.contains(Long.valueOf(j3)), z2));
                }
                if (!arrayList5.isEmpty()) {
                    MessageObject messageObject4 = (MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList5);
                    arrayList.addAll(arrayList5);
                    arrayList.add(actionMessagesDeletedBy(messageObject4.eventId, messageObject4.currentEvent.user_id, arrayList5, true, false));
                }
                arrayList2.clear();
            }
            i = i3;
            arrayList2 = arrayList2;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.fragmentView, 0, null, null, null, null, Theme.key_chat_wallpaper));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.chatListView, 32768, null, null, null, null, i));
        ActionBar actionBar2 = this.actionBar;
        int i2 = Theme.key_actionBarDefaultIcon;
        arrayList.add(new ThemeDescription(actionBar2, 64, null, null, null, null, i2));
        ActionBar actionBar3 = this.actionBar;
        int i3 = Theme.key_actionBarDefaultSelector;
        arrayList.add(new ThemeDescription(actionBar3, 256, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.actionBar, Integer.MIN_VALUE, null, null, null, null, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741824, null, null, null, null, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741832, null, null, null, null, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.chatListView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.avatarContainer.getTitleTextView(), 4, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.avatarContainer.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{Theme.chat_statusPaint, Theme.chat_statusRecordPaint}, Theme.key_actionBarDefaultSubtitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, i3));
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
        int i4 = Theme.key_chat_inBubbleShadow;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, shadowDrawables, null, i4));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgInMediaDrawable.getShadowDrawables(), null, i4));
        Drawable[] shadowDrawables2 = Theme.chat_msgOutDrawable.getShadowDrawables();
        int i5 = Theme.key_chat_outBubbleShadow;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, shadowDrawables2, null, i5));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgOutMediaDrawable.getShadowDrawables(), null, i5));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubble));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient1));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient2));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient3));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutSelectedDrawable, Theme.chat_msgOutMediaSelectedDrawable}, null, Theme.key_chat_outBubbleSelected));
        TextPaint textPaint = Theme.chat_actionTextPaint;
        int i6 = Theme.key_chat_serviceText;
        arrayList.add(new ThemeDescription(this.chatListView, 4, new Class[]{ChatActionCell.class}, textPaint, null, null, i6));
        arrayList.add(new ThemeDescription(this.chatListView, 2, new Class[]{ChatActionCell.class}, Theme.chat_actionTextPaint, null, null, Theme.key_chat_serviceLink));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_botCardDrawable, Theme.chat_shareIconDrawable, Theme.chat_botInlineDrawable, Theme.chat_botLinkDrawable, Theme.chat_goIconDrawable, Theme.chat_commentStickerDrawable}, null, Theme.key_chat_serviceIcon));
        int i7 = Theme.key_chat_serviceBackground;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class, ChatActionCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class, ChatActionCell.class}, null, null, null, Theme.key_chat_serviceBackgroundSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_messageTextIn));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_messageTextOut));
        arrayList.add(new ThemeDescription(this.chatListView, 2, new Class[]{ChatMessageCell.class}, (Paint[]) null, Theme.key_chat_messageLinkIn));
        arrayList.add(new ThemeDescription(this.chatListView, 2, new Class[]{ChatMessageCell.class}, (Paint[]) null, Theme.key_chat_messageLinkOut));
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
        int i8 = Theme.key_chat_outInstant;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, drawableArr, null, i8));
        Drawable[] drawableArr2 = {Theme.chat_msgInInstantDrawable, Theme.chat_commentDrawable, Theme.chat_commentArrowDrawable};
        int i9 = Theme.key_chat_inInstant;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, drawableArr2, null, i9));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgOutCallDrawable, null, i8));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgOutCallSelectedDrawable, null, Theme.key_chat_outInstantSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgInCallDrawable, null, i9));
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
        int i10 = Theme.key_chat_inReplyLine;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, i10));
        int i11 = Theme.key_chat_outReplyLine;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, i11));
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
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_urlPaint, null, null, i10));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_textSearchSelectionPaint, null, null, i11));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outLoader));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outMediaIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outLoaderSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outMediaIconSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inLoader));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inMediaIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inLoaderSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inMediaIconSelected));
        Drawable[] drawableArr3 = Theme.chat_contactDrawable;
        arrayList.add(new ThemeDescription(this.chatListView, 32, new Class[]{ChatMessageCell.class}, null, new Drawable[]{drawableArr3[0]}, null, Theme.key_chat_inContactBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{drawableArr3[0]}, null, Theme.key_chat_inContactIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 32, new Class[]{ChatMessageCell.class}, null, new Drawable[]{drawableArr3[1]}, null, Theme.key_chat_outContactBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{drawableArr3[1]}, null, Theme.key_chat_outContactIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inLocationBackground));
        Drawable[] drawableArr4 = Theme.chat_locationDrawable;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{drawableArr4[0]}, null, Theme.key_chat_inLocationIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{drawableArr4[1]}, null, Theme.key_chat_outLocationIcon));
        arrayList.add(new ThemeDescription(this.bottomOverlayChatText, 4, null, null, null, null, Theme.key_chat_fieldOverlayText));
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.progressBar, 2048, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.chatListView, 131072, new Class[]{ChatUnreadCell.class}, new String[]{"backgroundLayout"}, null, null, null, Theme.key_chat_unreadMessagesStartBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 8, new Class[]{ChatUnreadCell.class}, new String[]{"imageView"}, null, null, null, Theme.key_chat_unreadMessagesStartArrowIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 4, new Class[]{ChatUnreadCell.class}, new String[]{"textView"}, null, null, null, Theme.key_chat_unreadMessagesStartText));
        arrayList.add(new ThemeDescription(this.progressView2, 536870912, null, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.emptyView, 536870912, null, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.undoView, 32, null, null, null, null, Theme.key_undo_background));
        int i12 = Theme.key_undo_cancelColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i12));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i12));
        int i13 = Theme.key_undo_infoColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.undoView, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i13));
        return arrayList;
    }

    public final void hideFloatingDateView(boolean z) {
        if (this.floatingDateView.getTag() == null || this.currentFloatingDateOnScreen) {
            return;
        }
        if (!this.scrollingFloatingDate || this.currentFloatingTopIsNotMessage) {
            this.floatingDateView.setTag(null);
            if (!z) {
                AnimatorSet animatorSet = this.floatingDateAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.floatingDateAnimation = null;
                }
                this.floatingDateView.setAlpha(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.floatingDateAnimation = animatorSet2;
            animatorSet2.setDuration(150L);
            this.floatingDateAnimation.playTogether(ObjectAnimator.ofFloat(this.floatingDateView, "alpha", 0.0f));
            this.floatingDateAnimation.addListener(new ArticleViewer.AnonymousClass25(this, 21));
            this.floatingDateAnimation.setStartDelay(500L);
            this.floatingDateAnimation.start();
        }
    }

    public final void invalidateMergedVisibleBlurredPositionsAndSourcesImpl(int i) {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        int visiblePositions;
        RectF rectF;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        boolean zHasFlag = BitwiseUtils.hasFlag(i, 2);
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = this.glassBackgroundSourceRenderNode;
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = this.glassBackgroundSourceFrostedRenderNode;
        if (zHasFlag) {
            ArrayList arrayList = this.glassDrawablesPositionsMerged;
            ArrayList arrayList2 = this.glassDrawablesPositions;
            if (i2 >= 29) {
                if (blurredBackgroundSourceRenderNode2 != null) {
                    if (arrayList2.isEmpty()) {
                        rectF = new RectF();
                        arrayList2.add(rectF);
                    } else {
                        rectF = (RectF) arrayList2.get(0);
                    }
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), this.chatListView.getY() + this.chatListView.getPaddingTop());
                    rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                    visiblePositions = blurredBackgroundSourceRenderNode2.getVisiblePositions(1, AndroidUtilities.dp(48.0f), arrayList2) + 1;
                } else {
                    visiblePositions = 0;
                }
                if (blurredBackgroundSourceRenderNode != null) {
                    visiblePositions += blurredBackgroundSourceRenderNode.getVisiblePositions(visiblePositions, AndroidUtilities.dp(8.0f), arrayList2);
                }
            } else {
                visiblePositions = 0;
            }
            int iMergeOverlapping = FBool.mergeOverlapping(arrayList2, visiblePositions, arrayList);
            int measuredWidth = getMeasuredWidth();
            for (int i3 = 0; i3 < iMergeOverlapping; i3++) {
                RectF rectF2 = (RectF) arrayList.get(i3);
                float f = measuredWidth;
                rectF2.left = MathUtils.clamp(rectF2.left, 0.0f, f);
                rectF2.top = Math.max(this.chatListView.getY(), rectF2.top);
                rectF2.right = MathUtils.clamp(rectF2.right, 0.0f, f);
                rectF2.bottom = Math.min(this.chatListView.getY() + this.chatListView.getMeasuredHeight(), rectF2.bottom);
            }
            downscaleScrollableNoiseSuppressor.setupRenderNodes(iMergeOverlapping, arrayList);
        }
        AnonymousClass5 anonymousClass5 = this.contentView;
        Objects.requireNonNull(anonymousClass5);
        if (downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(new EmojiView$$ExternalSyntheticLambda18(anonymousClass5, 1), getWidth(), getHeight())) {
            if (blurredBackgroundSourceRenderNode != null) {
                blurredBackgroundSourceRenderNode.invalidateDisplayListForDrawables();
            }
            if (blurredBackgroundSourceRenderNode2 != null) {
                blurredBackgroundSourceRenderNode2.invalidateDisplayListForDrawables();
            }
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.invalidate();
            }
            invalidate();
            Iterator it = this.glassAttachedViews.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createMenu$13(int i, ArrayList arrayList, Integer num) {
        TLRPC.Chat chat;
        File file;
        TLRPC.User user;
        if (this.selectedObject == null || i >= arrayList.size()) {
            return;
        }
        int iIntValue = num.intValue();
        AnonymousClass15 anonymousClass15 = this.scrimPopupWindow;
        if (anonymousClass15 != null) {
            anonymousClass15.dismiss();
        }
        MessageObject messageObject = this.selectedObject;
        if (messageObject == null) {
            return;
        }
        if (iIntValue == 3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long fromChatId = messageObject.getFromChatId();
            if (0 != fromChatId) {
                if (fromChatId > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user2 != null) {
                        spannableStringBuilder.append((CharSequence) ContactsController.formatName(user2.first_name, user2.last_name)).append((CharSequence) ":\n");
                    }
                } else if (fromChatId < 0 && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId))) != null) {
                    spannableStringBuilder.append((CharSequence) chat.title).append((CharSequence) ":\n");
                }
            }
            if (TextUtils.isEmpty(messageObject.messageText)) {
                spannableStringBuilder.append((CharSequence) messageObject.messageOwner.message);
            } else {
                spannableStringBuilder.append(messageObject.messageText);
            }
            AndroidUtilities.addToClipboard(spannableStringBuilder);
            zzkn.m(R.string.MessageCopied, BulletinFactory.of(this));
        } else if (iIntValue == 4) {
            String string = messageObject.messageOwner.attachPath;
            if (string != null && string.length() > 0 && !ArticleViewer.IBlock.CC.m(string)) {
                string = null;
            }
            if (string == null || string.length() == 0) {
                string = getFileLoader().getPathToMessage(this.selectedObject.messageOwner).toString();
            }
            int i2 = this.selectedObject.type;
            if (i2 == 3 || i2 == 1) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 23 && ((i3 <= 28 || BuildVars.NO_SCOPED_STORAGE) && getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    this.selectedObject = null;
                    this.selectedParticipant = null;
                    return;
                }
                MediaController.saveFile(string, getParentActivity(), this.selectedObject.type == 3 ? 1 : 0, null, null);
            }
        } else if (iIntValue == 5) {
            String str = messageObject.messageOwner.attachPath;
            if (str == null || str.length() == 0) {
                file = null;
            } else {
                file = new File(this.selectedObject.messageOwner.attachPath);
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                File pathToMessage = getFileLoader().getPathToMessage(this.selectedObject.messageOwner);
                if (pathToMessage.exists()) {
                    file = pathToMessage;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    StickersActivity.AnonymousClass2 anonymousClass2 = this.chatLayoutManager;
                    if (anonymousClass2 != null) {
                        if (anonymousClass2.findLastVisibleItemPosition() < this.chatLayoutManager.getItemCount() - 1) {
                            int iFindFirstVisibleItemPosition = this.chatLayoutManager.findFirstVisibleItemPosition();
                            this.scrollToPositionOnRecreate = iFindFirstVisibleItemPosition;
                            RecyclerListView.Holder holder = (RecyclerListView.Holder) this.chatListView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                            if (holder != null) {
                                this.scrollToOffsetOnRecreate = holder.itemView.getTop();
                            } else {
                                this.scrollToPositionOnRecreate = -1;
                            }
                        } else {
                            this.scrollToPositionOnRecreate = -1;
                        }
                    }
                    Theme.ThemeInfo themeInfoApplyThemeFile = Theme.applyThemeFile(file, this.selectedObject.getDocumentName(), null, true);
                    if (themeInfoApplyThemeFile != null) {
                        presentFragment(new ThemePreviewActivity(themeInfoApplyThemeFile));
                    } else {
                        this.scrollToPositionOnRecreate = -1;
                        if (getParentActivity() == null) {
                            this.selectedObject = null;
                            this.selectedParticipant = null;
                            return;
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                        String string2 = LocaleController.getString(R.string.AppName);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string2;
                        alertDialog.message = LocaleController.getString(R.string.IncorrectTheme);
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog);
                    }
                } else if (LocaleController.getInstance().applyLanguageFile(file, this.currentAccount)) {
                    presentFragment(new LanguageSelectActivity());
                } else {
                    if (getParentActivity() == null) {
                        this.selectedObject = null;
                        this.selectedParticipant = null;
                        return;
                    }
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
                    String string3 = LocaleController.getString(R.string.AppName);
                    AlertDialog alertDialog2 = builder2.alertDialog;
                    alertDialog2.title = string3;
                    alertDialog2.message = LocaleController.getString(R.string.IncorrectLocalization);
                    builder2.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog2);
                }
            }
        } else if (iIntValue == 6) {
            String string4 = messageObject.messageOwner.attachPath;
            if (string4 != null && string4.length() > 0 && !ArticleViewer.IBlock.CC.m(string4)) {
                string4 = null;
            }
            if (string4 == null || string4.length() == 0) {
                string4 = getFileLoader().getPathToMessage(this.selectedObject.messageOwner).toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(this.selectedObject.getDocument().mime_type);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", new File(string4)));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(string4)));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(string4)));
            }
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            } catch (Exception unused2) {
            }
        } else if (iIntValue != 7) {
            switch (iIntValue) {
                case 9:
                    showDialog(new StickersAlert(getParentActivity(), this, this.selectedObject.getInputStickerSet(), null, null, null));
                    break;
                case 10:
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 23 && ((i4 <= 28 || BuildVars.NO_SCOPED_STORAGE) && getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        this.selectedObject = null;
                        this.selectedParticipant = null;
                        return;
                    }
                    String documentFileName = FileLoader.getDocumentFileName(this.selectedObject.getDocument());
                    if (TextUtils.isEmpty(documentFileName)) {
                        documentFileName = this.selectedObject.getFileName();
                    }
                    String string5 = this.selectedObject.messageOwner.attachPath;
                    if (string5 != null && string5.length() > 0 && !ArticleViewer.IBlock.CC.m(string5)) {
                        string5 = null;
                    }
                    if (string5 == null || string5.length() == 0) {
                        string5 = getFileLoader().getPathToMessage(this.selectedObject.messageOwner).toString();
                    }
                    MediaController.saveFile(string5, getParentActivity(), this.selectedObject.isMusic() ? 3 : 2, documentFileName, this.selectedObject.getDocument() != null ? this.selectedObject.getDocument().mime_type : "");
                    break;
                    break;
                case 11:
                    MessagesController.getInstance(this.currentAccount).saveGif(this.selectedObject, messageObject.getDocument());
                    break;
                default:
                    switch (iIntValue) {
                        case 15:
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", this.selectedObject.messageOwner.media.user_id);
                            bundle.putString("phone", this.selectedObject.messageOwner.media.phone_number);
                            bundle.putBoolean("addContact", true);
                            presentFragment(new ContactAddActivity(bundle));
                            break;
                        case 16:
                            AndroidUtilities.addToClipboard(messageObject.messageOwner.media.phone_number);
                            zzkn.m(R.string.PhoneCopied, BulletinFactory.of(this));
                            break;
                        case 17:
                            try {
                                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.selectedObject.messageOwner.media.phone_number));
                                intent2.addFlags(268435456);
                                getParentActivity().startActivityForResult(intent2, 500);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            break;
                        default:
                            TLRPC.Chat chat2 = this.currentChat;
                            switch (iIntValue) {
                                case 33:
                                    if (this.selectedParticipant != null) {
                                        TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(DialogObject.getPeerDialogId(this.selectedParticipant.peer)));
                                        TLRPC.ChannelParticipant channelParticipant = this.selectedParticipant;
                                        if (channelParticipant.banned_rights == null) {
                                            channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                        }
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.selectedParticipant.banned_rights;
                                        tL_chatBannedRights.send_plain = true;
                                        tL_chatBannedRights.send_messages = true;
                                        tL_chatBannedRights.send_media = true;
                                        tL_chatBannedRights.send_stickers = true;
                                        tL_chatBannedRights.send_gifs = true;
                                        tL_chatBannedRights.send_games = true;
                                        tL_chatBannedRights.send_inline = true;
                                        tL_chatBannedRights.send_polls = true;
                                        tL_chatBannedRights.send_photos = true;
                                        tL_chatBannedRights.send_videos = true;
                                        tL_chatBannedRights.send_roundvideos = true;
                                        tL_chatBannedRights.send_audios = true;
                                        tL_chatBannedRights.send_voices = true;
                                        tL_chatBannedRights.send_docs = true;
                                        tL_chatBannedRights.send_reactions = true;
                                        getMessagesController().setParticipantBannedRole(chat2.id, user3, null, this.selectedParticipant.banned_rights, true, getFragmentForAlert(1), new ChatActivity$$ExternalSyntheticLambda7(6, this, user3));
                                    }
                                    break;
                                case 34:
                                    TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                    tL_channels_reportAntiSpamFalsePositive.channel = getMessagesController().getInputChannel(chat2.id);
                                    tL_channels_reportAntiSpamFalsePositive.msg_id = this.selectedObject.getRealId();
                                    getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new ChannelAdminLogActivity$$ExternalSyntheticLambda6(this, 3));
                                    break;
                                case 35:
                                    getMessagesController().deleteParticipantFromChat(chat2.id, getMessagesController().getInputPeer(this.selectedObject.messageOwner.from_id), false, false, new ChannelAdminLogActivity$$ExternalSyntheticLambda7(this, 3));
                                    if ((this.selectedObject.messageOwner.from_id instanceof TLRPC.TL_peerUser) && BulletinFactory.canShowBulletin(this) && (user = getMessagesController().getUser(Long.valueOf(this.selectedObject.messageOwner.from_id.user_id))) != null) {
                                        BulletinFactory.createRemoveFromChatBulletin(this, user, chat2.title).show();
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            String string6 = messageObject.messageOwner.attachPath;
            if (string6 != null && string6.length() > 0 && !ArticleViewer.IBlock.CC.m(string6)) {
                string6 = null;
            }
            if (string6 == null || string6.length() == 0) {
                string6 = getFileLoader().getPathToMessage(this.selectedObject.messageOwner).toString();
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 23 && ((i5 <= 28 || BuildVars.NO_SCOPED_STORAGE) && getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                this.selectedObject = null;
                this.selectedParticipant = null;
                return;
            }
            MediaController.saveFile(string6, getParentActivity(), 0, null, null);
        }
        this.selectedObject = null;
        this.selectedParticipant = null;
    }

    public final void lambda$createMenu$14(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || getParentActivity() == null) {
            return;
        }
        Activity parentActivity = getParentActivity();
        int i = R.drawable.popup_fixed_alert;
        int iDp = 0;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(i, 0, parentActivity, getResourceProvider());
        actionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
        Rect rect = new Rect();
        getParentActivity().getResources().getDrawable(i).mutate().getPadding(rect);
        actionBarPopupWindowLayout.setBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList4.get(i2);
            ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
            if (obj == null) {
                anonymousClass2.addView(new ActionBarPopupWindow.GapView(getParentActivity(), Theme.key_actionBarDefaultSubmenuSeparator, getResourceProvider()), LayoutHelper.createLinear(-1, 8));
            } else {
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, getParentActivity(), getResourceProvider(), i2 == 0, i2 == size + (-1));
                actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(200.0f));
                actionBarMenuSubItem.setTextAndIcon((CharSequence) arrayList2.get(i2), ((Integer) arrayList3.get(i2)).intValue(), null);
                if (((Integer) arrayList4.get(i2)).intValue() == 35) {
                    int themedColor = getThemedColor(Theme.key_text_RedBold);
                    int themedColor2 = getThemedColor(Theme.key_text_RedRegular);
                    actionBarMenuSubItem.setTextColor(themedColor);
                    actionBarMenuSubItem.setIconColor(themedColor2);
                }
                Integer num = (Integer) arrayList4.get(i2);
                anonymousClass2.addView(actionBarMenuSubItem);
                actionBarMenuSubItem.setOnClickListener(new TopicsFragment$$ExternalSyntheticLambda17(this, i2, arrayList4, num, 1));
            }
            i2++;
            arrayList4 = arrayList;
        }
        ChatActivity.AnonymousClass115 anonymousClass115 = new ChatActivity.AnonymousClass115(1, getContext(), this);
        anonymousClass115.addView(actionBarPopupWindowLayout, LayoutHelper.createLinearRelatively(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        anonymousClass115.setPopupWindowLayout(actionBarPopupWindowLayout);
        AnonymousClass15 anonymousClass15 = new AnonymousClass15(anonymousClass115);
        this.scrimPopupWindow = anonymousClass15;
        anonymousClass15.pauseNotifications = true;
        anonymousClass15.dismissAnimationDuration = 220;
        anonymousClass15.setOutsideTouchable(true);
        this.scrimPopupWindow.setClippingEnabled(true);
        this.scrimPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        this.scrimPopupWindow.setFocusable(true);
        anonymousClass115.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.scrimPopupWindow.setInputMethodMode(2);
        this.scrimPopupWindow.setSoftInputMode(48);
        this.scrimPopupWindow.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f)) - anonymousClass115.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
        if (left < AndroidUtilities.dp(6.0f)) {
            left = AndroidUtilities.dp(6.0f);
        } else if (left > (this.chatListView.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - anonymousClass115.getMeasuredWidth()) {
            left = (this.chatListView.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - anonymousClass115.getMeasuredWidth();
        }
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            this.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = getHeight();
        int iDp2 = AndroidUtilities.dp(48.0f) + anonymousClass115.getMeasuredHeight();
        int iMeasureKeyboardHeight = measureKeyboardHeight();
        if (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f)) {
            height += iMeasureKeyboardHeight;
        }
        if (iDp2 < height) {
            int y = (int) (this.chatListView.getY() + view.getTop() + f2);
            iDp = (iDp2 - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f) ? (AndroidUtilities.dp(240.0f) - iDp2) + y : y;
            if (iDp < this.chatListView.getY() + AndroidUtilities.dp(24.0f)) {
                iDp = (int) (this.chatListView.getY() + AndroidUtilities.dp(24.0f));
            } else {
                int i3 = height - iDp2;
                if (iDp > i3 - AndroidUtilities.dp(8.0f)) {
                    iDp = i3 - AndroidUtilities.dp(8.0f);
                }
            }
        } else if (!this.inBubbleMode) {
            iDp = AndroidUtilities.statusBarHeight;
        }
        anonymousClass115.setMaxHeight(height - iDp);
        this.scrimPopupWindow.showAtLocation(this.chatListView, 51, left, iDp);
        this.scrimPopupWindow.dimBehind(0.2f);
    }

    public final void lambda$loadAdmins$21(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChatFull chatFull;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            this.admins = tL_channels_channelParticipants.participants;
            TLRPC.Chat chat = this.currentChat;
            if (chat != null && (chatFull = getMessagesController().getChatFull(chat.id)) != null && chatFull.antispam) {
                AnonymousClass18 anonymousClass18 = new AnonymousClass18();
                anonymousClass18.user_id = getMessagesController().telegramAntispamUserId;
                anonymousClass18.peer = getMessagesController().getPeer(anonymousClass18.user_id);
                long j = getMessagesController().telegramAntispamUserId;
                if (getMessagesController().getUser(Long.valueOf(j)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new ChannelAdminLogActivity$$ExternalSyntheticLambda6(this, 2));
                }
                this.admins.add(0, anonymousClass18);
            }
            Dialog dialog = this.visibleDialog;
            if (dialog instanceof AdminLogFilterAlert2) {
                ((AdminLogFilterAlert2) dialog).setCurrentAdmins(this.admins);
            }
        }
    }

    public final void lambda$loadMessages$3(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i = 0;
        this.chatListItemAnimator.shouldAnimateEnterFromBottom = false;
        saveScrollPosition(false);
        MessagesController.getInstance(this.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = this.messages;
        boolean z = false;
        for (int i2 = 0; i2 < tL_channels_adminLogResults.events.size(); i2++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i2);
            long j = tL_channelAdminLogEvent.id;
            LongSparseArray longSparseArray = this.messagesDict;
            if (longSparseArray.indexOfKey(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if (!(tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) || (tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                        this.minEventId = Math.min(this.minEventId, tL_channelAdminLogEvent.id);
                        messageObject2 = new MessageObject(this.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) this.messagesByDays, this.currentChat, this.mid, false);
                        if (messageObject2.contentType >= 0) {
                            longSparseArray.put(messageObject2, tL_channelAdminLogEvent.id);
                        }
                        z = true;
                    }
                } else {
                    this.minEventId = Math.min(this.minEventId, tL_channelAdminLogEvent.id);
                    messageObject2 = new MessageObject(this.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) this.messagesByDays, this.currentChat, this.mid, false);
                    if (messageObject2.contentType >= 0) {
                        longSparseArray.put(messageObject2, tL_channelAdminLogEvent.id);
                    }
                    z = true;
                }
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                this.realMessagesDict.put(messageObject3, messageObject3.getRealId());
            }
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            messageObject = null;
                            break;
                        }
                        if (size != i3) {
                            messageObject = (MessageObject) arrayList.get(i3);
                            if (messageObject.contentType != 1 && messageObject.getRealId() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i3++;
                    }
                    if (messageObject != null) {
                        messageObject3.replyMessageObject = messageObject;
                    }
                }
                arrayList2.add(messageObject3);
            }
        }
        if (!arrayList2.isEmpty()) {
            MediaDataController.getInstance(this.currentAccount).loadReplyMessagesForMessages(arrayList2, -this.currentChat.id, 0, 0L, new ChannelAdminLogActivity$$ExternalSyntheticLambda7(this, 2), getClassGuid(), null);
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

    public final void lambda$reloadLastMessages$0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        MessageObject messageObject;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        this.reloadingLastMessages = false;
        this.chatListItemAnimator.shouldAnimateEnterFromBottom = false;
        saveScrollPosition(false);
        MessagesController.getInstance(this.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        boolean z = false;
        for (int i = 0; i < tL_channels_adminLogResults.events.size(); i++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i);
            long j = tL_channelAdminLogEvent2.id;
            LongSparseArray longSparseArray = this.messagesDict;
            if (longSparseArray.indexOfKey(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if (!(tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) || (tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                        this.minEventId = Math.min(this.minEventId, tL_channelAdminLogEvent2.id);
                        messageObject = new MessageObject(this.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) map, this.currentChat, this.mid, false);
                        if (messageObject.contentType < 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !longSparseArray.containsKey(tL_channelAdminLogEvent2.id))) {
                            this.messages.add(0, messageObject);
                            longSparseArray.put(messageObject, tL_channelAdminLogEvent2.id);
                            z = true;
                        }
                    }
                } else {
                    this.minEventId = Math.min(this.minEventId, tL_channelAdminLogEvent2.id);
                    messageObject = new MessageObject(this.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) map, this.currentChat, this.mid, false);
                    if (messageObject.contentType < 0) {
                    }
                }
            }
        }
        if (this.chatAdapter == null || !z) {
            return;
        }
        filterDeletedMessages();
        this.chatAdapter.notifyDataSetChanged();
    }

    public final void loadMessages(boolean z) {
        ChatActivityAdapter chatActivityAdapter;
        if (this.loading) {
            return;
        }
        ArrayList arrayList = this.messages;
        if (z) {
            this.minEventId = Long.MAX_VALUE;
            FrameLayout frameLayout = this.progressView;
            if (frameLayout != null) {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                this.emptyViewContainer.setVisibility(4);
                this.chatListView.setEmptyView(null);
            }
            this.messagesDict.clear();
            arrayList.clear();
            this.messagesByDays.clear();
            filterDeletedMessages();
        }
        this.loading = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.currentChat);
        tL_channels_getAdminLog.q = this.searchQuery;
        tL_channels_getAdminLog.limit = 50;
        if (z || arrayList.isEmpty()) {
            tL_channels_getAdminLog.max_id = 0L;
        } else {
            tL_channels_getAdminLog.max_id = this.minEventId;
        }
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.currentFilter;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.selectedAdmins != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i = 0; i < this.selectedAdmins.size(); i++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.selectedAdmins.valueAt(i)));
            }
        }
        updateEmptyPlaceholder();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ChannelAdminLogActivity$$ExternalSyntheticLambda6(this, 0));
        if (!z || (chatActivityAdapter = this.chatAdapter) == null) {
            return;
        }
        chatActivityAdapter.notifyDataSetChanged();
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(0, true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        loadMessages(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.currentChat);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ChannelAdminLogActivity$$ExternalSyntheticLambda6(this, 4)), this.classGuid);
        setBulletinDelegate(new LaunchActivity.AnonymousClass7(2));
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        this.notificationsLocker.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        AnonymousClass5 anonymousClass5 = this.contentView;
        if (anonymousClass5 != null) {
            WallpaperParallaxEffect wallpaperParallaxEffect = anonymousClass5.parallaxEffect;
            if (wallpaperParallaxEffect != null) {
                wallpaperParallaxEffect.setEnabled(false);
            }
            anonymousClass5.paused = true;
        }
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(0, true);
        }
        this.paused = true;
        this.wasPaused = true;
        AvatarPreviewer avatarPreviewer = AvatarPreviewer.INSTANCE;
        if (avatarPreviewer == null || !avatarPreviewer.visible) {
            return;
        }
        AvatarPreviewer avatarPreviewer2 = AvatarPreviewer.getInstance();
        if (avatarPreviewer2.visible) {
            AvatarPreviewer.AnonymousClass1 anonymousClass1 = (AvatarPreviewer.AnonymousClass1) avatarPreviewer2.layout;
            int i = AvatarPreviewer.Layout.$r8$clinit;
            anonymousClass1.setShowing$1(false);
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.videoTextureView, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        AnonymousClass5 anonymousClass5 = this.contentView;
        if (anonymousClass5 != null) {
            WallpaperParallaxEffect wallpaperParallaxEffect = anonymousClass5.parallaxEffect;
            if (wallpaperParallaxEffect != null) {
                wallpaperParallaxEffect.setEnabled(true);
            }
            anonymousClass5.paused = false;
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
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.notificationsLocker.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        if (z) {
            this.notificationsLocker.lock();
        }
    }

    public final void reloadLastMessages() {
        if (this.reloadingLastMessages) {
            return;
        }
        this.reloadingLastMessages = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.currentChat);
        tL_channels_getAdminLog.q = this.searchQuery;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.currentFilter;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.selectedAdmins != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i = 0; i < this.selectedAdmins.size(); i++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.selectedAdmins.valueAt(i)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ChannelAdminLogActivity$$ExternalSyntheticLambda6(this, 1));
    }

    public final void saveScrollPosition(boolean z) {
        AnonymousClass7 anonymousClass7 = this.chatListView;
        if (anonymousClass7 == null || this.chatLayoutManager == null || anonymousClass7.getChildCount() <= 0) {
            return;
        }
        int top = z ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        View view = null;
        int i = -1;
        for (int i2 = 0; i2 < this.chatListView.getChildCount(); i2++) {
            View childAt = this.chatListView.getChildAt(i2);
            this.chatListView.getClass();
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= 0) {
                if (z) {
                    if (childAt.getTop() < top) {
                        top = childAt.getTop();
                        view = childAt;
                        i = childAdapterPosition;
                    }
                } else if (childAt.getTop() > top) {
                    top = childAt.getTop();
                    view = childAt;
                    i = childAdapterPosition;
                }
            }
        }
        if (view != null) {
            this.savedScrollEventId = view instanceof ChatMessageCell ? ((ChatMessageCell) view).getMessageObject().eventId : view instanceof ChatActionCell ? ((ChatActionCell) view).getMessageObject().eventId : 0L;
            this.savedScrollPosition = i;
            this.savedScrollOffset = (this.chatListView.getMeasuredHeight() - view.getBottom()) - this.chatListView.getPaddingBottom();
        }
    }

    public final int scrollOffsetForQuote(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int iDp;
        int iFindQuoteStart;
        ChatMessageCell chatMessageCell;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (TextUtils.isEmpty(null)) {
            ChatMessageCell chatMessageCell2 = this.dummyMessageCell;
            if (chatMessageCell2 != null) {
                chatMessageCell2.computedGroupCaptionY = 0;
                chatMessageCell2.computedCaptionLayout = null;
            }
        } else {
            if (TextUtils.isEmpty(messageObject.caption) || (chatMessageCell = this.dummyMessageCell) == null || (textLayoutBlocks = chatMessageCell.captionLayout) == null) {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                ChatMessageCell chatMessageCell3 = this.dummyMessageCell;
                if (chatMessageCell3 == null || !chatMessageCell3.linkPreviewAbove) {
                    charSequence = charSequence2;
                    iDp = 0;
                } else {
                    iDp = chatMessageCell3.linkPreviewHeight + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                }
            } else {
                iDp = (int) chatMessageCell.captionY;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            }
            ChatMessageCell chatMessageCell4 = this.dummyMessageCell;
            if (chatMessageCell4 != null) {
                chatMessageCell4.computedGroupCaptionY = 0;
                chatMessageCell4.computedCaptionLayout = null;
            }
            if (arrayList != null && charSequence != null && (iFindQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), null, this.highlightMessageQuoteOffset)) >= 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i);
                    StaticLayout staticLayout = textLayoutBlock.textLayout;
                    String string = staticLayout.getText().toString();
                    int i2 = textLayoutBlock.charactersOffset;
                    if (iFindQuoteStart > i2) {
                        float fTextYOffset = iFindQuoteStart - i2 > string.length() + (-1) ? iDp + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height)) : staticLayout.getLineTop(staticLayout.getLineForOffset(iFindQuoteStart - textLayoutBlock.charactersOffset)) + textLayoutBlock.textYOffset(arrayList) + iDp + textLayoutBlock.padTop;
                        if (fTextYOffset <= AndroidUtilities.displaySize.y * (getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)) {
                            break;
                        }
                        return (int) (fTextYOffset - (AndroidUtilities.displaySize.y * (getKeyboardHeight() > AndroidUtilities.dp(20.0f) ? 0.7f : 0.5f)));
                    }
                }
            }
        }
        return 0;
    }

    public final void scrollToMessage(MessageObject messageObject) {
        int i;
        int i2;
        float f;
        int iComputeHeight;
        MessageObject messageObject2;
        ArrayList arrayList = this.filteredMessages;
        if (arrayList.size() <= 0) {
            i = -1;
            i2 = 0;
            break;
        }
        int iFindLastVisibleItemPosition = this.chatLayoutManager.findLastVisibleItemPosition();
        int iFindFirstVisibleItemPosition = this.chatLayoutManager.findFirstVisibleItemPosition();
        while (true) {
            if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                i = -1;
                i2 = 0;
                break;
            }
            ChatActivityAdapter chatActivityAdapter = this.chatAdapter;
            int i3 = chatActivityAdapter.messagesStartRow;
            if (iFindFirstVisibleItemPosition >= i3 && iFindFirstVisibleItemPosition < chatActivityAdapter.messagesEndRow) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(iFindFirstVisibleItemPosition - i3);
                if (messageObject3.contentType != 1 && messageObject3.getRealId() != 0 && !messageObject3.isSponsored()) {
                    i2 = iFindFirstVisibleItemPosition - this.chatAdapter.messagesStartRow;
                    i = (messageObject3.getRealId() < messageObject.getRealId() ? 1 : 0) ^ 1;
                    break;
                }
            }
            iFindFirstVisibleItemPosition++;
        }
        this.chatScrollHelper.scrollDirection = i;
        int iIndexOf = arrayList.indexOf(messageObject);
        if (iIndexOf != -1) {
            if (i2 > 0) {
                i = i2 > iIndexOf ? 0 : 1;
                this.chatScrollHelper.scrollDirection = i;
            }
            ChannelAdminLogActivity$$ExternalSyntheticLambda7 channelAdminLogActivity$$ExternalSyntheticLambda7 = this.unselectRunnable;
            if (channelAdminLogActivity$$ExternalSyntheticLambda7 != null) {
                AndroidUtilities.cancelRunOnUIThread(channelAdminLogActivity$$ExternalSyntheticLambda7);
                this.unselectRunnable = null;
            }
            this.highlightMessageId = Integer.MAX_VALUE;
            this.highlightMessageId = messageObject.getRealId();
            int iIndexOf2 = arrayList.indexOf(messageObject) + this.chatAdapter.messagesStartRow;
            updateVisibleRows();
            int childCount = this.chatListView.getChildCount();
            int i4 = 0;
            boolean z = false;
            int iScrollOffsetForQuote = 0;
            while (true) {
                if (i4 >= childCount) {
                    f = 2.0f;
                    break;
                }
                View childAt = this.chatListView.getChildAt(i4);
                if (childAt instanceof ChatMessageCell) {
                    MessageObject messageObject4 = ((ChatMessageCell) childAt).getMessageObject();
                    if (messageObject4 != null) {
                        f = 2.0f;
                        if (messageObject4.getRealId() == messageObject.getRealId()) {
                            childAt.sendAccessibilityEvent(8);
                            iScrollOffsetForQuote = scrollOffsetForQuote(messageObject4);
                            z = true;
                        }
                    } else {
                        f = 2.0f;
                    }
                } else {
                    f = 2.0f;
                    if ((childAt instanceof ChatActionCell) && (messageObject2 = ((ChatActionCell) childAt).getMessageObject()) != null && messageObject2.getRealId() == messageObject.getRealId()) {
                        childAt.sendAccessibilityEvent(8);
                        z = true;
                    }
                }
                if (z) {
                    int top = childAt.getTop() - (Math.max(-AndroidUtilities.dp(f), (this.chatListView.getMeasuredHeight() - childAt.getHeight()) / 2) - iScrollOffsetForQuote);
                    int iComputeVerticalScrollRange = (this.chatListView.computeVerticalScrollRange() - this.chatListView.computeVerticalScrollOffset()) - this.chatListView.computeVerticalScrollExtent();
                    if (iComputeVerticalScrollRange < 0) {
                        iComputeVerticalScrollRange = 0;
                    }
                    if (top > iComputeVerticalScrollRange) {
                        top = iComputeVerticalScrollRange;
                    }
                    if (top == 0) {
                        break;
                    }
                    this.chatListView.smoothScrollBy(0, top, null);
                    this.chatListView.setOverScrollMode(2);
                    break;
                }
                i4++;
            }
            if (z) {
                return;
            }
            boolean z2 = !TextUtils.isEmpty(null);
            if (getParentActivity() == null) {
                iComputeHeight = 0;
            } else {
                if (this.dummyMessageCell == null) {
                    this.dummyMessageCell = new ChatMessageCell(getParentActivity(), this.currentAccount, false, null, null);
                }
                ChatMessageCell chatMessageCell = this.dummyMessageCell;
                TLRPC.Chat chat = this.currentChat;
                chatMessageCell.isChat = chat != null;
                chatMessageCell.isMegagroup = ChatObject.isChannel(chat) && chat.megagroup;
                iComputeHeight = this.dummyMessageCell.computeHeight(messageObject, null, z2);
            }
            int iMax = Math.max(-AndroidUtilities.dp(f), (this.chatListView.getMeasuredHeight() - iComputeHeight) / 2) - scrollOffsetForQuote(messageObject);
            ChatScrollCallback chatScrollCallback = this.chatScrollHelperCallback;
            chatScrollCallback.scrollTo = messageObject;
            chatScrollCallback.lastItemOffset = iMax;
            RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = this.chatScrollHelper;
            recyclerAnimationScrollHelper.scrollDirection = i;
            chatScrollCallback.position = iIndexOf2;
            chatScrollCallback.offset = iMax;
            chatScrollCallback.bottom = false;
            recyclerAnimationScrollHelper.scrollToPosition(iIndexOf2, iMax, false, false);
        }
    }

    public final void updateEmptyPlaceholder() {
        if (this.emptyView == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.searchQuery)) {
            this.emptyImageView.setVisibility(8);
            this.emptyView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.emptyView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
            return;
        }
        if (this.selectedAdmins != null || this.currentFilter != null) {
            this.emptyImageView.setVisibility(8);
            this.emptyView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.emptyView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
            return;
        }
        this.emptyImageView.setVisibility(0);
        this.emptyView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        if (this.currentChat.megagroup) {
            ArticleViewer.AnonymousClass9 anonymousClass9 = this.emptyView;
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2));
            int iCharSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilderReplaceTags, "\n\n");
            if (iCharSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
                if (spannableStringBuilderReplaceTags == null) {
                    spannableStringBuilderReplaceTags = new SpannableStringBuilder(spannableStringBuilderReplaceTags);
                }
                Theme$$ExternalSyntheticApiModelOutline3.m1065m$1();
                spannableStringBuilderReplaceTags.setSpan(Theme$$ExternalSyntheticApiModelOutline3.m(AndroidUtilities.dp(8.0f)), iCharSequenceIndexOf + 1, iCharSequenceIndexOf + 2, 33);
            }
            anonymousClass9.setText(spannableStringBuilderReplaceTags);
            return;
        }
        ArticleViewer.AnonymousClass9 anonymousClass10 = this.emptyView;
        SpannableStringBuilder spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2));
        int iCharSequenceIndexOf2 = AndroidUtilities.charSequenceIndexOf(spannableStringBuilderReplaceTags2, "\n\n");
        if (iCharSequenceIndexOf2 >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (spannableStringBuilderReplaceTags2 == null) {
                spannableStringBuilderReplaceTags2 = new SpannableStringBuilder(spannableStringBuilderReplaceTags2);
            }
            Theme$$ExternalSyntheticApiModelOutline3.m1065m$1();
            spannableStringBuilderReplaceTags2.setSpan(Theme$$ExternalSyntheticApiModelOutline3.m(AndroidUtilities.dp(8.0f)), iCharSequenceIndexOf2 + 1, iCharSequenceIndexOf2 + 2, 33);
        }
        anonymousClass10.setText(spannableStringBuilderReplaceTags2);
    }

    public final void updateMessagesVisiblePart() {
        AnonymousClass7 anonymousClass7 = this.chatListView;
        if (anonymousClass7 == null) {
            return;
        }
        int childCount = anonymousClass7.getChildCount();
        int measuredHeight = this.chatListView.getMeasuredHeight();
        int i = Integer.MAX_VALUE;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        boolean z2 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.chatListView.getChildAt(i3);
            if (childAt instanceof ChatMessageUnsupportedCell) {
                ChatMessageUnsupportedCell chatMessageUnsupportedCell = (ChatMessageUnsupportedCell) childAt;
                float y = (childAt.getY() + this.actionBar.getMeasuredHeight()) - getBackgroundTranslationY();
                int backgroundSizeY = getBackgroundSizeY();
                chatMessageUnsupportedCell.mViewTop = y;
                chatMessageUnsupportedCell.mParentH = backgroundSizeY;
            } else if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                int top = chatMessageCell.getTop();
                chatMessageCell.getBottom();
                int i4 = top >= 0 ? 0 : -top;
                int measuredHeight2 = chatMessageCell.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i4 + measuredHeight;
                }
                chatMessageCell.setVisiblePart(i4, measuredHeight2 - i4, (getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.chatListView.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - getBackgroundTranslationY(), getMeasuredWidth(), getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (this.roundVideoContainer != null && messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    ImageReceiver photoImage = chatMessageCell.getPhotoImage();
                    this.roundVideoContainer.setTranslationX(photoImage.getImageX());
                    this.roundVideoContainer.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.roundVideoContainer.invalidate();
                    z2 = true;
                }
            } else if (childAt instanceof ChatActionCell) {
                ChatActionCell chatActionCell = (ChatActionCell) childAt;
                chatActionCell.setVisiblePart((childAt.getY() + this.actionBar.getMeasuredHeight()) - getBackgroundTranslationY(), getBackgroundSizeY());
                if (chatActionCell.hasGradientService()) {
                    chatActionCell.invalidate();
                }
            }
            if (childAt.getBottom() > this.chatListView.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i) {
                    if ((childAt instanceof ChatMessageCell) || (childAt instanceof ChatActionCell)) {
                        view3 = childAt;
                    }
                    i = bottom;
                    view2 = childAt;
                }
                AnonymousClass9 anonymousClass9 = this.chatListItemAnimator;
                if ((anonymousClass9 == null || (!anonymousClass9.willRemoved(childAt) && !this.chatListItemAnimator.willAddedFromAlpha(childAt))) && (childAt instanceof ChatActionCell) && ((ChatActionCell) childAt).getMessageObject().isDateObject) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i2) {
                        i2 = bottom;
                        view = childAt;
                    }
                }
            }
        }
        AnonymousClass16 anonymousClass16 = this.roundVideoContainer;
        if (anonymousClass16 != null) {
            if (z2) {
                MediaController.getInstance().setCurrentVideoVisible(true);
            } else {
                anonymousClass16.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.checkTextureViewPosition) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            }
        }
        if (view3 != null) {
            this.floatingDateView.setCustomDate((view3 instanceof ChatMessageCell ? ((ChatMessageCell) view3).getMessageObject() : ((ChatActionCell) view3).getMessageObject()).messageOwner.date, false, true);
        }
        this.currentFloatingDateOnScreen = false;
        if (!(view2 instanceof ChatMessageCell) && !(view2 instanceof ChatActionCell)) {
            z = true;
        }
        this.currentFloatingTopIsNotMessage = z;
        if (view == null) {
            hideFloatingDateView(true);
            this.floatingDateView.setTranslationY(0.0f);
            return;
        }
        if (view.getTop() > this.chatListView.getPaddingTop() || this.currentFloatingTopIsNotMessage) {
            if (view.getAlpha() != 1.0f) {
                view.setAlpha(1.0f);
            }
            hideFloatingDateView(true ^ this.currentFloatingTopIsNotMessage);
        } else {
            if (view.getAlpha() != 0.0f) {
                view.setAlpha(0.0f);
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
        int bottom2 = view.getBottom() - this.chatListView.getPaddingTop();
        if (bottom2 <= this.floatingDateView.getMeasuredHeight() || bottom2 >= this.floatingDateView.getMeasuredHeight() * 2) {
            this.floatingDateView.setTranslationY(0.0f);
        } else {
            ChatActionCell chatActionCell2 = this.floatingDateView;
            chatActionCell2.setTranslationY(((-chatActionCell2.getMeasuredHeight()) * 2) + bottom2);
        }
    }

    public final void updateVisibleRows() {
        AnonymousClass7 anonymousClass7 = this.chatListView;
        if (anonymousClass7 == null) {
            return;
        }
        int childCount = anonymousClass7.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.chatListView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.isActionModeShowed()) {
                        chatMessageCell.setDrawSelectionBackground(false);
                        chatMessageCell.setCheckBoxVisible(false, true);
                        chatMessageCell.setChecked(false, false, true);
                    }
                    chatMessageCell.setHighlighted(this.highlightMessageId != Integer.MAX_VALUE && messageObject.getRealId() == this.highlightMessageId);
                    if (this.highlightMessageId != Integer.MAX_VALUE) {
                        ChannelAdminLogActivity$$ExternalSyntheticLambda7 channelAdminLogActivity$$ExternalSyntheticLambda7 = this.unselectRunnable;
                        if (channelAdminLogActivity$$ExternalSyntheticLambda7 != null) {
                            AndroidUtilities.cancelRunOnUIThread(channelAdminLogActivity$$ExternalSyntheticLambda7);
                        }
                        ChannelAdminLogActivity$$ExternalSyntheticLambda7 channelAdminLogActivity$$ExternalSyntheticLambda8 = new ChannelAdminLogActivity$$ExternalSyntheticLambda7(this, 1);
                        this.unselectRunnable = channelAdminLogActivity$$ExternalSyntheticLambda8;
                        AndroidUtilities.runOnUIThread(channelAdminLogActivity$$ExternalSyntheticLambda8, 1000L);
                    }
                    if (TextUtils.isEmpty(this.searchQuery)) {
                        chatMessageCell.setHighlightedText(null, false, false, -1);
                    } else {
                        chatMessageCell.setHighlightedText(this.searchQuery, false, false, -1);
                    }
                    chatMessageCell.setSpoilersSuppressed(this.chatListView.getScrollState() != 0);
                }
            } else if (childAt instanceof ChatActionCell) {
                ChatActionCell chatActionCell = (ChatActionCell) childAt;
                chatActionCell.setMessageObject(chatActionCell.getMessageObject());
                chatActionCell.setSpoilersSuppressed(this.chatListView.getScrollState() != 0);
            }
        }
    }
}
