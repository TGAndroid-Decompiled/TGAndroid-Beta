package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class y01 {
    public final long f32524a;
    public final TLRPC.InputFile f32525b;
    public final TLRPC.InputEncryptedFile f32526c;
    public final byte[] d;
    public final byte[] e;

    public y01(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f32524a = j10;
        this.f32525b = inputFile;
        this.f32526c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
