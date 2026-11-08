package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zx implements Runnable {
    public final int f26934a = 0;
    public final gz f26935b;
    public final boolean f26936c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f26937e;
    public final TLObject f26938f;
    public final ij h;
    public final HashMap f26939n;
    public final String f26940r;
    public final TLObject f26941s;

    public zx(gz gzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, String str, HashMap hashMap, boolean z9, TLObject tLObject2) {
        this.f26935b = gzVar;
        this.d = tL_error;
        this.f26937e = message;
        this.f26938f = tLObject;
        this.h = ijVar;
        this.f26940r = str;
        this.f26939n = hashMap;
        this.f26936c = z9;
        this.f26941s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zx.run():void");
    }

    public zx(gz gzVar, boolean z9, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f26935b = gzVar;
        this.f26936c = z9;
        this.d = tL_error;
        this.f26937e = message;
        this.f26938f = tLObject;
        this.h = ijVar;
        this.f26939n = hashMap;
        this.f26940r = str;
        this.f26941s = tLObject2;
    }
}
