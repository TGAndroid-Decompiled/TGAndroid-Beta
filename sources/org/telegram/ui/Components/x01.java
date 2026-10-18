package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class x01 {
    public final long f32273a;
    public final TLRPC.InputFile f32274b;
    public final TLRPC.InputEncryptedFile f32275c;
    public final byte[] d;
    public final byte[] e;

    public x01(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f32273a = j10;
        this.f32274b = inputFile;
        this.f32275c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
