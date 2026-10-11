package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z4 implements Runnable {
    public final int f19960a = 0;
    public final long f19961b;
    public final int f19962c;
    public final Object d;
    public final Object f19963e;
    public final Object f19964f;
    public final Object h;
    public final Object f19965n;

    public z4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f19962c = i10;
        this.d = str;
        this.f19963e = inputFile;
        this.f19964f = inputEncryptedFile;
        this.h = bArr;
        this.f19965n = bArr2;
        this.f19961b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19960a) {
            case 0:
                long j3 = this.f19961b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f19962c, (String) this.d, (TLRPC.InputFile) this.f19963e, (TLRPC.InputEncryptedFile) this.f19964f, (byte[]) this.h, (byte[]) this.f19965n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.f19963e, (TLRPC.Chat) this.f19964f, (Runnable[]) this.h, this.f19961b, this.f19962c, (MessagesController.MessagesLoadedCallback) this.f19965n);
                return;
            default:
                ((MessagesController) this.f19963e).lambda$reloadWebPages$185((HashMap) this.f19964f, (String) this.d, (TLObject) this.h, (a0.i) this.f19965n, this.f19961b, this.f19962c);
                return;
        }
    }

    public z4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f19963e = messagesController;
        this.f19964f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f19965n = iVar;
        this.f19961b = j3;
        this.f19962c = i10;
    }

    public z4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f19963e = zArr;
        this.f19964f = chat;
        this.h = runnableArr;
        this.f19961b = j3;
        this.f19962c = i10;
        this.f19965n = messagesLoadedCallback;
    }
}
