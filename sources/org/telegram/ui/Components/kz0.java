package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class kz0 {
    public final long f27943a;
    public final TLRPC.InputFile f27944b;
    public final TLRPC.InputEncryptedFile f27945c;
    public final byte[] d;
    public final byte[] e;

    public kz0(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f27943a = j10;
        this.f27944b = inputFile;
        this.f27945c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
