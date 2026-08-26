package org.telegram.ui.Adapters;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.stripe.android.Stripe;
import j$.util.List;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda4;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda5;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda16;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.BotSwitchCell;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.MentionCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda208;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda248;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda42;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda16;

public final class MentionsAdapter extends RecyclerListView.SelectionAdapter implements NotificationCenter.NotificationCenterDelegate {
    public LongSparseArray botInfo;
    public int botsCount;
    public HashtagHint bottomHint;
    public RemoteUtils$$ExternalSyntheticLambda2 cancelDelayRunnable;
    public int channelLastReqId;
    public int channelReqId;
    public TLRPC.Chat chat;
    public Theme$$ExternalSyntheticLambda4 checkAgainRunnable;
    public boolean contextMedia;
    public int contextQueryReqid;
    public AnonymousClass4 contextQueryRunnable;
    public int contextUsernameReqid;
    public final MentionsContainerView.AnonymousClass4 delegate;
    public long dialog_id;
    public TLRPC.User foundContextBot;
    public String hintHashtag;
    public TLRPC.ChatFull info;
    public boolean isSearchingMentions;
    public Object[] lastData;
    public boolean lastForSearch;
    public Location lastKnownLocation;
    public int lastPosition;
    public int lastReqId;
    public String[] lastSearchKeyboardLanguage;
    public String lastSticker;
    public String lastText;
    public boolean lastUsernameOnly;
    public final Context mContext;
    public EmojiView.AnonymousClass29 mentionsStickersActionTracker;
    public ArrayList messages;
    public String nextQueryOffset;
    public boolean noUserName;
    public ChatActivity parentFragment;
    public ArrayList quickReplies;
    public String quickRepliesQuery;
    public final Theme.ResourcesProvider resourcesProvider;
    public int resultLength;
    public int resultStartPosition;
    public final SearchAdapterHelper searchAdapterHelper;
    public AnonymousClass7 searchGlobalRunnable;
    public ArrayList searchResultBotContext;
    public TLRPC.TL_inlineBotSwitchPM searchResultBotContextSwitch;
    public long searchResultBotContextSwitchUserId;
    public TLRPC.TL_inlineBotWebView searchResultBotWebViewSwitch;
    public ArrayList searchResultCommands;
    public ArrayList searchResultCommandsEphemeral;
    public ArrayList searchResultCommandsHelp;
    public ArrayList searchResultCommandsUsers;
    public ArrayList searchResultHashtags;
    public ArrayList searchResultSuggestions;
    public ArrayList searchResultUsernames;
    public LongSparseArray searchResultUsernamesMap;
    public String searchingContextQuery;
    public String searchingContextUsername;
    public ArrayList stickers;
    public HashMap stickersMap;
    public final boolean stories;
    public final long threadMessageId;
    public HashtagHint topHint;
    public boolean visibleByStickersSearch;
    public boolean allowStickers = true;
    public boolean allowBots = true;
    public boolean allowChats = true;
    public int currentAccount = UserConfig.selectedAccount;
    public boolean needUsernames = true;
    public boolean needBotContext = true;
    public boolean inlineMediaEnabled = true;
    public boolean searchInDialogs = false;
    public final ArrayList stickersToLoad = new ArrayList();
    public final AnonymousClass2 locationProvider = new AnonymousClass2(new SendMessagesHelper.LocationProvider.LocationProviderDelegate() {
        @Override
        public final void onLocationAcquired(Location location) {
            MentionsAdapter mentionsAdapter = MentionsAdapter.this;
            TLRPC.User user = mentionsAdapter.foundContextBot;
            if (user == null || !user.bot_inline_geo) {
                return;
            }
            mentionsAdapter.lastKnownLocation = location;
            mentionsAdapter.searchForContextBotResults(true, user, mentionsAdapter.searchingContextQuery, "");
        }

        @Override
        public final void onUnableLocationAcquire() {
            MentionsAdapter.this.onLocationUnavailable();
        }
    });
    public boolean isReversed = false;
    public int lastItemCount = -1;

    public final class AnonymousClass2 extends SendMessagesHelper.LocationProvider {
        public AnonymousClass2(AnonymousClass1 anonymousClass1) {
            super(anonymousClass1);
        }

        @Override
        public final void stop() {
            super.stop();
            MentionsAdapter.this.lastKnownLocation = null;
        }
    }

    public final class AnonymousClass4 implements Runnable {
        public final MessagesController val$messagesController;
        public final MessagesStorage val$messagesStorage;
        public final String val$query;
        public final String val$username;

        public AnonymousClass4(String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
            this.val$query = str;
            this.val$username = str2;
            this.val$messagesController = messagesController;
            this.val$messagesStorage = messagesStorage;
        }

        @Override
        public final void run() {
            MentionsAdapter mentionsAdapter = MentionsAdapter.this;
            if (mentionsAdapter.contextQueryRunnable != this) {
                return;
            }
            mentionsAdapter.contextQueryRunnable = null;
            TLRPC.User user = mentionsAdapter.foundContextBot;
            if (user != null || mentionsAdapter.noUserName) {
                if (mentionsAdapter.noUserName) {
                    return;
                }
                mentionsAdapter.searchForContextBotResults(true, user, this.val$query, "");
                return;
            }
            String str = this.val$username;
            mentionsAdapter.searchingContextUsername = str;
            MessagesController messagesController = this.val$messagesController;
            TLObject userOrChat = messagesController.getUserOrChat(str);
            if (userOrChat instanceof TLRPC.User) {
                mentionsAdapter.processFoundUser((TLRPC.User) userOrChat);
                return;
            }
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = mentionsAdapter.searchingContextUsername;
            mentionsAdapter.contextUsernameReqid = ConnectionsManager.getInstance(mentionsAdapter.currentAccount).sendRequest(tL_contacts_resolveUsername, new LoginActivity$$ExternalSyntheticLambda42(this, str, messagesController, this.val$messagesStorage, 1));
        }
    }

    public final class AnonymousClass7 implements Runnable {
        public final TLRPC.Chat val$chat;
        public final MessagesController val$messagesController;
        public final LongSparseArray val$newMap;
        public final ArrayList val$newResult;
        public final long val$threadId;
        public final String val$usernameString;

        public AnonymousClass7(TLRPC.Chat chat, String str, long j, ArrayList arrayList, LongSparseArray longSparseArray, MessagesController messagesController) {
            this.val$chat = chat;
            this.val$usernameString = str;
            this.val$threadId = j;
            this.val$newResult = arrayList;
            this.val$newMap = longSparseArray;
            this.val$messagesController = messagesController;
        }

        @Override
        public final void run() {
            MentionsAdapter mentionsAdapter = MentionsAdapter.this;
            if (mentionsAdapter.searchGlobalRunnable != this) {
                return;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.val$chat);
            tL_channels_getParticipants.limit = 20;
            tL_channels_getParticipants.offset = 0;
            TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
            int i = tL_channelParticipantsMentions.flags;
            tL_channelParticipantsMentions.flags = i | 1;
            tL_channelParticipantsMentions.q = this.val$usernameString;
            long j = this.val$threadId;
            if (j != 0) {
                tL_channelParticipantsMentions.flags = i | 3;
                tL_channelParticipantsMentions.top_msg_id = (int) j;
            }
            tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
            int i2 = mentionsAdapter.channelLastReqId + 1;
            mentionsAdapter.channelLastReqId = i2;
            mentionsAdapter.channelReqId = ConnectionsManager.getInstance(mentionsAdapter.currentAccount).sendRequest(tL_channels_getParticipants, new GroupCallSheet$$ExternalSyntheticLambda0(this, i2, this.val$newResult, this.val$newMap, this.val$messagesController, 3));
        }
    }

    public final class EphemeralCommand {
        public final long botUserId;
        public final String command;

        public EphemeralCommand(String str, long j) {
            this.command = str;
            this.botUserId = j;
        }
    }

    public final class HashtagHint extends LinearLayout {
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView imageView;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView textView;
        public final TextView titleView;

        public HashtagHint(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context);
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            this.resourcesProvider = resourcesProvider;
            setOrientation(0);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
            addView(backupImageView, LayoutHelper.createLinear(28, 28, 19, 12, 0, 12, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 55, 0, 4, 12, 4));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 15.0f);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2), context);
            this.textView = textViewM;
            textViewM.setTextSize(1, 13.0f);
            textViewM.setTextColor(z ? Theme.multAlpha(0.5f, Theme.getColor(i, resourcesProvider)) : Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public final void set(int i, String str, TLRPC.Chat chat) {
            if (str == null) {
                return;
            }
            TextView textView = this.textView;
            TextView textView2 = this.titleView;
            BackupImageView backupImageView = this.imageView;
            if (i == 0) {
                CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
                combinedDrawable.offsetX = AndroidUtilities.dp(-0.66f);
                combinedDrawable.offsetY = 0;
                int iDp = AndroidUtilities.dp(20.0f);
                int iDp2 = AndroidUtilities.dp(20.0f);
                combinedDrawable.iconWidth = iDp;
                combinedDrawable.iconHeight = iDp2;
                backupImageView.setImageDrawable(combinedDrawable);
                textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
                textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
                return;
            }
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
            backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
            backupImageView.onNewImageSet();
            int i2 = R.string.HashtagSuggestion2Title;
            StringBuilder sbM = Log.m(str, "@");
            sbM.append(ChatObject.getPublicUsername(chat));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i2, sbM.toString()));
            spannableStringBuilder.append((CharSequence) "  d");
            FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan(8);
            newSpan.color = Theme.getColor(null, Theme.key_premiumGradient1, false);
            spannableStringBuilder.setSpan(newSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            textView2.setText(spannableStringBuilder);
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
        }
    }

    public final class StickerResult {
        public final Object parent;
        public final TLRPC.Document sticker;

        public StickerResult(TLRPC.Document document, Object obj) {
            this.sticker = document;
            this.parent = obj;
        }
    }

    public MentionsAdapter(Context context, long j, long j2, MentionsContainerView.AnonymousClass4 anonymousClass4, Theme.ResourcesProvider resourcesProvider, boolean z) {
        this.resourcesProvider = resourcesProvider;
        this.mContext = context;
        this.delegate = anonymousClass4;
        this.dialog_id = j;
        this.stories = z;
        this.threadMessageId = j2;
        SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
        this.searchAdapterHelper = searchAdapterHelper;
        searchAdapterHelper.delegate = new Stripe(this, 13);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    public final void addStickerToResult(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap map = this.stickersMap;
        if (map == null || !map.containsKey(str2)) {
            if (UserConfig.getInstance(this.currentAccount).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.stickers == null) {
                    this.stickers = new ArrayList();
                    this.stickersMap = new HashMap();
                }
                this.stickers.add(new StickerResult(document, str));
                this.stickersMap.put(str2, document);
                EmojiView.AnonymousClass29 anonymousClass29 = this.mentionsStickersActionTracker;
                if (anonymousClass29 != null) {
                    anonymousClass29.checkVisibility();
                }
            }
        }
    }

    public final void addStickersToResult(String str, ArrayList arrayList) {
        Object obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i);
            String str2 = document.dc_id + "_" + document.id;
            HashMap map = this.stickersMap;
            if (map == null || !map.containsKey(str2)) {
                obj = str;
                obj = str;
                if (UserConfig.getInstance(this.currentAccount).isPremium() || !MessageObject.isPremiumSticker(document)) {
                    int size2 = document.attributes.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            obj = documentAttribute.stickerset;
                            break;
                        }
                    }
                    if (this.stickers == null) {
                        this.stickers = new ArrayList();
                        this.stickersMap = new HashMap();
                    }
                    this.stickers.add(new StickerResult(document, obj));
                    this.stickersMap.put(str2, document);
                }
            } else {
                obj = str;
            }
            i++;
            obj = obj;
        }
        obj = str;
    }

    public final void checkLocationPermissionsOrStart() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null || chatActivity.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && this.parentFragment.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            this.parentFragment.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        TLRPC.User user = this.foundContextBot;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        this.locationProvider.start();
    }

    public final void checkStickerFilesExistAndDownload() {
        if (this.stickers == null) {
            return;
        }
        ArrayList arrayList = this.stickersToLoad;
        arrayList.clear();
        int iMin = Math.min(6, this.stickers.size());
        for (int i = 0; i < iMin; i++) {
            StickerResult stickerResult = (StickerResult) this.stickers.get(i);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerResult.sticker.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.currentAccount).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerResult.sticker), stickerResult.parent, "webp", 1, 1);
            }
        }
        arrayList.isEmpty();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Theme$$ExternalSyntheticLambda4 theme$$ExternalSyntheticLambda4;
        if (i == NotificationCenter.fileLoaded || i == NotificationCenter.fileLoadFailed) {
            ArrayList arrayList = this.stickers;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = this.stickersToLoad;
            if (arrayList2.isEmpty() || !this.visibleByStickersSearch) {
                return;
            }
            arrayList2.remove((String) objArr[0]);
            if (arrayList2.isEmpty()) {
                this.delegate.needChangePanelVisibility(getItemCountInternal() > 0);
                return;
            }
            return;
        }
        if (i == NotificationCenter.recentDocumentsDidLoad) {
            Theme$$ExternalSyntheticLambda4 theme$$ExternalSyntheticLambda5 = this.checkAgainRunnable;
            if (theme$$ExternalSyntheticLambda5 != null) {
                AndroidUtilities.runOnUIThread(theme$$ExternalSyntheticLambda5);
                this.checkAgainRunnable = null;
                return;
            }
            return;
        }
        if (i == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (theme$$ExternalSyntheticLambda4 = this.checkAgainRunnable) != null) {
            AndroidUtilities.runOnUIThread(theme$$ExternalSyntheticLambda4);
            this.checkAgainRunnable = null;
        }
    }

    public final TLRPC.TL_inlineBotSwitchPM getBotContextSwitch() {
        TLRPC.User user = this.foundContextBot;
        if (user == null || user.id == this.searchResultBotContextSwitchUserId) {
            return this.searchResultBotContextSwitch;
        }
        return null;
    }

    public final Object getItem(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        String str;
        ArrayList arrayList9;
        ArrayList arrayList10;
        TLRPC.TL_inlineBotWebView tL_inlineBotWebView;
        TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM;
        TLRPC.User user = null;
        if (this.hintHashtag == null) {
            arrayList = this.stickers;
            if (arrayList != null) {
                arrayList2 = this.searchResultBotContext;
                if (arrayList2 != null) {
                    tL_inlineBotWebView = this.searchResultBotWebViewSwitch;
                    if (tL_inlineBotWebView != null) {
                        tL_inlineBotSwitchPM = this.searchResultBotContextSwitch;
                        if (tL_inlineBotSwitchPM == null) {
                            if (i >= 0 && i < arrayList2.size()) {
                                return this.searchResultBotContext.get(i);
                            }
                        } else if (i == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    } else if (i == 0) {
                        return tL_inlineBotWebView;
                    }
                    i--;
                    if (i >= 0) {
                        return this.searchResultBotContext.get(i);
                    }
                } else {
                    arrayList3 = this.searchResultUsernames;
                    if (arrayList3 != null) {
                        arrayList4 = this.searchResultHashtags;
                        if (arrayList4 != null) {
                            arrayList5 = this.searchResultSuggestions;
                            if (arrayList5 != null) {
                                arrayList6 = this.quickReplies;
                                if (arrayList6 == null || this.searchResultCommands != null) {
                                    if (arrayList6 != null) {
                                        if (i < 0 && i < arrayList6.size()) {
                                            return this.quickReplies.get(i);
                                        }
                                        arrayList10 = this.quickReplies;
                                        if (arrayList10 != null) {
                                            i -= arrayList10.size();
                                        }
                                    }
                                    arrayList7 = this.searchResultCommands;
                                    if (arrayList7 != null && i >= 0 && i < arrayList7.size()) {
                                        arrayList8 = this.searchResultCommandsUsers;
                                        if (arrayList8 != null || (this.botsCount == 1 && !(this.info instanceof TLRPC.TL_channelFull))) {
                                            str = (String) this.searchResultCommands.get(i);
                                        } else if (arrayList8.get(i) != null) {
                                            user = (TLRPC.User) this.searchResultCommandsUsers.get(i);
                                            str = String.format("%s@%s", this.searchResultCommands.get(i), user != null ? UserObject.getPublicUsername(user) : "");
                                        } else {
                                            str = String.format("%s", this.searchResultCommands.get(i));
                                        }
                                        arrayList9 = this.searchResultCommandsEphemeral;
                                        if (arrayList9 == null && ((Boolean) arrayList9.get(i)).booleanValue()) {
                                            return new EphemeralCommand(str, user != null ? user.id : 0L);
                                        }
                                        return str;
                                    }
                                }
                            } else if (i >= 0 && i < arrayList5.size()) {
                                return this.searchResultSuggestions.get(i);
                            }
                        } else if (i >= 0 && i < arrayList4.size()) {
                            return this.searchResultHashtags.get(i);
                        }
                    } else if (i >= 0 && i < arrayList3.size()) {
                        return this.searchResultUsernames.get(i);
                    }
                }
            } else if (i >= 0 && i < arrayList.size()) {
                return ((StickerResult) this.stickers.get(i)).sticker;
            }
        } else if (i >= 2) {
            i -= 2;
            arrayList = this.stickers;
            if (arrayList != null) {
                arrayList2 = this.searchResultBotContext;
                if (arrayList2 != null) {
                    tL_inlineBotWebView = this.searchResultBotWebViewSwitch;
                    if (tL_inlineBotWebView != null) {
                        tL_inlineBotSwitchPM = this.searchResultBotContextSwitch;
                        if (tL_inlineBotSwitchPM == null) {
                            if (i >= 0) {
                                return this.searchResultBotContext.get(i);
                            }
                        } else if (i == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    } else if (i == 0) {
                        return tL_inlineBotWebView;
                    }
                    i--;
                    if (i >= 0) {
                        return this.searchResultBotContext.get(i);
                    }
                } else {
                    arrayList3 = this.searchResultUsernames;
                    if (arrayList3 != null) {
                        arrayList4 = this.searchResultHashtags;
                        if (arrayList4 != null) {
                            arrayList5 = this.searchResultSuggestions;
                            if (arrayList5 != null) {
                                arrayList6 = this.quickReplies;
                                if (arrayList6 == null) {
                                    if (arrayList6 != null) {
                                        if (i < 0) {
                                        }
                                        arrayList10 = this.quickReplies;
                                        if (arrayList10 != null) {
                                            i -= arrayList10.size();
                                        }
                                    }
                                    arrayList7 = this.searchResultCommands;
                                    if (arrayList7 != null) {
                                        arrayList8 = this.searchResultCommandsUsers;
                                        if (arrayList8 != null) {
                                            str = (String) this.searchResultCommands.get(i);
                                        } else {
                                            str = (String) this.searchResultCommands.get(i);
                                        }
                                        arrayList9 = this.searchResultCommandsEphemeral;
                                        if (arrayList9 == null) {
                                        }
                                        return str;
                                    }
                                } else {
                                    if (arrayList6 != null) {
                                        if (i < 0) {
                                        }
                                        arrayList10 = this.quickReplies;
                                        if (arrayList10 != null) {
                                            i -= arrayList10.size();
                                        }
                                    }
                                    arrayList7 = this.searchResultCommands;
                                    if (arrayList7 != null) {
                                        arrayList8 = this.searchResultCommandsUsers;
                                        if (arrayList8 != null) {
                                            str = (String) this.searchResultCommands.get(i);
                                        } else {
                                            str = (String) this.searchResultCommands.get(i);
                                        }
                                        arrayList9 = this.searchResultCommandsEphemeral;
                                        if (arrayList9 == null) {
                                        }
                                        return str;
                                    }
                                }
                            } else if (i >= 0) {
                                return this.searchResultSuggestions.get(i);
                            }
                        } else if (i >= 0) {
                            return this.searchResultHashtags.get(i);
                        }
                    } else if (i >= 0) {
                        return this.searchResultUsernames.get(i);
                    }
                }
            } else if (i >= 0) {
                return ((StickerResult) this.stickers.get(i)).sticker;
            }
        }
        return null;
    }

    @Override
    public final int getItemCount() {
        int itemCountInternal = getItemCountInternal();
        this.lastItemCount = itemCountInternal;
        return itemCountInternal;
    }

    public final int getItemCountInternal() {
        int size;
        int i = 1;
        if (this.foundContextBot != null && !this.inlineMediaEnabled) {
            return 1;
        }
        int i2 = this.hintHashtag != null ? 2 : 0;
        ArrayList arrayList = this.stickers;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            ArrayList arrayList2 = this.searchResultBotContext;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) {
                    i = 0;
                }
                return size2 + i + i2;
            }
            ArrayList arrayList3 = this.searchResultUsernames;
            if (arrayList3 != null) {
                size = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.searchResultHashtags;
                if (arrayList4 != null) {
                    size = arrayList4.size();
                } else if (this.searchResultCommands == null && this.quickReplies == null) {
                    ArrayList arrayList5 = this.searchResultSuggestions;
                    if (arrayList5 == null) {
                        return i2;
                    }
                    size = arrayList5.size();
                } else {
                    ArrayList arrayList6 = this.quickReplies;
                    int size3 = arrayList6 == null ? 0 : arrayList6.size();
                    ArrayList arrayList7 = this.searchResultCommands;
                    size = size3 + (arrayList7 != null ? arrayList7.size() : 0);
                }
            }
        }
        return size + i2;
    }

    @Override
    public final int getItemViewType(int i) {
        if (this.hintHashtag != null) {
            if (i < 2) {
                return 6;
            }
            i -= 2;
        }
        if (this.stickers != null) {
            return 4;
        }
        if (this.foundContextBot != null && !this.inlineMediaEnabled) {
            return 3;
        }
        if (this.searchResultBotContext == null) {
            ArrayList arrayList = this.quickReplies;
            return (arrayList == null || i < 0 || i >= arrayList.size()) ? 0 : 5;
        }
        if (i == 0) {
            return (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? 1 : 2;
        }
        return 1;
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return (this.foundContextBot == null || this.inlineMediaEnabled) && this.stickers == null;
    }

    public final boolean isStickers() {
        return this.stickers != null;
    }

    @Override
    public final void notifyDataSetChanged() {
        MediaDataController.KeywordResult keywordResult;
        String str;
        String str2;
        int i = this.lastItemCount;
        MentionsContainerView.AnonymousClass4 anonymousClass4 = this.delegate;
        RecyclerView.AdapterDataObservable adapterDataObservable = this.mObservable;
        int i2 = 0;
        if (i != -1 && this.lastData != null) {
            int itemCountInternal = getItemCountInternal();
            this.lastItemCount = itemCountInternal;
            boolean z = i != itemCountInternal;
            int iMin = Math.min(i, itemCountInternal);
            Object[] objArr = new Object[itemCountInternal];
            for (int i3 = 0; i3 < itemCountInternal; i3++) {
                objArr[i3] = getItem(i3);
            }
            while (i2 < iMin) {
                if (i2 >= 0) {
                    Object[] objArr2 = this.lastData;
                    if (i2 >= objArr2.length || i2 >= itemCountInternal) {
                        notifyItemChanged(i2);
                        z = true;
                    } else {
                        Object obj = objArr2[i2];
                        Object obj2 = objArr[i2];
                        if (obj instanceof QuickRepliesController.QuickReply) {
                            notifyItemChanged(i2);
                            z = true;
                        } else if (obj != obj2 && ((!(obj instanceof StickerResult) || !(obj2 instanceof StickerResult) || ((StickerResult) obj).sticker != ((StickerResult) obj2).sticker) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                            if ((obj instanceof MediaDataController.KeywordResult) && (obj2 instanceof MediaDataController.KeywordResult) && (str = (keywordResult = (MediaDataController.KeywordResult) obj).keyword) != null) {
                                MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) obj2;
                                if (!str.equals(keywordResult2.keyword) || (str2 = keywordResult.emoji) == null || !str2.equals(keywordResult2.emoji)) {
                                    notifyItemChanged(i2);
                                    z = true;
                                }
                            } else {
                                notifyItemChanged(i2);
                                z = true;
                            }
                        }
                    }
                } else {
                    notifyItemChanged(i2);
                    z = true;
                }
                i2++;
            }
            adapterDataObservable.notifyItemRangeRemoved(iMin, i - iMin);
            adapterDataObservable.notifyItemRangeInserted(iMin, itemCountInternal - iMin);
            if (z && anonymousClass4 != null) {
                anonymousClass4.onItemCountUpdate();
            }
            this.lastData = objArr;
            return;
        }
        if (anonymousClass4 != null) {
            this.lastItemCount = getItemCountInternal();
            anonymousClass4.onItemCountUpdate();
        }
        adapterDataObservable.notifyChanged();
        int itemCountInternal2 = getItemCountInternal();
        this.lastItemCount = itemCountInternal2;
        this.lastData = new Object[itemCountInternal2];
        while (true) {
            Object[] objArr3 = this.lastData;
            if (i2 >= objArr3.length) {
                return;
            }
            objArr3[i2] = getItem(i2);
            i2++;
        }
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ChatActivity chatActivity;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        String str = this.hintHashtag;
        int i2 = str != null ? i - 2 : i;
        int i3 = viewHolder.mItemViewType;
        Boolean bool = null;
        View view = viewHolder.itemView;
        if (i3 == 4) {
            StickerCell stickerCell = (StickerCell) view;
            if (i2 < 0 || i2 >= this.stickers.size()) {
                return;
            }
            StickerResult stickerResult = (StickerResult) this.stickers.get(i2);
            TLRPC.Document document = stickerResult.sticker;
            stickerCell.parentObject = stickerResult.parent;
            boolean zIsPremiumSticker = MessageObject.isPremiumSticker(document);
            stickerCell.isPremiumSticker = zIsPremiumSticker;
            PremiumLockIconView premiumLockIconView = stickerCell.premiumIconView;
            if (zIsPremiumSticker) {
                premiumLockIconView.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                premiumLockIconView.waitingImage = true;
                premiumLockIconView.wasDrawn = false;
                premiumLockIconView.invalidate();
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 1.0f, 1.0f, stickerCell.resourcesProvider);
            boolean zCanAutoplayAnimatedSticker = MessageObject.canAutoplayAnimatedSticker(document);
            BackupImageView backupImageView = stickerCell.imageView;
            if (zCanAutoplayAnimatedSticker) {
                if (svgThumb != null) {
                    backupImageView.setImage(ImageLocation.getForDocument(document), "80_80", null, null, svgThumb, null, 0, stickerCell.parentObject);
                } else if (closestPhotoSizeWithSize != null) {
                    backupImageView.setImage(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, 0, stickerCell.parentObject);
                } else {
                    backupImageView.setImage(ImageLocation.getForDocument(document), "80_80", null, null, null, null, 0, stickerCell.parentObject);
                }
            } else if (svgThumb == null) {
                backupImageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, null, "webp", 0, stickerCell.parentObject);
            } else if (closestPhotoSizeWithSize != null) {
                backupImageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, svgThumb, "webp", 0, stickerCell.parentObject);
            } else {
                backupImageView.setImage(ImageLocation.getForDocument(document), null, null, null, svgThumb, "webp", 0, stickerCell.parentObject);
            }
            stickerCell.sticker = document;
            Drawable background = stickerCell.getBackground();
            if (background != null) {
                background.setAlpha(230);
                background.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_stickersHintPanel, false), PorterDuff.Mode.MULTIPLY));
            }
            if (stickerCell.isPremiumSticker) {
                stickerCell.showPremiumLock = true;
            } else {
                stickerCell.showPremiumLock = false;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) premiumLockIconView.getLayoutParams();
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                int iDp = AndroidUtilities.dp(16.0f);
                layoutParams.width = iDp;
                layoutParams.height = iDp;
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                premiumLockIconView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            } else {
                int iDp2 = AndroidUtilities.dp(24.0f);
                layoutParams.width = iDp2;
                layoutParams.height = iDp2;
                layoutParams.gravity = 81;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                premiumLockIconView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            }
            premiumLockIconView.setLocked(!UserConfig.getInstance(UserConfig.selectedAccount).isPremium());
            AndroidUtilities.updateViewVisibilityAnimated(premiumLockIconView, stickerCell.showPremiumLock, 0.9f, false);
            stickerCell.invalidate();
            stickerCell.setClearsInputField(true);
            return;
        }
        if (i3 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.parentFragment.currentChat;
            if (chat != null) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(LocaleController.getString(R.string.GlobalAttachInlineRestricted));
                    return;
                } else if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    textView.setText(LocaleController.getString(R.string.AttachInlineRestrictedForever));
                    return;
                } else {
                    textView.setText(LocaleController.formatString("AttachInlineRestricted", R.string.AttachInlineRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    return;
                }
            }
            return;
        }
        if (i3 == 5) {
            QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) view;
            ArrayList arrayList = this.quickReplies;
            if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            quickReplyView.set((QuickRepliesController.QuickReply) this.quickReplies.get(i2), this.quickRepliesQuery, false);
            return;
        }
        ArrayList arrayList2 = this.searchResultBotContext;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.searchResultBotContextSwitch;
            boolean z = (tL_inlineBotSwitchPM == null && this.searchResultBotWebViewSwitch == null) ? false : true;
            if (i3 == 2) {
                if (z) {
                    ((BotSwitchCell) view).setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.searchResultBotWebViewSwitch.text);
                    return;
                }
                return;
            } else {
                if (z) {
                    i2--;
                }
                if (i2 < 0 || i2 >= arrayList2.size()) {
                    return;
                }
                ((ContextLinkCell) view).setLink((TLRPC.BotInlineResult) this.searchResultBotContext.get(i2), this.foundContextBot, this.contextMedia, i2 != this.searchResultBotContext.size() - 1, z && i2 == 0, "gif".equals(this.searchingContextUsername));
                return;
            }
        }
        if (i3 == 6) {
            HashtagHint hashtagHint = (HashtagHint) view;
            int i4 = i2 + 2;
            if (i4 == 0) {
                this.topHint = hashtagHint;
            } else {
                this.bottomHint = hashtagHint;
            }
            TLRPC.Chat chat2 = this.chat;
            if (chat2 == null && (chatActivity = this.parentFragment) != null) {
                chat2 = chatActivity.currentChat;
            }
            hashtagHint.set(i4, str, chat2);
            return;
        }
        if (i3 == 7) {
            return;
        }
        MentionCell mentionCell = (MentionCell) view;
        ArrayList arrayList3 = this.searchResultUsernames;
        if (arrayList3 != null) {
            TLObject tLObject = (TLObject) arrayList3.get(i2);
            if (tLObject instanceof TLRPC.User) {
                mentionCell.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                mentionCell.setChat((TLRPC.Chat) tLObject);
            }
        } else {
            ArrayList arrayList4 = this.searchResultHashtags;
            if (arrayList4 == null || i2 < 0 || i2 >= arrayList4.size()) {
                ArrayList arrayList5 = this.searchResultSuggestions;
                if (arrayList5 == null || i2 < 0 || i2 >= arrayList5.size()) {
                    ArrayList arrayList6 = this.searchResultCommands;
                    if (arrayList6 != null && i2 >= 0 && i2 < arrayList6.size()) {
                        ArrayList arrayList7 = this.searchResultCommandsHelp;
                        String str2 = (arrayList7 == null || i2 < 0 || i2 >= arrayList7.size()) ? null : (String) this.searchResultCommandsHelp.get(i2);
                        ArrayList arrayList8 = this.searchResultCommandsUsers;
                        TLRPC.User user = (arrayList8 == null || i2 < 0 || i2 >= arrayList8.size()) ? null : (TLRPC.User) this.searchResultCommandsUsers.get(i2);
                        ArrayList arrayList9 = this.searchResultCommandsEphemeral;
                        if (arrayList9 != null && i2 >= 0 && i2 < arrayList9.size()) {
                            bool = (Boolean) this.searchResultCommandsEphemeral.get(i2);
                        }
                        boolean zBooleanValue = bool.booleanValue();
                        String str3 = (String) this.searchResultCommands.get(i2);
                        mentionCell.resetEmojiSuggestion();
                        BackupImageView backupImageView2 = mentionCell.imageView;
                        if (user != null) {
                            backupImageView2.setVisibility(0);
                            AvatarDrawable avatarDrawable = mentionCell.avatarDrawable;
                            avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                backupImageView2.setImageDrawable(avatarDrawable);
                            } else {
                                backupImageView2.imageReceiver.setForUserOrChat(user, avatarDrawable);
                                backupImageView2.onNewImageSet();
                            }
                        } else {
                            backupImageView2.setVisibility(4);
                        }
                        TextView textView2 = mentionCell.usernameTextView;
                        textView2.setVisibility(0);
                        ArticleViewer.AnonymousClass9 anonymousClass9 = mentionCell.nameTextView;
                        if (zBooleanValue) {
                            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_ephemeral_hidden_14);
                            coloredImageSpan.setColorKey(Theme.key_windowBackgroundWhiteGrayText3);
                            coloredImageSpan.setTopOffset(1);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            anonymousClass9.setText(spannableStringBuilder);
                        } else {
                            anonymousClass9.setText(str3);
                        }
                        textView2.setText(Emoji.replaceEmoji(str2, textView2.getPaint().getFontMetricsInt(), false));
                    }
                } else {
                    mentionCell.setEmojiSuggestion((MediaDataController.KeywordResult) this.searchResultSuggestions.get(i2));
                }
            } else {
                mentionCell.setText((String) this.searchResultHashtags.get(i2));
            }
        }
        mentionCell.setDivider(false);
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View quickReplyView;
        View botSwitchCell;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Context context = this.mContext;
        if (i == 0) {
            MentionCell mentionCell = new MentionCell(context, resourcesProvider);
            mentionCell.setIsDarkTheme(false);
            quickReplyView = mentionCell;
        } else {
            if (i != 1) {
                if (i == 2) {
                    botSwitchCell = new BotSwitchCell(context);
                } else if (i == 3) {
                    TextView textView = new TextView(context);
                    textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
                    botSwitchCell = textView;
                } else if (i != 5) {
                    boolean z = this.stories;
                    if (i == 6) {
                        botSwitchCell = new HashtagHint(context, resourcesProvider, z);
                    } else if (i != 7) {
                        botSwitchCell = new StickerCell(context, resourcesProvider);
                    } else {
                        View anonymousClass2 = new PaymentFormActivity.AnonymousClass2(context, 4);
                        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(z ? Theme.multAlpha(0.15f, -1) : Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider)), Theme.getThemedDrawable(context, R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, resourcesProvider)), 0, 0);
                        combinedDrawable.fullSize = true;
                        anonymousClass2.setBackground(combinedDrawable);
                        quickReplyView = anonymousClass2;
                    }
                } else {
                    quickReplyView = new QuickRepliesActivity.QuickReplyView(context, resourcesProvider, false);
                }
                return new RecyclerListView.Holder(botSwitchCell);
            }
            ContextLinkCell contextLinkCell = new ContextLinkCell(context, null, false);
            contextLinkCell.setDelegate(new MentionsAdapter$$ExternalSyntheticLambda7(this));
            quickReplyView = contextLinkCell;
        }
        botSwitchCell = quickReplyView;
        return new RecyclerListView.Holder(botSwitchCell);
    }

    public final void onDestroy() {
        AnonymousClass2 anonymousClass2 = this.locationProvider;
        if (anonymousClass2 != null) {
            anonymousClass2.stop();
        }
        AnonymousClass4 anonymousClass4 = this.contextQueryRunnable;
        if (anonymousClass4 != null) {
            AndroidUtilities.cancelRunOnUIThread(anonymousClass4);
            this.contextQueryRunnable = null;
        }
        if (this.contextUsernameReqid != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextUsernameReqid, true);
            this.contextUsernameReqid = 0;
        }
        if (this.contextQueryReqid != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
            this.contextQueryReqid = 0;
        }
        this.foundContextBot = null;
        this.searchResultBotContextSwitch = null;
        this.inlineMediaEnabled = true;
        this.searchingContextUsername = null;
        this.searchingContextQuery = null;
        this.noUserName = false;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    public final void onLocationUnavailable() {
        TLRPC.User user = this.foundContextBot;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.lastKnownLocation = location;
        location.setLatitude(-1000.0d);
        this.lastKnownLocation.setLongitude(-1000.0d);
        searchForContextBotResults(true, this.foundContextBot, this.searchingContextQuery, "");
    }

    public final void processFoundUser(TLRPC.User user) {
        ChatActivity chatActivity;
        TLRPC.Chat chat;
        this.contextUsernameReqid = 0;
        this.locationProvider.stop();
        MentionsContainerView.AnonymousClass4 anonymousClass4 = this.delegate;
        if (user == null || !user.bot || user.bot_inline_placeholder == null) {
            this.foundContextBot = null;
            this.searchResultBotContextSwitch = null;
            this.inlineMediaEnabled = true;
        } else {
            this.foundContextBot = user;
            long j = user.id;
            if (j != this.searchResultBotContextSwitchUserId) {
                this.searchResultBotContextSwitch = null;
                this.searchResultBotContextSwitchUserId = j;
            }
            ChatActivity chatActivity2 = this.parentFragment;
            if (chatActivity2 != null && (chat = chatActivity2.currentChat) != null) {
                boolean zCanSendStickers = ChatObject.canSendStickers(chat);
                this.inlineMediaEnabled = zCanSendStickers;
                if (!zCanSendStickers) {
                    notifyDataSetChanged();
                    anonymousClass4.needChangePanelVisibility(true);
                    return;
                }
            }
            if (this.foundContextBot.bot_inline_geo) {
                if (MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("inlinegeo_" + this.foundContextBot.id, false) || (chatActivity = this.parentFragment) == null || chatActivity.getParentActivity() == null) {
                    checkLocationPermissionsOrStart();
                } else {
                    TLRPC.User user2 = this.foundContextBot;
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.parentFragment.getParentActivity(), 0, null);
                    String string = LocaleController.getString(R.string.ShareYouLocationTitle);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), new ChatActivity$$ExternalSyntheticLambda248(this, zArr, user2, 8));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ArticleViewer$$ExternalSyntheticLambda16(17, this, zArr));
                    this.parentFragment.showDialog(alertDialog, new VoIPFragment$$ExternalSyntheticLambda16(3, this, zArr));
                }
            }
        }
        if (this.foundContextBot == null) {
            this.noUserName = true;
            this.searchResultBotContextSwitch = null;
        } else {
            if (anonymousClass4 != null) {
                MentionsContainerView.this.onContextSearch(true);
            }
            searchForContextBotResults(true, this.foundContextBot, this.searchingContextQuery, "");
        }
    }

    public final void searchForContextBot(String str, String str2) {
        TLRPC.User user;
        MentionsContainerView mentionsContainerView;
        String str3;
        String str4;
        String str5;
        TLRPC.User user2 = this.foundContextBot;
        if (user2 == null || (str4 = user2.username) == null || !str4.equals(str) || (str5 = this.searchingContextQuery) == null || !str5.equals(str2)) {
            TLRPC.User user3 = this.foundContextBot;
            MentionsContainerView.AnonymousClass4 anonymousClass4 = this.delegate;
            if (user3 != null) {
                if (!this.inlineMediaEnabled && str != null && str2 != null) {
                    return;
                } else {
                    anonymousClass4.needChangePanelVisibility(false);
                }
            }
            AnonymousClass4 anonymousClass5 = this.contextQueryRunnable;
            if (anonymousClass5 != null) {
                AndroidUtilities.cancelRunOnUIThread(anonymousClass5);
                this.contextQueryRunnable = null;
            }
            if (TextUtils.isEmpty(str) || !((str3 = this.searchingContextUsername) == null || str3.equals(str))) {
                if (this.contextUsernameReqid != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextUsernameReqid, true);
                    this.contextUsernameReqid = 0;
                }
                if (this.contextQueryReqid != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
                    this.contextQueryReqid = 0;
                }
                this.foundContextBot = null;
                this.searchResultBotContextSwitch = null;
                this.inlineMediaEnabled = true;
                this.searchingContextUsername = null;
                this.searchingContextQuery = null;
                this.locationProvider.stop();
                this.noUserName = false;
                if (anonymousClass4 != null) {
                    MentionsContainerView.this.onContextSearch(false);
                }
                if (str != null && str.length() != 0) {
                    if (str2 == null) {
                        if (anonymousClass4 != null) {
                            user = this.foundContextBot;
                            mentionsContainerView = MentionsContainerView.this;
                            if (user != null) {
                                mentionsContainerView.onContextSearch(true);
                            } else if (str.equals("gif")) {
                                this.searchingContextUsername = "gif";
                                mentionsContainerView.onContextSearch(false);
                            }
                        }
                        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
                        this.searchingContextQuery = str2;
                        AnonymousClass4 anonymousClass6 = new AnonymousClass4(str2, str, messagesController, messagesStorage);
                        this.contextQueryRunnable = anonymousClass6;
                        AndroidUtilities.runOnUIThread(anonymousClass6, 400L);
                        return;
                    }
                    if (this.contextQueryReqid != 0) {
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
                        this.contextQueryReqid = 0;
                    }
                    this.searchingContextQuery = null;
                    if (anonymousClass4 != null) {
                        MentionsContainerView.this.onContextSearch(false);
                    }
                }
            } else {
                if (str2 == null) {
                    if (anonymousClass4 != null) {
                        user = this.foundContextBot;
                        mentionsContainerView = MentionsContainerView.this;
                        if (user != null) {
                            mentionsContainerView.onContextSearch(true);
                        } else if (str.equals("gif")) {
                            this.searchingContextUsername = "gif";
                            mentionsContainerView.onContextSearch(false);
                        }
                    }
                    MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
                    MessagesStorage messagesStorage2 = MessagesStorage.getInstance(this.currentAccount);
                    this.searchingContextQuery = str2;
                    AnonymousClass4 anonymousClass7 = new AnonymousClass4(str2, str, messagesController2, messagesStorage2);
                    this.contextQueryRunnable = anonymousClass7;
                    AndroidUtilities.runOnUIThread(anonymousClass7, 400L);
                    return;
                }
                if (this.contextQueryReqid != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
                    this.contextQueryReqid = 0;
                }
                this.searchingContextQuery = null;
                if (anonymousClass4 != null) {
                    MentionsContainerView.this.onContextSearch(false);
                }
            }
        }
    }

    public final void searchForContextBotResults(boolean z, TLRPC.User user, String str, String str2) {
        Location location;
        if (this.contextQueryReqid != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
            this.contextQueryReqid = 0;
        }
        if (!this.inlineMediaEnabled || !this.allowBots) {
            MentionsContainerView.AnonymousClass4 anonymousClass4 = this.delegate;
            if (anonymousClass4 != null) {
                MentionsContainerView.this.onContextSearch(false);
                return;
            }
            return;
        }
        if (str == null || user == null) {
            this.searchingContextQuery = null;
            return;
        }
        if (user.bot_inline_geo && this.lastKnownLocation == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.dialog_id);
        sb.append("_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(this.dialog_id);
        sb.append("_");
        sb.append(user.id);
        sb.append("_");
        sb.append((!user.bot_inline_geo || this.lastKnownLocation.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.lastKnownLocation.getLongitude() + this.lastKnownLocation.getLatitude()));
        String string = sb.toString();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        MentionsAdapter$$ExternalSyntheticLambda9 mentionsAdapter$$ExternalSyntheticLambda9 = new MentionsAdapter$$ExternalSyntheticLambda9(this, str, z, user, str2, messagesStorage, string);
        long j = user.id;
        if (j != this.searchResultBotContextSwitchUserId) {
            this.searchResultBotContextSwitch = null;
            this.searchResultBotContextSwitchUserId = j;
        }
        if (z) {
            messagesStorage.getBotCache(string, mentionsAdapter$$ExternalSyntheticLambda9);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.lastKnownLocation) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLongitude());
        }
        if (DialogObject.isEncryptedDialog(this.dialog_id)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialog_id);
        }
        this.contextQueryReqid = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, mentionsAdapter$$ExternalSyntheticLambda9, 2);
    }

    public final void searchUsernameOrHashtag(CharSequence charSequence, int i, ArrayList arrayList, boolean z, boolean z2) {
        boolean z3;
        String str;
        boolean z4;
        ArrayList arrayList2;
        StringBuilder sb;
        int i2;
        String str2;
        ChatActivity chatActivity;
        byte b;
        int i3;
        String strSubstring;
        String strSubstring2;
        MessagesController messagesController;
        String str3;
        SearchAdapterHelper searchAdapterHelper;
        StringBuilder sb2;
        int i4;
        ?? r11;
        char cCharAt;
        String strSubstring3;
        int i5;
        boolean z5;
        int i6;
        HashtagHint hashtagHint;
        HashtagHint hashtagHint2;
        String[] currentKeyboardLanguage;
        boolean z6;
        ArrayList arrayList3;
        int i7;
        ?? r6;
        boolean z7;
        ArrayList arrayList4;
        TL_bots.BotInfo botInfo;
        int i8;
        TLRPC.BotCommand botCommand;
        String str4;
        ArrayList arrayList5;
        int i9;
        boolean z8;
        SearchAdapterHelper.HashtagObject hashtagObject;
        String str5;
        String lowerCase;
        boolean z9;
        ArrayList arrayList6;
        final LongSparseArray longSparseArray;
        ArrayList arrayList7;
        LinkedHashMap linkedHashMap;
        int size;
        int i10;
        ArrayList arrayList8;
        ChatActivity chatActivity2;
        TLRPC.ChatFull chatFull;
        long j;
        TLRPC.User currentUser;
        TLRPC.Chat chat;
        ArrayList<TLRPC.Dialog> allDialogs;
        int i11;
        TLRPC.Chat chat2;
        String str6;
        long j2;
        TLRPC.User user;
        String publicUsername;
        long j3;
        TLRPC.ChatFull chatFull2;
        int i12;
        TLRPC.Chat chat3;
        long j4;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.Chat chat4;
        TLRPC.User user2;
        String str7;
        String str8;
        String publicUsername2;
        TLRPC.Chat chat5;
        long j5;
        Object obj;
        int i13;
        int i14;
        TLRPC.User user3;
        String publicUsername3;
        int i15;
        long fromChatId;
        int i16;
        int i17;
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        int length;
        CharSequence charSequenceConcat;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        String str9 = "";
        String string = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat6 = this.chat;
        ChatActivity chatActivity3 = this.parentFragment;
        if (chatActivity3 != null) {
            chat6 = chatActivity3.currentChat;
            chatActivity3.getCurrentUser();
        }
        TLRPC.Chat chat7 = chat6;
        RemoteUtils$$ExternalSyntheticLambda2 remoteUtils$$ExternalSyntheticLambda2 = this.cancelDelayRunnable;
        if (remoteUtils$$ExternalSyntheticLambda2 != null) {
            AndroidUtilities.cancelRunOnUIThread(remoteUtils$$ExternalSyntheticLambda2);
            this.cancelDelayRunnable = null;
        }
        if (this.channelReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.channelReqId, true);
            this.channelReqId = 0;
        }
        AnonymousClass7 anonymousClass7 = this.searchGlobalRunnable;
        if (anonymousClass7 != null) {
            AndroidUtilities.cancelRunOnUIThread(anonymousClass7);
            this.searchGlobalRunnable = null;
        }
        Theme$$ExternalSyntheticLambda4 theme$$ExternalSyntheticLambda4 = this.checkAgainRunnable;
        if (theme$$ExternalSyntheticLambda4 != null) {
            AndroidUtilities.cancelRunOnUIThread(theme$$ExternalSyntheticLambda4);
            this.checkAgainRunnable = null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(string);
        MentionsContainerView.AnonymousClass4 anonymousClass4 = this.delegate;
        if (zIsEmpty || string.length() > MessagesController.getInstance(this.currentAccount).getMaxMessageLength()) {
            searchForContextBot(null, null);
            anonymousClass4.needChangePanelVisibility(false);
            this.lastText = null;
            this.lastSticker = null;
            this.stickers = null;
            this.stickersMap = null;
            notifyDataSetChanged();
            this.visibleByStickersSearch = false;
            if (this.lastReqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.lastReqId, true);
                this.lastReqId = 0;
            }
            EmojiView.AnonymousClass29 anonymousClass29 = this.mentionsStickersActionTracker;
            if (anonymousClass29 != null) {
                anonymousClass29.checkVisibility();
                return;
            }
            return;
        }
        int i20 = string.length() > 0 ? i - 1 : i;
        this.lastText = null;
        this.lastUsernameOnly = z;
        this.lastForSearch = z2;
        StringBuilder sb3 = new StringBuilder();
        if (!z && string.length() > 0) {
            z3 = string.length() <= 14;
            if (z3) {
                length = string.length();
                charSequenceConcat = string;
                i18 = 0;
                while (i18 < length) {
                    cCharAt2 = charSequenceConcat.charAt(i18);
                    i19 = length - 1;
                    if (i18 < i19) {
                        cCharAt3 = charSequenceConcat.charAt(i18 + 1);
                    } else {
                        cCharAt3 = 0;
                    }
                    if (i18 < i19 || cCharAt2 != 55356 || cCharAt3 < 57339 || cCharAt3 > 57343) {
                        if (cCharAt2 == 65039) {
                            charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i18), charSequenceConcat.subSequence(i18 + 1, charSequenceConcat.length()));
                            length--;
                        }
                        i18++;
                    } else {
                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i18), charSequenceConcat.subSequence(i18 + 2, charSequenceConcat.length()));
                        length -= 2;
                    }
                    i18--;
                    i18++;
                }
                this.lastSticker = charSequenceConcat.toString().trim();
                str = string;
            } else {
                str = "";
            }
            if (z3 || !(Emoji.isValidEmoji(str) || Emoji.isValidEmoji(this.lastSticker))) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4 && (charSequence instanceof Spanned)) {
                animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class);
                if (animatedEmojiSpanArr != null || animatedEmojiSpanArr.length == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (!this.allowStickers && z4 && (chat7 == null || ChatObject.canSendStickers(chat7))) {
                ArrayList arrayList9 = this.stickersToLoad;
                arrayList9.clear();
                int i21 = SharedConfig.suggestStickers;
                if (i21 == 2 || !z4) {
                    if (this.visibleByStickersSearch && i21 == 2) {
                        this.visibleByStickersSearch = false;
                        anonymousClass4.needChangePanelVisibility(false);
                        notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                this.stickers = null;
                this.stickersMap = null;
                if (this.lastReqId != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.lastReqId, true);
                    this.lastReqId = 0;
                }
                boolean z10 = MessagesController.getInstance(this.currentAccount).suggestStickersApiOnly;
                if (z10) {
                    arrayList2 = arrayList;
                    sb = sb3;
                    i2 = i;
                } else {
                    arrayList2 = arrayList;
                    sb = sb3;
                    i2 = i;
                    this.checkAgainRunnable = new Theme$$ExternalSyntheticLambda4(this, charSequence, i2, arrayList2, z, z2);
                    MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
                    MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
                    final ArrayList<TLRPC.Document> recentStickersNoCopy = MediaDataController.getInstance(this.currentAccount).getRecentStickersNoCopy(0);
                    final ArrayList<TLRPC.Document> recentStickersNoCopy2 = MediaDataController.getInstance(this.currentAccount).getRecentStickersNoCopy(2);
                    int iMin = Math.min(20, recentStickersNoCopy.size());
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < iMin) {
                        TLRPC.Document document = recentStickersNoCopy.get(i22);
                        String str10 = this.lastSticker;
                        int size2 = document.attributes.size();
                        int i24 = iMin;
                        int i25 = 0;
                        while (true) {
                            i17 = i22;
                            if (i25 < size2) {
                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i25);
                                int i26 = i25;
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                                    String str11 = documentAttribute.alt;
                                    if (str11 != null && str11.contains(str10)) {
                                        addStickerToResult(document, "recent");
                                        int i27 = i23 + 1;
                                        if (i27 < 5) {
                                            i23 = i27;
                                            break;
                                        }
                                        break;
                                    }
                                } else {
                                    i25 = i26 + 1;
                                    i22 = i17;
                                }
                            }
                            break;
                        }
                        i22 = i17 + 1;
                        iMin = i24;
                    }
                    int size3 = recentStickersNoCopy2.size();
                    int i28 = 0;
                    while (i28 < size3) {
                        TLRPC.Document document2 = recentStickersNoCopy2.get(i28);
                        String str12 = this.lastSticker;
                        int size4 = document2.attributes.size();
                        int i29 = size3;
                        int i30 = 0;
                        while (true) {
                            i16 = i28;
                            if (i30 >= size4) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute2 = document2.attributes.get(i30);
                            int i31 = i30;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) {
                                String str13 = documentAttribute2.alt;
                                if (str13 != null && str13.contains(str12)) {
                                    addStickerToResult(document2, "fav");
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                            }
                            i30 = i31 + 1;
                            i28 = i16;
                        }
                        i28 = i16 + 1;
                        size3 = i29;
                    }
                    MediaDataController.getInstance(this.currentAccount).checkStickers(0);
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(this.currentAccount).getAllStickers();
                    ArrayList arrayList10 = allStickers != null ? allStickers.get(this.lastSticker) : null;
                    if (arrayList10 != null && !arrayList10.isEmpty()) {
                        addStickersToResult(null, arrayList10);
                    }
                    ArrayList arrayList11 = this.stickers;
                    if (arrayList11 != null) {
                        Collections.sort(arrayList11, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                StickerResult stickerResult = (StickerResult) obj2;
                                StickerResult stickerResult2 = (StickerResult) obj3;
                                boolean zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(stickerResult.sticker, true);
                                if (zIsAnimatedStickerDocument != MessageObject.isAnimatedStickerDocument(stickerResult2.sticker, true)) {
                                    return zIsAnimatedStickerDocument ? -1 : 1;
                                }
                                int index = getIndex(stickerResult);
                                int index2 = getIndex(stickerResult2);
                                if (index > index2) {
                                    return -1;
                                }
                                return index < index2 ? 1 : 0;
                            }

                            public final int getIndex(StickerResult stickerResult) {
                                int i32 = 0;
                                int i33 = 0;
                                while (true) {
                                    ArrayList arrayList12 = recentStickersNoCopy2;
                                    if (i33 >= arrayList12.size()) {
                                        while (true) {
                                            ArrayList arrayList13 = recentStickersNoCopy;
                                            if (i32 >= Math.min(20, arrayList13.size())) {
                                                return -1;
                                            }
                                            if (((TLRPC.Document) arrayList13.get(i32)).id == stickerResult.sticker.id) {
                                                return (arrayList13.size() - i32) + 1000000;
                                            }
                                            i32++;
                                        }
                                    } else {
                                        if (((TLRPC.Document) arrayList12.get(i33)).id == stickerResult.sticker.id) {
                                            return i33 + 2000000;
                                        }
                                        i33++;
                                    }
                                }
                            }
                        });
                    }
                }
                if (SharedConfig.suggestStickers == 0 || z10) {
                    String str14 = this.lastSticker;
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = str;
                    tL_messages_getStickers.hash = 0L;
                    this.lastReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new ChatActivity$$ExternalSyntheticLambda208(8, this, str14));
                }
                ArrayList arrayList12 = this.stickers;
                if (arrayList12 != null && !arrayList12.isEmpty()) {
                    if (SharedConfig.suggestStickers != 0 || this.stickers.size() >= 5) {
                        checkStickerFilesExistAndDownload();
                        anonymousClass4.needChangePanelVisibility(arrayList9.isEmpty());
                        this.visibleByStickersSearch = true;
                    } else {
                        anonymousClass4.needChangePanelVisibility(false);
                        this.visibleByStickersSearch = false;
                    }
                    notifyDataSetChanged();
                } else if (this.visibleByStickersSearch) {
                    anonymousClass4.needChangePanelVisibility(false);
                    this.visibleByStickersSearch = false;
                }
                b = 4;
                str2 = null;
            } else {
                arrayList2 = arrayList;
                sb = sb3;
                i2 = i;
                if (z && this.needBotContext && string.charAt(0) == '@') {
                    int iIndexOf = string.indexOf(32);
                    int length2 = string.length();
                    if (iIndexOf > 0) {
                        i3 = 1;
                        strSubstring = string.substring(1, iIndexOf);
                        strSubstring2 = string.substring(iIndexOf + 1);
                    } else if (string.charAt(length2 - 1) == 't' && string.charAt(length2 - 2) == 'o' && string.charAt(length2 - 3) == 'b') {
                        i3 = 1;
                        strSubstring = string.substring(1);
                        strSubstring2 = "";
                    } else {
                        i3 = 1;
                        searchForContextBot(null, null);
                        strSubstring = null;
                        strSubstring2 = null;
                    }
                    if (strSubstring != null && strSubstring.length() >= i3) {
                        int i32 = 1;
                        while (true) {
                            if (i32 >= strSubstring.length()) {
                                str9 = strSubstring;
                                break;
                            }
                            char cCharAt4 = strSubstring.charAt(i32);
                            if ((cCharAt4 < '0' || cCharAt4 > '9') && ((cCharAt4 < 'a' || cCharAt4 > 'z') && ((cCharAt4 < 'A' || cCharAt4 > 'Z') && cCharAt4 != '_'))) {
                                break;
                            } else {
                                i32++;
                            }
                        }
                    }
                    searchForContextBot(str9, strSubstring2);
                    str2 = null;
                } else if (this.allowStickers || (chatActivity = this.parentFragment) == null || chatActivity.currentEncryptedChat != null || (!(chat7 == null || ChatObject.canSendStickers(chat7)) || string.trim().length() < 2 || string.trim().indexOf(32) >= 0)) {
                    str2 = null;
                    searchForContextBot(null, null);
                } else {
                    str2 = null;
                    searchForContextBot(null, null);
                }
                b = -1;
            }
            if (this.foundContextBot != null) {
                return;
            }
            messagesController = MessagesController.getInstance(this.currentAccount);
            str3 = this.hintHashtag;
            this.hintHashtag = str2;
            searchAdapterHelper = this.searchAdapterHelper;
            if (z) {
                sb2 = sb;
                i4 = i20;
                while (true) {
                    if (i4 >= 0) {
                        if (i4 >= string.length()) {
                            cCharAt = string.charAt(i4);
                            if (i4 != 0) {
                                i6 = i4 - 1;
                                if (string.charAt(i6) != ' ' || string.charAt(i6) == '\n' || cCharAt == ':') {
                                    if (cCharAt == '@') {
                                        z5 = this.searchInDialogs;
                                        if (!z5 || this.needUsernames || (this.needBotContext && i4 == 0)) {
                                            if (z5 && this.info == null && i4 != 0) {
                                                this.lastText = string;
                                                this.lastPosition = i2;
                                                this.messages = arrayList2;
                                                anonymousClass4.needChangePanelVisibility(false);
                                                return;
                                            }
                                            this.resultStartPosition = i4;
                                            this.resultLength = sb2.length() + 1;
                                            b = 0;
                                            r11 = 0;
                                        }
                                    } else if (cCharAt == '#') {
                                        if (ChatObject.isChannelAndNotMegaGroup(chat7) && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat7))) {
                                            strSubstring3 = string.substring(i4);
                                            this.hintHashtag = strSubstring3;
                                            if (strSubstring3.length() >= 4 || !this.hintHashtag.matches("^[#$][\\p{L}_-]+$")) {
                                                this.hintHashtag = null;
                                            }
                                        }
                                        if (!searchAdapterHelper.hashtagsLoadedFromDb) {
                                            MessagesStorage.getInstance(searchAdapterHelper.currentAccount).getStorageQueue().postRunnable(new SearchAdapterHelper$$ExternalSyntheticLambda4(searchAdapterHelper, 1));
                                            this.lastText = string;
                                            this.lastPosition = i2;
                                            this.messages = arrayList2;
                                            return;
                                        }
                                        this.resultStartPosition = i4;
                                        this.resultLength = sb2.length() + 1;
                                        sb2.insert(0, cCharAt);
                                        b = 1;
                                    } else if (i4 != 0 && this.botInfo != null && cCharAt == '/') {
                                        this.resultStartPosition = i4;
                                        this.resultLength = sb2.length() + 1;
                                        b = 2;
                                    } else if (cCharAt == ':' && sb2.length() > 0) {
                                        if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                            i5 = 1;
                                            if (sb2.length() > 1) {
                                            }
                                        } else {
                                            i5 = 1;
                                        }
                                        this.resultStartPosition = i4;
                                        this.resultLength = sb2.length() + i5;
                                        b = 3;
                                    }
                                }
                                sb2.insert(0, cCharAt);
                            } else {
                                if (cCharAt == '@') {
                                    z5 = this.searchInDialogs;
                                    if (!z5) {
                                    }
                                    if (z5) {
                                    }
                                    this.resultStartPosition = i4;
                                    this.resultLength = sb2.length() + 1;
                                    b = 0;
                                    r11 = 0;
                                } else if (cCharAt == '#') {
                                    if (ChatObject.isChannelAndNotMegaGroup(chat7)) {
                                        strSubstring3 = string.substring(i4);
                                        this.hintHashtag = strSubstring3;
                                        if (strSubstring3.length() >= 4) {
                                            this.hintHashtag = null;
                                        } else {
                                            this.hintHashtag = null;
                                        }
                                    }
                                    if (!searchAdapterHelper.hashtagsLoadedFromDb) {
                                        MessagesStorage.getInstance(searchAdapterHelper.currentAccount).getStorageQueue().postRunnable(new SearchAdapterHelper$$ExternalSyntheticLambda4(searchAdapterHelper, 1));
                                        this.lastText = string;
                                        this.lastPosition = i2;
                                        this.messages = arrayList2;
                                        return;
                                    }
                                    this.resultStartPosition = i4;
                                    this.resultLength = sb2.length() + 1;
                                    sb2.insert(0, cCharAt);
                                    b = 1;
                                } else if (i4 != 0) {
                                    if (cCharAt == ':') {
                                        if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                            i5 = 1;
                                            if (sb2.length() > 1) {
                                            }
                                        } else {
                                            i5 = 1;
                                        }
                                        this.resultStartPosition = i4;
                                        this.resultLength = sb2.length() + i5;
                                        b = 3;
                                    }
                                } else if (cCharAt == ':') {
                                    if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                        i5 = 1;
                                        if (sb2.length() > 1) {
                                        }
                                    } else {
                                        i5 = 1;
                                    }
                                    this.resultStartPosition = i4;
                                    this.resultLength = sb2.length() + i5;
                                    b = 3;
                                }
                                sb2.insert(0, cCharAt);
                            }
                        }
                        i4--;
                    } else {
                        r11 = 0;
                        i4 = -1;
                    }
                    RecyclerView.AdapterDataObservable adapterDataObservable = this.mObservable;
                    if (str3 != null && this.hintHashtag != null) {
                        adapterDataObservable.notifyItemRangeInserted(r11, 2);
                    } else if (str3 == null && this.hintHashtag == null) {
                        adapterDataObservable.notifyItemRangeRemoved(r11, 2);
                    } else {
                        hashtagHint = this.topHint;
                        if (hashtagHint != 0) {
                            hashtagHint.set(r11, this.hintHashtag, chat7);
                        }
                        hashtagHint2 = this.bottomHint;
                        if (hashtagHint2 != null) {
                            hashtagHint2.set(1, this.hintHashtag, chat7);
                        }
                    }
                    if (b == -1) {
                        this.contextMedia = r11;
                        this.searchResultBotContext = null;
                        anonymousClass4.needChangePanelVisibility(r11);
                        return;
                    }
                    if (b == 0) {
                        if (b == 1) {
                            ArrayList arrayList13 = new ArrayList();
                            String lowerCase2 = sb2.toString().toLowerCase();
                            arrayList5 = searchAdapterHelper.hashtags;
                            for (i9 = 0; i9 < arrayList5.size(); i9++) {
                                hashtagObject = (SearchAdapterHelper.HashtagObject) arrayList5.get(i9);
                                if (hashtagObject == null && (str5 = hashtagObject.hashtag) != null && str5.startsWith(lowerCase2)) {
                                    arrayList13.add(hashtagObject.hashtag);
                                }
                            }
                            this.searchResultHashtags = arrayList13;
                            this.stickers = null;
                            this.searchResultUsernames = null;
                            this.searchResultUsernamesMap = null;
                            this.quickReplies = null;
                            this.searchResultCommands = null;
                            this.searchResultCommandsEphemeral = null;
                            this.searchResultCommandsHelp = null;
                            this.searchResultCommandsUsers = null;
                            this.searchResultSuggestions = null;
                            this.contextMedia = false;
                            this.searchResultBotContext = null;
                            notifyDataSetChanged();
                            if (this.searchResultHashtags.isEmpty() || this.hintHashtag != null) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            anonymousClass4.needChangePanelVisibility(z8);
                            return;
                        }
                        if (b == 2) {
                            if (b == 3) {
                                if (b == 4) {
                                    this.searchResultHashtags = null;
                                    this.searchResultUsernames = null;
                                    this.searchResultUsernamesMap = null;
                                    this.searchResultSuggestions = null;
                                    this.searchResultCommands = null;
                                    this.searchResultCommandsEphemeral = null;
                                    this.quickReplies = null;
                                    this.searchResultCommandsHelp = null;
                                    this.searchResultCommandsUsers = null;
                                    return;
                                }
                                return;
                            }
                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                            if (!Arrays.equals(currentKeyboardLanguage, this.lastSearchKeyboardLanguage)) {
                                MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                            }
                            this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                            String[] strArr = this.lastSearchKeyboardLanguage;
                            String string2 = sb2.toString();
                            MentionsAdapter$$ExternalSyntheticLambda7 mentionsAdapter$$ExternalSyntheticLambda7 = new MentionsAdapter$$ExternalSyntheticLambda7(this);
                            if (SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(this.currentAccount).isPremium()) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            mediaDataController.getEmojiSuggestions(strArr, string2, false, mentionsAdapter$$ExternalSyntheticLambda7, z6);
                            return;
                        }
                        arrayList3 = new ArrayList();
                        ArrayList arrayList14 = new ArrayList();
                        ArrayList arrayList15 = new ArrayList();
                        ArrayList arrayList16 = new ArrayList();
                        String lowerCase3 = sb2.toString().toLowerCase();
                        for (i7 = 0; i7 < this.botInfo.size(); i7++) {
                            botInfo = (TL_bots.BotInfo) this.botInfo.valueAt(i7);
                            for (i8 = 0; i8 < botInfo.commands.size(); i8++) {
                                botCommand = botInfo.commands.get(i8);
                                if (botCommand == null && (str4 = botCommand.command) != null && str4.startsWith(lowerCase3)) {
                                    arrayList3.add("/" + botCommand.command);
                                    arrayList14.add(botCommand.description);
                                    arrayList15.add(messagesController.getUser(Long.valueOf(botInfo.user_id)));
                                    arrayList16.add(Boolean.valueOf(botCommand.ephemeral));
                                }
                            }
                        }
                        if (this.parentFragment != null || DialogObject.isEncryptedDialog(this.dialog_id)) {
                            r6 = 0;
                            this.quickRepliesQuery = null;
                            this.quickReplies = null;
                        } else {
                            ChatActivity chatActivity4 = this.parentFragment;
                            if (chatActivity4.chatMode != 0 || chatActivity4.getCurrentUser() == null || this.parentFragment.getCurrentUser().bot || UserObject.isReplyUser(this.parentFragment.getCurrentUser()) || UserObject.isService(this.parentFragment.getCurrentUser().id)) {
                                r6 = 0;
                                this.quickRepliesQuery = null;
                                this.quickReplies = null;
                            } else {
                                QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(this.currentAccount);
                                quickRepliesController.load(null, true);
                                this.quickRepliesQuery = lowerCase3;
                                this.quickReplies = new ArrayList();
                                int i33 = 0;
                                while (true) {
                                    ArrayList arrayList17 = quickRepliesController.replies;
                                    if (i33 >= arrayList17.size()) {
                                        break;
                                    }
                                    QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) arrayList17.get(i33);
                                    if (!QuickRepliesController.isSpecial(quickReply.name)) {
                                        String lowerCase4 = quickReply.name.toLowerCase();
                                        if (lowerCase4.startsWith(lowerCase3) || AndroidUtilities.translitSafe(lowerCase4).startsWith(lowerCase3)) {
                                            this.quickReplies.add(quickReply);
                                        }
                                    }
                                    i33++;
                                }
                                r6 = 0;
                            }
                        }
                        this.searchResultHashtags = r6;
                        this.stickers = r6;
                        this.searchResultUsernames = r6;
                        this.searchResultUsernamesMap = r6;
                        this.searchResultSuggestions = r6;
                        this.searchResultCommands = arrayList3;
                        this.searchResultCommandsHelp = arrayList14;
                        this.searchResultCommandsUsers = arrayList15;
                        this.searchResultCommandsEphemeral = arrayList16;
                        this.contextMedia = false;
                        this.searchResultBotContext = r6;
                        notifyDataSetChanged();
                        if (arrayList3.isEmpty() || !((arrayList4 = this.quickReplies) == null || arrayList4.isEmpty())) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        anonymousClass4.needChangePanelVisibility(z7);
                        return;
                    }
                    this.contextMedia = r11;
                    this.searchResultBotContext = null;
                    final ArrayList arrayList18 = new ArrayList();
                    if (arrayList2 != null) {
                        for (i15 = 0; i15 < Math.min(100, arrayList2.size()); i15++) {
                            fromChatId = ((MessageObject) arrayList2.get(i15)).getFromChatId();
                            if (fromChatId <= 0 && !arrayList18.contains(Long.valueOf(fromChatId))) {
                                arrayList18.add(Long.valueOf(fromChatId));
                            }
                        }
                    }
                    lowerCase = sb2.toString().toLowerCase();
                    if (lowerCase.indexOf(32) >= 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    arrayList6 = new ArrayList();
                    LongSparseArray longSparseArray2 = new LongSparseArray();
                    int i34 = i4;
                    longSparseArray = new LongSparseArray();
                    arrayList7 = new ArrayList();
                    arrayList7.addAll(MediaDataController.getInstance(this.currentAccount).inlineBots);
                    if (chat7 != null || (!ChatObject.isMonoForum(chat7) && !ChatObject.isChannelAndNotMegaGroup(chat7))) {
                        arrayList7.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
                    }
                    List.EL.sort(arrayList7, new Theme$$ExternalSyntheticLambda5(27));
                    linkedHashMap = new LinkedHashMap();
                    size = arrayList7.size();
                    i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList7.get(i10);
                        i10++;
                        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj2;
                        Map.EL.putIfAbsent(linkedHashMap, Long.valueOf(DialogObject.getPeerDialogId(tL_topPeer.peer)), tL_topPeer);
                    }
                    arrayList8 = new ArrayList(linkedHashMap.values());
                    if (!z && this.needBotContext && i34 == 0 && !arrayList8.isEmpty()) {
                        i14 = 0;
                        for (i13 = 0; i13 < arrayList8.size(); i13++) {
                            user3 = messagesController.getUser(Long.valueOf(((TLRPC.TL_topPeer) arrayList8.get(i13)).peer.user_id));
                            if (user3 == null) {
                                publicUsername3 = UserObject.getPublicUsername(user3);
                                if (TextUtils.isEmpty(publicUsername3) && (lowerCase.length() == 0 || publicUsername3.toLowerCase().startsWith(lowerCase))) {
                                    arrayList6.add(user3);
                                    longSparseArray2.put(user3, user3.id);
                                    longSparseArray.put(user3, user3.id);
                                    i14++;
                                }
                                if (i14 == 5) {
                                    break;
                                }
                            }
                        }
                    }
                    chatActivity2 = this.parentFragment;
                    if (chatActivity2 != null) {
                        chat7 = chatActivity2.currentChat;
                        j = chatActivity2.threadMessageId;
                    } else {
                        chatFull = this.info;
                        if (chatFull != null) {
                            chat7 = messagesController.getChat(Long.valueOf(chatFull.id));
                        }
                        j = 0;
                    }
                    currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                    if (chat7 != null && (chatFull2 = this.info) != null && chatFull2.participants != null && (!ChatObject.isChannel(chat7) || chat7.megagroup)) {
                        i12 = -2;
                        while (i12 < this.info.participants.participants.size()) {
                            if (i12 != -2) {
                                chat3 = chat7;
                                if (i12 == -1) {
                                    j4 = j;
                                    chatParticipant = this.info.participants.participants.get(i12);
                                    if (currentUser != null) {
                                        chat4 = chat3;
                                        if (chatParticipant.user_id != currentUser.id) {
                                        }
                                        chat5 = chat4;
                                        i12 = i12;
                                    } else {
                                        chat4 = chat3;
                                    }
                                    user2 = messagesController.getUser(Long.valueOf(chatParticipant.user_id));
                                    if (user2 != null && !UserObject.isUserSelf(user2) && longSparseArray2.indexOfKey(user2.id) < 0) {
                                        if (lowerCase.length() == 0 || user2.deleted) {
                                            str7 = user2.first_name;
                                            str8 = user2.last_name;
                                            publicUsername2 = UserObject.getPublicUsername(user2);
                                            chat5 = chat4;
                                            j5 = user2.id;
                                            obj = user2;
                                            if (TextUtils.isEmpty(publicUsername2)) {
                                                arrayList6.add(obj);
                                                longSparseArray.put(obj, j5);
                                            } else {
                                                arrayList6.add(obj);
                                                longSparseArray.put(obj, j5);
                                            }
                                        } else {
                                            arrayList6.add(user2);
                                        }
                                    }
                                    chat5 = chat4;
                                    i12 = i12;
                                } else if (!z2) {
                                    chat5 = chat3;
                                    j4 = j;
                                    i12 = i12;
                                } else if (lowerCase.length() == 0) {
                                    chat7 = chat3;
                                    arrayList6.add(chat7);
                                    j4 = j;
                                    chat5 = chat7;
                                    i12 = i12;
                                } else {
                                    str7 = chat3.title;
                                    publicUsername2 = ChatObject.getPublicUsername(chat3);
                                    j4 = j;
                                    chat5 = chat3;
                                    str8 = null;
                                    j5 = -chat3.id;
                                    obj = chat5;
                                    if (TextUtils.isEmpty(publicUsername2)) {
                                        arrayList6.add(obj);
                                        longSparseArray.put(obj, j5);
                                    } else {
                                        arrayList6.add(obj);
                                        longSparseArray.put(obj, j5);
                                    }
                                }
                            } else if (currentUser == null && z) {
                                str7 = currentUser.first_name;
                                String str15 = currentUser.last_name;
                                publicUsername2 = UserObject.getPublicUsername(currentUser);
                                chat5 = chat7;
                                j4 = j;
                                obj = currentUser;
                                j5 = currentUser.id;
                                str8 = str15;
                                if ((TextUtils.isEmpty(publicUsername2) && publicUsername2.toLowerCase().startsWith(lowerCase)) || ((!TextUtils.isEmpty(str7) && str7.toLowerCase().startsWith(lowerCase)) || ((!TextUtils.isEmpty(str8) && str8.toLowerCase().startsWith(lowerCase)) || (z9 && ContactsController.formatName(str7, str8).toLowerCase().startsWith(lowerCase))))) {
                                    arrayList6.add(obj);
                                    longSparseArray.put(obj, j5);
                                }
                            } else {
                                j4 = j;
                                chat5 = chat7;
                                i12 = i12;
                            }
                            i12++;
                            j = j4;
                            chat7 = chat5;
                        }
                    }
                    long j6 = j;
                    chat = chat7;
                    if (this.searchInDialogs) {
                        allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                        for (i11 = 0; i11 < allDialogs.size(); i11++) {
                            if (allDialogs.get(i11).id > 0) {
                                user = messagesController.getUser(Long.valueOf(allDialogs.get(i11).id));
                                if (user != null && !UserObject.isUserSelf(user) && longSparseArray2.indexOfKey(user.id) < 0) {
                                    if (lowerCase.length() == 0 || user.deleted) {
                                        String str16 = user.first_name;
                                        String str17 = user.last_name;
                                        publicUsername = UserObject.getPublicUsername(user);
                                        j3 = user.id;
                                        if ((TextUtils.isEmpty(publicUsername) && publicUsername.toLowerCase().startsWith(lowerCase)) || ((!TextUtils.isEmpty(str16) && str16.toLowerCase().startsWith(lowerCase)) || ((!TextUtils.isEmpty(str17) && str17.toLowerCase().startsWith(lowerCase)) || (z9 && ContactsController.formatName(str16, str17).toLowerCase().startsWith(lowerCase))))) {
                                            arrayList6.add(user);
                                            longSparseArray.put(user, j3);
                                        }
                                    } else {
                                        arrayList6.add(user);
                                    }
                                }
                            } else if (!TextUtils.isEmpty(lowerCase) && (chat2 = messagesController.getChat(Long.valueOf(-allDialogs.get(i11).id))) != null && chat2.username != null && longSparseArray2.indexOfKey(chat2.id) < 0) {
                                if (lowerCase.length() == 0) {
                                    arrayList6.add(chat2);
                                } else {
                                    String str18 = chat2.title;
                                    str6 = chat2.username;
                                    j2 = chat2.id;
                                    if ((TextUtils.isEmpty(str6) && str6.toLowerCase().startsWith(lowerCase)) || (!TextUtils.isEmpty(str18) && str18.toLowerCase().startsWith(lowerCase))) {
                                        arrayList6.add(chat2);
                                        longSparseArray.put(chat2, j2);
                                    }
                                }
                            }
                        }
                    }
                    Collections.sort(arrayList6, new Comparator() {
                        @Override
                        public final int compare(Object obj3, Object obj4) {
                            TLObject tLObject = (TLObject) obj3;
                            TLObject tLObject2 = (TLObject) obj4;
                            long j7 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : -((TLRPC.Chat) tLObject).id;
                            long j8 = tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : -((TLRPC.Chat) tLObject2).id;
                            LongSparseArray longSparseArray3 = longSparseArray;
                            if (longSparseArray3.indexOfKey(j7) >= 0 && longSparseArray3.indexOfKey(j8) >= 0) {
                                return 0;
                            }
                            if (longSparseArray3.indexOfKey(j7) >= 0) {
                                return -1;
                            }
                            if (longSparseArray3.indexOfKey(j8) >= 0) {
                                return 1;
                            }
                            Long lValueOf = Long.valueOf(j7);
                            ArrayList arrayList19 = arrayList18;
                            int iIndexOf2 = arrayList19.indexOf(lValueOf);
                            int iIndexOf3 = arrayList19.indexOf(Long.valueOf(j8));
                            if (iIndexOf2 != -1 && iIndexOf3 != -1) {
                                if (iIndexOf2 < iIndexOf3) {
                                    return -1;
                                }
                                return iIndexOf2 == iIndexOf3 ? 0 : 1;
                            }
                            if (iIndexOf2 == -1 || iIndexOf3 != -1) {
                                return (iIndexOf2 != -1 || iIndexOf3 == -1) ? 0 : 1;
                            }
                            return -1;
                        }
                    });
                    this.searchResultHashtags = null;
                    this.stickers = null;
                    this.quickReplies = null;
                    this.searchResultCommands = null;
                    this.searchResultCommandsEphemeral = null;
                    this.searchResultCommandsHelp = null;
                    this.searchResultCommandsUsers = null;
                    this.searchResultSuggestions = null;
                    if (!((chat == null && chat.megagroup) || this.searchInDialogs) || lowerCase.length() <= 0) {
                        showUsersResult(longSparseArray, arrayList6, true);
                    }
                    if (arrayList6.size() < 5) {
                        RemoteUtils$$ExternalSyntheticLambda2 remoteUtils$$ExternalSyntheticLambda3 = new RemoteUtils$$ExternalSyntheticLambda2(this, arrayList6, longSparseArray, 16);
                        this.cancelDelayRunnable = remoteUtils$$ExternalSyntheticLambda3;
                        AndroidUtilities.runOnUIThread(remoteUtils$$ExternalSyntheticLambda3, 1000L);
                    } else {
                        showUsersResult(longSparseArray, arrayList6, true);
                    }
                    AnonymousClass7 anonymousClass8 = new AnonymousClass7(chat, lowerCase, j6, arrayList6, longSparseArray, messagesController);
                    this.searchGlobalRunnable = anonymousClass8;
                    AndroidUtilities.runOnUIThread(anonymousClass8, 200L);
                    return;
                }
            }
            sb2 = sb;
            sb2.append(string.substring(1));
            this.resultStartPosition = 0;
            this.resultLength = sb2.length();
            b = 0;
            i4 = -1;
            r11 = 0;
            RecyclerView.AdapterDataObservable adapterDataObservable2 = this.mObservable;
            if (str3 != null) {
                if (str3 == null) {
                    hashtagHint = this.topHint;
                    if (hashtagHint != 0) {
                        hashtagHint.set(r11, this.hintHashtag, chat7);
                    }
                    hashtagHint2 = this.bottomHint;
                    if (hashtagHint2 != null) {
                        hashtagHint2.set(1, this.hintHashtag, chat7);
                    }
                } else {
                    hashtagHint = this.topHint;
                    if (hashtagHint != 0) {
                        hashtagHint.set(r11, this.hintHashtag, chat7);
                    }
                    hashtagHint2 = this.bottomHint;
                    if (hashtagHint2 != null) {
                        hashtagHint2.set(1, this.hintHashtag, chat7);
                    }
                }
            } else if (str3 == null) {
                hashtagHint = this.topHint;
                if (hashtagHint != 0) {
                    hashtagHint.set(r11, this.hintHashtag, chat7);
                }
                hashtagHint2 = this.bottomHint;
                if (hashtagHint2 != null) {
                    hashtagHint2.set(1, this.hintHashtag, chat7);
                }
            } else {
                hashtagHint = this.topHint;
                if (hashtagHint != 0) {
                    hashtagHint.set(r11, this.hintHashtag, chat7);
                }
                hashtagHint2 = this.bottomHint;
                if (hashtagHint2 != null) {
                    hashtagHint2.set(1, this.hintHashtag, chat7);
                }
            }
            if (b == -1) {
                this.contextMedia = r11;
                this.searchResultBotContext = null;
                anonymousClass4.needChangePanelVisibility(r11);
                return;
            }
            if (b == 0) {
                if (b == 1) {
                    ArrayList arrayList19 = new ArrayList();
                    String lowerCase5 = sb2.toString().toLowerCase();
                    arrayList5 = searchAdapterHelper.hashtags;
                    while (i9 < arrayList5.size()) {
                        hashtagObject = (SearchAdapterHelper.HashtagObject) arrayList5.get(i9);
                        if (hashtagObject == null) {
                        }
                    }
                    this.searchResultHashtags = arrayList19;
                    this.stickers = null;
                    this.searchResultUsernames = null;
                    this.searchResultUsernamesMap = null;
                    this.quickReplies = null;
                    this.searchResultCommands = null;
                    this.searchResultCommandsEphemeral = null;
                    this.searchResultCommandsHelp = null;
                    this.searchResultCommandsUsers = null;
                    this.searchResultSuggestions = null;
                    this.contextMedia = false;
                    this.searchResultBotContext = null;
                    notifyDataSetChanged();
                    if (this.searchResultHashtags.isEmpty()) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    anonymousClass4.needChangePanelVisibility(z8);
                    return;
                }
                if (b == 2) {
                    if (b == 3) {
                        if (b == 4) {
                            this.searchResultHashtags = null;
                            this.searchResultUsernames = null;
                            this.searchResultUsernamesMap = null;
                            this.searchResultSuggestions = null;
                            this.searchResultCommands = null;
                            this.searchResultCommandsEphemeral = null;
                            this.quickReplies = null;
                            this.searchResultCommandsHelp = null;
                            this.searchResultCommandsUsers = null;
                            return;
                        }
                        return;
                    }
                    currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    if (!Arrays.equals(currentKeyboardLanguage, this.lastSearchKeyboardLanguage)) {
                        MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                    MediaDataController mediaDataController2 = MediaDataController.getInstance(this.currentAccount);
                    String[] strArr2 = this.lastSearchKeyboardLanguage;
                    String string3 = sb2.toString();
                    MentionsAdapter$$ExternalSyntheticLambda7 mentionsAdapter$$ExternalSyntheticLambda8 = new MentionsAdapter$$ExternalSyntheticLambda7(this);
                    if (SharedConfig.suggestAnimatedEmoji) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    mediaDataController2.getEmojiSuggestions(strArr2, string3, false, mentionsAdapter$$ExternalSyntheticLambda8, z6);
                    return;
                }
                arrayList3 = new ArrayList();
                ArrayList arrayList110 = new ArrayList();
                ArrayList arrayList111 = new ArrayList();
                ArrayList arrayList112 = new ArrayList();
                String lowerCase6 = sb2.toString().toLowerCase();
                while (i7 < this.botInfo.size()) {
                    botInfo = (TL_bots.BotInfo) this.botInfo.valueAt(i7);
                    while (i8 < botInfo.commands.size()) {
                        botCommand = botInfo.commands.get(i8);
                        if (botCommand == null) {
                        }
                    }
                }
                if (this.parentFragment != null) {
                    r6 = 0;
                    this.quickRepliesQuery = null;
                    this.quickReplies = null;
                } else {
                    r6 = 0;
                    this.quickRepliesQuery = null;
                    this.quickReplies = null;
                }
                this.searchResultHashtags = r6;
                this.stickers = r6;
                this.searchResultUsernames = r6;
                this.searchResultUsernamesMap = r6;
                this.searchResultSuggestions = r6;
                this.searchResultCommands = arrayList3;
                this.searchResultCommandsHelp = arrayList110;
                this.searchResultCommandsUsers = arrayList111;
                this.searchResultCommandsEphemeral = arrayList112;
                this.contextMedia = false;
                this.searchResultBotContext = r6;
                notifyDataSetChanged();
                if (arrayList3.isEmpty()) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                anonymousClass4.needChangePanelVisibility(z7);
                return;
            }
            this.contextMedia = r11;
            this.searchResultBotContext = null;
            final ArrayList arrayList113 = new ArrayList();
            if (arrayList2 != null) {
                while (i15 < Math.min(100, arrayList2.size())) {
                    fromChatId = ((MessageObject) arrayList2.get(i15)).getFromChatId();
                    if (fromChatId <= 0) {
                    }
                }
            }
            lowerCase = sb2.toString().toLowerCase();
            if (lowerCase.indexOf(32) >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            arrayList6 = new ArrayList();
            LongSparseArray longSparseArray3 = new LongSparseArray();
            int i35 = i4;
            longSparseArray = new LongSparseArray();
            arrayList7 = new ArrayList();
            arrayList7.addAll(MediaDataController.getInstance(this.currentAccount).inlineBots);
            if (chat7 != null) {
                arrayList7.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
            } else {
                arrayList7.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
            }
            List.EL.sort(arrayList7, new Theme$$ExternalSyntheticLambda5(27));
            linkedHashMap = new LinkedHashMap();
            size = arrayList7.size();
            i10 = 0;
            while (i10 < size) {
                Object obj3 = arrayList7.get(i10);
                i10++;
                TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) obj3;
                Map.EL.putIfAbsent(linkedHashMap, Long.valueOf(DialogObject.getPeerDialogId(tL_topPeer2.peer)), tL_topPeer2);
            }
            arrayList8 = new ArrayList(linkedHashMap.values());
            if (!z) {
                i14 = 0;
                while (i13 < arrayList8.size()) {
                    user3 = messagesController.getUser(Long.valueOf(((TLRPC.TL_topPeer) arrayList8.get(i13)).peer.user_id));
                    if (user3 == null) {
                        publicUsername3 = UserObject.getPublicUsername(user3);
                        if (TextUtils.isEmpty(publicUsername3)) {
                        }
                        if (i14 == 5) {
                            break;
                            break;
                        }
                    }
                }
            }
            chatActivity2 = this.parentFragment;
            if (chatActivity2 != null) {
                chat7 = chatActivity2.currentChat;
                j = chatActivity2.threadMessageId;
            } else {
                chatFull = this.info;
                if (chatFull != null) {
                    chat7 = messagesController.getChat(Long.valueOf(chatFull.id));
                }
                j = 0;
            }
            currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            if (chat7 != null) {
                i12 = -2;
                while (i12 < this.info.participants.participants.size()) {
                    if (i12 != -2) {
                        if (currentUser == null) {
                        }
                        j4 = j;
                        chat5 = chat7;
                        i12 = i12;
                    } else {
                        chat3 = chat7;
                        if (i12 == -1) {
                            j4 = j;
                            chatParticipant = this.info.participants.participants.get(i12);
                            if (currentUser != null) {
                                chat4 = chat3;
                                if (chatParticipant.user_id != currentUser.id) {
                                }
                                chat5 = chat4;
                                i12 = i12;
                            } else {
                                chat4 = chat3;
                            }
                            user2 = messagesController.getUser(Long.valueOf(chatParticipant.user_id));
                            if (user2 != null) {
                                if (lowerCase.length() == 0) {
                                }
                                str7 = user2.first_name;
                                str8 = user2.last_name;
                                publicUsername2 = UserObject.getPublicUsername(user2);
                                chat5 = chat4;
                                j5 = user2.id;
                                obj = user2;
                                if (TextUtils.isEmpty(publicUsername2)) {
                                    arrayList6.add(obj);
                                    longSparseArray.put(obj, j5);
                                } else {
                                    arrayList6.add(obj);
                                    longSparseArray.put(obj, j5);
                                }
                            }
                            chat5 = chat4;
                            i12 = i12;
                        } else if (!z2) {
                            chat5 = chat3;
                            j4 = j;
                            i12 = i12;
                        } else if (lowerCase.length() == 0) {
                            chat7 = chat3;
                            arrayList6.add(chat7);
                            j4 = j;
                            chat5 = chat7;
                            i12 = i12;
                        } else {
                            str7 = chat3.title;
                            publicUsername2 = ChatObject.getPublicUsername(chat3);
                            j4 = j;
                            chat5 = chat3;
                            str8 = null;
                            j5 = -chat3.id;
                            obj = chat5;
                            if (TextUtils.isEmpty(publicUsername2)) {
                                arrayList6.add(obj);
                                longSparseArray.put(obj, j5);
                            } else {
                                arrayList6.add(obj);
                                longSparseArray.put(obj, j5);
                            }
                        }
                    }
                    i12++;
                    j = j4;
                    chat7 = chat5;
                }
            }
            long j7 = j;
            chat = chat7;
            if (this.searchInDialogs) {
                allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                while (i11 < allDialogs.size()) {
                    if (allDialogs.get(i11).id > 0) {
                        user = messagesController.getUser(Long.valueOf(allDialogs.get(i11).id));
                        if (user != null) {
                            if (lowerCase.length() == 0) {
                                String str19 = user.first_name;
                                String str110 = user.last_name;
                                publicUsername = UserObject.getPublicUsername(user);
                                j3 = user.id;
                                if (TextUtils.isEmpty(publicUsername)) {
                                    arrayList6.add(user);
                                    longSparseArray.put(user, j3);
                                } else {
                                    arrayList6.add(user);
                                    longSparseArray.put(user, j3);
                                }
                            } else {
                                String str111 = user.first_name;
                                String str112 = user.last_name;
                                publicUsername = UserObject.getPublicUsername(user);
                                j3 = user.id;
                                if (TextUtils.isEmpty(publicUsername)) {
                                    arrayList6.add(user);
                                    longSparseArray.put(user, j3);
                                } else {
                                    arrayList6.add(user);
                                    longSparseArray.put(user, j3);
                                }
                            }
                        }
                    } else if (!TextUtils.isEmpty(lowerCase)) {
                        if (lowerCase.length() == 0) {
                            arrayList6.add(chat2);
                        } else {
                            String str113 = chat2.title;
                            str6 = chat2.username;
                            j2 = chat2.id;
                            if (TextUtils.isEmpty(str6)) {
                                arrayList6.add(chat2);
                                longSparseArray.put(chat2, j2);
                            } else {
                                arrayList6.add(chat2);
                                longSparseArray.put(chat2, j2);
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList6, new Comparator() {
                @Override
                public final int compare(Object obj4, Object obj5) {
                    TLObject tLObject = (TLObject) obj4;
                    TLObject tLObject2 = (TLObject) obj5;
                    long j8 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : -((TLRPC.Chat) tLObject).id;
                    long j9 = tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : -((TLRPC.Chat) tLObject2).id;
                    LongSparseArray longSparseArray4 = longSparseArray;
                    if (longSparseArray4.indexOfKey(j8) >= 0 && longSparseArray4.indexOfKey(j9) >= 0) {
                        return 0;
                    }
                    if (longSparseArray4.indexOfKey(j8) >= 0) {
                        return -1;
                    }
                    if (longSparseArray4.indexOfKey(j9) >= 0) {
                        return 1;
                    }
                    Long lValueOf = Long.valueOf(j8);
                    ArrayList arrayList114 = arrayList113;
                    int iIndexOf2 = arrayList114.indexOf(lValueOf);
                    int iIndexOf3 = arrayList114.indexOf(Long.valueOf(j9));
                    if (iIndexOf2 != -1 && iIndexOf3 != -1) {
                        if (iIndexOf2 < iIndexOf3) {
                            return -1;
                        }
                        return iIndexOf2 == iIndexOf3 ? 0 : 1;
                    }
                    if (iIndexOf2 == -1 || iIndexOf3 != -1) {
                        return (iIndexOf2 != -1 || iIndexOf3 == -1) ? 0 : 1;
                    }
                    return -1;
                }
            });
            this.searchResultHashtags = null;
            this.stickers = null;
            this.quickReplies = null;
            this.searchResultCommands = null;
            this.searchResultCommandsEphemeral = null;
            this.searchResultCommandsHelp = null;
            this.searchResultCommandsUsers = null;
            this.searchResultSuggestions = null;
            if (chat == null) {
            }
            showUsersResult(longSparseArray, arrayList6, true);
        }
        if (z3) {
            length = string.length();
            charSequenceConcat = string;
            i18 = 0;
            while (i18 < length) {
                cCharAt2 = charSequenceConcat.charAt(i18);
                i19 = length - 1;
                if (i18 < i19) {
                    cCharAt3 = charSequenceConcat.charAt(i18 + 1);
                } else {
                    cCharAt3 = 0;
                }
                if (i18 < i19) {
                    if (cCharAt2 == 65039) {
                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i18), charSequenceConcat.subSequence(i18 + 1, charSequenceConcat.length()));
                        length--;
                        i18--;
                    }
                } else if (cCharAt2 == 65039) {
                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i18), charSequenceConcat.subSequence(i18 + 1, charSequenceConcat.length()));
                    length--;
                    i18--;
                }
                i18++;
            }
            this.lastSticker = charSequenceConcat.toString().trim();
            str = string;
        } else {
            str = "";
        }
        if (z3) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (z4) {
            animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class);
            if (animatedEmojiSpanArr != null) {
                z4 = true;
            } else {
                z4 = true;
            }
        }
        if (!this.allowStickers) {
            arrayList2 = arrayList;
            sb = sb3;
            i2 = i;
            if (z) {
                if (this.allowStickers) {
                    str2 = null;
                    searchForContextBot(null, null);
                } else {
                    str2 = null;
                    searchForContextBot(null, null);
                }
            } else if (this.allowStickers) {
                str2 = null;
                searchForContextBot(null, null);
            } else {
                str2 = null;
                searchForContextBot(null, null);
            }
            b = -1;
        } else {
            arrayList2 = arrayList;
            sb = sb3;
            i2 = i;
            if (z) {
                if (this.allowStickers) {
                    str2 = null;
                    searchForContextBot(null, null);
                } else {
                    str2 = null;
                    searchForContextBot(null, null);
                }
            } else if (this.allowStickers) {
                str2 = null;
                searchForContextBot(null, null);
            } else {
                str2 = null;
                searchForContextBot(null, null);
            }
            b = -1;
        }
        if (this.foundContextBot != null) {
            return;
        }
        messagesController = MessagesController.getInstance(this.currentAccount);
        str3 = this.hintHashtag;
        this.hintHashtag = str2;
        searchAdapterHelper = this.searchAdapterHelper;
        if (z) {
            sb2 = sb;
            i4 = i20;
            while (true) {
                if (i4 >= 0) {
                    if (i4 >= string.length()) {
                        cCharAt = string.charAt(i4);
                        if (i4 != 0) {
                            i6 = i4 - 1;
                            if (string.charAt(i6) != ' ') {
                                if (cCharAt == '@') {
                                    z5 = this.searchInDialogs;
                                    if (!z5) {
                                    }
                                    if (z5) {
                                    }
                                    this.resultStartPosition = i4;
                                    this.resultLength = sb2.length() + 1;
                                    b = 0;
                                    r11 = 0;
                                } else if (cCharAt == '#') {
                                    if (ChatObject.isChannelAndNotMegaGroup(chat7)) {
                                        strSubstring3 = string.substring(i4);
                                        this.hintHashtag = strSubstring3;
                                        if (strSubstring3.length() >= 4) {
                                            this.hintHashtag = null;
                                        } else {
                                            this.hintHashtag = null;
                                        }
                                    }
                                    if (!searchAdapterHelper.hashtagsLoadedFromDb) {
                                        MessagesStorage.getInstance(searchAdapterHelper.currentAccount).getStorageQueue().postRunnable(new SearchAdapterHelper$$ExternalSyntheticLambda4(searchAdapterHelper, 1));
                                        this.lastText = string;
                                        this.lastPosition = i2;
                                        this.messages = arrayList2;
                                        return;
                                    }
                                    this.resultStartPosition = i4;
                                    this.resultLength = sb2.length() + 1;
                                    sb2.insert(0, cCharAt);
                                    b = 1;
                                } else if (i4 != 0) {
                                    if (cCharAt == ':') {
                                        if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                            i5 = 1;
                                            if (sb2.length() > 1) {
                                            }
                                        } else {
                                            i5 = 1;
                                        }
                                        this.resultStartPosition = i4;
                                        this.resultLength = sb2.length() + i5;
                                        b = 3;
                                    }
                                } else if (cCharAt == ':') {
                                    if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                        i5 = 1;
                                        if (sb2.length() > 1) {
                                        }
                                    } else {
                                        i5 = 1;
                                    }
                                    this.resultStartPosition = i4;
                                    this.resultLength = sb2.length() + i5;
                                    b = 3;
                                }
                                sb2.insert(0, cCharAt);
                            } else {
                                if (cCharAt == '@') {
                                    z5 = this.searchInDialogs;
                                    if (!z5) {
                                    }
                                    if (z5) {
                                    }
                                    this.resultStartPosition = i4;
                                    this.resultLength = sb2.length() + 1;
                                    b = 0;
                                    r11 = 0;
                                } else if (cCharAt == '#') {
                                    if (ChatObject.isChannelAndNotMegaGroup(chat7)) {
                                        strSubstring3 = string.substring(i4);
                                        this.hintHashtag = strSubstring3;
                                        if (strSubstring3.length() >= 4) {
                                            this.hintHashtag = null;
                                        } else {
                                            this.hintHashtag = null;
                                        }
                                    }
                                    if (!searchAdapterHelper.hashtagsLoadedFromDb) {
                                        MessagesStorage.getInstance(searchAdapterHelper.currentAccount).getStorageQueue().postRunnable(new SearchAdapterHelper$$ExternalSyntheticLambda4(searchAdapterHelper, 1));
                                        this.lastText = string;
                                        this.lastPosition = i2;
                                        this.messages = arrayList2;
                                        return;
                                    }
                                    this.resultStartPosition = i4;
                                    this.resultLength = sb2.length() + 1;
                                    sb2.insert(0, cCharAt);
                                    b = 1;
                                } else if (i4 != 0) {
                                    if (cCharAt == ':') {
                                        if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                            i5 = 1;
                                            if (sb2.length() > 1) {
                                            }
                                        } else {
                                            i5 = 1;
                                        }
                                        this.resultStartPosition = i4;
                                        this.resultLength = sb2.length() + i5;
                                        b = 3;
                                    }
                                } else if (cCharAt == ':') {
                                    if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                        i5 = 1;
                                        if (sb2.length() > 1) {
                                        }
                                    } else {
                                        i5 = 1;
                                    }
                                    this.resultStartPosition = i4;
                                    this.resultLength = sb2.length() + i5;
                                    b = 3;
                                }
                                sb2.insert(0, cCharAt);
                            }
                        } else {
                            if (cCharAt == '@') {
                                z5 = this.searchInDialogs;
                                if (!z5) {
                                }
                                if (z5) {
                                }
                                this.resultStartPosition = i4;
                                this.resultLength = sb2.length() + 1;
                                b = 0;
                                r11 = 0;
                            } else if (cCharAt == '#') {
                                if (ChatObject.isChannelAndNotMegaGroup(chat7)) {
                                    strSubstring3 = string.substring(i4);
                                    this.hintHashtag = strSubstring3;
                                    if (strSubstring3.length() >= 4) {
                                        this.hintHashtag = null;
                                    } else {
                                        this.hintHashtag = null;
                                    }
                                }
                                if (!searchAdapterHelper.hashtagsLoadedFromDb) {
                                    MessagesStorage.getInstance(searchAdapterHelper.currentAccount).getStorageQueue().postRunnable(new SearchAdapterHelper$$ExternalSyntheticLambda4(searchAdapterHelper, 1));
                                    this.lastText = string;
                                    this.lastPosition = i2;
                                    this.messages = arrayList2;
                                    return;
                                }
                                this.resultStartPosition = i4;
                                this.resultLength = sb2.length() + 1;
                                sb2.insert(0, cCharAt);
                                b = 1;
                            } else if (i4 != 0) {
                                if (cCharAt == ':') {
                                    if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                        i5 = 1;
                                        if (sb2.length() > 1) {
                                        }
                                    } else {
                                        i5 = 1;
                                    }
                                    this.resultStartPosition = i4;
                                    this.resultLength = sb2.length() + i5;
                                    b = 3;
                                }
                            } else if (cCharAt == ':') {
                                if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                    i5 = 1;
                                    if (sb2.length() > 1) {
                                    }
                                } else {
                                    i5 = 1;
                                }
                                this.resultStartPosition = i4;
                                this.resultLength = sb2.length() + i5;
                                b = 3;
                            }
                            sb2.insert(0, cCharAt);
                        }
                    }
                    i4--;
                } else {
                    r11 = 0;
                    i4 = -1;
                }
                RecyclerView.AdapterDataObservable adapterDataObservable3 = this.mObservable;
                if (str3 != null) {
                    if (str3 == null) {
                        hashtagHint = this.topHint;
                        if (hashtagHint != 0) {
                            hashtagHint.set(r11, this.hintHashtag, chat7);
                        }
                        hashtagHint2 = this.bottomHint;
                        if (hashtagHint2 != null) {
                            hashtagHint2.set(1, this.hintHashtag, chat7);
                        }
                    } else {
                        hashtagHint = this.topHint;
                        if (hashtagHint != 0) {
                            hashtagHint.set(r11, this.hintHashtag, chat7);
                        }
                        hashtagHint2 = this.bottomHint;
                        if (hashtagHint2 != null) {
                            hashtagHint2.set(1, this.hintHashtag, chat7);
                        }
                    }
                } else if (str3 == null) {
                    hashtagHint = this.topHint;
                    if (hashtagHint != 0) {
                        hashtagHint.set(r11, this.hintHashtag, chat7);
                    }
                    hashtagHint2 = this.bottomHint;
                    if (hashtagHint2 != null) {
                        hashtagHint2.set(1, this.hintHashtag, chat7);
                    }
                } else {
                    hashtagHint = this.topHint;
                    if (hashtagHint != 0) {
                        hashtagHint.set(r11, this.hintHashtag, chat7);
                    }
                    hashtagHint2 = this.bottomHint;
                    if (hashtagHint2 != null) {
                        hashtagHint2.set(1, this.hintHashtag, chat7);
                    }
                }
                if (b == -1) {
                    this.contextMedia = r11;
                    this.searchResultBotContext = null;
                    anonymousClass4.needChangePanelVisibility(r11);
                    return;
                }
                if (b == 0) {
                    if (b == 1) {
                        ArrayList arrayList114 = new ArrayList();
                        String lowerCase7 = sb2.toString().toLowerCase();
                        arrayList5 = searchAdapterHelper.hashtags;
                        while (i9 < arrayList5.size()) {
                            hashtagObject = (SearchAdapterHelper.HashtagObject) arrayList5.get(i9);
                            if (hashtagObject == null) {
                            }
                        }
                        this.searchResultHashtags = arrayList114;
                        this.stickers = null;
                        this.searchResultUsernames = null;
                        this.searchResultUsernamesMap = null;
                        this.quickReplies = null;
                        this.searchResultCommands = null;
                        this.searchResultCommandsEphemeral = null;
                        this.searchResultCommandsHelp = null;
                        this.searchResultCommandsUsers = null;
                        this.searchResultSuggestions = null;
                        this.contextMedia = false;
                        this.searchResultBotContext = null;
                        notifyDataSetChanged();
                        if (this.searchResultHashtags.isEmpty()) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        anonymousClass4.needChangePanelVisibility(z8);
                        return;
                    }
                    if (b == 2) {
                        if (b == 3) {
                            if (b == 4) {
                                this.searchResultHashtags = null;
                                this.searchResultUsernames = null;
                                this.searchResultUsernamesMap = null;
                                this.searchResultSuggestions = null;
                                this.searchResultCommands = null;
                                this.searchResultCommandsEphemeral = null;
                                this.quickReplies = null;
                                this.searchResultCommandsHelp = null;
                                this.searchResultCommandsUsers = null;
                                return;
                            }
                            return;
                        }
                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                        if (!Arrays.equals(currentKeyboardLanguage, this.lastSearchKeyboardLanguage)) {
                            MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                        }
                        this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                        MediaDataController mediaDataController3 = MediaDataController.getInstance(this.currentAccount);
                        String[] strArr3 = this.lastSearchKeyboardLanguage;
                        String string4 = sb2.toString();
                        MentionsAdapter$$ExternalSyntheticLambda7 mentionsAdapter$$ExternalSyntheticLambda9 = new MentionsAdapter$$ExternalSyntheticLambda7(this);
                        if (SharedConfig.suggestAnimatedEmoji) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        mediaDataController3.getEmojiSuggestions(strArr3, string4, false, mentionsAdapter$$ExternalSyntheticLambda9, z6);
                        return;
                    }
                    arrayList3 = new ArrayList();
                    ArrayList arrayList115 = new ArrayList();
                    ArrayList arrayList116 = new ArrayList();
                    ArrayList arrayList117 = new ArrayList();
                    String lowerCase8 = sb2.toString().toLowerCase();
                    while (i7 < this.botInfo.size()) {
                        botInfo = (TL_bots.BotInfo) this.botInfo.valueAt(i7);
                        while (i8 < botInfo.commands.size()) {
                            botCommand = botInfo.commands.get(i8);
                            if (botCommand == null) {
                            }
                        }
                    }
                    if (this.parentFragment != null) {
                        r6 = 0;
                        this.quickRepliesQuery = null;
                        this.quickReplies = null;
                    } else {
                        r6 = 0;
                        this.quickRepliesQuery = null;
                        this.quickReplies = null;
                    }
                    this.searchResultHashtags = r6;
                    this.stickers = r6;
                    this.searchResultUsernames = r6;
                    this.searchResultUsernamesMap = r6;
                    this.searchResultSuggestions = r6;
                    this.searchResultCommands = arrayList3;
                    this.searchResultCommandsHelp = arrayList115;
                    this.searchResultCommandsUsers = arrayList116;
                    this.searchResultCommandsEphemeral = arrayList117;
                    this.contextMedia = false;
                    this.searchResultBotContext = r6;
                    notifyDataSetChanged();
                    if (arrayList3.isEmpty()) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    anonymousClass4.needChangePanelVisibility(z7);
                    return;
                }
                this.contextMedia = r11;
                this.searchResultBotContext = null;
                final ArrayList arrayList118 = new ArrayList();
                if (arrayList2 != null) {
                    while (i15 < Math.min(100, arrayList2.size())) {
                        fromChatId = ((MessageObject) arrayList2.get(i15)).getFromChatId();
                        if (fromChatId <= 0) {
                        }
                    }
                }
                lowerCase = sb2.toString().toLowerCase();
                if (lowerCase.indexOf(32) >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                arrayList6 = new ArrayList();
                LongSparseArray longSparseArray4 = new LongSparseArray();
                int i36 = i4;
                longSparseArray = new LongSparseArray();
                arrayList7 = new ArrayList();
                arrayList7.addAll(MediaDataController.getInstance(this.currentAccount).inlineBots);
                if (chat7 != null) {
                    arrayList7.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
                } else {
                    arrayList7.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
                }
                List.EL.sort(arrayList7, new Theme$$ExternalSyntheticLambda5(27));
                linkedHashMap = new LinkedHashMap();
                size = arrayList7.size();
                i10 = 0;
                while (i10 < size) {
                    Object obj4 = arrayList7.get(i10);
                    i10++;
                    TLRPC.TL_topPeer tL_topPeer3 = (TLRPC.TL_topPeer) obj4;
                    Map.EL.putIfAbsent(linkedHashMap, Long.valueOf(DialogObject.getPeerDialogId(tL_topPeer3.peer)), tL_topPeer3);
                }
                arrayList8 = new ArrayList(linkedHashMap.values());
                if (!z) {
                    i14 = 0;
                    while (i13 < arrayList8.size()) {
                        user3 = messagesController.getUser(Long.valueOf(((TLRPC.TL_topPeer) arrayList8.get(i13)).peer.user_id));
                        if (user3 == null) {
                            publicUsername3 = UserObject.getPublicUsername(user3);
                            if (TextUtils.isEmpty(publicUsername3)) {
                            }
                            if (i14 == 5) {
                                break;
                                break;
                            }
                        }
                    }
                }
                chatActivity2 = this.parentFragment;
                if (chatActivity2 != null) {
                    chat7 = chatActivity2.currentChat;
                    j = chatActivity2.threadMessageId;
                } else {
                    chatFull = this.info;
                    if (chatFull != null) {
                        chat7 = messagesController.getChat(Long.valueOf(chatFull.id));
                    }
                    j = 0;
                }
                currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                if (chat7 != null) {
                    i12 = -2;
                    while (i12 < this.info.participants.participants.size()) {
                        if (i12 != -2) {
                            if (currentUser == null) {
                            }
                            j4 = j;
                            chat5 = chat7;
                            i12 = i12;
                        } else {
                            chat3 = chat7;
                            if (i12 == -1) {
                                j4 = j;
                                chatParticipant = this.info.participants.participants.get(i12);
                                if (currentUser != null) {
                                    chat4 = chat3;
                                    if (chatParticipant.user_id != currentUser.id) {
                                    }
                                    chat5 = chat4;
                                    i12 = i12;
                                } else {
                                    chat4 = chat3;
                                }
                                user2 = messagesController.getUser(Long.valueOf(chatParticipant.user_id));
                                if (user2 != null) {
                                    if (lowerCase.length() == 0) {
                                    }
                                    str7 = user2.first_name;
                                    str8 = user2.last_name;
                                    publicUsername2 = UserObject.getPublicUsername(user2);
                                    chat5 = chat4;
                                    j5 = user2.id;
                                    obj = user2;
                                    if (TextUtils.isEmpty(publicUsername2)) {
                                        arrayList6.add(obj);
                                        longSparseArray.put(obj, j5);
                                    } else {
                                        arrayList6.add(obj);
                                        longSparseArray.put(obj, j5);
                                    }
                                }
                                chat5 = chat4;
                                i12 = i12;
                            } else if (!z2) {
                                chat5 = chat3;
                                j4 = j;
                                i12 = i12;
                            } else if (lowerCase.length() == 0) {
                                chat7 = chat3;
                                arrayList6.add(chat7);
                                j4 = j;
                                chat5 = chat7;
                                i12 = i12;
                            } else {
                                str7 = chat3.title;
                                publicUsername2 = ChatObject.getPublicUsername(chat3);
                                j4 = j;
                                chat5 = chat3;
                                str8 = null;
                                j5 = -chat3.id;
                                obj = chat5;
                                if (TextUtils.isEmpty(publicUsername2)) {
                                    arrayList6.add(obj);
                                    longSparseArray.put(obj, j5);
                                } else {
                                    arrayList6.add(obj);
                                    longSparseArray.put(obj, j5);
                                }
                            }
                        }
                        i12++;
                        j = j4;
                        chat7 = chat5;
                    }
                }
                long j8 = j;
                chat = chat7;
                if (this.searchInDialogs) {
                    allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                    while (i11 < allDialogs.size()) {
                        if (allDialogs.get(i11).id > 0) {
                            user = messagesController.getUser(Long.valueOf(allDialogs.get(i11).id));
                            if (user != null) {
                                if (lowerCase.length() == 0) {
                                    String str114 = user.first_name;
                                    String str115 = user.last_name;
                                    publicUsername = UserObject.getPublicUsername(user);
                                    j3 = user.id;
                                    if (TextUtils.isEmpty(publicUsername)) {
                                        arrayList6.add(user);
                                        longSparseArray.put(user, j3);
                                    } else {
                                        arrayList6.add(user);
                                        longSparseArray.put(user, j3);
                                    }
                                } else {
                                    String str116 = user.first_name;
                                    String str117 = user.last_name;
                                    publicUsername = UserObject.getPublicUsername(user);
                                    j3 = user.id;
                                    if (TextUtils.isEmpty(publicUsername)) {
                                        arrayList6.add(user);
                                        longSparseArray.put(user, j3);
                                    } else {
                                        arrayList6.add(user);
                                        longSparseArray.put(user, j3);
                                    }
                                }
                            }
                        } else if (!TextUtils.isEmpty(lowerCase)) {
                            if (lowerCase.length() == 0) {
                                arrayList6.add(chat2);
                            } else {
                                String str118 = chat2.title;
                                str6 = chat2.username;
                                j2 = chat2.id;
                                if (TextUtils.isEmpty(str6)) {
                                    arrayList6.add(chat2);
                                    longSparseArray.put(chat2, j2);
                                } else {
                                    arrayList6.add(chat2);
                                    longSparseArray.put(chat2, j2);
                                }
                            }
                        }
                    }
                }
                Collections.sort(arrayList6, new Comparator() {
                    @Override
                    public final int compare(Object obj5, Object obj6) {
                        TLObject tLObject = (TLObject) obj5;
                        TLObject tLObject2 = (TLObject) obj6;
                        long j9 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : -((TLRPC.Chat) tLObject).id;
                        long j10 = tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : -((TLRPC.Chat) tLObject2).id;
                        LongSparseArray longSparseArray5 = longSparseArray;
                        if (longSparseArray5.indexOfKey(j9) >= 0 && longSparseArray5.indexOfKey(j10) >= 0) {
                            return 0;
                        }
                        if (longSparseArray5.indexOfKey(j9) >= 0) {
                            return -1;
                        }
                        if (longSparseArray5.indexOfKey(j10) >= 0) {
                            return 1;
                        }
                        Long lValueOf = Long.valueOf(j9);
                        ArrayList arrayList119 = arrayList118;
                        int iIndexOf2 = arrayList119.indexOf(lValueOf);
                        int iIndexOf3 = arrayList119.indexOf(Long.valueOf(j10));
                        if (iIndexOf2 != -1 && iIndexOf3 != -1) {
                            if (iIndexOf2 < iIndexOf3) {
                                return -1;
                            }
                            return iIndexOf2 == iIndexOf3 ? 0 : 1;
                        }
                        if (iIndexOf2 == -1 || iIndexOf3 != -1) {
                            return (iIndexOf2 != -1 || iIndexOf3 == -1) ? 0 : 1;
                        }
                        return -1;
                    }
                });
                this.searchResultHashtags = null;
                this.stickers = null;
                this.quickReplies = null;
                this.searchResultCommands = null;
                this.searchResultCommandsEphemeral = null;
                this.searchResultCommandsHelp = null;
                this.searchResultCommandsUsers = null;
                this.searchResultSuggestions = null;
                if (chat == null) {
                }
                showUsersResult(longSparseArray, arrayList6, true);
            }
        }
        sb2 = sb;
        sb2.append(string.substring(1));
        this.resultStartPosition = 0;
        this.resultLength = sb2.length();
        b = 0;
        i4 = -1;
        r11 = 0;
        RecyclerView.AdapterDataObservable adapterDataObservable4 = this.mObservable;
        if (str3 != null) {
            if (str3 == null) {
                hashtagHint = this.topHint;
                if (hashtagHint != 0) {
                    hashtagHint.set(r11, this.hintHashtag, chat7);
                }
                hashtagHint2 = this.bottomHint;
                if (hashtagHint2 != null) {
                    hashtagHint2.set(1, this.hintHashtag, chat7);
                }
            } else {
                hashtagHint = this.topHint;
                if (hashtagHint != 0) {
                    hashtagHint.set(r11, this.hintHashtag, chat7);
                }
                hashtagHint2 = this.bottomHint;
                if (hashtagHint2 != null) {
                    hashtagHint2.set(1, this.hintHashtag, chat7);
                }
            }
        } else if (str3 == null) {
            hashtagHint = this.topHint;
            if (hashtagHint != 0) {
                hashtagHint.set(r11, this.hintHashtag, chat7);
            }
            hashtagHint2 = this.bottomHint;
            if (hashtagHint2 != null) {
                hashtagHint2.set(1, this.hintHashtag, chat7);
            }
        } else {
            hashtagHint = this.topHint;
            if (hashtagHint != 0) {
                hashtagHint.set(r11, this.hintHashtag, chat7);
            }
            hashtagHint2 = this.bottomHint;
            if (hashtagHint2 != null) {
                hashtagHint2.set(1, this.hintHashtag, chat7);
            }
        }
        if (b == -1) {
            this.contextMedia = r11;
            this.searchResultBotContext = null;
            anonymousClass4.needChangePanelVisibility(r11);
            return;
        }
        if (b == 0) {
            if (b == 1) {
                ArrayList arrayList119 = new ArrayList();
                String lowerCase9 = sb2.toString().toLowerCase();
                arrayList5 = searchAdapterHelper.hashtags;
                while (i9 < arrayList5.size()) {
                    hashtagObject = (SearchAdapterHelper.HashtagObject) arrayList5.get(i9);
                    if (hashtagObject == null) {
                    }
                }
                this.searchResultHashtags = arrayList119;
                this.stickers = null;
                this.searchResultUsernames = null;
                this.searchResultUsernamesMap = null;
                this.quickReplies = null;
                this.searchResultCommands = null;
                this.searchResultCommandsEphemeral = null;
                this.searchResultCommandsHelp = null;
                this.searchResultCommandsUsers = null;
                this.searchResultSuggestions = null;
                this.contextMedia = false;
                this.searchResultBotContext = null;
                notifyDataSetChanged();
                if (this.searchResultHashtags.isEmpty()) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                anonymousClass4.needChangePanelVisibility(z8);
                return;
            }
            if (b == 2) {
                if (b == 3) {
                    if (b == 4) {
                        this.searchResultHashtags = null;
                        this.searchResultUsernames = null;
                        this.searchResultUsernamesMap = null;
                        this.searchResultSuggestions = null;
                        this.searchResultCommands = null;
                        this.searchResultCommandsEphemeral = null;
                        this.quickReplies = null;
                        this.searchResultCommandsHelp = null;
                        this.searchResultCommandsUsers = null;
                        return;
                    }
                    return;
                }
                currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                if (!Arrays.equals(currentKeyboardLanguage, this.lastSearchKeyboardLanguage)) {
                    MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                MediaDataController mediaDataController4 = MediaDataController.getInstance(this.currentAccount);
                String[] strArr4 = this.lastSearchKeyboardLanguage;
                String string5 = sb2.toString();
                MentionsAdapter$$ExternalSyntheticLambda7 mentionsAdapter$$ExternalSyntheticLambda10 = new MentionsAdapter$$ExternalSyntheticLambda7(this);
                if (SharedConfig.suggestAnimatedEmoji) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                mediaDataController4.getEmojiSuggestions(strArr4, string5, false, mentionsAdapter$$ExternalSyntheticLambda10, z6);
                return;
            }
            arrayList3 = new ArrayList();
            ArrayList arrayList1110 = new ArrayList();
            ArrayList arrayList1111 = new ArrayList();
            ArrayList arrayList1112 = new ArrayList();
            String lowerCase10 = sb2.toString().toLowerCase();
            while (i7 < this.botInfo.size()) {
                botInfo = (TL_bots.BotInfo) this.botInfo.valueAt(i7);
                while (i8 < botInfo.commands.size()) {
                    botCommand = botInfo.commands.get(i8);
                    if (botCommand == null) {
                    }
                }
            }
            if (this.parentFragment != null) {
                r6 = 0;
                this.quickRepliesQuery = null;
                this.quickReplies = null;
            } else {
                r6 = 0;
                this.quickRepliesQuery = null;
                this.quickReplies = null;
            }
            this.searchResultHashtags = r6;
            this.stickers = r6;
            this.searchResultUsernames = r6;
            this.searchResultUsernamesMap = r6;
            this.searchResultSuggestions = r6;
            this.searchResultCommands = arrayList3;
            this.searchResultCommandsHelp = arrayList1110;
            this.searchResultCommandsUsers = arrayList1111;
            this.searchResultCommandsEphemeral = arrayList1112;
            this.contextMedia = false;
            this.searchResultBotContext = r6;
            notifyDataSetChanged();
            if (arrayList3.isEmpty()) {
                z7 = true;
            } else {
                z7 = true;
            }
            anonymousClass4.needChangePanelVisibility(z7);
            return;
        }
        this.contextMedia = r11;
        this.searchResultBotContext = null;
        final ArrayList arrayList1113 = new ArrayList();
        if (arrayList2 != null) {
            while (i15 < Math.min(100, arrayList2.size())) {
                fromChatId = ((MessageObject) arrayList2.get(i15)).getFromChatId();
                if (fromChatId <= 0) {
                }
            }
        }
        lowerCase = sb2.toString().toLowerCase();
        if (lowerCase.indexOf(32) >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        arrayList6 = new ArrayList();
        LongSparseArray longSparseArray5 = new LongSparseArray();
        int i37 = i4;
        longSparseArray = new LongSparseArray();
        arrayList7 = new ArrayList();
        arrayList7.addAll(MediaDataController.getInstance(this.currentAccount).inlineBots);
        if (chat7 != null) {
            arrayList7.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
        } else {
            arrayList7.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
        }
        List.EL.sort(arrayList7, new Theme$$ExternalSyntheticLambda5(27));
        linkedHashMap = new LinkedHashMap();
        size = arrayList7.size();
        i10 = 0;
        while (i10 < size) {
            Object obj5 = arrayList7.get(i10);
            i10++;
            TLRPC.TL_topPeer tL_topPeer4 = (TLRPC.TL_topPeer) obj5;
            Map.EL.putIfAbsent(linkedHashMap, Long.valueOf(DialogObject.getPeerDialogId(tL_topPeer4.peer)), tL_topPeer4);
        }
        arrayList8 = new ArrayList(linkedHashMap.values());
        if (!z) {
            i14 = 0;
            while (i13 < arrayList8.size()) {
                user3 = messagesController.getUser(Long.valueOf(((TLRPC.TL_topPeer) arrayList8.get(i13)).peer.user_id));
                if (user3 == null) {
                    publicUsername3 = UserObject.getPublicUsername(user3);
                    if (TextUtils.isEmpty(publicUsername3)) {
                    }
                    if (i14 == 5) {
                        break;
                        break;
                    }
                }
            }
        }
        chatActivity2 = this.parentFragment;
        if (chatActivity2 != null) {
            chat7 = chatActivity2.currentChat;
            j = chatActivity2.threadMessageId;
        } else {
            chatFull = this.info;
            if (chatFull != null) {
                chat7 = messagesController.getChat(Long.valueOf(chatFull.id));
            }
            j = 0;
        }
        currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (chat7 != null) {
            i12 = -2;
            while (i12 < this.info.participants.participants.size()) {
                if (i12 != -2) {
                    if (currentUser == null) {
                    }
                    j4 = j;
                    chat5 = chat7;
                    i12 = i12;
                } else {
                    chat3 = chat7;
                    if (i12 == -1) {
                        j4 = j;
                        chatParticipant = this.info.participants.participants.get(i12);
                        if (currentUser != null) {
                            chat4 = chat3;
                            if (chatParticipant.user_id != currentUser.id) {
                            }
                            chat5 = chat4;
                            i12 = i12;
                        } else {
                            chat4 = chat3;
                        }
                        user2 = messagesController.getUser(Long.valueOf(chatParticipant.user_id));
                        if (user2 != null) {
                            if (lowerCase.length() == 0) {
                            }
                            str7 = user2.first_name;
                            str8 = user2.last_name;
                            publicUsername2 = UserObject.getPublicUsername(user2);
                            chat5 = chat4;
                            j5 = user2.id;
                            obj = user2;
                            if (TextUtils.isEmpty(publicUsername2)) {
                                arrayList6.add(obj);
                                longSparseArray.put(obj, j5);
                            } else {
                                arrayList6.add(obj);
                                longSparseArray.put(obj, j5);
                            }
                        }
                        chat5 = chat4;
                        i12 = i12;
                    } else if (!z2) {
                        chat5 = chat3;
                        j4 = j;
                        i12 = i12;
                    } else if (lowerCase.length() == 0) {
                        chat7 = chat3;
                        arrayList6.add(chat7);
                        j4 = j;
                        chat5 = chat7;
                        i12 = i12;
                    } else {
                        str7 = chat3.title;
                        publicUsername2 = ChatObject.getPublicUsername(chat3);
                        j4 = j;
                        chat5 = chat3;
                        str8 = null;
                        j5 = -chat3.id;
                        obj = chat5;
                        if (TextUtils.isEmpty(publicUsername2)) {
                            arrayList6.add(obj);
                            longSparseArray.put(obj, j5);
                        } else {
                            arrayList6.add(obj);
                            longSparseArray.put(obj, j5);
                        }
                    }
                }
                i12++;
                j = j4;
                chat7 = chat5;
            }
        }
        long j9 = j;
        chat = chat7;
        if (this.searchInDialogs) {
            allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
            while (i11 < allDialogs.size()) {
                if (allDialogs.get(i11).id > 0) {
                    user = messagesController.getUser(Long.valueOf(allDialogs.get(i11).id));
                    if (user != null) {
                        if (lowerCase.length() == 0) {
                            String str119 = user.first_name;
                            String str1110 = user.last_name;
                            publicUsername = UserObject.getPublicUsername(user);
                            j3 = user.id;
                            if (TextUtils.isEmpty(publicUsername)) {
                                arrayList6.add(user);
                                longSparseArray.put(user, j3);
                            } else {
                                arrayList6.add(user);
                                longSparseArray.put(user, j3);
                            }
                        } else {
                            String str1111 = user.first_name;
                            String str1112 = user.last_name;
                            publicUsername = UserObject.getPublicUsername(user);
                            j3 = user.id;
                            if (TextUtils.isEmpty(publicUsername)) {
                                arrayList6.add(user);
                                longSparseArray.put(user, j3);
                            } else {
                                arrayList6.add(user);
                                longSparseArray.put(user, j3);
                            }
                        }
                    }
                } else if (!TextUtils.isEmpty(lowerCase)) {
                    if (lowerCase.length() == 0) {
                        arrayList6.add(chat2);
                    } else {
                        String str1113 = chat2.title;
                        str6 = chat2.username;
                        j2 = chat2.id;
                        if (TextUtils.isEmpty(str6)) {
                            arrayList6.add(chat2);
                            longSparseArray.put(chat2, j2);
                        } else {
                            arrayList6.add(chat2);
                            longSparseArray.put(chat2, j2);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList6, new Comparator() {
            @Override
            public final int compare(Object obj6, Object obj7) {
                TLObject tLObject = (TLObject) obj6;
                TLObject tLObject2 = (TLObject) obj7;
                long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : -((TLRPC.Chat) tLObject).id;
                long j11 = tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : -((TLRPC.Chat) tLObject2).id;
                LongSparseArray longSparseArray6 = longSparseArray;
                if (longSparseArray6.indexOfKey(j10) >= 0 && longSparseArray6.indexOfKey(j11) >= 0) {
                    return 0;
                }
                if (longSparseArray6.indexOfKey(j10) >= 0) {
                    return -1;
                }
                if (longSparseArray6.indexOfKey(j11) >= 0) {
                    return 1;
                }
                Long lValueOf = Long.valueOf(j10);
                ArrayList arrayList1114 = arrayList1113;
                int iIndexOf2 = arrayList1114.indexOf(lValueOf);
                int iIndexOf3 = arrayList1114.indexOf(Long.valueOf(j11));
                if (iIndexOf2 != -1 && iIndexOf3 != -1) {
                    if (iIndexOf2 < iIndexOf3) {
                        return -1;
                    }
                    return iIndexOf2 == iIndexOf3 ? 0 : 1;
                }
                if (iIndexOf2 == -1 || iIndexOf3 != -1) {
                    return (iIndexOf2 != -1 || iIndexOf3 == -1) ? 0 : 1;
                }
                return -1;
            }
        });
        this.searchResultHashtags = null;
        this.stickers = null;
        this.quickReplies = null;
        this.searchResultCommands = null;
        this.searchResultCommandsEphemeral = null;
        this.searchResultCommandsHelp = null;
        this.searchResultCommandsUsers = null;
        this.searchResultSuggestions = null;
        if (chat == null) {
        }
        showUsersResult(longSparseArray, arrayList6, true);
    }

    public final void setAllowStickers(boolean z) {
        this.allowStickers = z;
    }

    public final void setChatInfo(TLRPC.ChatFull chatFull) {
        ChatActivity chatActivity;
        TLRPC.Chat chat;
        this.currentAccount = UserConfig.selectedAccount;
        this.info = chatFull;
        if (!this.inlineMediaEnabled && this.foundContextBot != null && (chatActivity = this.parentFragment) != null && (chat = chatActivity.currentChat) != null) {
            boolean zCanSendStickers = ChatObject.canSendStickers(chat);
            this.inlineMediaEnabled = zCanSendStickers;
            if (zCanSendStickers) {
                this.searchResultUsernames = null;
                notifyDataSetChanged();
                this.delegate.needChangePanelVisibility(false);
                processFoundUser(this.foundContextBot);
            }
        }
        String str = this.lastText;
        if (str != null) {
            searchUsernameOrHashtag(str, this.lastPosition, this.messages, this.lastUsernameOnly, this.lastForSearch);
        }
    }

    public final void setParentFragment(ChatActivity chatActivity) {
        this.parentFragment = chatActivity;
    }

    public final void showUsersResult(LongSparseArray longSparseArray, ArrayList arrayList, boolean z) {
        this.searchResultUsernames = arrayList;
        if (!this.allowBots || !this.allowChats) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.allowChats) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || UserObject.isService(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.searchResultUsernamesMap = longSparseArray;
        RemoteUtils$$ExternalSyntheticLambda2 remoteUtils$$ExternalSyntheticLambda2 = this.cancelDelayRunnable;
        if (remoteUtils$$ExternalSyntheticLambda2 != null) {
            AndroidUtilities.cancelRunOnUIThread(remoteUtils$$ExternalSyntheticLambda2);
            this.cancelDelayRunnable = null;
        }
        this.searchResultBotContext = null;
        this.stickers = null;
        if (z) {
            notifyDataSetChanged();
            this.delegate.needChangePanelVisibility(!this.searchResultUsernames.isEmpty());
        }
    }
}
