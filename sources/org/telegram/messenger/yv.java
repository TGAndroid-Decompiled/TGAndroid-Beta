package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yv extends TLObject {
    public final zv f28287a;
    public final TLRPC.TL_secureFile f28288b;
    public final String f28289c;
    public TLRPC.TL_inputFile d;
    public final byte[] f28290e;
    public final byte[] f28291f;
    public int f28292i;

    public yv(zv zvVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f28287a = zvVar;
        this.f28288b = tL_secureFile;
        this.f28289c = str;
        this.f28291f = bArr;
        this.f28290e = bArr2;
    }
}
