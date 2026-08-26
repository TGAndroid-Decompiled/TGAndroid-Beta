package org.telegram.ui;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.profileinstaller.DeviceProfileWriter;
import androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.ListenerSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.GroupVoipInviteAlert;
import org.telegram.ui.Components.HashtagsSearchAdapter;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.InstantCameraView$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.InstantCameraView$VideoRecorder$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.Shape;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.PaintToolsView;
import org.telegram.ui.Components.ReactedHeaderView;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stories.StoriesController;

public final class ChatActivity$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public ChatActivity$$ExternalSyntheticLambda17(int i, Object obj, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$2 = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        int i;
        UndoView undoView;
        UndoView undoView2;
        LongSparseArray longSparseArray;
        int size;
        int i2;
        ?? r8;
        int i3;
        long j;
        String pluralString;
        int iDp;
        float fDp;
        int i4;
        int i5;
        int i6;
        int i7 = 4;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).replaceMessageObjects((ArrayList) this.f$1, this.f$2, false, false);
                break;
            case 1:
                ((ProfileInstaller$DiagnosticsCallback) ((DeviceProfileWriter) this.f$0).mDiagnostics).onResultReceived(this.f$2, (Serializable) this.f$1);
                break;
            case 2:
                for (ListenerSet.ListenerHolder listenerHolder : (CopyOnWriteArraySet) this.f$0) {
                    if (!listenerHolder.released) {
                        int i8 = this.f$2;
                        if (i8 != -1) {
                            listenerHolder.flagsBuilder.add(i8);
                        }
                        listenerHolder.needsIterationFinishedEvent = true;
                        ((ListenerSet.Event) this.f$1).invoke(listenerHolder.listener);
                    }
                }
                break;
            case 3:
                ((CameraView) this.f$0).lambda$createCamera$13(this.f$2, (SurfaceTexture) this.f$1);
                break;
            case 4:
                ((NativeInstance) this.f$0).lambda$onEmitJoinPayload$3(this.f$2, (String) this.f$1);
                break;
            case 5:
                ((VoIPService) this.f$0).lambda$createGroupInstance$74((String) this.f$1, this.f$2);
                break;
            case 6:
                String strConcat = MessagesController.getInstance(this.f$2).freezeAppealUrl;
                if (!strConcat.startsWith("http://") && !strConcat.startsWith("https://")) {
                    strConcat = "https://".concat(strConcat);
                }
                Browser.openUrl((Context) this.f$0, strConcat);
                ((BottomSheet[]) this.f$1)[0].lambda$showGiftOfferSheet$15();
                break;
            case 7:
                SearchViewPager.AnonymousClass1 anonymousClass1 = (SearchViewPager.AnonymousClass1) this.f$0;
                anonymousClass1.searchHashtagRunnable = null;
                int i9 = anonymousClass1.lastSearchId;
                int i10 = this.f$2;
                if (i10 == i9) {
                    int i11 = anonymousClass1.searchHashtagRequest;
                    int i12 = anonymousClass1.currentAccount;
                    if (i11 >= 0) {
                        i = 1;
                        ConnectionsManager.getInstance(i12).cancelRequest(anonymousClass1.searchHashtagRequest, true);
                    } else {
                        i = 1;
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= i;
                    String str = (String) this.f$1;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    anonymousClass1.searchHashtagRequest = ConnectionsManager.getInstance(i12).sendRequest(tL_channels_searchPosts, new ProfileActivity$$ExternalSyntheticLambda75(anonymousClass1, i10, str, 3));
                    break;
                }
                break;
            case 8:
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                String str2 = (String) this.f$1;
                int i13 = this.f$2;
                articleViewer.getClass();
                HashMap map = new HashMap(articleViewer.pages[0].adapter.textToBlocks);
                ArrayList arrayList = new ArrayList(articleViewer.pages[0].adapter.textBlocks);
                articleViewer.searchRunnable = null;
                Utilities.searchQueue.postRunnable(new WearAuthSheet$$ExternalSyntheticLambda3(articleViewer, arrayList, map, str2, i13, 10));
                break;
            case 9:
                ArticleViewer articleViewer2 = (ArticleViewer) this.f$0;
                if (articleViewer2.lastReqId == this.f$2 && articleViewer2.openUrlReqId != 0) {
                    ConnectionsManager.getInstance(articleViewer2.currentAccount).cancelRequest(articleViewer2.openUrlReqId, false);
                    articleViewer2.openUrlReqId = 0;
                }
                if (articleViewer2.loadingProgress == ((ArticleViewer.AnonymousClass13) this.f$1)) {
                    articleViewer2.loadingProgress = null;
                }
                break;
            case 10:
                int i14 = this.f$2;
                MessagesController messagesController = MessagesController.getInstance(i14);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f$0;
                messagesController.putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i14).openGuardBotWebApp(-((TLRPC.Chat) this.f$1).id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 11:
                ArticleViewer.WebpageAdapter webpageAdapter = (ArticleViewer.WebpageAdapter) this.f$0;
                webpageAdapter.fullHeight = this.f$2;
                webpageAdapter.sumItemHeights = (int[]) this.f$1;
                ArticleViewer.this.updatePages();
                break;
            case 12:
                BusinessLinksController businessLinksController = (BusinessLinksController) this.f$0;
                businessLinksController.links.add(this.f$2, (TL_account.TL_businessChatLink) this.f$1);
                NotificationCenter.getInstance(businessLinksController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                break;
            case 13:
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri uri = Uri.parse((String) this.f$0);
                tL_inputGroupCallSlug.slug = uri.getPathSegments().get(uri.getPathSegments().size() - 1);
                VoIPHelper.joinConference(LaunchActivity.instance, this.f$2, tL_inputGroupCallSlug, false, null, null);
                ((BottomSheet[]) this.f$1)[0].lambda$showGiftOfferSheet$15();
                break;
            case 14:
                int i15 = 0;
                ((ChatActivity) this.f$0).chatListView.smoothScrollBy(0, this.f$2, null);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f$1;
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda422(i15, editTextBoldCursor), 100L);
                break;
            case 15:
                ChatActivity.ChatActivityAdapter.AnonymousClass2 anonymousClass2 = (ChatActivity.ChatActivityAdapter.AnonymousClass2) this.f$0;
                anonymousClass2.getClass();
                MessageObject messageObject = ((ChatActionCell) this.f$1).getMessageObject();
                ChatActivity.ChatActivityAdapter chatActivityAdapter = ChatActivity.ChatActivityAdapter.this;
                ChatActivity.this.scrollToMessageId(this.f$2, messageObject.getId(), true, messageObject.getDialogId() == ChatActivity.this.mergeDialogId ? 1 : 0, true, 0);
                break;
            case 16:
                ((int[]) this.f$0)[0] = this.f$2;
                ((ChatUsersActivity$$ExternalSyntheticLambda13) this.f$1).run();
                break;
            case 17:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) this.f$0;
                chatAttachAlertPollLayout.pollLimitDeadline = 0;
                chatAttachAlertPollLayout.pollLimitDuration = this.f$2;
                View view = (View) this.f$1;
                if (view instanceof TextCell) {
                    chatAttachAlertPollLayout.checkDurationInfoRow((TextCell) view, true);
                } else {
                    chatAttachAlertPollLayout.listAdapter.notifyItemChanged(chatAttachAlertPollLayout.poll2vLimitDurationTimeRow);
                }
                break;
            case 18:
                BaseFragment baseFragment = EmojiPacksAlert.this.fragment;
                if (!(baseFragment instanceof ChatActivity)) {
                    if (baseFragment instanceof ProfileActivity) {
                        undoView2 = ((ProfileActivity) baseFragment).undoView;
                    } else {
                        undoView = null;
                    }
                    if (undoView != null) {
                        longSparseArray = (LongSparseArray) this.f$1;
                        size = longSparseArray.size();
                        i2 = this.f$2;
                        if (size == 1) {
                            undoView.showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 53, Integer.valueOf(i2), (Object) null, (Runnable) null, (Runnable) null);
                        } else {
                            undoView.showWithAction(0L, 53, Integer.valueOf(i2), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                        }
                    }
                } else {
                    ChatActivity chatActivity = (ChatActivity) baseFragment;
                    chatActivity.createUndoView();
                    undoView2 = chatActivity.undoView;
                }
                undoView = undoView2;
                if (undoView != null) {
                    longSparseArray = (LongSparseArray) this.f$1;
                    size = longSparseArray.size();
                    i2 = this.f$2;
                    if (size == 1) {
                        undoView.showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 53, Integer.valueOf(i2), (Object) null, (Runnable) null, (Runnable) null);
                    } else {
                        undoView.showWithAction(0L, 53, Integer.valueOf(i2), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                    }
                }
                break;
            case 19:
                EmojiView.EmojiSearchAdapter.AnonymousClass4.AnonymousClass1 anonymousClass3 = (EmojiView.EmojiSearchAdapter.AnonymousClass4.AnonymousClass1) this.f$0;
                AlertDialog[] alertDialogArr = (AlertDialog[]) this.f$1;
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    alertDialog.setOnCancelListener(new ChatEditActivity$$ExternalSyntheticLambda52(anonymousClass3, this.f$2, i7));
                    alertDialogArr[0].show();
                    break;
                }
                break;
            case 20:
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                int i16 = this.f$2;
                tL_inputChatlistDialogFilter.filter_id = i16;
                BaseFragment baseFragment2 = (BaseFragment) this.f$0;
                baseFragment2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new ProfileActivity$$ExternalSyntheticLambda75(baseFragment2, i16, (Utilities.Callback) this.f$1, 6));
                break;
            case 21:
                GroupVoipInviteAlert.SearchAdapter searchAdapter = (GroupVoipInviteAlert.SearchAdapter) this.f$0;
                if (this.f$2 == searchAdapter.lastSearchId) {
                    searchAdapter.searchInProgress = false;
                    GroupVoipInviteAlert groupVoipInviteAlert = GroupVoipInviteAlert.this;
                    boolean zIsChannel = ChatObject.isChannel(groupVoipInviteAlert.currentChat);
                    SearchAdapterHelper searchAdapterHelper = searchAdapter.searchAdapterHelper;
                    if (!zIsChannel) {
                        searchAdapterHelper.groupSearch.clear();
                        ArrayList arrayList2 = searchAdapterHelper.groupSearch;
                        ArrayList arrayList3 = (ArrayList) this.f$1;
                        arrayList2.addAll(arrayList3);
                        int size2 = arrayList3.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            TLObject tLObject = (TLObject) arrayList3.get(i17);
                            boolean z = tLObject instanceof TLRPC.ChatParticipant;
                            LongSparseArray longSparseArray2 = searchAdapterHelper.groupSearchMap;
                            if (z) {
                                longSparseArray2.put(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                            } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                                longSparseArray2.put(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                            }
                        }
                        searchAdapterHelper.removeGroupSearchFromGlobal();
                    }
                    int i18 = searchAdapter.totalCount - 1;
                    StickerEmptyView stickerEmptyView = groupVoipInviteAlert.emptyView;
                    boolean z2 = stickerEmptyView.getVisibility() == 0;
                    searchAdapter.notifyDataSetChanged();
                    if (searchAdapter.totalCount > i18) {
                        groupVoipInviteAlert.showItemsAnimated$2(i18);
                    }
                    if (!searchAdapter.searchInProgress && !searchAdapterHelper.isSearchInProgress() && groupVoipInviteAlert.listView.emptyViewIsVisible()) {
                        stickerEmptyView.showProgress(false, z2);
                        break;
                    }
                }
                break;
            case 22:
                HashtagsSearchAdapter hashtagsSearchAdapter = (HashtagsSearchAdapter) this.f$0;
                int i19 = hashtagsSearchAdapter.searchId;
                int i20 = this.f$2;
                if (i20 == i19) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(hashtagsSearchAdapter.cashtag[0] ? "$" : "#");
                    sb.append(hashtagsSearchAdapter.hashtagQuery);
                    String string = sb.toString();
                    StoriesController.SearchStoriesList searchStoriesList = hashtagsSearchAdapter.list;
                    int i21 = hashtagsSearchAdapter.currentAccount;
                    if (searchStoriesList == null || !TextUtils.equals(searchStoriesList.query, string)) {
                        hashtagsSearchAdapter.list = new StoriesController.SearchStoriesList(i21, null, string);
                    }
                    if (hashtagsSearchAdapter.list.messageObjects.size() <= 0) {
                        StoriesController.SearchStoriesList searchStoriesList2 = hashtagsSearchAdapter.list;
                        searchStoriesList2.getClass();
                        r8 = 1;
                        searchStoriesList2.load(4, Collections.EMPTY_LIST, true);
                    } else {
                        r8 = 1;
                    }
                    hashtagsSearchAdapter.hasList = r8;
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts2 = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts2.flags = tL_channels_searchPosts2.flags | r8 ? 1 : 0;
                    String str3 = (String) this.f$1;
                    hashtagsSearchAdapter.hashtagQuery = str3;
                    tL_channels_searchPosts2.hashtag = str3;
                    tL_channels_searchPosts2.limit = 10;
                    ArrayList arrayList4 = hashtagsSearchAdapter.messages;
                    if (arrayList4.isEmpty()) {
                        tL_channels_searchPosts2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        MessageObject messageObject2 = (MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m((int) r8, arrayList4);
                        tL_channels_searchPosts2.offset_rate = hashtagsSearchAdapter.lastRate;
                        tL_channels_searchPosts2.offset_peer = MessagesController.getInstance(i21).getInputPeer(messageObject2.messageOwner.peer_id);
                    }
                    hashtagsSearchAdapter.reqId = ConnectionsManager.getInstance(i21).sendRequest(tL_channels_searchPosts2, new ProfileActivity$$ExternalSyntheticLambda75(hashtagsSearchAdapter, i20, string, 7));
                    break;
                }
                break;
            case 23:
                InstantCameraView instantCameraView = (InstantCameraView) this.f$0;
                if (instantCameraView.cameraThread != null) {
                    boolean z3 = BuildVars.LOGS_ENABLED;
                    int i22 = this.f$2;
                    if (z3) {
                        FileLog.d("InstantCamera create camera session " + i22);
                    }
                    SurfaceTexture surfaceTexture = (SurfaceTexture) this.f$1;
                    if (instantCameraView.useCamera2) {
                        if (instantCameraView.bothCameras) {
                            Camera2Session camera2Session = instantCameraView.camera2Sessions[i22];
                            if (camera2Session != null) {
                                camera2Session.open(surfaceTexture);
                            }
                            break;
                        } else if (i22 != 1) {
                            InstantCameraView.CameraGLThread cameraGLThread = instantCameraView.cameraThread;
                            Camera2Session camera2Session2 = instantCameraView.camera2SessionCurrent;
                            Handler handler = cameraGLThread.getHandler();
                            if (handler != null) {
                                cameraGLThread.sendMessage(handler.obtainMessage(3, camera2Session2), 0);
                            }
                            instantCameraView.camera2SessionCurrent.open(surfaceTexture);
                            break;
                        }
                    } else if (i22 != 1) {
                        Size[] sizeArr = instantCameraView.previewSize;
                        surfaceTexture.setDefaultBufferSize(sizeArr[0].getWidth(), sizeArr[0].getHeight());
                        instantCameraView.cameraSession = new CameraSession(instantCameraView.selectedCamera, sizeArr[0], instantCameraView.pictureSize, 256, true);
                        instantCameraView.updateFlash();
                        InstantCameraView.CameraGLThread cameraGLThread2 = instantCameraView.cameraThread;
                        CameraSession cameraSession = instantCameraView.cameraSession;
                        Handler handler2 = cameraGLThread2.getHandler();
                        if (handler2 != null) {
                            cameraGLThread2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        }
                        CameraController.getInstance().openRound(instantCameraView.cameraSession, surfaceTexture, new InstantCameraView$$ExternalSyntheticLambda5(instantCameraView, 1), new InstantCameraView$$ExternalSyntheticLambda5(instantCameraView, 2));
                        break;
                    }
                }
                break;
            case 24:
                InstantCameraView.VideoRecorder videoRecorder = (InstantCameraView.VideoRecorder) this.f$0;
                InstantCameraView instantCameraView2 = InstantCameraView.this;
                if (instantCameraView2.videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                    instantCameraView2.videoEditedInfo = videoEditedInfo;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                }
                boolean zNeedConvert = instantCameraView2.videoEditedInfo.needConvert();
                int i23 = instantCameraView2.currentAccount;
                if (zNeedConvert) {
                    instantCameraView2.file = null;
                    instantCameraView2.encryptedFile = null;
                    instantCameraView2.key = null;
                    instantCameraView2.iv = null;
                    VideoEditedInfo videoEditedInfo2 = instantCameraView2.videoEditedInfo;
                    long j2 = videoEditedInfo2.estimatedDuration;
                    double d = j2;
                    i3 = i23;
                    long j3 = videoEditedInfo2.startTime;
                    if (j3 >= 0) {
                        j = 0;
                    } else {
                        j3 = 0;
                        j = 0;
                    }
                    long j4 = videoEditedInfo2.endTime;
                    if (j4 >= j) {
                        j2 = j4;
                    }
                    long j5 = j2 - j3;
                    videoEditedInfo2.estimatedDuration = j5;
                    videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j5 / d) * instantCameraView2.size));
                    VideoEditedInfo videoEditedInfo3 = instantCameraView2.videoEditedInfo;
                    videoEditedInfo3.bitrate = 1000000;
                    long j6 = videoEditedInfo3.startTime;
                    if (j6 > j) {
                        videoEditedInfo3.startTime = j6 * 1000;
                    }
                    long j7 = videoEditedInfo3.endTime;
                    if (j7 > j) {
                        videoEditedInfo3.endTime = j7 * 1000;
                    }
                    FileLoader.getInstance(i3).cancelFileUpload(instantCameraView2.cameraFile.getAbsolutePath(), false);
                } else {
                    i3 = i23;
                    j = 0;
                    instantCameraView2.videoEditedInfo.estimatedSize = Math.max(1L, instantCameraView2.size);
                }
                VideoEditedInfo videoEditedInfo4 = instantCameraView2.videoEditedInfo;
                videoEditedInfo4.roundVideo = true;
                videoEditedInfo4.file = instantCameraView2.file;
                videoEditedInfo4.encryptedFile = instantCameraView2.encryptedFile;
                videoEditedInfo4.key = instantCameraView2.key;
                videoEditedInfo4.iv = instantCameraView2.iv;
                videoEditedInfo4.framerate = 25;
                videoEditedInfo4.originalWidth = 360;
                videoEditedInfo4.resultWidth = 360;
                videoEditedInfo4.originalHeight = 360;
                videoEditedInfo4.resultHeight = 360;
                videoEditedInfo4.originalPath = videoRecorder.videoFile.getAbsolutePath();
                VideoEditedInfo videoEditedInfo5 = instantCameraView2.videoEditedInfo;
                int i24 = 1;
                if (this.f$2 == 1) {
                    InstantCameraView.Delegate delegate = instantCameraView2.delegate;
                    boolean zIsInScheduleMode = delegate.isInScheduleMode();
                    InstantCameraView.SendOptions sendOptions = (InstantCameraView.SendOptions) this.f$1;
                    if (zIsInScheduleMode) {
                        AlertsCreator.createScheduleDatePickerDialog(delegate.getParentActivity(), delegate.getDialogId(), -1L, 0, new VoIPFragment$$ExternalSyntheticLambda42(videoRecorder, sendOptions, videoEditedInfo5, 3), new InstantCameraView$VideoRecorder$$ExternalSyntheticLambda1(videoRecorder, i24), instantCameraView2.resourcesProvider);
                    } else {
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, videoRecorder.videoFile.getAbsolutePath(), 0, true, 0, 0, 0L);
                        if (sendOptions != null) {
                            photoEntry.ttl = sendOptions.ttl;
                            photoEntry.effectId = sendOptions.effectId;
                        }
                        instantCameraView2.delegate.sendMedia(photoEntry, videoEditedInfo5, sendOptions == null || sendOptions.notify, sendOptions != null ? sendOptions.scheduleDate : 0, 0, false, sendOptions != null ? sendOptions.stars : j);
                    }
                    instantCameraView2.videoEditedInfo = null;
                } else {
                    videoRecorder.setupVideoPlayer(videoRecorder.videoFile);
                    videoEditedInfo5.estimatedDuration = instantCameraView2.recordedTime;
                    NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(instantCameraView2.recordingGuid), videoEditedInfo5, videoRecorder.videoFile.getAbsolutePath(), videoRecorder.keyframeThumbs);
                }
                break;
            case 25:
                Painting painting = (Painting) this.f$0;
                painting.commitShapeInternal((Shape) this.f$1, this.f$2, painting.activeStrokeBounds);
                painting.activeStrokeBounds = null;
                break;
            case 26:
                LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.f$0;
                if (lPhotoPaintView.renderView.getCurrentBrush() instanceof Brush.Shape) {
                    lPhotoPaintView.ignoreToolChangeAnimationOnce = true;
                }
                lPhotoPaintView.onBrushSelected((Brush.Shape) this.f$1);
                PaintToolsView paintToolsView = lPhotoPaintView.paintToolsView;
                paintToolsView.animateNextIndex(paintToolsView.brushesCount + 1);
                AndroidUtilities.updateImageViewImageAnimated(paintToolsView.buttons[paintToolsView.brushesCount + 1], this.f$2);
                paintToolsView.isShapeSelected = true;
                break;
            case 27:
                ReactedHeaderView reactedHeaderView = (ReactedHeaderView) this.f$0;
                ArrayList arrayList5 = reactedHeaderView.seenUsers;
                boolean zIsEmpty = arrayList5.isEmpty();
                int i25 = this.f$2;
                if (zIsEmpty || arrayList5.size() < i25) {
                    pluralString = LocaleController.formatPluralString("ReactionsCount", i25, new Object[0]);
                } else {
                    pluralString = String.format(LocaleController.getPluralString("Reacted", i25), i25 == arrayList5.size() ? String.valueOf(i25) : i25 + "/" + arrayList5.size());
                }
                if (reactedHeaderView.getMeasuredWidth() > 0) {
                    reactedHeaderView.fixedWidth = reactedHeaderView.getMeasuredWidth();
                }
                TextView textView = reactedHeaderView.titleView;
                textView.setText(pluralString);
                MessageObject messageObject3 = reactedHeaderView.message;
                TLRPC.TL_messageReactions tL_messageReactions = messageObject3.messageOwner.reactions;
                ImageView imageView = reactedHeaderView.iconView;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.f$1;
                int i26 = reactedHeaderView.currentAccount;
                if (tL_messageReactions == null || tL_messageReactions.results.size() != 1 || tL_messages_messageReactionsList.reactions.isEmpty()) {
                    imageView.setVisibility(0);
                    imageView.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).start();
                } else {
                    Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(i26).getReactionsList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TLRPC.TL_availableReaction next = it.next();
                            if (next.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                                BackupImageView backupImageView = reactedHeaderView.reactView;
                                backupImageView.setImage(ImageLocation.getForDocument(next.center_icon), "40_40_lastreactframe", null, null, null, "webp", 0, next);
                                backupImageView.setVisibility(0);
                                backupImageView.setAlpha(0.0f);
                                backupImageView.animate().alpha(1.0f).start();
                                imageView.setVisibility(8);
                            }
                        } else {
                            imageView.setVisibility(0);
                            imageView.setAlpha(0.0f);
                            imageView.animate().alpha(1.0f).start();
                        }
                    }
                }
                ArrayList<TLRPC.User> arrayList6 = tL_messages_messageReactionsList.users;
                int size3 = arrayList6.size();
                int i27 = 0;
                while (true) {
                    ArrayList arrayList7 = reactedHeaderView.users;
                    if (i27 < size3) {
                        TLRPC.User user = arrayList6.get(i27);
                        i27++;
                        TLRPC.User user2 = user;
                        TLRPC.Peer peer = messageObject3.messageOwner.from_id;
                        if (peer == null || user2.id == peer.user_id) {
                            i6 = size3;
                        } else {
                            int i28 = 0;
                            while (true) {
                                if (i28 >= arrayList7.size()) {
                                    i6 = size3;
                                    arrayList7.add(new ReactedHeaderView.UserSeen(0, user2));
                                } else {
                                    i6 = size3;
                                    if (((ReactedHeaderView.UserSeen) arrayList7.get(i28)).dialogId == user2.id) {
                                    }
                                    i28++;
                                    size3 = i6;
                                }
                            }
                        }
                        size3 = i6;
                        break;
                    } else {
                        ArrayList<TLRPC.Chat> arrayList8 = tL_messages_messageReactionsList.chats;
                        int size4 = arrayList8.size();
                        int i29 = 0;
                        while (i29 < size4) {
                            TLRPC.Chat chat = arrayList8.get(i29);
                            int i30 = i29 + 1;
                            TLRPC.Chat chat2 = chat;
                            TLRPC.Peer peer2 = messageObject3.messageOwner.from_id;
                            if (peer2 != null) {
                                i4 = i30;
                                if (chat2.id != peer2.user_id) {
                                    int i31 = 0;
                                    while (true) {
                                        if (i31 >= arrayList7.size()) {
                                            i5 = i26;
                                            arrayList7.add(new ReactedHeaderView.UserSeen(0, chat2));
                                        } else {
                                            i5 = i26;
                                            if (((ReactedHeaderView.UserSeen) arrayList7.get(i31)).dialogId == (-chat2.id)) {
                                            }
                                            i31++;
                                            i26 = i5;
                                        }
                                    }
                                }
                                i26 = i5;
                                i29 = i4;
                            } else {
                                i4 = i30;
                            }
                            i5 = i26;
                            i26 = i5;
                            i29 = i4;
                            break;
                        }
                        int i32 = i26;
                        reactedHeaderView.setEnabled(arrayList7.size() > 0);
                        int i33 = 0;
                        while (true) {
                            AvatarsImageView avatarsImageView = reactedHeaderView.avatarsImageView;
                            if (i33 >= 3) {
                                int size5 = arrayList7.size();
                                if (size5 != 1) {
                                    if (size5 != 2) {
                                        fDp = 0.0f;
                                    } else {
                                        iDp = AndroidUtilities.dp(12.0f);
                                    }
                                    if (LocaleController.isRTL) {
                                        fDp = AndroidUtilities.dp(12.0f);
                                    }
                                    avatarsImageView.setTranslationX(fDp);
                                    avatarsImageView.avatarsDrawable.commitTransition(false, true);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    avatarsImageView.animate().alpha(1.0f).setDuration(220L).start();
                                    FlickerLoadingView flickerLoadingView = reactedHeaderView.flickerLoadingView;
                                    flickerLoadingView.animate().alpha(0.0f).setDuration(220L).setListener(new ChatActivity.AnonymousClass77(flickerLoadingView)).start();
                                } else {
                                    iDp = AndroidUtilities.dp(24.0f);
                                }
                                fDp = iDp;
                                if (LocaleController.isRTL) {
                                    fDp = AndroidUtilities.dp(12.0f);
                                }
                                avatarsImageView.setTranslationX(fDp);
                                avatarsImageView.avatarsDrawable.commitTransition(false, true);
                                textView.animate().alpha(1.0f).setDuration(220L).start();
                                avatarsImageView.animate().alpha(1.0f).setDuration(220L).start();
                                FlickerLoadingView flickerLoadingView2 = reactedHeaderView.flickerLoadingView;
                                flickerLoadingView2.animate().alpha(0.0f).setDuration(220L).setListener(new ChatActivity.AnonymousClass77(flickerLoadingView2)).start();
                            } else {
                                if (i33 < arrayList7.size()) {
                                    avatarsImageView.avatarsDrawable.setObject(i33, ((ReactedHeaderView.UserSeen) arrayList7.get(i33)).user, i32);
                                } else {
                                    avatarsImageView.avatarsDrawable.setObject(i33, null, i32);
                                }
                                i33++;
                            }
                        }
                    }
                    break;
                }
                break;
            case 28:
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = (ChatCustomReactionsEditActivity) this.f$0;
                Editable text = chatCustomReactionsEditActivity.editText.getText();
                AnimatedEmojiSpan animatedEmojiSpan = (AnimatedEmojiSpan) this.f$1;
                int spanStart = text.getSpanStart(animatedEmojiSpan);
                int spanEnd = text.getSpanEnd(animatedEmojiSpan);
                int i34 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    chatCustomReactionsEditActivity.editText.getText().delete(spanStart, spanEnd);
                    ChatCustomReactionsEditActivity.AnonymousClass3 anonymousClass4 = chatCustomReactionsEditActivity.editText;
                    anonymousClass4.setSelection(Math.min(this.f$2 - i34, anonymousClass4.getText().length()));
                    break;
                }
                break;
            default:
                ShareAlert.ShareSearchAdapter shareSearchAdapter = (ShareAlert.ShareSearchAdapter) this.f$0;
                int i35 = shareSearchAdapter.lastSearchId;
                int i36 = this.f$2;
                if (i36 == i35) {
                    shareSearchAdapter.getItemCount();
                    shareSearchAdapter.internalDialogsIsSearching = false;
                    shareSearchAdapter.lastLocalSearchId = i36;
                    int i37 = shareSearchAdapter.lastGlobalSearchId;
                    ShareAlert.ShareSearchAdapter.AnonymousClass1 anonymousClass5 = shareSearchAdapter.searchAdapterHelper;
                    if (i37 != i36) {
                        anonymousClass5.clear();
                    }
                    ShareAlert shareAlert = ShareAlert.this;
                    RecyclerView.Adapter adapter = shareAlert.gridView.getAdapter();
                    ShareAlert.ShareSearchAdapter shareSearchAdapter2 = shareAlert.searchAdapter;
                    if (adapter != shareSearchAdapter2) {
                        ShareAlert.access$8200(shareAlert);
                        shareSearchAdapter2.mObservable.notifyChanged();
                    }
                    int i38 = 0;
                    while (true) {
                        ArrayList arrayList9 = (ArrayList) this.f$1;
                        if (i38 >= arrayList9.size()) {
                            boolean z4 = !shareSearchAdapter.searchResult.isEmpty() && arrayList9.isEmpty();
                            if (shareSearchAdapter.searchResult.isEmpty()) {
                                arrayList9.isEmpty();
                            }
                            if (z4) {
                                ShareAlert.access$8200(shareAlert);
                            }
                            shareSearchAdapter.searchResult = arrayList9;
                            anonymousClass5.mergeResults(arrayList9, null);
                            int i39 = shareSearchAdapter.lastItemCont;
                            if (shareSearchAdapter.getItemCount() != 0 || anonymousClass5.isSearchInProgress() || shareSearchAdapter.internalDialogsIsSearching) {
                                shareAlert.recyclerItemsEnterAnimator.showItemsAnimated(i39);
                            } else {
                                shareAlert.searchEmptyView.showProgress(false, true);
                            }
                            shareSearchAdapter.mObservable.notifyChanged();
                            shareAlert.checkCurrentList(true);
                        } else {
                            TLObject tLObject2 = ((ShareAlert.DialogSearchResult) arrayList9.get(i38)).object;
                            if (tLObject2 instanceof TLRPC.User) {
                                MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).putUser((TLRPC.User) tLObject2, true);
                            } else if (tLObject2 instanceof TLRPC.Chat) {
                                MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).putChat((TLRPC.Chat) tLObject2, true);
                            }
                            i38++;
                        }
                        break;
                    }
                }
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda17(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
    }

    public ChatActivity$$ExternalSyntheticLambda17(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }

    public ChatActivity$$ExternalSyntheticLambda17(ArticleViewer.WebpageAdapter webpageAdapter, int i, int[] iArr, int[] iArr2) {
        this.$r8$classId = 11;
        this.f$0 = webpageAdapter;
        this.f$2 = i;
        this.f$1 = iArr2;
    }
}
