package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yv extends TLObject {
    public final zv f28215a;
    public final TLRPC.TL_secureFile f28216b;
    public final String f28217c;
    public TLRPC.TL_inputFile d;
    public final byte[] f28218e;
    public final byte[] f28219f;
    public int f28220i;

    public yv(zv zvVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f28215a = zvVar;
        this.f28216b = tL_secureFile;
        this.f28217c = str;
        this.f28219f = bArr;
        this.f28218e = bArr2;
    }
}
