package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iw implements Runnable {
    public final int f37443a;
    public final uy f37444b;
    public final long f37445c;
    public final boolean d;

    public iw(uy uyVar, long j3, boolean z10, int i10) {
        this.f37443a = i10;
        this.f37444b = uyVar;
        this.f37445c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f37443a;
        boolean z10 = this.d;
        long j3 = this.f37445c;
        uy uyVar = this.f37444b;
        switch (i10) {
            case 0:
                uy uyVar2 = this.f37444b;
                bi.u8 storiesController = uyVar2.getMessagesController().getStoriesController();
                long j10 = this.f37445c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                o0.a aVar = new o0.a(3, (byte) 0);
                aVar.f16769b = new iw(uyVar2, j10, z11, 1);
                aVar.f16770c = new iw(uyVar2, j10, z11, 2);
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
                uyVar2.S = org.telegram.ui.Components.yc.X().V(Collections.singletonList(chat), replaceTags, null, aVar).j();
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
