package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dw implements Runnable {
    public final int f33200a;
    public final qy f33201b;
    public final long f33202c;
    public final boolean d;

    public dw(qy qyVar, long j3, boolean z10, int i10) {
        this.f33200a = i10;
        this.f33201b = qyVar;
        this.f33202c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f33200a;
        boolean z10 = this.d;
        long j3 = this.f33202c;
        qy qyVar = this.f33201b;
        switch (i10) {
            case 0:
                qy qyVar2 = this.f33201b;
                ai.l9 storiesController = qyVar2.getMessagesController().getStoriesController();
                long j10 = this.f33202c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                o0.a aVar = new o0.a(3, (byte) 0);
                aVar.f15482b = new dw(qyVar2, j10, z11, 1);
                aVar.f15483c = new dw(qyVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User user = qyVar2.getMessagesController().getUser(Long.valueOf(j10));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = qyVar2.getMessagesController().getChat(Long.valueOf(-j10));
                    str = chat2.title;
                    chat = chat2;
                }
                if (qyVar2.e4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                qyVar2.S = org.telegram.ui.Components.xc.X().V(Collections.singletonList(chat), replaceTags, null, aVar).j();
                return;
            case 1:
                qyVar.getMessagesController().getStoriesController().i0(j3, !z10, false);
                return;
            default:
                qyVar.getMessagesController().getStoriesController().i0(j3, z10, true);
                return;
        }
    }
}
