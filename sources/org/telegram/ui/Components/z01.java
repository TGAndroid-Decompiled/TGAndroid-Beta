package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class z01 {
    public final long f33391a;
    public final TLRPC.InputFile f33392b;
    public final TLRPC.InputEncryptedFile f33393c;
    public final byte[] d;
    public final byte[] f33394e;

    public z01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f33391a = j3;
        this.f33392b = inputFile;
        this.f33393c = inputEncryptedFile;
        this.d = bArr;
        this.f33394e = bArr2;
    }
}
