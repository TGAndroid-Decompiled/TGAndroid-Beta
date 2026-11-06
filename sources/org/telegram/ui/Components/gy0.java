package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class gy0 {
    public final long f34107a;
    public final TLRPC.InputFile f34108b;
    public final TLRPC.InputEncryptedFile f34109c;
    public final byte[] d;
    public final byte[] f34110e;

    public gy0(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f34107a = j3;
        this.f34108b = inputFile;
        this.f34109c = inputEncryptedFile;
        this.d = bArr;
        this.f34110e = bArr2;
    }
}
