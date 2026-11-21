package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ry0 {
    public final long f39377a;
    public final TLRPC.InputFile f39378b;
    public final TLRPC.InputEncryptedFile f39379c;
    public final byte[] d;
    public final byte[] f39380e;

    public ry0(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f39377a = j3;
        this.f39378b = inputFile;
        this.f39379c = inputEncryptedFile;
        this.d = bArr;
        this.f39380e = bArr2;
    }
}
