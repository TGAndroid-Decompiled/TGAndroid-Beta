package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class y01 {
    public final long f33024a;
    public final TLRPC.InputFile f33025b;
    public final TLRPC.InputEncryptedFile f33026c;
    public final byte[] d;
    public final byte[] f33027e;

    public y01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f33024a = j3;
        this.f33025b = inputFile;
        this.f33026c = inputEncryptedFile;
        this.d = bArr;
        this.f33027e = bArr2;
    }
}
