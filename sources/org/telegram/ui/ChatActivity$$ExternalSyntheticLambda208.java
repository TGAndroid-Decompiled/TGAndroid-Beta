package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.util.Pair;
import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheetTabs$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Business.TimezonesController;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.EmojiView$2$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.FilterGLThread$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.FolderBottomSheet;

public final class ChatActivity$$ExternalSyntheticLambda208 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatActivity$$ExternalSyntheticLambda208(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Vector vector;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    boolean zIsEmpty = messages_messages.messages.isEmpty();
                    TLObject tLObject2 = (TLObject) this.f$1;
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda26(chatActivity, !zIsEmpty ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 7));
                }
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
                            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda89(patternsLoader, arrayList, z, 5));
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
                BaseLocationAdapter baseLocationAdapter = (BaseLocationAdapter) this.f$0;
                baseLocationAdapter.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(baseLocationAdapter, tL_error, (String) this.f$1, tLObject, 10));
                break;
            case 8:
                MentionsAdapter mentionsAdapter = (MentionsAdapter) this.f$0;
                mentionsAdapter.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2((Object) mentionsAdapter, (String) this.f$1, (Object) tLObject, 15));
                break;
            case 9:
                StickersSearchAdapter.AnonymousClass1 anonymousClass1 = (StickersSearchAdapter.AnonymousClass1) this.f$0;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(anonymousClass1, (TLRPC.TL_messages_searchStickerSets) this.f$1, (TLRPC.TL_messages_foundStickerSets) tLObject, 18));
                }
                break;
            case 10:
                BusinessLinksController businessLinksController = (BusinessLinksController) this.f$0;
                businessLinksController.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(businessLinksController, tLObject, (TL_account.TL_businessChatLink) this.f$1, 23));
                break;
            case 11:
                ChatbotSheet chatbotSheet = (ChatbotSheet) this.f$0;
                chatbotSheet.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(12, chatbotSheet, (OAuthSheet$$ExternalSyntheticLambda17) this.f$1));
                break;
            case 12:
                TimezonesController timezonesController = (TimezonesController) this.f$0;
                timezonesController.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(timezonesController, tLObject, (SharedPreferences) this.f$1, 28));
                break;
            case 13:
                CalendarActivity calendarActivity = (CalendarActivity) this.f$0;
                calendarActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(calendarActivity, tL_error, tLObject, (Calendar) this.f$1, 20));
                break;
            case 14:
                ChannelColorActivity.ThemeChooser themeChooser = (ChannelColorActivity.ThemeChooser) this.f$0;
                themeChooser.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(themeChooser, tLObject, (Theme.ThemeInfo) this.f$1, 9));
                break;
            case 15:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) this.f$0;
                channelMonetizationLayout.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(channelMonetizationLayout, tLObject, (Activity) this.f$1, 12));
                break;
            case 16:
                ChatActivity chatActivity2 = (ChatActivity) this.f$0;
                chatActivity2.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(chatActivity2, tLObject, (TLRPC.User) this.f$1, 19));
                break;
            case 17:
                ChatActivity chatActivity3 = (ChatActivity) this.f$0;
                chatActivity3.getClass();
                if (tL_error == null) {
                    chatActivity3.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(24, chatActivity3, (TLRPC.TL_messages_sendScheduledMessages) this.f$1));
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(25, chatActivity3, tL_error));
                }
                break;
            case 18:
                ChatActivity chatActivity4 = (ChatActivity) this.f$0;
                chatActivity4.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(chatActivity4, tLObject, tL_error, (MessagesStorage) this.f$1, 27));
                break;
            case 19:
                ChatActivity.ChatActivityAdapter.AnonymousClass2.C00072 c00072 = (ChatActivity.ChatActivityAdapter.AnonymousClass2.C00072) this.f$0;
                c00072.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(c00072, tLObject, (MessageObject) this.f$1, 21));
                break;
            case 20:
                ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                TLRPC.UserFull userFull = chatEditActivity.userInfo;
                if (userFull != null) {
                    userFull.about = ((TL_bots.setBotInfo) this.f$1).about;
                    chatEditActivity.getMessagesStorage().updateUserInfo(chatEditActivity.userInfo, false);
                }
                AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda49(chatEditActivity, 2));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(7, (ChatLinkActivity) this.f$0, (AlertDialog[]) this.f$1));
                break;
            case 22:
                ChatRightsEditActivity chatRightsEditActivity = (ChatRightsEditActivity) this.f$0;
                chatRightsEditActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13((Object) chatRightsEditActivity, (Object) tL_error, tLObject, this.f$1, 1));
                break;
            case 23:
                AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher = (AnimatedEmojiDrawable.EmojiDocumentFetcher) this.f$0;
                NotificationCenter.getInstance(emojiDocumentFetcher.currentAccount).doOnIdle(new AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda5(emojiDocumentFetcher, (ArrayList) this.f$1, tLObject, 0));
                break;
            case 24:
                AudioPlayerAlert audioPlayerAlert = (AudioPlayerAlert) this.f$0;
                audioPlayerAlert.getClass();
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(audioPlayerAlert, (AlertDialog) this.f$1, tLObject, 1));
                break;
            case 25:
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.f$0;
                chatAttachAlert.getClass();
                AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(27, chatAttachAlert, (ChatAttachAlert.AttachBotButton) this.f$1));
                break;
            case 26:
                ChatAttachAlert chatAttachAlert2 = (ChatAttachAlert) this.f$0;
                chatAttachAlert2.getClass();
                AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(28, chatAttachAlert2, (TLRPC.TL_attachMenuBot) this.f$1));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1((ChatThemeBottomSheet.Adapter) this.f$0, tLObject, (Theme.ThemeInfo) this.f$1, 7));
                break;
            case 28:
                FolderBottomSheet folderBottomSheet = (FolderBottomSheet) this.f$0;
                folderBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda1(28, folderBottomSheet, (Pair) this.f$1));
                break;
            default:
                FolderBottomSheet folderBottomSheet2 = (FolderBottomSheet) this.f$0;
                folderBottomSheet2.getClass();
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13((Object) folderBottomSheet2, (Object) tL_error, tLObject, this.f$1, 10));
                break;
        }
    }
}
