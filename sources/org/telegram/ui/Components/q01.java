package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class q01 {
    public final long f27511a;
    public final TLRPC.InputFile f27512b;
    public final TLRPC.InputEncryptedFile f27513c;
    public final byte[] d;
    public final byte[] e;

    public q01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f27511a = j3;
        this.f27512b = inputFile;
        this.f27513c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
