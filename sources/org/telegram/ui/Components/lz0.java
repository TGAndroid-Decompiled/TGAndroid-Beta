package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class lz0 {
    public final long f28310a;
    public final TLRPC.InputFile f28311b;
    public final TLRPC.InputEncryptedFile f28312c;
    public final byte[] d;
    public final byte[] e;

    public lz0(long j10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f28310a = j10;
        this.f28311b = inputFile;
        this.f28312c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
