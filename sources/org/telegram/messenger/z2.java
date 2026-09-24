package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18243a = 0;
    public final int f18244b;
    public final long f18245c;
    public final int d;
    public final BaseController e;
    public final Object f18246f;
    public final Object h;
    public final Object f18247n;
    public final Object f18248r;
    public final Object f18249s;
    public final Object v;
    public final Object f18250w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18246f = document;
        this.h = secureDocument;
        this.f18247n = webFile;
        this.f18248r = tL_fileLocationToBeDeprecated;
        this.f18249s = imageLocation;
        this.v = obj;
        this.f18250w = str;
        this.f18245c = j3;
        this.f18244b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18243a) {
            case 0:
                int i10 = this.f18244b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18246f, (SecureDocument) this.h, (WebFile) this.f18247n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18248r, (ImageLocation) this.f18249s, this.v, (String) this.f18250w, this.f18245c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18244b, (a0.i) this.f18246f, (HashMap) this.h, (ArrayList) this.f18247n, this.f18245c, this.d, (a0.i) this.f18248r, (HashMap) this.f18249s, (a0.i) this.v, (Runnable) this.f18250w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18244b = i10;
        this.f18246f = iVar;
        this.h = hashMap;
        this.f18247n = arrayList;
        this.f18245c = j3;
        this.d = i11;
        this.f18248r = iVar2;
        this.f18249s = hashMap2;
        this.v = iVar3;
        this.f18250w = runnable;
    }
}
