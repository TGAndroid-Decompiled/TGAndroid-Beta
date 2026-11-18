package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class py0 {
    public final long f38610a;
    public final TLRPC.InputFile f38611b;
    public final TLRPC.InputEncryptedFile f38612c;
    public final byte[] d;
    public final byte[] f38613e;

    public py0(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f38610a = j3;
        this.f38611b = inputFile;
        this.f38612c = inputEncryptedFile;
        this.d = bArr;
        this.f38613e = bArr2;
    }
}
