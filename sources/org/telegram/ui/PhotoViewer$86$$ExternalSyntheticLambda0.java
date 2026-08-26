package org.telegram.ui;

import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Storage.CacheModel;

public final class PhotoViewer$86$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public PhotoViewer$86$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer.AnonymousClass86) this.f$0).lambda$run$0((Runnable) this.f$1, (int[]) this.f$2);
                break;
            case 1:
                ((ArticleViewer.BlockEmbedCell.TelegramWebviewProxy) this.f$0).lambda$postEvent$0((String) this.f$1, (String) this.f$2);
                break;
            case 2:
                ((CalendarActivity.MonthView.AnonymousClass2) this.f$0).lambda$onLongPress$0((ChatActivity) this.f$1, (CalendarActivity.PeriodDay) this.f$2);
                break;
            case 3:
                ((ChatActivity.ChatActivityAdapter.AnonymousClass2.C00122) this.f$0).lambda$sendButtonPressed$2((TLObject) this.f$1, (MessageObject) this.f$2);
                break;
            case 4:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressRichDocumentOptions$6((ChatMessageCell) this.f$1, (TLRPC.Document) this.f$2);
                break;
            case 5:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didLongPressUserAvatar$10((ChatMessageCell) this.f$1, (TLRPC.User) this.f$2);
                break;
            case 6:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didLongPressChannelAvatar$17((ChatMessageCell) this.f$1, (TLRPC.Chat) this.f$2);
                break;
            case 7:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didLongPressToDoButton$32((TLObject) this.f$1, (TLRPC.TodoItem) this.f$2);
                break;
            case 8:
                ((ChatLinkActivity.SearchAdapter) this.f$0).lambda$updateSearchResults$3((ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
            case 9:
                ((ChatLinkActivity.SearchAdapter) this.f$0).lambda$processSearch$1((String) this.f$1, (ArrayList) this.f$2);
                break;
            case 10:
                ((DialogsActivity.AnonymousClass11) this.f$0).lambda$didSelectTab$5((boolean[]) this.f$1, (MessagesController.DialogFilter) this.f$2);
                break;
            case 11:
                ((FilterCreateActivity.LinkCell) this.f$0).lambda$deleteLink$5((TLRPC.TL_error) this.f$2, (Runnable) this.f$1);
                break;
            case 12:
                ((FiltersSetupActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$3((AlertDialog) this.f$1, (MessagesController.DialogFilter) this.f$2);
                break;
            case 13:
                ((LoginActivity.AnonymousClass7) this.f$0).lambda$beforeTextChanged$0((EditText) this.f$1, (AtomicReference) this.f$2);
                break;
            case 14:
                ((NotificationsCustomSettingsActivity.SearchAdapter) this.f$0).lambda$processSearch$2((String) this.f$1, (ArrayList) this.f$2);
                break;
            case 15:
                PassportActivity.AnonymousClass20.AnonymousClass1.lambda$run$3((PassportActivity.ErrorRunnable) this.f$0, (TLRPC.TL_error) this.f$1, (String) this.f$2);
                break;
            case 16:
                ((PassportActivity.AnonymousClass8) this.f$0).lambda$generateNewSecret$8((byte[]) this.f$1, (String) this.f$2);
                break;
            case 17:
                ((PaymentFormActivity.TelegramWebviewProxy) this.f$0).lambda$postEvent$0((String) this.f$1, (String) this.f$2);
                break;
            case 18:
                ProfileActivity.AnonymousClass18.lambda$didSetRights$0((ChannelAdminLogActivity) this.f$0, (TLRPC.User) this.f$1, (TLRPC.Chat) this.f$2);
                break;
            case 19:
                ((SessionsActivity.AnonymousClass4) this.f$0).lambda$hide$0((TLRPC.TL_error) this.f$1, (TLRPC.TL_authorization) this.f$2);
                break;
            case 20:
                ((SessionsActivity.AnonymousClass5) this.f$0).lambda$onSessionTerminated$0((TLRPC.TL_error) this.f$1, (TLRPC.TL_authorization) this.f$2);
                break;
            case 21:
                ((SessionsActivity.AnonymousClass6) this.f$0).lambda$processQr$4((String) this.f$2, (Runnable) this.f$1);
                break;
            case 22:
                ((TopicsFragment.MessagesSearchContainer) this.f$0).lambda$loadMessages$2((String) this.f$1, (TLObject) this.f$2);
                break;
            case 23:
                ((ArchivedStickersActivity) this.f$0).lambda$getStickers$1((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
            case 24:
                ((CacheControlActivity) this.f$0).lambda$cleanupDialogFiles$23((ArrayList) this.f$1, (AlertDialog) this.f$2);
                break;
            case 25:
                ((CachedMediaLayout) this.f$0).lambda$checkMessageObjectForAudio$3((CacheModel.FileInfo) this.f$1, (TLRPC.TL_documentAttributeAudio) this.f$2);
                break;
            case 26:
                ((CallLogActivity) this.f$0).lambda$getCalls$20((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
            case 27:
                CallLogActivity.lambda$showCallLinkSheet$32((String[]) this.f$0, (BottomSheet) this.f$1, (Theme.ResourcesProvider) this.f$2);
                break;
            case 28:
                ((ChangeUsernameActivity) this.f$0).lambda$saveName$6((AlertDialog) this.f$1, (TLRPC.User) this.f$2);
                break;
            default:
                ((ChannelAdminLogActivity) this.f$0).lambda$loadAdmins$21((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
        }
    }

    public PhotoViewer$86$$ExternalSyntheticLambda0(Object obj, Object obj2, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = runnable;
    }
}
