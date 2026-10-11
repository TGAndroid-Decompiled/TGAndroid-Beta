package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class fw implements Runnable {
    public final int f37822a;
    public final sy f37823b;
    public final long f37824c;
    public final boolean d;

    public fw(sy syVar, long j3, boolean z10, int i10) {
        this.f37822a = i10;
        this.f37823b = syVar;
        this.f37824c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f37822a;
        boolean z10 = this.d;
        long j3 = this.f37824c;
        sy syVar = this.f37823b;
        switch (i10) {
            case 0:
                sy syVar2 = this.f37823b;
                ai.m9 storiesController = syVar2.getMessagesController().getStoriesController();
                long j10 = this.f37824c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                n6.k kVar = new n6.k(5);
                kVar.f16765b = new fw(syVar2, j10, z11, 1);
                kVar.f16766c = new fw(syVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User user = syVar2.getMessagesController().getUser(Long.valueOf(j10));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = syVar2.getMessagesController().getChat(Long.valueOf(-j10));
                    str = chat2.title;
                    chat = chat2;
                }
                if (syVar2.b4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                syVar2.S = org.telegram.ui.Components.ad.X().V(Collections.singletonList(chat), replaceTags, null, kVar).j();
                return;
            case 1:
                syVar.getMessagesController().getStoriesController().i0(j3, !z10, false);
                return;
            default:
                syVar.getMessagesController().getStoriesController().i0(j3, z10, true);
                return;
        }
    }
}
