package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class fy0 {
    public final long f33714a;
    public final TLRPC.InputFile f33715b;
    public final TLRPC.InputEncryptedFile f33716c;
    public final byte[] d;
    public final byte[] f33717e;

    public fy0(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f33714a = j3;
        this.f33715b = inputFile;
        this.f33716c = inputEncryptedFile;
        this.d = bArr;
        this.f33717e = bArr2;
    }
}
