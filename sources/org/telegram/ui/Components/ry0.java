package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ry0 {
    public final long f39387a;
    public final TLRPC.InputFile f39388b;
    public final TLRPC.InputEncryptedFile f39389c;
    public final byte[] d;
    public final byte[] f39390e;

    public ry0(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f39387a = j3;
        this.f39388b = inputFile;
        this.f39389c = inputEncryptedFile;
        this.d = bArr;
        this.f39390e = bArr2;
    }
}
