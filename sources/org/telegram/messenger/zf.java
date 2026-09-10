package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zf implements Runnable {
    public final int f17162a = 0;
    public final boolean f17163b;
    public final int f17164c;
    public final int d;
    public final long e;
    public final Object f17165f;
    public final Object h;

    public zf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f17165f = messagesStorage;
        this.e = j3;
        this.h = arrayList;
        this.f17163b = z10;
        this.f17164c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17162a) {
            case 0:
                int i10 = this.f17164c;
                int i11 = this.d;
                ((MessagesStorage) this.f17165f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f17163b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17165f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f20850f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null) {
                    rfVar.setText("");
                }
                org.telegram.ui.Components.qg qgVar = chatActivityEnterView.Y2;
                if (qgVar != null) {
                    qgVar.I(charSequence, this.f17163b, this.f17164c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public zf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f17165f = chatActivityEnterView;
        this.h = charSequence;
        this.f17163b = z10;
        this.f17164c = i10;
        this.d = i11;
        this.e = j3;
    }
}
