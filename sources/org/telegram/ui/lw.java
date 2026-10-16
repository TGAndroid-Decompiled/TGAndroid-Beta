package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lw implements Runnable {
    public final int f37846a;
    public final yy f37847b;
    public final long f37848c;
    public final boolean d;

    public lw(yy yyVar, long j10, boolean z10, int i10) {
        this.f37846a = i10;
        this.f37847b = yyVar;
        this.f37848c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f37846a;
        boolean z10 = this.d;
        long j10 = this.f37848c;
        yy yyVar = this.f37847b;
        switch (i10) {
            case 0:
                yy yyVar2 = this.f37847b;
                bi.x8 storiesController = yyVar2.getMessagesController().getStoriesController();
                long j11 = this.f37848c;
                boolean z11 = this.d;
                storiesController.i0(j11, z11, false);
                n3.b bVar = new n3.b(6, false);
                bVar.f15703b = new lw(yyVar2, j11, z11, 1);
                bVar.f15704c = new lw(yyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user = yyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = yyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                if (yyVar2.c4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                yyVar2.S = org.telegram.ui.Components.zc.X().V(Collections.singletonList(chat), replaceTags, null, bVar).j();
                return;
            case 1:
                yyVar.getMessagesController().getStoriesController().i0(j10, !z10, false);
                return;
            default:
                yyVar.getMessagesController().getStoriesController().i0(j10, z10, true);
                return;
        }
    }
}
