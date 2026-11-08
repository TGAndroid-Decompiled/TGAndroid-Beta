package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class gy0 {
    public final long f34039a;
    public final TLRPC.InputFile f34040b;
    public final TLRPC.InputEncryptedFile f34041c;
    public final byte[] d;
    public final byte[] f34042e;

    public gy0(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f34039a = j3;
        this.f34040b = inputFile;
        this.f34041c = inputEncryptedFile;
        this.d = bArr;
        this.f34042e = bArr2;
    }
}
