package org.telegram.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.MotionPhotoDrawable;
import org.telegram.ui.Stories.recorder.CollageLayout;
import org.telegram.ui.Stories.recorder.RecordControl;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class PhotoViewer$$ExternalSyntheticLambda142 implements Utilities.Callback3 {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;

    public PhotoViewer$$ExternalSyntheticLambda142(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        int i;
        char c;
        final boolean z;
        MessageObject messageObject;
        int i2;
        MessageObject messageObject2;
        StoryEntry storyEntry;
        StoryRecorder.AnonymousClass19 anonymousClass19;
        boolean z2;
        int iM;
        StoryRecorder.AnonymousClass11 anonymousClass11;
        StoryRecorder.AnonymousClass19 anonymousClass110;
        int i3;
        CollageLayout collageLayout;
        int iIndexOf;
        StoryRecorder.AnonymousClass25 anonymousClass25;
        float filledProgress;
        StoryRecorder.AnonymousClass25 anonymousClass26;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                final ClickableSpan clickableSpan = (ClickableSpan) obj;
                final TextView textView = (TextView) obj2;
                Runnable runnable = (Runnable) obj3;
                final PhotoViewer photoViewer = (PhotoViewer) notificationCenterDelegate;
                photoViewer.getClass();
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    BottomSheet bottomSheet = new BottomSheet(photoViewer.parentActivity, photoViewer.resourcesProvider, false, false);
                    bottomSheet.setBackgroundColor(-14933463);
                    bottomSheet.fixNavigationBar(-14933463);
                    if (url.startsWith("video?")) {
                        try {
                            i = Integer.parseInt(url.substring(url.indexOf(63) + 1));
                        } catch (Throwable unused) {
                            i = -1;
                        }
                    } else {
                        i = -1;
                    }
                    try {
                        if (!url.startsWith("mailto:")) {
                            if (url.startsWith("tel:")) {
                                url = url.substring(4);
                                z = true;
                            } else {
                                if (i < 0 || (messageObject = photoViewer.currentMessageObject) == null || messageObject.scheduled) {
                                    c = 1;
                                } else {
                                    if (!messageObject.isVideo() && !photoViewer.currentMessageObject.isRoundVideo() && !photoViewer.currentMessageObject.isVoice() && !photoViewer.currentMessageObject.isMusic() && (messageObject2 = photoViewer.currentMessageObject.replyMessageObject) != null) {
                                        messageObject = messageObject2;
                                    }
                                    long dialogId = messageObject.getDialogId();
                                    int id = messageObject.getId();
                                    TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
                                    if (messageFwdHeader == null) {
                                        i2 = id;
                                    } else {
                                        TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                                        if (peer != null) {
                                            dialogId = MessageObject.getPeerId(peer);
                                            i2 = messageObject.messageOwner.fwd_from.saved_from_msg_id;
                                        } else {
                                            TLRPC.Peer peer2 = messageFwdHeader.from_id;
                                            if (peer2 != null) {
                                                dialogId = MessageObject.getPeerId(peer2);
                                                i2 = messageObject.messageOwner.fwd_from.channel_post;
                                            } else {
                                                i2 = id;
                                            }
                                        }
                                    }
                                    c = 1;
                                    if (DialogObject.isChatDialog(dialogId)) {
                                        String publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(photoViewer.currentAccount).getChat(Long.valueOf(-dialogId)));
                                        if (publicUsername != null) {
                                            url = "https://t.me/" + publicUsername + "/" + i2 + "?t=" + AndroidUtilities.formatTimestamp(i);
                                        }
                                    } else {
                                        TLRPC.User user = MessagesController.getInstance(photoViewer.currentAccount).getUser(Long.valueOf(dialogId));
                                        String publicUsername2 = UserObject.getPublicUsername(user);
                                        if (user != null && publicUsername2 != null) {
                                            url = "https://t.me/" + publicUsername2 + "/" + i2 + "?t=" + AndroidUtilities.formatTimestamp(i);
                                        }
                                    }
                                }
                                z = false;
                            }
                            bottomSheet.title = url;
                            bottomSheet.bigTitle = false;
                            String string = LocaleController.getString(R.string.Open);
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            CharSequence[] charSequenceArr = new CharSequence[2];
                            charSequenceArr[0] = string;
                            charSequenceArr[c] = string2;
                            final String str = url;
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                                @Override
                                public final void onClick(DialogInterface dialogInterface, int i4) throws Throwable {
                                    String string3;
                                    PhotoViewer photoViewer2 = photoViewer;
                                    if (i4 == 0) {
                                        photoViewer2.onLinkClick(clickableSpan, textView);
                                        return;
                                    }
                                    photoViewer2.getClass();
                                    if (i4 == 1) {
                                        String str2 = str;
                                        AndroidUtilities.addToClipboard(str2);
                                        if (z) {
                                            string3 = LocaleController.getString("PhoneCopied", R.string.PhoneCopied);
                                        } else if (str2.startsWith("#")) {
                                            string3 = LocaleController.getString("HashtagCopied", R.string.HashtagCopied);
                                        } else {
                                            string3 = str2.startsWith("@") ? LocaleController.getString("UsernameCopied", R.string.UsernameCopied) : LocaleController.getString("LinkCopied", R.string.LinkCopied);
                                        }
                                        if (AndroidUtilities.shouldShowClipboardToast()) {
                                            new BulletinFactory(photoViewer2.containerView, photoViewer2.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.voip_invite, 36, string3).show();
                                        }
                                    }
                                }
                            };
                            bottomSheet.items = charSequenceArr;
                            bottomSheet.onClickListener = onClickListener;
                            bottomSheet.setOnHideListener(new PhotoViewer$$ExternalSyntheticLambda161(0, runnable));
                            bottomSheet.scrollNavBar = true;
                            bottomSheet.show();
                            photoViewer.containerView.performHapticFeedback(0, 2);
                            bottomSheet.setItemColor(0, -1, -1);
                            bottomSheet.setItemColor(1, -1, -1);
                            bottomSheet.setBackgroundColor(-14933463);
                            bottomSheet.setTitleColor(-7697782);
                            bottomSheet.setCalcMandatoryInsets(true);
                            AndroidUtilities.setNavigationBarColor((Dialog) bottomSheet, -14933463, false);
                            AndroidUtilities.setLightNavigationBar((Dialog) bottomSheet, false);
                            bottomSheet.scrollNavBar = true;
                        } else {
                            url = url.substring(7);
                            z = false;
                        }
                        photoViewer.containerView.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused2) {
                    }
                    c = 1;
                    bottomSheet.title = url;
                    bottomSheet.bigTitle = false;
                    String string3 = LocaleController.getString(R.string.Open);
                    String string4 = LocaleController.getString(R.string.CopyLink);
                    CharSequence[] charSequenceArr2 = new CharSequence[2];
                    charSequenceArr2[0] = string3;
                    charSequenceArr2[c] = string4;
                    final String str2 = url;
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i4) throws Throwable {
                            String string5;
                            PhotoViewer photoViewer2 = photoViewer;
                            if (i4 == 0) {
                                photoViewer2.onLinkClick(clickableSpan, textView);
                                return;
                            }
                            photoViewer2.getClass();
                            if (i4 == 1) {
                                String str3 = str2;
                                AndroidUtilities.addToClipboard(str3);
                                if (z) {
                                    string5 = LocaleController.getString("PhoneCopied", R.string.PhoneCopied);
                                } else if (str3.startsWith("#")) {
                                    string5 = LocaleController.getString("HashtagCopied", R.string.HashtagCopied);
                                } else {
                                    string5 = str3.startsWith("@") ? LocaleController.getString("UsernameCopied", R.string.UsernameCopied) : LocaleController.getString("LinkCopied", R.string.LinkCopied);
                                }
                                if (AndroidUtilities.shouldShowClipboardToast()) {
                                    new BulletinFactory(photoViewer2.containerView, photoViewer2.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.voip_invite, 36, string5).show();
                                }
                            }
                        }
                    };
                    bottomSheet.items = charSequenceArr2;
                    bottomSheet.onClickListener = onClickListener2;
                    bottomSheet.setOnHideListener(new PhotoViewer$$ExternalSyntheticLambda161(0, runnable));
                    bottomSheet.scrollNavBar = true;
                    bottomSheet.show();
                    bottomSheet.setItemColor(0, -1, -1);
                    bottomSheet.setItemColor(1, -1, -1);
                    bottomSheet.setBackgroundColor(-14933463);
                    bottomSheet.setTitleColor(-7697782);
                    bottomSheet.setCalcMandatoryInsets(true);
                    AndroidUtilities.setNavigationBarColor((Dialog) bottomSheet, -14933463, false);
                    AndroidUtilities.setLightNavigationBar((Dialog) bottomSheet, false);
                    bottomSheet.scrollNavBar = true;
                } else if (runnable != null) {
                    runnable.run();
                }
                break;
            case 1:
                Long l = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str3 = (String) obj3;
                LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) notificationCenterDelegate;
                phoneView.cancelRequestingPasskey = null;
                phoneView.requestingPasskey = false;
                if (str3 == null || !("EMPTY".equals(str3) || "CANCELLED".equals(str3))) {
                    long jLongValue = l.longValue();
                    LoginActivity loginActivity = LoginActivity.this;
                    if (jLongValue != 0 && (loginActivity.getParentActivity() instanceof LaunchActivity)) {
                        for (int i4 = 0; i4 < 4; i4++) {
                            UserConfig userConfig = UserConfig.getInstance(i4);
                            if (userConfig.isClientActivated() && userConfig.getClientUserId() == l.longValue() && ConnectionsManager.getInstance(i4).isTestBackend() == loginActivity.testBackend) {
                                if (UserConfig.selectedAccount != i4) {
                                    ((LaunchActivity) loginActivity.getParentActivity()).switchToAccount(i4);
                                }
                                loginActivity.finishFragment();
                                loginActivity.needHideProgress(false, true);
                            }
                        }
                    }
                    if (str3 != null && str3.contains("SESSION_PASSWORD_NEEDED")) {
                        ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$PhoneView$$ExternalSyntheticLambda26(phoneView, 1), 10);
                    } else if (str3 != null) {
                        if (BuildVars.DEBUG_VERSION) {
                            BulletinFactory.of(loginActivity).showForError(str3, false);
                        }
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        loginActivity.onAuthSuccess((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                    break;
                } else {
                    LinkSpanDrawable.LinksTextView linksTextView = phoneView.subtitleView;
                    if (linksTextView != null && "CANCELLED".equals(str3)) {
                        linksTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StartTextPasskey), new LoginActivity$PhoneView$$ExternalSyntheticLambda6(phoneView, 2)), true));
                        break;
                    }
                }
                break;
            case 2:
                ((SecretMediaViewer) notificationCenterDelegate).getClass();
                break;
            default:
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                StoryRecorder storyRecorder = (StoryRecorder) notificationCenterDelegate;
                if (storyRecorder.currentPage == 0 && arrayList != null && !arrayList.isEmpty() && storyRecorder.galleryListViewOpening == null && !storyRecorder.scrollingY && storyRecorder.isGalleryOpen()) {
                    storyRecorder.entries = null;
                    storyRecorder.selectedEntries = null;
                    storyRecorder.selectedEntriesOrder = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + storyRecorder.collageLayoutView.getFilledCount() > storyRecorder.collageLayoutView.getTotalCount()) {
                            int size = arrayList.size() + storyRecorder.collageLayoutView.getFilledCount();
                            ArrayList layouts = CollageLayout.getLayouts();
                            int size2 = layouts.size();
                            int i5 = 0;
                            do {
                                if (i5 < size2) {
                                    Object obj4 = layouts.get(i5);
                                    i5++;
                                    collageLayout = (CollageLayout) obj4;
                                } else {
                                    collageLayout = null;
                                }
                                if (collageLayout == null) {
                                    storyRecorder.collageLayoutView.setLayout(null);
                                    storyRecorder.collageLayoutView.clear$2();
                                    storyRecorder.collageListView.setSelected((CollageLayout) null);
                                    anonymousClass26 = storyRecorder.cameraView;
                                    if (anonymousClass26 != null) {
                                        anonymousClass26.recordHevc = !storyRecorder.collageLayoutView.hasLayout();
                                    }
                                    storyRecorder.collageListView.setVisible(false, true);
                                    storyRecorder.updateActionBarButtons(true);
                                } else {
                                    StoryRecorder.AnonymousClass6 anonymousClass6 = storyRecorder.collageLayoutView;
                                    storyRecorder.lastCollageLayout = collageLayout;
                                    anonymousClass6.setLayout(collageLayout);
                                    storyRecorder.collageListView.setSelected(collageLayout);
                                    iIndexOf = CollageLayout.getLayouts().indexOf(collageLayout);
                                    if (iIndexOf >= 0) {
                                        storyRecorder.collageListView.listView.scrollToPosition(iIndexOf);
                                    }
                                    anonymousClass25 = storyRecorder.cameraView;
                                    if (anonymousClass25 != null) {
                                        anonymousClass25.recordHevc = !storyRecorder.collageLayoutView.hasLayout();
                                    }
                                    storyRecorder.collageButton.setDrawable(new MotionPhotoDrawable(collageLayout, false));
                                    storyRecorder.setActionBarButtonVisible(storyRecorder.collageRemoveButton, storyRecorder.collageListView.visible, true);
                                    RecordControl recordControl = storyRecorder.recordControl;
                                    if (storyRecorder.collageLayoutView.hasLayout()) {
                                        filledProgress = storyRecorder.collageLayoutView.getFilledProgress();
                                    } else {
                                        filledProgress = 0.0f;
                                    }
                                    recordControl.setCollageProgress(filledProgress, true);
                                }
                                break;
                            } while (collageLayout.parts.size() < size);
                            if (collageLayout == null) {
                                storyRecorder.collageLayoutView.setLayout(null);
                                storyRecorder.collageLayoutView.clear$2();
                                storyRecorder.collageListView.setSelected((CollageLayout) null);
                                anonymousClass26 = storyRecorder.cameraView;
                                if (anonymousClass26 != null) {
                                    anonymousClass26.recordHevc = !storyRecorder.collageLayoutView.hasLayout();
                                }
                                storyRecorder.collageListView.setVisible(false, true);
                                storyRecorder.updateActionBarButtons(true);
                            } else {
                                StoryRecorder.AnonymousClass6 anonymousClass7 = storyRecorder.collageLayoutView;
                                storyRecorder.lastCollageLayout = collageLayout;
                                anonymousClass7.setLayout(collageLayout);
                                storyRecorder.collageListView.setSelected(collageLayout);
                                iIndexOf = CollageLayout.getLayouts().indexOf(collageLayout);
                                if (iIndexOf >= 0) {
                                    storyRecorder.collageListView.listView.scrollToPosition(iIndexOf);
                                }
                                anonymousClass25 = storyRecorder.cameraView;
                                if (anonymousClass25 != null) {
                                    anonymousClass25.recordHevc = !storyRecorder.collageLayoutView.hasLayout();
                                }
                                storyRecorder.collageButton.setDrawable(new MotionPhotoDrawable(collageLayout, false));
                                storyRecorder.setActionBarButtonVisible(storyRecorder.collageRemoveButton, storyRecorder.collageListView.visible, true);
                                RecordControl recordControl2 = storyRecorder.recordControl;
                                if (storyRecorder.collageLayoutView.hasLayout()) {
                                    filledProgress = storyRecorder.collageLayoutView.getFilledProgress();
                                } else {
                                    filledProgress = 0.0f;
                                }
                                recordControl2.setCollageProgress(filledProgress, true);
                            }
                        }
                    }
                    storyRecorder.fromGallery = true;
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        StoryEntry storyEntryFromPhotoEntry = StoryEntry.fromPhotoEntry((MediaController.PhotoEntry) arrayList.get(i6));
                        storyEntryFromPhotoEntry.blurredVideoThumb = (Bitmap) arrayList2.get(i6);
                        storyEntryFromPhotoEntry.botId = storyRecorder.botId;
                        storyEntryFromPhotoEntry.botLang = storyRecorder.botLang;
                        storyEntryFromPhotoEntry.setupMatrix();
                        if (!bool.booleanValue()) {
                            if (storyRecorder.outputEntry != null) {
                                if (storyRecorder.entries == null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    storyRecorder.entries = arrayList3;
                                    arrayList3.add(storyRecorder.outputEntry);
                                }
                                if (storyRecorder.entries.size() < 10) {
                                    storyRecorder.entries.add(storyEntryFromPhotoEntry);
                                } else if (storyRecorder.entries != null) {
                                    storyRecorder.showVideoTimer(false, true);
                                    storyRecorder.modeSwitcherView.switchMode(storyRecorder.mode);
                                    RecordControl recordControl3 = storyRecorder.recordControl;
                                    if (storyRecorder.mode == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    recordControl3.overrideStartModeIsVideoT = -1.0f;
                                    recordControl3.startModeIsVideo = z2;
                                    recordControl3.invalidate();
                                    storyRecorder.selectedEntries = new ArrayList();
                                    storyRecorder.selectedEntriesOrder = new ArrayList();
                                    for (iM = 0; iM < storyRecorder.entries.size(); iM = LocationController$$ExternalSyntheticOutline0.m(iM, iM, 1, storyRecorder.selectedEntriesOrder)) {
                                        storyRecorder.selectedEntries.add(Integer.valueOf(iM));
                                    }
                                    storyRecorder.collageLayoutView.clear$2();
                                    storyRecorder.collageListView.setVisible(false, true);
                                    storyRecorder.updateActionBarButtons(true);
                                    storyRecorder.animateGalleryListView(false);
                                    storyRecorder.navigateTo(1, true);
                                    anonymousClass11 = storyRecorder.storiesSelector;
                                    if (anonymousClass11 != null) {
                                        MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i3 + 1).apply();
                                        VoIPFragment$12$$ExternalSyntheticLambda0 voIPFragment$12$$ExternalSyntheticLambda0 = anonymousClass11.hideHint;
                                        AndroidUtilities.cancelRunOnUIThread(voIPFragment$12$$ExternalSyntheticLambda0);
                                        anonymousClass11.hintShown = true;
                                        anonymousClass11.invalidate();
                                        AndroidUtilities.runOnUIThread(voIPFragment$12$$ExternalSyntheticLambda0, 5500L);
                                    }
                                    anonymousClass110 = storyRecorder.galleryListView;
                                    if (anonymousClass110 != null) {
                                        storyRecorder.lastGalleryScrollPosition = anonymousClass110.layoutManager.onSaveInstanceState();
                                        storyRecorder.lastGallerySelectedAlbum = storyRecorder.galleryListView.getSelectedAlbum();
                                    }
                                } else {
                                    storyEntry = storyRecorder.outputEntry;
                                    if (storyEntry != null) {
                                        storyEntry.setupMultipleStoriesSelector();
                                    }
                                    storyRecorder.collageListView.setVisible(false, true);
                                    storyRecorder.updateActionBarButtons(true);
                                    storyRecorder.animateGalleryListView(false);
                                    anonymousClass19 = storyRecorder.galleryListView;
                                    if (anonymousClass19 != null) {
                                        storyRecorder.lastGalleryScrollPosition = anonymousClass19.layoutManager.onSaveInstanceState();
                                        storyRecorder.lastGallerySelectedAlbum = storyRecorder.galleryListView.getSelectedAlbum();
                                    }
                                }
                            } else {
                                storyRecorder.outputEntry = storyEntryFromPhotoEntry;
                            }
                            break;
                        } else if (storyRecorder.collageLayoutView.push(storyEntryFromPhotoEntry)) {
                            storyRecorder.outputEntry = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), storyRecorder.collageLayoutView.getContent());
                            if (storyRecorder.entries != null) {
                                storyRecorder.showVideoTimer(false, true);
                                storyRecorder.modeSwitcherView.switchMode(storyRecorder.mode);
                                RecordControl recordControl4 = storyRecorder.recordControl;
                                if (storyRecorder.mode == 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                recordControl4.overrideStartModeIsVideoT = -1.0f;
                                recordControl4.startModeIsVideo = z2;
                                recordControl4.invalidate();
                                storyRecorder.selectedEntries = new ArrayList();
                                storyRecorder.selectedEntriesOrder = new ArrayList();
                                while (iM < storyRecorder.entries.size()) {
                                    storyRecorder.selectedEntries.add(Integer.valueOf(iM));
                                }
                                storyRecorder.collageLayoutView.clear$2();
                                storyRecorder.collageListView.setVisible(false, true);
                                storyRecorder.updateActionBarButtons(true);
                                storyRecorder.animateGalleryListView(false);
                                storyRecorder.navigateTo(1, true);
                                anonymousClass11 = storyRecorder.storiesSelector;
                                if (anonymousClass11 != null && !anonymousClass11.hintShown && !anonymousClass11.listShown && (i3 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                    MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i3 + 1).apply();
                                    VoIPFragment$12$$ExternalSyntheticLambda0 voIPFragment$12$$ExternalSyntheticLambda1 = anonymousClass11.hideHint;
                                    AndroidUtilities.cancelRunOnUIThread(voIPFragment$12$$ExternalSyntheticLambda1);
                                    anonymousClass11.hintShown = true;
                                    anonymousClass11.invalidate();
                                    AndroidUtilities.runOnUIThread(voIPFragment$12$$ExternalSyntheticLambda1, 5500L);
                                }
                                anonymousClass110 = storyRecorder.galleryListView;
                                if (anonymousClass110 != null) {
                                    storyRecorder.lastGalleryScrollPosition = anonymousClass110.layoutManager.onSaveInstanceState();
                                    storyRecorder.lastGallerySelectedAlbum = storyRecorder.galleryListView.getSelectedAlbum();
                                }
                            } else {
                                storyEntry = storyRecorder.outputEntry;
                                if (storyEntry != null) {
                                    storyEntry.setupMultipleStoriesSelector();
                                }
                                storyRecorder.collageListView.setVisible(false, true);
                                storyRecorder.updateActionBarButtons(true);
                                storyRecorder.animateGalleryListView(false);
                                anonymousClass19 = storyRecorder.galleryListView;
                                if (anonymousClass19 != null) {
                                    storyRecorder.lastGalleryScrollPosition = anonymousClass19.layoutManager.onSaveInstanceState();
                                    storyRecorder.lastGallerySelectedAlbum = storyRecorder.galleryListView.getSelectedAlbum();
                                }
                            }
                        }
                        break;
                    }
                    if (storyRecorder.entries != null) {
                        storyRecorder.showVideoTimer(false, true);
                        storyRecorder.modeSwitcherView.switchMode(storyRecorder.mode);
                        RecordControl recordControl5 = storyRecorder.recordControl;
                        if (storyRecorder.mode == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        recordControl5.overrideStartModeIsVideoT = -1.0f;
                        recordControl5.startModeIsVideo = z2;
                        recordControl5.invalidate();
                        storyRecorder.selectedEntries = new ArrayList();
                        storyRecorder.selectedEntriesOrder = new ArrayList();
                        while (iM < storyRecorder.entries.size()) {
                            storyRecorder.selectedEntries.add(Integer.valueOf(iM));
                        }
                        storyRecorder.collageLayoutView.clear$2();
                        storyRecorder.collageListView.setVisible(false, true);
                        storyRecorder.updateActionBarButtons(true);
                        storyRecorder.animateGalleryListView(false);
                        storyRecorder.navigateTo(1, true);
                        anonymousClass11 = storyRecorder.storiesSelector;
                        if (anonymousClass11 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i3 + 1).apply();
                            VoIPFragment$12$$ExternalSyntheticLambda0 voIPFragment$12$$ExternalSyntheticLambda2 = anonymousClass11.hideHint;
                            AndroidUtilities.cancelRunOnUIThread(voIPFragment$12$$ExternalSyntheticLambda2);
                            anonymousClass11.hintShown = true;
                            anonymousClass11.invalidate();
                            AndroidUtilities.runOnUIThread(voIPFragment$12$$ExternalSyntheticLambda2, 5500L);
                        }
                        anonymousClass110 = storyRecorder.galleryListView;
                        if (anonymousClass110 != null) {
                            storyRecorder.lastGalleryScrollPosition = anonymousClass110.layoutManager.onSaveInstanceState();
                            storyRecorder.lastGallerySelectedAlbum = storyRecorder.galleryListView.getSelectedAlbum();
                        }
                    } else {
                        storyEntry = storyRecorder.outputEntry;
                        if (storyEntry != null) {
                            storyEntry.setupMultipleStoriesSelector();
                        }
                        storyRecorder.collageListView.setVisible(false, true);
                        storyRecorder.updateActionBarButtons(true);
                        storyRecorder.animateGalleryListView(false);
                        anonymousClass19 = storyRecorder.galleryListView;
                        if (anonymousClass19 != null) {
                            storyRecorder.lastGalleryScrollPosition = anonymousClass19.layoutManager.onSaveInstanceState();
                            storyRecorder.lastGallerySelectedAlbum = storyRecorder.galleryListView.getSelectedAlbum();
                        }
                    }
                }
                break;
        }
    }
}
