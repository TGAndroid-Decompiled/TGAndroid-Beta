package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class fy0 {
    public final long f33883a;
    public final TLRPC.InputFile f33884b;
    public final TLRPC.InputEncryptedFile f33885c;
    public final byte[] d;
    public final byte[] f33886e;

    public fy0(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f33883a = j10;
        this.f33884b = inputFile;
        this.f33885c = inputEncryptedFile;
        this.d = bArr;
        this.f33886e = bArr2;
    }
}
