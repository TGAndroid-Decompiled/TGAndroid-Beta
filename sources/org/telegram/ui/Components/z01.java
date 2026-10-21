package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class z01 {
    public final long f32797a;
    public final TLRPC.InputFile f32798b;
    public final TLRPC.InputEncryptedFile f32799c;
    public final byte[] d;
    public final byte[] e;

    public z01(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f32797a = j10;
        this.f32798b = inputFile;
        this.f32799c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
