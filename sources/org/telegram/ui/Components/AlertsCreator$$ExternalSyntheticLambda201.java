package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;

public final class AlertsCreator$$ExternalSyntheticLambda201 implements PaymentFormActivity.PaymentFormCallback, MediaDataController.KeywordResultCallback, AlertsCreator.ScheduleDatePickerDelegate, ActionBarMenuItem.ActionBarMenuItemDelegate, SenderSelectPopup.OnSelectCallback, AlertDialog.OnButtonClickListener, DialogsActivity.DialogsActivityDelegate, Utilities.IndexedConsumer, ImageReceiver.ImageReceiverDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public AlertsCreator$$ExternalSyntheticLambda201(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public void accept(Object obj, int i) {
        ((DeleteMessagesBottomSheet) this.f$0).lambda$performDelete$17((ArrayList) this.f$1, (ArrayList) this.f$2, (TLObject) obj, i);
    }

    @Override
    public boolean canSelectStories() {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 4:
                ((InstantCameraView.VideoRecorder) this.f$0).lambda$handleStopRecording$8((InstantCameraView.SendOptions) this.f$1, (VideoEditedInfo) this.f$2, z, i, i2);
                break;
            case 9:
                ((ChatAttachAlertLocationLayout) this.f$0).lambda$new$5((TLRPC.TL_messageMediaGeo) this.f$1, (Long) this.f$2, z, i, i2);
                break;
            default:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$onTodoDoneButtonClick$5((TLRPC.TL_messageMediaToDo) this.f$1, (Long) this.f$2, z, i, i2);
                break;
        }
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        return ((ChatActivityEnterView) this.f$0).lambda$didPressedBotButton$93((MessageObject) this.f$1, (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.f$2, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ((ThemeSmallPreviewView) this.f$0).lambda$setItem$1((ChatThemeBottomSheet.ChatThemeItem) this.f$1, (TLRPC.WallPaper) this.f$2, imageReceiver, z, z2, z3);
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
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 6:
                ((ChatActivityEnterView) this.f$0).lambda$didPressedBotButton$92((MessageObject) this.f$1, (TL_keyboard.KeyboardButtonProto) this.f$2, alertDialog, i);
                break;
            case 8:
                ((ChatAttachAlert) this.f$0).lambda$onLongClickBotButton$46((TLRPC.TL_attachMenuBot) this.f$1, (TLRPC.User) this.f$2, alertDialog, i);
                break;
            case 11:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$deletePollAnswerView$13((View) this.f$1, (PollEditTextCell) this.f$2, alertDialog, i);
                break;
            default:
                ((SharedMediaLayout) this.f$0).lambda$onActionBarItemClick$41((StoriesController.BotPreviewsList) this.f$1, (ArrayList) this.f$2, alertDialog, i);
                break;
        }
    }

    @Override
    public void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
        ChatAttachAlert.AnonymousClass1.lambda$onWebAppOpenInvoice$4((OverlayActionBarLayoutDialog) this.f$0, (ChatAttachAlertBotWebViewLayout) this.f$1, (String) this.f$2, invoiceStatus);
    }

    @Override
    public void onItemClick(int i) {
        AlertsCreator.lambda$createScheduleDatePickerDialog$123((AlertsCreator.ScheduleDatePickerDelegate) this.f$0, (boolean[]) this.f$1, (BottomSheet.Builder) this.f$2, i);
    }

    @Override
    public void onPeerSelected(RecyclerView recyclerView, SenderSelectPopup.SenderView senderView, TLRPC.Peer peer) {
        ((ChatActivityEnterView) this.f$0).lambda$createSenderSelectView$30((TLRPC.ChatFull) this.f$1, (MessagesController) this.f$2, recyclerView, senderView, peer);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.$r8$classId) {
            case 2:
                ((EmojiView.EmojiSearchAdapter.AnonymousClass5) this.f$0).lambda$run$3((String) this.f$1, (Runnable) this.f$2, arrayList, str);
                break;
            default:
                ((EmojiView.StickersSearchGridAdapter.AnonymousClass1) this.f$0).lambda$addFromSuggestions$0((HashMap) this.f$1, (Runnable) this.f$2, arrayList, str);
                break;
        }
    }
}
