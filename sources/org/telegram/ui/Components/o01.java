package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class o01 {
    public final long f26769a;
    public final TLRPC.InputFile f26770b;
    public final TLRPC.InputEncryptedFile f26771c;
    public final byte[] d;
    public final byte[] e;

    public o01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f26769a = j3;
        this.f26770b = inputFile;
        this.f26771c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
