package org.telegram.ui;

import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.LongSparseArray;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.BotHelpCell;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.PopupSwipeBackLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;

public final class BoostsActivity$$ExternalSyntheticLambda4 implements AlertDialog.OnButtonClickListener, LimitPreviewView.DarkGradientProvider, PasscodeView.PasscodeViewDelegate, RecyclerListView.OnItemClickListenerExtended, ViewGroupPartRenderer.DrawChildMethod, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, BotHelpCell.BotHelpCellDelegate, EditWidgetActivity.EditWidgetActivityDelegate, ContactsActivity.ContactsActivityDelegate, PopupSwipeBackLayout.IntCallback, InviteMembersBottomSheet.InviteMembersBottomSheetDelegate, ActionBarPopupWindow.OnDispatchKeyEventListener, RecyclerListView.IntReturnCallback, SearchAdapterHelper.SearchAdapterHelperDelegate, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public BoostsActivity$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public boolean canApplySearchResults(int i) {
        return true;
    }

    @Override
    public void didAcceptedPassword(PasscodeView passcodeView) throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 2:
                ((BubbleActivity) this.f$0).lambda$showPasscodeActivity$0(passcodeView);
                break;
            default:
                ((ExternalActionActivity) this.f$0).lambda$showPasscodeActivity$2(passcodeView);
                break;
        }
    }

    @Override
    public void didSelectContact(TLRPC.User user, String str, ContactsActivity contactsActivity) {
        ((DialogOrContactPickerActivity) this.f$0).lambda$new$2(user, str, contactsActivity);
    }

    @Override
    public void didSelectDialogs(ArrayList arrayList) {
        switch (this.$r8$classId) {
            case 12:
                ((ChatsWidgetConfigActivity) this.f$0).lambda$handleIntent$0(arrayList);
                break;
            case 13:
            default:
                ((EditWidgetActivity) this.f$0).lambda$createView$0(arrayList);
                break;
            case 14:
                ((ContactsWidgetConfigActivity) this.f$0).lambda$handleIntent$0(arrayList);
                break;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        return ((UniversalRecyclerView) this.f$0).drawChild(canvas, view, j);
    }

    @Override
    public LongSparseArray getExcludeCallParticipants() {
        return null;
    }

    @Override
    public LongSparseArray getExcludeUsers() {
        return null;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        int i2 = this.$r8$classId;
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onCameraInit() {
        ((CameraScanActivity) this.f$0).lambda$initCameraView$9();
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                ((BasePermissionsActivity) this.f$0).lambda$createPermissionErrorAlert$0(alertDialog, i);
                break;
            case 6:
                ((ChannelCreateActivity) this.f$0).lambda$showDoneCancelDialog$2(alertDialog, i);
                break;
            case 9:
                ((ChatActivity$$ExternalSyntheticLambda39) this.f$0).run();
                break;
            case 11:
                ((ChatLinkActivity) this.f$0).lambda$createView$5(alertDialog, i);
                break;
            case 26:
                ((GroupInviteActivity) this.f$0).lambda$createView$0(alertDialog, i);
                break;
            default:
                AndroidUtilities.addToClipboard((StringBuilder) this.f$0);
                break;
        }
    }

    @Override
    public void onDataSetChanged(int i) {
        ((GroupCreateActivity.GroupCreateAdapter) this.f$0).lambda$new$0(i);
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        ((FilterChatlistActivity.InviteLinkCell) this.f$0).lambda$options$10(keyEvent);
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        int i2 = this.$r8$classId;
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        switch (this.$r8$classId) {
            case 3:
                ((CacheChatsExceptionsFragment) this.f$0).lambda$createView$3(view, i, f, f2);
                break;
            case 15:
                ((CreateGroupCallSheet) this.f$0).lambda$new$1(view, i, f, f2);
                break;
            case 16:
                ((DataAutoDownloadActivity) this.f$0).lambda$createView$4(view, i, f, f2);
                break;
            case 25:
                ((GroupCreateFinalActivity) this.f$0).lambda$createView$6(view, i, f, f2);
                break;
            default:
                ((LiteModeSettingsActivity) this.f$0).lambda$createView$0(view, i, f, f2);
                break;
        }
    }

    @Override
    public void onSetHashtags(ArrayList arrayList, HashMap map) {
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f$0).lambda$createView$5();
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return ((LanguageSelectActivity) this.f$0).lambda$createView$6(view, i);
    }

    @Override
    public void run(int i) {
        DialogsActivity.lambda$showChatPreview$97((BaseFragment[]) this.f$0, i);
    }

    @Override
    public void run(Exception exc) {
        ((BotHelpCell) this.f$0).setClickable(false);
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$r8$classId) {
            case 7:
                int iIntValue = ((Integer) obj3).intValue();
                float fFloatValue = ((Float) obj4).floatValue();
                float fFloatValue2 = ((Float) obj5).floatValue();
                ((ChannelMonetizationLayout.ChannelTransactionsView.Page) this.f$0).onClick((UItem) obj, (View) obj2, iIntValue, fFloatValue, fFloatValue2);
                break;
            case 13:
                int iIntValue2 = ((Integer) obj3).intValue();
                float fFloatValue3 = ((Float) obj4).floatValue();
                float fFloatValue4 = ((Float) obj5).floatValue();
                ((ContactAddActivity) this.f$0).onItemClick((UItem) obj, (View) obj2, iIntValue2, fFloatValue3, fFloatValue4);
                break;
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                float fFloatValue5 = ((Float) obj4).floatValue();
                float fFloatValue6 = ((Float) obj5).floatValue();
                ((EnableTopicsActivity) this.f$0).onItemClick((UItem) obj, (View) obj2, iIntValue3, fFloatValue5, fFloatValue6);
                break;
        }
    }
}
