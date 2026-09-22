package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class q01 {
    public final long f27471a;
    public final TLRPC.InputFile f27472b;
    public final TLRPC.InputEncryptedFile f27473c;
    public final byte[] d;
    public final byte[] e;

    public q01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f27471a = j3;
        this.f27472b = inputFile;
        this.f27473c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
