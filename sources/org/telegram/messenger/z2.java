package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18024a = 0;
    public final int f18025b;
    public final long f18026c;
    public final int d;
    public final BaseController e;
    public final Object f18027f;
    public final Object h;
    public final Object f18028n;
    public final Object f18029r;
    public final Object f18030s;
    public final Object v;
    public final Object f18031w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18027f = document;
        this.h = secureDocument;
        this.f18028n = webFile;
        this.f18029r = tL_fileLocationToBeDeprecated;
        this.f18030s = imageLocation;
        this.v = obj;
        this.f18031w = str;
        this.f18026c = j3;
        this.f18025b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18024a) {
            case 0:
                int i10 = this.f18025b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18027f, (SecureDocument) this.h, (WebFile) this.f18028n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18029r, (ImageLocation) this.f18030s, this.v, (String) this.f18031w, this.f18026c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18025b, (a0.i) this.f18027f, (HashMap) this.h, (ArrayList) this.f18028n, this.f18026c, this.d, (a0.i) this.f18029r, (HashMap) this.f18030s, (a0.i) this.v, (Runnable) this.f18031w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18025b = i10;
        this.f18027f = iVar;
        this.h = hashMap;
        this.f18028n = arrayList;
        this.f18026c = j3;
        this.d = i11;
        this.f18029r = iVar2;
        this.f18030s = hashMap2;
        this.v = iVar3;
        this.f18031w = runnable;
    }
}
