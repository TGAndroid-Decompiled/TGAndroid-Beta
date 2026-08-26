package org.telegram.ui.Stars;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.QueryProductDetailsParams$Product;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda46;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda24;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda22;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda15;
import org.telegram.ui.Stories.StealthModeAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.bots.BotStorage$$ExternalSyntheticLambda5;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda46;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.web.AddressBarList$$ExternalSyntheticLambda1;

public final class StarsController {
    public static volatile StarsController[][] Instance = (StarsController[][]) Array.newInstance((Class<?>) StarsController.class, 2, 4);
    public static final Object[][] lockObjects = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean balanceLoaded;
    public boolean balanceLoading;
    public final int currentAccount;
    public PaidMessagesToast currentPaidMessagesToast;
    public PendingPaidReactions currentPendingReactions;
    public ArrayList giftOptions;
    public boolean giftOptionsLoaded;
    public boolean giftOptionsLoading;
    public boolean giftsCacheLoaded;
    public int giftsHash;
    public boolean giftsLoaded;
    public boolean giftsLoading;
    public long giftsRemoteTime;
    public ArrayList giveawayOptions;
    public boolean giveawayOptionsLoaded;
    public boolean giveawayOptionsLoading;
    public boolean insufficientSubscriptionsLoading;
    public long lastBalanceLoaded;
    public long minus;
    public ArrayList options;
    public boolean optionsLoaded;
    public boolean optionsLoading;
    public boolean subscriptionsEndReached;
    public boolean subscriptionsLoading;
    public String subscriptionsOffset;
    public final boolean ton;
    public TL_stars.StarsAmount balance = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] transactions = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] transactionsExist = new boolean[3];
    public final String[] offset = new String[3];
    public final boolean[] loading = new boolean[3];
    public final boolean[] endReached = new boolean[3];
    public final ArrayList subscriptions = new ArrayList();
    public final ArrayList insufficientSubscriptions = new ArrayList();
    public final ArrayList gifts = new ArrayList();
    public final ArrayList sortedGifts = new ArrayList();
    public final ArrayList birthdaySortedGifts = new ArrayList();
    public final LongSparseArray giftCollections = new LongSparseArray();
    public final LongSparseArray giftLists = new LongSparseArray();
    public final ConcurrentHashMap giftPreviews = new ConcurrentHashMap();
    public final ConcurrentHashMap justAgreedToNotAskDialogs = new ConcurrentHashMap();
    public final ConcurrentHashMap sendingMessagesCount = new ConcurrentHashMap();
    public final Set sendingPaidMessagesIds = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ConcurrentHashMap postponedPaidMessages = new ConcurrentHashMap();

    public final class GiftsCollections {
        public GiftsList all;
        public boolean creating;
        public final int currentAccount;
        public final long dialogId;
        public boolean loaded;
        public boolean loading;
        public boolean shown;
        public final ArrayList collections = new ArrayList();
        public final ArrayList filteredCollections = new ArrayList();
        public final HashMap gifts = new HashMap();
        public int currentRequestId = -1;

        public GiftsCollections(int i, long j) {
            this.currentAccount = i;
            this.dialogId = j;
            load();
        }

        public final void addGifts(int i, ArrayList arrayList) {
            int i2 = 0;
            int i3 = 1;
            if (arrayList.isEmpty()) {
                return;
            }
            HashMap map = this.gifts;
            GiftsList giftsList = (GiftsList) map.get(Integer.valueOf(i));
            long j = this.dialogId;
            int i4 = this.currentAccount;
            if (giftsList != null) {
                giftsList.gifts.addAll(0, arrayList);
                giftsList.totalCount = arrayList.size() + giftsList.totalCount;
                NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j), giftsList);
                updateIcon(i);
            }
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(i4).getInputPeer(j);
            updatestargiftcollection.collection_id = i;
            updatestargiftcollection.flags |= 4;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((GiftsList) it.next()).updateGiftsCollections(savedStarGift, i, true);
                }
                GiftsList giftsList2 = this.all;
                if (giftsList2 != null) {
                    giftsList2.updateGiftsCollections(savedStarGift, i, true);
                }
                if (savedStarGift.msg_id > 0) {
                    TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                    tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                    updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
                } else if (savedStarGift.saved_id != 0) {
                    TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                    tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i4).getInputPeer(j);
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
                } else {
                    FileLog.w("can't convert gift to inputgift to add into the collection");
                }
            }
            ConnectionsManager.getInstance(i4).sendRequest(updatestargiftcollection, new StarsController$GiftsCollections$$ExternalSyntheticLambda1(this, i3));
        }

        public final void createCollection(String str, Utilities.Callback callback) {
            if (this.creating) {
                return;
            }
            this.creating = true;
            TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
            tL_starGiftCollection.collection_id = -1;
            tL_starGiftCollection.title = str;
            this.collections.add(tL_starGiftCollection);
            refilterCollections();
            int i = this.currentAccount;
            long j = this.dialogId;
            GiftsList giftsList = new GiftsList(i, j, false);
            giftsList.isCollection = true;
            giftsList.collectionId = -1;
            giftsList.totalCount = 0;
            giftsList.endReached = true;
            this.gifts.put(-1, giftsList);
            TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
            createstargiftcollection.peer = MessagesController.getInstance(i).getInputPeer(j);
            createstargiftcollection.title = str;
            ConnectionsManager.getInstance(i).sendRequest(createstargiftcollection, new GiftSheet$$ExternalSyntheticLambda16(7, this, tL_starGiftCollection, giftsList, callback));
        }

        public final TL_stars.TL_starGiftCollection findById(int i) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.collections;
                if (i2 >= arrayList.size()) {
                    return null;
                }
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i2);
                if (i == tL_starGiftCollection.collection_id) {
                    return tL_starGiftCollection;
                }
                i2++;
            }
        }

        public final ArrayList getCollections() {
            return isMine() ? this.collections : this.filteredCollections;
        }

        public final int indexOf(int i) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.collections;
                if (i2 >= arrayList.size()) {
                    return -1;
                }
                if (i == ((TL_stars.TL_starGiftCollection) arrayList.get(i2)).collection_id) {
                    return i2;
                }
                i2++;
            }
        }

        public final boolean isMine() {
            int i = this.currentAccount;
            long j = this.dialogId;
            if (j >= 0) {
                return j == 0 || j == UserConfig.getInstance(i).getClientUserId();
            }
            return ChatObject.canUserDoAction(MessagesController.getInstance(i).getChat(Long.valueOf(-j)), 5);
        }

        public final void load() {
            if (this.loading || this.loaded) {
                return;
            }
            this.loading = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            int i = this.currentAccount;
            getstargiftcollections.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
            ArrayList arrayList = this.collections;
            int size = arrayList.size();
            long jCalcHash = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                jCalcHash = MediaDataController.calcHash(jCalcHash, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            getstargiftcollections.hash = jCalcHash;
            this.currentRequestId = ConnectionsManager.getInstance(i).sendRequest(getstargiftcollections, new StarsController$GiftsCollections$$ExternalSyntheticLambda1(this, 0));
        }

        public final void refilterCollections() {
            ArrayList arrayList = this.filteredCollections;
            arrayList.clear();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.collections;
                if (i >= arrayList2.size()) {
                    return;
                }
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i);
                if (tL_starGiftCollection.gifts_count > 0) {
                    arrayList.add(tL_starGiftCollection);
                }
                i++;
            }
        }

        public final void removeGifts(int i, ArrayList arrayList) {
            boolean z = false;
            int i2 = 1;
            if (arrayList.isEmpty()) {
                return;
            }
            HashMap map = this.gifts;
            GiftsList giftsList = (GiftsList) map.get(Integer.valueOf(i));
            if (giftsList != null) {
                ArrayList arrayList2 = giftsList.gifts;
                if (!arrayList2.isEmpty()) {
                    int i3 = 0;
                    while (i3 < arrayList2.size()) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            if (StarsController.eq(savedStarGift, (TL_stars.SavedStarGift) arrayList.get(i4))) {
                                arrayList2.remove(i3);
                                giftsList.totalCount = Math.max(0, giftsList.totalCount - 1);
                                i3--;
                                break;
                            }
                        }
                        i3++;
                    }
                }
            }
            updateIcon(i);
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            int i5 = this.currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i5);
            long j = this.dialogId;
            updatestargiftcollection.peer = messagesController.getInputPeer(j);
            updatestargiftcollection.collection_id = i;
            updatestargiftcollection.flags |= 2;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6 += i2;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((GiftsList) it.next()).updateGiftsCollections(savedStarGift2, i, z);
                }
                GiftsList giftsList2 = this.all;
                if (giftsList2 != null) {
                    giftsList2.updateGiftsCollections(savedStarGift2, i, z);
                }
                if (savedStarGift2.msg_id > 0) {
                    TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                    tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
                    updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
                } else if (savedStarGift2.saved_id != 0) {
                    TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                    tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i5).getInputPeer(j);
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift2.saved_id;
                    updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
                } else {
                    FileLog.w("can't convert gift to inputgift to add into the collection");
                }
                map = map;
                z = false;
                i2 = 1;
            }
            updatestargiftcollection.delete_stargift.size();
            ConnectionsManager.getInstance(i5).sendRequest(updatestargiftcollection, new StarsController$GiftsCollections$$ExternalSyntheticLambda1(this, 2));
            NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j), giftsList);
        }

        public final void updateGiftsUnsaved(TL_stars.SavedStarGift savedStarGift, boolean z) {
            Iterator it = this.gifts.values().iterator();
            while (it.hasNext()) {
                ((GiftsList) it.next()).updateGiftsUnsaved(savedStarGift, z);
            }
            GiftsList giftsList = this.all;
            if (giftsList != null) {
                giftsList.updateGiftsUnsaved(savedStarGift, z);
            }
        }

        public final void updateIcon(int i) {
            GiftsList giftsList = (GiftsList) this.gifts.get(Integer.valueOf(i));
            TL_stars.TL_starGiftCollection tL_starGiftCollectionFindById = findById(i);
            if (giftsList == null || tL_starGiftCollectionFindById == null) {
                return;
            }
            ArrayList arrayList = giftsList.gifts;
            TL_stars.SavedStarGift savedStarGift = arrayList.isEmpty() ? null : (TL_stars.SavedStarGift) arrayList.get(0);
            if (savedStarGift == null) {
                tL_starGiftCollectionFindById.flags &= -2;
                tL_starGiftCollectionFindById.icon = null;
            } else {
                tL_starGiftCollectionFindById.flags |= 1;
                tL_starGiftCollectionFindById.icon = savedStarGift.gift.getDocument();
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.dialogId), this);
        }
    }

    public final class GiftsList implements IGiftsList {
        public Boolean chat_notifications_enabled;
        public int collectionId;
        public final int currentAccount;
        public final long dialogId;
        public boolean endReached;
        public String lastOffset;
        public boolean loading;
        public ArrayList savedPinnedState;
        public boolean shown;
        public int totalCount;
        public boolean isCollection = false;
        public boolean sort_by_date = true;
        public boolean peer_color_available = false;
        public int includeFlags = 783;
        public final ArrayList gifts = new ArrayList();
        public int currentRequestId = -1;
        public long craftingGiftId = 0;

        public GiftsList(int i, long j, boolean z) {
            this.currentAccount = i;
            this.dialogId = j;
            if (z) {
                load();
            }
        }

        @Override
        public final int findGiftToUpgrade(int i) {
            if (!StarGiftSheet.isMineWithActions(this.currentAccount, this.dialogId)) {
                return -1;
            }
            int i2 = i + 1;
            while (true) {
                ArrayList arrayList = this.gifts;
                if (i2 >= arrayList.size()) {
                    for (int i3 = i - 1; i3 >= 0; i3--) {
                        if (((TL_stars.SavedStarGift) arrayList.get(i3)).can_upgrade) {
                            return i3;
                        }
                    }
                    return -1;
                }
                if (((TL_stars.SavedStarGift) arrayList.get(i2)).can_upgrade) {
                    return i2;
                }
                i2++;
            }
        }

        @Override
        public final Object get(int i) {
            if (i < 0) {
                return null;
            }
            ArrayList arrayList = this.gifts;
            if (i >= arrayList.size()) {
                return null;
            }
            return arrayList.get(i);
        }

        public final TL_stars.InputSavedStarGift getInput(TL_stars.SavedStarGift savedStarGift) {
            if (savedStarGift == null) {
                return null;
            }
            if ((savedStarGift.flags & 8) != 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                return tL_inputSavedStarGiftUser;
            }
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
            return tL_inputSavedStarGiftChat;
        }

        @Override
        public final int getLoadedCount() {
            return this.gifts.size();
        }

        public final ArrayList getPinned() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.gifts;
                if (i >= arrayList2.size()) {
                    return arrayList;
                }
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i);
                if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                    arrayList.add(savedStarGift);
                }
                i++;
            }
        }

        @Override
        public final int getTotalCount() {
            return this.totalCount;
        }

        @Override
        public final int indexOf(Object obj) {
            return this.gifts.indexOf(obj);
        }

        public final void invalidate(boolean z) {
            if (this.currentRequestId != -1) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentRequestId, true);
                this.currentRequestId = -1;
            }
            this.loading = false;
            this.gifts.clear();
            this.lastOffset = null;
            this.endReached = false;
            if (z || this.shown) {
                load();
            }
        }

        @Override
        public final void load() {
            TLObject tLObject;
            if (this.loading || this.endReached) {
                return;
            }
            boolean z = this.lastOffset == null;
            this.loading = true;
            long j = this.craftingGiftId;
            int i = this.currentAccount;
            if (j != 0) {
                TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
                getcraftstargifts.gift_id = this.craftingGiftId;
                getcraftstargifts.offset = z ? "" : this.lastOffset;
                getcraftstargifts.limit = z ? 15 : 30;
                tLObject = getcraftstargifts;
            } else {
                TL_stars.getSavedStarGifts getsavedstargifts = new TL_stars.getSavedStarGifts();
                getsavedstargifts.sort_by_value = !this.sort_by_date;
                getsavedstargifts.exclude_unupgradable = !TLObject.hasFlag(this.includeFlags, 2);
                getsavedstargifts.exclude_upgradable = !TLObject.hasFlag(this.includeFlags, 4);
                getsavedstargifts.exclude_unlimited = !TLObject.hasFlag(this.includeFlags, 1);
                getsavedstargifts.exclude_unique = !TLObject.hasFlag(this.includeFlags, 8);
                getsavedstargifts.exclude_saved = !TLObject.hasFlag(this.includeFlags, 256);
                getsavedstargifts.exclude_unsaved = !TLObject.hasFlag(this.includeFlags, 512);
                getsavedstargifts.peer_color_available = this.peer_color_available;
                long j2 = this.dialogId;
                if (j2 == 0) {
                    getsavedstargifts.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    getsavedstargifts.peer = MessagesController.getInstance(i).getInputPeer(j2);
                }
                getsavedstargifts.offset = z ? "" : this.lastOffset;
                getsavedstargifts.limit = z ? Math.max(MessagesController.getInstance(i).stargiftsPinnedToTopLimit, 15) : 30;
                tLObject = getsavedstargifts;
                if (this.isCollection) {
                    getsavedstargifts.flags |= 64;
                    getsavedstargifts.collection_id = this.collectionId;
                    tLObject = getsavedstargifts;
                }
            }
            int iSendRequest = ConnectionsManager.getInstance(i).sendRequest(tLObject, new SearchAdapterHelper$$ExternalSyntheticLambda0(this, , z, 1));
            this.currentRequestId = iSendRequest;
            ?? r2 = {iSendRequest};
        }

        @Override
        public final void notifyUpdate() {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
        }

        public final void processCrafting(ArrayList arrayList, TL_stars.StarGift starGift) {
            int i = this.currentAccount;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                boolean z = false;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.gifts;
                        if (i3 < arrayList2.size()) {
                            TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i3)).gift;
                            if (starGift3 != null && starGift3.id == starGift2.id) {
                                arrayList2.remove(i3);
                                this.totalCount = Math.max(0, this.totalCount - 1);
                                z = true;
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                }
                if (z) {
                    NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
                }
            }
            if (starGift != null) {
                TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = starGift.slug;
                getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
                ConnectionsManager.getInstance(i).sendRequest(getsavedstargift, new RichMediaUploader$$ExternalSyntheticLambda0(this, 20));
            }
        }

        public final void reorder(int i, int i2) {
            ArrayList arrayList = this.gifts;
            int iClamp = Utilities.clamp(i, arrayList.size() - 1, 0);
            if (iClamp < 0 || iClamp >= arrayList.size()) {
                return;
            }
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(iClamp);
            int iClamp2 = Utilities.clamp(i2, arrayList.size() - 1, 0);
            if (iClamp2 < 0 || iClamp2 >= arrayList.size()) {
                return;
            }
            arrayList.add(iClamp2, savedStarGift);
        }

        public final void sendPinnedOrder() {
            boolean z = this.isCollection;
            int i = 0;
            long j = this.dialogId;
            int i2 = this.currentAccount;
            if (!z) {
                TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
                togglestargiftspinnedtotop.peer = MessagesController.getInstance(i2).getInputPeer(j);
                ArrayList pinned = getPinned();
                int size = pinned.size();
                while (i < size) {
                    Object obj = pinned.get(i);
                    i++;
                    togglestargiftspinnedtotop.stargift.add(getInput((TL_stars.SavedStarGift) obj));
                }
                ConnectionsManager.getInstance(i2).sendRequest(togglestargiftspinnedtotop, new StealthModeAlert$$ExternalSyntheticLambda3(4), 64);
                return;
            }
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(i2).getInputPeer(j);
            updatestargiftcollection.collection_id = this.collectionId;
            updatestargiftcollection.flags |= 8;
            ArrayList arrayList = this.gifts;
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                updatestargiftcollection.order.add(getInput((TL_stars.SavedStarGift) obj2));
            }
            ConnectionsManager.getInstance(i2).sendRequest(updatestargiftcollection, null, 64);
        }

        public final boolean togglePinned(TL_stars.SavedStarGift savedStarGift, boolean z, boolean z2) {
            boolean z3;
            ArrayList arrayList;
            if (savedStarGift != null) {
                ArrayList pinned = getPinned();
                boolean zContains = pinned.contains(savedStarGift);
                int i = this.currentAccount;
                if (zContains) {
                    if (!z) {
                        pinned.remove(savedStarGift);
                        z3 = false;
                        savedStarGift.pinned_to_top = z;
                        arrayList = this.gifts;
                        arrayList.removeAll(pinned);
                        if (this.sort_by_date && !this.isCollection) {
                            Collections.sort(arrayList, new CacheModel$$ExternalSyntheticLambda0(6));
                        }
                        arrayList.addAll(0, pinned);
                        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
                        sendPinnedOrder();
                        return z3;
                    }
                } else if (z) {
                    if (pinned.size() + 1 <= MessagesController.getInstance(i).stargiftsPinnedToTopLimit) {
                        z3 = false;
                    } else {
                        if (!z2) {
                            return true;
                        }
                        while (pinned.size() > 0 && pinned.size() + 1 > MessagesController.getInstance(i).stargiftsPinnedToTopLimit) {
                            ((TL_stars.SavedStarGift) pinned.remove(pinned.size() - 1)).pinned_to_top = false;
                        }
                        z3 = true;
                    }
                    pinned.add(savedStarGift);
                    savedStarGift.pinned_to_top = z;
                    arrayList = this.gifts;
                    arrayList.removeAll(pinned);
                    if (this.sort_by_date) {
                        Collections.sort(arrayList, new CacheModel$$ExternalSyntheticLambda0(6));
                    }
                    arrayList.addAll(0, pinned);
                    NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
                    sendPinnedOrder();
                    return z3;
                }
            }
            return false;
        }

        public final void updateGiftsCollections(TL_stars.SavedStarGift savedStarGift, int i, boolean z) {
            ArrayList arrayList = this.gifts;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
                if (StarsController.eq(savedStarGift2, savedStarGift)) {
                    if (!z) {
                        savedStarGift2.collection_id.remove(Integer.valueOf(i));
                    } else if (!savedStarGift2.collection_id.contains(Integer.valueOf(i))) {
                        savedStarGift2.collection_id.add(Integer.valueOf(i));
                    }
                }
            }
        }

        public final void updateGiftsUnsaved(TL_stars.SavedStarGift savedStarGift, boolean z) {
            ArrayList arrayList = this.gifts;
            int size = arrayList.size();
            int i = 0;
            boolean z2 = false;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
                if (StarsController.eq(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z) {
                    savedStarGift2.unsaved = z;
                    z2 = true;
                }
            }
            if (z2) {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
            }
        }
    }

    public interface IGiftsList {
        int findGiftToUpgrade(int i);

        Object get(int i);

        int getLoadedCount();

        int getTotalCount();

        int indexOf(Object obj);

        void load();

        void notifyUpdate();
    }

    public final class MessageId {
        public final long did;
        public final int mid;

        public MessageId(long j, int i) {
            this.did = j;
            this.mid = i;
        }

        public static MessageId from(int i, long j) {
            return new MessageId(j, i);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof MessageId) {
                MessageId messageId = (MessageId) obj;
                if (messageId.did == this.did && messageId.mid == this.mid) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.did), Integer.valueOf(this.mid));
        }

        public static MessageId from(MessageObject messageObject) {
            if (messageObject == null) {
                return null;
            }
            TLRPC.Message message = messageObject.messageOwner;
            return (message == null || !(message.isThreadMessage || messageObject.isForwardedChannelPost()) || messageObject.messageOwner.fwd_from == null) ? new MessageId(messageObject.getDialogId(), messageObject.getId()) : new MessageId(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
    }

    public final class PaidMessagesToast {
        public final Bulletin bulletin;
        public final Bulletin.UndoButton bulletinButton;
        public final Bulletin.TwoLineAnimatedLottieLayout bulletinLayout;
        public final long dialogId;
        public final BaseFragment fragment;
        public final StarsController$PaidMessagesToast$$ExternalSyntheticLambda0 sendRunnable;
        public boolean sent;
        public final Bulletin.TimerView timerView;
        public int totalMessagesCount;
        public long totalStars;
        public AddressBarList$$ExternalSyntheticLambda1 undoListener;
        public boolean undone;
        public final ArrayList totalSendListeners = new ArrayList();
        public final HashSet messages = new HashSet();
        public final long startTime = System.currentTimeMillis();
        public boolean undoRunning = true;

        public PaidMessagesToast(StarsController starsController, BaseFragment baseFragment, long j) {
            final int i = 0;
            ?? r2 = new Runnable(this) {
                public final StarsController.PaidMessagesToast f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i) {
                        case 0:
                            this.f$0.send();
                            break;
                        default:
                            StarsController.PaidMessagesToast paidMessagesToast = this.f$0;
                            if (!paidMessagesToast.undone && !paidMessagesToast.sent && paidMessagesToast.undoRunning) {
                                paidMessagesToast.undone = true;
                                AddressBarList$$ExternalSyntheticLambda1 addressBarList$$ExternalSyntheticLambda1 = paidMessagesToast.undoListener;
                                if (addressBarList$$ExternalSyntheticLambda1 != null) {
                                    addressBarList$$ExternalSyntheticLambda1.run(paidMessagesToast.messages);
                                }
                                if (paidMessagesToast.bulletinButton != null) {
                                    paidMessagesToast.bulletin.hide();
                                }
                                break;
                            }
                            break;
                    }
                }
            };
            this.sendRunnable = r2;
            this.fragment = baseFragment;
            this.dialogId = j;
            starsController.getClass();
            Context context = StarsController.getContext(baseFragment);
            Bulletin.TwoLineAnimatedLottieLayout twoLineAnimatedLottieLayout = new Bulletin.TwoLineAnimatedLottieLayout(context, baseFragment.getResourceProvider());
            this.bulletinLayout = twoLineAnimatedLottieLayout;
            twoLineAnimatedLottieLayout.setAnimation(R.raw.stars_topup, new String[0]);
            Bulletin.TimerView timerView = new Bulletin.TimerView(context, baseFragment.getResourceProvider());
            this.timerView = timerView;
            timerView.timeLeft = 3000L;
            timerView.setColor(Theme.getColor(Theme.key_undo_cancelColor, baseFragment.getResourceProvider()));
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context, true, false, baseFragment.getResourceProvider());
            this.bulletinButton = undoButton;
            undoButton.setText(LocaleController.getString(R.string.StarsSentUndo));
            final int i2 = 1;
            undoButton.setUndoAction(new Runnable(this) {
                public final StarsController.PaidMessagesToast f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f$0.send();
                            break;
                        default:
                            StarsController.PaidMessagesToast paidMessagesToast = this.f$0;
                            if (!paidMessagesToast.undone && !paidMessagesToast.sent && paidMessagesToast.undoRunning) {
                                paidMessagesToast.undone = true;
                                AddressBarList$$ExternalSyntheticLambda1 addressBarList$$ExternalSyntheticLambda1 = paidMessagesToast.undoListener;
                                if (addressBarList$$ExternalSyntheticLambda1 != null) {
                                    addressBarList$$ExternalSyntheticLambda1.run(paidMessagesToast.messages);
                                }
                                if (paidMessagesToast.bulletinButton != null) {
                                    paidMessagesToast.bulletin.hide();
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            undoButton.addView(timerView, LayoutHelper.createFrame(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            undoButton.undoTextView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            twoLineAnimatedLottieLayout.setButton(undoButton);
            Bulletin bulletinCreate = BulletinFactory.of(baseFragment).create(twoLineAnimatedLottieLayout, -1);
            this.bulletin = bulletinCreate;
            bulletinCreate.hideAfterBottomSheet = false;
            bulletinCreate.show(true);
            final int i3 = 0;
            bulletinCreate.setOnHideListener(new Runnable(this) {
                public final StarsController.PaidMessagesToast f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i3) {
                        case 0:
                            this.f$0.send();
                            break;
                        default:
                            StarsController.PaidMessagesToast paidMessagesToast = this.f$0;
                            if (!paidMessagesToast.undone && !paidMessagesToast.sent && paidMessagesToast.undoRunning) {
                                paidMessagesToast.undone = true;
                                AddressBarList$$ExternalSyntheticLambda1 addressBarList$$ExternalSyntheticLambda1 = paidMessagesToast.undoListener;
                                if (addressBarList$$ExternalSyntheticLambda1 != null) {
                                    addressBarList$$ExternalSyntheticLambda1.run(paidMessagesToast.messages);
                                }
                                if (paidMessagesToast.bulletinButton != null) {
                                    paidMessagesToast.bulletin.hide();
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            AndroidUtilities.cancelRunOnUIThread(r2);
            AndroidUtilities.runOnUIThread(r2, 3000L);
        }

        public final void send() {
            if (this.undone || this.sent) {
                return;
            }
            this.sent = true;
            ArrayList arrayList = this.totalSendListeners;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
            if (this.bulletinButton != null) {
                this.bulletin.hide();
            }
        }
    }

    public final class PendingPaidReactions {
        public long amount;
        public boolean applied;
        public final Bulletin bulletin;
        public final Bulletin.TwoLineAnimatedLottieLayout bulletinLayout;
        public final ChatActivity chatActivity;
        public final StarsReactionsSheet$$ExternalSyntheticLambda13 closeRunnable;
        public final MessageId message;
        public final MessageObject messageObject;
        public long not_added;
        public StarReactionsOverlay overlay;
        public boolean shownBulletin;
        public final Bulletin.TimerView timerView;
        public final boolean wasChosen;
        public boolean committed = false;
        public boolean cancelled = false;
        public Long peer = null;

        public PendingPaidReactions(MessageId messageId, MessageObject messageObject, ChatActivity chatActivity, boolean z) {
            StarsReactionsSheet$$ExternalSyntheticLambda13 starsReactionsSheet$$ExternalSyntheticLambda13 = new StarsReactionsSheet$$ExternalSyntheticLambda13(this, 1);
            this.closeRunnable = starsReactionsSheet$$ExternalSyntheticLambda13;
            this.message = messageId;
            this.messageObject = messageObject;
            this.chatActivity = chatActivity;
            StarsController.this.getClass();
            Context context = StarsController.getContext(chatActivity);
            Bulletin.TwoLineAnimatedLottieLayout twoLineAnimatedLottieLayout = new Bulletin.TwoLineAnimatedLottieLayout(context, chatActivity.themeDelegate);
            this.bulletinLayout = twoLineAnimatedLottieLayout;
            twoLineAnimatedLottieLayout.setAnimation(R.raw.stars_topup, new String[0]);
            twoLineAnimatedLottieLayout.titleTextView.setText(getToastTitle());
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context, true, false, chatActivity.themeDelegate);
            undoButton.setText(LocaleController.getString(R.string.StarsSentUndo));
            undoButton.setUndoAction(new StarsReactionsSheet$$ExternalSyntheticLambda13(this, 2));
            Bulletin.TimerView timerView = new Bulletin.TimerView(context, chatActivity.themeDelegate);
            this.timerView = timerView;
            timerView.timeLeft = 5000L;
            timerView.setColor(Theme.getColor(Theme.key_undo_cancelColor, chatActivity.themeDelegate));
            undoButton.addView(timerView, LayoutHelper.createFrame(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            undoButton.undoTextView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            twoLineAnimatedLottieLayout.setButton(undoButton);
            Bulletin bulletinCreate = BulletinFactory.of(chatActivity).create(twoLineAnimatedLottieLayout, -1);
            this.bulletin = bulletinCreate;
            bulletinCreate.hideAfterBottomSheet = false;
            if (z) {
                bulletinCreate.show(true);
                this.shownBulletin = true;
            }
            bulletinCreate.setOnHideListener(starsReactionsSheet$$ExternalSyntheticLambda13);
            this.amount = 0L;
            System.currentTimeMillis();
            this.wasChosen = messageObject.isPaidReactionChosen();
        }

        public final void cancel() {
            AndroidUtilities.cancelRunOnUIThread(this.closeRunnable);
            this.cancelled = true;
            this.bulletin.hide();
            StarReactionsOverlay starReactionsOverlay = this.overlay;
            if (starReactionsOverlay != null) {
                starReactionsOverlay.hide();
            }
            int i = (int) (-this.amount);
            long peerId = getPeerId();
            MessageObject messageObject = this.messageObject;
            messageObject.addPaidReactions(i, this.wasChosen, peerId);
            StarsController starsController = StarsController.this;
            starsController.minus -= this.amount;
            int i2 = starsController.currentAccount;
            NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
            if (starsController.currentPendingReactions == this) {
                starsController.currentPendingReactions = null;
            }
        }

        public final void close() {
            MessageObject messageObject;
            String forcedFirstName;
            AndroidUtilities.cancelRunOnUIThread(this.closeRunnable);
            int i = 0;
            if (!this.applied) {
                this.cancelled = true;
                this.messageObject.addPaidReactions((int) (-this.amount), this.wasChosen, getPeerId());
                StarsController starsController = StarsController.this;
                starsController.minus -= this.amount;
                NotificationCenter.getInstance(starsController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else if (!this.committed && !this.cancelled) {
                StarsController starsController2 = StarsController.getInstance(StarsController.this.currentAccount, false);
                MessagesController messagesController = MessagesController.getInstance(StarsController.this.currentAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(StarsController.this.currentAccount);
                long j = this.amount;
                if (!starsController2.balanceLoaded || starsController2.getBalance(null, false, false).amount >= j) {
                    this.committed = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.message.did);
                    tL_messages_sendPaidReaction.msg_id = this.message.mid;
                    tL_messages_sendPaidReaction.random_id = (((long) connectionsManager.getCurrentTime()) << 32) | (Utilities.random.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.amount;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long peerId = getPeerId();
                    if (peerId == 0 || peerId == UserConfig.getInstance(StarsController.this.currentAccount).getClientUserId()) {
                        tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                    } else if (peerId == 2666000) {
                        tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                    } else {
                        TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                        tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                        paidreactionprivacypeer.peer = messagesController.getInputPeer(peerId);
                    }
                    StarsController.this.invalidateBalance();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new LivePlayer$$ExternalSyntheticLambda15(this, messagesController, j, 4));
                } else {
                    this.cancelled = true;
                    this.messageObject.addPaidReactions((int) (-this.amount), this.wasChosen, getPeerId());
                    StarsController starsController3 = StarsController.this;
                    starsController3.minus = 0L;
                    NotificationCenter.getInstance(starsController3.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
                    if (this.message.did >= 0) {
                        forcedFirstName = UserObject.getForcedFirstName(this.chatActivity.getMessagesController().getUser(Long.valueOf(this.message.did)));
                    } else {
                        TLRPC.Chat chat = this.chatActivity.getMessagesController().getChat(Long.valueOf(-this.message.did));
                        forcedFirstName = chat == null ? "" : chat.title;
                    }
                    String str = forcedFirstName;
                    Context context = this.chatActivity.getContext();
                    if (context == null) {
                        context = LaunchActivity.instance;
                    }
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                    new StarsIntroActivity.StarsNeededSheet(context, this.chatActivity.getResourceProvider(), j, 5, str, new StarsController$PendingPaidReactions$$ExternalSyntheticLambda0(this, j, i), 0L).show();
                }
            }
            this.bulletin.hide();
            StarReactionsOverlay starReactionsOverlay = this.overlay;
            if (starReactionsOverlay != null && (messageObject = this.messageObject) != null && messageObject.getId() == starReactionsOverlay.messageId) {
                this.overlay.hide();
            }
            StarsController starsController4 = StarsController.this;
            if (starsController4.currentPendingReactions == this) {
                starsController4.currentPendingReactions = null;
            }
        }

        public final long getPeerId() {
            Long l = this.peer;
            return l != null ? l.longValue() : StarsController.this.getPaidReactionsDialogId(this.messageObject);
        }

        public final String getToastTitle() {
            if (getPeerId() == 2666000) {
                return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
            }
            return (getPeerId() == 0 || getPeerId() == UserConfig.getInstance(StarsController.this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.StarsSentTitle) : LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(getPeerId()));
        }
    }

    static {
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                lockObjects[i][i2] = new Object();
            }
        }
    }

    public StarsController(int i, boolean z) {
        this.currentAccount = i;
        this.ton = z;
    }

    public static void bulletinError(String str) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        zzkh.m(R.string.UnknownErrorCode, new Object[]{str}, (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment), R.raw.error);
    }

    public static boolean eq(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i = savedStarGift.flags;
        if ((i & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            return ((i & 8) == 0 || (savedStarGift2.flags & 8) == 0 || savedStarGift.msg_id != savedStarGift2.msg_id) ? false : true;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute findAttribute(ArrayList arrayList, Class cls) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                return (TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute);
            }
        }
        return null;
    }

    public static ArrayList findAttributes(ArrayList arrayList, Class cls) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                arrayList2.add((TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute));
            }
        }
        return arrayList2;
    }

    public static long getAllowedPaidStars(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return ((TLRPC.TL_messages_sendMessage) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            return ((TLRPC.TL_messages_sendMultiMedia) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            return ((TLRPC.TL_messages_sendInlineBotResult) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject;
            return tL_messages_forwardMessages.allow_paid_stars / ((long) tL_messages_forwardMessages.id.size());
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        }
        return 0L;
    }

    public static Context getContext(BaseFragment baseFragment) {
        if (baseFragment != null && baseFragment.getContext() != null) {
            return baseFragment.getContext();
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

    public static StarsController getInstance(int i) {
        return getInstance(i, false);
    }

    public static Theme.ResourcesProvider getResourceProvider() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            return safeLastFragment.getResourceProvider();
        }
        return null;
    }

    public static StarsController getTonInstance(int i) {
        return getInstance(i, true);
    }

    public static boolean isEnoughAmount(int i, AmountUtils$Amount amountUtils$Amount) {
        return amountUtils$Amount == null || getInstance(i, amountUtils$Amount.currency).getBalanceAmount().nanos >= amountUtils$Amount.nanos;
    }

    public static void showNoSupportDialog(Context context, Theme.ResourcesProvider resourcesProvider) {
        ChatActivity$$ExternalSyntheticOutline0.m(R.string.OK, new AlertDialog.Builder(context, 0, resourcesProvider).setTitle(LocaleController.getString(R.string.StarsNotAvailableTitle)).setMessage(LocaleController.getString(R.string.StarsNotAvailableText)), null);
    }

    public final boolean beforeSendingFinalRequest(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList.isEmpty() || getAllowedPaidStars(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int id = ((MessageObject) obj).getId();
            hashSet.add(Integer.valueOf(id));
            if (this.sendingPaidMessagesIds.remove(Integer.valueOf(id))) {
                this.postponedPaidMessages.put(Integer.valueOf(id), new StarGiftSheet$$ExternalSyntheticLambda66(this, hashSet, runnable, 24));
                z = true;
            }
        }
        return !z;
    }

    public final void beforeSendingMessage(MessageObject messageObject) {
        Long l;
        Integer num;
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return;
        }
        long j = message.paid_message_stars;
        if (j <= 0 || messageObject.isEphemeral()) {
            return;
        }
        PaidMessagesToast paidMessagesToast = this.currentPaidMessagesToast;
        boolean z = !(paidMessagesToast == null || paidMessagesToast.totalMessagesCount <= 0 || !paidMessagesToast.undoRunning || paidMessagesToast.undone || paidMessagesToast.sent) || (!AlertsCreator.needsPaidMessageAlert(this.currentAccount, messageObject.getDialogId()) && (((l = (Long) this.justAgreedToNotAskDialogs.get(Long.valueOf(messageObject.getDialogId()))) == null || System.currentTimeMillis() - l.longValue() <= 5000) && (((num = (Integer) this.sendingMessagesCount.get(Long.valueOf(messageObject.getDialogId()))) != null && num.intValue() >= 3) || j >= 100)));
        int id = messageObject.getId();
        if (z) {
            this.sendingPaidMessagesIds.add(Integer.valueOf(id));
        }
        long dialogId = messageObject.getDialogId();
        AddressBarList$$ExternalSyntheticLambda1 addressBarList$$ExternalSyntheticLambda1 = new AddressBarList$$ExternalSyntheticLambda1(this, z, 1);
        StarsController$$ExternalSyntheticLambda31 starsController$$ExternalSyntheticLambda31 = new StarsController$$ExternalSyntheticLambda31(this, z, id);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        PaidMessagesToast paidMessagesToast2 = this.currentPaidMessagesToast;
        if (paidMessagesToast2 != null && (paidMessagesToast2.sent || paidMessagesToast2.undone)) {
            this.currentPaidMessagesToast = null;
        }
        if (this.currentPaidMessagesToast != null) {
            if (safeLastFragment == null || safeLastFragment.isRemovingFromStack()) {
                this.currentPaidMessagesToast.send();
                this.currentPaidMessagesToast = null;
            } else {
                PaidMessagesToast paidMessagesToast3 = this.currentPaidMessagesToast;
                if (paidMessagesToast3.dialogId != dialogId || paidMessagesToast3.fragment != safeLastFragment) {
                    this.currentPaidMessagesToast.send();
                    this.currentPaidMessagesToast = null;
                }
            }
        }
        if (safeLastFragment == null || safeLastFragment.isRemovingFromStack()) {
            starsController$$ExternalSyntheticLambda31.run();
            return;
        }
        if (this.currentPaidMessagesToast == null) {
            this.currentPaidMessagesToast = new PaidMessagesToast(this, safeLastFragment, dialogId);
        }
        PaidMessagesToast paidMessagesToast4 = this.currentPaidMessagesToast;
        if (paidMessagesToast4.undone || paidMessagesToast4.sent) {
            starsController$$ExternalSyntheticLambda31.run();
            return;
        }
        paidMessagesToast4.totalMessagesCount++;
        paidMessagesToast4.messages.add(messageObject);
        paidMessagesToast4.totalStars += j;
        paidMessagesToast4.undoListener = addressBarList$$ExternalSyntheticLambda1;
        paidMessagesToast4.totalSendListeners.add(starsController$$ExternalSyntheticLambda31);
        boolean z2 = paidMessagesToast4.undoRunning;
        StarsController$PaidMessagesToast$$ExternalSyntheticLambda0 starsController$PaidMessagesToast$$ExternalSyntheticLambda0 = paidMessagesToast4.sendRunnable;
        if (z2 && !z) {
            paidMessagesToast4.undoRunning = false;
            AndroidUtilities.cancelRunOnUIThread(starsController$PaidMessagesToast$$ExternalSyntheticLambda0);
            Bulletin bulletin = paidMessagesToast4.bulletin;
            bulletin.setDuration(5000);
            bulletin.setCanHide(true);
            long jCurrentTimeMillis = System.currentTimeMillis() - paidMessagesToast4.startTime;
            Bulletin.UndoButton undoButton = paidMessagesToast4.bulletinButton;
            if (jCurrentTimeMillis > 500) {
                undoButton.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
            } else {
                undoButton.setAlpha(0.0f);
                undoButton.setVisibility(8);
            }
        }
        Bulletin.TimerView timerView = paidMessagesToast4.timerView;
        if (timerView != null && paidMessagesToast4.undoRunning) {
            timerView.timeLeft = 3000L;
            AndroidUtilities.cancelRunOnUIThread(starsController$PaidMessagesToast$$ExternalSyntheticLambda0);
            AndroidUtilities.runOnUIThread(starsController$PaidMessagesToast$$ExternalSyntheticLambda0, 3000L);
        }
        Bulletin.TwoLineAnimatedLottieLayout twoLineAnimatedLottieLayout = paidMessagesToast4.bulletinLayout;
        AnimatedTextView animatedTextView = twoLineAnimatedLottieLayout.titleTextView;
        int i = paidMessagesToast4.totalMessagesCount;
        animatedTextView.setText(i == 1 ? LocaleController.getString(R.string.PaidMessageSentTitleOne) : LocaleController.formatPluralString("PaidMessageSentTitle", i, new Object[0]));
        twoLineAnimatedLottieLayout.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) paidMessagesToast4.totalStars))));
        twoLineAnimatedLottieLayout.imageView.playAnimation();
    }

    public final void buy(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        if (activity == null) {
            return;
        }
        int i = this.currentAccount;
        if (!MessagesController.getInstance(i).starsPurchaseAvailable()) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment == null || lastFragment.getContext() == null) {
                showNoSupportDialog(activity, null);
                return;
            } else {
                showNoSupportDialog(lastFragment.getContext(), lastFragment.getResourceProvider());
                return;
            }
        }
        boolean z = AppGlobalConfig.getInstance(i).starsSpendTopUpInvoiceDisabled.get() && inputPeer != null;
        if ((!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) || z) {
            if (!BillingController.getInstance().isReady()) {
                callback2.run(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
            accountIdentifiers.zzb = "inapp";
            accountIdentifiers.zza = tL_starsTopupOption.store_product;
            QueryProductDetailsParams$Product queryProductDetailsParams$ProductBuild = accountIdentifiers.build();
            FileLog.d("StarsController.buy starts queryProductDetails");
            BillingController.getInstance().queryProductDetails(Arrays.asList(queryProductDetailsParams$ProductBuild), new StarsController$$ExternalSyntheticLambda63(0, callback2, tL_inputStorePaymentStarsTopup, tL_starsTopupOption, activity));
            return;
        }
        TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
        tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
        tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
        tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
        tL_inputStorePaymentStarsTopup2.spend_purpose_peer = inputPeer;
        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup2;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(getResourceProvider(), false);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i).sendRequest(tL_payments_getPaymentForm, new StarGiftSheet$$ExternalSyntheticLambda1(this, callback2, tL_inputInvoiceStars, 12));
    }

    public final void buyPremiumGift(final Utilities.Callback2 callback2, final long j, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities) {
        int i;
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        boolean z = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.balanceLoaded) {
                getBalance(new PhotoViewer$$ExternalSyntheticLambda22(this, callback2, j, tLObject, tL_textWithEntities, 10), true, false);
                return;
            }
            if (z) {
                i = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            }
            final String name = DialogObject.getName(this.currentAccount, j);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
            tL_inputInvoicePremiumGiftStars.months = i;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(resourceProvider, false);
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final StarsController starsController = this.f$0;
                    starsController.getClass();
                    final Utilities.Callback2 callback3 = callback2;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    final Theme.ResourcesProvider resourcesProvider = resourceProvider;
                    final String str = name;
                    final long j2 = j;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            StarsController starsController2 = starsController;
                            starsController2.getClass();
                            TLObject tLObject4 = tLObject2;
                            boolean z2 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            Utilities.Callback2 callback4 = callback3;
                            if (!z2) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                StarsController.bulletinError(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                                callback4.run(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            long j3 = 0;
                            int i2 = 0;
                            while (i2 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i2);
                                i2++;
                                j3 += tL_labeledPrice.amount;
                            }
                            ConnectionsManager.getInstance(starsController2.currentAccount).sendRequest(tL_payments_sendStarsForm, new StarsController$$ExternalSyntheticLambda44(starsController2, callback4, context3, resourcesProvider, j3, str, j2, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void buyResellingGift(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, Utilities.Callback2 callback2) {
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (tL_starGiftUnique == null || context2 == null) {
            return;
        }
        int i = 0;
        if (!this.balanceLoaded) {
            getBalance(new PhotoViewer$$ExternalSyntheticLambda22(this, callback2, tL_payments_paymentFormStarGift, tL_starGiftUnique, j, 12), true, false);
            return;
        }
        String name = DialogObject.getName(this.currentAccount, j);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = tL_starGiftUnique.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_inputInvoiceStarGiftResale.ton = this.ton;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(resourceProvider, false);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags = 1 | tL_payments_getPaymentForm.flags;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftResale;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
        int size = arrayList.size();
        long j2 = 0;
        while (i < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
            i++;
            j2 += tL_labeledPrice.amount;
            arrayList = arrayList;
            context2 = context2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new StarsController$$ExternalSyntheticLambda44(this, callback2, context2, resourceProvider, j2, name, tL_payments_paymentFormStarGift, tL_starGiftUnique, j));
    }

    public final void buyStarGift(final SendGiftSheet$$ExternalSyntheticLambda0 sendGiftSheet$$ExternalSyntheticLambda0, final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities) {
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.balanceLoaded) {
            getBalance(new Runnable() {
                @Override
                public final void run() {
                    StarsController starsController = this.f$0;
                    boolean z3 = starsController.balanceLoaded;
                    SendGiftSheet$$ExternalSyntheticLambda0 sendGiftSheet$$ExternalSyntheticLambda1 = sendGiftSheet$$ExternalSyntheticLambda0;
                    if (!z3) {
                        StarsController.bulletinError("NO_BALANCE");
                        sendGiftSheet$$ExternalSyntheticLambda1.run(Boolean.FALSE, null);
                    } else {
                        starsController.buyStarGift(sendGiftSheet$$ExternalSyntheticLambda1, starGift, z, z2, j, tL_textWithEntities);
                    }
                }
            }, true, false);
            return;
        }
        final String name = DialogObject.getName(this.currentAccount, j);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z;
        tL_inputInvoiceStarGift.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z2;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(resourceProvider, false);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final StarsController starsController = this.f$0;
                starsController.getClass();
                final SendGiftSheet$$ExternalSyntheticLambda0 sendGiftSheet$$ExternalSyntheticLambda1 = sendGiftSheet$$ExternalSyntheticLambda0;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final long j2 = j;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                final Theme.ResourcesProvider resourcesProvider = resourceProvider;
                final String str = name;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z3 = z;
                final boolean z4 = z2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        final StarsController starsController2 = starsController;
                        starsController2.getClass();
                        TLObject tLObject2 = tLObject;
                        boolean z5 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final SendGiftSheet$$ExternalSyntheticLambda0 sendGiftSheet$$ExternalSyntheticLambda2 = sendGiftSheet$$ExternalSyntheticLambda1;
                        if (!z5) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            StarsController.bulletinError(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            sendGiftSheet$$ExternalSyntheticLambda2.run(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                        int size = arrayList.size();
                        final long j3 = 0;
                        int i = 0;
                        while (i < size) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                            i++;
                            j3 += tL_labeledPrice.amount;
                        }
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(starsController2.currentAccount);
                        final Context context4 = context3;
                        final long j4 = j2;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z6 = z3;
                        final boolean z7 = z4;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final StarsController starsController3 = starsController2;
                                starsController3.getClass();
                                final SendGiftSheet$$ExternalSyntheticLambda0 sendGiftSheet$$ExternalSyntheticLambda3 = sendGiftSheet$$ExternalSyntheticLambda2;
                                final Context context5 = context4;
                                final long j5 = j4;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                final Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                                final long j6 = j3;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z8 = z6;
                                final boolean z9 = z7;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i2;
                                        boolean z10;
                                        StarsController starsController4 = starsController3;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        SendGiftSheet$$ExternalSyntheticLambda0 sendGiftSheet$$ExternalSyntheticLambda4 = sendGiftSheet$$ExternalSyntheticLambda3;
                                        Context context6 = context5;
                                        Theme.ResourcesProvider resourcesProvider4 = resourcesProvider3;
                                        long j7 = j6;
                                        String str4 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z11 = z8;
                                        boolean z12 = z9;
                                        long j8 = j5;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        starsController4.getClass();
                                        BaseFragment lastFragment = LaunchActivity.getLastFragment();
                                        BulletinFactory bulletinFactoryGlobal = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
                                        SpannableStringBuilder spannableStringBuilderReplaceTags = null;
                                        if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                            if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                if (!MessagesController.getInstance(starsController4.currentAccount).starsPurchaseAvailable()) {
                                                    sendGiftSheet$$ExternalSyntheticLambda4.run(Boolean.FALSE, null);
                                                    StarsController.showNoSupportDialog(context6, resourcesProvider4);
                                                    return;
                                                } else {
                                                    boolean[] zArr = {false};
                                                    StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context6, resourcesProvider4, j7, 6, str4, new StarsController$$ExternalSyntheticLambda10(starsController4, zArr, starGift5, z11, z12, j8, tL_textWithEntities5, sendGiftSheet$$ExternalSyntheticLambda4), 0L);
                                                    starsNeededSheet.setOnDismissListener(new BotStorage$$ExternalSyntheticLambda5(5, (Object) sendGiftSheet$$ExternalSyntheticLambda4, zArr));
                                                    starsNeededSheet.show();
                                                    return;
                                                }
                                            }
                                            if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                sendGiftSheet$$ExternalSyntheticLambda4.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                return;
                                            }
                                            if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                sendGiftSheet$$ExternalSyntheticLambda4.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                return;
                                            }
                                            sendGiftSheet$$ExternalSyntheticLambda4.run(Boolean.FALSE, null);
                                            zzkh.m(R.string.UnknownErrorCode, new Object[]{tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS"}, bulletinFactoryGlobal, R.raw.error);
                                            return;
                                        }
                                        Utilities.stageQueue.postRunnable(new StarsController$$ExternalSyntheticLambda12(starsController4, (TLRPC.TL_payments_paymentResult) tLObject4, 0));
                                        starsController4.giftsLoaded = false;
                                        starsController4.giftsCacheLoaded = true;
                                        starsController4.giftsRemoteTime = 0L;
                                        starsController4.loadStarGifts();
                                        starsController4.invalidateProfileGifts(j8);
                                        starsController4.invalidateTransactions(true);
                                        sendGiftSheet$$ExternalSyntheticLambda4.run(Boolean.TRUE, null);
                                        if (BirthdayController.getInstance(starsController4.currentAccount).contains(j8)) {
                                            i2 = 0;
                                            MessagesController.getInstance(starsController4.currentAccount).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                        } else {
                                            i2 = 0;
                                        }
                                        if (starGift5 != null && starGift5.limited_per_user) {
                                            int i3 = starGift5.per_user_remains - 1;
                                            starGift5.per_user_remains = i3;
                                            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SentRemainsLimit", Math.max(i2, i3)));
                                        }
                                        SpannableStringBuilder spannableStringBuilderReplaceTags2 = spannableStringBuilderReplaceTags;
                                        if (j8 < 0) {
                                            long j9 = -j8;
                                            TLRPC.ChatFull chatFull = MessagesController.getInstance(starsController4.currentAccount).getChatFull(j9);
                                            if (chatFull != null) {
                                                chatFull.stargifts_count++;
                                                chatFull.flags2 |= 262144;
                                                MessagesController.getInstance(starsController4.currentAccount).putChatFull(chatFull);
                                            }
                                            if (lastFragment instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) lastFragment;
                                                if (profileActivity.getDialogId() == j8) {
                                                    SharedMediaLayout sharedMediaLayout = profileActivity.sharedMediaLayout;
                                                    if (sharedMediaLayout != null) {
                                                        sharedMediaLayout.updateTabs(true);
                                                        profileActivity.sharedMediaLayout.scrollToPage(14);
                                                        profileActivity.scrollToSharedMedia();
                                                    }
                                                    BulletinFactory bulletinFactoryOf = BulletinFactory.of(lastFragment);
                                                    TLRPC.Document document = starGift5.sticker;
                                                    String string = LocaleController.getString(R.string.StarsGiftCompleted);
                                                    if (spannableStringBuilderReplaceTags2 != null) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = false;
                                                        spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j7, str4));
                                                    }
                                                    bulletinFactoryOf.createEmojiBulletin(document, string, spannableStringBuilderReplaceTags2).show(z10);
                                                } else {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("chat_id", j9);
                                                    bundle.putBoolean("open_gifts", true);
                                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle);
                                                    profileActivity2.whenFullyVisible(new PhotoViewer$$ExternalSyntheticLambda22((Object) profileActivity2, (Object) starGift5, (Object) spannableStringBuilderReplaceTags2, j7, str4, 11));
                                                    lastFragment.presentFragment(profileActivity2);
                                                }
                                            } else {
                                                Bundle bundle2 = new Bundle();
                                                bundle2.putLong("chat_id", j9);
                                                bundle2.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity3 = new ProfileActivity(bundle2);
                                                profileActivity3.whenFullyVisible(new PhotoViewer$$ExternalSyntheticLambda22((Object) profileActivity3, (Object) starGift5, (Object) spannableStringBuilderReplaceTags2, j7, str4, 11));
                                                lastFragment.presentFragment(profileActivity3);
                                            }
                                        } else if ((lastFragment instanceof ChatActivity) && ((ChatActivity) lastFragment).getDialogId() == j8) {
                                            BulletinFactory bulletinFactoryOf2 = BulletinFactory.of(lastFragment);
                                            TLRPC.Document document2 = starGift5.sticker;
                                            String string2 = LocaleController.getString(R.string.StarsGiftCompleted);
                                            if (spannableStringBuilderReplaceTags2 == null) {
                                                spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j7, new Object[0]));
                                            }
                                            bulletinFactoryOf2.createEmojiBulletin(document2, string2, spannableStringBuilderReplaceTags2).show(true);
                                        } else {
                                            NotificationCenter notificationCenter = NotificationCenter.getInstance(starsController4.currentAccount);
                                            int i4 = NotificationCenter.closeProfileActivity;
                                            Long lValueOf = Long.valueOf(j8);
                                            Boolean bool = Boolean.FALSE;
                                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i4, lValueOf, bool);
                                            NotificationCenter.getInstance(starsController4.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j8), bool);
                                            ChatActivity chatActivityOf = ChatActivity.of(j8);
                                            chatActivityOf.whenFullyVisible(new StarGiftSheet$$ExternalSyntheticLambda139(chatActivityOf, starGift5, spannableStringBuilderReplaceTags2, j7, 27));
                                            lastFragment.presentFragment(chatActivityOf);
                                        }
                                        MessagesController.getInstance(starsController4.currentAccount).getMainSettings().edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.instance;
                                        if (launchActivity == null || launchActivity.getFireworksOverlay() == null) {
                                            return;
                                        }
                                        LaunchActivity.instance.getFireworksOverlay().start(true);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    public final boolean canUseTon() {
        if (!this.ton) {
            return false;
        }
        if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp() && !BuildVars.isHuaweiStoreApp()) {
            TL_stars.StarsAmount balance = getBalance();
            if (balance.nanos == 0 && balance.amount == 0) {
                return false;
            }
        }
        return true;
    }

    public final TL_stars.SavedStarGift findUserStarGift(long j) {
        TL_stars.StarGift starGift;
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.giftLists;
            if (i >= longSparseArray.size()) {
                return null;
            }
            GiftsList giftsList = (GiftsList) longSparseArray.valueAt(i);
            for (int i2 = 0; i2 < giftsList.gifts.size(); i2++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) giftsList.gifts.get(i2);
                if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.id == j) {
                    return savedStarGift;
                }
            }
            i++;
        }
    }

    public final TL_stars.StarsAmount getBalance() {
        return getBalance(null, true, false);
    }

    public final AmountUtils$Amount getBalanceAmount() {
        AmountUtils$Amount amountUtils$AmountOf = AmountUtils$Amount.of(getBalance());
        if (amountUtils$AmountOf == null) {
            return AmountUtils$Amount.fromNano(0L, this.ton ? AmountUtils$Currency.TON : AmountUtils$Currency.STARS);
        }
        return amountUtils$AmountOf;
    }

    public final ArrayList getGiftOptions() {
        if (this.giftOptionsLoading || this.giftOptionsLoaded) {
            return this.giftOptions;
        }
        this.giftOptionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new StarsController$$ExternalSyntheticLambda1(this, 4));
        return this.giftOptions;
    }

    public final ArrayList getGiveawayOptions() {
        if (this.giveawayOptionsLoading || this.giveawayOptionsLoaded) {
            return this.giveawayOptions;
        }
        this.giveawayOptionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new StarsController$$ExternalSyntheticLambda1(this, 1));
        return this.giveawayOptions;
    }

    public final ArrayList getOptions() {
        if (this.optionsLoading || this.optionsLoaded) {
            return this.options;
        }
        this.optionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new StarsController$$ExternalSyntheticLambda1(this, 3));
        return this.options;
    }

    public final long getPaidReactionsDialogId(MessageObject messageObject) {
        Long l;
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions != null && pendingPaidReactions.message.equals(MessageId.from(messageObject)) && (l = this.currentPendingReactions.peer) != null) {
            return l.longValue();
        }
        Long myPaidReactionPeer = messageObject == null ? null : messageObject.getMyPaidReactionPeer();
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.currentAccount).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final void getPaidRevenue(long j, long j2, Utilities.Callback callback) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i = this.currentAccount;
        getpaidmessagesrevenue.user_id = MessagesController.getInstance(i).getInputUser(j);
        if (j2 != 0) {
            getpaidmessagesrevenue.parent_peer = MessagesController.getInstance(i).getInputPeer(j2);
        }
        ConnectionsManager.getInstance(i).sendRequest(getpaidmessagesrevenue, new RichMediaUploader$$ExternalSyntheticLambda0(callback, 19));
    }

    public final long getPendingPaidReactions(int i, long j) {
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

    public final GiftsCollections getProfileGiftCollectionsList(long j, boolean z) {
        LongSparseArray longSparseArray = this.giftCollections;
        GiftsCollections giftsCollections = (GiftsCollections) longSparseArray.get(j);
        if (giftsCollections != null || !z) {
            return giftsCollections;
        }
        GiftsCollections giftsCollections2 = new GiftsCollections(this.currentAccount, j);
        longSparseArray.put(j, giftsCollections2);
        return giftsCollections2;
    }

    public final GiftsList getProfileGiftsList(long j, boolean z) {
        LongSparseArray longSparseArray = this.giftLists;
        GiftsList giftsList = (GiftsList) longSparseArray.get(j);
        if (giftsList != null || !z) {
            return giftsList;
        }
        GiftsList giftsList2 = new GiftsList(this.currentAccount, j, true);
        longSparseArray.put(j, giftsList2);
        return giftsList2;
    }

    public final void getResellingGiftForm(TL_stars.StarGift starGift, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, Utilities.Callback callback) {
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.balanceLoaded) {
            getBalance(new StarGiftSheet$$ExternalSyntheticLambda139(this, callback, starGift, j, 28), true, false);
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_inputInvoiceStarGiftResale.ton = this.ton;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(resourceProvider, false);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new StarGiftSheet$$ExternalSyntheticLambda0(22, this, callback));
    }

    public final void getStarGiftPreview(long j, Utilities.Callback callback) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.giftPreviews.get(Long.valueOf(j));
        if (stargiftupgradepreview != null) {
            callback.run(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftupgradepreview, new LivePlayer$$ExternalSyntheticLambda15(this, j, callback, 3));
    }

    public final void getUserStarGift(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        AlertDialog alertDialog = new AlertDialog(ApplicationLoader.applicationContext, 3, null);
        AndroidUtilities.cancelRunOnUIThread(alertDialog.showRunnable);
        AndroidUtilities.runOnUIThread(alertDialog.showRunnable, 200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getsavedstargift, new GiftSheet$$ExternalSyntheticLambda16(6, this, alertDialog, inputSavedStarGift, callback));
    }

    public final boolean hasTransactions(int i) {
        return this.balanceLoaded && !this.transactions[i].isEmpty();
    }

    public final void invalidateBalance() {
        this.balanceLoaded = false;
        getBalance();
        this.balanceLoaded = true;
    }

    public final void invalidateProfileGifts(long j) {
        GiftsList profileGiftsList = getProfileGiftsList(j, false);
        if (profileGiftsList != null) {
            profileGiftsList.invalidate(false);
        }
        GiftsCollections giftsCollections = (GiftsCollections) this.giftCollections.get(j);
        if (giftsCollections != null) {
            if (giftsCollections.currentRequestId != -1) {
                ConnectionsManager.getInstance(giftsCollections.currentAccount).cancelRequest(giftsCollections.currentRequestId, true);
                giftsCollections.currentRequestId = -1;
            }
            giftsCollections.loading = false;
            giftsCollections.loaded = false;
            if (giftsCollections.shown) {
                giftsCollections.load();
            }
        }
    }

    public final void invalidateSubscriptions() {
        if (this.subscriptionsLoading) {
            return;
        }
        this.subscriptions.clear();
        this.subscriptionsOffset = null;
        this.subscriptionsLoading = false;
        this.subscriptionsEndReached = false;
        loadSubscriptions();
    }

    public final void invalidateTransactions(boolean z) {
        for (int i = 0; i < 3; i++) {
            boolean[] zArr = this.loading;
            if (!zArr[i]) {
                this.transactions[i].clear();
                this.offset[i] = null;
                zArr[i] = false;
                this.endReached[i] = false;
                if (z) {
                    loadTransactions(i);
                }
            }
        }
    }

    public final void loadStarGifts() {
        if (this.giftsLoading) {
            return;
        }
        if (!this.giftsLoaded || System.currentTimeMillis() - this.giftsRemoteTime >= 60000) {
            this.giftsLoading = true;
            boolean z = this.giftsCacheLoaded;
            int i = this.currentAccount;
            if (z) {
                int i2 = this.giftsHash;
                DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = new DialogCell$$ExternalSyntheticLambda6(this, 29);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i2;
                ConnectionsManager.getInstance(i).sendRequest(getstargifts, new RichMediaUploader$$ExternalSyntheticLambda0(dialogCell$$ExternalSyntheticLambda6, 18));
                return;
            }
            GiftSheet$$ExternalSyntheticLambda6 giftSheet$$ExternalSyntheticLambda6 = new GiftSheet$$ExternalSyntheticLambda6(this, 23);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
            messagesStorage.getStorageQueue().postRunnable(new SendGiftSheet$$ExternalSyntheticLambda16(messagesStorage, arrayList3, arrayList2, arrayList, giftSheet$$ExternalSyntheticLambda6, 13));
        }
    }

    public final void loadSubscriptions() {
        if (this.ton || this.subscriptionsLoading || this.subscriptionsEndReached) {
            return;
        }
        this.subscriptionsLoading = true;
        TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
        tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
        String str = this.subscriptionsOffset;
        tL_getStarsSubscriptions.offset = str;
        if (str == null) {
            tL_getStarsSubscriptions.offset = "";
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_getStarsSubscriptions, new StarsController$$ExternalSyntheticLambda1(this, 2));
    }

    public final void loadTransactions(int i) {
        boolean[] zArr = this.loading;
        if (zArr[i] || this.endReached[i]) {
            return;
        }
        zArr[i] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = this.ton;
        tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
        tL_payments_getStarsTransactions.inbound = i == 1;
        tL_payments_getStarsTransactions.outbound = i == 2;
        String str = this.offset[i];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsTransactions, new StarGiftSheet$$ExternalSyntheticLambda100(this, i, 2));
    }

    public final void openPaymentForm(Runnable runnable, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback) {
        long dialogId;
        String str;
        boolean z;
        int i;
        TLRPC.User user;
        MessageObject messageObject2;
        ?? r6;
        ViewGroup viewGroup;
        TextView textViewM;
        String string;
        int i2;
        TextView textViewM2;
        ButtonWithCounterView buttonWithCounterView;
        int i3;
        TLRPC.Message message;
        boolean z2;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i4;
        int i5;
        int i6;
        String str2;
        int i7;
        String pluralString;
        String pluralString2;
        String pluralString3;
        String str3;
        char c;
        String pluralString4;
        char c2;
        String pluralString5;
        TLRPC.MessageExtendedMedia messageExtendedMedia;
        boolean z3;
        TLRPC.User user2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        String string2;
        ViewGroup viewGroup2;
        TLRPC.Message message2;
        BackupImageView backupImageView;
        int i8;
        int i9;
        ImageLocation forDocument;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (context2 == null) {
            return;
        }
        if (!this.balanceLoaded) {
            getBalance(new GiftSheet$$ExternalSyntheticLambda24(this, (Object) runnable, messageObject, inputInvoice, tL_payments_paymentFormStars, callback, 8), true, false);
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        long j = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j += tL_labeledPrice.amount;
            arrayList = arrayList;
        }
        if (messageObject == null || messageObject.type != 29) {
            dialogId = tL_payments_paymentFormStars.bot_id;
        } else {
            TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.messageOwner.fwd_from;
            dialogId = (messageFwdHeader2 == null || (peer2 = messageFwdHeader2.from_id) == null) ? messageObject.getDialogId() : DialogObject.getPeerDialogId(peer2);
        }
        String userName = "";
        if (dialogId >= 0) {
            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
            String userName2 = UserObject.getUserName(user3);
            UserObject.isBot(user3);
            z = !UserObject.isBot(user3);
            str = userName2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
            str = chat == null ? "" : chat.title;
            z = false;
        }
        String str4 = tL_payments_paymentFormStars.title;
        runnable.run();
        int i11 = tL_payments_paymentFormStars.invoice.subscription_period;
        boolean z4 = z;
        boolean[] zArr = {false};
        String str5 = str;
        int i12 = this.currentAccount;
        TLRPC.WebDocument webDocument = tL_payments_paymentFormStars.photo;
        long j2 = j;
        long j3 = dialogId;
        StarsController$$ExternalSyntheticLambda48 starsController$$ExternalSyntheticLambda48 = new StarsController$$ExternalSyntheticLambda48(this, j2, zArr, callback, context2, resourceProvider, z4, str5, messageObject, inputInvoice, tL_payments_paymentFormStars, i11, j3);
        StarGiftSheet$$ExternalSyntheticLambda66 starGiftSheet$$ExternalSyntheticLambda66 = new StarGiftSheet$$ExternalSyntheticLambda66(this, zArr, callback, 23);
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context2, false, false, resourceProvider);
        TLRPC.User user4 = MessagesController.getInstance(i12).getUser(Long.valueOf(j3));
        ViewGroup viewGroupM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context2);
        viewGroupM.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context2);
        ViewGroup viewGroup3 = viewGroupM;
        frameLayout.addView(new StarsIntroActivity.AnonymousClass4(context2, 40, 0), LayoutHelper.createFrame(-1, -1.0f));
        ViewGroup viewGroup4 = frameLayout;
        if (messageObject == null || (message2 = messageObject.messageOwner) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            ViewGroup viewGroup5 = viewGroup3;
            i = i11;
            bottomSheetM = bottomSheetM;
            user = user4;
            messageObject2 = messageObject;
            starsController$$ExternalSyntheticLambda48 = starsController$$ExternalSyntheticLambda48;
            starGiftSheet$$ExternalSyntheticLambda66 = starGiftSheet$$ExternalSyntheticLambda66;
            viewGroup4 = viewGroup4;
            if (webDocument == null) {
                BackupImageView backupImageView2 = new BackupImageView(context2);
                backupImageView2.setRoundRadius(AndroidUtilities.dp(80.0f));
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                avatarDrawable.setInfo(user);
                backupImageView2.setForUserOrChat(user, avatarDrawable);
                viewGroup4.addView(backupImageView2, LayoutHelper.createFrame(80, 80, 17));
                viewGroup2 = viewGroup5;
            } else {
                FrameLayout frameLayout2 = new FrameLayout(context2);
                BackupImageView backupImageView3 = new BackupImageView(context2);
                backupImageView3.setRoundRadius(AndroidUtilities.dp(18.0f));
                backupImageView3.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "80_80", (Drawable) null, 0, (Object) null);
                frameLayout2.addView(backupImageView3, LayoutHelper.createFrame(80, 80, 48));
                viewGroup4.addView(frameLayout2, LayoutHelper.createFrame(80, 87, 17));
                TextView textView = new TextView(context2);
                textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                r6 = 1;
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(-1);
                textView.setText(StarsIntroActivity.replaceStars(BillingController$$ExternalSyntheticOutline0.m((int) j2, ',', new StringBuilder("XTR ")), 0.85f, (ColoredImageSpan[]) null));
                textView.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
                textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(16.0f), -1133566));
                FrameLayout frameLayout3 = new FrameLayout(context2);
                frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), Theme.getColor(Theme.key_dialogBackground, resourceProvider)));
                frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                frameLayout3.addView(textView, LayoutHelper.createLinear(-2, 16, 119));
                frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-2.0f, 18.66f, 81));
                viewGroup = viewGroup5;
            }
            StarsIntroActivity.StarsBalanceView starsBalanceView = new StarsIntroActivity.StarsBalanceView(context2, i12, resourceProvider);
            ScaleStateListAnimator.apply(starsBalanceView);
            starsBalanceView.setOnClickListener(new StarsIntroActivity$$ExternalSyntheticLambda66(starsBalanceView, r6));
            viewGroup4.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
            viewGroup.addView(viewGroup4, LayoutHelper.createLinear(-1, 117, 7));
            textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context2, r6, 20.0f);
            textViewM.setTypeface(AndroidUtilities.bold());
            int i13 = Theme.key_dialogTextBlack;
            textViewM.setTextColor(Theme.getColor(i13, resourceProvider));
            if (i > 0) {
                if (webDocument != null) {
                    string2 = str4;
                } else {
                    string2 = LocaleController.getString(R.string.StarsConfirmSubscriptionTitle);
                }
                textViewM.setText(Emoji.replaceEmoji(string2, textViewM.getPaint().getFontMetricsInt(), false));
            } else {
                if (webDocument != null) {
                    string = str4;
                } else {
                    string = LocaleController.getString(R.string.StarsConfirmPurchaseTitle);
                }
                textViewM.setText(Emoji.replaceEmoji(string, textViewM.getPaint().getFontMetricsInt(), false));
            }
            NotificationCenter.listenEmojiLoading(textViewM);
            textViewM.setGravity(17);
            if (webDocument != null) {
                i2 = -8;
            } else {
                i2 = 8;
            }
            viewGroup.addView(textViewM, LayoutHelper.createLinear(-2, -2, 1, 0, i2, 0, 0));
            if (webDocument != null) {
                LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context2);
                linearLayoutM.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_windowBackgroundGray, resourceProvider)));
                BackupImageView backupImageView4 = new BackupImageView(context2);
                backupImageView4.setRoundRadius(AndroidUtilities.dp(14.0f));
                AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                avatarDrawable2.setInfo(user);
                backupImageView4.setForUserOrChat(user, avatarDrawable2);
                linearLayoutM.addView(backupImageView4, LayoutHelper.createLinear(28, 28));
                TextView textView2 = new TextView(context2);
                textView2.setTextSize(r6, 13.0f);
                textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourceProvider));
                textView2.setText(UserObject.getUserName(user));
                linearLayoutM.addView(textView2, LayoutHelper.createLinear(-2, -2, 16, 6, 0, 10, 0));
                viewGroup.addView(linearLayoutM, LayoutHelper.createLinear(-2, 28, 1, 0, 8, 0, 2));
            }
            textViewM2 = RichMessageLayout$$ExternalSyntheticOutline0.m(context2, r6, 14.0f);
            textViewM2.setTextColor(Theme.getColor(i13, resourceProvider));
            if (messageObject2 == null && (message = messageObject2.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                long dialogId2 = messageObject2.getDialogId();
                TLRPC.Message message3 = messageObject2.messageOwner;
                if (message3 != null && (messageFwdHeader = message3.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    dialogId2 = DialogObject.getPeerDialogId(peer);
                }
                long j4 = (dialogId2 >= 0 || messageObject2.getFromChatId() <= 0 || (user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(messageObject2.getFromChatId()))) == null || !user2.bot) ? dialogId2 : user2.id;
                if (j4 >= 0) {
                    TLRPC.User user5 = MessagesController.getInstance(i12).getUser(Long.valueOf(j4));
                    userName = UserObject.getUserName(user5);
                    if (user5 != null && user5.bot) {
                        z2 = true;
                    }
                    tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject2.messageOwner.media;
                    i5 = 0;
                    i6 = 0;
                    for (i4 = 0; i4 < tL_messageMediaPaidMedia.extended_media.size(); i4 += r6) {
                        messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i4);
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                            if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                            z3 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            i5 += r6;
                        } else {
                            i6 += r6;
                        }
                    }
                    if (i5 == 0) {
                        str3 = z2 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                        int i14 = (int) j2;
                        if (i6 == r6) {
                            pluralString5 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                            c2 = 0;
                        } else {
                            c2 = 0;
                            pluralString5 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i6, new Object[0]);
                        }
                        Object[] objArr = new Object[2];
                        objArr[c2] = pluralString5;
                        objArr[r6] = userName;
                        pluralString3 = LocaleController.formatPluralString(str3, i14, objArr);
                    } else if (i6 == 0) {
                        str3 = z2 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                        int i15 = (int) j2;
                        if (i5 == r6) {
                            pluralString4 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo);
                            c = 0;
                        } else {
                            c = 0;
                            pluralString4 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i5, new Object[0]);
                        }
                        Object[] objArr2 = new Object[2];
                        objArr2[c] = pluralString4;
                        objArr2[r6] = userName;
                        pluralString3 = LocaleController.formatPluralString(str3, i15, objArr2);
                    } else {
                        if (z2) {
                            str2 = "StarsConfirmPurchaseMediaBotTwo2";
                        } else {
                            str2 = "StarsConfirmPurchaseMediaTwo2";
                        }
                        int i16 = (int) j2;
                        if (i6 == r6) {
                            pluralString = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                            i7 = 0;
                        } else {
                            i7 = 0;
                            pluralString = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i6, new Object[0]);
                        }
                        if (i5 == r6) {
                            pluralString2 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo);
                        } else {
                            pluralString2 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i5, new Object[i7]);
                        }
                        Object[] objArr3 = new Object[3];
                        objArr3[i7] = pluralString;
                        objArr3[r6] = pluralString2;
                        objArr3[2] = userName;
                        pluralString3 = LocaleController.formatPluralString(str2, i16, objArr3);
                    }
                    textViewM2.setText(AndroidUtilities.replaceTags(pluralString3));
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(r1).getChat(Long.valueOf(-j4));
                    if (chat2 != null) {
                        userName = chat2.title;
                    }
                }
                z2 = false;
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject2.messageOwner.media;
                i5 = 0;
                i6 = 0;
                while (i4 < tL_messageMediaPaidMedia.extended_media.size()) {
                    messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i4);
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        z3 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i5 += r6;
                    } else {
                        i6 += r6;
                    }
                }
                if (i5 == 0) {
                    if (z2) {
                    }
                    int i17 = (int) j2;
                    if (i6 == r6) {
                        pluralString5 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                        c2 = 0;
                    } else {
                        c2 = 0;
                        pluralString5 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i6, new Object[0]);
                    }
                    Object[] objArr4 = new Object[2];
                    objArr4[c2] = pluralString5;
                    objArr4[r6] = userName;
                    pluralString3 = LocaleController.formatPluralString(str3, i17, objArr4);
                } else if (i6 == 0) {
                    if (z2) {
                    }
                    int i18 = (int) j2;
                    if (i5 == r6) {
                        pluralString4 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo);
                        c = 0;
                    } else {
                        c = 0;
                        pluralString4 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i5, new Object[0]);
                    }
                    Object[] objArr5 = new Object[2];
                    objArr5[c] = pluralString4;
                    objArr5[r6] = userName;
                    pluralString3 = LocaleController.formatPluralString(str3, i18, objArr5);
                } else {
                    if (z2) {
                        str2 = "StarsConfirmPurchaseMediaBotTwo2";
                    } else {
                        str2 = "StarsConfirmPurchaseMediaTwo2";
                    }
                    int i19 = (int) j2;
                    if (i6 == r6) {
                        pluralString = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                        i7 = 0;
                    } else {
                        i7 = 0;
                        pluralString = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i6, new Object[0]);
                    }
                    if (i5 == r6) {
                        pluralString2 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo);
                    } else {
                        pluralString2 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i5, new Object[i7]);
                    }
                    Object[] objArr6 = new Object[3];
                    objArr6[i7] = pluralString;
                    objArr6[r6] = pluralString2;
                    objArr6[2] = userName;
                    pluralString3 = LocaleController.formatPluralString(str2, i19, objArr6);
                }
                textViewM2.setText(AndroidUtilities.replaceTags(pluralString3));
            } else if (i > 0) {
                String userName3 = UserObject.getUserName(user);
                Object[] objArr7 = new Object[2];
                objArr7[0] = str4;
                objArr7[r6] = userName3;
                textViewM2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionText2", (int) j2, objArr7)));
            } else {
                String userName4 = UserObject.getUserName(user);
                Object[] objArr8 = new Object[2];
                objArr8[0] = str4;
                objArr8[r6] = userName4;
                textViewM2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseText2", (int) j2, objArr8)));
            }
            textViewM2.setMaxWidth(HintView2.cutInFancyHalf(textViewM2.getText(), textViewM2.getPaint()));
            textViewM2.setGravity(17);
            viewGroup.addView(textViewM2, LayoutHelper.createLinear(-2, -2, 1, 0, 6, 0, 18));
            buttonWithCounterView = new ButtonWithCounterView(context2, r6, resourceProvider);
            if (i > 0) {
                buttonWithCounterView.setText(StarsIntroActivity.replaceStars(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionButton", (int) j2)), 1.13f, (ColoredImageSpan[]) null), false);
            } else {
                buttonWithCounterView.setText(StarsIntroActivity.replaceStars(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseButton", (int) j2)), 1.13f, (ColoredImageSpan[]) null), false);
            }
            viewGroup.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context2, resourceProvider);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourceProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourceProvider));
            linksTextView.setTextSize(r6, 14.0f);
            if (i > 0) {
                i3 = R.string.StarsConfirmSubscriptionTOS;
            } else {
                i3 = R.string.StarsConfirmPurchaseTOS;
            }
            linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i3), new GiftSheet$$ExternalSyntheticLambda18(context2, 8)));
            linksTextView.setGravity(17);
            viewGroup.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 0.0f, 2.0f));
            BottomSheet bottomSheet = bottomSheetM;
            bottomSheet.customView = viewGroup;
            buttonWithCounterView.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(starsController$$ExternalSyntheticLambda48, bottomSheet, buttonWithCounterView, 11));
            bottomSheet.setOnDismissListener(new RichEditor$$ExternalSyntheticLambda46(starGiftSheet$$ExternalSyntheticLambda66, 9));
            bottomSheet.fixNavigationBar();
            bottomSheet.show();
        }
        BackupImageView backupImageView5 = new BackupImageView(context2, context2) {
            public final Path clipPath = new Path();
            public final RectF clipRect = new RectF();
            public final Drawable lock;
            public SpoilerEffect2 spoilerEffect2;

            {
                this.lock = context2.getResources().getDrawable(R.drawable.large_locked_post).mutate();
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                AnonymousClass6 anonymousClass6;
                Canvas canvas2;
                super.dispatchDraw(canvas);
                if (this.spoilerEffect2 == null) {
                    this.spoilerEffect2 = SpoilerEffect2.getInstance(this);
                }
                if (this.spoilerEffect2 != null) {
                    RectF rectF = this.clipRect;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    Path path = this.clipPath;
                    path.rewind();
                    path.addRoundRect(rectF, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    anonymousClass6 = this;
                    canvas2 = canvas;
                    this.spoilerEffect2.draw(canvas2, anonymousClass6, getWidth(), getHeight(), 1.0f, false);
                    canvas2.restore();
                } else {
                    anonymousClass6 = this;
                    canvas2 = canvas;
                }
                int width = getWidth();
                Drawable drawable = anonymousClass6.lock;
                drawable.setBounds((width - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
                drawable.draw(canvas2);
            }

            @Override
            public final void onAttachedToWindow() {
                SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
                if (spoilerEffect2 != null) {
                    spoilerEffect2.attach(this);
                }
                super.onAttachedToWindow();
            }

            @Override
            public final void onDetachedFromWindow() {
                SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
                if (spoilerEffect2 != null) {
                    spoilerEffect2.detach(this);
                }
                super.onDetachedFromWindow();
            }
        };
        backupImageView5.setRoundRadius(AndroidUtilities.dp(24.0f));
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
        if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
            i = i11;
            user = user4;
            backupImageView = backupImageView5;
            messageObject2 = messageObject;
            i8 = 80;
            i9 = 17;
        } else {
            TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
            if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                forDocument = ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, messageObject.messageOwner);
            } else {
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(80.0f), true), messageMedia.photo);
                    } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                        forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(80.0f), true), messageMedia.document);
                    }
                }
                forDocument = null;
            }
            backupImageView = backupImageView5;
            i = i11;
            user = user4;
            i8 = 80;
            i9 = 17;
            backupImageView.setImage(forDocument, "80_80_b2", (ImageLocation) null, (String) null, (Drawable) null, messageObject);
            messageObject2 = messageObject;
        }
        viewGroup4.addView(backupImageView, LayoutHelper.createFrame(i8, i8, i9));
        viewGroup2 = viewGroup3;
        r6 = 1;
        viewGroup = viewGroup2;
        StarsIntroActivity.StarsBalanceView starsBalanceView2 = new StarsIntroActivity.StarsBalanceView(context2, i12, resourceProvider);
        ScaleStateListAnimator.apply(starsBalanceView2);
        starsBalanceView2.setOnClickListener(new StarsIntroActivity$$ExternalSyntheticLambda66(starsBalanceView2, r6));
        viewGroup4.addView(starsBalanceView2, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        viewGroup.addView(viewGroup4, LayoutHelper.createLinear(-1, 117, 7));
        textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context2, r6, 20.0f);
        textViewM.setTypeface(AndroidUtilities.bold());
        int i110 = Theme.key_dialogTextBlack;
        textViewM.setTextColor(Theme.getColor(i110, resourceProvider));
        if (i > 0) {
            if (webDocument != null) {
                string2 = str4;
            } else {
                string2 = LocaleController.getString(R.string.StarsConfirmSubscriptionTitle);
            }
            textViewM.setText(Emoji.replaceEmoji(string2, textViewM.getPaint().getFontMetricsInt(), false));
        } else {
            if (webDocument != null) {
                string = str4;
            } else {
                string = LocaleController.getString(R.string.StarsConfirmPurchaseTitle);
            }
            textViewM.setText(Emoji.replaceEmoji(string, textViewM.getPaint().getFontMetricsInt(), false));
        }
        NotificationCenter.listenEmojiLoading(textViewM);
        textViewM.setGravity(17);
        if (webDocument != null) {
            i2 = -8;
        } else {
            i2 = 8;
        }
        viewGroup.addView(textViewM, LayoutHelper.createLinear(-2, -2, 1, 0, i2, 0, 0));
        if (webDocument != null) {
            LinearLayout linearLayoutM2 = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context2);
            linearLayoutM2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_windowBackgroundGray, resourceProvider)));
            BackupImageView backupImageView6 = new BackupImageView(context2);
            backupImageView6.setRoundRadius(AndroidUtilities.dp(14.0f));
            AvatarDrawable avatarDrawable3 = new AvatarDrawable();
            avatarDrawable3.setInfo(user);
            backupImageView6.setForUserOrChat(user, avatarDrawable3);
            linearLayoutM2.addView(backupImageView6, LayoutHelper.createLinear(28, 28));
            TextView textView3 = new TextView(context2);
            textView3.setTextSize(r6, 13.0f);
            textView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourceProvider));
            textView3.setText(UserObject.getUserName(user));
            linearLayoutM2.addView(textView3, LayoutHelper.createLinear(-2, -2, 16, 6, 0, 10, 0));
            viewGroup.addView(linearLayoutM2, LayoutHelper.createLinear(-2, 28, 1, 0, 8, 0, 2));
        }
        textViewM2 = RichMessageLayout$$ExternalSyntheticOutline0.m(context2, r6, 14.0f);
        textViewM2.setTextColor(Theme.getColor(i110, resourceProvider));
        if (messageObject2 == null) {
            if (i > 0) {
                String userName5 = UserObject.getUserName(user);
                Object[] objArr9 = new Object[2];
                objArr9[0] = str4;
                objArr9[r6] = userName5;
                textViewM2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionText2", (int) j2, objArr9)));
            } else {
                String userName6 = UserObject.getUserName(user);
                Object[] objArr10 = new Object[2];
                objArr10[0] = str4;
                objArr10[r6] = userName6;
                textViewM2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseText2", (int) j2, objArr10)));
            }
        } else if (i > 0) {
            String userName7 = UserObject.getUserName(user);
            Object[] objArr11 = new Object[2];
            objArr11[0] = str4;
            objArr11[r6] = userName7;
            textViewM2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionText2", (int) j2, objArr11)));
        } else {
            String userName8 = UserObject.getUserName(user);
            Object[] objArr12 = new Object[2];
            objArr12[0] = str4;
            objArr12[r6] = userName8;
            textViewM2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseText2", (int) j2, objArr12)));
        }
        textViewM2.setMaxWidth(HintView2.cutInFancyHalf(textViewM2.getText(), textViewM2.getPaint()));
        textViewM2.setGravity(17);
        viewGroup.addView(textViewM2, LayoutHelper.createLinear(-2, -2, 1, 0, 6, 0, 18));
        buttonWithCounterView = new ButtonWithCounterView(context2, r6, resourceProvider);
        if (i > 0) {
            buttonWithCounterView.setText(StarsIntroActivity.replaceStars(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionButton", (int) j2)), 1.13f, (ColoredImageSpan[]) null), false);
        } else {
            buttonWithCounterView.setText(StarsIntroActivity.replaceStars(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseButton", (int) j2)), 1.13f, (ColoredImageSpan[]) null), false);
        }
        viewGroup.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context2, resourceProvider);
        linksTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourceProvider));
        linksTextView2.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourceProvider));
        linksTextView2.setTextSize(r6, 14.0f);
        if (i > 0) {
            i3 = R.string.StarsConfirmSubscriptionTOS;
        } else {
            i3 = R.string.StarsConfirmPurchaseTOS;
        }
        linksTextView2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i3), new GiftSheet$$ExternalSyntheticLambda18(context2, 8)));
        linksTextView2.setGravity(17);
        viewGroup.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 0.0f, 2.0f));
        BottomSheet bottomSheet2 = bottomSheetM;
        bottomSheet2.customView = viewGroup;
        buttonWithCounterView.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(starsController$$ExternalSyntheticLambda48, bottomSheet2, buttonWithCounterView, 11));
        bottomSheet2.setOnDismissListener(new RichEditor$$ExternalSyntheticLambda46(starGiftSheet$$ExternalSyntheticLambda66, 9));
        bottomSheet2.fixNavigationBar();
        bottomSheet2.show();
    }

    public final void payAfterConfirmed(final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final Utilities.Callback callback) {
        long dialogId;
        String userName;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (context == null) {
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        final long j = 0;
        int i = 0;
        while (i < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
            i++;
            j += tL_labeledPrice.amount;
        }
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            dialogId = (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) ? messageObject.getDialogId() : DialogObject.getPeerDialogId(peer);
            if (dialogId < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                dialogId = user.id;
            }
        } else {
            dialogId = tL_payments_paymentFormStars.bot_id;
        }
        final long j2 = dialogId;
        if (j2 >= 0) {
            userName = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j2)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j2));
            userName = chat == null ? "" : chat.title;
        }
        final String str = userName;
        final String str2 = tL_payments_paymentFormStars.title;
        final int i2 = tL_payments_paymentFormStars.invoice.subscription_period;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = inputInvoice;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final StarsController starsController = this.f$0;
                starsController.getClass();
                final Utilities.Callback callback2 = callback;
                final Context context2 = context;
                final Theme.ResourcesProvider resourcesProvider = resourceProvider;
                final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                final MessageObject messageObject2 = messageObject;
                final long j3 = j;
                final String str3 = str;
                final int i3 = i2;
                final String str4 = str2;
                final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                final long j4 = j2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TLRPC.Message message2;
                        StarsController starsController2 = starsController;
                        TLObject tLObject2 = tLObject;
                        Utilities.Callback callback3 = callback2;
                        MessageObject messageObject3 = messageObject2;
                        Context context3 = context2;
                        long j5 = j3;
                        String str5 = str3;
                        int i4 = i3;
                        String str6 = str4;
                        TLRPC.InputInvoice inputInvoice3 = inputInvoice2;
                        long j6 = j4;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                        starsController2.getClass();
                        BaseFragment lastFragment = LaunchActivity.getLastFragment();
                        BulletinFactory bulletinFactoryGlobal = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
                        if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                            callback3.run(Boolean.TRUE);
                            Utilities.stageQueue.postRunnable(new StarsController$$ExternalSyntheticLambda12(starsController2, (TLRPC.TL_payments_paymentResult) tLObject2, 1));
                            if (messageObject3 != null && (message2 = messageObject3.messageOwner) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                bulletinFactoryGlobal.createSimpleBulletin(context3.getResources().getDrawable(R.drawable.star_small_inner).mutate(), LocaleController.getString(R.string.StarsMediaPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsMediaPurchaseCompletedInfo", (int) j5, str5))).show();
                            } else if (i4 > 0) {
                                bulletinFactoryGlobal.createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsBotSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsBotSubscriptionCompletedInfo", (int) j5, str6, str5))).show();
                            } else {
                                bulletinFactoryGlobal.createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsPurchaseCompletedInfo", (int) j5, str6, str5))).show();
                            }
                            LaunchActivity launchActivity = LaunchActivity.instance;
                            if (launchActivity != null && launchActivity.getFireworksOverlay() != null) {
                                LaunchActivity.instance.getFireworksOverlay().start(true);
                            }
                            if (!(inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                starsController2.invalidateTransactions(true);
                            }
                            if (messageObject3 != null) {
                                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                tL_messages_getExtendedMedia.peer = MessagesController.getInstance(starsController2.currentAccount).getInputPeer(j6);
                                tL_messages_getExtendedMedia.id.add(Integer.valueOf(messageObject3.getId()));
                                ConnectionsManager.getInstance(starsController2.currentAccount).sendRequest(tL_messages_getExtendedMedia, null);
                                return;
                            }
                            return;
                        }
                        if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                            if (!MessagesController.getInstance(starsController2.currentAccount).starsPurchaseAvailable()) {
                                callback3.run(Boolean.FALSE);
                                StarsController.showNoSupportDialog(context3, resourcesProvider2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context3, resourcesProvider2, j5, 0, str5, new GiftSheet$$ExternalSyntheticLambda24(starsController2, (Object) zArr, messageObject3, inputInvoice3, tL_payments_paymentFormStars3, callback3, 7), j6);
                                starsNeededSheet.setOnDismissListener(new StarsController$$ExternalSyntheticLambda118(callback3, zArr));
                                starsNeededSheet.show();
                                return;
                            }
                        }
                        if (tL_error2 == null || !"FORM_EXPIRED".equals(tL_error2.text)) {
                            callback3.run(Boolean.FALSE);
                            zzkh.m(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, bulletinFactoryGlobal, R.raw.error);
                            if (messageObject3 != null) {
                                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                tL_messages_getExtendedMedia2.peer = MessagesController.getInstance(starsController2.currentAccount).getInputPeer(j6);
                                tL_messages_getExtendedMedia2.id.add(Integer.valueOf(messageObject3.getId()));
                                ConnectionsManager.getInstance(starsController2.currentAccount).sendRequest(tL_messages_getExtendedMedia2, null);
                                return;
                            }
                            return;
                        }
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(resourcesProvider2, false);
                        if (jSONObjectMakeThemeParams != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = inputInvoice3;
                        ConnectionsManager.getInstance(starsController2.currentAccount).sendRequest(tL_payments_getPaymentForm, new StarsController$$ExternalSyntheticLambda119(starsController2, messageObject3, inputInvoice3, callback3, bulletinFactoryGlobal, 0));
                    }
                });
            }
        });
    }

    public final void saveStarGiftsCached(int i, long j, ArrayList arrayList) {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new StarsController$$ExternalSyntheticLambda73(messagesStorage, j, arrayList, i));
    }

    public final PendingPaidReactions sendPaidReaction(final MessageObject messageObject, final ChatActivity chatActivity, final long j, boolean z, boolean z2, final Long l) {
        MessageId messageIdFrom = MessageId.from(messageObject);
        int i = this.currentAccount;
        StarsController starsController = getInstance(i, false);
        Context context = getContext(chatActivity);
        if (context == null) {
            return null;
        }
        String forcedFirstName = "";
        if (z2 && starsController.balanceLoaded && starsController.getBalance(null, false, false).amount <= 0) {
            long dialogId = chatActivity.getDialogId();
            if (dialogId >= 0) {
                forcedFirstName = UserObject.getForcedFirstName(chatActivity.getMessagesController().getUser(Long.valueOf(dialogId)));
            } else {
                TLRPC.Chat chat = chatActivity.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    forcedFirstName = chat.title;
                }
            }
            final int i2 = 0;
            new StarsIntroActivity.StarsNeededSheet(context, chatActivity.getResourceProvider(), j, 5, forcedFirstName, new Runnable(this) {
                public final StarsController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f$0.sendPaidReaction(messageObject, chatActivity, j, true, true, l);
                            break;
                        default:
                            this.f$0.sendPaidReaction(messageObject, chatActivity, j, true, true, l);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions == null || !pendingPaidReactions.message.equals(messageIdFrom)) {
            PendingPaidReactions pendingPaidReactions2 = this.currentPendingReactions;
            if (pendingPaidReactions2 != null) {
                pendingPaidReactions2.close();
            }
            ConnectionsManager.getInstance(i).getCurrentTime();
            PendingPaidReactions pendingPaidReactions3 = new PendingPaidReactions(messageIdFrom, messageObject, chatActivity, z);
            this.currentPendingReactions = pendingPaidReactions3;
            pendingPaidReactions3.peer = l;
        }
        if (this.currentPendingReactions.amount + j > MessagesController.getInstance(i).starsPaidReactionAmountMax) {
            this.currentPendingReactions.close();
            ConnectionsManager.getInstance(i).getCurrentTime();
            this.currentPendingReactions = new PendingPaidReactions(messageIdFrom, messageObject, chatActivity, z);
        }
        final long j2 = this.currentPendingReactions.amount + j;
        if (z2 && starsController.balanceLoaded && starsController.getBalance(null, false, false).amount < j2) {
            this.currentPendingReactions.cancel();
            long dialogId2 = chatActivity.getDialogId();
            if (dialogId2 >= 0) {
                forcedFirstName = UserObject.getForcedFirstName(chatActivity.getMessagesController().getUser(Long.valueOf(dialogId2)));
            } else {
                TLRPC.Chat chat2 = chatActivity.getMessagesController().getChat(Long.valueOf(-dialogId2));
                if (chat2 != null) {
                    forcedFirstName = chat2.title;
                }
            }
            final int i3 = 1;
            new StarsIntroActivity.StarsNeededSheet(context, chatActivity.getResourceProvider(), j2, 5, forcedFirstName, new Runnable(this) {
                public final StarsController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i3) {
                        case 0:
                            this.f$0.sendPaidReaction(messageObject, chatActivity, j2, true, true, l);
                            break;
                        default:
                            this.f$0.sendPaidReaction(messageObject, chatActivity, j2, true, true, l);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        PendingPaidReactions pendingPaidReactions4 = this.currentPendingReactions;
        boolean z3 = !(messageObject == null || messageObject.doesPaidReactionExist()) || z;
        if (!pendingPaidReactions4.committed && !pendingPaidReactions4.cancelled) {
            pendingPaidReactions4.amount += j;
            System.currentTimeMillis();
            Bulletin.TwoLineAnimatedLottieLayout twoLineAnimatedLottieLayout = pendingPaidReactions4.bulletinLayout;
            twoLineAnimatedLottieLayout.subtitleTextView.cancelAnimation();
            twoLineAnimatedLottieLayout.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) pendingPaidReactions4.amount, new Object[0])), true);
            if (pendingPaidReactions4.shownBulletin) {
                pendingPaidReactions4.timerView.timeLeft = 5000L;
                StarsReactionsSheet$$ExternalSyntheticLambda13 starsReactionsSheet$$ExternalSyntheticLambda13 = pendingPaidReactions4.closeRunnable;
                AndroidUtilities.cancelRunOnUIThread(starsReactionsSheet$$ExternalSyntheticLambda13);
                AndroidUtilities.runOnUIThread(starsReactionsSheet$$ExternalSyntheticLambda13, 5000L);
            }
            StarsController starsController2 = StarsController.this;
            MessageObject messageObject2 = pendingPaidReactions4.messageObject;
            if (z3) {
                pendingPaidReactions4.applied = true;
                messageObject2.addPaidReactions((int) j, true, pendingPaidReactions4.getPeerId());
                starsController2.minus += j;
                int i4 = starsController2.currentAccount;
                NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                pendingPaidReactions4.applied = false;
                if (messageObject2.ensurePaidReactionsExist(true)) {
                    pendingPaidReactions4.not_added--;
                }
                NotificationCenter.getInstance(starsController2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                pendingPaidReactions4.not_added += j;
            }
            twoLineAnimatedLottieLayout.titleTextView.setText(pendingPaidReactions4.getToastTitle());
        } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
            throw new RuntimeException("adding more amount to committed reactions");
        }
        PendingPaidReactions pendingPaidReactions5 = this.currentPendingReactions;
        pendingPaidReactions5.peer = l;
        return pendingPaidReactions5;
    }

    public final void showPriceChangedToast(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        MessageObject messageObject = (MessageObject) list.get(0);
        long dialogId = messageObject.getDialogId();
        int i = this.currentAccount;
        if (dialogId >= 0) {
            MessagesController.getInstance(i).loadFullUser(MessagesController.getInstance(i).getUser(Long.valueOf(dialogId)), 0, true);
        } else {
            MessagesController.getInstance(i).loadFullChat(-dialogId, 0, true);
        }
        BulletinFactory.of(LaunchActivity.getSafeLastFragment()).createSimpleBulletin(R.raw.error, StarsIntroActivity.replaceStars(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])), 1.13f, (ColoredImageSpan[]) null)).show();
    }

    public final void showStarsTopup(LaunchActivity launchActivity, long j, String str) {
        if (this.balanceLoaded) {
            showStarsTopupInternal(launchActivity, j, str);
        } else {
            getBalance(new StarGiftSheet$$ExternalSyntheticLambda139(this, launchActivity, j, str, 29), true, false);
        }
    }

    public final void showStarsTopupInternal(LaunchActivity launchActivity, long j, String str) {
        if (getBalance().amount < j && j > 0) {
            new StarsIntroActivity.StarsNeededSheet(launchActivity, null, j, 4, str, new GiftSheet$$ExternalSyntheticLambda2(18), 0L).show();
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new GiftSheet$$ExternalSyntheticLambda2(19)).setDuration(5000).show(true);
    }

    public final void stopPaidMessages(final long j, final long j2, boolean z, final boolean z2) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i = this.currentAccount;
        togglenopaidmessagesexception.user_id = MessagesController.getInstance(i).getInputUser(j);
        if (j2 != 0) {
            togglenopaidmessagesexception.parent_peer = MessagesController.getInstance(i).getInputPeer(j2);
        }
        togglenopaidmessagesexception.refund_charged = z;
        togglenopaidmessagesexception.require_payment = !z2;
        ConnectionsManager.getInstance(i).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController starsController = this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda46(starsController, tLObject, j2, j, z2));
            }
        });
    }

    public final void subscribeTo(String str, TLRPC.ChatInvite chatInvite, Utilities.Callback2 callback2) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.instance;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            Context context2 = context;
            Theme.ResourcesProvider resourceProvider = getResourceProvider();
            long j = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i = UserConfig.selectedAccount;
                boolean[] zArr = {false};
                StarsController$$ExternalSyntheticLambda34 starsController$$ExternalSyntheticLambda34 = new StarsController$$ExternalSyntheticLambda34(this, j, i, zArr, callback2, context2, resourceProvider, chatInvite, str);
                StarGiftSheet$$ExternalSyntheticLambda66 starGiftSheet$$ExternalSyntheticLambda66 = new StarGiftSheet$$ExternalSyntheticLambda66(this, zArr, callback2, 21);
                BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context2, false, false, resourceProvider);
                LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context2);
                linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new StarsIntroActivity.AnonymousClass4(context2, 40, 0), LayoutHelper.createFrame(-1, -1.0f));
                BackupImageView backupImageView = new BackupImageView(context2);
                backupImageView.setRoundRadius(AndroidUtilities.dp(80.0f));
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                avatarDrawable.setPeerColor(chatInvite.color);
                avatarDrawable.setText(chatInvite.title);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    backupImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", avatarDrawable, chatInvite);
                } else {
                    backupImageView.setImageDrawable(avatarDrawable);
                }
                frameLayout.addView(backupImageView, LayoutHelper.createFrame(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i2 = Theme.key_dialogBackground;
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourceProvider), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, LayoutHelper.createFrame(26, 26, 17));
                imageView.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView.setTranslationY(AndroidUtilities.dp(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, LayoutHelper.createFrame(26, 26, 17));
                imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
                StarsIntroActivity.StarsBalanceView starsBalanceView = new StarsIntroActivity.StarsBalanceView(context2, i, resourceProvider);
                ScaleStateListAnimator.apply(starsBalanceView);
                starsBalanceView.setOnClickListener(new StarsIntroActivity$$ExternalSyntheticLambda66(starsBalanceView, 0));
                frameLayout.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, 117, 7));
                TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context2, 1, 20.0f);
                textViewM.setTypeface(AndroidUtilities.bold());
                int i3 = Theme.key_dialogTextBlack;
                textViewM.setTextColor(Theme.getColor(i3, resourceProvider));
                textViewM.setText(LocaleController.getString(R.string.StarsSubscribeTitle));
                textViewM.setGravity(17);
                TextView textViewM2 = Theme.ResourcesProvider.CC.m(linearLayoutM, textViewM, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0), context2);
                textViewM2.setTextSize(1, 14.0f);
                textViewM2.setTextColor(Theme.getColor(i3, resourceProvider));
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i4 = tL_starsSubscriptionPricing.period;
                if (i4 == 2592000) {
                    textViewM2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeText", (int) tL_starsSubscriptionPricing.amount, chatInvite.title)));
                } else {
                    textViewM2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeTextTest", (int) tL_starsSubscriptionPricing.amount, chatInvite.title, i4 == 300 ? "5 minutes" : "a minute")));
                }
                textViewM2.setMaxWidth(HintView2.cutInFancyHalf(textViewM2.getText(), textViewM2.getPaint()));
                textViewM2.setGravity(17);
                linearLayoutM.addView(textViewM2, LayoutHelper.createLinear(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textViewM3 = RichMessageLayout$$ExternalSyntheticOutline0.m(context2, 1, 14.0f);
                    textViewM3.setTextColor(Theme.getColor(i3, resourceProvider));
                    textViewM3.setText(Emoji.replaceEmoji(chatInvite.about, textViewM3.getPaint().getFontMetricsInt(), false));
                    textViewM3.setGravity(17);
                    linearLayoutM.addView(textViewM3, LayoutHelper.createLinear(-2, -2, 1, 0, 6, 0, 22));
                }
                ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context2, true, resourceProvider);
                buttonWithCounterView.setText(LocaleController.getString(R.string.StarsSubscribeButton), false);
                linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context2, resourceProvider);
                linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new GiftSheet$$ExternalSyntheticLambda18(context2, 7)));
                linksTextView.setGravity(17);
                linksTextView.setTextSize(1, 13.0f);
                linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourceProvider));
                linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourceProvider));
                linearLayoutM.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 49, 14, 14, 14, 6));
                bottomSheetM.customView = linearLayoutM;
                buttonWithCounterView.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(starsController$$ExternalSyntheticLambda34, bottomSheetM, buttonWithCounterView, 10));
                bottomSheetM.setOnDismissListener(new RichEditor$$ExternalSyntheticLambda46(starGiftSheet$$ExternalSyntheticLambda66, 8));
                bottomSheetM.fixNavigationBar(Theme.getColor(i2, resourceProvider));
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (!AndroidUtilities.isTablet() && safeLastFragment != null && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
                    bottomSheetM.makeAttached(safeLastFragment);
                }
                bottomSheetM.show();
            }
        }
    }

    public final void updateBalance(TL_stars.StarsAmount starsAmount) {
        boolean zEquals = this.balance.equals(starsAmount);
        int i = this.currentAccount;
        if (!zEquals) {
            this.balance = starsAmount;
            this.minus = 0L;
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.minus != 0) {
            this.minus = 0L;
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
    }

    public final void updateMediaPrice(final MessageObject messageObject, final long j, final Runnable runnable, final boolean z) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (messageObject == null) {
            runnable.run();
            return;
        }
        final long dialogId = messageObject.getDialogId();
        final int id = messageObject.getId();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i = this.currentAccount;
        tL_messages_editMessage.peer = MessagesController.getInstance(i).getInputPeer(dialogId);
        int i2 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i2;
        tL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tL_messages_editMessage.id = id;
        tL_messages_editMessage.flags = i2 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j;
        int i3 = 0;
        while (i3 < tL_messageMediaPaidMedia2.extended_media.size()) {
            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i3);
            if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
                runnable.run();
                return;
            }
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.id = tL_inputDocument;
                    tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaDocument);
                }
            }
            i3++;
            tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
        }
        tL_messages_editMessage.media = tL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController starsController = this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda52(starsController, tLObject, runnable, tL_error, z, dialogId, id, messageObject, j));
            }
        });
    }

    public static StarsController getInstance(int i, AmountUtils$Currency amountUtils$Currency) {
        return getInstance(i, amountUtils$Currency == AmountUtils$Currency.TON);
    }

    public final TL_stars.StarsAmount getBalance(Runnable runnable, boolean z, boolean z2) {
        if (((!this.balanceLoaded || System.currentTimeMillis() - this.lastBalanceLoaded > 60000) && !this.balanceLoading) || z2) {
            this.balanceLoading = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.ton;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsStatus, new StarGiftSheet$$ExternalSyntheticLambda0(21, this, runnable));
        }
        if (!z || this.minus <= 0) {
            return this.balance;
        }
        AmountUtils$Amount amountUtils$AmountOfSafe = AmountUtils$Amount.ofSafe(this.balance);
        return AmountUtils$Amount.fromDecimal(Math.max(0L, (amountUtils$AmountOfSafe.nanos / 1000000000) - this.minus), amountUtils$AmountOfSafe.currency).toTl();
    }

    public static StarsController getInstance(int i, boolean z) {
        StarsController starsController;
        StarsController starsController2 = Instance[z ? 1 : 0][i];
        if (starsController2 != null) {
            return starsController2;
        }
        synchronized (lockObjects[z ? 1 : 0][i]) {
            try {
                starsController = Instance[z ? 1 : 0][i];
                if (starsController == null) {
                    StarsController[] starsControllerArr = Instance[z ? 1 : 0];
                    StarsController starsController3 = new StarsController(i, z);
                    starsControllerArr[i] = starsController3;
                    starsController = starsController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return starsController;
    }

    public final boolean hasTransactions() {
        return hasTransactions(0);
    }

    public final long getPaidReactionsDialogId(MessageId messageId, TLRPC.TL_messageReactions tL_messageReactions) {
        Long l;
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions != null && pendingPaidReactions.message.equals(messageId) && (l = this.currentPendingReactions.peer) != null) {
            return l.longValue();
        }
        Long myPaidReactionPeer = MessageObject.getMyPaidReactionPeer(tL_messageReactions);
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.currentAccount).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final void invalidateProfileGifts(TLRPC.UserFull userFull) {
        long j = userFull.id;
        GiftsList profileGiftsList = getProfileGiftsList(j, false);
        if (profileGiftsList != null && profileGiftsList.totalCount != userFull.stargifts_count) {
            profileGiftsList.invalidate(false);
        }
        GiftsCollections giftsCollections = (GiftsCollections) this.giftCollections.get(j);
        if (giftsCollections != null) {
            if (giftsCollections.currentRequestId != -1) {
                ConnectionsManager.getInstance(giftsCollections.currentAccount).cancelRequest(giftsCollections.currentRequestId, true);
                giftsCollections.currentRequestId = -1;
            }
            giftsCollections.loading = false;
            giftsCollections.loaded = false;
            if (giftsCollections.shown) {
                giftsCollections.load();
            }
        }
    }

    public final void payAfterConfirmed(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (context == null) {
            return;
        }
        final long j = chatInvite.subscription_pricing.amount;
        final String str2 = chatInvite.title;
        TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
        tL_inputInvoiceChatInviteSubscription.hash = str;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final StarsController starsController = this.f$0;
                starsController.getClass();
                final Utilities.Callback2 callback3 = callback2;
                final Context context2 = context;
                final TLRPC.ChatInvite chatInvite2 = chatInvite;
                final String str3 = str;
                final long j2 = j;
                final String str4 = str2;
                final Theme.ResourcesProvider resourcesProvider = resourceProvider;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StarsController starsController2 = starsController;
                        TLObject tLObject2 = tLObject;
                        Utilities.Callback2 callback4 = callback3;
                        long j3 = j2;
                        String str5 = str4;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        TLRPC.ChatInvite chatInvite3 = chatInvite2;
                        String str6 = str3;
                        starsController2.getClass();
                        BaseFragment lastFragment = LaunchActivity.getLastFragment();
                        BulletinFactory bulletinFactoryOf = !AndroidUtilities.hasDialogOnTop(lastFragment) ? BulletinFactory.of(lastFragment) : BulletinFactory.global();
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                callback4.run(0L, Boolean.FALSE);
                                zzkh.m(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, bulletinFactoryOf, R.raw.error);
                                return;
                            } else if (!MessagesController.getInstance(starsController2.currentAccount).starsPurchaseAvailable()) {
                                callback4.run(0L, Boolean.FALSE);
                                StarsController.showNoSupportDialog(context3, resourcesProvider2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context3, resourcesProvider2, j3, 1, chatInvite3.title, new SendGiftSheet$$ExternalSyntheticLambda16(starsController2, zArr, str6, chatInvite3, callback4, 11), 0L);
                                starsNeededSheet.setOnDismissListener(new StarsController$$ExternalSyntheticLambda16(callback4, zArr, 1));
                                starsNeededSheet.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.stageQueue.postRunnable(new StarsController$$ExternalSyntheticLambda12(starsController2, tL_payments_paymentResult, 2));
                        TLRPC.Updates updates = tL_payments_paymentResult.updates;
                        TLRPC.Update update = updates.update;
                        long j4 = update instanceof TL_update.TL_updateChannel ? -((TL_update.TL_updateChannel) update).channel_id : 0L;
                        if (updates.updates != null) {
                            for (int i = 0; i < tL_payments_paymentResult.updates.updates.size(); i++) {
                                if (tL_payments_paymentResult.updates.updates.get(i) instanceof TL_update.TL_updateChannel) {
                                    j4 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i)).channel_id;
                                }
                            }
                        }
                        callback4.run(Long.valueOf(j4), Boolean.TRUE);
                        if (j4 == 0) {
                            bulletinFactoryOf.createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, str5))).show();
                        }
                        LaunchActivity launchActivity = LaunchActivity.instance;
                        if (launchActivity != null && launchActivity.getFireworksOverlay() != null) {
                            LaunchActivity.instance.getFireworksOverlay().start(true);
                        }
                        starsController2.invalidateTransactions(true);
                        starsController2.invalidateSubscriptions();
                    }
                });
            }
        });
    }
}
