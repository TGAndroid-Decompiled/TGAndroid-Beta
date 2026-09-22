package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18021a = 0;
    public final int f18022b;
    public final long f18023c;
    public final int d;
    public final BaseController e;
    public final Object f18024f;
    public final Object h;
    public final Object f18025n;
    public final Object f18026r;
    public final Object f18027s;
    public final Object v;
    public final Object f18028w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18024f = document;
        this.h = secureDocument;
        this.f18025n = webFile;
        this.f18026r = tL_fileLocationToBeDeprecated;
        this.f18027s = imageLocation;
        this.v = obj;
        this.f18028w = str;
        this.f18023c = j3;
        this.f18022b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18021a) {
            case 0:
                int i10 = this.f18022b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18024f, (SecureDocument) this.h, (WebFile) this.f18025n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18026r, (ImageLocation) this.f18027s, this.v, (String) this.f18028w, this.f18023c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18022b, (a0.i) this.f18024f, (HashMap) this.h, (ArrayList) this.f18025n, this.f18023c, this.d, (a0.i) this.f18026r, (HashMap) this.f18027s, (a0.i) this.v, (Runnable) this.f18028w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18022b = i10;
        this.f18024f = iVar;
        this.h = hashMap;
        this.f18025n = arrayList;
        this.f18023c = j3;
        this.d = i11;
        this.f18026r = iVar2;
        this.f18027s = hashMap2;
        this.v = iVar3;
        this.f18028w = runnable;
    }
}
