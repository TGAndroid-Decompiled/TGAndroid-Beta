package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class z01 {
    public final long f32796a;
    public final TLRPC.InputFile f32797b;
    public final TLRPC.InputEncryptedFile f32798c;
    public final byte[] d;
    public final byte[] e;

    public z01(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f32796a = j10;
        this.f32797b = inputFile;
        this.f32798c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
