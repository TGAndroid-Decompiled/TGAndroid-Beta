package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z4 implements Runnable {
    public final int f19959a = 0;
    public final long f19960b;
    public final int f19961c;
    public final Object d;
    public final Object f19962e;
    public final Object f19963f;
    public final Object h;
    public final Object f19964n;

    public z4(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f19961c = i10;
        this.d = str;
        this.f19962e = inputFile;
        this.f19963f = inputEncryptedFile;
        this.h = bArr;
        this.f19964n = bArr2;
        this.f19960b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19959a) {
            case 0:
                long j3 = this.f19960b;
                ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(this.f19961c, (String) this.d, (TLRPC.InputFile) this.f19962e, (TLRPC.InputEncryptedFile) this.f19963f, (byte[]) this.h, (byte[]) this.f19964n, j3);
                return;
            case 1:
                ((MessagesController) this.d).lambda$ensureMessagesLoaded$462((boolean[]) this.f19962e, (TLRPC.Chat) this.f19963f, (Runnable[]) this.h, this.f19960b, this.f19961c, (MessagesController.MessagesLoadedCallback) this.f19964n);
                return;
            default:
                ((MessagesController) this.f19962e).lambda$reloadWebPages$185((HashMap) this.f19963f, (String) this.d, (TLObject) this.h, (a0.i) this.f19964n, this.f19960b, this.f19961c);
                return;
        }
    }

    public z4(MessagesController messagesController, HashMap hashMap, String str, TLObject tLObject, a0.i iVar, long j3, int i10) {
        this.f19962e = messagesController;
        this.f19963f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f19964n = iVar;
        this.f19960b = j3;
        this.f19961c = i10;
    }

    public z4(MessagesController messagesController, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.d = messagesController;
        this.f19962e = zArr;
        this.f19963f = chat;
        this.h = runnableArr;
        this.f19960b = j3;
        this.f19961c = i10;
        this.f19964n = messagesLoadedCallback;
    }
}
