package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.OverlayActionBarLayoutDialog;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda25;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda31;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda12;
import org.telegram.ui.web.MHTML;

public final class VoIPFragment$$ExternalSyntheticLambda42 implements MediaDataController.KeywordResultCallback, AlertsCreator.ScheduleDatePickerDelegate, AlertDialog.OnButtonClickListener, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, RecyclerListView.OnItemClickListenerExtended, MessagesController.NewMessageCallback, DialogsActivity.DialogsActivityDelegate, TwoStepVerificationActivity.TwoStepVerificationActivityDelegate, MessagesStorage.StringCallback, StoryViewer.HolderDrawAbove, VoIpSwitchLayout.VoIpButtonView.OnBtnClickedListener, OnSuccessListener, PaymentFormActivity.PaymentFormCallback, ChatAttachAlertLocationLayout.LocationActivityDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public VoIPFragment$$ExternalSyntheticLambda42(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public boolean canSelectStories() {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public void didEnterPassword(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SelectChatUserSheet) this.f$0).initTransfer((TLRPC.User) this.f$1, (TwoStepVerificationActivity) this.f$2, tL_inputCheckPasswordSRP);
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        int i3;
        InstantCameraView.VideoRecorder videoRecorder = (InstantCameraView.VideoRecorder) this.f$0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, videoRecorder.videoFile.getAbsolutePath(), 0, true, 0, 0, 0L);
        InstantCameraView.SendOptions sendOptions = (InstantCameraView.SendOptions) this.f$1;
        if (sendOptions != null) {
            photoEntry.ttl = sendOptions.ttl;
            photoEntry.effectId = sendOptions.effectId;
        }
        InstantCameraView instantCameraView = InstantCameraView.this;
        InstantCameraView.Delegate delegate = instantCameraView.delegate;
        boolean z2 = z || sendOptions == null || sendOptions.notify;
        if (i != 0) {
            i3 = i;
        } else if (sendOptions != null) {
            i = sendOptions.scheduleDate;
            i3 = i;
        } else {
            i3 = 0;
        }
        delegate.sendMedia(photoEntry, (VideoEditedInfo) this.f$2, z2, i3, i2 != 0 ? i2 : 0, false, sendOptions != null ? sendOptions.stars : 0L);
        instantCameraView.startAnimation(false, false);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        long j;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        Object obj = this.f$0;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        switch (this.$r8$classId) {
            case 15:
                int size = arrayList.size();
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj3;
                PhotoViewer photoViewer = PhotoViewer.this;
                if (size > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == UserConfig.getInstance(photoViewer.currentAccount).getClientUserId() || charSequence != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        long j2 = ((MessagesStorage.TopicKey) arrayList.get(i3)).dialogId;
                        if (charSequence != null) {
                            j = j2;
                            SendMessagesHelper.getInstance(photoViewer.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j = j2;
                        }
                        SendMessagesHelper.getInstance(photoViewer.currentAccount).sendMessage(arrayList2, j, false, false, true, 0, 0L);
                    }
                    dialogsActivity.finishFragment();
                    ChatActivity chatActivity = (ChatActivity) obj2;
                    if (chatActivity != null) {
                        chatActivity.createUndoView();
                        UndoView undoView = chatActivity.undoView;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.showWithAction(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, 53, Integer.valueOf(arrayList2.size()), (Object) null, (Runnable) null, (Runnable) null);
                            } else {
                                undoView.showWithAction(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), (Runnable) null, (Runnable) null);
                            }
                        }
                    }
                } else {
                    MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(0);
                    long j3 = topicKey.dialogId;
                    Bundle bundleM = zzkw.m("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j3)) {
                        bundleM.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
                    } else if (DialogObject.isUserDialog(j3)) {
                        bundleM.putLong("user_id", j3);
                    } else {
                        bundleM.putLong("chat_id", -j3);
                    }
                    ChatActivity chatActivity2 = new ChatActivity(bundleM);
                    if (topicKey.topicId != 0) {
                        ForumUtilities.applyTopic(chatActivity2, topicKey);
                    }
                    if (((ActionBarLayout) ((LaunchActivity) photoViewer.parentActivity).getActionBarLayout()).presentFragment$1(chatActivity2, true, false)) {
                        chatActivity2.showFieldPanelForForward(arrayList2);
                    } else {
                        dialogsActivity.finishFragment();
                    }
                }
                return true;
            case 16:
                ProfileActivity.AnonymousClass6 anonymousClass6 = (ProfileActivity.AnonymousClass6) obj;
                long j4 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = ProfileActivity.this;
                TLRPC.Chat chat = MessagesController.getInstance(((BaseFragment) profileActivity).currentAccount).getChat(Long.valueOf(-j4));
                TLRPC.User user = (TLRPC.User) obj3;
                if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(profileActivity.getParentActivity(), 0, profileActivity.resourcesProvider);
                    int i4 = R.string.AddBot;
                    String string = LocaleController.getString(i4);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    builder.setPositiveButton(LocaleController.getString(i4), new ChatActivity$$ExternalSyntheticLambda299(anonymousClass6, j4, dialogsActivity, user));
                    profileActivity.showDialog(alertDialog);
                } else {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new ProfileActivity$$ExternalSyntheticLambda22(anonymousClass6, j4, (DialogsActivity) obj2, 8));
                }
                return true;
            default:
                return ((StarGiftSheet) obj).lambda$openSetAsTheme$17((TL_stars.TL_starGiftUnique) obj3, (DialogsActivity) obj2, arrayList);
        }
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        switch (this.$r8$classId) {
            case 28:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = (ChatAttachAlertRichLayout) this.f$0;
                chatAttachAlertRichLayout.getClass();
                if (messageMedia != null && messageMedia.geo != null) {
                    RichEditorListView richEditorListView = chatAttachAlertRichLayout.listView;
                    RichEditorHistory richEditorHistory = richEditorListView.history;
                    if (richEditorHistory != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                        richEditorHistory.commit();
                    }
                    BlockRow blockRow = (BlockRow) this.f$1;
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) blockRow.block;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.w = 600;
                        pageblockmap.h = 400;
                    }
                    RichEditorHistory richEditorHistory2 = richEditorListView.history;
                    if (richEditorHistory2 != null) {
                        richEditorHistory2.record();
                    }
                    chatAttachAlertRichLayout.updateAttachButtons(true);
                    ((ChatAttachAlert) this.f$2).dismiss(true);
                    richEditorListView.post(new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(chatAttachAlertRichLayout, blockRow, 0));
                    break;
                }
                break;
            default:
                RichEditor richEditor = (RichEditor) this.f$0;
                if (messageMedia != null && messageMedia.geo != null) {
                    RichEditorHistory richEditorHistory3 = richEditor.listView.history;
                    if (richEditorHistory3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory3.commitRunnable);
                        richEditorHistory3.commit();
                    }
                    BlockRow blockRow2 = (BlockRow) this.f$1;
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) blockRow2.block;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.w = 600;
                        pageblockmap2.h = 400;
                    }
                    RichEditorHistory richEditorHistory4 = richEditor.listView.history;
                    if (richEditorHistory4 != null) {
                        richEditorHistory4.record();
                    }
                    ((ChatAttachAlert) this.f$2).dismiss(true);
                    richEditor.listView.post(new RichEditor$$ExternalSyntheticLambda31(richEditor, blockRow2, 9));
                    break;
                }
                break;
        }
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap bitmap;
        ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.f$0;
        themeSmallPreviewView.getClass();
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z || bitmapSafe == null || (bitmap = bitmapSafe.bitmap) == null) {
            return;
        }
        Drawable drawable = ((ChatThemeBottomSheet.ChatThemeItem) this.f$1).previewDrawable;
        if (drawable instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = ((TLRPC.WallPaper) this.f$2).settings;
            motionBackgroundDrawable.setPatternBitmap(ThemeSmallPreviewView.prescaleBitmap(bitmap), (wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100);
            motionBackgroundDrawable.setPatternColorFilter(themeSmallPreviewView.patternColor);
            themeSmallPreviewView.invalidate();
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public void draw(Canvas canvas, RectF rectF, float f) {
        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) this.f$0;
        sharedPhotoVideoCell2.drawDuration(canvas, rectF, f);
        sharedPhotoVideoCell2.drawViews(canvas, rectF, f);
        if (sharedPhotoVideoCell2.isSearchingHashtag) {
            sharedPhotoVideoCell2.drawAuthor(canvas, rectF, f);
        } else {
            sharedPhotoVideoCell2.drawPrivacy(canvas, rectF, f);
        }
        RecyclerListView.FastScroll fastScroll = (RecyclerListView.FastScroll) this.f$1;
        if (fastScroll != null && fastScroll.isVisible && fastScroll.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f * 255.0f), 31);
            int[] iArr = (int[]) this.f$2;
            canvas.translate(iArr[0], iArr[1]);
            fastScroll.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        String string;
        String str;
        String strSubstring = null;
        int i2 = 2;
        int i3 = 1;
        switch (this.$r8$classId) {
            case 4:
                ((LimitReachedBottomSheet) this.f$0).lambda$leaveFromSelectedGroups$21((ArrayList) this.f$1, (TLRPC.User) this.f$2);
                break;
            case 5:
                SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) this.f$0;
                sharedMediaLayout.getClass();
                ArrayList arrayList = (ArrayList) this.f$2;
                ((StoriesController.BotPreviewsList) this.f$1).delete(arrayList);
                BulletinFactory.of(sharedMediaLayout.profileActivity).createSimpleBulletinWithIconSize(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).show();
                sharedMediaLayout.closeActionMode(false);
                break;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.f$0;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f$2;
                if (editTextBoldCursor != null) {
                    contactsActivity.getClass();
                    string = editTextBoldCursor.getText().toString();
                } else {
                    string = "0";
                }
                contactsActivity.didSelectResult((TLRPC.User) this.f$1, false, string);
                break;
            case 9:
                String str2 = (String) this.f$1;
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f$0;
                dataSettingsActivity.getClass();
                SharedConfig.storageCacheDir = str2;
                SharedConfig.saveConfig();
                SharedConfig.readOnlyStorageDirAlertShowed = false;
                dataSettingsActivity.rebind$1(dataSettingsActivity.storageNumRow);
                ImageLoader.getInstance().checkMediaPaths(new DataSettingsActivity$$ExternalSyntheticLambda1(dataSettingsActivity, i2));
                ((AlertDialog.Builder) this.f$2).alertDialog.dismissRunnable.run();
                break;
            case 10:
                FilterChatlistActivity.ListAdapter.AnonymousClass1 anonymousClass1 = (FilterChatlistActivity.ListAdapter.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f$1;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((AlertDialog.Builder) this.f$2).alertDialog.dismissRunnable.run();
                FilterChatlistActivity filterChatlistActivity = FilterChatlistActivity.this;
                filterChatlistActivity.invite.title = editTextBoldCursor2.getText().toString();
                filterChatlistActivity.updateActionBarTitle(true);
                if (filterChatlistActivity.savingTitleReqId != 0) {
                    filterChatlistActivity.getConnectionsManager().cancelRequest(filterChatlistActivity.savingTitleReqId, true);
                    filterChatlistActivity.savingTitleReqId = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = filterChatlistActivity.filter.id;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = filterChatlistActivity.invite;
                if (tL_exportedChatlistInvite != null && (str = tL_exportedChatlistInvite.url) != null) {
                    strSubstring = str.substring(str.lastIndexOf(47) + 1);
                }
                tL_chatlists_editExportedInvite.slug = strSubstring;
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                filterChatlistActivity.savingTitleReqId = filterChatlistActivity.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new FilterChatlistActivity$$ExternalSyntheticLambda5(filterChatlistActivity, i3));
                Utilities.Callback callback = filterChatlistActivity.onEdit;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                }
                break;
            case 12:
                GroupCallActivity.AnonymousClass6 anonymousClass6 = (GroupCallActivity.AnonymousClass6) this.f$0;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) this.f$1;
                AndroidUtilities.hideKeyboard(editTextBoldCursor3);
                GroupCallActivity.this.call.setTitle(editTextBoldCursor3.getText().toString());
                ((AlertDialog.Builder) this.f$2).alertDialog.dismissRunnable.run();
                break;
            case 13:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f$0;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) this.f$1, (ArrayList) this.f$2, false));
                break;
            case 18:
                SessionBottomSheet.AnonymousClass8 anonymousClass8 = (SessionBottomSheet.AnonymousClass8) this.f$0;
                SessionsActivity.AnonymousClass5 anonymousClass5 = (SessionsActivity.AnonymousClass5) ((SessionBottomSheet.Callback) this.f$1);
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.f$2;
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).sendRequest(resetauthorization, new ProfileActivity$$ExternalSyntheticLambda65(15, anonymousClass5, tL_authorization));
                SessionBottomSheet.this.lambda$showGiftOfferSheet$15();
                break;
            case 23:
                ((StoryPrivacyBottomSheet) this.f$0).done((StoryPrivacyBottomSheet.StoryPrivacy) this.f$1, (Runnable) this.f$2, true);
                break;
            case 24:
                ThemeActivity.ListAdapter listAdapter = (ThemeActivity.ListAdapter) this.f$0;
                if (Theme.deleteThemeAccent(((ThemeActivity.ThemeAccentsListAdapter) this.f$1).currentTheme, (Theme.ThemeAccent) this.f$2, true)) {
                    Theme.refreshThemeColors(false, false);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, Theme.currentTheme, Boolean.valueOf(ThemeActivity.this.currentType == 1), null, -1);
                }
                break;
            default:
                Activity activity = (Activity) this.f$0;
                boolean[] zArr = (boolean[]) this.f$1;
                BotWebViewContainer$$ExternalSyntheticLambda12 botWebViewContainer$$ExternalSyntheticLambda12 = (BotWebViewContainer$$ExternalSyntheticLambda12) this.f$2;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                botWebViewContainer$$ExternalSyntheticLambda12.run(bool, bool);
                break;
        }
    }

    @Override
    public void onClicked(VoIpSwitchLayout.VoIpButtonView voIpButtonView) {
        VoIPFragment voIPFragment = (VoIPFragment) this.f$0;
        voIPFragment.getClass();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(voIPFragment.hideUIRunnable);
            voIPFragment.hideUiRunnableWaiting = false;
            boolean zIsTouchExplorationEnabled = voIPFragment.accessibilityManager.isTouchExplorationEnabled();
            VoIPService voIPService = (VoIPService) this.f$1;
            if (zIsTouchExplorationEnabled) {
                voIpButtonView.announceForAccessibility(voIPService.isFrontFaceCamera() ? LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack) : LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront));
            }
            ((VoIpSwitchLayout) this.f$2).setType(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onInvoiceStatusChanged(int i) {
        String str;
        BotWebViewSheet.AnonymousClass3 anonymousClass3 = (BotWebViewSheet.AnonymousClass3) this.f$0;
        if (i != 3) {
            anonymousClass3.getClass();
            ((OverlayActionBarLayoutDialog) this.f$1).dismiss();
        }
        BotWebViewSheet.AnonymousClass2 anonymousClass2 = BotWebViewSheet.this.webViewContainer;
        if (i == 1) {
            str = "PAID";
        } else if (i == 2) {
            str = "CANCELLED";
        } else if (i == 3) {
            str = "PENDING";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "FAILED";
        }
        anonymousClass2.onInvoiceStatusUpdate((String) this.f$2, str.toLowerCase(Locale.ROOT), false);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((GroupCallActivity) this.f$0).lambda$new$24((LaunchActivity) this.f$1, (ChatObject.Call) this.f$2, view, i);
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        PaymentFormActivity paymentFormActivity = (PaymentFormActivity) this.f$0;
        paymentFormActivity.getClass();
        if (MessageObject.getPeerId(message.peer_id) != paymentFormActivity.botUser.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(paymentFormActivity, (INavigationLayout) this.f$1, (Activity) this.f$2, message, 18));
        return true;
    }

    @Override
    public void onSuccess(Object obj) {
        MHTML mhtml = (MHTML) this.f$0;
        ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$1;
        int[] iArr = (int[]) this.f$2;
        FileLog.d("wear-auth: /answer delivered to " + ((String) mhtml.boundary));
        int i = 0;
        buttonWithCounterView.setLoading(false);
        int i2 = iArr[0];
        ArrayList arrayList = (ArrayList) mhtml.entries;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        Theme.ResourcesProvider resourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        BottomSheet bottomSheet = WearAuthSheet.currentSheet;
        if (bottomSheet != null) {
            bottomSheet.lambda$showGiftOfferSheet$15();
            WearAuthSheet.currentSheet = null;
        }
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourceProvider, false, false);
        FrameLayout frameLayout = new FrameLayout(context);
        bottomSheetM.customView = frameLayout;
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        frameLayout.addView(linearLayoutM, LayoutHelper.createFrame(-1, -1, 119));
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, Theme.key_dialogTextBlack, true, resourceProvider);
        textViewMakeTextView.setGravity(17);
        textViewMakeTextView.setText(LocaleController.getString(R.string.WearAuthEmojis));
        linearLayoutM.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i < arrayList.size()) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(emojiBigDrawable);
            NotificationCenter.listenEmojiLoading(imageView);
            imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.multAlpha(0.15f, Theme.getColor(Theme.key_featuredStickers_addButton, resourceProvider))));
            linearLayout.addView(imageView, LayoutHelper.createLinear(i == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i++;
        }
        linearLayoutM.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 49, 32, 12, 32, 12));
        ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourceProvider, true);
        buttonWithCounterViewM.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
        linearLayoutM.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 7, 12, 12, 12, 8));
        int i3 = Theme.key_windowBackgroundGray;
        bottomSheetM.setBackgroundColor(Theme.getColor(i3, resourceProvider));
        bottomSheetM.fixNavigationBar(Theme.getColor(i3, resourceProvider));
        WearAuthSheet.currentSheet = bottomSheetM;
        bottomSheetM.show();
        buttonWithCounterViewM.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(buttonWithCounterViewM, i2, bottomSheetM, 0));
    }

    @Override
    public void run(String str) {
        PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
        StoriesController storiesController = anonymousClass1.getStoriesController();
        long j = anonymousClass1.dialogId;
        storiesController.getStoryAlbumsList(j, true).createCollection(str, new ArticleViewer$$ExternalSyntheticLambda33(anonymousClass8, (TL_stories.StoryItem) this.f$1, (DarkThemeResourceProvider) this.f$2, 20));
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        switch (this.$r8$classId) {
            case 1:
                EmojiView.EmojiSearchAdapter emojiSearchAdapter = EmojiView.EmojiSearchAdapter.this;
                if (((String) this.f$1).equals(emojiSearchAdapter.lastSearchEmojiString)) {
                    emojiSearchAdapter.lastSearchAlias = str;
                    emojiSearchAdapter.resultPre.addAll(arrayList);
                    ((Runnable) this.f$2).run();
                    break;
                }
                break;
            case 2:
                EmojiView.StickersSearchGridAdapter.AnonymousClass1 anonymousClass1 = (EmojiView.StickersSearchGridAdapter.AnonymousClass1) this.f$0;
                if (EmojiView.StickersSearchGridAdapter.this.emojiSearchId == anonymousClass1.lastId) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str2 = ((MediaDataController.KeywordResult) arrayList.get(i)).emoji;
                        ArrayList arrayList5 = (ArrayList) ((HashMap) this.f$1).get(str2);
                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                            HashMap map = anonymousClass1.emojiStickers;
                            if (!map.containsKey(arrayList5)) {
                                map.put(arrayList5, str2);
                                anonymousClass1.emojiArrays.add(arrayList5);
                            }
                        }
                    }
                    ((Runnable) this.f$2).run();
                    break;
                }
                break;
            default:
                EmojiBottomSheet.Page.Adapter adapter = (EmojiBottomSheet.Page.Adapter) this.f$0;
                if (TextUtils.equals((String) this.f$1, adapter.query)) {
                    ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(adapter.query);
                    for (int i2 = 0; i2 < emojis.size(); i2++) {
                        try {
                            MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                            keywordResult.emoji = emojis.get(i2).code.toString();
                            arrayList.add(keywordResult);
                        } catch (Exception unused) {
                        }
                    }
                    adapter.itemsCount = 0;
                    ArrayList arrayList6 = adapter.documents;
                    arrayList6.clear();
                    ArrayList arrayList7 = adapter.documentIds;
                    arrayList7.clear();
                    SparseIntArray sparseIntArray = adapter.positionToSection;
                    sparseIntArray.clear();
                    ArrayList arrayList8 = adapter.stickerSets;
                    arrayList8.clear();
                    adapter.itemsCount++;
                    arrayList6.add(null);
                    arrayList7.add(0L);
                    EmojiBottomSheet.Page page = EmojiBottomSheet.Page.this;
                    if (page.currentType == 0) {
                        HashSet hashSet = adapter.searchDocumentIds;
                        hashSet.clear();
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList.get(i3);
                            String str3 = keywordResult2.emoji;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) adapter.allEmojis.get(keywordResult2.emoji)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList7.addAll(hashSet);
                        for (int i4 = 0; i4 < hashSet.size(); i4++) {
                            arrayList6.add(null);
                        }
                        adapter.itemsCount = hashSet.size() + adapter.itemsCount;
                    } else {
                        MediaDataController mediaDataController = (MediaDataController) this.f$2;
                        HashMap<String, ArrayList<TLRPC.Document>> allStickers = mediaDataController.getAllStickers();
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            MediaDataController.KeywordResult keywordResult3 = (MediaDataController.KeywordResult) arrayList.get(i5);
                            String str4 = keywordResult3.emoji;
                            if (str4 != null && !str4.startsWith("animated_") && (arrayList3 = allStickers.get(keywordResult3.emoji)) != null && !arrayList3.isEmpty()) {
                                for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                    TLRPC.Document document = arrayList3.get(i6);
                                    if (document != null && !arrayList6.contains(document)) {
                                        arrayList6.add(document);
                                        adapter.itemsCount++;
                                    }
                                }
                            }
                        }
                        ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                        int i7 = 0;
                        while (i7 < arrayList.size()) {
                            MediaDataController.KeywordResult keywordResult4 = (MediaDataController.KeywordResult) arrayList.get(i7);
                            String str5 = keywordResult4.emoji;
                            if (str5 != null && !str5.startsWith("animated_")) {
                                int i8 = 0;
                                while (i8 < featuredStickerSets.size()) {
                                    TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i8);
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    } else if (!stickerSetCovered.covers.isEmpty()) {
                                        arrayList2 = stickerSetCovered.covers;
                                    } else {
                                        if (stickerSetCovered.cover != null) {
                                            ArrayList<TLRPC.Document> arrayList9 = new ArrayList<>();
                                            arrayList9.add(stickerSetCovered.cover);
                                            arrayList2 = arrayList9;
                                        }
                                        i8++;
                                        featuredStickerSets = featuredStickerSets;
                                    }
                                    int i9 = 0;
                                    while (i9 < arrayList2.size()) {
                                        ArrayList<TLRPC.StickerSetCovered> arrayList10 = featuredStickerSets;
                                        String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i9), null);
                                        if (strFindAnimatedEmojiEmoticon != null && strFindAnimatedEmojiEmoticon.contains(keywordResult4.emoji)) {
                                            arrayList6.add(arrayList2.get(i9));
                                            adapter.itemsCount++;
                                        }
                                        i9++;
                                        featuredStickerSets = arrayList10;
                                    }
                                    i8++;
                                    featuredStickerSets = featuredStickerSets;
                                }
                            }
                            i7++;
                            featuredStickerSets = featuredStickerSets;
                        }
                    }
                    String strTranslitSafe = AndroidUtilities.translitSafe((adapter.query + "").toLowerCase());
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList11 = adapter.allStickerSets;
                        if (i10 < arrayList11.size()) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList11.get(i10);
                            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                                String strTranslitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                                if (strTranslitSafe2.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe2)) {
                                    int size2 = arrayList8.size();
                                    arrayList8.add(tL_messages_stickerSet);
                                    sparseIntArray.put(adapter.itemsCount, size2);
                                    arrayList6.add(null);
                                    adapter.itemsCount++;
                                    arrayList6.addAll(tL_messages_stickerSet.documents);
                                    adapter.itemsCount = tL_messages_stickerSet.documents.size() + adapter.itemsCount;
                                }
                            }
                            i10++;
                        } else {
                            boolean z = arrayList7.size() <= 1 && arrayList6.size() <= 1;
                            adapter.includeNotFound = z;
                            if (z) {
                                adapter.itemsCount++;
                            }
                            if (!z) {
                                adapter.searchId++;
                            }
                            adapter.activeQuery = adapter.query;
                            adapter.mObservable.notifyChanged();
                            EmojiBottomSheet.EmojiListView.access$4100(page.listView, 0, 0);
                            page.searchField.showProgress(false);
                            EmojiBottomSheet.Page.AnonymousClass3 anonymousClass3 = page.tabsStrip;
                            anonymousClass3.showSelected = false;
                            anonymousClass3.contentView.invalidate();
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public void run(boolean z) {
        BaseFragment baseFragment = (BaseFragment) this.f$1;
        VoIPHelper.startCall((TLRPC.Chat) this.f$0, null, true, null, baseFragment.getParentActivity(), baseFragment, (AccountInstance) this.f$2);
    }
}
