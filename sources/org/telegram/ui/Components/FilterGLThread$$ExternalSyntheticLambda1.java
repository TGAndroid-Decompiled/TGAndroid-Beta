package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.ViewPropertyAnimator;
import android.webkit.WebResourceRequest;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.ChannelAdminLogActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda208;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda177;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda14;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WebviewActivity;

public final class FilterGLThread$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public FilterGLThread$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() {
        Bitmap bitmapCreateBitmap;
        int i;
        SQLiteCursor sQLiteCursor;
        String strStringValue;
        SQLiteCursor sQLiteCursorQueryFinalized;
        ArrayList<Long> arrayList;
        TLRPC.User user;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        TLRPC.User user2;
        SharedMediaLayout.AnonymousClass19 anonymousClass19;
        int i2 = 4;
        int i3 = 6;
        int i4 = 0;
        int i5 = 1;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                FilterGLThread filterGLThread = (FilterGLThread) obj3;
                FilterShaders filterShaders = filterGLThread.filterShaders;
                int[] iArr = filterShaders.renderFrameBuffer;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!filterShaders.isVideo ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, filterShaders.getRenderTexture(!filterGLThread.blurred ? 1 : 0), 0);
                GLES20.glClear(0);
                int i6 = filterGLThread.renderBufferWidth;
                if (i6 == 0 || (i = filterGLThread.renderBufferHeight) == 0) {
                    bitmapCreateBitmap = null;
                } else {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i6 * i * 4);
                    GLES20.glReadPixels(0, 0, filterGLThread.renderBufferWidth, filterGLThread.renderBufferHeight, 6408, 5121, byteBufferAllocateDirect);
                    bitmapCreateBitmap = Bitmap.createBitmap(filterGLThread.renderBufferWidth, filterGLThread.renderBufferHeight, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                }
                ((Bitmap[]) obj2)[0] = bitmapCreateBitmap;
                ((CountDownLatch) obj).countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 1:
                ((AudioPlayerAlert) obj3).lambda$onSubItemClick$16((TLObject) obj, (AlertDialog) obj2);
                return;
            case 2:
                ChatActivityEnterView.AnonymousClass38 anonymousClass38 = (ChatActivityEnterView.AnonymousClass38) obj3;
                anonymousClass38.getClass();
                ((SimpleAvatarView) obj2).getViewTreeObserver().removeOnDrawListener(anonymousClass38);
                ((SenderSelectPopup.SenderView) obj).avatar.setHideAvatar(true);
                return;
            case 3:
                Uri uri = (Uri) obj2;
                File file = (File) obj;
                ChatActivityEnterView.ChatActivityEditTextCaption chatActivityEditTextCaption = (ChatActivityEnterView.ChatActivityEditTextCaption) obj3;
                chatActivityEditTextCaption.getClass();
                try {
                    InputStream inputStreamOpenInputStream = chatActivityEditTextCaption.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i7 = inputStreamOpenInputStream.read(bArr);
                        if (i7 <= 0) {
                            inputStreamOpenInputStream.close();
                            fileOutputStream.close();
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, -1, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(photoEntry);
                            AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(chatActivityEditTextCaption, arrayList2, file, i2));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i7);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
                break;
            case 4:
                ((ChatActivityEnterView.ChatActivityEditTextCaption) obj3).openPhotoViewerForEdit((File) obj, (ArrayList) obj2);
                return;
            case 5:
                final ChatAttachAlert chatAttachAlert = (ChatAttachAlert) obj3;
                final boolean z = chatAttachAlert.nextAttachLayout.getCurrentItemTop() <= ((ChatAttachAlert.AttachAlertLayout) obj2).getButtonsHideOffset();
                float alpha = chatAttachAlert.actionBar.getAlpha();
                float f = z ? 1.0f : 0.0f;
                SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(0.0f));
                springAnimation.addUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda50(chatAttachAlert, alpha, f, z));
                final ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7 = (ChatAttachAlert$$ExternalSyntheticLambda7) obj;
                springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                    @Override
                    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f2, float f3) {
                        chatAttachAlert.lambda$showLayout$52(z, chatAttachAlert$$ExternalSyntheticLambda7);
                    }
                });
                SpringForce springForce = new SpringForce(500.0f);
                springAnimation.mSpring = springForce;
                springForce.setDampingRatio(1.0f);
                springAnimation.mSpring.setStiffness(1000.0f);
                springAnimation.start();
                chatAttachAlert.viewChangeAnimator = springAnimation;
                return;
            case 6:
                ((ChatAttachAlert) obj3).lambda$onCustomOpenAnimation$58((AnimationNotificationsLocker) obj2, (BottomSheet.BottomSheetDelegateInterface) obj);
                return;
            case 7:
                ChatThemeBottomSheet.Adapter adapter = (ChatThemeBottomSheet.Adapter) obj3;
                adapter.getClass();
                TLObject tLObject = (TLObject) obj2;
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) obj;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    themeInfo.badWallpaper = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                HashMap map = adapter.loadingThemes;
                if (map.containsKey(attachFileName)) {
                    return;
                }
                map.put(attachFileName, themeInfo);
                FileLoader.getInstance(themeInfo.account).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 8:
                DialogsBotsAdapter.PopularBots popularBots = (DialogsBotsAdapter.PopularBots) obj3;
                popularBots.getClass();
                ArrayList arrayList3 = new ArrayList();
                ArrayList<Long> arrayList4 = new ArrayList<>();
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                long jMax = 0;
                try {
                    sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    strStringValue = null;
                    while (sQLiteCursorQueryFinalized.next()) {
                        try {
                            arrayList4.add(Long.valueOf(sQLiteCursorQueryFinalized.longValue(0)));
                            jMax = Math.max(jMax, sQLiteCursorQueryFinalized.longValue(1));
                            strStringValue = sQLiteCursorQueryFinalized.stringValue(2);
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursorQueryFinalized = sQLiteCursor;
                                }
                                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda177(popularBots, arrayList3, jMax, strStringValue, (DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda0) obj, 5));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    ArrayList<TLRPC.User> users = messagesStorage.getUsers(arrayList4);
                    if (users != null) {
                        int size = arrayList4.size();
                        int i8 = 0;
                        while (i8 < size) {
                            Long l = arrayList4.get(i8);
                            i8 += i5;
                            long jLongValue = l.longValue();
                            int size2 = users.size();
                            while (true) {
                                if (i4 < size2) {
                                    TLRPC.User user3 = users.get(i4);
                                    i4 += i5;
                                    user = user3;
                                    if (user != null) {
                                        arrayList = arrayList4;
                                        if (user.id == jLongValue) {
                                        }
                                    } else {
                                        arrayList = arrayList4;
                                    }
                                    arrayList4 = arrayList;
                                    i5 = 1;
                                } else {
                                    arrayList = arrayList4;
                                    user = null;
                                }
                            }
                            if (user != null) {
                                arrayList3.add(user);
                            }
                            arrayList4 = arrayList;
                            i4 = 0;
                            i5 = 1;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    strStringValue = null;
                    sQLiteCursor = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                sQLiteCursorQueryFinalized.dispose();
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda177(popularBots, arrayList3, jMax, strStringValue, (DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda0) obj, 5));
                return;
            case 9:
                FolderBottomSheet folderBottomSheet = (FolderBottomSheet) obj3;
                folderBottomSheet.reqId = -1;
                Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of((BaseFragment) obj2).createSimpleBulletin(LocaleController.formatString(R.string.FolderLinkDeletedTitle, folderBottomSheet.title), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj).size(), new Object[0]), R.raw.ic_delete);
                bulletinCreateSimpleBulletin.duration = 5000;
                bulletinCreateSimpleBulletin.show();
                folderBottomSheet.success = true;
                folderBottomSheet.lambda$showGiftOfferSheet$15();
                folderBottomSheet.baseFragment.getMessagesController().invalidateChatlistFolderUpdate(folderBottomSheet.filterId);
                return;
            case 10:
                FolderBottomSheet folderBottomSheet2 = (FolderBottomSheet) obj3;
                folderBottomSheet2.reqId = folderBottomSheet2.baseFragment.getConnectionsManager().sendRequest((TLObject) obj2, new ChatActivity$$ExternalSyntheticLambda208(28, folderBottomSheet2, (Pair) obj));
                return;
            case 11:
                InviteLinkBottomSheet inviteLinkBottomSheet = (InviteLinkBottomSheet) obj3;
                inviteLinkBottomSheet.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj2).id);
                ((BaseFragment) obj).presentFragment(new ProfileActivity(bundle, null));
                inviteLinkBottomSheet.isNeedReopen = true;
                return;
            case 12:
                InviteLinkBottomSheet.Adapter.AnonymousClass2 anonymousClass2 = (InviteLinkBottomSheet.Adapter.AnonymousClass2) obj3;
                anonymousClass2.getClass();
                if (((TLRPC.TL_error) obj2) == null) {
                    TLObject tLObject2 = (TLObject) obj;
                    boolean z2 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                    InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                    if (z2) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                        TLRPC.ChatFull chatFull = inviteLinkBottomSheet2.info;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (inviteLinkBottomSheet2.inviteDelegate != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = inviteLinkBottomSheet2.info;
                    if (chatFull2 != null) {
                        int i9 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i9;
                        if (i9 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        MessagesStorage.getInstance(((BottomSheet) inviteLinkBottomSheet2).currentAccount).saveChatLinksCount(inviteLinkBottomSheet2.chatId, inviteLinkBottomSheet2.info.invitesCount);
                    }
                    ChannelAdminLogActivity.AnonymousClass20 anonymousClass20 = inviteLinkBottomSheet2.inviteDelegate;
                    if (anonymousClass20 != null) {
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                        ArrayList arrayList5 = channelAdminLogActivity.filteredMessages;
                        int size3 = arrayList5.size();
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = inviteLinkBottomSheet2.invite;
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = channelAdminLogActivity.getAccountInstance().getUserConfig().clientUserId;
                        if (new MessageObject(((BaseFragment) channelAdminLogActivity).currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) channelAdminLogActivity.messages, (HashMap<String, ArrayList<MessageObject>>) channelAdminLogActivity.messagesByDays, channelAdminLogActivity.currentChat, channelAdminLogActivity.mid, true).contentType < 0) {
                            return;
                        }
                        channelAdminLogActivity.filterDeletedMessages();
                        int size4 = arrayList5.size() - size3;
                        if (size4 > 0) {
                            channelAdminLogActivity.chatListItemAnimator.shouldAnimateEnterFromBottom = true;
                            ChannelAdminLogActivity.ChatActivityAdapter chatActivityAdapter = channelAdminLogActivity.chatAdapter;
                            chatActivityAdapter.notifyItemRangeInserted(chatActivityAdapter.messagesEndRow, size4);
                            ChannelAdminLogActivity.access$8500(channelAdminLogActivity);
                        }
                        channelAdminLogActivity.invitesCache.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((InviteMembersBottomSheet) obj3).lambda$generateLink$7((TLObject) obj, (TLRPC.TL_error) obj2);
                return;
            case 14:
                InviteMembersBottomSheet.SearchAdapter searchAdapter = (InviteMembersBottomSheet.SearchAdapter) obj3;
                searchAdapter.searchRunnable = null;
                ArrayList arrayList6 = (ArrayList) obj2;
                searchAdapter.searchResult = arrayList6;
                searchAdapter.searchResultNames = (ArrayList) obj;
                SearchAdapterHelper searchAdapterHelper = searchAdapter.searchAdapterHelper;
                searchAdapterHelper.mergeResults(arrayList6, null);
                int i10 = searchAdapter.currentItemsCount - 1;
                InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
                inviteMembersBottomSheet.showItemsAnimated$2(i10);
                searchAdapter.mObservable.notifyChanged();
                if (searchAdapterHelper.isSearchInProgress() || searchAdapter.getItemCount() > 2) {
                    return;
                }
                inviteMembersBottomSheet.emptyView.showProgress(false, true);
                return;
            case 15:
                LinkSpanDrawable.LinksTextView linksTextView = (LinkSpanDrawable.LinksTextView) obj3;
                LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress = linksTextView.onLongPressListener;
                if (onLinkPress == null || linksTextView.pressedLink != ((LinkSpanDrawable) obj2)) {
                    return;
                }
                onLinkPress.run((ClickableSpan) obj);
                linksTextView.pressedLink = null;
                linksTextView.links.clear(true);
                return;
            case 16:
                MessagePrivateSeenView messagePrivateSeenView = (MessagePrivateSeenView) obj3;
                Theme.ResourcesProvider resourcesProvider = messagePrivateSeenView.resourcesProvider;
                TextView textView = messagePrivateSeenView.premiumTextView;
                TextView textView2 = messagePrivateSeenView.valueTextView;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    TLObject tLObject3 = (TLObject) obj;
                    if (tLObject3 instanceof TLRPC.TL_outboxReadDate) {
                        textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject3).date));
                        textView.setVisibility(8);
                    }
                } else if ("USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                    textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                    textView.setVisibility(8);
                } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                    messagePrivateSeenView.isPremiumLocked = true;
                    textView2.setText(LocaleController.getString(R.string.PmRead));
                    textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                } else {
                    textView2.setText(LocaleController.getString("UnknownError"));
                    textView.setVisibility(8);
                    new BulletinFactory(new Bulletin.BulletinWindow(messagePrivateSeenView.getContext(), null).container, resourcesProvider).showForError(false, tL_error);
                }
                ViewPropertyAnimator viewPropertyAnimatorAlpha = messagePrivateSeenView.valueLayout.animate().alpha(1.0f);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                OKLCH.m(viewPropertyAnimatorAlpha, cubicBezierInterpolator, 320L);
                messagePrivateSeenView.loadingView.animate().alpha(0.0f).setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
                if (messagePrivateSeenView.isPremiumLocked) {
                    messagePrivateSeenView.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 6, 0));
                    messagePrivateSeenView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(messagePrivateSeenView, i3));
                    return;
                } else {
                    messagePrivateSeenView.setBackground(null);
                    messagePrivateSeenView.setOnClickListener(null);
                    return;
                }
            case 17:
                ((PermanentLinkBottomSheet) obj3).lambda$generateLink$3((TLObject) obj, (TLRPC.TL_error) obj2);
                return;
            case 18:
                String str = (String) obj2;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                PhotoViewer.AnonymousClass79 anonymousClass79 = (PhotoViewer.AnonymousClass79) ((WebviewActivity.AnonymousClass3) obj3).this$0;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + anonymousClass79.currentYoutubeId).put("platform", "DESKTOP"))).put("videoId", anonymousClass79.currentYoutubeId).toString().getBytes("UTF-8"));
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    byte[] bArr2 = new byte[10240];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i11 = inputStream.read(bArr2);
                        if (i11 == -1) {
                            byteArrayOutputStream.close();
                            inputStream.close();
                            JSONObject jSONObjectOptJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
                            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) == null || (strOptString = jSONObjectOptJSONObject.optString("spec")) == null) {
                                return;
                            }
                            if (anonymousClass79.videoDuration == 0) {
                                anonymousClass79.youtubeStoryboardsSpecUrl = strOptString;
                                return;
                            } else {
                                PhotoViewerWebView.access$500(anonymousClass79, strOptString);
                                return;
                            }
                        }
                        byteArrayOutputStream.write(bArr2, 0, i11);
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                    return;
                }
                break;
            case 19:
                ((PollVotesAlert) obj3).lambda$new$2((PollVotesAlert.VotesList) obj2, (TLObject) obj);
                return;
            case 20:
                ((SelectorBottomSheet$$ExternalSyntheticLambda7) obj3).run(new Pair((HashMap) obj2, (ArrayList) obj));
                return;
            case 21:
                TLObject tLObject4 = (TLObject) obj3;
                if (tLObject4 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                    MessagesController messagesController = (MessagesController) obj2;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList7 = new ArrayList();
                    while (i4 < tL_channels_channelParticipants.participants.size()) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i4).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user2 = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user2) && !user2.bot) {
                            arrayList7.add(messagesController.getInputPeer(peer));
                        }
                        i4++;
                    }
                    ((SelectorBottomSheet$$ExternalSyntheticLambda7) obj).run(arrayList7);
                    return;
                }
                return;
            case 22:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                if (tL_error2 != null) {
                    ((Utilities.Callback) obj2).run(tL_error2);
                    return;
                } else {
                    ((Utilities.Callback) obj).run(null);
                    return;
                }
            case 23:
                ((PollItemMenu$$ExternalSyntheticLambda14) obj3).run(new Pair((HashMap) obj2, (ArrayList) obj));
                return;
            case 24:
                SearchDownloadsContainer searchDownloadsContainer = (SearchDownloadsContainer) obj3;
                searchDownloadsContainer.getClass();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList8 = (ArrayList) obj2;
                    int size5 = arrayList8.size();
                    int i13 = searchDownloadsContainer.currentAccount;
                    if (i12 >= size5) {
                        ArrayList<MessageObject> arrayList9 = (ArrayList) obj;
                        if (!arrayList9.isEmpty()) {
                            DownloadController.getInstance(i13).deleteRecentFiles(arrayList9);
                        }
                        searchDownloadsContainer.checkingFilesExist = false;
                        searchDownloadsContainer.update(true);
                        return;
                    }
                    DownloadController.getInstance(i13).onDownloadComplete((MessageObject) arrayList8.get(i12));
                    i12++;
                }
                break;
            case 25:
                SearchViewPager.AnonymousClass1 anonymousClass1 = (SearchViewPager.AnonymousClass1) obj3;
                DialogsActivity dialogsActivity = (DialogsActivity) obj2;
                if (UserConfig.getInstance(anonymousClass1.this$0.currentAccount).isPremium()) {
                    dialogsActivity.getMessagesController().disableAds(true);
                    anonymousClass1.removeAllAds();
                    BulletinFactory.of(dialogsActivity).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                } else {
                    new PremiumFeatureBottomSheet((BaseFragment) dialogsActivity, 3, true).show();
                }
                ((ItemOptions) obj).dismiss();
                return;
            case 26:
                SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) obj3;
                AlertsCreator.createStoriesAlbumEnterNameForCreate(sharedMediaLayout.getContext(), null, sharedMediaLayout.resourcesProvider, new SharedMediaLayout$$ExternalSyntheticLambda47(sharedMediaLayout, (TL_stories.StoryItem) obj2));
                ((ItemOptions) obj).dismiss();
                return;
            case 27:
                SharedMediaLayout sharedMediaLayout2 = (SharedMediaLayout) obj3;
                sharedMediaLayout2.getClass();
                final Context context = sharedMediaLayout2.getContext();
                final BaseFragment baseFragment = (BaseFragment) obj;
                final String str2 = (String) obj2;
                final Theme.ResourcesProvider resourcesProvider2 = sharedMediaLayout2.resourcesProvider;
                ShareAlert shareAlert = new ShareAlert(context, str2, str2, resourcesProvider2) {
                    @Override
                    public final void onSend(LongSparseArray longSparseArray, int i14, TLRPC.TL_forumTopic tL_forumTopic, boolean z3) {
                        AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda17(baseFragment, longSparseArray, i14, 5), 100L);
                    }
                };
                if (baseFragment != null) {
                    baseFragment.showDialog(shareAlert);
                    return;
                } else {
                    shareAlert.show();
                    return;
                }
            case 28:
                SharedMediaLayout.AnonymousClass5 anonymousClass5 = (SharedMediaLayout.AnonymousClass5) obj3;
                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                AlertsCreator.createStoriesAlbumEnterNameForCreate(sharedMediaLayout3.getContext(), sharedMediaLayout3.profileActivity, (Theme.ResourcesProvider) obj2, new ProfileGooeyView$$ExternalSyntheticLambda0(anonymousClass5, 25));
                ((ItemOptions) obj).dismiss();
                return;
            default:
                SharedMediaLayout.CommonGroupsAdapter commonGroupsAdapter = (SharedMediaLayout.CommonGroupsAdapter) obj3;
                int itemCount = commonGroupsAdapter.getItemCount();
                SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                if (((TLRPC.TL_error) obj2) == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) ((TLObject) obj);
                    sharedMediaLayout4.profileActivity.getMessagesController().putChats(messages_chats.chats, false);
                    commonGroupsAdapter.endReached = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    commonGroupsAdapter.chats.addAll(messages_chats.chats);
                } else {
                    commonGroupsAdapter.endReached = true;
                }
                int i14 = 0;
                while (true) {
                    SharedMediaLayout.MediaPage[] mediaPageArr = sharedMediaLayout4.mediaPages;
                    if (i14 >= mediaPageArr.length) {
                        commonGroupsAdapter.loading = false;
                        commonGroupsAdapter.firstLoaded = true;
                        commonGroupsAdapter.mObservable.notifyChanged();
                        return;
                    } else {
                        SharedMediaLayout.MediaPage mediaPage = mediaPageArr[i14];
                        if (mediaPage.selectedType == 6 && (anonymousClass19 = mediaPage.listView) != null && (commonGroupsAdapter.firstLoaded || itemCount == 0)) {
                            sharedMediaLayout4.animateItemsEnter(anonymousClass19, 0, null);
                        }
                        i14++;
                    }
                }
                break;
        }
    }

    public FilterGLThread$$ExternalSyntheticLambda1(PermanentLinkBottomSheet permanentLinkBottomSheet, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        this.$r8$classId = 17;
        this.f$0 = permanentLinkBottomSheet;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
    }
}
