package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cw implements Runnable {
    public final int f33439a;
    public final oy f33440b;
    public final long f33441c;
    public final boolean d;

    public cw(oy oyVar, long j10, boolean z4, int i10) {
        this.f33439a = i10;
        this.f33440b = oyVar;
        this.f33441c = j10;
        this.d = z4;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f33439a;
        boolean z4 = this.d;
        long j10 = this.f33441c;
        oy oyVar = this.f33440b;
        switch (i10) {
            case 0:
                oy oyVar2 = this.f33440b;
                nh.t6 storiesController = oyVar2.getMessagesController().getStoriesController();
                long j11 = this.f33441c;
                boolean z10 = this.d;
                storiesController.i0(j11, z10, false);
                n7.qa qaVar = new n7.qa(11);
                qaVar.f14702b = new cw(oyVar2, j11, z10, 1);
                qaVar.f14703c = new cw(oyVar2, j11, z10, 2);
                if (j11 >= 0) {
                    TLRPC.User user = oyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = oyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                if (oyVar2.e4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                oyVar2.P = org.telegram.ui.Components.qc.X().V(Collections.singletonList(chat), replaceTags, null, qaVar).j();
                return;
            case 1:
                oyVar.getMessagesController().getStoriesController().i0(j10, !z4, false);
                return;
            default:
                oyVar.getMessagesController().getStoriesController().i0(j10, z4, true);
                return;
        }
    }
}
