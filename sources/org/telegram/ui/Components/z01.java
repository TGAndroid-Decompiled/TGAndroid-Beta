package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class z01 {
    public final long f32801a;
    public final TLRPC.InputFile f32802b;
    public final TLRPC.InputEncryptedFile f32803c;
    public final byte[] d;
    public final byte[] e;

    public z01(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f32801a = j10;
        this.f32802b = inputFile;
        this.f32803c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
