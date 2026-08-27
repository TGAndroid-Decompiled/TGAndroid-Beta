package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

public final class ir implements Runnable {

    public final int f39153a;

    public final kr f39154b;

    public final String f39155c;

    public ir(kr krVar, String str, int i10) {
        this.f39153a = i10;
        this.f39154b = krVar;
        this.f39155c = str;
    }

    @Override
    public final void run() {
        yf yfVar;
        switch (this.f39153a) {
            case 0:
                kr krVar = this.f39154b;
                krVar.getClass();
                AndroidUtilities.runOnUIThread(new ir(krVar, this.f39155c, 1));
                break;
            default:
                kr krVar2 = this.f39154b;
                krVar2.f39840n = null;
                lr lrVar = krVar2.f39845y;
                TLRPC.Chat chat = lrVar.f40217r;
                int i10 = lrVar.f40181a1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || lrVar.f40220s == null) ? null : new ArrayList(lrVar.f40220s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(lrVar.getContactsController().contacts) : null;
                String str = this.f39155c;
                if (arrayList == null && arrayList2 == null) {
                    krVar2.f39842s = false;
                    yfVar = null;
                } else {
                    yfVar = new yf(krVar2, str, arrayList, arrayList2, 9);
                }
                krVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(lrVar.f40217r) ? lrVar.J : 0L, false, lrVar.K, 1, 0L, yfVar);
                break;
        }
    }
}
