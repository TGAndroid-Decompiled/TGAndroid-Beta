package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class af implements Runnable {
    public final int f37760a;
    public final wn f37761b;
    public final boolean f37762c;

    public af(wn wnVar, boolean z10, int i10) {
        this.f37760a = i10;
        this.f37761b = wnVar;
        this.f37762c = z10;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        int i11;
        int i12;
        switch (this.f37760a) {
            case 0:
                wn wnVar = this.f37761b;
                wnVar.e = wnVar.getMessagesController().getChat(Long.valueOf(wnVar.e.f22028id));
                if (wnVar.J9()) {
                    TLRPC.Chat chat = wnVar.e;
                    if (chat.in_news || !ChatObject.isNotInChat(chat)) {
                        wnVar.f45196lb = false;
                        if (this.f37762c && !wnVar.e.in_news) {
                            wnVar.N6(true, false, true);
                            return;
                        }
                        if (wnVar.e.in_news) {
                            i10 = R.string.ChannelAddedToNewsBulletin;
                        } else {
                            i10 = R.string.ChannelAddedToChatsBulletin;
                        }
                        wnVar.Mb(i10);
                    }
                }
                wnVar.yc(false);
                return;
            case 1:
                if (this.f37762c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f37761b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 2:
                wn wnVar2 = this.f37761b;
                NotificationsController notificationsController = wnVar2.getNotificationsController();
                long j10 = wnVar2.f45168j6;
                boolean z10 = this.f37762c;
                notificationsController.muteDialog(j10, 0L, !z10);
                wnVar2.yc(false);
                if (z10) {
                    i11 = R.string.ChannelNotifyBulletin;
                } else {
                    i11 = R.string.ChannelDoNotNotifyBulletin;
                }
                wnVar2.Mb(i11);
                return;
            case 3:
                wn wnVar3 = this.f37761b;
                MessagesController messagesController = wnVar3.getMessagesController();
                long j11 = wnVar3.f45168j6;
                boolean z11 = this.f37762c;
                messagesController.addDialogToFolder(j11, !z11 ? 1 : 0, 0, 0L);
                if (z11) {
                    i12 = R.string.ChannelUnarchivedBulletin;
                } else {
                    i12 = R.string.ChannelArchivedBulletin;
                }
                wnVar3.Mb(i12);
                return;
            default:
                this.f37761b.Pc(0, this.f37762c);
                return;
        }
    }
}
