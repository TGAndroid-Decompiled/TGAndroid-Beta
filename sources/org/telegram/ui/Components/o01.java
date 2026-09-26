package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class o01 {
    public final long f26897a;
    public final TLRPC.InputFile f26898b;
    public final TLRPC.InputEncryptedFile f26899c;
    public final byte[] d;
    public final byte[] e;

    public o01(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f26897a = j3;
        this.f26898b = inputFile;
        this.f26899c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}
