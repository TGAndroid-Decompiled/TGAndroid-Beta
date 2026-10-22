package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class z01 {
    public final long f32800a;
    public final TLRPC.InputFile f32801b;
    public final TLRPC.InputEncryptedFile f32802c;
    public final byte[] d;
    public final byte[] e;

    public z01(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f32800a = j10;
        this.f32801b = inputFile;
        this.f32802c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
