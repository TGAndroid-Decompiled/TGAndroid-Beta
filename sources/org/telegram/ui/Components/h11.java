package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class h11 {
    public final long f26882a;
    public final TLRPC.InputFile f26883b;
    public final TLRPC.InputEncryptedFile f26884c;
    public final byte[] d;
    public final byte[] f26885e;

    public h11(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f26882a = j3;
        this.f26883b = inputFile;
        this.f26884c = inputEncryptedFile;
        this.d = bArr;
        this.f26885e = bArr2;
    }
}
