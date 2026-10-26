package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class af implements Runnable {
    public final int f37727a;
    public final un f37728b;
    public final boolean f37729c;

    public af(un unVar, boolean z10, int i10) {
        this.f37727a = i10;
        this.f37728b = unVar;
        this.f37729c = z10;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        int i11;
        int i12;
        switch (this.f37727a) {
            case 0:
                un unVar = this.f37728b;
                unVar.e = unVar.getMessagesController().getChat(Long.valueOf(unVar.e.f22027id));
                if (unVar.G9()) {
                    TLRPC.Chat chat = unVar.e;
                    if (chat.in_news || !ChatObject.isNotInChat(chat)) {
                        unVar.f44280hb = false;
                        if (this.f37729c && !unVar.e.in_news) {
                            unVar.L6(true, false, true);
                            return;
                        }
                        if (unVar.e.in_news) {
                            i10 = R.string.ChannelAddedToNewsBulletin;
                        } else {
                            i10 = R.string.ChannelAddedToChatsBulletin;
                        }
                        unVar.Ib(i10);
                    }
                }
                unVar.uc(false);
                return;
            case 1:
                if (this.f37729c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f37728b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 2:
                un unVar2 = this.f37728b;
                NotificationsController notificationsController = unVar2.getNotificationsController();
                long j10 = unVar2.f44252f6;
                boolean z10 = this.f37729c;
                notificationsController.muteDialog(j10, 0L, !z10);
                unVar2.uc(false);
                if (z10) {
                    i11 = R.string.ChannelNotifyBulletin;
                } else {
                    i11 = R.string.ChannelDoNotNotifyBulletin;
                }
                unVar2.Ib(i11);
                return;
            case 3:
                un unVar3 = this.f37728b;
                MessagesController messagesController = unVar3.getMessagesController();
                long j11 = unVar3.f44252f6;
                boolean z11 = this.f37729c;
                messagesController.addDialogToFolder(j11, !z11 ? 1 : 0, 0, 0L);
                if (z11) {
                    i12 = R.string.ChannelUnarchivedBulletin;
                } else {
                    i12 = R.string.ChannelArchivedBulletin;
                }
                unVar3.Ib(i12);
                return;
            default:
                this.f37728b.Lc(0, this.f37729c);
                return;
        }
    }
}
