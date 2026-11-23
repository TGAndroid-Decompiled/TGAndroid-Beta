package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zv extends TLObject {
    public final aw f28347a;
    public final TLRPC.TL_secureFile f28348b;
    public final String f28349c;
    public TLRPC.TL_inputFile d;
    public final byte[] f28350e;
    public final byte[] f28351f;
    public int f28352i;

    public zv(aw awVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f28347a = awVar;
        this.f28348b = tL_secureFile;
        this.f28349c = str;
        this.f28351f = bArr;
        this.f28350e = bArr2;
    }
}
