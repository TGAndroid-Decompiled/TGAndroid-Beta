package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class y01 {
    public final long f33017a;
    public final TLRPC.InputFile f33018b;
    public final TLRPC.InputEncryptedFile f33019c;
    public final byte[] d;
    public final byte[] f33020e;

    public y01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f33017a = j3;
        this.f33018b = inputFile;
        this.f33019c = inputEncryptedFile;
        this.d = bArr;
        this.f33020e = bArr2;
    }
}
