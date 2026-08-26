package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.wearable.internal.zzff;
import com.google.common.base.Splitter;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda7;
import org.telegram.ui.ChannelAdminLogActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatEditTypeActivity;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.RenderView$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.VideoScreenPreview;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.PhotoCropActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda89;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda14;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;

public final class ImageUpdater$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$2;

    public ImageUpdater$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
    }

    @Override
    public final void run() {
        PhotoViewer$$ExternalSyntheticLambda89 photoViewer$$ExternalSyntheticLambda89;
        RecyclerListView recyclerListView;
        int top;
        int i = 3;
        int i2 = 1;
        Object obj = this.f$2;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Uri uri = (Uri) obj;
                ImageUpdater imageUpdater = (ImageUpdater) obj2;
                imageUpdater.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) imageUpdater.parentFragment.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        PhotoCropActivity photoCropActivity = new PhotoCropActivity(bundle);
                        photoCropActivity.sameBitmap = false;
                        photoCropActivity.doneButtonPressed = false;
                        photoCropActivity.delegate = imageUpdater;
                        launchActivity.presentFragment(photoCropActivity);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    imageUpdater.processBitmap(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
                break;
            case 1:
                InstantCameraView.VideoRecorder videoRecorder = (InstantCameraView.VideoRecorder) obj2;
                videoRecorder.getClass();
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                InstantCameraView instantCameraView = InstantCameraView.this;
                instantCameraView.videoEditedInfo = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, instantCameraView.size);
                VideoEditedInfo videoEditedInfo2 = instantCameraView.videoEditedInfo;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = instantCameraView.file;
                videoEditedInfo2.encryptedFile = instantCameraView.encryptedFile;
                videoEditedInfo2.key = instantCameraView.key;
                videoEditedInfo2.iv = instantCameraView.iv;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = videoRecorder.videoFile.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = instantCameraView.videoEditedInfo;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = instantCameraView.firstFrameThumb;
                videoEditedInfo3.estimatedDuration = instantCameraView.recordedTime;
                instantCameraView.firstFrameThumb = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, videoRecorder.videoFile.getAbsolutePath(), 0, true, 0, 0, 0L);
                InstantCameraView.SendOptions sendOptions = (InstantCameraView.SendOptions) obj;
                if (sendOptions != null) {
                    photoEntry.ttl = sendOptions.ttl;
                    photoEntry.effectId = sendOptions.effectId;
                }
                instantCameraView.delegate.sendMedia(photoEntry, instantCameraView.videoEditedInfo, sendOptions == null || sendOptions.notify, sendOptions != null ? sendOptions.scheduleDate : 0, 0, false, sendOptions != null ? sendOptions.stars : 0L);
                break;
            case 2:
                InstantCameraView.VideoRecorder videoRecorder2 = ((InstantCameraView.VideoRecorder.AnonymousClass1) obj2).this$1;
                Bitmap bitmap = (Bitmap) obj;
                if (!(bitmap == null || bitmap.getPixel(0, 0) == 0) || videoRecorder2.keyframeThumbs.size() <= 1) {
                    videoRecorder2.keyframeThumbs.add(bitmap);
                } else {
                    ArrayList arrayList = videoRecorder2.keyframeThumbs;
                    arrayList.add((Bitmap) zziq.m(1, arrayList));
                }
                break;
            case 3:
                InviteLinkBottomSheet inviteLinkBottomSheet = (InviteLinkBottomSheet) obj2;
                inviteLinkBottomSheet.getClass();
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        inviteLinkBottomSheet.users.put(Long.valueOf(inviteLinkBottomSheet.invite.admin_id), (TLRPC.User) vector.objects.get(0));
                        inviteLinkBottomSheet.adapter.mObservable.notifyChanged();
                        break;
                    }
                }
                break;
            case 4:
                InviteLinkBottomSheet.Adapter.AnonymousClass2 anonymousClass2 = (InviteLinkBottomSheet.Adapter.AnonymousClass2) obj2;
                if (((TLRPC.TL_error) obj) != null) {
                    anonymousClass2.getClass();
                    break;
                } else {
                    InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                    ChannelAdminLogActivity.AnonymousClass20 anonymousClass20 = inviteLinkBottomSheet2.inviteDelegate;
                    if (anonymousClass20 != null) {
                        ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                        ArrayList arrayList2 = channelAdminLogActivity.filteredMessages;
                        int size = arrayList2.size();
                        int i3 = channelAdminLogActivity.chatAdapter.messagesEndRow;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                        TLRPC.TL_chatInviteExported tL_chatInviteExported = inviteLinkBottomSheet2.invite;
                        tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = channelAdminLogActivity.getAccountInstance().getUserConfig().clientUserId;
                        if (new MessageObject(((BaseFragment) channelAdminLogActivity).currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) channelAdminLogActivity.messages, (HashMap<String, ArrayList<MessageObject>>) channelAdminLogActivity.messagesByDays, channelAdminLogActivity.currentChat, channelAdminLogActivity.mid, true).contentType >= 0) {
                            channelAdminLogActivity.filterDeletedMessages();
                            int size2 = arrayList2.size() - size;
                            if (size2 > 0) {
                                channelAdminLogActivity.chatListItemAnimator.shouldAnimateEnterFromBottom = true;
                                ChannelAdminLogActivity.ChatActivityAdapter chatActivityAdapter = channelAdminLogActivity.chatAdapter;
                                chatActivityAdapter.notifyItemRangeInserted(chatActivityAdapter.messagesEndRow, size2);
                                ChannelAdminLogActivity.access$8500(channelAdminLogActivity);
                            }
                            channelAdminLogActivity.invitesCache.remove(tL_chatInviteExported.link);
                            break;
                        }
                    }
                }
                break;
            case 5:
                ((InviteMembersBottomSheet) obj2).setFocusable(true);
                UsersSelectActivity.AnonymousClass4 anonymousClass4 = (UsersSelectActivity.AnonymousClass4) obj;
                anonymousClass4.requestFocus();
                AndroidUtilities.runOnUIThread(new InviteMembersBottomSheet$$ExternalSyntheticLambda1(anonymousClass4, i2));
                break;
            case 6:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((ChatEditTypeActivity) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 7:
                LinkSpanDrawable.ClickableSmallTextView clickableSmallTextView = (LinkSpanDrawable.ClickableSmallTextView) obj2;
                if (clickableSmallTextView.pressedLink == ((LinkSpanDrawable) obj)) {
                    clickableSmallTextView.performLongClick();
                    clickableSmallTextView.pressedLink = null;
                    clickableSmallTextView.links.clear(true);
                }
                break;
            case 8:
                ((LinkSpanDrawable.LinkCollector) obj2).removeLoading((LoadingDrawable) obj, false);
                break;
            case 9:
                MediaActivity mediaActivity = (MediaActivity) obj2;
                if (!((boolean[]) obj)[0] && (photoViewer$$ExternalSyntheticLambda89 = mediaActivity.applyBulletin) != null) {
                    photoViewer$$ExternalSyntheticLambda89.run();
                }
                mediaActivity.applyBulletin = null;
                break;
            case 10:
                ((MemberRequestsBottomSheet) obj2).setFocusable(true);
                UsersSelectActivity.AnonymousClass4 anonymousClass5 = (UsersSelectActivity.AnonymousClass4) obj;
                anonymousClass5.requestFocus();
                AndroidUtilities.runOnUIThread(new InviteMembersBottomSheet$$ExternalSyntheticLambda1(anonymousClass5, i));
                break;
            case 11:
                Painting painting = (Painting) obj2;
                painting.paused = true;
                Size size3 = painting.size;
                ByteBuffer byteBuffer = (ByteBuffer) painting.getPaintingData(new RectF(0.0f, 0.0f, size3.width, size3.height), true, false, false).matrix;
                RectF rectF = new RectF(0.0f, 0.0f, size3.width, size3.height);
                Object obj3 = painting.delegate.this$0;
                painting.backupSlice = new Splitter(byteBuffer, 0, rectF);
                painting.cleanResources(false);
                ((RenderView$1$$ExternalSyntheticLambda0) obj).run();
                break;
            case 12:
                RenderView.CanvasInternal canvasInternal = ((RenderView) obj2).internal;
                if (canvasInternal != null && canvasInternal.initialized) {
                    RenderView.CanvasInternal.access$1300(canvasInternal);
                    ((Runnable) obj).run();
                    break;
                }
                break;
            case 13:
                LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) obj2;
                lPhotoPaintView.getClass();
                PhotoView photoView = (PhotoView) obj;
                EntityView.SelectionView selectionView = photoView.selectionView;
                if (selectionView != null) {
                    selectionView.updatePosition();
                }
                lPhotoPaintView.selectEntity(photoView, true);
                break;
            case 14:
                ((PhotoView) obj2).segmentImage((Bitmap) obj);
                break;
            case 15:
                StickerMakerView stickerMakerView = (StickerMakerView) obj2;
                stickerMakerView.empty = false;
                StickerMakerView.SegmentedObject[] segmentedObjectArr = (StickerMakerView.SegmentedObject[]) ((ArrayList) obj).toArray(new StickerMakerView.SegmentedObject[0]);
                stickerMakerView.objects = segmentedObjectArr;
                if (segmentedObjectArr.length > 0) {
                    stickerMakerView.stickerCutOutBtn.setScaleX(0.3f);
                    stickerMakerView.stickerCutOutBtn.setScaleY(0.3f);
                    stickerMakerView.stickerCutOutBtn.setAlpha(0.0f);
                    stickerMakerView.stickerCutOutBtn.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
                break;
            case 16:
                zzff zzffVar = (zzff) obj2;
                zzffVar.getClass();
                ChatMessageCell$$ExternalSyntheticLambda7 chatMessageCell$$ExternalSyntheticLambda7 = (ChatMessageCell$$ExternalSyntheticLambda7) obj;
                chatMessageCell$$ExternalSyntheticLambda7.run();
                zzffVar.zza.remove(chatMessageCell$$ExternalSyntheticLambda7);
                break;
            case 17:
                PostsSearchContainer postsSearchContainer = (PostsSearchContainer) obj2;
                postsSearchContainer.floodLoading = false;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject2;
                    postsSearchContainer.flood = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        postsSearchContainer.updateEmptyView();
                        postsSearchContainer.listView.adapter.update(true);
                    } else {
                        postsSearchContainer.load(false);
                    }
                }
                break;
            case 18:
                LimitReachedBottomSheet limitReachedBottomSheet = (LimitReachedBottomSheet) obj2;
                ArrayList arrayList3 = limitReachedBottomSheet.chats;
                TLObject tLObject3 = (TLObject) obj;
                if (tLObject3 != null) {
                    arrayList3.clear();
                    arrayList3.addAll(((TLRPC.TL_messages_chats) tLObject3).chats);
                    limitReachedBottomSheet.loading = false;
                    limitReachedBottomSheet.enterAnimator.showItemsAnimated(limitReachedBottomSheet.chatsTitleRow + 4);
                    int i4 = 0;
                    while (true) {
                        recyclerListView = limitReachedBottomSheet.recyclerListView;
                        if (i4 >= recyclerListView.getChildCount()) {
                            top = 0;
                        } else if (recyclerListView.getChildAt(i4) instanceof LimitReachedBottomSheet.HeaderView) {
                            top = recyclerListView.getChildAt(i4).getTop();
                        } else {
                            i4++;
                        }
                    }
                    limitReachedBottomSheet.updateRows$7();
                    if (limitReachedBottomSheet.headerRow >= 0 && top != 0) {
                        ((LinearLayoutManager) recyclerListView.getLayoutManager()).scrollToPositionWithOffset(limitReachedBottomSheet.headerRow + 1, top);
                    }
                }
                int iMax = Math.max(arrayList3.size(), limitReachedBottomSheet.limitParams.mResizeArea);
                limitReachedBottomSheet.limitPreviewView.setIconValue(iMax, false);
                limitReachedBottomSheet.limitPreviewView.setBagePosition(iMax / limitReachedBottomSheet.limitParams.mResizeMaxDimension);
                LimitReachedBottomSheet.HeaderView.AnonymousClass2 anonymousClass3 = limitReachedBottomSheet.limitPreviewView;
                anonymousClass3.animationCanPlay = true;
                anonymousClass3.requestLayout();
                break;
            case 19:
                ((LimitReachedBottomSheet) obj2).boostChannel((Loadable) obj, true);
                break;
            case 20:
                VideoScreenPreview videoScreenPreview = (VideoScreenPreview) obj2;
                AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(21, videoScreenPreview, FileLoader.getInstance(videoScreenPreview.currentAccount).getPathToAttach((TLRPC.Document) obj)));
                break;
            case 21:
                VideoScreenPreview videoScreenPreview2 = (VideoScreenPreview) obj2;
                videoScreenPreview2.file = (File) obj;
                videoScreenPreview2.checkVideo();
                break;
            case 22:
                ((SelectorBottomSheet$$ExternalSyntheticLambda3) obj2).run((ArrayList) obj);
                break;
            case 23:
                ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) obj2).run((TLRPC.TL_error) obj);
                break;
            case 24:
                ((OAuthSheet$$ExternalSyntheticLambda13) obj2).run((ArrayList) obj);
                break;
            case 25:
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) obj2).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new AlertsCreator$$ExternalSyntheticLambda195((Utilities.Callback) obj, smallGroupsParticipantsCount, 1));
                    break;
                }
                break;
            case 26:
                Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of((ChatActivity) obj2).createSimpleBulletin(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) obj).stars)), R.raw.stars_send);
                bulletinCreateSimpleBulletin.duration = 5000;
                bulletinCreateSimpleBulletin.show(true);
                break;
            case 27:
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = (BoostViaGiftsBottomSheet) obj2;
                boostViaGiftsBottomSheet.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, boostViaGiftsBottomSheet.currentChat, Boolean.TRUE, (TL_stories.PrepaidGiveaway) obj);
                break;
            case 28:
                ((UserSelectorBottomSheet) obj2).lambda$search$0((TLObject) obj);
                break;
            default:
                ((PollItemMenu$$ExternalSyntheticLambda14) obj2).run((TLRPC.Chat) obj);
                break;
        }
    }
}
