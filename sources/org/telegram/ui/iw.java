package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iw implements Runnable {
    public final int f34712a;
    public final uy f34713b;
    public final long f34714c;
    public final boolean d;

    public iw(uy uyVar, long j3, boolean z10, int i10) {
        this.f34712a = i10;
        this.f34713b = uyVar;
        this.f34714c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f34712a;
        boolean z10 = this.d;
        long j3 = this.f34714c;
        uy uyVar = this.f34713b;
        switch (i10) {
            case 0:
                uy uyVar2 = this.f34713b;
                ai.l9 storiesController = uyVar2.getMessagesController().getStoriesController();
                long j10 = this.f34714c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                m5.e eVar = new m5.e((char) 0, 7);
                eVar.f14968b = new iw(uyVar2, j10, z11, 1);
                eVar.f14969c = new iw(uyVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User user = uyVar2.getMessagesController().getUser(Long.valueOf(j10));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = uyVar2.getMessagesController().getChat(Long.valueOf(-j10));
                    str = chat2.title;
                    chat = chat2;
                }
                if (uyVar2.e4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                uyVar2.S = org.telegram.ui.Components.xc.X().V(Collections.singletonList(chat), replaceTags, null, eVar).j();
                return;
            case 1:
                uyVar.getMessagesController().getStoriesController().i0(j3, !z10, false);
                return;
            default:
                uyVar.getMessagesController().getStoriesController().i0(j3, z10, true);
                return;
        }
    }
}
