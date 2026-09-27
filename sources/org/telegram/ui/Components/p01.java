package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p01 {
    public final long f27238a;
    public final TLRPC.InputFile f27239b;
    public final TLRPC.InputEncryptedFile f27240c;
    public final byte[] d;
    public final byte[] e;

    public p01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f27238a = j3;
        this.f27239b = inputFile;
        this.f27240c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
