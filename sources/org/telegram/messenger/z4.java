package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z4 implements Runnable {
    public final int f19996a = 0;
    public final long f19997b;
    public final int f19998c;
    public final Object d;
    public final Object f19999e;
    public final Object f20000f;
    public final Object h;
    public final Object f20001n;

    public z4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f19998c = i10;
        this.d = str;
        this.f19999e = inputFile;
        this.f20000f = inputEncryptedFile;
        this.h = bArr;
        this.f20001n = bArr2;
        this.f19997b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19996a) {
            case 0:
                long j3 = this.f19997b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f19998c, (String) this.d, (TLRPC.InputFile) this.f19999e, (TLRPC.InputEncryptedFile) this.f20000f, (byte[]) this.h, (byte[]) this.f20001n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.f19999e, (TLRPC.Chat) this.f20000f, (Runnable[]) this.h, this.f19997b, this.f19998c, (MessagesController.MessagesLoadedCallback) this.f20001n);
                return;
            default:
                ((MessagesController) this.f19999e).lambda$reloadWebPages$185((HashMap) this.f20000f, (String) this.d, (TLObject) this.h, (a0.i) this.f20001n, this.f19997b, this.f19998c);
                return;
        }
    }

    public z4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f19999e = messagesController;
        this.f20000f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f20001n = iVar;
        this.f19997b = j3;
        this.f19998c = i10;
    }

    public z4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f19999e = zArr;
        this.f20000f = chat;
        this.h = runnableArr;
        this.f19997b = j3;
        this.f19998c = i10;
        this.f20001n = messagesLoadedCallback;
    }
}
