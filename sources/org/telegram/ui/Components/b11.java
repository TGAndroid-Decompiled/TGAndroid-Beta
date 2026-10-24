package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class b11 {
    public final long f24870a;
    public final TLRPC.InputFile f24871b;
    public final TLRPC.InputEncryptedFile f24872c;
    public final byte[] d;
    public final byte[] e;

    public b11(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f24870a = j10;
        this.f24871b = inputFile;
        this.f24872c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
