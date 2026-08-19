package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.GigagroupConvertAlert;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.bots.AffiliateProgramFragment;

public class ChatUsersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int addNew2Row;
    private int addNewRow;
    private int addNewSectionRow;
    private int addUsersRow;
    private int antiSpamInfoRow;
    private int antiSpamRow;
    private boolean antiSpamToggleLoading;
    private int blockedEmptyRow;
    private int botEndRow;
    private int botHeaderRow;
    private int botStartRow;
    private ArrayList bots;
    private boolean botsEndReached;
    private LongSparseArray botsMap;
    private int changeInfoRow;
    private long chatId;
    private ArrayList contacts;
    private boolean contactsEndReached;
    private int contactsEndRow;
    private int contactsHeaderRow;
    private LongSparseArray contactsMap;
    private int contactsStartRow;
    private TLRPC.Chat currentChat;
    private TLRPC.TL_chatBannedRights defaultBannedRights;
    private int delayResults;
    private ChatUsersActivityDelegate delegate;
    private ActionBarMenuItem doneItem;
    private int dontRestrictBoostersInfoRow;
    private int dontRestrictBoostersRow;
    private int dontRestrictBoostersSliderRow;
    private int editTagRow;
    private int embedLinksRow;
    private StickerEmptyView emptyView;
    private boolean enablePrice;
    private boolean firstLoaded;
    private FlickerLoadingView flickerLoadingView;
    private int gigaConvertRow;
    private int gigaHeaderRow;
    private int gigaInfoRow;
    private int hideMembersInfoRow;
    private int hideMembersRow;
    private boolean hideMembersToggleLoading;
    private LongSparseArray ignoredUsers;
    private TLRPC.ChatFull info;
    private String initialBannedRights;
    private boolean initialEnablePrice;
    private boolean initialProfiles;
    private boolean initialSignatures;
    private int initialSlowmode;
    private long initialStarsPrice;
    private boolean isChannel;
    private boolean isCommunity;
    private boolean isEnabledNotRestrictBoosters;
    private boolean isForum;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
    private int loadingHeaderRow;
    private int loadingProgressRow;
    private int loadingUserCellRow;
    private boolean loadingUsers;
    private int manageLinkedPeersRow;
    private int manageTopicsRow;
    private int membersHeaderRow;
    private boolean needOpenSearch;
    private int notRestrictBoosters;
    private boolean openTransitionStarted;
    private ArrayList participants;
    private int participantsDivider2Row;
    private int participantsDividerRow;
    private int participantsEndRow;
    private int participantsInfoRow;
    private LongSparseArray participantsMap;
    private int participantsStartRow;
    private int payInfoRow;
    private int payRow;
    private int permissionsSectionRow;
    private int pinMessagesRow;
    private int priceHeaderRow;
    private int priceInfoRow;
    private int priceRow;
    private boolean profiles;
    private View progressBar;
    private int recentActionsRow;
    private int removedUsersRow;
    private int restricted1SectionRow;
    private int rowCount;
    private ActionBarMenuItem searchItem;
    private SearchAdapter searchListViewAdapter;
    private boolean searching;
    private int selectType;
    private int selectedSlowmode;
    private int sendMediaEmbededLinksRow;
    private boolean sendMediaExpanded;
    private int sendMediaFilesRow;
    private int sendMediaMusicRow;
    private int sendMediaPhotosRow;
    private int sendMediaRow;
    private int sendMediaStickerGifsRow;
    private int sendMediaVideoMessagesRow;
    private int sendMediaVideosRow;
    private int sendMediaVoiceMessagesRow;
    private int sendMessagesRow;
    private int sendPollsRow;
    private int sendReactionsRow;
    private int sendStickersRow;
    private int signMessagesInfoRow;
    private int signMessagesProfilesRow;
    private int signMessagesRow;
    private boolean signatures;
    private int slowmodeInfoRow;
    private int slowmodeRow;
    private int slowmodeSelectRow;
    private long starsPrice;
    private int tagsInfoRow;
    private int tagsRow;
    private boolean transfer;
    private int type;
    private UndoView undoView;

    public interface ChatUsersActivityDelegate {

        public abstract class CC {
            public static void $default$didChangeOwner(ChatUsersActivityDelegate chatUsersActivityDelegate, TLRPC.User user) {
            }

            public static void $default$didKickParticipant(ChatUsersActivityDelegate chatUsersActivityDelegate, long j) {
            }

            public static void $default$didSelectUser(ChatUsersActivityDelegate chatUsersActivityDelegate, long j) {
            }
        }

        void didAddParticipantToList(long j, TLObject tLObject);

        void didChangeOwner(TLRPC.User user);

        void didKickParticipant(long j);

        void didSelectUser(long j);
    }

    public static void m1890$r8$lambda$oeh6iY0vmOlL6KBPnQc0jiJCtA() {
    }

    public int getSecondsForIndex(int i) {
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 30;
        }
        if (i == 4) {
            return 60;
        }
        if (i == 5) {
            return 300;
        }
        if (i == 6) {
            return 900;
        }
        return i == 7 ? 3600 : 0;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean needDelayOpenAnimation() {
        return true;
    }

    public ChatUsersActivity(Bundle bundle) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        super(bundle);
        this.defaultBannedRights = new TLRPC.TL_chatBannedRights();
        this.participants = new ArrayList();
        this.bots = new ArrayList();
        this.contacts = new ArrayList();
        this.participantsMap = new LongSparseArray();
        this.botsMap = new LongSparseArray();
        this.contactsMap = new LongSparseArray();
        this.initialStarsPrice = 10L;
        this.starsPrice = 10L;
        this.chatId = this.arguments.getLong("chat_id");
        this.type = this.arguments.getInt("type");
        this.transfer = this.arguments.getBoolean("transfer");
        this.needOpenSearch = this.arguments.getBoolean("open_search");
        this.selectType = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        this.currentChat = chat;
        boolean z = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.defaultBannedRights;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z2 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z2;
            tL_chatBannedRights2.embed_links = tL_chatBannedRights.embed_links;
            tL_chatBannedRights2.send_messages = tL_chatBannedRights.send_messages;
            tL_chatBannedRights2.send_games = tL_chatBannedRights.send_games;
            tL_chatBannedRights2.send_inline = tL_chatBannedRights.send_inline;
            tL_chatBannedRights2.send_gifs = tL_chatBannedRights.send_gifs;
            tL_chatBannedRights2.pin_messages = tL_chatBannedRights.pin_messages;
            tL_chatBannedRights2.edit_rank = tL_chatBannedRights.edit_rank;
            tL_chatBannedRights2.send_reactions = tL_chatBannedRights.send_reactions;
            tL_chatBannedRights2.send_polls = tL_chatBannedRights.send_polls;
            tL_chatBannedRights2.invite_users = tL_chatBannedRights.invite_users;
            tL_chatBannedRights2.manage_topics = tL_chatBannedRights.manage_topics;
            tL_chatBannedRights2.change_info = tL_chatBannedRights.change_info;
            tL_chatBannedRights2.manage_linked_peers = tL_chatBannedRights.manage_linked_peers;
            boolean z3 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z3;
            boolean z4 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z4;
            boolean z5 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z5;
            boolean z6 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z6;
            boolean z7 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z7;
            boolean z8 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z8;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z2 && z8 && z7 && z6 && z5 && z4 && z3) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.initialBannedRights = ChatObject.getBannedRightsString(this.defaultBannedRights);
        this.isCommunity = ChatObject.isCommunity(this.currentChat);
        if (ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup && !this.isCommunity) {
            z = true;
        }
        this.isChannel = z;
        this.isForum = ChatObject.isForum(this.currentChat);
        TLRPC.Chat chat2 = this.currentChat;
        if (chat2 != null) {
            boolean z9 = chat2.signatures;
            this.signatures = z9;
            this.initialSignatures = z9;
            boolean z10 = chat2.signature_profiles;
            this.profiles = z10;
            this.initialProfiles = z10;
        }
    }

    public void updateRows() {
        boolean z;
        boolean z2;
        TLRPC.ChatFull chatFull;
        boolean z3;
        TLRPC.ChatFull chatFull2;
        boolean z4;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.chatId));
        this.currentChat = chat2;
        if (chat2 == null) {
            return;
        }
        this.recentActionsRow = -1;
        this.antiSpamRow = -1;
        this.antiSpamInfoRow = -1;
        this.addNewRow = -1;
        this.addNew2Row = -1;
        this.hideMembersRow = -1;
        this.hideMembersInfoRow = -1;
        this.tagsRow = -1;
        this.tagsInfoRow = -1;
        this.addNewSectionRow = -1;
        this.restricted1SectionRow = -1;
        this.participantsStartRow = -1;
        this.participantsDividerRow = -1;
        this.participantsDivider2Row = -1;
        this.gigaInfoRow = -1;
        this.gigaConvertRow = -1;
        this.gigaHeaderRow = -1;
        this.participantsEndRow = -1;
        this.participantsInfoRow = -1;
        this.signMessagesRow = -1;
        this.signMessagesProfilesRow = -1;
        this.signMessagesInfoRow = -1;
        this.blockedEmptyRow = -1;
        this.permissionsSectionRow = -1;
        this.sendMessagesRow = -1;
        this.sendMediaRow = -1;
        this.sendStickersRow = -1;
        this.sendPollsRow = -1;
        this.embedLinksRow = -1;
        this.addUsersRow = -1;
        this.manageLinkedPeersRow = -1;
        this.manageTopicsRow = -1;
        this.pinMessagesRow = -1;
        this.editTagRow = -1;
        this.sendReactionsRow = -1;
        this.changeInfoRow = -1;
        this.removedUsersRow = -1;
        this.contactsHeaderRow = -1;
        this.contactsStartRow = -1;
        this.contactsEndRow = -1;
        this.botHeaderRow = -1;
        this.botStartRow = -1;
        this.botEndRow = -1;
        this.membersHeaderRow = -1;
        this.slowmodeRow = -1;
        this.slowmodeSelectRow = -1;
        this.slowmodeInfoRow = -1;
        this.dontRestrictBoostersRow = -1;
        this.dontRestrictBoostersInfoRow = -1;
        this.dontRestrictBoostersSliderRow = -1;
        this.loadingProgressRow = -1;
        this.loadingUserCellRow = -1;
        this.loadingHeaderRow = -1;
        this.sendMediaPhotosRow = -1;
        this.sendMediaVideosRow = -1;
        this.sendMediaStickerGifsRow = -1;
        this.sendMediaMusicRow = -1;
        this.sendMediaFilesRow = -1;
        this.sendMediaVoiceMessagesRow = -1;
        this.sendMediaVideoMessagesRow = -1;
        this.sendMediaEmbededLinksRow = -1;
        this.payRow = -1;
        this.payInfoRow = -1;
        this.priceHeaderRow = -1;
        this.priceRow = -1;
        this.priceInfoRow = -1;
        int i = 0;
        this.rowCount = 0;
        int i2 = this.type;
        int i3 = 1;
        if (i2 == 3) {
            int i4 = this.rowCount;
            int i5 = i4 + 1;
            this.rowCount = i5;
            this.permissionsSectionRow = i4;
            boolean z5 = this.isCommunity;
            if (!z5) {
                this.sendMessagesRow = i5;
                int i6 = i4 + 3;
                this.rowCount = i6;
                this.sendMediaRow = i4 + 2;
                if (this.sendMediaExpanded) {
                    this.sendMediaPhotosRow = i6;
                    this.sendMediaVideosRow = i4 + 4;
                    this.sendMediaStickerGifsRow = i4 + 5;
                    this.sendMediaMusicRow = i4 + 6;
                    this.sendMediaFilesRow = i4 + 7;
                    this.sendMediaVoiceMessagesRow = i4 + 8;
                    this.sendMediaVideoMessagesRow = i4 + 9;
                    this.sendMediaEmbededLinksRow = i4 + 10;
                    this.sendPollsRow = i4 + 11;
                    this.rowCount = i4 + 13;
                    this.sendReactionsRow = i4 + 12;
                }
                int i7 = this.rowCount;
                this.addUsersRow = i7;
                this.pinMessagesRow = i7 + 1;
                this.rowCount = i7 + 3;
                this.editTagRow = i7 + 2;
            }
            int i8 = this.rowCount;
            int i9 = i8 + 1;
            this.rowCount = i9;
            this.changeInfoRow = i8;
            if (z5) {
                this.rowCount = i8 + 2;
                this.manageLinkedPeersRow = i9;
            } else if (this.isForum) {
                this.rowCount = i8 + 2;
                this.manageTopicsRow = i9;
            }
            if (ChatObject.isChannel(this.currentChat)) {
                TLRPC.Chat chat3 = this.currentChat;
                if (chat3.creator && chat3.megagroup && !chat3.gigagroup && !this.isCommunity) {
                    int i10 = chat3.participants_count;
                    TLRPC.ChatFull chatFull4 = this.info;
                    if (Math.max(i10, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().maxMegagroupCount - 1000) {
                        int i11 = this.rowCount;
                        this.participantsDivider2Row = i11;
                        this.gigaHeaderRow = i11 + 1;
                        this.gigaConvertRow = i11 + 2;
                        this.rowCount = i11 + 4;
                        this.gigaInfoRow = i11 + 3;
                    }
                }
            }
            TLRPC.ChatFull chatFull5 = this.info;
            if (chatFull5 != null && chatFull5.paid_messages_available && !this.isCommunity && ChatObject.canUserDoAction(this.currentChat, 2) && (ChatObject.isChannel(this.currentChat) || ((chat = this.currentChat) != null && chat.creator))) {
                if (this.participantsDivider2Row == -1) {
                    int i12 = this.rowCount;
                    this.rowCount = i12 + 1;
                    this.participantsDivider2Row = i12;
                }
                int i13 = this.rowCount;
                this.payRow = i13;
                int i14 = i13 + 2;
                this.rowCount = i14;
                this.payInfoRow = i13 + 1;
                if (this.enablePrice) {
                    this.priceHeaderRow = i14;
                    this.priceRow = i13 + 3;
                    this.rowCount = i13 + 5;
                    this.priceInfoRow = i13 + 4;
                }
            }
            if (!this.isCommunity) {
                if (ChatObject.isChannel(this.currentChat) || !this.currentChat.creator) {
                    TLRPC.Chat chat4 = this.currentChat;
                    if (chat4.megagroup && !chat4.gigagroup && ChatObject.canBlockUsers(chat4)) {
                        if (this.participantsDivider2Row == -1) {
                            int i15 = this.rowCount;
                            this.rowCount = i15 + 1;
                            this.participantsDivider2Row = i15;
                        }
                        int i16 = this.rowCount;
                        this.slowmodeRow = i16;
                        this.slowmodeSelectRow = i16 + 1;
                        this.rowCount = i16 + 3;
                        this.slowmodeInfoRow = i16 + 2;
                    }
                } else {
                    if (this.participantsDivider2Row == -1) {
                        int i17 = this.rowCount;
                        this.rowCount = i17 + 1;
                        this.participantsDivider2Row = i17;
                    }
                    int i18 = this.rowCount;
                    this.slowmodeRow = i18;
                    this.slowmodeSelectRow = i18 + 1;
                    this.rowCount = i18 + 3;
                    this.slowmodeInfoRow = i18 + 2;
                }
            }
            if (isNotRestrictBoostersVisible() && !this.isCommunity) {
                if (this.participantsDivider2Row == -1) {
                    int i19 = this.rowCount;
                    this.rowCount = i19 + 1;
                    this.participantsDivider2Row = i19;
                }
                int i20 = this.rowCount;
                int i21 = i20 + 1;
                this.rowCount = i21;
                this.dontRestrictBoostersRow = i20;
                if (this.isEnabledNotRestrictBoosters) {
                    this.rowCount = i20 + 2;
                    this.dontRestrictBoostersSliderRow = i21;
                }
                int i22 = this.rowCount;
                this.rowCount = i22 + 1;
                this.dontRestrictBoostersInfoRow = i22;
            }
            if (ChatObject.isChannel(this.currentChat) && !this.isCommunity) {
                if (this.participantsDivider2Row == -1) {
                    int i23 = this.rowCount;
                    this.rowCount = i23 + 1;
                    this.participantsDivider2Row = i23;
                }
                int i24 = this.rowCount;
                this.rowCount = i24 + 1;
                this.removedUsersRow = i24;
            }
            if ((this.slowmodeInfoRow == -1 && this.gigaHeaderRow == -1) || this.removedUsersRow != -1) {
                int i25 = this.rowCount;
                this.rowCount = i25 + 1;
                this.participantsDividerRow = i25;
            }
            if (ChatObject.canBlockUsers(this.currentChat) && !this.isCommunity && getParticipantsCount() > 1 && (ChatObject.isChannel(this.currentChat) || this.currentChat.creator)) {
                int i26 = this.rowCount;
                this.rowCount = i26 + 1;
                this.addNewRow = i26;
            }
            if (this.loadingUsers && !(z4 = this.firstLoaded)) {
                if (z4 || (chatFull3 = this.info) == null || chatFull3.banned_count <= 0) {
                    return;
                }
                int i27 = this.rowCount;
                this.rowCount = i27 + 1;
                this.loadingUserCellRow = i27;
                return;
            }
            if (!this.participants.isEmpty()) {
                int i28 = this.rowCount;
                this.participantsStartRow = i28;
                int size = i28 + this.participants.size();
                this.rowCount = size;
                this.participantsEndRow = size;
            }
            if (this.addNewRow == -1 && this.participantsStartRow == -1) {
                return;
            }
            int i29 = this.rowCount;
            this.rowCount = i29 + 1;
            this.addNewSectionRow = i29;
            return;
        }
        if (i2 == 0) {
            if (ChatObject.canBlockUsers(this.currentChat)) {
                int i30 = this.rowCount;
                this.rowCount = i30 + 1;
                this.addNewRow = i30;
                if (!this.participants.isEmpty() || (this.loadingUsers && !this.firstLoaded && (chatFull2 = this.info) != null && chatFull2.kicked_count > 0)) {
                    int i31 = this.rowCount;
                    this.rowCount = i31 + 1;
                    this.participantsInfoRow = i31;
                }
            }
            if (this.loadingUsers && !(z3 = this.firstLoaded)) {
                if (z3) {
                    return;
                }
                int i32 = this.rowCount;
                this.restricted1SectionRow = i32;
                this.rowCount = i32 + 2;
                this.loadingUserCellRow = i32 + 1;
                return;
            }
            if (!this.participants.isEmpty()) {
                int i33 = this.rowCount;
                int i34 = i33 + 1;
                this.rowCount = i34;
                this.restricted1SectionRow = i33;
                this.participantsStartRow = i34;
                int size2 = i34 + this.participants.size();
                this.rowCount = size2;
                this.participantsEndRow = size2;
            }
            if (this.participantsStartRow != -1) {
                if (this.participantsInfoRow == -1) {
                    int i35 = this.rowCount;
                    this.rowCount = i35 + 1;
                    this.participantsInfoRow = i35;
                    return;
                } else {
                    int i36 = this.rowCount;
                    this.rowCount = i36 + 1;
                    this.addNewSectionRow = i36;
                    return;
                }
            }
            int i37 = this.rowCount;
            this.rowCount = i37 + 1;
            this.blockedEmptyRow = i37;
            return;
        }
        if (i2 == 1) {
            if (!this.transfer && ChatObject.isChannel(this.currentChat)) {
                TLRPC.Chat chat5 = this.currentChat;
                if (chat5.megagroup && !chat5.gigagroup && ((chatFull = this.info) == null || chatFull.participants_count <= 200 || (!this.isChannel && chatFull.can_set_stickers))) {
                    if (ChatObject.hasAdminRights(chat5)) {
                        int i38 = this.rowCount;
                        this.antiSpamRow = i38;
                        this.rowCount = i38 + 2;
                        this.antiSpamInfoRow = i38 + 1;
                    } else {
                        int i39 = this.rowCount;
                        this.rowCount = i39 + 1;
                        this.addNewSectionRow = i39;
                    }
                }
            }
            if (ChatObject.canAddAdmins(this.currentChat)) {
                int i40 = this.rowCount;
                this.rowCount = i40 + 1;
                this.addNewRow = i40;
            }
            if (!this.loadingUsers || (z2 = this.firstLoaded)) {
                if (!this.participants.isEmpty()) {
                    int i41 = this.rowCount;
                    this.participantsStartRow = i41;
                    int size3 = i41 + this.participants.size();
                    this.rowCount = size3;
                    this.participantsEndRow = size3;
                }
                if (!this.isCommunity) {
                    int i42 = this.rowCount;
                    this.rowCount = i42 + 1;
                    this.participantsInfoRow = i42;
                }
            } else if (!z2) {
                int i43 = this.rowCount;
                this.rowCount = i43 + 1;
                this.loadingUserCellRow = i43;
            }
            if (this.transfer || !ChatObject.isChannelAndNotMegaGroup(this.currentChat) || !ChatObject.hasAdminRights(this.currentChat) || this.isCommunity) {
                return;
            }
            int i44 = this.rowCount;
            int i45 = i44 + 1;
            this.rowCount = i45;
            this.signMessagesRow = i44;
            if (this.signatures) {
                this.signMessagesProfilesRow = i45;
                this.rowCount = i44 + 3;
                this.signMessagesInfoRow = i44 + 2;
                return;
            } else {
                this.rowCount = i44 + 2;
                this.signMessagesInfoRow = i45;
                return;
            }
        }
        if (i2 == 2) {
            if (ChatObject.isChannel(this.currentChat) && !ChatObject.isChannelAndNotMegaGroup(this.currentChat) && !this.needOpenSearch) {
                int i46 = this.rowCount;
                this.hideMembersRow = i46;
                this.rowCount = i46 + 2;
                this.hideMembersInfoRow = i46 + 1;
            }
            if (this.selectType == 0 && ChatObject.canAddUsers(this.currentChat)) {
                int i47 = this.rowCount;
                this.rowCount = i47 + 1;
                this.addNewRow = i47;
            }
            if (this.selectType == 0 && ChatObject.canUserDoAdminAction(this.currentChat, 3)) {
                int i48 = this.rowCount;
                this.rowCount = i48 + 1;
                this.addNew2Row = i48;
            }
            if (this.loadingUsers && !(z = this.firstLoaded)) {
                if (z) {
                    return;
                }
                if (this.selectType == 0) {
                    int i49 = this.rowCount;
                    this.rowCount = i49 + 1;
                    this.loadingHeaderRow = i49;
                }
                int i50 = this.rowCount;
                this.rowCount = i50 + 1;
                this.loadingUserCellRow = i50;
                return;
            }
            if (!this.contacts.isEmpty()) {
                int i51 = this.rowCount;
                int i52 = i51 + 1;
                this.rowCount = i52;
                this.contactsHeaderRow = i51;
                this.contactsStartRow = i52;
                int size4 = i52 + this.contacts.size();
                this.rowCount = size4;
                this.contactsEndRow = size4;
                i = 1;
            }
            if (this.bots.isEmpty()) {
                i3 = i;
            } else {
                int i53 = this.rowCount;
                int i54 = i53 + 1;
                this.rowCount = i54;
                this.botHeaderRow = i53;
                this.botStartRow = i54;
                int size5 = i54 + this.bots.size();
                this.rowCount = size5;
                this.botEndRow = size5;
            }
            if (!this.participants.isEmpty()) {
                if (i3 != 0) {
                    int i55 = this.rowCount;
                    this.rowCount = i55 + 1;
                    this.membersHeaderRow = i55;
                }
                int i56 = this.rowCount;
                this.participantsStartRow = i56;
                int size6 = i56 + this.participants.size();
                this.rowCount = size6;
                this.participantsEndRow = size6;
            }
            int i57 = this.rowCount;
            if (i57 != 0) {
                this.rowCount = i57 + 1;
                this.participantsInfoRow = i57;
            }
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        loadChatParticipants(0, 200);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public View createView(Context context) {
        int i;
        boolean z = false;
        this.searching = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i2 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i3 = this.type;
        if (i3 == 3) {
            this.actionBar.setTitle(LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions));
        } else if (i3 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist));
        } else if (i3 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAdministrators));
        } else if (i3 == 2) {
            int i4 = this.selectType;
            if (i4 == 0) {
                if (this.isChannel) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSubscribers));
                } else {
                    this.actionBar.setTitle(LocaleController.getString("ChannelMembers", R.string.ChannelMembers));
                }
            } else if (i4 == 1) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin));
            } else if (i4 == 2) {
                this.actionBar.setTitle(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser));
            } else if (i4 == 3) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddException", R.string.ChannelAddException));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i5) {
                if (i5 == -1) {
                    if (ChatUsersActivity.this.checkDiscard(true)) {
                        ChatUsersActivity.this.finishFragment();
                    }
                } else if (i5 == 1) {
                    ChatUsersActivity.this.processDone();
                }
            }
        });
        if (this.selectType != 0 || (i = this.type) == 2 || i == 0 || i == 3) {
            this.searchListViewAdapter = new SearchAdapter(context);
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            ActionBarMenuItem actionBarMenuItemSearchListener = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
                @Override
                public void onSearchExpand() {
                    ChatUsersActivity.this.searching = true;
                    if (ChatUsersActivity.this.doneItem != null) {
                        ChatUsersActivity.this.doneItem.setVisibility(8);
                    }
                }

                @Override
                public void onSearchCollapse() {
                    ChatUsersActivity.this.searchListViewAdapter.searchUsers(null);
                    ChatUsersActivity.this.searching = false;
                    ChatUsersActivity.this.listView.setAnimateEmptyView(false, 0);
                    ChatUsersActivity.this.listView.setAdapter(ChatUsersActivity.this.listViewAdapter);
                    ChatUsersActivity.this.listViewAdapter.notifyDataSetChanged();
                    ChatUsersActivity.this.listView.setFastScrollVisible(true);
                    ChatUsersActivity.this.listView.setVerticalScrollBarEnabled(false);
                    if (ChatUsersActivity.this.doneItem != null) {
                        ChatUsersActivity.this.doneItem.setVisibility(0);
                    }
                }

                @Override
                public void onTextChanged(EditText editText) {
                    if (ChatUsersActivity.this.searchListViewAdapter == null) {
                        return;
                    }
                    String string = editText.getText().toString();
                    int itemCount = ChatUsersActivity.this.listView.getAdapter() == null ? 0 : ChatUsersActivity.this.listView.getAdapter().getItemCount();
                    ChatUsersActivity.this.searchListViewAdapter.searchUsers(string);
                    if (TextUtils.isEmpty(string) && ChatUsersActivity.this.listView != null && ChatUsersActivity.this.listView.getAdapter() != ChatUsersActivity.this.listViewAdapter) {
                        ChatUsersActivity.this.listView.setAnimateEmptyView(false, 0);
                        ChatUsersActivity.this.listView.setAdapter(ChatUsersActivity.this.listViewAdapter);
                        if (itemCount == 0) {
                            ChatUsersActivity.this.showItemsAnimated(0);
                        }
                    }
                    ChatUsersActivity.this.progressBar.setVisibility(8);
                    ChatUsersActivity.this.flickerLoadingView.setVisibility(0);
                }
            });
            this.searchItem = actionBarMenuItemSearchListener;
            if (this.type == 0 && !this.firstLoaded) {
                actionBarMenuItemSearchListener.setVisibility(8);
            }
            if (this.type == 3) {
                this.searchItem.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.searchItem.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.currentChat) && !this.currentChat.creator) {
                this.searchItem.setVisibility(8);
            }
            if (this.type == 3) {
                this.doneItem = actionBarMenuCreateMenu.addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f), LocaleController.getString("Done", R.string.Done));
            }
        } else if (i == 1 && ChatObject.isChannelAndNotMegaGroup(this.currentChat) && ChatObject.hasAdminRights(this.currentChat)) {
            this.doneItem = this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f), LocaleController.getString("Done", R.string.Done));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.flickerLoadingView = flickerLoadingView;
        flickerLoadingView.setViewType(6);
        this.flickerLoadingView.showDate(false);
        this.flickerLoadingView.setUseHeaderOffset(false);
        FlickerLoadingView flickerLoadingView2 = this.flickerLoadingView;
        int i5 = Theme.key_actionBarDefaultSubmenuBackground;
        int i6 = Theme.key_listSelector;
        flickerLoadingView2.setColors(i5, i6, i6);
        frameLayout3.addView(this.flickerLoadingView, LayoutHelper.createFrame(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.progressBar = radialProgressView;
        frameLayout3.addView(radialProgressView, LayoutHelper.createFrame(-2, -2, 17));
        this.flickerLoadingView.setVisibility(8);
        this.progressBar.setVisibility(8);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, frameLayout3, 1);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
        this.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.emptyView.setVisibility(8);
        this.emptyView.setAnimateLayoutChange(true);
        this.emptyView.showProgress(true, false);
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.emptyView.addView(frameLayout3, 0);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public void invalidate() {
                super.invalidate();
                View view = ChatUsersActivity.this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setSections();
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i2, z) {
            @Override
            public int scrollVerticallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
                if (!ChatUsersActivity.this.firstLoaded && ChatUsersActivity.this.type == 0 && ChatUsersActivity.this.participants.size() == 0) {
                    return 0;
                }
                return super.scrollVerticallyBy(i7, recycler, state);
            }
        };
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();

            @Override
            protected void onAllAnimationsDone() {
                super.onAllAnimationsDone();
                this.notificationsLocker.unlock();
            }

            @Override
            public void runPendingAnimations() {
                boolean zIsEmpty = this.mPendingRemovals.isEmpty();
                boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
                boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
                boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
                if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                    this.notificationsLocker.lock();
                }
                super.runPendingAnimations();
            }

            @Override
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                ChatUsersActivity.this.listView.invalidate();
            }

            @Override
            protected void onChangeAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onChangeAnimationUpdate(viewHolder);
                ChatUsersActivity.this.listView.invalidate();
            }
        };
        defaultItemAnimator.setDurations(420L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setAnimateEmptyView(true, 0);
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i7) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i7);
            }

            @Override
            public void onDoubleTap(View view, int i7, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i7, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i7, float f, float f2) {
                ChatUsersActivity.$r8$lambda$cwi7SltdT7MBzf7qhdI3eZF4dQA(this.f$0, view, i7, f, f2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i7) {
                return ChatUsersActivity.$r8$lambda$geuQNgpib4Y8mtf7h0jks7DE2ew(this.f$0, view, i7);
            }
        });
        if (this.searchItem != null) {
            this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                }

                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i7) {
                    if (i7 == 1) {
                        AndroidUtilities.hideKeyboard(ChatUsersActivity.this.getParentActivity().getCurrentFocus());
                    }
                }
            });
        }
        UndoView undoView = new UndoView(context);
        this.undoView = undoView;
        frameLayout2.addView(undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        updateRows();
        this.listView.setEmptyView(this.emptyView);
        this.listView.setAnimateEmptyView(false, 0);
        if (this.needOpenSearch) {
            this.searchItem.openSearch(false);
        }
        return this.fragmentView;
    }

    public static void $r8$lambda$cwi7SltdT7MBzf7qhdI3eZF4dQA(final ChatUsersActivity chatUsersActivity, View view, int i, float f, float f2) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View viewFindViewByPosition;
        long j;
        TLObject item;
        long j2;
        String str;
        final TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j3;
        long peerId;
        boolean z;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean zCanBlockUsers;
        int i2 = 0;
        boolean z2 = chatUsersActivity.listView.getAdapter() == chatUsersActivity.listViewAdapter;
        if (i == chatUsersActivity.signMessagesRow) {
            boolean z3 = !chatUsersActivity.signatures;
            chatUsersActivity.signatures = z3;
            ((TextCheckCell) view).setChecked(z3);
            AndroidUtilities.updateVisibleRows(chatUsersActivity.listView);
            DiffCallback diffCallbackSaveState = chatUsersActivity.saveState();
            chatUsersActivity.updateRows();
            chatUsersActivity.updateListAnimated(diffCallbackSaveState);
            chatUsersActivity.listViewAdapter.notifyItemChanged(chatUsersActivity.signMessagesInfoRow);
        } else if (i == chatUsersActivity.signMessagesProfilesRow) {
            boolean z4 = !chatUsersActivity.profiles;
            chatUsersActivity.profiles = z4;
            ((TextCheckCell) view).setChecked(z4);
            AndroidUtilities.updateVisibleRows(chatUsersActivity.listView);
            DiffCallback diffCallbackSaveState2 = chatUsersActivity.saveState();
            chatUsersActivity.updateRows();
            chatUsersActivity.updateListAnimated(diffCallbackSaveState2);
            chatUsersActivity.listViewAdapter.notifyItemChanged(chatUsersActivity.signMessagesInfoRow);
        } else if (i == chatUsersActivity.payRow) {
            boolean z5 = !chatUsersActivity.enablePrice;
            chatUsersActivity.enablePrice = z5;
            ((TextCheckCell) view).setChecked(z5);
            AndroidUtilities.updateVisibleRows(chatUsersActivity.listView);
            DiffCallback diffCallbackSaveState3 = chatUsersActivity.saveState();
            chatUsersActivity.updateRows();
            chatUsersActivity.updateListAnimated(diffCallbackSaveState3);
            chatUsersActivity.listViewAdapter.notifyItemChanged(chatUsersActivity.payRow);
        } else if (z2) {
            if (chatUsersActivity.isExpandableSendMediaRow(i)) {
                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                if (i == chatUsersActivity.sendMediaPhotosRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chatUsersActivity.defaultBannedRights;
                    tL_chatBannedRights2.send_photos = !tL_chatBannedRights2.send_photos;
                } else if (i == chatUsersActivity.sendMediaVideosRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chatUsersActivity.defaultBannedRights;
                    tL_chatBannedRights3.send_videos = !tL_chatBannedRights3.send_videos;
                } else if (i == chatUsersActivity.sendMediaStickerGifsRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = chatUsersActivity.defaultBannedRights;
                    boolean z6 = !tL_chatBannedRights4.send_stickers;
                    tL_chatBannedRights4.send_inline = z6;
                    tL_chatBannedRights4.send_gifs = z6;
                    tL_chatBannedRights4.send_games = z6;
                    tL_chatBannedRights4.send_stickers = z6;
                } else if (i == chatUsersActivity.sendMediaMusicRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = chatUsersActivity.defaultBannedRights;
                    tL_chatBannedRights5.send_audios = !tL_chatBannedRights5.send_audios;
                } else if (i == chatUsersActivity.sendMediaFilesRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = chatUsersActivity.defaultBannedRights;
                    tL_chatBannedRights6.send_docs = !tL_chatBannedRights6.send_docs;
                } else if (i == chatUsersActivity.sendMediaVoiceMessagesRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = chatUsersActivity.defaultBannedRights;
                    tL_chatBannedRights7.send_voices = !tL_chatBannedRights7.send_voices;
                } else if (i == chatUsersActivity.sendMediaVideoMessagesRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = chatUsersActivity.defaultBannedRights;
                    tL_chatBannedRights8.send_roundvideos = !tL_chatBannedRights8.send_roundvideos;
                } else if (i == chatUsersActivity.sendMediaEmbededLinksRow) {
                    if (chatUsersActivity.defaultBannedRights.send_plain && (viewFindViewByPosition = chatUsersActivity.layoutManager.findViewByPosition(chatUsersActivity.sendMessagesRow)) != null) {
                        AndroidUtilities.shakeViewSpring(viewFindViewByPosition);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights9 = chatUsersActivity.defaultBannedRights;
                        tL_chatBannedRights9.embed_links = !tL_chatBannedRights9.embed_links;
                    }
                } else if (i == chatUsersActivity.sendPollsRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = chatUsersActivity.defaultBannedRights;
                    tL_chatBannedRights10.send_polls = !tL_chatBannedRights10.send_polls;
                } else if (i == chatUsersActivity.sendReactionsRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = chatUsersActivity.defaultBannedRights;
                    tL_chatBannedRights11.send_reactions = !tL_chatBannedRights11.send_reactions;
                }
                checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
                AndroidUtilities.updateVisibleRows(chatUsersActivity.listView);
                DiffCallback diffCallbackSaveState4 = chatUsersActivity.saveState();
                chatUsersActivity.updateRows();
                chatUsersActivity.updateListAnimated(diffCallbackSaveState4);
            } else if (i == chatUsersActivity.dontRestrictBoostersRow) {
                TextCheckCell2 textCheckCell2 = (TextCheckCell2) view;
                boolean z7 = !textCheckCell2.isChecked();
                chatUsersActivity.isEnabledNotRestrictBoosters = z7;
                textCheckCell2.setChecked(z7);
                AndroidUtilities.updateVisibleRows(chatUsersActivity.listView);
                DiffCallback diffCallbackSaveState5 = chatUsersActivity.saveState();
                chatUsersActivity.updateRows();
                chatUsersActivity.updateListAnimated(diffCallbackSaveState5);
            } else {
                if (i == chatUsersActivity.addNewRow) {
                    int i3 = chatUsersActivity.type;
                    if (i3 == 0 || i3 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatUsersActivity.chatId);
                        bundle.putInt("type", 2);
                        bundle.putInt("selectType", chatUsersActivity.type == 0 ? 2 : 3);
                        ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle);
                        chatUsersActivity2.setInfo(chatUsersActivity.info);
                        chatUsersActivity2.setBannedRights(chatUsersActivity.defaultBannedRights);
                        chatUsersActivity2.setDelegate(new ChatUsersActivityDelegate() {
                            @Override
                            public void didChangeOwner(TLRPC.User user) {
                                ChatUsersActivityDelegate.CC.$default$didChangeOwner(this, user);
                            }

                            @Override
                            public void didSelectUser(long j4) {
                                ChatUsersActivityDelegate.CC.$default$didSelectUser(this, j4);
                            }

                            @Override
                            public void didAddParticipantToList(long j4, TLObject tLObject) {
                                if (ChatUsersActivity.this.participantsMap.get(j4) == null) {
                                    DiffCallback diffCallbackSaveState6 = ChatUsersActivity.this.saveState();
                                    ChatUsersActivity.this.participants.add(tLObject);
                                    ChatUsersActivity.this.participantsMap.put(j4, tLObject);
                                    ChatUsersActivity chatUsersActivity3 = ChatUsersActivity.this;
                                    chatUsersActivity3.sortUsers(chatUsersActivity3.participants);
                                    ChatUsersActivity.this.updateListAnimated(diffCallbackSaveState6);
                                }
                            }

                            @Override
                            public void didKickParticipant(long j4) {
                                if (ChatUsersActivity.this.participantsMap.get(j4) == null) {
                                    DiffCallback diffCallbackSaveState6 = ChatUsersActivity.this.saveState();
                                    TLRPC.TL_channelParticipantBanned tL_channelParticipantBanned = new TLRPC.TL_channelParticipantBanned();
                                    if (j4 > 0) {
                                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                        tL_channelParticipantBanned.peer = tL_peerUser;
                                        tL_peerUser.user_id = j4;
                                    } else {
                                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                        tL_channelParticipantBanned.peer = tL_peerChannel;
                                        tL_peerChannel.channel_id = -j4;
                                    }
                                    tL_channelParticipantBanned.date = ChatUsersActivity.this.getConnectionsManager().getCurrentTime();
                                    tL_channelParticipantBanned.kicked_by = ChatUsersActivity.this.getAccountInstance().getUserConfig().clientUserId;
                                    ChatUsersActivity.this.info.kicked_count++;
                                    ChatUsersActivity.this.participants.add(tL_channelParticipantBanned);
                                    ChatUsersActivity.this.participantsMap.put(j4, tL_channelParticipantBanned);
                                    ChatUsersActivity chatUsersActivity3 = ChatUsersActivity.this;
                                    chatUsersActivity3.sortUsers(chatUsersActivity3.participants);
                                    ChatUsersActivity.this.updateListAnimated(diffCallbackSaveState6);
                                }
                            }
                        });
                        chatUsersActivity.presentFragment(chatUsersActivity2);
                        return;
                    }
                    if (i3 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chatUsersActivity.chatId);
                        bundle2.putInt("type", 2);
                        bundle2.putInt("selectType", 1);
                        ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle2);
                        chatUsersActivity3.setDelegate(chatUsersActivity.new AnonymousClass7());
                        chatUsersActivity3.setInfo(chatUsersActivity.info);
                        chatUsersActivity.presentFragment(chatUsersActivity3);
                        return;
                    }
                    if (i3 == 2) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("addToGroup", true);
                        bundle3.putLong(chatUsersActivity.isChannel ? "channelId" : "chatId", chatUsersActivity.currentChat.id);
                        GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundle3);
                        groupCreateActivity.setInfo(chatUsersActivity.info);
                        LongSparseArray longSparseArray = chatUsersActivity.contactsMap;
                        groupCreateActivity.setIgnoreUsers((longSparseArray == null || longSparseArray.size() == 0) ? chatUsersActivity.participantsMap : chatUsersActivity.contactsMap);
                        groupCreateActivity.setDelegate2(chatUsersActivity.new AnonymousClass8(groupCreateActivity));
                        chatUsersActivity.presentFragment(groupCreateActivity);
                        return;
                    }
                    return;
                }
                if (i == chatUsersActivity.recentActionsRow) {
                    chatUsersActivity.presentFragment(new ChannelAdminLogActivity(chatUsersActivity.currentChat));
                    return;
                }
                if (i == chatUsersActivity.antiSpamRow) {
                    final TextCell textCell = (TextCell) view;
                    TLRPC.ChatFull chatFull3 = chatUsersActivity.info;
                    if (chatFull3 != null && !chatFull3.antispam && chatUsersActivity.getParticipantsCount() < chatUsersActivity.getMessagesController().telegramAntispamGroupSizeMin) {
                        BulletinFactory.of(chatUsersActivity).createSimpleBulletin(R.raw.msg_antispam, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelAntiSpamForbidden", chatUsersActivity.getMessagesController().telegramAntispamGroupSizeMin, new Object[0]))).show();
                        return;
                    }
                    if (chatUsersActivity.info == null || !ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 13) || chatUsersActivity.antiSpamToggleLoading) {
                        return;
                    }
                    chatUsersActivity.antiSpamToggleLoading = true;
                    final boolean z8 = chatUsersActivity.info.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = chatUsersActivity.getMessagesController().getInputChannel(chatUsersActivity.chatId);
                    TLRPC.ChatFull chatFull4 = chatUsersActivity.info;
                    boolean z9 = true ^ chatFull4.antispam;
                    chatFull4.antispam = z9;
                    tL_channels_toggleAntiSpam.enabled = z9;
                    textCell.setChecked(z9);
                    Switch checkBox = textCell.getCheckBox();
                    if (!ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 13) || ((chatFull2 = chatUsersActivity.info) != null && !chatFull2.antispam && chatUsersActivity.getParticipantsCount() < chatUsersActivity.getMessagesController().telegramAntispamGroupSizeMin)) {
                        i2 = R.drawable.permission_locked;
                    }
                    checkBox.setIcon(i2);
                    chatUsersActivity.getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            ChatUsersActivity.$r8$lambda$FMDz99wLYAEBzfoMdx9Oxdn7aC4(this.f$0, textCell, z8, tLObject, tL_error);
                        }
                    });
                    return;
                }
                if (i == chatUsersActivity.hideMembersRow) {
                    final TextCell textCell2 = (TextCell) view;
                    if (chatUsersActivity.getParticipantsCount() < chatUsersActivity.getMessagesController().hiddenMembersGroupSizeMin) {
                        BulletinFactory.of(chatUsersActivity).createSimpleBulletin(R.raw.contacts_sync_off, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelHiddenMembersForbidden", chatUsersActivity.getMessagesController().hiddenMembersGroupSizeMin, new Object[0]))).show();
                        return;
                    }
                    if (chatUsersActivity.info == null || !ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 2) || chatUsersActivity.hideMembersToggleLoading) {
                        return;
                    }
                    chatUsersActivity.hideMembersToggleLoading = true;
                    final boolean z10 = chatUsersActivity.info.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = chatUsersActivity.getMessagesController().getInputChannel(chatUsersActivity.chatId);
                    TLRPC.ChatFull chatFull5 = chatUsersActivity.info;
                    boolean z11 = true ^ chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z11;
                    tL_channels_toggleParticipantsHidden.enabled = z11;
                    textCell2.setChecked(z11);
                    Switch checkBox2 = textCell2.getCheckBox();
                    if (!ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 2) || ((chatFull = chatUsersActivity.info) != null && !chatFull.participants_hidden && chatUsersActivity.getParticipantsCount() < chatUsersActivity.getMessagesController().hiddenMembersGroupSizeMin)) {
                        i2 = R.drawable.permission_locked;
                    }
                    checkBox2.setIcon(i2);
                    chatUsersActivity.getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            ChatUsersActivity.m1887$r8$lambda$GYiLiri25TgY2wQUwuUn55es(this.f$0, textCell2, z10, tLObject, tL_error);
                        }
                    });
                    return;
                }
                if (i == chatUsersActivity.tagsRow) {
                    if (chatUsersActivity.currentChat == null) {
                        return;
                    }
                    final TextCell textCell3 = (TextCell) view;
                    final boolean zIsChecked = textCell3.isChecked();
                    textCell3.setChecked(!textCell3.isChecked());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = MessagesController.getInputPeer(chatUsersActivity.currentChat);
                    TLRPC.Chat chat = chatUsersActivity.currentChat;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights12 = chatUsersActivity.currentChat.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights12;
                    tL_chatBannedRights12.edit_rank = !textCell3.isChecked();
                    chatUsersActivity.getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            ChatUsersActivity.m1889$r8$lambda$TaqiG38Ob2M3XDoqeLWpynC6Y(this.f$0, textCell3, zIsChecked, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                        }
                    });
                } else {
                    if (i == chatUsersActivity.removedUsersRow) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", chatUsersActivity.chatId);
                        bundle4.putInt("type", 0);
                        ChatUsersActivity chatUsersActivity4 = new ChatUsersActivity(bundle4);
                        chatUsersActivity4.setInfo(chatUsersActivity.info);
                        chatUsersActivity.presentFragment(chatUsersActivity4);
                        return;
                    }
                    if (i == chatUsersActivity.gigaConvertRow) {
                        chatUsersActivity.showDialog(chatUsersActivity.new AnonymousClass9(chatUsersActivity.getParentActivity(), chatUsersActivity));
                    } else {
                        if (i == chatUsersActivity.addNew2Row) {
                            if (chatUsersActivity.info != null) {
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatUsersActivity.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull6 = chatUsersActivity.info;
                                manageLinksActivity.setInfo(chatFull6, chatFull6.exported_invite);
                                chatUsersActivity.presentFragment(manageLinksActivity);
                                return;
                            }
                            return;
                        }
                        if ((i > chatUsersActivity.permissionsSectionRow && i <= Math.max(chatUsersActivity.manageTopicsRow, chatUsersActivity.changeInfoRow)) || i == chatUsersActivity.manageLinkedPeersRow) {
                            TextCheckCell2 textCheckCell3 = (TextCheckCell2) view;
                            if (textCheckCell3.isEnabled()) {
                                if (textCheckCell3.hasIcon()) {
                                    if (ChatObject.isPublic(chatUsersActivity.currentChat) && (i == chatUsersActivity.pinMessagesRow || i == chatUsersActivity.changeInfoRow)) {
                                        BulletinFactory.of(chatUsersActivity).createErrorBulletin(LocaleController.getString(R.string.EditCantEditPermissionsPublic)).show();
                                        return;
                                    } else if (ChatObject.isDiscussionGroup(chatUsersActivity.currentAccount, chatUsersActivity.chatId) && (i == chatUsersActivity.pinMessagesRow || i == chatUsersActivity.changeInfoRow)) {
                                        BulletinFactory.of(chatUsersActivity).createErrorBulletin(LocaleController.getString(R.string.EditCantEditPermissionsDiscussion)).show();
                                        return;
                                    } else {
                                        BulletinFactory.of(chatUsersActivity).createErrorBulletin(LocaleController.getString("EditCantEditPermissions", R.string.EditCantEditPermissions)).show();
                                        return;
                                    }
                                }
                                if (i == chatUsersActivity.sendMediaRow) {
                                    DiffCallback diffCallbackSaveState6 = chatUsersActivity.saveState();
                                    chatUsersActivity.sendMediaExpanded = true ^ chatUsersActivity.sendMediaExpanded;
                                    AndroidUtilities.updateVisibleRows(chatUsersActivity.listView);
                                    chatUsersActivity.updateListAnimated(diffCallbackSaveState6);
                                    return;
                                }
                                textCheckCell3.setChecked(!textCheckCell3.isChecked());
                                if (i == chatUsersActivity.changeInfoRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = chatUsersActivity.defaultBannedRights;
                                    tL_chatBannedRights13.change_info = !tL_chatBannedRights13.change_info;
                                    return;
                                }
                                if (i == chatUsersActivity.manageLinkedPeersRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights14 = chatUsersActivity.defaultBannedRights;
                                    tL_chatBannedRights14.manage_linked_peers = !tL_chatBannedRights14.manage_linked_peers;
                                    return;
                                }
                                if (i == chatUsersActivity.addUsersRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights15 = chatUsersActivity.defaultBannedRights;
                                    tL_chatBannedRights15.invite_users = !tL_chatBannedRights15.invite_users;
                                    return;
                                }
                                if (i == chatUsersActivity.manageTopicsRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights16 = chatUsersActivity.defaultBannedRights;
                                    tL_chatBannedRights16.manage_topics = !tL_chatBannedRights16.manage_topics;
                                    return;
                                }
                                if (i == chatUsersActivity.pinMessagesRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights17 = chatUsersActivity.defaultBannedRights;
                                    tL_chatBannedRights17.pin_messages = !tL_chatBannedRights17.pin_messages;
                                    return;
                                }
                                if (i == chatUsersActivity.editTagRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights18 = chatUsersActivity.defaultBannedRights;
                                    tL_chatBannedRights18.edit_rank = !tL_chatBannedRights18.edit_rank;
                                    return;
                                }
                                if (i == chatUsersActivity.sendMessagesRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights19 = chatUsersActivity.defaultBannedRights;
                                    tL_chatBannedRights19.send_plain = true ^ tL_chatBannedRights19.send_plain;
                                    int i4 = chatUsersActivity.sendMediaEmbededLinksRow;
                                    if (i4 >= 0) {
                                        chatUsersActivity.listViewAdapter.notifyItemChanged(i4);
                                    }
                                    int i5 = chatUsersActivity.sendMediaRow;
                                    if (i5 >= 0) {
                                        chatUsersActivity.listViewAdapter.notifyItemChanged(i5);
                                    }
                                    DiffCallback diffCallbackSaveState7 = chatUsersActivity.saveState();
                                    chatUsersActivity.updateRows();
                                    chatUsersActivity.updateListAnimated(diffCallbackSaveState7);
                                    return;
                                }
                                if (i == chatUsersActivity.sendMediaRow) {
                                    DiffCallback diffCallbackSaveState8 = chatUsersActivity.saveState();
                                    chatUsersActivity.sendMediaExpanded = true ^ chatUsersActivity.sendMediaExpanded;
                                    AndroidUtilities.updateVisibleRows(chatUsersActivity.listView);
                                    chatUsersActivity.updateListAnimated(diffCallbackSaveState8);
                                    return;
                                }
                                if (i == chatUsersActivity.sendStickersRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights20 = chatUsersActivity.defaultBannedRights;
                                    boolean z12 = !tL_chatBannedRights20.send_stickers;
                                    tL_chatBannedRights20.send_inline = z12;
                                    tL_chatBannedRights20.send_gifs = z12;
                                    tL_chatBannedRights20.send_games = z12;
                                    tL_chatBannedRights20.send_stickers = z12;
                                    return;
                                }
                                if (i == chatUsersActivity.embedLinksRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights21 = chatUsersActivity.defaultBannedRights;
                                    tL_chatBannedRights21.embed_links = !tL_chatBannedRights21.embed_links;
                                    return;
                                } else {
                                    if (i == chatUsersActivity.sendPollsRow) {
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights22 = chatUsersActivity.defaultBannedRights;
                                        tL_chatBannedRights22.send_polls = !tL_chatBannedRights22.send_polls;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
            }
        }
        if (z2) {
            item = chatUsersActivity.listViewAdapter.getItem(i);
            if (item instanceof TLRPC.User) {
                str = "";
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
                j3 = ((TLRPC.User) item).id;
                j = 0;
            } else {
                if (item instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) item;
                    peerId = MessageObject.getPeerId(channelParticipant.peer);
                    tL_chatBannedRights = channelParticipant.banned_rights;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights3 = channelParticipant.admin_rights;
                    String str2 = channelParticipant.rank;
                    j = 0;
                    z = !((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
                    if ((item instanceof TLRPC.TL_channelParticipantCreator) && (tL_chatAdminRights3 = ((TLRPC.TL_channelParticipantCreator) item).admin_rights) == null) {
                        tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
                        tL_chatAdminRights3.manage_ranks = true;
                        tL_chatAdminRights3.add_admins = true;
                        tL_chatAdminRights3.pin_messages = true;
                        tL_chatAdminRights3.manage_topics = true;
                        tL_chatAdminRights3.invite_users = true;
                        tL_chatAdminRights3.ban_users = true;
                        tL_chatAdminRights3.delete_messages = true;
                        tL_chatAdminRights3.edit_messages = true;
                        tL_chatAdminRights3.post_messages = true;
                        tL_chatAdminRights3.change_info = true;
                        if (!chatUsersActivity.isChannel) {
                            tL_chatAdminRights3.manage_call = true;
                        }
                    }
                    tL_chatAdminRights = tL_chatAdminRights3;
                    str = str2;
                } else {
                    j = 0;
                    if (!(item instanceof TLRPC.ChatParticipant)) {
                        j3 = 0;
                        str = "";
                        tL_chatBannedRights = null;
                        tL_chatAdminRights = null;
                    } else {
                        peerId = ((TLRPC.ChatParticipant) item).user_id;
                        z = chatUsersActivity.currentChat.creator;
                        if (!(item instanceof TLRPC.TL_chatParticipantCreator)) {
                            str = "";
                            tL_chatBannedRights = null;
                            tL_chatAdminRights = null;
                        } else {
                            tL_chatAdminRights2 = new TLRPC.TL_chatAdminRights();
                            tL_chatAdminRights2.manage_ranks = true;
                            tL_chatAdminRights2.add_admins = true;
                            tL_chatAdminRights2.pin_messages = true;
                            tL_chatAdminRights2.manage_topics = true;
                            tL_chatAdminRights2.invite_users = true;
                            tL_chatAdminRights2.ban_users = true;
                            tL_chatAdminRights2.delete_messages = true;
                            tL_chatAdminRights2.edit_messages = true;
                            tL_chatAdminRights2.post_messages = true;
                            tL_chatAdminRights2.change_info = true;
                            if (!chatUsersActivity.isChannel) {
                                tL_chatAdminRights2.manage_call = true;
                            }
                            str = "";
                            tL_chatBannedRights = null;
                            tL_chatAdminRights = tL_chatAdminRights2;
                        }
                    }
                }
                j3 = peerId;
            }
        } else {
            j = 0;
            item = chatUsersActivity.searchListViewAdapter.getItem(i);
            if (item instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) item;
                chatUsersActivity.getMessagesController().putUser(user, false);
                long j4 = user.id;
                item = chatUsersActivity.getAnyParticipant(j4);
                j2 = j4;
            } else if ((item instanceof TLRPC.ChannelParticipant) || (item instanceof TLRPC.ChatParticipant)) {
                j2 = 0;
            } else {
                j2 = 0;
                item = null;
            }
            if (item instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) item;
                peerId = MessageObject.getPeerId(channelParticipant2.peer);
                boolean z13 = !((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit;
                TLRPC.TL_chatBannedRights tL_chatBannedRights23 = channelParticipant2.banned_rights;
                tL_chatAdminRights2 = channelParticipant2.admin_rights;
                str = channelParticipant2.rank;
                z = z13;
                tL_chatBannedRights = tL_chatBannedRights23;
                tL_chatAdminRights = tL_chatAdminRights2;
                j3 = peerId;
            } else if (!(item instanceof TLRPC.ChatParticipant)) {
                str = "";
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
                j3 = j2;
                z = item == null;
            } else {
                peerId = ((TLRPC.ChatParticipant) item).user_id;
                z = chatUsersActivity.currentChat.creator;
                str = "";
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
                j3 = peerId;
            }
        }
        if (j3 != j) {
            int i6 = chatUsersActivity.selectType;
            if (i6 != 0) {
                if (i6 == 3 || i6 == 1) {
                    if (i6 != 1 && z && ((item instanceof TLRPC.TL_channelParticipantAdmin) || (item instanceof TLRPC.TL_chatParticipantAdmin))) {
                        final TLRPC.User user2 = chatUsersActivity.getMessagesController().getUser(Long.valueOf(j3));
                        AlertDialog.Builder builder = new AlertDialog.Builder(chatUsersActivity.getParentActivity());
                        builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
                        builder.setMessage(LocaleController.formatString("AdminWillBeRemoved", R.string.AdminWillBeRemoved, UserObject.getUserName(user2)));
                        final TLObject tLObject = item;
                        final boolean z14 = z;
                        final TLRPC.TL_chatAdminRights tL_chatAdminRights4 = tL_chatAdminRights;
                        final String str3 = str;
                        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog, int i7) {
                                ChatUsersActivity.m1892$r8$lambda$pBychBJ6P6JEpBXL1l6DSo2BOs(this.f$0, user2, tLObject, tL_chatAdminRights4, tL_chatBannedRights, str3, z14, alertDialog, i7);
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                        chatUsersActivity.showDialog(builder.create());
                        return;
                    }
                    chatUsersActivity.openRightsEdit(j3, item, tL_chatAdminRights, tL_chatBannedRights, str, z, i6 == 1 ? 0 : 1, i6 == 1 || i6 == 3);
                    return;
                }
                chatUsersActivity.removeParticipant(j3);
                return;
            }
            final TLObject tLObject2 = item;
            int i7 = chatUsersActivity.type;
            if (i7 == 1) {
                if (j3 == chatUsersActivity.getUserConfig().getClientUserId() || !(chatUsersActivity.currentChat.creator || z)) {
                    zCanBlockUsers = false;
                } else {
                    zCanBlockUsers = true;
                }
            } else if (i7 == 0 || i7 == 3) {
                zCanBlockUsers = ChatObject.canBlockUsers(chatUsersActivity.currentChat);
            } else {
                zCanBlockUsers = false;
            }
            int i8 = chatUsersActivity.type;
            if (i8 == 0 || ((i8 != 1 && chatUsersActivity.isChannel) || (i8 == 2 && chatUsersActivity.selectType == 0))) {
                if (j3 == chatUsersActivity.getUserConfig().getClientUserId()) {
                    return;
                }
                Bundle bundle5 = new Bundle();
                if (j3 > j) {
                    bundle5.putLong("user_id", j3);
                } else {
                    bundle5.putLong("chat_id", -j3);
                }
                chatUsersActivity.presentFragment(new ProfileActivity(bundle5));
                return;
            }
            if (tL_chatBannedRights == null) {
                tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
                tL_chatBannedRights.view_messages = true;
                tL_chatBannedRights.send_stickers = true;
                tL_chatBannedRights.send_media = true;
                tL_chatBannedRights.send_photos = true;
                tL_chatBannedRights.send_videos = true;
                tL_chatBannedRights.send_roundvideos = true;
                tL_chatBannedRights.send_audios = true;
                tL_chatBannedRights.send_voices = true;
                tL_chatBannedRights.send_docs = true;
                tL_chatBannedRights.embed_links = true;
                tL_chatBannedRights.send_plain = true;
                tL_chatBannedRights.send_messages = true;
                tL_chatBannedRights.send_games = true;
                tL_chatBannedRights.send_inline = true;
                tL_chatBannedRights.send_gifs = true;
                tL_chatBannedRights.pin_messages = true;
                tL_chatBannedRights.edit_rank = true;
                tL_chatBannedRights.send_reactions = true;
                tL_chatBannedRights.send_polls = true;
                tL_chatBannedRights.invite_users = true;
                tL_chatBannedRights.manage_topics = true;
                tL_chatBannedRights.change_info = true;
            }
            ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j3, chatUsersActivity.chatId, tL_chatAdminRights, chatUsersActivity.defaultBannedRights, tL_chatBannedRights, str, chatUsersActivity.type == 1 ? 0 : 1, zCanBlockUsers, tLObject2 == null, null);
            chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                @Override
                public void didSetRights(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights5, TLRPC.TL_chatBannedRights tL_chatBannedRights24, String str4) {
                    TLObject tLObject3 = tLObject2;
                    if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant3 = (TLRPC.ChannelParticipant) tLObject3;
                        channelParticipant3.admin_rights = tL_chatAdminRights5;
                        channelParticipant3.banned_rights = tL_chatBannedRights24;
                        channelParticipant3.rank = str4;
                        ChatUsersActivity.this.updateParticipantWithRights(channelParticipant3, tL_chatAdminRights5, tL_chatBannedRights24, 0L, false);
                    }
                }

                @Override
                public void didChangeOwner(TLRPC.User user3) {
                    ChatUsersActivity.this.onOwnerChaged(user3);
                }
            });
            chatUsersActivity.presentFragment(chatRightsEditActivity);
        }
    }

    class AnonymousClass7 implements ChatUsersActivityDelegate {
        @Override
        public void didKickParticipant(long j) {
            ChatUsersActivityDelegate.CC.$default$didKickParticipant(this, j);
        }

        AnonymousClass7() {
        }

        @Override
        public void didAddParticipantToList(long j, TLObject tLObject) {
            if (tLObject == null || ChatUsersActivity.this.participantsMap.get(j) != null) {
                return;
            }
            DiffCallback diffCallbackSaveState = ChatUsersActivity.this.saveState();
            ChatUsersActivity.this.participants.add(tLObject);
            ChatUsersActivity.this.participantsMap.put(j, tLObject);
            ChatUsersActivity.sortAdmins(ChatUsersActivity.this.participants);
            ChatUsersActivity.this.updateListAnimated(diffCallbackSaveState);
        }

        @Override
        public void didChangeOwner(TLRPC.User user) {
            ChatUsersActivity.this.onOwnerChaged(user);
        }

        @Override
        public void didSelectUser(long j) {
            final TLRPC.User user = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(j));
            if (user != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatUsersActivity.AnonymousClass7.$r8$lambda$vGhdajvYdnmOEjp5ksy5jDCzVjU(this.f$0, user);
                    }
                }, 200L);
            }
            if (ChatUsersActivity.this.participantsMap.get(j) == null) {
                DiffCallback diffCallbackSaveState = ChatUsersActivity.this.saveState();
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser;
                tL_peerUser.user_id = user.id;
                tL_channelParticipantAdmin.date = ChatUsersActivity.this.getConnectionsManager().getCurrentTime();
                tL_channelParticipantAdmin.promoted_by = ChatUsersActivity.this.getAccountInstance().getUserConfig().clientUserId;
                ChatUsersActivity.this.participants.add(tL_channelParticipantAdmin);
                ChatUsersActivity.this.participantsMap.put(user.id, tL_channelParticipantAdmin);
                ChatUsersActivity.sortAdmins(ChatUsersActivity.this.participants);
                ChatUsersActivity.this.updateListAnimated(diffCallbackSaveState);
            }
        }

        public static void $r8$lambda$vGhdajvYdnmOEjp5ksy5jDCzVjU(AnonymousClass7 anonymousClass7, TLRPC.User user) {
            if (BulletinFactory.canShowBulletin(ChatUsersActivity.this)) {
                BulletinFactory.createPromoteToAdminBulletin(ChatUsersActivity.this, user.first_name).show();
            }
        }
    }

    class AnonymousClass8 implements GroupCreateActivity.ContactsAddActivityDelegate {
        final GroupCreateActivity val$fragment;

        public static void $r8$lambda$PA6hqLhR41X8pAYxwG7PbJlMIiA(TLRPC.User user) {
        }

        AnonymousClass8(GroupCreateActivity groupCreateActivity) {
            this.val$fragment = groupCreateActivity;
        }

        @Override
        public void didSelectUsers(ArrayList arrayList, int i) {
            if (this.val$fragment.getParentActivity() == null) {
                return;
            }
            ChatUsersActivity.this.getMessagesController().addUsersToChat(ChatUsersActivity.this.currentChat, ChatUsersActivity.this, arrayList, i, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ChatUsersActivity.AnonymousClass8.m1895$r8$lambda$5XNTAcSKXaAGB8Nqet0Juf9WGU(this.f$0, (TLRPC.User) obj);
                }
            }, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ChatUsersActivity.AnonymousClass8.$r8$lambda$PA6hqLhR41X8pAYxwG7PbJlMIiA((TLRPC.User) obj);
                }
            }, null);
        }

        public static void m1895$r8$lambda$5XNTAcSKXaAGB8Nqet0Juf9WGU(AnonymousClass8 anonymousClass8, TLRPC.User user) {
            DiffCallback diffCallbackSaveState = ChatUsersActivity.this.saveState();
            ArrayList arrayList = (ChatUsersActivity.this.contactsMap == null || ChatUsersActivity.this.contactsMap.size() == 0) ? ChatUsersActivity.this.participants : ChatUsersActivity.this.contacts;
            LongSparseArray longSparseArray = (ChatUsersActivity.this.contactsMap == null || ChatUsersActivity.this.contactsMap.size() == 0) ? ChatUsersActivity.this.participantsMap : ChatUsersActivity.this.contactsMap;
            if (longSparseArray.get(user.id) == null) {
                if (ChatObject.isChannel(ChatUsersActivity.this.currentChat)) {
                    TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                    tL_channelParticipant.inviter_id = ChatUsersActivity.this.getUserConfig().getClientUserId();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_channelParticipant.peer = tL_peerUser;
                    tL_peerUser.user_id = user.id;
                    tL_channelParticipant.date = ChatUsersActivity.this.getConnectionsManager().getCurrentTime();
                    arrayList.add(0, tL_channelParticipant);
                    longSparseArray.put(user.id, tL_channelParticipant);
                } else {
                    TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    tL_chatParticipant.user_id = user.id;
                    tL_chatParticipant.inviter_id = ChatUsersActivity.this.getUserConfig().getClientUserId();
                    arrayList.add(0, tL_chatParticipant);
                    longSparseArray.put(user.id, tL_chatParticipant);
                }
            }
            if (arrayList == ChatUsersActivity.this.participants) {
                ChatUsersActivity.sortAdmins(ChatUsersActivity.this.participants);
            }
            ChatUsersActivity.this.updateListAnimated(diffCallbackSaveState);
        }

        @Override
        public void needAddBot(TLRPC.User user) {
            ChatUsersActivity.this.openRightsEdit(user.id, null, null, null, "", true, 0, false);
        }
    }

    public static void $r8$lambda$FMDz99wLYAEBzfoMdx9Oxdn7aC4(final ChatUsersActivity chatUsersActivity, final TextCell textCell, final boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            chatUsersActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            chatUsersActivity.getMessagesController().putChatFull(chatUsersActivity.info);
        }
        if (tL_error != null) {
            chatUsersActivity.getClass();
            if (!"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatUsersActivity.$r8$lambda$bSjaaufzjoMbOYPvaNc996YDH7w(this.f$0, textCell, z);
                    }
                });
            }
        }
        chatUsersActivity.antiSpamToggleLoading = false;
    }

    public static void $r8$lambda$bSjaaufzjoMbOYPvaNc996YDH7w(ChatUsersActivity chatUsersActivity, TextCell textCell, boolean z) {
        TLRPC.ChatFull chatFull;
        if (chatUsersActivity.getParentActivity() == null) {
            return;
        }
        chatUsersActivity.info.antispam = z;
        textCell.setChecked(z);
        textCell.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 13) || ((chatFull = chatUsersActivity.info) != null && chatFull.antispam && chatUsersActivity.getParticipantsCount() < chatUsersActivity.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
        BulletinFactory.of(chatUsersActivity).createSimpleBulletin(R.raw.error, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
    }

    public static void m1887$r8$lambda$GYiLiri25TgY2wQUwuUn55es(final ChatUsersActivity chatUsersActivity, final TextCell textCell, final boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            chatUsersActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            chatUsersActivity.getMessagesController().putChatFull(chatUsersActivity.info);
        }
        if (tL_error != null) {
            chatUsersActivity.getClass();
            if (!"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatUsersActivity.m1894$r8$lambda$v6HGRlAAt8jT8ANN2jlYDmLpio(this.f$0, textCell, z);
                    }
                });
            }
        }
        chatUsersActivity.hideMembersToggleLoading = false;
    }

    public static void m1894$r8$lambda$v6HGRlAAt8jT8ANN2jlYDmLpio(ChatUsersActivity chatUsersActivity, TextCell textCell, boolean z) {
        TLRPC.ChatFull chatFull;
        if (chatUsersActivity.getParentActivity() == null) {
            return;
        }
        chatUsersActivity.info.participants_hidden = z;
        textCell.setChecked(z);
        textCell.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 2) || ((chatFull = chatUsersActivity.info) != null && chatFull.participants_hidden && chatUsersActivity.getParticipantsCount() < chatUsersActivity.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
        BulletinFactory.of(chatUsersActivity).createSimpleBulletin(R.raw.error, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
    }

    public static void m1889$r8$lambda$TaqiG38Ob2M3XDoqeLWpynC6Y(ChatUsersActivity chatUsersActivity, TextCell textCell, boolean z, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            chatUsersActivity.getMessagesController().processUpdates(updates, false);
            return;
        }
        chatUsersActivity.getClass();
        if (tL_error != null) {
            textCell.setChecked(z);
            BulletinFactory.of(chatUsersActivity).showForError(tL_error);
        }
    }

    class AnonymousClass9 extends GigagroupConvertAlert {
        @Override
        protected void onCancel() {
        }

        AnonymousClass9(Context context, BaseFragment baseFragment) {
            super(context, baseFragment);
        }

        @Override
        public void onCovert() {
            ChatUsersActivity.this.getMessagesController().convertToGigaGroup(ChatUsersActivity.this.getParentActivity(), ChatUsersActivity.this.currentChat, ChatUsersActivity.this, new MessagesStorage.BooleanCallback() {
                @Override
                public final void run(boolean z) {
                    ChatUsersActivity.AnonymousClass9.m1896$r8$lambda$QQCwLLCC3vzvm68_jpWmpxSg(this.f$0, z);
                }
            });
        }

        public static void m1896$r8$lambda$QQCwLLCC3vzvm68_jpWmpxSg(AnonymousClass9 anonymousClass9, boolean z) {
            if (!z) {
                anonymousClass9.getClass();
                return;
            }
            if (((BaseFragment) ChatUsersActivity.this).parentLayout != null) {
                BaseFragment baseFragment = (BaseFragment) ((BaseFragment) ChatUsersActivity.this).parentLayout.getFragmentStack().get(((BaseFragment) ChatUsersActivity.this).parentLayout.getFragmentStack().size() - 2);
                if (!(baseFragment instanceof ChatEditActivity)) {
                    ChatUsersActivity.this.finishFragment();
                    return;
                }
                baseFragment.removeSelfFromStack();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ChatUsersActivity.this.chatId);
                ChatEditActivity chatEditActivity = new ChatEditActivity(bundle);
                chatEditActivity.setInfo(ChatUsersActivity.this.info);
                ((BaseFragment) ChatUsersActivity.this).parentLayout.addFragmentToStack(chatEditActivity, ((BaseFragment) ChatUsersActivity.this).parentLayout.getFragmentStack().size() - 1);
                ChatUsersActivity.this.finishFragment();
                chatEditActivity.showConvertTooltip();
            }
        }
    }

    public static void m1892$r8$lambda$pBychBJ6P6JEpBXL1l6DSo2BOs(ChatUsersActivity chatUsersActivity, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, AlertDialog alertDialog, int i) {
        chatUsersActivity.getClass();
        chatUsersActivity.openRightsEdit(user.id, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z, chatUsersActivity.selectType == 1 ? 0 : 1, false);
    }

    public static boolean $r8$lambda$geuQNgpib4Y8mtf7h0jks7DE2ew(ChatUsersActivity chatUsersActivity, View view, int i) {
        if (chatUsersActivity.getParentActivity() != null) {
            RecyclerView.Adapter adapter = chatUsersActivity.listView.getAdapter();
            ListAdapter listAdapter = chatUsersActivity.listViewAdapter;
            if (adapter == listAdapter) {
                return chatUsersActivity.createMenuForParticipant(listAdapter.getItem(i), false, view);
            }
        }
        return false;
    }

    public int getParticipantsCount() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull == null) {
            return 0;
        }
        int i = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        return (chatParticipants == null || (arrayList = chatParticipants.participants) == null) ? i : Math.max(i, arrayList.size());
    }

    private void setBannedRights(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        if (tL_chatBannedRights != null) {
            this.defaultBannedRights = tL_chatBannedRights;
        }
    }

    public static void sortAdmins(ArrayList arrayList) {
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ChatUsersActivity.$r8$lambda$VZGBEZq8jVt9yLH8_xL4SPlOMj4((TLObject) obj, (TLObject) obj2);
            }
        });
    }

    public static int $r8$lambda$VZGBEZq8jVt9yLH8_xL4SPlOMj4(TLObject tLObject, TLObject tLObject2) {
        int channelAdminParticipantType = getChannelAdminParticipantType(tLObject);
        int channelAdminParticipantType2 = getChannelAdminParticipantType(tLObject2);
        if (channelAdminParticipantType > channelAdminParticipantType2) {
            return 1;
        }
        if (channelAdminParticipantType < channelAdminParticipantType2) {
            return -1;
        }
        if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
            return (int) (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) - MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer));
        }
        return 0;
    }

    public void showItemsAnimated(final int i) {
        if (this.isPaused || !this.openTransitionStarted) {
            return;
        }
        if (this.listView.getAdapter() == this.listViewAdapter && this.firstLoaded) {
            return;
        }
        final View view = null;
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (childAt instanceof FlickerLoadingView) {
                view = childAt;
            }
        }
        if (view != null) {
            this.listView.removeView(view);
            i--;
        }
        this.listView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                ChatUsersActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = ChatUsersActivity.this.listView.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt2 = ChatUsersActivity.this.listView.getChildAt(i3);
                    if (childAt2 != view && ChatUsersActivity.this.listView.getChildAdapterPosition(childAt2) >= i) {
                        childAt2.setAlpha(0.0f);
                        int iMin = (int) ((Math.min(ChatUsersActivity.this.listView.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / ChatUsersActivity.this.listView.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat.setStartDelay(iMin);
                        objectAnimatorOfFloat.setDuration(200L);
                        animatorSet.playTogether(objectAnimatorOfFloat);
                    }
                }
                View view2 = view;
                if (view2 != null && view2.getParent() == null) {
                    ChatUsersActivity.this.listView.addView(view);
                    final RecyclerView.LayoutManager layoutManager = ChatUsersActivity.this.listView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.ignoreView(view);
                        View view3 = view;
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, view3.getAlpha(), 0.0f);
                        objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                view.setAlpha(1.0f);
                                layoutManager.stopIgnoringView(view);
                                ChatUsersActivity.this.listView.removeView(view);
                            }
                        });
                        objectAnimatorOfFloat2.start();
                    }
                }
                animatorSet.start();
                return true;
            }
        });
    }

    public void onOwnerChaged(TLRPC.User user) {
        LongSparseArray longSparseArray;
        ArrayList arrayList;
        boolean z;
        this.undoView.showWithAction(-this.chatId, this.isChannel ? 9 : 10, user);
        this.currentChat.creator = false;
        boolean z2 = false;
        for (int i = 0; i < 3; i++) {
            boolean z3 = true;
            if (i == 0) {
                longSparseArray = this.contactsMap;
                arrayList = this.contacts;
            } else if (i == 1) {
                longSparseArray = this.botsMap;
                arrayList = this.bots;
            } else {
                longSparseArray = this.participantsMap;
                arrayList = this.participants;
            }
            TLObject tLObject = (TLObject) longSparseArray.get(user.id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j = user.id;
                tL_peerUser.user_id = j;
                longSparseArray.put(j, tL_channelParticipantCreator);
                int iIndexOf = arrayList.indexOf(tLObject);
                if (iIndexOf >= 0) {
                    arrayList.set(iIndexOf, tL_channelParticipantCreator);
                }
                z2 = true;
                z = true;
            } else {
                z = false;
            }
            long clientUserId = getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) longSparseArray.get(clientUserId);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = clientUserId;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = clientUserId;
                tL_channelParticipantAdmin.promoted_by = clientUserId;
                tL_channelParticipantAdmin.date = (int) (System.currentTimeMillis() / 1000);
                TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                tL_chatAdminRights.add_admins = true;
                tL_chatAdminRights.manage_ranks = true;
                tL_chatAdminRights.pin_messages = true;
                tL_chatAdminRights.manage_topics = true;
                tL_chatAdminRights.invite_users = true;
                tL_chatAdminRights.ban_users = true;
                tL_chatAdminRights.delete_messages = true;
                tL_chatAdminRights.edit_messages = true;
                tL_chatAdminRights.post_messages = true;
                tL_chatAdminRights.change_info = true;
                if (!this.isChannel) {
                    tL_chatAdminRights.manage_call = true;
                }
                longSparseArray.put(clientUserId, tL_channelParticipantAdmin);
                int iIndexOf2 = arrayList.indexOf(tLObject2);
                if (iIndexOf2 >= 0) {
                    arrayList.set(iIndexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z3 = z;
            }
            if (z3) {
                Collections.sort(arrayList, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return ChatUsersActivity.$r8$lambda$S0tzKXU2pZwBcNzLcToR7TeKYyk((TLObject) obj, (TLObject) obj2);
                    }
                });
            }
        }
        if (!z2) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j2 = user.id;
            tL_peerUser3.user_id = j2;
            this.participantsMap.put(j2, tL_channelParticipantCreator2);
            this.participants.add(tL_channelParticipantCreator2);
            sortAdmins(this.participants);
            updateRows();
        }
        this.listViewAdapter.notifyDataSetChanged();
        ChatUsersActivityDelegate chatUsersActivityDelegate = this.delegate;
        if (chatUsersActivityDelegate != null) {
            chatUsersActivityDelegate.didChangeOwner(user);
        }
    }

    public static int $r8$lambda$S0tzKXU2pZwBcNzLcToR7TeKYyk(TLObject tLObject, TLObject tLObject2) {
        int channelAdminParticipantType = getChannelAdminParticipantType(tLObject);
        int channelAdminParticipantType2 = getChannelAdminParticipantType(tLObject2);
        if (channelAdminParticipantType > channelAdminParticipantType2) {
            return 1;
        }
        return channelAdminParticipantType < channelAdminParticipantType2 ? -1 : 0;
    }

    private void openRightsEdit2(final long j, final int i, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, final int i2, boolean z2) {
        final boolean[] zArr = new boolean[1];
        boolean z3 = (tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, this.chatId, tL_chatAdminRights, this.defaultBannedRights, tL_chatBannedRights, str, i2, true, false, null) {
            @Override
            public void onTransitionAnimationEnd(boolean z4, boolean z5) {
                if (!z4 && z5 && zArr[0] && BulletinFactory.canShowBulletin(ChatUsersActivity.this)) {
                    if (j > 0) {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
                        if (user != null) {
                            BulletinFactory.createPromoteToAdminBulletin(ChatUsersActivity.this, user.first_name).show();
                            return;
                        }
                        return;
                    }
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
                    if (chat != null) {
                        BulletinFactory.createPromoteToAdminBulletin(ChatUsersActivity.this, chat.title).show();
                    }
                }
            }
        };
        final boolean z4 = z3;
        chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
            @Override
            public void didSetRights(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights2, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str2) {
                TLRPC.ChatParticipant tL_chatParticipant;
                TLRPC.ChannelParticipant tL_channelParticipant;
                int i4 = i2;
                if (i4 != 0) {
                    if (i4 == 1 && i3 == 0) {
                        ChatUsersActivity.this.removeParticipants(j);
                        return;
                    }
                    return;
                }
                for (int i5 = 0; i5 < ChatUsersActivity.this.participants.size(); i5++) {
                    TLObject tLObject2 = (TLObject) ChatUsersActivity.this.participants.get(i5);
                    if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                        if (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer) == j) {
                            if (i3 == 1) {
                                tL_channelParticipant = new TLRPC.TL_channelParticipantAdmin();
                            } else {
                                tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            }
                            tL_channelParticipant.admin_rights = tL_chatAdminRights2;
                            tL_channelParticipant.banned_rights = tL_chatBannedRights2;
                            tL_channelParticipant.inviter_id = ChatUsersActivity.this.getUserConfig().getClientUserId();
                            if (j > 0) {
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_channelParticipant.peer = tL_peerUser;
                                tL_peerUser.user_id = j;
                            } else {
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_channelParticipant.peer = tL_peerChannel;
                                tL_peerChannel.channel_id = -j;
                            }
                            tL_channelParticipant.date = i;
                            tL_channelParticipant.flags |= 4;
                            tL_channelParticipant.rank = str2;
                            ChatUsersActivity.this.participants.set(i5, tL_channelParticipant);
                            break;
                        }
                    } else if (tLObject2 instanceof TLRPC.ChatParticipant) {
                        TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject2;
                        if (i3 == 1) {
                            tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                        } else {
                            tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        }
                        tL_chatParticipant.user_id = chatParticipant.user_id;
                        tL_chatParticipant.date = chatParticipant.date;
                        tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                        int iIndexOf = ChatUsersActivity.this.info.participants.participants.indexOf(chatParticipant);
                        if (iIndexOf >= 0) {
                            ChatUsersActivity.this.info.participants.participants.set(iIndexOf, tL_chatParticipant);
                        }
                        ChatUsersActivity.this.loadChatParticipants(0, 200);
                    }
                }
                if (i3 != 1 || z4) {
                    return;
                }
                zArr[0] = true;
            }

            @Override
            public void didChangeOwner(TLRPC.User user) {
                ChatUsersActivity.this.onOwnerChaged(user);
            }
        });
        presentFragment(chatRightsEditActivity);
    }

    @Override
    public boolean canBeginSlide() {
        return checkDiscard(true);
    }

    public void openRightsEdit(final long j, final TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, int i, final boolean z2) {
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, this.chatId, tL_chatAdminRights, this.defaultBannedRights, tL_chatBannedRights, str, i, z, tLObject == null, null);
        chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
            @Override
            public void didSetRights(int i2, TLRPC.TL_chatAdminRights tL_chatAdminRights2, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str2) {
                TLObject tLObject2 = tLObject;
                if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject2;
                    channelParticipant.admin_rights = tL_chatAdminRights2;
                    channelParticipant.banned_rights = tL_chatBannedRights2;
                    channelParticipant.rank = str2;
                }
                if (ChatUsersActivity.this.delegate == null || i2 != 1) {
                    if (ChatUsersActivity.this.delegate != null) {
                        ChatUsersActivity.this.delegate.didAddParticipantToList(j, tLObject);
                    }
                } else {
                    ChatUsersActivity.this.delegate.didSelectUser(j);
                }
                if (z2) {
                    ChatUsersActivity.this.removeSelfFromStack();
                }
            }

            @Override
            public void didChangeOwner(TLRPC.User user) {
                ChatUsersActivity.this.onOwnerChaged(user);
            }
        });
        presentFragment(chatRightsEditActivity, z2);
    }

    private void removeParticipant(long j) {
        if (ChatObject.isChannel(this.currentChat)) {
            getMessagesController().deleteParticipantFromChat(this.chatId, getMessagesController().getUser(Long.valueOf(j)));
            ChatUsersActivityDelegate chatUsersActivityDelegate = this.delegate;
            if (chatUsersActivityDelegate != null) {
                chatUsersActivityDelegate.didKickParticipant(j);
            }
            finishFragment();
        }
    }

    private TLObject getAnyParticipant(long j) {
        LongSparseArray longSparseArray;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                longSparseArray = this.contactsMap;
            } else if (i == 1) {
                longSparseArray = this.botsMap;
            } else {
                longSparseArray = this.participantsMap;
            }
            TLObject tLObject = (TLObject) longSparseArray.get(j);
            if (tLObject != null) {
                return tLObject;
            }
        }
        return null;
    }

    public void removeParticipants(long j) {
        LongSparseArray longSparseArray;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        DiffCallback diffCallbackSaveState = saveState();
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                longSparseArray = this.contactsMap;
                arrayList = this.contacts;
            } else if (i == 1) {
                longSparseArray = this.botsMap;
                arrayList = this.bots;
            } else {
                longSparseArray = this.participantsMap;
                arrayList = this.participants;
            }
            TLObject tLObject = (TLObject) longSparseArray.get(j);
            if (tLObject != null) {
                longSparseArray.remove(j);
                arrayList.remove(tLObject);
                if (this.type == 0 && (chatFull = this.info) != null) {
                    chatFull.kicked_count--;
                }
                z = true;
            }
        }
        if (z) {
            updateListAnimated(diffCallbackSaveState);
        }
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        SearchAdapter searchAdapter = this.searchListViewAdapter;
        if (adapter == searchAdapter) {
            searchAdapter.removeUserId(j);
        }
    }

    public void updateParticipantWithRights(TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, long j, boolean z) {
        LongSparseArray longSparseArray;
        ChatUsersActivityDelegate chatUsersActivityDelegate;
        boolean z2 = false;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                longSparseArray = this.contactsMap;
            } else if (i == 1) {
                longSparseArray = this.botsMap;
            } else {
                longSparseArray = this.participantsMap;
            }
            TLObject tLObject = (TLObject) longSparseArray.get(MessageObject.getPeerId(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant.admin_rights = tL_chatAdminRights;
                channelParticipant.banned_rights = tL_chatBannedRights;
                if (z) {
                    channelParticipant.promoted_by = getUserConfig().getClientUserId();
                }
            }
            if (z && tLObject != null && !z2 && (chatUsersActivityDelegate = this.delegate) != null) {
                chatUsersActivityDelegate.didAddParticipantToList(j, tLObject);
                z2 = true;
            }
        }
    }

    public boolean createMenuForParticipant(final TLObject tLObject, boolean z, View view) {
        final TLRPC.TL_chatBannedRights tL_chatBannedRights;
        final String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean zCanAddAdmins;
        int i;
        String str2;
        int i2;
        String str3;
        if (tLObject == null || this.selectType != 0) {
            return false;
        }
        final long j = 0;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            long peerId = MessageObject.getPeerId(channelParticipant.peer);
            zCanAddAdmins = channelParticipant.can_edit;
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = channelParticipant.banned_rights;
            tL_chatAdminRights = channelParticipant.admin_rights;
            i = channelParticipant.date;
            str2 = channelParticipant.rank;
            j = peerId;
            tL_chatBannedRights = tL_chatBannedRights2;
        } else {
            if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                long j2 = chatParticipant.user_id;
                i = chatParticipant.date;
                zCanAddAdmins = ChatObject.canAddAdmins(this.currentChat);
                str2 = "";
                j = j2;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
            } else {
                j = 0;
                tL_chatBannedRights = null;
                str = null;
                tL_chatAdminRights = null;
                zCanAddAdmins = false;
                i = 0;
            }
            if (j != j || j == getUserConfig().getClientUserId()) {
                return false;
            }
            if (this.type == 2) {
                final TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
                boolean z2 = ChatObject.canAddAdmins(this.currentChat) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || zCanAddAdmins);
                boolean z3 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
                final boolean z4 = !(z3 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || zCanAddAdmins;
                boolean z5 = z3 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                boolean z6 = ChatObject.canBlockUsers(this.currentChat) && z4 && !this.isChannel && ChatObject.isChannel(this.currentChat) && !this.currentChat.gigagroup;
                if (this.selectType == 0) {
                    z2 &= !UserObject.isDeleted(user);
                }
                boolean z7 = z2;
                boolean z8 = z7 || (ChatObject.canBlockUsers(this.currentChat) && z4);
                if (z || !z8) {
                    return z8;
                }
                final TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
                final TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
                final int i3 = i;
                boolean z9 = z6;
                final String str4 = str;
                final Utilities.Callback callback = new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ChatUsersActivity.$r8$lambda$cQIfe3OJHBYqouk0vQAX3OIGQ9I(this.f$0, j, i3, tLObject, tL_chatAdminRights2, tL_chatBannedRights3, str4, z4, (Integer) obj);
                    }
                };
                ItemOptions itemOptionsAddIf = ItemOptions.makeOptions(this, view).setScrimViewBackground(this.listView.getClipBackground(view)).addIf(z7, R.drawable.msg_admins, LocaleController.getString(z5 ? R.string.EditAdminRights : R.string.SetAsAdmin), new Runnable() {
                    @Override
                    public final void run() {
                        callback.run(0);
                    }
                }).addIf(z9, R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new Runnable() {
                    @Override
                    public final void run() {
                        ChatUsersActivity.$r8$lambda$NwMDiTszGkMTVK5a14mYzbba7B4(this.f$0, tLObject, user, callback);
                    }
                });
                boolean z10 = ChatObject.canBlockUsers(this.currentChat) && z4;
                int i4 = R.drawable.msg_remove;
                if (this.isChannel) {
                    i2 = R.string.ChannelRemoveUser;
                    str3 = "ChannelRemoveUser";
                } else {
                    i2 = R.string.KickFromGroup;
                    str3 = "KickFromGroup";
                }
                itemOptionsAddIf.addIf(z10, i4, (CharSequence) LocaleController.getString(str3, i2), true, new Runnable() {
                    @Override
                    public final void run() {
                        ChatUsersActivity.$r8$lambda$Q9LmOwHNmF3EgxUYoLO4DroYi9U(this.f$0, user, j);
                    }
                }).setMinWidth(190).show();
                return true;
            }
            final TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, view);
            if (this.type == 3 && ChatObject.canBlockUsers(this.currentChat)) {
                itemOptionsMakeOptions.add(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new Runnable() {
                    @Override
                    public final void run() {
                        ChatUsersActivity.$r8$lambda$w4idZTKwKwUuFNSTo1kwDv0jlIg(this.f$0, j, tL_chatBannedRights, str, tLObject);
                    }
                });
                itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), true, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.deletePeer(j);
                    }
                });
            } else if (this.type == 0 && ChatObject.canBlockUsers(this.currentChat)) {
                if (ChatObject.canAddUsers(this.currentChat) && j > j && !ChatObject.isCommunity(this.currentChat)) {
                    itemOptionsMakeOptions.add(R.drawable.msg_contact_add, LocaleController.getString(this.isChannel ? R.string.ChannelAddToChannel : R.string.ChannelAddToGroup), new Runnable() {
                        @Override
                        public final void run() {
                            ChatUsersActivity.m1888$r8$lambda$Pz62XwkR1LgmrA5LHnDJYgC4f8(this.f$0, j);
                        }
                    });
                }
                itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), true, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.deletePeer(j);
                    }
                });
            } else if (this.type == 1 && ChatObject.canAddAdmins(this.currentChat) && zCanAddAdmins) {
                if (this.currentChat.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                    itemOptionsMakeOptions.add(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new Runnable() {
                        @Override
                        public final void run() {
                            ChatUsersActivity.m1893$r8$lambda$s38jV8vg4EGGkJCtnzfxvRrZCw(this.f$0, j, tL_chatAdminRights3, str, tLObject);
                        }
                    });
                }
                itemOptionsMakeOptions.add(R.drawable.msg_remove, (CharSequence) LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), true, new Runnable() {
                    @Override
                    public final void run() {
                        ChatUsersActivity.$r8$lambda$ypNrvPWH6iBQ5g9TjIaTfPkZwOQ(this.f$0, j);
                    }
                });
            }
            itemOptionsMakeOptions.setScrimViewBackground(this.listView.getClipBackground(view));
            itemOptionsMakeOptions.setMinWidth(190);
            boolean z11 = itemOptionsMakeOptions.getItemsCount() > 0;
            if (z || !z11) {
                return z11;
            }
            itemOptionsMakeOptions.show();
            return true;
        }
        str = str2;
        if (j != j) {
        }
        return false;
    }

    public static void $r8$lambda$cQIfe3OJHBYqouk0vQAX3OIGQ9I(ChatUsersActivity chatUsersActivity, long j, int i, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, Integer num) {
        chatUsersActivity.getClass();
        chatUsersActivity.openRightsEdit2(j, i, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z, num.intValue(), false);
    }

    public static void $r8$lambda$NwMDiTszGkMTVK5a14mYzbba7B4(ChatUsersActivity chatUsersActivity, TLObject tLObject, TLRPC.User user, final Utilities.Callback callback) {
        chatUsersActivity.getClass();
        if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
            chatUsersActivity.showDialog(new AlertDialog.Builder(chatUsersActivity.getParentActivity()).setTitle(LocaleController.getString("AppName", R.string.AppName)).setMessage(LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user))).setPositiveButton(LocaleController.getString("OK", R.string.OK), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    callback.run(1);
                }
            }).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).create());
        } else {
            callback.run(1);
        }
    }

    public static void $r8$lambda$Q9LmOwHNmF3EgxUYoLO4DroYi9U(ChatUsersActivity chatUsersActivity, TLRPC.User user, long j) {
        chatUsersActivity.getMessagesController().deleteParticipantFromChat(chatUsersActivity.chatId, user);
        chatUsersActivity.removeParticipants(j);
        if (chatUsersActivity.currentChat == null || user == null || !BulletinFactory.canShowBulletin(chatUsersActivity)) {
            return;
        }
        BulletinFactory.createRemoveFromChatBulletin(chatUsersActivity, user, chatUsersActivity.currentChat.title).show();
    }

    public static void $r8$lambda$w4idZTKwKwUuFNSTo1kwDv0jlIg(ChatUsersActivity chatUsersActivity, long j, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, final TLObject tLObject) {
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, chatUsersActivity.chatId, null, chatUsersActivity.defaultBannedRights, tL_chatBannedRights, str, 1, true, false, null);
        chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
            @Override
            public void didSetRights(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str2) {
                TLObject tLObject2 = tLObject;
                if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject2;
                    channelParticipant.admin_rights = tL_chatAdminRights;
                    channelParticipant.banned_rights = tL_chatBannedRights2;
                    channelParticipant.rank = str2;
                    ChatUsersActivity.this.updateParticipantWithRights(channelParticipant, tL_chatAdminRights, tL_chatBannedRights2, 0L, false);
                }
            }

            @Override
            public void didChangeOwner(TLRPC.User user) {
                ChatUsersActivity.this.onOwnerChaged(user);
            }
        });
        chatUsersActivity.presentFragment(chatRightsEditActivity);
    }

    public static void m1888$r8$lambda$Pz62XwkR1LgmrA5LHnDJYgC4f8(ChatUsersActivity chatUsersActivity, long j) {
        chatUsersActivity.deletePeer(j);
        chatUsersActivity.getMessagesController().addUserToChat(chatUsersActivity.chatId, chatUsersActivity.getMessagesController().getUser(Long.valueOf(j)), 0, null, chatUsersActivity, null);
    }

    public static void m1893$r8$lambda$s38jV8vg4EGGkJCtnzfxvRrZCw(ChatUsersActivity chatUsersActivity, long j, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, final TLObject tLObject) {
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, chatUsersActivity.chatId, tL_chatAdminRights, null, null, str, 0, true, false, null);
        chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
            @Override
            public void didSetRights(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights2, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str2) {
                TLObject tLObject2 = tLObject;
                if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject2;
                    channelParticipant.admin_rights = tL_chatAdminRights2;
                    channelParticipant.banned_rights = tL_chatBannedRights;
                    channelParticipant.rank = str2;
                    ChatUsersActivity.this.updateParticipantWithRights(channelParticipant, tL_chatAdminRights2, tL_chatBannedRights, 0L, false);
                }
            }

            @Override
            public void didChangeOwner(TLRPC.User user) {
                ChatUsersActivity.this.onOwnerChaged(user);
            }
        });
        chatUsersActivity.presentFragment(chatRightsEditActivity);
    }

    public static void $r8$lambda$ypNrvPWH6iBQ5g9TjIaTfPkZwOQ(ChatUsersActivity chatUsersActivity, long j) {
        chatUsersActivity.getMessagesController().setUserAdminRole(chatUsersActivity.chatId, chatUsersActivity.getMessagesController().getUser(Long.valueOf(j)), new TLRPC.TL_chatAdminRights(), "", !chatUsersActivity.isChannel, chatUsersActivity, false, false, null, null);
        chatUsersActivity.removeParticipants(j);
    }

    public void deletePeer(long j) {
        if (this.isCommunity) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.chatId);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ChatUsersActivity.$r8$lambda$g7DCUPLGVJ7sybOTpAHQY2EqgK0(this.f$0, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                }
            });
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.chatId);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatUsersActivity.$r8$lambda$Dbf9jSkYNGtnIc1E5FdEqv65uCY(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$g7DCUPLGVJ7sybOTpAHQY2EqgK0(final ChatUsersActivity chatUsersActivity, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        chatUsersActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatUsersActivity chatUsersActivity2 = this.f$0;
                chatUsersActivity2.getMessagesController().loadFullChat(chatUsersActivity2.chatId, 0, true);
            }
        }, 1000L);
    }

    public static void $r8$lambda$Dbf9jSkYNGtnIc1E5FdEqv65uCY(final ChatUsersActivity chatUsersActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        chatUsersActivity.getClass();
        if (tLObject != null) {
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            chatUsersActivity.getMessagesController().processUpdates(updates, false);
            if (updates.chats.isEmpty()) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatUsersActivity.$r8$lambda$Z2KZAhzID7xiK8gJvs8getLZFeg(this.f$0, updates);
                }
            }, 1000L);
        }
    }

    public static void $r8$lambda$Z2KZAhzID7xiK8gJvs8getLZFeg(ChatUsersActivity chatUsersActivity, TLRPC.Updates updates) {
        chatUsersActivity.getClass();
        chatUsersActivity.getMessagesController().loadFullChat(updates.chats.get(0).id, 0, true);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.id == this.chatId) {
                if (zBooleanValue && ChatObject.isChannel(this.currentChat)) {
                    return;
                }
                boolean z = this.info != null;
                this.info = chatFull;
                if (!z) {
                    int currentSlowmode = getCurrentSlowmode();
                    this.initialSlowmode = currentSlowmode;
                    this.selectedSlowmode = currentSlowmode;
                    int i3 = this.info.boosts_unrestrict;
                    this.isEnabledNotRestrictBoosters = i3 > 0;
                    this.notRestrictBoosters = i3;
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
                    long j = chat == null ? 0L : chat.send_paid_messages_stars;
                    boolean z2 = j > 0;
                    this.enablePrice = z2;
                    this.initialEnablePrice = z2;
                    if (j <= 0) {
                        j = 10;
                    }
                    long jClamp = Utilities.clamp(j, getMessagesController().starsPaidMessageAmountMax, 1L);
                    this.starsPrice = jClamp;
                    this.initialStarsPrice = jClamp;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.loadChatParticipants(0, 200);
                    }
                });
                return;
            }
            return;
        }
        if (i == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.chatId)) {
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout != null && iNavigationLayout.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public boolean onBackPressed(boolean z) {
        return checkDiscard(z);
    }

    public void setDelegate(ChatUsersActivityDelegate chatUsersActivityDelegate) {
        this.delegate = chatUsersActivityDelegate;
    }

    private int getCurrentSlowmode() {
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull == null) {
            return 0;
        }
        int i = chatFull.slowmode_seconds;
        if (i == 5) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 30) {
            return 3;
        }
        if (i == 60) {
            return 4;
        }
        if (i == 300) {
            return 5;
        }
        if (i == 900) {
            return 6;
        }
        return i == 3600 ? 7 : 0;
    }

    public String formatSeconds(int i) {
        if (i < 60) {
            return LocaleController.formatPluralString("Seconds", i, new Object[0]);
        }
        if (i < 3600) {
            return LocaleController.formatPluralString("Minutes", i / 60, new Object[0]);
        }
        return LocaleController.formatPluralString("Hours", (i / 60) / 60, new Object[0]);
    }

    public boolean checkDiscard(boolean z) {
        boolean z2;
        if (this.transfer) {
            return true;
        }
        if (ChatObject.getBannedRightsString(this.defaultBannedRights).equals(this.initialBannedRights) && this.initialSlowmode == this.selectedSlowmode && !hasNotRestrictBoostersChanges() && (z2 = this.signatures) == this.initialSignatures) {
            if ((z2 && this.profiles) == this.initialProfiles) {
                return true;
            }
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges));
            if (this.isChannel) {
                builder.setMessage(LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert));
            } else {
                builder.setMessage(LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert));
            }
            builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.processDone();
                }
            });
            builder.setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.finishFragment();
                }
            });
            showDialog(builder.create());
        }
        return false;
    }

    public boolean hasSelectType() {
        return this.selectType != 0;
    }

    public String formatUserPermissions(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        if (tL_chatBannedRights == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = tL_chatBannedRights.view_messages;
        if (z && this.defaultBannedRights.view_messages != z) {
            sb.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
        }
        if (tL_chatBannedRights.send_messages && this.defaultBannedRights.send_plain != tL_chatBannedRights.send_plain) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
        }
        boolean z2 = tL_chatBannedRights.send_media;
        if (z2 && this.defaultBannedRights.send_media != z2) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoSendMedia", R.string.UserRestrictionsNoSendMedia));
        } else {
            boolean z3 = tL_chatBannedRights.send_photos;
            if (z3 && this.defaultBannedRights.send_photos != z3) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
            }
            boolean z4 = tL_chatBannedRights.send_videos;
            if (z4 && this.defaultBannedRights.send_videos != z4) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
            }
            boolean z5 = tL_chatBannedRights.send_audios;
            if (z5 && this.defaultBannedRights.send_audios != z5) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
            }
            boolean z6 = tL_chatBannedRights.send_docs;
            if (z6 && this.defaultBannedRights.send_docs != z6) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
            }
            boolean z7 = tL_chatBannedRights.send_voices;
            if (z7 && this.defaultBannedRights.send_voices != z7) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
            }
            boolean z8 = tL_chatBannedRights.send_roundvideos;
            if (z8 && this.defaultBannedRights.send_roundvideos != z8) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.getString("UserRestrictionsNoSendRound", R.string.UserRestrictionsNoSendRound));
            }
        }
        boolean z9 = tL_chatBannedRights.send_stickers;
        if (z9 && this.defaultBannedRights.send_stickers != z9) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
        }
        boolean z10 = tL_chatBannedRights.send_polls;
        if (z10 && this.defaultBannedRights.send_polls != z10) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
        }
        boolean z11 = tL_chatBannedRights.embed_links;
        if (z11 && !tL_chatBannedRights.send_plain && this.defaultBannedRights.embed_links != z11) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
        }
        boolean z12 = tL_chatBannedRights.invite_users;
        if (z12 && this.defaultBannedRights.invite_users != z12) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
        }
        boolean z13 = tL_chatBannedRights.pin_messages;
        if (z13 && this.defaultBannedRights.pin_messages != z13) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
        }
        boolean z14 = tL_chatBannedRights.edit_rank;
        if (z14 && this.defaultBannedRights.edit_rank != z14) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
        }
        boolean z15 = tL_chatBannedRights.send_reactions;
        if (z15 && this.defaultBannedRights.send_reactions != z15) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
        }
        boolean z16 = tL_chatBannedRights.change_info;
        if (z16 && this.defaultBannedRights.change_info != z16) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.UserRestrictionsNoChangeInfo));
        }
        if (sb.length() != 0) {
            sb.replace(0, 1, sb.substring(0, 1).toUpperCase());
            sb.append('.');
        }
        return sb.toString();
    }

    public void processDone() {
        boolean z;
        TLRPC.ChatFull chatFull;
        int i = this.type;
        boolean z2 = false;
        if (i == 3) {
            TLRPC.Chat chat = this.currentChat;
            if (chat.creator && !ChatObject.isChannel(chat) && ((this.selectedSlowmode != this.initialSlowmode || this.enablePrice) && this.info != null)) {
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.chatId, this, new MessagesStorage.LongCallback() {
                    @Override
                    public final void run(long j) {
                        ChatUsersActivity.$r8$lambda$Dv0VKQmuLOvGdRkWYH48U78VC0U(this.f$0, j);
                    }
                });
                return;
            }
            if (!ChatObject.getBannedRightsString(this.defaultBannedRights).equals(this.initialBannedRights)) {
                getMessagesController().setDefaultBannedRole(this.chatId, this.defaultBannedRights, ChatObject.isChannel(this.currentChat), this);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.chatId));
                if (chat2 != null) {
                    chat2.default_banned_rights = this.defaultBannedRights;
                }
            }
            int i2 = this.selectedSlowmode;
            if (i2 != this.initialSlowmode && (chatFull = this.info) != null) {
                chatFull.slowmode_seconds = getSecondsForIndex(i2);
                this.info.flags |= 131072;
                getMessagesController().setChannelSlowMode(this.chatId, this.info.slowmode_seconds);
            }
            boolean z3 = this.enablePrice;
            if (z3 != this.initialEnablePrice || (z3 && this.initialStarsPrice != this.starsPrice)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().getInputChannel(this.chatId);
                updatepaidmessagesprice.send_paid_messages_stars = this.enablePrice ? this.starsPrice : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                ChatUsersActivity.m1890$r8$lambda$oeh6iY0vmOlL6KBPnQc0jiJCtA();
                            }
                        });
                    }
                });
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.chatId));
                if (chat3 != null) {
                    if (this.enablePrice) {
                        chat3.flags2 |= 16384;
                        chat3.send_paid_messages_stars = this.starsPrice;
                    } else {
                        chat3.flags2 &= -16385;
                        chat3.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat3, true);
                }
            }
            if (hasNotRestrictBoostersChanges()) {
                boolean z4 = this.isEnabledNotRestrictBoosters && isNotRestrictBoostersVisible();
                if (z4 && this.notRestrictBoosters == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.chatId, 1);
                } else if (!z4 && this.notRestrictBoosters != 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.chatId, 0);
                } else {
                    getMessagesController().setBoostsToUnblockRestrictions(this.chatId, this.notRestrictBoosters);
                }
            }
        } else if (i == 1) {
            boolean z5 = this.signatures;
            if (z5 != this.initialSignatures) {
                MessagesController messagesController = getMessagesController();
                long j = this.chatId;
                z = this.signatures;
                if (z && this.profiles) {
                    z2 = true;
                }
                messagesController.toggleChannelSignatures(j, z, z2);
            } else {
                if ((z5 && this.profiles) != this.initialProfiles) {
                    MessagesController messagesController2 = getMessagesController();
                    long j2 = this.chatId;
                    z = this.signatures;
                    if (z) {
                        z2 = true;
                    }
                    messagesController2.toggleChannelSignatures(j2, z, z2);
                }
            }
        }
        finishFragment();
    }

    public static void $r8$lambda$Dv0VKQmuLOvGdRkWYH48U78VC0U(ChatUsersActivity chatUsersActivity, long j) {
        if (j == 0) {
            chatUsersActivity.getClass();
            return;
        }
        chatUsersActivity.chatId = j;
        chatUsersActivity.currentChat = MessagesController.getInstance(chatUsersActivity.currentAccount).getChat(Long.valueOf(j));
        chatUsersActivity.processDone();
    }

    private boolean hasNotRestrictBoostersChanges() {
        boolean z = this.isEnabledNotRestrictBoosters && isNotRestrictBoostersVisible();
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null) {
            int i = chatFull.boosts_unrestrict;
            int i2 = this.notRestrictBoosters;
            if (i != i2 || ((z && i2 == 0) || (!z && i2 != 0))) {
                return true;
            }
        }
        return false;
    }

    private boolean isNotRestrictBoostersVisible() {
        TLRPC.Chat chat = this.currentChat;
        if (!chat.megagroup || chat.gigagroup || !ChatObject.canUserDoAdminAction(chat, 13)) {
            return false;
        }
        if (this.selectedSlowmode > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.defaultBannedRights;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    public void setInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        if (chatFull != null) {
            int currentSlowmode = getCurrentSlowmode();
            this.initialSlowmode = currentSlowmode;
            this.selectedSlowmode = currentSlowmode;
            int i = this.info.boosts_unrestrict;
            this.isEnabledNotRestrictBoosters = i > 0;
            this.notRestrictBoosters = i;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            long j = chat == null ? 0L : chat.send_paid_messages_stars;
            boolean z = j > 0;
            this.enablePrice = z;
            this.initialEnablePrice = z;
            if (j <= 0) {
                j = 10;
            }
            long jClamp = Utilities.clamp(j, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.starsPrice = jClamp;
            this.initialStarsPrice = jClamp;
        }
    }

    public static int getChannelAdminParticipantType(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            return 0;
        }
        return ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_channelParticipant)) ? 1 : 2;
    }

    public void loadChatParticipants(int i, int i2) {
        if (this.loadingUsers) {
            return;
        }
        this.contactsEndReached = false;
        this.botsEndReached = false;
        loadChatParticipants(i, i2, true);
    }

    private ArrayList loadChatParticipantsRequests(int i, int i2, boolean z) {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.chatId);
        int i3 = this.type;
        if (i3 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i3 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i3 == 2) {
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.currentChat) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.selectType == 1) {
                if (!this.contactsEndReached) {
                    this.delayResults = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.contactsEndReached = true;
                    arrayList.addAll(loadChatParticipantsRequests(0, 200, false));
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.contactsEndReached) {
                this.delayResults = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.contactsEndReached = true;
                arrayList.addAll(loadChatParticipantsRequests(0, 200, false));
            } else if (!this.botsEndReached) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.botsEndReached = true;
                arrayList.addAll(loadChatParticipantsRequests(0, 200, false));
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i3 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = i;
        tL_channels_getParticipants.limit = i2;
        return arrayList;
    }

    private void loadChatParticipants(int i, int i2, boolean z) {
        TLRPC.ChatFull chatFull;
        LongSparseArray longSparseArray;
        TLRPC.ChatParticipants chatParticipants;
        int i3 = 0;
        if (this.isCommunity && this.type == 2) {
            this.loadingUsers = false;
            this.participants.clear();
            this.bots.clear();
            this.contacts.clear();
            this.participantsMap.clear();
            this.contactsMap.clear();
            this.botsMap.clear();
            HashMap<String, ArrayList<TLRPC.TL_contact>> map = ContactsController.getInstance(this.currentAccount).usersSectionsDict;
            ArrayList<String> arrayList = ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                String str = arrayList.get(i4);
                i4++;
                ArrayList<TLRPC.TL_contact> arrayList2 = map.get(str);
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    TLRPC.TL_contact tL_contact = arrayList2.get(i5);
                    i5++;
                    this.participants.add(getMessagesController().getUser(Long.valueOf(tL_contact.user_id)));
                }
            }
            updateRows();
            ListAdapter listAdapter = this.listViewAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (!ChatObject.isChannel(this.currentChat)) {
            this.loadingUsers = false;
            this.participants.clear();
            this.bots.clear();
            this.contacts.clear();
            this.participantsMap.clear();
            this.contactsMap.clear();
            this.botsMap.clear();
            int i6 = this.type;
            if (i6 == 1) {
                TLRPC.ChatFull chatFull2 = this.info;
                if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                    int size3 = chatParticipants.participants.size();
                    while (i3 < size3) {
                        TLRPC.ChatParticipant chatParticipant = this.info.participants.participants.get(i3);
                        if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                            this.participants.add(chatParticipant);
                        }
                        this.participantsMap.put(chatParticipant.user_id, chatParticipant);
                        i3++;
                    }
                }
            } else if (i6 == 2 && (chatFull = this.info) != null && chatFull.participants != null) {
                long j = getUserConfig().clientUserId;
                int size4 = this.info.participants.participants.size();
                while (i3 < size4) {
                    TLRPC.ChatParticipant chatParticipant2 = this.info.participants.participants.get(i3);
                    if ((this.selectType == 0 || chatParticipant2.user_id != j) && ((longSparseArray = this.ignoredUsers) == null || longSparseArray.indexOfKey(chatParticipant2.user_id) < 0)) {
                        if (this.selectType == 1) {
                            if (getContactsController().isContact(chatParticipant2.user_id)) {
                                this.contacts.add(chatParticipant2);
                                this.contactsMap.put(chatParticipant2.user_id, chatParticipant2);
                            } else if (!UserObject.isDeleted(getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id)))) {
                                this.participants.add(chatParticipant2);
                                this.participantsMap.put(chatParticipant2.user_id, chatParticipant2);
                            }
                        } else if (getContactsController().isContact(chatParticipant2.user_id)) {
                            this.contacts.add(chatParticipant2);
                            this.contactsMap.put(chatParticipant2.user_id, chatParticipant2);
                        } else {
                            TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id));
                            if (user != null && user.bot) {
                                this.bots.add(chatParticipant2);
                                this.botsMap.put(chatParticipant2.user_id, chatParticipant2);
                            } else {
                                this.participants.add(chatParticipant2);
                                this.participantsMap.put(chatParticipant2.user_id, chatParticipant2);
                            }
                        }
                    }
                    i3++;
                }
            }
            ListAdapter listAdapter2 = this.listViewAdapter;
            if (listAdapter2 != null) {
                listAdapter2.notifyDataSetChanged();
            }
            updateRows();
            ListAdapter listAdapter3 = this.listViewAdapter;
            if (listAdapter3 != null) {
                listAdapter3.notifyDataSetChanged();
                return;
            }
            return;
        }
        this.loadingUsers = true;
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.showProgress(true, false);
        }
        ListAdapter listAdapter4 = this.listViewAdapter;
        if (listAdapter4 != null) {
            listAdapter4.notifyDataSetChanged();
        }
        final ArrayList arrayListLoadChatParticipantsRequests = loadChatParticipantsRequests(i, i2, z);
        final ArrayList arrayList3 = new ArrayList();
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ChatUsersActivity.$r8$lambda$eXjfo4bTBKGYG46l4HWfi996ERE(this.f$0, arrayListLoadChatParticipantsRequests, arrayList3);
            }
        };
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        for (final int i7 = 0; i7 < arrayListLoadChatParticipantsRequests.size(); i7++) {
            arrayList3.add(null);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) arrayListLoadChatParticipantsRequests.get(i7), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ChatUsersActivity.m1884$r8$lambda$55ORjWHfEEiMA1jWmi42a1piM(tL_error, tLObject, arrayList, i, atomicInteger, arrayList, runnable);
                        }
                    });
                }
            }), this.classGuid);
        }
    }

    public static void $r8$lambda$eXjfo4bTBKGYG46l4HWfi996ERE(ChatUsersActivity chatUsersActivity, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ArrayList arrayList3;
        LongSparseArray longSparseArray;
        TLRPC.Chat chat;
        LongSparseArray longSparseArray2;
        chatUsersActivity.getClass();
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList.get(i3);
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList2.get(i3);
            if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                i = i3;
            } else {
                if (chatUsersActivity.type == 1) {
                    chatUsersActivity.getMessagesController().processLoadedAdminsResponse(chatUsersActivity.chatId, tL_channels_channelParticipants);
                }
                chatUsersActivity.getMessagesController().putUsers(tL_channels_channelParticipants.users, z);
                chatUsersActivity.getMessagesController().putChats(tL_channels_channelParticipants.chats, z);
                long clientUserId = chatUsersActivity.getUserConfig().getClientUserId();
                if (chatUsersActivity.selectType != 0) {
                    for (int i4 = 0; i4 < tL_channels_channelParticipants.participants.size(); i4++) {
                        if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i4).peer) == clientUserId) {
                            tL_channels_channelParticipants.participants.remove(i4);
                            break;
                        }
                    }
                }
                if (chatUsersActivity.type == 2) {
                    chatUsersActivity.delayResults--;
                    TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                    if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                        arrayList3 = chatUsersActivity.contacts;
                        longSparseArray = chatUsersActivity.contactsMap;
                    } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                        arrayList3 = chatUsersActivity.bots;
                        longSparseArray = chatUsersActivity.botsMap;
                    } else {
                        arrayList3 = chatUsersActivity.participants;
                        longSparseArray = chatUsersActivity.participantsMap;
                    }
                } else {
                    arrayList3 = chatUsersActivity.participants;
                    longSparseArray = chatUsersActivity.participantsMap;
                    longSparseArray.clear();
                }
                arrayList3.clear();
                arrayList3.addAll(tL_channels_channelParticipants.participants);
                int size = tL_channels_channelParticipants.participants.size();
                int i5 = 0;
                while (i5 < size) {
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i5);
                    int i6 = i3;
                    if (channelParticipant.user_id == clientUserId) {
                        arrayList3.remove(channelParticipant);
                    } else {
                        longSparseArray.put(MessageObject.getPeerId(channelParticipant.peer), channelParticipant);
                    }
                    i5++;
                    i3 = i6;
                }
                i = i3;
                int size2 = arrayList3.size() + i2;
                if (chatUsersActivity.type == 2) {
                    int size3 = chatUsersActivity.participants.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        TLObject tLObject = (TLObject) chatUsersActivity.participants.get(i7);
                        if (!(tLObject instanceof TLRPC.ChannelParticipant)) {
                            chatUsersActivity.participants.remove(i7);
                        } else {
                            long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                            if (chatUsersActivity.contactsMap.get(peerId) != null || chatUsersActivity.botsMap.get(peerId) != null || ((chatUsersActivity.selectType == 1 && peerId > 0 && UserObject.isDeleted(chatUsersActivity.getMessagesController().getUser(Long.valueOf(peerId)))) || ((longSparseArray2 = chatUsersActivity.ignoredUsers) != null && longSparseArray2.indexOfKey(peerId) >= 0))) {
                                chatUsersActivity.participants.remove(i7);
                                chatUsersActivity.participantsMap.remove(peerId);
                            }
                            i7++;
                        }
                        i7--;
                        size3--;
                        i7++;
                    }
                }
                try {
                    int i8 = chatUsersActivity.type;
                    if ((i8 == 0 || i8 == 3 || i8 == 2) && (chat = chatUsersActivity.currentChat) != null && chat.megagroup) {
                        TLRPC.ChatFull chatFull = chatUsersActivity.info;
                        if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                            chatUsersActivity.sortUsers(arrayList3);
                        } else if (i8 == 1) {
                            sortAdmins(chatUsersActivity.participants);
                        }
                    } else if (i8 == 1) {
                        sortAdmins(chatUsersActivity.participants);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                i2 = size2;
            }
            i3 = i + 1;
            z = false;
        }
        if (chatUsersActivity.type != 2 || chatUsersActivity.delayResults <= 0) {
            ListAdapter listAdapter = chatUsersActivity.listViewAdapter;
            chatUsersActivity.showItemsAnimated(listAdapter != null ? listAdapter.getItemCount() : 0);
            chatUsersActivity.loadingUsers = false;
            chatUsersActivity.firstLoaded = true;
            ActionBarMenuItem actionBarMenuItem = chatUsersActivity.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility((chatUsersActivity.type != 0 || i2 > 5) ? 0 : 8);
            }
        }
        chatUsersActivity.updateRows();
        if (chatUsersActivity.listViewAdapter != null) {
            chatUsersActivity.listView.setAnimateEmptyView(chatUsersActivity.openTransitionStarted, 0);
            chatUsersActivity.listViewAdapter.notifyDataSetChanged();
            if (chatUsersActivity.emptyView != null && chatUsersActivity.listViewAdapter.getItemCount() == 0 && chatUsersActivity.firstLoaded) {
                chatUsersActivity.emptyView.showProgress(false, true);
            }
        }
        chatUsersActivity.resumeDelayedFragmentAnimation();
    }

    public static void m1884$r8$lambda$55ORjWHfEEiMA1jWmi42a1piM(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i, AtomicInteger atomicInteger, ArrayList arrayList2, Runnable runnable) {
        if (tL_error == null && (tLObject instanceof TLRPC.TL_channels_channelParticipants)) {
            arrayList.set(i, (TLRPC.TL_channels_channelParticipants) tLObject);
        }
        atomicInteger.getAndIncrement();
        if (atomicInteger.get() == arrayList2.size()) {
            runnable.run();
        }
    }

    public void sortUsers(ArrayList arrayList) {
        final int currentTime = getConnectionsManager().getCurrentTime();
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ChatUsersActivity.$r8$lambda$MMSg6LrZjL6XPYrgQh7t_zly2ME(this.f$0, currentTime, (TLObject) obj, (TLObject) obj2);
            }
        });
    }

    public static int $r8$lambda$MMSg6LrZjL6XPYrgQh7t_zly2ME(ChatUsersActivity chatUsersActivity, int i, TLObject tLObject, TLObject tLObject2) {
        int i2;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        chatUsersActivity.getClass();
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
        TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject2;
        long peerId = MessageObject.getPeerId(channelParticipant.peer);
        long peerId2 = MessageObject.getPeerId(channelParticipant2.peer);
        int i3 = -100;
        if (peerId > 0) {
            TLRPC.User user = chatUsersActivity.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(channelParticipant.peer)));
            if (user == null || (userStatus2 = user.status) == null) {
                i2 = 0;
            } else {
                i2 = user.self ? i + 50000 : userStatus2.expires;
            }
        } else {
            i2 = -100;
        }
        if (peerId2 > 0) {
            TLRPC.User user2 = chatUsersActivity.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(channelParticipant2.peer)));
            if (user2 == null || (userStatus = user2.status) == null) {
                i3 = 0;
            } else {
                i3 = user2.self ? i + 50000 : userStatus.expires;
            }
        }
        if (i2 <= 0 || i3 <= 0) {
            if (i2 >= 0 || i3 >= 0) {
                if (i2 < 0 && i3 > 0) {
                    return -1;
                }
                if (i2 == 0 && i3 != 0) {
                    return -1;
                }
                if (i3 < 0 && i2 > 0) {
                    return 1;
                }
                if (i3 == 0 && i2 != 0) {
                    return 1;
                }
            } else {
                if (i2 > i3) {
                    return 1;
                }
                if (i2 < i3) {
                    return -1;
                }
            }
        } else {
            if (i2 > i3) {
                return 1;
            }
            if (i2 < i3) {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.requestLayout();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    @Override
    public void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.openTransitionStarted = true;
        }
        if (z && !z2 && this.needOpenSearch) {
            this.searchItem.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.searchItem.getSearchField());
            this.searchItem.setVisibility(8);
        }
    }

    class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private int contactsStartRow;
        private int globalStartRow;
        private int groupStartRow;
        private Context mContext;
        private SearchAdapterHelper searchAdapterHelper;
        private boolean searchInProgress;
        private Runnable searchRunnable;
        private ArrayList searchResult = new ArrayList();
        private LongSparseArray searchResultMap = new LongSparseArray();
        private ArrayList searchResultNames = new ArrayList();
        private int totalCount = 0;

        public SearchAdapter(Context context) {
            this.mContext = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() {
                @Override
                public boolean canApplySearchResults(int i) {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$canApplySearchResults(this, i);
                }

                @Override
                public LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
                }

                @Override
                public LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
                }

                @Override
                public final void onDataSetChanged(int i) {
                    ChatUsersActivity.SearchAdapter.$r8$lambda$90cywmfaWAF96uesCrEt0X1TFKI(this.f$0, i);
                }

                @Override
                public void onSetHashtags(ArrayList arrayList, HashMap map) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$onSetHashtags(this, arrayList, map);
                }
            });
        }

        public static void $r8$lambda$90cywmfaWAF96uesCrEt0X1TFKI(SearchAdapter searchAdapter, int i) {
            if (searchAdapter.searchAdapterHelper.isSearchInProgress()) {
                return;
            }
            int itemCount = searchAdapter.getItemCount();
            searchAdapter.notifyDataSetChanged();
            if (searchAdapter.getItemCount() > itemCount) {
                ChatUsersActivity.this.showItemsAnimated(itemCount);
            }
            if (searchAdapter.searchInProgress || searchAdapter.getItemCount() != 0 || i == 0) {
                return;
            }
            ChatUsersActivity.this.emptyView.showProgress(false, true);
        }

        public void searchUsers(final String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            this.searchResult.clear();
            this.searchResultMap.clear();
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null);
            this.searchAdapterHelper.queryServerSearch(null, ChatUsersActivity.this.type != 0, false, true, false, false, ChatObject.isChannel(ChatUsersActivity.this.currentChat) ? ChatUsersActivity.this.chatId : 0L, false, ChatUsersActivity.this.type, 0);
            notifyDataSetChanged();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.searchInProgress = true;
            ChatUsersActivity.this.emptyView.showProgress(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.processSearch(str);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable, 300L);
        }

        public void processSearch(final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatUsersActivity.SearchAdapter.$r8$lambda$EfonEn70wOg_Tv7G614hQQcZpfA(this.f$0, str);
                }
            });
        }

        public static void $r8$lambda$EfonEn70wOg_Tv7G614hQQcZpfA(final SearchAdapter searchAdapter, String str) {
            final String str2;
            Runnable runnable = null;
            searchAdapter.searchRunnable = null;
            final ArrayList arrayList = (ChatObject.isChannel(ChatUsersActivity.this.currentChat) || ChatUsersActivity.this.info == null) ? null : new ArrayList(ChatUsersActivity.this.info.participants.participants);
            final ArrayList arrayList2 = ChatUsersActivity.this.selectType == 1 ? new ArrayList(ChatUsersActivity.this.getContactsController().contacts) : null;
            if (arrayList != null || arrayList2 != null) {
                str2 = str;
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        ChatUsersActivity.SearchAdapter.$r8$lambda$7eMqCsi_DOCoJXgj2HewWvKdLGg(this.f$0, str2, arrayList, arrayList2);
                    }
                };
            } else {
                searchAdapter.searchInProgress = false;
                str2 = str;
            }
            searchAdapter.searchAdapterHelper.queryServerSearch(str2, ChatUsersActivity.this.selectType != 0, false, true, false, false, ChatObject.isChannel(ChatUsersActivity.this.currentChat) ? ChatUsersActivity.this.chatId : 0L, false, ChatUsersActivity.this.type, 1, 0L, runnable);
        }

        public static void $r8$lambda$7eMqCsi_DOCoJXgj2HewWvKdLGg(SearchAdapter searchAdapter, String str, ArrayList arrayList, ArrayList arrayList2) {
            LongSparseArray longSparseArray;
            long peerId;
            LongSparseArray longSparseArray2;
            int i;
            String[] strArr;
            String lowerCase;
            String publicUsername;
            String str2;
            String str3;
            char c;
            ArrayList arrayList3 = arrayList;
            searchAdapter.getClass();
            String lowerCase2 = str.trim().toLowerCase();
            if (lowerCase2.length() == 0) {
                searchAdapter.updateSearchResults(new ArrayList(), new LongSparseArray(), new ArrayList(), new ArrayList());
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
            if (lowerCase2.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i2 = 0;
            int i3 = (translitString != null ? 1 : 0) + 1;
            String[] strArr2 = new String[i3];
            strArr2[0] = lowerCase2;
            if (translitString != null) {
                strArr2[1] = translitString;
            }
            ArrayList arrayList4 = new ArrayList();
            LongSparseArray longSparseArray3 = new LongSparseArray();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            if (arrayList3 != null) {
                int size = arrayList3.size();
                while (i2 < size) {
                    TLObject tLObject = (TLObject) arrayList3.get(i2);
                    if (tLObject instanceof TLRPC.ChatParticipant) {
                        peerId = ((TLRPC.ChatParticipant) tLObject).user_id;
                    } else {
                        if (tLObject instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                        } else {
                            longSparseArray2 = longSparseArray3;
                            i2 = i2;
                            strArr = strArr2;
                            i = size;
                        }
                        i2++;
                        arrayList3 = arrayList;
                        strArr2 = strArr;
                        size = i;
                        longSparseArray3 = longSparseArray2;
                    }
                    if (peerId > 0) {
                        TLRPC.User user = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(peerId));
                        if (user.id == ChatUsersActivity.this.getUserConfig().getClientUserId()) {
                            longSparseArray2 = longSparseArray3;
                            i2 = i2;
                            strArr = strArr2;
                            i = size;
                        } else {
                            String lowerCase3 = UserObject.getUserName(user).toLowerCase();
                            String publicUsername2 = UserObject.getPublicUsername(user);
                            String str4 = user.first_name;
                            str3 = user.last_name;
                            str2 = str4;
                            lowerCase = lowerCase3;
                            publicUsername = publicUsername2;
                        }
                        i2++;
                        arrayList3 = arrayList;
                        strArr2 = strArr;
                        size = i;
                        longSparseArray3 = longSparseArray2;
                    } else {
                        TLRPC.Chat chat = ChatUsersActivity.this.getMessagesController().getChat(Long.valueOf(-peerId));
                        lowerCase = chat.title.toLowerCase();
                        publicUsername = ChatObject.getPublicUsername(chat);
                        str2 = chat.title;
                        str3 = null;
                    }
                    strArr = strArr2;
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString2)) {
                        translitString2 = null;
                    }
                    i = size;
                    int i4 = 0;
                    char c2 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            longSparseArray2 = longSparseArray3;
                            break;
                        }
                        int i5 = i4;
                        String str5 = strArr[i5];
                        if (lowerCase.startsWith(str5)) {
                            longSparseArray2 = longSparseArray3;
                        } else {
                            longSparseArray2 = longSparseArray3;
                            if (!lowerCase.contains(" " + str5)) {
                                if (translitString2 != null) {
                                    if (!translitString2.startsWith(str5)) {
                                        if (translitString2.contains(" " + str5)) {
                                        }
                                    }
                                }
                                c = (publicUsername == null || !publicUsername.startsWith(str5)) ? c2 : (char) 2;
                            }
                            if (c != 0) {
                                if (c == 1) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(str2, str3, str5));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName("@" + publicUsername, null, "@" + str5));
                                }
                                arrayList6.add(tLObject);
                                break;
                            }
                            i4 = i5 + 1;
                            c2 = c;
                            longSparseArray3 = longSparseArray2;
                        }
                        c = 1;
                        if (c != 0) {
                            if (c == 1) {
                                arrayList5.add(AndroidUtilities.generateSearchName(str2, str3, str5));
                            } else {
                                arrayList5.add(AndroidUtilities.generateSearchName("@" + publicUsername, null, "@" + str5));
                            }
                            arrayList6.add(tLObject);
                            break;
                            break;
                        }
                        i4 = i5 + 1;
                        c2 = c;
                        longSparseArray3 = longSparseArray2;
                    }
                    i2++;
                    arrayList3 = arrayList;
                    strArr2 = strArr;
                    size = i;
                    longSparseArray3 = longSparseArray2;
                }
            }
            LongSparseArray longSparseArray4 = longSparseArray3;
            String[] strArr3 = strArr2;
            if (arrayList2 != null) {
                int i6 = 0;
                while (i6 < arrayList2.size()) {
                    TLRPC.User user2 = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i6)).user_id));
                    if (user2.id != ChatUsersActivity.this.getUserConfig().getClientUserId()) {
                        String lowerCase4 = UserObject.getUserName(user2).toLowerCase();
                        String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase4);
                        if (lowerCase4.equals(translitString3)) {
                            translitString3 = null;
                        }
                        char c3 = 0;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i3) {
                                longSparseArray = longSparseArray4;
                                break;
                                break;
                            }
                            String str6 = strArr3[i7];
                            if (lowerCase4.startsWith(str6)) {
                                c3 = 1;
                            } else {
                                if (lowerCase4.contains(" " + str6)) {
                                    c3 = 1;
                                } else {
                                    if (translitString3 != null) {
                                        if (!translitString3.startsWith(str6)) {
                                            if (translitString3.contains(" " + str6)) {
                                            }
                                        }
                                        c3 = 1;
                                    }
                                    String publicUsername3 = UserObject.getPublicUsername(user2);
                                    if (publicUsername3 != null && publicUsername3.startsWith(str6)) {
                                        c3 = 2;
                                    }
                                }
                            }
                            if (c3 != 0) {
                                if (c3 == 1) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str6));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user2), null, "@" + str6));
                                }
                                arrayList4.add(user2);
                                LongSparseArray longSparseArray5 = longSparseArray4;
                                longSparseArray5.put(user2.id, user2);
                                longSparseArray = longSparseArray5;
                                break;
                            }
                            i7++;
                        }
                    } else {
                        longSparseArray = longSparseArray4;
                        break;
                    }
                    i6++;
                    longSparseArray4 = longSparseArray;
                }
            }
            searchAdapter.updateSearchResults(arrayList4, longSparseArray4, arrayList5, arrayList6);
        }

        private void updateSearchResults(final ArrayList arrayList, final LongSparseArray longSparseArray, final ArrayList arrayList2, final ArrayList arrayList3) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatUsersActivity.SearchAdapter.m1898$r8$lambda$ncP4jcfFIJkEqqpQP_R7sHb7ko(this.f$0, arrayList, longSparseArray, arrayList2, arrayList3);
                }
            });
        }

        public static void m1898$r8$lambda$ncP4jcfFIJkEqqpQP_R7sHb7ko(SearchAdapter searchAdapter, ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, ArrayList arrayList3) {
            if (ChatUsersActivity.this.searching) {
                searchAdapter.searchInProgress = false;
                searchAdapter.searchResult = arrayList;
                searchAdapter.searchResultMap = longSparseArray;
                searchAdapter.searchResultNames = arrayList2;
                searchAdapter.searchAdapterHelper.mergeResults(arrayList);
                if (!ChatObject.isChannel(ChatUsersActivity.this.currentChat)) {
                    ArrayList groupSearch = searchAdapter.searchAdapterHelper.getGroupSearch();
                    groupSearch.clear();
                    groupSearch.addAll(arrayList3);
                }
                int itemCount = searchAdapter.getItemCount();
                searchAdapter.notifyDataSetChanged();
                if (searchAdapter.getItemCount() > itemCount) {
                    ChatUsersActivity.this.showItemsAnimated(itemCount);
                }
                if (searchAdapter.searchAdapterHelper.isSearchInProgress() || searchAdapter.getItemCount() != 0) {
                    return;
                }
                ChatUsersActivity.this.emptyView.showProgress(false, true);
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public int getItemCount() {
            return this.totalCount;
        }

        @Override
        public void notifyDataSetChanged() {
            this.totalCount = 0;
            int size = this.searchAdapterHelper.getGroupSearch().size();
            if (size != 0) {
                this.groupStartRow = 0;
                this.totalCount += size + 1;
            } else {
                this.groupStartRow = -1;
            }
            int size2 = this.searchResult.size();
            if (size2 != 0) {
                int i = this.totalCount;
                this.contactsStartRow = i;
                this.totalCount = i + size2 + 1;
            } else {
                this.contactsStartRow = -1;
            }
            int size3 = this.searchAdapterHelper.getGlobalSearch().size();
            if (size3 != 0) {
                int i2 = this.totalCount;
                this.globalStartRow = i2;
                this.totalCount = i2 + size3 + 1;
            } else {
                this.globalStartRow = -1;
            }
            if (ChatUsersActivity.this.searching && ChatUsersActivity.this.listView != null && ChatUsersActivity.this.listView.getAdapter() != ChatUsersActivity.this.searchListViewAdapter) {
                ChatUsersActivity.this.listView.setAnimateEmptyView(true, 0);
                ChatUsersActivity.this.listView.setAdapter(ChatUsersActivity.this.searchListViewAdapter);
                ChatUsersActivity.this.listView.setFastScrollVisible(false);
                ChatUsersActivity.this.listView.setVerticalScrollBarEnabled(true);
            }
            super.notifyDataSetChanged();
        }

        public void removeUserId(long j) {
            this.searchAdapterHelper.removeUserId(j);
            Object obj = this.searchResultMap.get(j);
            if (obj != null) {
                this.searchResult.remove(obj);
            }
            notifyDataSetChanged();
        }

        public TLObject getItem(int i) {
            int size = this.searchAdapterHelper.getGroupSearch().size();
            if (size != 0) {
                int i2 = size + 1;
                if (i2 > i) {
                    if (i == 0) {
                        return null;
                    }
                    return (TLObject) this.searchAdapterHelper.getGroupSearch().get(i - 1);
                }
                i -= i2;
            }
            int size2 = this.searchResult.size();
            if (size2 != 0) {
                int i3 = size2 + 1;
                if (i3 > i) {
                    if (i == 0) {
                        return null;
                    }
                    return (TLObject) this.searchResult.get(i - 1);
                }
                i -= i3;
            }
            int size3 = this.searchAdapterHelper.getGlobalSearch().size();
            if (size3 == 0 || size3 + 1 <= i || i == 0) {
                return null;
            }
            return (TLObject) this.searchAdapterHelper.getGlobalSearch().get(i - 1);
        }

        public static boolean $r8$lambda$a2Ix5llnjwFWTa8pM4y_IVb03MM(SearchAdapter searchAdapter, ManageChatUserCell manageChatUserCell, boolean z) {
            searchAdapter.getClass();
            TLObject item = searchAdapter.getItem(((Integer) manageChatUserCell.getTag()).intValue());
            if (!(item instanceof TLRPC.ChannelParticipant)) {
                return false;
            }
            return ChatUsersActivity.this.createMenuForParticipant((TLRPC.ChannelParticipant) item, !z, manageChatUserCell);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 2, 2, ChatUsersActivity.this.selectType == 0);
                manageChatUserCell.setUsernameSubtitle();
                manageChatUserCell.setDelegate(new ManageChatUserCell.ManageChatUserCellDelegate() {
                    @Override
                    public final boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell2, boolean z) {
                        return ChatUsersActivity.SearchAdapter.$r8$lambda$a2Ix5llnjwFWTa8pM4y_IVb03MM(this.f$0, manageChatUserCell2, z);
                    }
                });
                view = manageChatUserCell;
            } else {
                GraySectionCell graySectionCell = new GraySectionCell(this.mContext, 26, ((BaseFragment) ChatUsersActivity.this).resourceProvider);
                graySectionCell.setBackground(null);
                view = graySectionCell;
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Chat chat;
            String publicUsername;
            TLRPC.User user;
            Object obj;
            String lastFoundChannel;
            boolean z;
            boolean z2;
            ?? spannableStringBuilder;
            int size;
            int size2;
            CharSequence charSequence;
            Object user2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    return;
                }
                GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                if (i == this.groupStartRow) {
                    if (ChatUsersActivity.this.type != 0) {
                        if (ChatUsersActivity.this.type != 3) {
                            if (ChatUsersActivity.this.isChannel) {
                                graySectionCell.setText(LocaleController.getString(R.string.ChannelSubscribers));
                                return;
                            } else {
                                graySectionCell.setText(LocaleController.getString(R.string.ChannelMembers));
                                return;
                            }
                        }
                        graySectionCell.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                        return;
                    }
                    graySectionCell.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                    return;
                }
                if (i == this.globalStartRow) {
                    graySectionCell.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    if (i == this.contactsStartRow) {
                        graySectionCell.setText(LocaleController.getString(R.string.Contacts));
                        return;
                    }
                    return;
                }
            }
            TLObject item = getItem(i);
            CharSequence charSequence2 = null;
            charSequence = null;
            charSequence = null;
            CharSequence charSequence3 = null;
            if (item instanceof TLRPC.User) {
                user2 = item;
                user2 = chat;
                user2 = item;
                user2 = user;
                user2 = item;
                publicUsername = null;
                obj = user2;
            } else {
                if (item instanceof TLRPC.ChannelParticipant) {
                    long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) item).peer);
                    if (peerId >= 0) {
                        user = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(peerId));
                        if (user != null) {
                            user2 = item;
                            user2 = user;
                            publicUsername = UserObject.getPublicUsername(user);
                            obj = user;
                        }
                    } else {
                        chat = ChatUsersActivity.this.getMessagesController().getChat(Long.valueOf(-peerId));
                        if (chat != null) {
                            user2 = item;
                            user2 = chat;
                            publicUsername = ChatObject.getPublicUsername(chat);
                            obj = chat;
                        }
                    }
                } else if (!(item instanceof TLRPC.ChatParticipant)) {
                    user2 = item;
                    return;
                } else {
                    user2 = item;
                    user2 = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) item).user_id));
                }
                user2 = item;
                user2 = chat;
                user2 = item;
                user2 = user;
                user2 = item;
                publicUsername = null;
                obj = user2;
            }
            int size3 = this.searchAdapterHelper.getGroupSearch().size();
            if (size3 == 0) {
                lastFoundChannel = null;
                z = false;
            } else {
                int i2 = size3 + 1;
                if (i2 > i) {
                    lastFoundChannel = this.searchAdapterHelper.getLastFoundChannel();
                    z = true;
                } else {
                    i -= i2;
                    lastFoundChannel = null;
                    z = false;
                }
            }
            if (z || (size2 = this.searchResult.size()) == 0) {
                z2 = z;
                spannableStringBuilder = 0;
            } else {
                int i3 = size2 + 1;
                if (i3 > i) {
                    CharSequence charSequence4 = (CharSequence) this.searchResultNames.get(i - 1);
                    if (charSequence4 != null && !TextUtils.isEmpty(publicUsername)) {
                        if (charSequence4.toString().startsWith("@" + publicUsername)) {
                            charSequence = charSequence4;
                            charSequence = charSequence4;
                            charSequence = charSequence4;
                            charSequence = null;
                            charSequence3 = charSequence4;
                        }
                    }
                    charSequence = charSequence4;
                    charSequence = charSequence4;
                    charSequence = charSequence4;
                    charSequence = charSequence4;
                    charSequence = charSequence4;
                    charSequence = charSequence4;
                    z2 = true;
                    charSequence2 = charSequence3;
                    spannableStringBuilder = charSequence;
                } else {
                    i -= i3;
                    z2 = z;
                    spannableStringBuilder = 0;
                }
            }
            CharSequence charSequence5 = charSequence2;
            charSequence5 = charSequence2;
            if (!z2 && publicUsername != null && (size = this.searchAdapterHelper.getGlobalSearch().size()) != 0 && size + 1 > i) {
                String lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                if (lastFoundUsername.startsWith("@")) {
                    charSequence5 = charSequence2;
                    charSequence5 = charSequence2;
                    lastFoundUsername = lastFoundUsername.substring(1);
                }
                try {
                    charSequence5 = charSequence2;
                    charSequence5 = charSequence2;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) "@");
                    spannableStringBuilder2.append((CharSequence) publicUsername);
                    int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, lastFoundUsername);
                    if (iIndexOfIgnoreCase != -1) {
                        int length = lastFoundUsername.length();
                        if (iIndexOfIgnoreCase == 0) {
                            length++;
                        } else {
                            iIndexOfIgnoreCase++;
                        }
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4)), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                    }
                    charSequence5 = spannableStringBuilder2;
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence5 = publicUsername;
                }
            }
            if (lastFoundChannel != null && publicUsername != null) {
                spannableStringBuilder = new SpannableStringBuilder(publicUsername);
                int iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(publicUsername, lastFoundChannel);
                if (iIndexOfIgnoreCase2 != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4)), iIndexOfIgnoreCase2, lastFoundChannel.length() + iIndexOfIgnoreCase2, 33);
                }
            }
            ?? r13 = (ManageChatUserCell) viewHolder.itemView;
            r13.setTag(Integer.valueOf(i));
            r13.setData(obj, spannableStringBuilder, charSequence5, false);
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).recycle();
            }
        }

        @Override
        public int getItemViewType(int i) {
            return (i == this.globalStartRow || i == this.groupStartRow || i == this.contactsStartRow) ? 1 : 0;
        }
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 16) {
                return true;
            }
            if (itemViewType == 7 || itemViewType == 14) {
                return ChatObject.canBlockUsers(ChatUsersActivity.this.currentChat);
            }
            if (itemViewType == 0) {
                Object currentObject = ((ManageChatUserCell) viewHolder.itemView).getCurrentObject();
                return (ChatUsersActivity.this.type != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) ? false : true;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            if (itemViewType == 0 || itemViewType == 2 || itemViewType == 6) {
                return true;
            }
            if (itemViewType == 12) {
                if (adapterPosition == ChatUsersActivity.this.antiSpamRow) {
                    return ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 13);
                }
                if (adapterPosition == ChatUsersActivity.this.hideMembersRow) {
                    return ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 2);
                }
                if (adapterPosition == ChatUsersActivity.this.tagsRow) {
                    return true;
                }
            }
            return itemViewType == 13;
        }

        @Override
        public int getItemCount() {
            return ChatUsersActivity.this.rowCount;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textInfoPrivacyCell;
            switch (i) {
                case 0:
                    ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, (ChatUsersActivity.this.type == 0 || ChatUsersActivity.this.type == 3) ? 7 : 6, (ChatUsersActivity.this.type == 0 || ChatUsersActivity.this.type == 3) ? 6 : 2, ChatUsersActivity.this.selectType == 0);
                    manageChatUserCell.setDelegate(new ManageChatUserCell.ManageChatUserCellDelegate() {
                        @Override
                        public final boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell2, boolean z) {
                            ChatUsersActivity.ListAdapter listAdapter = this.f$0;
                            return ChatUsersActivity.this.createMenuForParticipant(ChatUsersActivity.this.listViewAdapter.getItem(((Integer) manageChatUserCell2.getTag()).intValue()), !z, manageChatUserCell2);
                        }
                    });
                    textInfoPrivacyCell = manageChatUserCell;
                    break;
                case 1:
                    textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext);
                    break;
                case 2:
                    textInfoPrivacyCell = new ManageChatTextCell(this.mContext);
                    break;
                case 3:
                    textInfoPrivacyCell = new ShadowSectionCell(this.mContext);
                    break;
                case 4:
                    TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(this.mContext);
                    if (!ChatUsersActivity.this.isChannel) {
                        if (ChatUsersActivity.this.isCommunity) {
                            textInfoPrivacyCell2.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                            textInfoPrivacyCell = textInfoPrivacyCell2;
                        } else {
                            textInfoPrivacyCell2.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                            textInfoPrivacyCell = textInfoPrivacyCell2;
                        }
                    } else {
                        textInfoPrivacyCell2.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        textInfoPrivacyCell = textInfoPrivacyCell2;
                    }
                    break;
                case 5:
                    HeaderCell headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 11, false);
                    headerCell.setHeight(43);
                    textInfoPrivacyCell = headerCell;
                    break;
                case 6:
                    textInfoPrivacyCell = new TextSettingsCell(this.mContext);
                    break;
                case 7:
                case 14:
                    textInfoPrivacyCell = new TextCheckCell2(this.mContext);
                    break;
                case 8:
                    GraySectionCell graySectionCell = new GraySectionCell(this.mContext, 26, ((BaseFragment) ChatUsersActivity.this).resourceProvider);
                    graySectionCell.setBackground(null);
                    textInfoPrivacyCell = graySectionCell;
                    break;
                case 9:
                default:
                    SlideChooseView slideChooseView = new SlideChooseView(this.mContext);
                    int i2 = ChatUsersActivity.this.selectedSlowmode;
                    String string = LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff);
                    int i3 = R.string.SlowmodeSeconds;
                    String string2 = LocaleController.formatString(i3, 5);
                    String string3 = LocaleController.formatString(i3, 10);
                    String string4 = LocaleController.formatString(i3, 30);
                    int i4 = R.string.SlowmodeMinutes;
                    slideChooseView.setOptions(i2, string, string2, string3, string4, LocaleController.formatString(i4, 1), LocaleController.formatString(i4, 5), LocaleController.formatString(i4, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                    slideChooseView.setCallback(new SlideChooseView.Callback() {
                        @Override
                        public final void onOptionSelected(int i5) {
                            ChatUsersActivity.ListAdapter.$r8$lambda$QXIccxWEaRofsmguasZi5UcAVVk(this.f$0, i5);
                        }

                        @Override
                        public void onTouchEnd() {
                            SlideChooseView.Callback.CC.$default$onTouchEnd(this);
                        }
                    });
                    textInfoPrivacyCell = slideChooseView;
                    break;
                case 10:
                    textInfoPrivacyCell = new LoadingCell(this.mContext, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                    break;
                case 11:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setViewType(6);
                    flickerLoadingView.showDate(false);
                    flickerLoadingView.setUseHeaderOffset(false);
                    flickerLoadingView.setPaddingLeft(AndroidUtilities.dp(5.0f));
                    RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
                    int iDp = AndroidUtilities.dp(12.0f);
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = iDp;
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = iDp;
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AndroidUtilities.dp(30.0f);
                    flickerLoadingView.setLayoutParams(layoutParams);
                    textInfoPrivacyCell = flickerLoadingView;
                    break;
                case 12:
                    TextCell textCell = new TextCell(this.mContext, 23, false, true, ChatUsersActivity.this.getResourceProvider());
                    textCell.heightDp = 50;
                    textInfoPrivacyCell = textCell;
                    break;
                case 13:
                    CheckBoxCell checkBoxCell = new CheckBoxCell(this.mContext, 4, 21, ChatUsersActivity.this.getResourceProvider());
                    checkBoxCell.getCheckBoxRound().setDrawBackgroundAsArc(14);
                    checkBoxCell.getCheckBoxRound().setColor(Theme.key_switch2TrackChecked, Theme.key_radioBackground, Theme.key_checkboxCheck);
                    checkBoxCell.setEnabled(true);
                    textInfoPrivacyCell = checkBoxCell;
                    break;
                case 15:
                    SlideChooseView slideChooseView2 = new SlideChooseView(this.mContext);
                    Drawable drawable = ContextCompat.getDrawable(ChatUsersActivity.this.getContext(), R.drawable.mini_boost_profile_badge);
                    Context context = ChatUsersActivity.this.getContext();
                    int i5 = R.drawable.mini_boost_profile_badge2;
                    slideChooseView2.setOptions(ChatUsersActivity.this.notRestrictBoosters > 0 ? ChatUsersActivity.this.notRestrictBoosters - 1 : 0, new Drawable[]{drawable, ContextCompat.getDrawable(context, i5), ContextCompat.getDrawable(ChatUsersActivity.this.getContext(), i5), ContextCompat.getDrawable(ChatUsersActivity.this.getContext(), i5), ContextCompat.getDrawable(ChatUsersActivity.this.getContext(), i5)}, "1", "2", "3", "4", "5");
                    slideChooseView2.setCallback(new SlideChooseView.Callback() {
                        @Override
                        public final void onOptionSelected(int i6) {
                            ChatUsersActivity.this.notRestrictBoosters = i6 + 1;
                        }

                        @Override
                        public void onTouchEnd() {
                            SlideChooseView.Callback.CC.$default$onTouchEnd(this);
                        }
                    });
                    textInfoPrivacyCell = slideChooseView2;
                    break;
                case 16:
                    textInfoPrivacyCell = new TextCheckCell(this.mContext, ChatUsersActivity.this.getResourceProvider());
                    break;
                case 17:
                    textInfoPrivacyCell = new SlideIntChooseView(this.mContext, ChatUsersActivity.this.getResourceProvider());
                    break;
            }
            return new RecyclerListView.Holder(textInfoPrivacyCell);
        }

        public static void $r8$lambda$QXIccxWEaRofsmguasZi5UcAVVk(ListAdapter listAdapter, int i) {
            if (ChatUsersActivity.this.info == null) {
                return;
            }
            boolean z = (ChatUsersActivity.this.selectedSlowmode > 0 && i == 0) || (ChatUsersActivity.this.selectedSlowmode == 0 && i > 0);
            ChatUsersActivity.this.selectedSlowmode = i;
            if (z) {
                DiffCallback diffCallbackSaveState = ChatUsersActivity.this.saveState();
                ChatUsersActivity.this.updateRows();
                ChatUsersActivity.this.updateListAnimated(diffCallbackSaveState);
            }
            ChatUsersActivity.this.listViewAdapter.notifyItemChanged(ChatUsersActivity.this.slowmodeInfoRow);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            boolean z;
            long j;
            char c;
            long peerId;
            int i3;
            boolean z2;
            boolean z3;
            long j2;
            long j3;
            TLRPC.TL_chatBannedRights tL_chatBannedRights;
            boolean z4;
            Object chat;
            CharSequence string;
            TLRPC.User user;
            boolean z5;
            boolean z6;
            CharSequence string2;
            TLRPC.User user2;
            boolean z7 = false;
            z = true;
            z = true;
            boolean z8 = true;
            switch (viewHolder.getItemViewType()) {
                case 0:
                    ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
                    manageChatUserCell.setTag(Integer.valueOf(i));
                    TLObject item = getItem(i);
                    if (i < ChatUsersActivity.this.participantsStartRow || i >= ChatUsersActivity.this.participantsEndRow) {
                        if (i < ChatUsersActivity.this.contactsStartRow || i >= ChatUsersActivity.this.contactsEndRow) {
                            i2 = ChatUsersActivity.this.botEndRow;
                        } else {
                            i2 = ChatUsersActivity.this.contactsEndRow;
                            if (ChatObject.isChannel(ChatUsersActivity.this.currentChat) && !ChatUsersActivity.this.currentChat.megagroup) {
                                z = true;
                            }
                        }
                        z = false;
                    } else {
                        i2 = ChatUsersActivity.this.participantsEndRow;
                        if (!ChatObject.isChannel(ChatUsersActivity.this.currentChat) || ChatUsersActivity.this.currentChat.megagroup) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (item instanceof TLRPC.User) {
                        peerId = ((TLRPC.User) item).id;
                        tL_chatBannedRights = null;
                        z3 = false;
                        j2 = 0;
                        z2 = false;
                        z4 = false;
                        i3 = 0;
                        j3 = 0;
                        j = 0;
                        c = 0;
                    } else if (item instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) item;
                        peerId = MessageObject.getPeerId(channelParticipant.peer);
                        j = 0;
                        j3 = channelParticipant.kicked_by;
                        j2 = channelParticipant.promoted_by;
                        c = 0;
                        tL_chatBannedRights = channelParticipant.banned_rights;
                        i3 = channelParticipant.date;
                        z4 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                        z2 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z3 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                    } else {
                        j = 0;
                        c = 0;
                        if (item instanceof TLRPC.ChatParticipant) {
                            TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) item;
                            peerId = chatParticipant.user_id;
                            i3 = chatParticipant.date;
                            z2 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                            z3 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                            j2 = 0;
                            j3 = 0;
                            tL_chatBannedRights = null;
                            z4 = false;
                        }
                    }
                    if (peerId > j) {
                        chat = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(peerId));
                    } else {
                        chat = ChatUsersActivity.this.getMessagesController().getChat(Long.valueOf(-peerId));
                    }
                    if (chat != null) {
                        if (ChatUsersActivity.this.type == 3) {
                            manageChatUserCell.setData(chat, null, ChatUsersActivity.this.formatUserPermissions(tL_chatBannedRights), i != i2 + (-1));
                        } else if (ChatUsersActivity.this.type != 0) {
                            if (ChatUsersActivity.this.type != 1) {
                                if (ChatUsersActivity.this.type == 2) {
                                    manageChatUserCell.setData(chat, null, (!z || i3 == 0) ? null : LocaleController.formatJoined(i3), i != i2 + (-1));
                                }
                            } else {
                                if (z2) {
                                    string = LocaleController.getString(R.string.ChannelCreator);
                                } else {
                                    if (!z3 || (user = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(j2))) == null) {
                                        string = null;
                                    } else if (user.id == peerId) {
                                        string = LocaleController.getString(R.string.ChannelAdministrator);
                                    } else {
                                        int i4 = R.string.EditAdminPromotedBy;
                                        Object[] objArr = new Object[1];
                                        objArr[c] = UserObject.getUserName(user);
                                        string = LocaleController.formatString(i4, objArr);
                                    }
                                    if (i != i2 - 1) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    manageChatUserCell.setData(chat, null, string, z5);
                                }
                                if (i != i2 - 1) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                manageChatUserCell.setData(chat, null, string, z5);
                            }
                        } else {
                            if (!z4 || (user2 = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(j3))) == null) {
                                z6 = true;
                                string2 = null;
                            } else {
                                int i5 = R.string.UserRemovedBy;
                                z6 = true;
                                Object[] objArr2 = new Object[1];
                                objArr2[c] = UserObject.getUserName(user2);
                                string2 = LocaleController.formatString(i5, objArr2);
                            }
                            if (i == i2 - 1) {
                                z6 = false;
                            }
                            manageChatUserCell.setData(chat, null, string2, z6);
                        }
                    }
                    break;
                case 1:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i != ChatUsersActivity.this.antiSpamInfoRow) {
                        if (i == ChatUsersActivity.this.participantsInfoRow) {
                            if (ChatUsersActivity.this.type == 0 || ChatUsersActivity.this.type == 3) {
                                if (!ChatUsersActivity.this.isChannel) {
                                    if (ChatUsersActivity.this.isCommunity) {
                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                                    } else {
                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                                    }
                                } else {
                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                                }
                            } else if (ChatUsersActivity.this.type == 1) {
                                if (ChatUsersActivity.this.addNewRow != -1) {
                                    if (ChatUsersActivity.this.isChannel) {
                                        textInfoPrivacyCell.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                                    } else {
                                        textInfoPrivacyCell.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                                    }
                                } else {
                                    textInfoPrivacyCell.setText("");
                                }
                            } else if (ChatUsersActivity.this.type == 2) {
                                if (!ChatUsersActivity.this.isChannel || ChatUsersActivity.this.selectType != 0) {
                                    textInfoPrivacyCell.setText("");
                                } else {
                                    textInfoPrivacyCell.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                }
                            }
                        } else if (i != ChatUsersActivity.this.slowmodeInfoRow) {
                            if (i != ChatUsersActivity.this.payInfoRow) {
                                if (i == ChatUsersActivity.this.priceInfoRow) {
                                    textInfoPrivacyCell.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, AffiliateProgramFragment.percents(ChatUsersActivity.this.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((double) ((int) ((((double) (ChatUsersActivity.this.starsPrice * (ChatUsersActivity.this.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f))) / 1000.0d) * ((double) ChatUsersActivity.this.getMessagesController().starsUsdWithdrawRate1000)))) / 100.0d)));
                                } else if (i != ChatUsersActivity.this.hideMembersInfoRow) {
                                    if (i != ChatUsersActivity.this.tagsInfoRow) {
                                        if (i != ChatUsersActivity.this.gigaInfoRow) {
                                            if (i == ChatUsersActivity.this.dontRestrictBoostersInfoRow) {
                                                if (ChatUsersActivity.this.isEnabledNotRestrictBoosters) {
                                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                                                } else {
                                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                                                }
                                            } else if (i == ChatUsersActivity.this.signMessagesInfoRow) {
                                                textInfoPrivacyCell.setText(LocaleController.getString(ChatUsersActivity.this.signatures ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                            }
                                        } else {
                                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                                        }
                                    } else {
                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                                    }
                                } else {
                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                                }
                            } else {
                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                            }
                        } else {
                            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
                            int secondsForIndex = chatUsersActivity.getSecondsForIndex(chatUsersActivity.selectedSlowmode);
                            if (ChatUsersActivity.this.info == null || secondsForIndex == 0) {
                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                            } else {
                                textInfoPrivacyCell.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, ChatUsersActivity.this.formatSeconds(secondsForIndex)));
                            }
                        }
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                    }
                    break;
                case 2:
                    ManageChatTextCell manageChatTextCell = (ManageChatTextCell) viewHolder.itemView;
                    manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteGrayIcon, Theme.key_windowBackgroundWhiteBlackText);
                    if (i == ChatUsersActivity.this.addNewRow) {
                        if (ChatUsersActivity.this.type != 3) {
                            if (ChatUsersActivity.this.type != 0) {
                                if (ChatUsersActivity.this.type != 1) {
                                    if (ChatUsersActivity.this.type == 2) {
                                        manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                                        if (ChatUsersActivity.this.addNew2Row != -1 || ((!ChatUsersActivity.this.loadingUsers || ChatUsersActivity.this.firstLoaded) && ChatUsersActivity.this.membersHeaderRow == -1 && !ChatUsersActivity.this.participants.isEmpty())) {
                                            z7 = true;
                                        }
                                        if (ChatUsersActivity.this.isChannel) {
                                            manageChatTextCell.setText(LocaleController.getString(R.string.AddSubscriber), null, R.drawable.msg_contact_add, z7);
                                        } else {
                                            manageChatTextCell.setText(LocaleController.getString(R.string.AddMember), null, R.drawable.msg_contact_add, z7);
                                        }
                                    }
                                } else {
                                    manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                                    manageChatTextCell.setText(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), null, R.drawable.msg_admin_add, !ChatUsersActivity.this.loadingUsers || ChatUsersActivity.this.firstLoaded);
                                }
                            } else {
                                manageChatTextCell.setText(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), null, R.drawable.msg_user_remove, false);
                            }
                        } else {
                            manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                            manageChatTextCell.setText(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), null, R.drawable.msg_contact_add, ChatUsersActivity.this.participantsStartRow != -1);
                        }
                    } else if (i == ChatUsersActivity.this.recentActionsRow) {
                        manageChatTextCell.setText(LocaleController.getString(R.string.EventLog), null, R.drawable.msg_log, ChatUsersActivity.this.antiSpamRow > ChatUsersActivity.this.recentActionsRow);
                    } else if (i != ChatUsersActivity.this.addNew2Row) {
                        if (i == ChatUsersActivity.this.gigaConvertRow) {
                            manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                            manageChatTextCell.setText(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), null, R.drawable.msg_channel, false);
                        }
                    } else {
                        manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                        if ((!ChatUsersActivity.this.loadingUsers || ChatUsersActivity.this.firstLoaded) && ChatUsersActivity.this.membersHeaderRow == -1 && !ChatUsersActivity.this.participants.isEmpty()) {
                            z7 = true;
                        }
                        manageChatTextCell.setText(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), null, R.drawable.msg_link2, z7);
                    }
                    break;
                case 5:
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i == ChatUsersActivity.this.restricted1SectionRow) {
                        if (ChatUsersActivity.this.type == 0) {
                            int size = ChatUsersActivity.this.info != null ? ChatUsersActivity.this.info.kicked_count : ChatUsersActivity.this.participants.size();
                            if (size != 0) {
                                headerCell.setText(LocaleController.formatPluralString("RemovedUser", size, new Object[0]));
                            } else {
                                headerCell.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                            }
                        } else {
                            headerCell.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                        }
                    } else if (i == ChatUsersActivity.this.permissionsSectionRow) {
                        headerCell.setText(LocaleController.getString(ChatUsersActivity.this.isCommunity ? R.string.CommunityPermissionsHeader : R.string.ChannelPermissionsHeader));
                    } else if (i != ChatUsersActivity.this.slowmodeRow) {
                        if (i != ChatUsersActivity.this.gigaHeaderRow) {
                            if (i == ChatUsersActivity.this.priceHeaderRow) {
                                headerCell.setText(LocaleController.getString(R.string.GroupMessagesPriceHeader));
                            }
                        } else {
                            headerCell.setText(LocaleController.getString(R.string.BroadcastGroup));
                        }
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.Slowmode));
                    }
                    break;
                case 6:
                    ((TextSettingsCell) viewHolder.itemView).setTextAndValue(LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist), String.format("%d", Integer.valueOf(ChatUsersActivity.this.info != null ? ChatUsersActivity.this.info.kicked_count : 0)), false);
                    break;
                case 7:
                case 14:
                    final TextCheckCell2 textCheckCell2 = (TextCheckCell2) viewHolder.itemView;
                    textCheckCell2.getCheckBox().setDrawIconType(1);
                    Switch checkBox = textCheckCell2.getCheckBox();
                    int i6 = Theme.key_fill_RedNormal;
                    int i7 = Theme.key_switch2TrackChecked;
                    int i8 = Theme.key_windowBackgroundWhite;
                    checkBox.setColors(i6, i7, i8, i8);
                    boolean z9 = textCheckCell2.getTag() != null && ((Integer) textCheckCell2.getTag()).intValue() == i;
                    textCheckCell2.setTag(Integer.valueOf(i));
                    if (i == ChatUsersActivity.this.changeInfoRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(ChatUsersActivity.this.isCommunity ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (ChatUsersActivity.this.defaultBannedRights.change_info || ChatObject.isPublic(ChatUsersActivity.this.currentChat)) ? false : true, ChatUsersActivity.this.manageTopicsRow != -1, z9);
                    } else if (i == ChatUsersActivity.this.manageLinkedPeersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !ChatUsersActivity.this.defaultBannedRights.manage_linked_peers, false, z9);
                    } else if (i == ChatUsersActivity.this.addUsersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !ChatUsersActivity.this.defaultBannedRights.invite_users, true, z9);
                    } else if (i == ChatUsersActivity.this.pinMessagesRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsPinMessages), (ChatUsersActivity.this.defaultBannedRights.pin_messages || ChatObject.isPublic(ChatUsersActivity.this.currentChat)) ? false : true, true, z9);
                    } else if (i == ChatUsersActivity.this.editTagRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsEditTags), !ChatUsersActivity.this.defaultBannedRights.edit_rank, true, z9);
                    } else if (i == ChatUsersActivity.this.sendMessagesRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !ChatUsersActivity.this.defaultBannedRights.send_plain, true, z9);
                    } else if (i == ChatUsersActivity.this.dontRestrictBoostersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.GroupNotRestrictBoosters), ChatUsersActivity.this.isEnabledNotRestrictBoosters, false, z9);
                        textCheckCell2.getCheckBox().setDrawIconType(0);
                        textCheckCell2.getCheckBox().setColors(Theme.key_switchTrack, Theme.key_switchTrackChecked, i8, i8);
                    } else if (i == ChatUsersActivity.this.sendMediaRow) {
                        int sendMediaSelectedCount = ChatUsersActivity.this.getSendMediaSelectedCount();
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), sendMediaSelectedCount > 0, true, z9);
                        textCheckCell2.setCollapseArrow(String.format(Locale.US, "%d/10", Integer.valueOf(sendMediaSelectedCount)), !ChatUsersActivity.this.sendMediaExpanded, new Runnable() {
                            @Override
                            public void run() {
                                boolean z10 = !textCheckCell2.isChecked();
                                textCheckCell2.setChecked(z10);
                                ChatUsersActivity.this.setSendMediaEnabled(z10);
                            }
                        });
                    } else if (i == ChatUsersActivity.this.sendStickersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !ChatUsersActivity.this.defaultBannedRights.send_stickers, true, z9);
                    } else if (i == ChatUsersActivity.this.embedLinksRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !ChatUsersActivity.this.defaultBannedRights.embed_links, true, z9);
                    } else if (i == ChatUsersActivity.this.sendPollsRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !ChatUsersActivity.this.defaultBannedRights.send_polls, true);
                    } else if (i == ChatUsersActivity.this.manageTopicsRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !ChatUsersActivity.this.defaultBannedRights.manage_topics, false, z9);
                    }
                    if ((i != ChatUsersActivity.this.pinMessagesRow && i != ChatUsersActivity.this.changeInfoRow) || !ChatObject.isDiscussionGroup(((BaseFragment) ChatUsersActivity.this).currentAccount, ChatUsersActivity.this.chatId)) {
                        if (ChatObject.canBlockUsers(ChatUsersActivity.this.currentChat)) {
                            if ((i == ChatUsersActivity.this.addUsersRow && !ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 3)) || ((i == ChatUsersActivity.this.pinMessagesRow && !ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 0)) || ((i == ChatUsersActivity.this.changeInfoRow && !ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 1)) || ((i == ChatUsersActivity.this.manageTopicsRow && !ChatObject.canManageTopics(ChatUsersActivity.this.currentChat)) || (ChatObject.isPublic(ChatUsersActivity.this.currentChat) && (i == ChatUsersActivity.this.pinMessagesRow || i == ChatUsersActivity.this.changeInfoRow)))))) {
                                textCheckCell2.setIcon(R.drawable.permission_locked);
                            } else {
                                textCheckCell2.setIcon(0);
                            }
                        } else {
                            textCheckCell2.setIcon(0);
                        }
                    } else {
                        textCheckCell2.setIcon(R.drawable.permission_locked);
                    }
                    break;
                case 8:
                    GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                    if (i == ChatUsersActivity.this.membersHeaderRow) {
                        if (ChatObject.isChannel(ChatUsersActivity.this.currentChat) && !ChatUsersActivity.this.currentChat.megagroup) {
                            graySectionCell.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                        } else {
                            graySectionCell.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                        }
                    } else if (i != ChatUsersActivity.this.botHeaderRow) {
                        if (i == ChatUsersActivity.this.contactsHeaderRow) {
                            if (ChatObject.isChannel(ChatUsersActivity.this.currentChat) && !ChatUsersActivity.this.currentChat.megagroup) {
                                graySectionCell.setText(LocaleController.getString("ChannelContacts", R.string.ChannelContacts));
                            } else {
                                graySectionCell.setText(LocaleController.getString("GroupContacts", R.string.GroupContacts));
                            }
                        } else if (i == ChatUsersActivity.this.loadingHeaderRow) {
                            graySectionCell.setText("");
                        }
                    } else {
                        graySectionCell.setText(LocaleController.getString("ChannelBots", R.string.ChannelBots));
                    }
                    break;
                case 11:
                    FlickerLoadingView flickerLoadingView = (FlickerLoadingView) viewHolder.itemView;
                    if (ChatUsersActivity.this.type == 0) {
                        flickerLoadingView.setItemsCount(ChatUsersActivity.this.info != null ? ChatUsersActivity.this.info.kicked_count : 1);
                    } else {
                        flickerLoadingView.setItemsCount(1);
                    }
                    break;
                case 12:
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    if (i == ChatUsersActivity.this.antiSpamRow) {
                        textCell.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 13) && (ChatUsersActivity.this.info == null || ChatUsersActivity.this.info.antispam || ChatUsersActivity.this.getParticipantsCount() >= ChatUsersActivity.this.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        textCell.setTextAndCheckAndIcon(LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam), ChatUsersActivity.this.info != null && ChatUsersActivity.this.info.antispam, R.drawable.msg_policy, false);
                    } else if (i == ChatUsersActivity.this.hideMembersRow) {
                        textCell.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 2) && (ChatUsersActivity.this.info == null || ChatUsersActivity.this.info.participants_hidden || ChatUsersActivity.this.getParticipantsCount() >= ChatUsersActivity.this.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        textCell.setTextAndCheck(LocaleController.getString(R.string.ChannelHideMembers), ChatUsersActivity.this.info != null && ChatUsersActivity.this.info.participants_hidden, false);
                    } else if (i == ChatUsersActivity.this.tagsRow) {
                        textCell.getCheckBox().setIcon(0);
                        String string3 = LocaleController.getString(R.string.ChannelMemberTags);
                        if (ChatUsersActivity.this.currentChat != null && ChatUsersActivity.this.currentChat.default_banned_rights != null && ChatUsersActivity.this.currentChat.default_banned_rights.edit_rank) {
                            z8 = false;
                        }
                        textCell.setTextAndCheck(string3, z8, false);
                    }
                    break;
                case 13:
                    CheckBoxCell checkBoxCell = (CheckBoxCell) viewHolder.itemView;
                    boolean z10 = checkBoxCell.getTag() != null && ((Integer) checkBoxCell.getTag()).intValue() == i;
                    checkBoxCell.setTag(Integer.valueOf(i));
                    if (i == ChatUsersActivity.this.sendMediaPhotosRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !ChatUsersActivity.this.defaultBannedRights.send_photos, true, z10);
                    } else if (i == ChatUsersActivity.this.sendMediaVideosRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !ChatUsersActivity.this.defaultBannedRights.send_videos, true, z10);
                    } else if (i == ChatUsersActivity.this.sendMediaStickerGifsRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !ChatUsersActivity.this.defaultBannedRights.send_stickers, true, z10);
                    } else if (i == ChatUsersActivity.this.sendMediaMusicRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !ChatUsersActivity.this.defaultBannedRights.send_audios, true, z10);
                    } else if (i == ChatUsersActivity.this.sendMediaFilesRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !ChatUsersActivity.this.defaultBannedRights.send_docs, true, z10);
                    } else if (i == ChatUsersActivity.this.sendMediaVoiceMessagesRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !ChatUsersActivity.this.defaultBannedRights.send_voices, true, z10);
                    } else if (i == ChatUsersActivity.this.sendMediaVideoMessagesRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !ChatUsersActivity.this.defaultBannedRights.send_roundvideos, true, z10);
                    } else if (i == ChatUsersActivity.this.sendMediaEmbededLinksRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks), "", (ChatUsersActivity.this.defaultBannedRights.embed_links || ChatUsersActivity.this.defaultBannedRights.send_plain) ? false : true, true, z10);
                    } else if (i == ChatUsersActivity.this.sendReactionsRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !ChatUsersActivity.this.defaultBannedRights.send_reactions, false, z10);
                    } else if (i == ChatUsersActivity.this.sendPollsRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !ChatUsersActivity.this.defaultBannedRights.send_polls, true, z10);
                    } else {
                        checkBoxCell.setPad(1);
                    }
                    break;
                case 16:
                    TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                    if (i == ChatUsersActivity.this.signMessagesRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.ChannelSignMessages), ChatUsersActivity.this.signatures, ChatUsersActivity.this.signatures);
                    } else if (i == ChatUsersActivity.this.signMessagesProfilesRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), ChatUsersActivity.this.profiles, false);
                    } else if (i == ChatUsersActivity.this.payRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.GroupMessagesChargePrice), ChatUsersActivity.this.enablePrice, false);
                    }
                    break;
                case 17:
                    SlideIntChooseView slideIntChooseView = (SlideIntChooseView) viewHolder.itemView;
                    if (i == ChatUsersActivity.this.priceRow) {
                        slideIntChooseView.set((int) Utilities.clamp(ChatUsersActivity.this.starsPrice, ChatUsersActivity.this.getMessagesController().starsPaidMessageAmountMax, 1L), SlideIntChooseView.Options.make(1, SlideIntChooseView.cut(new int[]{1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) ChatUsersActivity.this.getMessagesController().starsPaidMessageAmountMax), 20, new Utilities.Callback2Return() {
                            @Override
                            public final Object run(Object obj, Object obj2) {
                                return ChatUsersActivity.ListAdapter.$r8$lambda$irSbMzWtKnWL3PuWL5_LR9R9gR0((Integer) obj, (Integer) obj2);
                            }
                        }), new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                ChatUsersActivity.ListAdapter.$r8$lambda$INsSGGvRcFlzjzEB23CZ5Lm9UrU(this.f$0, (Integer) obj);
                            }
                        });
                    }
                    break;
            }
        }

        public static CharSequence $r8$lambda$irSbMzWtKnWL3PuWL5_LR9R9gR0(Integer num, Integer num2) {
            if (num.intValue() == 0) {
                return LocaleController.formatPluralStringComma("Stars", num2.intValue());
            }
            return "" + num2;
        }

        public static void $r8$lambda$INsSGGvRcFlzjzEB23CZ5Lm9UrU(ListAdapter listAdapter, Integer num) {
            ChatUsersActivity.this.starsPrice = num.intValue();
            AndroidUtilities.updateVisibleRow(ChatUsersActivity.this.listView, ChatUsersActivity.this.priceInfoRow);
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).recycle();
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ChatUsersActivity.this.addNewRow || i == ChatUsersActivity.this.addNew2Row || i == ChatUsersActivity.this.recentActionsRow || i == ChatUsersActivity.this.gigaConvertRow) {
                return 2;
            }
            if ((i >= ChatUsersActivity.this.participantsStartRow && i < ChatUsersActivity.this.participantsEndRow) || ((i >= ChatUsersActivity.this.botStartRow && i < ChatUsersActivity.this.botEndRow) || (i >= ChatUsersActivity.this.contactsStartRow && i < ChatUsersActivity.this.contactsEndRow))) {
                return 0;
            }
            if (i == ChatUsersActivity.this.addNewSectionRow || i == ChatUsersActivity.this.participantsDividerRow || i == ChatUsersActivity.this.participantsDivider2Row) {
                return 3;
            }
            if (i == ChatUsersActivity.this.restricted1SectionRow || i == ChatUsersActivity.this.permissionsSectionRow || i == ChatUsersActivity.this.slowmodeRow || i == ChatUsersActivity.this.gigaHeaderRow || i == ChatUsersActivity.this.priceHeaderRow) {
                return 5;
            }
            if (i == ChatUsersActivity.this.participantsInfoRow || i == ChatUsersActivity.this.slowmodeInfoRow || i == ChatUsersActivity.this.dontRestrictBoostersInfoRow || i == ChatUsersActivity.this.gigaInfoRow || i == ChatUsersActivity.this.antiSpamInfoRow || i == ChatUsersActivity.this.hideMembersInfoRow || i == ChatUsersActivity.this.tagsInfoRow || i == ChatUsersActivity.this.signMessagesInfoRow || i == ChatUsersActivity.this.payInfoRow || i == ChatUsersActivity.this.priceInfoRow) {
                return 1;
            }
            if (i == ChatUsersActivity.this.blockedEmptyRow) {
                return 4;
            }
            if (i == ChatUsersActivity.this.removedUsersRow) {
                return 6;
            }
            if (i == ChatUsersActivity.this.changeInfoRow || i == ChatUsersActivity.this.addUsersRow || i == ChatUsersActivity.this.manageLinkedPeersRow || i == ChatUsersActivity.this.pinMessagesRow || i == ChatUsersActivity.this.editTagRow || i == ChatUsersActivity.this.sendMessagesRow || i == ChatUsersActivity.this.sendStickersRow || i == ChatUsersActivity.this.embedLinksRow || i == ChatUsersActivity.this.manageTopicsRow || i == ChatUsersActivity.this.dontRestrictBoostersRow) {
                return 7;
            }
            if (i == ChatUsersActivity.this.membersHeaderRow || i == ChatUsersActivity.this.contactsHeaderRow || i == ChatUsersActivity.this.botHeaderRow || i == ChatUsersActivity.this.loadingHeaderRow) {
                return 8;
            }
            if (i == ChatUsersActivity.this.slowmodeSelectRow) {
                return 9;
            }
            if (i == ChatUsersActivity.this.loadingProgressRow) {
                return 10;
            }
            if (i == ChatUsersActivity.this.loadingUserCellRow) {
                return 11;
            }
            if (i == ChatUsersActivity.this.antiSpamRow || i == ChatUsersActivity.this.hideMembersRow || i == ChatUsersActivity.this.tagsRow) {
                return 12;
            }
            if (ChatUsersActivity.this.isExpandableSendMediaRow(i)) {
                return 13;
            }
            if (i == ChatUsersActivity.this.sendMediaRow) {
                return 14;
            }
            if (i == ChatUsersActivity.this.dontRestrictBoostersSliderRow) {
                return 15;
            }
            if (i == ChatUsersActivity.this.signMessagesRow || i == ChatUsersActivity.this.signMessagesProfilesRow || i == ChatUsersActivity.this.payRow) {
                return 16;
            }
            return i == ChatUsersActivity.this.priceRow ? 17 : 0;
        }

        public TLObject getItem(int i) {
            if (i < ChatUsersActivity.this.participantsStartRow || i >= ChatUsersActivity.this.participantsEndRow) {
                if (i < ChatUsersActivity.this.contactsStartRow || i >= ChatUsersActivity.this.contactsEndRow) {
                    if (i < ChatUsersActivity.this.botStartRow || i >= ChatUsersActivity.this.botEndRow) {
                        return null;
                    }
                    return (TLObject) ChatUsersActivity.this.bots.get(i - ChatUsersActivity.this.botStartRow);
                }
                return (TLObject) ChatUsersActivity.this.contacts.get(i - ChatUsersActivity.this.contactsStartRow);
            }
            return (TLObject) ChatUsersActivity.this.participants.get(i - ChatUsersActivity.this.participantsStartRow);
        }
    }

    public void setSendMediaEnabled(boolean z) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.defaultBannedRights;
        boolean z2 = !z;
        tL_chatBannedRights.send_media = z2;
        tL_chatBannedRights.send_gifs = z2;
        tL_chatBannedRights.send_inline = z2;
        tL_chatBannedRights.send_games = z2;
        tL_chatBannedRights.send_photos = z2;
        tL_chatBannedRights.send_videos = z2;
        tL_chatBannedRights.send_stickers = z2;
        tL_chatBannedRights.send_audios = z2;
        tL_chatBannedRights.send_docs = z2;
        tL_chatBannedRights.send_voices = z2;
        tL_chatBannedRights.send_roundvideos = z2;
        tL_chatBannedRights.embed_links = z2;
        tL_chatBannedRights.send_polls = z2;
        tL_chatBannedRights.send_reactions = z2;
        AndroidUtilities.updateVisibleRows(this.listView);
        DiffCallback diffCallbackSaveState = saveState();
        updateRows();
        updateListAnimated(diffCallbackSaveState);
    }

    public boolean isExpandableSendMediaRow(int i) {
        return i == this.sendMediaPhotosRow || i == this.sendMediaVideosRow || i == this.sendMediaStickerGifsRow || i == this.sendMediaMusicRow || i == this.sendMediaFilesRow || i == this.sendMediaVoiceMessagesRow || i == this.sendReactionsRow || i == this.sendMediaVideoMessagesRow || i == this.sendMediaEmbededLinksRow || i == this.sendPollsRow;
    }

    public DiffCallback saveState() {
        DiffCallback diffCallback = new DiffCallback();
        diffCallback.oldRowCount = this.rowCount;
        diffCallback.oldBotStartRow = this.botStartRow;
        diffCallback.oldBotEndRow = this.botEndRow;
        diffCallback.oldBots.clear();
        diffCallback.oldBots.addAll(this.bots);
        diffCallback.oldContactsEndRow = this.contactsEndRow;
        diffCallback.oldContactsStartRow = this.contactsStartRow;
        diffCallback.oldContacts.clear();
        diffCallback.oldContacts.addAll(this.contacts);
        diffCallback.oldParticipantsStartRow = this.participantsStartRow;
        diffCallback.oldParticipantsEndRow = this.participantsEndRow;
        diffCallback.oldParticipants.clear();
        diffCallback.oldParticipants.addAll(this.participants);
        diffCallback.fillPositions(diffCallback.oldPositionToItem);
        return diffCallback;
    }

    public void updateListAnimated(DiffCallback diffCallback) {
        View childAt;
        if (this.listViewAdapter == null) {
            updateRows();
            return;
        }
        updateRows();
        diffCallback.fillPositions(diffCallback.newPositionToItem);
        DiffUtil.calculateDiff(diffCallback).dispatchUpdatesTo(this.listViewAdapter);
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || this.layoutManager == null || recyclerListView.getChildCount() <= 0) {
            return;
        }
        int i = 0;
        int childAdapterPosition = -1;
        while (true) {
            if (i >= this.listView.getChildCount()) {
                childAt = null;
                break;
            }
            RecyclerListView recyclerListView2 = this.listView;
            childAdapterPosition = recyclerListView2.getChildAdapterPosition(recyclerListView2.getChildAt(i));
            if (childAdapterPosition != -1) {
                childAt = this.listView.getChildAt(i);
                break;
            }
            i++;
        }
        if (childAt != null) {
            this.layoutManager.scrollToPositionWithOffset(childAdapterPosition, childAt.getTop() - this.listView.getPaddingTop());
        }
    }

    class DiffCallback extends DiffUtil.Callback {
        SparseIntArray newPositionToItem;
        int oldBotEndRow;
        int oldBotStartRow;
        private ArrayList oldBots;
        private ArrayList oldContacts;
        int oldContactsEndRow;
        int oldContactsStartRow;
        private ArrayList oldParticipants;
        int oldParticipantsEndRow;
        int oldParticipantsStartRow;
        SparseIntArray oldPositionToItem;
        int oldRowCount;

        private DiffCallback() {
            this.oldPositionToItem = new SparseIntArray();
            this.newPositionToItem = new SparseIntArray();
            this.oldParticipants = new ArrayList();
            this.oldBots = new ArrayList();
            this.oldContacts = new ArrayList();
        }

        @Override
        public int getOldListSize() {
            return this.oldRowCount;
        }

        @Override
        public int getNewListSize() {
            return ChatUsersActivity.this.rowCount;
        }

        @Override
        public boolean areItemsTheSame(int i, int i2) {
            if (i >= this.oldBotStartRow && i < this.oldBotEndRow && i2 >= ChatUsersActivity.this.botStartRow && i2 < ChatUsersActivity.this.botEndRow) {
                return ((TLObject) this.oldBots.get(i - this.oldBotStartRow)).equals(ChatUsersActivity.this.bots.get(i2 - ChatUsersActivity.this.botStartRow));
            }
            if (i >= this.oldContactsStartRow && i < this.oldContactsEndRow && i2 >= ChatUsersActivity.this.contactsStartRow && i2 < ChatUsersActivity.this.contactsEndRow) {
                return ((TLObject) this.oldContacts.get(i - this.oldContactsStartRow)).equals(ChatUsersActivity.this.contacts.get(i2 - ChatUsersActivity.this.contactsStartRow));
            }
            if (i < this.oldParticipantsStartRow || i >= this.oldParticipantsEndRow || i2 < ChatUsersActivity.this.participantsStartRow || i2 >= ChatUsersActivity.this.participantsEndRow) {
                return this.oldPositionToItem.get(i) == this.newPositionToItem.get(i2);
            }
            return ((TLObject) this.oldParticipants.get(i - this.oldParticipantsStartRow)).equals(ChatUsersActivity.this.participants.get(i2 - ChatUsersActivity.this.participantsStartRow));
        }

        @Override
        public boolean areContentsTheSame(int i, int i2) {
            return areItemsTheSame(i, i2) && ChatUsersActivity.this.restricted1SectionRow != i2;
        }

        public void fillPositions(SparseIntArray sparseIntArray) {
            sparseIntArray.clear();
            put(1, ChatUsersActivity.this.recentActionsRow, sparseIntArray);
            put(2, ChatUsersActivity.this.addNewRow, sparseIntArray);
            put(3, ChatUsersActivity.this.addNew2Row, sparseIntArray);
            put(4, ChatUsersActivity.this.addNewSectionRow, sparseIntArray);
            put(5, ChatUsersActivity.this.restricted1SectionRow, sparseIntArray);
            put(6, ChatUsersActivity.this.participantsDividerRow, sparseIntArray);
            put(7, ChatUsersActivity.this.participantsDivider2Row, sparseIntArray);
            put(8, ChatUsersActivity.this.gigaHeaderRow, sparseIntArray);
            put(9, ChatUsersActivity.this.gigaConvertRow, sparseIntArray);
            put(10, ChatUsersActivity.this.gigaInfoRow, sparseIntArray);
            put(11, ChatUsersActivity.this.participantsInfoRow, sparseIntArray);
            put(12, ChatUsersActivity.this.blockedEmptyRow, sparseIntArray);
            put(13, ChatUsersActivity.this.permissionsSectionRow, sparseIntArray);
            put(14, ChatUsersActivity.this.sendMessagesRow, sparseIntArray);
            put(15, ChatUsersActivity.this.sendMediaRow, sparseIntArray);
            put(16, ChatUsersActivity.this.sendStickersRow, sparseIntArray);
            put(17, ChatUsersActivity.this.sendPollsRow, sparseIntArray);
            put(18, ChatUsersActivity.this.embedLinksRow, sparseIntArray);
            put(19, ChatUsersActivity.this.addUsersRow, sparseIntArray);
            put(20, ChatUsersActivity.this.manageLinkedPeersRow, sparseIntArray);
            put(21, ChatUsersActivity.this.pinMessagesRow, sparseIntArray);
            put(22, ChatUsersActivity.this.editTagRow, sparseIntArray);
            int i = 23;
            put(23, ChatUsersActivity.this.sendReactionsRow, sparseIntArray);
            if (ChatUsersActivity.this.isForum) {
                i = 24;
                put(24, ChatUsersActivity.this.manageTopicsRow, sparseIntArray);
            }
            put(i + 1, ChatUsersActivity.this.changeInfoRow, sparseIntArray);
            put(i + 2, ChatUsersActivity.this.removedUsersRow, sparseIntArray);
            put(i + 3, ChatUsersActivity.this.contactsHeaderRow, sparseIntArray);
            put(i + 4, ChatUsersActivity.this.botHeaderRow, sparseIntArray);
            put(i + 5, ChatUsersActivity.this.membersHeaderRow, sparseIntArray);
            put(i + 6, ChatUsersActivity.this.slowmodeRow, sparseIntArray);
            put(i + 7, ChatUsersActivity.this.slowmodeSelectRow, sparseIntArray);
            put(i + 8, ChatUsersActivity.this.slowmodeInfoRow, sparseIntArray);
            put(i + 9, ChatUsersActivity.this.dontRestrictBoostersRow, sparseIntArray);
            put(i + 10, ChatUsersActivity.this.dontRestrictBoostersSliderRow, sparseIntArray);
            put(i + 11, ChatUsersActivity.this.dontRestrictBoostersInfoRow, sparseIntArray);
            put(i + 12, ChatUsersActivity.this.loadingProgressRow, sparseIntArray);
            put(i + 13, ChatUsersActivity.this.loadingUserCellRow, sparseIntArray);
            put(i + 14, ChatUsersActivity.this.loadingHeaderRow, sparseIntArray);
            put(i + 15, ChatUsersActivity.this.signMessagesRow, sparseIntArray);
            put(i + 16, ChatUsersActivity.this.signMessagesProfilesRow, sparseIntArray);
            put(i + 17, ChatUsersActivity.this.signMessagesInfoRow, sparseIntArray);
            put(i + 18, ChatUsersActivity.this.payRow, sparseIntArray);
            put(i + 19, ChatUsersActivity.this.payInfoRow, sparseIntArray);
            put(i + 20, ChatUsersActivity.this.priceHeaderRow, sparseIntArray);
            put(i + 21, ChatUsersActivity.this.priceRow, sparseIntArray);
            put(i + 22, ChatUsersActivity.this.priceInfoRow, sparseIntArray);
        }

        private void put(int i, int i2, SparseIntArray sparseIntArray) {
            if (i2 >= 0) {
                sparseIntArray.put(i2, i);
            }
        }
    }

    public int getSendMediaSelectedCount() {
        return getSendMediaSelectedCount(this.defaultBannedRights);
    }

    public static int getSendMediaSelectedCount(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i++;
        }
        return !tL_chatBannedRights.send_reactions ? i + 1 : i;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ChatUsersActivity.$r8$lambda$xNcltWsTxP0L4UdqreqGEtXtpTM(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, ManageChatUserCell.class, ManageChatTextCell.class, TextCheckCell2.class, TextSettingsCell.class, SlideChooseView.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_graySectionText));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switch2Track));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switch2TrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_undo_background));
        int i4 = Theme.key_undo_cancelColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        int i5 = Theme.key_undo_infoColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{UndoView.class}, new String[]{"leftImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerEmptyView.class}, new String[]{"title"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerEmptyView.class}, new String[]{"subtitle"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.emptyView.title, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.emptyView.subtitle, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    public static void $r8$lambda$xNcltWsTxP0L4UdqreqGEtXtpTM(ChatUsersActivity chatUsersActivity) {
        RecyclerListView recyclerListView = chatUsersActivity.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = chatUsersActivity.listView.getChildAt(i);
                if (childAt instanceof ManageChatUserCell) {
                    ((ManageChatUserCell) childAt).update(0);
                }
            }
        }
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
        this.undoView.setTranslationY(-i4);
    }
}
