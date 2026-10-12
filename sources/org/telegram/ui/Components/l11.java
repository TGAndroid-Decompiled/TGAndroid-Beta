package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l11 {
    public final long f27985a;
    public final TLRPC.InputFile f27986b;
    public final TLRPC.InputEncryptedFile f27987c;
    public final byte[] d;
    public final byte[] f27988e;

    public l11(long j3, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.f27985a = j3;
        this.f27986b = inputFile;
        this.f27987c = inputEncryptedFile;
        this.d = bArr;
        this.f27988e = bArr2;
    }
}
