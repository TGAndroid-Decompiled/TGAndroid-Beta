package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import com.google.android.gms.vision.Frame$Metadata;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.zxing.Result;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.commonmark.internal.BlockStartImpl;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.bots.SetupEmojiStatusSheet;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda12;

public final class OAuthSheet$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;

    public OAuthSheet$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$3 = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() {
        JSONObject jSONObject;
        TLRPC.Document documentFindDocument;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        int i;
        ?? r5 = 0;
        ArrayList arrayList3 = null;
        boolean z = true;
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.showing = null;
                boolean[] zArr = (boolean[]) this.f$0;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$1;
                if (botWebViewContainer != null) {
                    int i2 = BotWebViewContainer.tags;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    botWebViewContainer.notifyEvent("oauth_result_failed", jSONObject);
                    break;
                }
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f$2;
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(this.f$3).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 1:
                ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.f$0;
                themeSmallPreviewView.getClass();
                Drawable drawable = ((ChatThemeBottomSheet.ChatThemeItem) this.f$1).previewDrawable;
                if (drawable instanceof MotionBackgroundDrawable) {
                    MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
                    motionBackgroundDrawable.setPatternBitmap(ThemeSmallPreviewView.prescaleBitmap((Bitmap) this.f$2), this.f$3);
                    motionBackgroundDrawable.setPatternColorFilter(themeSmallPreviewView.patternColor);
                    themeSmallPreviewView.invalidate();
                    return;
                }
                return;
            case 2:
                ?? r0 = (ContentPreviewViewer) this.f$0;
                if (r0.openPreviewRunnable == null) {
                    return;
                }
                RecyclerListView recyclerListView = (RecyclerListView) this.f$1;
                recyclerListView.setOnItemClickListener((RecyclerListView.OnItemClickListener) null);
                recyclerListView.requestDisallowInterceptTouchEvent(true);
                r0.openPreviewRunnable = null;
                r0.setParentActivity(AndroidUtilities.findActivity(recyclerListView.getContext()));
                r0.clearsInputField = false;
                View view = r0.currentPreviewCell;
                boolean z2 = view instanceof StickerEmojiCell;
                int i3 = this.f$3;
                if (z2) {
                    StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
                    TLRPC.Document sticker = stickerEmojiCell.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = stickerEmojiCell.getStickerPath();
                    String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(stickerEmojiCell.getSticker(), null, Integer.valueOf(r0.currentAccount));
                    ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate = r0.delegate;
                    r0.open(sticker, stickerPath, strFindAnimatedEmojiEmoticon, contentPreviewViewerDelegate != null ? contentPreviewViewerDelegate.getQuery(false) : null, null, i3, stickerEmojiCell.recent, stickerEmojiCell.getParentObject(), r0.resourcesProvider, 0);
                    stickerEmojiCell.setScaled(true);
                } else {
                    boolean z3 = view instanceof StickerCell;
                    Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$2;
                    if (z3) {
                        StickerCell stickerCell = (StickerCell) view;
                        TLRPC.Document sticker2 = stickerCell.getSticker();
                        ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate2 = r0.delegate;
                        r0.open(sticker2, null, null, contentPreviewViewerDelegate2 != null ? contentPreviewViewerDelegate2.getQuery(false) : null, null, i3, false, stickerCell.getParentObject(), resourcesProvider, 0);
                        stickerCell.setScaled(true);
                        r0.clearsInputField = stickerCell.clearsInputField;
                    } else if (view instanceof ContextLinkCell) {
                        ContextLinkCell contextLinkCell = (ContextLinkCell) view;
                        TLRPC.Document document = contextLinkCell.getDocument();
                        ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate3 = r0.delegate;
                        r0.open(document, null, null, contentPreviewViewerDelegate3 != null ? contentPreviewViewerDelegate3.getQuery(true) : 0, contextLinkCell.getBotInlineResult(), i3, false, contextLinkCell.getBotInlineResult() != null ? contextLinkCell.getInlineBot() : contextLinkCell.getParentObject(), resourcesProvider, 0);
                        if (i3 != 1 || r0.isPhotoEditor) {
                            contextLinkCell.setScaled(true);
                        }
                    } else if (view instanceof EmojiPacksAlert.EmojiImageView) {
                        TLRPC.Document document2 = ((EmojiPacksAlert.EmojiImageView) view).getDocument();
                        if (document2 == null) {
                            return;
                        } else {
                            r0.open(document2, null, MessageObject.findAnimatedEmojiEmoticon(document2, null, Integer.valueOf(r0.currentAccount)), null, null, i3, false, null, resourcesProvider, 0);
                        }
                    } else if (view instanceof EmojiView.ImageViewEmoji) {
                        AnimatedEmojiSpan span = ((EmojiView.ImageViewEmoji) view).getSpan();
                        if (span != null) {
                            documentFindDocument = span.document;
                            if (documentFindDocument == null) {
                                documentFindDocument = AnimatedEmojiDrawable.findDocument(r0.currentAccount, span.getDocumentId());
                            }
                        } else {
                            documentFindDocument = null;
                        }
                        if (documentFindDocument == null) {
                            return;
                        } else {
                            r0.open(documentFindDocument, null, MessageObject.findAnimatedEmojiEmoticon(documentFindDocument, null, Integer.valueOf(r0.currentAccount)), null, null, i3, false, null, resourcesProvider, 0);
                        }
                    } else {
                        if (!(view instanceof SuggestEmojiView.EmojiImageView)) {
                            return;
                        }
                        Drawable drawable2 = ((SuggestEmojiView.EmojiImageView) view).drawable;
                        TLRPC.Document document3 = drawable2 instanceof AnimatedEmojiDrawable ? ((AnimatedEmojiDrawable) drawable2).document : null;
                        if (document3 == null) {
                            return;
                        } else {
                            r0.open(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r0.currentAccount)), null, null, i3, false, null, resourcesProvider, 0);
                        }
                    }
                }
                try {
                    r0.currentPreviewCell.performHapticFeedback(0, 2);
                    break;
                } catch (Exception unused2) {
                }
                ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate4 = r0.delegate;
                if (contentPreviewViewerDelegate4 != null) {
                    contentPreviewViewerDelegate4.resetTouch();
                    return;
                }
                return;
            case 3:
                AndroidUtilities.addToClipboard((String) this.f$0);
                BottomSheet bottomSheet = (BottomSheet) this.f$1;
                int i4 = this.f$3;
                Theme.ResourcesProvider resourcesProvider2 = (Theme.ResourcesProvider) this.f$2;
                if (i4 == 1) {
                    zzkn.m(R.string.PhoneCopied, new BulletinFactory(bottomSheet.getContainer(), resourcesProvider2));
                    return;
                } else {
                    new BulletinFactory(bottomSheet.getContainer(), resourcesProvider2).createCopyLinkBulletin(false).show();
                    return;
                }
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                NotificationCenter.getInstance(this.f$3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", ((TLRPC.Chat) this.f$1).id);
                if (MessagesController.getInstance(launchActivity.currentAccount).checkCanOpenChat(bundle, (DialogsActivity) this.f$2)) {
                    ((ActionBarLayout) launchActivity.getActionBarLayout()).presentFragment$1(new ChatActivity(bundle), true, false);
                    return;
                }
                return;
            case 5:
                LinkManager linkManager = (LinkManager) this.f$0;
                linkManager.done();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f$1;
                int i5 = this.f$3;
                if (i5 == 1) {
                    arrayList = notificationsSettingsActivity.exceptionUsers;
                } else {
                    if (i5 != 0) {
                        if (i5 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i5 == 3) {
                            arrayList3 = notificationsSettingsActivity.exceptionStories;
                            arrayList2 = notificationsSettingsActivity.exceptionAutoStories;
                        } else {
                            arrayList = notificationsSettingsActivity.exceptionChannels;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i5, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.expanded = true;
                        notificationsCustomSettingsActivity.updateRows(false);
                        linkManager.presentFragment(notificationsCustomSettingsActivity, false);
                        str = (String) this.f$2;
                        if ("show".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("showRow");
                        }
                        if ("new".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("newRow");
                        }
                        if ("important".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str)) {
                            linkManager.scrollTo("priorityRow");
                            return;
                        }
                        return;
                    }
                    arrayList = notificationsSettingsActivity.exceptionChats;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i5, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.expanded = true;
                notificationsCustomSettingsActivity2.updateRows(false);
                linkManager.presentFragment(notificationsCustomSettingsActivity2, false);
                str = (String) this.f$2;
                if ("show".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("showRow");
                }
                if ("new".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("newRow");
                }
                if ("important".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("importantRow");
                }
                if ("messages".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("messagesRow");
                }
                if ("stories".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("storiesRow");
                }
                if ("preview".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("previewRow");
                }
                if ("show-sender".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("showSenderRow");
                }
                if ("sound".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("soundRow");
                }
                if ("add-exception".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("addExceptionRow");
                }
                if ("delete-exceptions".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("deleteExceptionsRow");
                }
                if ("light-color".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("lightColorRow");
                }
                if ("vibrate".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("vibrateRow");
                }
                if ("popup".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("popupRow");
                }
                if ("priority".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("priorityRow");
                    return;
                }
                return;
            case 6:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.f$0;
                notificationsCustomSettingsActivity3.getClass();
                View view2 = (View) this.f$1;
                if (!(view2 instanceof TextSettingsCell)) {
                    notificationsCustomSettingsActivity3.updateRows(true);
                    return;
                }
                int i6 = notificationsCustomSettingsActivity3.getNotificationsSettings().getInt((String) this.f$2, 0);
                int[] iArr = notificationsCustomSettingsActivity3.vibrateLabels;
                String string = LocaleController.getString(iArr[Utilities.clamp(i6, iArr.length - 1, 0)]);
                int i7 = this.f$3;
                if (i7 >= 0) {
                    ArrayList arrayList4 = notificationsCustomSettingsActivity3.items;
                    if (i7 < arrayList4.size()) {
                        ((NotificationsCustomSettingsActivity.ItemInner) arrayList4.get(i7)).text2 = string;
                    }
                }
                ((TextSettingsCell) view2).setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 7:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.f$0;
                AlertDialog.Builder builder = new AlertDialog.Builder(passkeysActivity.getParentActivity(), 0, null);
                String string2 = LocaleController.getString(R.string.PasskeyDeleteTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string2;
                alertDialog.message = LocaleController.getString(R.string.PasskeyDeleteText);
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new VoIPFragment$$ExternalSyntheticLambda37(passkeysActivity, (TL_account.Passkey) this.f$1, (String) this.f$2, this.f$3, 9));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.makeRed(-1);
                builder.show();
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.f$1;
                int i8 = this.f$3;
                String str2 = (String) this.f$2;
                photoViewer.getClass();
                try {
                    try {
                        BlockStartImpl blockStartImpl = new BlockStartImpl(ApplicationLoader.applicationContext);
                        blockStartImpl.setMode(0);
                        blockStartImpl.setLandmarkType(0);
                        blockStartImpl.replaceActiveBlockParser = false;
                        FaceDetector faceDetectorBuild = blockStartImpl.build();
                        if (faceDetectorBuild.zzb.zzb()) {
                            Result result = new Result();
                            Bitmap bitmap = bitmapHolder.bitmap;
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            result.resultMetadata = bitmap;
                            Frame$Metadata frame$Metadata = (Frame$Metadata) result.text;
                            frame$Metadata.zza = width;
                            frame$Metadata.zzb = height;
                            frame$Metadata.zze = i8;
                            if (faceDetectorBuild.detect(result).size() == 0) {
                                z = false;
                            }
                            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda89(photoViewer, str2, z, 29));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(photoViewer, bitmapHolder, str2, 6));
                        }
                        faceDetectorBuild.release();
                        return;
                    } catch (Throwable th) {
                        if (0 != 0) {
                            r5.release();
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    if (0 != 0) {
                        r5.release();
                        return;
                    }
                    return;
                }
            case 9:
                Activity activity = PhotoViewer.this.parentActivity;
                LongSparseArray longSparseArray = (LongSparseArray) this.f$2;
                BulletinFactory.createForwardedBulletin(activity, null, (FrameLayout) this.f$1, longSparseArray.size(), longSparseArray.size() == 1 ? ((TLRPC.Dialog) longSparseArray.valueAt(0)).id : 0L, this.f$3, -115203550, -1, 1500, false, null).show();
                return;
            case 10:
                AlertsCreator.processError(this.f$3, (TLRPC.TL_error) this.f$0, (BaseFragment) this.f$1, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f$2, new Object[0]);
                return;
            case 11:
                int i9 = this.f$3;
                StarGiftSheet starGiftSheet = new StarGiftSheet(i9, (Context) this.f$0, (Theme.ResourcesProvider) this.f$1, UserConfig.getInstance(i9).getClientUserId(), null);
                starGiftSheet.set((TL_stars.SavedStarGift) this.f$2, (StarsController.IGiftsList) null);
                starGiftSheet.show();
                return;
            case 12:
                StoriesController.StoriesList storiesList = (StoriesController.StoriesList) this.f$0;
                storiesList.reqId = -1;
                StringBuilder sb = new StringBuilder("StoriesList ");
                int i10 = storiesList.type;
                sb.append(i10);
                sb.append("{");
                long j = storiesList.dialogId;
                sb.append(j);
                sb.append("} loaded {");
                ArrayList arrayList5 = (ArrayList) this.f$1;
                sb.append(StoriesController.access$900(arrayList5));
                sb.append("}");
                FileLog.d(sb.toString());
                ArrayList arrayList6 = storiesList.pinnedIds;
                arrayList6.clear();
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) this.f$2;
                arrayList6.addAll(tL_stories_stories.pinned_to_top);
                int i11 = storiesList.currentAccount;
                MessagesController.getInstance(i11).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i11).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i11).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                storiesList.loading = false;
                storiesList.totalCount = tL_stories_stories.count;
                for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                    storiesList.pushObject((MessageObject) arrayList5.get(i12), false);
                }
                AbstractSet abstractSet = storiesList.loadedObjects;
                boolean z4 = abstractSet.size() >= storiesList.totalCount;
                storiesList.done = z4;
                AbstractSet abstractSet2 = storiesList.cachedObjects;
                int i13 = storiesList.albumId;
                if (z4) {
                    Iterator it = abstractSet2.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int iIntValue = num.intValue();
                        if (!abstractSet.contains(num)) {
                            it.remove();
                            storiesList.removeObject(iIntValue, false);
                        }
                    }
                } else if (i13 <= 0) {
                    int i14 = this.f$3;
                    if (i14 != -1) {
                        i = i14;
                    } else if (abstractSet.isEmpty()) {
                        i = -1;
                    } else {
                        ArrayList arrayList7 = new ArrayList(abstractSet);
                        int i15 = 0;
                        while (true) {
                            if (i15 < arrayList7.size()) {
                                Integer num2 = (Integer) arrayList7.get(i15);
                                int iIntValue2 = num2.intValue();
                                if (arrayList6.contains(num2)) {
                                    i15++;
                                } else {
                                    i = iIntValue2;
                                }
                            } else {
                                i = -1;
                            }
                        }
                    }
                    int iLastLoadedId = storiesList.lastLoadedId();
                    Iterator it2 = abstractSet2.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int iIntValue3 = num3.intValue();
                        if (!abstractSet.contains(num3) && iIntValue3 >= i && iIntValue3 <= iLastLoadedId) {
                            it2.remove();
                            storiesList.removeObject(iIntValue3, false);
                        }
                    }
                }
                storiesList.fill(true);
                if (storiesList.done) {
                    if (StoriesController.StoriesList.lastLoadTime == null) {
                        StoriesController.StoriesList.lastLoadTime = new HashMap();
                    }
                    StoriesController.StoriesList.lastLoadTime.put(Integer.valueOf(Objects.hash(Integer.valueOf(i11), Integer.valueOf(i10), Long.valueOf(j), Integer.valueOf(i13))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    HashMap map = StoriesController.StoriesList.lastLoadTime;
                    if (map != null) {
                        map.remove(Integer.valueOf(Objects.hash(Integer.valueOf(i11), Integer.valueOf(i10), Long.valueOf(j), Integer.valueOf(i13))));
                    }
                }
                storiesList.saveCache();
                return;
            case 13:
                TodoItemMenu todoItemMenu = (TodoItemMenu) this.f$0;
                todoItemMenu.getClass();
                int i16 = 0;
                while (true) {
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.f$1;
                    int size = tL_messageMediaToDo.todo.list.size();
                    int i17 = this.f$3;
                    if (i16 >= size) {
                        int i18 = 0;
                        while (i18 < tL_messageMediaToDo.completions.size()) {
                            if (tL_messageMediaToDo.completions.get(i18).id == i17) {
                                tL_messageMediaToDo.completions.remove(i18);
                                if (tL_messageMediaToDo.completions.isEmpty()) {
                                    tL_messageMediaToDo.flags &= -2;
                                }
                                i18--;
                            }
                            i18++;
                        }
                        todoItemMenu.messageObject.messageOwner.media = tL_messageMediaToDo;
                        ChatActivity chatActivity = (ChatActivity) this.f$2;
                        chatActivity.getSendMessagesHelper().editMessage(todoItemMenu.messageObject, null, null, null, null, null, null, false, false, null);
                        chatActivity.updateVisibleRows$1(false);
                        todoItemMenu.dismiss(false);
                        return;
                    }
                    if (tL_messageMediaToDo.todo.list.get(i16).id == i17) {
                        tL_messageMediaToDo.todo.list.remove(i16);
                        i16--;
                    }
                    i16++;
                }
                break;
            case 14:
                TooManyCommunitiesActivity.SearchAdapter searchAdapter = (TooManyCommunitiesActivity.SearchAdapter) this.f$0;
                if (this.f$3 != searchAdapter.lastSearchId) {
                    return;
                }
                ArrayList arrayList8 = searchAdapter.searchResults;
                arrayList8.clear();
                ArrayList arrayList9 = searchAdapter.searchResultsSignatures;
                arrayList9.clear();
                ArrayList arrayList10 = (ArrayList) this.f$1;
                if (arrayList10 != null) {
                    arrayList8.addAll(arrayList10);
                    arrayList9.addAll((ArrayList) this.f$2);
                }
                searchAdapter.notifyDataSetChanged();
                boolean zIsEmpty = arrayList8.isEmpty();
                TooManyCommunitiesActivity tooManyCommunitiesActivity = TooManyCommunitiesActivity.this;
                if (zIsEmpty) {
                    tooManyCommunitiesActivity.emptyView.setVisibility(0);
                    return;
                } else {
                    tooManyCommunitiesActivity.emptyView.setVisibility(8);
                    return;
                }
            case 15:
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(MessagesStorage.getInstance(this.f$3).getUsers((ArrayList) this.f$0), (HashMap) this.f$1, (Utilities.Callback) this.f$2, 24));
                return;
            default:
                BotWebViewContainer$$ExternalSyntheticLambda12 botWebViewContainer$$ExternalSyntheticLambda12 = (BotWebViewContainer$$ExternalSyntheticLambda12) this.f$1;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f$0;
                if (userFull == null) {
                    botWebViewContainer$$ExternalSyntheticLambda12.run(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    SetupEmojiStatusSheet.askPermission(botWebViewContainer$$ExternalSyntheticLambda12, this.f$3, (TLRPC.User) this.f$2, userFull);
                    return;
                }
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda2(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = i;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public OAuthSheet$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = i;
        this.f$2 = obj3;
    }

    public OAuthSheet$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
    }
}
