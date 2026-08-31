package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dw implements Runnable {
    public final int f36318a;
    public final py f36319b;
    public final long f36320c;
    public final boolean d;

    public dw(py pyVar, long j10, boolean z4, int i10) {
        this.f36318a = i10;
        this.f36319b = pyVar;
        this.f36320c = j10;
        this.d = z4;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f36318a;
        boolean z4 = this.d;
        long j10 = this.f36320c;
        py pyVar = this.f36319b;
        switch (i10) {
            case 0:
                py pyVar2 = this.f36319b;
                oh.t6 storiesController = pyVar2.getMessagesController().getStoriesController();
                long j11 = this.f36320c;
                boolean z10 = this.d;
                storiesController.i0(j11, z10, false);
                n7.qa qaVar = new n7.qa(11);
                qaVar.f15699b = new dw(pyVar2, j11, z10, 1);
                qaVar.f15700c = new dw(pyVar2, j11, z10, 2);
                if (j11 >= 0) {
                    TLRPC.User user = pyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = pyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                if (pyVar2.e4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                pyVar2.P = org.telegram.ui.Components.qc.X().V(Collections.singletonList(chat), replaceTags, null, qaVar).j();
                return;
            case 1:
                pyVar.getMessagesController().getStoriesController().i0(j10, !z4, false);
                return;
            default:
                pyVar.getMessagesController().getStoriesController().i0(j10, z4, true);
                return;
        }
    }
}
