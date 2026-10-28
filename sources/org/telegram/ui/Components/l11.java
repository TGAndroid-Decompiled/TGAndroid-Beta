package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l11 {
    public final long f30092a;
    public final TLRPC.InputFile f30093b;
    public final TLRPC.InputEncryptedFile f30094c;
    public final byte[] d;
    public final byte[] e;

    public l11(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f30092a = j10;
        this.f30093b = inputFile;
        this.f30094c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
