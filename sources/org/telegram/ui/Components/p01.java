package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p01 {
    public final long f27216a;
    public final TLRPC.InputFile f27217b;
    public final TLRPC.InputEncryptedFile f27218c;
    public final byte[] d;
    public final byte[] e;

    public p01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f27216a = j3;
        this.f27217b = inputFile;
        this.f27218c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
