package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.ChatActivityEnterView$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda65;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda17;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda56;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda28;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda60;

public final class Theme$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public Theme$$ExternalSyntheticLambda17(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run() throws Throwable {
        boolean z;
        boolean z2;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z3;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursorQueryFinalized;
        StoryEntry storyEntryFromStoryItem;
        File file;
        int i;
        int i2;
        TLRPC.Photo photo;
        StoryViewer.VideoPlayerHolder videoPlayerHolder;
        BaseFragment safeLastFragment;
        int i3 = 17;
        int i4 = 1;
        switch (this.$r8$classId) {
            case 0:
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
                            z = false;
                        } else {
                            if (themeAccent != null) {
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
                            z = true;
                        }
                    } else {
                        if (Theme.ThemeInfo.accentEquals(themeAccent, themeSettings)) {
                            z2 = false;
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
                                int i5 = NotificationCenter.needSetDayNightTheme;
                                Theme.ThemeInfo themeInfo3 = Theme.currentTheme;
                                z3 = true;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i5, themeInfo3, Boolean.valueOf(Theme.currentNightTheme == themeInfo3), null, -1);
                            } else {
                                z3 = true;
                            }
                            Theme.PatternsLoader.createLoader(z3);
                            z2 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        themeAccent.patternMotion = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z = z2;
                    }
                } else {
                    z = false;
                }
                if (Theme.loadingCurrentTheme == 0) {
                    Theme.lastLoadingCurrentThemeTime = (int) (System.currentTimeMillis() / 1000);
                    Theme.saveOtherThemes(z, false);
                    return;
                }
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
                        ((SQLiteEventStore) defaultScheduler.guard).runCriticalSection(new RichEditor$$ExternalSyntheticLambda60(defaultScheduler, autoValue_TransportContext, ((CctTransportBackend) transportBackend).decorate(autoValue_EventInternal), 3));
                        transportScheduleCallback.onSchedule(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    transportScheduleCallback.onSchedule(e);
                    return;
                }
            case 3:
                ((MediaSourceEventListener) this.f$1).onUpstreamDiscarded(((MediaSourceEventListener.EventDispatcher) this.f$0).windowIndex, (MediaSource.MediaPeriodId) this.f$2, (MediaLoadData) this.f$3);
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
                ((Utilities.Callback) this.f$0).run(Theme.getThemeFileValues((File) this.f$1, (String) this.f$2, (String[]) this.f$3));
                return;
            case 8:
                ((BaseLocationAdapter) this.f$0).lambda$searchPlacesWithQuery$4((Location) this.f$1, (String) this.f$2, (ArrayList) this.f$3);
                return;
            case 9:
                ((BaseLocationAdapter) this.f$1).lambda$searchPlacesWithQuery$6((TLRPC.TL_error) this.f$2, (String) this.f$3, (TLObject) this.f$0);
                return;
            case 10:
                ((DialogsAdapter) this.f$0).lambda$updateList$1((Runnable) this.f$1, (ArrayList) this.f$2, (DiffUtil.DiffResult) this.f$3);
                return;
            case 11:
                ((DialogsAdapter) this.f$0).lambda$updateList$2((DialogsAdapter.AnonymousClass1) this.f$1, (Runnable) this.f$2, (ArrayList) this.f$3);
                return;
            case 12:
                BusinessLinksController businessLinksController = (BusinessLinksController) this.f$1;
                businessLinksController.getClass();
                TLObject tLObject2 = (TLObject) this.f$0;
                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                    ArrayList arrayList = businessLinksController.links;
                    int iIndexOf = arrayList.indexOf((TL_account.TL_businessChatLink) this.f$2);
                    if (iIndexOf != -1) {
                        arrayList.set(iIndexOf, tL_businessChatLink);
                        NotificationCenter.getInstance(businessLinksController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                        ChatActivityEnterView$$ExternalSyntheticLambda3 chatActivityEnterView$$ExternalSyntheticLambda3 = (ChatActivityEnterView$$ExternalSyntheticLambda3) this.f$3;
                        if (chatActivityEnterView$$ExternalSyntheticLambda3 != null) {
                            chatActivityEnterView$$ExternalSyntheticLambda3.run();
                        }
                        businessLinksController.saveToCache();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                MessagesStorage messagesStorage = (MessagesStorage) this.f$1;
                QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) this.f$2;
                QuickRepliesController quickRepliesController = (QuickRepliesController) this.f$0;
                ArrayList arrayList2 = new ArrayList();
                try {
                    int i6 = 0;
                    sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(quickReply.id));
                    while (sQLiteCursorQueryFinalized.next()) {
                        try {
                            arrayList2.add(Integer.valueOf(sQLiteCursorQueryFinalized.intValue(i6)));
                            i6 = 0;
                        } catch (Exception e2) {
                            e = e2;
                            sQLiteCursor2 = sQLiteCursorQueryFinalized;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursorQueryFinalized = sQLiteCursor2;
                                }
                                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17(14, quickRepliesController, arrayList2, quickReply, (TLRPC.TL_messages_sendQuickReplyMessages) this.f$3));
                                return;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteCursor = sQLiteCursor2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    sQLiteCursor2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                sQLiteCursorQueryFinalized.dispose();
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17(14, quickRepliesController, arrayList2, quickReply, (TLRPC.TL_messages_sendQuickReplyMessages) this.f$3));
                return;
            case 14:
                QuickRepliesController quickRepliesController2 = (QuickRepliesController) this.f$0;
                ArrayList<Integer> arrayList3 = (ArrayList) this.f$1;
                boolean zIsEmpty = arrayList3.isEmpty();
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f$3;
                QuickRepliesController.QuickReply quickReply2 = (QuickRepliesController.QuickReply) this.f$2;
                int i7 = quickRepliesController2.currentAccount;
                if (zIsEmpty || arrayList3.size() < quickReply2.getMessagesCount()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = quickReply2.id;
                    ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getQuickReplyMessages, new StarGiftSheet$$ExternalSyntheticLambda1(quickRepliesController2, arrayList3, tL_messages_sendQuickReplyMessages, 3));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages.id = arrayList3;
                    for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(i7).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    return;
                }
            case 15:
                StickerMakerView stickerMakerView = (StickerMakerView) this.f$1;
                stickerMakerView.getClass();
                TLObject tLObject3 = (TLObject) this.f$0;
                if (!(tLObject3 instanceof TLRPC.TL_messageMediaDocument)) {
                    stickerMakerView.hideLoadingDialog();
                    stickerMakerView.showError((TLRPC.TL_error) this.f$3);
                    return;
                }
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject3;
                TLRPC.Document document2 = tL_messageMediaDocument.document;
                StickerMakerView.StickerUploader stickerUploader = (StickerMakerView.StickerUploader) this.f$2;
                stickerUploader.tlInputStickerSetItem = MediaDataController.getInputStickerSetItem(document2, stickerUploader.emoji);
                stickerUploader.mediaDocument = tL_messageMediaDocument;
                stickerMakerView.afterUploadingMedia();
                return;
            case 16:
                StickerMakerView stickerMakerView2 = (StickerMakerView) this.f$0;
                stickerMakerView2.empty = true;
                stickerMakerView2.objects = (StickerMakerView.SegmentedObject[]) ((ArrayList) this.f$1).toArray(new StickerMakerView.SegmentedObject[0]);
                ((PhotoViewer$$ExternalSyntheticLambda65) this.f$2).run((StickerMakerView.SegmentedObject) this.f$3);
                return;
            case 17:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$1;
                if (tL_error != null) {
                    ((Utilities.Callback) this.f$2).run(tL_error);
                    return;
                }
                TLObject tLObject4 = (TLObject) this.f$0;
                if (tLObject4 instanceof TLRPC.payments_GiveawayInfo) {
                    ((Utilities.Callback) this.f$3).run((TLRPC.payments_GiveawayInfo) tLObject4);
                    return;
                }
                return;
            case 18:
                final ProfileGiftsContainer.Page page = (ProfileGiftsContainer.Page) this.f$0;
                page.getClass();
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f$1;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    ((GiftSheet.GiftCell) this.f$2).setStarsGift(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = page.list.getInput(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(page.currentAccount).sendRequest(savestargift, null, 64);
                }
                boolean z4 = savedStarGift.pinned_to_top;
                final boolean z5 = !z4;
                boolean z6 = page.list.togglePinned(savedStarGift, z5, false);
                ProfileGiftsContainer profileGiftsContainer = page.parent;
                final View view = (View) this.f$3;
                if (z6) {
                    new ProfileGiftsContainer.UnpinSheet(page.getContext(), profileGiftsContainer.dialogId, savedStarGift, page.resourcesProvider, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ProfileGiftsContainer.Page page2 = page;
                            page2.getClass();
                            ((GiftSheet.GiftCell) view).setPinned(z5, true);
                            page2.listView.scrollToPosition(0);
                            return BulletinFactory.of(page2.parent.fragment);
                        }
                    }).show();
                    return;
                }
                if (z4) {
                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.Gift2Unpinned, BulletinFactory.of(profileGiftsContainer.fragment), R.raw.ic_unpin);
                } else {
                    BulletinFactory.of(profileGiftsContainer.fragment).createSimpleBulletin(R.raw.ic_pin, LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle)).show();
                }
                ((GiftSheet.GiftCell) view).setPinned(z5, true);
                page.listView.scrollToPosition(0);
                return;
            case 19:
                BaseFragment baseFragment = (BaseFragment) this.f$0;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f$1;
                if (baseFragment != null && tL_error2 != null) {
                    BulletinFactory.of(baseFragment).showForError(tL_error2);
                }
                if ((baseFragment instanceof ChatActivity) && tL_error2 == null) {
                    ((ChatActivity) baseFragment).startFireworks();
                }
                ((Browser.Progress) this.f$2).end();
                ((AlertDialog) this.f$3).dismiss();
                return;
            case 20:
                ((StarGiftSheet) this.f$1).lambda$openTransfer$145((TLObject) this.f$0, (StarGiftSheet$$ExternalSyntheticLambda66) this.f$2, (TLRPC.TL_error) this.f$3);
                return;
            case 21:
                ((StarGiftSheet) this.f$0).lambda$openCrafting$3((MessageObject) this.f$1, (ArrayList) this.f$2, (TL_stars.StarGift) this.f$3);
                return;
            case 22:
                ((StarGiftSheet) this.f$0).getClass();
                ((UserSelectorBottomSheet[]) this.f$1)[0].lambda$showGiftOfferSheet$15();
                ((Browser.Progress) this.f$2).end();
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 == null) {
                    return;
                }
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                safeLastFragment2.showAsSheet((TwoStepVerificationActivity) this.f$3, bottomSheetParams);
                return;
            case 23:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$1;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f$2;
                TLObject tLObject5 = (TLObject) this.f$0;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f$3;
                if (tL_error3 == null) {
                    starGiftSheet.getClass();
                    if (tLObject5 instanceof TLRPC.Updates) {
                        starGiftSheet.upgradedOnce = true;
                        starGiftSheet.upgrade_form = null;
                        int i9 = 3;
                        starGiftSheet.applyNewGiftFromUpdates(inputSavedStarGift, (TLRPC.Updates) tLObject5, new StarGiftSheet$$ExternalSyntheticLambda4(starGiftSheet, i9));
                        Utilities.stageQueue.postRunnable(new LivePlayer$$ExternalSyntheticLambda17(i9, starGiftSheet, tLObject5));
                        return;
                    }
                }
                starGiftSheet.getBulletinFactory().showForError(tL_error3);
                return;
            case 24:
                ((StarGiftSheet) this.f$0).lambda$addAttributeRow$45((boolean[]) this.f$1, (TL_stars.StarGiftAttribute) this.f$2, (ButtonSpan.TextViewButtons[]) this.f$3);
                return;
            case 25:
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) this.f$0;
                craftTopView.crafting = false;
                if (((TL_stars.StarGift) this.f$1) != null) {
                    AndroidUtilities.runOnUIThread((Runnable) this.f$3);
                    return;
                }
                RLottieImageView rLottieImageView = craftTopView.brokenGiftImage;
                if (rLottieImageView != null) {
                    rLottieImageView.playAnimation();
                    AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(i3), 750L);
                }
                craftTopView.precraftingLayout.animate().alpha(0.0f).start();
                craftTopView.failedLayout.animate().alpha(1.0f).start();
                craftTopView.button.animate().alpha(1.0f).start();
                craftTopView.craftingLayout.animate().alpha(0.0f).start();
                craftTopView.buttonsLayout.animate().alpha(1.0f).start();
                TextView textView = craftTopView.failedSubtitle;
                ArrayList arrayList4 = (ArrayList) this.f$2;
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList4.size(), new Object[0])));
                AnimatedTextView animatedTextView = craftTopView.buttonTitle;
                animatedTextView.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                animatedTextView.setTranslationY(AndroidUtilities.dp(6.0f));
                craftTopView.buttonSubtitle.setAlpha(0.0f);
                if (craftTopView.failedGifts != null) {
                    int i10 = 0;
                    while (true) {
                        GiftSheet.GiftCell[] giftCellArr = craftTopView.failedGifts;
                        if (i10 < giftCellArr.length) {
                            AndroidUtilities.removeFromParent(giftCellArr[i10]);
                            i10++;
                        } else {
                            craftTopView.failedGifts = null;
                        }
                    }
                }
                craftTopView.failedGifts = new GiftSheet.GiftCell[arrayList4.size()];
                int i11 = 0;
                while (i11 < arrayList4.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList4.get(i11);
                    GiftSheet.GiftCell giftCell = new GiftSheet.GiftCell(craftTopView.getContext(), craftTopView.currentAccount, craftTopView.resourcesProvider);
                    giftCell.setStarsGift(starGift, false, false, false, false, true);
                    giftCell.chanceTextView.setVisibility(8);
                    giftCell.setRibbonColor(-3065286);
                    BackupImageView backupImageView = giftCell.imageView;
                    FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(42, 42, 17);
                    giftCell.imageViewLayoutParams = layoutParamsCreateFrame;
                    backupImageView.setLayoutParams(layoutParamsCreateFrame);
                    int i12 = i11 + 1;
                    boolean z7 = i12 >= arrayList4.size();
                    LinearLayout linearLayout = craftTopView.failedGiftsLayout;
                    craftTopView.failedGifts[i11] = giftCell;
                    linearLayout.addView(giftCell, LayoutHelper.createLinear(74, 74, 0.0f, 51, 0, 0, z7 ? 0 : 6, 0));
                    i11 = i12;
                }
                return;
            case 26:
                ((StarsController) this.f$1).getClass();
                TLObject tLObject6 = (TLObject) this.f$0;
                boolean z8 = tLObject6 instanceof TLRPC.TL_payments_paymentFormStarGift;
                Utilities.Callback callback = (Utilities.Callback) this.f$3;
                if (z8) {
                    callback.run((TLRPC.TL_payments_paymentFormStarGift) tLObject6);
                    return;
                }
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f$2;
                StarsController.bulletinError(tL_error4 == null ? "NO_PAYMENT_FORM" : tL_error4.text);
                callback.run(null);
                return;
            case 27:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                Activity activity = (Activity) this.f$1;
                StoryViewer storyViewer = (StoryViewer) this.f$2;
                PeerStoriesView.SharedResources sharedResources = (PeerStoriesView.SharedResources) this.f$3;
                StoryRecorder storyRecorder = StoryRecorder.getInstance(activity, anonymousClass8.this$0.currentAccount);
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = anonymousClass8.this$0.playerSharedScope;
                long j = (videoPlayerSharedScope == null || (videoPlayerHolder = videoPlayerSharedScope.player) == null) ? 0L : videoPlayerHolder.currentPosition;
                DraftsController draftsController = MessagesController.getInstance(anonymousClass8.this$0.currentAccount).getStoriesController().draftsController;
                TL_stories.StoryItem storyItem = anonymousClass8.this$0.currentStory.storyItem;
                long j2 = storyItem.dialogId;
                ArrayList arrayList5 = draftsController.drafts;
                int size = arrayList5.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size) {
                        Object obj = arrayList5.get(i13);
                        int i14 = i13 + i4;
                        StoryEntry storyEntry = (StoryEntry) obj;
                        if (storyEntry.isEdit && storyItem.id == storyEntry.editStoryId) {
                            i = i14;
                            if (j2 == storyEntry.editStoryPeerId) {
                                TLRPC.MessageMedia messageMedia = storyItem.media;
                                TLRPC.Document document3 = messageMedia.document;
                                i2 = size;
                                if ((document3 == null || document3.id == storyEntry.editDocumentId) && ((photo = messageMedia.photo) == null || photo.id == storyEntry.editPhotoId)) {
                                    storyEntry.isEditSaved = true;
                                    storyEntryFromStoryItem = storyEntry;
                                }
                            }
                            i13 = i;
                            size = i2;
                            i4 = 1;
                        } else {
                            i = i14;
                        }
                        i2 = size;
                        i13 = i;
                        size = i2;
                        i4 = 1;
                    } else {
                        storyEntryFromStoryItem = null;
                    }
                }
                if (storyEntryFromStoryItem == null || storyEntryFromStoryItem.isRepostMessage || (file = storyEntryFromStoryItem.file) == null || !file.exists()) {
                    storyEntryFromStoryItem = StoryEntry.fromStoryItem(anonymousClass8.this$0.currentStory.getPath(), anonymousClass8.this$0.currentStory.storyItem);
                    storyEntryFromStoryItem.editStoryPeerId = anonymousClass8.this$0.dialogId;
                }
                StoryEntry storyEntryCopy$1 = storyEntryFromStoryItem.copy$1();
                if (anonymousClass8.this$0.isBotsPreview()) {
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                    storyEntryCopy$1.botId = anonymousClass1.dialogId;
                    storyEntryCopy$1.editingBotPreview = MessagesController.toInputMedia(anonymousClass1.currentStory.storyItem.media);
                    StoriesController.StoriesList storiesList = storyViewer.storiesList;
                    if (storiesList instanceof StoriesController.BotPreviewsList) {
                        storyEntryCopy$1.botLang = ((StoriesController.BotPreviewsList) storiesList).lang_code;
                    }
                }
                storyRecorder.openEdit(StoryRecorder.SourceView.fromStoryViewer(storyViewer), storyEntryCopy$1, j);
                storyRecorder.onFullyOpenListener = new PeerStoriesView$8$$ExternalSyntheticLambda28(anonymousClass8, 3);
                storyRecorder.onClosePrepareListener = new PeerStoriesView$$ExternalSyntheticLambda56(2, anonymousClass8, sharedResources);
                return;
            case 28:
                PeerStoriesView.AnonymousClass8 anonymousClass9 = (PeerStoriesView.AnonymousClass8) this.f$1;
                TLObject tLObject7 = (TLObject) this.f$0;
                boolean z9 = tLObject7 instanceof TL_stories.TL_stories_stories;
                Utilities.Callback callback2 = (Utilities.Callback) this.f$3;
                if (z9) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject7;
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass9.this$0;
                    MessagesController.getInstance(anonymousClass2.currentAccount).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(anonymousClass2.currentAccount).putChats(tL_stories_stories.chats, false);
                    for (int i15 = 0; i15 < tL_stories_stories.stories.size(); i15++) {
                        if (tL_stories_stories.stories.get(i15).id == ((TL_stories.StoryItem) this.f$2).id) {
                            callback2.run(tL_stories_stories.stories.get(i15).media.document);
                            return;
                        }
                    }
                }
                callback2.run(null);
                return;
            default:
                StoriesController.StoriesCollections storiesCollections = (StoriesController.StoriesCollections) this.f$1;
                storiesCollections.creating = false;
                TLObject tLObject8 = (TLObject) this.f$0;
                if (!(tLObject8 instanceof TL_stories.TL_storyAlbum)) {
                    TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.f$3;
                    if (tL_error5 != null && (safeLastFragment = LaunchActivity.getSafeLastFragment()) != null) {
                        BulletinFactory.of(safeLastFragment).showForError(tL_error5);
                    }
                    NotificationCenter.getInstance(storiesCollections.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(storiesCollections.dialogId), storiesCollections);
                    return;
                }
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) tLObject8;
                StoriesController.StoryAlbum storyAlbum = new StoriesController.StoryAlbum();
                storyAlbum.album_id = tL_storyAlbum.album_id;
                storyAlbum.title = tL_storyAlbum.title;
                storyAlbum.icon_photo = tL_storyAlbum.icon_photo;
                storyAlbum.icon_video = tL_storyAlbum.icon_video;
                storiesCollections.collections.add(storyAlbum);
                storiesCollections.updateAlbumsListCache(true);
                Utilities.Callback callback3 = (Utilities.Callback) this.f$2;
                if (callback3 != null) {
                    callback3.run(storyAlbum);
                    return;
                }
                return;
        }
    }

    public Theme$$ExternalSyntheticLambda17(Object obj, Object obj2, TLObject tLObject, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = tLObject;
        this.f$3 = obj3;
    }

    public Theme$$ExternalSyntheticLambda17(Object obj, TLObject tLObject, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = tLObject;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    public Theme$$ExternalSyntheticLambda17(BaseLocationAdapter baseLocationAdapter, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.$r8$classId = 9;
        this.f$1 = baseLocationAdapter;
        this.f$2 = tL_error;
        this.f$3 = str;
        this.f$0 = tLObject;
    }
}
