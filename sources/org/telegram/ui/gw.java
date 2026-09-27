package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class gw implements Runnable {
    public final int f34044a;
    public final ty f34045b;
    public final long f34046c;
    public final boolean d;

    public gw(ty tyVar, long j3, boolean z10, int i10) {
        this.f34044a = i10;
        this.f34045b = tyVar;
        this.f34046c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f34044a;
        boolean z10 = this.d;
        long j3 = this.f34046c;
        ty tyVar = this.f34045b;
        switch (i10) {
            case 0:
                ty tyVar2 = this.f34045b;
                ai.l9 storiesController = tyVar2.getMessagesController().getStoriesController();
                long j10 = this.f34046c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                o0.a aVar = new o0.a(3, (byte) 0);
                aVar.f15519b = new gw(tyVar2, j10, z11, 1);
                aVar.f15520c = new gw(tyVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User user = tyVar2.getMessagesController().getUser(Long.valueOf(j10));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = tyVar2.getMessagesController().getChat(Long.valueOf(-j10));
                    str = chat2.title;
                    chat = chat2;
                }
                if (tyVar2.n4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                tyVar2.S = org.telegram.ui.Components.xc.X().V(Collections.singletonList(chat), replaceTags, null, aVar).j();
                return;
            case 1:
                tyVar.getMessagesController().getStoriesController().i0(j3, !z10, false);
                return;
            default:
                tyVar.getMessagesController().getStoriesController().i0(j3, z10, true);
                return;
        }
    }
}
