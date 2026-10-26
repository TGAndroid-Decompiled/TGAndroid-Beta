package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k11 {
    public final long f29776a;
    public final TLRPC.InputFile f29777b;
    public final TLRPC.InputEncryptedFile f29778c;
    public final byte[] d;
    public final byte[] e;

    public k11(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f29776a = j10;
        this.f29777b = inputFile;
        this.f29778c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
