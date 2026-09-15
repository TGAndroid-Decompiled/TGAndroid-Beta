package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class hw implements Runnable {
    public final int f34350a;
    public final uy f34351b;
    public final long f34352c;
    public final boolean d;

    public hw(uy uyVar, long j3, boolean z10, int i10) {
        this.f34350a = i10;
        this.f34351b = uyVar;
        this.f34352c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f34350a;
        boolean z10 = this.d;
        long j3 = this.f34352c;
        uy uyVar = this.f34351b;
        switch (i10) {
            case 0:
                uy uyVar2 = this.f34351b;
                ai.l9 storiesController = uyVar2.getMessagesController().getStoriesController();
                long j10 = this.f34352c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                o0.a aVar = new o0.a(3, (byte) 0);
                aVar.f15300b = new hw(uyVar2, j10, z11, 1);
                aVar.f15301c = new hw(uyVar2, j10, z11, 2);
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
                uyVar2.S = org.telegram.ui.Components.vc.X().V(Collections.singletonList(chat), replaceTags, null, aVar).j();
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
