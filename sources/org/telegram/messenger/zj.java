package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zj implements Runnable {
    public final int f26865a;
    public final Object f26866b;
    public final Object f26867c;
    public final Object d;
    public final Object f26868e;
    public final Object f26869f;
    public final Object h;

    public zj(File file, File file2, boolean[] zArr, c20 c20Var, org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr2) {
        this.f26865a = 4;
        this.f26869f = file;
        this.f26866b = file2;
        this.f26867c = zArr;
        this.d = c20Var;
        this.f26868e = u1Var;
        this.h = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zj.run():void");
    }

    public zj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f26865a = i7;
        this.f26866b = obj;
        this.f26867c = obj2;
        this.d = obj3;
        this.f26868e = obj4;
        this.f26869f = obj5;
        this.h = obj6;
    }

    public zj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.f26865a = i7;
        this.f26866b = obj;
        this.h = str;
        this.f26867c = str2;
        this.d = obj2;
        this.f26868e = obj3;
        this.f26869f = obj4;
    }

    public zj(gz gzVar, TLObject tLObject, TLRPC.InputMedia inputMedia, sy syVar, String str, ij ijVar) {
        this.f26865a = 11;
        this.f26866b = gzVar;
        this.f26867c = tLObject;
        this.d = inputMedia;
        this.f26868e = syVar;
        this.h = str;
        this.f26869f = ijVar;
    }

    public zj(gz gzVar, TLRPC.TL_photo tL_photo, ij ijVar, File file, sy syVar, String str) {
        this.f26865a = 10;
        this.f26866b = gzVar;
        this.f26867c = tL_photo;
        this.d = ijVar;
        this.f26869f = file;
        this.f26868e = syVar;
        this.h = str;
    }
}
