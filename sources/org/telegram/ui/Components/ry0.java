package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ry0 {
    public final long f39342a;
    public final TLRPC.InputFile f39343b;
    public final TLRPC.InputEncryptedFile f39344c;
    public final byte[] d;
    public final byte[] f39345e;

    public ry0(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f39342a = j3;
        this.f39343b = inputFile;
        this.f39344c = inputEncryptedFile;
        this.d = bArr;
        this.f39345e = bArr2;
    }
}
