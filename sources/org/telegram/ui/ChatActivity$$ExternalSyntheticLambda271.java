package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource$MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Components.ChatActivityEnterView$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.MarkdownParser;

public final class ChatActivity$$ExternalSyntheticLambda271 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public ChatActivity$$ExternalSyntheticLambda271(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run() {
        boolean z;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.TL_webPage tL_webPageFromMarkdown;
        int i = 3;
        int i2 = 4;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        Throwable th = null;
        user = null;
        TLRPC.User user = null;
        sQLiteCursorQueryFinalized = null;
        boolean z2 = true;
        z2 = true;
        int i3 = 0;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                BaseFragment baseFragment = (BaseFragment) this.f$1;
                if (baseFragment instanceof NotificationCenter.NotificationCenterDelegate) {
                    chatActivity.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) baseFragment, NotificationCenter.closeChats);
                }
                chatActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((MessageObject) this.f$2).messageOwner.action.channel_id);
                ChatActivity chatActivity2 = new ChatActivity(bundle);
                ActionBarLayout actionBarLayout = (ActionBarLayout) ((INavigationLayout) this.f$3);
                actionBarLayout.addFragmentToStack(actionBarLayout.getFragmentStack().size() - 1, chatActivity2);
                baseFragment.finishFragment();
                return;
            case 1:
                String str = (String) this.f$2;
                RemoteUtils.HostCall hostCall = (RemoteUtils.HostCall) this.f$3;
                Lifecycle lifecycle = (Lifecycle) this.f$0;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f$1;
                if (lifecycle != null && ((LifecycleRegistry) lifecycle).state.compareTo(Lifecycle.State.CREATED) >= 0) {
                    RemoteUtils.dispatchCallFromHost(iOnDoneCallback, str, hostCall);
                    return;
                }
                RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, str, new IllegalStateException("Lifecycle is not at least created when dispatching " + hostCall));
                return;
            case 2:
                AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) this.f$1;
                String str2 = autoValue_TransportContext.backendName;
                TransportScheduleCallback transportScheduleCallback = (TransportScheduleCallback) this.f$2;
                AutoValue_EventInternal autoValue_EventInternal = (AutoValue_EventInternal) this.f$3;
                DefaultScheduler defaultScheduler = (DefaultScheduler) this.f$0;
                defaultScheduler.getClass();
                Logger logger = DefaultScheduler.LOGGER;
                try {
                    TransportBackend transportBackend = defaultScheduler.backendRegistry.get(str2);
                    if (transportBackend == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        transportScheduleCallback.onSchedule(new IllegalArgumentException(str3));
                    } else {
                        ((SQLiteEventStore) defaultScheduler.guard).runCriticalSection(new ChatActivity$$ExternalSyntheticLambda248(defaultScheduler, autoValue_TransportContext, ((CctTransportBackend) transportBackend).decorate(autoValue_EventInternal), i));
                        transportScheduleCallback.onSchedule(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    transportScheduleCallback.onSchedule(e);
                    return;
                }
            case 3:
                ((MediaSourceEventListener) this.f$1).onUpstreamDiscarded(((MediaSourceEventListener.EventDispatcher) this.f$0).windowIndex, (MediaSource$MediaPeriodId) this.f$2, (MediaLoadData) this.f$3);
                return;
            case 4:
                CameraController.lambda$openRound$9((CameraSession) this.f$0, (Runnable) this.f$1, (SurfaceTexture) this.f$2, (Runnable) this.f$3);
                return;
            case 5:
                CameraController.lambda$close$5((Runnable) this.f$0, (CameraSession) this.f$1, (CountDownLatch) this.f$2, (Runnable) this.f$3);
                return;
            case 6:
                ((VideoAds) this.f$0).lambda$show$14((Context) this.f$1, (TLRPC.TL_sponsoredMessage) this.f$2, (ItemOptions) this.f$3);
                return;
            case 7:
                TLObject tLObject = (TLObject) this.f$0;
                Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) this.f$1;
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) this.f$2;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.f$3;
                Theme.loadingCurrentTheme--;
                if (tLObject instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (themeAccent == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document == null || document.id == tL_theme.document.id) {
                            z2 = false;
                        } else if (themeAccent != null) {
                            themeAccent.info = tL_theme2;
                        } else {
                            themeInfo.info = tL_theme2;
                            themeInfo.loaded = false;
                            themeInfo.loadingThemeWallpaperName = null;
                            themeInfo.newPathToWallpaper = null;
                            NotificationCenter.getInstance(themeInfo.account).addObserver(themeInfo, NotificationCenter.fileLoaded);
                            NotificationCenter.getInstance(themeInfo.account).addObserver(themeInfo, NotificationCenter.fileLoadFailed);
                            FileLoader fileLoader = FileLoader.getInstance(themeInfo.account);
                            TLRPC.TL_theme tL_theme3 = themeInfo.info;
                            fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                        }
                    } else {
                        if (Theme.ThemeInfo.accentEquals(themeAccent, themeSettings)) {
                            z = false;
                        } else {
                            File pathToWallpaper = themeAccent.getPathToWallpaper();
                            if (pathToWallpaper != null) {
                                pathToWallpaper.delete();
                            }
                            Theme.ThemeInfo.fillAccentValues(themeAccent, themeSettings);
                            Theme.ThemeInfo themeInfo2 = Theme.currentTheme;
                            if (themeInfo2 == themeInfo && themeInfo2.currentAccentId == themeAccent.id) {
                                Theme.refreshThemeColors(false, false);
                                Theme.createChatResources(ApplicationLoader.applicationContext);
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                int i4 = NotificationCenter.needSetDayNightTheme;
                                Theme.ThemeInfo themeInfo3 = Theme.currentTheme;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i4, themeInfo3, Boolean.valueOf(Theme.currentNightTheme == themeInfo3), null, -1);
                            }
                            Theme.PatternsLoader.createLoader(true);
                            z = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        themeAccent.patternMotion = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z2 = z;
                    }
                } else {
                    z2 = false;
                }
                if (Theme.loadingCurrentTheme == 0) {
                    Theme.lastLoadingCurrentThemeTime = (int) (System.currentTimeMillis() / 1000);
                    Theme.saveOtherThemes(z2, false);
                    return;
                }
                return;
            case 8:
                ((Utilities.Callback) this.f$0).run(Theme.getThemeFileValues((File) this.f$1, (String) this.f$2, (String[]) this.f$3));
                return;
            case 9:
                BaseLocationAdapter baseLocationAdapter = (BaseLocationAdapter) this.f$0;
                baseLocationAdapter.searchingLocations = false;
                if (((Location) this.f$1) == null) {
                    baseLocationAdapter.currentRequestNum = 0;
                    baseLocationAdapter.searching = false;
                    baseLocationAdapter.places.clear();
                    baseLocationAdapter.searchInProgress = false;
                    baseLocationAdapter.lastFoundQuery = (String) this.f$2;
                }
                ArrayList arrayList = baseLocationAdapter.locations;
                arrayList.clear();
                arrayList.addAll((ArrayList) this.f$3);
                baseLocationAdapter.notifyDataSetChanged();
                return;
            case 10:
                BaseLocationAdapter baseLocationAdapter2 = (BaseLocationAdapter) this.f$0;
                ArrayList arrayList2 = baseLocationAdapter2.places;
                if (((TLRPC.TL_error) this.f$1) == null) {
                    baseLocationAdapter2.currentRequestNum = 0;
                    baseLocationAdapter2.searching = false;
                    arrayList2.clear();
                    baseLocationAdapter2.searchInProgress = false;
                    baseLocationAdapter2.lastFoundQuery = (String) this.f$2;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) ((TLObject) this.f$3);
                    int size = messages_botresults.results.size();
                    while (i3 < size) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i3);
                        if ("venue".equals(botInlineResult.type)) {
                            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                                tL_messageMediaVenue.icon = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
                                tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                                tL_messageMediaVenue.query_id = messages_botresults.query_id;
                                tL_messageMediaVenue.result_id = botInlineResult.id;
                                arrayList2.add(tL_messageMediaVenue);
                            }
                        }
                        i3++;
                    }
                }
                BaseLocationAdapter.BaseLocationAdapterDelegate baseLocationAdapterDelegate = baseLocationAdapter2.delegate;
                if (baseLocationAdapterDelegate != null) {
                    baseLocationAdapterDelegate.didLoadSearchResult(arrayList2);
                }
                baseLocationAdapter2.notifyDataSetChanged();
                return;
            case 11:
                DialogsAdapter dialogsAdapter = (DialogsAdapter) this.f$0;
                dialogsAdapter.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(dialogsAdapter, (DialogsActivity$14$$ExternalSyntheticLambda1) this.f$2, (ArrayList) this.f$3, DiffUtil.calculateDiff((DialogsAdapter.AnonymousClass1) this.f$1, true), 12));
                return;
            case 12:
                DialogsAdapter dialogsAdapter2 = (DialogsAdapter) this.f$0;
                if (dialogsAdapter2.isCalculatingDiff) {
                    dialogsAdapter2.isCalculatingDiff = false;
                    DialogsActivity$14$$ExternalSyntheticLambda1 dialogsActivity$14$$ExternalSyntheticLambda1 = (DialogsActivity$14$$ExternalSyntheticLambda1) this.f$1;
                    if (dialogsActivity$14$$ExternalSyntheticLambda1 != null) {
                        dialogsActivity$14$$ExternalSyntheticLambda1.run();
                    }
                    dialogsAdapter2.itemInternals = (ArrayList) this.f$2;
                    ((DiffUtil.DiffResult) this.f$3).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(dialogsAdapter2, true ? 1 : 0));
                    if (dialogsAdapter2.updateListPending) {
                        dialogsAdapter2.updateListPending = false;
                        dialogsAdapter2.updateList(dialogsActivity$14$$ExternalSyntheticLambda1);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                BoostsActivity boostsActivity = (BoostsActivity) this.f$0;
                boostsActivity.getClass();
                CountDownLatch countDownLatch = (CountDownLatch) this.f$1;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                TLObject tLObject2 = (TLObject) this.f$2;
                if (tLObject2 != null) {
                    boostsActivity.limitGifts = 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                    MessagesController.getInstance(boostsActivity.currentAccount).putUsers(tL_premium_boostsList.users, false);
                    boostsActivity.lastGiftsOffset = tL_premium_boostsList.next_offset;
                    ArrayList<TL_stories.Boost> arrayList3 = tL_premium_boostsList.boosts;
                    ArrayList arrayList4 = boostsActivity.gifts;
                    arrayList4.addAll(arrayList3);
                    int size2 = arrayList4.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < size2) {
                        Object obj = arrayList4.get(i5);
                        i5++;
                        int i7 = ((TL_stories.Boost) obj).multiplier;
                        if (i7 <= 0) {
                            i7 = 1;
                        }
                        i6 += i7;
                    }
                    boostsActivity.nextGiftsRemaining = Math.max(0, tL_premium_boostsList.count - i6);
                    boostsActivity.hasGiftsNext = !TextUtils.isEmpty(tL_premium_boostsList.next_offset) && boostsActivity.nextGiftsRemaining > 0;
                    boostsActivity.totalGifts = tL_premium_boostsList.count;
                    BoostsActivity$$ExternalSyntheticLambda4 boostsActivity$$ExternalSyntheticLambda4 = (BoostsActivity$$ExternalSyntheticLambda4) this.f$3;
                    if (boostsActivity$$ExternalSyntheticLambda4 != null) {
                        boostsActivity$$ExternalSyntheticLambda4.run();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                BoostsActivity boostsActivity2 = (BoostsActivity) this.f$0;
                boostsActivity2.getClass();
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f$1;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                }
                TLObject tLObject3 = (TLObject) this.f$2;
                if (tLObject3 != null) {
                    boostsActivity2.limitBoosts = 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                    MessagesController.getInstance(boostsActivity2.currentAccount).putUsers(tL_premium_boostsList2.users, false);
                    boostsActivity2.lastBoostsOffset = tL_premium_boostsList2.next_offset;
                    ArrayList<TL_stories.Boost> arrayList5 = tL_premium_boostsList2.boosts;
                    ArrayList arrayList6 = boostsActivity2.boosters;
                    arrayList6.addAll(arrayList5);
                    int size3 = arrayList6.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < size3) {
                        Object obj2 = arrayList6.get(i8);
                        i8++;
                        int i10 = ((TL_stories.Boost) obj2).multiplier;
                        if (i10 <= 0) {
                            i10 = 1;
                        }
                        i9 += i10;
                    }
                    boostsActivity2.nextBoostRemaining = Math.max(0, tL_premium_boostsList2.count - i9);
                    boostsActivity2.hasBoostsNext = !TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && boostsActivity2.nextBoostRemaining > 0;
                    boostsActivity2.totalBoosts = tL_premium_boostsList2.count;
                    BoostsActivity$$ExternalSyntheticLambda4 boostsActivity$$ExternalSyntheticLambda5 = (BoostsActivity$$ExternalSyntheticLambda4) this.f$3;
                    if (boostsActivity$$ExternalSyntheticLambda5 != null) {
                        boostsActivity$$ExternalSyntheticLambda5.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                BusinessLinksController businessLinksController = (BusinessLinksController) this.f$0;
                businessLinksController.getClass();
                TLObject tLObject4 = (TLObject) this.f$1;
                if (tLObject4 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject4;
                    ArrayList arrayList7 = businessLinksController.links;
                    int iIndexOf = arrayList7.indexOf((TL_account.TL_businessChatLink) this.f$2);
                    if (iIndexOf != -1) {
                        arrayList7.set(iIndexOf, tL_businessChatLink);
                        NotificationCenter.getInstance(businessLinksController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                        ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = (ChatActivityEnterView$$ExternalSyntheticLambda4) this.f$3;
                        if (chatActivityEnterView$$ExternalSyntheticLambda4 != null) {
                            chatActivityEnterView$$ExternalSyntheticLambda4.run();
                        }
                        businessLinksController.saveToCache();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                MessagesStorage messagesStorage = (MessagesStorage) this.f$1;
                QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) this.f$2;
                QuickRepliesController quickRepliesController = (QuickRepliesController) this.f$0;
                ArrayList arrayList8 = new ArrayList();
                try {
                    try {
                        sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(quickReply.id));
                        while (sQLiteCursorQueryFinalized.next()) {
                            arrayList8.add(Integer.valueOf(sQLiteCursorQueryFinalized.intValue(0)));
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        if (sQLiteCursorQueryFinalized != null) {
                        }
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(quickRepliesController, arrayList8, quickReply, (TLRPC.TL_messages_sendQuickReplyMessages) this.f$3, 17));
                        return;
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(quickRepliesController, arrayList8, quickReply, (TLRPC.TL_messages_sendQuickReplyMessages) this.f$3, 17));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursorQueryFinalized != null) {
                        sQLiteCursorQueryFinalized.dispose();
                    }
                    throw th2;
                }
            case 17:
                QuickRepliesController quickRepliesController2 = (QuickRepliesController) this.f$0;
                ArrayList<Integer> arrayList9 = (ArrayList) this.f$1;
                boolean zIsEmpty = arrayList9.isEmpty();
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f$3;
                QuickRepliesController.QuickReply quickReply2 = (QuickRepliesController.QuickReply) this.f$2;
                int i11 = quickRepliesController2.currentAccount;
                if (zIsEmpty || arrayList9.size() < quickReply2.getMessagesCount()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = quickReply2.id;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getQuickReplyMessages, new BoostsActivity$$ExternalSyntheticLambda7(quickRepliesController2, arrayList9, tL_messages_sendQuickReplyMessages, i2));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages.id = arrayList9;
                    while (i3 < arrayList9.size()) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i3++;
                    }
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    return;
                }
            case 18:
                CacheControlActivity.ClearCacheButtonInternal clearCacheButtonInternal = (CacheControlActivity.ClearCacheButtonInternal) this.f$0;
                clearCacheButtonInternal.getClass();
                ((CacheControlActivity.ClearingCacheView) this.f$1).setProgress(((float[]) this.f$2)[0]);
                if (((boolean[]) this.f$3)[0]) {
                    CacheControlActivity.this.updateRows$1(true);
                    return;
                }
                return;
            case 19:
                CacheControlActivity.ClearCacheButtonInternal clearCacheButtonInternal2 = (CacheControlActivity.ClearCacheButtonInternal) this.f$0;
                clearCacheButtonInternal2.getClass();
                if (((boolean[]) this.f$1)[0]) {
                    return;
                }
                ((long[]) this.f$2)[0] = System.currentTimeMillis();
                CacheControlActivity.this.showDialog((CacheControlActivity.ClearCacheButtonInternal.AnonymousClass1) this.f$3);
                return;
            case 20:
                ((CalendarActivity) this.f$0).lambda$loadNext$2((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (Calendar) this.f$3);
                return;
            case 21:
                ((ChangeUsernameActivity) this.f$0).lambda$saveName$9((AlertDialog) this.f$1, (TLRPC.TL_error) this.f$2, (TL_account.updateUsername) this.f$3);
                return;
            case 22:
                ChannelBoostLayout channelBoostLayout = (ChannelBoostLayout) this.f$0;
                channelBoostLayout.getClass();
                CountDownLatch countDownLatch3 = (CountDownLatch) this.f$1;
                if (countDownLatch3 != null) {
                    countDownLatch3.countDown();
                }
                TLObject tLObject5 = (TLObject) this.f$2;
                if (tLObject5 != null) {
                    channelBoostLayout.limitBoosts = 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList3 = (TL_stories.TL_premium_boostsList) tLObject5;
                    MessagesController.getInstance(channelBoostLayout.currentAccount).putUsers(tL_premium_boostsList3.users, false);
                    channelBoostLayout.lastBoostsOffset = tL_premium_boostsList3.next_offset;
                    ArrayList<TL_stories.Boost> arrayList10 = tL_premium_boostsList3.boosts;
                    ArrayList arrayList11 = channelBoostLayout.boosters;
                    arrayList11.addAll(arrayList10);
                    int size4 = arrayList11.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < size4) {
                        Object obj3 = arrayList11.get(i12);
                        i12++;
                        int i14 = ((TL_stories.Boost) obj3).multiplier;
                        if (i14 <= 0) {
                            i14 = 1;
                        }
                        i13 += i14;
                    }
                    channelBoostLayout.nextBoostRemaining = Math.max(0, tL_premium_boostsList3.count - i13);
                    channelBoostLayout.hasBoostsNext = !TextUtils.isEmpty(tL_premium_boostsList3.next_offset) && channelBoostLayout.nextBoostRemaining > 0;
                    channelBoostLayout.totalBoosts = tL_premium_boostsList3.count;
                    ChannelBoostLayout$$ExternalSyntheticLambda2 channelBoostLayout$$ExternalSyntheticLambda2 = (ChannelBoostLayout$$ExternalSyntheticLambda2) this.f$3;
                    if (channelBoostLayout$$ExternalSyntheticLambda2 != null) {
                        channelBoostLayout$$ExternalSyntheticLambda2.run();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ChannelBoostLayout channelBoostLayout2 = (ChannelBoostLayout) this.f$0;
                channelBoostLayout2.getClass();
                CountDownLatch countDownLatch4 = (CountDownLatch) this.f$1;
                if (countDownLatch4 != null) {
                    countDownLatch4.countDown();
                }
                TLObject tLObject6 = (TLObject) this.f$2;
                if (tLObject6 != null) {
                    channelBoostLayout2.limitGifts = 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList4 = (TL_stories.TL_premium_boostsList) tLObject6;
                    MessagesController.getInstance(channelBoostLayout2.currentAccount).putUsers(tL_premium_boostsList4.users, false);
                    channelBoostLayout2.lastGiftsOffset = tL_premium_boostsList4.next_offset;
                    ArrayList<TL_stories.Boost> arrayList12 = tL_premium_boostsList4.boosts;
                    ArrayList arrayList13 = channelBoostLayout2.gifts;
                    arrayList13.addAll(arrayList12);
                    int size5 = arrayList13.size();
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < size5) {
                        Object obj4 = arrayList13.get(i15);
                        i15++;
                        int i17 = ((TL_stories.Boost) obj4).multiplier;
                        if (i17 <= 0) {
                            i17 = 1;
                        }
                        i16 += i17;
                    }
                    channelBoostLayout2.nextGiftsRemaining = Math.max(0, tL_premium_boostsList4.count - i16);
                    channelBoostLayout2.hasGiftsNext = !TextUtils.isEmpty(tL_premium_boostsList4.next_offset) && channelBoostLayout2.nextGiftsRemaining > 0;
                    channelBoostLayout2.totalGifts = tL_premium_boostsList4.count;
                    ChannelBoostLayout$$ExternalSyntheticLambda2 channelBoostLayout$$ExternalSyntheticLambda3 = (ChannelBoostLayout$$ExternalSyntheticLambda2) this.f$3;
                    if (channelBoostLayout$$ExternalSyntheticLambda3 != null) {
                        channelBoostLayout$$ExternalSyntheticLambda3.run();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ChatActivity chatActivity3 = (ChatActivity) this.f$0;
                chatActivity3.getClass();
                ((ChatActivity.AnonymousClass127) this.f$1).end(false);
                TLObject tLObject7 = (TLObject) this.f$2;
                if (tLObject7 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject7;
                    chatActivity3.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    chatActivity3.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = chatActivity3.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    }
                }
                ((ChatActivity$$ExternalSyntheticLambda155) this.f$3).run(user);
                return;
            case 25:
                ((long[]) this.f$0)[0] = SystemClock.elapsedRealtime();
                CrossfadeDrawable crossfadeDrawable = (CrossfadeDrawable) ((ImageView) (((boolean[]) this.f$1)[0] ? this.f$2 : this.f$3)).getDrawable();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ChatActivity$$ExternalSyntheticLambda451(crossfadeDrawable, 0));
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                valueAnimatorOfFloat.start();
                return;
            case 26:
                MessageObject messageObject = (MessageObject) this.f$2;
                ChatActivity chatActivity4 = (ChatActivity) this.f$0;
                try {
                    tL_webPageFromMarkdown = MarkdownParser.fromMarkdown(messageObject);
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    tL_webPageFromMarkdown = null;
                    th = th3;
                }
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda482(chatActivity4, (AlertDialog) this.f$1, (boolean[]) this.f$3, th == null && tL_webPageFromMarkdown != null, messageObject, tL_webPageFromMarkdown, 0));
                return;
            case 27:
                ChatActivity chatActivity5 = (ChatActivity) this.f$0;
                chatActivity5.getClass();
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) this.f$1);
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$2;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.f$3;
                if (tL_error == null && !messages_messages.messages.isEmpty()) {
                    int i18 = messages_messages.messages.get(0).id;
                    MessageObject messageObject2 = (MessageObject) chatActivity5.messagesDict[0].get(i18);
                    messagesStorage2.markMessageAsMention(chatActivity5.dialog_id, i18);
                    if (messageObject2 != null) {
                        TLRPC.Message message = messageObject2.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    chatActivity5.scrollToMessageId(i18, 0, false, 0, true, 0);
                    return;
                }
                if (messages_messages != null) {
                    chatActivity5.newMentionsCount = messages_messages.count;
                } else {
                    chatActivity5.newMentionsCount = 0;
                }
                messagesStorage2.resetMentionsCount(chatActivity5.dialog_id, chatActivity5.getTopicId(), chatActivity5.newMentionsCount);
                int i19 = chatActivity5.newMentionsCount;
                if (i19 == 0) {
                    chatActivity5.hasAllMentionsLocal = true;
                    chatActivity5.showMentionDownButton(false);
                    return;
                } else {
                    chatActivity5.sideControlsButtonsLayout.setButtonCount(2, i19, true);
                    chatActivity5.loadLastUnreadMention();
                    return;
                }
            case 28:
                ((ChatActivity) this.f$0).lambda$requestLinkPreview$143((TLRPC.TL_messageMediaWebPage) this.f$1, (TLRPC.TL_webPageAttributeStory) this.f$2, (ChatActivity$$ExternalSyntheticLambda464) this.f$3);
                return;
            default:
                ((ChatLinkActivity) this.f$0).lambda$linkChat$12((AlertDialog[]) this.f$1, (TLRPC.Chat) this.f$2, (GroupCreateFinalActivity) this.f$3);
                return;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda271(ChatActivity chatActivity, MessageObject messageObject, AlertDialog alertDialog, boolean[] zArr) {
        this.$r8$classId = 26;
        this.f$0 = chatActivity;
        this.f$2 = messageObject;
        this.f$1 = alertDialog;
        this.f$3 = zArr;
    }
}
