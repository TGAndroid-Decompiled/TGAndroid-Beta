package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class g11 {
    public final long f26622a;
    public final TLRPC.InputFile f26623b;
    public final TLRPC.InputEncryptedFile f26624c;
    public final byte[] d;
    public final byte[] f26625e;

    public g11(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f26622a = j3;
        this.f26623b = inputFile;
        this.f26624c = inputEncryptedFile;
        this.d = bArr;
        this.f26625e = bArr2;
    }
}
