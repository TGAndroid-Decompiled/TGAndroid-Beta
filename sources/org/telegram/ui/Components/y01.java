package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class y01 {
    public final long f33018a;
    public final TLRPC.InputFile f33019b;
    public final TLRPC.InputEncryptedFile f33020c;
    public final byte[] d;
    public final byte[] f33021e;

    public y01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f33018a = j3;
        this.f33019b = inputFile;
        this.f33020c = inputEncryptedFile;
        this.d = bArr;
        this.f33021e = bArr2;
    }
}
