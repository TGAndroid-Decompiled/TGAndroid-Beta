package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jw implements Runnable {
    public final int f34943a;
    public final wy f34944b;
    public final long f34945c;
    public final boolean d;

    public jw(wy wyVar, long j3, boolean z10, int i10) {
        this.f34943a = i10;
        this.f34944b = wyVar;
        this.f34945c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f34943a;
        boolean z10 = this.d;
        long j3 = this.f34945c;
        wy wyVar = this.f34944b;
        switch (i10) {
            case 0:
                wy wyVar2 = this.f34944b;
                ai.l9 storiesController = wyVar2.getMessagesController().getStoriesController();
                long j10 = this.f34945c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                o0.a aVar = new o0.a(3, (byte) 0);
                aVar.f15310b = new jw(wyVar2, j10, z11, 1);
                aVar.f15311c = new jw(wyVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User user = wyVar2.getMessagesController().getUser(Long.valueOf(j10));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = wyVar2.getMessagesController().getChat(Long.valueOf(-j10));
                    str = chat2.title;
                    chat = chat2;
                }
                if (wyVar2.e4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                wyVar2.S = org.telegram.ui.Components.vc.X().V(Collections.singletonList(chat), replaceTags, null, aVar).j();
                return;
            case 1:
                wyVar.getMessagesController().getStoriesController().i0(j3, !z10, false);
                return;
            default:
                wyVar.getMessagesController().getStoriesController().i0(j3, z10, true);
                return;
        }
    }
}
