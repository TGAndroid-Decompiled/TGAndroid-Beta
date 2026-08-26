package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.TooltipPopup;
import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import androidx.collection.LongSparseArray;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda23;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import com.google.android.exoplayer2.util.ListenerSet;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.pip.PipActivityContentLayout;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda5;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda12;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.web.BotWebViewContainer;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

public final class ArticleViewer$$ExternalSyntheticLambda26 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final int f$1;
    public final Object f$2;

    public ArticleViewer$$ExternalSyntheticLambda26(int i, int i2, Object obj, int i3) {
        this.$r8$classId = i3;
        this.f$0 = i;
        this.f$1 = i2;
        this.f$2 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                for (int i = 0; i < this.f$0 - this.f$1; i++) {
                    ((BotWebViewContainer.MyWebView) this.f$2).goBack();
                }
                break;
            case 1:
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.f$2;
                exoPlayerImpl.getClass();
                ExoPlayerImpl$$ExternalSyntheticLambda23 exoPlayerImpl$$ExternalSyntheticLambda23 = new ExoPlayerImpl$$ExternalSyntheticLambda23(this.f$0, this.f$1, 1);
                ListenerSet listenerSet = exoPlayerImpl.listeners;
                listenerSet.queueEvent(24, exoPlayerImpl$$ExternalSyntheticLambda23);
                listenerSet.flushEvents();
                break;
            case 2:
                ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(this.f$0, this.f$1);
                break;
            case 3:
                VoIPGroupNotification.decline((Context) this.f$2, this.f$0, this.f$1);
                break;
            case 4:
                ((VoIPService) this.f$2).lambda$initiateActualEncryptedCall$86(this.f$0, this.f$1);
                break;
            case 5:
                ((ConnectionsManager) this.f$2).lambda$discardConnection$0(this.f$0, this.f$1);
                break;
            case 6:
                int i2 = this.f$0;
                DialogsSearchAdapter.OnRecentSearchLoaded onRecentSearchLoaded = (DialogsSearchAdapter.OnRecentSearchLoaded) this.f$2;
                try {
                    SQLiteCursor sQLiteCursorQueryFinalized = MessagesStorage.getInstance(i2).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    LongSparseArray longSparseArray = new LongSparseArray();
                    while (sQLiteCursorQueryFinalized.next()) {
                        long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                        boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(jLongValue);
                        int i3 = this.f$1;
                        if (zIsEncryptedDialog) {
                            if (i3 == 0 || i3 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(jLongValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    DialogsSearchAdapter.RecentSearchObject recentSearchObject = new DialogsSearchAdapter.RecentSearchObject();
                                    recentSearchObject.did = jLongValue;
                                    recentSearchObject.date = sQLiteCursorQueryFinalized.intValue(1);
                                    arrayList4.add(recentSearchObject);
                                    longSparseArray.put(recentSearchObject, recentSearchObject.did);
                                }
                            }
                        } else if (!DialogObject.isUserDialog(jLongValue)) {
                            long j = -jLongValue;
                            if (!arrayList2.contains(Long.valueOf(j))) {
                                arrayList2.add(Long.valueOf(j));
                                DialogsSearchAdapter.RecentSearchObject recentSearchObject2 = new DialogsSearchAdapter.RecentSearchObject();
                                recentSearchObject2.did = jLongValue;
                                recentSearchObject2.date = sQLiteCursorQueryFinalized.intValue(1);
                                arrayList4.add(recentSearchObject2);
                                longSparseArray.put(recentSearchObject2, recentSearchObject2.did);
                            }
                        } else if (i3 != 2 && !arrayList.contains(Long.valueOf(jLongValue))) {
                            arrayList.add(Long.valueOf(jLongValue));
                            DialogsSearchAdapter.RecentSearchObject recentSearchObject3 = new DialogsSearchAdapter.RecentSearchObject();
                            recentSearchObject3.did = jLongValue;
                            recentSearchObject3.date = sQLiteCursorQueryFinalized.intValue(1);
                            arrayList4.add(recentSearchObject3);
                            longSparseArray.put(recentSearchObject3, recentSearchObject3.did);
                        }
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i2).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i4 = 0; i4 < arrayList6.size(); i4++) {
                            DialogsSearchAdapter.RecentSearchObject recentSearchObject4 = (DialogsSearchAdapter.RecentSearchObject) longSparseArray.get(DialogObject.makeEncryptedDialogId(arrayList6.get(i4).id));
                            if (recentSearchObject4 != null) {
                                recentSearchObject4.object = arrayList6.get(i4);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i2).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i5 = 0; i5 < arrayList7.size(); i5++) {
                            TLRPC.Chat chat = arrayList7.get(i5);
                            long j2 = -chat.id;
                            if (chat.migrated_to != null) {
                                DialogsSearchAdapter.RecentSearchObject recentSearchObject5 = (DialogsSearchAdapter.RecentSearchObject) longSparseArray.get(j2);
                                longSparseArray.remove(j2);
                                if (recentSearchObject5 != null) {
                                    arrayList4.remove(recentSearchObject5);
                                }
                            } else {
                                DialogsSearchAdapter.RecentSearchObject recentSearchObject6 = (DialogsSearchAdapter.RecentSearchObject) longSparseArray.get(j2);
                                if (recentSearchObject6 != null) {
                                    recentSearchObject6.object = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i2).getUsersInternal(arrayList, arrayList5);
                        for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                            TLRPC.User user = arrayList5.get(i6);
                            DialogsSearchAdapter.RecentSearchObject recentSearchObject7 = (DialogsSearchAdapter.RecentSearchObject) longSparseArray.get(user.id);
                            if (recentSearchObject7 != null) {
                                recentSearchObject7.object = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new Theme$$ExternalSyntheticLambda5(26));
                    AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(onRecentSearchLoaded, arrayList4, longSparseArray, 14));
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 7:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.f$0).getClientUserId());
                bundle.putInt("message_id", this.f$1);
                ((BaseFragment) this.f$2).presentFragment(new ChatActivity(bundle));
                break;
            case 8:
                int i7 = this.f$0;
                if (i7 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f$1);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i7).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                ((ChatNotificationsPopupWrapper.Callback) this.f$2).muteFor(i7);
                break;
            case 9:
                int i8 = this.f$0;
                if (i8 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.f$1);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i8).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                ((ChatNotificationsPopupWrapper$$ExternalSyntheticLambda12) this.f$2).run(Integer.valueOf(i8));
                break;
            case 10:
                MessagePreviewView.Page page = MessagePreviewView.Page.this;
                View replyMessageCell = page.getReplyMessageCell();
                if (replyMessageCell != null) {
                    int top = replyMessageCell.getTop() + this.f$0;
                    int top2 = replyMessageCell.getTop() + this.f$1;
                    int i9 = top2 - top;
                    MessagePreviewView.Page.AnonymousClass6 anonymousClass6 = page.chatListView;
                    int paddingTop = anonymousClass6.getPaddingTop();
                    int height = anonymousClass6.getHeight() - anonymousClass6.getPaddingBottom();
                    if (i9 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i10 = top - paddingTop;
                    if (i10 < 0) {
                        anonymousClass6.scrollBy(0, i10);
                    }
                    break;
                }
                break;
            case 11:
                RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
                PipSource pipSource = rTMPStreamPipOverlay.pipSource;
                if (pipSource != null) {
                    Point point = (Point) pipSource.params.matrix;
                    int i11 = point.x;
                    int i12 = this.f$0;
                    int i13 = this.f$1;
                    if (i11 != i12 || point.y != i13) {
                        point.set(i12, i13);
                        pipSource.checkAvailable(true);
                        TooltipPopup tooltipPopup = pipSource.controller;
                        if (((PipSource) tooltipPopup.mTmpDisplayFrame) == pipSource) {
                            PipUtils.applyPictureInPictureParams((LaunchActivity) tooltipPopup.mLayoutParams, pipSource);
                            MediaSessionConnector mediaSessionConnector = (MediaSessionConnector) tooltipPopup.mTmpAppPos;
                            if (mediaSessionConnector != null) {
                                mediaSessionConnector.setPlayer(pipSource.player);
                            }
                        }
                        ((PipActivityContentLayout) tooltipPopup.mMessageView).invalidate();
                    }
                }
                rTMPStreamPipOverlay.bindTextureView(false);
                break;
            case 12:
                ((SurfaceTextureHelper) this.f$2).lambda$setTextureSize$2(this.f$0, this.f$1);
                break;
            case 13:
                ((SurfaceViewRenderer) this.f$2).lambda$onFrameResolutionChanged$0(this.f$0, this.f$1);
                break;
            default:
                ((TextureViewRenderer) this.f$2).lambda$updateVideoSizes$1(this.f$0, this.f$1);
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda26(ExoPlayerImpl.ComponentListener componentListener, SurfaceTexture surfaceTexture, int i, int i2) {
        this.$r8$classId = 2;
        this.f$2 = componentListener;
        this.f$0 = i;
        this.f$1 = i2;
    }

    public ArticleViewer$$ExternalSyntheticLambda26(Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$2 = obj;
        this.f$0 = i;
        this.f$1 = i2;
    }
}
