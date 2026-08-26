package org.telegram.ui.Stars;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheetTabs$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda17;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Business.TimezonesController;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda26;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.ViewsForPeerStoriesRequester;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.HintView2$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class StarGiftSheet$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public StarGiftSheet$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Vector vector;
        switch (this.$r8$classId) {
            case 0:
                ((StarGiftSheet) this.f$0).lambda$show$111((AlertDialog) this.f$1, tLObject, tL_error);
                break;
            case 1:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f$0, (Runnable) this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) this.f$0).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((VoIPService) this.f$0).lambda$startOutgoingCall$10((byte[]) this.f$1, tLObject, tL_error);
                break;
            case 4:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$32((AccountInstance) this.f$1, tLObject, tL_error);
                break;
            case 5:
                Theme.PatternsLoader patternsLoader = (Theme.PatternsLoader) this.f$0;
                patternsLoader.getClass();
                if (tLObject instanceof Vector) {
                    Vector vector2 = (Vector) tLObject;
                    int size = vector2.objects.size();
                    int i = 0;
                    ArrayList arrayList = null;
                    while (true) {
                        boolean z = true;
                        if (i >= size) {
                            AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8(patternsLoader, arrayList, z, 5));
                        } else {
                            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector2.objects.get(i);
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (tL_wallPaper.pattern) {
                                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                                    ArrayList arrayList2 = (ArrayList) this.f$1;
                                    int size2 = arrayList2.size();
                                    int i2 = 0;
                                    Bitmap bitmapCreateWallpaperForAccent = null;
                                    Boolean boolValueOf = null;
                                    while (i2 < size2) {
                                        Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) arrayList2.get(i2);
                                        if (themeAccent.patternSlug.equals(tL_wallPaper.slug)) {
                                            if (boolValueOf == null) {
                                                boolValueOf = Boolean.valueOf(pathToAttach.exists());
                                            }
                                            if (bitmapCreateWallpaperForAccent != null || boolValueOf.booleanValue()) {
                                                vector2 = vector2;
                                                bitmapCreateWallpaperForAccent = Theme.PatternsLoader.createWallpaperForAccent(bitmapCreateWallpaperForAccent, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, themeAccent);
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(themeAccent);
                                            } else {
                                                String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                                if (patternsLoader.watingForLoad == null) {
                                                    patternsLoader.watingForLoad = new HashMap();
                                                }
                                                Theme.PatternsLoader.LoadingPattern loadingPattern = (Theme.PatternsLoader.LoadingPattern) patternsLoader.watingForLoad.get(attachFileName);
                                                if (loadingPattern == null) {
                                                    loadingPattern = new Theme.PatternsLoader.LoadingPattern();
                                                    loadingPattern.pattern = tL_wallPaper;
                                                    patternsLoader.watingForLoad.put(attachFileName, loadingPattern);
                                                }
                                                loadingPattern.accents.add(themeAccent);
                                            }
                                        } else {
                                            vector2 = vector2;
                                        }
                                        i2++;
                                        vector2 = vector2;
                                    }
                                    vector = vector2;
                                    if (bitmapCreateWallpaperForAccent != null) {
                                        bitmapCreateWallpaperForAccent.recycle();
                                    }
                                } else {
                                    vector = vector2;
                                }
                            } else {
                                vector = vector2;
                            }
                            i++;
                            vector2 = vector;
                        }
                    }
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new BottomSheetTabs$$ExternalSyntheticLambda1((Theme.ThemeInfo) this.f$0, tLObject, (Theme.ThemeInfo) this.f$1, 3));
                break;
            case 7:
                ((BaseLocationAdapter) this.f$0).lambda$searchPlacesWithQuery$7((String) this.f$1, tLObject, tL_error);
                break;
            case 8:
                MentionsAdapter mentionsAdapter = (MentionsAdapter) this.f$0;
                mentionsAdapter.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2((Object) mentionsAdapter, (String) this.f$1, (Object) tLObject, 19));
                break;
            case 9:
                StickersSearchAdapter.AnonymousClass1 anonymousClass1 = (StickersSearchAdapter.AnonymousClass1) this.f$0;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(anonymousClass1, (TLRPC.TL_messages_searchStickerSets) this.f$1, (TLRPC.TL_messages_foundStickerSets) tLObject, 22));
                }
                break;
            case 10:
                BusinessLinksController businessLinksController = (BusinessLinksController) this.f$0;
                businessLinksController.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(businessLinksController, tLObject, (TL_account.TL_businessChatLink) this.f$1, 25));
                break;
            case 11:
                ChatbotSheet chatbotSheet = (ChatbotSheet) this.f$0;
                chatbotSheet.getClass();
                AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(7, chatbotSheet, (OAuthSheet$$ExternalSyntheticLambda6) this.f$1));
                break;
            case 12:
                TimezonesController timezonesController = (TimezonesController) this.f$0;
                timezonesController.getClass();
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda66(timezonesController, tLObject, (SharedPreferences) this.f$1, 1));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17((StickerMakerView) this.f$0, tLObject, (StickerMakerView.StickerUploader) this.f$1, tL_error, 15));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda66(tLObject, (MessagesController) this.f$0, (SelectorBottomSheet$$ExternalSyntheticLambda7) this.f$1, 5));
                break;
            case 15:
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    ((MessagesController) this.f$0).putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i3 = 0; i3 < tL_contacts_found.users.size(); i3++) {
                        TLRPC.User user = tL_contacts_found.users.get(i3);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.id)) {
                            arrayList3.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda26(1, (OAuthSheet$$ExternalSyntheticLambda1) this.f$1, arrayList3));
                }
                break;
            case 16:
                ((ProfileGiftsContainer) this.f$0).lambda$new$9((BaseFragment) this.f$1, tLObject, tL_error);
                break;
            case 17:
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = (ResaleGiftsFragment.ResaleGiftsList) this.f$0;
                resaleGiftsList.getClass();
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda66(resaleGiftsList, tLObject, (TL_stars.getResaleStarGifts) this.f$1, 13));
                break;
            case 18:
                BotStarsActivity botStarsActivity = (BotStarsActivity) this.f$0;
                botStarsActivity.getClass();
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda66(botStarsActivity, tLObject, (Context) this.f$1, 14));
                break;
            case 19:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.getClass();
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17(starGiftSheet, tLObject, (StarGiftSheet$$ExternalSyntheticLambda66) this.f$1, tL_error, 20));
                break;
            case 20:
                ((StarGiftSheet) this.f$0).lambda$doUpgrade$126((TL_stars.InputSavedStarGift) this.f$1, tLObject, tL_error);
                break;
            case 21:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda66(starsController, tLObject, (Runnable) this.f$1, 22));
                break;
            case 22:
                StarsController starsController2 = (StarsController) this.f$0;
                starsController2.getClass();
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17((Object) starsController2, tLObject, (Object) tL_error, this.f$1, 26));
                break;
            case 23:
                LivePlayer livePlayer = (LivePlayer) this.f$0;
                livePlayer.getClass();
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(livePlayer.currentAccount).processUpdates((TLRPC.Updates) this.f$1, false);
                }
                break;
            case 24:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(anonymousClass8.this$0.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new BalanceCloud$$ExternalSyntheticLambda1((StoryPrivacyBottomSheet) this.f$1, 27));
                break;
            case 25:
                StoriesController.BotPreviewsList botPreviewsList = (StoriesController.BotPreviewsList) this.f$0;
                botPreviewsList.getClass();
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda6(botPreviewsList, tLObject, (Runnable) this.f$1, 2));
                break;
            case 26:
                StoriesController.StoriesCollections storiesCollections = (StoriesController.StoriesCollections) this.f$0;
                storiesCollections.getClass();
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17(storiesCollections, tLObject, (Utilities.Callback) this.f$1, tL_error, 29));
                break;
            case 27:
                ((ViewsForPeerStoriesRequester) this.f$0).lambda$requestInternal$2((TL_stories.TL_stories_getStoriesViews) this.f$1, tLObject, tL_error);
                break;
            case 28:
                EmojiBottomSheet.Page.Adapter adapter = (EmojiBottomSheet.Page.Adapter) this.f$0;
                adapter.getClass();
                AndroidUtilities.runOnUIThread(new HintView2$$ExternalSyntheticLambda2(adapter, (String) this.f$1, tLObject, 1));
                break;
            default:
                GalleryListView.SearchAdapter searchAdapter = (GalleryListView.SearchAdapter) this.f$0;
                searchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new HintView2$$ExternalSyntheticLambda2(searchAdapter, tLObject, (MessagesController) this.f$1, 4));
                break;
        }
    }
}
