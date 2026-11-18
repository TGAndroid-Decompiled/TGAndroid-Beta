package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yv extends TLObject {
    public final zv f28187a;
    public final TLRPC.TL_secureFile f28188b;
    public final String f28189c;
    public TLRPC.TL_inputFile d;
    public final byte[] f28190e;
    public final byte[] f28191f;
    public int f28192i;

    public yv(zv zvVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f28187a = zvVar;
        this.f28188b = tL_secureFile;
        this.f28189c = str;
        this.f28191f = bArr;
        this.f28190e = bArr2;
    }
}
