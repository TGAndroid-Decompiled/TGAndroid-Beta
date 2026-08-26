package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CaptionPhotoViewer;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ShareTopView;
import org.telegram.ui.community.CommunityPendingRequestsActivity;

public final class DialogsActivity$$ExternalSyntheticLambda12 implements View.OnClickListener {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda12(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        DialogsActivity.AnonymousClass25 anonymousClass25;
        DialogsActivity.AnonymousClass25 anonymousClass26;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$19$2();
                break;
            case 1:
                final DialogsActivity dialogsActivity = this.f$0;
                if (dialogsActivity.hasSharedMediaEntries() && (arrayList = dialogsActivity.sharedMediaEntries) != null && !arrayList.isEmpty() && dialogsActivity.getParentActivity() != null) {
                    int i = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) dialogsActivity.sharedMediaEntries.get(0);
                    DialogsActivity.AnonymousClass22 anonymousClass22 = dialogsActivity.commentView;
                    CharSequence fieldText = anonymousClass22 != null ? anonymousClass22.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = dialogsActivity.sharedMediaEntries;
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.getInstance().setParentActivity(null, dialogsActivity, dialogsActivity.getResourceProvider());
                    PhotoViewer.getInstance().hasCaptionForAllMedia = true;
                    PhotoViewer.getInstance().captionForAllMedia = fieldText;
                    ArrayList arrayList3 = new ArrayList(dialogsActivity.sharedMediaEntries);
                    final boolean[] zArr = new boolean[dialogsActivity.sharedMediaEntries.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.getInstance().openPhotoForSelect(arrayList3, 0, 0, false, new PhotoViewer.EmptyPhotoViewerProvider() {
                        public final boolean[] val$checked;

                        public AnonymousClass40() {
                            zArr = zArr;
                        }

                        @Override
                        public final boolean canSchedule() {
                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                            if (dialogsActivity2.selectedDialogs.isEmpty()) {
                                return false;
                            }
                            ArrayList arrayList4 = dialogsActivity2.selectedDialogs;
                            int size2 = arrayList4.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj2 = arrayList4.get(i2);
                                i2++;
                                long jLongValue = ((Long) obj2).longValue();
                                if (DialogObject.isEncryptedDialog(jLongValue) || dialogsActivity2.getMessagesController().getSendPaidMessagesStars(jLongValue) > 0) {
                                    return false;
                                }
                            }
                            return true;
                        }

                        @Override
                        public final boolean canSetTimer() {
                            TLRPC.User user;
                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                            if (dialogsActivity2.selectedDialogs.isEmpty()) {
                                return false;
                            }
                            MessagesController messagesController = dialogsActivity2.getMessagesController();
                            ArrayList arrayList4 = dialogsActivity2.selectedDialogs;
                            int size2 = arrayList4.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj2 = arrayList4.get(i2);
                                i2++;
                                Long l = (Long) obj2;
                                if (!DialogObject.isUserDialog(l.longValue()) || (user = messagesController.getUser(l)) == null || user.bot || UserObject.isUserSelf(user)) {
                                    return false;
                                }
                            }
                            return true;
                        }

                        @Override
                        public final long getDialogId() {
                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                            if (dialogsActivity2.selectedDialogs.isEmpty()) {
                                return 0L;
                            }
                            return ((Long) dialogsActivity2.selectedDialogs.get(0)).longValue();
                        }

                        @Override
                        public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i2, boolean z, boolean z2) {
                            BackupImageView[] backupImageViewArr;
                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                            ShareTopView shareTopView = dialogsActivity2.shareTopView;
                            BackupImageView backupImageView = (shareTopView == null || shareTopView.currentMode != 1 || (backupImageViewArr = shareTopView.layouts[0].images) == null || i2 < 0 || i2 >= backupImageViewArr.length || backupImageViewArr[i2].getVisibility() != 0) ? null : backupImageViewArr[i2];
                            if (backupImageView == null) {
                                return null;
                            }
                            int[] iArr = new int[2];
                            backupImageView.getLocationInWindow(iArr);
                            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                            placeProviderObject.viewX = iArr[0];
                            placeProviderObject.viewY = iArr[1];
                            placeProviderObject.parentView = dialogsActivity2.shareTopView;
                            ImageReceiver imageReceiver = backupImageView.getImageReceiver();
                            placeProviderObject.imageReceiver = imageReceiver;
                            placeProviderObject.thumb = imageReceiver.getBitmapSafe();
                            placeProviderObject.scale = backupImageView.getScaleX();
                            placeProviderObject.radius = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
                            return placeProviderObject;
                        }

                        @Override
                        public final CharSequence getSubtitleFor(int i2) {
                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                            if (i2 < 0 || i2 >= dialogsActivity2.sharedMediaEntries.size() || !((MediaController.PhotoEntry) dialogsActivity2.sharedMediaEntries.get(i2)).isVideo) {
                                return DialogsActivity.access$29000(dialogsActivity2);
                            }
                            return null;
                        }

                        @Override
                        public final ImageReceiver.BitmapHolder getThumbForPhoto(int i2) {
                            BackupImageView[] backupImageViewArr;
                            ShareTopView shareTopView = DialogsActivity.this.shareTopView;
                            BackupImageView backupImageView = (shareTopView == null || shareTopView.currentMode != 1 || (backupImageViewArr = shareTopView.layouts[0].images) == null || i2 < 0 || i2 >= backupImageViewArr.length || backupImageViewArr[i2].getVisibility() != 0) ? null : backupImageViewArr[i2];
                            if (backupImageView != null) {
                                return backupImageView.getImageReceiver().getBitmapSafe();
                            }
                            return null;
                        }

                        @Override
                        public final CharSequence getTitleFor(int i2) {
                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                            ArrayList arrayList4 = dialogsActivity2.sharedMediaEntries;
                            if (arrayList4 == null || arrayList4.isEmpty()) {
                                return null;
                            }
                            int size2 = dialogsActivity2.sharedMediaEntries.size();
                            if (size2 == 1) {
                                return LocaleController.getString(((MediaController.PhotoEntry) dialogsActivity2.sharedMediaEntries.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
                            }
                            ArrayList arrayList5 = dialogsActivity2.sharedMediaEntries;
                            int size3 = arrayList5.size();
                            int i3 = 0;
                            int i4 = 0;
                            int i5 = 0;
                            while (i3 < size3) {
                                Object obj2 = arrayList5.get(i3);
                                i3++;
                                if (((MediaController.PhotoEntry) obj2).isVideo) {
                                    i4++;
                                } else {
                                    i5++;
                                }
                            }
                            if (i4 == 0) {
                                return LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]);
                            }
                            return i5 == 0 ? LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]) : LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]);
                        }

                        @Override
                        public final boolean isPhotoChecked(int i2) {
                            return zArr[i2];
                        }

                        @Override
                        public final void onApplyCaption(CharSequence charSequence) {
                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                            AnonymousClass22 anonymousClass23 = dialogsActivity2.commentView;
                            if (anonymousClass23 != null) {
                                anonymousClass23.setFieldText(charSequence);
                            }
                            ArrayList arrayList4 = dialogsActivity2.sharedMediaEntries;
                            if (arrayList4 != null) {
                                int size2 = arrayList4.size();
                                int i2 = 0;
                                while (i2 < size2) {
                                    Object obj2 = arrayList4.get(i2);
                                    i2++;
                                    ((MediaController.PhotoEntry) obj2).caption = charSequence;
                                }
                            }
                        }

                        @Override
                        public final void onClose() {
                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                            ShareTopView shareTopView = dialogsActivity2.shareTopView;
                            if (shareTopView != null) {
                                shareTopView.setSharedMedia(((BaseFragment) dialogsActivity2).currentAccount, dialogsActivity2.sharedMediaEntries);
                            }
                        }

                        @Override
                        public final void onPreClose() {
                            AnonymousClass22 anonymousClass23;
                            CaptionPhotoViewer captionView;
                            PhotoViewer photoViewer = PhotoViewer.getInstance();
                            CharSequence text = (photoViewer.isVisible() && (captionView = photoViewer.getCaptionView()) != null) ? captionView.getText() : null;
                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                            if (text != null && (anonymousClass23 = dialogsActivity2.commentView) != null) {
                                anonymousClass23.setFieldText(text);
                            }
                            ArrayList arrayList4 = dialogsActivity2.sharedMediaEntries;
                            if (arrayList4 != null) {
                                int size2 = arrayList4.size();
                                int i2 = 0;
                                while (i2 < size2) {
                                    Object obj2 = arrayList4.get(i2);
                                    i2++;
                                    ((MediaController.PhotoEntry) obj2).caption = text;
                                }
                            }
                        }

                        @Override
                        public final void sendButtonPressed(int i2, VideoEditedInfo videoEditedInfo, boolean z, int i3, int i4, boolean z2) throws Throwable {
                            ArrayList arrayList4;
                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                            if (dialogsActivity2.commentView != null && (arrayList4 = dialogsActivity2.sharedMediaEntries) != null && !arrayList4.isEmpty()) {
                                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) dialogsActivity2.sharedMediaEntries.get(0);
                                AnonymousClass22 anonymousClass23 = dialogsActivity2.commentView;
                                CharSequence charSequence = photoEntry2.caption;
                                if (charSequence == null) {
                                    charSequence = "";
                                }
                                anonymousClass23.setFieldText(charSequence);
                            }
                            ShareTopView shareTopView = dialogsActivity2.shareTopView;
                            if (shareTopView != null) {
                                shareTopView.setSharedMedia(((BaseFragment) dialogsActivity2).currentAccount, dialogsActivity2.sharedMediaEntries);
                            }
                            if ((!z || i3 != 0) && dialogsActivity2.delegate != null) {
                                ArrayList arrayList5 = dialogsActivity2.selectedDialogs;
                                if (!arrayList5.isEmpty()) {
                                    dialogsActivity2.notify = z;
                                    dialogsActivity2.scheduleDate = i3;
                                    ArrayList arrayList6 = new ArrayList();
                                    for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                                        arrayList6.add(MessagesStorage.TopicKey.of(((Long) arrayList5.get(i5)).longValue(), 0L));
                                    }
                                    PhotoViewer.getInstance().closePhoto(true, false);
                                    dialogsActivity2.delegate.didSelectDialogs(dialogsActivity2, arrayList6, dialogsActivity2.commentView.getFieldText(), false, z, i3, i4, null);
                                    return;
                                }
                            }
                            PhotoViewer.getInstance().closePhoto(true, false);
                        }

                        @Override
                        public final int setPhotoChecked(int i2, VideoEditedInfo videoEditedInfo) {
                            return i2;
                        }
                    }, null);
                    PhotoViewer photoViewer = PhotoViewer.getInstance();
                    photoViewer.disableSelection = true;
                    CheckBox checkBox = photoViewer.checkImageView;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = photoViewer.photosCounterView;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                    }
                    break;
                }
                break;
            case 2:
                DialogsActivity dialogsActivity2 = this.f$0;
                if (!dialogsActivity2.dialogStoriesCellVisible || (anonymousClass25 = dialogsActivity2.dialogStoriesCell) == null || anonymousClass25.isExpanded()) {
                    dialogsActivity2.showSelectStatusDialog$1();
                } else {
                    dialogsActivity2.scrollToTop(true, true);
                }
                break;
            case 3:
                DialogsActivity dialogsActivity3 = this.f$0;
                if (!dialogsActivity3.dialogStoriesCellVisible || (anonymousClass26 = dialogsActivity3.dialogStoriesCell) == null || anonymousClass26.isExpanded()) {
                    dialogsActivity3.showSelectStatusDialog$1();
                } else {
                    dialogsActivity3.scrollToTop(true, true);
                }
                break;
            case 4:
                this.f$0.lambda$createView$20$2();
                break;
            case 5:
                DialogsActivity dialogsActivity4 = this.f$0;
                dialogsActivity4.showSearch(true, false, true, false);
                dialogsActivity4.fragmentSearchFieldWatcher.toggleSearch(true);
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda27(dialogsActivity4, 12), 100L);
                break;
            case 6:
                this.f$0.hideActionMode$1(true);
                break;
            case 7:
                DialogsActivity dialogsActivity5 = this.f$0;
                dialogsActivity5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", dialogsActivity5.communityId);
                dialogsActivity5.presentFragment(new CommunityPendingRequestsActivity(bundle));
                break;
            case 8:
                DialogsActivity dialogsActivity6 = this.f$0;
                if (dialogsActivity6.delegate != null) {
                    ArrayList arrayList4 = dialogsActivity6.selectedDialogs;
                    if (!arrayList4.isEmpty()) {
                        ArrayList arrayList5 = new ArrayList();
                        for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                            arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i2)).longValue(), 0L));
                        }
                        dialogsActivity6.delegate.didSelectDialogs(dialogsActivity6, arrayList5, dialogsActivity6.commentView.getFieldText(), false, dialogsActivity6.notify, dialogsActivity6.scheduleDate, dialogsActivity6.scheduleRepeatPeriod, null);
                        break;
                    }
                }
                break;
            case 9:
                this.f$0.lambda$createView$27(view);
                break;
            case 10:
                DialogsActivity dialogsActivity7 = this.f$0;
                dialogsActivity7.filterTabsView.setIsEditing(false);
                dialogsActivity7.showDoneItem(false);
                break;
            case 11:
                DialogsActivity dialogsActivity8 = this.f$0;
                dialogsActivity8.getClass();
                dialogsActivity8.showDialog(new PremiumFeatureBottomSheet(dialogsActivity8, dialogsActivity8.getParentActivity(), dialogsActivity8.getCurrentAccount(), false, 2, true, null));
                break;
            case 12:
                DialogsActivity dialogsActivity9 = this.f$0;
                dialogsActivity9.getContactsController().loadGlobalPrivacySetting();
                dialogsActivity9.showItemOptions$1();
                break;
            case 13:
                this.f$0.openAccountSelector(view);
                break;
            case 14:
                this.f$0.lambda$updateDialogsHint$34();
                break;
            case 15:
                this.f$0.lambda$updateDialogsHint$43();
                break;
            case 16:
                this.f$0.lambda$updateDialogsHint$45();
                break;
            case 17:
                DialogsActivity dialogsActivity10 = this.f$0;
                dialogsActivity10.showDialog(AlertsCreator.createBirthdayPickerDialog(dialogsActivity10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new DialogsActivity$$ExternalSyntheticLambda17(dialogsActivity10, 1), new DialogsActivity$$ExternalSyntheticLambda14(dialogsActivity10, 21), false, false, dialogsActivity10.getResourceProvider()).bottomSheet);
                break;
            case 18:
                this.f$0.lambda$updateDialogsHint$52();
                break;
            case 19:
                this.f$0.lambda$updateDialogsHint$54();
                break;
            case 20:
                DialogsActivity dialogsActivity11 = this.f$0;
                dialogsActivity11.getClass();
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.selectAnnualByDefault = true;
                dialogsActivity11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda14(dialogsActivity11, 23), 250L);
                break;
            case 21:
                this.f$0.lambda$updateDialogsHint$35();
                break;
            case 22:
                DialogsActivity dialogsActivity12 = this.f$0;
                dialogsActivity12.getClass();
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.selectAnnualByDefault = true;
                dialogsActivity12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda14(dialogsActivity12, 19), 250L);
                break;
            case 23:
                DialogsActivity dialogsActivity13 = this.f$0;
                dialogsActivity13.getClass();
                dialogsActivity13.presentFragment(new CacheControlActivity());
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda14(dialogsActivity13, 5), 250L);
                break;
            case 24:
                this.f$0.lambda$updateDialogsHint$61();
                break;
            case 25:
                this.f$0.lambda$updateDialogsHint$62();
                break;
            case 26:
                this.f$0.lambda$updateDialogsHint$36();
                break;
            case 27:
                DialogsActivity dialogsActivity14 = this.f$0;
                Browser.openUrl(dialogsActivity14.getParentActivity(), dialogsActivity14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            default:
                this.f$0.lambda$updateDialogsHint$38();
                break;
        }
    }
}
