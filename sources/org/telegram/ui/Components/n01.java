package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class n01 {
    public final long f26595a;
    public final TLRPC.InputFile f26596b;
    public final TLRPC.InputEncryptedFile f26597c;
    public final byte[] d;
    public final byte[] e;

    public n01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f26595a = j3;
        this.f26596b = inputFile;
        this.f26597c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
