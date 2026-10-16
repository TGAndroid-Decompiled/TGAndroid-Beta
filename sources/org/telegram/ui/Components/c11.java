package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class c11 {
    public final long f23614a;
    public final TLRPC.InputFile f23615b;
    public final TLRPC.InputEncryptedFile f23616c;
    public final byte[] d;
    public final byte[] e;

    public c11(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f23614a = j10;
        this.f23615b = inputFile;
        this.f23616c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
