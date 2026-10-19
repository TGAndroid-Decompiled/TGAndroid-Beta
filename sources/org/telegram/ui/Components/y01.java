package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class y01 {
    public final long f32522a;
    public final TLRPC.InputFile f32523b;
    public final TLRPC.InputEncryptedFile f32524c;
    public final byte[] d;
    public final byte[] e;

    public y01(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f32522a = j10;
        this.f32523b = inputFile;
        this.f32524c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
