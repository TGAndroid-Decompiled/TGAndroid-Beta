package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class iy0 {
    public final long f35777a;
    public final TLRPC.InputFile f35778b;
    public final TLRPC.InputEncryptedFile f35779c;
    public final byte[] d;
    public final byte[] f35780e;

    public iy0(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f35777a = j3;
        this.f35778b = inputFile;
        this.f35779c = inputEncryptedFile;
        this.d = bArr;
        this.f35780e = bArr2;
    }
}
