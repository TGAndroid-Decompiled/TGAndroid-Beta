package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yv extends TLObject {
    public final zv f28189a;
    public final TLRPC.TL_secureFile f28190b;
    public final String f28191c;
    public TLRPC.TL_inputFile d;
    public final byte[] f28192e;
    public final byte[] f28193f;
    public int f28194i;

    public yv(zv zvVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f28189a = zvVar;
        this.f28190b = tL_secureFile;
        this.f28191c = str;
        this.f28193f = bArr;
        this.f28192e = bArr2;
    }
}
