package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p01 {
    public final long f27081a;
    public final TLRPC.InputFile f27082b;
    public final TLRPC.InputEncryptedFile f27083c;
    public final byte[] d;
    public final byte[] e;

    public p01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f27081a = j3;
        this.f27082b = inputFile;
        this.f27083c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
