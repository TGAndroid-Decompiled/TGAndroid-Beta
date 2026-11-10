package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class gy0 {
    public final long f34091a;
    public final TLRPC.InputFile f34092b;
    public final TLRPC.InputEncryptedFile f34093c;
    public final byte[] d;
    public final byte[] f34094e;

    public gy0(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f34091a = j3;
        this.f34092b = inputFile;
        this.f34093c = inputEncryptedFile;
        this.d = bArr;
        this.f34094e = bArr2;
    }
}
