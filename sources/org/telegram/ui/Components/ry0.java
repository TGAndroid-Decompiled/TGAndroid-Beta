package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ry0 {
    public final long f39386a;
    public final TLRPC.InputFile f39387b;
    public final TLRPC.InputEncryptedFile f39388c;
    public final byte[] d;
    public final byte[] f39389e;

    public ry0(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f39386a = j3;
        this.f39387b = inputFile;
        this.f39388c = inputEncryptedFile;
        this.d = bArr;
        this.f39389e = bArr2;
    }
}
