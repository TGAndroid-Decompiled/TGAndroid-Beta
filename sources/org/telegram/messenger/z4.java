package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z4 implements Runnable {
    public final int f19963a = 0;
    public final long f19964b;
    public final int f19965c;
    public final Object d;
    public final Object f19966e;
    public final Object f19967f;
    public final Object h;
    public final Object f19968n;

    public z4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f19965c = i10;
        this.d = str;
        this.f19966e = inputFile;
        this.f19967f = inputEncryptedFile;
        this.h = bArr;
        this.f19968n = bArr2;
        this.f19964b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19963a) {
            case 0:
                long j3 = this.f19964b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f19965c, (String) this.d, (TLRPC.InputFile) this.f19966e, (TLRPC.InputEncryptedFile) this.f19967f, (byte[]) this.h, (byte[]) this.f19968n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.f19966e, (TLRPC.Chat) this.f19967f, (Runnable[]) this.h, this.f19964b, this.f19965c, (MessagesController.MessagesLoadedCallback) this.f19968n);
                return;
            default:
                ((MessagesController) this.f19966e).lambda$reloadWebPages$185((HashMap) this.f19967f, (String) this.d, (TLObject) this.h, (a0.i) this.f19968n, this.f19964b, this.f19965c);
                return;
        }
    }

    public z4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f19966e = messagesController;
        this.f19967f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f19968n = iVar;
        this.f19964b = j3;
        this.f19965c = i10;
    }

    public z4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f19966e = zArr;
        this.f19967f = chat;
        this.h = runnableArr;
        this.f19964b = j3;
        this.f19965c = i10;
        this.f19968n = messagesLoadedCallback;
    }
}
