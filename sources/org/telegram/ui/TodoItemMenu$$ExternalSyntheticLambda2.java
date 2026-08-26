package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class TodoItemMenu$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public TodoItemMenu$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$2 = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((TodoItemMenu) this.f$0).lambda$setupMessageOptions$11((Utilities.Callback) this.f$1, this.f$2);
                break;
            case 1:
                ((ChatActivity.ChatActivityAdapter.AnonymousClass2) this.f$0).lambda$didPressReplyMessage$1((ChatActionCell) this.f$1, this.f$2);
                break;
            case 2:
                ((DialogsActivity.AnonymousClass37) this.f$0).lambda$onRemoveDialogAction$0(this.f$2, (TLRPC.Dialog) this.f$1);
                break;
            case 3:
                ((DialogsActivity.SwipeController) this.f$0).lambda$onSwiped$2((TLRPC.Dialog) this.f$1, this.f$2);
                break;
            case 4:
                ((PhotoViewer.FirstFrameView) this.f$0).lambda$checkFromPlayer$2((Uri) this.f$1, this.f$2);
                break;
            case 5:
                ((PhotoViewer.FirstFrameView) this.f$0).lambda$checkFromPlayer$0(this.f$2, (Bitmap) this.f$1);
                break;
            case 6:
                ((ProfileActivity.AnonymousClass15.AnonymousClass1) this.f$0).lambda$onSend$0((LongSparseArray) this.f$1, this.f$2);
                break;
            case 7:
                ((ProfileActivity.AnonymousClass38) this.f$0).lambda$onSend$0((LongSparseArray) this.f$1, this.f$2);
                break;
            case 8:
                ((ProfileActivity.ListAdapter) this.f$0).lambda$onBindViewHolder$1((RecyclerView.ViewHolder) this.f$1, this.f$2);
                break;
            case 9:
                ((SettingsActivity.AnonymousClass8) this.f$0).lambda$onSend$0((LongSparseArray) this.f$1, this.f$2);
                break;
            case 10:
                ((WallpapersListActivity.SearchAdapter) this.f$0).lambda$searchImages$3(this.f$2, (TLObject) this.f$1);
                break;
            case 11:
                AccountFrozenAlert.lambda$show$0(this.f$2, (Context) this.f$0, (BottomSheet[]) this.f$1);
                break;
            case 12:
                ((ArticleViewer) this.f$0).lambda$processSearch$50((String) this.f$1, this.f$2);
                break;
            case 13:
                ((ArticleViewer) this.f$0).lambda$openWebpageUrlInternal$13(this.f$2, (Browser.Progress) this.f$1);
                break;
            case 14:
                ArticleViewer.lambda$joinChannel$62(this.f$2, (TLRPC.TL_chatInviteJoinResultWebView) this.f$0, (TLRPC.Chat) this.f$1);
                break;
            case 15:
                CallLogActivity.lambda$showCallLinkSheet$23((String) this.f$0, this.f$2, (BottomSheet[]) this.f$1);
                break;
            case 16:
                ((ChatActivity) this.f$0).lambda$didReceivedNotification5$185((ArrayList) this.f$1, this.f$2);
                break;
            case 17:
                ((ChatActivity) this.f$0).lambda$pollAddOptionModeStart$482(this.f$2, (EditTextBoldCursor) this.f$1);
                break;
            case 18:
                ((GroupCallActivity) this.f$0).lambda$inviteUserToCall$65((AlertDialog[]) this.f$1, this.f$2);
                break;
            case 19:
                LaunchActivity.lambda$runLinkRequest$115(this.f$2, (int[]) this.f$0, (LinkManager$$ExternalSyntheticLambda2) this.f$1);
                break;
            case 20:
                ((MessageAuthorView) this.f$0).lambda$new$0((TLObject) this.f$1, this.f$2);
                break;
            case 21:
                ((PassportActivity) this.f$0).lambda$processSelectedFiles$70((SecureDocument) this.f$1, this.f$2);
                break;
            case 22:
                ((PaymentFormActivity) this.f$0).lambda$onActivityResultFragment$39(this.f$2, (Intent) this.f$1);
                break;
            case 23:
                ((PollItemMenu) this.f$0).lambda$setupMessageOptions$12((Utilities.Callback) this.f$1, this.f$2);
                break;
            case 24:
                ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$78((String) this.f$1, this.f$2);
                break;
            case 25:
                ReportBottomSheet.lambda$openSponsored$19((Runnable) this.f$0, (BulletinFactory) this.f$1, this.f$2);
                break;
            default:
                ReportBottomSheet.lambda$openSponsoredPeer$26((BaseFragment) this.f$0, this.f$2, (Runnable) this.f$1);
                break;
        }
    }

    public TodoItemMenu$$ExternalSyntheticLambda2(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
    }

    public TodoItemMenu$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
