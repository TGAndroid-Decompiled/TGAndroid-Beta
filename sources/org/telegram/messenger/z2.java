package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f22295a = 0;
    public final int f22296b;
    public final long f22297c;
    public final int d;
    public final BaseController f22298e;
    public final Object f22299f;
    public final Object h;
    public final Object f22300n;
    public final Object f22301r;
    public final Object f22302s;
    public final Object v;
    public final Object f22303w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.f22298e = fileLoader;
        this.f22299f = document;
        this.h = secureDocument;
        this.f22300n = webFile;
        this.f22301r = tL_fileLocationToBeDeprecated;
        this.f22302s = imageLocation;
        this.v = obj;
        this.f22303w = str;
        this.f22297c = j10;
        this.f22296b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f22295a) {
            case 0:
                int i10 = this.f22296b;
                int i11 = this.d;
                ((FileLoader) this.f22298e).lambda$loadFile$13((TLRPC.Document) this.f22299f, (SecureDocument) this.h, (WebFile) this.f22300n, (TLRPC.TL_fileLocationToBeDeprecated) this.f22301r, (ImageLocation) this.f22302s, this.v, (String) this.f22303w, this.f22297c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f22298e).lambda$processLoadedStickers$105(this.f22296b, (a0.h) this.f22299f, (HashMap) this.h, (ArrayList) this.f22300n, this.f22297c, this.d, (a0.h) this.f22301r, (HashMap) this.f22302s, (a0.h) this.v, (Runnable) this.f22303w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.f22298e = mediaDataController;
        this.f22296b = i10;
        this.f22299f = hVar;
        this.h = hashMap;
        this.f22300n = arrayList;
        this.f22297c = j10;
        this.d = i11;
        this.f22301r = hVar2;
        this.f22302s = hashMap2;
        this.v = hVar3;
        this.f22303w = runnable;
    }
}
