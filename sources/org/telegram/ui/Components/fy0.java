package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class fy0 {
    public final long f33658a;
    public final TLRPC.InputFile f33659b;
    public final TLRPC.InputEncryptedFile f33660c;
    public final byte[] d;
    public final byte[] f33661e;

    public fy0(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f33658a = j3;
        this.f33659b = inputFile;
        this.f33660c = inputEncryptedFile;
        this.d = bArr;
        this.f33661e = bArr2;
    }
}
