package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p01 {
    public final long f27215a;
    public final TLRPC.InputFile f27216b;
    public final TLRPC.InputEncryptedFile f27217c;
    public final byte[] d;
    public final byte[] e;

    public p01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f27215a = j3;
        this.f27216b = inputFile;
        this.f27217c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
