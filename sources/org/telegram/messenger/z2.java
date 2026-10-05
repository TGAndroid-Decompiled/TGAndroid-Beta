package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19965a = 0;
    public final int f19966b;
    public final long f19967c;
    public final int d;
    public final BaseController f19968e;
    public final Object f19969f;
    public final Object h;
    public final Object f19970n;
    public final Object f19971r;
    public final Object f19972s;
    public final Object v;
    public final Object f19973w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f19968e = fileLoader;
        this.f19969f = document;
        this.h = secureDocument;
        this.f19970n = webFile;
        this.f19971r = tL_fileLocationToBeDeprecated;
        this.f19972s = imageLocation;
        this.v = obj;
        this.f19973w = str;
        this.f19967c = j3;
        this.f19966b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19965a) {
            case 0:
                int i10 = this.f19966b;
                int i11 = this.d;
                ((FileLoader) this.f19968e).lambda$loadFile$13((TLRPC.Document) this.f19969f, (SecureDocument) this.h, (WebFile) this.f19970n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19971r, (ImageLocation) this.f19972s, this.v, (String) this.f19973w, this.f19967c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f19968e).lambda$processLoadedStickers$105(this.f19966b, (a0.i) this.f19969f, (HashMap) this.h, (ArrayList) this.f19970n, this.f19967c, this.d, (a0.i) this.f19971r, (HashMap) this.f19972s, (a0.i) this.v, (Runnable) this.f19973w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f19968e = mediaDataController;
        this.f19966b = i10;
        this.f19969f = iVar;
        this.h = hashMap;
        this.f19970n = arrayList;
        this.f19967c = j3;
        this.d = i11;
        this.f19971r = iVar2;
        this.f19972s = hashMap2;
        this.v = iVar3;
        this.f19973w = runnable;
    }
}
