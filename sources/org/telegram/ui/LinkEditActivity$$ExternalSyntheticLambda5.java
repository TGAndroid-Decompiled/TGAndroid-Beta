package org.telegram.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.exoplayer2.ExoPlayerImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatListCell$ListView;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatActivityEnterView$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.EmbedBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PipVideoOverlay;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Components.Shaker$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesViewPager;

public final class LinkEditActivity$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public LinkEditActivity$$ExternalSyntheticLambda5(int i, Object obj, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        ChatAttachAlert.AnonymousClass25 anonymousClass25;
        ActionBarPopupWindow actionBarPopupWindow;
        ActionBarPopupWindow actionBarPopupWindow2;
        switch (this.$r8$classId) {
            case 0:
                LinkEditActivity linkEditActivity = (LinkEditActivity) this.f$0;
                if (!this.f$1) {
                    TextCheckCell textCheckCell = linkEditActivity.subCell;
                    if (textCheckCell != null && textCheckCell.checkBox.isChecked) {
                        int i = -linkEditActivity.shakeDp;
                        linkEditActivity.shakeDp = i;
                        AndroidUtilities.shakeViewSpring(textCheckCell, i);
                    } else {
                        TextCheckCell textCheckCell2 = (TextCheckCell) view;
                        boolean z = textCheckCell2.checkBox.isChecked;
                        textCheckCell2.setChecked(!z);
                        linkEditActivity.setUsesVisible(z);
                        TextCheckCell textCheckCell3 = linkEditActivity.subCell;
                        if (textCheckCell3 != null) {
                            if (textCheckCell2.checkBox.isChecked) {
                                textCheckCell3.setChecked(false);
                                linkEditActivity.subCell.setCheckBoxIcon(R.drawable.permission_locked);
                                linkEditActivity.subEditPriceCell.setVisibility(8);
                            } else if (linkEditActivity.inviteToEdit == null) {
                                textCheckCell3.setCheckBoxIcon(0);
                            }
                        }
                    }
                } else {
                    linkEditActivity.getClass();
                }
                break;
            case 1:
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) this.f$0;
                ActionBarPopupWindow actionBarPopupWindow3 = actionBarMenuItem.popupWindow;
                if (actionBarPopupWindow3 != null && actionBarPopupWindow3.isShowing() && this.f$1) {
                    if (!actionBarMenuItem.processedPopupClick) {
                        actionBarMenuItem.processedPopupClick = true;
                        actionBarMenuItem.popupWindow.dismiss(actionBarMenuItem.allowCloseAnimation);
                    }
                }
                ActionBarMenu actionBarMenu = actionBarMenuItem.parentMenu;
                if (actionBarMenu == null) {
                    ActionBarMenuItem.ActionBarMenuItemDelegate actionBarMenuItemDelegate = actionBarMenuItem.delegate;
                    if (actionBarMenuItemDelegate != null) {
                        actionBarMenuItemDelegate.onItemClick(((Integer) view.getTag()).intValue());
                    }
                } else {
                    actionBarMenu.onItemClick(((Integer) view.getTag()).intValue());
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f$0;
                chatActivityEnterView.getClass();
                chatActivityEnterView.sentFromPreview = System.currentTimeMillis();
                boolean zSendMessage = chatActivityEnterView.sendMessage();
                if (this.f$1 || (anonymousClass25 = chatActivityEnterView.messageSendPreview) == null) {
                    chatActivityEnterView.dismissSendPreviewSent = !zSendMessage;
                    ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = chatActivityEnterView.dismissSendPreview;
                    AndroidUtilities.cancelRunOnUIThread(chatActivityEnterView$$ExternalSyntheticLambda4);
                    AndroidUtilities.runOnUIThread(chatActivityEnterView$$ExternalSyntheticLambda4, 500L);
                } else {
                    anonymousClass25.sent = !zSendMessage;
                    anonymousClass25.dismiss();
                    chatActivityEnterView.messageSendPreview = null;
                }
                break;
            case 3:
                final ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.f$0;
                if (chatAttachAlert.avatarPicker == 0) {
                    final HashMap map = new HashMap();
                    final ArrayList arrayList = new ArrayList();
                    BaseFragment baseFragment = chatAttachAlert.baseFragment;
                    PhotoPickerSearchActivity photoPickerSearchActivity = new PhotoPickerSearchActivity(map, arrayList, 0, true, (ChatActivity) baseFragment);
                    PhotoPickerActivity.PhotoPickerActivityDelegate photoPickerActivityDelegate = new PhotoPickerActivity.PhotoPickerActivityDelegate() {
                        public boolean sendPressed;
                        public final ArrayList val$order;
                        public final HashMap val$photos;

                        public AnonymousClass10() {
                            map = map;
                            arrayList = arrayList;
                        }

                        @Override
                        public final void actionButtonPressed(int i2, boolean z2, boolean z3) {
                            if (z2) {
                                return;
                            }
                            HashMap map2 = map;
                            if (map2.isEmpty() || this.sendPressed) {
                                return;
                            }
                            this.sendPressed = true;
                            ArrayList arrayList2 = new ArrayList();
                            int i3 = 0;
                            while (true) {
                                ArrayList arrayList3 = arrayList;
                                if (i3 >= arrayList3.size()) {
                                    ((ChatActivity) ChatAttachAlert.this.baseFragment).didSelectSearchPhotos(i2, arrayList2, z3);
                                    return;
                                }
                                Object obj = map2.get(arrayList3.get(i3));
                                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                                arrayList2.add(sendingMediaInfo);
                                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                                String str = searchImage.imagePath;
                                if (str != null) {
                                    sendingMediaInfo.path = str;
                                } else {
                                    sendingMediaInfo.searchImage = searchImage;
                                }
                                sendingMediaInfo.thumbPath = searchImage.thumbPath;
                                sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                                CharSequence charSequence = searchImage.caption;
                                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                                sendingMediaInfo.entities = searchImage.entities;
                                sendingMediaInfo.masks = searchImage.stickers;
                                sendingMediaInfo.ttl = searchImage.ttl;
                                TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                                if (botInlineResult != null && searchImage.type == 1) {
                                    sendingMediaInfo.inlineResult = botInlineResult;
                                    sendingMediaInfo.params = searchImage.params;
                                }
                                searchImage.date = (int) (System.currentTimeMillis() / 1000);
                                i3++;
                            }
                        }

                        @Override
                        public final boolean canFinishFragment() {
                            return true;
                        }

                        @Override
                        public final void onCaptionChanged(Editable editable) {
                        }

                        @Override
                        public final void onOpenInPressed() {
                        }

                        @Override
                        public final void selectedPhotosChanged() {
                        }
                    };
                    PhotoPickerActivity photoPickerActivity = photoPickerSearchActivity.imagesSearch;
                    photoPickerActivity.delegate = photoPickerActivityDelegate;
                    PhotoPickerActivity photoPickerActivity2 = photoPickerSearchActivity.gifsSearch;
                    photoPickerActivity2.delegate = photoPickerActivityDelegate;
                    photoPickerActivity.searchDelegate = new PhotoViewer.AnonymousClass49(photoPickerSearchActivity, 9);
                    photoPickerActivity2.searchDelegate = new PollItemMenu.AnonymousClass6(photoPickerSearchActivity, 4);
                    int i2 = chatAttachAlert.maxSelectedPhotos;
                    boolean z2 = chatAttachAlert.allowOrder;
                    photoPickerActivity.setMaxSelectedPhotos(i2, z2);
                    photoPickerActivity2.setMaxSelectedPhotos(i2, z2);
                    if (this.f$1) {
                        baseFragment.showAsSheet(photoPickerSearchActivity);
                    } else {
                        baseFragment.presentFragment(photoPickerSearchActivity);
                    }
                    chatAttachAlert.lambda$showGiftOfferSheet$15();
                } else {
                    chatAttachAlert.delegate.openAvatarsSearch();
                    chatAttachAlert.lambda$showGiftOfferSheet$15();
                }
                break;
            case 4:
                PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) this.f$0;
                boolean z3 = this.f$1;
                pipVideoOverlay.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z4 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z3 && (!z4 || !LaunchActivity.isResumed)) {
                    LaunchActivity.onResumeStaticCallback = new Shaker$$ExternalSyntheticLambda0(1, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    break;
                } else {
                    EmbedBottomSheet embedBottomSheet = pipVideoOverlay.parentSheet;
                    if (embedBottomSheet != null) {
                        embedBottomSheet.exitFromPip();
                        break;
                    } else {
                        PhotoViewer photoViewer = pipVideoOverlay.photoViewer;
                        if (photoViewer != null && photoViewer.isInline) {
                            if (PhotoViewer.Instance != null) {
                                PhotoViewer.Instance.closePhoto(false, true);
                            }
                            PhotoViewer.AnonymousClass79 anonymousClass79 = photoViewer.photoViewerWebView;
                            if (anonymousClass79 != null && anonymousClass79.webView != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        anonymousClass79.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th) {
                                        FileLog.e(th);
                                    }
                                }
                                anonymousClass79.progressBarBlackBackground.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) anonymousClass79.webView.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(anonymousClass79.webView);
                                }
                                anonymousClass79.addView(anonymousClass79.webView, 0, LayoutHelper.createFrame(-1, -1, 51));
                                PipVideoOverlay.dismiss();
                            }
                            PhotoViewer.Instance = PhotoViewer.PipInstance;
                            PhotoViewer.PipInstance = null;
                            if (photoViewer.photoViewerWebView == null) {
                                photoViewer.switchingInlineMode = true;
                                Bitmap bitmap = photoViewer.currentBitmap;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    photoViewer.currentBitmap = null;
                                }
                                photoViewer.changingTextureView = true;
                            }
                            photoViewer.isInline = false;
                            View view2 = photoViewer.usedSurfaceView ? photoViewer.videoSurfaceView : photoViewer.videoTextureView;
                            if (photoViewer.photoViewerWebView == null && view2 != null) {
                                AndroidUtilities.removeFromParent(view2);
                                view2.setVisibility(4);
                                photoViewer.aspectRatioFrameLayout.addView(view2);
                            }
                            if (ApplicationLoader.mainInterfacePaused) {
                                try {
                                    photoViewer.parentActivity.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                } catch (Throwable th2) {
                                    FileLog.e(th2);
                                }
                            }
                            if (photoViewer.photoViewerWebView != null) {
                                photoViewer.clippingImageProgress = 0.0f;
                            } else if (view2 != null) {
                                photoViewer.pipAnimationInProgress = true;
                                RectOld pipRect = PipVideoOverlay.getPipRect(photoViewer.aspectRatioFrameLayout.getAspectRatio(), false);
                                float f = pipRect.width / photoViewer.textureImageView.getLayoutParams().width;
                                photoViewer.textureImageView.setScaleX(f);
                                photoViewer.textureImageView.setScaleY(f);
                                photoViewer.textureImageView.setTranslationX(pipRect.x);
                                photoViewer.textureImageView.setTranslationY(pipRect.y);
                                view2.setScaleX(f);
                                view2.setScaleY(f);
                                view2.setTranslationX(pipRect.x - photoViewer.aspectRatioFrameLayout.getX());
                                view2.setTranslationY(pipRect.y - photoViewer.aspectRatioFrameLayout.getY());
                                PhotoViewer.FirstFrameView firstFrameView = photoViewer.firstFrameView;
                                if (firstFrameView != null) {
                                    firstFrameView.setScaleX(f);
                                    photoViewer.firstFrameView.setScaleY(f);
                                    photoViewer.firstFrameView.setTranslationX(view2.getTranslationX());
                                    photoViewer.firstFrameView.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.inlineOutAnimationProgress = 0.0f;
                                PhotoViewer.AnonymousClass43 anonymousClass43 = new PhotoViewer.AnonymousClass43(photoViewer, f);
                                view2.setOutlineProvider(anonymousClass43);
                                view2.setClipToOutline(true);
                                photoViewer.textureImageView.setOutlineProvider(anonymousClass43);
                                photoViewer.textureImageView.setClipToOutline(true);
                                PhotoViewer.FirstFrameView firstFrameView2 = photoViewer.firstFrameView;
                                if (firstFrameView2 != null) {
                                    firstFrameView2.setOutlineProvider(anonymousClass43);
                                    photoViewer.firstFrameView.setClipToOutline(true);
                                }
                            } else {
                                PipVideoOverlay.instance.dismissInternal(true, false);
                            }
                            try {
                                photoViewer.isVisible = true;
                                photoViewer.isVisibleOrAnimating = true;
                                ((WindowManager) photoViewer.parentActivity.getSystemService("window")).addView(photoViewer.windowView, photoViewer.windowLayoutParams);
                                Activity activity = photoViewer.parentActivity;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).onUserLeaveHintListeners.add(photoViewer.onUserLeaveHintListener);
                                }
                                PhotoViewer.PlaceProviderObject placeProviderObject = photoViewer.currentPlaceObject;
                                if (placeProviderObject != null && !placeProviderObject.keepImageReceiverVisible) {
                                    placeProviderObject.imageReceiver.setVisible(false, false);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            if (!photoViewer.usedSurfaceView) {
                                photoViewer.waitingForDraw = 4;
                            } else {
                                ExoPlayerImpl exoPlayerImpl = photoViewer.videoPlayer.player;
                                if (exoPlayerImpl != null) {
                                    exoPlayerImpl.setVideoTextureView(null);
                                }
                                photoViewer.videoPlayer.setSurfaceView(photoViewer.videoSurfaceView);
                                photoViewer.videoSurfaceView.setVisibility(4);
                                photoViewer.waitingForFirstTextureUpload = 2;
                                photoViewer.changingTextureView = false;
                                photoViewer.containerView.invalidate();
                                photoViewer.waitingForDraw = 4;
                            }
                            break;
                        }
                    }
                }
                break;
            case 5:
                LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) this.f$0;
                LoginActivity loginActivity = LoginActivity.this;
                if (loginActivity.getParentActivity() != null) {
                    boolean z5 = !loginActivity.testBackend;
                    loginActivity.testBackend = z5;
                    ((CheckBoxCell) view).setChecked(z5, true);
                    if ((this.f$1 && loginActivity.getConnectionsManager().isTestBackend()) != loginActivity.testBackend) {
                        loginActivity.getConnectionsManager().switchBackend(false);
                    }
                    phoneView.loadCountries();
                    break;
                }
                break;
            case 6:
                boolean z6 = this.f$1;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = (StoriesViewPager.AnonymousClass2.AnonymousClass1) this.f$0;
                MessagesController.getInstance(anonymousClass1.currentAccount).setStoryQuality(!z6);
                new BulletinFactory(anonymousClass1.storyContainer, anonymousClass1.resourcesProvider).createSimpleBulletin(LocaleController.getString(!z6 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z6 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).show();
                PeerStoriesView.AnonymousClass8 anonymousClass8 = anonymousClass1.popupMenu;
                if (anonymousClass8 != null && (actionBarPopupWindow = anonymousClass8.popupWindow) != null) {
                    actionBarPopupWindow.dismiss(true);
                    break;
                }
                break;
            case 7:
                LivePlayer livePlayer = LivePlayer.recording;
                PeerStoriesView.AnonymousClass8 anonymousClass9 = (PeerStoriesView.AnonymousClass8) this.f$0;
                if (livePlayer != null) {
                    anonymousClass9.getClass();
                    boolean z7 = !this.f$1;
                    if (livePlayer.outgoing && livePlayer.isMuted != z7) {
                        livePlayer.isMuted = z7;
                        NativeInstance nativeInstance = livePlayer.instance;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z7);
                        }
                    }
                }
                PeerStoriesView.AnonymousClass8 anonymousClass10 = anonymousClass9.this$0.popupMenu;
                if (anonymousClass10 != null && (actionBarPopupWindow2 = anonymousClass10.popupWindow) != null) {
                    actionBarPopupWindow2.dismiss(true);
                    break;
                }
                break;
            default:
                int i3 = 0;
                while (true) {
                    PhotoViewer.AnonymousClass35 anonymousClass35 = (PhotoViewer.AnonymousClass35) this.f$0;
                    if (i3 >= 2) {
                        anonymousClass35.getClass();
                        SharedConfig.setUseThreeLinesLayout(this.f$1);
                    } else {
                        ChatListCell$ListView chatListCell$ListView = ((ChatListCell$ListView[]) anonymousClass35.this$0)[i3];
                        chatListCell$ListView.button.setChecked(chatListCell$ListView == view, true);
                        i3++;
                    }
                    break;
                }
                break;
        }
    }
}
