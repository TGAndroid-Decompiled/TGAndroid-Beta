package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zv extends TLObject {
    public final aw f28383a;
    public final TLRPC.TL_secureFile f28384b;
    public final String f28385c;
    public TLRPC.TL_inputFile d;
    public final byte[] f28386e;
    public final byte[] f28387f;
    public int f28388i;

    public zv(aw awVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f28383a = awVar;
        this.f28384b = tL_secureFile;
        this.f28385c = str;
        this.f28387f = bArr;
        this.f28386e = bArr2;
    }
}
