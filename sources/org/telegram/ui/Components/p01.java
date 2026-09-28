package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p01 {
    public final long f27214a;
    public final TLRPC.InputFile f27215b;
    public final TLRPC.InputEncryptedFile f27216c;
    public final byte[] d;
    public final byte[] e;

    public p01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f27214a = j3;
        this.f27215b = inputFile;
        this.f27216c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
