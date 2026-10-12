package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l11 {
    public final long f28000a;
    public final TLRPC.InputFile f28001b;
    public final TLRPC.InputEncryptedFile f28002c;
    public final byte[] d;
    public final byte[] f28003e;

    public l11(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f28000a = j3;
        this.f28001b = inputFile;
        this.f28002c = inputEncryptedFile;
        this.d = bArr;
        this.f28003e = bArr2;
    }
}
