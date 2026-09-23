package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ew implements Runnable {
    public final int f33026a;
    public final ry f33027b;
    public final long f33028c;
    public final boolean d;

    public ew(ry ryVar, long j3, boolean z10, int i10) {
        this.f33026a = i10;
        this.f33027b = ryVar;
        this.f33028c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f33026a;
        boolean z10 = this.d;
        long j3 = this.f33028c;
        ry ryVar = this.f33027b;
        switch (i10) {
            case 0:
                ry ryVar2 = this.f33027b;
                ai.l9 storiesController = ryVar2.getMessagesController().getStoriesController();
                long j10 = this.f33028c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                o0.a aVar = new o0.a(3, (byte) 0);
                aVar.f15275b = new ew(ryVar2, j10, z11, 1);
                aVar.f15276c = new ew(ryVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User user = ryVar2.getMessagesController().getUser(Long.valueOf(j10));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = ryVar2.getMessagesController().getChat(Long.valueOf(-j10));
                    str = chat2.title;
                    chat = chat2;
                }
                if (ryVar2.e4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                ryVar2.S = org.telegram.ui.Components.xc.X().V(Collections.singletonList(chat), replaceTags, null, aVar).j();
                return;
            case 1:
                ryVar.getMessagesController().getStoriesController().i0(j3, !z10, false);
                return;
            default:
                ryVar.getMessagesController().getStoriesController().i0(j3, z10, true);
                return;
        }
    }
}
