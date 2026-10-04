package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19960a = 0;
    public final int f19961b;
    public final long f19962c;
    public final int d;
    public final BaseController f19963e;
    public final Object f19964f;
    public final Object h;
    public final Object f19965n;
    public final Object f19966r;
    public final Object f19967s;
    public final Object v;
    public final Object f19968w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f19963e = fileLoader;
        this.f19964f = document;
        this.h = secureDocument;
        this.f19965n = webFile;
        this.f19966r = tL_fileLocationToBeDeprecated;
        this.f19967s = imageLocation;
        this.v = obj;
        this.f19968w = str;
        this.f19962c = j3;
        this.f19961b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19960a) {
            case 0:
                int i10 = this.f19961b;
                int i11 = this.d;
                ((FileLoader) this.f19963e).lambda$loadFile$13((TLRPC.Document) this.f19964f, (SecureDocument) this.h, (WebFile) this.f19965n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19966r, (ImageLocation) this.f19967s, this.v, (String) this.f19968w, this.f19962c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f19963e).lambda$processLoadedStickers$105(this.f19961b, (a0.i) this.f19964f, (HashMap) this.h, (ArrayList) this.f19965n, this.f19962c, this.d, (a0.i) this.f19966r, (HashMap) this.f19967s, (a0.i) this.v, (Runnable) this.f19968w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f19963e = mediaDataController;
        this.f19961b = i10;
        this.f19964f = iVar;
        this.h = hashMap;
        this.f19965n = arrayList;
        this.f19962c = j3;
        this.d = i11;
        this.f19966r = iVar2;
        this.f19967s = hashMap2;
        this.v = iVar3;
        this.f19968w = runnable;
    }
}
