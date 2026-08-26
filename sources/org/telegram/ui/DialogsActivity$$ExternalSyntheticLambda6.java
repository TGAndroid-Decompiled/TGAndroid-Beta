package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import org.telegram.messenger.ContactsLoadingObserver;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ProximitySheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharingLocationsAlert;

public final class DialogsActivity$$ExternalSyntheticLambda6 implements AlertDialog.OnButtonClickListener, MessagesStorage.LongCallback, TwoStepVerificationActivity.TwoStepVerificationActivityDelegate, RecyclerListView.OnItemClickListenerExtended, AlertsCreator.BlockDialogCallback, DialogsActivity.DialogsActivityDelegate, ActionIntroActivity.ActionIntroQRLoginDelegate, ContactsLoadingObserver.Callback, SharingLocationsAlert.SharingLocationsAlertDelegate, RecyclerListView.OnItemLongClickListener, ImageReceiver.ImageReceiverDelegate, AlertsCreator.ScheduleDatePickerDelegate, ProximitySheet.onRadiusPickerChange, OnCompleteListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public DialogsActivity$$ExternalSyntheticLambda6(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public boolean canSelectStories() {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        ((ChatRightsEditActivity) this.f$0).lambda$initTransfer$14((TwoStepVerificationActivity) this.f$1, inputCheckPasswordSRP);
    }

    @Override
    public void didFindQRCode(String str) {
        ((LaunchActivity) this.f$0).lambda$handleIntent$26((ActionIntroActivity) this.f$1, str);
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 23:
                ((LocationActivity) this.f$0).lambda$createView$16((TLRPC.TL_messageMediaGeo) this.f$1, z, i, i2);
                break;
            default:
                ((LocationActivity.MapOverlayView) this.f$0).lambda$addInfoView$0((LocationActivity.VenueLocation) this.f$1, z, i, i2);
                break;
        }
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        return ((KeepMediaPopupView) this.f$1).lambda$new$1((DialogsActivity) this.f$0, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
    }

    @Override
    public void didSelectLocation(LocationController.SharingLocationInfo sharingLocationInfo) {
        ((LaunchActivity) this.f$0).lambda$handleIntent$17((int[]) this.f$1, sharingLocationInfo);
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ((LocationActivity) this.f$0).lambda$setupAvatarReceiver$36((LocationActivity.LiveLocation) this.f$1, imageReceiver, z, z2, z3);
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        int i2 = this.$r8$classId;
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                ((ChatEditTypeActivity) this.f$0).lambda$loadAdminedChannels$19((TLRPC.Chat) this.f$1, alertDialog, i);
                break;
            case 4:
                ((ContactAddActivity) this.f$0).lambda$onItemClick$17((TLRPC.User) this.f$1, alertDialog, i);
                break;
            case 5:
                ((ContactsActivity) this.f$0).lambda$createView$4((String) this.f$1, alertDialog, i);
                break;
            case 7:
                ((DialogOrContactPickerActivity) this.f$0).lambda$showBlockAlert$3((TLRPC.User) this.f$1, alertDialog, i);
                break;
            case 8:
                ((DialogsActivity) this.f$0).lambda$createSearchViewPager$151((TLRPC.User) this.f$1, alertDialog, i);
                break;
            case 11:
                ((GroupCallActivity) this.f$0).lambda$processSelectedOption$69((TLObject) this.f$1, alertDialog, i);
                break;
            case 12:
                ((GroupCreateActivity) this.f$0).lambda$createView$3((TLRPC.User) this.f$1, alertDialog, i);
                break;
            case 13:
                ((GroupCreateActivity) this.f$0).lambda$onDonePressed$16((CheckBoxCell[]) this.f$1, alertDialog, i);
                break;
            case 15:
                ((LanguageSelectActivity) this.f$0).lambda$createView$5((LocaleController.LocaleInfo) this.f$1, alertDialog, i);
                break;
            case 16:
                ((LaunchActivity) this.f$0).lambda$openEmailSettings$29((LoginActivity) this.f$1, alertDialog, i);
                break;
            case 17:
                ((LaunchActivity) this.f$0).lambda$showLanguageAlertInternal$172((LocaleController.LocaleInfo[]) this.f$1, alertDialog, i);
                break;
            case 27:
                ((LoginActivity.LoginActivityNewPasswordView) this.f$0).lambda$recoverPassword$6((TLRPC.auth_Authorization) this.f$1, alertDialog, i);
                break;
            default:
                ((LoginActivity.LoginActivityPasswordView) this.f$0).lambda$new$2((TLRPC.TL_auth_passwordRecovery) this.f$1, alertDialog, i);
                break;
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.$r8$classId) {
            case 26:
                ((LoginActivity.LoginActivityEmailCodeView) this.f$0).lambda$new$2((GoogleSignInClient) this.f$1, task);
                break;
            default:
                ((LoginActivity.LoginActivitySetupEmail) this.f$0).lambda$new$2((GoogleSignInClient) this.f$1, task);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        int i2 = this.$r8$classId;
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        switch (this.$r8$classId) {
            case 6:
                ((DataSettingsActivity) this.f$0).lambda$createView$9((Context) this.f$1, view, i, f, f2);
                break;
            case 9:
                ((DialogsActivity) this.f$0).lambda$createView$16((DialogsActivity.ViewPage) this.f$1, view, i, f, f2);
                break;
            default:
                ((FiltersSetupActivity) this.f$0).lambda$createView$4((Context) this.f$1, view, i, f, f2);
                break;
        }
    }

    @Override
    public void onResult(boolean z) {
        ((LaunchActivity) this.f$0).lambda$handleIntent$9((Intent) this.f$1, z);
    }

    @Override
    public void run(long j) {
        ((ChatLinkActivity) this.f$0).lambda$linkChat$10((BaseFragment) this.f$1, j);
    }

    public DialogsActivity$$ExternalSyntheticLambda6(KeepMediaPopupView keepMediaPopupView, DialogsActivity dialogsActivity) {
        this.$r8$classId = 14;
        this.f$1 = keepMediaPopupView;
        this.f$0 = dialogsActivity;
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return ((LocationActivity) this.f$0).lambda$createView$12((Context) this.f$1, view, i);
    }

    @Override
    public void run(boolean z, boolean z2) {
        ((DialogsActivity) this.f$0).lambda$performSelectedDialogsAction$109((ArrayList) this.f$1, z, z2);
    }

    @Override
    public boolean run(boolean z, int i) {
        return ((LocationActivity) this.f$0).lambda$openProximityAlert$32((TLRPC.User) this.f$1, z, i);
    }
}
