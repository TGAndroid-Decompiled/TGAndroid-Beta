package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class z4 implements Runnable {

    public final int f22296a = 0;

    public final long f22297b;

    public final int f22298c;
    public final Object d;

    public final Object f22299e;

    public final Object f22300f;
    public final Object h;

    public final Object f22301n;

    public z4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f22298c = i10;
        this.d = str;
        this.f22299e = inputFile;
        this.f22300f = inputEncryptedFile;
        this.h = bArr;
        this.f22301n = bArr2;
        this.f22297b = j10;
    }

    @Override
    public final void run() {
        switch (this.f22296a) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f22298c, (String) this.d, (TLRPC.InputFile) this.f22299e, (TLRPC.InputEncryptedFile) this.f22300f, (byte[]) this.h, (byte[]) this.f22301n, this.f22297b);
                break;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$459((boolean[]) this.f22299e, (TLRPC.Chat) this.f22300f, (Runnable[]) this.h, this.f22297b, this.f22298c, (MessagesController.MessagesLoadedCallback) this.f22301n);
                break;
            default:
                ((MessagesController) this.f22299e).lambda$reloadWebPages$186((HashMap) this.f22300f, (String) this.d, (TLObject) this.h, (a0.h) this.f22301n, this.f22297b, this.f22298c);
                break;
        }
    }

    public z4(MessagesController messagesController, HashMap map, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.f22299e = messagesController;
        this.f22300f = map;
        this.d = str;
        this.h = tLObject;
        this.f22301n = hVar;
        this.f22297b = j10;
        this.f22298c = i10;
    }

    public z4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f22299e = zArr;
        this.f22300f = chat;
        this.h = runnableArr;
        this.f22297b = j10;
        this.f22298c = i10;
        this.f22301n = messagesLoadedCallback;
    }
}
