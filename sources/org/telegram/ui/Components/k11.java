package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k11 {
    public final long f29774a;
    public final TLRPC.InputFile f29775b;
    public final TLRPC.InputEncryptedFile f29776c;
    public final byte[] d;
    public final byte[] e;

    public k11(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f29774a = j10;
        this.f29775b = inputFile;
        this.f29776c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
