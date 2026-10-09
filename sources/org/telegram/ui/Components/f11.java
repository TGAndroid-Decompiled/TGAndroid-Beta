package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class f11 {
    public final long f26212a;
    public final TLRPC.InputFile f26213b;
    public final TLRPC.InputEncryptedFile f26214c;
    public final byte[] d;
    public final byte[] f26215e;

    public f11(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f26212a = j3;
        this.f26213b = inputFile;
        this.f26214c = inputEncryptedFile;
        this.d = bArr;
        this.f26215e = bArr2;
    }
}
