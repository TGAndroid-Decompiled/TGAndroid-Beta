package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class g11 {
    public final long f26573a;
    public final TLRPC.InputFile f26574b;
    public final TLRPC.InputEncryptedFile f26575c;
    public final byte[] d;
    public final byte[] f26576e;

    public g11(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f26573a = j3;
        this.f26574b = inputFile;
        this.f26575c = inputEncryptedFile;
        this.d = bArr;
        this.f26576e = bArr2;
    }
}
