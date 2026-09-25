package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class n01 {
    public final long f26603a;
    public final TLRPC.InputFile f26604b;
    public final TLRPC.InputEncryptedFile f26605c;
    public final byte[] d;
    public final byte[] e;

    public n01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f26603a = j3;
        this.f26604b = inputFile;
        this.f26605c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
