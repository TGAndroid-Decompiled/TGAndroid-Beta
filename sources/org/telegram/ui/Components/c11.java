package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class c11 {
    public final long f25196a;
    public final TLRPC.InputFile f25197b;
    public final TLRPC.InputEncryptedFile f25198c;
    public final byte[] d;
    public final byte[] e;

    public c11(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f25196a = j10;
        this.f25197b = inputFile;
        this.f25198c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
