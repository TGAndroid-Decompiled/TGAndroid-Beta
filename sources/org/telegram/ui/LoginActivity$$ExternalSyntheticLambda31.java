package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.utils.RemoteUtils;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda8;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda0;
import com.google.firebase.messaging.RequestDeduplicator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessRecipientsHelper;
import org.telegram.ui.Components.AvatarConstructorPreviewCell;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.GalleryEmptyView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.iv.RichCaptionController$1$$ExternalSyntheticLambda0;

public final class LoginActivity$$ExternalSyntheticLambda31 implements RemoteUtils.HostCall, DefaultTrackSelector.TrackInfo.Factory, Continuation, AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended, ContactsActivity.ContactsActivityDelegate {
    public final int $r8$classId;
    public final boolean f$0;
    public final Object f$1;
    public final Object f$2;

    public LoginActivity$$ExternalSyntheticLambda31(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = z;
    }

    @Override
    public RegularImmutableList create(int i, TrackGroup trackGroup, int[] iArr) {
        DefaultTrackSelector$$ExternalSyntheticLambda8 defaultTrackSelector$$ExternalSyntheticLambda8 = new DefaultTrackSelector$$ExternalSyntheticLambda8((DefaultTrackSelector) this.f$1);
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        Maps.checkNonnegative(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < trackGroup.length) {
            int i4 = i;
            TrackGroup trackGroup2 = trackGroup;
            DefaultTrackSelector.AudioTrackInfo audioTrackInfo = new DefaultTrackSelector.AudioTrackInfo(i4, trackGroup2, i2, (DefaultTrackSelector.Parameters) this.f$2, iArr[i2], this.f$0, defaultTrackSelector$$ExternalSyntheticLambda8);
            int i5 = i3 + 1;
            if (objArrCopyOf.length < i5) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableList.Builder.expandedCapacity(objArrCopyOf.length, i5));
            }
            objArrCopyOf[i3] = audioTrackInfo;
            i2++;
            i3 = i5;
            i = i4;
            trackGroup = trackGroup2;
        }
        return ImmutableList.asImmutableList(i3, objArrCopyOf);
    }

    @Override
    public void didSelectContact(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.f$1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.currentAccount).getUserFull(user.id);
        VoIPHelper.startCall(user, this.f$0, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(((int[]) this.f$2)[0]));
    }

    @Override
    public Object dispatch() {
        return ((CarResultStub) this.f$1).lambda$onCarHardwareResult$0(this.f$0, (Bundleable) this.f$2);
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                boolean z = this.f$0;
                String str = (String) this.f$1;
                BaseFragment baseFragment = (BaseFragment) this.f$2;
                try {
                    PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{z ? "recover@telegram.org" : "login@stel.com"});
                    if (z) {
                        intent.putExtra("android.intent.extra.SUBJECT", "Banned phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's banned. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    } else {
                        intent.putExtra("android.intent.extra.SUBJECT", "Invalid phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's invalid. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    }
                    baseFragment.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                } catch (Exception unused) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
                    builder.alertDialog.title = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    builder.alertDialog.message = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
                    baseFragment.showDialog(builder.alertDialog);
                    return;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 9:
            default:
                PassportActivity passportActivity = (PassportActivity) this.f$1;
                passportActivity.needShowProgress$1();
                passportActivity.deleteValueInternal((TLRPC.TL_secureRequiredType) this.f$2, null, null, true, new PassportActivity$$ExternalSyntheticLambda14(passportActivity, 4), new PassportActivity$$ExternalSyntheticLambda7(passportActivity, 6), this.f$0);
                break;
            case 4:
                BusinessRecipientsHelper businessRecipientsHelper = (BusinessRecipientsHelper) this.f$1;
                (!this.f$0 ? businessRecipientsHelper.neverShow : businessRecipientsHelper.alwaysShow).remove(Long.valueOf(((UItem) this.f$2).dialogId));
                businessRecipientsHelper.update.run();
                break;
            case 5:
                boolean[] zArr = (boolean[]) this.f$2;
                CallLogActivity callLogActivity = (CallLogActivity) this.f$1;
                if (this.f$0) {
                    callLogActivity.getClass();
                    boolean z2 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z2;
                    callLogActivity.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new CallLogActivity$$ExternalSyntheticLambda31(0, callLogActivity, z2));
                    callLogActivity.calls.clear();
                    callLogActivity.loading = false;
                    callLogActivity.endReached = true;
                    callLogActivity.otherItem.setVisibility(8);
                    callLogActivity.listView.adapter.update(true);
                } else {
                    callLogActivity.getMessagesController().deleteMessages(new ArrayList<>(callLogActivity.selectedIds), null, null, 0L, 0, zArr[0], 0);
                }
                callLogActivity.hideActionMode(false);
                break;
            case 6:
                ChangeUsernameActivity.this.toggleUsername((TLRPC.TL_username) this.f$2, this.f$0, true);
                break;
            case 7:
                ChatEditTypeActivity.UsernamesListView usernamesListView = ChatEditTypeActivity.UsernamesListView.this;
                usernamesListView.toggleUsername((TLRPC.TL_username) this.f$2, this.f$0, true);
                ChatEditTypeActivity.this.checkDoneButton();
                break;
            case 8:
                BaseFragment baseFragment2 = (BaseFragment) this.f$2;
                MessagesController messagesController = baseFragment2.getMessagesController();
                TLRPC.User user = (TLRPC.User) this.f$1;
                TLRPC.UserFull userFull = messagesController.getUserFull(user.id);
                VoIPHelper.startCall(user, this.f$0, userFull != null && userFull.video_calls_available, baseFragment2.getParentActivity(), userFull, baseFragment2.getAccountInstance());
                break;
            case 10:
                FilterCreateActivity filterCreateActivity = (FilterCreateActivity) this.f$1;
                filterCreateActivity.getClass();
                FilterCreateActivity.ItemInner itemInner = (FilterCreateActivity.ItemInner) this.f$2;
                int i2 = itemInner.flags;
                boolean z3 = this.f$0;
                if (i2 > 0) {
                    filterCreateActivity.newFilterFlags &= ~i2;
                } else {
                    (z3 ? filterCreateActivity.newAlwaysShow : filterCreateActivity.newNeverShow).remove(Long.valueOf(itemInner.did));
                }
                filterCreateActivity.fillFilterName();
                filterCreateActivity.updateRows$12();
                filterCreateActivity.checkDoneButton(true);
                if (z3) {
                    filterCreateActivity.onUpdate(1, false);
                }
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        int i2;
        int i3 = i;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f$1;
        if (chatAttachAlertPhotoLayout.mediaEnabled) {
            ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
            if (chatAttachAlert.destroyed) {
                return;
            }
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            BaseFragment lastFragment = baseFragment == null ? LaunchActivity.getLastFragment() : baseFragment;
            if (lastFragment == null || (view instanceof GalleryEmptyView)) {
                return;
            }
            int i4 = Build.VERSION.SDK_INT;
            ChatAttachAlertPhotoLayout.PhotoAttachAdapter photoAttachAdapter = chatAttachAlertPhotoLayout.adapter;
            if (i4 >= 23) {
                try {
                    if (photoAttachAdapter.needCamera && chatAttachAlertPhotoLayout.selectedAlbumEntry == chatAttachAlertPhotoLayout.galleryAlbumEntry && i3 == 0 && chatAttachAlertPhotoLayout.noCameraPermissions) {
                        lastFragment.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } else if (chatAttachAlertPhotoLayout.noGalleryPermissions) {
                        if (i4 >= 33) {
                            lastFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                            return;
                        } else {
                            lastFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            boolean z = photoAttachAdapter.hasCameraSpaceRow;
            if (z && i3 == chatAttachAlertPhotoLayout.itemsPerRow) {
                chatAttachAlertPhotoLayout.openCameraByClick();
                return;
            }
            boolean z2 = this.f$0;
            if (i3 == 0 && z2 && chatAttachAlertPhotoLayout.selectedAlbumEntry == chatAttachAlertPhotoLayout.galleryAlbumEntry) {
                chatAttachAlertPhotoLayout.openCameraByClick();
                return;
            }
            if (z && i3 > chatAttachAlertPhotoLayout.itemsPerRow) {
                i3--;
            }
            if (chatAttachAlertPhotoLayout.selectedAlbumEntry == chatAttachAlertPhotoLayout.galleryAlbumEntry && z2) {
                i3--;
            }
            ChatActivity chatActivity = null;
            if (chatAttachAlertPhotoLayout.showAvatarConstructor) {
                if (i3 == 0) {
                    if (!(view instanceof AvatarConstructorPreviewCell)) {
                        return;
                    }
                    chatAttachAlertPhotoLayout.showAvatarConstructorFragment((AvatarConstructorPreviewCell) view, null, 0L);
                    chatAttachAlert.lambda$showGiftOfferSheet$15();
                }
                i3--;
            }
            int i5 = i3;
            ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
            if (i5 < 0 || i5 >= allPhotosArray.size()) {
                return;
            }
            ChatAttachAlert.ChatAttachViewDelegate chatAttachViewDelegate = chatAttachAlert.delegate;
            ArrayList arrayList = ChatAttachAlertPhotoLayout.selectedPhotosOrder;
            HashMap map = ChatAttachAlertPhotoLayout.selectedPhotos;
            if (chatAttachViewDelegate != null && chatAttachViewDelegate.selectItemOnClicking() && (allPhotosArray.get(i5) instanceof MediaController.PhotoEntry)) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) allPhotosArray.get(i5);
                map.clear();
                if (photoEntry != null) {
                    chatAttachAlertPhotoLayout.addToSelectedPhotos(photoEntry, -1);
                }
                chatAttachAlert.applyCaption();
                chatAttachAlert.delegate.didPressedButton(7, true, true, 0, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
                map.clear();
                ChatAttachAlertPhotoLayout.cameraPhotos.clear();
                arrayList.clear();
                map.clear();
                return;
            }
            PhotoViewer.getInstance().setParentActivity(null, lastFragment, (Theme.ResourcesProvider) this.f$2);
            PhotoViewer.getInstance().setParentAlert(chatAttachAlert);
            PhotoViewer photoViewer = PhotoViewer.getInstance();
            int i6 = chatAttachAlert.maxSelectedPhotos;
            boolean z3 = chatAttachAlert.allowOrder;
            photoViewer.maxSelectedPhotos = i6;
            photoViewer.allowOrder = z3;
            if (chatAttachAlert.isPhotoPicker && chatAttachAlert.isStickerMode) {
                i2 = 11;
                if (baseFragment instanceof ChatActivity) {
                    chatActivity = (ChatActivity) baseFragment;
                }
            } else if (chatAttachAlert.avatarPicker != 0) {
                i2 = 1;
            } else {
                if (baseFragment instanceof ChatActivity) {
                    chatActivity = (ChatActivity) baseFragment;
                } else if (!chatAttachAlert.allowEnterCaption) {
                    i2 = 4;
                }
                i2 = 0;
            }
            if (!chatAttachAlert.delegate.needEnterComment()) {
                AndroidUtilities.hideKeyboard(lastFragment.getFragmentView().findFocus());
                AndroidUtilities.hideKeyboard(chatAttachAlert.getContainer().findFocus());
            }
            if (map.size() > 0 && arrayList.size() > 0) {
                Object obj = map.get(arrayList.get(0));
                if (obj instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj).caption = chatAttachAlert.getCommentView().getText();
                }
                if (obj instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj).caption = chatAttachAlert.getCommentView().getText();
                }
            }
            if (chatAttachAlert.setAvatarFor != null) {
                chatAttachAlert.setAvatarFor.isVideo = allPhotosArray.get(i5) instanceof MediaController.PhotoEntry ? ((MediaController.PhotoEntry) allPhotosArray.get(i5)).isVideo : false;
            }
            boolean z4 = (allPhotosArray.get(i5) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) allPhotosArray.get(i5)).hasSpoiler;
            Object obj2 = allPhotosArray.get(i5);
            if ((obj2 instanceof MediaController.PhotoEntry) && chatAttachAlertPhotoLayout.checkSendMediaEnabled((MediaController.PhotoEntry) obj2)) {
                return;
            }
            if (z4) {
                chatAttachAlertPhotoLayout.setCurrentSpoilerVisible(i5, false);
            }
            AndroidUtilities.runOnUIThread(new RichCaptionController$1$$ExternalSyntheticLambda0(chatAttachAlertPhotoLayout, i2, lastFragment, allPhotosArray, i5, chatActivity), z4 ? 250L : 0L);
        }
    }

    @Override
    public Object then(Task task) {
        return (Hex.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? RequestDeduplicator.bindToMessagingService((Context) this.f$1, (Intent) this.f$2, this.f$0).continueWith(new LinkManager$$ExternalSyntheticLambda9(1), new CrashlyticsCore$$ExternalSyntheticLambda0(12)) : task;
    }

    public LoginActivity$$ExternalSyntheticLambda31(Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = z;
        this.f$2 = obj2;
    }

    public LoginActivity$$ExternalSyntheticLambda31(BaseFragment baseFragment, TLRPC.User user, boolean z) {
        this.$r8$classId = 8;
        this.f$2 = baseFragment;
        this.f$1 = user;
        this.f$0 = z;
    }

    public LoginActivity$$ExternalSyntheticLambda31(boolean z, String str, BaseFragment baseFragment) {
        this.$r8$classId = 0;
        this.f$0 = z;
        this.f$1 = str;
        this.f$2 = baseFragment;
    }
}
