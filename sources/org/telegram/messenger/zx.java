package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zx implements Runnable {
    public final int f26938a = 0;
    public final gz f26939b;
    public final boolean f26940c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f26941e;
    public final TLObject f26942f;
    public final ij h;
    public final HashMap f26943n;
    public final String f26944r;
    public final TLObject f26945s;

    public zx(gz gzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, String str, HashMap hashMap, boolean z9, TLObject tLObject2) {
        this.f26939b = gzVar;
        this.d = tL_error;
        this.f26941e = message;
        this.f26942f = tLObject;
        this.h = ijVar;
        this.f26944r = str;
        this.f26943n = hashMap;
        this.f26940c = z9;
        this.f26945s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zx.run():void");
    }

    public zx(gz gzVar, boolean z9, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f26939b = gzVar;
        this.f26940c = z9;
        this.d = tL_error;
        this.f26941e = message;
        this.f26942f = tLObject;
        this.h = ijVar;
        this.f26943n = hashMap;
        this.f26944r = str;
        this.f26945s = tLObject2;
    }
}
