package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class b11 {
    public final long f23670a;
    public final TLRPC.InputFile f23671b;
    public final TLRPC.InputEncryptedFile f23672c;
    public final byte[] d;
    public final byte[] e;

    public b11(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f23670a = j10;
        this.f23671b = inputFile;
        this.f23672c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
