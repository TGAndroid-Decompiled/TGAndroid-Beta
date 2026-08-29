package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z4 implements Runnable {
    public final int f22307a = 0;
    public final long f22308b;
    public final int f22309c;
    public final Object d;
    public final Object f22310e;
    public final Object f22311f;
    public final Object h;
    public final Object f22312n;

    public z4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f22309c = i10;
        this.d = str;
        this.f22310e = inputFile;
        this.f22311f = inputEncryptedFile;
        this.h = bArr;
        this.f22312n = bArr2;
        this.f22308b = j10;
    }

    @Override
    public final void run() {
        switch (this.f22307a) {
            case 0:
                long j10 = this.f22308b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f22309c, (String) this.d, (TLRPC.InputFile) this.f22310e, (TLRPC.InputEncryptedFile) this.f22311f, (byte[]) this.h, (byte[]) this.f22312n, j10);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.f22310e, (TLRPC.Chat) this.f22311f, (Runnable[]) this.h, this.f22308b, this.f22309c, (MessagesController.MessagesLoadedCallback) this.f22312n);
                return;
            default:
                ((MessagesController) this.f22310e).lambda$reloadWebPages$186((HashMap) this.f22311f, (String) this.d, (TLObject) this.h, (a0.h) this.f22312n, this.f22308b, this.f22309c);
                return;
        }
    }

    public z4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.f22310e = messagesController;
        this.f22311f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f22312n = hVar;
        this.f22308b = j10;
        this.f22309c = i10;
    }

    public z4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f22310e = zArr;
        this.f22311f = chat;
        this.h = runnableArr;
        this.f22308b = j10;
        this.f22309c = i10;
        this.f22312n = messagesLoadedCallback;
    }
}
