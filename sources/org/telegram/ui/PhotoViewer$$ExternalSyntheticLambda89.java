package org.telegram.ui;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.TextViewWithLoading;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.PostsSearchContainer;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;

public final class PhotoViewer$$ExternalSyntheticLambda89 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;

    public PhotoViewer$$ExternalSyntheticLambda89(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        BetaUpdate betaUpdate;
        int i = 2;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        int i2 = 1;
        boolean z = this.f$1;
        Object obj = this.f$2;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                if (!z) {
                    photoViewer.getClass();
                    ((View) obj).setVisibility(8);
                }
                photoViewer.updateActionBarTitlePadding();
                return;
            case 1:
                Context context = (Context) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        SharedPreferences.Editor editorEdit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult(null);
                }
            case 2:
                ((CameraController) obj2).lambda$initCamera$4(z, (Runnable) obj);
                return;
            case 3:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z);
                return;
            case 4:
                AlertDialog alertDialog = (AlertDialog) obj2;
                alertDialog.getClass();
                View view = (View) obj;
                if (view instanceof TextViewWithLoading) {
                    TextViewWithLoading textViewWithLoading = (TextViewWithLoading) view;
                    if (textViewWithLoading.loading) {
                        textViewWithLoading.loading = false;
                        textViewWithLoading.invalidate();
                    }
                }
                if (z) {
                    alertDialog.dismiss();
                    return;
                }
                return;
            case 5:
                Theme.PatternsLoader patternsLoader = (Theme.PatternsLoader) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                if (arrayList2 != null) {
                    patternsLoader.getClass();
                    ArrayList arrayList3 = Theme.currentTheme.themeAccents;
                    if (arrayList3 != null && !arrayList3.isEmpty() && arrayList2.contains(Theme.currentTheme.getAccent(false))) {
                        Theme.reloadWallpaper(true);
                    }
                }
                int i3 = patternsLoader.account;
                if (!z) {
                    HashMap map = patternsLoader.watingForLoad;
                    if (map == null || map.isEmpty()) {
                        NotificationCenter.getInstance(i3).removeObserver(patternsLoader, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i3).removeObserver(patternsLoader, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (patternsLoader.watingForLoad != null) {
                    NotificationCenter.getInstance(i3).addObserver(patternsLoader, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i3).addObserver(patternsLoader, NotificationCenter.fileLoadFailed);
                    Iterator it = patternsLoader.watingForLoad.entrySet().iterator();
                    while (it.hasNext()) {
                        FileLoader.getInstance(i3).loadFile(ImageLocation.getForDocument(((Theme.PatternsLoader.LoadingPattern) ((Map.Entry) it.next()).getValue()).pattern.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 6:
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                BusinessLinksController businessLinksController = (BusinessLinksController) obj2;
                businessLinksController.getClass();
                ArrayList arrayList4 = new ArrayList();
                ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList6 = new ArrayList<>();
                try {
                    try {
                        sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursorQueryFinalized.next()) {
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                            arrayList4.add(TL_account.TL_businessChatLink.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false));
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        ArrayList<Long> arrayList7 = new ArrayList<>();
                        ArrayList arrayList8 = new ArrayList();
                        for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList4.get(i4);
                            if (!tL_businessChatLink.entities.isEmpty()) {
                                for (int i5 = 0; i5 < tL_businessChatLink.entities.size(); i5++) {
                                    TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i5);
                                    if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                        arrayList7.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                                    } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        arrayList7.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                                    }
                                }
                            }
                        }
                        if (!arrayList7.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList7, arrayList5);
                        }
                        if (!arrayList8.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList8), arrayList6);
                        }
                    } catch (Throwable th) {
                        if (sQLiteCursorQueryFinalized != null) {
                            sQLiteCursorQueryFinalized.dispose();
                        }
                        throw th;
                    }
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    if (sQLiteCursorQueryFinalized != null) {
                    }
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda488(businessLinksController, arrayList4, arrayList5, arrayList6, this.f$1, 10));
                    return;
                }
                sQLiteCursorQueryFinalized.dispose();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda488(businessLinksController, arrayList4, arrayList5, arrayList6, this.f$1, 10));
                return;
            case 7:
                ((ChatActivity) obj2).updateMessageAnimatedInternal((MessageObject) obj, z);
                return;
            case 8:
                Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) obj2;
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) obj;
                if (themeAccent == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, null, -1);
                    return;
                }
                Theme.ThemeAccent accent = themeInfo.getAccent(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, null, Integer.valueOf(themeAccent.id));
                if (z) {
                    Theme.deleteThemeAccent(themeInfo, accent, true);
                    return;
                }
                return;
            case 9:
                ChatActivity chatActivity = ChatActivity.this;
                chatActivity.progressDialogCurrent.end();
                TLObject tLObject = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_messages_stickerSet)) {
                    BulletinFactory.of(chatActivity).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString(z ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).show(true);
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                MediaDataController.getInstance(((BaseFragment) chatActivity).currentAccount).putStickerSet(tL_messages_stickerSet, false);
                if (chatActivity.getParentActivity() == null || chatActivity.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z) {
                    StickersAlert stickersAlert = new StickersAlert(chatActivity.getParentActivity(), chatActivity, tL_inputStickerSetID, null, chatActivity.chatActivityEnterView, chatActivity.themeDelegate);
                    stickersAlert.setCalcMandatoryInsets(chatActivity.isKeyboardVisible());
                    chatActivity.showDialog(stickersAlert);
                    return;
                } else {
                    ArrayList arrayList9 = new ArrayList(1);
                    arrayList9.add(tL_inputStickerSetID);
                    EmojiPacksAlert emojiPacksAlert = new EmojiPacksAlert(chatActivity, chatActivity.getParentActivity(), chatActivity.themeDelegate, arrayList9);
                    emojiPacksAlert.setCalcMandatoryInsets(chatActivity.isKeyboardVisible());
                    chatActivity.showDialog(emojiPacksAlert);
                    return;
                }
            case 10:
                ChatEditTypeActivity.UsernamesListView.AnonymousClass1 anonymousClass1 = (ChatEditTypeActivity.UsernamesListView.AnonymousClass1) obj2;
                ChatEditTypeActivity.UsernamesListView usernamesListView = ChatEditTypeActivity.UsernamesListView.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(usernamesListView.getContext(), 0, usernamesListView.resourcesProvider);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                AlertDialog alertDialog2 = builder.alertDialog;
                alertDialog2.title = string;
                alertDialog2.message = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new LoginActivity$$ExternalSyntheticLambda31(anonymousClass1, (TLRPC.TL_username) obj, z, 7));
                builder.show();
                return;
            case 11:
                ChatLinkActivity.ListAdapter.AnonymousClass1 anonymousClass2 = (ChatLinkActivity.ListAdapter.AnonymousClass1) obj2;
                ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
                chatLinkActivity.joinToSendProgress = false;
                if (z) {
                    return;
                }
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (chat.join_request) {
                    chat.join_request = false;
                    chatLinkActivity.joinRequestProgress = true;
                    chatLinkActivity.getMessagesController().toggleChatJoinRequest(chat.id, false, new ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda3(anonymousClass2, i2), new ChatLinkActivity$$ExternalSyntheticLambda9(11, anonymousClass2, chat));
                    return;
                }
                return;
            case 12:
                ((AnimatedPhoneNumberEditText) obj2).lambda$setHintText$0((String) obj, z);
                return;
            case 13:
                ((ChatAttachAlert) obj2).setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                editTextBoldCursor.requestFocus();
                if (z) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda422(i, editTextBoldCursor));
                    return;
                }
                return;
            case 14:
                ((FolderBottomSheet) obj2).deselectAll((FolderBottomSheet.HeaderCell) obj, !z);
                return;
            case 15:
                MediaActivity mediaActivity = (MediaActivity) obj2;
                mediaActivity.getMessagesController().getStoriesController().updateStoriesPinned(mediaActivity.dialogId, (ArrayList) obj, this.f$1, null);
                return;
            case 16:
                PasscodeView passcodeView = (PasscodeView) obj2;
                passcodeView.getClass();
                MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) obj;
                if (z) {
                    motionBackgroundDrawable.switchToNextPosition(true);
                } else {
                    motionBackgroundDrawable.switchToPrevPosition();
                }
                passcodeView.animateBackground(motionBackgroundDrawable);
                return;
            case 17:
                ArticleViewer.AnonymousClass16 anonymousClass16 = (ArticleViewer.AnonymousClass16) obj2;
                anonymousClass16.getClass();
                MotionBackgroundDrawable motionBackgroundDrawable2 = (MotionBackgroundDrawable) obj;
                if (z) {
                    motionBackgroundDrawable2.switchToNextPosition(true);
                } else {
                    motionBackgroundDrawable2.switchToPrevPosition();
                }
                ((PasscodeView) anonymousClass16.this$0).animateBackground(motionBackgroundDrawable2);
                return;
            case 18:
                PostsSearchContainer postsSearchContainer = (PostsSearchContainer) obj2;
                if (z) {
                    arrayList = postsSearchContainer.newsMessages;
                } else {
                    postsSearchContainer.getClass();
                    arrayList = (ArrayList) obj;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                UniversalRecyclerView universalRecyclerView = postsSearchContainer.listView;
                if (universalRecyclerView.canScrollVertically(1)) {
                    for (int i6 = 0; i6 < universalRecyclerView.getChildCount(); i6++) {
                        if (!(universalRecyclerView.getChildAt(i6) instanceof FlickerLoadingView)) {
                        }
                    }
                    return;
                }
                postsSearchContainer.load(false);
                return;
            case 19:
                GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) obj;
                GroupCallMiniTextureView groupCallMiniTextureView2 = (GroupCallMiniTextureView) obj2;
                if (z) {
                    groupCallMiniTextureView2.parentContainer.removeView(groupCallMiniTextureView);
                } else {
                    groupCallMiniTextureView2.getClass();
                }
                groupCallMiniTextureView.setVisibility(8);
                groupCallMiniTextureView2.hideRunnable = null;
                return;
            case 20:
                DialogsActivity.AnonymousClass11 anonymousClass11 = (DialogsActivity.AnonymousClass11) obj2;
                anonymousClass11.getClass();
                DialogsActivity.this.presentFragment(z ? new FiltersSetupActivity() : new FilterCreateActivity((MessagesController.DialogFilter) obj, null));
                return;
            case 21:
                DialogsActivity.AnonymousClass11 anonymousClass12 = (DialogsActivity.AnonymousClass11) obj2;
                anonymousClass12.getClass();
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    ArrayList arrayList10 = (ArrayList) obj;
                    int size = arrayList10.size();
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    if (i7 >= size) {
                        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(dialogsActivity.getParentActivity(), null);
                        lottieLayout.textView.setText(z ? LocaleController.formatPluralString("NotificationsMutedHintChats", i8, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i8, new Object[0]));
                        if (z) {
                            lottieLayout.setAnimation(R.raw.ic_mute, 32, 32, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                        } else {
                            lottieLayout.setAnimation(R.raw.ic_unmute, 32, 32, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                        }
                        Bulletin.make(dialogsActivity, lottieLayout, 1500).show();
                        return;
                    }
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList10.get(i7);
                    if (dialog != null) {
                        dialogsActivity.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z ? 3 : 4);
                        i8++;
                    }
                    i7++;
                }
                break;
            case 22:
                ((FilterChatlistActivity) obj2).deselectAll$1((FolderBottomSheet.HeaderCell) obj, !z);
                return;
            case 23:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.getClass();
                ((AlertDialog) obj).dismiss();
                if (z) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new LanguageSelectActivity$$ExternalSyntheticLambda0(languageSelectActivity, 1), 10L);
                return;
            case 24:
                ((ActionBarLayout) ((LaunchActivity) obj2).getActionBarLayout()).presentFragment$1((BaseFragment) obj, z, false);
                return;
            case 25:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                launchActivity.getClass();
                BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                if (update == null || ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    return;
                }
                if (z || (betaUpdate = (BetaUpdate) obj) == null || update.higherThan(betaUpdate)) {
                    ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(launchActivity, update, launchActivity.currentAccount);
                    return;
                }
                return;
            case 26:
                ((PassportActivity) obj2).lambda$onPasswordDone$13((String) obj, z);
                return;
            case 27:
                PassportActivity passportActivity = PassportActivity.this;
                if (z) {
                    UserConfig.getInstance(((BaseFragment) passportActivity).currentAccount).resetSavedPassword();
                    passportActivity.usingSavedPassword = 0;
                    passportActivity.updatePasswordInterface();
                    ViewGroup[] viewGroupArr = passportActivity.inputFieldContainers;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    passportActivity.inputFields[0].requestFocus();
                    AndroidUtilities.showKeyboard(passportActivity.inputFields[0]);
                    return;
                }
                passportActivity.showEditDoneProgress$2(true, false);
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        passportActivity.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    } else {
                        int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        passportActivity.showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                        return;
                    }
                }
                if (passportActivity.getParentActivity() == null) {
                    return;
                }
                Vibrator vibrator = (Vibrator) passportActivity.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                passportActivity.inputFields[0].setText("");
                AndroidUtilities.shakeView(passportActivity.inputFields[0]);
                return;
            case 28:
                ((PhotoPickerActivity) obj2).lambda$searchBotUser$10((TLObject) obj, z);
                return;
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) obj2;
                String str = (String) obj;
                if (str.equals(photoViewer2.centerImage.getImageKey())) {
                    photoViewer2.currentImageHasFace = z ? 1 : 0;
                    photoViewer2.currentImageFaceKey = str;
                    return;
                }
                return;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda89(Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = obj2;
    }
}
