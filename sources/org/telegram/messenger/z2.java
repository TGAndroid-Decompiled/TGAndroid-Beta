package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18258a = 0;
    public final int f18259b;
    public final long f18260c;
    public final int d;
    public final BaseController e;
    public final Object f18261f;
    public final Object h;
    public final Object f18262n;
    public final Object f18263r;
    public final Object f18264s;
    public final Object v;
    public final Object f18265w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18261f = document;
        this.h = secureDocument;
        this.f18262n = webFile;
        this.f18263r = tL_fileLocationToBeDeprecated;
        this.f18264s = imageLocation;
        this.v = obj;
        this.f18265w = str;
        this.f18260c = j3;
        this.f18259b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18258a) {
            case 0:
                int i10 = this.f18259b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18261f, (SecureDocument) this.h, (WebFile) this.f18262n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18263r, (ImageLocation) this.f18264s, this.v, (String) this.f18265w, this.f18260c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18259b, (a0.i) this.f18261f, (HashMap) this.h, (ArrayList) this.f18262n, this.f18260c, this.d, (a0.i) this.f18263r, (HashMap) this.f18264s, (a0.i) this.v, (Runnable) this.f18265w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18259b = i10;
        this.f18261f = iVar;
        this.h = hashMap;
        this.f18262n = arrayList;
        this.f18260c = j3;
        this.d = i11;
        this.f18263r = iVar2;
        this.f18264s = hashMap2;
        this.v = iVar3;
        this.f18265w = runnable;
    }
}
