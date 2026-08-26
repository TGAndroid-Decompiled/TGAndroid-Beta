package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Point;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.video.SurfaceNotValidException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.MemberRequestCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareTopView;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.TranslateButton;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.VideoSeekPreviewImage;
import org.telegram.ui.Components.WebPlayerView;
import org.telegram.ui.Components.quickforward.QuickShareSelectorOverlayLayout;
import org.telegram.ui.Components.voip.EndCloseLayout;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.Delegates.MemberRequestsDelegate.PreviewDialog;

public final class DialogsActivity$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public DialogsActivity$$ExternalSyntheticLambda8(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        int i;
        ArrayList arrayList;
        RecyclerListView recyclerListView;
        switch (this.$r8$classId) {
            case 0:
                ((DialogsActivity.ViewPage) this.f$1).listView.postOnAnimation(new DialogsActivity$$ExternalSyntheticLambda14((DialogsActivity) this.f$0, 18));
                break;
            case 1:
                ChatActivity.AnonymousClass55 anonymousClass55 = (ChatActivity.AnonymousClass55) this.f$0;
                ((ActionBarPopupWindow) this.f$1).dismiss(true);
                TranslateButton.showCocoonAlert(anonymousClass55.getContext(), anonymousClass55.resourcesProvider);
                break;
            case 2:
                ((TranslateController) this.f$1).setHideTranslateDialog(((ChatActivity.AnonymousClass55) this.f$0).dialogId, false);
                break;
            case 3:
                UndoView undoView = (UndoView) this.f$0;
                undoView.getClass();
                TLObject tLObject = (TLObject) this.f$1;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.parentFragment.presentFragment(new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject));
                }
                break;
            case 4:
                ((UItem) this.f$0).clickCallback.onClick((TextCheckCell2) this.f$1);
                break;
            case 5:
                VideoPlayer videoPlayer = (VideoPlayer) this.f$0;
                videoPlayer.getClass();
                PlaybackException playbackException = (PlaybackException) this.f$1;
                Throwable cause = playbackException.getCause();
                ArrayList arrayList2 = null;
                if ((cause instanceof MediaCodecDecoderException) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(playbackException);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap map = VideoPlayer.cachedSupportedCodec;
                    if (map != null) {
                        map.clear();
                    }
                    ArrayList arrayList3 = videoPlayer.videoQualities;
                    if (arrayList3 != null) {
                        int i2 = 0;
                        while (i2 < arrayList3.size()) {
                            VideoPlayer.Quality quality = (VideoPlayer.Quality) arrayList3.get(i2);
                            int i3 = 0;
                            while (true) {
                                int size = quality.uris.size();
                                ArrayList arrayList4 = quality.uris;
                                if (i3 < size) {
                                    VideoPlayer.VideoUri videoUri = (VideoPlayer.VideoUri) arrayList4.get(i3);
                                    if (!TextUtils.isEmpty(videoUri.codec) && !VideoPlayer.supportsHardwareDecoder(videoUri.codec)) {
                                        arrayList4.remove(i3);
                                        i3--;
                                    }
                                    i3++;
                                } else {
                                    if (arrayList4.isEmpty()) {
                                        arrayList3.remove(i2);
                                        i2--;
                                    }
                                    i2++;
                                }
                            }
                        }
                        arrayList2 = arrayList3;
                    }
                    videoPlayer.videoQualities = arrayList2;
                    if (arrayList2 != null) {
                        videoPlayer.preparePlayer(arrayList2, videoPlayer.videoQualityToSelect);
                    }
                } else {
                    TextureView textureView = videoPlayer.textureView;
                    if (textureView != null && ((!videoPlayer.triedReinit && (cause instanceof MediaCodecRenderer.DecoderInitializationException)) || (cause instanceof SurfaceNotValidException))) {
                        videoPlayer.triedReinit = true;
                        if (videoPlayer.player != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int iIndexOfChild = viewGroup.indexOfChild(videoPlayer.textureView);
                                viewGroup.removeView(videoPlayer.textureView);
                                viewGroup.addView(videoPlayer.textureView, iIndexOfChild);
                            }
                            DispatchQueue dispatchQueue = videoPlayer.workerQueue;
                            if (dispatchQueue == null) {
                                ExoPlayerImpl exoPlayerImpl = videoPlayer.player;
                                TextureView textureView2 = videoPlayer.textureView;
                                exoPlayerImpl.verifyApplicationThread();
                                if (textureView2 != null && textureView2 == exoPlayerImpl.textureView) {
                                    exoPlayerImpl.verifyApplicationThread();
                                    exoPlayerImpl.removeSurfaceCallbacks();
                                    exoPlayerImpl.setVideoOutputInternal(null);
                                    exoPlayerImpl.maybeNotifySurfaceSizeChanged(0, 0);
                                }
                                videoPlayer.player.setVideoTextureView(videoPlayer.textureView);
                                ArrayList arrayList5 = videoPlayer.videoQualities;
                                if (arrayList5 != null) {
                                    videoPlayer.preparePlayer(arrayList5, videoPlayer.videoQualityToSelect);
                                } else if (videoPlayer.loopingMediaSource) {
                                    videoPlayer.preparePlayerLoop(videoPlayer.videoUri, videoPlayer.videoType, videoPlayer.audioUri, videoPlayer.audioType);
                                } else {
                                    videoPlayer.preparePlayer(videoPlayer.videoUri, videoPlayer.videoType, 0L);
                                }
                                videoPlayer.play();
                            } else {
                                dispatchQueue.postRunnable(new Tooltip$$ExternalSyntheticLambda0(videoPlayer, 11));
                            }
                        }
                    } else {
                        videoPlayer.delegate.onError(videoPlayer, playbackException);
                    }
                }
                break;
            case 6:
                VideoPlayer.this.audioVisualizerDelegate.onVisualizerUpdate(true, true, (float[]) this.f$1);
                break;
            case 7:
                VideoSeekPreviewImage videoSeekPreviewImage = (VideoSeekPreviewImage) this.f$0;
                Bitmap bitmap = (Bitmap) this.f$1;
                if (bitmap != null) {
                    if (videoSeekPreviewImage.bitmapToDraw != null) {
                        Bitmap bitmap2 = videoSeekPreviewImage.bitmapToRecycle;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        videoSeekPreviewImage.bitmapToRecycle = videoSeekPreviewImage.bitmapToDraw;
                    }
                    videoSeekPreviewImage.bitmapToDraw = bitmap;
                    Bitmap bitmap3 = videoSeekPreviewImage.bitmapToDraw;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    videoSeekPreviewImage.bitmapShader = bitmapShader;
                    bitmapShader.setLocalMatrix(videoSeekPreviewImage.matrix);
                    videoSeekPreviewImage.bitmapPaint.setShader(videoSeekPreviewImage.bitmapShader);
                    videoSeekPreviewImage.invalidate();
                    int iDp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i = (int) (iDp / width);
                    } else {
                        iDp = (int) (iDp * width);
                        i = iDp;
                    }
                    ViewGroup.LayoutParams layoutParams = videoSeekPreviewImage.getLayoutParams();
                    if (videoSeekPreviewImage.getVisibility() != 0 || layoutParams.width != iDp || layoutParams.height != i) {
                        layoutParams.width = iDp;
                        layoutParams.height = i;
                        videoSeekPreviewImage.setVisibility(0);
                        videoSeekPreviewImage.requestLayout();
                    }
                }
                videoSeekPreviewImage.progressRunnable = null;
                break;
            case 8:
                final WebPlayerView.YoutubeVideoTask youtubeVideoTask = (WebPlayerView.YoutubeVideoTask) this.f$0;
                WebPlayerView.this.webView.evaluateJavascript((String) this.f$1, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str = (String) obj;
                        WebPlayerView.YoutubeVideoTask youtubeVideoTask2 = youtubeVideoTask;
                        String[] strArr = youtubeVideoTask2.result;
                        strArr[0] = strArr[0].replace(youtubeVideoTask2.sig, "/signature/" + str.substring(1, str.length() - 1));
                        youtubeVideoTask2.countDownLatch.countDown();
                    }
                });
                break;
            case 9:
                QuickShareSelectorOverlayLayout quickShareSelectorOverlayLayout = (QuickShareSelectorOverlayLayout) this.f$0;
                quickShareSelectorOverlayLayout.drawablesForRemove.add((String) this.f$1);
                quickShareSelectorOverlayLayout.invalidate();
                break;
            case 10:
                ((EndCloseLayout) this.f$0).endCloseView.setOnClickListener((View.OnClickListener) this.f$1);
                break;
            case 11:
                GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) this.f$0;
                HashMap<String, Bitmap> map2 = groupCallMiniTextureView.call.thumbs;
                ChatObject.VideoParticipant videoParticipant = groupCallMiniTextureView.participant;
                boolean z = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                map2.put(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, (Bitmap) this.f$1);
                break;
            case 12:
                ((GroupCallActivity.AnonymousClass28) this.f$0).getClass();
                final GroupCallMiniTextureView groupCallMiniTextureView2 = (GroupCallMiniTextureView) this.f$1;
                groupCallMiniTextureView2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        groupCallMiniTextureView2.animateEnter = false;
                    }
                }).setDuration(150L).start();
                break;
            case 13:
                RecyclerListView recyclerListView2 = (RecyclerListView) this.f$0;
                if (recyclerListView2 != null) {
                    recyclerListView2.setOnItemClickListener((RecyclerListView.OnItemClickListener) this.f$1);
                }
                break;
            case 14:
                CountrySelectActivity.CountrySearchAdapter countrySearchAdapter = (CountrySelectActivity.CountrySearchAdapter) this.f$0;
                countrySearchAdapter.getClass();
                String lowerCase = ((String) this.f$1).trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = countrySearchAdapter.countryList;
                    int size2 = arrayList7.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj = arrayList7.get(i4);
                        i4++;
                        CountrySelectActivity.Country country = (CountrySelectActivity.Country) obj;
                        String str = country.name;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(country.name).toLowerCase();
                        String str2 = country.defaultName;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(country.defaultName).toLowerCase();
                        String str3 = country.code;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String strConcat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase)) {
                            arrayList = arrayList7;
                        } else {
                            arrayList = arrayList7;
                            if (lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, lowerCase5) || str3.startsWith(lowerCase) || strConcat.startsWith(lowerCase)) {
                            }
                            arrayList7 = arrayList;
                        }
                        arrayList6.add(country);
                        arrayList7 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda8(15, countrySearchAdapter, arrayList6));
                } else {
                    AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda8(15, countrySearchAdapter, new ArrayList()));
                }
                break;
            case 15:
                CountrySelectActivity.CountrySearchAdapter countrySearchAdapter2 = (CountrySelectActivity.CountrySearchAdapter) this.f$0;
                CountrySelectActivity countrySelectActivity = CountrySelectActivity.this;
                if (countrySelectActivity.searching) {
                    countrySearchAdapter2.searchResult = (ArrayList) this.f$1;
                    if (countrySelectActivity.searchWas && (recyclerListView = countrySelectActivity.listView) != null) {
                        RecyclerView.Adapter adapter = recyclerListView.getAdapter();
                        CountrySelectActivity.CountrySearchAdapter countrySearchAdapter3 = countrySelectActivity.searchListViewAdapter;
                        if (adapter != countrySearchAdapter3) {
                            countrySelectActivity.listView.setAdapter(countrySearchAdapter3);
                            countrySelectActivity.listView.setFastScrollVisible(false);
                        }
                    }
                    countrySearchAdapter2.mObservable.notifyChanged();
                    break;
                }
                break;
            case 16:
                ((CreateGroupCallSheet) this.f$0).lambda$createCall$4((TLRPC.Updates) this.f$1);
                break;
            case 17:
                MemberRequestsDelegate memberRequestsDelegate = (MemberRequestsDelegate) this.f$0;
                memberRequestsDelegate.getClass();
                MemberRequestCell memberRequestCell = (MemberRequestCell) this.f$1;
                TLRPC.TL_chatInviteImporter importer = memberRequestCell.getImporter();
                memberRequestsDelegate.importer = importer;
                LongSparseArray longSparseArray = memberRequestsDelegate.users;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    BaseFragment baseFragment = memberRequestsDelegate.fragment;
                    baseFragment.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    boolean z2 = point.x > point.y;
                    if (user.photo == null || z2) {
                        memberRequestsDelegate.isNeedRestoreList = true;
                        baseFragment.dismissCurrentDialog();
                        Bundle bundle = new Bundle();
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        bundle.putLong("user_id", user.id);
                        bundle.putBoolean("removeFragmentOnChatOpen", false);
                        baseFragment.presentFragment(profileActivity);
                    } else if (memberRequestsDelegate.previewDialog == null) {
                        MemberRequestsDelegate.PreviewDialog previewDialog = memberRequestsDelegate.new PreviewDialog(baseFragment.getParentActivity(), (RecyclerListView) memberRequestCell.getParent(), baseFragment.getResourceProvider(), memberRequestsDelegate.isChannel);
                        memberRequestsDelegate.previewDialog = previewDialog;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = memberRequestsDelegate.importer;
                        BackupImageView avatarImageView = memberRequestCell.getAvatarImageView();
                        previewDialog.importer = tL_chatInviteImporter;
                        previewDialog.imageView = avatarImageView;
                        int i5 = memberRequestsDelegate.currentAccount;
                        TLRPC.User user2 = MessagesController.getInstance(i5).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                        ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i5, user2, 0);
                        ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i5, user2, 1);
                        if (MessagesController.getInstance(i5).getUserFull(tL_chatInviteImporter.user_id) == null) {
                            MessagesController.getInstance(i5).loadUserInfo(user2, false, 0);
                        }
                        ProfileGalleryView profileGalleryView = previewDialog.viewPager;
                        profileGalleryView.setParentAvatarImage(avatarImageView);
                        profileGalleryView.setData(tL_chatInviteImporter.user_id, true);
                        profileGalleryView.initIfEmpty(null, forUserOrChat, forUserOrChat2, true);
                        previewDialog.nameText.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                        TextView textView = previewDialog.bioText;
                        textView.setText(tL_chatInviteImporter.about);
                        textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                        previewDialog.contentView.requestLayout();
                        memberRequestsDelegate.previewDialog.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(memberRequestsDelegate, 21));
                        memberRequestsDelegate.previewDialog.show();
                    }
                    break;
                }
                break;
            case 18:
                ((DialogsActivity) this.f$0).lambda$showItemOptions$172((TLRPC.TL_attachMenuBot) this.f$1);
                break;
            case 19:
                ((DialogsActivity) this.f$0).lambda$updateDialogsHint$64((String) this.f$1);
                break;
            case 20:
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                dialogsActivity.getClass();
                BottomSheet[] bottomSheetArr = (BottomSheet[]) this.f$1;
                BottomSheet bottomSheet = bottomSheetArr[0];
                if (bottomSheet != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                    bottomSheetArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda14(dialogsActivity, 26), 300L);
                break;
            case 21:
                DialogsActivity dialogsActivity2 = (DialogsActivity) this.f$0;
                dialogsActivity2.getMessagesController().addDialogToFolder((ArrayList) this.f$1, (dialogsActivity2.folderId == 0 && dialogsActivity2.communityId == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 22:
                DialogsActivity dialogsActivity3 = DialogsActivity.this;
                dialogsActivity3.debugLastUpdateAction = 2;
                dialogsActivity3.setDialogsListFrozen(true, true);
                dialogsActivity3.checkAnimationFinished();
                int i6 = 0;
                while (true) {
                    ArrayList arrayList8 = (ArrayList) this.f$1;
                    if (i6 < arrayList8.size()) {
                        long j = ((TLRPC.Dialog) arrayList8.get(i6)).id;
                        TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i6);
                        if (dialogsActivity3.getMessagesController().isForum(j) || dialogsActivity3.getMessagesController().isMonoForumWithManageRights(j)) {
                            dialogsActivity3.getMessagesController().markAllTopicsAsRead(j);
                        }
                        dialogsActivity3.getMessagesController().markMentionsAsRead(j, 0L);
                        MessagesController messagesController = dialogsActivity3.getMessagesController();
                        int i7 = dialog.top_message;
                        messagesController.markDialogAsRead(j, i7, i7, dialog.last_message_date, false, 0L, 0, true, 0);
                        i6++;
                    }
                    break;
                }
                break;
            case 23:
                ((DialogsActivity.AnonymousClass11) this.f$0).showDeleteAlert((MessagesController.DialogFilter) this.f$1);
                break;
            case 24:
                DialogsActivity dialogsActivity4 = DialogsActivity.this;
                dialogsActivity4.shareLinkSearchRunnable = null;
                ShareTopView shareTopView = dialogsActivity4.shareTopView;
                if (shareTopView != null && shareTopView.linkSearchEnabled) {
                    shareTopView.doLinkSearch((CharSequence) this.f$1, false);
                    break;
                }
                break;
            case 25:
                DialogsActivity.this.removeSelfFromStack();
                BaseFragment[] baseFragmentArr = (BaseFragment[]) this.f$1;
                if (baseFragmentArr[1] == null) {
                    baseFragmentArr[0].finishFragment();
                } else {
                    baseFragmentArr[0].removeSelfFromStack();
                    baseFragmentArr[1].finishFragment();
                }
                break;
            case 26:
                EmojiAnimationsOverlay emojiAnimationsOverlay = (EmojiAnimationsOverlay) this.f$0;
                emojiAnimationsOverlay.getClass();
                ChatActivity chatActivity = emojiAnimationsOverlay.chatActivity;
                StickersAlert stickersAlert = new StickersAlert(chatActivity.getParentActivity(), emojiAnimationsOverlay.chatActivity, ((MessageObject) this.f$1).getInputStickerSet(), null, chatActivity.chatActivityEnterView, chatActivity.getResourceProvider());
                stickersAlert.setCalcMandatoryInsets(chatActivity.isKeyboardVisible());
                chatActivity.showDialog(stickersAlert);
                break;
            case 27:
                FilterChatlistActivity.ListAdapter.AnonymousClass1 anonymousClass1 = (FilterChatlistActivity.ListAdapter.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                ((AlertDialog) this.f$1).dismiss();
                FilterChatlistActivity.ListAdapter listAdapter = FilterChatlistActivity.ListAdapter.this;
                FilterChatlistActivity filterChatlistActivity = FilterChatlistActivity.this;
                Utilities.Callback callback = filterChatlistActivity.onDelete;
                if (callback != null) {
                    callback.run(filterChatlistActivity.invite);
                }
                FilterChatlistActivity.this.finishFragment();
                break;
            case 28:
                FilterCreateActivity filterCreateActivity = (FilterCreateActivity) this.f$0;
                FilterChatlistActivity filterChatlistActivity2 = new FilterChatlistActivity(filterCreateActivity.filter, ((FilterCreateActivity.ItemInner) this.f$1).link);
                filterChatlistActivity2.onEdit = new FilterCreateActivity$$ExternalSyntheticLambda18(filterCreateActivity, 1);
                filterChatlistActivity2.onDelete = new FilterCreateActivity$$ExternalSyntheticLambda18(filterCreateActivity, 2);
                filterCreateActivity.presentFragment(filterChatlistActivity2);
                break;
            default:
                FilterCreateActivity filterCreateActivity2 = (FilterCreateActivity) this.f$0;
                filterCreateActivity2.hasUserChanged = false;
                filterCreateActivity2.creatingNew = false;
                filterCreateActivity2.filter.flags = filterCreateActivity2.newFilterFlags;
                filterCreateActivity2.checkDoneButton(true);
                filterCreateActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                Runnable runnable = (Runnable) this.f$1;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }
}
