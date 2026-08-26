package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkj;
import java.util.ArrayList;
import java.util.List;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.PhotoUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class ContactAddActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate {
    private static final int TYPE_SET = 2;
    private static final int TYPE_SUGGEST = 1;
    private static final int done_button = 1;
    private boolean addContact;
    private TLRPC.FileLocation avatar;
    private AnimatorSet avatarAnimation;
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImage;
    private View avatarOverlay;
    private RadialProgressView avatarProgressView;
    private boolean checkShare;
    private ContactAddActivityDelegate delegate;
    private MessagesController.DialogPhotos dialogPhotos;
    private View doneButton;
    private EditTextCell firstNameField;
    private String firstNameFromCard;
    private boolean firstSet;
    private boolean focusNotes;
    private ImageUpdater imageUpdater;
    private FrameLayout infoLayout;
    private EditTextCell lastNameField;
    private String lastNameFromCard;
    private UniversalRecyclerView listView;
    private TextView nameTextView;
    private boolean needAddException;
    private EditTextCell noteField;
    private BackupImageView oldAvatarView;
    private TextCell oldPhotoCell;
    private TextView onlineTextView;
    boolean paused;
    private String phone;
    private int photoSelectedType;
    private int photoSelectedTypeFinal;
    private TLRPC.Photo prevAvatar;
    private Theme.ResourcesProvider resourcesProvider;
    private TextCell setAvatarCell;
    private TextCell suggestBirthday;
    private TextCell suggestPhoto;
    MessageObject suggestPhotoMessageFinal;
    private long user_id;

    public interface ContactAddActivityDelegate {
        void didAddToContacts();
    }

    public static class PhotoSuggestion {
        TLRPC.FileLocation bigLocation;
        TLRPC.FileLocation smallLocation;

        public PhotoSuggestion(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2) {
            this.smallLocation = fileLocation;
            this.bigLocation = fileLocation2;
        }
    }

    public ContactAddActivity(Bundle bundle) {
        super(bundle);
        this.checkShare = false;
        this.firstSet = true;
        this.imageUpdater = new ImageUpdater(true, 0, true);
    }

    private void createServiceMessageLocal(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.random_id = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
        tL_messageService.dialog_id = this.user_id;
        tL_messageService.unread = true;
        tL_messageService.out = true;
        int newMessageId = getUserConfig().getNewMessageId();
        tL_messageService.id = newMessageId;
        tL_messageService.local_id = newMessageId;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().getClientUserId();
        tL_messageService.flags |= 256;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_messageService.peer_id = tL_peerUser2;
        tL_peerUser2.user_id = this.user_id;
        tL_messageService.date = getConnectionsManager().getCurrentTime();
        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
        tL_messageService.action = tL_messageActionSuggestProfilePhoto;
        TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
        tL_messageActionSuggestProfilePhoto.photo = tL_photo;
        tL_photo.sizes.add(photoSize);
        tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
        tL_messageActionSuggestProfilePhoto.video = z;
        tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_messageService, false, false);
        this.suggestPhotoMessageFinal = messageObject;
        arrayList.add(messageObject);
        new ArrayList().add(tL_messageService);
        MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(this.user_id, arrayList, 0);
        getMessagesController().photoSuggestion.put(tL_messageService.local_id, this.imageUpdater);
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        int i = 0;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
        arrayList.add(UItem.asCustom(this.infoLayout));
        arrayList.add(UItem.asCustom(this.firstNameField));
        arrayList.add(UItem.asCustom(this.lastNameField));
        if (TextUtils.isEmpty(getPhone())) {
            arrayList.add(UItem.asShadow(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
        } else if (this.needAddException) {
            arrayList.add(UItem.asShadow(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
        } else {
            arrayList.add(UItem.asShadow(null));
        }
        if (this.addContact && this.needAddException) {
            arrayList.add(UItem.asCheck(2, LocaleController.getString(R.string.AddContactShareNumber)).setChecked(this.checkShare));
            arrayList.add(UItem.asShadow(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
        }
        arrayList.add(UItem.asCustom(this.noteField));
        zzkf.m(R.string.AddNotesInfo, arrayList);
        if (!this.addContact) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.user_id);
            if (userFull != null && userFull.birthday == null) {
                arrayList.add(UItem.asCustom(this.suggestBirthday));
            }
            arrayList.add(UItem.asCustom(this.suggestPhoto));
            arrayList.add(UItem.asCustom(this.setAvatarCell));
            if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                arrayList.add(UItem.asCustom(this.oldPhotoCell));
            }
            arrayList.add(UItem.asShadow(null));
            arrayList.add(UItem.asButton(1, LocaleController.getString(R.string.DeleteContact)).red());
        }
        arrayList.add(UItem.asShadow(null));
        if (this.firstSet) {
            AndroidUtilities.runOnUIThread(new ContactAddActivity$$ExternalSyntheticLambda2(this, user, i));
            this.firstSet = false;
            AndroidUtilities.runOnUIThread(new ContactAddActivity$$ExternalSyntheticLambda3(this, i), 200L);
        }
    }

    private String getPhone() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
        return (user == null || TextUtils.isEmpty(user.phone)) ? this.phone : user.phone;
    }

    public boolean lambda$createView$0(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        this.lastNameField.editText.requestFocus();
        EditTextCaption editTextCaption = this.lastNameField.editText;
        editTextCaption.setSelection(editTextCaption.length());
        return true;
    }

    public boolean lambda$createView$1(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.doneButton.performClick();
            return true;
        }
        if (i != 5) {
            return false;
        }
        this.noteField.editText.requestFocus();
        this.noteField.editText.setSelection(this.lastNameField.editText.length());
        return true;
    }

    public void lambda$createView$10(Context context, TLRPC.User user, View view) {
        AlertsCreator.createSimpleAlert(context, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new ContactAddActivity$$ExternalSyntheticLambda2(this, user, 1), this.resourcesProvider).show();
    }

    public void lambda$createView$11() {
        presentFragment(ChatActivity.of(this.user_id), true);
    }

    public void lambda$createView$12(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ContactAddActivity$$ExternalSyntheticLambda3(this, 1));
    }

    public void lambda$createView$13(TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = getMessagesController().getInputUser(this.user_id);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_suggestBirthday, new LinkManager$$ExternalSyntheticLambda10(this, 9));
    }

    public void lambda$createView$14(TLRPC.User user, View view) {
        showDialog(AlertsCreator.createBirthdayPickerDialog(getContext(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName(user)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new PollItemMenu$$ExternalSyntheticLambda15(this, 8), null, false, false, this.resourcesProvider).bottomSheet);
    }

    public boolean lambda$createView$2(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.doneButton.performClick();
        return true;
    }

    public static void lambda$createView$3() {
    }

    public void lambda$createView$4(RLottieDrawable rLottieDrawable, DialogInterface dialogInterface) {
        if (this.imageUpdater.isUploadingImage()) {
            rLottieDrawable.setCurrentFrame(0, false);
        } else {
            rLottieDrawable.setCustomEndFrame(85);
            this.suggestPhoto.imageView.playAnimation();
        }
    }

    public void lambda$createView$5(TLRPC.User user, RLottieDrawable rLottieDrawable, View view) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        this.photoSelectedType = 1;
        this.imageUpdater.setUser(user);
        this.imageUpdater.openMenu(((user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.photo_small) != null, new OAuthSheet$$ExternalSyntheticLambda5(13), new ContactAddActivity$$ExternalSyntheticLambda19(this, rLottieDrawable, 1), 2);
        rLottieDrawable.setCurrentFrame(0);
        rLottieDrawable.setCustomEndFrame(43);
        this.suggestPhoto.imageView.playAnimation();
    }

    public static void lambda$createView$6() {
    }

    public void lambda$createView$7(RLottieDrawable rLottieDrawable, DialogInterface dialogInterface) {
        if (this.imageUpdater.isUploadingImage()) {
            rLottieDrawable.setCurrentFrame(0, false);
        } else {
            rLottieDrawable.setCustomEndFrame(86);
            this.setAvatarCell.imageView.playAnimation();
        }
    }

    public void lambda$createView$8(TLRPC.User user, RLottieDrawable rLottieDrawable, View view) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        this.photoSelectedType = 2;
        this.imageUpdater.setUser(user);
        this.imageUpdater.openMenu(((user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.photo_small) != null, new OAuthSheet$$ExternalSyntheticLambda5(12), new ContactAddActivity$$ExternalSyntheticLambda19(this, rLottieDrawable, 0), 1);
        rLottieDrawable.setCurrentFrame(0);
        rLottieDrawable.setCustomEndFrame(43);
        this.setAvatarCell.imageView.playAnimation();
    }

    public void lambda$createView$9(TLRPC.User user) {
        this.avatar = null;
        sendPhotoChangedRequest(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.user_id));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.user_id);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = this.prevAvatar;
        if (photo != null) {
            user2.photo.photo_id = photo.id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
            if (closestPhotoSizeWithSize != null) {
                user2.photo.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                user2.photo.photo_big = closestPhotoSizeWithSize2.location;
            }
        } else {
            user2.photo = null;
            user2.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        updateCustomPhotoInfo();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public void lambda$didUploadFailed$20() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
        if (this.suggestPhotoMessageFinal != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(this.suggestPhotoMessageFinal.getId()));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    private boolean lambda$didUploadPhoto$18(BaseFragment baseFragment) {
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            if (chatActivity.getDialogId() == this.user_id && chatActivity.getChatMode() == 0) {
                chatActivity.scrollToLastMessage(true, false);
                return true;
            }
        }
        return false;
    }

    public void lambda$didUploadPhoto$19(TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z) {
        if (this.imageUpdater.isCanceled()) {
            return;
        }
        int i = this.photoSelectedTypeFinal;
        if (i == 2) {
            this.avatar = photoSize.location;
        } else if (i == 1 && getParentLayout() != null) {
            INavigationLayout parentLayout = getParentLayout();
            BaseFragment lastFragment = ((ActionBarLayout) getParentLayout()).getLastFragment();
            List<BaseFragment> fragmentStack = ((ActionBarLayout) lastFragment.getParentLayout()).getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int iM = Theme.ResourcesProvider.CC.m((ActionBarLayout) parentLayout, 1); iM >= 0; iM--) {
                if (lambda$didUploadPhoto$18(fragmentStack.get(iM))) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) != lastFragment) {
                            ((BaseFragment) arrayList.get(size)).removeSelfFromStack();
                        }
                    }
                    lastFragment.finishFragment();
                    break;
                }
                arrayList.add(fragmentStack.get(iM));
            }
        }
        if (inputFile == null && inputFile2 == null) {
            this.avatarImage.setImage(ImageLocation.getForLocal(this.avatar), "50_50", this.avatarDrawable, getMessagesController().getUser(Long.valueOf(this.user_id)));
            if (this.photoSelectedTypeFinal == 2) {
                showAvatarProgress(true, false);
            } else {
                createServiceMessageLocal(photoSize, photoSize2, z);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
            if (this.suggestPhotoMessageFinal == null && user != null) {
                boolean z2 = inputFile2 != null;
                user.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                user.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z2;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            sendPhotoChangedRequest(this.avatar, photoSize2.location, inputFile, inputFile2, videoSize, d, this.photoSelectedTypeFinal);
            showAvatarProgress(false, true);
        }
        updateCustomPhotoInfo();
    }

    public void lambda$fillItems$15(TLRPC.User user) {
        String str;
        if (user != null && this.firstNameFromCard == null && this.lastNameFromCard == null) {
            if (user.phone == null && (str = this.phone) != null) {
                user.phone = PhoneFormat.stripExceptNumbers(str, false);
            }
            this.firstNameField.setText(user.first_name);
            EditTextCaption editTextCaption = this.firstNameField.editText;
            editTextCaption.setSelection(editTextCaption.length());
            this.lastNameField.setText(user.last_name);
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(this.user_id);
        if (userFull != null) {
            TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
            if (tL_textWithEntities != null) {
                this.noteField.setText(tL_textWithEntities);
            } else {
                this.noteField.setText("");
            }
        }
        if (this.focusNotes) {
            this.noteField.editText.requestFocus();
            AndroidUtilities.showKeyboard(this.noteField.editText);
        }
    }

    public void lambda$fillItems$16() {
        if (this.focusNotes) {
            this.noteField.editText.requestFocus();
            AndroidUtilities.showKeyboard(this.noteField.editText);
        }
    }

    public void lambda$getThemeDescriptions$23() {
        TLRPC.User user;
        if (this.avatarImage == null || (user = getMessagesController().getUser(Long.valueOf(this.user_id))) == null) {
            return;
        }
        this.avatarDrawable.setInfo(this.currentAccount, user);
        this.avatarImage.invalidate();
    }

    public void lambda$onItemClick$17(TLRPC.User user, AlertDialog alertDialog, int i) {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        getContactsController().deleteContact(arrayList, true);
        if (user != null) {
            user.contact = false;
        }
        finishFragment();
    }

    public void lambda$sendPhotoChangedRequest$21(TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i) {
        if (this.suggestPhotoMessageFinal != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.user_id);
        if (userFull != null) {
            userFull.personal_photo = tL_photos_photo.photo;
            userFull.flags |= 2097152;
            getMessagesStorage().updateUserInfo(userFull, true);
        }
        if (user != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
            if (closestPhotoSizeWithSize != null && fileLocation != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb = new StringBuilder();
                sb.append(fileLocation.volume_id);
                sb.append("_");
                String strM = Fragment$$ExternalSyntheticOutline0.m(fileLocation.local_id, "@50_50", sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(closestPhotoSizeWithSize.location.volume_id);
                sb2.append("_");
                ImageLoader.getInstance().replaceImageInCache(strM, Fragment$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUser(this.currentAccount, user, 1), false);
            }
            if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            PhotoUtilities.applyPhotoToUser(tL_photos_photo.photo, user, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            getMessagesController().getDialogPhotos(this.user_id).addPhotoAtStart(tL_photos_photo.photo);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            if (getParentActivity() != null) {
                if (i == 2) {
                    BulletinFactory.of(this).createUsersBulletin(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name))).show();
                } else {
                    BulletinFactory.of(this).createUsersBulletin(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name))).show();
                }
            }
        }
        this.avatar = null;
        updateCustomPhotoInfo();
    }

    public void lambda$sendPhotoChangedRequest$22(TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLRPC.FileLocation fileLocation2, int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda16(this, fileLocation, inputFile, tLObject, fileLocation2, i, 10));
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 1) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
            if (user == null || getParentActivity() == null) {
                return;
            }
            new AlertDialog.Builder(getParentActivity(), 0, this.resourcesProvider).setTitle(LocaleController.getString(R.string.DeleteContact)).setMessage(LocaleController.getString(R.string.AreYouSureDeleteContact)).setPositiveButton(LocaleController.getString(R.string.Delete), new DialogsActivity$$ExternalSyntheticLambda6(4, this, user)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
            return;
        }
        if (i2 == 2) {
            boolean z = !this.checkShare;
            this.checkShare = z;
            ((TextCheckCell) view).setChecked(z);
        }
    }

    private void sendPhotoChangedRequest(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().getInputUser(this.user_id);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i2 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i2 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new CallLogActivity$$ExternalSyntheticLambda20(this, fileLocation, inputFile2, fileLocation2, i));
    }

    private void showAvatarProgress(final boolean z, boolean z2) {
        if (this.avatarProgressView == null) {
            return;
        }
        AnimatorSet animatorSet = this.avatarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.avatarAnimation = null;
        }
        if (!z2) {
            if (z) {
                this.avatarProgressView.setAlpha(1.0f);
                this.avatarProgressView.setVisibility(0);
                this.avatarOverlay.setAlpha(1.0f);
                this.avatarOverlay.setVisibility(0);
                return;
            }
            this.avatarProgressView.setAlpha(0.0f);
            this.avatarProgressView.setVisibility(4);
            this.avatarOverlay.setAlpha(0.0f);
            this.avatarOverlay.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.avatarAnimation = animatorSet2;
        if (z) {
            this.avatarProgressView.setVisibility(0);
            this.avatarOverlay.setVisibility(0);
            AnimatorSet animatorSet3 = this.avatarAnimation;
            RadialProgressView radialProgressView = this.avatarProgressView;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<View, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.avatarProgressView;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<View, Float>) property2, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                ContactAddActivity.this.avatarAnimation = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (ContactAddActivity.this.avatarAnimation == null || ContactAddActivity.this.avatarProgressView == null) {
                    return;
                }
                if (!z) {
                    ContactAddActivity.this.avatarProgressView.setVisibility(4);
                    ContactAddActivity.this.avatarOverlay.setVisibility(4);
                }
                ContactAddActivity.this.avatarAnimation = null;
            }
        });
        this.avatarAnimation.start();
    }

    private void updateAvatarLayout() {
        TLRPC.User user;
        if (this.nameTextView == null || (user = getMessagesController().getUser(Long.valueOf(this.user_id))) == null) {
            return;
        }
        if (TextUtils.isEmpty(getPhone())) {
            this.nameTextView.setText(LocaleController.getString(R.string.MobileHidden));
        } else {
            this.nameTextView.setText(PhoneFormat.getInstance().format("+" + getPhone()));
        }
        this.onlineTextView.setText(LocaleController.formatUserStatus(this.currentAccount, user));
        if (this.avatar == null) {
            BackupImageView backupImageView = this.avatarImage;
            AvatarDrawable avatarDrawable = new AvatarDrawable(user);
            this.avatarDrawable = avatarDrawable;
            backupImageView.setForUserOrChat(user, avatarDrawable);
        }
    }

    private void updateCustomPhotoInfo() {
        TLRPC.Photo photo;
        if (this.addContact) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.prevAvatar) != null) {
            this.oldAvatarView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.prevAvatar), "50_50", this.avatarDrawable, (Object) null);
        }
        if (this.avatarDrawable == null) {
            this.avatarDrawable = new AvatarDrawable(user);
        }
        TLRPC.FileLocation fileLocation = this.avatar;
        if (fileLocation == null) {
            this.avatarImage.setForUserOrChat(user, this.avatarDrawable);
        } else {
            this.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", this.avatarDrawable, getMessagesController().getUser(Long.valueOf(this.user_id)));
        }
    }

    @Override
    public boolean canFinishFragment() {
        return this.photoSelectedTypeFinal != 1;
    }

    @Override
    public View createView(Context context) {
        final int i = 0;
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_avatar_actionBarSelectorBlue, this.resourcesProvider), false);
        this.actionBar.setItemsColor(Theme.getColor(Theme.key_actionBarDefaultIcon, this.resourcesProvider), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i2 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.addContact) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
                    ContactAddActivity.this.finishFragment();
                    return;
                }
                if (i3 != 1 || ContactAddActivity.this.firstNameField.getText().length() == 0) {
                    return;
                }
                TLRPC.User user = ContactAddActivity.this.getMessagesController().getUser(Long.valueOf(ContactAddActivity.this.user_id));
                TLRPC.UserFull userFull = ContactAddActivity.this.getMessagesController().getUserFull(ContactAddActivity.this.user_id);
                user.first_name = ContactAddActivity.this.firstNameField.getText().toString();
                user.last_name = ContactAddActivity.this.lastNameField.getText().toString();
                user.contact = true;
                TLRPC.TL_textWithEntities textWithEntities = ContactAddActivity.this.noteField.getTextWithEntities();
                ContactAddActivity.this.getMessagesController().putUser(user, false);
                ContactAddActivity.this.getContactsController().addContact(user, textWithEntities, ContactAddActivity.this.needAddException && ContactAddActivity.this.checkShare);
                MessagesController.getNotificationsSettings(((BaseFragment) ContactAddActivity.this).currentAccount).edit().putInt("dialog_bar_vis3" + ContactAddActivity.this.user_id, 3).commit();
                ContactAddActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                ContactAddActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(ContactAddActivity.this.user_id));
                if (userFull != null) {
                    if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                        userFull.flags2 &= -4194305;
                        userFull.note = null;
                    } else {
                        userFull.flags2 |= 4194304;
                        userFull.note = textWithEntities;
                    }
                    MessagesStorage.getInstance(((BaseFragment) ContactAddActivity.this).currentAccount).updateUserInfo(userFull, true);
                    ContactAddActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
                }
                ContactAddActivity.this.finishFragment();
                if (ContactAddActivity.this.delegate != null) {
                    ContactAddActivity.this.delegate.didAddToContacts();
                }
            }
        });
        this.doneButton = this.actionBar.createMenu().addItem(1, LocaleController.getString(R.string.Done).toUpperCase());
        final FrameLayout frameLayout = new FrameLayout(context);
        int i3 = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(getThemedColor(i3));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.infoLayout = frameLayout2;
        int i4 = Theme.key_windowBackgroundWhite;
        frameLayout2.setBackgroundColor(getThemedColor(i4));
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImage = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(32.0f));
        this.infoLayout.addView(this.avatarImage, LayoutHelper.createFrame(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        final Paint paint = new Paint(1);
        paint.setColor(1426063360);
        View view = new View(context) {
            @Override
            public void onDraw(Canvas canvas) {
                if (ContactAddActivity.this.avatarImage == null || !ContactAddActivity.this.avatarImage.getImageReceiver().hasNotThumb()) {
                    return;
                }
                paint.setAlpha((int) (ContactAddActivity.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
            }
        };
        this.avatarOverlay = view;
        this.infoLayout.addView(view, LayoutHelper.createFrame(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.avatarProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(false);
        this.infoLayout.addView(this.avatarProgressView, LayoutHelper.createFrame(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        showAvatarProgress(false, false);
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        this.nameTextView.setTextSize(1, 18.0f);
        this.nameTextView.setLines(1);
        this.nameTextView.setMaxLines(1);
        this.nameTextView.setSingleLine(true);
        TextView textView2 = this.nameTextView;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.nameTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.nameTextView.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = this.infoLayout;
        TextView textView3 = this.nameTextView;
        boolean z = LocaleController.isRTL;
        TextView textViewM = zzkj.m(frameLayout3, textView3, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? 0.0f : 94.0f, 25.66f, z ? 94.0f : 0.0f, 0.0f), context);
        this.onlineTextView = textViewM;
        textViewM.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, this.resourcesProvider));
        this.onlineTextView.setTextSize(1, 14.0f);
        this.onlineTextView.setLines(1);
        this.onlineTextView.setMaxLines(1);
        this.onlineTextView.setSingleLine(true);
        this.onlineTextView.setEllipsize(truncateAt);
        this.onlineTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout frameLayout4 = this.infoLayout;
        TextView textView4 = this.onlineTextView;
        boolean z2 = LocaleController.isRTL;
        frameLayout4.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 94.0f, 49.66f, z2 ? 94.0f : 0.0f, 0.0f));
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.resourcesProvider);
        this.firstNameField = editTextCell;
        editTextCell.editText.setImeOptions(5);
        this.firstNameField.setBackgroundColor(getThemedColor(i4));
        this.firstNameField.setDivider(true);
        this.firstNameField.editText.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ContactAddActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView5, int i5, KeyEvent keyEvent) {
                switch (i) {
                    case 0:
                        return this.f$0.lambda$createView$0(textView5, i5, keyEvent);
                    case 1:
                        return this.f$0.lambda$createView$1(textView5, i5, keyEvent);
                    default:
                        return this.f$0.lambda$createView$2(textView5, i5, keyEvent);
                }
            }
        });
        this.firstNameField.editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            boolean focused;

            @Override
            public void onFocusChange(View view2, boolean z3) {
                this.focused = z3;
            }
        });
        this.firstNameField.setText(this.firstNameFromCard);
        EditTextCell editTextCell2 = new EditTextCell(context, LocaleController.getString(R.string.LastName), false, false, -1, this.resourcesProvider);
        this.lastNameField = editTextCell2;
        editTextCell2.editText.setImeOptions(5);
        this.lastNameField.setBackgroundColor(getThemedColor(i4));
        this.lastNameField.editText.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ContactAddActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView5, int i5, KeyEvent keyEvent) {
                switch (i2) {
                    case 0:
                        return this.f$0.lambda$createView$0(textView5, i5, keyEvent);
                    case 1:
                        return this.f$0.lambda$createView$1(textView5, i5, keyEvent);
                    default:
                        return this.f$0.lambda$createView$2(textView5, i5, keyEvent);
                }
            }
        });
        this.lastNameField.setText(this.lastNameFromCard);
        EditTextCell editTextCell3 = new EditTextCell(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.resourcesProvider);
        this.noteField = editTextCell3;
        editTextCell3.editText.setLinkTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
        this.noteField.editText.setImeOptions(6);
        this.noteField.setBackgroundColor(getThemedColor(i4));
        final int i5 = 2;
        this.noteField.editText.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ContactAddActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView5, int i6, KeyEvent keyEvent) {
                switch (i5) {
                    case 0:
                        return this.f$0.lambda$createView$0(textView5, i6, keyEvent);
                    case 1:
                        return this.f$0.lambda$createView$1(textView5, i6, keyEvent);
                    default:
                        return this.f$0.lambda$createView$2(textView5, i6, keyEvent);
                }
            }
        });
        if (!this.addContact) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
            TextCell textCell = new TextCell(23, context, this.resourcesProvider, false, false);
            this.suggestPhoto = textCell;
            String string = LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name);
            int i6 = R.drawable.msg_addphoto;
            textCell.setTextAndIcon((CharSequence) string, i6, true);
            this.suggestPhoto.setBackground(Theme.getSelectorDrawable(this.resourcesProvider, true));
            TextCell textCell2 = this.suggestPhoto;
            int i7 = Theme.key_windowBackgroundWhiteBlueIcon;
            int i8 = Theme.key_windowBackgroundWhiteBlueButton;
            textCell2.setColors(i7, i8);
            int i9 = R.raw.photo_suggest_icon;
            final RLottieDrawable rLottieDrawable = new RLottieDrawable(i9, Fragment$$ExternalSyntheticOutline0.m(i9, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.suggestPhoto.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.suggestPhoto.imageView.setAnimation(rLottieDrawable);
            this.suggestPhoto.setOnClickListener(new View.OnClickListener(this) {
                public final ContactAddActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$createView$5(user, rLottieDrawable, view2);
                            break;
                        default:
                            this.f$0.lambda$createView$8(user, rLottieDrawable, view2);
                            break;
                    }
                }
            });
            TextCell textCell3 = new TextCell(23, context, this.resourcesProvider, false, false);
            this.setAvatarCell = textCell3;
            textCell3.setTextAndIcon((CharSequence) LocaleController.formatString(R.string.UserSetPhoto, user.first_name), i6, false);
            this.setAvatarCell.setBackground(Theme.getSelectorDrawable(this.resourcesProvider, true));
            this.setAvatarCell.setColors(i7, i8);
            int i10 = R.raw.camera_outline;
            final RLottieDrawable rLottieDrawable2 = new RLottieDrawable(i10, Fragment$$ExternalSyntheticOutline0.m(i10, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.setAvatarCell.imageView.setAnimation(rLottieDrawable2);
            this.setAvatarCell.setOnClickListener(new View.OnClickListener(this) {
                public final ContactAddActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$createView$5(user, rLottieDrawable2, view2);
                            break;
                        default:
                            this.f$0.lambda$createView$8(user, rLottieDrawable2, view2);
                            break;
                    }
                }
            });
            this.oldAvatarView = new BackupImageView(context);
            this.oldPhotoCell = new TextCell(context, this.resourcesProvider) {
                @Override
                public void onLayout(boolean z3, int i11, int i12, int i13, int i14) {
                    super.onLayout(z3, i11, i12, i13, i14);
                    int iDp = AndroidUtilities.dp(21.0f);
                    int measuredHeight = (getMeasuredHeight() - ContactAddActivity.this.oldAvatarView.getMeasuredHeight()) / 2;
                    ContactAddActivity.this.oldAvatarView.layout(iDp, measuredHeight, ContactAddActivity.this.oldAvatarView.getMeasuredWidth() + iDp, ContactAddActivity.this.oldAvatarView.getMeasuredHeight() + measuredHeight);
                }

                @Override
                public void onMeasure(int i11, int i12) {
                    super.onMeasure(i11, i12);
                    ContactAddActivity.this.oldAvatarView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                    ContactAddActivity.this.oldAvatarView.setRoundRadius(AndroidUtilities.dp(30.0f));
                }
            };
            if (this.avatarDrawable == null) {
                this.avatarDrawable = new AvatarDrawable(user);
            }
            this.oldAvatarView.setForUserOrChat(user.photo, this.avatarDrawable);
            this.oldPhotoCell.addView(this.oldAvatarView, LayoutHelper.createFrame(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.oldPhotoCell.setText(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.oldPhotoCell.getImageView().setVisibility(0);
            this.oldPhotoCell.setBackground(Theme.getSelectorDrawable(this.resourcesProvider, true));
            this.oldPhotoCell.setColors(i7, i8);
            this.oldPhotoCell.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda0(this, context, user, 11));
            TextCell textCell4 = new TextCell(23, context, this.resourcesProvider, false, false);
            this.suggestBirthday = textCell4;
            textCell4.setTextAndIcon((CharSequence) LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), R.drawable.menu_birthday, false);
            this.suggestBirthday.setBackground(Theme.getSelectorDrawable(this.resourcesProvider, true));
            this.suggestBirthday.setColors(i7, i8);
            this.suggestBirthday.setNeedDivider(true);
            this.suggestBirthday.imageView.setTranslationX(AndroidUtilities.dp(4.0f));
            this.suggestBirthday.setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda53(23, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.user_id);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.prevAvatar = photo;
                if (photo == null) {
                    this.prevAvatar = userFull.fallback_photo;
                }
            }
            updateCustomPhotoInfo();
        }
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new LinkManager$$ExternalSyntheticLambda6(this, 12), new BoostsActivity$$ExternalSyntheticLambda4(this, 13), null);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
                if (ContactAddActivity.this.listView.scrollingByUser) {
                    AndroidUtilities.hideKeyboard(frameLayout);
                }
            }
        });
        this.listView.setBackgroundColor(getThemedColor(i3));
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.listView);
        if (this.addContact && this.needAddException) {
            this.checkShare = true;
        }
        this.listView.adapter.update(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (iIntValue & MessagesController.UPDATE_MASK_STATUS) == 0) {
                return;
            }
            updateAvatarLayout();
            return;
        }
        if (i == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.dialogPhotos) {
            ArrayList arrayList = new ArrayList(dialogPhotos.photos);
            int i3 = 0;
            while (i3 < arrayList.size()) {
                if (arrayList.get(i3) == null) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (arrayList.size() > 0) {
                this.prevAvatar = (TLRPC.Photo) arrayList.get(0);
                updateCustomPhotoInfo();
            }
        }
    }

    @Override
    public void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        this.photoSelectedTypeFinal = this.photoSelectedType;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public void didUploadFailed() {
        AndroidUtilities.runOnUIThread(new ContactAddActivity$$ExternalSyntheticLambda3(this, 2));
    }

    @Override
    public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didUploadPhoto$19(photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z);
            }
        });
    }

    @Override
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public String getInitialSearchString() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 12);
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        TextView textView = this.nameTextView;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(textView, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.onlineTextView, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.firstNameField, 4, null, null, null, null, i));
        EditTextCell editTextCell = this.firstNameField;
        int i2 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(editTextCell, 8388608, null, null, null, null, i2));
        EditTextCell editTextCell2 = this.firstNameField;
        int i3 = Theme.key_windowBackgroundWhiteInputField;
        arrayList.add(new ThemeDescription(editTextCell2, 32, null, null, null, null, i3));
        EditTextCell editTextCell3 = this.firstNameField;
        int i4 = Theme.key_windowBackgroundWhiteInputFieldActivated;
        arrayList.add(new ThemeDescription(editTextCell3, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.lastNameField, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.lastNameField, 8388608, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.lastNameField, 32, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.lastNameField, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.user_id = getArguments().getLong("user_id", 0L);
        this.phone = getArguments().getString("phone");
        this.firstNameFromCard = getArguments().getString("first_name_card");
        this.lastNameFromCard = getArguments().getString("last_name_card");
        this.addContact = getArguments().getBoolean("addContact", false);
        this.focusNotes = getArguments().getBoolean("focus_notes", false);
        this.needAddException = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("dialog_bar_exception" + this.user_id, false);
        TLRPC.User user = this.user_id != 0 ? getMessagesController().getUser(Long.valueOf(this.user_id)) : null;
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.parentFragment = this;
            imageUpdater.setDelegate(this);
        }
        this.dialogPhotos = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.user_id);
        return user != null && super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.clear();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        this.paused = true;
        this.imageUpdater.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        updateAvatarLayout();
        this.imageUpdater.onResume();
    }

    @Override
    public void onUploadProgressChanged(float f) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    public void setDelegate(ContactAddActivityDelegate contactAddActivityDelegate) {
        this.delegate = contactAddActivityDelegate;
    }

    @Override
    public final boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }

    public ContactAddActivity(Bundle bundle, Theme.ResourcesProvider resourcesProvider) {
        super(bundle);
        this.checkShare = false;
        this.firstSet = true;
        this.resourcesProvider = resourcesProvider;
        this.imageUpdater = new ImageUpdater(true, 0, true);
    }
}
