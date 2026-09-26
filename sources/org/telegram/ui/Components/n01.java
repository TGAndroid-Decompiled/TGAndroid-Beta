package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class n01 {
    public final long f26602a;
    public final TLRPC.InputFile f26603b;
    public final TLRPC.InputEncryptedFile f26604c;
    public final byte[] d;
    public final byte[] e;

    public n01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f26602a = j3;
        this.f26603b = inputFile;
        this.f26604c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
