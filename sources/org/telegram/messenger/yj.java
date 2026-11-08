package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yj implements Runnable {
    public final int f26661a;
    public final Object f26662b;
    public final Object f26663c;
    public final Object d;
    public final Object f26664e;
    public final Object f26665f;
    public final Object h;

    public yj(File file, File file2, boolean[] zArr, c20 c20Var, org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr2) {
        this.f26661a = 4;
        this.f26665f = file;
        this.f26662b = file2;
        this.f26663c = zArr;
        this.d = c20Var;
        this.f26664e = u1Var;
        this.h = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yj.run():void");
    }

    public yj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f26661a = i7;
        this.f26662b = obj;
        this.f26663c = obj2;
        this.d = obj3;
        this.f26664e = obj4;
        this.f26665f = obj5;
        this.h = obj6;
    }

    public yj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.f26661a = i7;
        this.f26662b = obj;
        this.h = str;
        this.f26663c = str2;
        this.d = obj2;
        this.f26664e = obj3;
        this.f26665f = obj4;
    }

    public yj(gz gzVar, TLObject tLObject, TLRPC.InputMedia inputMedia, sy syVar, String str, ij ijVar) {
        this.f26661a = 11;
        this.f26662b = gzVar;
        this.f26663c = tLObject;
        this.d = inputMedia;
        this.f26664e = syVar;
        this.h = str;
        this.f26665f = ijVar;
    }

    public yj(gz gzVar, TLRPC.TL_photo tL_photo, ij ijVar, File file, sy syVar, String str) {
        this.f26661a = 10;
        this.f26662b = gzVar;
        this.f26663c = tL_photo;
        this.d = ijVar;
        this.f26665f = file;
        this.f26664e = syVar;
        this.h = str;
    }
}
