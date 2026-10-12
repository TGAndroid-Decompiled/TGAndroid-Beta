package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iw implements Runnable {
    public final int f39017a;
    public final vy f39018b;
    public final long f39019c;
    public final boolean d;

    public iw(vy vyVar, long j3, boolean z10, int i10) {
        this.f39017a = i10;
        this.f39018b = vyVar;
        this.f39019c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder replaceTags;
        int i10 = this.f39017a;
        boolean z10 = this.d;
        long j3 = this.f39019c;
        vy vyVar = this.f39018b;
        switch (i10) {
            case 0:
                vy vyVar2 = this.f39018b;
                ai.m9 storiesController = vyVar2.getMessagesController().getStoriesController();
                long j10 = this.f39019c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                n6.k kVar = new n6.k(5);
                kVar.f16432b = new iw(vyVar2, j10, z11, 1);
                kVar.f16433c = new iw(vyVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User user = vyVar2.getMessagesController().getUser(Long.valueOf(j10));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = vyVar2.getMessagesController().getChat(Long.valueOf(-j10));
                    str = chat2.title;
                    chat = chat2;
                }
                if (vyVar2.b4()) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15)));
                }
                vyVar2.S = org.telegram.ui.Components.zc.X().V(Collections.singletonList(chat), replaceTags, null, kVar).j();
                return;
            case 1:
                vyVar.getMessagesController().getStoriesController().i0(j3, !z10, false);
                return;
            default:
                vyVar.getMessagesController().getStoriesController().i0(j3, z10, true);
                return;
        }
    }
}
