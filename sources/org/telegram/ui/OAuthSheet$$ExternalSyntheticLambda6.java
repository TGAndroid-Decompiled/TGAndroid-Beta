package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class OAuthSheet$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public OAuthSheet$$ExternalSyntheticLambda6(int i, TLRPC.Chat chat) {
        this.$r8$classId = 14;
        this.f$1 = i;
        this.f$0 = chat;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.lambda$handle$5((Utilities.Callback) this.f$0, this.f$1);
                break;
            case 1:
                ((AutoDeleteMessagesActivity.AnonymousClass3) this.f$0).lambda$didSelectDate$0(this.f$1);
                break;
            case 2:
                ((ChannelMonetizationLayout.ChannelTransactionsView.PageAdapter) this.f$0).lambda$createView$0(this.f$1);
                break;
            case 3:
                ((ChatActivity.AnonymousClass12) this.f$0).lambda$onItemClick$0(this.f$1);
                break;
            case 4:
                ((ChatActivity.AnonymousClass127) this.f$0).lambda$end$0(this.f$1);
                break;
            case 5:
                ((ChatActivity.AnonymousClass128) this.f$0).lambda$end$0(this.f$1);
                break;
            case 6:
                ((ChatActivity.AnonymousClass129) this.f$0).lambda$end$0(this.f$1);
                break;
            case 7:
                ((ChatActivity.AnonymousClass130) this.f$0).lambda$end$0(this.f$1);
                break;
            case 8:
                ((ChatActivity.AnonymousClass131) this.f$0).lambda$end$0(this.f$1);
                break;
            case 9:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressInstantButton$51(this.f$1);
                break;
            case 10:
                ((GroupCallActivity.AnonymousClass6) this.f$0).lambda$onItemClick$10(this.f$1);
                break;
            case 11:
                ((PeerColorActivity.Page.AnonymousClass4) this.f$0).lambda$onBindViewHolder$1(this.f$1);
                break;
            case 12:
                ((ProfileActivity.ListAdapter.AnonymousClass9) this.f$0).lambda$onYesClick$0(this.f$1);
                break;
            case 13:
                ((QrActivity.ThemeListViewController) this.f$0).lambda$onItemClicked$1(this.f$1);
                break;
            case 14:
                ArticleViewer.lambda$joinChannel$64(this.f$1, (TLRPC.Chat) this.f$0);
                break;
            case 15:
                ((ChatActivity.ChatActivityFragmentView) this.f$0).lambda$onMeasure$1(this.f$1);
                break;
            case 16:
                ((GroupCallActivity) this.f$0).lambda$new$29(this.f$1);
                break;
            case 17:
                ((GroupCreateActivity) this.f$0).lambda$showItemsAnimated$11(this.f$1);
                break;
            case 18:
                ((LocationActivity) this.f$0).lambda$fixLayoutInternal$43(this.f$1);
                break;
            case 19:
                ((LoginActivity.LoginActivityEmailCodeView) this.f$0).lambda$animateSuccess$24(this.f$1);
                break;
            case 20:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$animateSuccess$38(this.f$1);
                break;
            case 21:
                ((NotificationsSettingsActivity) this.f$0).lambda$createView$8(this.f$1);
                break;
            case 22:
                ((PhotoViewer) this.f$0).lambda$redraw$154(this.f$1);
                break;
            case 23:
                ((ProfileActivity) this.f$0).lambda$editNotes$124(this.f$1);
                break;
            case 24:
                ((SessionsActivity) this.f$0).lambda$createView$13(this.f$1);
                break;
            default:
                ((VoIPFragment) this.f$0).lambda$onSignalBarsCountChanged$4(this.f$1);
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda6(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }
}
