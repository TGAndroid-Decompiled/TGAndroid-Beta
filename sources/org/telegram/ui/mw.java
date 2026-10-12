package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mw implements Runnable {
    public final int f38363a;
    public final yy f38364b;
    public final long f38365c;
    public final boolean d;

    public mw(yy yyVar, long j10, boolean z10, int i10) {
        this.f38363a = i10;
        this.f38364b = yyVar;
        this.f38365c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f38363a;
        boolean z10 = this.d;
        long j10 = this.f38365c;
        yy yyVar = this.f38364b;
        switch (i10) {
            case 0:
                yy yyVar2 = this.f38364b;
                bi.x8 storiesController = yyVar2.getMessagesController().getStoriesController();
                long j11 = this.f38365c;
                boolean z11 = this.d;
                storiesController.i0(j11, z11, false);
                n6.o oVar = new n6.o(5, false);
                oVar.f16131b = new mw(yyVar2, j11, z11, 1);
                oVar.f16132c = new mw(yyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user = yyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = yyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                if (yyVar2.b4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                yyVar2.S = org.telegram.ui.Components.zc.X().V(Collections.singletonList(chat), replaceTags, null, oVar).j();
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
