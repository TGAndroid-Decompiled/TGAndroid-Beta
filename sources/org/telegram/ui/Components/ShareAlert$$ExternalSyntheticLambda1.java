package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ShareAlert$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public ShareAlert$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ShareAlert) this.f$0).lambda$selectDialog$21((AtomicReference) this.f$1, (NotificationCenter.NotificationCenterDelegate) this.f$2, (TLRPC.Dialog) this.f$3);
                break;
            case 1:
                ((EmojiView.EmojiSearchAdapter.AnonymousClass4.AnonymousClass1) this.f$0).lambda$onClick$0((AlertDialog[]) this.f$1, (TLObject) this.f$2, (BottomSheet.Builder) this.f$3);
                break;
            case 2:
                ((EmojiView.StickersSearchGridAdapter.AnonymousClass1) this.f$0).lambda$searchStickers$3((TLRPC.TL_messages_getStickers) this.f$1, (TLObject) this.f$2, (Runnable) this.f$3);
                break;
            case 3:
                ((SearchViewPager.AnonymousClass1) this.f$0).lambda$openSponsoredOptions$3((DialogsActivity) this.f$1, (Context) this.f$2, (ItemOptions) this.f$3);
                break;
            case 4:
                ((SearchViewPager.AnonymousClass1) this.f$0).lambda$openSponsoredOptions$5((DialogsActivity) this.f$1, (TLRPC.TL_sponsoredPeer) this.f$2, (ItemOptions) this.f$3);
                break;
            case 5:
                ((AIEditorAlert) this.f$0).lambda$new$3((TL_aicompose.TL_aiComposeTone) this.f$1, (Context) this.f$2, (Theme.ResourcesProvider) this.f$3);
                break;
            case 6:
                AlertsCreator.lambda$createScheduleDatePickerDialog$128((int[]) this.f$0, (int[]) this.f$1, (String[]) this.f$2, (TextView) this.f$3);
                break;
            case 7:
                AlertsCreator.lambda$showAddBrowserException$24((EditTextBoldCursor) this.f$0, (Utilities.Callback) this.f$1, (AlertDialog[]) this.f$2, (View) this.f$3);
                break;
            case 8:
                ((ChatActivityEnterView) this.f$0).lambda$createSenderSelectView$29((SimpleAvatarView) this.f$1, (int[]) this.f$2, (SenderSelectPopup.SenderView) this.f$3);
                break;
            case 9:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$new$3((Context) this.f$1, (View) this.f$2, (Theme.ResourcesProvider) this.f$3);
                break;
            case 10:
                FolderBottomSheet.lambda$onJoinButtonClicked$14((DialogsActivity) this.f$0, (Integer) this.f$1, (Utilities.Callback) this.f$2, (BaseFragment) this.f$3);
                break;
            case 11:
                ((FolderBottomSheet) this.f$0).lambda$onJoinButtonClicked$17((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (Utilities.Callback) this.f$3);
                break;
            case 12:
                ((GroupVoipInviteAlert) this.f$0).lambda$loadChatParticipants$3((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (TLRPC.TL_channels_getParticipants) this.f$3);
                break;
            case 13:
                ((LinkActionView) this.f$0).lambda$loadUsers$11((TLRPC.TL_chatInviteExported) this.f$1, (TLRPC.TL_error) this.f$2, (TLObject) this.f$3);
                break;
            case 14:
                ((MediaActivity) this.f$0).lambda$createView$8((boolean[]) this.f$1, (ArrayList) this.f$2, (boolean[]) this.f$3);
                break;
            case 15:
                MessagePrivateSeenView.lambda$showSheet$3((TLRPC.TL_error) this.f$0, (ButtonWithCounterView) this.f$1, (BottomSheet) this.f$2, (Runnable) this.f$3);
                break;
            case 16:
                ((StickersAlert) this.f$0).lambda$new$2((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (TLRPC.TL_messages_getAttachedStickers) this.f$3);
                break;
            case 17:
                ((StickersAlert) this.f$0).lambda$loadStickerSet$7((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (MediaDataController) this.f$3);
                break;
            case 18:
                ((TermsOfServiceView) this.f$0).lambda$new$0((AlertDialog) this.f$1, (TLObject) this.f$2, (TLRPC.TL_error) this.f$3);
                break;
            case 19:
                ((TopicsTabsView) this.f$0).lambda$onTabLongClick$11((ItemOptions) this.f$1, (MessagesController) this.f$2, (TLRPC.TL_forumTopic) this.f$3);
                break;
            default:
                ((TranslateAlert2) this.f$0).lambda$translate$4((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (TLRPC.TL_textWithEntities) this.f$3);
                break;
        }
    }
}
