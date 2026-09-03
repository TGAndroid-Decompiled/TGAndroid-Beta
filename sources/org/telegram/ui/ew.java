package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ew implements Runnable {
    public final int f33867a;
    public final qy f33868b;
    public final long f33869c;
    public final boolean d;

    public ew(qy qyVar, long j10, boolean z4, int i10) {
        this.f33867a = i10;
        this.f33868b = qyVar;
        this.f33869c = j10;
        this.d = z4;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f33867a;
        boolean z4 = this.d;
        long j10 = this.f33869c;
        qy qyVar = this.f33868b;
        switch (i10) {
            case 0:
                qy qyVar2 = this.f33868b;
                nh.t6 storiesController = qyVar2.getMessagesController().getStoriesController();
                long j11 = this.f33869c;
                boolean z10 = this.d;
                storiesController.i0(j11, z10, false);
                n7.qa qaVar = new n7.qa(11);
                qaVar.f14687b = new ew(qyVar2, j11, z10, 1);
                qaVar.f14688c = new ew(qyVar2, j11, z10, 2);
                if (j11 >= 0) {
                    TLRPC.User user = qyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = qyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                if (qyVar2.e4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                qyVar2.P = org.telegram.ui.Components.qc.X().V(Collections.singletonList(chat), replaceTags, null, qaVar).j();
                return;
            case 1:
                qyVar.getMessagesController().getStoriesController().i0(j10, !z4, false);
                return;
            default:
                qyVar.getMessagesController().getStoriesController().i0(j10, z4, true);
                return;
        }
    }
}
