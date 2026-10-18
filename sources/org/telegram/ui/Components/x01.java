package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class x01 {
    public final long f32266a;
    public final TLRPC.InputFile f32267b;
    public final TLRPC.InputEncryptedFile f32268c;
    public final byte[] d;
    public final byte[] e;

    public x01(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f32266a = j10;
        this.f32267b = inputFile;
        this.f32268c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
