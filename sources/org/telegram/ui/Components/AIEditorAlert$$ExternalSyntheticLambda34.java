package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import androidx.core.util.Consumer;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.LaunchActivity;

public final class AIEditorAlert$$ExternalSyntheticLambda34 implements AlertsCreator.ScheduleDatePickerDelegate, PhotoAttachPhotoCell.PhotoAttachPhotoCellDelegate, ImageReceiver.ImageReceiverDelegate, Utilities.IndexedConsumer, AlertDialog.OnButtonClickListener, MessagesStorage.BooleanCallback, AvatarConstructorFragment.Delegate, ActionBarPopupWindow.onSizeChangedListener, RecyclerListView.OnItemLongClickListener, Utilities.Callback5 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public AIEditorAlert$$ExternalSyntheticLambda34(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public void accept(Object obj, int i) {
        switch (this.$r8$classId) {
            case 5:
                DeleteMessagesBottomSheet.lambda$fillAction$9((ArrayList) this.f$0, (DeleteMessagesBottomSheet.Action) this.f$1, (TLObject) obj, i);
                break;
            default:
                ((DeleteMessagesBottomSheet) this.f$0).lambda$getTitle$4((int[]) this.f$1, (TLObject) obj, i);
                break;
        }
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 1:
                ((ChatActivityEnterView.AnonymousClass48) this.f$0).lambda$onItemClick$0((String) this.f$1, z, i, i2);
                break;
            case 2:
                ((ChatActivityEnterView.ChatActivityEditTextCaption) this.f$0).lambda$onCreateInputConnection$0((InputContentInfoCompat) this.f$1, z, i, i2);
                break;
            case 18:
                ((ChatAttachAlertLocationLayout) this.f$0).lambda$new$18((TLRPC.TL_messageMediaVenue) this.f$1, z, i, i2);
                break;
            case 19:
                ((ChatAttachAlertLocationLayout) this.f$0).lambda$new$7(this.f$1, z, i, i2);
                break;
            case 20:
                ((ChatAttachAlertLocationLayout.MapOverlayView) this.f$0).lambda$addInfoView$0((ChatAttachAlertLocationLayout.VenueLocation) this.f$1, z, i, i2);
                break;
            default:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$new$1((View) this.f$1, z, i, i2);
                break;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ((ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell.MediaCell) this.f$0).lambda$setImage$0((MediaController.PhotoEntry) this.f$1, imageReceiver, z, z2, z3);
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onCheckClick(PhotoAttachPhotoCell photoAttachPhotoCell) {
        ((ChatAttachAlertPhotoLayout.PhotoAttachAdapter) this.f$0).lambda$createHolder$0((PhotoAttachPhotoCell) this.f$1, photoAttachPhotoCell);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((AIEditorAlert) this.f$0).lambda$new$6((TL_aicompose.TL_aiComposeTone) this.f$1, alertDialog, i);
                break;
            case 6:
                ((MediaActivity.AnonymousClass1) this.f$0).lambda$onItemClick$0((ArrayList) this.f$1, alertDialog, i);
                break;
            case 8:
                AlertsCreator.lambda$createColorSelectDialog$205((String) this.f$0, (Runnable) this.f$1, alertDialog, i);
                break;
            case 9:
                AlertsCreator.lambda$showAlertWithCheckbox$68((Utilities.Callback) this.f$0, (boolean[]) this.f$1, alertDialog, i);
                break;
            case 10:
                AlertsCreator.lambda$createBlockDialogAlert$100((AlertsCreator.BlockDialogCallback) this.f$0, (boolean[]) this.f$1, alertDialog, i);
                break;
            case 11:
                AlertsCreator.lambda$createLocationUpdateDialog$208((int[]) this.f$0, (MessagesStorage.IntCallback) this.f$1, alertDialog, i);
                break;
            case 12:
                AlertsCreator.lambda$showDeclineSuggestedPostDialog$246((Utilities.Callback) this.f$0, (EditText) this.f$1, alertDialog, i);
                break;
            case 13:
                AlertsCreator.lambda$createContactInviteDialog$97((String) this.f$0, (BaseFragment) this.f$1, alertDialog, i);
                break;
            case 14:
                AlertsCreator.lambda$createWebViewPermissionsRequestDialog$4((AtomicBoolean) this.f$0, (Consumer) this.f$1, alertDialog, i);
                break;
            case 15:
                AlertsCreator.lambda$createTTLAlert$220((TLRPC.EncryptedChat) this.f$0, (NumberPicker) this.f$1, alertDialog, i);
                break;
            case 16:
                AlertsCreator.lambda$createLanguageAlert$11((TLRPC.TL_langPackLanguage) this.f$0, (LaunchActivity) this.f$1, alertDialog, i);
                break;
            case 17:
                AlertsCreator.lambda$showAddLinkToPoll$19((EditTextBoldCursor) this.f$0, (Utilities.Callback) this.f$1, alertDialog, i);
                break;
            case 25:
                EditTextCaption.lambda$showInputDialog$6((EditTextCaption.InputDialogCallback) this.f$0, (EditTextBoldCursor) this.f$1, alertDialog, i);
                break;
            case 27:
                ((HashtagHistoryView) this.f$0).lambda$onLongClick$0((String) this.f$1, alertDialog, i);
                break;
            default:
                ((SearchViewPager) this.f$0).lambda$onActionBarItemClick$3((ArrayList) this.f$1, alertDialog, i);
                break;
        }
    }

    @Override
    public void onDone(AvatarConstructorFragment.BackgroundGradient backgroundGradient, long j, TLRPC.Document document, AvatarConstructorFragment.PreviewView previewView) {
        ((ChatAttachAlertPhotoLayout) this.f$0).lambda$showAvatarConstructorFragment$10((AvatarConstructorFragment) this.f$1, backgroundGradient, j, document, previewView);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return ((EmojiPacksAlert) this.f$0).lambda$new$2((Context) this.f$1, view, i);
    }

    @Override
    public void onSizeChanged() {
        ((ChatScrimPopupContainerLayout) this.f$0).lambda$setPopupWindowLayout$0((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$1);
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((RecyclerListView) this.f$0).lambda$drawSectionsBackgrounds$5((Canvas) this.f$1, (Float) obj, (Float) obj2, (Float) obj3, (Float) obj4, (Float) obj5);
    }

    @Override
    public void run(boolean z) {
        ((SharedMediaLayout.AnonymousClass5) this.f$0).lambda$onClick$10((TLRPC.User) this.f$1, z);
    }
}
